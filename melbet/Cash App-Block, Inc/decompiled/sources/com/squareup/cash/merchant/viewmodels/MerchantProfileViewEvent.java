package com.squareup.cash.merchant.viewmodels;

import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent;
import com.squareup.cash.history.payments.viewmodels.ProfilePaymentHistoryViewEvent$ViewAll;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface MerchantProfileViewEvent {

    public final class AvatarClicked implements MerchantProfileViewEvent {
        public static final AvatarClicked INSTANCE = new AvatarClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AvatarClicked);
        }

        public final int hashCode() {
            return 102049823;
        }

        public final String toString() {
            return "AvatarClicked";
        }
    }

    public final class MerchantGenericTreeElementsViewEvent implements MerchantProfileViewEvent {
        public final GenericTreeElementsViewEvent event;

        public MerchantGenericTreeElementsViewEvent(GenericTreeElementsViewEvent genericTreeElementsViewEvent) {
            genericTreeElementsViewEvent.getClass();
            this.event = genericTreeElementsViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MerchantGenericTreeElementsViewEvent) && Intrinsics.areEqual(this.event, ((MerchantGenericTreeElementsViewEvent) obj).event);
        }

        public final int hashCode() {
            return this.event.hashCode();
        }

        public final String toString() {
            return "MerchantGenericTreeElementsViewEvent(event=" + this.event + ")";
        }
    }

    public final class NavigationIconClicked implements MerchantProfileViewEvent {
        public static final NavigationIconClicked INSTANCE = new NavigationIconClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigationIconClicked);
        }

        public final int hashCode() {
            return 579998027;
        }

        public final String toString() {
            return "NavigationIconClicked";
        }
    }

    public final class PaymentHistoryViewEvent implements MerchantProfileViewEvent {
        public final ProfilePaymentHistoryViewEvent$ViewAll event;

        public PaymentHistoryViewEvent(ProfilePaymentHistoryViewEvent$ViewAll profilePaymentHistoryViewEvent$ViewAll) {
            profilePaymentHistoryViewEvent$ViewAll.getClass();
            this.event = profilePaymentHistoryViewEvent$ViewAll;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentHistoryViewEvent) && Intrinsics.areEqual(this.event, ((PaymentHistoryViewEvent) obj).event);
        }

        public final int hashCode() {
            this.event.getClass();
            return -850825642;
        }

        public final String toString() {
            return "PaymentHistoryViewEvent(event=" + this.event + ")";
        }
    }

    public final class ReloadProfile implements MerchantProfileViewEvent {
        public static final ReloadProfile INSTANCE = new ReloadProfile();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ReloadProfile);
        }

        public final int hashCode() {
            return 106207585;
        }

        public final String toString() {
            return "ReloadProfile";
        }
    }
}
