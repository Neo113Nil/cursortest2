package com.squareup.cash.mooncake.compose_ui.components;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class KeyPadChar {
    public final String contentDescription;
    public final String key;

    public KeyPadChar(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.key = str;
        this.contentDescription = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyPadChar)) {
            return false;
        }
        KeyPadChar keyPadChar = (KeyPadChar) obj;
        return Intrinsics.areEqual(this.key, keyPadChar.key) && Intrinsics.areEqual(this.contentDescription, keyPadChar.contentDescription);
    }

    public final int hashCode() {
        return this.contentDescription.hashCode() + (this.key.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("KeyPadChar(key=", this.key, ", contentDescription=", this.contentDescription, ")");
    }
}
