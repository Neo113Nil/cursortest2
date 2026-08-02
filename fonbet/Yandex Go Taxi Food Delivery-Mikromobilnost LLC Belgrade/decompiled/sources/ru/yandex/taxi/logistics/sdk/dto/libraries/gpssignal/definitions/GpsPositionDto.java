package ru.yandex.taxi.logistics.sdk.dto.libraries.gpssignal.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\\\u0010\u001f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0016\u0010\u0013R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0017\u0010\u0013¨\u0006("}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/gpssignal/definitions/GpsPositionDto;", "", "lat", "", "lon", ClidProvider.TIMESTAMP, "", "accuracy", "altitude", "speed", "direction", "<init>", "(DDJLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getLat", "()D", "getLon", "getTimestamp", "()J", "getAccuracy", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAltitude", "getSpeed", "getDirection", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(DDJLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lru/yandex/taxi/logistics/sdk/dto/libraries/gpssignal/definitions/GpsPositionDto;", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GpsPositionDto {
    private final Double accuracy;
    private final Double altitude;
    private final Double direction;
    private final double lat;
    private final double lon;
    private final Double speed;
    private final long timestamp;

    public GpsPositionDto(@Json(name = "lat") double d, @Json(name = "lon") double d2, @Json(name = "timestamp") long j, @Json(name = "accuracy") Double d3, @Json(name = "altitude") Double d4, @Json(name = "speed") Double d5, @Json(name = "direction") Double d6) {
        this.lat = d;
        this.lon = d2;
        this.timestamp = j;
        this.accuracy = d3;
        this.altitude = d4;
        this.speed = d5;
        this.direction = d6;
    }

    public static /* synthetic */ GpsPositionDto copy$default(GpsPositionDto gpsPositionDto, double d, double d2, long j, Double d3, Double d4, Double d5, Double d6, int i, Object obj) {
        if ((i & 1) != 0) {
            d = gpsPositionDto.lat;
        }
        double d7 = d;
        if ((i & 2) != 0) {
            d2 = gpsPositionDto.lon;
        }
        return gpsPositionDto.copy(d7, d2, (i & 4) != 0 ? gpsPositionDto.timestamp : j, (i & 8) != 0 ? gpsPositionDto.accuracy : d3, (i & 16) != 0 ? gpsPositionDto.altitude : d4, (i & 32) != 0 ? gpsPositionDto.speed : d5, (i & 64) != 0 ? gpsPositionDto.direction : d6);
    }

    /* renamed from: component1, reason: from getter */
    public final double getLat() {
        return this.lat;
    }

    /* renamed from: component2, reason: from getter */
    public final double getLon() {
        return this.lon;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component4, reason: from getter */
    public final Double getAccuracy() {
        return this.accuracy;
    }

    /* renamed from: component5, reason: from getter */
    public final Double getAltitude() {
        return this.altitude;
    }

    /* renamed from: component6, reason: from getter */
    public final Double getSpeed() {
        return this.speed;
    }

    /* renamed from: component7, reason: from getter */
    public final Double getDirection() {
        return this.direction;
    }

    public final GpsPositionDto copy(@Json(name = "lat") double lat, @Json(name = "lon") double lon, @Json(name = "timestamp") long timestamp, @Json(name = "accuracy") Double accuracy, @Json(name = "altitude") Double altitude, @Json(name = "speed") Double speed, @Json(name = "direction") Double direction) {
        return new GpsPositionDto(lat, lon, timestamp, accuracy, altitude, speed, direction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GpsPositionDto)) {
            return false;
        }
        GpsPositionDto gpsPositionDto = (GpsPositionDto) other;
        return Double.compare(this.lat, gpsPositionDto.lat) == 0 && Double.compare(this.lon, gpsPositionDto.lon) == 0 && this.timestamp == gpsPositionDto.timestamp && jl40.l(this.accuracy, gpsPositionDto.accuracy) && jl40.l(this.altitude, gpsPositionDto.altitude) && jl40.l(this.speed, gpsPositionDto.speed) && jl40.l(this.direction, gpsPositionDto.direction);
    }

    public final Double getAccuracy() {
        return this.accuracy;
    }

    public final Double getAltitude() {
        return this.altitude;
    }

    public final Double getDirection() {
        return this.direction;
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLon() {
        return this.lon;
    }

    public final Double getSpeed() {
        return this.speed;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int c = qv10.c(unr0.a(Double.hashCode(this.lat) * 31, 31, this.lon), 31, this.timestamp);
        Double d = this.accuracy;
        int hashCode = (c + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.altitude;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.speed;
        int hashCode3 = (hashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.direction;
        return hashCode3 + (d4 != null ? d4.hashCode() : 0);
    }

    public String toString() {
        double d = this.lat;
        double d2 = this.lon;
        long j = this.timestamp;
        Double d3 = this.accuracy;
        Double d4 = this.altitude;
        Double d5 = this.speed;
        Double d6 = this.direction;
        StringBuilder u = oyr.u(d, "GpsPositionDto(lat=", ", lon=");
        u.append(d2);
        x4e.A(j, ", timestamp=", ", accuracy=", u);
        u.append(d3);
        u.append(", altitude=");
        u.append(d4);
        u.append(", speed=");
        u.append(d5);
        u.append(", direction=");
        u.append(d6);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
