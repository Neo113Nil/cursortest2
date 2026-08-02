package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard;

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
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard.NeuroPostcardImageDto;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardImageDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardImageDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardImageDto$ReferenceDto;", "referenceDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "", "doubleAdapter", "", "stringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NeuroPostcardImageDtoJsonAdapter extends JsonAdapter<NeuroPostcardImageDto> {
    private volatile Constructor<NeuroPostcardImageDto> constructorRef;
    private final JsonAdapter<Double> doubleAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("reference", "width", "height", "dim_amount", "dim_color");
    private final JsonAdapter<NeuroPostcardImageDto.ReferenceDto> referenceDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public NeuroPostcardImageDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.referenceDtoAdapter = moshi.adapter(NeuroPostcardImageDto.ReferenceDto.class, emptySet, "reference");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "width");
        this.doubleAdapter = moshi.adapter(Double.TYPE, emptySet, "dimAmount");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "dimColor");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final NeuroPostcardImageDto fromJson(JsonReader jsonReader) {
        Double valueOf = Double.valueOf(0.0d);
        jsonReader.beginObject();
        Double d = valueOf;
        NeuroPostcardImageDto.ReferenceDto referenceDto = null;
        Integer num = null;
        Integer num2 = null;
        String str = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                referenceDto = this.referenceDtoAdapter.fromJson(jsonReader);
                if (referenceDto == null) {
                    throw Util.unexpectedNull("reference", "reference", jsonReader);
                }
            } else if (selectName == 1) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("width", "width", jsonReader);
                }
            } else if (selectName == 2) {
                num2 = this.intAdapter.fromJson(jsonReader);
                if (num2 == null) {
                    throw Util.unexpectedNull("height", "height", jsonReader);
                }
            } else if (selectName == 3) {
                d = this.doubleAdapter.fromJson(jsonReader);
                if (d == null) {
                    throw Util.unexpectedNull("dimAmount", "dim_amount", jsonReader);
                }
                i &= -9;
            } else if (selectName == 4) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("dimColor", "dim_color", jsonReader);
                }
                i &= -17;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -25) {
            if (referenceDto == null) {
                throw Util.missingProperty("reference", "reference", jsonReader);
            }
            if (num == null) {
                throw Util.missingProperty("width", "width", jsonReader);
            }
            int intValue = num.intValue();
            if (num2 == null) {
                throw Util.missingProperty("height", "height", jsonReader);
            }
            return new NeuroPostcardImageDto(referenceDto, intValue, num2.intValue(), d.doubleValue(), str);
        }
        Constructor<NeuroPostcardImageDto> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls2 = Integer.TYPE;
            constructor = NeuroPostcardImageDto.class.getDeclaredConstructor(NeuroPostcardImageDto.ReferenceDto.class, cls2, cls2, Double.TYPE, String.class, cls2, cls);
            this.constructorRef = constructor;
        }
        Constructor<NeuroPostcardImageDto> constructor2 = constructor;
        if (referenceDto == null) {
            throw Util.missingProperty("reference", "reference", jsonReader);
        }
        if (num == null) {
            throw Util.missingProperty("width", "width", jsonReader);
        }
        if (num2 == null) {
            throw Util.missingProperty("height", "height", jsonReader);
        }
        return constructor2.newInstance(referenceDto, num, num2, d, str, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, NeuroPostcardImageDto neuroPostcardImageDto) {
        NeuroPostcardImageDto neuroPostcardImageDto2 = neuroPostcardImageDto;
        if (neuroPostcardImageDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("reference");
        this.referenceDtoAdapter.toJson(jsonWriter, (JsonWriter) neuroPostcardImageDto2.getReference());
        jsonWriter.name("width");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(neuroPostcardImageDto2.getWidth()));
        jsonWriter.name("height");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(neuroPostcardImageDto2.getHeight()));
        jsonWriter.name("dim_amount");
        this.doubleAdapter.toJson(jsonWriter, (JsonWriter) Double.valueOf(neuroPostcardImageDto2.getDimAmount()));
        jsonWriter.name("dim_color");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) neuroPostcardImageDto2.getDimColor());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(NeuroPostcardImageDto)");
    }
}
