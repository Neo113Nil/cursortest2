package com.yandex.plus.bdui.plus.checkout.content.serializer;

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
public final /* synthetic */ class u0 implements p3d {
    public static final u0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        u0 u0Var = new u0();
        a = u0Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayCheckoutContentSerializer.MailAgreementDto", u0Var, 2);
        j5mVar.k("checkboxValue", false);
        j5mVar.k("agreementText", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{oc3.a, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        boolean z;
        int i;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            z = c.D(mhpVar, 0);
            m1Var = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.z(mhpVar, 1, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, null);
            i = 3;
        } else {
            boolean z2 = true;
            z = false;
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var2 = null;
            int i2 = 0;
            while (z2) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z2 = false;
                } else if (w == 0) {
                    z = c.D(mhpVar, 0);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    m1Var2 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.z(mhpVar, 1, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, m1Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            m1Var = m1Var2;
        }
        c.b(mhpVar);
        return new w0(i, z, m1Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        w0 w0Var = (w0) obj;
        l6bVar.getClass();
        w0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.j(mhpVar, 0, w0Var.a);
        c.k(mhpVar, 1, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, w0Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
