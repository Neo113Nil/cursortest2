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
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.DialogDto;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/DialogDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/DialogDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/DialogDto$CloseButtonDto;", "closeButtonDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/DialogDto$ConfirmButtonDto;", "confirmButtonDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DialogDtoJsonAdapter extends JsonAdapter<DialogDto> {
    private final JsonAdapter<DialogDto.CloseButtonDto> closeButtonDtoAdapter;
    private final JsonAdapter<DialogDto.ConfirmButtonDto> confirmButtonDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "body", "close_button", "confirm_button");
    private final JsonAdapter<String> stringAdapter;

    public DialogDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "body");
        this.closeButtonDtoAdapter = moshi.adapter(DialogDto.CloseButtonDto.class, emptySet, "closeButton");
        this.confirmButtonDtoAdapter = moshi.adapter(DialogDto.ConfirmButtonDto.class, emptySet, "confirmButton");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DialogDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        DialogDto.CloseButtonDto closeButtonDto = null;
        DialogDto.ConfirmButtonDto confirmButtonDto = null;
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
                closeButtonDto = this.closeButtonDtoAdapter.fromJson(jsonReader);
                if (closeButtonDto == null) {
                    throw Util.unexpectedNull("closeButton", "close_button", jsonReader);
                }
            } else if (selectName == 3 && (confirmButtonDto = this.confirmButtonDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("confirmButton", "confirm_button", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (closeButtonDto == null) {
            throw Util.missingProperty("closeButton", "close_button", jsonReader);
        }
        if (confirmButtonDto != null) {
            return new DialogDto(str, str2, closeButtonDto, confirmButtonDto);
        }
        throw Util.missingProperty("confirmButton", "confirm_button", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DialogDto dialogDto) {
        DialogDto dialogDto2 = dialogDto;
        if (dialogDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) dialogDto2.getTitle());
        jsonWriter.name("body");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) dialogDto2.getBody());
        jsonWriter.name("close_button");
        this.closeButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) dialogDto2.getCloseButton());
        jsonWriter.name("confirm_button");
        this.confirmButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) dialogDto2.getConfirmButton());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(31, "GeneratedJsonAdapter(DialogDto)");
    }
}
