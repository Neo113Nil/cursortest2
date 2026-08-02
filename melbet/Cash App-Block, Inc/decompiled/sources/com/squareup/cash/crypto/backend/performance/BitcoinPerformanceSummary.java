package com.squareup.cash.crypto.backend.performance;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;

/* loaded from: classes6.dex */
public interface BitcoinPerformanceSummary {

    public final class Empty implements BitcoinPerformanceSummary {
        public static final Empty INSTANCE = new Empty();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Empty);
        }

        public final int hashCode() {
            return -717351200;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public final class Loaded implements BitcoinPerformanceSummary {
        public final double allTimeReturnsPercent;
        public final Money allTimeReturnsValue;
        public final boolean isStale;

        public Loaded(Money money, double d, boolean z) {
            this.allTimeReturnsValue = money;
            this.allTimeReturnsPercent = d;
            this.isStale = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.allTimeReturnsValue.equals(loaded.allTimeReturnsValue) && Double.compare(this.allTimeReturnsPercent, loaded.allTimeReturnsPercent) == 0 && this.isStale == loaded.isStale;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isStale) + Fragment$5$$ExternalSyntheticOutline0.m(this.allTimeReturnsPercent, this.allTimeReturnsValue.hashCode() * 31, 31);
        }

        public final String toString() {
            return "Loaded(allTimeReturnsValue=" + this.allTimeReturnsValue + ", allTimeReturnsPercent=" + this.allTimeReturnsPercent + ", isStale=" + this.isStale + ")";
        }
    }

    public final class Loading implements BitcoinPerformanceSummary {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -219260401;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
