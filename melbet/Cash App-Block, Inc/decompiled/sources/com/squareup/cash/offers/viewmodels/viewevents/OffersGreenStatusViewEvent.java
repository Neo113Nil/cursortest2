package com.squareup.cash.offers.viewmodels.viewevents;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface OffersGreenStatusViewEvent {

    public final class SheetDismissed implements OffersGreenStatusViewEvent {
        public static final SheetDismissed INSTANCE$1 = new SheetDismissed();
        public static final SheetDismissed INSTANCE = new SheetDismissed();
    }

    public final class UrlClicked implements OffersGreenStatusViewEvent {
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
