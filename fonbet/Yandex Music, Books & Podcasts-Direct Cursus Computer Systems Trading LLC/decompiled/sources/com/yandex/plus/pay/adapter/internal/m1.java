package com.yandex.plus.pay.adapter.internal;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers$Offer$Plan$TrialUntil$$serializer;
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
public final /* synthetic */ class m1 implements p3d {
    public static final m1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        m1 m1Var = new m1();
        a = m1Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.adapter.internal.TrialUntilPlanImpl", m1Var, 1);
        j5mVar.k("actualPlan", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{PlusPayCompositeOffers$Offer$Plan$TrialUntil$$serializer.INSTANCE};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        PlusPayCompositeOffers.Offer.Plan.TrialUntil trialUntil;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        PlusPayCompositeOffers.Offer.Plan.TrialUntil trialUntil2 = null;
        if (c.m()) {
            trialUntil = (PlusPayCompositeOffers.Offer.Plan.TrialUntil) c.z(mhpVar, 0, PlusPayCompositeOffers$Offer$Plan$TrialUntil$$serializer.INSTANCE, null);
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
                    trialUntil2 = (PlusPayCompositeOffers.Offer.Plan.TrialUntil) c.z(mhpVar, 0, PlusPayCompositeOffers$Offer$Plan$TrialUntil$$serializer.INSTANCE, trialUntil2);
                    i2 = 1;
                }
            }
            trialUntil = trialUntil2;
            i = i2;
        }
        c.b(mhpVar);
        return new p1(i, trialUntil);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        p1 p1Var = (p1) obj;
        l6bVar.getClass();
        p1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, PlusPayCompositeOffers$Offer$Plan$TrialUntil$$serializer.INSTANCE, p1Var.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
