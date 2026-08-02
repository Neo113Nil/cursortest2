package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.missions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.BackgroundDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionProgressBlockDto;", "", C0553n3.g, "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto;", "progress", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionProgressDto;", "subtitle", "", "title", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionProgressDto;Ljava/lang/String;Ljava/lang/String;)V", "getBackground", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto;", "getProgress", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionProgressDto;", "getSubtitle", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MissionProgressBlockDto {
    private final BackgroundDto background;
    private final MissionProgressDto progress;
    private final String subtitle;
    private final String title;

    public MissionProgressBlockDto(@Json(name = "background") BackgroundDto backgroundDto, @Json(name = "progress") MissionProgressDto missionProgressDto, @Json(name = "subtitle") String str, @Json(name = "title") String str2) {
        this.background = backgroundDto;
        this.progress = missionProgressDto;
        this.subtitle = str;
        this.title = str2;
    }

    public static /* synthetic */ MissionProgressBlockDto copy$default(MissionProgressBlockDto missionProgressBlockDto, BackgroundDto backgroundDto, MissionProgressDto missionProgressDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            backgroundDto = missionProgressBlockDto.background;
        }
        if ((i & 2) != 0) {
            missionProgressDto = missionProgressBlockDto.progress;
        }
        if ((i & 4) != 0) {
            str = missionProgressBlockDto.subtitle;
        }
        if ((i & 8) != 0) {
            str2 = missionProgressBlockDto.title;
        }
        return missionProgressBlockDto.copy(backgroundDto, missionProgressDto, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final BackgroundDto getBackground() {
        return this.background;
    }

    /* renamed from: component2, reason: from getter */
    public final MissionProgressDto getProgress() {
        return this.progress;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final MissionProgressBlockDto copy(@Json(name = "background") BackgroundDto background, @Json(name = "progress") MissionProgressDto progress, @Json(name = "subtitle") String subtitle, @Json(name = "title") String title) {
        return new MissionProgressBlockDto(background, progress, subtitle, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissionProgressBlockDto)) {
            return false;
        }
        MissionProgressBlockDto missionProgressBlockDto = (MissionProgressBlockDto) other;
        return jl40.l(this.background, missionProgressBlockDto.background) && jl40.l(this.progress, missionProgressBlockDto.progress) && jl40.l(this.subtitle, missionProgressBlockDto.subtitle) && jl40.l(this.title, missionProgressBlockDto.title);
    }

    public final BackgroundDto getBackground() {
        return this.background;
    }

    public final MissionProgressDto getProgress() {
        return this.progress;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = (this.progress.hashCode() + (this.background.hashCode() * 31)) * 31;
        String str = this.subtitle;
        return this.title.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        BackgroundDto backgroundDto = this.background;
        MissionProgressDto missionProgressDto = this.progress;
        String str = this.subtitle;
        String str2 = this.title;
        StringBuilder sb = new StringBuilder("MissionProgressBlockDto(background=");
        sb.append(backgroundDto);
        sb.append(", progress=");
        sb.append(missionProgressDto);
        sb.append(", subtitle=");
        return g8e.r(sb, str, ", title=", str2, Extension.C_BRAKE);
    }
}
