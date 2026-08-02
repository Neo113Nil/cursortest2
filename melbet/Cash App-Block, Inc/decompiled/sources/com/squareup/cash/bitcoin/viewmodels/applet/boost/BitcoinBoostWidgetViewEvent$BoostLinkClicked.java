package com.squareup.cash.bitcoin.viewmodels.applet.boost;

import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewEvent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinBoostWidgetViewEvent$BoostLinkClicked implements BitcoinHomeViewEvent {
    public final String url;

    public BitcoinBoostWidgetViewEvent$BoostLinkClicked(String str) {
        str.getClass();
        this.url = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BitcoinBoostWidgetViewEvent$BoostLinkClicked) && Intrinsics.areEqual(this.url, ((BitcoinBoostWidgetViewEvent$BoostLinkClicked) obj).url);
    }

    public final int hashCode() {
        return this.url.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BoostLinkClicked(url=", this.url, ")");
    }
}
