package com.fidesmo.sec.local.models;

import com.fidesmo.sec.utils.Hex;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/fidesmo/sec/local/models/DeviceId;", "", "iin", "", "cin", "platformVersion", "", "([B[BJ)V", "getCin", "()[B", "getIin", "getPlatformVersion", "()J", "setPlatformVersion", "(J)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeviceId {
    private final byte[] cin;
    private final byte[] iin;
    private long platformVersion;

    public DeviceId(byte[] bArr, byte[] bArr2, long j) {
        bArr.getClass();
        bArr2.getClass();
        this.iin = bArr;
        this.cin = bArr2;
        this.platformVersion = j;
    }

    public static /* synthetic */ DeviceId copy$default(DeviceId deviceId, byte[] bArr, byte[] bArr2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr = deviceId.iin;
        }
        if ((i & 2) != 0) {
            bArr2 = deviceId.cin;
        }
        if ((i & 4) != 0) {
            j = deviceId.platformVersion;
        }
        return deviceId.copy(bArr, bArr2, j);
    }

    /* renamed from: component1, reason: from getter */
    public final byte[] getIin() {
        return this.iin;
    }

    /* renamed from: component2, reason: from getter */
    public final byte[] getCin() {
        return this.cin;
    }

    /* renamed from: component3, reason: from getter */
    public final long getPlatformVersion() {
        return this.platformVersion;
    }

    public final DeviceId copy(byte[] iin, byte[] cin, long platformVersion) {
        iin.getClass();
        cin.getClass();
        return new DeviceId(iin, cin, platformVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceId)) {
            return false;
        }
        DeviceId deviceId = (DeviceId) other;
        return Intrinsics.areEqual(this.iin, deviceId.iin) && Intrinsics.areEqual(this.cin, deviceId.cin) && this.platformVersion == deviceId.platformVersion;
    }

    public final byte[] getCin() {
        return this.cin;
    }

    public final byte[] getIin() {
        return this.iin;
    }

    public final long getPlatformVersion() {
        return this.platformVersion;
    }

    public int hashCode() {
        return Long.hashCode(this.platformVersion) + ((Arrays.hashCode(this.cin) + (Arrays.hashCode(this.iin) * 31)) * 31);
    }

    public final void setPlatformVersion(long j) {
        this.platformVersion = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeviceId( iin=");
        sb.append(Hex.encodeHex(this.iin));
        sb.append(", cin=");
        sb.append(Hex.encodeHex(this.cin));
        sb.append(", platformVersion=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.platformVersion, ')');
    }

    public /* synthetic */ DeviceId(byte[] bArr, byte[] bArr2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, bArr2, (i & 4) != 0 ? 0L : j);
    }
}
