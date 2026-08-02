package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliveriesstate;

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
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliveriesstate.DeliveriesStateDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.BottomSectionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.PaidWaitingInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.PerformerDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.PerformerRouteDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.timeline.TimelineDto;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\fR \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\fR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\fR\"\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveriesstate/DeliveriesStateDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveriesstate/DeliveriesStateDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveriesstate/DeliveriesStateDto$ContextDto;", "contextDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/DeliveryIconStrategyDto;", "nullableDeliveryIconStrategyDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerDto;", "nullablePerformerDtoAdapter", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveriesstate/DeliveriesPointDto;", "listOfDeliveriesPointDtoAdapter", "", "listOfLongAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerRouteDto;", "nullablePerformerRouteDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionDto;", "listOfActionDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PaidWaitingInfoDto;", "nullablePaidWaitingInfoDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineDto;", "nullableTimelineDtoAdapter", "", "anyAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/BottomSectionDto;", "nullableListOfBottomSectionDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DeliveriesStateDtoJsonAdapter extends JsonAdapter<DeliveriesStateDto> {
    private final JsonAdapter<Object> anyAdapter;
    private final JsonAdapter<DeliveriesStateDto.ContextDto> contextDtoAdapter;
    private final JsonAdapter<List<ActionDto>> listOfActionDtoAdapter;
    private final JsonAdapter<List<DeliveriesPointDto>> listOfDeliveriesPointDtoAdapter;
    private final JsonAdapter<List<Long>> listOfLongAdapter;
    private final JsonAdapter<DeliveryIconStrategyDto> nullableDeliveryIconStrategyDtoAdapter;
    private final JsonAdapter<List<BottomSectionDto>> nullableListOfBottomSectionDtoAdapter;
    private final JsonAdapter<PaidWaitingInfoDto> nullablePaidWaitingInfoDtoAdapter;
    private final JsonAdapter<PerformerDto> nullablePerformerDtoAdapter;
    private final JsonAdapter<PerformerRouteDto> nullablePerformerRouteDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TimelineDto> nullableTimelineDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("context", "summary", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "icon_strategy", "performer", "sorted_route_points", "active_route_points", "performer_route", "actions", "paid_waiting_info", "timeline", Constants.REFERRER_API_META, "bottom_sections");
    private final JsonAdapter<String> stringAdapter;

    public DeliveriesStateDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.contextDtoAdapter = moshi.adapter(DeliveriesStateDto.ContextDto.class, emptySet, "context");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "summary");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableDeliveryIconStrategyDtoAdapter = moshi.adapter(DeliveryIconStrategyDto.class, emptySet, "iconStrategy");
        this.nullablePerformerDtoAdapter = moshi.adapter(PerformerDto.class, emptySet, "performer");
        this.listOfDeliveriesPointDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, DeliveriesPointDto.class), emptySet, "sortedRoutePoints");
        this.listOfLongAdapter = moshi.adapter(Types.newParameterizedType(List.class, Long.class), emptySet, "activeRoutePoints");
        this.nullablePerformerRouteDtoAdapter = moshi.adapter(PerformerRouteDto.class, emptySet, "performerRoute");
        this.listOfActionDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, ActionDto.class), emptySet, "actions");
        this.nullablePaidWaitingInfoDtoAdapter = moshi.adapter(PaidWaitingInfoDto.class, emptySet, "paidWaitingInfo");
        this.nullableTimelineDtoAdapter = moshi.adapter(TimelineDto.class, emptySet, "timeline");
        this.anyAdapter = moshi.adapter(Object.class, emptySet, Constants.REFERRER_API_META);
        this.nullableListOfBottomSectionDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, BottomSectionDto.class), emptySet, "bottomSections");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DeliveriesStateDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        DeliveriesStateDto.ContextDto contextDto = null;
        String str = null;
        String str2 = null;
        DeliveryIconStrategyDto deliveryIconStrategyDto = null;
        PerformerDto performerDto = null;
        List<DeliveriesPointDto> list = null;
        List<Long> list2 = null;
        PerformerRouteDto performerRouteDto = null;
        List<ActionDto> list3 = null;
        PaidWaitingInfoDto paidWaitingInfoDto = null;
        TimelineDto timelineDto = null;
        Object obj = null;
        List<BottomSectionDto> list4 = null;
        while (true) {
            DeliveriesStateDto.ContextDto contextDto2 = contextDto;
            String str3 = str;
            String str4 = str2;
            DeliveryIconStrategyDto deliveryIconStrategyDto2 = deliveryIconStrategyDto;
            PerformerDto performerDto2 = performerDto;
            List<DeliveriesPointDto> list5 = list;
            if (!jsonReader.hasNext()) {
                List<Long> list6 = list2;
                jsonReader.endObject();
                if (contextDto2 == null) {
                    throw Util.missingProperty("context", "context", jsonReader);
                }
                if (str3 == null) {
                    throw Util.missingProperty("summary", "summary", jsonReader);
                }
                if (list5 == null) {
                    throw Util.missingProperty("sortedRoutePoints", "sorted_route_points", jsonReader);
                }
                if (list6 == null) {
                    throw Util.missingProperty("activeRoutePoints", "active_route_points", jsonReader);
                }
                if (list3 == null) {
                    throw Util.missingProperty("actions", "actions", jsonReader);
                }
                if (obj != null) {
                    return new DeliveriesStateDto(contextDto2, str3, str4, deliveryIconStrategyDto2, performerDto2, list5, list6, performerRouteDto, list3, paidWaitingInfoDto, timelineDto, obj, list4);
                }
                throw Util.missingProperty(Constants.REFERRER_API_META, Constants.REFERRER_API_META, jsonReader);
            }
            List<Long> list7 = list2;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    list2 = list7;
                    contextDto = contextDto2;
                    str = str3;
                    str2 = str4;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    performerDto = performerDto2;
                    list = list5;
                case 0:
                    contextDto = this.contextDtoAdapter.fromJson(jsonReader);
                    if (contextDto == null) {
                        throw Util.unexpectedNull("context", "context", jsonReader);
                    }
                    list2 = list7;
                    str = str3;
                    str2 = str4;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    performerDto = performerDto2;
                    list = list5;
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("summary", "summary", jsonReader);
                    }
                    list2 = list7;
                    contextDto = contextDto2;
                    str2 = str4;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    performerDto = performerDto2;
                    list = list5;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    list2 = list7;
                    contextDto = contextDto2;
                    str = str3;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    performerDto = performerDto2;
                    list = list5;
                case 3:
                    deliveryIconStrategyDto = this.nullableDeliveryIconStrategyDtoAdapter.fromJson(jsonReader);
                    list2 = list7;
                    contextDto = contextDto2;
                    str = str3;
                    str2 = str4;
                    performerDto = performerDto2;
                    list = list5;
                case 4:
                    performerDto = this.nullablePerformerDtoAdapter.fromJson(jsonReader);
                    list2 = list7;
                    contextDto = contextDto2;
                    str = str3;
                    str2 = str4;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    list = list5;
                case 5:
                    list = this.listOfDeliveriesPointDtoAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("sortedRoutePoints", "sorted_route_points", jsonReader);
                    }
                    list2 = list7;
                    contextDto = contextDto2;
                    str = str3;
                    str2 = str4;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    performerDto = performerDto2;
                case 6:
                    list2 = this.listOfLongAdapter.fromJson(jsonReader);
                    if (list2 == null) {
                        throw Util.unexpectedNull("activeRoutePoints", "active_route_points", jsonReader);
                    }
                    contextDto = contextDto2;
                    str = str3;
                    str2 = str4;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    performerDto = performerDto2;
                    list = list5;
                case 7:
                    performerRouteDto = this.nullablePerformerRouteDtoAdapter.fromJson(jsonReader);
                    list2 = list7;
                    contextDto = contextDto2;
                    str = str3;
                    str2 = str4;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    performerDto = performerDto2;
                    list = list5;
                case 8:
                    list3 = this.listOfActionDtoAdapter.fromJson(jsonReader);
                    if (list3 == null) {
                        throw Util.unexpectedNull("actions", "actions", jsonReader);
                    }
                    list2 = list7;
                    contextDto = contextDto2;
                    str = str3;
                    str2 = str4;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    performerDto = performerDto2;
                    list = list5;
                case 9:
                    paidWaitingInfoDto = this.nullablePaidWaitingInfoDtoAdapter.fromJson(jsonReader);
                    list2 = list7;
                    contextDto = contextDto2;
                    str = str3;
                    str2 = str4;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    performerDto = performerDto2;
                    list = list5;
                case 10:
                    timelineDto = this.nullableTimelineDtoAdapter.fromJson(jsonReader);
                    list2 = list7;
                    contextDto = contextDto2;
                    str = str3;
                    str2 = str4;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    performerDto = performerDto2;
                    list = list5;
                case 11:
                    obj = this.anyAdapter.fromJson(jsonReader);
                    if (obj == null) {
                        throw Util.unexpectedNull(Constants.REFERRER_API_META, Constants.REFERRER_API_META, jsonReader);
                    }
                    list2 = list7;
                    contextDto = contextDto2;
                    str = str3;
                    str2 = str4;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    performerDto = performerDto2;
                    list = list5;
                case 12:
                    list4 = this.nullableListOfBottomSectionDtoAdapter.fromJson(jsonReader);
                    list2 = list7;
                    contextDto = contextDto2;
                    str = str3;
                    str2 = str4;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    performerDto = performerDto2;
                    list = list5;
                default:
                    list2 = list7;
                    contextDto = contextDto2;
                    str = str3;
                    str2 = str4;
                    deliveryIconStrategyDto = deliveryIconStrategyDto2;
                    performerDto = performerDto2;
                    list = list5;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DeliveriesStateDto deliveriesStateDto) {
        DeliveriesStateDto deliveriesStateDto2 = deliveriesStateDto;
        if (deliveriesStateDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("context");
        this.contextDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveriesStateDto2.getContext());
        jsonWriter.name("summary");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) deliveriesStateDto2.getSummary());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) deliveriesStateDto2.getDescription());
        jsonWriter.name("icon_strategy");
        this.nullableDeliveryIconStrategyDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveriesStateDto2.getIconStrategy());
        jsonWriter.name("performer");
        this.nullablePerformerDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveriesStateDto2.getPerformer());
        jsonWriter.name("sorted_route_points");
        this.listOfDeliveriesPointDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveriesStateDto2.getSortedRoutePoints());
        jsonWriter.name("active_route_points");
        this.listOfLongAdapter.toJson(jsonWriter, (JsonWriter) deliveriesStateDto2.getActiveRoutePoints());
        jsonWriter.name("performer_route");
        this.nullablePerformerRouteDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveriesStateDto2.getPerformerRoute());
        jsonWriter.name("actions");
        this.listOfActionDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveriesStateDto2.getActions());
        jsonWriter.name("paid_waiting_info");
        this.nullablePaidWaitingInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveriesStateDto2.getPaidWaitingInfo());
        jsonWriter.name("timeline");
        this.nullableTimelineDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveriesStateDto2.getTimeline());
        jsonWriter.name(Constants.REFERRER_API_META);
        this.anyAdapter.toJson(jsonWriter, (JsonWriter) deliveriesStateDto2.getMeta());
        jsonWriter.name("bottom_sections");
        this.nullableListOfBottomSectionDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveriesStateDto2.getBottomSections());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(DeliveriesStateDto)");
    }
}
