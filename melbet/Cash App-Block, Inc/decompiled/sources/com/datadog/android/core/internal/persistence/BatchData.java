package com.datadog.android.core.internal.persistence;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class BatchData {
    public final List data;
    public final BatchId id;
    public final byte[] metadata;

    public BatchData(BatchId batchId, List list, byte[] bArr) {
        list.getClass();
        this.id = batchId;
        this.data = list;
        this.metadata = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!BatchData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        BatchData batchData = (BatchData) obj;
        if (!this.id.equals(batchData.id) || !Intrinsics.areEqual(this.data, batchData.data)) {
            return false;
        }
        byte[] bArr = batchData.metadata;
        byte[] bArr2 = this.metadata;
        return bArr2 != null ? bArr != null && Arrays.equals(bArr2, bArr) : bArr == null;
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(this.id.id.hashCode() * 31, 31, this.data);
        byte[] bArr = this.metadata;
        return m + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.metadata);
        StringBuilder sb = new StringBuilder("BatchData(id=");
        sb.append(this.id);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", metadata=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, arrays, ")");
    }
}
