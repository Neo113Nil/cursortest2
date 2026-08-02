package com.squareup.cash.bitcoin.viewmodels.applet.onramp;

import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewEvent;

/* loaded from: classes5.dex */
public final class BitcoinOnRampWidgetViewEvent$OptionClicked implements BitcoinHomeViewEvent {

    /* renamed from: type, reason: collision with root package name */
    public final BitcoinOnRampOptionType f1054type;

    public BitcoinOnRampWidgetViewEvent$OptionClicked(BitcoinOnRampOptionType bitcoinOnRampOptionType) {
        bitcoinOnRampOptionType.getClass();
        this.f1054type = bitcoinOnRampOptionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BitcoinOnRampWidgetViewEvent$OptionClicked) && this.f1054type == ((BitcoinOnRampWidgetViewEvent$OptionClicked) obj).f1054type;
    }

    public final int hashCode() {
        return this.f1054type.hashCode();
    }

    public final String toString() {
        return "OptionClicked(type=" + this.f1054type + ")";
    }
}
