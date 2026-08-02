package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slot;

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
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slot.SlotBodyDto;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotBodyDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotBodyDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/ContentAlignmentDto;", "contentAlignmentDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotBodyDto$LayoutPriorityDto;", "nullableLayoutPriorityDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "attributedTextDtoAdapter", "nullableAttributedTextDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SlotBodyDtoJsonAdapter extends JsonAdapter<SlotBodyDto> {
    private final JsonAdapter<AttributedTextDto> attributedTextDtoAdapter;
    private final JsonAdapter<ContentAlignmentDto> contentAlignmentDtoAdapter;
    private final JsonAdapter<AttributedTextDto> nullableAttributedTextDtoAdapter;
    private final JsonAdapter<SlotBodyDto.LayoutPriorityDto> nullableLayoutPriorityDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("align", "layout_priority", "title", "subtitle");

    public SlotBodyDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.contentAlignmentDtoAdapter = moshi.adapter(ContentAlignmentDto.class, emptySet, "align");
        this.nullableLayoutPriorityDtoAdapter = moshi.adapter(SlotBodyDto.LayoutPriorityDto.class, emptySet, "layoutPriority");
        this.attributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "title");
        this.nullableAttributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "subtitle");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SlotBodyDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ContentAlignmentDto contentAlignmentDto = null;
        SlotBodyDto.LayoutPriorityDto layoutPriorityDto = null;
        AttributedTextDto attributedTextDto = null;
        AttributedTextDto attributedTextDto2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                contentAlignmentDto = this.contentAlignmentDtoAdapter.fromJson(jsonReader);
                if (contentAlignmentDto == null) {
                    throw Util.unexpectedNull("align", "align", jsonReader);
                }
            } else if (selectName == 1) {
                layoutPriorityDto = this.nullableLayoutPriorityDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                attributedTextDto = this.attributedTextDtoAdapter.fromJson(jsonReader);
                if (attributedTextDto == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 3) {
                attributedTextDto2 = this.nullableAttributedTextDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (contentAlignmentDto == null) {
            throw Util.missingProperty("align", "align", jsonReader);
        }
        if (attributedTextDto != null) {
            return new SlotBodyDto(contentAlignmentDto, layoutPriorityDto, attributedTextDto, attributedTextDto2);
        }
        throw Util.missingProperty("title", "title", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SlotBodyDto slotBodyDto) {
        SlotBodyDto slotBodyDto2 = slotBodyDto;
        if (slotBodyDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("align");
        this.contentAlignmentDtoAdapter.toJson(jsonWriter, (JsonWriter) slotBodyDto2.getAlign());
        jsonWriter.name("layout_priority");
        this.nullableLayoutPriorityDtoAdapter.toJson(jsonWriter, (JsonWriter) slotBodyDto2.getLayoutPriority());
        jsonWriter.name("title");
        this.attributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) slotBodyDto2.getTitle());
        jsonWriter.name("subtitle");
        this.nullableAttributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) slotBodyDto2.getSubtitle());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(33, "GeneratedJsonAdapter(SlotBodyDto)");
    }
}
