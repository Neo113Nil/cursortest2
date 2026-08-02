package com.squareup.cash.composeUi.foundation.text;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class TextLineBalancing {
    public final int preferredLineCount;

    public final boolean equals(Object obj) {
        if (obj instanceof TextLineBalancing) {
            return this.preferredLineCount == ((TextLineBalancing) obj).preferredLineCount;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.preferredLineCount);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.preferredLineCount, "TextLineBalancing(preferredLineCount=", ")");
    }
}
