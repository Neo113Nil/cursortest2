package com.fidesmo.sec.local.models;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/fidesmo/sec/local/models/DeviceCinBatch;", "", "cin", "", "batchId", "", "([BI)V", "getBatchId", "()I", "getCin", "()[B", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeviceCinBatch {
    private final int batchId;
    private final byte[] cin;

    public DeviceCinBatch(byte[] bArr, int i) {
        bArr.getClass();
        this.cin = bArr;
        this.batchId = i;
    }

    public static /* synthetic */ DeviceCinBatch copy$default(DeviceCinBatch deviceCinBatch, byte[] bArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bArr = deviceCinBatch.cin;
        }
        if ((i2 & 2) != 0) {
            i = deviceCinBatch.batchId;
        }
        return deviceCinBatch.copy(bArr, i);
    }

    /* renamed from: component1, reason: from getter */
    public final byte[] getCin() {
        return this.cin;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBatchId() {
        return this.batchId;
    }

    public final DeviceCinBatch copy(byte[] cin, int batchId) {
        cin.getClass();
        return new DeviceCinBatch(cin, batchId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!DeviceCinBatch.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        DeviceCinBatch deviceCinBatch = (DeviceCinBatch) other;
        return Arrays.equals(this.cin, deviceCinBatch.cin) && this.batchId == deviceCinBatch.batchId;
    }

    public final int getBatchId() {
        return this.batchId;
    }

    public final byte[] getCin() {
        return this.cin;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.cin) * 31) + this.batchId;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeviceCinBatch(cin=");
        sb.append(Arrays.toString(this.cin));
        sb.append(", batchId=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.batchId, ')');
    }
}
