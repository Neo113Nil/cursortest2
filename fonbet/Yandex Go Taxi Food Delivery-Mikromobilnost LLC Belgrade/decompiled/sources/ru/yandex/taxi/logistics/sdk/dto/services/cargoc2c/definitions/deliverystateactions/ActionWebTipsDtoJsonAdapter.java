package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionWebTipsDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionWebTipsDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/WebTipsChoiceDto;", "listOfWebTipsChoiceDtoAdapter", "", "stringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ActionWebTipsDtoJsonAdapter extends JsonAdapter<ActionWebTipsDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<List<WebTipsChoiceDto>> listOfWebTipsChoiceDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(BackendConfig.Restrictions.ENABLED, "choices", "last_choice_id");
    private final JsonAdapter<String> stringAdapter;

    public ActionWebTipsDtoJsonAdapter(Moshi moshi) {
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, BackendConfig.Restrictions.ENABLED);
        this.listOfWebTipsChoiceDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, WebTipsChoiceDto.class), emptySet, "choices");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "lastChoiceId");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ActionWebTipsDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        List<WebTipsChoiceDto> list = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull(BackendConfig.Restrictions.ENABLED, BackendConfig.Restrictions.ENABLED, jsonReader);
                }
            } else if (selectName == 1) {
                list = this.listOfWebTipsChoiceDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("choices", "choices", jsonReader);
                }
            } else if (selectName == 2 && (str = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("lastChoiceId", "last_choice_id", jsonReader);
            }
        }
        jsonReader.endObject();
        if (bool == null) {
            throw Util.missingProperty(BackendConfig.Restrictions.ENABLED, BackendConfig.Restrictions.ENABLED, jsonReader);
        }
        boolean booleanValue = bool.booleanValue();
        if (list == null) {
            throw Util.missingProperty("choices", "choices", jsonReader);
        }
        if (str != null) {
            return new ActionWebTipsDto(booleanValue, list, str);
        }
        throw Util.missingProperty("lastChoiceId", "last_choice_id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ActionWebTipsDto actionWebTipsDto) {
        ActionWebTipsDto actionWebTipsDto2 = actionWebTipsDto;
        if (actionWebTipsDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(BackendConfig.Restrictions.ENABLED);
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(actionWebTipsDto2.getEnabled()));
        jsonWriter.name("choices");
        this.listOfWebTipsChoiceDtoAdapter.toJson(jsonWriter, (JsonWriter) actionWebTipsDto2.getChoices());
        jsonWriter.name("last_choice_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) actionWebTipsDto2.getLastChoiceId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(ActionWebTipsDto)");
    }
}
