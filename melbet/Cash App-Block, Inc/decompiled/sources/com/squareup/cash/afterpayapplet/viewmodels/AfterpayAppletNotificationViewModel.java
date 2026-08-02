package com.squareup.cash.afterpayapplet.viewmodels;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AfterpayAppletNotificationViewModel {
    public final String subtitle;
    public final Long timeUntilDismissMillis;
    public final String title;

    public AfterpayAppletNotificationViewModel(Long l, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.subtitle = str2;
        this.timeUntilDismissMillis = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletNotificationViewModel)) {
            return false;
        }
        AfterpayAppletNotificationViewModel afterpayAppletNotificationViewModel = (AfterpayAppletNotificationViewModel) obj;
        return Intrinsics.areEqual(this.title, afterpayAppletNotificationViewModel.title) && Intrinsics.areEqual(this.subtitle, afterpayAppletNotificationViewModel.subtitle) && this.timeUntilDismissMillis.equals(afterpayAppletNotificationViewModel.timeUntilDismissMillis);
    }

    public final int hashCode() {
        return this.timeUntilDismissMillis.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle);
    }

    public final String toString() {
        return Thread$State$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AfterpayAppletNotificationViewModel(title=", this.title, ", subtitle=", this.subtitle, ", timeUntilDismissMillis="), this.timeUntilDismissMillis, ")");
    }
}
