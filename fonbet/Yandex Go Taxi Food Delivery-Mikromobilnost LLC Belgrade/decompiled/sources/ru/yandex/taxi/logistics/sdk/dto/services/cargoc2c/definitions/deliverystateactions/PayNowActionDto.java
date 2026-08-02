package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/PayNowActionDto;", "", "availablePaymentTypes", "", "", "paymentItem", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/PaymentItemDto;", "paymentChosenButton", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ButtonItemDto;", "aboutToChooseButton", "<init>", "(Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/PaymentItemDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ButtonItemDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ButtonItemDto;)V", "getAvailablePaymentTypes", "()Ljava/util/List;", "getPaymentItem", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/PaymentItemDto;", "getPaymentChosenButton", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ButtonItemDto;", "getAboutToChooseButton", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PayNowActionDto {
    private final ButtonItemDto aboutToChooseButton;
    private final List<String> availablePaymentTypes;
    private final ButtonItemDto paymentChosenButton;
    private final PaymentItemDto paymentItem;

    public PayNowActionDto(@Json(name = "available_payment_types") List<String> list, @Json(name = "payment_item") PaymentItemDto paymentItemDto, @Json(name = "payment_chosen_button") ButtonItemDto buttonItemDto, @Json(name = "about_to_choose_button") ButtonItemDto buttonItemDto2) {
        this.availablePaymentTypes = list;
        this.paymentItem = paymentItemDto;
        this.paymentChosenButton = buttonItemDto;
        this.aboutToChooseButton = buttonItemDto2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PayNowActionDto copy$default(PayNowActionDto payNowActionDto, List list, PaymentItemDto paymentItemDto, ButtonItemDto buttonItemDto, ButtonItemDto buttonItemDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = payNowActionDto.availablePaymentTypes;
        }
        if ((i & 2) != 0) {
            paymentItemDto = payNowActionDto.paymentItem;
        }
        if ((i & 4) != 0) {
            buttonItemDto = payNowActionDto.paymentChosenButton;
        }
        if ((i & 8) != 0) {
            buttonItemDto2 = payNowActionDto.aboutToChooseButton;
        }
        return payNowActionDto.copy(list, paymentItemDto, buttonItemDto, buttonItemDto2);
    }

    public final List<String> component1() {
        return this.availablePaymentTypes;
    }

    /* renamed from: component2, reason: from getter */
    public final PaymentItemDto getPaymentItem() {
        return this.paymentItem;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonItemDto getPaymentChosenButton() {
        return this.paymentChosenButton;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonItemDto getAboutToChooseButton() {
        return this.aboutToChooseButton;
    }

    public final PayNowActionDto copy(@Json(name = "available_payment_types") List<String> availablePaymentTypes, @Json(name = "payment_item") PaymentItemDto paymentItem, @Json(name = "payment_chosen_button") ButtonItemDto paymentChosenButton, @Json(name = "about_to_choose_button") ButtonItemDto aboutToChooseButton) {
        return new PayNowActionDto(availablePaymentTypes, paymentItem, paymentChosenButton, aboutToChooseButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayNowActionDto)) {
            return false;
        }
        PayNowActionDto payNowActionDto = (PayNowActionDto) other;
        return jl40.l(this.availablePaymentTypes, payNowActionDto.availablePaymentTypes) && jl40.l(this.paymentItem, payNowActionDto.paymentItem) && jl40.l(this.paymentChosenButton, payNowActionDto.paymentChosenButton) && jl40.l(this.aboutToChooseButton, payNowActionDto.aboutToChooseButton);
    }

    public final ButtonItemDto getAboutToChooseButton() {
        return this.aboutToChooseButton;
    }

    public final List<String> getAvailablePaymentTypes() {
        return this.availablePaymentTypes;
    }

    public final ButtonItemDto getPaymentChosenButton() {
        return this.paymentChosenButton;
    }

    public final PaymentItemDto getPaymentItem() {
        return this.paymentItem;
    }

    public int hashCode() {
        return this.aboutToChooseButton.hashCode() + ((this.paymentChosenButton.hashCode() + ((this.paymentItem.hashCode() + (this.availablePaymentTypes.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "PayNowActionDto(availablePaymentTypes=" + this.availablePaymentTypes + ", paymentItem=" + this.paymentItem + ", paymentChosenButton=" + this.paymentChosenButton + ", aboutToChooseButton=" + this.aboutToChooseButton + Extension.C_BRAKE;
    }
}
