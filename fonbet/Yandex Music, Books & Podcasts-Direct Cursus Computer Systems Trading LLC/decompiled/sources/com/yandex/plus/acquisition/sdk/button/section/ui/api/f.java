package com.yandex.plus.acquisition.sdk.button.section.ui.api;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f implements g {
    public final com.yandex.plus.acquisition.sdk.pay.common.api.a a;
    public final a b;
    public final a c;

    public f(com.yandex.plus.acquisition.sdk.pay.common.api.a aVar, a aVar2, a aVar3) {
        aVar.getClass();
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.a, fVar.a) && this.b.equals(fVar.b) && this.c.equals(fVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TwoTariffs(analyticsParams=" + this.a + ", buttonSectionOffer1=" + this.b + ", buttonSectionOffer2=" + this.c + ')';
    }
}
