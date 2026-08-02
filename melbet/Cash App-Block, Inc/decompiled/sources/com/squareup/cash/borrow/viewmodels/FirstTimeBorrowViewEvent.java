package com.squareup.cash.borrow.viewmodels;

import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.ui.overlays.viewmodels.AlertDialogViewEvent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface FirstTimeBorrowViewEvent {

    /* loaded from: classes4.dex */
    public final class AlertDialogEvent implements FirstTimeBorrowViewEvent {
        public final AlertDialogViewEvent value;

        public AlertDialogEvent(AlertDialogViewEvent alertDialogViewEvent) {
            alertDialogViewEvent.getClass();
            this.value = alertDialogViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AlertDialogEvent) && Intrinsics.areEqual(this.value, ((AlertDialogEvent) obj).value);
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return "AlertDialogEvent(value=" + this.value + ")";
        }
    }

    /* loaded from: classes4.dex */
    public final class AmountPickerEvent implements FirstTimeBorrowViewEvent {
        public final BorrowAmountPickerViewEvent value;

        public AmountPickerEvent(BorrowAmountPickerViewEvent borrowAmountPickerViewEvent) {
            borrowAmountPickerViewEvent.getClass();
            this.value = borrowAmountPickerViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AmountPickerEvent) && Intrinsics.areEqual(this.value, ((AmountPickerEvent) obj).value);
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return "AmountPickerEvent(value=" + this.value + ")";
        }
    }

    public final class BorrowButtonClick implements FirstTimeBorrowViewEvent {
        public static final BorrowButtonClick INSTANCE = new BorrowButtonClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BorrowButtonClick);
        }

        public final int hashCode() {
            return -887330194;
        }

        public final String toString() {
            return "BorrowButtonClick";
        }
    }

    public final class BulletsButtonClick implements FirstTimeBorrowViewEvent {
        public static final BulletsButtonClick INSTANCE = new BulletsButtonClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BulletsButtonClick);
        }

        public final int hashCode() {
            return -1060103048;
        }

        public final String toString() {
            return "BulletsButtonClick";
        }
    }

    public final class Close implements FirstTimeBorrowViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1756783525;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class HelpButtonClick implements FirstTimeBorrowViewEvent {
        public static final HelpButtonClick INSTANCE = new HelpButtonClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HelpButtonClick);
        }

        public final int hashCode() {
            return -769989406;
        }

        public final String toString() {
            return "HelpButtonClick";
        }
    }

    /* loaded from: classes4.dex */
    public final class NoticeLinkClick implements FirstTimeBorrowViewEvent {
        public final String url;

        public NoticeLinkClick(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoticeLinkClick) && Intrinsics.areEqual(this.url, ((NoticeLinkClick) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NoticeLinkClick(url=", this.url, ")");
        }
    }

    public final class SecondaryButtonClick implements FirstTimeBorrowViewEvent {
        public final String submitId;

        public SecondaryButtonClick(String str) {
            this.submitId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SecondaryButtonClick) && this.submitId.equals(((SecondaryButtonClick) obj).submitId);
        }

        public final int hashCode() {
            return this.submitId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SecondaryButtonClick(submitId=", this.submitId, ")");
        }
    }
}
