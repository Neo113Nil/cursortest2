package io.appmetrica.analytics.blewrapper.internal.config;

import android.os.ParcelUuid;
import defpackage.jl40;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r¨\u0006\u0014"}, d2 = {"Lio/appmetrica/analytics/blewrapper/internal/config/ServiceUuid;", "", "other", "", "equals", "", "hashCode", "", "toString", "Landroid/os/ParcelUuid;", "a", "Landroid/os/ParcelUuid;", "getUuid", "()Landroid/os/ParcelUuid;", "uuid", "b", "getUuidMask", "uuidMask", "<init>", "(Landroid/os/ParcelUuid;Landroid/os/ParcelUuid;)V", "ble-wrapper_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ServiceUuid {

    /* renamed from: a, reason: from kotlin metadata */
    private final ParcelUuid uuid;

    /* renamed from: b, reason: from kotlin metadata */
    private final ParcelUuid uuidMask;

    public ServiceUuid(ParcelUuid parcelUuid, ParcelUuid parcelUuid2) {
        this.uuid = parcelUuid;
        this.uuidMask = parcelUuid2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!ServiceUuid.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        ServiceUuid serviceUuid = (ServiceUuid) other;
        return jl40.l(this.uuid, serviceUuid.uuid) && jl40.l(this.uuidMask, serviceUuid.uuidMask);
    }

    public final ParcelUuid getUuid() {
        return this.uuid;
    }

    public final ParcelUuid getUuidMask() {
        return this.uuidMask;
    }

    public int hashCode() {
        ParcelUuid parcelUuid = this.uuid;
        int hashCode = (parcelUuid != null ? parcelUuid.hashCode() : 0) * 31;
        ParcelUuid parcelUuid2 = this.uuidMask;
        return hashCode + (parcelUuid2 != null ? parcelUuid2.hashCode() : 0);
    }

    public String toString() {
        return "ServiceUuid(uuid=" + this.uuid + ", uuidMask=" + this.uuidMask + ')';
    }
}
