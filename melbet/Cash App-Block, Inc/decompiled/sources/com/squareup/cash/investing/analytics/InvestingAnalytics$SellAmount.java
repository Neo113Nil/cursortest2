package com.squareup.cash.investing.analytics;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface InvestingAnalytics$SellAmount {

    public final class All implements InvestingAnalytics$SellAmount {
        public final long amount;

        public All(long j) {
            this.amount = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof All) && this.amount == ((All) obj).amount;
        }

        public final int hashCode() {
            return Long.hashCode(this.amount);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.amount, "All(amount=", ")");
        }
    }

    public final class Some implements InvestingAnalytics$SellAmount {
        public final long amount;
        public final String text;

        public Some(long j, String str) {
            str.getClass();
            this.amount = j;
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Some)) {
                return false;
            }
            Some some = (Some) obj;
            return this.amount == some.amount && Intrinsics.areEqual(this.text, some.text);
        }

        public final int hashCode() {
            return this.text.hashCode() + (Long.hashCode(this.amount) * 31);
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("Some(amount=", this.amount, ", text=", this.text);
            m.append(")");
            return m.toString();
        }
    }
}
