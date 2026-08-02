package com.squareup.cash.bitcoin.viewmodels.applet.autoinvest;

import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewEvent;
import com.squareup.cash.recurring.db.RecurringPreferenceId;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinHomeAutoInvestWidgetViewEvent$RecurringPurchaseClicked implements BitcoinHomeViewEvent {
    public final String recurringId;

    public BitcoinHomeAutoInvestWidgetViewEvent$RecurringPurchaseClicked(String str) {
        str.getClass();
        this.recurringId = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BitcoinHomeAutoInvestWidgetViewEvent$RecurringPurchaseClicked) && Intrinsics.areEqual(this.recurringId, ((BitcoinHomeAutoInvestWidgetViewEvent$RecurringPurchaseClicked) obj).recurringId);
    }

    public final int hashCode() {
        return this.recurringId.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RecurringPurchaseClicked(recurringId=", RecurringPreferenceId.m3732toStringimpl(this.recurringId), ")");
    }
}
