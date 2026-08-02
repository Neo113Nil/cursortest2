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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.VerticalContentAlignmentDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.ShortcutLayerDto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutLayerDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutLayerDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutLayerDto$WidgetDto;", "widgetDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/VerticalContentAlignmentDto;", "nullableVerticalContentAlignmentDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ShortcutLayerDtoJsonAdapter extends JsonAdapter<ShortcutLayerDto> {
    private final JsonAdapter<VerticalContentAlignmentDto> nullableVerticalContentAlignmentDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("widget", "vertical_alignment");
    private final JsonAdapter<ShortcutLayerDto.WidgetDto> widgetDtoAdapter;

    public ShortcutLayerDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.widgetDtoAdapter = moshi.adapter(ShortcutLayerDto.WidgetDto.class, emptySet, "widget");
        this.nullableVerticalContentAlignmentDtoAdapter = moshi.adapter(VerticalContentAlignmentDto.class, emptySet, "verticalAlignment");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ShortcutLayerDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ShortcutLayerDto.WidgetDto widgetDto = null;
        VerticalContentAlignmentDto verticalContentAlignmentDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                widgetDto = this.widgetDtoAdapter.fromJson(jsonReader);
                if (widgetDto == null) {
                    throw Util.unexpectedNull("widget", "widget", jsonReader);
                }
            } else if (selectName == 1) {
                verticalContentAlignmentDto = this.nullableVerticalContentAlignmentDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (widgetDto != null) {
            return new ShortcutLayerDto(widgetDto, verticalContentAlignmentDto);
        }
        throw Util.missingProperty("widget", "widget", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ShortcutLayerDto shortcutLayerDto) {
        ShortcutLayerDto shortcutLayerDto2 = shortcutLayerDto;
        if (shortcutLayerDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("widget");
        this.widgetDtoAdapter.toJson(jsonWriter, (JsonWriter) shortcutLayerDto2.getWidget());
        jsonWriter.name("vertical_alignment");
        this.nullableVerticalContentAlignmentDtoAdapter.toJson(jsonWriter, (JsonWriter) shortcutLayerDto2.getVerticalAlignment());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(ShortcutLayerDto)");
    }
}
