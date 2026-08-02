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
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems.ContentIconItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems.ContentTextItemDto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/RemotePaymentItemDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/RemotePaymentItemDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;", "contentTextItemDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableContentTextItemDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentIconItemDto;", "nullableContentIconItemDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RemotePaymentItemDtoJsonAdapter extends JsonAdapter<RemotePaymentItemDto> {
    private final JsonAdapter<ContentTextItemDto> contentTextItemDtoAdapter;
    private final JsonAdapter<ContentIconItemDto> nullableContentIconItemDtoAdapter;
    private final JsonAdapter<ContentTextItemDto> nullableContentTextItemDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "subtitle", "trail_title", "trail_subtitle", "lead_icon");

    public RemotePaymentItemDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.contentTextItemDtoAdapter = moshi.adapter(ContentTextItemDto.class, emptySet, "title");
        this.nullableContentTextItemDtoAdapter = moshi.adapter(ContentTextItemDto.class, emptySet, "subtitle");
        this.nullableContentIconItemDtoAdapter = moshi.adapter(ContentIconItemDto.class, emptySet, "leadIcon");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RemotePaymentItemDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ContentTextItemDto contentTextItemDto = null;
        ContentTextItemDto contentTextItemDto2 = null;
        ContentTextItemDto contentTextItemDto3 = null;
        ContentTextItemDto contentTextItemDto4 = null;
        ContentIconItemDto contentIconItemDto = null;
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
                contentTextItemDto3 = this.nullableContentTextItemDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                contentTextItemDto4 = this.nullableContentTextItemDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                contentIconItemDto = this.nullableContentIconItemDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (contentTextItemDto != null) {
            return new RemotePaymentItemDto(contentTextItemDto, contentTextItemDto2, contentTextItemDto3, contentTextItemDto4, contentIconItemDto);
        }
        throw Util.missingProperty("title", "title", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RemotePaymentItemDto remotePaymentItemDto) {
        RemotePaymentItemDto remotePaymentItemDto2 = remotePaymentItemDto;
        if (remotePaymentItemDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.contentTextItemDtoAdapter.toJson(jsonWriter, (JsonWriter) remotePaymentItemDto2.getTitle());
        jsonWriter.name("subtitle");
        this.nullableContentTextItemDtoAdapter.toJson(jsonWriter, (JsonWriter) remotePaymentItemDto2.getSubtitle());
        jsonWriter.name("trail_title");
        this.nullableContentTextItemDtoAdapter.toJson(jsonWriter, (JsonWriter) remotePaymentItemDto2.getTrailTitle());
        jsonWriter.name("trail_subtitle");
        this.nullableContentTextItemDtoAdapter.toJson(jsonWriter, (JsonWriter) remotePaymentItemDto2.getTrailSubtitle());
        jsonWriter.name("lead_icon");
        this.nullableContentIconItemDtoAdapter.toJson(jsonWriter, (JsonWriter) remotePaymentItemDto2.getLeadIcon());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(RemotePaymentItemDto)");
    }
}
