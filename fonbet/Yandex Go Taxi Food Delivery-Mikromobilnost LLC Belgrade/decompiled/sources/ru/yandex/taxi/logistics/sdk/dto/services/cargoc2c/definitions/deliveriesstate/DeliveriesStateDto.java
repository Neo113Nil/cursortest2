package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliveriesstate;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.smw0;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.x4e;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.DeliveryIconStrategyDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.BottomSectionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.DynamicSearchStatusDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.MapAnimationDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.PaidWaitingInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.PerformerDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.PerformerRouteDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handlersdefinitions.DisplayTargetsItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.timeline.TimelineDto;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001GB¯\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u000e\b\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\f\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0001\u0012\u0010\b\u0001\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\f¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000f0\fHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00130\fHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010>\u001a\u00020\u0001HÆ\u0003J\u0011\u0010?\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\fHÆ\u0003J±\u0001\u0010@\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0003\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\b\u0003\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0003\u0010\u0018\u001a\u00020\u00012\u0010\b\u0003\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\fHÆ\u0001J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020EHÖ\u0001J\t\u0010F\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010'R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0018\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0019\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b2\u0010'¨\u0006H"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveriesstate/DeliveriesStateDto;", "", "context", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveriesstate/DeliveriesStateDto$ContextDto;", "summary", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "iconStrategy", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/DeliveryIconStrategyDto;", "performer", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerDto;", "sortedRoutePoints", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveriesstate/DeliveriesPointDto;", "activeRoutePoints", "", "performerRoute", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerRouteDto;", "actions", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionDto;", "paidWaitingInfo", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PaidWaitingInfoDto;", "timeline", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineDto;", Constants.REFERRER_API_META, "bottomSections", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/BottomSectionDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveriesstate/DeliveriesStateDto$ContextDto;Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/DeliveryIconStrategyDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerDto;Ljava/util/List;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerRouteDto;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PaidWaitingInfoDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineDto;Ljava/lang/Object;Ljava/util/List;)V", "getContext", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveriesstate/DeliveriesStateDto$ContextDto;", "getSummary", "()Ljava/lang/String;", "getDescription", "getIconStrategy", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/DeliveryIconStrategyDto;", "getPerformer", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerDto;", "getSortedRoutePoints", "()Ljava/util/List;", "getActiveRoutePoints", "getPerformerRoute", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerRouteDto;", "getActions", "getPaidWaitingInfo", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PaidWaitingInfoDto;", "getTimeline", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineDto;", "getMeta", "()Ljava/lang/Object;", "getBottomSections", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "", "toString", "ContextDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DeliveriesStateDto {
    private final List<ActionDto> actions;
    private final List<Long> activeRoutePoints;
    private final List<BottomSectionDto> bottomSections;
    private final ContextDto context;
    private final String description;
    private final DeliveryIconStrategyDto iconStrategy;
    private final Object meta;
    private final PaidWaitingInfoDto paidWaitingInfo;
    private final PerformerDto performer;
    private final PerformerRouteDto performerRoute;
    private final List<DeliveriesPointDto> sortedRoutePoints;
    private final String summary;
    private final TimelineDto timeline;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00010B{\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0012\b\u0001\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0013\u0010'\u001a\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0082\u0001\u0010)\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0012\b\u0003\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u000bHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0002\u0010\u0013R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0004\u0010\u0013R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0016\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00061"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveriesstate/DeliveriesStateDto$ContextDto;", "", "isPerformerPositionAvailable", "", "isCompleted", "shouldTrackGeo", "autoOpenPostcard", "restorePreorder", "performerSearch", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveriesstate/DeliveriesStateDto$ContextDto$PerformerSearchDto;", "originalOrderId", "", "displayTargets", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/DisplayTargetsItemDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/DisplayTargetsDto;", "adsOnMapMeta", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveriesstate/DeliveriesStateDto$ContextDto$PerformerSearchDto;Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShouldTrackGeo", "getAutoOpenPostcard", "getRestorePreorder", "getPerformerSearch", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveriesstate/DeliveriesStateDto$ContextDto$PerformerSearchDto;", "getOriginalOrderId", "()Ljava/lang/String;", "getDisplayTargets", "()Ljava/util/List;", "getAdsOnMapMeta", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveriesstate/DeliveriesStateDto$ContextDto$PerformerSearchDto;Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveriesstate/DeliveriesStateDto$ContextDto;", "equals", "other", "hashCode", "", "toString", "PerformerSearchDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContextDto {
        private final Object adsOnMapMeta;
        private final Boolean autoOpenPostcard;
        private final List<DisplayTargetsItemDto> displayTargets;
        private final Boolean isCompleted;
        private final Boolean isPerformerPositionAvailable;
        private final String originalOrderId;
        private final PerformerSearchDto performerSearch;
        private final Boolean restorePreorder;
        private final Boolean shouldTrackGeo;

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003JB\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveriesstate/DeliveriesStateDto$ContextDto$PerformerSearchDto;", "", "isInProgress", "", "estimate", "", "dynamicSearchStatuses", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchStatusDto;", "mapAnimation", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/MapAnimationDto;", "<init>", "(ZLjava/lang/Long;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/MapAnimationDto;)V", "()Z", "getEstimate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDynamicSearchStatuses", "()Ljava/util/List;", "getMapAnimation", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/MapAnimationDto;", "component1", "component2", "component3", "component4", "copy", "(ZLjava/lang/Long;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/MapAnimationDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveriesstate/DeliveriesStateDto$ContextDto$PerformerSearchDto;", "equals", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PerformerSearchDto {
            private final List<DynamicSearchStatusDto> dynamicSearchStatuses;
            private final Long estimate;
            private final boolean isInProgress;
            private final MapAnimationDto mapAnimation;

            public PerformerSearchDto(@Json(name = "is_in_progress") boolean z, @Json(name = "estimate") Long l, @Json(name = "dynamic_search_statuses") List<DynamicSearchStatusDto> list, @Json(name = "map_animation") MapAnimationDto mapAnimationDto) {
                this.isInProgress = z;
                this.estimate = l;
                this.dynamicSearchStatuses = list;
                this.mapAnimation = mapAnimationDto;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ PerformerSearchDto copy$default(PerformerSearchDto performerSearchDto, boolean z, Long l, List list, MapAnimationDto mapAnimationDto, int i, Object obj) {
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
                return performerSearchDto.copy(z, l, list, mapAnimationDto);
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

            public final PerformerSearchDto copy(@Json(name = "is_in_progress") boolean isInProgress, @Json(name = "estimate") Long estimate, @Json(name = "dynamic_search_statuses") List<DynamicSearchStatusDto> dynamicSearchStatuses, @Json(name = "map_animation") MapAnimationDto mapAnimation) {
                return new PerformerSearchDto(isInProgress, estimate, dynamicSearchStatuses, mapAnimation);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PerformerSearchDto)) {
                    return false;
                }
                PerformerSearchDto performerSearchDto = (PerformerSearchDto) other;
                return this.isInProgress == performerSearchDto.isInProgress && jl40.l(this.estimate, performerSearchDto.estimate) && jl40.l(this.dynamicSearchStatuses, performerSearchDto.dynamicSearchStatuses) && jl40.l(this.mapAnimation, performerSearchDto.mapAnimation);
            }

            public final List<DynamicSearchStatusDto> getDynamicSearchStatuses() {
                return this.dynamicSearchStatuses;
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
                return hashCode3 + (mapAnimationDto != null ? mapAnimationDto.hashCode() : 0);
            }

            public final boolean isInProgress() {
                return this.isInProgress;
            }

            public String toString() {
                return "PerformerSearchDto(isInProgress=" + this.isInProgress + ", estimate=" + this.estimate + ", dynamicSearchStatuses=" + this.dynamicSearchStatuses + ", mapAnimation=" + this.mapAnimation + Extension.C_BRAKE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ContextDto(@Json(name = "is_performer_position_available") Boolean bool, @Json(name = "is_completed") Boolean bool2, @Json(name = "should_track_geo") Boolean bool3, @Json(name = "auto_open_postcard") Boolean bool4, @Json(name = "restore_preorder") Boolean bool5, @Json(name = "performer_search") PerformerSearchDto performerSearchDto, @Json(name = "original_order_id") String str, @Json(name = "display_targets") List<? extends DisplayTargetsItemDto> list, @Json(name = "ads_on_map_meta") Object obj) {
            this.isPerformerPositionAvailable = bool;
            this.isCompleted = bool2;
            this.shouldTrackGeo = bool3;
            this.autoOpenPostcard = bool4;
            this.restorePreorder = bool5;
            this.performerSearch = performerSearchDto;
            this.originalOrderId = str;
            this.displayTargets = list;
            this.adsOnMapMeta = obj;
        }

        public static /* synthetic */ ContextDto copy$default(ContextDto contextDto, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, PerformerSearchDto performerSearchDto, String str, List list, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                bool = contextDto.isPerformerPositionAvailable;
            }
            if ((i & 2) != 0) {
                bool2 = contextDto.isCompleted;
            }
            if ((i & 4) != 0) {
                bool3 = contextDto.shouldTrackGeo;
            }
            if ((i & 8) != 0) {
                bool4 = contextDto.autoOpenPostcard;
            }
            if ((i & 16) != 0) {
                bool5 = contextDto.restorePreorder;
            }
            if ((i & 32) != 0) {
                performerSearchDto = contextDto.performerSearch;
            }
            if ((i & 64) != 0) {
                str = contextDto.originalOrderId;
            }
            if ((i & 128) != 0) {
                list = contextDto.displayTargets;
            }
            if ((i & 256) != 0) {
                obj = contextDto.adsOnMapMeta;
            }
            List list2 = list;
            Object obj3 = obj;
            PerformerSearchDto performerSearchDto2 = performerSearchDto;
            String str2 = str;
            Boolean bool6 = bool5;
            Boolean bool7 = bool3;
            return contextDto.copy(bool, bool2, bool7, bool4, bool6, performerSearchDto2, str2, list2, obj3);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getIsPerformerPositionAvailable() {
            return this.isPerformerPositionAvailable;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIsCompleted() {
            return this.isCompleted;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getShouldTrackGeo() {
            return this.shouldTrackGeo;
        }

        /* renamed from: component4, reason: from getter */
        public final Boolean getAutoOpenPostcard() {
            return this.autoOpenPostcard;
        }

        /* renamed from: component5, reason: from getter */
        public final Boolean getRestorePreorder() {
            return this.restorePreorder;
        }

        /* renamed from: component6, reason: from getter */
        public final PerformerSearchDto getPerformerSearch() {
            return this.performerSearch;
        }

        /* renamed from: component7, reason: from getter */
        public final String getOriginalOrderId() {
            return this.originalOrderId;
        }

        public final List<DisplayTargetsItemDto> component8() {
            return this.displayTargets;
        }

        /* renamed from: component9, reason: from getter */
        public final Object getAdsOnMapMeta() {
            return this.adsOnMapMeta;
        }

        public final ContextDto copy(@Json(name = "is_performer_position_available") Boolean isPerformerPositionAvailable, @Json(name = "is_completed") Boolean isCompleted, @Json(name = "should_track_geo") Boolean shouldTrackGeo, @Json(name = "auto_open_postcard") Boolean autoOpenPostcard, @Json(name = "restore_preorder") Boolean restorePreorder, @Json(name = "performer_search") PerformerSearchDto performerSearch, @Json(name = "original_order_id") String originalOrderId, @Json(name = "display_targets") List<? extends DisplayTargetsItemDto> displayTargets, @Json(name = "ads_on_map_meta") Object adsOnMapMeta) {
            return new ContextDto(isPerformerPositionAvailable, isCompleted, shouldTrackGeo, autoOpenPostcard, restorePreorder, performerSearch, originalOrderId, displayTargets, adsOnMapMeta);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContextDto)) {
                return false;
            }
            ContextDto contextDto = (ContextDto) other;
            return jl40.l(this.isPerformerPositionAvailable, contextDto.isPerformerPositionAvailable) && jl40.l(this.isCompleted, contextDto.isCompleted) && jl40.l(this.shouldTrackGeo, contextDto.shouldTrackGeo) && jl40.l(this.autoOpenPostcard, contextDto.autoOpenPostcard) && jl40.l(this.restorePreorder, contextDto.restorePreorder) && jl40.l(this.performerSearch, contextDto.performerSearch) && jl40.l(this.originalOrderId, contextDto.originalOrderId) && jl40.l(this.displayTargets, contextDto.displayTargets) && jl40.l(this.adsOnMapMeta, contextDto.adsOnMapMeta);
        }

        public final Object getAdsOnMapMeta() {
            return this.adsOnMapMeta;
        }

        public final Boolean getAutoOpenPostcard() {
            return this.autoOpenPostcard;
        }

        public final List<DisplayTargetsItemDto> getDisplayTargets() {
            return this.displayTargets;
        }

        public final String getOriginalOrderId() {
            return this.originalOrderId;
        }

        public final PerformerSearchDto getPerformerSearch() {
            return this.performerSearch;
        }

        public final Boolean getRestorePreorder() {
            return this.restorePreorder;
        }

        public final Boolean getShouldTrackGeo() {
            return this.shouldTrackGeo;
        }

        public int hashCode() {
            Boolean bool = this.isPerformerPositionAvailable;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.isCompleted;
            int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.shouldTrackGeo;
            int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.autoOpenPostcard;
            int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.restorePreorder;
            int hashCode5 = (hashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            PerformerSearchDto performerSearchDto = this.performerSearch;
            int hashCode6 = (hashCode5 + (performerSearchDto == null ? 0 : performerSearchDto.hashCode())) * 31;
            String str = this.originalOrderId;
            int c = unr0.c((hashCode6 + (str == null ? 0 : str.hashCode())) * 31, 31, this.displayTargets);
            Object obj = this.adsOnMapMeta;
            return c + (obj != null ? obj.hashCode() : 0);
        }

        public final Boolean isCompleted() {
            return this.isCompleted;
        }

        public final Boolean isPerformerPositionAvailable() {
            return this.isPerformerPositionAvailable;
        }

        public String toString() {
            Boolean bool = this.isPerformerPositionAvailable;
            Boolean bool2 = this.isCompleted;
            Boolean bool3 = this.shouldTrackGeo;
            Boolean bool4 = this.autoOpenPostcard;
            Boolean bool5 = this.restorePreorder;
            PerformerSearchDto performerSearchDto = this.performerSearch;
            String str = this.originalOrderId;
            List<DisplayTargetsItemDto> list = this.displayTargets;
            Object obj = this.adsOnMapMeta;
            StringBuilder sb = new StringBuilder("ContextDto(isPerformerPositionAvailable=");
            sb.append(bool);
            sb.append(", isCompleted=");
            sb.append(bool2);
            sb.append(", shouldTrackGeo=");
            sb.append(bool3);
            sb.append(", autoOpenPostcard=");
            sb.append(bool4);
            sb.append(", restorePreorder=");
            sb.append(bool5);
            sb.append(", performerSearch=");
            sb.append(performerSearchDto);
            sb.append(", originalOrderId=");
            tse0.x(str, ", displayTargets=", ", adsOnMapMeta=", sb, list);
            return x4e.h(sb, obj, Extension.C_BRAKE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeliveriesStateDto(@Json(name = "context") ContextDto contextDto, @Json(name = "summary") String str, @Json(name = "description") String str2, @Json(name = "icon_strategy") DeliveryIconStrategyDto deliveryIconStrategyDto, @Json(name = "performer") PerformerDto performerDto, @Json(name = "sorted_route_points") List<DeliveriesPointDto> list, @Json(name = "active_route_points") List<Long> list2, @Json(name = "performer_route") PerformerRouteDto performerRouteDto, @Json(name = "actions") List<? extends ActionDto> list3, @Json(name = "paid_waiting_info") PaidWaitingInfoDto paidWaitingInfoDto, @Json(name = "timeline") TimelineDto timelineDto, @Json(name = "meta") Object obj, @Json(name = "bottom_sections") List<BottomSectionDto> list4) {
        this.context = contextDto;
        this.summary = str;
        this.description = str2;
        this.iconStrategy = deliveryIconStrategyDto;
        this.performer = performerDto;
        this.sortedRoutePoints = list;
        this.activeRoutePoints = list2;
        this.performerRoute = performerRouteDto;
        this.actions = list3;
        this.paidWaitingInfo = paidWaitingInfoDto;
        this.timeline = timelineDto;
        this.meta = obj;
        this.bottomSections = list4;
    }

    public static /* synthetic */ DeliveriesStateDto copy$default(DeliveriesStateDto deliveriesStateDto, ContextDto contextDto, String str, String str2, DeliveryIconStrategyDto deliveryIconStrategyDto, PerformerDto performerDto, List list, List list2, PerformerRouteDto performerRouteDto, List list3, PaidWaitingInfoDto paidWaitingInfoDto, TimelineDto timelineDto, Object obj, List list4, int i, Object obj2) {
        if ((i & 1) != 0) {
            contextDto = deliveriesStateDto.context;
        }
        return deliveriesStateDto.copy(contextDto, (i & 2) != 0 ? deliveriesStateDto.summary : str, (i & 4) != 0 ? deliveriesStateDto.description : str2, (i & 8) != 0 ? deliveriesStateDto.iconStrategy : deliveryIconStrategyDto, (i & 16) != 0 ? deliveriesStateDto.performer : performerDto, (i & 32) != 0 ? deliveriesStateDto.sortedRoutePoints : list, (i & 64) != 0 ? deliveriesStateDto.activeRoutePoints : list2, (i & 128) != 0 ? deliveriesStateDto.performerRoute : performerRouteDto, (i & 256) != 0 ? deliveriesStateDto.actions : list3, (i & 512) != 0 ? deliveriesStateDto.paidWaitingInfo : paidWaitingInfoDto, (i & 1024) != 0 ? deliveriesStateDto.timeline : timelineDto, (i & 2048) != 0 ? deliveriesStateDto.meta : obj, (i & 4096) != 0 ? deliveriesStateDto.bottomSections : list4);
    }

    /* renamed from: component1, reason: from getter */
    public final ContextDto getContext() {
        return this.context;
    }

    /* renamed from: component10, reason: from getter */
    public final PaidWaitingInfoDto getPaidWaitingInfo() {
        return this.paidWaitingInfo;
    }

    /* renamed from: component11, reason: from getter */
    public final TimelineDto getTimeline() {
        return this.timeline;
    }

    /* renamed from: component12, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    public final List<BottomSectionDto> component13() {
        return this.bottomSections;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final DeliveryIconStrategyDto getIconStrategy() {
        return this.iconStrategy;
    }

    /* renamed from: component5, reason: from getter */
    public final PerformerDto getPerformer() {
        return this.performer;
    }

    public final List<DeliveriesPointDto> component6() {
        return this.sortedRoutePoints;
    }

    public final List<Long> component7() {
        return this.activeRoutePoints;
    }

    /* renamed from: component8, reason: from getter */
    public final PerformerRouteDto getPerformerRoute() {
        return this.performerRoute;
    }

    public final List<ActionDto> component9() {
        return this.actions;
    }

    public final DeliveriesStateDto copy(@Json(name = "context") ContextDto context, @Json(name = "summary") String summary, @Json(name = "description") String description, @Json(name = "icon_strategy") DeliveryIconStrategyDto iconStrategy, @Json(name = "performer") PerformerDto performer, @Json(name = "sorted_route_points") List<DeliveriesPointDto> sortedRoutePoints, @Json(name = "active_route_points") List<Long> activeRoutePoints, @Json(name = "performer_route") PerformerRouteDto performerRoute, @Json(name = "actions") List<? extends ActionDto> actions, @Json(name = "paid_waiting_info") PaidWaitingInfoDto paidWaitingInfo, @Json(name = "timeline") TimelineDto timeline, @Json(name = "meta") Object meta, @Json(name = "bottom_sections") List<BottomSectionDto> bottomSections) {
        return new DeliveriesStateDto(context, summary, description, iconStrategy, performer, sortedRoutePoints, activeRoutePoints, performerRoute, actions, paidWaitingInfo, timeline, meta, bottomSections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveriesStateDto)) {
            return false;
        }
        DeliveriesStateDto deliveriesStateDto = (DeliveriesStateDto) other;
        return jl40.l(this.context, deliveriesStateDto.context) && jl40.l(this.summary, deliveriesStateDto.summary) && jl40.l(this.description, deliveriesStateDto.description) && jl40.l(this.iconStrategy, deliveriesStateDto.iconStrategy) && jl40.l(this.performer, deliveriesStateDto.performer) && jl40.l(this.sortedRoutePoints, deliveriesStateDto.sortedRoutePoints) && jl40.l(this.activeRoutePoints, deliveriesStateDto.activeRoutePoints) && jl40.l(this.performerRoute, deliveriesStateDto.performerRoute) && jl40.l(this.actions, deliveriesStateDto.actions) && jl40.l(this.paidWaitingInfo, deliveriesStateDto.paidWaitingInfo) && jl40.l(this.timeline, deliveriesStateDto.timeline) && jl40.l(this.meta, deliveriesStateDto.meta) && jl40.l(this.bottomSections, deliveriesStateDto.bottomSections);
    }

    public final List<ActionDto> getActions() {
        return this.actions;
    }

    public final List<Long> getActiveRoutePoints() {
        return this.activeRoutePoints;
    }

    public final List<BottomSectionDto> getBottomSections() {
        return this.bottomSections;
    }

    public final ContextDto getContext() {
        return this.context;
    }

    public final String getDescription() {
        return this.description;
    }

    public final DeliveryIconStrategyDto getIconStrategy() {
        return this.iconStrategy;
    }

    public final Object getMeta() {
        return this.meta;
    }

    public final PaidWaitingInfoDto getPaidWaitingInfo() {
        return this.paidWaitingInfo;
    }

    public final PerformerDto getPerformer() {
        return this.performer;
    }

    public final PerformerRouteDto getPerformerRoute() {
        return this.performerRoute;
    }

    public final List<DeliveriesPointDto> getSortedRoutePoints() {
        return this.sortedRoutePoints;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final TimelineDto getTimeline() {
        return this.timeline;
    }

    public int hashCode() {
        int b = unr0.b(this.context.hashCode() * 31, 31, this.summary);
        String str = this.description;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        DeliveryIconStrategyDto deliveryIconStrategyDto = this.iconStrategy;
        int hashCode2 = (hashCode + (deliveryIconStrategyDto == null ? 0 : deliveryIconStrategyDto.hashCode())) * 31;
        PerformerDto performerDto = this.performer;
        int c = unr0.c(unr0.c((hashCode2 + (performerDto == null ? 0 : performerDto.hashCode())) * 31, 31, this.sortedRoutePoints), 31, this.activeRoutePoints);
        PerformerRouteDto performerRouteDto = this.performerRoute;
        int c2 = unr0.c((c + (performerRouteDto == null ? 0 : performerRouteDto.hashCode())) * 31, 31, this.actions);
        PaidWaitingInfoDto paidWaitingInfoDto = this.paidWaitingInfo;
        int hashCode3 = (c2 + (paidWaitingInfoDto == null ? 0 : paidWaitingInfoDto.hashCode())) * 31;
        TimelineDto timelineDto = this.timeline;
        int c3 = smw0.c((hashCode3 + (timelineDto == null ? 0 : timelineDto.hashCode())) * 31, 31, this.meta);
        List<BottomSectionDto> list = this.bottomSections;
        return c3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        ContextDto contextDto = this.context;
        String str = this.summary;
        String str2 = this.description;
        DeliveryIconStrategyDto deliveryIconStrategyDto = this.iconStrategy;
        PerformerDto performerDto = this.performer;
        List<DeliveriesPointDto> list = this.sortedRoutePoints;
        List<Long> list2 = this.activeRoutePoints;
        PerformerRouteDto performerRouteDto = this.performerRoute;
        List<ActionDto> list3 = this.actions;
        PaidWaitingInfoDto paidWaitingInfoDto = this.paidWaitingInfo;
        TimelineDto timelineDto = this.timeline;
        Object obj = this.meta;
        List<BottomSectionDto> list4 = this.bottomSections;
        StringBuilder sb = new StringBuilder("DeliveriesStateDto(context=");
        sb.append(contextDto);
        sb.append(", summary=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", iconStrategy=");
        sb.append(deliveryIconStrategyDto);
        sb.append(", performer=");
        sb.append(performerDto);
        sb.append(", sortedRoutePoints=");
        sb.append(list);
        sb.append(", activeRoutePoints=");
        sb.append(list2);
        sb.append(", performerRoute=");
        sb.append(performerRouteDto);
        sb.append(", actions=");
        sb.append(list3);
        sb.append(", paidWaitingInfo=");
        sb.append(paidWaitingInfoDto);
        sb.append(", timeline=");
        sb.append(timelineDto);
        sb.append(", meta=");
        sb.append(obj);
        sb.append(", bottomSections=");
        return ly3.s(sb, list4, Extension.C_BRAKE);
    }
}
