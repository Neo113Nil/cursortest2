package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/OpenOrderFormActionDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/OpenOrderFormActionDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/SelectDestinationPolicyDto;", "nullableSelectDestinationPolicyDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/CardModeDto;", "nullableCardModeDtoAdapter", "", "nullableAnyAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ShowPolicyDto;", "nullableShowPolicyDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OpenOrderFormActionDtoJsonAdapter extends JsonAdapter<OpenOrderFormActionDto> {
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<CardModeDto> nullableCardModeDtoAdapter;
    private final JsonAdapter<SelectDestinationPolicyDto> nullableSelectDestinationPolicyDtoAdapter;
    private final JsonAdapter<ShowPolicyDto> nullableShowPolicyDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("mode", "story_id", "select_destination_policy", "card_mode", "client_state", "story_show_policy");
    private final JsonAdapter<String> stringAdapter;

    public OpenOrderFormActionDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "mode");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "storyId");
        this.nullableSelectDestinationPolicyDtoAdapter = moshi.adapter(SelectDestinationPolicyDto.class, emptySet, "selectDestinationPolicy");
        this.nullableCardModeDtoAdapter = moshi.adapter(CardModeDto.class, emptySet, "cardMode");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, "clientState");
        this.nullableShowPolicyDtoAdapter = moshi.adapter(ShowPolicyDto.class, emptySet, "storyShowPolicy");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final OpenOrderFormActionDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        SelectDestinationPolicyDto selectDestinationPolicyDto = null;
        CardModeDto cardModeDto = null;
        Object obj = null;
        ShowPolicyDto showPolicyDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("mode", "mode", jsonReader);
                    }
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    selectDestinationPolicyDto = this.nullableSelectDestinationPolicyDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    cardModeDto = this.nullableCardModeDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    obj = this.nullableAnyAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    showPolicyDto = this.nullableShowPolicyDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (str != null) {
            return new OpenOrderFormActionDto(str, str2, selectDestinationPolicyDto, cardModeDto, obj, showPolicyDto);
        }
        throw Util.missingProperty("mode", "mode", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, OpenOrderFormActionDto openOrderFormActionDto) {
        OpenOrderFormActionDto openOrderFormActionDto2 = openOrderFormActionDto;
        if (openOrderFormActionDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("mode");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) openOrderFormActionDto2.getMode());
        jsonWriter.name("story_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) openOrderFormActionDto2.getStoryId());
        jsonWriter.name("select_destination_policy");
        this.nullableSelectDestinationPolicyDtoAdapter.toJson(jsonWriter, (JsonWriter) openOrderFormActionDto2.getSelectDestinationPolicy());
        jsonWriter.name("card_mode");
        this.nullableCardModeDtoAdapter.toJson(jsonWriter, (JsonWriter) openOrderFormActionDto2.getCardMode());
        jsonWriter.name("client_state");
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) openOrderFormActionDto2.getClientState());
        jsonWriter.name("story_show_policy");
        this.nullableShowPolicyDtoAdapter.toJson(jsonWriter, (JsonWriter) openOrderFormActionDto2.getStoryShowPolicy());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(OpenOrderFormActionDto)");
    }
}
