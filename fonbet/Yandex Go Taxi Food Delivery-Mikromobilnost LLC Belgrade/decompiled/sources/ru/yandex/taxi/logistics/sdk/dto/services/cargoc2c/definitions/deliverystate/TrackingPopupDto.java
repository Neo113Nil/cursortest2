package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/TrackingPopupDto;", "", "popupSettings", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PopupSettingsDto;", "showPolicy", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/ShowPolicyDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PopupSettingsDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/ShowPolicyDto;)V", "getPopupSettings", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PopupSettingsDto;", "getShowPolicy", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/ShowPolicyDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TrackingPopupDto {
    private final PopupSettingsDto popupSettings;
    private final ShowPolicyDto showPolicy;

    public TrackingPopupDto(@Json(name = "popup_settings") PopupSettingsDto popupSettingsDto, @Json(name = "show_policy") ShowPolicyDto showPolicyDto) {
        this.popupSettings = popupSettingsDto;
        this.showPolicy = showPolicyDto;
    }

    public static /* synthetic */ TrackingPopupDto copy$default(TrackingPopupDto trackingPopupDto, PopupSettingsDto popupSettingsDto, ShowPolicyDto showPolicyDto, int i, Object obj) {
        if ((i & 1) != 0) {
            popupSettingsDto = trackingPopupDto.popupSettings;
        }
        if ((i & 2) != 0) {
            showPolicyDto = trackingPopupDto.showPolicy;
        }
        return trackingPopupDto.copy(popupSettingsDto, showPolicyDto);
    }

    /* renamed from: component1, reason: from getter */
    public final PopupSettingsDto getPopupSettings() {
        return this.popupSettings;
    }

    /* renamed from: component2, reason: from getter */
    public final ShowPolicyDto getShowPolicy() {
        return this.showPolicy;
    }

    public final TrackingPopupDto copy(@Json(name = "popup_settings") PopupSettingsDto popupSettings, @Json(name = "show_policy") ShowPolicyDto showPolicy) {
        return new TrackingPopupDto(popupSettings, showPolicy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackingPopupDto)) {
            return false;
        }
        TrackingPopupDto trackingPopupDto = (TrackingPopupDto) other;
        return jl40.l(this.popupSettings, trackingPopupDto.popupSettings) && jl40.l(this.showPolicy, trackingPopupDto.showPolicy);
    }

    public final PopupSettingsDto getPopupSettings() {
        return this.popupSettings;
    }

    public final ShowPolicyDto getShowPolicy() {
        return this.showPolicy;
    }

    public int hashCode() {
        return this.showPolicy.hashCode() + (this.popupSettings.hashCode() * 31);
    }

    public String toString() {
        return "TrackingPopupDto(popupSettings=" + this.popupSettings + ", showPolicy=" + this.showPolicy + Extension.C_BRAKE;
    }
}
