package com.yandex.plus.pay.adapter.internal;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers$Offer$Plan$Intro$$serializer;
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

/* loaded from: classes5.dex */
public final /* synthetic */ class q implements p3d {
    public static final q a;

    @NotNull
    private static final mhp descriptor;

    static {
        q qVar = new q();
        a = qVar;
        j5m j5mVar = new j5m("com.yandex.plus.pay.adapter.internal.IntroPlanImpl", qVar, 1);
        j5mVar.k("actualPlan", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{PlusPayCompositeOffers$Offer$Plan$Intro$$serializer.INSTANCE};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        PlusPayCompositeOffers.Offer.Plan.Intro intro;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        PlusPayCompositeOffers.Offer.Plan.Intro intro2 = null;
        if (c.m()) {
            intro = (PlusPayCompositeOffers.Offer.Plan.Intro) c.z(mhpVar, 0, PlusPayCompositeOffers$Offer$Plan$Intro$$serializer.INSTANCE, null);
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
                    intro2 = (PlusPayCompositeOffers.Offer.Plan.Intro) c.z(mhpVar, 0, PlusPayCompositeOffers$Offer$Plan$Intro$$serializer.INSTANCE, intro2);
                    i2 = 1;
                }
            }
            intro = intro2;
            i = i2;
        }
        c.b(mhpVar);
        return new t(i, intro);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        t tVar = (t) obj;
        l6bVar.getClass();
        tVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, PlusPayCompositeOffers$Offer$Plan$Intro$$serializer.INSTANCE, tVar.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
