package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineDto;", "", "DynamicSearchTimeline_AnimatablesDto", "DynamicSearchTimeline_IdleDto", "Unknown_DynamicSearchTimelineDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineDto$DynamicSearchTimeline_AnimatablesDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineDto$DynamicSearchTimeline_IdleDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineDto$Unknown_DynamicSearchTimelineDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class DynamicSearchTimelineDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineDto$DynamicSearchTimeline_AnimatablesDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineAnimatablesDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineAnimatablesDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineAnimatablesDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineDto$DynamicSearchTimeline_AnimatablesDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DynamicSearchTimeline_AnimatablesDto extends DynamicSearchTimelineDto {
        public final String a;
        public final DynamicSearchTimelineAnimatablesDto b;

        public DynamicSearchTimeline_AnimatablesDto(@Json(name = "type") String str, DynamicSearchTimelineAnimatablesDto dynamicSearchTimelineAnimatablesDto) {
            this.a = str;
            this.b = dynamicSearchTimelineAnimatablesDto;
        }

        public final DynamicSearchTimeline_AnimatablesDto copy(@Json(name = "type") String type, DynamicSearchTimelineAnimatablesDto value) {
            return new DynamicSearchTimeline_AnimatablesDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DynamicSearchTimeline_AnimatablesDto)) {
                return false;
            }
            DynamicSearchTimeline_AnimatablesDto dynamicSearchTimeline_AnimatablesDto = (DynamicSearchTimeline_AnimatablesDto) obj;
            return this.a.equals(dynamicSearchTimeline_AnimatablesDto.a) && this.b.equals(dynamicSearchTimeline_AnimatablesDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DynamicSearchTimeline_AnimatablesDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineDto$DynamicSearchTimeline_IdleDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineIdleDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineIdleDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineIdleDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineDto$DynamicSearchTimeline_IdleDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DynamicSearchTimeline_IdleDto extends DynamicSearchTimelineDto {
        public final String a;
        public final DynamicSearchTimelineIdleDto b;

        public DynamicSearchTimeline_IdleDto(@Json(name = "type") String str, DynamicSearchTimelineIdleDto dynamicSearchTimelineIdleDto) {
            this.a = str;
            this.b = dynamicSearchTimelineIdleDto;
        }

        public final DynamicSearchTimeline_IdleDto copy(@Json(name = "type") String type, DynamicSearchTimelineIdleDto value) {
            return new DynamicSearchTimeline_IdleDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DynamicSearchTimeline_IdleDto)) {
                return false;
            }
            DynamicSearchTimeline_IdleDto dynamicSearchTimeline_IdleDto = (DynamicSearchTimeline_IdleDto) obj;
            return this.a.equals(dynamicSearchTimeline_IdleDto.a) && this.b.equals(dynamicSearchTimeline_IdleDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DynamicSearchTimeline_IdleDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineDto$Unknown_DynamicSearchTimelineDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineDto$Unknown_DynamicSearchTimelineDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_DynamicSearchTimelineDto extends DynamicSearchTimelineDto {
        public final String a;

        public Unknown_DynamicSearchTimelineDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_DynamicSearchTimelineDto copy(@Json(name = "type") String type) {
            return new Unknown_DynamicSearchTimelineDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_DynamicSearchTimelineDto) && jl40.l(this.a, ((Unknown_DynamicSearchTimelineDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_DynamicSearchTimelineDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_DynamicSearchTimelineDto() {
            this(0);
        }

        public /* synthetic */ Unknown_DynamicSearchTimelineDto(int i) {
            this("unknown");
        }
    }
}
