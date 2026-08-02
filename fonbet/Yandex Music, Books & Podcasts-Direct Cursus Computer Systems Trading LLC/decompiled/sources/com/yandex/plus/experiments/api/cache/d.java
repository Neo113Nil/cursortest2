package com.yandex.plus.experiments.api.cache;

import defpackage.arf;
import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.nsa;
import defpackage.p3d;
import defpackage.rsa;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements p3d {
    public static final d a;

    @NotNull
    private static final mhp descriptor;

    static {
        d dVar = new d();
        a = dVar;
        j5m j5mVar = new j5m("com.yandex.plus.experiments.api.cache.PlusCachedExperiments", dVar, 5);
        j5mVar.k("testIdsWithBucketNumber", true);
        j5mVar.k("triggeredTestIdsWithBucketNumber", true);
        j5mVar.k("testIds", true);
        j5mVar.k("flags", true);
        j5mVar.k("createdAt", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = f.f;
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(tkrVar), ff7.C(tkrVar), ff7.C((t9f) arfVarArr[2].getValue()), ff7.C((t9f) arfVarArr[3].getValue()), rsa.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        List list;
        Set set;
        nsa nsaVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = f.f;
        String str3 = null;
        if (c.m()) {
            tkr tkrVar = tkr.a;
            String str4 = (String) c.n(mhpVar, 0, tkrVar, null);
            String str5 = (String) c.n(mhpVar, 1, tkrVar, null);
            List list2 = (List) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            set = (Set) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            str2 = str5;
            nsaVar = (nsa) c.z(mhpVar, 4, rsa.a, null);
            i = 31;
            list = list2;
            str = str4;
        } else {
            boolean z = true;
            int i2 = 0;
            String str6 = null;
            List list3 = null;
            Set set2 = null;
            nsa nsaVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str3 = (String) c.n(mhpVar, 0, tkr.a, str3);
                    i2 |= 1;
                } else if (w == 1) {
                    str6 = (String) c.n(mhpVar, 1, tkr.a, str6);
                    i2 |= 2;
                } else if (w == 2) {
                    list3 = (List) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), list3);
                    i2 |= 4;
                } else if (w == 3) {
                    set2 = (Set) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), set2);
                    i2 |= 8;
                } else {
                    if (w != 4) {
                        l1j.g(w);
                        return null;
                    }
                    nsaVar2 = (nsa) c.z(mhpVar, 4, rsa.a, nsaVar2);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str3;
            str2 = str6;
            list = list3;
            set = set2;
            nsaVar = nsaVar2;
        }
        c.b(mhpVar);
        return new f(i, str, str2, list, set, nsaVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        f fVar = (f) obj;
        l6bVar.getClass();
        fVar.getClass();
        Set set = fVar.d;
        List list = fVar.c;
        String str = fVar.b;
        String str2 = fVar.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = f.f;
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 0, tkr.a, str2);
        }
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 1, tkr.a, str);
        }
        if (c.e(mhpVar) || list != null) {
            c.q(mhpVar, 2, (t9f) arfVarArr[2].getValue(), list);
        }
        if (c.e(mhpVar) || set != null) {
            c.q(mhpVar, 3, (t9f) arfVarArr[3].getValue(), set);
        }
        c.k(mhpVar, 4, rsa.a, new nsa(fVar.e));
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
