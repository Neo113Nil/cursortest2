package com.yandex.plus.bdui.plus.content.serializer;

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
public final /* synthetic */ class m1 implements p3d {
    public static final m1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        m1 m1Var = new m1();
        a = m1Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.content.serializer.PlusWebContentSerializer.FallbackDto", m1Var, 2);
        j5mVar.k("texts", false);
        j5mVar.k("nextAction", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{p1.a, o1.c[1].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        r1 r1Var;
        com.yandex.plus.bdui.action.a aVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = o1.c;
        r1 r1Var2 = null;
        if (c.m()) {
            r1Var = (r1) c.z(mhpVar, 0, p1.a, null);
            aVar = (com.yandex.plus.bdui.action.a) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            com.yandex.plus.bdui.action.a aVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    r1Var2 = (r1) c.z(mhpVar, 0, p1.a, r1Var2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    aVar2 = (com.yandex.plus.bdui.action.a) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), aVar2);
                    i2 |= 2;
                }
            }
            i = i2;
            r1Var = r1Var2;
            aVar = aVar2;
        }
        c.b(mhpVar);
        return new o1(i, r1Var, aVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        o1 o1Var = (o1) obj;
        l6bVar.getClass();
        o1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = o1.c;
        c.k(mhpVar, 0, p1.a, o1Var.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), o1Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
