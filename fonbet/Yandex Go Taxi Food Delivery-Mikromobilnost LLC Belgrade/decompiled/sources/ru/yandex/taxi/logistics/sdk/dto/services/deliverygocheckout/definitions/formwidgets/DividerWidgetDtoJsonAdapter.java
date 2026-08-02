package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.HorizontalPaddingsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.DividerWidgetDto;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\f¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DividerWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DividerWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableIntAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/HorizontalPaddingsDto;", "nullableHorizontalPaddingsDtoAdapter", "", "nullableBooleanAdapter", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DividerWidgetDto$GroupSeparateTitlesDto;", "nullableListOfGroupSeparateTitlesDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DividerWidgetDto$StyleDto;", "styleDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DividerWidgetDtoJsonAdapter extends JsonAdapter<DividerWidgetDto> {
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<HorizontalPaddingsDto> nullableHorizontalPaddingsDtoAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<DividerWidgetDto.GroupSeparateTitlesDto>> nullableListOfGroupSeparateTitlesDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("widget_id", "group_title_text", "spacer_height", "horizontal_paddings", "is_flexible", "group_separate_titles", "style");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<DividerWidgetDto.StyleDto> styleDtoAdapter;

    public DividerWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "widgetId");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "groupTitleText");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "spacerHeight");
        this.nullableHorizontalPaddingsDtoAdapter = moshi.adapter(HorizontalPaddingsDto.class, emptySet, "horizontalPaddings");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "isFlexible");
        this.nullableListOfGroupSeparateTitlesDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, DividerWidgetDto.GroupSeparateTitlesDto.class), emptySet, "groupSeparateTitles");
        this.styleDtoAdapter = moshi.adapter(DividerWidgetDto.StyleDto.class, emptySet, "style");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DividerWidgetDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        Integer num = null;
        HorizontalPaddingsDto horizontalPaddingsDto = null;
        Boolean bool = null;
        List<DividerWidgetDto.GroupSeparateTitlesDto> list = null;
        DividerWidgetDto.StyleDto styleDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("widgetId", "widget_id", jsonReader);
                    }
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    horizontalPaddingsDto = this.nullableHorizontalPaddingsDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    list = this.nullableListOfGroupSeparateTitlesDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    styleDto = this.styleDtoAdapter.fromJson(jsonReader);
                    if (styleDto == null) {
                        throw Util.unexpectedNull("style", "style", jsonReader);
                    }
                    break;
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("widgetId", "widget_id", jsonReader);
        }
        if (styleDto != null) {
            return new DividerWidgetDto(str, str2, num, horizontalPaddingsDto, bool, list, styleDto);
        }
        throw Util.missingProperty("style", "style", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DividerWidgetDto dividerWidgetDto) {
        DividerWidgetDto dividerWidgetDto2 = dividerWidgetDto;
        if (dividerWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("widget_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) dividerWidgetDto2.getWidgetId());
        jsonWriter.name("group_title_text");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) dividerWidgetDto2.getGroupTitleText());
        jsonWriter.name("spacer_height");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) dividerWidgetDto2.getSpacerHeight());
        jsonWriter.name("horizontal_paddings");
        this.nullableHorizontalPaddingsDtoAdapter.toJson(jsonWriter, (JsonWriter) dividerWidgetDto2.getHorizontalPaddings());
        jsonWriter.name("is_flexible");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) dividerWidgetDto2.isFlexible());
        jsonWriter.name("group_separate_titles");
        this.nullableListOfGroupSeparateTitlesDtoAdapter.toJson(jsonWriter, (JsonWriter) dividerWidgetDto2.getGroupSeparateTitles());
        jsonWriter.name("style");
        this.styleDtoAdapter.toJson(jsonWriter, (JsonWriter) dividerWidgetDto2.getStyle());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(DividerWidgetDto)");
    }
}
