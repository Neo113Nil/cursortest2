package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common;

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
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class e implements p3d {
    public static final e a;

    @NotNull
    private static final mhp descriptor;

    static {
        e eVar = new e();
        a = eVar;
        j5m j5mVar = new j5m("com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PresentationOptionsDto.Header", eVar, 3);
        j5mVar.k("showNavigationBar", true);
        j5mVar.k("showDash", true);
        j5mVar.k("navigationBarType", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = g.d;
        oc3 oc3Var = oc3.a;
        return new t9f[]{ff7.C(oc3Var), ff7.C(oc3Var), ff7.C((t9f) arfVarArr[2].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        Boolean bool;
        Boolean bool2;
        p pVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = g.d;
        Boolean bool3 = null;
        if (c.m()) {
            oc3 oc3Var = oc3.a;
            bool = (Boolean) c.n(mhpVar, 0, oc3Var, null);
            bool2 = (Boolean) c.n(mhpVar, 1, oc3Var, null);
            pVar = (p) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            Boolean bool4 = null;
            p pVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    bool3 = (Boolean) c.n(mhpVar, 0, oc3.a, bool3);
                    i2 |= 1;
                } else if (w == 1) {
                    bool4 = (Boolean) c.n(mhpVar, 1, oc3.a, bool4);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    pVar2 = (p) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), pVar2);
                    i2 |= 4;
                }
            }
            i = i2;
            bool = bool3;
            bool2 = bool4;
            pVar = pVar2;
        }
        c.b(mhpVar);
        return new g(i, bool, bool2, pVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        g gVar = (g) obj;
        l6bVar.getClass();
        gVar.getClass();
        p pVar = gVar.c;
        Boolean bool = gVar.b;
        Boolean bool2 = gVar.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = g.d;
        if (c.e(mhpVar) || bool2 != null) {
            c.q(mhpVar, 0, oc3.a, bool2);
        }
        if (c.e(mhpVar) || bool != null) {
            c.q(mhpVar, 1, oc3.a, bool);
        }
        if (c.e(mhpVar) || pVar != null) {
            c.q(mhpVar, 2, (t9f) arfVarArr[2].getValue(), pVar);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
