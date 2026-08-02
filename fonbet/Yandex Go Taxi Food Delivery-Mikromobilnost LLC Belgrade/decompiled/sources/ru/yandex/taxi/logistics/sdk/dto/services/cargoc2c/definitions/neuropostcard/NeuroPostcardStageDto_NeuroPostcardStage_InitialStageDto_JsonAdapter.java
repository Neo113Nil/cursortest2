package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard.NeuroPostcardStageDto;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardStageDto_NeuroPostcardStage_InitialStageDto_JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardStageDto$NeuroPostcardStage_InitialStageDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardInitialStageDto;", "delegateAdapter", "Lcom/squareup/moshi/JsonAdapter;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NeuroPostcardStageDto_NeuroPostcardStage_InitialStageDto_JsonAdapter extends JsonAdapter<NeuroPostcardStageDto.NeuroPostcardStage_InitialStageDto> {
    private final JsonAdapter<NeuroPostcardInitialStageDto> delegateAdapter;

    public NeuroPostcardStageDto_NeuroPostcardStage_InitialStageDto_JsonAdapter(Moshi moshi) {
        this.delegateAdapter = moshi.adapter(NeuroPostcardInitialStageDto.class);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final NeuroPostcardStageDto.NeuroPostcardStage_InitialStageDto fromJson(JsonReader jsonReader) {
        NeuroPostcardInitialStageDto fromJson = this.delegateAdapter.fromJson(jsonReader);
        fromJson.getClass();
        return new NeuroPostcardStageDto.NeuroPostcardStage_InitialStageDto("initial_stage", fromJson);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, NeuroPostcardStageDto.NeuroPostcardStage_InitialStageDto neuroPostcardStage_InitialStageDto) {
        NeuroPostcardStageDto.NeuroPostcardStage_InitialStageDto neuroPostcardStage_InitialStageDto2 = neuroPostcardStage_InitialStageDto;
        if (neuroPostcardStage_InitialStageDto2 == null) {
            return;
        }
        this.delegateAdapter.toJson(jsonWriter, (JsonWriter) neuroPostcardStage_InitialStageDto2.b);
    }
}
