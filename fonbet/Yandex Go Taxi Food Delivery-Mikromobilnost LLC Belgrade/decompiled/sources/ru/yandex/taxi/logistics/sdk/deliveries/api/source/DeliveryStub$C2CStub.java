package ru.yandex.taxi.logistics.sdk.deliveries.api.source;

import com.squareup.moshi.JsonClass;
import defpackage.isi;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.vng;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0011J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013¨\u0006&"}, d2 = {"ru/yandex/taxi/logistics/sdk/deliveries/api/source/DeliveryStub$C2CStub", "Lisi;", "Ljava/util/UUID;", "localUuid", "", "deliveryId", "", "revision", "", ClidProvider.TIMESTAMP, "<init>", "(Ljava/util/UUID;Ljava/lang/String;IJ)V", "component1", "()Ljava/util/UUID;", "component2", "()Ljava/lang/String;", "component3", "()I", "component4", "()J", "Lru/yandex/taxi/logistics/sdk/deliveries/api/source/DeliveryStub$C2CStub;", "copy", "(Ljava/util/UUID;Ljava/lang/String;IJ)Lru/yandex/taxi/logistics/sdk/deliveries/api/source/DeliveryStub$C2CStub;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getLocalUuid", "Ljava/lang/String;", "getDeliveryId", CA20Status.STATUS_USER_I, "getRevision", "J", "getTimestamp", "sdk-deliveries"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DeliveryStub$C2CStub extends isi {
    private final String deliveryId;
    private final UUID localUuid;
    private final int revision;
    private final long timestamp;

    public /* synthetic */ DeliveryStub$C2CStub(UUID uuid, String str, int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? vng.I() : j);
    }

    public static /* synthetic */ DeliveryStub$C2CStub copy$default(DeliveryStub$C2CStub deliveryStub$C2CStub, UUID uuid, String str, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uuid = deliveryStub$C2CStub.localUuid;
        }
        if ((i2 & 2) != 0) {
            str = deliveryStub$C2CStub.deliveryId;
        }
        if ((i2 & 4) != 0) {
            i = deliveryStub$C2CStub.revision;
        }
        if ((i2 & 8) != 0) {
            j = deliveryStub$C2CStub.timestamp;
        }
        int i3 = i;
        return deliveryStub$C2CStub.copy(uuid, str, i3, j);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getLocalUuid() {
        return this.localUuid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeliveryId() {
        return this.deliveryId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRevision() {
        return this.revision;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final DeliveryStub$C2CStub copy(UUID localUuid, String deliveryId, int revision, long timestamp) {
        return new DeliveryStub$C2CStub(localUuid, deliveryId, revision, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryStub$C2CStub)) {
            return false;
        }
        DeliveryStub$C2CStub deliveryStub$C2CStub = (DeliveryStub$C2CStub) other;
        return jl40.l(this.localUuid, deliveryStub$C2CStub.localUuid) && jl40.l(this.deliveryId, deliveryStub$C2CStub.deliveryId) && this.revision == deliveryStub$C2CStub.revision && this.timestamp == deliveryStub$C2CStub.timestamp;
    }

    public final String getDeliveryId() {
        return this.deliveryId;
    }

    public final UUID getLocalUuid() {
        return this.localUuid;
    }

    public final int getRevision() {
        return this.revision;
    }

    @Override // defpackage.isi
    public long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int hashCode = this.localUuid.hashCode() * 31;
        String str = this.deliveryId;
        return Long.hashCode(this.timestamp) + oyr.b(this.revision, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public String toString() {
        return "C2CStub(localUuid=" + this.localUuid + ", deliveryId=" + this.deliveryId + ", revision=" + this.revision + ", timestamp=" + this.timestamp + Extension.C_BRAKE;
    }

    public DeliveryStub$C2CStub(UUID uuid, String str, int i, long j) {
        this.localUuid = uuid;
        this.deliveryId = str;
        this.revision = i;
        this.timestamp = j;
    }
}
