package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.adjust.sdk.Constants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.RoutePointsIntervalDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.SlotLeadDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\f¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/MultiAddressWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/MultiAddressWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/RoutePointsIntervalDto;", "routePointsIntervalDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "attributedTextDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SlotLeadDto;", "nullableSlotLeadDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;", "nullableSlotTrailDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "nullableTapActionDtoAdapter", "nullableStringAdapter", "", "nullableAnyAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MultiAddressWidgetDtoJsonAdapter extends JsonAdapter<MultiAddressWidgetDto> {
    private final JsonAdapter<AttributedTextDto> attributedTextDtoAdapter;
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<SlotLeadDto> nullableSlotLeadDtoAdapter;
    private final JsonAdapter<SlotTrailDto> nullableSlotTrailDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TapActionDto> nullableTapActionDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("widget_id", "route_points_interval", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "title", "lead", "trail", "action", "metrica_label", Constants.REFERRER_API_META);
    private final JsonAdapter<RoutePointsIntervalDto> routePointsIntervalDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public MultiAddressWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "widgetId");
        this.routePointsIntervalDtoAdapter = moshi.adapter(RoutePointsIntervalDto.class, emptySet, "routePointsInterval");
        this.attributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableSlotLeadDtoAdapter = moshi.adapter(SlotLeadDto.class, emptySet, "lead");
        this.nullableSlotTrailDtoAdapter = moshi.adapter(SlotTrailDto.class, emptySet, "trail");
        this.nullableTapActionDtoAdapter = moshi.adapter(TapActionDto.class, emptySet, "action");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, Constants.REFERRER_API_META);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MultiAddressWidgetDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        RoutePointsIntervalDto routePointsIntervalDto = null;
        AttributedTextDto attributedTextDto = null;
        AttributedTextDto attributedTextDto2 = null;
        SlotLeadDto slotLeadDto = null;
        SlotTrailDto slotTrailDto = null;
        TapActionDto tapActionDto = null;
        String str2 = null;
        Object obj = null;
        while (true) {
            String str3 = str;
            if (!jsonReader.hasNext()) {
                RoutePointsIntervalDto routePointsIntervalDto2 = routePointsIntervalDto;
                jsonReader.endObject();
                if (str3 == null) {
                    throw Util.missingProperty("widgetId", "widget_id", jsonReader);
                }
                if (routePointsIntervalDto2 == null) {
                    throw Util.missingProperty("routePointsInterval", "route_points_interval", jsonReader);
                }
                if (attributedTextDto == null) {
                    throw Util.missingProperty(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                }
                if (attributedTextDto2 != null) {
                    return new MultiAddressWidgetDto(str3, routePointsIntervalDto2, attributedTextDto, attributedTextDto2, slotLeadDto, slotTrailDto, tapActionDto, str2, obj);
                }
                throw Util.missingProperty("title", "title", jsonReader);
            }
            RoutePointsIntervalDto routePointsIntervalDto3 = routePointsIntervalDto;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    routePointsIntervalDto = routePointsIntervalDto3;
                    str = str3;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("widgetId", "widget_id", jsonReader);
                    }
                    routePointsIntervalDto = routePointsIntervalDto3;
                case 1:
                    routePointsIntervalDto = this.routePointsIntervalDtoAdapter.fromJson(jsonReader);
                    if (routePointsIntervalDto == null) {
                        throw Util.unexpectedNull("routePointsInterval", "route_points_interval", jsonReader);
                    }
                    str = str3;
                case 2:
                    attributedTextDto = this.attributedTextDtoAdapter.fromJson(jsonReader);
                    if (attributedTextDto == null) {
                        throw Util.unexpectedNull(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                    }
                    routePointsIntervalDto = routePointsIntervalDto3;
                    str = str3;
                case 3:
                    attributedTextDto2 = this.attributedTextDtoAdapter.fromJson(jsonReader);
                    if (attributedTextDto2 == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    routePointsIntervalDto = routePointsIntervalDto3;
                    str = str3;
                case 4:
                    slotLeadDto = this.nullableSlotLeadDtoAdapter.fromJson(jsonReader);
                    routePointsIntervalDto = routePointsIntervalDto3;
                    str = str3;
                case 5:
                    slotTrailDto = this.nullableSlotTrailDtoAdapter.fromJson(jsonReader);
                    routePointsIntervalDto = routePointsIntervalDto3;
                    str = str3;
                case 6:
                    tapActionDto = this.nullableTapActionDtoAdapter.fromJson(jsonReader);
                    routePointsIntervalDto = routePointsIntervalDto3;
                    str = str3;
                case 7:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    routePointsIntervalDto = routePointsIntervalDto3;
                    str = str3;
                case 8:
                    obj = this.nullableAnyAdapter.fromJson(jsonReader);
                    routePointsIntervalDto = routePointsIntervalDto3;
                    str = str3;
                default:
                    routePointsIntervalDto = routePointsIntervalDto3;
                    str = str3;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MultiAddressWidgetDto multiAddressWidgetDto) {
        MultiAddressWidgetDto multiAddressWidgetDto2 = multiAddressWidgetDto;
        if (multiAddressWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("widget_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) multiAddressWidgetDto2.getWidgetId());
        jsonWriter.name("route_points_interval");
        this.routePointsIntervalDtoAdapter.toJson(jsonWriter, (JsonWriter) multiAddressWidgetDto2.getRoutePointsInterval());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.attributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) multiAddressWidgetDto2.getDescription());
        jsonWriter.name("title");
        this.attributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) multiAddressWidgetDto2.getTitle());
        jsonWriter.name("lead");
        this.nullableSlotLeadDtoAdapter.toJson(jsonWriter, (JsonWriter) multiAddressWidgetDto2.getLead());
        jsonWriter.name("trail");
        this.nullableSlotTrailDtoAdapter.toJson(jsonWriter, (JsonWriter) multiAddressWidgetDto2.getTrail());
        jsonWriter.name("action");
        this.nullableTapActionDtoAdapter.toJson(jsonWriter, (JsonWriter) multiAddressWidgetDto2.getAction());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) multiAddressWidgetDto2.getMetricaLabel());
        jsonWriter.name(Constants.REFERRER_API_META);
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) multiAddressWidgetDto2.getMeta());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(MultiAddressWidgetDto)");
    }
}
