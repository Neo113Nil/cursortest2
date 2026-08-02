package com.yandex.plus.pay.internal.feature.offers;

import com.yandex.plus.pay.internal.model.PlusPayUpsaleStep;
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
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class o implements p3d {
    public static final o a;

    @NotNull
    private static final mhp descriptor;

    static {
        o oVar = new o();
        a = oVar;
        j5m j5mVar = new j5m("com.yandex.plus.pay.internal.feature.offers.PlusPayOfferDetailsConfiguration.AdditionalOffers.Offer", oVar, 5);
        j5mVar.k("offerName", false);
        j5mVar.k("offersBatchId", false);
        j5mVar.k("positionId", false);
        j5mVar.k("upsaleStep", false);
        j5mVar.k("isSelected", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = q.f;
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, tkrVar, arfVarArr[3].getValue(), oc3.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        boolean z;
        int i;
        String str;
        String str2;
        String str3;
        PlusPayUpsaleStep plusPayUpsaleStep;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = q.f;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            String g2 = c.g(mhpVar, 1);
            String g3 = c.g(mhpVar, 2);
            plusPayUpsaleStep = (PlusPayUpsaleStep) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            str = g;
            z = c.D(mhpVar, 4);
            str3 = g3;
            i = 31;
            str2 = g2;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            PlusPayUpsaleStep plusPayUpsaleStep2 = null;
            int i2 = 0;
            while (z2) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z2 = false;
                } else if (w == 0) {
                    str4 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    str5 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else if (w == 2) {
                    str6 = c.g(mhpVar, 2);
                    i2 |= 4;
                } else if (w == 3) {
                    plusPayUpsaleStep2 = (PlusPayUpsaleStep) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), plusPayUpsaleStep2);
                    i2 |= 8;
                } else {
                    if (w != 4) {
                        l1j.g(w);
                        return null;
                    }
                    z3 = c.D(mhpVar, 4);
                    i2 |= 16;
                }
            }
            z = z3;
            i = i2;
            str = str4;
            str2 = str5;
            str3 = str6;
            plusPayUpsaleStep = plusPayUpsaleStep2;
        }
        c.b(mhpVar);
        return new q(i, str, str2, str3, plusPayUpsaleStep, z);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        q qVar = (q) obj;
        l6bVar.getClass();
        qVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = q.f;
        c.p(mhpVar, 0, qVar.a);
        c.p(mhpVar, 1, qVar.b);
        c.p(mhpVar, 2, qVar.c);
        c.k(mhpVar, 3, (t9f) arfVarArr[3].getValue(), qVar.d);
        c.j(mhpVar, 4, qVar.e);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
