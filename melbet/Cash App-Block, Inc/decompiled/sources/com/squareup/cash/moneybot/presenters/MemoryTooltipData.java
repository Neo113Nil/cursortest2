package com.squareup.cash.moneybot.presenters;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MemoryTooltipData {
    public final String messageToken;
    public final String text;

    public MemoryTooltipData(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.messageToken = str;
        this.text = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemoryTooltipData)) {
            return false;
        }
        MemoryTooltipData memoryTooltipData = (MemoryTooltipData) obj;
        return Intrinsics.areEqual(this.messageToken, memoryTooltipData.messageToken) && Intrinsics.areEqual(this.text, memoryTooltipData.text);
    }

    public final int hashCode() {
        return this.text.hashCode() + (this.messageToken.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("MemoryTooltipData(messageToken=", this.messageToken, ", text=", this.text, ")");
    }
}
