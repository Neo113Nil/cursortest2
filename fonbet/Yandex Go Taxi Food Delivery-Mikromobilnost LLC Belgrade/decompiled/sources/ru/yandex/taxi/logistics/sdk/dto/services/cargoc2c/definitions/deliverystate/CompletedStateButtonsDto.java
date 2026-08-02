package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/CompletedStateButtonsDto;", "", "primary", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/StateButtonDto;", "secondary", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/StateButtonDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/StateButtonDto;)V", "getPrimary", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/StateButtonDto;", "getSecondary", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CompletedStateButtonsDto {
    private final StateButtonDto primary;
    private final StateButtonDto secondary;

    public CompletedStateButtonsDto(@Json(name = "primary") StateButtonDto stateButtonDto, @Json(name = "secondary") StateButtonDto stateButtonDto2) {
        this.primary = stateButtonDto;
        this.secondary = stateButtonDto2;
    }

    public static /* synthetic */ CompletedStateButtonsDto copy$default(CompletedStateButtonsDto completedStateButtonsDto, StateButtonDto stateButtonDto, StateButtonDto stateButtonDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            stateButtonDto = completedStateButtonsDto.primary;
        }
        if ((i & 2) != 0) {
            stateButtonDto2 = completedStateButtonsDto.secondary;
        }
        return completedStateButtonsDto.copy(stateButtonDto, stateButtonDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final StateButtonDto getPrimary() {
        return this.primary;
    }

    /* renamed from: component2, reason: from getter */
    public final StateButtonDto getSecondary() {
        return this.secondary;
    }

    public final CompletedStateButtonsDto copy(@Json(name = "primary") StateButtonDto primary, @Json(name = "secondary") StateButtonDto secondary) {
        return new CompletedStateButtonsDto(primary, secondary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompletedStateButtonsDto)) {
            return false;
        }
        CompletedStateButtonsDto completedStateButtonsDto = (CompletedStateButtonsDto) other;
        return jl40.l(this.primary, completedStateButtonsDto.primary) && jl40.l(this.secondary, completedStateButtonsDto.secondary);
    }

    public final StateButtonDto getPrimary() {
        return this.primary;
    }

    public final StateButtonDto getSecondary() {
        return this.secondary;
    }

    public int hashCode() {
        int hashCode = this.primary.hashCode() * 31;
        StateButtonDto stateButtonDto = this.secondary;
        return hashCode + (stateButtonDto == null ? 0 : stateButtonDto.hashCode());
    }

    public String toString() {
        return "CompletedStateButtonsDto(primary=" + this.primary + ", secondary=" + this.secondary + Extension.C_BRAKE;
    }
}
