package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/WebPayNowActionDto;", "", "paymentUrl", "", "paymentItem", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/PaymentItemDto;", "paymentButton", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ButtonItemDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/PaymentItemDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ButtonItemDto;)V", "getPaymentUrl", "()Ljava/lang/String;", "getPaymentItem", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/PaymentItemDto;", "getPaymentButton", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ButtonItemDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class WebPayNowActionDto {
    private final ButtonItemDto paymentButton;
    private final PaymentItemDto paymentItem;
    private final String paymentUrl;

    public WebPayNowActionDto(@Json(name = "payment_url") String str, @Json(name = "payment_item") PaymentItemDto paymentItemDto, @Json(name = "payment_button") ButtonItemDto buttonItemDto) {
        this.paymentUrl = str;
        this.paymentItem = paymentItemDto;
        this.paymentButton = buttonItemDto;
    }

    public static /* synthetic */ WebPayNowActionDto copy$default(WebPayNowActionDto webPayNowActionDto, String str, PaymentItemDto paymentItemDto, ButtonItemDto buttonItemDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = webPayNowActionDto.paymentUrl;
        }
        if ((i & 2) != 0) {
            paymentItemDto = webPayNowActionDto.paymentItem;
        }
        if ((i & 4) != 0) {
            buttonItemDto = webPayNowActionDto.paymentButton;
        }
        return webPayNowActionDto.copy(str, paymentItemDto, buttonItemDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPaymentUrl() {
        return this.paymentUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final PaymentItemDto getPaymentItem() {
        return this.paymentItem;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonItemDto getPaymentButton() {
        return this.paymentButton;
    }

    public final WebPayNowActionDto copy(@Json(name = "payment_url") String paymentUrl, @Json(name = "payment_item") PaymentItemDto paymentItem, @Json(name = "payment_button") ButtonItemDto paymentButton) {
        return new WebPayNowActionDto(paymentUrl, paymentItem, paymentButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebPayNowActionDto)) {
            return false;
        }
        WebPayNowActionDto webPayNowActionDto = (WebPayNowActionDto) other;
        return jl40.l(this.paymentUrl, webPayNowActionDto.paymentUrl) && jl40.l(this.paymentItem, webPayNowActionDto.paymentItem) && jl40.l(this.paymentButton, webPayNowActionDto.paymentButton);
    }

    public final ButtonItemDto getPaymentButton() {
        return this.paymentButton;
    }

    public final PaymentItemDto getPaymentItem() {
        return this.paymentItem;
    }

    public final String getPaymentUrl() {
        return this.paymentUrl;
    }

    public int hashCode() {
        return this.paymentButton.hashCode() + ((this.paymentItem.hashCode() + (this.paymentUrl.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "WebPayNowActionDto(paymentUrl=" + this.paymentUrl + ", paymentItem=" + this.paymentItem + ", paymentButton=" + this.paymentButton + Extension.C_BRAKE;
    }
}
