package com.squareup.cash.limits.backend.api;

import com.squareup.cash.limits.viewmodels.LimitsType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface CustomerLimitsModel {

    public final class Loaded implements CustomerLimitsModel {
        public final List limits;
        public final LimitsType limitsType;

        public Loaded(List list, LimitsType limitsType) {
            list.getClass();
            limitsType.getClass();
            this.limits = list;
            this.limitsType = limitsType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.limits, loaded.limits) && this.limitsType == loaded.limitsType;
        }

        public final int hashCode() {
            return this.limitsType.hashCode() + (this.limits.hashCode() * 31);
        }

        public final String toString() {
            return "Loaded(limits=" + this.limits + ", limitsType=" + this.limitsType + ")";
        }
    }

    public final class Loading implements CustomerLimitsModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 2091916079;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class Unavailable implements CustomerLimitsModel {
        public static final Unavailable INSTANCE = new Unavailable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unavailable);
        }

        public final int hashCode() {
            return 168878275;
        }

        public final String toString() {
            return "Unavailable";
        }
    }
}
