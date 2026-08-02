package ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.definitions.deliverypromotions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.BackgroundDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ColorDto;
import ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.definitions.deliverypromotions.BannerDto;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/BannerDto_LayoutDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/BannerDto$LayoutDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "nullableColorDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto;", "nullableBackgroundDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/BannerDto$LayoutDto$AdvertisementTagDto;", "nullableAdvertisementTagDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/BannerDto$LayoutDto$TrailIconDto;", "nullableTrailIconDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BannerDto_LayoutDtoJsonAdapter extends JsonAdapter<BannerDto.LayoutDto> {
    private final JsonAdapter<BannerDto.LayoutDto.AdvertisementTagDto> nullableAdvertisementTagDtoAdapter;
    private final JsonAdapter<BackgroundDto> nullableBackgroundDtoAdapter;
    private final JsonAdapter<ColorDto> nullableColorDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<BannerDto.LayoutDto.TrailIconDto> nullableTrailIconDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "subtitle", "title_color", "subtitle_color", C0553n3.g, "advertisement_tag", "trail_icon");
    private final JsonAdapter<String> stringAdapter;

    public BannerDto_LayoutDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "subtitle");
        this.nullableColorDtoAdapter = moshi.adapter(ColorDto.class, emptySet, "titleColor");
        this.nullableBackgroundDtoAdapter = moshi.adapter(BackgroundDto.class, emptySet, C0553n3.g);
        this.nullableAdvertisementTagDtoAdapter = moshi.adapter(BannerDto.LayoutDto.AdvertisementTagDto.class, emptySet, "advertisementTag");
        this.nullableTrailIconDtoAdapter = moshi.adapter(BannerDto.LayoutDto.TrailIconDto.class, emptySet, "trailIcon");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final BannerDto.LayoutDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        ColorDto colorDto = null;
        ColorDto colorDto2 = null;
        BackgroundDto backgroundDto = null;
        BannerDto.LayoutDto.AdvertisementTagDto advertisementTagDto = null;
        BannerDto.LayoutDto.TrailIconDto trailIconDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    colorDto = this.nullableColorDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    colorDto2 = this.nullableColorDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    backgroundDto = this.nullableBackgroundDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    advertisementTagDto = this.nullableAdvertisementTagDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    trailIconDto = this.nullableTrailIconDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (str != null) {
            return new BannerDto.LayoutDto(str, str2, colorDto, colorDto2, backgroundDto, advertisementTagDto, trailIconDto);
        }
        throw Util.missingProperty("title", "title", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, BannerDto.LayoutDto layoutDto) {
        BannerDto.LayoutDto layoutDto2 = layoutDto;
        if (layoutDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) layoutDto2.getTitle());
        jsonWriter.name("subtitle");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) layoutDto2.getSubtitle());
        jsonWriter.name("title_color");
        this.nullableColorDtoAdapter.toJson(jsonWriter, (JsonWriter) layoutDto2.getTitleColor());
        jsonWriter.name("subtitle_color");
        this.nullableColorDtoAdapter.toJson(jsonWriter, (JsonWriter) layoutDto2.getSubtitleColor());
        jsonWriter.name(C0553n3.g);
        this.nullableBackgroundDtoAdapter.toJson(jsonWriter, (JsonWriter) layoutDto2.getBackground());
        jsonWriter.name("advertisement_tag");
        this.nullableAdvertisementTagDtoAdapter.toJson(jsonWriter, (JsonWriter) layoutDto2.getAdvertisementTag());
        jsonWriter.name("trail_icon");
        this.nullableTrailIconDtoAdapter.toJson(jsonWriter, (JsonWriter) layoutDto2.getTrailIcon());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(BannerDto.LayoutDto)");
    }
}
