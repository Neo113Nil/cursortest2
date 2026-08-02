package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.impl.C0553n3;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.BackgroundDto;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutContentDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutContentDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutLayerDto;", "listOfShortcutLayerDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/BackgroundDto;", "nullableBackgroundDtoAdapter", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ShortcutContentDtoJsonAdapter extends JsonAdapter<ShortcutContentDto> {
    private volatile Constructor<ShortcutContentDto> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<ShortcutLayerDto>> listOfShortcutLayerDtoAdapter;
    private final JsonAdapter<BackgroundDto> nullableBackgroundDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("layers", C0553n3.g, "corner_radius");

    public ShortcutContentDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, ShortcutLayerDto.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfShortcutLayerDtoAdapter = moshi.adapter(newParameterizedType, emptySet, "layers");
        this.nullableBackgroundDtoAdapter = moshi.adapter(BackgroundDto.class, emptySet, C0553n3.g);
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, UrbanAdsBottomSheetFragment.CORNER_RADIUS);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ShortcutContentDto fromJson(JsonReader jsonReader) {
        Integer num = 0;
        jsonReader.beginObject();
        List<ShortcutLayerDto> list = null;
        BackgroundDto backgroundDto = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfShortcutLayerDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("layers", "layers", jsonReader);
                }
            } else if (selectName == 1) {
                backgroundDto = this.nullableBackgroundDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull(UrbanAdsBottomSheetFragment.CORNER_RADIUS, "corner_radius", jsonReader);
                }
                i = -5;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -5) {
            if (list != null) {
                return new ShortcutContentDto(list, backgroundDto, num.intValue());
            }
            throw Util.missingProperty("layers", "layers", jsonReader);
        }
        Constructor<ShortcutContentDto> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = ShortcutContentDto.class.getDeclaredConstructor(List.class, BackgroundDto.class, cls, cls, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (list != null) {
            return constructor.newInstance(list, backgroundDto, num, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("layers", "layers", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ShortcutContentDto shortcutContentDto) {
        ShortcutContentDto shortcutContentDto2 = shortcutContentDto;
        if (shortcutContentDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("layers");
        this.listOfShortcutLayerDtoAdapter.toJson(jsonWriter, (JsonWriter) shortcutContentDto2.getLayers());
        jsonWriter.name(C0553n3.g);
        this.nullableBackgroundDtoAdapter.toJson(jsonWriter, (JsonWriter) shortcutContentDto2.getBackground());
        jsonWriter.name("corner_radius");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(shortcutContentDto2.getCornerRadius()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(ShortcutContentDto)");
    }
}
