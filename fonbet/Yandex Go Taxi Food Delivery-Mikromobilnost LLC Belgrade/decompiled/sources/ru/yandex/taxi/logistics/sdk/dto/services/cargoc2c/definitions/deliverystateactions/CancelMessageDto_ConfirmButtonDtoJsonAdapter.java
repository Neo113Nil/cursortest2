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
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.CancelTypeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.CancelMessageDto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageDto_ConfirmButtonDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageDto$ConfirmButtonDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/CancelTypeDto;", "cancelTypeDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CancelMessageDto_ConfirmButtonDtoJsonAdapter extends JsonAdapter<CancelMessageDto.ConfirmButtonDto> {
    private final JsonAdapter<CancelTypeDto> cancelTypeDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("cancel_type", "title");
    private final JsonAdapter<String> stringAdapter;

    public CancelMessageDto_ConfirmButtonDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.cancelTypeDtoAdapter = moshi.adapter(CancelTypeDto.class, emptySet, "cancelType");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CancelMessageDto.ConfirmButtonDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        CancelTypeDto cancelTypeDto = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                cancelTypeDto = this.cancelTypeDtoAdapter.fromJson(jsonReader);
                if (cancelTypeDto == null) {
                    throw Util.unexpectedNull("cancelType", "cancel_type", jsonReader);
                }
            } else if (selectName == 1 && (str = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("title", "title", jsonReader);
            }
        }
        jsonReader.endObject();
        if (cancelTypeDto == null) {
            throw Util.missingProperty("cancelType", "cancel_type", jsonReader);
        }
        if (str != null) {
            return new CancelMessageDto.ConfirmButtonDto(cancelTypeDto, str);
        }
        throw Util.missingProperty("title", "title", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CancelMessageDto.ConfirmButtonDto confirmButtonDto) {
        CancelMessageDto.ConfirmButtonDto confirmButtonDto2 = confirmButtonDto;
        if (confirmButtonDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("cancel_type");
        this.cancelTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) confirmButtonDto2.getCancelType());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) confirmButtonDto2.getTitle());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(55, "GeneratedJsonAdapter(CancelMessageDto.ConfirmButtonDto)");
    }
}
