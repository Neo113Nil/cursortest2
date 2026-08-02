package ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.definitions.deliverypromotions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ColorDto;
import ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.definitions.deliverypromotions.BannerDto;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/BannerDto_LayoutDto_AdvertisementTagDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/BannerDto$LayoutDto$AdvertisementTagDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "nullableColorDtoAdapter", "colorDtoAdapter", "", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/BannerDto$LayoutDto$AdvertisementTagDto$InfoDto;", "listOfInfoDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BannerDto_LayoutDto_AdvertisementTagDtoJsonAdapter extends JsonAdapter<BannerDto.LayoutDto.AdvertisementTagDto> {
    private final JsonAdapter<ColorDto> colorDtoAdapter;
    private final JsonAdapter<List<BannerDto.LayoutDto.AdvertisementTagDto.InfoDto>> listOfInfoDtoAdapter;
    private final JsonAdapter<ColorDto> nullableColorDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("text", "text_color", "background_color", "info");
    private final JsonAdapter<String> stringAdapter;

    public BannerDto_LayoutDto_AdvertisementTagDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "text");
        this.nullableColorDtoAdapter = moshi.adapter(ColorDto.class, emptySet, "textColor");
        this.colorDtoAdapter = moshi.adapter(ColorDto.class, emptySet, UrbanAdsBottomSheetFragment.BACKGROUND_COLOR);
        this.listOfInfoDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, BannerDto.LayoutDto.AdvertisementTagDto.InfoDto.class), emptySet, "info");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final BannerDto.LayoutDto.AdvertisementTagDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        ColorDto colorDto = null;
        ColorDto colorDto2 = null;
        List<BannerDto.LayoutDto.AdvertisementTagDto.InfoDto> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("text", "text", jsonReader);
                }
            } else if (selectName == 1) {
                colorDto = this.nullableColorDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                colorDto2 = this.colorDtoAdapter.fromJson(jsonReader);
                if (colorDto2 == null) {
                    throw Util.unexpectedNull(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
                }
            } else if (selectName == 3 && (list = this.listOfInfoDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("info", "info", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("text", "text", jsonReader);
        }
        if (colorDto2 == null) {
            throw Util.missingProperty(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
        }
        if (list != null) {
            return new BannerDto.LayoutDto.AdvertisementTagDto(str, colorDto, colorDto2, list);
        }
        throw Util.missingProperty("info", "info", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, BannerDto.LayoutDto.AdvertisementTagDto advertisementTagDto) {
        BannerDto.LayoutDto.AdvertisementTagDto advertisementTagDto2 = advertisementTagDto;
        if (advertisementTagDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) advertisementTagDto2.getText());
        jsonWriter.name("text_color");
        this.nullableColorDtoAdapter.toJson(jsonWriter, (JsonWriter) advertisementTagDto2.getTextColor());
        jsonWriter.name("background_color");
        this.colorDtoAdapter.toJson(jsonWriter, (JsonWriter) advertisementTagDto2.getBackgroundColor());
        jsonWriter.name("info");
        this.listOfInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) advertisementTagDto2.getInfo());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(61, "GeneratedJsonAdapter(BannerDto.LayoutDto.AdvertisementTagDto)");
    }
}
