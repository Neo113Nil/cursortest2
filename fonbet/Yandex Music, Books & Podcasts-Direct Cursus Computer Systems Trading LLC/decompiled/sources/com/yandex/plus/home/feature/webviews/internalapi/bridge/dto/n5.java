package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

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
public final /* synthetic */ class n5 implements p3d {
    public static final n5 a;

    @NotNull
    private static final mhp descriptor;

    static {
        n5 n5Var = new n5();
        a = n5Var;
        j5m j5mVar = new j5m("SHOW_PURCHASE_BUTTON", n5Var, 1);
        j5mVar.k("trackId", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{ff7.C(tkr.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        String str;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        String str2 = null;
        if (c.m()) {
            str = (String) c.n(mhpVar, 0, tkr.a, null);
        } else {
            boolean z = true;
            int i2 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else {
                    if (w != 0) {
                        l1j.g(w);
                        return null;
                    }
                    str2 = (String) c.n(mhpVar, 0, tkr.a, str2);
                    i2 = 1;
                }
            }
            str = str2;
            i = i2;
        }
        c.b(mhpVar);
        return new p5(i, str);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        p5 p5Var = (p5) obj;
        l6bVar.getClass();
        p5Var.getClass();
        String str = p5Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 0, tkr.a, str);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
