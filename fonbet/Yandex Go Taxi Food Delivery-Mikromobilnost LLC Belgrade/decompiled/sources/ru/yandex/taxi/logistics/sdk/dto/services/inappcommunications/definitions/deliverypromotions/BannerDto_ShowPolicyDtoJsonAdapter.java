package ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.definitions.deliverypromotions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.definitions.deliverypromotions.BannerDto;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/BannerDto_ShowPolicyDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/BannerDto$ShowPolicyDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableIntAdapter", "Lcom/squareup/moshi/JsonAdapter;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BannerDto_ShowPolicyDtoJsonAdapter extends JsonAdapter<BannerDto.ShowPolicyDto> {
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("max_show_count", "max_widget_usage_count", "max_daily_show_count");

    public BannerDto_ShowPolicyDtoJsonAdapter(Moshi moshi) {
        this.nullableIntAdapter = moshi.adapter(Integer.class, EmptySet.a, "maxShowCount");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final BannerDto.ShowPolicyDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = this.nullableIntAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                num2 = this.nullableIntAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                num3 = this.nullableIntAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new BannerDto.ShowPolicyDto(num, num2, num3);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, BannerDto.ShowPolicyDto showPolicyDto) {
        BannerDto.ShowPolicyDto showPolicyDto2 = showPolicyDto;
        if (showPolicyDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("max_show_count");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) showPolicyDto2.getMaxShowCount());
        jsonWriter.name("max_widget_usage_count");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) showPolicyDto2.getMaxWidgetUsageCount());
        jsonWriter.name("max_daily_show_count");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) showPolicyDto2.getMaxDailyShowCount());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(BannerDto.ShowPolicyDto)");
    }
}
