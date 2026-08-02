package com.yandex.plus.pay.data.mb.dto;

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
public final /* synthetic */ class v3 implements p3d {
    public static final v3 a;

    @NotNull
    private static final mhp descriptor;

    static {
        v3 v3Var = new v3();
        a = v3Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.mb.dto.TopupScreenDto", v3Var, 2);
        j5mVar.k("actionScenario", false);
        j5mVar.k("autoTopUpUrls", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{tkr.a, ff7.C(a4.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        c4 c4Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str2 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            c4Var = (c4) c.n(mhpVar, 1, a4.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            c4 c4Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str2 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    c4Var2 = (c4) c.n(mhpVar, 1, a4.a, c4Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            str = str2;
            c4Var = c4Var2;
        }
        c.b(mhpVar);
        return new d4(i, str, c4Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        d4 d4Var = (d4) obj;
        l6bVar.getClass();
        d4Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        String str = d4Var.a;
        c4 c4Var = d4Var.b;
        c.p(mhpVar, 0, str);
        if (c.e(mhpVar) || c4Var != null) {
            c.q(mhpVar, 1, a4.a, c4Var);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
