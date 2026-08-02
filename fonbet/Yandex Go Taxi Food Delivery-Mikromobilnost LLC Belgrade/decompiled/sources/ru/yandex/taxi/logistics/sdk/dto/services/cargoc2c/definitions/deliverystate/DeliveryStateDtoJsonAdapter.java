package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.adjust.sdk.Constants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
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

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\fR \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\fR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\fR\"\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\fR\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\fR\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\fR\"\u0010*\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020)\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\fR\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\fR\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\fR\u001c\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\fR\u001c\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\fR\"\u00104\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u000203\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\fR\u001c\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\fR\u001c\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\fR\u001c\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\f¨\u0006;"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeliveryStateDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeliveryStateDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeliveryStateContextDto;", "deliveryStateContextDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerDto;", "nullablePerformerDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/DeliveryIconStrategyDto;", "nullableDeliveryIconStrategyDtoAdapter", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/StatePointDto;", "listOfStatePointDtoAdapter", "", "listOfLongAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerRouteDto;", "nullablePerformerRouteDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionDto;", "listOfActionDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentSectionDto;", "nullableListOfContentSectionDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PaidWaitingInfoDto;", "nullablePaidWaitingInfoDtoAdapter", "", "anyAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/OnFirstLoadActionDto;", "nullableListOfOnFirstLoadActionDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PostcardConsumerInfoDto;", "nullablePostcardConsumerInfoDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineDto;", "nullableTimelineDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/BubbleDto;", "nullableListOfBubbleDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/CostDetailsDto;", "nullableCostDetailsDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/CompletedStateButtonsDto;", "nullableCompletedStateButtonsDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AccentStateButtonDto;", "nullableAccentStateButtonDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PollDto;", "nullablePollDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/BottomSectionDto;", "nullableListOfBottomSectionDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/OrderingControlDto;", "nullableOrderingControlDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardDto;", "nullableNeuroPostcardDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TopAccentBarDto;", "nullableTopAccentBarDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryStateDtoJsonAdapter extends JsonAdapter<DeliveryStateDto> {
    private final JsonAdapter<Object> anyAdapter;
    private final JsonAdapter<DeliveryStateContextDto> deliveryStateContextDtoAdapter;
    private final JsonAdapter<List<ActionDto>> listOfActionDtoAdapter;
    private final JsonAdapter<List<Long>> listOfLongAdapter;
    private final JsonAdapter<List<StatePointDto>> listOfStatePointDtoAdapter;
    private final JsonAdapter<AccentStateButtonDto> nullableAccentStateButtonDtoAdapter;
    private final JsonAdapter<CompletedStateButtonsDto> nullableCompletedStateButtonsDtoAdapter;
    private final JsonAdapter<CostDetailsDto> nullableCostDetailsDtoAdapter;
    private final JsonAdapter<DeliveryIconStrategyDto> nullableDeliveryIconStrategyDtoAdapter;
    private final JsonAdapter<List<BottomSectionDto>> nullableListOfBottomSectionDtoAdapter;
    private final JsonAdapter<List<BubbleDto>> nullableListOfBubbleDtoAdapter;
    private final JsonAdapter<List<ContentSectionDto>> nullableListOfContentSectionDtoAdapter;
    private final JsonAdapter<List<OnFirstLoadActionDto>> nullableListOfOnFirstLoadActionDtoAdapter;
    private final JsonAdapter<NeuroPostcardDto> nullableNeuroPostcardDtoAdapter;
    private final JsonAdapter<OrderingControlDto> nullableOrderingControlDtoAdapter;
    private final JsonAdapter<PaidWaitingInfoDto> nullablePaidWaitingInfoDtoAdapter;
    private final JsonAdapter<PerformerDto> nullablePerformerDtoAdapter;
    private final JsonAdapter<PerformerRouteDto> nullablePerformerRouteDtoAdapter;
    private final JsonAdapter<PollDto> nullablePollDtoAdapter;
    private final JsonAdapter<PostcardConsumerInfoDto> nullablePostcardConsumerInfoDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TimelineDto> nullableTimelineDtoAdapter;
    private final JsonAdapter<TopAccentBarDto> nullableTopAccentBarDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("context", "summary", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "performer", "icon_strategy", "sorted_route_points", "active_route_points", "performer_route", "primary_actions", "secondary_actions", "content_sections", "paid_waiting_info", Constants.REFERRER_API_META, "on_first_load_actions", "postcard", "timeline", "extra_bubbles", "cost_details", "completed_state_buttons", "accent_state_button", "poll", "bottom_content_sections", "bottom_sections", "ordering_control", "neuro_postcard", "top_accent_bar");
    private final JsonAdapter<String> stringAdapter;

    public DeliveryStateDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.deliveryStateContextDtoAdapter = moshi.adapter(DeliveryStateContextDto.class, emptySet, "context");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "summary");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullablePerformerDtoAdapter = moshi.adapter(PerformerDto.class, emptySet, "performer");
        this.nullableDeliveryIconStrategyDtoAdapter = moshi.adapter(DeliveryIconStrategyDto.class, emptySet, "iconStrategy");
        this.listOfStatePointDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, StatePointDto.class), emptySet, "sortedRoutePoints");
        this.listOfLongAdapter = moshi.adapter(Types.newParameterizedType(List.class, Long.class), emptySet, "activeRoutePoints");
        this.nullablePerformerRouteDtoAdapter = moshi.adapter(PerformerRouteDto.class, emptySet, "performerRoute");
        this.listOfActionDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, ActionDto.class), emptySet, "primaryActions");
        this.nullableListOfContentSectionDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, ContentSectionDto.class), emptySet, "contentSections");
        this.nullablePaidWaitingInfoDtoAdapter = moshi.adapter(PaidWaitingInfoDto.class, emptySet, "paidWaitingInfo");
        this.anyAdapter = moshi.adapter(Object.class, emptySet, Constants.REFERRER_API_META);
        this.nullableListOfOnFirstLoadActionDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, OnFirstLoadActionDto.class), emptySet, "onFirstLoadActions");
        this.nullablePostcardConsumerInfoDtoAdapter = moshi.adapter(PostcardConsumerInfoDto.class, emptySet, "postcard");
        this.nullableTimelineDtoAdapter = moshi.adapter(TimelineDto.class, emptySet, "timeline");
        this.nullableListOfBubbleDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, BubbleDto.class), emptySet, "extraBubbles");
        this.nullableCostDetailsDtoAdapter = moshi.adapter(CostDetailsDto.class, emptySet, "costDetails");
        this.nullableCompletedStateButtonsDtoAdapter = moshi.adapter(CompletedStateButtonsDto.class, emptySet, "completedStateButtons");
        this.nullableAccentStateButtonDtoAdapter = moshi.adapter(AccentStateButtonDto.class, emptySet, "accentStateButton");
        this.nullablePollDtoAdapter = moshi.adapter(PollDto.class, emptySet, "poll");
        this.nullableListOfBottomSectionDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, BottomSectionDto.class), emptySet, "bottomSections");
        this.nullableOrderingControlDtoAdapter = moshi.adapter(OrderingControlDto.class, emptySet, "orderingControl");
        this.nullableNeuroPostcardDtoAdapter = moshi.adapter(NeuroPostcardDto.class, emptySet, "neuroPostcard");
        this.nullableTopAccentBarDtoAdapter = moshi.adapter(TopAccentBarDto.class, emptySet, "topAccentBar");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DeliveryStateDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        DeliveryStateContextDto deliveryStateContextDto = null;
        String str = null;
        String str2 = null;
        PerformerDto performerDto = null;
        DeliveryIconStrategyDto deliveryIconStrategyDto = null;
        List<StatePointDto> list = null;
        List<Long> list2 = null;
        PerformerRouteDto performerRouteDto = null;
        List<ActionDto> list3 = null;
        List<ActionDto> list4 = null;
        List<ContentSectionDto> list5 = null;
        PaidWaitingInfoDto paidWaitingInfoDto = null;
        Object obj = null;
        List<OnFirstLoadActionDto> list6 = null;
        PostcardConsumerInfoDto postcardConsumerInfoDto = null;
        TimelineDto timelineDto = null;
        List<BubbleDto> list7 = null;
        CostDetailsDto costDetailsDto = null;
        CompletedStateButtonsDto completedStateButtonsDto = null;
        AccentStateButtonDto accentStateButtonDto = null;
        PollDto pollDto = null;
        List<ContentSectionDto> list8 = null;
        List<BottomSectionDto> list9 = null;
        OrderingControlDto orderingControlDto = null;
        NeuroPostcardDto neuroPostcardDto = null;
        TopAccentBarDto topAccentBarDto = null;
        while (true) {
            DeliveryStateContextDto deliveryStateContextDto2 = deliveryStateContextDto;
            String str3 = str;
            String str4 = str2;
            PerformerDto performerDto2 = performerDto;
            DeliveryIconStrategyDto deliveryIconStrategyDto2 = deliveryIconStrategyDto;
            List<StatePointDto> list10 = list;
            List<Long> list11 = list2;
            PerformerRouteDto performerRouteDto2 = performerRouteDto;
            List<ActionDto> list12 = list3;
            if (!jsonReader.hasNext()) {
                List<ActionDto> list13 = list4;
                jsonReader.endObject();
                if (deliveryStateContextDto2 == null) {
                    throw Util.missingProperty("context", "context", jsonReader);
                }
                if (str3 == null) {
                    throw Util.missingProperty("summary", "summary", jsonReader);
                }
                if (list10 == null) {
                    throw Util.missingProperty("sortedRoutePoints", "sorted_route_points", jsonReader);
                }
                if (list11 == null) {
                    throw Util.missingProperty("activeRoutePoints", "active_route_points", jsonReader);
                }
                if (list12 == null) {
                    throw Util.missingProperty("primaryActions", "primary_actions", jsonReader);
                }
                if (list13 == null) {
                    throw Util.missingProperty("secondaryActions", "secondary_actions", jsonReader);
                }
                if (obj != null) {
                    return new DeliveryStateDto(deliveryStateContextDto2, str3, str4, performerDto2, deliveryIconStrategyDto2, list10, list11, performerRouteDto2, list12, list13, list5, paidWaitingInfoDto, obj, list6, postcardConsumerInfoDto, timelineDto, list7, costDetailsDto, completedStateButtonsDto, accentStateButtonDto, pollDto, list8, list9, orderingControlDto, neuroPostcardDto, topAccentBarDto);
                }
                throw Util.missingProperty(Constants.REFERRER_API_META, Constants.REFERRER_API_META, jsonReader);
            }
            List<ActionDto> list14 = list4;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    list4 = list14;
                    deliveryStateContextDto = deliveryStateContextDto2;
                    str = str3;
                    str2 = str4;
                    performerDto = performerDto2;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    list = list10;
                    list2 = list11;
                    performerRouteDto = performerRouteDto2;
                    list3 = list12;
                case 0:
                    deliveryStateContextDto = this.deliveryStateContextDtoAdapter.fromJson(jsonReader);
                    if (deliveryStateContextDto == null) {
                        throw Util.unexpectedNull("context", "context", jsonReader);
                    }
                    list4 = list14;
                    str = str3;
                    str2 = str4;
                    performerDto = performerDto2;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    list = list10;
                    list2 = list11;
                    performerRouteDto = performerRouteDto2;
                    list3 = list12;
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("summary", "summary", jsonReader);
                    }
                    list4 = list14;
                    deliveryStateContextDto = deliveryStateContextDto2;
                    str2 = str4;
                    performerDto = performerDto2;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    list = list10;
                    list2 = list11;
                    performerRouteDto = performerRouteDto2;
                    list3 = list12;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    list4 = list14;
                    deliveryStateContextDto = deliveryStateContextDto2;
                    str = str3;
                    performerDto = performerDto2;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    list = list10;
                    list2 = list11;
                    performerRouteDto = performerRouteDto2;
                    list3 = list12;
                case 3:
                    performerDto = this.nullablePerformerDtoAdapter.fromJson(jsonReader);
                    list4 = list14;
                    deliveryStateContextDto = deliveryStateContextDto2;
                    str = str3;
                    str2 = str4;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    list = list10;
                    list2 = list11;
                    performerRouteDto = performerRouteDto2;
                    list3 = list12;
                case 4:
                    deliveryIconStrategyDto = this.nullableDeliveryIconStrategyDtoAdapter.fromJson(jsonReader);
                    list4 = list14;
                    deliveryStateContextDto = deliveryStateContextDto2;
                    str = str3;
                    str2 = str4;
                    performerDto = performerDto2;
                    list = list10;
                    list2 = list11;
                    performerRouteDto = performerRouteDto2;
                    list3 = list12;
                case 5:
                    list = this.listOfStatePointDtoAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("sortedRoutePoints", "sorted_route_points", jsonReader);
                    }
                    list4 = list14;
                    deliveryStateContextDto = deliveryStateContextDto2;
                    str = str3;
                    str2 = str4;
                    performerDto = performerDto2;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    list2 = list11;
                    performerRouteDto = performerRouteDto2;
                    list3 = list12;
                case 6:
                    list2 = this.listOfLongAdapter.fromJson(jsonReader);
                    if (list2 == null) {
                        throw Util.unexpectedNull("activeRoutePoints", "active_route_points", jsonReader);
                    }
                    list4 = list14;
                    deliveryStateContextDto = deliveryStateContextDto2;
                    str = str3;
                    str2 = str4;
                    performerDto = performerDto2;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    list = list10;
                    performerRouteDto = performerRouteDto2;
                    list3 = list12;
                case 7:
                    performerRouteDto = this.nullablePerformerRouteDtoAdapter.fromJson(jsonReader);
                    list4 = list14;
                    deliveryStateContextDto = deliveryStateContextDto2;
                    str = str3;
                    str2 = str4;
                    performerDto = performerDto2;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    list = list10;
                    list2 = list11;
                    list3 = list12;
                case 8:
                    list3 = this.listOfActionDtoAdapter.fromJson(jsonReader);
                    if (list3 == null) {
                        throw Util.unexpectedNull("primaryActions", "primary_actions", jsonReader);
                    }
                    list4 = list14;
                    deliveryStateContextDto = deliveryStateContextDto2;
                    str = str3;
                    str2 = str4;
                    performerDto = performerDto2;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    list = list10;
                    list2 = list11;
                    performerRouteDto = performerRouteDto2;
                case 9:
                    list4 = this.listOfActionDtoAdapter.fromJson(jsonReader);
                    if (list4 == null) {
                        throw Util.unexpectedNull("secondaryActions", "secondary_actions", jsonReader);
                    }
                    deliveryStateContextDto = deliveryStateContextDto2;
                    str = str3;
                    str2 = str4;
                    performerDto = performerDto2;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    list = list10;
                    list2 = list11;
                    performerRouteDto = performerRouteDto2;
                    list3 = list12;
                case 10:
                    list5 = this.nullableListOfContentSectionDtoAdapter.fromJson(jsonReader);
                    list4 = list14;
                    deliveryStateContextDto = deliveryStateContextDto2;
                    str = str3;
                    str2 = str4;
                    performerDto = performerDto2;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    list = list10;
                    list2 = list11;
                    performerRouteDto = performerRouteDto2;
                    list3 = list12;
                case 11:
                    paidWaitingInfoDto = this.nullablePaidWaitingInfoDtoAdapter.fromJson(jsonReader);
                    list4 = list14;
                    deliveryStateContextDto = deliveryStateContextDto2;
                    str = str3;
                    str2 = str4;
                    performerDto = performerDto2;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    list = list10;
                    list2 = list11;
                    performerRouteDto = performerRouteDto2;
                    list3 = list12;
                case 12:
                    obj = this.anyAdapter.fromJson(jsonReader);
                    if (obj == null) {
                        throw Util.unexpectedNull(Constants.REFERRER_API_META, Constants.REFERRER_API_META, jsonReader);
                    }
                    list4 = list14;
                    deliveryStateContextDto = deliveryStateContextDto2;
                    str = str3;
                    str2 = str4;
                    performerDto = performerDto2;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    list = list10;
                    list2 = list11;
                    performerRouteDto = performerRouteDto2;
                    list3 = list12;
                case 13:
                    list6 = this.nullableListOfOnFirstLoadActionDtoAdapter.fromJson(jsonReader);
                    list4 = list14;
                    deliveryStateContextDto = deliveryStateContextDto2;
                    str = str3;
                    str2 = str4;
                    performerDto = performerDto2;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    list = list10;
                    list2 = list11;
                    performerRouteDto = performerRouteDto2;
                    list3 = list12;
                case 14:
                    postcardConsumerInfoDto = this.nullablePostcardConsumerInfoDtoAdapter.fromJson(jsonReader);
                    list4 = list14;
                    deliveryStateContextDto = deliveryStateContextDto2;
                    str = str3;
                    str2 = str4;
                    performerDto = performerDto2;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    list = list10;
                    list2 = list11;
                    performerRouteDto = performerRouteDto2;
                    list3 = list12;
                case 15:
                    timelineDto = this.nullableTimelineDtoAdapter.fromJson(jsonReader);
                    list4 = list14;
                    deliveryStateContextDto = deliveryStateContextDto2;
                    str = str3;
                    str2 = str4;
                    performerDto = performerDto2;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    list = list10;
                    list2 = list11;
                    performerRouteDto = performerRouteDto2;
                    list3 = list12;
                case 16:
                    list7 = this.nullableListOfBubbleDtoAdapter.fromJson(jsonReader);
                    list4 = list14;
                    deliveryStateContextDto = deliveryStateContextDto2;
                    str = str3;
                    str2 = str4;
                    performerDto = performerDto2;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    list = list10;
                    list2 = list11;
                    performerRouteDto = performerRouteDto2;
                    list3 = list12;
                case 17:
                    costDetailsDto = this.nullableCostDetailsDtoAdapter.fromJson(jsonReader);
                    list4 = list14;
                    deliveryStateContextDto = deliveryStateContextDto2;
                    str = str3;
                    str2 = str4;
                    performerDto = performerDto2;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    list = list10;
                    list2 = list11;
                    performerRouteDto = performerRouteDto2;
                    list3 = list12;
                case 18:
                    completedStateButtonsDto = this.nullableCompletedStateButtonsDtoAdapter.fromJson(jsonReader);
                    list4 = list14;
                    deliveryStateContextDto = deliveryStateContextDto2;
                    str = str3;
                    str2 = str4;
                    performerDto = performerDto2;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    list = list10;
                    list2 = list11;
                    performerRouteDto = performerRouteDto2;
                    list3 = list12;
                case 19:
                    accentStateButtonDto = this.nullableAccentStateButtonDtoAdapter.fromJson(jsonReader);
                    list4 = list14;
                    deliveryStateContextDto = deliveryStateContextDto2;
                    str = str3;
                    str2 = str4;
                    performerDto = performerDto2;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    list = list10;
                    list2 = list11;
                    performerRouteDto = performerRouteDto2;
                    list3 = list12;
                case 20:
                    pollDto = this.nullablePollDtoAdapter.fromJson(jsonReader);
                    list4 = list14;
                    deliveryStateContextDto = deliveryStateContextDto2;
                    str = str3;
                    str2 = str4;
                    performerDto = performerDto2;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    list = list10;
                    list2 = list11;
                    performerRouteDto = performerRouteDto2;
                    list3 = list12;
                case 21:
                    list8 = this.nullableListOfContentSectionDtoAdapter.fromJson(jsonReader);
                    list4 = list14;
                    deliveryStateContextDto = deliveryStateContextDto2;
                    str = str3;
                    str2 = str4;
                    performerDto = performerDto2;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    list = list10;
                    list2 = list11;
                    performerRouteDto = performerRouteDto2;
                    list3 = list12;
                case 22:
                    list9 = this.nullableListOfBottomSectionDtoAdapter.fromJson(jsonReader);
                    list4 = list14;
                    deliveryStateContextDto = deliveryStateContextDto2;
                    str = str3;
                    str2 = str4;
                    performerDto = performerDto2;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    list = list10;
                    list2 = list11;
                    performerRouteDto = performerRouteDto2;
                    list3 = list12;
                case 23:
                    orderingControlDto = this.nullableOrderingControlDtoAdapter.fromJson(jsonReader);
                    list4 = list14;
                    deliveryStateContextDto = deliveryStateContextDto2;
                    str = str3;
                    str2 = str4;
                    performerDto = performerDto2;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    list = list10;
                    list2 = list11;
                    performerRouteDto = performerRouteDto2;
                    list3 = list12;
                case 24:
                    neuroPostcardDto = this.nullableNeuroPostcardDtoAdapter.fromJson(jsonReader);
                    list4 = list14;
                    deliveryStateContextDto = deliveryStateContextDto2;
                    str = str3;
                    str2 = str4;
                    performerDto = performerDto2;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    list = list10;
                    list2 = list11;
                    performerRouteDto = performerRouteDto2;
                    list3 = list12;
                case 25:
                    topAccentBarDto = this.nullableTopAccentBarDtoAdapter.fromJson(jsonReader);
                    list4 = list14;
                    deliveryStateContextDto = deliveryStateContextDto2;
                    str = str3;
                    str2 = str4;
                    performerDto = performerDto2;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    list = list10;
                    list2 = list11;
                    performerRouteDto = performerRouteDto2;
                    list3 = list12;
                default:
                    list4 = list14;
                    deliveryStateContextDto = deliveryStateContextDto2;
                    str = str3;
                    str2 = str4;
                    performerDto = performerDto2;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    list = list10;
                    list2 = list11;
                    performerRouteDto = performerRouteDto2;
                    list3 = list12;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DeliveryStateDto deliveryStateDto) {
        DeliveryStateDto deliveryStateDto2 = deliveryStateDto;
        if (deliveryStateDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("context");
        this.deliveryStateContextDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateDto2.getContext());
        jsonWriter.name("summary");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateDto2.getSummary());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateDto2.getDescription());
        jsonWriter.name("performer");
        this.nullablePerformerDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateDto2.getPerformer());
        jsonWriter.name("icon_strategy");
        this.nullableDeliveryIconStrategyDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateDto2.getIconStrategy());
        jsonWriter.name("sorted_route_points");
        this.listOfStatePointDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateDto2.getSortedRoutePoints());
        jsonWriter.name("active_route_points");
        this.listOfLongAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateDto2.getActiveRoutePoints());
        jsonWriter.name("performer_route");
        this.nullablePerformerRouteDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateDto2.getPerformerRoute());
        jsonWriter.name("primary_actions");
        this.listOfActionDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateDto2.getPrimaryActions());
        jsonWriter.name("secondary_actions");
        this.listOfActionDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateDto2.getSecondaryActions());
        jsonWriter.name("content_sections");
        this.nullableListOfContentSectionDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateDto2.getContentSections());
        jsonWriter.name("paid_waiting_info");
        this.nullablePaidWaitingInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateDto2.getPaidWaitingInfo());
        jsonWriter.name(Constants.REFERRER_API_META);
        this.anyAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateDto2.getMeta());
        jsonWriter.name("on_first_load_actions");
        this.nullableListOfOnFirstLoadActionDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateDto2.getOnFirstLoadActions());
        jsonWriter.name("postcard");
        this.nullablePostcardConsumerInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateDto2.getPostcard());
        jsonWriter.name("timeline");
        this.nullableTimelineDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateDto2.getTimeline());
        jsonWriter.name("extra_bubbles");
        this.nullableListOfBubbleDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateDto2.getExtraBubbles());
        jsonWriter.name("cost_details");
        this.nullableCostDetailsDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateDto2.getCostDetails());
        jsonWriter.name("completed_state_buttons");
        this.nullableCompletedStateButtonsDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateDto2.getCompletedStateButtons());
        jsonWriter.name("accent_state_button");
        this.nullableAccentStateButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateDto2.getAccentStateButton());
        jsonWriter.name("poll");
        this.nullablePollDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateDto2.getPoll());
        jsonWriter.name("bottom_content_sections");
        this.nullableListOfContentSectionDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateDto2.getBottomContentSections());
        jsonWriter.name("bottom_sections");
        this.nullableListOfBottomSectionDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateDto2.getBottomSections());
        jsonWriter.name("ordering_control");
        this.nullableOrderingControlDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateDto2.getOrderingControl());
        jsonWriter.name("neuro_postcard");
        this.nullableNeuroPostcardDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateDto2.getNeuroPostcard());
        jsonWriter.name("top_accent_bar");
        this.nullableTopAccentBarDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateDto2.getTopAccentBar());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(DeliveryStateDto)");
    }
}
