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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ImageDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.LeadIconSpotDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.SlotLeadDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.SectionDto;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\"\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\fR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\fR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\fR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/RoutePointDescriptionDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/RoutePointDescriptionDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "imageDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SlotLeadDto;", "nullableSlotLeadDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LeadIconSpotDto;", "nullableLeadIconSpotDtoAdapter", "", "stringAdapter", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/AddressDetailsBubbleDto;", "nullableListOfAddressDetailsBubbleDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/AddressDetailsFieldTypeDto;", "nullableListOfAddressDetailsFieldTypeDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SectionDto;", "nullableSectionDtoAdapter", "", "booleanAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;", "nullableAddressFlowDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/CommentPopupDto;", "nullableCommentPopupDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RoutePointDescriptionDtoJsonAdapter extends JsonAdapter<RoutePointDescriptionDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<RoutePointDescriptionDto> constructorRef;
    private final JsonAdapter<ImageDto> imageDtoAdapter;
    private final JsonAdapter<AddressFlowDto> nullableAddressFlowDtoAdapter;
    private final JsonAdapter<CommentPopupDto> nullableCommentPopupDtoAdapter;
    private final JsonAdapter<LeadIconSpotDto> nullableLeadIconSpotDtoAdapter;
    private final JsonAdapter<List<AddressDetailsBubbleDto>> nullableListOfAddressDetailsBubbleDtoAdapter;
    private final JsonAdapter<List<AddressDetailsFieldTypeDto>> nullableListOfAddressDetailsFieldTypeDtoAdapter;
    private final JsonAdapter<SectionDto> nullableSectionDtoAdapter;
    private final JsonAdapter<SlotLeadDto> nullableSlotLeadDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("icon", "selected_lead", "unselected_lead", "map_pin", "additional_title_info", "bubbles", "hidden_fields", "section", "close_details_after_address_selection", "show_delete_button", "address_flow", "comment_popup", "show_mini_map");
    private final JsonAdapter<String> stringAdapter;

    public RoutePointDescriptionDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.imageDtoAdapter = moshi.adapter(ImageDto.class, emptySet, "icon");
        this.nullableSlotLeadDtoAdapter = moshi.adapter(SlotLeadDto.class, emptySet, "selectedLead");
        this.nullableLeadIconSpotDtoAdapter = moshi.adapter(LeadIconSpotDto.class, emptySet, "mapPin");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "additionalTitleInfo");
        this.nullableListOfAddressDetailsBubbleDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, AddressDetailsBubbleDto.class), emptySet, "bubbles");
        this.nullableListOfAddressDetailsFieldTypeDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, AddressDetailsFieldTypeDto.class), emptySet, "hiddenFields");
        this.nullableSectionDtoAdapter = moshi.adapter(SectionDto.class, emptySet, "section");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "closeDetailsAfterAddressSelection");
        this.nullableAddressFlowDtoAdapter = moshi.adapter(AddressFlowDto.class, emptySet, "addressFlow");
        this.nullableCommentPopupDtoAdapter = moshi.adapter(CommentPopupDto.class, emptySet, "commentPopup");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RoutePointDescriptionDto fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        int i = -1;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Boolean bool4 = bool3;
        AddressFlowDto addressFlowDto = null;
        ImageDto imageDto = null;
        SlotLeadDto slotLeadDto = null;
        SlotLeadDto slotLeadDto2 = null;
        LeadIconSpotDto leadIconSpotDto = null;
        String str = null;
        List<AddressDetailsBubbleDto> list = null;
        List<AddressDetailsFieldTypeDto> list2 = null;
        SectionDto sectionDto = null;
        CommentPopupDto commentPopupDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    imageDto = this.imageDtoAdapter.fromJson(jsonReader);
                    if (imageDto == null) {
                        throw Util.unexpectedNull("icon", "icon", jsonReader);
                    }
                    break;
                case 1:
                    slotLeadDto = this.nullableSlotLeadDtoAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    slotLeadDto2 = this.nullableSlotLeadDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    leadIconSpotDto = this.nullableLeadIconSpotDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("additionalTitleInfo", "additional_title_info", jsonReader);
                    }
                    break;
                case 5:
                    list = this.nullableListOfAddressDetailsBubbleDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    list2 = this.nullableListOfAddressDetailsFieldTypeDtoAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    sectionDto = this.nullableSectionDtoAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("closeDetailsAfterAddressSelection", "close_details_after_address_selection", jsonReader);
                    }
                    i &= -257;
                    break;
                case 9:
                    bool3 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool3 == null) {
                        throw Util.unexpectedNull("showDeleteButton", "show_delete_button", jsonReader);
                    }
                    i &= -513;
                    break;
                case 10:
                    addressFlowDto = this.nullableAddressFlowDtoAdapter.fromJson(jsonReader);
                    break;
                case 11:
                    commentPopupDto = this.nullableCommentPopupDtoAdapter.fromJson(jsonReader);
                    break;
                case 12:
                    bool4 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool4 == null) {
                        throw Util.unexpectedNull("showMiniMap", "show_mini_map", jsonReader);
                    }
                    i &= -4097;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -4865) {
            if (imageDto == null) {
                throw Util.missingProperty("icon", "icon", jsonReader);
            }
            if (str == null) {
                throw Util.missingProperty("additionalTitleInfo", "additional_title_info", jsonReader);
            }
            return new RoutePointDescriptionDto(imageDto, slotLeadDto, slotLeadDto2, leadIconSpotDto, str, list, list2, sectionDto, bool2.booleanValue(), bool3.booleanValue(), addressFlowDto, commentPopupDto, bool4.booleanValue());
        }
        Constructor<RoutePointDescriptionDto> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class<?> cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls3 = Boolean.TYPE;
            constructor = RoutePointDescriptionDto.class.getDeclaredConstructor(ImageDto.class, SlotLeadDto.class, SlotLeadDto.class, LeadIconSpotDto.class, String.class, List.class, List.class, SectionDto.class, cls3, cls3, AddressFlowDto.class, CommentPopupDto.class, cls3, cls, cls2);
            this.constructorRef = constructor;
        }
        if (imageDto == null) {
            throw Util.missingProperty("icon", "icon", jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty("additionalTitleInfo", "additional_title_info", jsonReader);
        }
        return constructor.newInstance(imageDto, slotLeadDto, slotLeadDto2, leadIconSpotDto, str, list, list2, sectionDto, bool2, bool3, addressFlowDto, commentPopupDto, bool4, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RoutePointDescriptionDto routePointDescriptionDto) {
        RoutePointDescriptionDto routePointDescriptionDto2 = routePointDescriptionDto;
        if (routePointDescriptionDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("icon");
        this.imageDtoAdapter.toJson(jsonWriter, (JsonWriter) routePointDescriptionDto2.getIcon());
        jsonWriter.name("selected_lead");
        this.nullableSlotLeadDtoAdapter.toJson(jsonWriter, (JsonWriter) routePointDescriptionDto2.getSelectedLead());
        jsonWriter.name("unselected_lead");
        this.nullableSlotLeadDtoAdapter.toJson(jsonWriter, (JsonWriter) routePointDescriptionDto2.getUnselectedLead());
        jsonWriter.name("map_pin");
        this.nullableLeadIconSpotDtoAdapter.toJson(jsonWriter, (JsonWriter) routePointDescriptionDto2.getMapPin());
        jsonWriter.name("additional_title_info");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) routePointDescriptionDto2.getAdditionalTitleInfo());
        jsonWriter.name("bubbles");
        this.nullableListOfAddressDetailsBubbleDtoAdapter.toJson(jsonWriter, (JsonWriter) routePointDescriptionDto2.getBubbles());
        jsonWriter.name("hidden_fields");
        this.nullableListOfAddressDetailsFieldTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) routePointDescriptionDto2.getHiddenFields());
        jsonWriter.name("section");
        this.nullableSectionDtoAdapter.toJson(jsonWriter, (JsonWriter) routePointDescriptionDto2.getSection());
        jsonWriter.name("close_details_after_address_selection");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(routePointDescriptionDto2.getCloseDetailsAfterAddressSelection()));
        jsonWriter.name("show_delete_button");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(routePointDescriptionDto2.getShowDeleteButton()));
        jsonWriter.name("address_flow");
        this.nullableAddressFlowDtoAdapter.toJson(jsonWriter, (JsonWriter) routePointDescriptionDto2.getAddressFlow());
        jsonWriter.name("comment_popup");
        this.nullableCommentPopupDtoAdapter.toJson(jsonWriter, (JsonWriter) routePointDescriptionDto2.getCommentPopup());
        jsonWriter.name("show_mini_map");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(routePointDescriptionDto2.getShowMiniMap()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(RoutePointDescriptionDto)");
    }
}
