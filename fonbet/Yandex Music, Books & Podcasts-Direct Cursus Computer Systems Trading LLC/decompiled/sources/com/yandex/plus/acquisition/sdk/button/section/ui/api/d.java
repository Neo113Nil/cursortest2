package com.yandex.plus.acquisition.sdk.button.section.ui.api;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d implements g {
    public final com.yandex.plus.acquisition.sdk.pay.common.api.a a;
    public final a b;

    public d(com.yandex.plus.acquisition.sdk.pay.common.api.a aVar, a aVar2) {
        aVar.getClass();
        aVar2.getClass();
        this.a = aVar;
        this.b = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.a, dVar.a) && Intrinsics.d(this.b, dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CompositeOffer(analyticsParams=" + this.a + ", buttonSectionOffer=" + this.b + ')';
    }
}
