package com.yandex.plus.pay.adapter.internal;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers$Offer$Invoice$$serializer;
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
public final /* synthetic */ class a0 implements p3d {
    public static final a0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        a0 a0Var = new a0();
        a = a0Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.adapter.internal.InvoiceImpl", a0Var, 1);
        j5mVar.k("actualInvoice", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{PlusPayCompositeOffers$Offer$Invoice$$serializer.INSTANCE};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        PlusPayCompositeOffers.Offer.Invoice invoice;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        PlusPayCompositeOffers.Offer.Invoice invoice2 = null;
        if (c.m()) {
            invoice = (PlusPayCompositeOffers.Offer.Invoice) c.z(mhpVar, 0, PlusPayCompositeOffers$Offer$Invoice$$serializer.INSTANCE, null);
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
                    invoice2 = (PlusPayCompositeOffers.Offer.Invoice) c.z(mhpVar, 0, PlusPayCompositeOffers$Offer$Invoice$$serializer.INSTANCE, invoice2);
                    i2 = 1;
                }
            }
            invoice = invoice2;
            i = i2;
        }
        c.b(mhpVar);
        return new d0(i, invoice);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        d0 d0Var = (d0) obj;
        l6bVar.getClass();
        d0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, PlusPayCompositeOffers$Offer$Invoice$$serializer.INSTANCE, d0Var.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
