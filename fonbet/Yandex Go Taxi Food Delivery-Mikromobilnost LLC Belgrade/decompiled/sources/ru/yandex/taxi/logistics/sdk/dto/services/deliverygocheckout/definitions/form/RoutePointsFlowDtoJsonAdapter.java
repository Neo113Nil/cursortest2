package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/RoutePointsFlowDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/RoutePointsFlowDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/RoutePointDto;", "nullableListOfRoutePointDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RoutePointsFlowDtoJsonAdapter extends JsonAdapter<RoutePointsFlowDto> {
    private final JsonAdapter<List<RoutePointDto>> nullableListOfRoutePointDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(CRLDistributionPointsExtension.POINTS);

    public RoutePointsFlowDtoJsonAdapter(Moshi moshi) {
        this.nullableListOfRoutePointDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, RoutePointDto.class), EmptySet.a, CRLDistributionPointsExtension.POINTS);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RoutePointsFlowDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<RoutePointDto> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.nullableListOfRoutePointDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new RoutePointsFlowDto(list);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RoutePointsFlowDto routePointsFlowDto) {
        RoutePointsFlowDto routePointsFlowDto2 = routePointsFlowDto;
        if (routePointsFlowDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(CRLDistributionPointsExtension.POINTS);
        this.nullableListOfRoutePointDtoAdapter.toJson(jsonWriter, (JsonWriter) routePointsFlowDto2.getPoints());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(RoutePointsFlowDto)");
    }
}
