package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

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
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionChangeDateTimeDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionChangeDateTimeDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ChangeDateTimeScreenDto;", "changeDateTimeScreenDtoAdapter", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ChangeDateTimeOptionDto;", "listOfChangeDateTimeOptionDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ActionChangeDateTimeDtoJsonAdapter extends JsonAdapter<ActionChangeDateTimeDto> {
    private final JsonAdapter<ChangeDateTimeScreenDto> changeDateTimeScreenDtoAdapter;
    private final JsonAdapter<List<ChangeDateTimeOptionDto>> listOfChangeDateTimeOptionDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "badge_text", MetaDataField.SCREEN_FIELD, "options");
    private final JsonAdapter<String> stringAdapter;

    public ActionChangeDateTimeDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "badgeText");
        this.changeDateTimeScreenDtoAdapter = moshi.adapter(ChangeDateTimeScreenDto.class, emptySet, MetaDataField.SCREEN_FIELD);
        this.listOfChangeDateTimeOptionDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, ChangeDateTimeOptionDto.class), emptySet, "options");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ActionChangeDateTimeDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        ChangeDateTimeScreenDto changeDateTimeScreenDto = null;
        List<ChangeDateTimeOptionDto> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                changeDateTimeScreenDto = this.changeDateTimeScreenDtoAdapter.fromJson(jsonReader);
                if (changeDateTimeScreenDto == null) {
                    throw Util.unexpectedNull(MetaDataField.SCREEN_FIELD, MetaDataField.SCREEN_FIELD, jsonReader);
                }
            } else if (selectName == 3 && (list = this.listOfChangeDateTimeOptionDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("options_", "options", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (changeDateTimeScreenDto == null) {
            throw Util.missingProperty(MetaDataField.SCREEN_FIELD, MetaDataField.SCREEN_FIELD, jsonReader);
        }
        if (list != null) {
            return new ActionChangeDateTimeDto(str, str2, changeDateTimeScreenDto, list);
        }
        throw Util.missingProperty("options_", "options", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ActionChangeDateTimeDto actionChangeDateTimeDto) {
        ActionChangeDateTimeDto actionChangeDateTimeDto2 = actionChangeDateTimeDto;
        if (actionChangeDateTimeDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) actionChangeDateTimeDto2.getTitle());
        jsonWriter.name("badge_text");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) actionChangeDateTimeDto2.getBadgeText());
        jsonWriter.name(MetaDataField.SCREEN_FIELD);
        this.changeDateTimeScreenDtoAdapter.toJson(jsonWriter, (JsonWriter) actionChangeDateTimeDto2.getScreen());
        jsonWriter.name("options");
        this.listOfChangeDateTimeOptionDtoAdapter.toJson(jsonWriter, (JsonWriter) actionChangeDateTimeDto2.getOptions());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(ActionChangeDateTimeDto)");
    }
}
