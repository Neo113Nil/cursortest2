package com.datadog.android.core.internal.persistence.tlvformat;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class TLVBlockFileReader$TLVResult {
    public final Object data;
    public final int newIndex;

    public TLVBlockFileReader$TLVResult(Object obj, int i) {
        obj.getClass();
        this.data = obj;
        this.newIndex = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TLVBlockFileReader$TLVResult)) {
            return false;
        }
        TLVBlockFileReader$TLVResult tLVBlockFileReader$TLVResult = (TLVBlockFileReader$TLVResult) obj;
        return Intrinsics.areEqual(this.data, tLVBlockFileReader$TLVResult.data) && this.newIndex == tLVBlockFileReader$TLVResult.newIndex;
    }

    public final int hashCode() {
        return Integer.hashCode(this.newIndex) + (this.data.hashCode() * 31);
    }

    public final String toString() {
        return "TLVResult(data=" + this.data + ", newIndex=" + this.newIndex + ")";
    }
}
