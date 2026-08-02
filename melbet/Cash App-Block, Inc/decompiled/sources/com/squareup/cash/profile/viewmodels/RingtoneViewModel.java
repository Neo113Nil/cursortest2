package com.squareup.cash.profile.viewmodels;

import android.net.Uri;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RingtoneViewModel {
    public final List additionalItems;
    public final Uri currentRingtone;
    public final boolean showDefault;
    public final boolean showSilent;

    public RingtoneViewModel(Uri uri, List list, boolean z, boolean z2) {
        this.showDefault = z;
        this.currentRingtone = uri;
        this.showSilent = z2;
        this.additionalItems = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RingtoneViewModel)) {
            return false;
        }
        RingtoneViewModel ringtoneViewModel = (RingtoneViewModel) obj;
        return this.showDefault == ringtoneViewModel.showDefault && Intrinsics.areEqual(this.currentRingtone, ringtoneViewModel.currentRingtone) && this.showSilent == ringtoneViewModel.showSilent && Intrinsics.areEqual(this.additionalItems, ringtoneViewModel.additionalItems);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.showDefault) * 31;
        Uri uri = this.currentRingtone;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.showSilent);
        List list = this.additionalItems;
        return m + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "RingtoneViewModel(showDefault=" + this.showDefault + ", currentRingtone=" + this.currentRingtone + ", showSilent=" + this.showSilent + ", additionalItems=" + this.additionalItems + ")";
    }
}
