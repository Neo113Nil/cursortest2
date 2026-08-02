package com.yandex.passport.internal.config;

import android.content.SharedPreferences;
import com.yandex.passport.data.network.j5;
import com.yandex.passport.internal.report.hd;
import com.yandex.passport.internal.report.reporters.k1;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n {
    public final d a;
    public final com.yandex.passport.common.common.a b;
    public final k1 c;

    public n(d dVar, com.yandex.passport.common.common.a aVar, k1 k1Var) {
        dVar.getClass();
        aVar.getClass();
        k1Var.getClass();
        this.a = dVar;
        this.b = aVar;
        this.c = k1Var;
    }

    public final void a(com.yandex.passport.common.core.b bVar, List list, Set set) {
        long longValue;
        boolean z;
        SharedPreferences.Editor edit;
        list.getClass();
        set.getClass();
        com.yandex.passport.internal.common.d dVar = (com.yandex.passport.internal.common.d) this.b;
        String a = dVar.a();
        Long l = dVar.b.e;
        if (l != null) {
            longValue = l.longValue();
        } else {
            Long a2 = com.yandex.passport.common.util.a.a(dVar.a);
            longValue = a2 != null ? a2.longValue() : 0L;
        }
        List<j5> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (j5 j5Var : list2) {
                if (Intrinsics.d(j5Var.a, a) && longValue >= j5Var.b) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        k1 k1Var = this.c;
        k1Var.getClass();
        k1Var.q(hd.d, new com.yandex.passport.internal.report.c("should_block", String.valueOf(z)));
        SharedPreferences a3 = this.a.a(bVar);
        if (a3 == null || (edit = a3.edit()) == null) {
            return;
        }
        edit.putBoolean("blockVpn", z);
        edit.putStringSet("vpnManualMode", set);
        edit.apply();
    }
}
