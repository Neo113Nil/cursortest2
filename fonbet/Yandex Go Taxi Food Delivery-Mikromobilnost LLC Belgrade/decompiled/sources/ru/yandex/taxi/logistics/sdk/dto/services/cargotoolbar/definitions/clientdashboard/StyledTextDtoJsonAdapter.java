package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

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
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ColorDto;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/StyledTextDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/StyledTextDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TextStyleDto;", "textStyleDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "nullableColorDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StyledTextDtoJsonAdapter extends JsonAdapter<StyledTextDto> {
    private volatile Constructor<StyledTextDto> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<ColorDto> nullableColorDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("content", "font_size", "text_style", "text_color");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<TextStyleDto> textStyleDtoAdapter;

    public StyledTextDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "content");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "fontSize");
        this.textStyleDtoAdapter = moshi.adapter(TextStyleDto.class, emptySet, "textStyle");
        this.nullableColorDtoAdapter = moshi.adapter(ColorDto.class, emptySet, "textColor");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final StyledTextDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = 0;
        String str = null;
        TextStyleDto textStyleDto = null;
        ColorDto colorDto = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("content", "content", jsonReader);
                }
            } else if (selectName == 1) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("fontSize", "font_size", jsonReader);
                }
                i = -3;
            } else if (selectName == 2) {
                textStyleDto = this.textStyleDtoAdapter.fromJson(jsonReader);
                if (textStyleDto == null) {
                    throw Util.unexpectedNull("textStyle", "text_style", jsonReader);
                }
            } else if (selectName == 3) {
                colorDto = this.nullableColorDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            if (str == null) {
                throw Util.missingProperty("content", "content", jsonReader);
            }
            int intValue = num.intValue();
            if (textStyleDto != null) {
                return new StyledTextDto(str, intValue, textStyleDto, colorDto);
            }
            throw Util.missingProperty("textStyle", "text_style", jsonReader);
        }
        Constructor<StyledTextDto> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls2 = Integer.TYPE;
            constructor = StyledTextDto.class.getDeclaredConstructor(String.class, cls2, TextStyleDto.class, ColorDto.class, cls2, cls);
            this.constructorRef = constructor;
        }
        if (str == null) {
            throw Util.missingProperty("content", "content", jsonReader);
        }
        if (textStyleDto != null) {
            return constructor.newInstance(str, num, textStyleDto, colorDto, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("textStyle", "text_style", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, StyledTextDto styledTextDto) {
        StyledTextDto styledTextDto2 = styledTextDto;
        if (styledTextDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("content");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) styledTextDto2.getContent());
        jsonWriter.name("font_size");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(styledTextDto2.getFontSize()));
        jsonWriter.name("text_style");
        this.textStyleDtoAdapter.toJson(jsonWriter, (JsonWriter) styledTextDto2.getTextStyle());
        jsonWriter.name("text_color");
        this.nullableColorDtoAdapter.toJson(jsonWriter, (JsonWriter) styledTextDto2.getTextColor());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(35, "GeneratedJsonAdapter(StyledTextDto)");
    }
}
