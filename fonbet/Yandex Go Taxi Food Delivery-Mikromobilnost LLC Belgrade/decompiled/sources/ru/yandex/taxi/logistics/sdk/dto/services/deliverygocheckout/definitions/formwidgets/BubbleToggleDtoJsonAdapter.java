package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.adjust.sdk.Constants;
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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ImageDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.BubbleToggleDto;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/BubbleToggleDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/BubbleToggleDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;", "nullableTextParametersDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "nullableImageDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/BubbleToggleDto$SizeDto;", "sizeDtoAdapter", "nullableStringAdapter", "", "nullableAnyAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BubbleToggleDtoJsonAdapter extends JsonAdapter<BubbleToggleDto> {
    private volatile Constructor<BubbleToggleDto> constructorRef;
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<ImageDto> nullableImageDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TextParametersDto> nullableTextParametersDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("id", "text", "text_style", "icon", "size", "metrica_label", Constants.REFERRER_API_META);
    private final JsonAdapter<BubbleToggleDto.SizeDto> sizeDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public BubbleToggleDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.nullableTextParametersDtoAdapter = moshi.adapter(TextParametersDto.class, emptySet, "textStyle");
        this.nullableImageDtoAdapter = moshi.adapter(ImageDto.class, emptySet, "icon");
        this.sizeDtoAdapter = moshi.adapter(BubbleToggleDto.SizeDto.class, emptySet, "size");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, Constants.REFERRER_API_META);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final BubbleToggleDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        String str2 = null;
        TextParametersDto textParametersDto = null;
        ImageDto imageDto = null;
        BubbleToggleDto.SizeDto sizeDto = null;
        String str3 = null;
        Object obj = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("id", "id", jsonReader);
                    }
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("text", "text", jsonReader);
                    }
                    break;
                case 2:
                    textParametersDto = this.nullableTextParametersDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    imageDto = this.nullableImageDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    sizeDto = this.sizeDtoAdapter.fromJson(jsonReader);
                    if (sizeDto == null) {
                        throw Util.unexpectedNull("size", "size", jsonReader);
                    }
                    i = -17;
                    break;
                case 5:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    obj = this.nullableAnyAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -17) {
            Object obj2 = obj;
            String str4 = str3;
            BubbleToggleDto.SizeDto sizeDto2 = sizeDto;
            ImageDto imageDto2 = imageDto;
            TextParametersDto textParametersDto2 = textParametersDto;
            String str5 = str2;
            String str6 = str;
            if (str6 == null) {
                throw Util.missingProperty("id", "id", jsonReader);
            }
            if (str5 != null) {
                return new BubbleToggleDto(str6, str5, textParametersDto2, imageDto2, sizeDto2, str4, obj2);
            }
            throw Util.missingProperty("text", "text", jsonReader);
        }
        Object obj3 = obj;
        String str7 = str3;
        BubbleToggleDto.SizeDto sizeDto3 = sizeDto;
        ImageDto imageDto3 = imageDto;
        TextParametersDto textParametersDto3 = textParametersDto;
        String str8 = str2;
        String str9 = str;
        Constructor<BubbleToggleDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = BubbleToggleDto.class.getDeclaredConstructor(String.class, String.class, TextParametersDto.class, ImageDto.class, BubbleToggleDto.SizeDto.class, String.class, Object.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str9 == null) {
            throw Util.missingProperty("id", "id", jsonReader);
        }
        if (str8 != null) {
            return constructor.newInstance(str9, str8, textParametersDto3, imageDto3, sizeDto3, str7, obj3, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("text", "text", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, BubbleToggleDto bubbleToggleDto) {
        BubbleToggleDto bubbleToggleDto2 = bubbleToggleDto;
        if (bubbleToggleDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) bubbleToggleDto2.getId());
        jsonWriter.name("text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) bubbleToggleDto2.getText());
        jsonWriter.name("text_style");
        this.nullableTextParametersDtoAdapter.toJson(jsonWriter, (JsonWriter) bubbleToggleDto2.getTextStyle());
        jsonWriter.name("icon");
        this.nullableImageDtoAdapter.toJson(jsonWriter, (JsonWriter) bubbleToggleDto2.getIcon());
        jsonWriter.name("size");
        this.sizeDtoAdapter.toJson(jsonWriter, (JsonWriter) bubbleToggleDto2.getSize());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) bubbleToggleDto2.getMetricaLabel());
        jsonWriter.name(Constants.REFERRER_API_META);
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) bubbleToggleDto2.getMeta());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(BubbleToggleDto)");
    }
}
