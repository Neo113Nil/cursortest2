package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

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

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ProgressBarDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ProgressBarDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "nullableAttributedTextDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "doubleAdapter", "", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ProgressBarStyleDto;", "progressBarStyleDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;", "nullablePaddingsDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ProgressBarDtoJsonAdapter extends JsonAdapter<ProgressBarDto> {
    private final JsonAdapter<Double> doubleAdapter;
    private final JsonAdapter<AttributedTextDto> nullableAttributedTextDtoAdapter;
    private final JsonAdapter<PaddingsDto> nullablePaddingsDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("progress_text", "progress", "accessibility_label", "progress_bar_style", "paddings");
    private final JsonAdapter<ProgressBarStyleDto> progressBarStyleDtoAdapter;

    public ProgressBarDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableAttributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "progressText");
        this.doubleAdapter = moshi.adapter(Double.TYPE, emptySet, "progress");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "accessibilityLabel");
        this.progressBarStyleDtoAdapter = moshi.adapter(ProgressBarStyleDto.class, emptySet, "progressBarStyle");
        this.nullablePaddingsDtoAdapter = moshi.adapter(PaddingsDto.class, emptySet, "paddings");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ProgressBarDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Double d = null;
        AttributedTextDto attributedTextDto = null;
        String str = null;
        ProgressBarStyleDto progressBarStyleDto = null;
        PaddingsDto paddingsDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                attributedTextDto = this.nullableAttributedTextDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                d = this.doubleAdapter.fromJson(jsonReader);
                if (d == null) {
                    throw Util.unexpectedNull("progress", "progress", jsonReader);
                }
            } else if (selectName == 2) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                progressBarStyleDto = this.progressBarStyleDtoAdapter.fromJson(jsonReader);
                if (progressBarStyleDto == null) {
                    throw Util.unexpectedNull("progressBarStyle", "progress_bar_style", jsonReader);
                }
            } else if (selectName == 4) {
                paddingsDto = this.nullablePaddingsDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (d == null) {
            throw Util.missingProperty("progress", "progress", jsonReader);
        }
        double doubleValue = d.doubleValue();
        if (progressBarStyleDto != null) {
            return new ProgressBarDto(attributedTextDto, doubleValue, str, progressBarStyleDto, paddingsDto);
        }
        throw Util.missingProperty("progressBarStyle", "progress_bar_style", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ProgressBarDto progressBarDto) {
        ProgressBarDto progressBarDto2 = progressBarDto;
        if (progressBarDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("progress_text");
        this.nullableAttributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) progressBarDto2.getProgressText());
        jsonWriter.name("progress");
        this.doubleAdapter.toJson(jsonWriter, (JsonWriter) Double.valueOf(progressBarDto2.getProgress()));
        jsonWriter.name("accessibility_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) progressBarDto2.getAccessibilityLabel());
        jsonWriter.name("progress_bar_style");
        this.progressBarStyleDtoAdapter.toJson(jsonWriter, (JsonWriter) progressBarDto2.getProgressBarStyle());
        jsonWriter.name("paddings");
        this.nullablePaddingsDtoAdapter.toJson(jsonWriter, (JsonWriter) progressBarDto2.getPaddings());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(36, "GeneratedJsonAdapter(ProgressBarDto)");
    }
}
