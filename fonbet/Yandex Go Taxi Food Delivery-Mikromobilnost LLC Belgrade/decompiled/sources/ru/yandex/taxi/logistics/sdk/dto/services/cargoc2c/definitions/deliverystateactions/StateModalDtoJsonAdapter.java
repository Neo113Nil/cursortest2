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
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.StateModalDto;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/StateModalDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/StateModalDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "attributedTextDtoAdapter", "nullableAttributedTextDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/StateModalDto$CloseButtonDto;", "closeButtonDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/StateModalDto$ConfirmButtonDto;", "confirmButtonDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class StateModalDtoJsonAdapter extends JsonAdapter<StateModalDto> {
    private final JsonAdapter<AttributedTextDto> attributedTextDtoAdapter;
    private final JsonAdapter<StateModalDto.CloseButtonDto> closeButtonDtoAdapter;
    private final JsonAdapter<StateModalDto.ConfirmButtonDto> confirmButtonDtoAdapter;
    private final JsonAdapter<AttributedTextDto> nullableAttributedTextDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("header_image_tag", "title", "body", "close_button", "confirm_button");

    public StateModalDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "headerImageTag");
        this.attributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "title");
        this.nullableAttributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "body");
        this.closeButtonDtoAdapter = moshi.adapter(StateModalDto.CloseButtonDto.class, emptySet, "closeButton");
        this.confirmButtonDtoAdapter = moshi.adapter(StateModalDto.ConfirmButtonDto.class, emptySet, "confirmButton");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final StateModalDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        AttributedTextDto attributedTextDto = null;
        AttributedTextDto attributedTextDto2 = null;
        StateModalDto.CloseButtonDto closeButtonDto = null;
        StateModalDto.ConfirmButtonDto confirmButtonDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                attributedTextDto = this.attributedTextDtoAdapter.fromJson(jsonReader);
                if (attributedTextDto == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 2) {
                attributedTextDto2 = this.nullableAttributedTextDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                closeButtonDto = this.closeButtonDtoAdapter.fromJson(jsonReader);
                if (closeButtonDto == null) {
                    throw Util.unexpectedNull("closeButton", "close_button", jsonReader);
                }
            } else if (selectName == 4 && (confirmButtonDto = this.confirmButtonDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("confirmButton", "confirm_button", jsonReader);
            }
        }
        jsonReader.endObject();
        if (attributedTextDto == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (closeButtonDto == null) {
            throw Util.missingProperty("closeButton", "close_button", jsonReader);
        }
        if (confirmButtonDto != null) {
            return new StateModalDto(str, attributedTextDto, attributedTextDto2, closeButtonDto, confirmButtonDto);
        }
        throw Util.missingProperty("confirmButton", "confirm_button", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, StateModalDto stateModalDto) {
        StateModalDto stateModalDto2 = stateModalDto;
        if (stateModalDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("header_image_tag");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) stateModalDto2.getHeaderImageTag());
        jsonWriter.name("title");
        this.attributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) stateModalDto2.getTitle());
        jsonWriter.name("body");
        this.nullableAttributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) stateModalDto2.getBody());
        jsonWriter.name("close_button");
        this.closeButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) stateModalDto2.getCloseButton());
        jsonWriter.name("confirm_button");
        this.confirmButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) stateModalDto2.getConfirmButton());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(35, "GeneratedJsonAdapter(StateModalDto)");
    }
}
