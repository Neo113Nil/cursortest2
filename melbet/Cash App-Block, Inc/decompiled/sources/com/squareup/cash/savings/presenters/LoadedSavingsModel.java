package com.squareup.cash.savings.presenters;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LoadedSavingsModel {
    public final Object data;

    public LoadedSavingsModel(Object obj) {
        this.data = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LoadedSavingsModel) && Intrinsics.areEqual(this.data, ((LoadedSavingsModel) obj).data);
    }

    public final int hashCode() {
        Object obj = this.data;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LoadedSavingsModel(data=", ")", this.data);
    }
}
