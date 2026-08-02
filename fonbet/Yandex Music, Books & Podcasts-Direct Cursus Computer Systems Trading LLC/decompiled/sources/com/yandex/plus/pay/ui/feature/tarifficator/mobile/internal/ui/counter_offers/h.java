package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements i {
    public final com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.d a;

    public h(com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.d dVar) {
        dVar.getClass();
        this.a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.a, ((h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Offers(content=" + this.a + ')';
    }
}
