package com.squareup.cash.history.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ActivityInviteViewModel {
    public final boolean enabled;
    public final String text;

    public ActivityInviteViewModel(String str, boolean z) {
        str.getClass();
        this.text = str;
        this.enabled = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityInviteViewModel)) {
            return false;
        }
        ActivityInviteViewModel activityInviteViewModel = (ActivityInviteViewModel) obj;
        return Intrinsics.areEqual(this.text, activityInviteViewModel.text) && this.enabled == activityInviteViewModel.enabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.enabled) + (this.text.hashCode() * 31);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("ActivityInviteViewModel(text=", this.text, ", enabled=", ")", this.enabled);
    }
}
