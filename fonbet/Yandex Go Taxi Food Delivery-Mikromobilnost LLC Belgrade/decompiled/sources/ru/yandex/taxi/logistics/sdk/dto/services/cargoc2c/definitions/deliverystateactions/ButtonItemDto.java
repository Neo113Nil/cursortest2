package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems.ContentIconItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems.ContentTextItemDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ButtonItemDto;", "", "title", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;", "subtitle", "leadIcon", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentIconItemDto;", BackendConfig.Restrictions.ENABLED, "", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentIconItemDto;Z)V", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;", "getSubtitle", "getLeadIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentIconItemDto;", "getEnabled", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ButtonItemDto {
    private final boolean enabled;
    private final ContentIconItemDto leadIcon;
    private final ContentTextItemDto subtitle;
    private final ContentTextItemDto title;

    public ButtonItemDto(@Json(name = "title") ContentTextItemDto contentTextItemDto, @Json(name = "subtitle") ContentTextItemDto contentTextItemDto2, @Json(name = "lead_icon") ContentIconItemDto contentIconItemDto, @Json(name = "enabled") boolean z) {
        this.title = contentTextItemDto;
        this.subtitle = contentTextItemDto2;
        this.leadIcon = contentIconItemDto;
        this.enabled = z;
    }

    public static /* synthetic */ ButtonItemDto copy$default(ButtonItemDto buttonItemDto, ContentTextItemDto contentTextItemDto, ContentTextItemDto contentTextItemDto2, ContentIconItemDto contentIconItemDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            contentTextItemDto = buttonItemDto.title;
        }
        if ((i & 2) != 0) {
            contentTextItemDto2 = buttonItemDto.subtitle;
        }
        if ((i & 4) != 0) {
            contentIconItemDto = buttonItemDto.leadIcon;
        }
        if ((i & 8) != 0) {
            z = buttonItemDto.enabled;
        }
        return buttonItemDto.copy(contentTextItemDto, contentTextItemDto2, contentIconItemDto, z);
    }

    /* renamed from: component1, reason: from getter */
    public final ContentTextItemDto getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final ContentTextItemDto getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final ContentIconItemDto getLeadIcon() {
        return this.leadIcon;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final ButtonItemDto copy(@Json(name = "title") ContentTextItemDto title, @Json(name = "subtitle") ContentTextItemDto subtitle, @Json(name = "lead_icon") ContentIconItemDto leadIcon, @Json(name = "enabled") boolean enabled) {
        return new ButtonItemDto(title, subtitle, leadIcon, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonItemDto)) {
            return false;
        }
        ButtonItemDto buttonItemDto = (ButtonItemDto) other;
        return jl40.l(this.title, buttonItemDto.title) && jl40.l(this.subtitle, buttonItemDto.subtitle) && jl40.l(this.leadIcon, buttonItemDto.leadIcon) && this.enabled == buttonItemDto.enabled;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final ContentIconItemDto getLeadIcon() {
        return this.leadIcon;
    }

    public final ContentTextItemDto getSubtitle() {
        return this.subtitle;
    }

    public final ContentTextItemDto getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        ContentTextItemDto contentTextItemDto = this.subtitle;
        int hashCode2 = (hashCode + (contentTextItemDto == null ? 0 : contentTextItemDto.hashCode())) * 31;
        ContentIconItemDto contentIconItemDto = this.leadIcon;
        return Boolean.hashCode(this.enabled) + ((hashCode2 + (contentIconItemDto != null ? contentIconItemDto.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "ButtonItemDto(title=" + this.title + ", subtitle=" + this.subtitle + ", leadIcon=" + this.leadIcon + ", enabled=" + this.enabled + Extension.C_BRAKE;
    }
}
