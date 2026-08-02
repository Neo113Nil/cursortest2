package com.datadog.android.core.internal.persistence;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class BatchId {
    public final String id;

    public BatchId(String str) {
        str.getClass();
        this.id = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BatchId) && Intrinsics.areEqual(this.id, ((BatchId) obj).id);
    }

    public final int hashCode() {
        return this.id.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BatchId(id=", this.id, ")");
    }
}
