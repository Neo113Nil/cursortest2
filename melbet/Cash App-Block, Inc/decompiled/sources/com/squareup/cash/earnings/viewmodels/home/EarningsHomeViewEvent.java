package com.squareup.cash.earnings.viewmodels.home;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface EarningsHomeViewEvent {

    public final class Back implements EarningsHomeViewEvent {
        public static final Back INSTANCE = new Back();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return 709236811;
        }

        public final String toString() {
            return Constants.META_BACK_BUTTON;
        }
    }

    public final class CallToAction implements EarningsHomeViewEvent {
        public final String clientRoute;

        public CallToAction(String str) {
            this.clientRoute = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CallToAction) && this.clientRoute.equals(((CallToAction) obj).clientRoute);
        }

        public final int hashCode() {
            return this.clientRoute.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CallToAction(clientRoute=", this.clientRoute, ")");
        }
    }

    public final class DisclosureUrlClicked implements EarningsHomeViewEvent {
        public final String url;

        public DisclosureUrlClicked(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisclosureUrlClicked) && Intrinsics.areEqual(this.url, ((DisclosureUrlClicked) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DisclosureUrlClicked(url=", this.url, ")");
        }
    }

    public final class EarnerToolTapped implements EarningsHomeViewEvent {
        public final String clientRoute;

        /* renamed from: type, reason: collision with root package name */
        public final EarningsHomeViewModel.EarningToolType f1127type;

        public EarnerToolTapped(EarningsHomeViewModel.EarningToolType earningToolType, String str) {
            str.getClass();
            this.f1127type = earningToolType;
            this.clientRoute = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EarnerToolTapped)) {
                return false;
            }
            EarnerToolTapped earnerToolTapped = (EarnerToolTapped) obj;
            return this.f1127type == earnerToolTapped.f1127type && Intrinsics.areEqual(this.clientRoute, earnerToolTapped.clientRoute);
        }

        public final int hashCode() {
            return this.clientRoute.hashCode() + (this.f1127type.hashCode() * 31);
        }

        public final String toString() {
            return "EarnerToolTapped(type=" + this.f1127type + ", clientRoute=" + this.clientRoute + ")";
        }
    }

    public final class SubmitEarnerMode implements EarningsHomeViewEvent {
        public final long durationSeconds;

        public SubmitEarnerMode(long j) {
            this.durationSeconds = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubmitEarnerMode) && this.durationSeconds == ((SubmitEarnerMode) obj).durationSeconds;
        }

        public final int hashCode() {
            return Long.hashCode(this.durationSeconds);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.durationSeconds, "SubmitEarnerMode(durationSeconds=", ")");
        }
    }
}
