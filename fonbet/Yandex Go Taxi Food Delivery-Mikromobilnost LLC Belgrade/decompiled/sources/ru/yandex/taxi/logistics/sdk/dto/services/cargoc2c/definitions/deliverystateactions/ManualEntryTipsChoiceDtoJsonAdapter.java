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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ManualEntryTipsChoiceDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ManualEntryTipsChoiceDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "doubleAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ManualEntryTipsChoiceDtoJsonAdapter extends JsonAdapter<ManualEntryTipsChoiceDto> {
    private final JsonAdapter<Double> doubleAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("choice_id", "title", "extra_subtitle", "decimal_value", "min_tips_value", "max_tips_value", "tips_value_pattern");
    private final JsonAdapter<String> stringAdapter;

    public ManualEntryTipsChoiceDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "choiceId");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "decimalValue");
        this.doubleAdapter = moshi.adapter(Double.TYPE, emptySet, "minTipsValue");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ManualEntryTipsChoiceDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Double d = null;
        Double d2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (true) {
            Double d3 = d;
            Double d4 = d2;
            String str6 = str;
            String str7 = str2;
            String str8 = str3;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (str6 == null) {
                    throw Util.missingProperty("choiceId", "choice_id", jsonReader);
                }
                if (str7 == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (str8 == null) {
                    throw Util.missingProperty("extraSubtitle", "extra_subtitle", jsonReader);
                }
                if (d3 == null) {
                    throw Util.missingProperty("minTipsValue", "min_tips_value", jsonReader);
                }
                double doubleValue = d3.doubleValue();
                if (d4 == null) {
                    throw Util.missingProperty("maxTipsValue", "max_tips_value", jsonReader);
                }
                double doubleValue2 = d4.doubleValue();
                if (str5 != null) {
                    return new ManualEntryTipsChoiceDto(str6, str7, str8, str4, doubleValue, doubleValue2, str5);
                }
                throw Util.missingProperty("tipsValuePattern", "tips_value_pattern", jsonReader);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    d = d3;
                    d2 = d4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("choiceId", "choice_id", jsonReader);
                    }
                    d = d3;
                    d2 = d4;
                    str2 = str7;
                    str3 = str8;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    d = d3;
                    d2 = d4;
                    str = str6;
                    str3 = str8;
                case 2:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("extraSubtitle", "extra_subtitle", jsonReader);
                    }
                    d = d3;
                    d2 = d4;
                    str = str6;
                    str2 = str7;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    d = d3;
                    d2 = d4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                case 4:
                    d = this.doubleAdapter.fromJson(jsonReader);
                    if (d == null) {
                        throw Util.unexpectedNull("minTipsValue", "min_tips_value", jsonReader);
                    }
                    d2 = d4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                case 5:
                    Double fromJson = this.doubleAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("maxTipsValue", "max_tips_value", jsonReader);
                    }
                    d2 = fromJson;
                    d = d3;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                case 6:
                    str5 = this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("tipsValuePattern", "tips_value_pattern", jsonReader);
                    }
                    d = d3;
                    d2 = d4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                default:
                    d = d3;
                    d2 = d4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ManualEntryTipsChoiceDto manualEntryTipsChoiceDto) {
        ManualEntryTipsChoiceDto manualEntryTipsChoiceDto2 = manualEntryTipsChoiceDto;
        if (manualEntryTipsChoiceDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("choice_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) manualEntryTipsChoiceDto2.getChoiceId());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) manualEntryTipsChoiceDto2.getTitle());
        jsonWriter.name("extra_subtitle");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) manualEntryTipsChoiceDto2.getExtraSubtitle());
        jsonWriter.name("decimal_value");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) manualEntryTipsChoiceDto2.getDecimalValue());
        jsonWriter.name("min_tips_value");
        this.doubleAdapter.toJson(jsonWriter, (JsonWriter) Double.valueOf(manualEntryTipsChoiceDto2.getMinTipsValue()));
        jsonWriter.name("max_tips_value");
        this.doubleAdapter.toJson(jsonWriter, (JsonWriter) Double.valueOf(manualEntryTipsChoiceDto2.getMaxTipsValue()));
        jsonWriter.name("tips_value_pattern");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) manualEntryTipsChoiceDto2.getTipsValuePattern());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(ManualEntryTipsChoiceDto)");
    }
}
