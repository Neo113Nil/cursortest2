package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

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
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class w0 implements p3d {
    public static final w0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        w0 w0Var = new w0();
        a = w0Var;
        j5m j5mVar = new j5m("STORY_IS_VISIBLE", w0Var, 3);
        j5mVar.k("trackId", false);
        j5mVar.k("controlType", false);
        j5mVar.k("type", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = c1.d;
        return new t9f[]{ff7.C(tkr.a), arfVarArr[1].getValue(), arfVarArr[2].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        z0 z0Var;
        b1 b1Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = c1.d;
        String str2 = null;
        if (c.m()) {
            str = (String) c.n(mhpVar, 0, tkr.a, null);
            z0Var = (z0) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            b1Var = (b1) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            z0 z0Var2 = null;
            b1 b1Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str2 = (String) c.n(mhpVar, 0, tkr.a, str2);
                    i2 |= 1;
                } else if (w == 1) {
                    z0Var2 = (z0) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), z0Var2);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    b1Var2 = (b1) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), b1Var2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str2;
            z0Var = z0Var2;
            b1Var = b1Var2;
        }
        c.b(mhpVar);
        return new c1(i, str, z0Var, b1Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        c1 c1Var = (c1) obj;
        l6bVar.getClass();
        c1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = c1.d;
        c.q(mhpVar, 0, tkr.a, c1Var.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), c1Var.b);
        c.k(mhpVar, 2, (t9f) arfVarArr[2].getValue(), c1Var.c);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
