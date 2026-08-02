package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.eg7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class i implements p3d {
    public static final i a;

    @NotNull
    private static final mhp descriptor;

    static {
        i iVar = new i();
        a = iVar;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayAppBarContentSerializer.AppBarDto", iVar, 1);
        j5mVar.k("payload", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{o.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        q qVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        q qVar2 = null;
        if (c.m()) {
            qVar = (q) c.z(mhpVar, 0, o.a, null);
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
                    qVar2 = (q) c.z(mhpVar, 0, o.a, qVar2);
                    i2 = 1;
                }
            }
            qVar = qVar2;
            i = i2;
        }
        c.b(mhpVar);
        return new k(i, qVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        k kVar = (k) obj;
        l6bVar.getClass();
        kVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, o.a, kVar.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
