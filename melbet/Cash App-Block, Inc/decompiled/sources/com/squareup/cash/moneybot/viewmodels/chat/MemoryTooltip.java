package com.squareup.cash.moneybot.viewmodels.chat;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MemoryTooltip {
    public final String messageToken;
    public final String text;

    public MemoryTooltip(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.messageToken = str;
        this.text = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemoryTooltip)) {
            return false;
        }
        MemoryTooltip memoryTooltip = (MemoryTooltip) obj;
        return Intrinsics.areEqual(this.messageToken, memoryTooltip.messageToken) && Intrinsics.areEqual(this.text, memoryTooltip.text);
    }

    public final int hashCode() {
        return this.text.hashCode() + (this.messageToken.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("MemoryTooltip(messageToken=", this.messageToken, ", text=", this.text, ")");
    }
}
