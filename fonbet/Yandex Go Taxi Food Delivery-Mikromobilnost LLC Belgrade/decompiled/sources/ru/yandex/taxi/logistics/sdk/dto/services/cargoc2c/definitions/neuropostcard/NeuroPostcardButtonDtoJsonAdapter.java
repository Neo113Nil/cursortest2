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
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard.NeuroPostcardButtonDto;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardButtonDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardButtonDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "attributedTextDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableAttributedTextDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardButtonDto$StyleDto;", "styleDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardButtonDto$SizeDto;", "sizeDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardActionDto;", "neuroPostcardActionDtoAdapter", "", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NeuroPostcardButtonDtoJsonAdapter extends JsonAdapter<NeuroPostcardButtonDto> {
    private final JsonAdapter<AttributedTextDto> attributedTextDtoAdapter;
    private volatile Constructor<NeuroPostcardButtonDto> constructorRef;
    private final JsonAdapter<NeuroPostcardActionDto> neuroPostcardActionDtoAdapter;
    private final JsonAdapter<AttributedTextDto> nullableAttributedTextDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "subtitle", "style", "size", "action", "metrica_label");
    private final JsonAdapter<NeuroPostcardButtonDto.SizeDto> sizeDtoAdapter;
    private final JsonAdapter<NeuroPostcardButtonDto.StyleDto> styleDtoAdapter;

    public NeuroPostcardButtonDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.attributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "title");
        this.nullableAttributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "subtitle");
        this.styleDtoAdapter = moshi.adapter(NeuroPostcardButtonDto.StyleDto.class, emptySet, "style");
        this.sizeDtoAdapter = moshi.adapter(NeuroPostcardButtonDto.SizeDto.class, emptySet, "size");
        this.neuroPostcardActionDtoAdapter = moshi.adapter(NeuroPostcardActionDto.class, emptySet, "action");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final NeuroPostcardButtonDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        AttributedTextDto attributedTextDto = null;
        AttributedTextDto attributedTextDto2 = null;
        NeuroPostcardButtonDto.StyleDto styleDto = null;
        NeuroPostcardButtonDto.SizeDto sizeDto = null;
        NeuroPostcardActionDto neuroPostcardActionDto = null;
        String str = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    attributedTextDto = this.attributedTextDtoAdapter.fromJson(jsonReader);
                    if (attributedTextDto == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 1:
                    attributedTextDto2 = this.nullableAttributedTextDtoAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    styleDto = this.styleDtoAdapter.fromJson(jsonReader);
                    if (styleDto == null) {
                        throw Util.unexpectedNull("style", "style", jsonReader);
                    }
                    break;
                case 3:
                    sizeDto = this.sizeDtoAdapter.fromJson(jsonReader);
                    if (sizeDto == null) {
                        throw Util.unexpectedNull("size", "size", jsonReader);
                    }
                    i = -9;
                    break;
                case 4:
                    neuroPostcardActionDto = this.neuroPostcardActionDtoAdapter.fromJson(jsonReader);
                    if (neuroPostcardActionDto == null) {
                        throw Util.unexpectedNull("action", "action", jsonReader);
                    }
                    break;
                case 5:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -9) {
            String str2 = str;
            NeuroPostcardActionDto neuroPostcardActionDto2 = neuroPostcardActionDto;
            NeuroPostcardButtonDto.SizeDto sizeDto2 = sizeDto;
            NeuroPostcardButtonDto.StyleDto styleDto2 = styleDto;
            AttributedTextDto attributedTextDto3 = attributedTextDto2;
            AttributedTextDto attributedTextDto4 = attributedTextDto;
            if (attributedTextDto4 == null) {
                throw Util.missingProperty("title", "title", jsonReader);
            }
            if (styleDto2 == null) {
                throw Util.missingProperty("style", "style", jsonReader);
            }
            if (neuroPostcardActionDto2 != null) {
                return new NeuroPostcardButtonDto(attributedTextDto4, attributedTextDto3, styleDto2, sizeDto2, neuroPostcardActionDto2, str2);
            }
            throw Util.missingProperty("action", "action", jsonReader);
        }
        String str3 = str;
        NeuroPostcardActionDto neuroPostcardActionDto3 = neuroPostcardActionDto;
        NeuroPostcardButtonDto.SizeDto sizeDto3 = sizeDto;
        NeuroPostcardButtonDto.StyleDto styleDto3 = styleDto;
        AttributedTextDto attributedTextDto5 = attributedTextDto2;
        AttributedTextDto attributedTextDto6 = attributedTextDto;
        Constructor<NeuroPostcardButtonDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = NeuroPostcardButtonDto.class.getDeclaredConstructor(AttributedTextDto.class, AttributedTextDto.class, NeuroPostcardButtonDto.StyleDto.class, NeuroPostcardButtonDto.SizeDto.class, NeuroPostcardActionDto.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (attributedTextDto6 == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (styleDto3 == null) {
            throw Util.missingProperty("style", "style", jsonReader);
        }
        if (neuroPostcardActionDto3 != null) {
            return constructor.newInstance(attributedTextDto6, attributedTextDto5, styleDto3, sizeDto3, neuroPostcardActionDto3, str3, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("action", "action", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, NeuroPostcardButtonDto neuroPostcardButtonDto) {
        NeuroPostcardButtonDto neuroPostcardButtonDto2 = neuroPostcardButtonDto;
        if (neuroPostcardButtonDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.attributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) neuroPostcardButtonDto2.getTitle());
        jsonWriter.name("subtitle");
        this.nullableAttributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) neuroPostcardButtonDto2.getSubtitle());
        jsonWriter.name("style");
        this.styleDtoAdapter.toJson(jsonWriter, (JsonWriter) neuroPostcardButtonDto2.getStyle());
        jsonWriter.name("size");
        this.sizeDtoAdapter.toJson(jsonWriter, (JsonWriter) neuroPostcardButtonDto2.getSize());
        jsonWriter.name("action");
        this.neuroPostcardActionDtoAdapter.toJson(jsonWriter, (JsonWriter) neuroPostcardButtonDto2.getAction());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) neuroPostcardButtonDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(NeuroPostcardButtonDto)");
    }
}
