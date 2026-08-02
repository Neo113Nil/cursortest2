package com.datadog.android.api.storage;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class RawBatchEvent {
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    public final byte[] data;
    public final byte[] metadata;

    public RawBatchEvent(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        this.data = bArr;
        this.metadata = bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RawBatchEvent.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RawBatchEvent rawBatchEvent = (RawBatchEvent) obj;
        return Arrays.equals(this.data, rawBatchEvent.data) && Arrays.equals(this.metadata, rawBatchEvent.metadata);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.metadata) + (Arrays.hashCode(this.data) * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("RawBatchEvent(data=", Arrays.toString(this.data), ", metadata=", Arrays.toString(this.metadata), ")");
    }
}
