package com.squareup.cash.moneybot.views.plugins;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class TokenRange {
    public final int end;
    public final String placeholderKey;
    public final int start;
    public final String text;

    public TokenRange(String str, int i, int i2, String str2) {
        str.getClass();
        this.placeholderKey = str;
        this.text = str2;
        this.start = i;
        this.end = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenRange)) {
            return false;
        }
        TokenRange tokenRange = (TokenRange) obj;
        return Intrinsics.areEqual(this.placeholderKey, tokenRange.placeholderKey) && this.text.equals(tokenRange.text) && this.start == tokenRange.start && this.end == tokenRange.end;
    }

    public final int hashCode() {
        return Integer.hashCode(this.end) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.start, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.placeholderKey.hashCode() * 31, 31, this.text), 31);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m(this.start, this.end, ", end=", ")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TokenRange(placeholderKey=", this.placeholderKey, ", text=", this.text, ", start="));
    }
}
