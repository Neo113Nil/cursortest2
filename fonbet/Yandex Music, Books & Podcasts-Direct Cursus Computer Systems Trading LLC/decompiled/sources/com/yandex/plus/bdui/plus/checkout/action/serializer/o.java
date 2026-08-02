package com.yandex.plus.bdui.plus.checkout.action.serializer;

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
public final /* synthetic */ class o implements p3d {
    public static final o a;

    @NotNull
    private static final mhp descriptor;

    static {
        o oVar = new o();
        a = oVar;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.action.serializer.PlusPayGooglePlayPurchaseActionSerializer.DataDto.ReplacementParams", oVar, 2);
        j5mVar.k("purchaseToken", false);
        j5mVar.k("strategy", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{tkr.a, s.c[1].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        r rVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = s.c;
        String str2 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            rVar = (r) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            r rVar2 = null;
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
                    rVar2 = (r) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), rVar2);
                    i2 |= 2;
                }
            }
            i = i2;
            str = str2;
            rVar = rVar2;
        }
        c.b(mhpVar);
        return new s(i, str, rVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        s sVar = (s) obj;
        l6bVar.getClass();
        sVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = s.c;
        c.p(mhpVar, 0, sVar.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), sVar.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
