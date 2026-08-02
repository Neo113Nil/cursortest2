package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/MapAnimationDto;", "", "MapAnimation_CirclesPulsarDto", "Unknown_MapAnimationDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/MapAnimationDto$MapAnimation_CirclesPulsarDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/MapAnimationDto$Unknown_MapAnimationDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class MapAnimationDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/MapAnimationDto$MapAnimation_CirclesPulsarDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/MapAnimationDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/CirclesPulsarDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/CirclesPulsarDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/CirclesPulsarDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/MapAnimationDto$MapAnimation_CirclesPulsarDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MapAnimation_CirclesPulsarDto extends MapAnimationDto {
        public final String a;
        public final CirclesPulsarDto b;

        public MapAnimation_CirclesPulsarDto(@Json(name = "type") String str, CirclesPulsarDto circlesPulsarDto) {
            this.a = str;
            this.b = circlesPulsarDto;
        }

        public final MapAnimation_CirclesPulsarDto copy(@Json(name = "type") String type, CirclesPulsarDto value) {
            return new MapAnimation_CirclesPulsarDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MapAnimation_CirclesPulsarDto) {
                MapAnimation_CirclesPulsarDto mapAnimation_CirclesPulsarDto = (MapAnimation_CirclesPulsarDto) obj;
                return this.a.equals(mapAnimation_CirclesPulsarDto.a) && this.b == mapAnimation_CirclesPulsarDto.b;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "MapAnimation_CirclesPulsarDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/MapAnimationDto$Unknown_MapAnimationDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/MapAnimationDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/MapAnimationDto$Unknown_MapAnimationDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_MapAnimationDto extends MapAnimationDto {
        public final String a;

        public Unknown_MapAnimationDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_MapAnimationDto copy(@Json(name = "type") String type) {
            return new Unknown_MapAnimationDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_MapAnimationDto) && jl40.l(this.a, ((Unknown_MapAnimationDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_MapAnimationDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_MapAnimationDto() {
            this(0);
        }

        public /* synthetic */ Unknown_MapAnimationDto(int i) {
            this("unknown");
        }
    }
}
