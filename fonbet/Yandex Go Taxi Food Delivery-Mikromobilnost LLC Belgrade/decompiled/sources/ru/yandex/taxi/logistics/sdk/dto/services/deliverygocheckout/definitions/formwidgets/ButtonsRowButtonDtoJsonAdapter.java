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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.ButtonsRowButtonDto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonWidthDto;", "buttonsRowButtonWidthDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonDto$PayloadDto;", "payloadDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ButtonsRowButtonDtoJsonAdapter extends JsonAdapter<ButtonsRowButtonDto> {
    private final JsonAdapter<ButtonsRowButtonWidthDto> buttonsRowButtonWidthDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("width", "payload");
    private final JsonAdapter<ButtonsRowButtonDto.PayloadDto> payloadDtoAdapter;

    public ButtonsRowButtonDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.buttonsRowButtonWidthDtoAdapter = moshi.adapter(ButtonsRowButtonWidthDto.class, emptySet, "width");
        this.payloadDtoAdapter = moshi.adapter(ButtonsRowButtonDto.PayloadDto.class, emptySet, "payload");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ButtonsRowButtonDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ButtonsRowButtonWidthDto buttonsRowButtonWidthDto = null;
        ButtonsRowButtonDto.PayloadDto payloadDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                buttonsRowButtonWidthDto = this.buttonsRowButtonWidthDtoAdapter.fromJson(jsonReader);
                if (buttonsRowButtonWidthDto == null) {
                    throw Util.unexpectedNull("width", "width", jsonReader);
                }
            } else if (selectName == 1 && (payloadDto = this.payloadDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("payload", "payload", jsonReader);
            }
        }
        jsonReader.endObject();
        if (buttonsRowButtonWidthDto == null) {
            throw Util.missingProperty("width", "width", jsonReader);
        }
        if (payloadDto != null) {
            return new ButtonsRowButtonDto(buttonsRowButtonWidthDto, payloadDto);
        }
        throw Util.missingProperty("payload", "payload", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ButtonsRowButtonDto buttonsRowButtonDto) {
        ButtonsRowButtonDto buttonsRowButtonDto2 = buttonsRowButtonDto;
        if (buttonsRowButtonDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("width");
        this.buttonsRowButtonWidthDtoAdapter.toJson(jsonWriter, (JsonWriter) buttonsRowButtonDto2.getWidth());
        jsonWriter.name("payload");
        this.payloadDtoAdapter.toJson(jsonWriter, (JsonWriter) buttonsRowButtonDto2.getPayload());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(ButtonsRowButtonDto)");
    }
}
