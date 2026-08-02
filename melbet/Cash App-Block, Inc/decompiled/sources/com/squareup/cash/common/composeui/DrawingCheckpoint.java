package com.squareup.cash.common.composeui;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class DrawingCheckpoint {
    public final int value;

    public final boolean equals(Object obj) {
        if (obj instanceof DrawingCheckpoint) {
            return this.value == ((DrawingCheckpoint) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.value, "DrawingCheckpoint(value=", ")");
    }
}
