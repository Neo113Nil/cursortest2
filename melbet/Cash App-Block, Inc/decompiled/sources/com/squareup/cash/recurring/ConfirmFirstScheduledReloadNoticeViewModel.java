package com.squareup.cash.recurring;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ConfirmFirstScheduledReloadNoticeViewModel {
    public final String message;
    public final String positiveButtonLabel;

    public ConfirmFirstScheduledReloadNoticeViewModel(String str, String str2) {
        str2.getClass();
        this.message = str;
        this.positiveButtonLabel = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmFirstScheduledReloadNoticeViewModel)) {
            return false;
        }
        ConfirmFirstScheduledReloadNoticeViewModel confirmFirstScheduledReloadNoticeViewModel = (ConfirmFirstScheduledReloadNoticeViewModel) obj;
        return this.message.equals(confirmFirstScheduledReloadNoticeViewModel.message) && Intrinsics.areEqual(this.positiveButtonLabel, confirmFirstScheduledReloadNoticeViewModel.positiveButtonLabel);
    }

    public final int hashCode() {
        return this.positiveButtonLabel.hashCode() + (this.message.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("ConfirmFirstScheduledReloadNoticeViewModel(message=", this.message, ", positiveButtonLabel=", this.positiveButtonLabel, ")");
    }
}
