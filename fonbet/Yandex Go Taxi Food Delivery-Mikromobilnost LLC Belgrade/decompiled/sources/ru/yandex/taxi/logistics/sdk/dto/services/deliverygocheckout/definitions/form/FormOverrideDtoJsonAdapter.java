package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form;

import com.adjust.sdk.Constants;
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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form.FormOverrideDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formaddressdetails.AddressDetailsLayoutDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formaddressdetails.PartialAddressDetailsLayoutDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formlayoutmodifiers.FormOverrideModifierDescriptorDto;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\fR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\fR\"\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020!\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\f¨\u0006#"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormOverrideDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormOverrideDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/OfferDto;", "nullableOfferDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableListOfOfferDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormLayoutOverrideDto;", "formLayoutOverrideDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/AddressDetailsLayoutDto;", "nullableAddressDetailsLayoutDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/PartialAddressDetailsLayoutDto;", "nullableListOfPartialAddressDetailsLayoutDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormModalViewDto;", "nullableListOfFormModalViewDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormOverrideDto$FormThemeDto;", "nullableFormThemeDtoAdapter", "", "nullableAnyAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/SendEventPayloadDto;", "nullableSendEventPayloadDtoAdapter", "", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormDefaultsDto;", "nullableFormDefaultsDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formlayoutmodifiers/FormOverrideModifierDescriptorDto;", "nullableListOfFormOverrideModifierDescriptorDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FormOverrideDtoJsonAdapter extends JsonAdapter<FormOverrideDto> {
    private final JsonAdapter<FormLayoutOverrideDto> formLayoutOverrideDtoAdapter;
    private final JsonAdapter<AddressDetailsLayoutDto> nullableAddressDetailsLayoutDtoAdapter;
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<FormDefaultsDto> nullableFormDefaultsDtoAdapter;
    private final JsonAdapter<FormOverrideDto.FormThemeDto> nullableFormThemeDtoAdapter;
    private final JsonAdapter<List<FormModalViewDto>> nullableListOfFormModalViewDtoAdapter;
    private final JsonAdapter<List<FormOverrideModifierDescriptorDto>> nullableListOfFormOverrideModifierDescriptorDtoAdapter;
    private final JsonAdapter<List<OfferDto>> nullableListOfOfferDtoAdapter;
    private final JsonAdapter<List<PartialAddressDetailsLayoutDto>> nullableListOfPartialAddressDetailsLayoutDtoAdapter;
    private final JsonAdapter<OfferDto> nullableOfferDtoAdapter;
    private final JsonAdapter<SendEventPayloadDto> nullableSendEventPayloadDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("offer", "offers", "layout", "address_details_layout", "partial_address_details_layouts", "modals", "form_theme", Constants.REFERRER_API_META, "send_event_payload", "metrica_label", "defaults", "modifiers");

    public FormOverrideDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableOfferDtoAdapter = moshi.adapter(OfferDto.class, emptySet, "offer");
        this.nullableListOfOfferDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, OfferDto.class), emptySet, "offers");
        this.formLayoutOverrideDtoAdapter = moshi.adapter(FormLayoutOverrideDto.class, emptySet, "layout");
        this.nullableAddressDetailsLayoutDtoAdapter = moshi.adapter(AddressDetailsLayoutDto.class, emptySet, "addressDetailsLayout");
        this.nullableListOfPartialAddressDetailsLayoutDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, PartialAddressDetailsLayoutDto.class), emptySet, "partialAddressDetailsLayouts");
        this.nullableListOfFormModalViewDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, FormModalViewDto.class), emptySet, "modals");
        this.nullableFormThemeDtoAdapter = moshi.adapter(FormOverrideDto.FormThemeDto.class, emptySet, "formTheme");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, Constants.REFERRER_API_META);
        this.nullableSendEventPayloadDtoAdapter = moshi.adapter(SendEventPayloadDto.class, emptySet, "sendEventPayload");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
        this.nullableFormDefaultsDtoAdapter = moshi.adapter(FormDefaultsDto.class, emptySet, "defaults");
        this.nullableListOfFormOverrideModifierDescriptorDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, FormOverrideModifierDescriptorDto.class), emptySet, "modifiers");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final FormOverrideDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        OfferDto offerDto = null;
        List<OfferDto> list = null;
        FormLayoutOverrideDto formLayoutOverrideDto = null;
        AddressDetailsLayoutDto addressDetailsLayoutDto = null;
        List<PartialAddressDetailsLayoutDto> list2 = null;
        List<FormModalViewDto> list3 = null;
        FormOverrideDto.FormThemeDto formThemeDto = null;
        Object obj = null;
        SendEventPayloadDto sendEventPayloadDto = null;
        String str = null;
        FormDefaultsDto formDefaultsDto = null;
        List<FormOverrideModifierDescriptorDto> list4 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    offerDto = this.nullableOfferDtoAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    list = this.nullableListOfOfferDtoAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    formLayoutOverrideDto = this.formLayoutOverrideDtoAdapter.fromJson(jsonReader);
                    if (formLayoutOverrideDto == null) {
                        throw Util.unexpectedNull("layout", "layout", jsonReader);
                    }
                    break;
                case 3:
                    addressDetailsLayoutDto = this.nullableAddressDetailsLayoutDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    list2 = this.nullableListOfPartialAddressDetailsLayoutDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    list3 = this.nullableListOfFormModalViewDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    formThemeDto = this.nullableFormThemeDtoAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    obj = this.nullableAnyAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    sendEventPayloadDto = this.nullableSendEventPayloadDtoAdapter.fromJson(jsonReader);
                    break;
                case 9:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 10:
                    formDefaultsDto = this.nullableFormDefaultsDtoAdapter.fromJson(jsonReader);
                    break;
                case 11:
                    list4 = this.nullableListOfFormOverrideModifierDescriptorDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (formLayoutOverrideDto != null) {
            return new FormOverrideDto(offerDto, list, formLayoutOverrideDto, addressDetailsLayoutDto, list2, list3, formThemeDto, obj, sendEventPayloadDto, str, formDefaultsDto, list4);
        }
        throw Util.missingProperty("layout", "layout", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, FormOverrideDto formOverrideDto) {
        FormOverrideDto formOverrideDto2 = formOverrideDto;
        if (formOverrideDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("offer");
        this.nullableOfferDtoAdapter.toJson(jsonWriter, (JsonWriter) formOverrideDto2.getOffer());
        jsonWriter.name("offers");
        this.nullableListOfOfferDtoAdapter.toJson(jsonWriter, (JsonWriter) formOverrideDto2.getOffers());
        jsonWriter.name("layout");
        this.formLayoutOverrideDtoAdapter.toJson(jsonWriter, (JsonWriter) formOverrideDto2.getLayout());
        jsonWriter.name("address_details_layout");
        this.nullableAddressDetailsLayoutDtoAdapter.toJson(jsonWriter, (JsonWriter) formOverrideDto2.getAddressDetailsLayout());
        jsonWriter.name("partial_address_details_layouts");
        this.nullableListOfPartialAddressDetailsLayoutDtoAdapter.toJson(jsonWriter, (JsonWriter) formOverrideDto2.getPartialAddressDetailsLayouts());
        jsonWriter.name("modals");
        this.nullableListOfFormModalViewDtoAdapter.toJson(jsonWriter, (JsonWriter) formOverrideDto2.getModals());
        jsonWriter.name("form_theme");
        this.nullableFormThemeDtoAdapter.toJson(jsonWriter, (JsonWriter) formOverrideDto2.getFormTheme());
        jsonWriter.name(Constants.REFERRER_API_META);
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) formOverrideDto2.getMeta());
        jsonWriter.name("send_event_payload");
        this.nullableSendEventPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) formOverrideDto2.getSendEventPayload());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) formOverrideDto2.getMetricaLabel());
        jsonWriter.name("defaults");
        this.nullableFormDefaultsDtoAdapter.toJson(jsonWriter, (JsonWriter) formOverrideDto2.getDefaults());
        jsonWriter.name("modifiers");
        this.nullableListOfFormOverrideModifierDescriptorDtoAdapter.toJson(jsonWriter, (JsonWriter) formOverrideDto2.getModifiers());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(FormOverrideDto)");
    }
}
