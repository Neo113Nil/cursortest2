package com.yandex.passport.internal.config;

import android.content.SharedPreferences;
import com.yandex.passport.data.network.f5;
import com.yandex.passport.data.network.g5;
import defpackage.dfi;
import defpackage.q5b;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class g {
    public final d a;
    public final com.yandex.passport.common.common.a b;

    public g(d dVar, com.yandex.passport.common.common.a aVar) {
        dVar.getClass();
        aVar.getClass();
        this.a = dVar;
        this.b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [q5b] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.ArrayList] */
    public final void a(com.yandex.passport.common.core.b bVar, List list, List list2) {
        ?? r6;
        Object obj;
        bVar.getClass();
        list.getClass();
        list2.getClass();
        SharedPreferences a = this.a.a(bVar);
        if (a == null) {
            return;
        }
        Set<String> stringSet = a.getStringSet("location_ids", null);
        if (stringSet != null) {
            r6 = new ArrayList();
            for (String str : stringSet) {
                str.getClass();
                Long r0 = StringsKt.r0(10, str);
                if (r0 != null) {
                    r6.add(r0);
                }
            }
        } else {
            r6 = q5b.a;
        }
        SharedPreferences.Editor edit = a.edit();
        String a2 = ((com.yandex.passport.internal.common.d) this.b).a();
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((g5) obj).a.contains(a2)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        g5 g5Var = (g5) obj;
        List list3 = g5Var != null ? g5Var.b : null;
        if (list3 == null) {
            edit.putBoolean("is_default_config_used", true);
            list3 = list2;
        } else {
            edit.putBoolean("is_default_config_used", false);
        }
        List<f5> list4 = list3;
        ArrayList arrayList = new ArrayList(v75.o(list4, 10));
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(((f5) it2.next()).a));
        }
        Set A0 = CollectionsKt.A0(arrayList);
        Set set = A0;
        Iterator it3 = CollectionsKt.e0((Iterable) r6, set).iterator();
        while (it3.hasNext()) {
            long longValue = ((Number) it3.next()).longValue();
            edit.remove("location_backend_host_" + longValue);
            edit.remove("location_webam_host_" + longValue);
            edit.remove("location_webam_yandex_host_" + longValue);
            edit.remove("location_webam_id_yandex_host_" + longValue);
        }
        for (f5 f5Var : list4) {
            long j = f5Var.a;
            edit.putString(dfi.d(j, "location_backend_host_"), f5Var.b);
            edit.putString("location_webam_host_" + j, f5Var.c);
            String str2 = "location_webam_yandex_host_" + j;
            String str3 = f5Var.d;
            if (str3 == null || StringsKt.U(str3)) {
                str3 = null;
            }
            edit.putString(str2, str3);
            String str4 = "location_webam_id_yandex_host_" + j;
            String str5 = f5Var.e;
            if (str5 == null || StringsKt.U(str5)) {
                str5 = null;
            }
            edit.putString(str4, str5);
        }
        if (A0.isEmpty()) {
            edit.remove("location_ids");
        } else {
            ArrayList arrayList2 = new ArrayList(v75.o(set, 10));
            Iterator it4 = set.iterator();
            while (it4.hasNext()) {
                arrayList2.add(String.valueOf(((Number) it4.next()).longValue()));
            }
            edit.putStringSet("location_ids", CollectionsKt.A0(arrayList2));
        }
        edit.apply();
    }
}
