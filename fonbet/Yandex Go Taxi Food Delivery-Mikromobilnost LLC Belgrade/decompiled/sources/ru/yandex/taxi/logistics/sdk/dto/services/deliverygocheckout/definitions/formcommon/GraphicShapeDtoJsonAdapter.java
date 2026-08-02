package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/GraphicShapeDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/GraphicShapeDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/GraphicShapeGeometryDto;", "graphicShapeGeometryDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "", "doubleAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GraphicShapeDtoJsonAdapter extends JsonAdapter<GraphicShapeDto> {
    private volatile Constructor<GraphicShapeDto> constructorRef;
    private final JsonAdapter<Double> doubleAdapter;
    private final JsonAdapter<GraphicShapeGeometryDto> graphicShapeGeometryDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("geometry", "color", "border_width", "border_color");

    public GraphicShapeDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.graphicShapeGeometryDtoAdapter = moshi.adapter(GraphicShapeGeometryDto.class, emptySet, "geometry");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "color");
        this.doubleAdapter = moshi.adapter(Double.TYPE, emptySet, "borderWidth");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GraphicShapeDto fromJson(JsonReader jsonReader) {
        Double valueOf = Double.valueOf(0.0d);
        jsonReader.beginObject();
        Double d = valueOf;
        GraphicShapeGeometryDto graphicShapeGeometryDto = null;
        String str = null;
        String str2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                graphicShapeGeometryDto = this.graphicShapeGeometryDtoAdapter.fromJson(jsonReader);
                if (graphicShapeGeometryDto == null) {
                    throw Util.unexpectedNull("geometry", "geometry", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                d = this.doubleAdapter.fromJson(jsonReader);
                if (d == null) {
                    throw Util.unexpectedNull("borderWidth", "border_width", jsonReader);
                }
                i = -5;
            } else if (selectName == 3) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (i == -5) {
            String str3 = str2;
            if (graphicShapeGeometryDto == null) {
                throw Util.missingProperty("geometry", "geometry", jsonReader);
            }
            return new GraphicShapeDto(graphicShapeGeometryDto, str, d.doubleValue(), str3);
        }
        String str4 = str2;
        Constructor<GraphicShapeDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = GraphicShapeDto.class.getDeclaredConstructor(GraphicShapeGeometryDto.class, String.class, Double.TYPE, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (graphicShapeGeometryDto != null) {
            return constructor.newInstance(graphicShapeGeometryDto, str, d, str4, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("geometry", "geometry", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GraphicShapeDto graphicShapeDto) {
        GraphicShapeDto graphicShapeDto2 = graphicShapeDto;
        if (graphicShapeDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("geometry");
        this.graphicShapeGeometryDtoAdapter.toJson(jsonWriter, (JsonWriter) graphicShapeDto2.getGeometry());
        jsonWriter.name("color");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) graphicShapeDto2.getColor());
        jsonWriter.name("border_width");
        this.doubleAdapter.toJson(jsonWriter, (JsonWriter) Double.valueOf(graphicShapeDto2.getBorderWidth()));
        jsonWriter.name("border_color");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) graphicShapeDto2.getBorderColor());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(GraphicShapeDto)");
    }
}
