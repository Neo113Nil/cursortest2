package com.squareup.cash.afterpayapplet.backend;

import com.squareup.protos.cash.cashsuggest.api.RetroOrderSelectionResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface RetroOrderSelectionResult {

    public final class Empty implements RetroOrderSelectionResult {
        public static final Empty INSTANCE = new Empty();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Empty);
        }

        public final int hashCode() {
            return 1727920776;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public final class Error implements RetroOrderSelectionResult {
        public static final Error INSTANCE = new Error();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return 1728071491;
        }

        public final String toString() {
            return "Error";
        }
    }

    public final class Loading implements RetroOrderSelectionResult {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 339997623;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class Success implements RetroOrderSelectionResult {
        public final RetroOrderSelectionResponse data;

        public Success(RetroOrderSelectionResponse retroOrderSelectionResponse) {
            retroOrderSelectionResponse.getClass();
            this.data = retroOrderSelectionResponse;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.data, ((Success) obj).data);
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final String toString() {
            return "Success(data=" + this.data + ")";
        }
    }
}
