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
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ContentAlignmentDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.DividerWidgetDto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DividerWidgetDto_GroupSeparateTitlesDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DividerWidgetDto$GroupSeparateTitlesDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "attributedTextDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ContentAlignmentDto;", "contentAlignmentDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DividerWidgetDto_GroupSeparateTitlesDtoJsonAdapter extends JsonAdapter<DividerWidgetDto.GroupSeparateTitlesDto> {
    private final JsonAdapter<AttributedTextDto> attributedTextDtoAdapter;
    private final JsonAdapter<ContentAlignmentDto> contentAlignmentDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("text", "align");

    public DividerWidgetDto_GroupSeparateTitlesDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.attributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "text");
        this.contentAlignmentDtoAdapter = moshi.adapter(ContentAlignmentDto.class, emptySet, "align");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DividerWidgetDto.GroupSeparateTitlesDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        AttributedTextDto attributedTextDto = null;
        ContentAlignmentDto contentAlignmentDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                attributedTextDto = this.attributedTextDtoAdapter.fromJson(jsonReader);
                if (attributedTextDto == null) {
                    throw Util.unexpectedNull("text", "text", jsonReader);
                }
            } else if (selectName == 1 && (contentAlignmentDto = this.contentAlignmentDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("align", "align", jsonReader);
            }
        }
        jsonReader.endObject();
        if (attributedTextDto == null) {
            throw Util.missingProperty("text", "text", jsonReader);
        }
        if (contentAlignmentDto != null) {
            return new DividerWidgetDto.GroupSeparateTitlesDto(attributedTextDto, contentAlignmentDto);
        }
        throw Util.missingProperty("align", "align", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DividerWidgetDto.GroupSeparateTitlesDto groupSeparateTitlesDto) {
        DividerWidgetDto.GroupSeparateTitlesDto groupSeparateTitlesDto2 = groupSeparateTitlesDto;
        if (groupSeparateTitlesDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("text");
        this.attributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) groupSeparateTitlesDto2.getText());
        jsonWriter.name("align");
        this.contentAlignmentDtoAdapter.toJson(jsonWriter, (JsonWriter) groupSeparateTitlesDto2.getAlign());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(61, "GeneratedJsonAdapter(DividerWidgetDto.GroupSeparateTitlesDto)");
    }
}
