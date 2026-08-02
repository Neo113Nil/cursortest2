package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.IconDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/IconButtonDto;", "", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "icon", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;)V", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "getIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class IconButtonDto {
    private final ActionDto action;
    private final IconDto icon;

    public IconButtonDto(@Json(name = "action") ActionDto actionDto, @Json(name = "icon") IconDto iconDto) {
        this.action = actionDto;
        this.icon = iconDto;
    }

    public static /* synthetic */ IconButtonDto copy$default(IconButtonDto iconButtonDto, ActionDto actionDto, IconDto iconDto, int i, Object obj) {
        if ((i & 1) != 0) {
            actionDto = iconButtonDto.action;
        }
        if ((i & 2) != 0) {
            iconDto = iconButtonDto.icon;
        }
        return iconButtonDto.copy(actionDto, iconDto);
    }

    /* renamed from: component1, reason: from getter */
    public final ActionDto getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final IconDto getIcon() {
        return this.icon;
    }

    public final IconButtonDto copy(@Json(name = "action") ActionDto action, @Json(name = "icon") IconDto icon) {
        return new IconButtonDto(action, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconButtonDto)) {
            return false;
        }
        IconButtonDto iconButtonDto = (IconButtonDto) other;
        return jl40.l(this.action, iconButtonDto.action) && jl40.l(this.icon, iconButtonDto.icon);
    }

    public final ActionDto getAction() {
        return this.action;
    }

    public final IconDto getIcon() {
        return this.icon;
    }

    public int hashCode() {
        return this.icon.hashCode() + (this.action.hashCode() * 31);
    }

    public String toString() {
        return "IconButtonDto(action=" + this.action + ", icon=" + this.icon + Extension.C_BRAKE;
    }
}
