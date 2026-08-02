package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.missions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.IconDto;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionDescriptionBlockDto;", "", "title", "", "subtitle", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionDescriptionItemDto;", "trailIcon", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDescription", "()Ljava/util/List;", "getTrailIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MissionDescriptionBlockDto {
    private final List<MissionDescriptionItemDto> description;
    private final String subtitle;
    private final String title;
    private final IconDto trailIcon;

    public MissionDescriptionBlockDto(@Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "description") List<MissionDescriptionItemDto> list, @Json(name = "trail_icon") IconDto iconDto) {
        this.title = str;
        this.subtitle = str2;
        this.description = list;
        this.trailIcon = iconDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MissionDescriptionBlockDto copy$default(MissionDescriptionBlockDto missionDescriptionBlockDto, String str, String str2, List list, IconDto iconDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = missionDescriptionBlockDto.title;
        }
        if ((i & 2) != 0) {
            str2 = missionDescriptionBlockDto.subtitle;
        }
        if ((i & 4) != 0) {
            list = missionDescriptionBlockDto.description;
        }
        if ((i & 8) != 0) {
            iconDto = missionDescriptionBlockDto.trailIcon;
        }
        return missionDescriptionBlockDto.copy(str, str2, list, iconDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<MissionDescriptionItemDto> component3() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final IconDto getTrailIcon() {
        return this.trailIcon;
    }

    public final MissionDescriptionBlockDto copy(@Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "description") List<MissionDescriptionItemDto> description, @Json(name = "trail_icon") IconDto trailIcon) {
        return new MissionDescriptionBlockDto(title, subtitle, description, trailIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissionDescriptionBlockDto)) {
            return false;
        }
        MissionDescriptionBlockDto missionDescriptionBlockDto = (MissionDescriptionBlockDto) other;
        return jl40.l(this.title, missionDescriptionBlockDto.title) && jl40.l(this.subtitle, missionDescriptionBlockDto.subtitle) && jl40.l(this.description, missionDescriptionBlockDto.description) && jl40.l(this.trailIcon, missionDescriptionBlockDto.trailIcon);
    }

    public final List<MissionDescriptionItemDto> getDescription() {
        return this.description;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final IconDto getTrailIcon() {
        return this.trailIcon;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int c = unr0.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.description);
        IconDto iconDto = this.trailIcon;
        return c + (iconDto != null ? iconDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        List<MissionDescriptionItemDto> list = this.description;
        IconDto iconDto = this.trailIcon;
        StringBuilder v = b64.v("MissionDescriptionBlockDto(title=", str, ", subtitle=", str2, ", description=");
        v.append(list);
        v.append(", trailIcon=");
        v.append(iconDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
