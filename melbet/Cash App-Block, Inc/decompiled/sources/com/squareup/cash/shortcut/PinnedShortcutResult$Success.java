package com.squareup.cash.shortcut;

import android.content.Intent;
import androidx.glance.appwidget.SizeBoxKt;

/* loaded from: classes7.dex */
public final class PinnedShortcutResult$Success extends SizeBoxKt {
    public final Intent resultIntent;

    public PinnedShortcutResult$Success(Intent intent) {
        this.resultIntent = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PinnedShortcutResult$Success) && this.resultIntent.equals(((PinnedShortcutResult$Success) obj).resultIntent);
    }

    public final int hashCode() {
        return this.resultIntent.hashCode();
    }

    public final String toString() {
        return "Success(resultIntent=" + this.resultIntent + ")";
    }
}
