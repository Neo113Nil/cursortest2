package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.FormBadgeDto;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScalableSelectorOptionDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScalableSelectorOptionDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "attributedTextDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableAttributedTextDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormBadgeDto;", "nullableFormBadgeDtoAdapter", "", "anyAdapter", "", "booleanAdapter", "", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ScalableSelectorOptionDtoJsonAdapter extends JsonAdapter<ScalableSelectorOptionDto> {
    private final JsonAdapter<Object> anyAdapter;
    private final JsonAdapter<AttributedTextDto> attributedTextDtoAdapter;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ScalableSelectorOptionDto> constructorRef;
    private final JsonAdapter<AttributedTextDto> nullableAttributedTextDtoAdapter;
    private final JsonAdapter<FormBadgeDto> nullableFormBadgeDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("text1", "text2", "badge", "value", "is_enabled", "metrica_label");

    public ScalableSelectorOptionDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.attributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "text1");
        this.nullableAttributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "text2");
        this.nullableFormBadgeDtoAdapter = moshi.adapter(FormBadgeDto.class, emptySet, "badge");
        this.anyAdapter = moshi.adapter(Object.class, emptySet, "value");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isEnabled");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ScalableSelectorOptionDto fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        FormBadgeDto formBadgeDto = null;
        Boolean bool2 = bool;
        AttributedTextDto attributedTextDto = null;
        AttributedTextDto attributedTextDto2 = null;
        String str = null;
        int i = -1;
        Object obj = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    attributedTextDto2 = this.attributedTextDtoAdapter.fromJson(jsonReader);
                    if (attributedTextDto2 == null) {
                        throw Util.unexpectedNull("text1", "text1", jsonReader);
                    }
                    break;
                case 1:
                    attributedTextDto = this.nullableAttributedTextDtoAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    formBadgeDto = this.nullableFormBadgeDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    obj = this.anyAdapter.fromJson(jsonReader);
                    if (obj == null) {
                        throw Util.unexpectedNull("value__", "value", jsonReader);
                    }
                    break;
                case 4:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("isEnabled", "is_enabled", jsonReader);
                    }
                    i = -17;
                    break;
                case 5:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -17) {
            if (attributedTextDto2 == null) {
                throw Util.missingProperty("text1", "text1", jsonReader);
            }
            if (obj != null) {
                return new ScalableSelectorOptionDto(attributedTextDto2, attributedTextDto, formBadgeDto, obj, bool2.booleanValue(), str);
            }
            throw Util.missingProperty("value__", "value", jsonReader);
        }
        AttributedTextDto attributedTextDto3 = attributedTextDto2;
        Constructor<ScalableSelectorOptionDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ScalableSelectorOptionDto.class.getDeclaredConstructor(AttributedTextDto.class, AttributedTextDto.class, FormBadgeDto.class, Object.class, Boolean.TYPE, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        Constructor<ScalableSelectorOptionDto> constructor2 = constructor;
        if (attributedTextDto3 == null) {
            throw Util.missingProperty("text1", "text1", jsonReader);
        }
        if (obj == null) {
            throw Util.missingProperty("value__", "value", jsonReader);
        }
        return constructor2.newInstance(attributedTextDto3, attributedTextDto, formBadgeDto, obj, bool2, str, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ScalableSelectorOptionDto scalableSelectorOptionDto) {
        ScalableSelectorOptionDto scalableSelectorOptionDto2 = scalableSelectorOptionDto;
        if (scalableSelectorOptionDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("text1");
        this.attributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) scalableSelectorOptionDto2.getText1());
        jsonWriter.name("text2");
        this.nullableAttributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) scalableSelectorOptionDto2.getText2());
        jsonWriter.name("badge");
        this.nullableFormBadgeDtoAdapter.toJson(jsonWriter, (JsonWriter) scalableSelectorOptionDto2.getBadge());
        jsonWriter.name("value");
        this.anyAdapter.toJson(jsonWriter, (JsonWriter) scalableSelectorOptionDto2.getValue());
        jsonWriter.name("is_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(scalableSelectorOptionDto2.isEnabled()));
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) scalableSelectorOptionDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(ScalableSelectorOptionDto)");
    }
}
