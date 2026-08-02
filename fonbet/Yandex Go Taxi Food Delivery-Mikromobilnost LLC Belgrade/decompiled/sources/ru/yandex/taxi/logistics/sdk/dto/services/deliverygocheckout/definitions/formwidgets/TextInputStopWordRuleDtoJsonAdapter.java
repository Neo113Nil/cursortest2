package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.TextInputStopWordRuleDto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputStopWordRuleDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputStopWordRuleDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputStopWordRuleDto$RuleTypeDto;", "ruleTypeDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TextInputStopWordRuleDtoJsonAdapter extends JsonAdapter<TextInputStopWordRuleDto> {
    private final JsonReader.Options options = JsonReader.Options.of("rule_type", "value");
    private final JsonAdapter<TextInputStopWordRuleDto.RuleTypeDto> ruleTypeDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public TextInputStopWordRuleDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.ruleTypeDtoAdapter = moshi.adapter(TextInputStopWordRuleDto.RuleTypeDto.class, emptySet, "ruleType");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "value");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TextInputStopWordRuleDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        TextInputStopWordRuleDto.RuleTypeDto ruleTypeDto = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                ruleTypeDto = this.ruleTypeDtoAdapter.fromJson(jsonReader);
                if (ruleTypeDto == null) {
                    throw Util.unexpectedNull("ruleType", "rule_type", jsonReader);
                }
            } else if (selectName == 1 && (str = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("value__", "value", jsonReader);
            }
        }
        jsonReader.endObject();
        if (ruleTypeDto == null) {
            throw Util.missingProperty("ruleType", "rule_type", jsonReader);
        }
        if (str != null) {
            return new TextInputStopWordRuleDto(ruleTypeDto, str);
        }
        throw Util.missingProperty("value__", "value", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TextInputStopWordRuleDto textInputStopWordRuleDto) {
        TextInputStopWordRuleDto textInputStopWordRuleDto2 = textInputStopWordRuleDto;
        if (textInputStopWordRuleDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("rule_type");
        this.ruleTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) textInputStopWordRuleDto2.getRuleType());
        jsonWriter.name("value");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) textInputStopWordRuleDto2.getValue());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(TextInputStopWordRuleDto)");
    }
}
