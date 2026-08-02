package io.appmetrica.analytics.blewrapper.internal.config;

import defpackage.b64;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Arrays;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u000b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012¨\u0006\u0019"}, d2 = {"Lio/appmetrica/analytics/blewrapper/internal/config/ManufacturerData;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", CA20Status.STATUS_USER_I, "getManufacturerId", "()I", "manufacturerId", "", "b", "[B", "getData", "()[B", Constants.KEY_DATA, "c", "getDataMask", "dataMask", "<init>", "(I[B[B)V", "ble-wrapper_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ManufacturerData {

    /* renamed from: a, reason: from kotlin metadata */
    private final int manufacturerId;

    /* renamed from: b, reason: from kotlin metadata */
    private final byte[] data;

    /* renamed from: c, reason: from kotlin metadata */
    private final byte[] dataMask;

    public ManufacturerData(int i, byte[] bArr, byte[] bArr2) {
        this.manufacturerId = i;
        this.data = bArr;
        this.dataMask = bArr2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!ManufacturerData.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        ManufacturerData manufacturerData = (ManufacturerData) other;
        if (this.manufacturerId != manufacturerData.manufacturerId) {
            return false;
        }
        byte[] bArr = this.data;
        byte[] bArr2 = manufacturerData.data;
        if (bArr != null) {
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (bArr2 != null) {
            return false;
        }
        byte[] bArr3 = this.dataMask;
        byte[] bArr4 = manufacturerData.dataMask;
        if (bArr3 != null) {
            if (bArr4 == null || !Arrays.equals(bArr3, bArr4)) {
                return false;
            }
        } else if (bArr4 != null) {
            return false;
        }
        return true;
    }

    public final byte[] getData() {
        return this.data;
    }

    public final byte[] getDataMask() {
        return this.dataMask;
    }

    public final int getManufacturerId() {
        return this.manufacturerId;
    }

    public int hashCode() {
        int i = this.manufacturerId * 31;
        byte[] bArr = this.data;
        int hashCode = (i + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
        byte[] bArr2 = this.dataMask;
        return hashCode + (bArr2 != null ? Arrays.hashCode(bArr2) : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ManufacturerData(manufacturerId=");
        sb.append(this.manufacturerId);
        sb.append(", data=");
        byte[] bArr = this.data;
        sb.append(bArr != null ? Arrays.toString(bArr) : null);
        sb.append(", dataMask=");
        byte[] bArr2 = this.dataMask;
        return b64.p(sb, bArr2 != null ? Arrays.toString(bArr2) : null, ')');
    }
}
