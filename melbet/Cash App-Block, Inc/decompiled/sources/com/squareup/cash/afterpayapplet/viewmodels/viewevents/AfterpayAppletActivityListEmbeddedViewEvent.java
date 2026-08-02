package com.squareup.cash.afterpayapplet.viewmodels.viewevents;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface AfterpayAppletActivityListEmbeddedViewEvent {

    public final class FooterLinkTapped implements AfterpayAppletActivityListEmbeddedViewEvent {
        public final String actionUrl;

        public FooterLinkTapped(String str) {
            str.getClass();
            this.actionUrl = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FooterLinkTapped) && Intrinsics.areEqual(this.actionUrl, ((FooterLinkTapped) obj).actionUrl);
        }

        public final int hashCode() {
            return this.actionUrl.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FooterLinkTapped(actionUrl=", this.actionUrl, ")");
        }
    }

    public final class TapBack implements AfterpayAppletActivityListEmbeddedViewEvent {
        public static final TapBack INSTANCE = new TapBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapBack);
        }

        public final int hashCode() {
            return 1487621709;
        }

        public final String toString() {
            return "TapBack";
        }
    }
}
