package com.yandex.passport.internal.core.accounts;

import android.accounts.Account;
import android.text.TextUtils;
import com.yandex.passport.internal.analytics.o0;
import defpackage.e5b;
import defpackage.xy0;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class l {
    public final i a;
    public final com.yandex.passport.internal.network.client.h b;
    public final o0 c;

    public l(i iVar, com.yandex.passport.internal.network.client.h hVar, o0 o0Var) {
        this.a = iVar;
        this.b = hVar;
        this.c = o0Var;
    }

    public final com.yandex.passport.internal.l a(com.yandex.passport.internal.b bVar, com.yandex.passport.internal.analytics.n nVar, com.yandex.passport.internal.report.reporters.t tVar) {
        com.yandex.passport.internal.stash.a aVar;
        i iVar = this.a;
        com.yandex.passport.legacy.a.e(3, "repairCorruptedAccount: repairing " + bVar, null);
        com.yandex.passport.common.core.b bVar2 = com.yandex.passport.common.core.b.c;
        String str = bVar.b;
        if (str == null || str.length() <= 0 || str.equals("-")) {
            str = null;
        }
        com.yandex.passport.common.account.a aVar2 = new com.yandex.passport.common.account.a(str);
        Account d = bVar.d();
        try {
            com.yandex.passport.common.core.g h = this.b.a(bVar2).h(aVar2);
            b(bVar, "user_info_refreshed", nVar);
            com.yandex.passport.internal.g j = com.yandex.passport.internal.m.j(bVar.i);
            if (j != null) {
                String str2 = j.g;
                String str3 = j.h;
                HashMap hashMap = new HashMap();
                if (str2 != null) {
                    com.yandex.passport.api.j[] jVarArr = com.yandex.passport.api.j.a;
                    hashMap.put("disk_pin_code", str2);
                }
                if (str3 != null) {
                    com.yandex.passport.api.j[] jVarArr2 = com.yandex.passport.api.j.a;
                    hashMap.put("mail_pin_code", str3);
                }
                aVar = new com.yandex.passport.internal.stash.a(hashMap);
            } else {
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                aVar = new com.yandex.passport.internal.stash.a(e5bVar);
            }
            com.yandex.passport.internal.stash.a aVar3 = aVar;
            String str4 = d.name;
            com.yandex.passport.common.core.f fVar = new com.yandex.passport.common.core.f(bVar2, h.d);
            Long l = h.Y;
            com.yandex.passport.internal.l lVar = new com.yandex.passport.internal.l(str4, fVar, l != null ? new com.yandex.passport.common.core.f(bVar2, l.longValue()) : null, aVar2, h, aVar3);
            iVar.l(lVar, nVar);
            com.yandex.passport.legacy.a.e(3, "repairCorruptedAccount: repaired " + lVar, null);
            return lVar;
        } catch (com.yandex.passport.common.exception.a e) {
            b(bVar, "master_token_invalid", nVar);
            iVar.d(bVar, tVar);
            throw e;
        }
    }

    public final void b(com.yandex.passport.internal.b bVar, String str, com.yandex.passport.internal.analytics.n nVar) {
        com.yandex.passport.internal.g j = com.yandex.passport.internal.m.j(bVar.i);
        if (j == null || j.a == null) {
            String str2 = bVar.a;
            String str3 = bVar.b;
            long j2 = j != null ? j.i : 0L;
            String str4 = j != null ? j.b : null;
            o0 o0Var = this.c;
            o0Var.getClass();
            str2.getClass();
            nVar.getClass();
            xy0 xy0Var = new xy0(0);
            xy0Var.put("account_name", str2);
            xy0Var.put("status", str);
            xy0Var.put("reason", nVar.b);
            if (!TextUtils.isEmpty(str4)) {
                xy0Var.put("display_name", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                str3.getClass();
                xy0Var.put("master_token", str3.substring(0, str3.length() / 2));
            }
            if (j2 > 0) {
                xy0Var.put("max_timestamp", String.valueOf(j2));
            }
            o0Var.a.b(com.yandex.passport.internal.analytics.j.m, xy0Var);
        }
    }
}
