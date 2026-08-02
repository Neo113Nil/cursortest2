package app.cash.local.viewmodels.pos;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface LocalPosBrandOnboardingViewEvent {

    public final class CtaClicked implements LocalPosBrandOnboardingViewEvent {
        public static final CtaClicked INSTANCE = new CtaClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CtaClicked);
        }

        public final int hashCode() {
            return -1487199359;
        }

        public final String toString() {
            return "CtaClicked";
        }
    }

    public final class NavigationClicked implements LocalPosBrandOnboardingViewEvent {
        public static final NavigationClicked INSTANCE = new NavigationClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigationClicked);
        }

        public final int hashCode() {
            return -1312833367;
        }

        public final String toString() {
            return "NavigationClicked";
        }
    }

    public final class SwipeDown implements LocalPosBrandOnboardingViewEvent {
        public static final SwipeDown INSTANCE = new SwipeDown();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SwipeDown);
        }

        public final int hashCode() {
            return 852009522;
        }

        public final String toString() {
            return "SwipeDown";
        }
    }

    public final class SwipeUp implements LocalPosBrandOnboardingViewEvent {
        public static final SwipeUp INSTANCE = new SwipeUp();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SwipeUp);
        }

        public final int hashCode() {
            return 50049067;
        }

        public final String toString() {
            return "SwipeUp";
        }
    }

    public final class UrlClicked implements LocalPosBrandOnboardingViewEvent {
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
