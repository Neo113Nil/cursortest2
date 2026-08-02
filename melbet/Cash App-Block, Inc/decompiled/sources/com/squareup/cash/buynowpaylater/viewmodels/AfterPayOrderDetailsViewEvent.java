package com.squareup.cash.buynowpaylater.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashapproxy.api.ScheduledPaymentStatus;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class AfterPayOrderDetailsViewEvent {

    public final class CloseOrderDetailsButtonClicked extends AfterPayOrderDetailsViewEvent {
        public static final CloseOrderDetailsButtonClicked INSTANCE = new CloseOrderDetailsButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseOrderDetailsButtonClicked);
        }

        public final int hashCode() {
            return -305846695;
        }

        public final String toString() {
            return "CloseOrderDetailsButtonClicked";
        }
    }

    public final class OpenUrl extends AfterPayOrderDetailsViewEvent {
        public final String url;

        public OpenUrl(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenUrl) && Intrinsics.areEqual(this.url, ((OpenUrl) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenUrl(url=", this.url, ")");
        }
    }

    public final class OverflowMenuClicked extends AfterPayOrderDetailsViewEvent {
        public final List actions;

        public OverflowMenuClicked(List list) {
            this.actions = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OverflowMenuClicked) && this.actions.equals(((OverflowMenuClicked) obj).actions);
        }

        public final int hashCode() {
            return this.actions.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("OverflowMenuClicked(actions=", ")", this.actions);
        }
    }

    public final class PayEarlyButtonClicked extends AfterPayOrderDetailsViewEvent {
        public final String clientRouteUrl;

        public PayEarlyButtonClicked(String str) {
            str.getClass();
            this.clientRouteUrl = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PayEarlyButtonClicked) && Intrinsics.areEqual(this.clientRouteUrl, ((PayEarlyButtonClicked) obj).clientRouteUrl);
        }

        public final int hashCode() {
            return this.clientRouteUrl.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PayEarlyButtonClicked(clientRouteUrl=", this.clientRouteUrl, ")");
        }
    }

    public final class PaymentMethodInfoButtonClicked extends AfterPayOrderDetailsViewEvent {
        public final InfoSheetViewModel infoSheetViewModel;

        public PaymentMethodInfoButtonClicked(InfoSheetViewModel infoSheetViewModel) {
            this.infoSheetViewModel = infoSheetViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentMethodInfoButtonClicked) && this.infoSheetViewModel.equals(((PaymentMethodInfoButtonClicked) obj).infoSheetViewModel);
        }

        public final int hashCode() {
            return this.infoSheetViewModel.stackableContent.hashCode();
        }

        public final String toString() {
            return "PaymentMethodInfoButtonClicked(infoSheetViewModel=" + this.infoSheetViewModel + ")";
        }
    }

    public final class ScheduledPaymentClicked extends AfterPayOrderDetailsViewEvent {
        public final InfoSheetViewModel infoSheetViewModel;
        public final ScheduledPaymentStatus paymentStatus;

        public ScheduledPaymentClicked(InfoSheetViewModel infoSheetViewModel, ScheduledPaymentStatus scheduledPaymentStatus) {
            scheduledPaymentStatus.getClass();
            this.infoSheetViewModel = infoSheetViewModel;
            this.paymentStatus = scheduledPaymentStatus;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScheduledPaymentClicked)) {
                return false;
            }
            ScheduledPaymentClicked scheduledPaymentClicked = (ScheduledPaymentClicked) obj;
            return this.infoSheetViewModel.equals(scheduledPaymentClicked.infoSheetViewModel) && this.paymentStatus == scheduledPaymentClicked.paymentStatus;
        }

        public final int hashCode() {
            return this.paymentStatus.hashCode() + (this.infoSheetViewModel.stackableContent.hashCode() * 31);
        }

        public final String toString() {
            return "ScheduledPaymentClicked(infoSheetViewModel=" + this.infoSheetViewModel + ", paymentStatus=" + this.paymentStatus + ")";
        }
    }

    public final class TryAgainClicked extends AfterPayOrderDetailsViewEvent {
        public static final TryAgainClicked INSTANCE = new TryAgainClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TryAgainClicked);
        }

        public final int hashCode() {
            return -957712270;
        }

        public final String toString() {
            return "TryAgainClicked";
        }
    }
}
