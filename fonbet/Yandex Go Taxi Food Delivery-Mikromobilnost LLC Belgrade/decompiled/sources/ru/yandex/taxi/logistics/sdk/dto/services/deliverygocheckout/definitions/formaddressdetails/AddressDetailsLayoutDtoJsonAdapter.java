package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formaddressdetails;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AddressFlowDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.SectionDto;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\fR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/AddressDetailsLayoutDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/AddressDetailsLayoutDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/AddressDetailsHeaderDto;", "nullableAddressDetailsHeaderDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SectionDto;", "nullableSectionDtoAdapter", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/RoutePointDescriptionDto;", "nullableListOfRoutePointDescriptionDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;", "nullableAddressFlowDtoAdapter", "", "nullableStringAdapter", "", "booleanAdapter", "", "intAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/VerticalBarDto;", "nullableVerticalBarDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AddressDetailsLayoutDtoJsonAdapter extends JsonAdapter<AddressDetailsLayoutDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<AddressDetailsLayoutDto> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<AddressDetailsHeaderDto> nullableAddressDetailsHeaderDtoAdapter;
    private final JsonAdapter<AddressFlowDto> nullableAddressFlowDtoAdapter;
    private final JsonAdapter<List<RoutePointDescriptionDto>> nullableListOfRoutePointDescriptionDtoAdapter;
    private final JsonAdapter<SectionDto> nullableSectionDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<VerticalBarDto> nullableVerticalBarDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("header", "top_section", "bottom_section", "sticky_bottom_section", "route_points", "address_flow", "metrica_label", "open_event_state_key", "show_default_finish_button", "spacing_height", "spacing_color", "vertical_bar");

    public AddressDetailsLayoutDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableAddressDetailsHeaderDtoAdapter = moshi.adapter(AddressDetailsHeaderDto.class, emptySet, "header");
        this.nullableSectionDtoAdapter = moshi.adapter(SectionDto.class, emptySet, "topSection");
        this.nullableListOfRoutePointDescriptionDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, RoutePointDescriptionDto.class), emptySet, "routePoints");
        this.nullableAddressFlowDtoAdapter = moshi.adapter(AddressFlowDto.class, emptySet, "addressFlow");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "showDefaultFinishButton");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "spacingHeight");
        this.nullableVerticalBarDtoAdapter = moshi.adapter(VerticalBarDto.class, emptySet, "verticalBar");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AddressDetailsLayoutDto fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        SectionDto sectionDto = null;
        Boolean bool2 = bool;
        Integer num = 0;
        SectionDto sectionDto2 = null;
        SectionDto sectionDto3 = null;
        AddressDetailsHeaderDto addressDetailsHeaderDto = null;
        String str = null;
        String str2 = null;
        AddressFlowDto addressFlowDto = null;
        String str3 = null;
        VerticalBarDto verticalBarDto = null;
        int i = -1;
        List<RoutePointDescriptionDto> list = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    addressDetailsHeaderDto = this.nullableAddressDetailsHeaderDtoAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    sectionDto2 = this.nullableSectionDtoAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    sectionDto3 = this.nullableSectionDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    sectionDto = this.nullableSectionDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    list = this.nullableListOfRoutePointDescriptionDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    addressFlowDto = this.nullableAddressFlowDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("showDefaultFinishButton", "show_default_finish_button", jsonReader);
                    }
                    i &= -257;
                    break;
                case 9:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("spacingHeight", "spacing_height", jsonReader);
                    }
                    i &= -513;
                    break;
                case 10:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 11:
                    verticalBarDto = this.nullableVerticalBarDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -769) {
            return new AddressDetailsLayoutDto(addressDetailsHeaderDto, sectionDto2, sectionDto3, sectionDto, list, addressFlowDto, str, str2, bool2.booleanValue(), num.intValue(), str3, verticalBarDto);
        }
        AddressDetailsHeaderDto addressDetailsHeaderDto2 = addressDetailsHeaderDto;
        AddressFlowDto addressFlowDto2 = addressFlowDto;
        Constructor<AddressDetailsLayoutDto> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Integer.TYPE;
            constructor = AddressDetailsLayoutDto.class.getDeclaredConstructor(AddressDetailsHeaderDto.class, SectionDto.class, SectionDto.class, SectionDto.class, List.class, AddressFlowDto.class, String.class, String.class, cls2, cls3, String.class, VerticalBarDto.class, cls3, cls);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(addressDetailsHeaderDto2, sectionDto2, sectionDto3, sectionDto, list, addressFlowDto2, str, str2, bool2, num, str3, verticalBarDto, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AddressDetailsLayoutDto addressDetailsLayoutDto) {
        AddressDetailsLayoutDto addressDetailsLayoutDto2 = addressDetailsLayoutDto;
        if (addressDetailsLayoutDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("header");
        this.nullableAddressDetailsHeaderDtoAdapter.toJson(jsonWriter, (JsonWriter) addressDetailsLayoutDto2.getHeader());
        jsonWriter.name("top_section");
        this.nullableSectionDtoAdapter.toJson(jsonWriter, (JsonWriter) addressDetailsLayoutDto2.getTopSection());
        jsonWriter.name("bottom_section");
        this.nullableSectionDtoAdapter.toJson(jsonWriter, (JsonWriter) addressDetailsLayoutDto2.getBottomSection());
        jsonWriter.name("sticky_bottom_section");
        this.nullableSectionDtoAdapter.toJson(jsonWriter, (JsonWriter) addressDetailsLayoutDto2.getStickyBottomSection());
        jsonWriter.name("route_points");
        this.nullableListOfRoutePointDescriptionDtoAdapter.toJson(jsonWriter, (JsonWriter) addressDetailsLayoutDto2.getRoutePoints());
        jsonWriter.name("address_flow");
        this.nullableAddressFlowDtoAdapter.toJson(jsonWriter, (JsonWriter) addressDetailsLayoutDto2.getAddressFlow());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) addressDetailsLayoutDto2.getMetricaLabel());
        jsonWriter.name("open_event_state_key");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) addressDetailsLayoutDto2.getOpenEventStateKey());
        jsonWriter.name("show_default_finish_button");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(addressDetailsLayoutDto2.getShowDefaultFinishButton()));
        jsonWriter.name("spacing_height");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(addressDetailsLayoutDto2.getSpacingHeight()));
        jsonWriter.name("spacing_color");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) addressDetailsLayoutDto2.getSpacingColor());
        jsonWriter.name("vertical_bar");
        this.nullableVerticalBarDtoAdapter.toJson(jsonWriter, (JsonWriter) addressDetailsLayoutDto2.getVerticalBar());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(AddressDetailsLayoutDto)");
    }
}
