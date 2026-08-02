package ru.yandex.music.radio.store;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import com.yandex.music.shared.dto.wave.recommendation.StationWithSettingsDto;
import defpackage.vfn;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/yandex/music/radio/store/RadioMenuStationDto;", "Lvfn;", "Lcom/yandex/music/shared/dto/wave/recommendation/StationWithSettingsDto;", "stationWithSettings", "<init>", "(Lcom/yandex/music/shared/dto/wave/recommendation/StationWithSettingsDto;)V", "Lcom/yandex/music/shared/dto/wave/recommendation/StationWithSettingsDto;", "a", "()Lcom/yandex/music/shared/dto/wave/recommendation/StationWithSettingsDto;", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final /* data */ class RadioMenuStationDto extends vfn {

    @SerializedName("stationWithSettings")
    private final StationWithSettingsDto stationWithSettings;

    public RadioMenuStationDto(StationWithSettingsDto stationWithSettingsDto) {
        this.stationWithSettings = stationWithSettingsDto;
    }

    /* renamed from: a, reason: from getter */
    public final StationWithSettingsDto getStationWithSettings() {
        return this.stationWithSettings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RadioMenuStationDto) && Intrinsics.d(this.stationWithSettings, ((RadioMenuStationDto) obj).stationWithSettings);
    }

    public final int hashCode() {
        StationWithSettingsDto stationWithSettingsDto = this.stationWithSettings;
        if (stationWithSettingsDto == null) {
            return 0;
        }
        return stationWithSettingsDto.hashCode();
    }

    public final String toString() {
        return "RadioMenuStationDto(stationWithSettings=" + this.stationWithSettings + ")";
    }
}
