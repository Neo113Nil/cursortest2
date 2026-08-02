package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

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

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/MapPinDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/MapPinDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/IconSpotDto;", "iconSpotDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "imageDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MapPinDtoJsonAdapter extends JsonAdapter<MapPinDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<MapPinDto> constructorRef;
    private final JsonAdapter<IconSpotDto> iconSpotDtoAdapter;
    private final JsonAdapter<ImageDto> imageDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("icon_spot", "has_bubble_arrow", "route_point_icon");

    public MapPinDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.iconSpotDtoAdapter = moshi.adapter(IconSpotDto.class, emptySet, "iconSpot");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "hasBubbleArrow");
        this.imageDtoAdapter = moshi.adapter(ImageDto.class, emptySet, "routePointIcon");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MapPinDto fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        IconSpotDto iconSpotDto = null;
        ImageDto imageDto = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                iconSpotDto = this.iconSpotDtoAdapter.fromJson(jsonReader);
                if (iconSpotDto == null) {
                    throw Util.unexpectedNull("iconSpot", "icon_spot", jsonReader);
                }
            } else if (selectName == 1) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull("hasBubbleArrow", "has_bubble_arrow", jsonReader);
                }
                i = -3;
            } else if (selectName == 2 && (imageDto = this.imageDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("routePointIcon", "route_point_icon", jsonReader);
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            if (iconSpotDto == null) {
                throw Util.missingProperty("iconSpot", "icon_spot", jsonReader);
            }
            boolean booleanValue = bool.booleanValue();
            if (imageDto != null) {
                return new MapPinDto(iconSpotDto, booleanValue, imageDto);
            }
            throw Util.missingProperty("routePointIcon", "route_point_icon", jsonReader);
        }
        Constructor<MapPinDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = MapPinDto.class.getDeclaredConstructor(IconSpotDto.class, Boolean.TYPE, ImageDto.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (iconSpotDto == null) {
            throw Util.missingProperty("iconSpot", "icon_spot", jsonReader);
        }
        if (imageDto != null) {
            return constructor.newInstance(iconSpotDto, bool, imageDto, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("routePointIcon", "route_point_icon", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MapPinDto mapPinDto) {
        MapPinDto mapPinDto2 = mapPinDto;
        if (mapPinDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("icon_spot");
        this.iconSpotDtoAdapter.toJson(jsonWriter, (JsonWriter) mapPinDto2.getIconSpot());
        jsonWriter.name("has_bubble_arrow");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(mapPinDto2.getHasBubbleArrow()));
        jsonWriter.name("route_point_icon");
        this.imageDtoAdapter.toJson(jsonWriter, (JsonWriter) mapPinDto2.getRoutePointIcon());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(31, "GeneratedJsonAdapter(MapPinDto)");
    }
}
