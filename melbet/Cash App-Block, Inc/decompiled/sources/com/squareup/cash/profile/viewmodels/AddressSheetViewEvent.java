package com.squareup.cash.profile.viewmodels;

/* loaded from: classes7.dex */
public interface AddressSheetViewEvent {

    public final class Cancel implements AddressSheetViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return -469681146;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class Replace implements AddressSheetViewEvent {
    }
}
