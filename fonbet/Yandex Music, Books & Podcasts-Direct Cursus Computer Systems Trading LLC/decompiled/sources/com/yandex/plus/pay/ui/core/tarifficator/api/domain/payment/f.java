package com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment;

/* loaded from: classes5.dex */
public final class f implements h {
    public final com.yandex.plus.pay.ui.api.feature.payment.g a;

    public f(com.yandex.plus.pay.ui.api.feature.payment.g gVar) {
        this.a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.a.equals(((f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(reason=" + this.a + ')';
    }
}
