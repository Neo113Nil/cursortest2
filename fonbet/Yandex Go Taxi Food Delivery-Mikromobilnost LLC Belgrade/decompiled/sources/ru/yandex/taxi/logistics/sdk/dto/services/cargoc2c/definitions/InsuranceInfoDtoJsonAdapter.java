package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.InsuranceInfoDto;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/InsuranceInfoDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/InsuranceInfoDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/InsuranceInfoDto$InsurancePurchaseFlowDto;", "insurancePurchaseFlowDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InsuranceInfoDtoJsonAdapter extends JsonAdapter<InsuranceInfoDto> {
    private final JsonAdapter<InsuranceInfoDto.InsurancePurchaseFlowDto> insurancePurchaseFlowDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("insurance_purchase_flow");

    public InsuranceInfoDtoJsonAdapter(Moshi moshi) {
        this.insurancePurchaseFlowDtoAdapter = moshi.adapter(InsuranceInfoDto.InsurancePurchaseFlowDto.class, EmptySet.a, "insurancePurchaseFlow");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final InsuranceInfoDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        InsuranceInfoDto.InsurancePurchaseFlowDto insurancePurchaseFlowDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0 && (insurancePurchaseFlowDto = this.insurancePurchaseFlowDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("insurancePurchaseFlow", "insurance_purchase_flow", jsonReader);
            }
        }
        jsonReader.endObject();
        if (insurancePurchaseFlowDto != null) {
            return new InsuranceInfoDto(insurancePurchaseFlowDto);
        }
        throw Util.missingProperty("insurancePurchaseFlow", "insurance_purchase_flow", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, InsuranceInfoDto insuranceInfoDto) {
        InsuranceInfoDto insuranceInfoDto2 = insuranceInfoDto;
        if (insuranceInfoDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("insurance_purchase_flow");
        this.insurancePurchaseFlowDtoAdapter.toJson(jsonWriter, (JsonWriter) insuranceInfoDto2.getInsurancePurchaseFlow());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(InsuranceInfoDto)");
    }
}
