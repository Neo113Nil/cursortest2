package io.appmetrica.analytics.blewrapper.internal.config;

import android.os.ParcelUuid;
import defpackage.b64;
import defpackage.jl40;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lio/appmetrica/analytics/blewrapper/internal/config/ServiceData;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "Ljava/lang/String;", "getUuidString", "()Ljava/lang/String;", "uuidString", "", "b", "[B", "getData", "()[B", Constants.KEY_DATA, "c", "getDataMask", "dataMask", "Landroid/os/ParcelUuid;", "getUuid", "()Landroid/os/ParcelUuid;", "uuid", "<init>", "(Ljava/lang/String;[B[B)V", "ble-wrapper_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ServiceData {

    /* renamed from: a, reason: from kotlin metadata */
    private final String uuidString;

    /* renamed from: b, reason: from kotlin metadata */
    private final byte[] data;

    /* renamed from: c, reason: from kotlin metadata */
    private final byte[] dataMask;

    public ServiceData(String str, byte[] bArr, byte[] bArr2) {
        this.uuidString = str;
        this.data = bArr;
        this.dataMask = bArr2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!ServiceData.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        ServiceData serviceData = (ServiceData) other;
        if (!jl40.l(this.uuidString, serviceData.uuidString)) {
            return false;
        }
        byte[] bArr = this.data;
        byte[] bArr2 = serviceData.data;
        if (bArr != null) {
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (bArr2 != null) {
            return false;
        }
        byte[] bArr3 = this.dataMask;
        byte[] bArr4 = serviceData.dataMask;
        if (bArr3 != null) {
            if (bArr4 == null || !Arrays.equals(bArr3, bArr4)) {
                return false;
            }
        } else if (bArr4 != null) {
            return false;
        }
        return jl40.l(getUuid(), serviceData.getUuid());
    }

    public final byte[] getData() {
        return this.data;
    }

    public final byte[] getDataMask() {
        return this.dataMask;
    }

    public final ParcelUuid getUuid() {
        try {
            return ParcelUuid.fromString(this.uuidString);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String getUuidString() {
        return this.uuidString;
    }

    public int hashCode() {
        int hashCode = this.uuidString.hashCode() * 31;
        byte[] bArr = this.data;
        int hashCode2 = (hashCode + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
        byte[] bArr2 = this.dataMask;
        int hashCode3 = (hashCode2 + (bArr2 != null ? Arrays.hashCode(bArr2) : 0)) * 31;
        ParcelUuid uuid = getUuid();
        return hashCode3 + (uuid != null ? uuid.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ServiceData(uuidString='");
        sb.append(this.uuidString);
        sb.append("', data=");
        byte[] bArr = this.data;
        sb.append(bArr != null ? Arrays.toString(bArr) : null);
        sb.append(", dataMask=");
        byte[] bArr2 = this.dataMask;
        return b64.p(sb, bArr2 != null ? Arrays.toString(bArr2) : null, ')');
    }
}
