package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

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

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/IconSpotDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/IconSpotDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "imageDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IconSpotDtoJsonAdapter extends JsonAdapter<IconSpotDto> {
    private volatile Constructor<IconSpotDto> constructorRef;
    private final JsonAdapter<ImageDto> imageDtoAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("icon", "background_color", "corner_radius");

    public IconSpotDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.imageDtoAdapter = moshi.adapter(ImageDto.class, emptySet, "icon");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, UrbanAdsBottomSheetFragment.BACKGROUND_COLOR);
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, UrbanAdsBottomSheetFragment.CORNER_RADIUS);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final IconSpotDto fromJson(JsonReader jsonReader) {
        Integer num = 0;
        jsonReader.beginObject();
        ImageDto imageDto = null;
        String str = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                imageDto = this.imageDtoAdapter.fromJson(jsonReader);
                if (imageDto == null) {
                    throw Util.unexpectedNull("icon", "icon", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
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
            if (imageDto != null) {
                return new IconSpotDto(imageDto, str, num.intValue());
            }
            throw Util.missingProperty("icon", "icon", jsonReader);
        }
        Constructor<IconSpotDto> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = IconSpotDto.class.getDeclaredConstructor(ImageDto.class, String.class, cls, cls, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (imageDto != null) {
            return constructor.newInstance(imageDto, str, num, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("icon", "icon", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, IconSpotDto iconSpotDto) {
        IconSpotDto iconSpotDto2 = iconSpotDto;
        if (iconSpotDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("icon");
        this.imageDtoAdapter.toJson(jsonWriter, (JsonWriter) iconSpotDto2.getIcon());
        jsonWriter.name("background_color");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) iconSpotDto2.getBackgroundColor());
        jsonWriter.name("corner_radius");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(iconSpotDto2.getCornerRadius()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(33, "GeneratedJsonAdapter(IconSpotDto)");
    }
}
