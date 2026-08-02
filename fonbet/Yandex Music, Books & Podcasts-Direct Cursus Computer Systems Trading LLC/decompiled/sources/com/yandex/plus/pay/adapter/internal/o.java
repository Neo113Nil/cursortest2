package com.yandex.plus.pay.adapter.internal;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.btf;
import defpackage.jyr;

/* loaded from: classes5.dex */
public final class o implements com.yandex.plus.pay.adapter.api.k {
    public final PlusPayCompositeOffers a;
    public final jyr b = btf.b(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(13, this));

    public o(PlusPayCompositeOffers plusPayCompositeOffers) {
        this.a = plusPayCompositeOffers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.a.equals(((o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CompositeOffersImpl(actualOffer=" + this.a + ')';
    }
}
