package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.missions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ColorDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.missions.MissionProgressDto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionProgressDto_BadgeDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionProgressDto$BadgeDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "colorDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MissionProgressDto_BadgeDtoJsonAdapter extends JsonAdapter<MissionProgressDto.BadgeDto> {
    private final JsonAdapter<ColorDto> colorDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("background_color", "text_color", "text");
    private final JsonAdapter<String> stringAdapter;

    public MissionProgressDto_BadgeDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.colorDtoAdapter = moshi.adapter(ColorDto.class, emptySet, UrbanAdsBottomSheetFragment.BACKGROUND_COLOR);
        this.stringAdapter = moshi.adapter(String.class, emptySet, "text");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MissionProgressDto.BadgeDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ColorDto colorDto = null;
        ColorDto colorDto2 = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                colorDto = this.colorDtoAdapter.fromJson(jsonReader);
                if (colorDto == null) {
                    throw Util.unexpectedNull(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
                }
            } else if (selectName == 1) {
                colorDto2 = this.colorDtoAdapter.fromJson(jsonReader);
                if (colorDto2 == null) {
                    throw Util.unexpectedNull("textColor", "text_color", jsonReader);
                }
            } else if (selectName == 2 && (str = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("text", "text", jsonReader);
            }
        }
        jsonReader.endObject();
        if (colorDto == null) {
            throw Util.missingProperty(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
        }
        if (colorDto2 == null) {
            throw Util.missingProperty("textColor", "text_color", jsonReader);
        }
        if (str != null) {
            return new MissionProgressDto.BadgeDto(colorDto, colorDto2, str);
        }
        throw Util.missingProperty("text", "text", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MissionProgressDto.BadgeDto badgeDto) {
        MissionProgressDto.BadgeDto badgeDto2 = badgeDto;
        if (badgeDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("background_color");
        this.colorDtoAdapter.toJson(jsonWriter, (JsonWriter) badgeDto2.getBackgroundColor());
        jsonWriter.name("text_color");
        this.colorDtoAdapter.toJson(jsonWriter, (JsonWriter) badgeDto2.getTextColor());
        jsonWriter.name("text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) badgeDto2.getText());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(MissionProgressDto.BadgeDto)");
    }
}
