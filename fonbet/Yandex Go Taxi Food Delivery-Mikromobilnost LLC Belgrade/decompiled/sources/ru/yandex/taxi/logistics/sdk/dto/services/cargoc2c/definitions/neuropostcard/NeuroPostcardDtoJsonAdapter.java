package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard;

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
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard.NeuroPostcardDto;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\f¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardStageDto;", "neuroPostcardStageDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardDto$ImageDto;", "nullableImageDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "nullableAttributedTextDtoAdapter", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardButtonDto;", "nullableListOfNeuroPostcardButtonDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardActionDto;", "nullableNeuroPostcardActionDtoAdapter", "", "nullableStringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NeuroPostcardDtoJsonAdapter extends JsonAdapter<NeuroPostcardDto> {
    private final JsonAdapter<NeuroPostcardStageDto> neuroPostcardStageDtoAdapter;
    private final JsonAdapter<AttributedTextDto> nullableAttributedTextDtoAdapter;
    private final JsonAdapter<NeuroPostcardDto.ImageDto> nullableImageDtoAdapter;
    private final JsonAdapter<List<NeuroPostcardButtonDto>> nullableListOfNeuroPostcardButtonDtoAdapter;
    private final JsonAdapter<NeuroPostcardActionDto> nullableNeuroPostcardActionDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("stage", "image", "title", "subtitle", "buttons", "action", "metrica_label");

    public NeuroPostcardDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.neuroPostcardStageDtoAdapter = moshi.adapter(NeuroPostcardStageDto.class, emptySet, "stage");
        this.nullableImageDtoAdapter = moshi.adapter(NeuroPostcardDto.ImageDto.class, emptySet, "image");
        this.nullableAttributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "title");
        this.nullableListOfNeuroPostcardButtonDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, NeuroPostcardButtonDto.class), emptySet, "buttons");
        this.nullableNeuroPostcardActionDtoAdapter = moshi.adapter(NeuroPostcardActionDto.class, emptySet, "action");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final NeuroPostcardDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        NeuroPostcardStageDto neuroPostcardStageDto = null;
        NeuroPostcardDto.ImageDto imageDto = null;
        AttributedTextDto attributedTextDto = null;
        AttributedTextDto attributedTextDto2 = null;
        List<NeuroPostcardButtonDto> list = null;
        NeuroPostcardActionDto neuroPostcardActionDto = null;
        String str = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    neuroPostcardStageDto = this.neuroPostcardStageDtoAdapter.fromJson(jsonReader);
                    if (neuroPostcardStageDto == null) {
                        throw Util.unexpectedNull("stage", "stage", jsonReader);
                    }
                    break;
                case 1:
                    imageDto = this.nullableImageDtoAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    attributedTextDto = this.nullableAttributedTextDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    attributedTextDto2 = this.nullableAttributedTextDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    list = this.nullableListOfNeuroPostcardButtonDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    neuroPostcardActionDto = this.nullableNeuroPostcardActionDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (neuroPostcardStageDto != null) {
            return new NeuroPostcardDto(neuroPostcardStageDto, imageDto, attributedTextDto, attributedTextDto2, list, neuroPostcardActionDto, str);
        }
        throw Util.missingProperty("stage", "stage", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, NeuroPostcardDto neuroPostcardDto) {
        NeuroPostcardDto neuroPostcardDto2 = neuroPostcardDto;
        if (neuroPostcardDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("stage");
        this.neuroPostcardStageDtoAdapter.toJson(jsonWriter, (JsonWriter) neuroPostcardDto2.getStage());
        jsonWriter.name("image");
        this.nullableImageDtoAdapter.toJson(jsonWriter, (JsonWriter) neuroPostcardDto2.getImage());
        jsonWriter.name("title");
        this.nullableAttributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) neuroPostcardDto2.getTitle());
        jsonWriter.name("subtitle");
        this.nullableAttributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) neuroPostcardDto2.getSubtitle());
        jsonWriter.name("buttons");
        this.nullableListOfNeuroPostcardButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) neuroPostcardDto2.getButtons());
        jsonWriter.name("action");
        this.nullableNeuroPostcardActionDtoAdapter.toJson(jsonWriter, (JsonWriter) neuroPostcardDto2.getAction());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) neuroPostcardDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(NeuroPostcardDto)");
    }
}
