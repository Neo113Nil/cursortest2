package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.IconDto;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/OptionTileFooterDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/OptionTileFooterDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "iconDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OptionTileFooterDtoJsonAdapter extends JsonAdapter<OptionTileFooterDto> {
    private final JsonAdapter<IconDto> iconDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("option_icon");

    public OptionTileFooterDtoJsonAdapter(Moshi moshi) {
        this.iconDtoAdapter = moshi.adapter(IconDto.class, EmptySet.a, "optionIcon");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final OptionTileFooterDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        IconDto iconDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0 && (iconDto = this.iconDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("optionIcon", "option_icon", jsonReader);
            }
        }
        jsonReader.endObject();
        if (iconDto != null) {
            return new OptionTileFooterDto(iconDto);
        }
        throw Util.missingProperty("optionIcon", "option_icon", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, OptionTileFooterDto optionTileFooterDto) {
        OptionTileFooterDto optionTileFooterDto2 = optionTileFooterDto;
        if (optionTileFooterDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("option_icon");
        this.iconDtoAdapter.toJson(jsonWriter, (JsonWriter) optionTileFooterDto2.getOptionIcon());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(OptionTileFooterDto)");
    }
}
