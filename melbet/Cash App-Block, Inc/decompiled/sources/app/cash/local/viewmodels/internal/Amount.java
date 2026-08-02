package app.cash.local.viewmodels.internal;

import bo.app.re$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class Amount {
    public final long amount;
    public final String text;

    public Amount(String str, long j) {
        this.text = str;
        this.amount = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Amount)) {
            return false;
        }
        Amount amount = (Amount) obj;
        return this.text.equals(amount.text) && this.amount == amount.amount;
    }

    public final int hashCode() {
        return Long.hashCode(this.amount) + (this.text.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("Amount(text=", this.text, ", amount=", this.amount);
        m.append(")");
        return m.toString();
    }
}
