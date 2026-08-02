package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems.ContentTextItemDto;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentActionButtonDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentActionButtonDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;", "contentTextItemDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableContentTextItemDtoAdapter", "", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;", "nullablePayloadDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ContentActionButtonDtoJsonAdapter extends JsonAdapter<ContentActionButtonDto> {
    private final JsonAdapter<ContentTextItemDto> contentTextItemDtoAdapter;
    private final JsonAdapter<ContentTextItemDto> nullableContentTextItemDtoAdapter;
    private final JsonAdapter<PayloadDto> nullablePayloadDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "subtitle", "background_color", "action_payload", "metrica_label");

    public ContentActionButtonDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.contentTextItemDtoAdapter = moshi.adapter(ContentTextItemDto.class, emptySet, "title");
        this.nullableContentTextItemDtoAdapter = moshi.adapter(ContentTextItemDto.class, emptySet, "subtitle");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, UrbanAdsBottomSheetFragment.BACKGROUND_COLOR);
        this.nullablePayloadDtoAdapter = moshi.adapter(PayloadDto.class, emptySet, "actionPayload");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ContentActionButtonDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ContentTextItemDto contentTextItemDto = null;
        ContentTextItemDto contentTextItemDto2 = null;
        String str = null;
        PayloadDto payloadDto = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                contentTextItemDto = this.contentTextItemDtoAdapter.fromJson(jsonReader);
                if (contentTextItemDto == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 1) {
                contentTextItemDto2 = this.nullableContentTextItemDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                payloadDto = this.nullablePayloadDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (contentTextItemDto != null) {
            return new ContentActionButtonDto(contentTextItemDto, contentTextItemDto2, str, payloadDto, str2);
        }
        throw Util.missingProperty("title", "title", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ContentActionButtonDto contentActionButtonDto) {
        ContentActionButtonDto contentActionButtonDto2 = contentActionButtonDto;
        if (contentActionButtonDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.contentTextItemDtoAdapter.toJson(jsonWriter, (JsonWriter) contentActionButtonDto2.getTitle());
        jsonWriter.name("subtitle");
        this.nullableContentTextItemDtoAdapter.toJson(jsonWriter, (JsonWriter) contentActionButtonDto2.getSubtitle());
        jsonWriter.name("background_color");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) contentActionButtonDto2.getBackgroundColor());
        jsonWriter.name("action_payload");
        this.nullablePayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) contentActionButtonDto2.getActionPayload());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) contentActionButtonDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(ContentActionButtonDto)");
    }
}
