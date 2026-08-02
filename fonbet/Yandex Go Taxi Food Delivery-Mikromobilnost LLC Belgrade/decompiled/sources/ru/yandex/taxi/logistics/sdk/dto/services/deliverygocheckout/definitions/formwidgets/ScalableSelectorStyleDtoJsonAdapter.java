package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ContentAlignmentDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.PaddingsDto;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScalableSelectorStyleDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScalableSelectorStyleDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/BorderDto;", "nullableBorderDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;", "nullablePaddingsDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ContentAlignmentDto;", "nullableContentAlignmentDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ScalableSelectorStyleDtoJsonAdapter extends JsonAdapter<ScalableSelectorStyleDto> {
    private final JsonAdapter<BorderDto> nullableBorderDtoAdapter;
    private final JsonAdapter<ContentAlignmentDto> nullableContentAlignmentDtoAdapter;
    private final JsonAdapter<PaddingsDto> nullablePaddingsDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("selected_option_background_color", "unselected_option_background_color", "disabled_option_background_color", "selected_option_border", "content_paddings", "text_horizontal_alignment", "badge_horizontal_alignment");

    public ScalableSelectorStyleDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "selectedOptionBackgroundColor");
        this.nullableBorderDtoAdapter = moshi.adapter(BorderDto.class, emptySet, "selectedOptionBorder");
        this.nullablePaddingsDtoAdapter = moshi.adapter(PaddingsDto.class, emptySet, "contentPaddings");
        this.nullableContentAlignmentDtoAdapter = moshi.adapter(ContentAlignmentDto.class, emptySet, "textHorizontalAlignment");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ScalableSelectorStyleDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        BorderDto borderDto = null;
        PaddingsDto paddingsDto = null;
        ContentAlignmentDto contentAlignmentDto = null;
        ContentAlignmentDto contentAlignmentDto2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    borderDto = this.nullableBorderDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    paddingsDto = this.nullablePaddingsDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    contentAlignmentDto = this.nullableContentAlignmentDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    contentAlignmentDto2 = this.nullableContentAlignmentDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        return new ScalableSelectorStyleDto(str, str2, str3, borderDto, paddingsDto, contentAlignmentDto, contentAlignmentDto2);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ScalableSelectorStyleDto scalableSelectorStyleDto) {
        ScalableSelectorStyleDto scalableSelectorStyleDto2 = scalableSelectorStyleDto;
        if (scalableSelectorStyleDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("selected_option_background_color");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) scalableSelectorStyleDto2.getSelectedOptionBackgroundColor());
        jsonWriter.name("unselected_option_background_color");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) scalableSelectorStyleDto2.getUnselectedOptionBackgroundColor());
        jsonWriter.name("disabled_option_background_color");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) scalableSelectorStyleDto2.getDisabledOptionBackgroundColor());
        jsonWriter.name("selected_option_border");
        this.nullableBorderDtoAdapter.toJson(jsonWriter, (JsonWriter) scalableSelectorStyleDto2.getSelectedOptionBorder());
        jsonWriter.name("content_paddings");
        this.nullablePaddingsDtoAdapter.toJson(jsonWriter, (JsonWriter) scalableSelectorStyleDto2.getContentPaddings());
        jsonWriter.name("text_horizontal_alignment");
        this.nullableContentAlignmentDtoAdapter.toJson(jsonWriter, (JsonWriter) scalableSelectorStyleDto2.getTextHorizontalAlignment());
        jsonWriter.name("badge_horizontal_alignment");
        this.nullableContentAlignmentDtoAdapter.toJson(jsonWriter, (JsonWriter) scalableSelectorStyleDto2.getBadgeHorizontalAlignment());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(ScalableSelectorStyleDto)");
    }
}
