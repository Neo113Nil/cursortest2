package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_ai_tools;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/SmartCameraWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/SmartCameraWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/StyledTextDto;", "styledTextDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/ThemedLinearGradientDto;", "nullableThemedLinearGradientDtoAdapter", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SmartCameraWidgetDtoJsonAdapter extends JsonAdapter<SmartCameraWidgetDto> {
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<ThemedLinearGradientDto> nullableThemedLinearGradientDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "icon_tag", "icon_color", "background_color", "initial_background_color", "initial_background_gradient");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<StyledTextDto> styledTextDtoAdapter;

    public SmartCameraWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.styledTextDtoAdapter = moshi.adapter(StyledTextDto.class, emptySet, "title");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "iconTag");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "iconColor");
        this.nullableThemedLinearGradientDtoAdapter = moshi.adapter(ThemedLinearGradientDto.class, emptySet, "initialBackgroundGradient");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SmartCameraWidgetDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        StyledTextDto styledTextDto = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ThemedLinearGradientDto themedLinearGradientDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    styledTextDto = this.styledTextDtoAdapter.fromJson(jsonReader);
                    if (styledTextDto == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("iconTag", "icon_tag", jsonReader);
                    }
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    themedLinearGradientDto = this.nullableThemedLinearGradientDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (styledTextDto == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (str != null) {
            return new SmartCameraWidgetDto(styledTextDto, str, str2, str3, str4, themedLinearGradientDto);
        }
        throw Util.missingProperty("iconTag", "icon_tag", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SmartCameraWidgetDto smartCameraWidgetDto) {
        SmartCameraWidgetDto smartCameraWidgetDto2 = smartCameraWidgetDto;
        if (smartCameraWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.styledTextDtoAdapter.toJson(jsonWriter, (JsonWriter) smartCameraWidgetDto2.getTitle());
        jsonWriter.name("icon_tag");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) smartCameraWidgetDto2.getIconTag());
        jsonWriter.name("icon_color");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) smartCameraWidgetDto2.getIconColor());
        jsonWriter.name("background_color");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) smartCameraWidgetDto2.getBackgroundColor());
        jsonWriter.name("initial_background_color");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) smartCameraWidgetDto2.getInitialBackgroundColor());
        jsonWriter.name("initial_background_gradient");
        this.nullableThemedLinearGradientDtoAdapter.toJson(jsonWriter, (JsonWriter) smartCameraWidgetDto2.getInitialBackgroundGradient());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(SmartCameraWidgetDto)");
    }
}
