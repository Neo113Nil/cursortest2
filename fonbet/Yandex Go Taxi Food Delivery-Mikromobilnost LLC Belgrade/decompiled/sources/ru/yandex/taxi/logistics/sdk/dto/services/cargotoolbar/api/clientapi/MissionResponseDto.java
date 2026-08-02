package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.api.clientapi;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ButtonDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.missions.MissionDescriptionBlockDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.missions.MissionProgressBlockDto;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/api/clientapi/MissionResponseDto;", "", "progress", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionProgressBlockDto;", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionDescriptionBlockDto;", "button", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ButtonDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionProgressBlockDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionDescriptionBlockDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ButtonDto;)V", "getProgress", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionProgressBlockDto;", "getDescription", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionDescriptionBlockDto;", "getButton", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ButtonDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MissionResponseDto {
    private final ButtonDto button;
    private final MissionDescriptionBlockDto description;
    private final MissionProgressBlockDto progress;

    public MissionResponseDto(@Json(name = "progress") MissionProgressBlockDto missionProgressBlockDto, @Json(name = "description") MissionDescriptionBlockDto missionDescriptionBlockDto, @Json(name = "button") ButtonDto buttonDto) {
        this.progress = missionProgressBlockDto;
        this.description = missionDescriptionBlockDto;
        this.button = buttonDto;
    }

    public static /* synthetic */ MissionResponseDto copy$default(MissionResponseDto missionResponseDto, MissionProgressBlockDto missionProgressBlockDto, MissionDescriptionBlockDto missionDescriptionBlockDto, ButtonDto buttonDto, int i, Object obj) {
        if ((i & 1) != 0) {
            missionProgressBlockDto = missionResponseDto.progress;
        }
        if ((i & 2) != 0) {
            missionDescriptionBlockDto = missionResponseDto.description;
        }
        if ((i & 4) != 0) {
            buttonDto = missionResponseDto.button;
        }
        return missionResponseDto.copy(missionProgressBlockDto, missionDescriptionBlockDto, buttonDto);
    }

    /* renamed from: component1, reason: from getter */
    public final MissionProgressBlockDto getProgress() {
        return this.progress;
    }

    /* renamed from: component2, reason: from getter */
    public final MissionDescriptionBlockDto getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonDto getButton() {
        return this.button;
    }

    public final MissionResponseDto copy(@Json(name = "progress") MissionProgressBlockDto progress, @Json(name = "description") MissionDescriptionBlockDto description, @Json(name = "button") ButtonDto button) {
        return new MissionResponseDto(progress, description, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissionResponseDto)) {
            return false;
        }
        MissionResponseDto missionResponseDto = (MissionResponseDto) other;
        return jl40.l(this.progress, missionResponseDto.progress) && jl40.l(this.description, missionResponseDto.description) && jl40.l(this.button, missionResponseDto.button);
    }

    public final ButtonDto getButton() {
        return this.button;
    }

    public final MissionDescriptionBlockDto getDescription() {
        return this.description;
    }

    public final MissionProgressBlockDto getProgress() {
        return this.progress;
    }

    public int hashCode() {
        return this.button.hashCode() + ((this.description.hashCode() + (this.progress.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "MissionResponseDto(progress=" + this.progress + ", description=" + this.description + ", button=" + this.button + Extension.C_BRAKE;
    }
}
