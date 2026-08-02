package com.yandex.passport.internal.config;

import android.content.SharedPreferences;
import com.yandex.passport.common.network.r;
import com.yandex.passport.data.network.a5;
import com.yandex.passport.data.network.x4;
import defpackage.e5b;
import defpackage.ekr;
import defpackage.ff7;
import defpackage.i5f;
import defpackage.ic3;
import defpackage.n9h;
import defpackage.oc3;
import defpackage.quj;
import defpackage.qy0;
import defpackage.tah;
import defpackage.tkr;
import defpackage.v75;
import defpackage.wah;
import defpackage.wsd;
import defpackage.x3f;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class b {
    public static final i5f b = quj.r(x3f.d, new r(7));
    public static final wsd c;
    public final d a;

    static {
        ff7.N(ekr.a);
        tkr tkrVar = tkr.a;
        ic3.a.getClass();
        c = ff7.o(tkrVar, new qy0(new n9h(tkrVar, oc3.a, 1), 0));
    }

    public b(d dVar) {
        dVar.getClass();
        this.a = dVar;
    }

    public final Map a(com.yandex.passport.common.core.b bVar, String str) {
        String string;
        SharedPreferences a = this.a.a(bVar);
        if (a == null || (string = a.getString(str, null)) == null) {
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
            return e5bVar;
        }
        try {
            return (Map) b.b(c, string);
        } catch (Exception unused) {
            e5b e5bVar2 = e5b.a;
            e5bVar2.getClass();
            return e5bVar2;
        }
    }

    public final void b(com.yandex.passport.common.core.b bVar, List list, List list2) {
        list.getClass();
        list2.getClass();
        SharedPreferences a = this.a.a(bVar);
        if (a == null) {
            return;
        }
        List<x4> list3 = list;
        int a2 = tah.a(v75.o(list3, 10));
        if (a2 < 16) {
            a2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a2);
        for (x4 x4Var : list3) {
            linkedHashMap.put(x4Var.a, wah.r(x4Var.b));
        }
        List<a5> list4 = list2;
        int a3 = tah.a(v75.o(list4, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(a3 >= 16 ? a3 : 16);
        for (a5 a5Var : list4) {
            linkedHashMap2.put(a5Var.a, wah.r(a5Var.b));
        }
        SharedPreferences.Editor edit = a.edit();
        i5f i5fVar = b;
        wsd wsdVar = c;
        edit.putString("autologin_app_parameters", i5fVar.c(wsdVar, linkedHashMap));
        edit.putString("autologin_client_id_parameters", i5fVar.c(wsdVar, linkedHashMap2));
        edit.apply();
    }
}
