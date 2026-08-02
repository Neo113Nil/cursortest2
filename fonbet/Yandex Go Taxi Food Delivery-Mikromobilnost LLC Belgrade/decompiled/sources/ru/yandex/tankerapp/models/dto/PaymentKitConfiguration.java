package ru.yandex.tankerapp.models.dto;

import defpackage.jl40;
import defpackage.ysq0;
import java.io.Serializable;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/yandex/tankerapp/models/dto/PaymentKitConfiguration;", "Ljava/io/Serializable;", "", "regionId", "Lru/yandex/tankerapp/models/dto/PaymentKitSettings;", "paymentKitSettings", "Lru/yandex/tankerapp/models/dto/PaymentKitEnvironment;", "paymentKitEnvironment", "Lru/yandex/tankerapp/models/dto/PaymentKitResultScreenClosing;", "paymentKitResultsScreenClosing", "", "isDarkTheme", "", "currency", "<init>", "(Ljava/lang/Integer;Lru/yandex/tankerapp/models/dto/PaymentKitSettings;Lru/yandex/tankerapp/models/dto/PaymentKitEnvironment;Lru/yandex/tankerapp/models/dto/PaymentKitResultScreenClosing;Ljava/lang/Boolean;Ljava/lang/String;)V", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "Lru/yandex/tankerapp/models/dto/PaymentKitSettings;", "f", "()Lru/yandex/tankerapp/models/dto/PaymentKitSettings;", "Lru/yandex/tankerapp/models/dto/PaymentKitEnvironment;", "b", "()Lru/yandex/tankerapp/models/dto/PaymentKitEnvironment;", "Lru/yandex/tankerapp/models/dto/PaymentKitResultScreenClosing;", "c", "()Lru/yandex/tankerapp/models/dto/PaymentKitResultScreenClosing;", "Ljava/lang/Boolean;", "h", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "car_tech_payment_sdk_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PaymentKitConfiguration implements Serializable {

    @ysq0("currency")
    private final String currency;

    @ysq0("isDarkTheme")
    private final Boolean isDarkTheme;

    @ysq0("paymentKitEnvironment")
    private final PaymentKitEnvironment paymentKitEnvironment;

    @ysq0("paymentKitResultsScreenClosing")
    private final PaymentKitResultScreenClosing paymentKitResultsScreenClosing;

    @ysq0("paymentKitSettings")
    private final PaymentKitSettings paymentKitSettings;

    @ysq0("regionId")
    private final Integer regionId;

    public PaymentKitConfiguration(Integer num, PaymentKitSettings paymentKitSettings, PaymentKitEnvironment paymentKitEnvironment, PaymentKitResultScreenClosing paymentKitResultScreenClosing, Boolean bool, String str) {
        this.regionId = num;
        this.paymentKitSettings = paymentKitSettings;
        this.paymentKitEnvironment = paymentKitEnvironment;
        this.paymentKitResultsScreenClosing = paymentKitResultScreenClosing;
        this.isDarkTheme = bool;
        this.currency = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: b, reason: from getter */
    public final PaymentKitEnvironment getPaymentKitEnvironment() {
        return this.paymentKitEnvironment;
    }

    /* renamed from: c, reason: from getter */
    public final PaymentKitResultScreenClosing getPaymentKitResultsScreenClosing() {
        return this.paymentKitResultsScreenClosing;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentKitConfiguration)) {
            return false;
        }
        PaymentKitConfiguration paymentKitConfiguration = (PaymentKitConfiguration) obj;
        return jl40.l(this.regionId, paymentKitConfiguration.regionId) && jl40.l(this.paymentKitSettings, paymentKitConfiguration.paymentKitSettings) && this.paymentKitEnvironment == paymentKitConfiguration.paymentKitEnvironment && this.paymentKitResultsScreenClosing == paymentKitConfiguration.paymentKitResultsScreenClosing && jl40.l(this.isDarkTheme, paymentKitConfiguration.isDarkTheme) && jl40.l(this.currency, paymentKitConfiguration.currency);
    }

    /* renamed from: f, reason: from getter */
    public final PaymentKitSettings getPaymentKitSettings() {
        return this.paymentKitSettings;
    }

    /* renamed from: g, reason: from getter */
    public final Integer getRegionId() {
        return this.regionId;
    }

    /* renamed from: h, reason: from getter */
    public final Boolean getIsDarkTheme() {
        return this.isDarkTheme;
    }

    public final int hashCode() {
        Integer num = this.regionId;
        int hashCode = (this.paymentKitEnvironment.hashCode() + ((this.paymentKitSettings.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31)) * 31;
        PaymentKitResultScreenClosing paymentKitResultScreenClosing = this.paymentKitResultsScreenClosing;
        int hashCode2 = (hashCode + (paymentKitResultScreenClosing == null ? 0 : paymentKitResultScreenClosing.hashCode())) * 31;
        Boolean bool = this.isDarkTheme;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.currency;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentKitConfiguration(regionId=" + this.regionId + ", paymentKitSettings=" + this.paymentKitSettings + ", paymentKitEnvironment=" + this.paymentKitEnvironment + ", paymentKitResultsScreenClosing=" + this.paymentKitResultsScreenClosing + ", isDarkTheme=" + this.isDarkTheme + ", currency=" + this.currency + Extension.C_BRAKE;
    }
}
