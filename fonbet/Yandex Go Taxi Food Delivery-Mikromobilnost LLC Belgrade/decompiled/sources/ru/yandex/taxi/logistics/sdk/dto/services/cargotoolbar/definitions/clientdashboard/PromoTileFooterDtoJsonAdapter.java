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

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/PromoTileFooterDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/PromoTileFooterDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "nullableColorDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/HorizontalAlignmentDto;", "nullableHorizontalAlignmentDtoAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PromoTileFooterDtoJsonAdapter extends JsonAdapter<PromoTileFooterDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<PromoTileFooterDto> constructorRef;
    private final JsonAdapter<ColorDto> nullableColorDtoAdapter;
    private final JsonAdapter<HorizontalAlignmentDto> nullableHorizontalAlignmentDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("text", "text_color", "horizontal_alignment", "locked");

    public PromoTileFooterDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "text");
        this.nullableColorDtoAdapter = moshi.adapter(ColorDto.class, emptySet, "textColor");
        this.nullableHorizontalAlignmentDtoAdapter = moshi.adapter(HorizontalAlignmentDto.class, emptySet, "horizontalAlignment");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "locked");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PromoTileFooterDto fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        Boolean bool2 = bool;
        String str = null;
        ColorDto colorDto = null;
        HorizontalAlignmentDto horizontalAlignmentDto = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                colorDto = this.nullableColorDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                horizontalAlignmentDto = this.nullableHorizontalAlignmentDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                bool2 = this.booleanAdapter.fromJson(jsonReader);
                if (bool2 == null) {
                    throw Util.unexpectedNull("locked", "locked", jsonReader);
                }
                i = -9;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -9) {
            return new PromoTileFooterDto(str, colorDto, horizontalAlignmentDto, bool2.booleanValue());
        }
        Constructor<PromoTileFooterDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PromoTileFooterDto.class.getDeclaredConstructor(String.class, ColorDto.class, HorizontalAlignmentDto.class, Boolean.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(str, colorDto, horizontalAlignmentDto, bool2, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PromoTileFooterDto promoTileFooterDto) {
        PromoTileFooterDto promoTileFooterDto2 = promoTileFooterDto;
        if (promoTileFooterDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("text");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) promoTileFooterDto2.getText());
        jsonWriter.name("text_color");
        this.nullableColorDtoAdapter.toJson(jsonWriter, (JsonWriter) promoTileFooterDto2.getTextColor());
        jsonWriter.name("horizontal_alignment");
        this.nullableHorizontalAlignmentDtoAdapter.toJson(jsonWriter, (JsonWriter) promoTileFooterDto2.getHorizontalAlignment());
        jsonWriter.name("locked");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(promoTileFooterDto2.getLocked()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(PromoTileFooterDto)");
    }
}
