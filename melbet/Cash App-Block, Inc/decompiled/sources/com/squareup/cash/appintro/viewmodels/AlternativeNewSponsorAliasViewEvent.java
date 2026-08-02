package com.squareup.cash.appintro.viewmodels;

/* loaded from: classes5.dex */
public interface AlternativeNewSponsorAliasViewEvent {

    public final class Cancel implements AlternativeNewSponsorAliasViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return -1658632246;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class Continue implements AlternativeNewSponsorAliasViewEvent {
        public static final Continue INSTANCE = new Continue();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Continue);
        }

        public final int hashCode() {
            return -956747273;
        }

        public final String toString() {
            return "Continue";
        }
    }
}
