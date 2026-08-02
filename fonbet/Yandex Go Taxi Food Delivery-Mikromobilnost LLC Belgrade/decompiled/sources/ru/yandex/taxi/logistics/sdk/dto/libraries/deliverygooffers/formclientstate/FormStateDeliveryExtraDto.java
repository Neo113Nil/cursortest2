package ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.formclientstate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nzs;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ2\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0002\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0004\u0010\bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/formclientstate/FormStateDeliveryExtraDto;", "", "isDeliveryBusinessAccountEnabled", "", "isArEnabled", "isFlatNavigationEnabled", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/formclientstate/FormStateDeliveryExtraDto;", "equals", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FormStateDeliveryExtraDto {
    private final Boolean isArEnabled;
    private final Boolean isDeliveryBusinessAccountEnabled;
    private final Boolean isFlatNavigationEnabled;

    public FormStateDeliveryExtraDto(@Json(name = "is_delivery_business_account_enabled") Boolean bool, @Json(name = "is_ar_enabled") Boolean bool2, @Json(name = "is_flat_navigation_enabled") Boolean bool3) {
        this.isDeliveryBusinessAccountEnabled = bool;
        this.isArEnabled = bool2;
        this.isFlatNavigationEnabled = bool3;
    }

    public static /* synthetic */ FormStateDeliveryExtraDto copy$default(FormStateDeliveryExtraDto formStateDeliveryExtraDto, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = formStateDeliveryExtraDto.isDeliveryBusinessAccountEnabled;
        }
        if ((i & 2) != 0) {
            bool2 = formStateDeliveryExtraDto.isArEnabled;
        }
        if ((i & 4) != 0) {
            bool3 = formStateDeliveryExtraDto.isFlatNavigationEnabled;
        }
        return formStateDeliveryExtraDto.copy(bool, bool2, bool3);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsDeliveryBusinessAccountEnabled() {
        return this.isDeliveryBusinessAccountEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsArEnabled() {
        return this.isArEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsFlatNavigationEnabled() {
        return this.isFlatNavigationEnabled;
    }

    public final FormStateDeliveryExtraDto copy(@Json(name = "is_delivery_business_account_enabled") Boolean isDeliveryBusinessAccountEnabled, @Json(name = "is_ar_enabled") Boolean isArEnabled, @Json(name = "is_flat_navigation_enabled") Boolean isFlatNavigationEnabled) {
        return new FormStateDeliveryExtraDto(isDeliveryBusinessAccountEnabled, isArEnabled, isFlatNavigationEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormStateDeliveryExtraDto)) {
            return false;
        }
        FormStateDeliveryExtraDto formStateDeliveryExtraDto = (FormStateDeliveryExtraDto) other;
        return jl40.l(this.isDeliveryBusinessAccountEnabled, formStateDeliveryExtraDto.isDeliveryBusinessAccountEnabled) && jl40.l(this.isArEnabled, formStateDeliveryExtraDto.isArEnabled) && jl40.l(this.isFlatNavigationEnabled, formStateDeliveryExtraDto.isFlatNavigationEnabled);
    }

    public int hashCode() {
        Boolean bool = this.isDeliveryBusinessAccountEnabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isArEnabled;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isFlatNavigationEnabled;
        return hashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final Boolean isArEnabled() {
        return this.isArEnabled;
    }

    public final Boolean isDeliveryBusinessAccountEnabled() {
        return this.isDeliveryBusinessAccountEnabled;
    }

    public final Boolean isFlatNavigationEnabled() {
        return this.isFlatNavigationEnabled;
    }

    public String toString() {
        Boolean bool = this.isDeliveryBusinessAccountEnabled;
        Boolean bool2 = this.isArEnabled;
        Boolean bool3 = this.isFlatNavigationEnabled;
        StringBuilder sb = new StringBuilder("FormStateDeliveryExtraDto(isDeliveryBusinessAccountEnabled=");
        sb.append(bool);
        sb.append(", isArEnabled=");
        sb.append(bool2);
        sb.append(", isFlatNavigationEnabled=");
        return nzs.d(sb, bool3, Extension.C_BRAKE);
    }
}
