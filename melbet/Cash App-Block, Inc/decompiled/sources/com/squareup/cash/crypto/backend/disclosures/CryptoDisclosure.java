package com.squareup.cash.crypto.backend.disclosures;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class CryptoDisclosure {
    public final String disclosure;
    public final String url;

    public CryptoDisclosure(String str, String str2) {
        str2.getClass();
        this.disclosure = str;
        this.url = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoDisclosure)) {
            return false;
        }
        CryptoDisclosure cryptoDisclosure = (CryptoDisclosure) obj;
        return this.disclosure.equals(cryptoDisclosure.disclosure) && Intrinsics.areEqual(this.url, cryptoDisclosure.url);
    }

    public final int hashCode() {
        return this.url.hashCode() + (this.disclosure.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("CryptoDisclosure(disclosure=", this.disclosure, ", url=", this.url, ")");
    }
}
