package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AddressFlowDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AddressRouteTypeDto;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/AddDestinationActionDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/AddDestinationActionDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDto;", "nullableAddressRouteTypeDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;", "nullableAddressFlowDtoAdapter", "", "nullableStringAdapter", "", "nullableIntAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AddDestinationActionDtoJsonAdapter extends JsonAdapter<AddDestinationActionDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<AddDestinationActionDto> constructorRef;
    private final JsonAdapter<AddressFlowDto> nullableAddressFlowDtoAdapter;
    private final JsonAdapter<AddressRouteTypeDto> nullableAddressRouteTypeDtoAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("route_type", "address_flow", "search_text", "point_index", "skip_address_details");

    public AddDestinationActionDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableAddressRouteTypeDtoAdapter = moshi.adapter(AddressRouteTypeDto.class, emptySet, "routeType");
        this.nullableAddressFlowDtoAdapter = moshi.adapter(AddressFlowDto.class, emptySet, "addressFlow");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "searchText");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "pointIndex");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "skipAddressDetails");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AddDestinationActionDto fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        Boolean bool2 = bool;
        AddressRouteTypeDto addressRouteTypeDto = null;
        AddressFlowDto addressFlowDto = null;
        String str = null;
        Integer num = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                addressRouteTypeDto = this.nullableAddressRouteTypeDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                addressFlowDto = this.nullableAddressFlowDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                num = this.nullableIntAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                bool2 = this.booleanAdapter.fromJson(jsonReader);
                if (bool2 == null) {
                    throw Util.unexpectedNull("skipAddressDetails", "skip_address_details", jsonReader);
                }
                i = -17;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -17) {
            return new AddDestinationActionDto(addressRouteTypeDto, addressFlowDto, str, num, bool2.booleanValue());
        }
        Constructor<AddDestinationActionDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AddDestinationActionDto.class.getDeclaredConstructor(AddressRouteTypeDto.class, AddressFlowDto.class, String.class, Integer.class, Boolean.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(addressRouteTypeDto, addressFlowDto, str, num, bool2, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AddDestinationActionDto addDestinationActionDto) {
        AddDestinationActionDto addDestinationActionDto2 = addDestinationActionDto;
        if (addDestinationActionDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("route_type");
        this.nullableAddressRouteTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) addDestinationActionDto2.getRouteType());
        jsonWriter.name("address_flow");
        this.nullableAddressFlowDtoAdapter.toJson(jsonWriter, (JsonWriter) addDestinationActionDto2.getAddressFlow());
        jsonWriter.name("search_text");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) addDestinationActionDto2.getSearchText());
        jsonWriter.name("point_index");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) addDestinationActionDto2.getPointIndex());
        jsonWriter.name("skip_address_details");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(addDestinationActionDto2.getSkipAddressDetails()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(AddDestinationActionDto)");
    }
}
