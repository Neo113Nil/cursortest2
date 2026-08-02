package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.smw0;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.DeliveryIconStrategyDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PostcardConsumerInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateorderingcontrol.OrderingControlDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.ContentSectionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard.NeuroPostcardDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.timeline.BubbleDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.timeline.TimelineDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.topaccentbar.TopAccentBarDto;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bI\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bç\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u000e\b\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\f\u0012\u000e\b\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f\u0012\u0010\b\u0001\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\f\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0001\u0012\u0010\b\u0001\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\f\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\u0010\b\u0001\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\f\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010%\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010)\u0012\u0010\b\u0001\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\f\u0012\u0010\b\u0001\u0010+\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010\f\u0012\n\b\u0001\u0010-\u001a\u0004\u0018\u00010.\u0012\n\b\u0001\u0010/\u001a\u0004\u0018\u000100\u0012\n\b\u0001\u00101\u001a\u0004\u0018\u000102¢\u0006\u0004\b3\u00104J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000f\u0010e\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000f\u0010f\u001a\b\u0012\u0004\u0012\u00020\u000f0\fHÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00130\fHÆ\u0003J\u000f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00130\fHÆ\u0003J\u0011\u0010j\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\fHÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\t\u0010l\u001a\u00020\u0001HÆ\u0003J\u0011\u0010m\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\fHÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u0011\u0010p\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\fHÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010#HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010%HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010'HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010)HÆ\u0003J\u0011\u0010u\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\fHÆ\u0003J\u0011\u0010v\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010\fHÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010.HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u000100HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u000102HÆ\u0003Jé\u0002\u0010z\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0003\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\b\u0003\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\u000e\b\u0003\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\u0010\b\u0003\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\f2\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0003\u0010\u0019\u001a\u00020\u00012\u0010\b\u0003\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\f2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0010\b\u0003\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\f2\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0003\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0003\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0003\u0010(\u001a\u0004\u0018\u00010)2\u0010\b\u0003\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\f2\u0010\b\u0003\u0010+\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010\f2\n\b\u0003\u0010-\u001a\u0004\u0018\u00010.2\n\b\u0003\u0010/\u001a\u0004\u0018\u0001002\n\b\u0003\u00101\u001a\u0004\u0018\u000102HÆ\u0001J\u0013\u0010{\u001a\u00020|2\b\u0010}\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010~\u001a\u00020\u007fHÖ\u0001J\n\u0010\u0080\u0001\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u00108R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\b\n\u0000\u001a\u0004\b@\u0010?R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\f¢\u0006\b\n\u0000\u001a\u0004\bC\u0010?R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f¢\u0006\b\n\u0000\u001a\u0004\bD\u0010?R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\bE\u0010?R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0011\u0010\u0019\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0019\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010?R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0019\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\bO\u0010?R\u0013\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0013\u0010$\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0013\u0010&\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0013\u0010(\u001a\u0004\u0018\u00010)¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0019\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\bX\u0010?R\u0019\u0010+\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\bY\u0010?R\u0013\u0010-\u001a\u0004\u0018\u00010.¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0013\u0010/\u001a\u0004\u0018\u000100¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0013\u00101\u001a\u0004\u0018\u000102¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_¨\u0006\u0081\u0001"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeliveryStateDto;", "", "context", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeliveryStateContextDto;", "summary", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "performer", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerDto;", "iconStrategy", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/DeliveryIconStrategyDto;", "sortedRoutePoints", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/StatePointDto;", "activeRoutePoints", "", "performerRoute", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerRouteDto;", "primaryActions", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionDto;", "secondaryActions", "contentSections", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentSectionDto;", "paidWaitingInfo", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PaidWaitingInfoDto;", Constants.REFERRER_API_META, "onFirstLoadActions", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/OnFirstLoadActionDto;", "postcard", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PostcardConsumerInfoDto;", "timeline", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineDto;", "extraBubbles", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/BubbleDto;", "costDetails", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/CostDetailsDto;", "completedStateButtons", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/CompletedStateButtonsDto;", "accentStateButton", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AccentStateButtonDto;", "poll", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PollDto;", "bottomContentSections", "bottomSections", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/BottomSectionDto;", "orderingControl", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/OrderingControlDto;", "neuroPostcard", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardDto;", "topAccentBar", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TopAccentBarDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeliveryStateContextDto;Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/DeliveryIconStrategyDto;Ljava/util/List;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerRouteDto;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PaidWaitingInfoDto;Ljava/lang/Object;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PostcardConsumerInfoDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineDto;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/CostDetailsDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/CompletedStateButtonsDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AccentStateButtonDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PollDto;Ljava/util/List;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/OrderingControlDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TopAccentBarDto;)V", "getContext", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeliveryStateContextDto;", "getSummary", "()Ljava/lang/String;", "getDescription", "getPerformer", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerDto;", "getIconStrategy", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/DeliveryIconStrategyDto;", "getSortedRoutePoints", "()Ljava/util/List;", "getActiveRoutePoints", "getPerformerRoute", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerRouteDto;", "getPrimaryActions", "getSecondaryActions", "getContentSections", "getPaidWaitingInfo", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PaidWaitingInfoDto;", "getMeta", "()Ljava/lang/Object;", "getOnFirstLoadActions", "getPostcard", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PostcardConsumerInfoDto;", "getTimeline", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineDto;", "getExtraBubbles", "getCostDetails", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/CostDetailsDto;", "getCompletedStateButtons", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/CompletedStateButtonsDto;", "getAccentStateButton", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AccentStateButtonDto;", "getPoll", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PollDto;", "getBottomContentSections", "getBottomSections", "getOrderingControl", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/OrderingControlDto;", "getNeuroPostcard", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardDto;", "getTopAccentBar", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TopAccentBarDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DeliveryStateDto {
    private final AccentStateButtonDto accentStateButton;
    private final List<Long> activeRoutePoints;
    private final List<ContentSectionDto> bottomContentSections;
    private final List<BottomSectionDto> bottomSections;
    private final CompletedStateButtonsDto completedStateButtons;
    private final List<ContentSectionDto> contentSections;
    private final DeliveryStateContextDto context;
    private final CostDetailsDto costDetails;
    private final String description;
    private final List<BubbleDto> extraBubbles;
    private final DeliveryIconStrategyDto iconStrategy;
    private final Object meta;
    private final NeuroPostcardDto neuroPostcard;
    private final List<OnFirstLoadActionDto> onFirstLoadActions;
    private final OrderingControlDto orderingControl;
    private final PaidWaitingInfoDto paidWaitingInfo;
    private final PerformerDto performer;
    private final PerformerRouteDto performerRoute;
    private final PollDto poll;
    private final PostcardConsumerInfoDto postcard;
    private final List<ActionDto> primaryActions;
    private final List<ActionDto> secondaryActions;
    private final List<StatePointDto> sortedRoutePoints;
    private final String summary;
    private final TimelineDto timeline;
    private final TopAccentBarDto topAccentBar;

    /* JADX WARN: Multi-variable type inference failed */
    public DeliveryStateDto(@Json(name = "context") DeliveryStateContextDto deliveryStateContextDto, @Json(name = "summary") String str, @Json(name = "description") String str2, @Json(name = "performer") PerformerDto performerDto, @Json(name = "icon_strategy") DeliveryIconStrategyDto deliveryIconStrategyDto, @Json(name = "sorted_route_points") List<? extends StatePointDto> list, @Json(name = "active_route_points") List<Long> list2, @Json(name = "performer_route") PerformerRouteDto performerRouteDto, @Json(name = "primary_actions") List<? extends ActionDto> list3, @Json(name = "secondary_actions") List<? extends ActionDto> list4, @Json(name = "content_sections") List<ContentSectionDto> list5, @Json(name = "paid_waiting_info") PaidWaitingInfoDto paidWaitingInfoDto, @Json(name = "meta") Object obj, @Json(name = "on_first_load_actions") List<OnFirstLoadActionDto> list6, @Json(name = "postcard") PostcardConsumerInfoDto postcardConsumerInfoDto, @Json(name = "timeline") TimelineDto timelineDto, @Json(name = "extra_bubbles") List<BubbleDto> list7, @Json(name = "cost_details") CostDetailsDto costDetailsDto, @Json(name = "completed_state_buttons") CompletedStateButtonsDto completedStateButtonsDto, @Json(name = "accent_state_button") AccentStateButtonDto accentStateButtonDto, @Json(name = "poll") PollDto pollDto, @Json(name = "bottom_content_sections") List<ContentSectionDto> list8, @Json(name = "bottom_sections") List<BottomSectionDto> list9, @Json(name = "ordering_control") OrderingControlDto orderingControlDto, @Json(name = "neuro_postcard") NeuroPostcardDto neuroPostcardDto, @Json(name = "top_accent_bar") TopAccentBarDto topAccentBarDto) {
        this.context = deliveryStateContextDto;
        this.summary = str;
        this.description = str2;
        this.performer = performerDto;
        this.iconStrategy = deliveryIconStrategyDto;
        this.sortedRoutePoints = list;
        this.activeRoutePoints = list2;
        this.performerRoute = performerRouteDto;
        this.primaryActions = list3;
        this.secondaryActions = list4;
        this.contentSections = list5;
        this.paidWaitingInfo = paidWaitingInfoDto;
        this.meta = obj;
        this.onFirstLoadActions = list6;
        this.postcard = postcardConsumerInfoDto;
        this.timeline = timelineDto;
        this.extraBubbles = list7;
        this.costDetails = costDetailsDto;
        this.completedStateButtons = completedStateButtonsDto;
        this.accentStateButton = accentStateButtonDto;
        this.poll = pollDto;
        this.bottomContentSections = list8;
        this.bottomSections = list9;
        this.orderingControl = orderingControlDto;
        this.neuroPostcard = neuroPostcardDto;
        this.topAccentBar = topAccentBarDto;
    }

    public static /* synthetic */ DeliveryStateDto copy$default(DeliveryStateDto deliveryStateDto, DeliveryStateContextDto deliveryStateContextDto, String str, String str2, PerformerDto performerDto, DeliveryIconStrategyDto deliveryIconStrategyDto, List list, List list2, PerformerRouteDto performerRouteDto, List list3, List list4, List list5, PaidWaitingInfoDto paidWaitingInfoDto, Object obj, List list6, PostcardConsumerInfoDto postcardConsumerInfoDto, TimelineDto timelineDto, List list7, CostDetailsDto costDetailsDto, CompletedStateButtonsDto completedStateButtonsDto, AccentStateButtonDto accentStateButtonDto, PollDto pollDto, List list8, List list9, OrderingControlDto orderingControlDto, NeuroPostcardDto neuroPostcardDto, TopAccentBarDto topAccentBarDto, int i, Object obj2) {
        TopAccentBarDto topAccentBarDto2;
        NeuroPostcardDto neuroPostcardDto2;
        DeliveryStateContextDto deliveryStateContextDto2 = (i & 1) != 0 ? deliveryStateDto.context : deliveryStateContextDto;
        String str3 = (i & 2) != 0 ? deliveryStateDto.summary : str;
        String str4 = (i & 4) != 0 ? deliveryStateDto.description : str2;
        PerformerDto performerDto2 = (i & 8) != 0 ? deliveryStateDto.performer : performerDto;
        DeliveryIconStrategyDto deliveryIconStrategyDto2 = (i & 16) != 0 ? deliveryStateDto.iconStrategy : deliveryIconStrategyDto;
        List list10 = (i & 32) != 0 ? deliveryStateDto.sortedRoutePoints : list;
        List list11 = (i & 64) != 0 ? deliveryStateDto.activeRoutePoints : list2;
        PerformerRouteDto performerRouteDto2 = (i & 128) != 0 ? deliveryStateDto.performerRoute : performerRouteDto;
        List list12 = (i & 256) != 0 ? deliveryStateDto.primaryActions : list3;
        List list13 = (i & 512) != 0 ? deliveryStateDto.secondaryActions : list4;
        List list14 = (i & 1024) != 0 ? deliveryStateDto.contentSections : list5;
        PaidWaitingInfoDto paidWaitingInfoDto2 = (i & 2048) != 0 ? deliveryStateDto.paidWaitingInfo : paidWaitingInfoDto;
        Object obj3 = (i & 4096) != 0 ? deliveryStateDto.meta : obj;
        List list15 = (i & 8192) != 0 ? deliveryStateDto.onFirstLoadActions : list6;
        DeliveryStateContextDto deliveryStateContextDto3 = deliveryStateContextDto2;
        PostcardConsumerInfoDto postcardConsumerInfoDto2 = (i & 16384) != 0 ? deliveryStateDto.postcard : postcardConsumerInfoDto;
        TimelineDto timelineDto2 = (i & 32768) != 0 ? deliveryStateDto.timeline : timelineDto;
        List list16 = (i & 65536) != 0 ? deliveryStateDto.extraBubbles : list7;
        CostDetailsDto costDetailsDto2 = (i & 131072) != 0 ? deliveryStateDto.costDetails : costDetailsDto;
        CompletedStateButtonsDto completedStateButtonsDto2 = (i & 262144) != 0 ? deliveryStateDto.completedStateButtons : completedStateButtonsDto;
        AccentStateButtonDto accentStateButtonDto2 = (i & 524288) != 0 ? deliveryStateDto.accentStateButton : accentStateButtonDto;
        PollDto pollDto2 = (i & 1048576) != 0 ? deliveryStateDto.poll : pollDto;
        List list17 = (i & 2097152) != 0 ? deliveryStateDto.bottomContentSections : list8;
        List list18 = (i & SelfTester_JCP.ENCRYPT_CBC) != 0 ? deliveryStateDto.bottomSections : list9;
        OrderingControlDto orderingControlDto2 = (i & SelfTester_JCP.ENCRYPT_CNT) != 0 ? deliveryStateDto.orderingControl : orderingControlDto;
        NeuroPostcardDto neuroPostcardDto3 = (i & 16777216) != 0 ? deliveryStateDto.neuroPostcard : neuroPostcardDto;
        if ((i & SelfTester_JCP.DECRYPT_CFB) != 0) {
            neuroPostcardDto2 = neuroPostcardDto3;
            topAccentBarDto2 = deliveryStateDto.topAccentBar;
        } else {
            topAccentBarDto2 = topAccentBarDto;
            neuroPostcardDto2 = neuroPostcardDto3;
        }
        return deliveryStateDto.copy(deliveryStateContextDto3, str3, str4, performerDto2, deliveryIconStrategyDto2, list10, list11, performerRouteDto2, list12, list13, list14, paidWaitingInfoDto2, obj3, list15, postcardConsumerInfoDto2, timelineDto2, list16, costDetailsDto2, completedStateButtonsDto2, accentStateButtonDto2, pollDto2, list17, list18, orderingControlDto2, neuroPostcardDto2, topAccentBarDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final DeliveryStateContextDto getContext() {
        return this.context;
    }

    public final List<ActionDto> component10() {
        return this.secondaryActions;
    }

    public final List<ContentSectionDto> component11() {
        return this.contentSections;
    }

    /* renamed from: component12, reason: from getter */
    public final PaidWaitingInfoDto getPaidWaitingInfo() {
        return this.paidWaitingInfo;
    }

    /* renamed from: component13, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    public final List<OnFirstLoadActionDto> component14() {
        return this.onFirstLoadActions;
    }

    /* renamed from: component15, reason: from getter */
    public final PostcardConsumerInfoDto getPostcard() {
        return this.postcard;
    }

    /* renamed from: component16, reason: from getter */
    public final TimelineDto getTimeline() {
        return this.timeline;
    }

    public final List<BubbleDto> component17() {
        return this.extraBubbles;
    }

    /* renamed from: component18, reason: from getter */
    public final CostDetailsDto getCostDetails() {
        return this.costDetails;
    }

    /* renamed from: component19, reason: from getter */
    public final CompletedStateButtonsDto getCompletedStateButtons() {
        return this.completedStateButtons;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* renamed from: component20, reason: from getter */
    public final AccentStateButtonDto getAccentStateButton() {
        return this.accentStateButton;
    }

    /* renamed from: component21, reason: from getter */
    public final PollDto getPoll() {
        return this.poll;
    }

    public final List<ContentSectionDto> component22() {
        return this.bottomContentSections;
    }

    public final List<BottomSectionDto> component23() {
        return this.bottomSections;
    }

    /* renamed from: component24, reason: from getter */
    public final OrderingControlDto getOrderingControl() {
        return this.orderingControl;
    }

    /* renamed from: component25, reason: from getter */
    public final NeuroPostcardDto getNeuroPostcard() {
        return this.neuroPostcard;
    }

    /* renamed from: component26, reason: from getter */
    public final TopAccentBarDto getTopAccentBar() {
        return this.topAccentBar;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final PerformerDto getPerformer() {
        return this.performer;
    }

    /* renamed from: component5, reason: from getter */
    public final DeliveryIconStrategyDto getIconStrategy() {
        return this.iconStrategy;
    }

    public final List<StatePointDto> component6() {
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
        return this.primaryActions;
    }

    public final DeliveryStateDto copy(@Json(name = "context") DeliveryStateContextDto context, @Json(name = "summary") String summary, @Json(name = "description") String description, @Json(name = "performer") PerformerDto performer, @Json(name = "icon_strategy") DeliveryIconStrategyDto iconStrategy, @Json(name = "sorted_route_points") List<? extends StatePointDto> sortedRoutePoints, @Json(name = "active_route_points") List<Long> activeRoutePoints, @Json(name = "performer_route") PerformerRouteDto performerRoute, @Json(name = "primary_actions") List<? extends ActionDto> primaryActions, @Json(name = "secondary_actions") List<? extends ActionDto> secondaryActions, @Json(name = "content_sections") List<ContentSectionDto> contentSections, @Json(name = "paid_waiting_info") PaidWaitingInfoDto paidWaitingInfo, @Json(name = "meta") Object meta, @Json(name = "on_first_load_actions") List<OnFirstLoadActionDto> onFirstLoadActions, @Json(name = "postcard") PostcardConsumerInfoDto postcard, @Json(name = "timeline") TimelineDto timeline, @Json(name = "extra_bubbles") List<BubbleDto> extraBubbles, @Json(name = "cost_details") CostDetailsDto costDetails, @Json(name = "completed_state_buttons") CompletedStateButtonsDto completedStateButtons, @Json(name = "accent_state_button") AccentStateButtonDto accentStateButton, @Json(name = "poll") PollDto poll, @Json(name = "bottom_content_sections") List<ContentSectionDto> bottomContentSections, @Json(name = "bottom_sections") List<BottomSectionDto> bottomSections, @Json(name = "ordering_control") OrderingControlDto orderingControl, @Json(name = "neuro_postcard") NeuroPostcardDto neuroPostcard, @Json(name = "top_accent_bar") TopAccentBarDto topAccentBar) {
        return new DeliveryStateDto(context, summary, description, performer, iconStrategy, sortedRoutePoints, activeRoutePoints, performerRoute, primaryActions, secondaryActions, contentSections, paidWaitingInfo, meta, onFirstLoadActions, postcard, timeline, extraBubbles, costDetails, completedStateButtons, accentStateButton, poll, bottomContentSections, bottomSections, orderingControl, neuroPostcard, topAccentBar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryStateDto)) {
            return false;
        }
        DeliveryStateDto deliveryStateDto = (DeliveryStateDto) other;
        return jl40.l(this.context, deliveryStateDto.context) && jl40.l(this.summary, deliveryStateDto.summary) && jl40.l(this.description, deliveryStateDto.description) && jl40.l(this.performer, deliveryStateDto.performer) && jl40.l(this.iconStrategy, deliveryStateDto.iconStrategy) && jl40.l(this.sortedRoutePoints, deliveryStateDto.sortedRoutePoints) && jl40.l(this.activeRoutePoints, deliveryStateDto.activeRoutePoints) && jl40.l(this.performerRoute, deliveryStateDto.performerRoute) && jl40.l(this.primaryActions, deliveryStateDto.primaryActions) && jl40.l(this.secondaryActions, deliveryStateDto.secondaryActions) && jl40.l(this.contentSections, deliveryStateDto.contentSections) && jl40.l(this.paidWaitingInfo, deliveryStateDto.paidWaitingInfo) && jl40.l(this.meta, deliveryStateDto.meta) && jl40.l(this.onFirstLoadActions, deliveryStateDto.onFirstLoadActions) && jl40.l(this.postcard, deliveryStateDto.postcard) && jl40.l(this.timeline, deliveryStateDto.timeline) && jl40.l(this.extraBubbles, deliveryStateDto.extraBubbles) && jl40.l(this.costDetails, deliveryStateDto.costDetails) && jl40.l(this.completedStateButtons, deliveryStateDto.completedStateButtons) && jl40.l(this.accentStateButton, deliveryStateDto.accentStateButton) && jl40.l(this.poll, deliveryStateDto.poll) && jl40.l(this.bottomContentSections, deliveryStateDto.bottomContentSections) && jl40.l(this.bottomSections, deliveryStateDto.bottomSections) && jl40.l(this.orderingControl, deliveryStateDto.orderingControl) && jl40.l(this.neuroPostcard, deliveryStateDto.neuroPostcard) && jl40.l(this.topAccentBar, deliveryStateDto.topAccentBar);
    }

    public final AccentStateButtonDto getAccentStateButton() {
        return this.accentStateButton;
    }

    public final List<Long> getActiveRoutePoints() {
        return this.activeRoutePoints;
    }

    public final List<ContentSectionDto> getBottomContentSections() {
        return this.bottomContentSections;
    }

    public final List<BottomSectionDto> getBottomSections() {
        return this.bottomSections;
    }

    public final CompletedStateButtonsDto getCompletedStateButtons() {
        return this.completedStateButtons;
    }

    public final List<ContentSectionDto> getContentSections() {
        return this.contentSections;
    }

    public final DeliveryStateContextDto getContext() {
        return this.context;
    }

    public final CostDetailsDto getCostDetails() {
        return this.costDetails;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<BubbleDto> getExtraBubbles() {
        return this.extraBubbles;
    }

    public final DeliveryIconStrategyDto getIconStrategy() {
        return this.iconStrategy;
    }

    public final Object getMeta() {
        return this.meta;
    }

    public final NeuroPostcardDto getNeuroPostcard() {
        return this.neuroPostcard;
    }

    public final List<OnFirstLoadActionDto> getOnFirstLoadActions() {
        return this.onFirstLoadActions;
    }

    public final OrderingControlDto getOrderingControl() {
        return this.orderingControl;
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

    public final PollDto getPoll() {
        return this.poll;
    }

    public final PostcardConsumerInfoDto getPostcard() {
        return this.postcard;
    }

    public final List<ActionDto> getPrimaryActions() {
        return this.primaryActions;
    }

    public final List<ActionDto> getSecondaryActions() {
        return this.secondaryActions;
    }

    public final List<StatePointDto> getSortedRoutePoints() {
        return this.sortedRoutePoints;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final TimelineDto getTimeline() {
        return this.timeline;
    }

    public final TopAccentBarDto getTopAccentBar() {
        return this.topAccentBar;
    }

    public int hashCode() {
        int b = unr0.b(this.context.hashCode() * 31, 31, this.summary);
        String str = this.description;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        PerformerDto performerDto = this.performer;
        int hashCode2 = (hashCode + (performerDto == null ? 0 : performerDto.hashCode())) * 31;
        DeliveryIconStrategyDto deliveryIconStrategyDto = this.iconStrategy;
        int c = unr0.c(unr0.c((hashCode2 + (deliveryIconStrategyDto == null ? 0 : deliveryIconStrategyDto.hashCode())) * 31, 31, this.sortedRoutePoints), 31, this.activeRoutePoints);
        PerformerRouteDto performerRouteDto = this.performerRoute;
        int c2 = unr0.c(unr0.c((c + (performerRouteDto == null ? 0 : performerRouteDto.hashCode())) * 31, 31, this.primaryActions), 31, this.secondaryActions);
        List<ContentSectionDto> list = this.contentSections;
        int hashCode3 = (c2 + (list == null ? 0 : list.hashCode())) * 31;
        PaidWaitingInfoDto paidWaitingInfoDto = this.paidWaitingInfo;
        int c3 = smw0.c((hashCode3 + (paidWaitingInfoDto == null ? 0 : paidWaitingInfoDto.hashCode())) * 31, 31, this.meta);
        List<OnFirstLoadActionDto> list2 = this.onFirstLoadActions;
        int hashCode4 = (c3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        PostcardConsumerInfoDto postcardConsumerInfoDto = this.postcard;
        int hashCode5 = (hashCode4 + (postcardConsumerInfoDto == null ? 0 : postcardConsumerInfoDto.hashCode())) * 31;
        TimelineDto timelineDto = this.timeline;
        int hashCode6 = (hashCode5 + (timelineDto == null ? 0 : timelineDto.hashCode())) * 31;
        List<BubbleDto> list3 = this.extraBubbles;
        int hashCode7 = (hashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        CostDetailsDto costDetailsDto = this.costDetails;
        int hashCode8 = (hashCode7 + (costDetailsDto == null ? 0 : costDetailsDto.hashCode())) * 31;
        CompletedStateButtonsDto completedStateButtonsDto = this.completedStateButtons;
        int hashCode9 = (hashCode8 + (completedStateButtonsDto == null ? 0 : completedStateButtonsDto.hashCode())) * 31;
        AccentStateButtonDto accentStateButtonDto = this.accentStateButton;
        int hashCode10 = (hashCode9 + (accentStateButtonDto == null ? 0 : accentStateButtonDto.hashCode())) * 31;
        PollDto pollDto = this.poll;
        int hashCode11 = (hashCode10 + (pollDto == null ? 0 : pollDto.hashCode())) * 31;
        List<ContentSectionDto> list4 = this.bottomContentSections;
        int hashCode12 = (hashCode11 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<BottomSectionDto> list5 = this.bottomSections;
        int hashCode13 = (hashCode12 + (list5 == null ? 0 : list5.hashCode())) * 31;
        OrderingControlDto orderingControlDto = this.orderingControl;
        int hashCode14 = (hashCode13 + (orderingControlDto == null ? 0 : orderingControlDto.hashCode())) * 31;
        NeuroPostcardDto neuroPostcardDto = this.neuroPostcard;
        int hashCode15 = (hashCode14 + (neuroPostcardDto == null ? 0 : neuroPostcardDto.hashCode())) * 31;
        TopAccentBarDto topAccentBarDto = this.topAccentBar;
        return hashCode15 + (topAccentBarDto != null ? topAccentBarDto.hashCode() : 0);
    }

    public String toString() {
        DeliveryStateContextDto deliveryStateContextDto = this.context;
        String str = this.summary;
        String str2 = this.description;
        PerformerDto performerDto = this.performer;
        DeliveryIconStrategyDto deliveryIconStrategyDto = this.iconStrategy;
        List<StatePointDto> list = this.sortedRoutePoints;
        List<Long> list2 = this.activeRoutePoints;
        PerformerRouteDto performerRouteDto = this.performerRoute;
        List<ActionDto> list3 = this.primaryActions;
        List<ActionDto> list4 = this.secondaryActions;
        List<ContentSectionDto> list5 = this.contentSections;
        PaidWaitingInfoDto paidWaitingInfoDto = this.paidWaitingInfo;
        Object obj = this.meta;
        List<OnFirstLoadActionDto> list6 = this.onFirstLoadActions;
        PostcardConsumerInfoDto postcardConsumerInfoDto = this.postcard;
        TimelineDto timelineDto = this.timeline;
        List<BubbleDto> list7 = this.extraBubbles;
        CostDetailsDto costDetailsDto = this.costDetails;
        CompletedStateButtonsDto completedStateButtonsDto = this.completedStateButtons;
        AccentStateButtonDto accentStateButtonDto = this.accentStateButton;
        PollDto pollDto = this.poll;
        List<ContentSectionDto> list8 = this.bottomContentSections;
        List<BottomSectionDto> list9 = this.bottomSections;
        OrderingControlDto orderingControlDto = this.orderingControl;
        NeuroPostcardDto neuroPostcardDto = this.neuroPostcard;
        TopAccentBarDto topAccentBarDto = this.topAccentBar;
        StringBuilder sb = new StringBuilder("DeliveryStateDto(context=");
        sb.append(deliveryStateContextDto);
        sb.append(", summary=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", performer=");
        sb.append(performerDto);
        sb.append(", iconStrategy=");
        sb.append(deliveryIconStrategyDto);
        sb.append(", sortedRoutePoints=");
        sb.append(list);
        sb.append(", activeRoutePoints=");
        sb.append(list2);
        sb.append(", performerRoute=");
        sb.append(performerRouteDto);
        sb.append(", primaryActions=");
        nnm.w(sb, list3, ", secondaryActions=", list4, ", contentSections=");
        sb.append(list5);
        sb.append(", paidWaitingInfo=");
        sb.append(paidWaitingInfoDto);
        sb.append(", meta=");
        sb.append(obj);
        sb.append(", onFirstLoadActions=");
        sb.append(list6);
        sb.append(", postcard=");
        sb.append(postcardConsumerInfoDto);
        sb.append(", timeline=");
        sb.append(timelineDto);
        sb.append(", extraBubbles=");
        sb.append(list7);
        sb.append(", costDetails=");
        sb.append(costDetailsDto);
        sb.append(", completedStateButtons=");
        sb.append(completedStateButtonsDto);
        sb.append(", accentStateButton=");
        sb.append(accentStateButtonDto);
        sb.append(", poll=");
        sb.append(pollDto);
        sb.append(", bottomContentSections=");
        sb.append(list8);
        sb.append(", bottomSections=");
        sb.append(list9);
        sb.append(", orderingControl=");
        sb.append(orderingControlDto);
        sb.append(", neuroPostcard=");
        sb.append(neuroPostcardDto);
        sb.append(", topAccentBar=");
        sb.append(topAccentBarDto);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
