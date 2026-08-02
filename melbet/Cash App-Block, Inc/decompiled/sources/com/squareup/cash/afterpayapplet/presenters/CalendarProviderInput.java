package com.squareup.cash.afterpayapplet.presenters;

import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.Tap;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class CalendarProviderInput {
    public final OverdueInfo overdue;
    public final ArrayList payments;
    public final AfterpayAppletHomeContentViewModel.HomeSection.ButtonModel primaryButton;
    public final Tap secondaryButtonTapAction;
    public final String secondaryButtonText;

    public CalendarProviderInput(ArrayList arrayList, OverdueInfo overdueInfo, AfterpayAppletHomeContentViewModel.HomeSection.ButtonModel buttonModel, String str, Tap tap) {
        this.payments = arrayList;
        this.overdue = overdueInfo;
        this.primaryButton = buttonModel;
        this.secondaryButtonText = str;
        this.secondaryButtonTapAction = tap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarProviderInput)) {
            return false;
        }
        CalendarProviderInput calendarProviderInput = (CalendarProviderInput) obj;
        return this.payments.equals(calendarProviderInput.payments) && Intrinsics.areEqual(this.overdue, calendarProviderInput.overdue) && Intrinsics.areEqual(this.primaryButton, calendarProviderInput.primaryButton) && Intrinsics.areEqual(this.secondaryButtonText, calendarProviderInput.secondaryButtonText) && Intrinsics.areEqual(this.secondaryButtonTapAction, calendarProviderInput.secondaryButtonTapAction);
    }

    public final int hashCode() {
        int hashCode = this.payments.hashCode() * 31;
        OverdueInfo overdueInfo = this.overdue;
        int hashCode2 = (hashCode + (overdueInfo == null ? 0 : overdueInfo.hashCode())) * 31;
        AfterpayAppletHomeContentViewModel.HomeSection.ButtonModel buttonModel = this.primaryButton;
        int hashCode3 = (hashCode2 + (buttonModel == null ? 0 : buttonModel.hashCode())) * 31;
        String str = this.secondaryButtonText;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Tap tap = this.secondaryButtonTapAction;
        return hashCode4 + (tap != null ? tap.hashCode() : 0);
    }

    public final String toString() {
        return "CalendarProviderInput(payments=" + this.payments + ", overdue=" + this.overdue + ", primaryButton=" + this.primaryButton + ", secondaryButtonText=" + this.secondaryButtonText + ", secondaryButtonTapAction=" + this.secondaryButtonTapAction + ")";
    }
}
