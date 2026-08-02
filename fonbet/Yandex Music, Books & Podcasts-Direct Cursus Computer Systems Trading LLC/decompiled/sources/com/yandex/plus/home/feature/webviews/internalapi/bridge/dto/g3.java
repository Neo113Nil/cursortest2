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
public final /* synthetic */ class g3 implements p3d {
    public static final g3 a;

    @NotNull
    private static final mhp descriptor;

    static {
        g3 g3Var = new g3();
        a = g3Var;
        j5m j5mVar = new j5m("NATIVE_VIBRATE_REQUEST", g3Var, 2);
        j5mVar.k("trackId", true);
        j5mVar.k("vibrateType", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{ff7.C(tkr.a), j3.c[1].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        i3 i3Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = j3.c;
        String str2 = null;
        if (c.m()) {
            str = (String) c.n(mhpVar, 0, tkr.a, null);
            i3Var = (i3) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            i3 i3Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str2 = (String) c.n(mhpVar, 0, tkr.a, str2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    i3Var2 = (i3) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), i3Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            str = str2;
            i3Var = i3Var2;
        }
        c.b(mhpVar);
        return new j3(i, str, i3Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        j3 j3Var = (j3) obj;
        l6bVar.getClass();
        j3Var.getClass();
        String str = j3Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = j3.c;
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 0, tkr.a, str);
        }
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), j3Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
