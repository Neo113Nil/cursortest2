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
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class e6 implements p3d {
    public static final e6 a;

    @NotNull
    private static final mhp descriptor;

    static {
        e6 e6Var = new e6();
        a = e6Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayPurchaseContentSerializer.DataDto.ReplacementParams", e6Var, 2);
        j5mVar.k("purchaseToken", false);
        j5mVar.k("strategy", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{tkr.a, i6.c[1].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        h6 h6Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = i6.c;
        String str2 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            h6Var = (h6) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            h6 h6Var2 = null;
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
                    h6Var2 = (h6) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), h6Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            str = str2;
            h6Var = h6Var2;
        }
        c.b(mhpVar);
        return new i6(i, str, h6Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        i6 i6Var = (i6) obj;
        l6bVar.getClass();
        i6Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = i6.c;
        c.p(mhpVar, 0, i6Var.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), i6Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
