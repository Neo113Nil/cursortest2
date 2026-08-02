package com.yandex.plus.core.graphql.daily.progress;

import defpackage.arf;
import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.n9a;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class l implements p3d {
    public static final l a;

    @NotNull
    private static final mhp descriptor;

    static {
        l lVar = new l();
        a = lVar;
        j5m j5mVar = new j5m("com.yandex.plus.core.graphql.daily.progress.ProgressDataResponse", lVar, 7);
        j5mVar.k("scoreTextWithReplacers", true);
        j5mVar.k("scoreTextColor", false);
        j5mVar.k("blankTextColor", false);
        j5mVar.k("replacers", true);
        j5mVar.k("backgroundColor", false);
        j5mVar.k("progressPercent", false);
        j5mVar.k("progressColor", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = n.h;
        t9f C = ff7.C(tkr.a);
        t9f C2 = ff7.C((t9f) arfVarArr[3].getValue());
        i iVar = i.a;
        return new t9f[]{C, iVar, iVar, C2, iVar, n9a.a, iVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        k kVar;
        String str;
        k kVar2;
        k kVar3;
        List list;
        k kVar4;
        double d;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = n.h;
        int i2 = 6;
        boolean z = true;
        String str2 = null;
        if (c.m()) {
            String str3 = (String) c.n(mhpVar, 0, tkr.a, null);
            i iVar = i.a;
            k kVar5 = (k) c.z(mhpVar, 1, iVar, null);
            k kVar6 = (k) c.z(mhpVar, 2, iVar, null);
            List list2 = (List) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            k kVar7 = (k) c.z(mhpVar, 4, iVar, null);
            double F = c.F(mhpVar, 5);
            list = list2;
            str = str3;
            kVar = (k) c.z(mhpVar, 6, iVar, null);
            i = 127;
            kVar4 = kVar7;
            kVar3 = kVar6;
            kVar2 = kVar5;
            d = F;
        } else {
            boolean z2 = true;
            int i3 = 0;
            k kVar8 = null;
            List list3 = null;
            k kVar9 = null;
            double d2 = 0.0d;
            k kVar10 = null;
            k kVar11 = null;
            while (z2) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z2 = false;
                        i2 = 6;
                    case 0:
                        str2 = (String) c.n(mhpVar, 0, tkr.a, str2);
                        i3 |= 1;
                        i2 = 6;
                        z = true;
                    case 1:
                        kVar10 = (k) c.z(mhpVar, 1, i.a, kVar10);
                        i3 |= 2;
                        z = true;
                        i2 = 6;
                    case 2:
                        kVar11 = (k) c.z(mhpVar, 2, i.a, kVar11);
                        i3 |= 4;
                        z = true;
                    case 3:
                        list3 = (List) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), list3);
                        i3 |= 8;
                        z = true;
                    case 4:
                        kVar9 = (k) c.z(mhpVar, 4, i.a, kVar9);
                        i3 |= 16;
                        z = true;
                    case 5:
                        d2 = c.F(mhpVar, 5);
                        i3 |= 32;
                        z = true;
                    case 6:
                        kVar8 = (k) c.z(mhpVar, i2, i.a, kVar8);
                        i3 |= 64;
                        z = true;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i3;
            kVar = kVar8;
            str = str2;
            kVar2 = kVar10;
            kVar3 = kVar11;
            list = list3;
            kVar4 = kVar9;
            d = d2;
        }
        c.b(mhpVar);
        return new n(i, str, kVar2, kVar3, list, kVar4, d, kVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        n nVar = (n) obj;
        l6bVar.getClass();
        nVar.getClass();
        String str = nVar.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = n.h;
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 0, tkr.a, str);
        }
        i iVar = i.a;
        k kVar = nVar.b;
        List list = nVar.d;
        c.k(mhpVar, 1, iVar, kVar);
        c.k(mhpVar, 2, iVar, nVar.c);
        if (c.e(mhpVar) || list != null) {
            c.q(mhpVar, 3, (t9f) arfVarArr[3].getValue(), list);
        }
        c.k(mhpVar, 4, iVar, nVar.e);
        c.l(mhpVar, 5, nVar.f);
        c.k(mhpVar, 6, iVar, nVar.g);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
