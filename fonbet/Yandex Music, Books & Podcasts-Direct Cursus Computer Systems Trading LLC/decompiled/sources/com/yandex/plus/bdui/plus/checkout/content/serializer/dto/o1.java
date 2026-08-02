package com.yandex.plus.bdui.plus.checkout.content.serializer.dto;

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
public final /* synthetic */ class o1 implements p3d {
    public static final o1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        o1 o1Var = new o1();
        a = o1Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.dto.ThemedColorDto", o1Var, 2);
        j5mVar.k("dark", false);
        j5mVar.k("light", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = q1.c;
        return new t9f[]{arfVarArr[0].getValue(), arfVarArr[1].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        q qVar;
        q qVar2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = q1.c;
        q qVar3 = null;
        if (c.m()) {
            qVar = (q) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            qVar2 = (q) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            q qVar4 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    qVar3 = (q) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), qVar3);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    qVar4 = (q) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), qVar4);
                    i2 |= 2;
                }
            }
            i = i2;
            qVar = qVar3;
            qVar2 = qVar4;
        }
        c.b(mhpVar);
        return new q1(i, qVar, qVar2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        q1 q1Var = (q1) obj;
        l6bVar.getClass();
        q1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = q1.c;
        c.k(mhpVar, 0, (t9f) arfVarArr[0].getValue(), q1Var.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), q1Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
