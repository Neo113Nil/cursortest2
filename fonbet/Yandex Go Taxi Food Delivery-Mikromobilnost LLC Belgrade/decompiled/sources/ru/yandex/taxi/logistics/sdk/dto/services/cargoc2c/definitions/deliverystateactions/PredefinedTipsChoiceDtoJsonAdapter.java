package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.TipsTypeDto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/PredefinedTipsChoiceDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/PredefinedTipsChoiceDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/TipsTypeDto;", "tipsTypeDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PredefinedTipsChoiceDtoJsonAdapter extends JsonAdapter<PredefinedTipsChoiceDto> {
    private final JsonReader.Options options = JsonReader.Options.of("choice_id", "decimal_value", "title", "tips_type");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<TipsTypeDto> tipsTypeDtoAdapter;

    public PredefinedTipsChoiceDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "choiceId");
        this.tipsTypeDtoAdapter = moshi.adapter(TipsTypeDto.class, emptySet, "tipsType");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PredefinedTipsChoiceDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        TipsTypeDto tipsTypeDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("choiceId", "choice_id", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("decimalValue", "decimal_value", jsonReader);
                }
            } else if (selectName == 2) {
                str3 = this.stringAdapter.fromJson(jsonReader);
                if (str3 == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 3 && (tipsTypeDto = this.tipsTypeDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("tipsType", "tips_type", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("choiceId", "choice_id", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("decimalValue", "decimal_value", jsonReader);
        }
        if (str3 == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (tipsTypeDto != null) {
            return new PredefinedTipsChoiceDto(str, str2, str3, tipsTypeDto);
        }
        throw Util.missingProperty("tipsType", "tips_type", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PredefinedTipsChoiceDto predefinedTipsChoiceDto) {
        PredefinedTipsChoiceDto predefinedTipsChoiceDto2 = predefinedTipsChoiceDto;
        if (predefinedTipsChoiceDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("choice_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) predefinedTipsChoiceDto2.getChoiceId());
        jsonWriter.name("decimal_value");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) predefinedTipsChoiceDto2.getDecimalValue());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) predefinedTipsChoiceDto2.getTitle());
        jsonWriter.name("tips_type");
        this.tipsTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) predefinedTipsChoiceDto2.getTipsType());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(PredefinedTipsChoiceDto)");
    }
}
