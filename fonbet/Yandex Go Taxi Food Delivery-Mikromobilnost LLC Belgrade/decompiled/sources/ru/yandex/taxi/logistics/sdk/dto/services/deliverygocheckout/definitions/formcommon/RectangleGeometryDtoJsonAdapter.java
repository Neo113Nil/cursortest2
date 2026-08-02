package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/RectangleGeometryDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/RectangleGeometryDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableIntAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableDoubleAdapter", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RectangleGeometryDtoJsonAdapter extends JsonAdapter<RectangleGeometryDto> {
    private volatile Constructor<RectangleGeometryDto> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Double> nullableDoubleAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("origin_x", "origin_y", "width", "height", "corner_radius");

    public RectangleGeometryDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "originX");
        this.nullableDoubleAdapter = moshi.adapter(Double.class, emptySet, "width");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, UrbanAdsBottomSheetFragment.CORNER_RADIUS);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RectangleGeometryDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = 0;
        Integer num2 = null;
        Integer num3 = null;
        Double d = null;
        Double d2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num2 = this.nullableIntAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                num3 = this.nullableIntAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                d = this.nullableDoubleAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                d2 = this.nullableDoubleAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull(UrbanAdsBottomSheetFragment.CORNER_RADIUS, "corner_radius", jsonReader);
                }
                i = -17;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -17) {
            return new RectangleGeometryDto(num2, num3, d, d2, num.intValue());
        }
        Constructor<RectangleGeometryDto> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = RectangleGeometryDto.class.getDeclaredConstructor(Integer.class, Integer.class, Double.class, Double.class, cls, cls, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(num2, num3, d, d2, num, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RectangleGeometryDto rectangleGeometryDto) {
        RectangleGeometryDto rectangleGeometryDto2 = rectangleGeometryDto;
        if (rectangleGeometryDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("origin_x");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) rectangleGeometryDto2.getOriginX());
        jsonWriter.name("origin_y");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) rectangleGeometryDto2.getOriginY());
        jsonWriter.name("width");
        this.nullableDoubleAdapter.toJson(jsonWriter, (JsonWriter) rectangleGeometryDto2.getWidth());
        jsonWriter.name("height");
        this.nullableDoubleAdapter.toJson(jsonWriter, (JsonWriter) rectangleGeometryDto2.getHeight());
        jsonWriter.name("corner_radius");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(rectangleGeometryDto2.getCornerRadius()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(RectangleGeometryDto)");
    }
}
