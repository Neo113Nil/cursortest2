package com.squareup.cash.account.settings.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public final class SecurityHubRow {
    public final boolean isVisible;

    public SecurityHubRow(boolean z) {
        this.isVisible = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SecurityHubRow) && this.isVisible == ((SecurityHubRow) obj).isVisible;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isVisible);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("SecurityHubRow(isVisible=", ")", this.isVisible);
    }
}
