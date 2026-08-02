package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slot;

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

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotStyleDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotStyleDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/BorderDto;", "nullableBorderDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SlotStyleDtoJsonAdapter extends JsonAdapter<SlotStyleDto> {
    private volatile Constructor<SlotStyleDto> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<BorderDto> nullableBorderDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("background_color", "background_corner_radius", "horizontal_inset", "border");

    public SlotStyleDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, UrbanAdsBottomSheetFragment.BACKGROUND_COLOR);
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "backgroundCornerRadius");
        this.nullableBorderDtoAdapter = moshi.adapter(BorderDto.class, emptySet, "border");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SlotStyleDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = 0;
        Integer num2 = null;
        String str = null;
        BorderDto borderDto = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("backgroundCornerRadius", "background_corner_radius", jsonReader);
                }
                i &= -3;
            } else if (selectName == 2) {
                num2 = this.intAdapter.fromJson(jsonReader);
                if (num2 == null) {
                    throw Util.unexpectedNull("horizontalInset", "horizontal_inset", jsonReader);
                }
                i &= -5;
            } else if (selectName == 3) {
                borderDto = this.nullableBorderDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (i == -7) {
            return new SlotStyleDto(str, num.intValue(), num2.intValue(), borderDto);
        }
        Constructor<SlotStyleDto> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls2 = Integer.TYPE;
            constructor = SlotStyleDto.class.getDeclaredConstructor(String.class, cls2, cls2, BorderDto.class, cls2, cls);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(str, num, num2, borderDto, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SlotStyleDto slotStyleDto) {
        SlotStyleDto slotStyleDto2 = slotStyleDto;
        if (slotStyleDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("background_color");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) slotStyleDto2.getBackgroundColor());
        jsonWriter.name("background_corner_radius");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(slotStyleDto2.getBackgroundCornerRadius()));
        jsonWriter.name("horizontal_inset");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(slotStyleDto2.getHorizontalInset()));
        jsonWriter.name("border");
        this.nullableBorderDtoAdapter.toJson(jsonWriter, (JsonWriter) slotStyleDto2.getBorder());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(34, "GeneratedJsonAdapter(SlotStyleDto)");
    }
}
