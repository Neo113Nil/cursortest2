package com.yandex.passport.sloth.command.data;

import defpackage.arf;
import defpackage.eg7;
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

/* loaded from: classes4.dex */
public final /* synthetic */ class y implements p3d {
    public static final y a;

    @NotNull
    private static final mhp descriptor;

    static {
        y yVar = new y();
        a = yVar;
        j5m j5mVar = new j5m("com.yandex.passport.sloth.command.data.OpenExternalUrlData", yVar, 3);
        j5mVar.k("url", false);
        j5mVar.k("isAuthUrlRequired", false);
        j5mVar.k("isWebViewClosed", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        oc3 oc3Var = oc3.a;
        return new t9f[]{a0.d[0].getValue(), oc3Var, oc3Var};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        boolean z;
        boolean z2;
        int i;
        String str;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = a0.d;
        if (c.m()) {
            com.yandex.passport.common.url.b bVar = (com.yandex.passport.common.url.b) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            str = bVar != null ? bVar.a : null;
            z = c.D(mhpVar, 1);
            z2 = c.D(mhpVar, 2);
            i = 7;
        } else {
            boolean z3 = true;
            boolean z4 = false;
            boolean z5 = false;
            int i2 = 0;
            String str2 = null;
            while (z3) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z3 = false;
                } else if (w == 0) {
                    com.yandex.passport.common.url.b bVar2 = (com.yandex.passport.common.url.b) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), str2 != null ? new com.yandex.passport.common.url.b(str2) : null);
                    str2 = bVar2 != null ? bVar2.a : null;
                    i2 |= 1;
                } else if (w == 1) {
                    z4 = c.D(mhpVar, 1);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    z5 = c.D(mhpVar, 2);
                    i2 |= 4;
                }
            }
            z = z4;
            z2 = z5;
            i = i2;
            str = str2;
        }
        c.b(mhpVar);
        return new a0(str, z, z2, i);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        a0 a0Var = (a0) obj;
        l6bVar.getClass();
        a0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, (t9f) a0.d[0].getValue(), new com.yandex.passport.common.url.b(a0Var.a));
        c.j(mhpVar, 1, a0Var.b);
        c.j(mhpVar, 2, a0Var.c);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
