package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements i {
    public final com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.a a;

    public g(com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.a aVar) {
        aVar.getClass();
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.a, ((g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ClosingOffer(closingOfferContent=" + this.a + ')';
    }
}
