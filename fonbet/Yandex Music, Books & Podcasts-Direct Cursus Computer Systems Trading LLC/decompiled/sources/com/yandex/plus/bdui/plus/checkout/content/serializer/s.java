package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.arf;
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
public final /* synthetic */ class s implements p3d {
    public static final s a;

    @NotNull
    private static final mhp descriptor;

    static {
        s sVar = new s();
        a = sVar;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayButtonContentSerializer.ActionsDto", sVar, 1);
        j5mVar.k("buttonClick", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{u.b[0].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        com.yandex.plus.bdui.action.a aVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = u.b;
        int i = 1;
        com.yandex.plus.bdui.action.a aVar2 = null;
        if (c.m()) {
            aVar = (com.yandex.plus.bdui.action.a) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
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
                    aVar2 = (com.yandex.plus.bdui.action.a) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), aVar2);
                    i2 = 1;
                }
            }
            aVar = aVar2;
            i = i2;
        }
        c.b(mhpVar);
        return new u(i, aVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        u uVar = (u) obj;
        l6bVar.getClass();
        uVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, (t9f) u.b[0].getValue(), uVar.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
