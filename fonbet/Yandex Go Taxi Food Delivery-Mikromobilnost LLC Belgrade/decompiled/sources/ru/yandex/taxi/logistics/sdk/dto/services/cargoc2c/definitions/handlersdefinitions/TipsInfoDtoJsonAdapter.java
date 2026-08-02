package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handlersdefinitions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.TipsTypeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverypaymentcontext.PaymentContextDto;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/TipsInfoDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/TipsInfoDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/TipsTypeDto;", "nullableTipsTypeDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "stringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverypaymentcontext/PaymentContextDto;", "nullablePaymentContextDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TipsInfoDtoJsonAdapter extends JsonAdapter<TipsInfoDto> {
    private final JsonAdapter<PaymentContextDto> nullablePaymentContextDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TipsTypeDto> nullableTipsTypeDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("type", "decimal_value", "choice_id", "payment_context");
    private final JsonAdapter<String> stringAdapter;

    public TipsInfoDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableTipsTypeDtoAdapter = moshi.adapter(TipsTypeDto.class, emptySet, "type");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "decimalValue");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "choiceId");
        this.nullablePaymentContextDtoAdapter = moshi.adapter(PaymentContextDto.class, emptySet, "paymentContext");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TipsInfoDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        TipsTypeDto tipsTypeDto = null;
        String str = null;
        String str2 = null;
        PaymentContextDto paymentContextDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                tipsTypeDto = this.nullableTipsTypeDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("choiceId", "choice_id", jsonReader);
                }
            } else if (selectName == 3) {
                paymentContextDto = this.nullablePaymentContextDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str2 != null) {
            return new TipsInfoDto(tipsTypeDto, str, str2, paymentContextDto);
        }
        throw Util.missingProperty("choiceId", "choice_id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TipsInfoDto tipsInfoDto) {
        TipsInfoDto tipsInfoDto2 = tipsInfoDto;
        if (tipsInfoDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("type");
        this.nullableTipsTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) tipsInfoDto2.getType());
        jsonWriter.name("decimal_value");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) tipsInfoDto2.getDecimalValue());
        jsonWriter.name("choice_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) tipsInfoDto2.getChoiceId());
        jsonWriter.name("payment_context");
        this.nullablePaymentContextDtoAdapter.toJson(jsonWriter, (JsonWriter) tipsInfoDto2.getPaymentContext());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(33, "GeneratedJsonAdapter(TipsInfoDto)");
    }
}
