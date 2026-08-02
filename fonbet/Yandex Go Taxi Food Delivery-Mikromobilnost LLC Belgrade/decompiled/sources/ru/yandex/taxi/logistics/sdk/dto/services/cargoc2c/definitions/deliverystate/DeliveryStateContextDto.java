package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handlersdefinitions.DisplayTargetsItemDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002STBÛ\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0012\b\u0001\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u0010\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010?\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010#J\u0013\u0010B\u001a\f\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u0010HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010E\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010J\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u001dHÆ\u0003Jâ\u0001\u0010L\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00052\u0012\b\u0003\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u00102\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÆ\u0001¢\u0006\u0002\u0010MJ\u0013\u0010N\u001a\u00020\u00052\b\u0010O\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010P\u001a\u00020QHÖ\u0001J\t\u0010R\u001a\u00020\u000bHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\u0004\u0010#R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010$\u001a\u0004\b%\u0010#R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010$\u001a\u0004\b&\u0010#R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010$\u001a\u0004\b+\u0010#R\u001b\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u0010¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010$\u001a\u0004\b0\u0010#R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b1\u0010*R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b2\u0010*R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b3\u0010*R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010$\u001a\u0004\b6\u0010#R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:¨\u0006U"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeliveryStateContextDto;", "", "serverTime", "", "isPerformerPositionAvailable", "", "presentAsCompleted", "shouldTrackGeo", "performerSearch", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeliveryStateContextDto$PerformerSearchDto;", "originalOrderId", "", "restorePreorder", "displayTargets", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/DisplayTargetsItemDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/DisplayTargetsDto;", "objectsOverMapSettings", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/ObjectsOverMapSettingsDto;", "shimmering", "providerStatus", "providerTariffClass", "role", "flexSection", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeliveryStateContextDto$FlexSectionDto;", "promotionBannersEnabled", "trackingPopup", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/TrackingPopupDto;", "adsBanner", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AdsBannerDto;", "<init>", "(Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeliveryStateContextDto$PerformerSearchDto;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/ObjectsOverMapSettingsDto;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeliveryStateContextDto$FlexSectionDto;Ljava/lang/Boolean;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/TrackingPopupDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AdsBannerDto;)V", "getServerTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPresentAsCompleted", "getShouldTrackGeo", "getPerformerSearch", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeliveryStateContextDto$PerformerSearchDto;", "getOriginalOrderId", "()Ljava/lang/String;", "getRestorePreorder", "getDisplayTargets", "()Ljava/util/List;", "getObjectsOverMapSettings", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/ObjectsOverMapSettingsDto;", "getShimmering", "getProviderStatus", "getProviderTariffClass", "getRole", "getFlexSection", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeliveryStateContextDto$FlexSectionDto;", "getPromotionBannersEnabled", "getTrackingPopup", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/TrackingPopupDto;", "getAdsBanner", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AdsBannerDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeliveryStateContextDto$PerformerSearchDto;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/ObjectsOverMapSettingsDto;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeliveryStateContextDto$FlexSectionDto;Ljava/lang/Boolean;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/TrackingPopupDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AdsBannerDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeliveryStateContextDto;", "equals", "other", "hashCode", "", "toString", "PerformerSearchDto", "FlexSectionDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DeliveryStateContextDto {
    private final AdsBannerDto adsBanner;
    private final List<DisplayTargetsItemDto> displayTargets;
    private final FlexSectionDto flexSection;
    private final Boolean isPerformerPositionAvailable;
    private final ObjectsOverMapSettingsDto objectsOverMapSettings;
    private final String originalOrderId;
    private final PerformerSearchDto performerSearch;
    private final Boolean presentAsCompleted;
    private final Boolean promotionBannersEnabled;
    private final String providerStatus;
    private final String providerTariffClass;
    private final Boolean restorePreorder;
    private final String role;
    private final Long serverTime;
    private final Boolean shimmering;
    private final Boolean shouldTrackGeo;
    private final TrackingPopupDto trackingPopup;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeliveryStateContextDto$FlexSectionDto;", "", "contentUrl", "", "<init>", "(Ljava/lang/String;)V", "getContentUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FlexSectionDto {
        private final String contentUrl;

        public FlexSectionDto(@Json(name = "content_url") String str) {
            this.contentUrl = str;
        }

        public static /* synthetic */ FlexSectionDto copy$default(FlexSectionDto flexSectionDto, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = flexSectionDto.contentUrl;
            }
            return flexSectionDto.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getContentUrl() {
            return this.contentUrl;
        }

        public final FlexSectionDto copy(@Json(name = "content_url") String contentUrl) {
            return new FlexSectionDto(contentUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FlexSectionDto) && jl40.l(this.contentUrl, ((FlexSectionDto) other).contentUrl);
        }

        public final String getContentUrl() {
            return this.contentUrl;
        }

        public int hashCode() {
            String str = this.contentUrl;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return oyr.p("FlexSectionDto(contentUrl=", this.contentUrl, Extension.C_BRAKE);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003JN\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeliveryStateContextDto$PerformerSearchDto;", "", "isInProgress", "", "estimate", "", "dynamicSearchStatuses", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchStatusDto;", "mapAnimation", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/MapAnimationDto;", "dynamicSearchTimeline", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineDto;", "<init>", "(ZLjava/lang/Long;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/MapAnimationDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineDto;)V", "()Z", "getEstimate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDynamicSearchStatuses", "()Ljava/util/List;", "getMapAnimation", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/MapAnimationDto;", "getDynamicSearchTimeline", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineDto;", "component1", "component2", "component3", "component4", "component5", "copy", "(ZLjava/lang/Long;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/MapAnimationDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeliveryStateContextDto$PerformerSearchDto;", "equals", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PerformerSearchDto {
        private final List<DynamicSearchStatusDto> dynamicSearchStatuses;
        private final DynamicSearchTimelineDto dynamicSearchTimeline;
        private final Long estimate;
        private final boolean isInProgress;
        private final MapAnimationDto mapAnimation;

        public PerformerSearchDto(@Json(name = "is_in_progress") boolean z, @Json(name = "estimate") Long l, @Json(name = "dynamic_search_statuses") List<DynamicSearchStatusDto> list, @Json(name = "map_animation") MapAnimationDto mapAnimationDto, @Json(name = "dynamic_search_timeline") DynamicSearchTimelineDto dynamicSearchTimelineDto) {
            this.isInProgress = z;
            this.estimate = l;
            this.dynamicSearchStatuses = list;
            this.mapAnimation = mapAnimationDto;
            this.dynamicSearchTimeline = dynamicSearchTimelineDto;
        }

        public static /* synthetic */ PerformerSearchDto copy$default(PerformerSearchDto performerSearchDto, boolean z, Long l, List list, MapAnimationDto mapAnimationDto, DynamicSearchTimelineDto dynamicSearchTimelineDto, int i, Object obj) {
            if ((i & 1) != 0) {
                z = performerSearchDto.isInProgress;
            }
            if ((i & 2) != 0) {
                l = performerSearchDto.estimate;
            }
            if ((i & 4) != 0) {
                list = performerSearchDto.dynamicSearchStatuses;
            }
            if ((i & 8) != 0) {
                mapAnimationDto = performerSearchDto.mapAnimation;
            }
            if ((i & 16) != 0) {
                dynamicSearchTimelineDto = performerSearchDto.dynamicSearchTimeline;
            }
            DynamicSearchTimelineDto dynamicSearchTimelineDto2 = dynamicSearchTimelineDto;
            List list2 = list;
            return performerSearchDto.copy(z, l, list2, mapAnimationDto, dynamicSearchTimelineDto2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsInProgress() {
            return this.isInProgress;
        }

        /* renamed from: component2, reason: from getter */
        public final Long getEstimate() {
            return this.estimate;
        }

        public final List<DynamicSearchStatusDto> component3() {
            return this.dynamicSearchStatuses;
        }

        /* renamed from: component4, reason: from getter */
        public final MapAnimationDto getMapAnimation() {
            return this.mapAnimation;
        }

        /* renamed from: component5, reason: from getter */
        public final DynamicSearchTimelineDto getDynamicSearchTimeline() {
            return this.dynamicSearchTimeline;
        }

        public final PerformerSearchDto copy(@Json(name = "is_in_progress") boolean isInProgress, @Json(name = "estimate") Long estimate, @Json(name = "dynamic_search_statuses") List<DynamicSearchStatusDto> dynamicSearchStatuses, @Json(name = "map_animation") MapAnimationDto mapAnimation, @Json(name = "dynamic_search_timeline") DynamicSearchTimelineDto dynamicSearchTimeline) {
            return new PerformerSearchDto(isInProgress, estimate, dynamicSearchStatuses, mapAnimation, dynamicSearchTimeline);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PerformerSearchDto)) {
                return false;
            }
            PerformerSearchDto performerSearchDto = (PerformerSearchDto) other;
            return this.isInProgress == performerSearchDto.isInProgress && jl40.l(this.estimate, performerSearchDto.estimate) && jl40.l(this.dynamicSearchStatuses, performerSearchDto.dynamicSearchStatuses) && jl40.l(this.mapAnimation, performerSearchDto.mapAnimation) && jl40.l(this.dynamicSearchTimeline, performerSearchDto.dynamicSearchTimeline);
        }

        public final List<DynamicSearchStatusDto> getDynamicSearchStatuses() {
            return this.dynamicSearchStatuses;
        }

        public final DynamicSearchTimelineDto getDynamicSearchTimeline() {
            return this.dynamicSearchTimeline;
        }

        public final Long getEstimate() {
            return this.estimate;
        }

        public final MapAnimationDto getMapAnimation() {
            return this.mapAnimation;
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.isInProgress) * 31;
            Long l = this.estimate;
            int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
            List<DynamicSearchStatusDto> list = this.dynamicSearchStatuses;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            MapAnimationDto mapAnimationDto = this.mapAnimation;
            int hashCode4 = (hashCode3 + (mapAnimationDto == null ? 0 : mapAnimationDto.hashCode())) * 31;
            DynamicSearchTimelineDto dynamicSearchTimelineDto = this.dynamicSearchTimeline;
            return hashCode4 + (dynamicSearchTimelineDto != null ? dynamicSearchTimelineDto.hashCode() : 0);
        }

        public final boolean isInProgress() {
            return this.isInProgress;
        }

        public String toString() {
            return "PerformerSearchDto(isInProgress=" + this.isInProgress + ", estimate=" + this.estimate + ", dynamicSearchStatuses=" + this.dynamicSearchStatuses + ", mapAnimation=" + this.mapAnimation + ", dynamicSearchTimeline=" + this.dynamicSearchTimeline + Extension.C_BRAKE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeliveryStateContextDto(@Json(name = "server_time") Long l, @Json(name = "is_performer_position_available") Boolean bool, @Json(name = "present_as_completed") Boolean bool2, @Json(name = "should_track_geo") Boolean bool3, @Json(name = "performer_search") PerformerSearchDto performerSearchDto, @Json(name = "original_order_id") String str, @Json(name = "restore_preorder") Boolean bool4, @Json(name = "display_targets") List<? extends DisplayTargetsItemDto> list, @Json(name = "objects_over_map_settings") ObjectsOverMapSettingsDto objectsOverMapSettingsDto, @Json(name = "shimmering") Boolean bool5, @Json(name = "provider_status") String str2, @Json(name = "provider_tariff_class") String str3, @Json(name = "role") String str4, @Json(name = "flex_section") FlexSectionDto flexSectionDto, @Json(name = "promotion_banners_enabled") Boolean bool6, @Json(name = "tracking_popup") TrackingPopupDto trackingPopupDto, @Json(name = "ads_banner") AdsBannerDto adsBannerDto) {
        this.serverTime = l;
        this.isPerformerPositionAvailable = bool;
        this.presentAsCompleted = bool2;
        this.shouldTrackGeo = bool3;
        this.performerSearch = performerSearchDto;
        this.originalOrderId = str;
        this.restorePreorder = bool4;
        this.displayTargets = list;
        this.objectsOverMapSettings = objectsOverMapSettingsDto;
        this.shimmering = bool5;
        this.providerStatus = str2;
        this.providerTariffClass = str3;
        this.role = str4;
        this.flexSection = flexSectionDto;
        this.promotionBannersEnabled = bool6;
        this.trackingPopup = trackingPopupDto;
        this.adsBanner = adsBannerDto;
    }

    public static /* synthetic */ DeliveryStateContextDto copy$default(DeliveryStateContextDto deliveryStateContextDto, Long l, Boolean bool, Boolean bool2, Boolean bool3, PerformerSearchDto performerSearchDto, String str, Boolean bool4, List list, ObjectsOverMapSettingsDto objectsOverMapSettingsDto, Boolean bool5, String str2, String str3, String str4, FlexSectionDto flexSectionDto, Boolean bool6, TrackingPopupDto trackingPopupDto, AdsBannerDto adsBannerDto, int i, Object obj) {
        AdsBannerDto adsBannerDto2;
        TrackingPopupDto trackingPopupDto2;
        Long l2;
        DeliveryStateContextDto deliveryStateContextDto2;
        Boolean bool7;
        Boolean bool8;
        Boolean bool9;
        Boolean bool10;
        PerformerSearchDto performerSearchDto2;
        String str5;
        Boolean bool11;
        List list2;
        ObjectsOverMapSettingsDto objectsOverMapSettingsDto2;
        Boolean bool12;
        String str6;
        String str7;
        String str8;
        FlexSectionDto flexSectionDto2;
        Long l3 = (i & 1) != 0 ? deliveryStateContextDto.serverTime : l;
        Boolean bool13 = (i & 2) != 0 ? deliveryStateContextDto.isPerformerPositionAvailable : bool;
        Boolean bool14 = (i & 4) != 0 ? deliveryStateContextDto.presentAsCompleted : bool2;
        Boolean bool15 = (i & 8) != 0 ? deliveryStateContextDto.shouldTrackGeo : bool3;
        PerformerSearchDto performerSearchDto3 = (i & 16) != 0 ? deliveryStateContextDto.performerSearch : performerSearchDto;
        String str9 = (i & 32) != 0 ? deliveryStateContextDto.originalOrderId : str;
        Boolean bool16 = (i & 64) != 0 ? deliveryStateContextDto.restorePreorder : bool4;
        List list3 = (i & 128) != 0 ? deliveryStateContextDto.displayTargets : list;
        ObjectsOverMapSettingsDto objectsOverMapSettingsDto3 = (i & 256) != 0 ? deliveryStateContextDto.objectsOverMapSettings : objectsOverMapSettingsDto;
        Boolean bool17 = (i & 512) != 0 ? deliveryStateContextDto.shimmering : bool5;
        String str10 = (i & 1024) != 0 ? deliveryStateContextDto.providerStatus : str2;
        String str11 = (i & 2048) != 0 ? deliveryStateContextDto.providerTariffClass : str3;
        String str12 = (i & 4096) != 0 ? deliveryStateContextDto.role : str4;
        FlexSectionDto flexSectionDto3 = (i & 8192) != 0 ? deliveryStateContextDto.flexSection : flexSectionDto;
        Long l4 = l3;
        Boolean bool18 = (i & 16384) != 0 ? deliveryStateContextDto.promotionBannersEnabled : bool6;
        TrackingPopupDto trackingPopupDto3 = (i & 32768) != 0 ? deliveryStateContextDto.trackingPopup : trackingPopupDto;
        if ((i & 65536) != 0) {
            trackingPopupDto2 = trackingPopupDto3;
            adsBannerDto2 = deliveryStateContextDto.adsBanner;
            bool7 = bool18;
            bool8 = bool13;
            bool9 = bool14;
            bool10 = bool15;
            performerSearchDto2 = performerSearchDto3;
            str5 = str9;
            bool11 = bool16;
            list2 = list3;
            objectsOverMapSettingsDto2 = objectsOverMapSettingsDto3;
            bool12 = bool17;
            str6 = str10;
            str7 = str11;
            str8 = str12;
            flexSectionDto2 = flexSectionDto3;
            l2 = l4;
            deliveryStateContextDto2 = deliveryStateContextDto;
        } else {
            adsBannerDto2 = adsBannerDto;
            trackingPopupDto2 = trackingPopupDto3;
            l2 = l4;
            deliveryStateContextDto2 = deliveryStateContextDto;
            bool7 = bool18;
            bool8 = bool13;
            bool9 = bool14;
            bool10 = bool15;
            performerSearchDto2 = performerSearchDto3;
            str5 = str9;
            bool11 = bool16;
            list2 = list3;
            objectsOverMapSettingsDto2 = objectsOverMapSettingsDto3;
            bool12 = bool17;
            str6 = str10;
            str7 = str11;
            str8 = str12;
            flexSectionDto2 = flexSectionDto3;
        }
        return deliveryStateContextDto2.copy(l2, bool8, bool9, bool10, performerSearchDto2, str5, bool11, list2, objectsOverMapSettingsDto2, bool12, str6, str7, str8, flexSectionDto2, bool7, trackingPopupDto2, adsBannerDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getServerTime() {
        return this.serverTime;
    }

    /* renamed from: component10, reason: from getter */
    public final Boolean getShimmering() {
        return this.shimmering;
    }

    /* renamed from: component11, reason: from getter */
    public final String getProviderStatus() {
        return this.providerStatus;
    }

    /* renamed from: component12, reason: from getter */
    public final String getProviderTariffClass() {
        return this.providerTariffClass;
    }

    /* renamed from: component13, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    /* renamed from: component14, reason: from getter */
    public final FlexSectionDto getFlexSection() {
        return this.flexSection;
    }

    /* renamed from: component15, reason: from getter */
    public final Boolean getPromotionBannersEnabled() {
        return this.promotionBannersEnabled;
    }

    /* renamed from: component16, reason: from getter */
    public final TrackingPopupDto getTrackingPopup() {
        return this.trackingPopup;
    }

    /* renamed from: component17, reason: from getter */
    public final AdsBannerDto getAdsBanner() {
        return this.adsBanner;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsPerformerPositionAvailable() {
        return this.isPerformerPositionAvailable;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getPresentAsCompleted() {
        return this.presentAsCompleted;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getShouldTrackGeo() {
        return this.shouldTrackGeo;
    }

    /* renamed from: component5, reason: from getter */
    public final PerformerSearchDto getPerformerSearch() {
        return this.performerSearch;
    }

    /* renamed from: component6, reason: from getter */
    public final String getOriginalOrderId() {
        return this.originalOrderId;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getRestorePreorder() {
        return this.restorePreorder;
    }

    public final List<DisplayTargetsItemDto> component8() {
        return this.displayTargets;
    }

    /* renamed from: component9, reason: from getter */
    public final ObjectsOverMapSettingsDto getObjectsOverMapSettings() {
        return this.objectsOverMapSettings;
    }

    public final DeliveryStateContextDto copy(@Json(name = "server_time") Long serverTime, @Json(name = "is_performer_position_available") Boolean isPerformerPositionAvailable, @Json(name = "present_as_completed") Boolean presentAsCompleted, @Json(name = "should_track_geo") Boolean shouldTrackGeo, @Json(name = "performer_search") PerformerSearchDto performerSearch, @Json(name = "original_order_id") String originalOrderId, @Json(name = "restore_preorder") Boolean restorePreorder, @Json(name = "display_targets") List<? extends DisplayTargetsItemDto> displayTargets, @Json(name = "objects_over_map_settings") ObjectsOverMapSettingsDto objectsOverMapSettings, @Json(name = "shimmering") Boolean shimmering, @Json(name = "provider_status") String providerStatus, @Json(name = "provider_tariff_class") String providerTariffClass, @Json(name = "role") String role, @Json(name = "flex_section") FlexSectionDto flexSection, @Json(name = "promotion_banners_enabled") Boolean promotionBannersEnabled, @Json(name = "tracking_popup") TrackingPopupDto trackingPopup, @Json(name = "ads_banner") AdsBannerDto adsBanner) {
        return new DeliveryStateContextDto(serverTime, isPerformerPositionAvailable, presentAsCompleted, shouldTrackGeo, performerSearch, originalOrderId, restorePreorder, displayTargets, objectsOverMapSettings, shimmering, providerStatus, providerTariffClass, role, flexSection, promotionBannersEnabled, trackingPopup, adsBanner);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryStateContextDto)) {
            return false;
        }
        DeliveryStateContextDto deliveryStateContextDto = (DeliveryStateContextDto) other;
        return jl40.l(this.serverTime, deliveryStateContextDto.serverTime) && jl40.l(this.isPerformerPositionAvailable, deliveryStateContextDto.isPerformerPositionAvailable) && jl40.l(this.presentAsCompleted, deliveryStateContextDto.presentAsCompleted) && jl40.l(this.shouldTrackGeo, deliveryStateContextDto.shouldTrackGeo) && jl40.l(this.performerSearch, deliveryStateContextDto.performerSearch) && jl40.l(this.originalOrderId, deliveryStateContextDto.originalOrderId) && jl40.l(this.restorePreorder, deliveryStateContextDto.restorePreorder) && jl40.l(this.displayTargets, deliveryStateContextDto.displayTargets) && jl40.l(this.objectsOverMapSettings, deliveryStateContextDto.objectsOverMapSettings) && jl40.l(this.shimmering, deliveryStateContextDto.shimmering) && jl40.l(this.providerStatus, deliveryStateContextDto.providerStatus) && jl40.l(this.providerTariffClass, deliveryStateContextDto.providerTariffClass) && jl40.l(this.role, deliveryStateContextDto.role) && jl40.l(this.flexSection, deliveryStateContextDto.flexSection) && jl40.l(this.promotionBannersEnabled, deliveryStateContextDto.promotionBannersEnabled) && jl40.l(this.trackingPopup, deliveryStateContextDto.trackingPopup) && jl40.l(this.adsBanner, deliveryStateContextDto.adsBanner);
    }

    public final AdsBannerDto getAdsBanner() {
        return this.adsBanner;
    }

    public final List<DisplayTargetsItemDto> getDisplayTargets() {
        return this.displayTargets;
    }

    public final FlexSectionDto getFlexSection() {
        return this.flexSection;
    }

    public final ObjectsOverMapSettingsDto getObjectsOverMapSettings() {
        return this.objectsOverMapSettings;
    }

    public final String getOriginalOrderId() {
        return this.originalOrderId;
    }

    public final PerformerSearchDto getPerformerSearch() {
        return this.performerSearch;
    }

    public final Boolean getPresentAsCompleted() {
        return this.presentAsCompleted;
    }

    public final Boolean getPromotionBannersEnabled() {
        return this.promotionBannersEnabled;
    }

    public final String getProviderStatus() {
        return this.providerStatus;
    }

    public final String getProviderTariffClass() {
        return this.providerTariffClass;
    }

    public final Boolean getRestorePreorder() {
        return this.restorePreorder;
    }

    public final String getRole() {
        return this.role;
    }

    public final Long getServerTime() {
        return this.serverTime;
    }

    public final Boolean getShimmering() {
        return this.shimmering;
    }

    public final Boolean getShouldTrackGeo() {
        return this.shouldTrackGeo;
    }

    public final TrackingPopupDto getTrackingPopup() {
        return this.trackingPopup;
    }

    public int hashCode() {
        Long l = this.serverTime;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Boolean bool = this.isPerformerPositionAvailable;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.presentAsCompleted;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.shouldTrackGeo;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        PerformerSearchDto performerSearchDto = this.performerSearch;
        int hashCode5 = (hashCode4 + (performerSearchDto == null ? 0 : performerSearchDto.hashCode())) * 31;
        String str = this.originalOrderId;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool4 = this.restorePreorder;
        int c = unr0.c((hashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31, 31, this.displayTargets);
        ObjectsOverMapSettingsDto objectsOverMapSettingsDto = this.objectsOverMapSettings;
        int hashCode7 = (c + (objectsOverMapSettingsDto == null ? 0 : objectsOverMapSettingsDto.hashCode())) * 31;
        Boolean bool5 = this.shimmering;
        int hashCode8 = (hashCode7 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str2 = this.providerStatus;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.providerTariffClass;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.role;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        FlexSectionDto flexSectionDto = this.flexSection;
        int hashCode12 = (hashCode11 + (flexSectionDto == null ? 0 : flexSectionDto.hashCode())) * 31;
        Boolean bool6 = this.promotionBannersEnabled;
        int hashCode13 = (hashCode12 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        TrackingPopupDto trackingPopupDto = this.trackingPopup;
        int hashCode14 = (hashCode13 + (trackingPopupDto == null ? 0 : trackingPopupDto.hashCode())) * 31;
        AdsBannerDto adsBannerDto = this.adsBanner;
        return hashCode14 + (adsBannerDto != null ? adsBannerDto.hashCode() : 0);
    }

    public final Boolean isPerformerPositionAvailable() {
        return this.isPerformerPositionAvailable;
    }

    public String toString() {
        Long l = this.serverTime;
        Boolean bool = this.isPerformerPositionAvailable;
        Boolean bool2 = this.presentAsCompleted;
        Boolean bool3 = this.shouldTrackGeo;
        PerformerSearchDto performerSearchDto = this.performerSearch;
        String str = this.originalOrderId;
        Boolean bool4 = this.restorePreorder;
        List<DisplayTargetsItemDto> list = this.displayTargets;
        ObjectsOverMapSettingsDto objectsOverMapSettingsDto = this.objectsOverMapSettings;
        Boolean bool5 = this.shimmering;
        String str2 = this.providerStatus;
        String str3 = this.providerTariffClass;
        String str4 = this.role;
        FlexSectionDto flexSectionDto = this.flexSection;
        Boolean bool6 = this.promotionBannersEnabled;
        TrackingPopupDto trackingPopupDto = this.trackingPopup;
        AdsBannerDto adsBannerDto = this.adsBanner;
        StringBuilder sb = new StringBuilder("DeliveryStateContextDto(serverTime=");
        sb.append(l);
        sb.append(", isPerformerPositionAvailable=");
        sb.append(bool);
        sb.append(", presentAsCompleted=");
        sb.append(bool2);
        sb.append(", shouldTrackGeo=");
        sb.append(bool3);
        sb.append(", performerSearch=");
        sb.append(performerSearchDto);
        sb.append(", originalOrderId=");
        sb.append(str);
        sb.append(", restorePreorder=");
        sb.append(bool4);
        sb.append(", displayTargets=");
        sb.append(list);
        sb.append(", objectsOverMapSettings=");
        sb.append(objectsOverMapSettingsDto);
        sb.append(", shimmering=");
        sb.append(bool5);
        sb.append(", providerStatus=");
        g8e.D(sb, str2, ", providerTariffClass=", str3, ", role=");
        sb.append(str4);
        sb.append(", flexSection=");
        sb.append(flexSectionDto);
        sb.append(", promotionBannersEnabled=");
        sb.append(bool6);
        sb.append(", trackingPopup=");
        sb.append(trackingPopupDto);
        sb.append(", adsBanner=");
        sb.append(adsBannerDto);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
