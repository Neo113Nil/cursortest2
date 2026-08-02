package com.squareup.cash.afterpayapplet.viewmodels.viewevents;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface AfterpayAppletUpsellSheetViewEvent {

    public final class Dismiss implements AfterpayAppletUpsellSheetViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return 941043148;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    public final class SheetViewed implements AfterpayAppletUpsellSheetViewEvent {
        public static final SheetViewed INSTANCE = new SheetViewed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SheetViewed);
        }

        public final int hashCode() {
            return 1481884293;
        }

        public final String toString() {
            return "SheetViewed";
        }
    }

    public final class UrlTapped implements AfterpayAppletUpsellSheetViewEvent {
        public final String url;

        public UrlTapped(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UrlTapped) && Intrinsics.areEqual(this.url, ((UrlTapped) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UrlTapped(url=", this.url, ")");
        }
    }
}
