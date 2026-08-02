package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.LocalIconDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.MiddleElementDto;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/MiddleElementDto_MiddleElement_LocalIconDto_JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/MiddleElementDto$MiddleElement_LocalIconDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/LocalIconDto;", "delegateAdapter", "Lcom/squareup/moshi/JsonAdapter;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MiddleElementDto_MiddleElement_LocalIconDto_JsonAdapter extends JsonAdapter<MiddleElementDto.MiddleElement_LocalIconDto> {
    private final JsonAdapter<LocalIconDto> delegateAdapter;

    public MiddleElementDto_MiddleElement_LocalIconDto_JsonAdapter(Moshi moshi) {
        this.delegateAdapter = moshi.adapter(LocalIconDto.class);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MiddleElementDto.MiddleElement_LocalIconDto fromJson(JsonReader jsonReader) {
        LocalIconDto fromJson = this.delegateAdapter.fromJson(jsonReader);
        fromJson.getClass();
        return new MiddleElementDto.MiddleElement_LocalIconDto("local-icon", fromJson);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MiddleElementDto.MiddleElement_LocalIconDto middleElement_LocalIconDto) {
        MiddleElementDto.MiddleElement_LocalIconDto middleElement_LocalIconDto2 = middleElement_LocalIconDto;
        if (middleElement_LocalIconDto2 == null) {
            return;
        }
        this.delegateAdapter.toJson(jsonWriter, (JsonWriter) middleElement_LocalIconDto2.b);
    }
}
