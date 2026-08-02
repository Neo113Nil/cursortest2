package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/TrackingPopupDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/TrackingPopupDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PopupSettingsDto;", "popupSettingsDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/ShowPolicyDto;", "showPolicyDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TrackingPopupDtoJsonAdapter extends JsonAdapter<TrackingPopupDto> {
    private final JsonReader.Options options = JsonReader.Options.of("popup_settings", "show_policy");
    private final JsonAdapter<PopupSettingsDto> popupSettingsDtoAdapter;
    private final JsonAdapter<ShowPolicyDto> showPolicyDtoAdapter;

    public TrackingPopupDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.popupSettingsDtoAdapter = moshi.adapter(PopupSettingsDto.class, emptySet, "popupSettings");
        this.showPolicyDtoAdapter = moshi.adapter(ShowPolicyDto.class, emptySet, "showPolicy");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TrackingPopupDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PopupSettingsDto popupSettingsDto = null;
        ShowPolicyDto showPolicyDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                popupSettingsDto = this.popupSettingsDtoAdapter.fromJson(jsonReader);
                if (popupSettingsDto == null) {
                    throw Util.unexpectedNull("popupSettings", "popup_settings", jsonReader);
                }
            } else if (selectName == 1 && (showPolicyDto = this.showPolicyDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("showPolicy", "show_policy", jsonReader);
            }
        }
        jsonReader.endObject();
        if (popupSettingsDto == null) {
            throw Util.missingProperty("popupSettings", "popup_settings", jsonReader);
        }
        if (showPolicyDto != null) {
            return new TrackingPopupDto(popupSettingsDto, showPolicyDto);
        }
        throw Util.missingProperty("showPolicy", "show_policy", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TrackingPopupDto trackingPopupDto) {
        TrackingPopupDto trackingPopupDto2 = trackingPopupDto;
        if (trackingPopupDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("popup_settings");
        this.popupSettingsDtoAdapter.toJson(jsonWriter, (JsonWriter) trackingPopupDto2.getPopupSettings());
        jsonWriter.name("show_policy");
        this.showPolicyDtoAdapter.toJson(jsonWriter, (JsonWriter) trackingPopupDto2.getShowPolicy());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(TrackingPopupDto)");
    }
}
