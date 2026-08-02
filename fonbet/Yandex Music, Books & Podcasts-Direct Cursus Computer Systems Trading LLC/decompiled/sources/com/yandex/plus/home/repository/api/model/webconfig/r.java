package com.yandex.plus.home.repository.api.model.webconfig;

import defpackage.arf;
import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.oc3;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class r implements p3d {
    public static final r a;

    @NotNull
    private static final mhp descriptor;

    static {
        r rVar = new r();
        a = rVar;
        j5m j5mVar = new j5m("com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration.Subscription", rVar, 7);
        j5mVar.k("features", false);
        j5mVar.k("isSilentPaymentEnabled", false);
        j5mVar.k("buttonType", false);
        j5mVar.k("paymentMethod", false);
        j5mVar.k("widgetType", false);
        j5mVar.k("targetId", false);
        j5mVar.k("acquisitionParams", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = z.h;
        return new t9f[]{arfVarArr[0].getValue(), oc3.a, arfVarArr[2].getValue(), arfVarArr[3].getValue(), arfVarArr[4].getValue(), tkr.a, ff7.C(s.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        u uVar;
        boolean z;
        List list;
        v vVar;
        x xVar;
        y yVar;
        String str;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = z.h;
        int i2 = 6;
        int i3 = 5;
        int i4 = 1;
        if (c.m()) {
            List list2 = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            boolean D = c.D(mhpVar, 1);
            v vVar2 = (v) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            x xVar2 = (x) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            y yVar2 = (y) c.z(mhpVar, 4, (t9f) arfVarArr[4].getValue(), null);
            String g = c.g(mhpVar, 5);
            yVar = yVar2;
            list = list2;
            uVar = (u) c.n(mhpVar, 6, s.a, null);
            str = g;
            xVar = xVar2;
            i = 127;
            vVar = vVar2;
            z = D;
        } else {
            boolean z2 = true;
            int i5 = 0;
            List list3 = null;
            v vVar3 = null;
            x xVar3 = null;
            y yVar3 = null;
            String str2 = null;
            boolean z3 = false;
            u uVar2 = null;
            while (z2) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z2 = false;
                        i3 = 5;
                    case 0:
                        list3 = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), list3);
                        i5 |= 1;
                        i2 = 6;
                        i3 = 5;
                    case 1:
                        z3 = c.D(mhpVar, i4);
                        i5 |= 2;
                    case 2:
                        vVar3 = (v) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), vVar3);
                        i5 |= 4;
                        i4 = 1;
                    case 3:
                        xVar3 = (x) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), xVar3);
                        i5 |= 8;
                        i4 = 1;
                    case 4:
                        yVar3 = (y) c.z(mhpVar, 4, (t9f) arfVarArr[4].getValue(), yVar3);
                        i5 |= 16;
                        i4 = 1;
                    case 5:
                        str2 = c.g(mhpVar, i3);
                        i5 |= 32;
                        i4 = 1;
                    case 6:
                        uVar2 = (u) c.n(mhpVar, i2, s.a, uVar2);
                        i5 |= 64;
                        i4 = 1;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i5;
            uVar = uVar2;
            z = z3;
            list = list3;
            vVar = vVar3;
            xVar = xVar3;
            yVar = yVar3;
            str = str2;
        }
        c.b(mhpVar);
        return new z(i, list, z, vVar, xVar, yVar, str, uVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        z zVar = (z) obj;
        l6bVar.getClass();
        zVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = z.h;
        c.k(mhpVar, 0, (t9f) arfVarArr[0].getValue(), zVar.a);
        c.j(mhpVar, 1, zVar.b);
        c.k(mhpVar, 2, (t9f) arfVarArr[2].getValue(), zVar.c);
        c.k(mhpVar, 3, (t9f) arfVarArr[3].getValue(), zVar.d);
        c.k(mhpVar, 4, (t9f) arfVarArr[4].getValue(), zVar.e);
        c.p(mhpVar, 5, zVar.f);
        c.q(mhpVar, 6, s.a, zVar.g);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
