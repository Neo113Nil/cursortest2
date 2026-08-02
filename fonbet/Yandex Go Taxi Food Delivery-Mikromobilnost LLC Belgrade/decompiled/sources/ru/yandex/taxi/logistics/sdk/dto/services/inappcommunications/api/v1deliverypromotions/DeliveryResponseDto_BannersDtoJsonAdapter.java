package ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.api.v1deliverypromotions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.api.v1deliverypromotions.DeliveryResponseDto;
import ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.definitions.deliverypromotions.BannerDto;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryResponseDto_BannersDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryResponseDto$BannersDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/BannerDto;", "listOfBannerDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryResponseDto_BannersDtoJsonAdapter extends JsonAdapter<DeliveryResponseDto.BannersDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<DeliveryResponseDto.BannersDto> constructorRef;
    private final JsonAdapter<List<BannerDto>> listOfBannerDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("banner_list", "autoscroll_enabled");

    public DeliveryResponseDto_BannersDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, BannerDto.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfBannerDtoAdapter = moshi.adapter(newParameterizedType, emptySet, "bannerList");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "autoscrollEnabled");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DeliveryResponseDto.BannersDto fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        List<BannerDto> list = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfBannerDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("bannerList", "banner_list", jsonReader);
                }
            } else if (selectName == 1) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull("autoscrollEnabled", "autoscroll_enabled", jsonReader);
                }
                i = -3;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            if (list != null) {
                return new DeliveryResponseDto.BannersDto(list, bool.booleanValue());
            }
            throw Util.missingProperty("bannerList", "banner_list", jsonReader);
        }
        Constructor<DeliveryResponseDto.BannersDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = DeliveryResponseDto.BannersDto.class.getDeclaredConstructor(List.class, Boolean.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (list != null) {
            return constructor.newInstance(list, bool, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("bannerList", "banner_list", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DeliveryResponseDto.BannersDto bannersDto) {
        DeliveryResponseDto.BannersDto bannersDto2 = bannersDto;
        if (bannersDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("banner_list");
        this.listOfBannerDtoAdapter.toJson(jsonWriter, (JsonWriter) bannersDto2.getBannerList());
        jsonWriter.name("autoscroll_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(bannersDto2.getAutoscrollEnabled()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(52, "GeneratedJsonAdapter(DeliveryResponseDto.BannersDto)");
    }
}
