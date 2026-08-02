package com.yandex.plus.paywall.sdk.analytics.api;

import com.yandex.plus.acquisition.sdk.common.impl.di.b;

/* loaded from: classes5.dex */
public final class a {
    public final b a;
    public final com.yandex.plus.acquisition.sdk.pay.impl.b b;

    public a(b bVar, com.yandex.plus.acquisition.sdk.pay.impl.b bVar2) {
        this.a = bVar;
        this.b = bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.b.equals(aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Dependencies(plusAcqCommon=" + this.a + ", plusAcqPay=" + this.b + ')';
    }
}
