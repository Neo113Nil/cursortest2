package app.cash.local.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface LocalOrderStatusViewEvent {

    public final class ArrivalToastDismissed implements LocalOrderStatusViewEvent {
        public static final ArrivalToastDismissed INSTANCE = new ArrivalToastDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ArrivalToastDismissed);
        }

        public final int hashCode() {
            return 1509820415;
        }

        public final String toString() {
            return "ArrivalToastDismissed";
        }
    }

    public final class BrandPhoneClicked implements LocalOrderStatusViewEvent {
        public static final BrandPhoneClicked INSTANCE = new BrandPhoneClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BrandPhoneClicked);
        }

        public final int hashCode() {
            return -1617041564;
        }

        public final String toString() {
            return "BrandPhoneClicked";
        }
    }

    public final class CloseClicked implements LocalOrderStatusViewEvent {
        public static final CloseClicked INSTANCE = new CloseClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseClicked);
        }

        public final int hashCode() {
            return 871517483;
        }

        public final String toString() {
            return "CloseClicked";
        }
    }

    public final class CourierPhoneClicked implements LocalOrderStatusViewEvent {
        public static final CourierPhoneClicked INSTANCE = new CourierPhoneClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CourierPhoneClicked);
        }

        public final int hashCode() {
            return -2126280694;
        }

        public final String toString() {
            return "CourierPhoneClicked";
        }
    }

    public final class ImHereClicked implements LocalOrderStatusViewEvent {
        public static final ImHereClicked INSTANCE = new ImHereClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ImHereClicked);
        }

        public final int hashCode() {
            return -1104060489;
        }

        public final String toString() {
            return "ImHereClicked";
        }
    }

    public final class MapClicked implements LocalOrderStatusViewEvent {
        public static final MapClicked INSTANCE = new MapClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MapClicked);
        }

        public final int hashCode() {
            return 2131362887;
        }

        public final String toString() {
            return "MapClicked";
        }
    }

    public final class RetryClicked implements LocalOrderStatusViewEvent {
        public static final RetryClicked INSTANCE = new RetryClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryClicked);
        }

        public final int hashCode() {
            return -472096133;
        }

        public final String toString() {
            return "RetryClicked";
        }
    }

    public final class UrlClicked implements LocalOrderStatusViewEvent {
        public final String url;

        public UrlClicked(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UrlClicked) && Intrinsics.areEqual(this.url, ((UrlClicked) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UrlClicked(url=", this.url, ")");
        }
    }
}
