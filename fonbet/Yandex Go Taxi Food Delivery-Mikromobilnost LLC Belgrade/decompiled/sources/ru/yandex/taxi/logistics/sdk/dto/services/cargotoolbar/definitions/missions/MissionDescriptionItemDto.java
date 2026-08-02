package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.missions;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.IconDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionDescriptionItemDto;", "", "content", "", "leadIcon", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", Constants.DEEPLINK, "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getLeadIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "getDeeplink", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MissionDescriptionItemDto {
    private final String content;
    private final String deeplink;
    private final IconDto leadIcon;

    public MissionDescriptionItemDto(@Json(name = "content") String str, @Json(name = "lead_icon") IconDto iconDto, @Json(name = "deeplink") String str2) {
        this.content = str;
        this.leadIcon = iconDto;
        this.deeplink = str2;
    }

    public static /* synthetic */ MissionDescriptionItemDto copy$default(MissionDescriptionItemDto missionDescriptionItemDto, String str, IconDto iconDto, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = missionDescriptionItemDto.content;
        }
        if ((i & 2) != 0) {
            iconDto = missionDescriptionItemDto.leadIcon;
        }
        if ((i & 4) != 0) {
            str2 = missionDescriptionItemDto.deeplink;
        }
        return missionDescriptionItemDto.copy(str, iconDto, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    public final IconDto getLeadIcon() {
        return this.leadIcon;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    public final MissionDescriptionItemDto copy(@Json(name = "content") String content, @Json(name = "lead_icon") IconDto leadIcon, @Json(name = "deeplink") String deeplink) {
        return new MissionDescriptionItemDto(content, leadIcon, deeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissionDescriptionItemDto)) {
            return false;
        }
        MissionDescriptionItemDto missionDescriptionItemDto = (MissionDescriptionItemDto) other;
        return jl40.l(this.content, missionDescriptionItemDto.content) && jl40.l(this.leadIcon, missionDescriptionItemDto.leadIcon) && jl40.l(this.deeplink, missionDescriptionItemDto.deeplink);
    }

    public final String getContent() {
        return this.content;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final IconDto getLeadIcon() {
        return this.leadIcon;
    }

    public int hashCode() {
        int hashCode = this.content.hashCode() * 31;
        IconDto iconDto = this.leadIcon;
        int hashCode2 = (hashCode + (iconDto == null ? 0 : iconDto.hashCode())) * 31;
        String str = this.deeplink;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.content;
        IconDto iconDto = this.leadIcon;
        String str2 = this.deeplink;
        StringBuilder sb = new StringBuilder("MissionDescriptionItemDto(content=");
        sb.append(str);
        sb.append(", leadIcon=");
        sb.append(iconDto);
        sb.append(", deeplink=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
