package com.squareup.cash.offers.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OffersNotificationViewModel {
    public final long duration;
    public final String message;

    public OffersNotificationViewModel(long j, String str) {
        str.getClass();
        this.duration = j;
        this.message = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersNotificationViewModel)) {
            return false;
        }
        OffersNotificationViewModel offersNotificationViewModel = (OffersNotificationViewModel) obj;
        return this.duration == offersNotificationViewModel.duration && Intrinsics.areEqual(this.message, offersNotificationViewModel.message);
    }

    public final int hashCode() {
        return this.message.hashCode() + (Long.hashCode(this.duration) * 31);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("OffersNotificationViewModel(duration=", this.duration, ", message=", this.message);
        m.append(")");
        return m.toString();
    }
}
