package ru.yandex.taxi.logistics.sdk.deliveries.api.source;

import com.squareup.moshi.JsonClass;
import defpackage.isi;
import defpackage.jl40;
import defpackage.vng;
import defpackage.x4e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"ru/yandex/taxi/logistics/sdk/deliveries/api/source/DeliveryStub$MarketStub", "Lisi;", "", "originalOrderId", "", ClidProvider.TIMESTAMP, "<init>", "(Ljava/lang/String;J)V", "component1", "()Ljava/lang/String;", "component2", "()J", "Lru/yandex/taxi/logistics/sdk/deliveries/api/source/DeliveryStub$MarketStub;", "copy", "(Ljava/lang/String;J)Lru/yandex/taxi/logistics/sdk/deliveries/api/source/DeliveryStub$MarketStub;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOriginalOrderId", "J", "getTimestamp", "sdk-deliveries"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DeliveryStub$MarketStub extends isi {
    private final String originalOrderId;
    private final long timestamp;

    public /* synthetic */ DeliveryStub$MarketStub(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? vng.I() : j);
    }

    public static /* synthetic */ DeliveryStub$MarketStub copy$default(DeliveryStub$MarketStub deliveryStub$MarketStub, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deliveryStub$MarketStub.originalOrderId;
        }
        if ((i & 2) != 0) {
            j = deliveryStub$MarketStub.timestamp;
        }
        return deliveryStub$MarketStub.copy(str, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOriginalOrderId() {
        return this.originalOrderId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final DeliveryStub$MarketStub copy(String originalOrderId, long timestamp) {
        return new DeliveryStub$MarketStub(originalOrderId, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryStub$MarketStub)) {
            return false;
        }
        DeliveryStub$MarketStub deliveryStub$MarketStub = (DeliveryStub$MarketStub) other;
        return jl40.l(this.originalOrderId, deliveryStub$MarketStub.originalOrderId) && this.timestamp == deliveryStub$MarketStub.timestamp;
    }

    public final String getOriginalOrderId() {
        return this.originalOrderId;
    }

    @Override // defpackage.isi
    public long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp) + (this.originalOrderId.hashCode() * 31);
    }

    public String toString() {
        StringBuilder l = x4e.l("MarketStub(originalOrderId=", this.originalOrderId, ", timestamp=", this.timestamp);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    public DeliveryStub$MarketStub(String str, long j) {
        this.originalOrderId = str;
        this.timestamp = j;
    }
}
