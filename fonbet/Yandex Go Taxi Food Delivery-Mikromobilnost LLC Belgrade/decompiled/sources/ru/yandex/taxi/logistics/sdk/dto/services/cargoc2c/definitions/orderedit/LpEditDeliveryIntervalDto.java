package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.orderedit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpEditDeliveryIntervalDto;", "", "from", "", "to", "<init>", "(JJ)V", "getFrom", "()J", "getTo", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LpEditDeliveryIntervalDto {
    private final long from;
    private final long to;

    public LpEditDeliveryIntervalDto(@Json(name = "from") long j, @Json(name = "to") long j2) {
        this.from = j;
        this.to = j2;
    }

    public static /* synthetic */ LpEditDeliveryIntervalDto copy$default(LpEditDeliveryIntervalDto lpEditDeliveryIntervalDto, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = lpEditDeliveryIntervalDto.from;
        }
        if ((i & 2) != 0) {
            j2 = lpEditDeliveryIntervalDto.to;
        }
        return lpEditDeliveryIntervalDto.copy(j, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getFrom() {
        return this.from;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTo() {
        return this.to;
    }

    public final LpEditDeliveryIntervalDto copy(@Json(name = "from") long from, @Json(name = "to") long to) {
        return new LpEditDeliveryIntervalDto(from, to);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LpEditDeliveryIntervalDto)) {
            return false;
        }
        LpEditDeliveryIntervalDto lpEditDeliveryIntervalDto = (LpEditDeliveryIntervalDto) other;
        return this.from == lpEditDeliveryIntervalDto.from && this.to == lpEditDeliveryIntervalDto.to;
    }

    public final long getFrom() {
        return this.from;
    }

    public final long getTo() {
        return this.to;
    }

    public int hashCode() {
        return Long.hashCode(this.to) + (Long.hashCode(this.from) * 31);
    }

    public String toString() {
        return oyr.n(this.to, Extension.C_BRAKE, unr0.w(this.from, "LpEditDeliveryIntervalDto(from=", ", to="));
    }
}
