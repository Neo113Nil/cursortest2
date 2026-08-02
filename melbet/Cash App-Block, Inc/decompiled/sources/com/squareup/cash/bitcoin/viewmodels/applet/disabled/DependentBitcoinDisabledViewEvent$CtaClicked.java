package com.squareup.cash.bitcoin.viewmodels.applet.disabled;

import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewEvent;

/* loaded from: classes5.dex */
public final class DependentBitcoinDisabledViewEvent$CtaClicked implements BitcoinHomeViewEvent {
    public static final DependentBitcoinDisabledViewEvent$CtaClicked INSTANCE = new DependentBitcoinDisabledViewEvent$CtaClicked();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof DependentBitcoinDisabledViewEvent$CtaClicked);
    }

    public final int hashCode() {
        return 2129605766;
    }

    public final String toString() {
        return "CtaClicked";
    }
}
