package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form;

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
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/V2FormRequestDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/V2FormRequestDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormUserInfoDto;", "formUserInfoDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "anyAdapter", "", "stringAdapter", "", "nullableListOfStringAdapter", "nullableStringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class V2FormRequestDtoJsonAdapter extends JsonAdapter<V2FormRequestDto> {
    private final JsonAdapter<Object> anyAdapter;
    private final JsonAdapter<FormUserInfoDto> formUserInfoDtoAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("user_info", ClidProvider.STATE, "mode", "displaying_modals", "scenario");
    private final JsonAdapter<String> stringAdapter;

    public V2FormRequestDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.formUserInfoDtoAdapter = moshi.adapter(FormUserInfoDto.class, emptySet, "userInfo");
        this.anyAdapter = moshi.adapter(Object.class, emptySet, ClidProvider.STATE);
        this.stringAdapter = moshi.adapter(String.class, emptySet, "mode");
        this.nullableListOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, "displayingModals");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "scenario");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final V2FormRequestDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        FormUserInfoDto formUserInfoDto = null;
        Object obj = null;
        String str = null;
        List<String> list = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                formUserInfoDto = this.formUserInfoDtoAdapter.fromJson(jsonReader);
                if (formUserInfoDto == null) {
                    throw Util.unexpectedNull("userInfo", "user_info", jsonReader);
                }
            } else if (selectName == 1) {
                obj = this.anyAdapter.fromJson(jsonReader);
                if (obj == null) {
                    throw Util.unexpectedNull(ClidProvider.STATE, ClidProvider.STATE, jsonReader);
                }
            } else if (selectName == 2) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("mode", "mode", jsonReader);
                }
            } else if (selectName == 3) {
                list = this.nullableListOfStringAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (formUserInfoDto == null) {
            throw Util.missingProperty("userInfo", "user_info", jsonReader);
        }
        if (obj == null) {
            throw Util.missingProperty(ClidProvider.STATE, ClidProvider.STATE, jsonReader);
        }
        if (str != null) {
            return new V2FormRequestDto(formUserInfoDto, obj, str, list, str2);
        }
        throw Util.missingProperty("mode", "mode", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, V2FormRequestDto v2FormRequestDto) {
        V2FormRequestDto v2FormRequestDto2 = v2FormRequestDto;
        if (v2FormRequestDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("user_info");
        this.formUserInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) v2FormRequestDto2.getUserInfo());
        jsonWriter.name(ClidProvider.STATE);
        this.anyAdapter.toJson(jsonWriter, (JsonWriter) v2FormRequestDto2.getState());
        jsonWriter.name("mode");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) v2FormRequestDto2.getMode());
        jsonWriter.name("displaying_modals");
        this.nullableListOfStringAdapter.toJson(jsonWriter, (JsonWriter) v2FormRequestDto2.getDisplayingModals());
        jsonWriter.name("scenario");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) v2FormRequestDto2.getScenario());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(V2FormRequestDto)");
    }
}
