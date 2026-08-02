package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.formvalidation;

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
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.formvalidation.FormValidationRequestDto;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\r¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationRequestDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationRequestDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationRequestDto$OffersDto;", "listOfOffersDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "anyAdapter", "", "stringAdapter", "nullableStringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FormValidationRequestDtoJsonAdapter extends JsonAdapter<FormValidationRequestDto> {
    private final JsonAdapter<Object> anyAdapter;
    private final JsonAdapter<List<FormValidationRequestDto.OffersDto>> listOfOffersDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("offers", ClidProvider.STATE, "mode", "scenario");
    private final JsonAdapter<String> stringAdapter;

    public FormValidationRequestDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, FormValidationRequestDto.OffersDto.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfOffersDtoAdapter = moshi.adapter(newParameterizedType, emptySet, "offers");
        this.anyAdapter = moshi.adapter(Object.class, emptySet, ClidProvider.STATE);
        this.stringAdapter = moshi.adapter(String.class, emptySet, "mode");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "scenario");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final FormValidationRequestDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<FormValidationRequestDto.OffersDto> list = null;
        Object obj = null;
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfOffersDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("offers", "offers", jsonReader);
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
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (list == null) {
            throw Util.missingProperty("offers", "offers", jsonReader);
        }
        if (obj == null) {
            throw Util.missingProperty(ClidProvider.STATE, ClidProvider.STATE, jsonReader);
        }
        if (str != null) {
            return new FormValidationRequestDto(list, obj, str, str2);
        }
        throw Util.missingProperty("mode", "mode", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, FormValidationRequestDto formValidationRequestDto) {
        FormValidationRequestDto formValidationRequestDto2 = formValidationRequestDto;
        if (formValidationRequestDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("offers");
        this.listOfOffersDtoAdapter.toJson(jsonWriter, (JsonWriter) formValidationRequestDto2.getOffers());
        jsonWriter.name(ClidProvider.STATE);
        this.anyAdapter.toJson(jsonWriter, (JsonWriter) formValidationRequestDto2.getState());
        jsonWriter.name("mode");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) formValidationRequestDto2.getMode());
        jsonWriter.name("scenario");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) formValidationRequestDto2.getScenario());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(FormValidationRequestDto)");
    }
}
