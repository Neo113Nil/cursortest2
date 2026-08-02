package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

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
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.DeliveryStateContextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handlersdefinitions.DisplayTargetsItemDto;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\fR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\f¨\u0006\u001e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeliveryStateContextDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeliveryStateContextDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableLongAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableBooleanAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeliveryStateContextDto$PerformerSearchDto;", "nullablePerformerSearchDtoAdapter", "", "nullableStringAdapter", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/DisplayTargetsItemDto;", "listOfDisplayTargetsItemDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/ObjectsOverMapSettingsDto;", "nullableObjectsOverMapSettingsDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeliveryStateContextDto$FlexSectionDto;", "nullableFlexSectionDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/TrackingPopupDto;", "nullableTrackingPopupDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AdsBannerDto;", "nullableAdsBannerDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryStateContextDtoJsonAdapter extends JsonAdapter<DeliveryStateContextDto> {
    private final JsonAdapter<List<DisplayTargetsItemDto>> listOfDisplayTargetsItemDtoAdapter;
    private final JsonAdapter<AdsBannerDto> nullableAdsBannerDtoAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<DeliveryStateContextDto.FlexSectionDto> nullableFlexSectionDtoAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<ObjectsOverMapSettingsDto> nullableObjectsOverMapSettingsDtoAdapter;
    private final JsonAdapter<DeliveryStateContextDto.PerformerSearchDto> nullablePerformerSearchDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TrackingPopupDto> nullableTrackingPopupDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("server_time", "is_performer_position_available", "present_as_completed", "should_track_geo", "performer_search", "original_order_id", "restore_preorder", "display_targets", "objects_over_map_settings", "shimmering", "provider_status", "provider_tariff_class", "role", "flex_section", "promotion_banners_enabled", "tracking_popup", "ads_banner");

    public DeliveryStateContextDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableLongAdapter = moshi.adapter(Long.class, emptySet, "serverTime");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "isPerformerPositionAvailable");
        this.nullablePerformerSearchDtoAdapter = moshi.adapter(DeliveryStateContextDto.PerformerSearchDto.class, emptySet, "performerSearch");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "originalOrderId");
        this.listOfDisplayTargetsItemDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, DisplayTargetsItemDto.class), emptySet, "displayTargets");
        this.nullableObjectsOverMapSettingsDtoAdapter = moshi.adapter(ObjectsOverMapSettingsDto.class, emptySet, "objectsOverMapSettings");
        this.nullableFlexSectionDtoAdapter = moshi.adapter(DeliveryStateContextDto.FlexSectionDto.class, emptySet, "flexSection");
        this.nullableTrackingPopupDtoAdapter = moshi.adapter(TrackingPopupDto.class, emptySet, "trackingPopup");
        this.nullableAdsBannerDtoAdapter = moshi.adapter(AdsBannerDto.class, emptySet, "adsBanner");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DeliveryStateContextDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Long l = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        DeliveryStateContextDto.PerformerSearchDto performerSearchDto = null;
        String str = null;
        Boolean bool4 = null;
        List<DisplayTargetsItemDto> list = null;
        ObjectsOverMapSettingsDto objectsOverMapSettingsDto = null;
        Boolean bool5 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        DeliveryStateContextDto.FlexSectionDto flexSectionDto = null;
        Boolean bool6 = null;
        TrackingPopupDto trackingPopupDto = null;
        AdsBannerDto adsBannerDto = null;
        while (jsonReader.hasNext()) {
            Long l2 = l;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    l = this.nullableLongAdapter.fromJson(jsonReader);
                    continue;
                case 1:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    bool3 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    performerSearchDto = this.nullablePerformerSearchDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    bool4 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    list = this.listOfDisplayTargetsItemDtoAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("displayTargets", "display_targets", jsonReader);
                    }
                    break;
                case 8:
                    objectsOverMapSettingsDto = this.nullableObjectsOverMapSettingsDtoAdapter.fromJson(jsonReader);
                    break;
                case 9:
                    bool5 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 10:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 11:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 12:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 13:
                    flexSectionDto = this.nullableFlexSectionDtoAdapter.fromJson(jsonReader);
                    break;
                case 14:
                    bool6 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 15:
                    trackingPopupDto = this.nullableTrackingPopupDtoAdapter.fromJson(jsonReader);
                    break;
                case 16:
                    adsBannerDto = this.nullableAdsBannerDtoAdapter.fromJson(jsonReader);
                    break;
            }
            l = l2;
        }
        Long l3 = l;
        jsonReader.endObject();
        if (list != null) {
            return new DeliveryStateContextDto(l3, bool, bool2, bool3, performerSearchDto, str, bool4, list, objectsOverMapSettingsDto, bool5, str2, str3, str4, flexSectionDto, bool6, trackingPopupDto, adsBannerDto);
        }
        throw Util.missingProperty("displayTargets", "display_targets", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DeliveryStateContextDto deliveryStateContextDto) {
        DeliveryStateContextDto deliveryStateContextDto2 = deliveryStateContextDto;
        if (deliveryStateContextDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("server_time");
        this.nullableLongAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateContextDto2.getServerTime());
        jsonWriter.name("is_performer_position_available");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateContextDto2.isPerformerPositionAvailable());
        jsonWriter.name("present_as_completed");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateContextDto2.getPresentAsCompleted());
        jsonWriter.name("should_track_geo");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateContextDto2.getShouldTrackGeo());
        jsonWriter.name("performer_search");
        this.nullablePerformerSearchDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateContextDto2.getPerformerSearch());
        jsonWriter.name("original_order_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateContextDto2.getOriginalOrderId());
        jsonWriter.name("restore_preorder");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateContextDto2.getRestorePreorder());
        jsonWriter.name("display_targets");
        this.listOfDisplayTargetsItemDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateContextDto2.getDisplayTargets());
        jsonWriter.name("objects_over_map_settings");
        this.nullableObjectsOverMapSettingsDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateContextDto2.getObjectsOverMapSettings());
        jsonWriter.name("shimmering");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateContextDto2.getShimmering());
        jsonWriter.name("provider_status");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateContextDto2.getProviderStatus());
        jsonWriter.name("provider_tariff_class");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateContextDto2.getProviderTariffClass());
        jsonWriter.name("role");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateContextDto2.getRole());
        jsonWriter.name("flex_section");
        this.nullableFlexSectionDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateContextDto2.getFlexSection());
        jsonWriter.name("promotion_banners_enabled");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateContextDto2.getPromotionBannersEnabled());
        jsonWriter.name("tracking_popup");
        this.nullableTrackingPopupDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateContextDto2.getTrackingPopup());
        jsonWriter.name("ads_banner");
        this.nullableAdsBannerDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryStateContextDto2.getAdsBanner());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(DeliveryStateContextDto)");
    }
}
