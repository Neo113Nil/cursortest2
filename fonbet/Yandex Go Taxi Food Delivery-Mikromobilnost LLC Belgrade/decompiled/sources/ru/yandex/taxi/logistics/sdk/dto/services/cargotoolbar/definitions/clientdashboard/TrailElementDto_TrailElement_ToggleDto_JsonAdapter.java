package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.TrailElementDto;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TrailElementDto_TrailElement_ToggleDto_JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TrailElementDto$TrailElement_ToggleDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/ToggleDto;", "delegateAdapter", "Lcom/squareup/moshi/JsonAdapter;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TrailElementDto_TrailElement_ToggleDto_JsonAdapter extends JsonAdapter<TrailElementDto.TrailElement_ToggleDto> {
    private final JsonAdapter<ToggleDto> delegateAdapter;

    public TrailElementDto_TrailElement_ToggleDto_JsonAdapter(Moshi moshi) {
        this.delegateAdapter = moshi.adapter(ToggleDto.class);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TrailElementDto.TrailElement_ToggleDto fromJson(JsonReader jsonReader) {
        ToggleDto fromJson = this.delegateAdapter.fromJson(jsonReader);
        fromJson.getClass();
        return new TrailElementDto.TrailElement_ToggleDto("toggle", fromJson);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TrailElementDto.TrailElement_ToggleDto trailElement_ToggleDto) {
        TrailElementDto.TrailElement_ToggleDto trailElement_ToggleDto2 = trailElement_ToggleDto;
        if (trailElement_ToggleDto2 == null) {
            return;
        }
        this.delegateAdapter.toJson(jsonWriter, (JsonWriter) trailElement_ToggleDto2.b);
    }
}
