package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ0\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowPickupPointDto;", "", "currentMode", "", "tariffClass", "enabledCourierFlow", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getCurrentMode", "()Ljava/lang/String;", "getTariffClass", "getEnabledCourierFlow", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowPickupPointDto;", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AddressFlowPickupPointDto {
    private final String currentMode;
    private final Boolean enabledCourierFlow;
    private final String tariffClass;

    public AddressFlowPickupPointDto(@Json(name = "current_mode") String str, @Json(name = "tariff_class") String str2, @Json(name = "enabled_courier_flow") Boolean bool) {
        this.currentMode = str;
        this.tariffClass = str2;
        this.enabledCourierFlow = bool;
    }

    public static /* synthetic */ AddressFlowPickupPointDto copy$default(AddressFlowPickupPointDto addressFlowPickupPointDto, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressFlowPickupPointDto.currentMode;
        }
        if ((i & 2) != 0) {
            str2 = addressFlowPickupPointDto.tariffClass;
        }
        if ((i & 4) != 0) {
            bool = addressFlowPickupPointDto.enabledCourierFlow;
        }
        return addressFlowPickupPointDto.copy(str, str2, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCurrentMode() {
        return this.currentMode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTariffClass() {
        return this.tariffClass;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getEnabledCourierFlow() {
        return this.enabledCourierFlow;
    }

    public final AddressFlowPickupPointDto copy(@Json(name = "current_mode") String currentMode, @Json(name = "tariff_class") String tariffClass, @Json(name = "enabled_courier_flow") Boolean enabledCourierFlow) {
        return new AddressFlowPickupPointDto(currentMode, tariffClass, enabledCourierFlow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressFlowPickupPointDto)) {
            return false;
        }
        AddressFlowPickupPointDto addressFlowPickupPointDto = (AddressFlowPickupPointDto) other;
        return jl40.l(this.currentMode, addressFlowPickupPointDto.currentMode) && jl40.l(this.tariffClass, addressFlowPickupPointDto.tariffClass) && jl40.l(this.enabledCourierFlow, addressFlowPickupPointDto.enabledCourierFlow);
    }

    public final String getCurrentMode() {
        return this.currentMode;
    }

    public final Boolean getEnabledCourierFlow() {
        return this.enabledCourierFlow;
    }

    public final String getTariffClass() {
        return this.tariffClass;
    }

    public int hashCode() {
        String str = this.currentMode;
        int b = unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.tariffClass);
        Boolean bool = this.enabledCourierFlow;
        return b + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.currentMode;
        String str2 = this.tariffClass;
        return nzs.d(b64.v("AddressFlowPickupPointDto(currentMode=", str, ", tariffClass=", str2, ", enabledCourierFlow="), this.enabledCourierFlow, Extension.C_BRAKE);
    }
}
