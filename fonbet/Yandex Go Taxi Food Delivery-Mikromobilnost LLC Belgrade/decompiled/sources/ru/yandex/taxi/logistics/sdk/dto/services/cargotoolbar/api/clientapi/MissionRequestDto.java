package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.api.clientapi;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.CoordinateDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/api/clientapi/MissionRequestDto;", "", "missionId", "", "coordinate", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/CoordinateDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/CoordinateDto;)V", "getMissionId", "()Ljava/lang/String;", "getCoordinate", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/CoordinateDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MissionRequestDto {
    private final CoordinateDto coordinate;
    private final String missionId;

    public MissionRequestDto(@Json(name = "mission_id") String str, @Json(name = "coordinate") CoordinateDto coordinateDto) {
        this.missionId = str;
        this.coordinate = coordinateDto;
    }

    public static /* synthetic */ MissionRequestDto copy$default(MissionRequestDto missionRequestDto, String str, CoordinateDto coordinateDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = missionRequestDto.missionId;
        }
        if ((i & 2) != 0) {
            coordinateDto = missionRequestDto.coordinate;
        }
        return missionRequestDto.copy(str, coordinateDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMissionId() {
        return this.missionId;
    }

    /* renamed from: component2, reason: from getter */
    public final CoordinateDto getCoordinate() {
        return this.coordinate;
    }

    public final MissionRequestDto copy(@Json(name = "mission_id") String missionId, @Json(name = "coordinate") CoordinateDto coordinate) {
        return new MissionRequestDto(missionId, coordinate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissionRequestDto)) {
            return false;
        }
        MissionRequestDto missionRequestDto = (MissionRequestDto) other;
        return jl40.l(this.missionId, missionRequestDto.missionId) && jl40.l(this.coordinate, missionRequestDto.coordinate);
    }

    public final CoordinateDto getCoordinate() {
        return this.coordinate;
    }

    public final String getMissionId() {
        return this.missionId;
    }

    public int hashCode() {
        int hashCode = this.missionId.hashCode() * 31;
        CoordinateDto coordinateDto = this.coordinate;
        return hashCode + (coordinateDto == null ? 0 : coordinateDto.hashCode());
    }

    public String toString() {
        return "MissionRequestDto(missionId=" + this.missionId + ", coordinate=" + this.coordinate + Extension.C_BRAKE;
    }
}
