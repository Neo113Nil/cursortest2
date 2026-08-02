package com.squareup.cash.attribution;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class InstallAttributer$AdvertisingIdState$Settled {
    public final boolean isSet;

    public InstallAttributer$AdvertisingIdState$Settled(boolean z) {
        this.isSet = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InstallAttributer$AdvertisingIdState$Settled) && this.isSet == ((InstallAttributer$AdvertisingIdState$Settled) obj).isSet;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isSet);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("Settled(isSet=", ")", this.isSet);
    }
}
