package ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.formclientstate;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.definitions.PaymentInfoDto;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\rR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\r¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/formclientstate/FormClientStateDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/formclientstate/FormClientStateDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/formclientstate/FormStateRoutePointDto;", "listOfFormStateRoutePointDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/formclientstate/FormStateContactDto;", "nullableListOfFormStateContactDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/definitions/PaymentInfoDto;", "nullablePaymentInfoDtoAdapter", "nullableListOfFormStateRoutePointDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/formclientstate/FormStateCostCenterDto;", "nullableListOfFormStateCostCenterDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/formclientstate/FormStateDeliveryExtraDto;", "nullableFormStateDeliveryExtraDtoAdapter", "", "nullableAnyAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FormClientStateDtoJsonAdapter extends JsonAdapter<FormClientStateDto> {
    private final JsonAdapter<List<FormStateRoutePointDto>> listOfFormStateRoutePointDtoAdapter;
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<FormStateDeliveryExtraDto> nullableFormStateDeliveryExtraDtoAdapter;
    private final JsonAdapter<List<FormStateContactDto>> nullableListOfFormStateContactDtoAdapter;
    private final JsonAdapter<List<FormStateCostCenterDto>> nullableListOfFormStateCostCenterDtoAdapter;
    private final JsonAdapter<List<FormStateRoutePointDto>> nullableListOfFormStateRoutePointDtoAdapter;
    private final JsonAdapter<PaymentInfoDto> nullablePaymentInfoDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("route", ContactsFragment.WEBVIEW_NAME, "payment_info", "pickup_points", "cost_centers", "delivery_extra", "async_tasks");

    public FormClientStateDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, FormStateRoutePointDto.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfFormStateRoutePointDtoAdapter = moshi.adapter(newParameterizedType, emptySet, "route");
        this.nullableListOfFormStateContactDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, FormStateContactDto.class), emptySet, ContactsFragment.WEBVIEW_NAME);
        this.nullablePaymentInfoDtoAdapter = moshi.adapter(PaymentInfoDto.class, emptySet, "paymentInfo");
        this.nullableListOfFormStateRoutePointDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, FormStateRoutePointDto.class), emptySet, "pickupPoints");
        this.nullableListOfFormStateCostCenterDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, FormStateCostCenterDto.class), emptySet, "costCenters");
        this.nullableFormStateDeliveryExtraDtoAdapter = moshi.adapter(FormStateDeliveryExtraDto.class, emptySet, "deliveryExtra");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, "asyncTasks");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final FormClientStateDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<FormStateRoutePointDto> list = null;
        List<FormStateContactDto> list2 = null;
        PaymentInfoDto paymentInfoDto = null;
        List<FormStateRoutePointDto> list3 = null;
        List<FormStateCostCenterDto> list4 = null;
        FormStateDeliveryExtraDto formStateDeliveryExtraDto = null;
        Object obj = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    list = this.listOfFormStateRoutePointDtoAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("route", "route", jsonReader);
                    }
                    break;
                case 1:
                    list2 = this.nullableListOfFormStateContactDtoAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    paymentInfoDto = this.nullablePaymentInfoDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    list3 = this.nullableListOfFormStateRoutePointDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    list4 = this.nullableListOfFormStateCostCenterDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    formStateDeliveryExtraDto = this.nullableFormStateDeliveryExtraDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    obj = this.nullableAnyAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (list != null) {
            return new FormClientStateDto(list, list2, paymentInfoDto, list3, list4, formStateDeliveryExtraDto, obj);
        }
        throw Util.missingProperty("route", "route", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, FormClientStateDto formClientStateDto) {
        FormClientStateDto formClientStateDto2 = formClientStateDto;
        if (formClientStateDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("route");
        this.listOfFormStateRoutePointDtoAdapter.toJson(jsonWriter, (JsonWriter) formClientStateDto2.getRoute());
        jsonWriter.name(ContactsFragment.WEBVIEW_NAME);
        this.nullableListOfFormStateContactDtoAdapter.toJson(jsonWriter, (JsonWriter) formClientStateDto2.getContacts());
        jsonWriter.name("payment_info");
        this.nullablePaymentInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) formClientStateDto2.getPaymentInfo());
        jsonWriter.name("pickup_points");
        this.nullableListOfFormStateRoutePointDtoAdapter.toJson(jsonWriter, (JsonWriter) formClientStateDto2.getPickupPoints());
        jsonWriter.name("cost_centers");
        this.nullableListOfFormStateCostCenterDtoAdapter.toJson(jsonWriter, (JsonWriter) formClientStateDto2.getCostCenters());
        jsonWriter.name("delivery_extra");
        this.nullableFormStateDeliveryExtraDtoAdapter.toJson(jsonWriter, (JsonWriter) formClientStateDto2.getDeliveryExtra());
        jsonWriter.name("async_tasks");
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) formClientStateDto2.getAsyncTasks());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(FormClientStateDto)");
    }
}
