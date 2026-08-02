package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliverycancelinfo;

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
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.CancelTypeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliverycancelinfo.Responses$DeliveryCancelInfoResponseDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handlersdefinitions.CancelInfoActionDto;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverycancelinfo/Responses_DeliveryCancelInfoResponseDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverycancelinfo/Responses$DeliveryCancelInfoResponseDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/CancelTypeDto;", "cancelTypeDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "nullableAttributedTextDtoAdapter", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/CancelInfoActionDto;", "nullableListOfCancelInfoActionDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverycancelinfo/Responses$DeliveryCancelInfoResponseDto$CancelButtonDto;", "cancelButtonDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverycancelinfo/Responses$DeliveryCancelInfoResponseDto$DismissButtonDto;", "dismissButtonDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Responses_DeliveryCancelInfoResponseDtoJsonAdapter extends JsonAdapter<Responses$DeliveryCancelInfoResponseDto> {
    private final JsonAdapter<Responses$DeliveryCancelInfoResponseDto.CancelButtonDto> cancelButtonDtoAdapter;
    private final JsonAdapter<CancelTypeDto> cancelTypeDtoAdapter;
    private final JsonAdapter<Responses$DeliveryCancelInfoResponseDto.DismissButtonDto> dismissButtonDtoAdapter;
    private final JsonAdapter<AttributedTextDto> nullableAttributedTextDtoAdapter;
    private final JsonAdapter<List<CancelInfoActionDto>> nullableListOfCancelInfoActionDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("cancel_type", "title", "subtitle", "content_actions", "cancel_button", "dismiss_button");

    public Responses_DeliveryCancelInfoResponseDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.cancelTypeDtoAdapter = moshi.adapter(CancelTypeDto.class, emptySet, "cancelType");
        this.nullableAttributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "title");
        this.nullableListOfCancelInfoActionDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, CancelInfoActionDto.class), emptySet, "contentActions");
        this.cancelButtonDtoAdapter = moshi.adapter(Responses$DeliveryCancelInfoResponseDto.CancelButtonDto.class, emptySet, "cancelButton");
        this.dismissButtonDtoAdapter = moshi.adapter(Responses$DeliveryCancelInfoResponseDto.DismissButtonDto.class, emptySet, "dismissButton");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Responses$DeliveryCancelInfoResponseDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        CancelTypeDto cancelTypeDto = null;
        AttributedTextDto attributedTextDto = null;
        AttributedTextDto attributedTextDto2 = null;
        List<CancelInfoActionDto> list = null;
        Responses$DeliveryCancelInfoResponseDto.CancelButtonDto cancelButtonDto = null;
        Responses$DeliveryCancelInfoResponseDto.DismissButtonDto dismissButtonDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    cancelTypeDto = this.cancelTypeDtoAdapter.fromJson(jsonReader);
                    if (cancelTypeDto == null) {
                        throw Util.unexpectedNull("cancelType", "cancel_type", jsonReader);
                    }
                    break;
                case 1:
                    attributedTextDto = this.nullableAttributedTextDtoAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    attributedTextDto2 = this.nullableAttributedTextDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    list = this.nullableListOfCancelInfoActionDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    cancelButtonDto = this.cancelButtonDtoAdapter.fromJson(jsonReader);
                    if (cancelButtonDto == null) {
                        throw Util.unexpectedNull("cancelButton", "cancel_button", jsonReader);
                    }
                    break;
                case 5:
                    dismissButtonDto = this.dismissButtonDtoAdapter.fromJson(jsonReader);
                    if (dismissButtonDto == null) {
                        throw Util.unexpectedNull("dismissButton", "dismiss_button", jsonReader);
                    }
                    break;
            }
        }
        jsonReader.endObject();
        if (cancelTypeDto == null) {
            throw Util.missingProperty("cancelType", "cancel_type", jsonReader);
        }
        if (cancelButtonDto == null) {
            throw Util.missingProperty("cancelButton", "cancel_button", jsonReader);
        }
        if (dismissButtonDto != null) {
            return new Responses$DeliveryCancelInfoResponseDto(cancelTypeDto, attributedTextDto, attributedTextDto2, list, cancelButtonDto, dismissButtonDto);
        }
        throw Util.missingProperty("dismissButton", "dismiss_button", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Responses$DeliveryCancelInfoResponseDto responses$DeliveryCancelInfoResponseDto) {
        Responses$DeliveryCancelInfoResponseDto responses$DeliveryCancelInfoResponseDto2 = responses$DeliveryCancelInfoResponseDto;
        if (responses$DeliveryCancelInfoResponseDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("cancel_type");
        this.cancelTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) responses$DeliveryCancelInfoResponseDto2.getCancelType());
        jsonWriter.name("title");
        this.nullableAttributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) responses$DeliveryCancelInfoResponseDto2.getTitle());
        jsonWriter.name("subtitle");
        this.nullableAttributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) responses$DeliveryCancelInfoResponseDto2.getSubtitle());
        jsonWriter.name("content_actions");
        this.nullableListOfCancelInfoActionDtoAdapter.toJson(jsonWriter, (JsonWriter) responses$DeliveryCancelInfoResponseDto2.getContentActions());
        jsonWriter.name("cancel_button");
        this.cancelButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) responses$DeliveryCancelInfoResponseDto2.getCancelButton());
        jsonWriter.name("dismiss_button");
        this.dismissButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) responses$DeliveryCancelInfoResponseDto2.getDismissButton());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(61, "GeneratedJsonAdapter(Responses.DeliveryCancelInfoResponseDto)");
    }
}
