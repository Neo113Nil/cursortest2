package com.squareup.cash.investing.presenters.stockdetails;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Loaded {
    public final Object value;

    public Loaded(Object obj) {
        this.value = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Loaded) && Intrinsics.areEqual(this.value, ((Loaded) obj).value);
    }

    public final int hashCode() {
        Object obj = this.value;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loaded(value=", ")", this.value);
    }
}
