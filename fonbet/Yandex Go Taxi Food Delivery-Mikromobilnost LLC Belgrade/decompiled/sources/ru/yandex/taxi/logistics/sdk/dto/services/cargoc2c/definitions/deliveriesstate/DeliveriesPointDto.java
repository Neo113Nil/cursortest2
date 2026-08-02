package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliveriesstate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PointPinDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PointTypeDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0012\b\u0001\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0012\b\u0003\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveriesstate/DeliveriesPointDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PointTypeDto;", "coordinates", "", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/CoordinatesDto;", "pin", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PointPinDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PointTypeDto;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PointPinDto;)V", "getType", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PointTypeDto;", "getCoordinates", "()Ljava/util/List;", "getPin", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PointPinDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DeliveriesPointDto {
    private final List<Double> coordinates;
    private final PointPinDto pin;
    private final PointTypeDto type;

    public DeliveriesPointDto(@Json(name = "type") PointTypeDto pointTypeDto, @Json(name = "coordinates") List<Double> list, @Json(name = "pin") PointPinDto pointPinDto) {
        this.type = pointTypeDto;
        this.coordinates = list;
        this.pin = pointPinDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveriesPointDto copy$default(DeliveriesPointDto deliveriesPointDto, PointTypeDto pointTypeDto, List list, PointPinDto pointPinDto, int i, Object obj) {
        if ((i & 1) != 0) {
            pointTypeDto = deliveriesPointDto.type;
        }
        if ((i & 2) != 0) {
            list = deliveriesPointDto.coordinates;
        }
        if ((i & 4) != 0) {
            pointPinDto = deliveriesPointDto.pin;
        }
        return deliveriesPointDto.copy(pointTypeDto, list, pointPinDto);
    }

    /* renamed from: component1, reason: from getter */
    public final PointTypeDto getType() {
        return this.type;
    }

    public final List<Double> component2() {
        return this.coordinates;
    }

    /* renamed from: component3, reason: from getter */
    public final PointPinDto getPin() {
        return this.pin;
    }

    public final DeliveriesPointDto copy(@Json(name = "type") PointTypeDto type, @Json(name = "coordinates") List<Double> coordinates, @Json(name = "pin") PointPinDto pin) {
        return new DeliveriesPointDto(type, coordinates, pin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveriesPointDto)) {
            return false;
        }
        DeliveriesPointDto deliveriesPointDto = (DeliveriesPointDto) other;
        return this.type == deliveriesPointDto.type && jl40.l(this.coordinates, deliveriesPointDto.coordinates) && jl40.l(this.pin, deliveriesPointDto.pin);
    }

    public final List<Double> getCoordinates() {
        return this.coordinates;
    }

    public final PointPinDto getPin() {
        return this.pin;
    }

    public final PointTypeDto getType() {
        return this.type;
    }

    public int hashCode() {
        int c = unr0.c(this.type.hashCode() * 31, 31, this.coordinates);
        PointPinDto pointPinDto = this.pin;
        return c + (pointPinDto == null ? 0 : pointPinDto.hashCode());
    }

    public String toString() {
        return "DeliveriesPointDto(type=" + this.type + ", coordinates=" + this.coordinates + ", pin=" + this.pin + Extension.C_BRAKE;
    }
}
