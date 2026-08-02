package com.squareup.cash.money.presenters;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class MoneyTabToolbarConfig {
    public final boolean isEmpty;

    public MoneyTabToolbarConfig(boolean z) {
        this.isEmpty = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MoneyTabToolbarConfig) && this.isEmpty == ((MoneyTabToolbarConfig) obj).isEmpty;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isEmpty);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("MoneyTabToolbarConfig(isEmpty=", ")", this.isEmpty);
    }
}
