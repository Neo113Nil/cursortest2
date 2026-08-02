package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.IconDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TariffTileFooterDto;", "", "tariffIcon", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "optionIcon", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;)V", "getTariffIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "getOptionIcon", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TariffTileFooterDto {
    private final IconDto optionIcon;
    private final IconDto tariffIcon;

    public TariffTileFooterDto(@Json(name = "tariff_icon") IconDto iconDto, @Json(name = "option_icon") IconDto iconDto2) {
        this.tariffIcon = iconDto;
        this.optionIcon = iconDto2;
    }

    public static /* synthetic */ TariffTileFooterDto copy$default(TariffTileFooterDto tariffTileFooterDto, IconDto iconDto, IconDto iconDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            iconDto = tariffTileFooterDto.tariffIcon;
        }
        if ((i & 2) != 0) {
            iconDto2 = tariffTileFooterDto.optionIcon;
        }
        return tariffTileFooterDto.copy(iconDto, iconDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final IconDto getTariffIcon() {
        return this.tariffIcon;
    }

    /* renamed from: component2, reason: from getter */
    public final IconDto getOptionIcon() {
        return this.optionIcon;
    }

    public final TariffTileFooterDto copy(@Json(name = "tariff_icon") IconDto tariffIcon, @Json(name = "option_icon") IconDto optionIcon) {
        return new TariffTileFooterDto(tariffIcon, optionIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TariffTileFooterDto)) {
            return false;
        }
        TariffTileFooterDto tariffTileFooterDto = (TariffTileFooterDto) other;
        return jl40.l(this.tariffIcon, tariffTileFooterDto.tariffIcon) && jl40.l(this.optionIcon, tariffTileFooterDto.optionIcon);
    }

    public final IconDto getOptionIcon() {
        return this.optionIcon;
    }

    public final IconDto getTariffIcon() {
        return this.tariffIcon;
    }

    public int hashCode() {
        int hashCode = this.tariffIcon.hashCode() * 31;
        IconDto iconDto = this.optionIcon;
        return hashCode + (iconDto == null ? 0 : iconDto.hashCode());
    }

    public String toString() {
        return "TariffTileFooterDto(tariffIcon=" + this.tariffIcon + ", optionIcon=" + this.optionIcon + Extension.C_BRAKE;
    }
}
