package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1clientgeo;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1clientgeo/ClientGeoRequestDto;", "", "geoPosition", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1clientgeo/ClientGeoRequestDto$GeoPositionDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1clientgeo/ClientGeoRequestDto$GeoPositionDto;)V", "getGeoPosition", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1clientgeo/ClientGeoRequestDto$GeoPositionDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "GeoPositionDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ClientGeoRequestDto {
    private final GeoPositionDto geoPosition;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1clientgeo/ClientGeoRequestDto$GeoPositionDto;", "", "accuracy", "", "lat", "lon", ClidProvider.TIMESTAMP, "", "<init>", "(DDDLjava/lang/String;)V", "getAccuracy", "()D", "getLat", "getLon", "getTimestamp", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GeoPositionDto {
        private final double accuracy;
        private final double lat;
        private final double lon;
        private final String timestamp;

        public GeoPositionDto(@Json(name = "accuracy") double d, @Json(name = "lat") double d2, @Json(name = "lon") double d3, @Json(name = "timestamp") String str) {
            this.accuracy = d;
            this.lat = d2;
            this.lon = d3;
            this.timestamp = str;
        }

        public static /* synthetic */ GeoPositionDto copy$default(GeoPositionDto geoPositionDto, double d, double d2, double d3, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                d = geoPositionDto.accuracy;
            }
            double d4 = d;
            if ((i & 2) != 0) {
                d2 = geoPositionDto.lat;
            }
            double d5 = d2;
            if ((i & 4) != 0) {
                d3 = geoPositionDto.lon;
            }
            double d6 = d3;
            if ((i & 8) != 0) {
                str = geoPositionDto.timestamp;
            }
            return geoPositionDto.copy(d4, d5, d6, str);
        }

        /* renamed from: component1, reason: from getter */
        public final double getAccuracy() {
            return this.accuracy;
        }

        /* renamed from: component2, reason: from getter */
        public final double getLat() {
            return this.lat;
        }

        /* renamed from: component3, reason: from getter */
        public final double getLon() {
            return this.lon;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTimestamp() {
            return this.timestamp;
        }

        public final GeoPositionDto copy(@Json(name = "accuracy") double accuracy, @Json(name = "lat") double lat, @Json(name = "lon") double lon, @Json(name = "timestamp") String timestamp) {
            return new GeoPositionDto(accuracy, lat, lon, timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GeoPositionDto)) {
                return false;
            }
            GeoPositionDto geoPositionDto = (GeoPositionDto) other;
            return Double.compare(this.accuracy, geoPositionDto.accuracy) == 0 && Double.compare(this.lat, geoPositionDto.lat) == 0 && Double.compare(this.lon, geoPositionDto.lon) == 0 && jl40.l(this.timestamp, geoPositionDto.timestamp);
        }

        public final double getAccuracy() {
            return this.accuracy;
        }

        public final double getLat() {
            return this.lat;
        }

        public final double getLon() {
            return this.lon;
        }

        public final String getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return this.timestamp.hashCode() + unr0.a(unr0.a(Double.hashCode(this.accuracy) * 31, 31, this.lat), 31, this.lon);
        }

        public String toString() {
            double d = this.accuracy;
            double d2 = this.lat;
            double d3 = this.lon;
            String str = this.timestamp;
            StringBuilder u = oyr.u(d, "GeoPositionDto(accuracy=", ", lat=");
            u.append(d2);
            nzs.o(u, ", lon=", d3, ", timestamp=");
            return oyr.t(u, str, Extension.C_BRAKE);
        }
    }

    public ClientGeoRequestDto(@Json(name = "geo_position") GeoPositionDto geoPositionDto) {
        this.geoPosition = geoPositionDto;
    }

    public static /* synthetic */ ClientGeoRequestDto copy$default(ClientGeoRequestDto clientGeoRequestDto, GeoPositionDto geoPositionDto, int i, Object obj) {
        if ((i & 1) != 0) {
            geoPositionDto = clientGeoRequestDto.geoPosition;
        }
        return clientGeoRequestDto.copy(geoPositionDto);
    }

    /* renamed from: component1, reason: from getter */
    public final GeoPositionDto getGeoPosition() {
        return this.geoPosition;
    }

    public final ClientGeoRequestDto copy(@Json(name = "geo_position") GeoPositionDto geoPosition) {
        return new ClientGeoRequestDto(geoPosition);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ClientGeoRequestDto) && jl40.l(this.geoPosition, ((ClientGeoRequestDto) other).geoPosition);
    }

    public final GeoPositionDto getGeoPosition() {
        return this.geoPosition;
    }

    public int hashCode() {
        return this.geoPosition.hashCode();
    }

    public String toString() {
        return "ClientGeoRequestDto(geoPosition=" + this.geoPosition + Extension.C_BRAKE;
    }
}
