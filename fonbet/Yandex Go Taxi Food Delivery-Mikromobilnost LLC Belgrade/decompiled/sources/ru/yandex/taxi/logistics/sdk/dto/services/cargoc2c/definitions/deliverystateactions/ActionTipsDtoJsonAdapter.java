package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionTipsDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionTipsDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/TipsChoiceDto;", "listOfTipsChoiceDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "nullableListOfStringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ActionTipsDtoJsonAdapter extends JsonAdapter<ActionTipsDto> {
    private final JsonAdapter<List<TipsChoiceDto>> listOfTipsChoiceDtoAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("choices", "last_choice_id", "available_payment_types");
    private final JsonAdapter<String> stringAdapter;

    public ActionTipsDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, TipsChoiceDto.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfTipsChoiceDtoAdapter = moshi.adapter(newParameterizedType, emptySet, "choices");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "lastChoiceId");
        this.nullableListOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, "availablePaymentTypes");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ActionTipsDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<TipsChoiceDto> list = null;
        String str = null;
        List<String> list2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfTipsChoiceDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("choices", "choices", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("lastChoiceId", "last_choice_id", jsonReader);
                }
            } else if (selectName == 2) {
                list2 = this.nullableListOfStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (list == null) {
            throw Util.missingProperty("choices", "choices", jsonReader);
        }
        if (str != null) {
            return new ActionTipsDto(list, str, list2);
        }
        throw Util.missingProperty("lastChoiceId", "last_choice_id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ActionTipsDto actionTipsDto) {
        ActionTipsDto actionTipsDto2 = actionTipsDto;
        if (actionTipsDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("choices");
        this.listOfTipsChoiceDtoAdapter.toJson(jsonWriter, (JsonWriter) actionTipsDto2.getChoices());
        jsonWriter.name("last_choice_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) actionTipsDto2.getLastChoiceId());
        jsonWriter.name("available_payment_types");
        this.nullableListOfStringAdapter.toJson(jsonWriter, (JsonWriter) actionTipsDto2.getAvailablePaymentTypes());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(35, "GeneratedJsonAdapter(ActionTipsDto)");
    }
}
