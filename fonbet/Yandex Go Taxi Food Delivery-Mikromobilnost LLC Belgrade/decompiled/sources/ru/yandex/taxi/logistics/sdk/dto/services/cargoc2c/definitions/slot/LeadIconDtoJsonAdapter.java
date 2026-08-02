package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slot;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slot.LeadIconDto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/LeadIconDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/LeadIconDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/ImageDto;", "imageDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/LeadIconDto$StyleDto;", "styleDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LeadIconDtoJsonAdapter extends JsonAdapter<LeadIconDto> {
    private final JsonAdapter<ImageDto> imageDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("icon", "style");
    private final JsonAdapter<LeadIconDto.StyleDto> styleDtoAdapter;

    public LeadIconDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.imageDtoAdapter = moshi.adapter(ImageDto.class, emptySet, "icon");
        this.styleDtoAdapter = moshi.adapter(LeadIconDto.StyleDto.class, emptySet, "style");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final LeadIconDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ImageDto imageDto = null;
        LeadIconDto.StyleDto styleDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                imageDto = this.imageDtoAdapter.fromJson(jsonReader);
                if (imageDto == null) {
                    throw Util.unexpectedNull("icon", "icon", jsonReader);
                }
            } else if (selectName == 1 && (styleDto = this.styleDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("style", "style", jsonReader);
            }
        }
        jsonReader.endObject();
        if (imageDto == null) {
            throw Util.missingProperty("icon", "icon", jsonReader);
        }
        if (styleDto != null) {
            return new LeadIconDto(imageDto, styleDto);
        }
        throw Util.missingProperty("style", "style", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, LeadIconDto leadIconDto) {
        LeadIconDto leadIconDto2 = leadIconDto;
        if (leadIconDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("icon");
        this.imageDtoAdapter.toJson(jsonWriter, (JsonWriter) leadIconDto2.getIcon());
        jsonWriter.name("style");
        this.styleDtoAdapter.toJson(jsonWriter, (JsonWriter) leadIconDto2.getStyle());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(33, "GeneratedJsonAdapter(LeadIconDto)");
    }
}
