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

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/MessengerParametersDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/MessengerParametersDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/MessengerHeaderDto;", "messengerHeaderDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ChatRequestDto;", "chatRequestDtoAdapter", "", "nullableAnyAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MessengerParametersDtoJsonAdapter extends JsonAdapter<MessengerParametersDto> {
    private final JsonAdapter<ChatRequestDto> chatRequestDtoAdapter;
    private final JsonAdapter<MessengerHeaderDto> messengerHeaderDtoAdapter;
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("messenger_header", "chat_request", "chat_meta");

    public MessengerParametersDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.messengerHeaderDtoAdapter = moshi.adapter(MessengerHeaderDto.class, emptySet, "messengerHeader");
        this.chatRequestDtoAdapter = moshi.adapter(ChatRequestDto.class, emptySet, "chatRequest");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, "chatMeta");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MessengerParametersDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        MessengerHeaderDto messengerHeaderDto = null;
        ChatRequestDto chatRequestDto = null;
        Object obj = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                messengerHeaderDto = this.messengerHeaderDtoAdapter.fromJson(jsonReader);
                if (messengerHeaderDto == null) {
                    throw Util.unexpectedNull("messengerHeader", "messenger_header", jsonReader);
                }
            } else if (selectName == 1) {
                chatRequestDto = this.chatRequestDtoAdapter.fromJson(jsonReader);
                if (chatRequestDto == null) {
                    throw Util.unexpectedNull("chatRequest", "chat_request", jsonReader);
                }
            } else if (selectName == 2) {
                obj = this.nullableAnyAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (messengerHeaderDto == null) {
            throw Util.missingProperty("messengerHeader", "messenger_header", jsonReader);
        }
        if (chatRequestDto != null) {
            return new MessengerParametersDto(messengerHeaderDto, chatRequestDto, obj);
        }
        throw Util.missingProperty("chatRequest", "chat_request", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MessengerParametersDto messengerParametersDto) {
        MessengerParametersDto messengerParametersDto2 = messengerParametersDto;
        if (messengerParametersDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("messenger_header");
        this.messengerHeaderDtoAdapter.toJson(jsonWriter, (JsonWriter) messengerParametersDto2.getMessengerHeader());
        jsonWriter.name("chat_request");
        this.chatRequestDtoAdapter.toJson(jsonWriter, (JsonWriter) messengerParametersDto2.getChatRequest());
        jsonWriter.name("chat_meta");
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) messengerParametersDto2.getChatMeta());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(MessengerParametersDto)");
    }
}
