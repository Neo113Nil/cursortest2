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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.PartialProgressBarStyleDto;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PartialProgressBarStyleDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PartialProgressBarStyleDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PartialProgressBarStyleDto$PartialsSidesStyleDto;", "nullablePartialsSidesStyleDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PartialProgressBarStyleDtoJsonAdapter extends JsonAdapter<PartialProgressBarStyleDto> {
    private volatile Constructor<PartialProgressBarStyleDto> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<PartialProgressBarStyleDto.PartialsSidesStyleDto> nullablePartialsSidesStyleDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("progress_bar_color", "progress_bar_fill_color", "partials_count", "partials_sides_style", "space_between_partials");
    private final JsonAdapter<String> stringAdapter;

    public PartialProgressBarStyleDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "progressBarColor");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "partialsCount");
        this.nullablePartialsSidesStyleDtoAdapter = moshi.adapter(PartialProgressBarStyleDto.PartialsSidesStyleDto.class, emptySet, "partialsSidesStyle");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PartialProgressBarStyleDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = 0;
        String str = null;
        String str2 = null;
        Integer num2 = null;
        PartialProgressBarStyleDto.PartialsSidesStyleDto partialsSidesStyleDto = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("progressBarColor", "progress_bar_color", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("progressBarFillColor", "progress_bar_fill_color", jsonReader);
                }
            } else if (selectName == 2) {
                num2 = this.intAdapter.fromJson(jsonReader);
                if (num2 == null) {
                    throw Util.unexpectedNull("partialsCount", "partials_count", jsonReader);
                }
            } else if (selectName == 3) {
                partialsSidesStyleDto = this.nullablePartialsSidesStyleDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("spaceBetweenPartials", "space_between_partials", jsonReader);
                }
                i = -17;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -17) {
            if (str == null) {
                throw Util.missingProperty("progressBarColor", "progress_bar_color", jsonReader);
            }
            if (str2 == null) {
                throw Util.missingProperty("progressBarFillColor", "progress_bar_fill_color", jsonReader);
            }
            if (num2 == null) {
                throw Util.missingProperty("partialsCount", "partials_count", jsonReader);
            }
            return new PartialProgressBarStyleDto(str, str2, num2.intValue(), partialsSidesStyleDto, num.intValue());
        }
        Constructor<PartialProgressBarStyleDto> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls2 = Integer.TYPE;
            constructor = PartialProgressBarStyleDto.class.getDeclaredConstructor(String.class, String.class, cls2, PartialProgressBarStyleDto.PartialsSidesStyleDto.class, cls2, cls2, cls);
            this.constructorRef = constructor;
        }
        if (str == null) {
            throw Util.missingProperty("progressBarColor", "progress_bar_color", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("progressBarFillColor", "progress_bar_fill_color", jsonReader);
        }
        if (num2 == null) {
            throw Util.missingProperty("partialsCount", "partials_count", jsonReader);
        }
        return constructor.newInstance(str, str2, num2, partialsSidesStyleDto, num, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PartialProgressBarStyleDto partialProgressBarStyleDto) {
        PartialProgressBarStyleDto partialProgressBarStyleDto2 = partialProgressBarStyleDto;
        if (partialProgressBarStyleDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("progress_bar_color");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) partialProgressBarStyleDto2.getProgressBarColor());
        jsonWriter.name("progress_bar_fill_color");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) partialProgressBarStyleDto2.getProgressBarFillColor());
        jsonWriter.name("partials_count");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(partialProgressBarStyleDto2.getPartialsCount()));
        jsonWriter.name("partials_sides_style");
        this.nullablePartialsSidesStyleDtoAdapter.toJson(jsonWriter, (JsonWriter) partialProgressBarStyleDto2.getPartialsSidesStyle());
        jsonWriter.name("space_between_partials");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(partialProgressBarStyleDto2.getSpaceBetweenPartials()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(PartialProgressBarStyleDto)");
    }
}
