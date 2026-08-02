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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AccessibilityInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ContentAlignmentDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.PaddingsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.TextWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\f¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextWidgetDto$TextDto;", "textDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ContentAlignmentDto;", "nullableContentAlignmentDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;", "paddingsDtoAdapter", "", "nullableIntAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "nullableTapActionDtoAdapter", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AccessibilityInfoDto;", "nullableAccessibilityInfoDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TextWidgetDtoJsonAdapter extends JsonAdapter<TextWidgetDto> {
    private final JsonAdapter<AccessibilityInfoDto> nullableAccessibilityInfoDtoAdapter;
    private final JsonAdapter<ContentAlignmentDto> nullableContentAlignmentDtoAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TapActionDto> nullableTapActionDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("widget_id", "text", "text_alignment", "paddings", "height", "action", "metrica_label", "accessibility_info");
    private final JsonAdapter<PaddingsDto> paddingsDtoAdapter;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<TextWidgetDto.TextDto> textDtoAdapter;

    public TextWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "widgetId");
        this.textDtoAdapter = moshi.adapter(TextWidgetDto.TextDto.class, emptySet, "text");
        this.nullableContentAlignmentDtoAdapter = moshi.adapter(ContentAlignmentDto.class, emptySet, "textAlignment");
        this.paddingsDtoAdapter = moshi.adapter(PaddingsDto.class, emptySet, "paddings");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "height");
        this.nullableTapActionDtoAdapter = moshi.adapter(TapActionDto.class, emptySet, "action");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
        this.nullableAccessibilityInfoDtoAdapter = moshi.adapter(AccessibilityInfoDto.class, emptySet, "accessibilityInfo");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TextWidgetDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        TextWidgetDto.TextDto textDto = null;
        ContentAlignmentDto contentAlignmentDto = null;
        PaddingsDto paddingsDto = null;
        Integer num = null;
        TapActionDto tapActionDto = null;
        String str2 = null;
        AccessibilityInfoDto accessibilityInfoDto = null;
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
                    textDto = this.textDtoAdapter.fromJson(jsonReader);
                    if (textDto == null) {
                        throw Util.unexpectedNull("text", "text", jsonReader);
                    }
                    break;
                case 2:
                    contentAlignmentDto = this.nullableContentAlignmentDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    paddingsDto = this.paddingsDtoAdapter.fromJson(jsonReader);
                    if (paddingsDto == null) {
                        throw Util.unexpectedNull("paddings", "paddings", jsonReader);
                    }
                    break;
                case 4:
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    tapActionDto = this.nullableTapActionDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    accessibilityInfoDto = this.nullableAccessibilityInfoDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("widgetId", "widget_id", jsonReader);
        }
        if (textDto == null) {
            throw Util.missingProperty("text", "text", jsonReader);
        }
        if (paddingsDto != null) {
            return new TextWidgetDto(str, textDto, contentAlignmentDto, paddingsDto, num, tapActionDto, str2, accessibilityInfoDto);
        }
        throw Util.missingProperty("paddings", "paddings", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TextWidgetDto textWidgetDto) {
        TextWidgetDto textWidgetDto2 = textWidgetDto;
        if (textWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("widget_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) textWidgetDto2.getWidgetId());
        jsonWriter.name("text");
        this.textDtoAdapter.toJson(jsonWriter, (JsonWriter) textWidgetDto2.getText());
        jsonWriter.name("text_alignment");
        this.nullableContentAlignmentDtoAdapter.toJson(jsonWriter, (JsonWriter) textWidgetDto2.getTextAlignment());
        jsonWriter.name("paddings");
        this.paddingsDtoAdapter.toJson(jsonWriter, (JsonWriter) textWidgetDto2.getPaddings());
        jsonWriter.name("height");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) textWidgetDto2.getHeight());
        jsonWriter.name("action");
        this.nullableTapActionDtoAdapter.toJson(jsonWriter, (JsonWriter) textWidgetDto2.getAction());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) textWidgetDto2.getMetricaLabel());
        jsonWriter.name("accessibility_info");
        this.nullableAccessibilityInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) textWidgetDto2.getAccessibilityInfo());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(35, "GeneratedJsonAdapter(TextWidgetDto)");
    }
}
