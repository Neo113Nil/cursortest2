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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TariffTileFooterDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TariffTileFooterDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "iconDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableIconDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TariffTileFooterDtoJsonAdapter extends JsonAdapter<TariffTileFooterDto> {
    private final JsonAdapter<IconDto> iconDtoAdapter;
    private final JsonAdapter<IconDto> nullableIconDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("tariff_icon", "option_icon");

    public TariffTileFooterDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.iconDtoAdapter = moshi.adapter(IconDto.class, emptySet, "tariffIcon");
        this.nullableIconDtoAdapter = moshi.adapter(IconDto.class, emptySet, "optionIcon");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TariffTileFooterDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        IconDto iconDto = null;
        IconDto iconDto2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                iconDto = this.iconDtoAdapter.fromJson(jsonReader);
                if (iconDto == null) {
                    throw Util.unexpectedNull("tariffIcon", "tariff_icon", jsonReader);
                }
            } else if (selectName == 1) {
                iconDto2 = this.nullableIconDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (iconDto != null) {
            return new TariffTileFooterDto(iconDto, iconDto2);
        }
        throw Util.missingProperty("tariffIcon", "tariff_icon", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TariffTileFooterDto tariffTileFooterDto) {
        TariffTileFooterDto tariffTileFooterDto2 = tariffTileFooterDto;
        if (tariffTileFooterDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("tariff_icon");
        this.iconDtoAdapter.toJson(jsonWriter, (JsonWriter) tariffTileFooterDto2.getTariffIcon());
        jsonWriter.name("option_icon");
        this.nullableIconDtoAdapter.toJson(jsonWriter, (JsonWriter) tariffTileFooterDto2.getOptionIcon());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(TariffTileFooterDto)");
    }
}
