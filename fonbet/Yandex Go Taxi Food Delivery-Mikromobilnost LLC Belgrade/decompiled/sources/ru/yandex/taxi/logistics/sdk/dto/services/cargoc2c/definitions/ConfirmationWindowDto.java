package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/ConfirmationWindowDto;", "", "mainWindow", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/BaseWindowSettingsDto;", "alertWindow", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/BaseWindowSettingsDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/BaseWindowSettingsDto;)V", "getMainWindow", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/BaseWindowSettingsDto;", "getAlertWindow", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ConfirmationWindowDto {
    private final BaseWindowSettingsDto alertWindow;
    private final BaseWindowSettingsDto mainWindow;

    public ConfirmationWindowDto(@Json(name = "main_window") BaseWindowSettingsDto baseWindowSettingsDto, @Json(name = "alert_window") BaseWindowSettingsDto baseWindowSettingsDto2) {
        this.mainWindow = baseWindowSettingsDto;
        this.alertWindow = baseWindowSettingsDto2;
    }

    public static /* synthetic */ ConfirmationWindowDto copy$default(ConfirmationWindowDto confirmationWindowDto, BaseWindowSettingsDto baseWindowSettingsDto, BaseWindowSettingsDto baseWindowSettingsDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            baseWindowSettingsDto = confirmationWindowDto.mainWindow;
        }
        if ((i & 2) != 0) {
            baseWindowSettingsDto2 = confirmationWindowDto.alertWindow;
        }
        return confirmationWindowDto.copy(baseWindowSettingsDto, baseWindowSettingsDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final BaseWindowSettingsDto getMainWindow() {
        return this.mainWindow;
    }

    /* renamed from: component2, reason: from getter */
    public final BaseWindowSettingsDto getAlertWindow() {
        return this.alertWindow;
    }

    public final ConfirmationWindowDto copy(@Json(name = "main_window") BaseWindowSettingsDto mainWindow, @Json(name = "alert_window") BaseWindowSettingsDto alertWindow) {
        return new ConfirmationWindowDto(mainWindow, alertWindow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmationWindowDto)) {
            return false;
        }
        ConfirmationWindowDto confirmationWindowDto = (ConfirmationWindowDto) other;
        return jl40.l(this.mainWindow, confirmationWindowDto.mainWindow) && jl40.l(this.alertWindow, confirmationWindowDto.alertWindow);
    }

    public final BaseWindowSettingsDto getAlertWindow() {
        return this.alertWindow;
    }

    public final BaseWindowSettingsDto getMainWindow() {
        return this.mainWindow;
    }

    public int hashCode() {
        int hashCode = this.mainWindow.hashCode() * 31;
        BaseWindowSettingsDto baseWindowSettingsDto = this.alertWindow;
        return hashCode + (baseWindowSettingsDto == null ? 0 : baseWindowSettingsDto.hashCode());
    }

    public String toString() {
        return "ConfirmationWindowDto(mainWindow=" + this.mainWindow + ", alertWindow=" + this.alertWindow + Extension.C_BRAKE;
    }
}
