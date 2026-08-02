package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formaddressdetails;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.RoutePointsIntervalDto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/PartialAddressDetailsLayoutDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/PartialAddressDetailsLayoutDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/AddressDetailsLayoutDto;", "addressDetailsLayoutDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/RoutePointsIntervalDto;", "routePointsIntervalDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PartialAddressDetailsLayoutDtoJsonAdapter extends JsonAdapter<PartialAddressDetailsLayoutDto> {
    private final JsonAdapter<AddressDetailsLayoutDto> addressDetailsLayoutDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("layout", "route_points_interval");
    private final JsonAdapter<RoutePointsIntervalDto> routePointsIntervalDtoAdapter;

    public PartialAddressDetailsLayoutDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.addressDetailsLayoutDtoAdapter = moshi.adapter(AddressDetailsLayoutDto.class, emptySet, "layout");
        this.routePointsIntervalDtoAdapter = moshi.adapter(RoutePointsIntervalDto.class, emptySet, "routePointsInterval");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PartialAddressDetailsLayoutDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        AddressDetailsLayoutDto addressDetailsLayoutDto = null;
        RoutePointsIntervalDto routePointsIntervalDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                addressDetailsLayoutDto = this.addressDetailsLayoutDtoAdapter.fromJson(jsonReader);
                if (addressDetailsLayoutDto == null) {
                    throw Util.unexpectedNull("layout", "layout", jsonReader);
                }
            } else if (selectName == 1 && (routePointsIntervalDto = this.routePointsIntervalDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("routePointsInterval", "route_points_interval", jsonReader);
            }
        }
        jsonReader.endObject();
        if (addressDetailsLayoutDto == null) {
            throw Util.missingProperty("layout", "layout", jsonReader);
        }
        if (routePointsIntervalDto != null) {
            return new PartialAddressDetailsLayoutDto(addressDetailsLayoutDto, routePointsIntervalDto);
        }
        throw Util.missingProperty("routePointsInterval", "route_points_interval", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PartialAddressDetailsLayoutDto partialAddressDetailsLayoutDto) {
        PartialAddressDetailsLayoutDto partialAddressDetailsLayoutDto2 = partialAddressDetailsLayoutDto;
        if (partialAddressDetailsLayoutDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("layout");
        this.addressDetailsLayoutDtoAdapter.toJson(jsonWriter, (JsonWriter) partialAddressDetailsLayoutDto2.getLayout());
        jsonWriter.name("route_points_interval");
        this.routePointsIntervalDtoAdapter.toJson(jsonWriter, (JsonWriter) partialAddressDetailsLayoutDto2.getRoutePointsInterval());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(52, "GeneratedJsonAdapter(PartialAddressDetailsLayoutDto)");
    }
}
