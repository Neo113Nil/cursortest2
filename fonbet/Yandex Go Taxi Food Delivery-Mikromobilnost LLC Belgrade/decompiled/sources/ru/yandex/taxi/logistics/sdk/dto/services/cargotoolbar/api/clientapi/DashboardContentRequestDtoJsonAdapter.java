package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.api.clientapi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.CoordinateDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.PaymentInfoDto;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/api/clientapi/DashboardContentRequestDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/api/clientapi/DashboardContentRequestDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/CoordinateDto;", "coordinateDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "doubleAdapter", "", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/PaymentInfoDto;", "nullablePaymentInfoDtoAdapter", "", "nullableListOfStringAdapter", "", "nullableBooleanAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DashboardContentRequestDtoJsonAdapter extends JsonAdapter<DashboardContentRequestDto> {
    private final JsonAdapter<CoordinateDto> coordinateDtoAdapter;
    private final JsonAdapter<Double> doubleAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<PaymentInfoDto> nullablePaymentInfoDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("coordinate", "accuracy", "corp_client_id", "payment_info", "supported_widgets", "supported_actions", "flat_navigation_enabled");

    public DashboardContentRequestDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.coordinateDtoAdapter = moshi.adapter(CoordinateDto.class, emptySet, "coordinate");
        this.doubleAdapter = moshi.adapter(Double.TYPE, emptySet, "accuracy");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "corpClientId");
        this.nullablePaymentInfoDtoAdapter = moshi.adapter(PaymentInfoDto.class, emptySet, "paymentInfo");
        this.nullableListOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, "supportedWidgets");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "flatNavigationEnabled");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DashboardContentRequestDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Double d = null;
        CoordinateDto coordinateDto = null;
        String str = null;
        PaymentInfoDto paymentInfoDto = null;
        List<String> list = null;
        List<String> list2 = null;
        Boolean bool = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    coordinateDto = this.coordinateDtoAdapter.fromJson(jsonReader);
                    if (coordinateDto == null) {
                        throw Util.unexpectedNull("coordinate", "coordinate", jsonReader);
                    }
                    break;
                case 1:
                    d = this.doubleAdapter.fromJson(jsonReader);
                    if (d == null) {
                        throw Util.unexpectedNull("accuracy", "accuracy", jsonReader);
                    }
                    break;
                case 2:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    paymentInfoDto = this.nullablePaymentInfoDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    list = this.nullableListOfStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    list2 = this.nullableListOfStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (coordinateDto == null) {
            throw Util.missingProperty("coordinate", "coordinate", jsonReader);
        }
        if (d != null) {
            return new DashboardContentRequestDto(coordinateDto, d.doubleValue(), str, paymentInfoDto, list, list2, bool);
        }
        throw Util.missingProperty("accuracy", "accuracy", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DashboardContentRequestDto dashboardContentRequestDto) {
        DashboardContentRequestDto dashboardContentRequestDto2 = dashboardContentRequestDto;
        if (dashboardContentRequestDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("coordinate");
        this.coordinateDtoAdapter.toJson(jsonWriter, (JsonWriter) dashboardContentRequestDto2.getCoordinate());
        jsonWriter.name("accuracy");
        this.doubleAdapter.toJson(jsonWriter, (JsonWriter) Double.valueOf(dashboardContentRequestDto2.getAccuracy()));
        jsonWriter.name("corp_client_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) dashboardContentRequestDto2.getCorpClientId());
        jsonWriter.name("payment_info");
        this.nullablePaymentInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) dashboardContentRequestDto2.getPaymentInfo());
        jsonWriter.name("supported_widgets");
        this.nullableListOfStringAdapter.toJson(jsonWriter, (JsonWriter) dashboardContentRequestDto2.getSupportedWidgets());
        jsonWriter.name("supported_actions");
        this.nullableListOfStringAdapter.toJson(jsonWriter, (JsonWriter) dashboardContentRequestDto2.getSupportedActions());
        jsonWriter.name("flat_navigation_enabled");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) dashboardContentRequestDto2.getFlatNavigationEnabled());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(DashboardContentRequestDto)");
    }
}
