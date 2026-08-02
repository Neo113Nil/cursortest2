package com.squareup.cash.filepicker;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class MimeType {
    public final String value;

    public final boolean equals(Object obj) {
        if (obj instanceof MimeType) {
            return Intrinsics.areEqual(this.value, ((MimeType) obj).value);
        }
        return false;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MimeType(value=", this.value, ")");
    }
}
