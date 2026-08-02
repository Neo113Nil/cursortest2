package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/DueButtonsConfigDto;", "", "continue", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/DueButtonPropertiesDto;", "delete", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/DueButtonPropertiesDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/DueButtonPropertiesDto;)V", "getContinue", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/DueButtonPropertiesDto;", "getDelete", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DueButtonsConfigDto {
    private final DueButtonPropertiesDto continue;
    private final DueButtonPropertiesDto delete;

    public DueButtonsConfigDto(@Json(name = "continue") DueButtonPropertiesDto dueButtonPropertiesDto, @Json(name = "delete") DueButtonPropertiesDto dueButtonPropertiesDto2) {
        this.continue = dueButtonPropertiesDto;
        this.delete = dueButtonPropertiesDto2;
    }

    public static /* synthetic */ DueButtonsConfigDto copy$default(DueButtonsConfigDto dueButtonsConfigDto, DueButtonPropertiesDto dueButtonPropertiesDto, DueButtonPropertiesDto dueButtonPropertiesDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            dueButtonPropertiesDto = dueButtonsConfigDto.continue;
        }
        if ((i & 2) != 0) {
            dueButtonPropertiesDto2 = dueButtonsConfigDto.delete;
        }
        return dueButtonsConfigDto.copy(dueButtonPropertiesDto, dueButtonPropertiesDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final DueButtonPropertiesDto getContinue() {
        return this.continue;
    }

    /* renamed from: component2, reason: from getter */
    public final DueButtonPropertiesDto getDelete() {
        return this.delete;
    }

    public final DueButtonsConfigDto copy(@Json(name = "continue") DueButtonPropertiesDto r1, @Json(name = "delete") DueButtonPropertiesDto delete) {
        return new DueButtonsConfigDto(r1, delete);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DueButtonsConfigDto)) {
            return false;
        }
        DueButtonsConfigDto dueButtonsConfigDto = (DueButtonsConfigDto) other;
        return jl40.l(this.continue, dueButtonsConfigDto.continue) && jl40.l(this.delete, dueButtonsConfigDto.delete);
    }

    public final DueButtonPropertiesDto getContinue() {
        return this.continue;
    }

    public final DueButtonPropertiesDto getDelete() {
        return this.delete;
    }

    public int hashCode() {
        int hashCode = this.continue.hashCode() * 31;
        DueButtonPropertiesDto dueButtonPropertiesDto = this.delete;
        return hashCode + (dueButtonPropertiesDto == null ? 0 : dueButtonPropertiesDto.hashCode());
    }

    public String toString() {
        return "DueButtonsConfigDto(continue=" + this.continue + ", delete=" + this.delete + Extension.C_BRAKE;
    }
}
