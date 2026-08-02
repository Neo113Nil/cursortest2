package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/DiscountCouponTrailItemDto;", "", "DiscountCouponTrailItem_MissionProgressDto", "Unknown_DiscountCouponTrailItemDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/DiscountCouponTrailItemDto$DiscountCouponTrailItem_MissionProgressDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/DiscountCouponTrailItemDto$Unknown_DiscountCouponTrailItemDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class DiscountCouponTrailItemDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/DiscountCouponTrailItemDto$DiscountCouponTrailItem_MissionProgressDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/DiscountCouponTrailItemDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/MissionProgressTrailItemDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/MissionProgressTrailItemDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/MissionProgressTrailItemDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/DiscountCouponTrailItemDto$DiscountCouponTrailItem_MissionProgressDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DiscountCouponTrailItem_MissionProgressDto extends DiscountCouponTrailItemDto {
        public final String a;
        public final MissionProgressTrailItemDto b;

        public DiscountCouponTrailItem_MissionProgressDto(@Json(name = "type") String str, MissionProgressTrailItemDto missionProgressTrailItemDto) {
            this.a = str;
            this.b = missionProgressTrailItemDto;
        }

        public final DiscountCouponTrailItem_MissionProgressDto copy(@Json(name = "type") String type, MissionProgressTrailItemDto value) {
            return new DiscountCouponTrailItem_MissionProgressDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DiscountCouponTrailItem_MissionProgressDto)) {
                return false;
            }
            DiscountCouponTrailItem_MissionProgressDto discountCouponTrailItem_MissionProgressDto = (DiscountCouponTrailItem_MissionProgressDto) obj;
            return this.a.equals(discountCouponTrailItem_MissionProgressDto.a) && this.b.equals(discountCouponTrailItem_MissionProgressDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DiscountCouponTrailItem_MissionProgressDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/DiscountCouponTrailItemDto$Unknown_DiscountCouponTrailItemDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/DiscountCouponTrailItemDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/DiscountCouponTrailItemDto$Unknown_DiscountCouponTrailItemDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_DiscountCouponTrailItemDto extends DiscountCouponTrailItemDto {
        public final String a;

        public Unknown_DiscountCouponTrailItemDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_DiscountCouponTrailItemDto copy(@Json(name = "type") String type) {
            return new Unknown_DiscountCouponTrailItemDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_DiscountCouponTrailItemDto) && jl40.l(this.a, ((Unknown_DiscountCouponTrailItemDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_DiscountCouponTrailItemDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_DiscountCouponTrailItemDto() {
            this(0);
        }

        public /* synthetic */ Unknown_DiscountCouponTrailItemDto(int i) {
            this("unknown");
        }
    }
}
