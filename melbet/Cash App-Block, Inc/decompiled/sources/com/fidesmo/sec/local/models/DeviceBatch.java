package com.fidesmo.sec.local.models;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/fidesmo/sec/local/models/DeviceBatch;", "", "batchId", "", "issuer", "", "issuerName", "", "(ILjava/lang/Long;Ljava/lang/String;)V", "getBatchId", "()I", "getIssuer", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getIssuerName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(ILjava/lang/Long;Ljava/lang/String;)Lcom/fidesmo/sec/local/models/DeviceBatch;", "equals", "", "other", "hashCode", "toString", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeviceBatch {
    private final int batchId;
    private final Long issuer;
    private final String issuerName;

    public DeviceBatch(int i, Long l, String str) {
        this.batchId = i;
        this.issuer = l;
        this.issuerName = str;
    }

    public static /* synthetic */ DeviceBatch copy$default(DeviceBatch deviceBatch, int i, Long l, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = deviceBatch.batchId;
        }
        if ((i2 & 2) != 0) {
            l = deviceBatch.issuer;
        }
        if ((i2 & 4) != 0) {
            str = deviceBatch.issuerName;
        }
        return deviceBatch.copy(i, l, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getBatchId() {
        return this.batchId;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getIssuer() {
        return this.issuer;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIssuerName() {
        return this.issuerName;
    }

    public final DeviceBatch copy(int batchId, Long issuer, String issuerName) {
        return new DeviceBatch(batchId, issuer, issuerName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceBatch)) {
            return false;
        }
        DeviceBatch deviceBatch = (DeviceBatch) other;
        return this.batchId == deviceBatch.batchId && Intrinsics.areEqual(this.issuer, deviceBatch.issuer) && Intrinsics.areEqual(this.issuerName, deviceBatch.issuerName);
    }

    public final int getBatchId() {
        return this.batchId;
    }

    public final Long getIssuer() {
        return this.issuer;
    }

    public final String getIssuerName() {
        return this.issuerName;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.batchId) * 31;
        Long l = this.issuer;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.issuerName;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeviceBatch(batchId=");
        sb.append(this.batchId);
        sb.append(", issuer=");
        sb.append(this.issuer);
        sb.append(", issuerName=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.issuerName, ')');
    }

    public /* synthetic */ DeviceBatch(int i, Long l, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, l, str);
    }
}
