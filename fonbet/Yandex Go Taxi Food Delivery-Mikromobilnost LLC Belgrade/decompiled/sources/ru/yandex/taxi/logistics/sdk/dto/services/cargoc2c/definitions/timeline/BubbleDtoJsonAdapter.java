package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.timeline;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.ColorDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.DeliveryActionPayloadDto;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/BubbleDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/BubbleDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineBubbleButtonDto;", "nullableTimelineBubbleButtonDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/ColorDto;", "nullableColorDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DeliveryActionPayloadDto;", "nullableDeliveryActionPayloadDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class BubbleDtoJsonAdapter extends JsonAdapter<BubbleDto> {
    private final JsonAdapter<ColorDto> nullableColorDtoAdapter;
    private final JsonAdapter<DeliveryActionPayloadDto> nullableDeliveryActionPayloadDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TimelineBubbleButtonDto> nullableTimelineBubbleButtonDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("lead_icon_tag", "title", "button", C0553n3.g, "action");
    private final JsonAdapter<String> stringAdapter;

    public BubbleDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "leadIconTag");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableTimelineBubbleButtonDtoAdapter = moshi.adapter(TimelineBubbleButtonDto.class, emptySet, "button");
        this.nullableColorDtoAdapter = moshi.adapter(ColorDto.class, emptySet, C0553n3.g);
        this.nullableDeliveryActionPayloadDtoAdapter = moshi.adapter(DeliveryActionPayloadDto.class, emptySet, "action");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final BubbleDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        TimelineBubbleButtonDto timelineBubbleButtonDto = null;
        ColorDto colorDto = null;
        DeliveryActionPayloadDto deliveryActionPayloadDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 2) {
                timelineBubbleButtonDto = this.nullableTimelineBubbleButtonDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                colorDto = this.nullableColorDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                deliveryActionPayloadDto = this.nullableDeliveryActionPayloadDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str2 != null) {
            return new BubbleDto(str, str2, timelineBubbleButtonDto, colorDto, deliveryActionPayloadDto);
        }
        throw Util.missingProperty("title", "title", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, BubbleDto bubbleDto) {
        BubbleDto bubbleDto2 = bubbleDto;
        if (bubbleDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("lead_icon_tag");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) bubbleDto2.getLeadIconTag());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) bubbleDto2.getTitle());
        jsonWriter.name("button");
        this.nullableTimelineBubbleButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) bubbleDto2.getButton());
        jsonWriter.name(C0553n3.g);
        this.nullableColorDtoAdapter.toJson(jsonWriter, (JsonWriter) bubbleDto2.getBackground());
        jsonWriter.name("action");
        this.nullableDeliveryActionPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) bubbleDto2.getAction());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(31, "GeneratedJsonAdapter(BubbleDto)");
    }
}
