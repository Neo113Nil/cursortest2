package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineIconDto;", "", "DynamicSearchTimelineIcon_TagDto", "DynamicSearchTimelineIcon_LottieDto", "Unknown_DynamicSearchTimelineIconDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineIconDto$DynamicSearchTimelineIcon_LottieDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineIconDto$DynamicSearchTimelineIcon_TagDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineIconDto$Unknown_DynamicSearchTimelineIconDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class DynamicSearchTimelineIconDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineIconDto$DynamicSearchTimelineIcon_LottieDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineIconDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineIconLottieDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineIconLottieDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineIconLottieDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineIconDto$DynamicSearchTimelineIcon_LottieDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DynamicSearchTimelineIcon_LottieDto extends DynamicSearchTimelineIconDto {
        public final String a;
        public final DynamicSearchTimelineIconLottieDto b;

        public DynamicSearchTimelineIcon_LottieDto(@Json(name = "type") String str, DynamicSearchTimelineIconLottieDto dynamicSearchTimelineIconLottieDto) {
            this.a = str;
            this.b = dynamicSearchTimelineIconLottieDto;
        }

        public final DynamicSearchTimelineIcon_LottieDto copy(@Json(name = "type") String type, DynamicSearchTimelineIconLottieDto value) {
            return new DynamicSearchTimelineIcon_LottieDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DynamicSearchTimelineIcon_LottieDto)) {
                return false;
            }
            DynamicSearchTimelineIcon_LottieDto dynamicSearchTimelineIcon_LottieDto = (DynamicSearchTimelineIcon_LottieDto) obj;
            return this.a.equals(dynamicSearchTimelineIcon_LottieDto.a) && this.b.equals(dynamicSearchTimelineIcon_LottieDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DynamicSearchTimelineIcon_LottieDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineIconDto$DynamicSearchTimelineIcon_TagDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineIconDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineIconTagDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineIconTagDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineIconTagDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineIconDto$DynamicSearchTimelineIcon_TagDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DynamicSearchTimelineIcon_TagDto extends DynamicSearchTimelineIconDto {
        public final String a;
        public final DynamicSearchTimelineIconTagDto b;

        public DynamicSearchTimelineIcon_TagDto(@Json(name = "type") String str, DynamicSearchTimelineIconTagDto dynamicSearchTimelineIconTagDto) {
            this.a = str;
            this.b = dynamicSearchTimelineIconTagDto;
        }

        public final DynamicSearchTimelineIcon_TagDto copy(@Json(name = "type") String type, DynamicSearchTimelineIconTagDto value) {
            return new DynamicSearchTimelineIcon_TagDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DynamicSearchTimelineIcon_TagDto)) {
                return false;
            }
            DynamicSearchTimelineIcon_TagDto dynamicSearchTimelineIcon_TagDto = (DynamicSearchTimelineIcon_TagDto) obj;
            return this.a.equals(dynamicSearchTimelineIcon_TagDto.a) && this.b.equals(dynamicSearchTimelineIcon_TagDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DynamicSearchTimelineIcon_TagDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineIconDto$Unknown_DynamicSearchTimelineIconDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineIconDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineIconDto$Unknown_DynamicSearchTimelineIconDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_DynamicSearchTimelineIconDto extends DynamicSearchTimelineIconDto {
        public final String a;

        public Unknown_DynamicSearchTimelineIconDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_DynamicSearchTimelineIconDto copy(@Json(name = "type") String type) {
            return new Unknown_DynamicSearchTimelineIconDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_DynamicSearchTimelineIconDto) && jl40.l(this.a, ((Unknown_DynamicSearchTimelineIconDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_DynamicSearchTimelineIconDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_DynamicSearchTimelineIconDto() {
            this(0);
        }

        public /* synthetic */ Unknown_DynamicSearchTimelineIconDto(int i) {
            this("unknown");
        }
    }
}
