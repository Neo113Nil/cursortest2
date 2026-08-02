package com.squareup.cash.bitcoin.viewmodels.stablecoin;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface StablecoinOnboardingViewEvent {

    public final class BackClicked implements StablecoinOnboardingViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return -1060463909;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class CallToActionClicked implements StablecoinOnboardingViewEvent {
        public static final CallToActionClicked INSTANCE = new CallToActionClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CallToActionClicked);
        }

        public final int hashCode() {
            return -613923149;
        }

        public final String toString() {
            return "CallToActionClicked";
        }
    }

    public final class ViewDisclosure implements StablecoinOnboardingViewEvent {
        public final String url;

        public ViewDisclosure(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewDisclosure) && Intrinsics.areEqual(this.url, ((ViewDisclosure) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ViewDisclosure(url=", this.url, ")");
        }
    }
}
