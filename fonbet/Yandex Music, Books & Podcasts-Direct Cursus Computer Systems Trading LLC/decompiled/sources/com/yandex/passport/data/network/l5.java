package com.yandex.passport.data.network;

import defpackage.arf;
import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class l5 implements p3d {
    public static final l5 a;

    @NotNull
    private static final mhp descriptor;

    static {
        l5 l5Var = new l5();
        a = l5Var;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.GetConfigRequest.ConfigEntryDTO", l5Var, 5);
        j5mVar.k("platform", true);
        j5mVar.k("am_version", true);
        j5mVar.k("app_version", true);
        j5mVar.k(CommonUrlParts.APP_ID, true);
        j5mVar.k("filter_rules", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = n5.f;
        f6 f6Var = f6.a;
        return new t9f[]{ff7.C(tkr.a), ff7.C(f6Var), ff7.C(f6Var), ff7.C((t9f) arfVarArr[3].getValue()), arfVarArr[4].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        h6 h6Var;
        h6 h6Var2;
        List list;
        Map map;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = n5.f;
        String str2 = null;
        if (c.m()) {
            String str3 = (String) c.n(mhpVar, 0, tkr.a, null);
            f6 f6Var = f6.a;
            h6 h6Var3 = (h6) c.n(mhpVar, 1, f6Var, null);
            h6 h6Var4 = (h6) c.n(mhpVar, 2, f6Var, null);
            List list2 = (List) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            map = (Map) c.z(mhpVar, 4, (t9f) arfVarArr[4].getValue(), null);
            str = str3;
            h6Var2 = h6Var4;
            list = list2;
            i = 31;
            h6Var = h6Var3;
        } else {
            boolean z = true;
            int i2 = 0;
            h6 h6Var5 = null;
            h6 h6Var6 = null;
            List list3 = null;
            Map map2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str2 = (String) c.n(mhpVar, 0, tkr.a, str2);
                    i2 |= 1;
                } else if (w == 1) {
                    h6Var5 = (h6) c.n(mhpVar, 1, f6.a, h6Var5);
                    i2 |= 2;
                } else if (w == 2) {
                    h6Var6 = (h6) c.n(mhpVar, 2, f6.a, h6Var6);
                    i2 |= 4;
                } else if (w == 3) {
                    list3 = (List) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), list3);
                    i2 |= 8;
                } else {
                    if (w != 4) {
                        l1j.g(w);
                        return null;
                    }
                    map2 = (Map) c.z(mhpVar, 4, (t9f) arfVarArr[4].getValue(), map2);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str2;
            h6Var = h6Var5;
            h6Var2 = h6Var6;
            list = list3;
            map = map2;
        }
        c.b(mhpVar);
        return new n5(i, str, h6Var, h6Var2, list, map);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        n5 n5Var = (n5) obj;
        l6bVar.getClass();
        n5Var.getClass();
        List list = n5Var.d;
        h6 h6Var = n5Var.c;
        h6 h6Var2 = n5Var.b;
        String str = n5Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = n5.f;
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 0, tkr.a, str);
        }
        if (c.e(mhpVar) || h6Var2 != null) {
            c.q(mhpVar, 1, f6.a, h6Var2);
        }
        if (c.e(mhpVar) || h6Var != null) {
            c.q(mhpVar, 2, f6.a, h6Var);
        }
        if (c.e(mhpVar) || list != null) {
            c.q(mhpVar, 3, (t9f) arfVarArr[3].getValue(), list);
        }
        c.k(mhpVar, 4, (t9f) arfVarArr[4].getValue(), n5Var.e);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
