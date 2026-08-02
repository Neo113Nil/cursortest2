package ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.api.v1deliverypromotions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.definitions.deliverypromotions.BannerDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0013\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryResponseDto;", "", "banners", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryResponseDto$BannersDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryResponseDto$BannersDto;)V", "getBanners", "()Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryResponseDto$BannersDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "BannersDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DeliveryResponseDto {
    private final BannersDto banners;

    public DeliveryResponseDto(@Json(name = "banners") BannersDto bannersDto) {
        this.banners = bannersDto;
    }

    public static /* synthetic */ DeliveryResponseDto copy$default(DeliveryResponseDto deliveryResponseDto, BannersDto bannersDto, int i, Object obj) {
        if ((i & 1) != 0) {
            bannersDto = deliveryResponseDto.banners;
        }
        return deliveryResponseDto.copy(bannersDto);
    }

    /* renamed from: component1, reason: from getter */
    public final BannersDto getBanners() {
        return this.banners;
    }

    public final DeliveryResponseDto copy(@Json(name = "banners") BannersDto banners) {
        return new DeliveryResponseDto(banners);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeliveryResponseDto) && jl40.l(this.banners, ((DeliveryResponseDto) other).banners);
    }

    public final BannersDto getBanners() {
        return this.banners;
    }

    public int hashCode() {
        BannersDto bannersDto = this.banners;
        if (bannersDto == null) {
            return 0;
        }
        return bannersDto.hashCode();
    }

    public String toString() {
        return "DeliveryResponseDto(banners=" + this.banners + Extension.C_BRAKE;
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryResponseDto$BannersDto;", "", "bannerList", "", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/BannerDto;", "autoscrollEnabled", "", "<init>", "(Ljava/util/List;Z)V", "getBannerList", "()Ljava/util/List;", "getAutoscrollEnabled", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BannersDto {
        private final boolean autoscrollEnabled;
        private final List<BannerDto> bannerList;

        public /* synthetic */ BannersDto(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? false : z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BannersDto copy$default(BannersDto bannersDto, List list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                list = bannersDto.bannerList;
            }
            if ((i & 2) != 0) {
                z = bannersDto.autoscrollEnabled;
            }
            return bannersDto.copy(list, z);
        }

        public final List<BannerDto> component1() {
            return this.bannerList;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getAutoscrollEnabled() {
            return this.autoscrollEnabled;
        }

        public final BannersDto copy(@Json(name = "banner_list") List<BannerDto> bannerList, @Json(name = "autoscroll_enabled") boolean autoscrollEnabled) {
            return new BannersDto(bannerList, autoscrollEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BannersDto)) {
                return false;
            }
            BannersDto bannersDto = (BannersDto) other;
            return jl40.l(this.bannerList, bannersDto.bannerList) && this.autoscrollEnabled == bannersDto.autoscrollEnabled;
        }

        public final boolean getAutoscrollEnabled() {
            return this.autoscrollEnabled;
        }

        public final List<BannerDto> getBannerList() {
            return this.bannerList;
        }

        public int hashCode() {
            return Boolean.hashCode(this.autoscrollEnabled) + (this.bannerList.hashCode() * 31);
        }

        public String toString() {
            return xvz.o(this.bannerList, "BannersDto(bannerList=", ", autoscrollEnabled=", Extension.C_BRAKE, this.autoscrollEnabled);
        }

        public BannersDto(@Json(name = "banner_list") List<BannerDto> list, @Json(name = "autoscroll_enabled") boolean z) {
            this.bannerList = list;
            this.autoscrollEnabled = z;
        }
    }
}
