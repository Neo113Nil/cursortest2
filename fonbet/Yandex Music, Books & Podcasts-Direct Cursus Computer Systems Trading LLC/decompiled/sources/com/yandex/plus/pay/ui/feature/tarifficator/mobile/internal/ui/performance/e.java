package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.performance;

import com.yandex.plus.core.benchmark.l;
import com.yandex.plus.core.benchmark.u;
import com.yandex.plus.core.benchmark.v;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.btf;
import defpackage.hrg;
import defpackage.jyr;
import defpackage.x97;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class e implements c {
    public final PlusPayCompositeOffers.Offer a;
    public final u b;
    public final v c;
    public final com.yandex.plus.pay.internal.benchmark.tarifficator.b d;
    public final com.yandex.plus.log.api.b e;
    public final jyr f;
    public final jyr g;
    public final jyr h;
    public final jyr i;

    public e(PlusPayCompositeOffers.Offer offer, u uVar, v vVar, com.yandex.plus.pay.internal.benchmark.tarifficator.b bVar, com.yandex.plus.log.api.b bVar2) {
        offer.getClass();
        bVar2.getClass();
        this.a = offer;
        this.b = uVar;
        this.c = vVar;
        this.d = bVar;
        this.e = bVar2;
        final int i = 0;
        this.f = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.performance.d
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return this.b.b.b("Checkout.IAP.InitialOpenDuration");
                    case 1:
                        return this.b.b.b("Checkout.IAP.StoreProcessing");
                    case 2:
                        return this.b.b.b("Checkout.IAP.CoreProcessing");
                    default:
                        return this.b.b.b("Checkout.IAP.FlowDuration");
                }
            }
        });
        final int i2 = 1;
        this.g = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.performance.d
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return this.b.b.b("Checkout.IAP.InitialOpenDuration");
                    case 1:
                        return this.b.b.b("Checkout.IAP.StoreProcessing");
                    case 2:
                        return this.b.b.b("Checkout.IAP.CoreProcessing");
                    default:
                        return this.b.b.b("Checkout.IAP.FlowDuration");
                }
            }
        });
        final int i3 = 2;
        this.h = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.performance.d
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return this.b.b.b("Checkout.IAP.InitialOpenDuration");
                    case 1:
                        return this.b.b.b("Checkout.IAP.StoreProcessing");
                    case 2:
                        return this.b.b.b("Checkout.IAP.CoreProcessing");
                    default:
                        return this.b.b.b("Checkout.IAP.FlowDuration");
                }
            }
        });
        final int i4 = 3;
        this.i = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.performance.d
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return this.b.b.b("Checkout.IAP.InitialOpenDuration");
                    case 1:
                        return this.b.b.b("Checkout.IAP.StoreProcessing");
                    case 2:
                        return this.b.b.b("Checkout.IAP.CoreProcessing");
                    default:
                        return this.b.b.b("Checkout.IAP.FlowDuration");
                }
            }
        });
    }

    public final void a(l lVar) {
        PlusPayCompositeOffers.Offer offer = this.a;
        PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
        if ((tariffOffer != null ? tariffOffer.getVendor() : null) == PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY) {
            boolean d = lVar.d();
            String str = lVar.a;
            com.yandex.plus.log.api.b bVar = this.e;
            if (!d) {
                com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.d;
                if (bVar.b(aVar)) {
                    bVar.c(aVar, "PerformanceSessionImpl", hrg.q("Benchmark ", str, " already tracked!"));
                    return;
                }
                return;
            }
            this.c.c(lVar, null);
            com.yandex.plus.pay.internal.benchmark.tarifficator.b bVar2 = this.d;
            x97.y(bVar2.f, null, null, new com.yandex.plus.pay.internal.benchmark.tarifficator.a(lVar, bVar2, offer, null), 3);
            com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
            if (bVar.b(aVar2)) {
                bVar.c(aVar2, "PerformanceSessionImpl", hrg.q("Benchmark ", str, " tracked"));
            }
        }
    }
}
