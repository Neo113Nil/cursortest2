package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

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
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ProgressBarDto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/ProgressTileFooterDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/ProgressTileFooterDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ProgressBarDto;", "progressBarDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "nullableAttributedTextDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ProgressTileFooterDtoJsonAdapter extends JsonAdapter<ProgressTileFooterDto> {
    private final JsonAdapter<AttributedTextDto> nullableAttributedTextDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("progress_bar", "text");
    private final JsonAdapter<ProgressBarDto> progressBarDtoAdapter;

    public ProgressTileFooterDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.progressBarDtoAdapter = moshi.adapter(ProgressBarDto.class, emptySet, "progressBar");
        this.nullableAttributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "text");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ProgressTileFooterDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ProgressBarDto progressBarDto = null;
        AttributedTextDto attributedTextDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                progressBarDto = this.progressBarDtoAdapter.fromJson(jsonReader);
                if (progressBarDto == null) {
                    throw Util.unexpectedNull("progressBar", "progress_bar", jsonReader);
                }
            } else if (selectName == 1) {
                attributedTextDto = this.nullableAttributedTextDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (progressBarDto != null) {
            return new ProgressTileFooterDto(progressBarDto, attributedTextDto);
        }
        throw Util.missingProperty("progressBar", "progress_bar", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ProgressTileFooterDto progressTileFooterDto) {
        ProgressTileFooterDto progressTileFooterDto2 = progressTileFooterDto;
        if (progressTileFooterDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("progress_bar");
        this.progressBarDtoAdapter.toJson(jsonWriter, (JsonWriter) progressTileFooterDto2.getProgressBar());
        jsonWriter.name("text");
        this.nullableAttributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) progressTileFooterDto2.getText());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(ProgressTileFooterDto)");
    }
}
