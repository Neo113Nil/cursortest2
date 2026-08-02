package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

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

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageBackgroundDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageBackgroundDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "imageDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableDoubleAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ScaleTypeDto;", "nullableScaleTypeDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ImageBackgroundDtoJsonAdapter extends JsonAdapter<ImageBackgroundDto> {
    private final JsonAdapter<ImageDto> imageDtoAdapter;
    private final JsonAdapter<Double> nullableDoubleAdapter;
    private final JsonAdapter<ScaleTypeDto> nullableScaleTypeDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("image", CaretView.ALPHA_PROPERTY, "scale_type");

    public ImageBackgroundDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.imageDtoAdapter = moshi.adapter(ImageDto.class, emptySet, "image");
        this.nullableDoubleAdapter = moshi.adapter(Double.class, emptySet, CaretView.ALPHA_PROPERTY);
        this.nullableScaleTypeDtoAdapter = moshi.adapter(ScaleTypeDto.class, emptySet, "scaleType");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ImageBackgroundDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ImageDto imageDto = null;
        Double d = null;
        ScaleTypeDto scaleTypeDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                imageDto = this.imageDtoAdapter.fromJson(jsonReader);
                if (imageDto == null) {
                    throw Util.unexpectedNull("image", "image", jsonReader);
                }
            } else if (selectName == 1) {
                d = this.nullableDoubleAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                scaleTypeDto = this.nullableScaleTypeDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (imageDto != null) {
            return new ImageBackgroundDto(imageDto, d, scaleTypeDto);
        }
        throw Util.missingProperty("image", "image", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ImageBackgroundDto imageBackgroundDto) {
        ImageBackgroundDto imageBackgroundDto2 = imageBackgroundDto;
        if (imageBackgroundDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("image");
        this.imageDtoAdapter.toJson(jsonWriter, (JsonWriter) imageBackgroundDto2.getImage());
        jsonWriter.name(CaretView.ALPHA_PROPERTY);
        this.nullableDoubleAdapter.toJson(jsonWriter, (JsonWriter) imageBackgroundDto2.getAlpha());
        jsonWriter.name("scale_type");
        this.nullableScaleTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) imageBackgroundDto2.getScaleType());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(ImageBackgroundDto)");
    }
}
