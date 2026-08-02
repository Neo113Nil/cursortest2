package com.yandex.plus.pay.adapter.internal;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers$Offer$Tariff$$serializer;
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
public final /* synthetic */ class e1 implements p3d {
    public static final e1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        e1 e1Var = new e1();
        a = e1Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.adapter.internal.TariffImpl", e1Var, 1);
        j5mVar.k("actualTariff", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{PlusPayCompositeOffers$Offer$Tariff$$serializer.INSTANCE};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        PlusPayCompositeOffers.Offer.Tariff tariff;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        PlusPayCompositeOffers.Offer.Tariff tariff2 = null;
        if (c.m()) {
            tariff = (PlusPayCompositeOffers.Offer.Tariff) c.z(mhpVar, 0, PlusPayCompositeOffers$Offer$Tariff$$serializer.INSTANCE, null);
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
                    tariff2 = (PlusPayCompositeOffers.Offer.Tariff) c.z(mhpVar, 0, PlusPayCompositeOffers$Offer$Tariff$$serializer.INSTANCE, tariff2);
                    i2 = 1;
                }
            }
            tariff = tariff2;
            i = i2;
        }
        c.b(mhpVar);
        return new h1(i, tariff);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        h1 h1Var = (h1) obj;
        l6bVar.getClass();
        h1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, PlusPayCompositeOffers$Offer$Tariff$$serializer.INSTANCE, h1Var.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
