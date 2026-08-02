package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.CancelTypeDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/CancelInfoDto;", "", "isCancelAvailable", "", "cancelType", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/CancelTypeDto;", "<init>", "(ZLru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/CancelTypeDto;)V", "()Z", "getCancelType", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/CancelTypeDto;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CancelInfoDto {
    private final CancelTypeDto cancelType;
    private final boolean isCancelAvailable;

    public CancelInfoDto(@Json(name = "is_cancel_available") boolean z, @Json(name = "cancel_type") CancelTypeDto cancelTypeDto) {
        this.isCancelAvailable = z;
        this.cancelType = cancelTypeDto;
    }

    public static /* synthetic */ CancelInfoDto copy$default(CancelInfoDto cancelInfoDto, boolean z, CancelTypeDto cancelTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cancelInfoDto.isCancelAvailable;
        }
        if ((i & 2) != 0) {
            cancelTypeDto = cancelInfoDto.cancelType;
        }
        return cancelInfoDto.copy(z, cancelTypeDto);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsCancelAvailable() {
        return this.isCancelAvailable;
    }

    /* renamed from: component2, reason: from getter */
    public final CancelTypeDto getCancelType() {
        return this.cancelType;
    }

    public final CancelInfoDto copy(@Json(name = "is_cancel_available") boolean isCancelAvailable, @Json(name = "cancel_type") CancelTypeDto cancelType) {
        return new CancelInfoDto(isCancelAvailable, cancelType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CancelInfoDto)) {
            return false;
        }
        CancelInfoDto cancelInfoDto = (CancelInfoDto) other;
        return this.isCancelAvailable == cancelInfoDto.isCancelAvailable && this.cancelType == cancelInfoDto.cancelType;
    }

    public final CancelTypeDto getCancelType() {
        return this.cancelType;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isCancelAvailable) * 31;
        CancelTypeDto cancelTypeDto = this.cancelType;
        return hashCode + (cancelTypeDto == null ? 0 : cancelTypeDto.hashCode());
    }

    public final boolean isCancelAvailable() {
        return this.isCancelAvailable;
    }

    public String toString() {
        return "CancelInfoDto(isCancelAvailable=" + this.isCancelAvailable + ", cancelType=" + this.cancelType + Extension.C_BRAKE;
    }
}
