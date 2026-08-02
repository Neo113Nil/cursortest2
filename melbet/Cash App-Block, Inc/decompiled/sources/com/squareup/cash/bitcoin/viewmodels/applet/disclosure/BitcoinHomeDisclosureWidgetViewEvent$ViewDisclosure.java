package com.squareup.cash.bitcoin.viewmodels.applet.disclosure;

import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewEvent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinHomeDisclosureWidgetViewEvent$ViewDisclosure implements BitcoinHomeViewEvent {
    public final String url;

    public BitcoinHomeDisclosureWidgetViewEvent$ViewDisclosure(String str) {
        str.getClass();
        this.url = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BitcoinHomeDisclosureWidgetViewEvent$ViewDisclosure) && Intrinsics.areEqual(this.url, ((BitcoinHomeDisclosureWidgetViewEvent$ViewDisclosure) obj).url);
    }

    public final int hashCode() {
        return this.url.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ViewDisclosure(url=", this.url, ")");
    }
}
