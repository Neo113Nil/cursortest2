package ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.data.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/yandex/logistics/sdk/cargo_form/impl/trigger_communications/abandoned_cart/data/model/AbandonedCartDeliveredNotificationDto;", "", "id", "", "deliveredTimeMillis", "", "<init>", "(Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getDeliveredTimeMillis", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AbandonedCartDeliveredNotificationDto {
    public static final int $stable = 0;
    private final long deliveredTimeMillis;
    private final String id;

    public AbandonedCartDeliveredNotificationDto(@Json(name = "id") String str, @Json(name = "delivered_time_millis") long j) {
        this.id = str;
        this.deliveredTimeMillis = j;
    }

    public static /* synthetic */ AbandonedCartDeliveredNotificationDto copy$default(AbandonedCartDeliveredNotificationDto abandonedCartDeliveredNotificationDto, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = abandonedCartDeliveredNotificationDto.id;
        }
        if ((i & 2) != 0) {
            j = abandonedCartDeliveredNotificationDto.deliveredTimeMillis;
        }
        return abandonedCartDeliveredNotificationDto.copy(str, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getDeliveredTimeMillis() {
        return this.deliveredTimeMillis;
    }

    public final AbandonedCartDeliveredNotificationDto copy(@Json(name = "id") String id, @Json(name = "delivered_time_millis") long deliveredTimeMillis) {
        return new AbandonedCartDeliveredNotificationDto(id, deliveredTimeMillis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AbandonedCartDeliveredNotificationDto)) {
            return false;
        }
        AbandonedCartDeliveredNotificationDto abandonedCartDeliveredNotificationDto = (AbandonedCartDeliveredNotificationDto) other;
        return jl40.l(this.id, abandonedCartDeliveredNotificationDto.id) && this.deliveredTimeMillis == abandonedCartDeliveredNotificationDto.deliveredTimeMillis;
    }

    public final long getDeliveredTimeMillis() {
        return this.deliveredTimeMillis;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return Long.hashCode(this.deliveredTimeMillis) + (this.id.hashCode() * 31);
    }

    public String toString() {
        StringBuilder l = x4e.l("AbandonedCartDeliveredNotificationDto(id=", this.id, ", deliveredTimeMillis=", this.deliveredTimeMillis);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
