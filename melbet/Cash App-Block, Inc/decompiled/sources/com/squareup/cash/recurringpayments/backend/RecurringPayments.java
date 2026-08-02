package com.squareup.cash.recurringpayments.backend;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class RecurringPayments {

    public final class Error extends RecurringPayments {
        public static final Error INSTANCE = new Error();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return 1556869524;
        }

        public final String toString() {
            return "Error";
        }
    }

    public final class Loaded extends RecurringPayments {
        public final String initializationUrl;
        public final ArrayList recurringPayments;

        public Loaded(String str, ArrayList arrayList) {
            this.recurringPayments = arrayList;
            this.initializationUrl = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.recurringPayments.equals(loaded.recurringPayments) && Intrinsics.areEqual(this.initializationUrl, loaded.initializationUrl);
        }

        public final int hashCode() {
            int hashCode = this.recurringPayments.hashCode() * 31;
            String str = this.initializationUrl;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "Loaded(recurringPayments=" + this.recurringPayments + ", initializationUrl=" + this.initializationUrl + ")";
        }
    }

    public final class Loading extends RecurringPayments {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -976335416;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class NotLoaded extends RecurringPayments {
        public static final NotLoaded INSTANCE = new NotLoaded();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotLoaded);
        }

        public final int hashCode() {
            return 2020316740;
        }

        public final String toString() {
            return "NotLoaded";
        }
    }
}
