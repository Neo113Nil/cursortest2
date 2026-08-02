package ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.formclientstate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.x4e;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.definitions.PaymentInfoDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0001HÆ\u0003Js\u0010#\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/formclientstate/FormClientStateDto;", "", "route", "", "Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/formclientstate/FormStateRoutePointDto;", ContactsFragment.WEBVIEW_NAME, "Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/formclientstate/FormStateContactDto;", "paymentInfo", "Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/definitions/PaymentInfoDto;", "pickupPoints", "costCenters", "Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/formclientstate/FormStateCostCenterDto;", "deliveryExtra", "Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/formclientstate/FormStateDeliveryExtraDto;", "asyncTasks", "<init>", "(Ljava/util/List;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/definitions/PaymentInfoDto;Ljava/util/List;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/formclientstate/FormStateDeliveryExtraDto;Ljava/lang/Object;)V", "getRoute", "()Ljava/util/List;", "getContacts", "getPaymentInfo", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/definitions/PaymentInfoDto;", "getPickupPoints", "getCostCenters", "getDeliveryExtra", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/formclientstate/FormStateDeliveryExtraDto;", "getAsyncTasks", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FormClientStateDto {
    private final Object asyncTasks;
    private final List<FormStateContactDto> contacts;
    private final List<FormStateCostCenterDto> costCenters;
    private final FormStateDeliveryExtraDto deliveryExtra;
    private final PaymentInfoDto paymentInfo;
    private final List<FormStateRoutePointDto> pickupPoints;
    private final List<FormStateRoutePointDto> route;

    public FormClientStateDto(@Json(name = "route") List<FormStateRoutePointDto> list, @Json(name = "contacts") List<FormStateContactDto> list2, @Json(name = "payment_info") PaymentInfoDto paymentInfoDto, @Json(name = "pickup_points") List<FormStateRoutePointDto> list3, @Json(name = "cost_centers") List<FormStateCostCenterDto> list4, @Json(name = "delivery_extra") FormStateDeliveryExtraDto formStateDeliveryExtraDto, @Json(name = "async_tasks") Object obj) {
        this.route = list;
        this.contacts = list2;
        this.paymentInfo = paymentInfoDto;
        this.pickupPoints = list3;
        this.costCenters = list4;
        this.deliveryExtra = formStateDeliveryExtraDto;
        this.asyncTasks = obj;
    }

    public static /* synthetic */ FormClientStateDto copy$default(FormClientStateDto formClientStateDto, List list, List list2, PaymentInfoDto paymentInfoDto, List list3, List list4, FormStateDeliveryExtraDto formStateDeliveryExtraDto, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = formClientStateDto.route;
        }
        if ((i & 2) != 0) {
            list2 = formClientStateDto.contacts;
        }
        if ((i & 4) != 0) {
            paymentInfoDto = formClientStateDto.paymentInfo;
        }
        if ((i & 8) != 0) {
            list3 = formClientStateDto.pickupPoints;
        }
        if ((i & 16) != 0) {
            list4 = formClientStateDto.costCenters;
        }
        if ((i & 32) != 0) {
            formStateDeliveryExtraDto = formClientStateDto.deliveryExtra;
        }
        if ((i & 64) != 0) {
            obj = formClientStateDto.asyncTasks;
        }
        FormStateDeliveryExtraDto formStateDeliveryExtraDto2 = formStateDeliveryExtraDto;
        Object obj3 = obj;
        List list5 = list4;
        PaymentInfoDto paymentInfoDto2 = paymentInfoDto;
        return formClientStateDto.copy(list, list2, paymentInfoDto2, list3, list5, formStateDeliveryExtraDto2, obj3);
    }

    public final List<FormStateRoutePointDto> component1() {
        return this.route;
    }

    public final List<FormStateContactDto> component2() {
        return this.contacts;
    }

    /* renamed from: component3, reason: from getter */
    public final PaymentInfoDto getPaymentInfo() {
        return this.paymentInfo;
    }

    public final List<FormStateRoutePointDto> component4() {
        return this.pickupPoints;
    }

    public final List<FormStateCostCenterDto> component5() {
        return this.costCenters;
    }

    /* renamed from: component6, reason: from getter */
    public final FormStateDeliveryExtraDto getDeliveryExtra() {
        return this.deliveryExtra;
    }

    /* renamed from: component7, reason: from getter */
    public final Object getAsyncTasks() {
        return this.asyncTasks;
    }

    public final FormClientStateDto copy(@Json(name = "route") List<FormStateRoutePointDto> route, @Json(name = "contacts") List<FormStateContactDto> contacts, @Json(name = "payment_info") PaymentInfoDto paymentInfo, @Json(name = "pickup_points") List<FormStateRoutePointDto> pickupPoints, @Json(name = "cost_centers") List<FormStateCostCenterDto> costCenters, @Json(name = "delivery_extra") FormStateDeliveryExtraDto deliveryExtra, @Json(name = "async_tasks") Object asyncTasks) {
        return new FormClientStateDto(route, contacts, paymentInfo, pickupPoints, costCenters, deliveryExtra, asyncTasks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormClientStateDto)) {
            return false;
        }
        FormClientStateDto formClientStateDto = (FormClientStateDto) other;
        return jl40.l(this.route, formClientStateDto.route) && jl40.l(this.contacts, formClientStateDto.contacts) && jl40.l(this.paymentInfo, formClientStateDto.paymentInfo) && jl40.l(this.pickupPoints, formClientStateDto.pickupPoints) && jl40.l(this.costCenters, formClientStateDto.costCenters) && jl40.l(this.deliveryExtra, formClientStateDto.deliveryExtra) && jl40.l(this.asyncTasks, formClientStateDto.asyncTasks);
    }

    public final Object getAsyncTasks() {
        return this.asyncTasks;
    }

    public final List<FormStateContactDto> getContacts() {
        return this.contacts;
    }

    public final List<FormStateCostCenterDto> getCostCenters() {
        return this.costCenters;
    }

    public final FormStateDeliveryExtraDto getDeliveryExtra() {
        return this.deliveryExtra;
    }

    public final PaymentInfoDto getPaymentInfo() {
        return this.paymentInfo;
    }

    public final List<FormStateRoutePointDto> getPickupPoints() {
        return this.pickupPoints;
    }

    public final List<FormStateRoutePointDto> getRoute() {
        return this.route;
    }

    public int hashCode() {
        int hashCode = this.route.hashCode() * 31;
        List<FormStateContactDto> list = this.contacts;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        PaymentInfoDto paymentInfoDto = this.paymentInfo;
        int hashCode3 = (hashCode2 + (paymentInfoDto == null ? 0 : paymentInfoDto.hashCode())) * 31;
        List<FormStateRoutePointDto> list2 = this.pickupPoints;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<FormStateCostCenterDto> list3 = this.costCenters;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        FormStateDeliveryExtraDto formStateDeliveryExtraDto = this.deliveryExtra;
        int hashCode6 = (hashCode5 + (formStateDeliveryExtraDto == null ? 0 : formStateDeliveryExtraDto.hashCode())) * 31;
        Object obj = this.asyncTasks;
        return hashCode6 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        List<FormStateRoutePointDto> list = this.route;
        List<FormStateContactDto> list2 = this.contacts;
        PaymentInfoDto paymentInfoDto = this.paymentInfo;
        List<FormStateRoutePointDto> list3 = this.pickupPoints;
        List<FormStateCostCenterDto> list4 = this.costCenters;
        FormStateDeliveryExtraDto formStateDeliveryExtraDto = this.deliveryExtra;
        Object obj = this.asyncTasks;
        StringBuilder v = qv10.v("FormClientStateDto(route=", list, ", contacts=", list2, ", paymentInfo=");
        v.append(paymentInfoDto);
        v.append(", pickupPoints=");
        v.append(list3);
        v.append(", costCenters=");
        v.append(list4);
        v.append(", deliveryExtra=");
        v.append(formStateDeliveryExtraDto);
        v.append(", asyncTasks=");
        return x4e.h(v, obj, Extension.C_BRAKE);
    }
}
