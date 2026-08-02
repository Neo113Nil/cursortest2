package ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.api.v1deliverypromotions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.api.v1deliverypromotions.DeliveryResponseDto;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryResponseDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryResponseDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryResponseDto$BannersDto;", "nullableBannersDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryResponseDtoJsonAdapter extends JsonAdapter<DeliveryResponseDto> {
    private final JsonAdapter<DeliveryResponseDto.BannersDto> nullableBannersDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("banners");

    public DeliveryResponseDtoJsonAdapter(Moshi moshi) {
        this.nullableBannersDtoAdapter = moshi.adapter(DeliveryResponseDto.BannersDto.class, EmptySet.a, "banners");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DeliveryResponseDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        DeliveryResponseDto.BannersDto bannersDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                bannersDto = this.nullableBannersDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new DeliveryResponseDto(bannersDto);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DeliveryResponseDto deliveryResponseDto) {
        DeliveryResponseDto deliveryResponseDto2 = deliveryResponseDto;
        if (deliveryResponseDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("banners");
        this.nullableBannersDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryResponseDto2.getBanners());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(DeliveryResponseDto)");
    }
}
