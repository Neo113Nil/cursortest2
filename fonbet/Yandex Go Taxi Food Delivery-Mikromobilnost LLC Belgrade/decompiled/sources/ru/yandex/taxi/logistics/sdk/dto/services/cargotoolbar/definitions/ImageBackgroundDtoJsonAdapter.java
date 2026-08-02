package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ImageBackgroundDto;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ImageBackgroundDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ImageBackgroundDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableDoubleAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ImageBackgroundDto$ScaleTypeDto;", "nullableScaleTypeDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "nullableColorDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ImageBackgroundDtoJsonAdapter extends JsonAdapter<ImageBackgroundDto> {
    private final JsonAdapter<ColorDto> nullableColorDtoAdapter;
    private final JsonAdapter<Double> nullableDoubleAdapter;
    private final JsonAdapter<ImageBackgroundDto.ScaleTypeDto> nullableScaleTypeDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("image_tag", CaretView.ALPHA_PROPERTY, "scale", "scale_type", "horizontal_offset_pt", "vertical_offset_pt", "base_color", "ripple_color");
    private final JsonAdapter<String> stringAdapter;

    public ImageBackgroundDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "imageTag");
        this.nullableDoubleAdapter = moshi.adapter(Double.class, emptySet, CaretView.ALPHA_PROPERTY);
        this.nullableScaleTypeDtoAdapter = moshi.adapter(ImageBackgroundDto.ScaleTypeDto.class, emptySet, "scaleType");
        this.nullableColorDtoAdapter = moshi.adapter(ColorDto.class, emptySet, "baseColor");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ImageBackgroundDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Double d = null;
        Double d2 = null;
        ImageBackgroundDto.ScaleTypeDto scaleTypeDto = null;
        Double d3 = null;
        Double d4 = null;
        ColorDto colorDto = null;
        ColorDto colorDto2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("imageTag", "image_tag", jsonReader);
                    }
                    break;
                case 1:
                    d = this.nullableDoubleAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    d2 = this.nullableDoubleAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    scaleTypeDto = this.nullableScaleTypeDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    d3 = this.nullableDoubleAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    d4 = this.nullableDoubleAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    colorDto = this.nullableColorDtoAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    colorDto2 = this.nullableColorDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (str != null) {
            return new ImageBackgroundDto(str, d, d2, scaleTypeDto, d3, d4, colorDto, colorDto2);
        }
        throw Util.missingProperty("imageTag", "image_tag", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ImageBackgroundDto imageBackgroundDto) {
        ImageBackgroundDto imageBackgroundDto2 = imageBackgroundDto;
        if (imageBackgroundDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("image_tag");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) imageBackgroundDto2.getImageTag());
        jsonWriter.name(CaretView.ALPHA_PROPERTY);
        this.nullableDoubleAdapter.toJson(jsonWriter, (JsonWriter) imageBackgroundDto2.getAlpha());
        jsonWriter.name("scale");
        this.nullableDoubleAdapter.toJson(jsonWriter, (JsonWriter) imageBackgroundDto2.getScale());
        jsonWriter.name("scale_type");
        this.nullableScaleTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) imageBackgroundDto2.getScaleType());
        jsonWriter.name("horizontal_offset_pt");
        this.nullableDoubleAdapter.toJson(jsonWriter, (JsonWriter) imageBackgroundDto2.getHorizontalOffsetPt());
        jsonWriter.name("vertical_offset_pt");
        this.nullableDoubleAdapter.toJson(jsonWriter, (JsonWriter) imageBackgroundDto2.getVerticalOffsetPt());
        jsonWriter.name("base_color");
        this.nullableColorDtoAdapter.toJson(jsonWriter, (JsonWriter) imageBackgroundDto2.getBaseColor());
        jsonWriter.name("ripple_color");
        this.nullableColorDtoAdapter.toJson(jsonWriter, (JsonWriter) imageBackgroundDto2.getRippleColor());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(ImageBackgroundDto)");
    }
}
