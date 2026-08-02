package com.squareup.cash.paymentpad.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LimitHelperTextConfiguration {
    public final long limitAmountCents;
    public final String text;

    public LimitHelperTextConfiguration(String str, long j) {
        str.getClass();
        this.text = str;
        this.limitAmountCents = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitHelperTextConfiguration)) {
            return false;
        }
        LimitHelperTextConfiguration limitHelperTextConfiguration = (LimitHelperTextConfiguration) obj;
        return Intrinsics.areEqual(this.text, limitHelperTextConfiguration.text) && this.limitAmountCents == limitHelperTextConfiguration.limitAmountCents;
    }

    public final int hashCode() {
        return Long.hashCode(this.limitAmountCents) + (this.text.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("LimitHelperTextConfiguration(text=", this.text, ", limitAmountCents=", this.limitAmountCents);
        m.append(")");
        return m.toString();
    }
}
