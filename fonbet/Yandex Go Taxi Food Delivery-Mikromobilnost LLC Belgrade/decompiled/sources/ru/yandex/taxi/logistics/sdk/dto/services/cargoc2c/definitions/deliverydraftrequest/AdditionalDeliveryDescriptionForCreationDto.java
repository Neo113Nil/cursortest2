package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverydraftrequest;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oyr;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.BuyoutInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.CostCenterDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.DefaultUserTipsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.OrderCreationFlowDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PackageInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PaymentInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PhotoInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PostcardSourceInfoDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B½\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u0016\b\u0001\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0005j\u0004\u0018\u0001`\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u00106\u001a\u00020\u0003HÆ\u0003J\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010:\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010?\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010@\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u0017\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0005j\u0004\u0018\u0001`\u001cHÆ\u0003JÄ\u0001\u0010C\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0016\b\u0003\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0005j\u0004\u0018\u0001`\u001cHÆ\u0001¢\u0006\u0002\u0010DJ\u0013\u0010E\u001a\u00020\u00142\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020HHÖ\u0001J\t\u0010I\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u0010/\u001a\u0004\b0\u0010.R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001f\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0005j\u0004\u0018\u0001`\u001c¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\"¨\u0006J"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverydraftrequest/AdditionalDeliveryDescriptionForCreationDto;", "", "paymentInfo", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PaymentInfoDto;", "costCenters", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/CostCenterDto;", "routePoints", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverydraftrequest/DraftPointDto;", "comment", "", "commentImages", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PhotoInfoDto;", "postcard", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PostcardSourceInfoDto;", "tips", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/DefaultUserTipsDto;", "buyoutInfo", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/BuyoutInfoDto;", "clickDelivery", "", "v2UdpFlow", "packageInfo", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PackageInfoDto;", "orderCreationFlow", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/OrderCreationFlowDto;", "userCurrentLocation", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/CoordinatesDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PaymentInfoDto;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PostcardSourceInfoDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/DefaultUserTipsDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/BuyoutInfoDto;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PackageInfoDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/OrderCreationFlowDto;Ljava/util/List;)V", "getPaymentInfo", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PaymentInfoDto;", "getCostCenters", "()Ljava/util/List;", "getRoutePoints", "getComment", "()Ljava/lang/String;", "getCommentImages", "getPostcard", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PostcardSourceInfoDto;", "getTips", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/DefaultUserTipsDto;", "getBuyoutInfo", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/BuyoutInfoDto;", "getClickDelivery", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getV2UdpFlow", "getPackageInfo", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PackageInfoDto;", "getOrderCreationFlow", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/OrderCreationFlowDto;", "getUserCurrentLocation", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PaymentInfoDto;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PostcardSourceInfoDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/DefaultUserTipsDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/BuyoutInfoDto;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PackageInfoDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/OrderCreationFlowDto;Ljava/util/List;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverydraftrequest/AdditionalDeliveryDescriptionForCreationDto;", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AdditionalDeliveryDescriptionForCreationDto {
    private final BuyoutInfoDto buyoutInfo;
    private final Boolean clickDelivery;
    private final String comment;
    private final List<PhotoInfoDto> commentImages;
    private final List<CostCenterDto> costCenters;
    private final OrderCreationFlowDto orderCreationFlow;
    private final PackageInfoDto packageInfo;
    private final PaymentInfoDto paymentInfo;
    private final PostcardSourceInfoDto postcard;
    private final List<DraftPointDto> routePoints;
    private final DefaultUserTipsDto tips;
    private final List<Double> userCurrentLocation;
    private final Boolean v2UdpFlow;

    public AdditionalDeliveryDescriptionForCreationDto(@Json(name = "payment_info") PaymentInfoDto paymentInfoDto, @Json(name = "cost_centers") List<CostCenterDto> list, @Json(name = "route_points") List<DraftPointDto> list2, @Json(name = "comment") String str, @Json(name = "comment_images") List<PhotoInfoDto> list3, @Json(name = "postcard") PostcardSourceInfoDto postcardSourceInfoDto, @Json(name = "tips") DefaultUserTipsDto defaultUserTipsDto, @Json(name = "buyout_info") BuyoutInfoDto buyoutInfoDto, @Json(name = "click_delivery") Boolean bool, @Json(name = "v2_udp_flow") Boolean bool2, @Json(name = "package_info") PackageInfoDto packageInfoDto, @Json(name = "order_creation_flow") OrderCreationFlowDto orderCreationFlowDto, @Json(name = "user_current_location") List<Double> list4) {
        this.paymentInfo = paymentInfoDto;
        this.costCenters = list;
        this.routePoints = list2;
        this.comment = str;
        this.commentImages = list3;
        this.postcard = postcardSourceInfoDto;
        this.tips = defaultUserTipsDto;
        this.buyoutInfo = buyoutInfoDto;
        this.clickDelivery = bool;
        this.v2UdpFlow = bool2;
        this.packageInfo = packageInfoDto;
        this.orderCreationFlow = orderCreationFlowDto;
        this.userCurrentLocation = list4;
    }

    public static /* synthetic */ AdditionalDeliveryDescriptionForCreationDto copy$default(AdditionalDeliveryDescriptionForCreationDto additionalDeliveryDescriptionForCreationDto, PaymentInfoDto paymentInfoDto, List list, List list2, String str, List list3, PostcardSourceInfoDto postcardSourceInfoDto, DefaultUserTipsDto defaultUserTipsDto, BuyoutInfoDto buyoutInfoDto, Boolean bool, Boolean bool2, PackageInfoDto packageInfoDto, OrderCreationFlowDto orderCreationFlowDto, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentInfoDto = additionalDeliveryDescriptionForCreationDto.paymentInfo;
        }
        return additionalDeliveryDescriptionForCreationDto.copy(paymentInfoDto, (i & 2) != 0 ? additionalDeliveryDescriptionForCreationDto.costCenters : list, (i & 4) != 0 ? additionalDeliveryDescriptionForCreationDto.routePoints : list2, (i & 8) != 0 ? additionalDeliveryDescriptionForCreationDto.comment : str, (i & 16) != 0 ? additionalDeliveryDescriptionForCreationDto.commentImages : list3, (i & 32) != 0 ? additionalDeliveryDescriptionForCreationDto.postcard : postcardSourceInfoDto, (i & 64) != 0 ? additionalDeliveryDescriptionForCreationDto.tips : defaultUserTipsDto, (i & 128) != 0 ? additionalDeliveryDescriptionForCreationDto.buyoutInfo : buyoutInfoDto, (i & 256) != 0 ? additionalDeliveryDescriptionForCreationDto.clickDelivery : bool, (i & 512) != 0 ? additionalDeliveryDescriptionForCreationDto.v2UdpFlow : bool2, (i & 1024) != 0 ? additionalDeliveryDescriptionForCreationDto.packageInfo : packageInfoDto, (i & 2048) != 0 ? additionalDeliveryDescriptionForCreationDto.orderCreationFlow : orderCreationFlowDto, (i & 4096) != 0 ? additionalDeliveryDescriptionForCreationDto.userCurrentLocation : list4);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentInfoDto getPaymentInfo() {
        return this.paymentInfo;
    }

    /* renamed from: component10, reason: from getter */
    public final Boolean getV2UdpFlow() {
        return this.v2UdpFlow;
    }

    /* renamed from: component11, reason: from getter */
    public final PackageInfoDto getPackageInfo() {
        return this.packageInfo;
    }

    /* renamed from: component12, reason: from getter */
    public final OrderCreationFlowDto getOrderCreationFlow() {
        return this.orderCreationFlow;
    }

    public final List<Double> component13() {
        return this.userCurrentLocation;
    }

    public final List<CostCenterDto> component2() {
        return this.costCenters;
    }

    public final List<DraftPointDto> component3() {
        return this.routePoints;
    }

    /* renamed from: component4, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    public final List<PhotoInfoDto> component5() {
        return this.commentImages;
    }

    /* renamed from: component6, reason: from getter */
    public final PostcardSourceInfoDto getPostcard() {
        return this.postcard;
    }

    /* renamed from: component7, reason: from getter */
    public final DefaultUserTipsDto getTips() {
        return this.tips;
    }

    /* renamed from: component8, reason: from getter */
    public final BuyoutInfoDto getBuyoutInfo() {
        return this.buyoutInfo;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getClickDelivery() {
        return this.clickDelivery;
    }

    public final AdditionalDeliveryDescriptionForCreationDto copy(@Json(name = "payment_info") PaymentInfoDto paymentInfo, @Json(name = "cost_centers") List<CostCenterDto> costCenters, @Json(name = "route_points") List<DraftPointDto> routePoints, @Json(name = "comment") String comment, @Json(name = "comment_images") List<PhotoInfoDto> commentImages, @Json(name = "postcard") PostcardSourceInfoDto postcard, @Json(name = "tips") DefaultUserTipsDto tips, @Json(name = "buyout_info") BuyoutInfoDto buyoutInfo, @Json(name = "click_delivery") Boolean clickDelivery, @Json(name = "v2_udp_flow") Boolean v2UdpFlow, @Json(name = "package_info") PackageInfoDto packageInfo, @Json(name = "order_creation_flow") OrderCreationFlowDto orderCreationFlow, @Json(name = "user_current_location") List<Double> userCurrentLocation) {
        return new AdditionalDeliveryDescriptionForCreationDto(paymentInfo, costCenters, routePoints, comment, commentImages, postcard, tips, buyoutInfo, clickDelivery, v2UdpFlow, packageInfo, orderCreationFlow, userCurrentLocation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalDeliveryDescriptionForCreationDto)) {
            return false;
        }
        AdditionalDeliveryDescriptionForCreationDto additionalDeliveryDescriptionForCreationDto = (AdditionalDeliveryDescriptionForCreationDto) other;
        return jl40.l(this.paymentInfo, additionalDeliveryDescriptionForCreationDto.paymentInfo) && jl40.l(this.costCenters, additionalDeliveryDescriptionForCreationDto.costCenters) && jl40.l(this.routePoints, additionalDeliveryDescriptionForCreationDto.routePoints) && jl40.l(this.comment, additionalDeliveryDescriptionForCreationDto.comment) && jl40.l(this.commentImages, additionalDeliveryDescriptionForCreationDto.commentImages) && jl40.l(this.postcard, additionalDeliveryDescriptionForCreationDto.postcard) && jl40.l(this.tips, additionalDeliveryDescriptionForCreationDto.tips) && jl40.l(this.buyoutInfo, additionalDeliveryDescriptionForCreationDto.buyoutInfo) && jl40.l(this.clickDelivery, additionalDeliveryDescriptionForCreationDto.clickDelivery) && jl40.l(this.v2UdpFlow, additionalDeliveryDescriptionForCreationDto.v2UdpFlow) && jl40.l(this.packageInfo, additionalDeliveryDescriptionForCreationDto.packageInfo) && jl40.l(this.orderCreationFlow, additionalDeliveryDescriptionForCreationDto.orderCreationFlow) && jl40.l(this.userCurrentLocation, additionalDeliveryDescriptionForCreationDto.userCurrentLocation);
    }

    public final BuyoutInfoDto getBuyoutInfo() {
        return this.buyoutInfo;
    }

    public final Boolean getClickDelivery() {
        return this.clickDelivery;
    }

    public final String getComment() {
        return this.comment;
    }

    public final List<PhotoInfoDto> getCommentImages() {
        return this.commentImages;
    }

    public final List<CostCenterDto> getCostCenters() {
        return this.costCenters;
    }

    public final OrderCreationFlowDto getOrderCreationFlow() {
        return this.orderCreationFlow;
    }

    public final PackageInfoDto getPackageInfo() {
        return this.packageInfo;
    }

    public final PaymentInfoDto getPaymentInfo() {
        return this.paymentInfo;
    }

    public final PostcardSourceInfoDto getPostcard() {
        return this.postcard;
    }

    public final List<DraftPointDto> getRoutePoints() {
        return this.routePoints;
    }

    public final DefaultUserTipsDto getTips() {
        return this.tips;
    }

    public final List<Double> getUserCurrentLocation() {
        return this.userCurrentLocation;
    }

    public final Boolean getV2UdpFlow() {
        return this.v2UdpFlow;
    }

    public int hashCode() {
        int hashCode = this.paymentInfo.hashCode() * 31;
        List<CostCenterDto> list = this.costCenters;
        int c = unr0.c((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.routePoints);
        String str = this.comment;
        int hashCode2 = (c + (str == null ? 0 : str.hashCode())) * 31;
        List<PhotoInfoDto> list2 = this.commentImages;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        PostcardSourceInfoDto postcardSourceInfoDto = this.postcard;
        int hashCode4 = (hashCode3 + (postcardSourceInfoDto == null ? 0 : postcardSourceInfoDto.hashCode())) * 31;
        DefaultUserTipsDto defaultUserTipsDto = this.tips;
        int hashCode5 = (hashCode4 + (defaultUserTipsDto == null ? 0 : defaultUserTipsDto.hashCode())) * 31;
        BuyoutInfoDto buyoutInfoDto = this.buyoutInfo;
        int hashCode6 = (hashCode5 + (buyoutInfoDto == null ? 0 : buyoutInfoDto.hashCode())) * 31;
        Boolean bool = this.clickDelivery;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.v2UdpFlow;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        PackageInfoDto packageInfoDto = this.packageInfo;
        int hashCode9 = (hashCode8 + (packageInfoDto == null ? 0 : packageInfoDto.hashCode())) * 31;
        OrderCreationFlowDto orderCreationFlowDto = this.orderCreationFlow;
        int hashCode10 = (hashCode9 + (orderCreationFlowDto == null ? 0 : orderCreationFlowDto.hashCode())) * 31;
        List<Double> list3 = this.userCurrentLocation;
        return hashCode10 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        PaymentInfoDto paymentInfoDto = this.paymentInfo;
        List<CostCenterDto> list = this.costCenters;
        List<DraftPointDto> list2 = this.routePoints;
        String str = this.comment;
        List<PhotoInfoDto> list3 = this.commentImages;
        PostcardSourceInfoDto postcardSourceInfoDto = this.postcard;
        DefaultUserTipsDto defaultUserTipsDto = this.tips;
        BuyoutInfoDto buyoutInfoDto = this.buyoutInfo;
        Boolean bool = this.clickDelivery;
        Boolean bool2 = this.v2UdpFlow;
        PackageInfoDto packageInfoDto = this.packageInfo;
        OrderCreationFlowDto orderCreationFlowDto = this.orderCreationFlow;
        List<Double> list4 = this.userCurrentLocation;
        StringBuilder sb = new StringBuilder("AdditionalDeliveryDescriptionForCreationDto(paymentInfo=");
        sb.append(paymentInfoDto);
        sb.append(", costCenters=");
        sb.append(list);
        sb.append(", routePoints=");
        oyr.D(", comment=", str, ", commentImages=", sb, list2);
        sb.append(list3);
        sb.append(", postcard=");
        sb.append(postcardSourceInfoDto);
        sb.append(", tips=");
        sb.append(defaultUserTipsDto);
        sb.append(", buyoutInfo=");
        sb.append(buyoutInfoDto);
        sb.append(", clickDelivery=");
        sb.append(bool);
        sb.append(", v2UdpFlow=");
        sb.append(bool2);
        sb.append(", packageInfo=");
        sb.append(packageInfoDto);
        sb.append(", orderCreationFlow=");
        sb.append(orderCreationFlowDto);
        sb.append(", userCurrentLocation=");
        return ly3.s(sb, list4, Extension.C_BRAKE);
    }
}
