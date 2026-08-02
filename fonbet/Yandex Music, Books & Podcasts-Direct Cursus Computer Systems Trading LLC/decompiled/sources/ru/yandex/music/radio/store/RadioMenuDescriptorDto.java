package ru.yandex.music.radio.store;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import com.yandex.music.shared.dto.wave.recommendation.StationIdDto;
import defpackage.vfn;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/yandex/music/radio/store/RadioMenuDescriptorDto;", "", "Lcom/yandex/music/shared/dto/wave/recommendation/StationIdDto;", "stationId", "Lvfn;", "data", "<init>", "(Lcom/yandex/music/shared/dto/wave/recommendation/StationIdDto;Lvfn;)V", "Lcom/yandex/music/shared/dto/wave/recommendation/StationIdDto;", "b", "()Lcom/yandex/music/shared/dto/wave/recommendation/StationIdDto;", "Lvfn;", "a", "()Lvfn;", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final /* data */ class RadioMenuDescriptorDto {

    @SerializedName("data")
    private final vfn data;

    @SerializedName(ConnectableDevice.KEY_ID)
    private final StationIdDto stationId;

    public RadioMenuDescriptorDto(StationIdDto stationIdDto, vfn vfnVar) {
        this.stationId = stationIdDto;
        this.data = vfnVar;
    }

    /* renamed from: a, reason: from getter */
    public final vfn getData() {
        return this.data;
    }

    /* renamed from: b, reason: from getter */
    public final StationIdDto getStationId() {
        return this.stationId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadioMenuDescriptorDto)) {
            return false;
        }
        RadioMenuDescriptorDto radioMenuDescriptorDto = (RadioMenuDescriptorDto) obj;
        return Intrinsics.d(this.stationId, radioMenuDescriptorDto.stationId) && Intrinsics.d(this.data, radioMenuDescriptorDto.data);
    }

    public final int hashCode() {
        StationIdDto stationIdDto = this.stationId;
        int hashCode = (stationIdDto == null ? 0 : stationIdDto.hashCode()) * 31;
        vfn vfnVar = this.data;
        return hashCode + (vfnVar != null ? vfnVar.hashCode() : 0);
    }

    public final String toString() {
        return "RadioMenuDescriptorDto(stationId=" + this.stationId + ", data=" + this.data + ")";
    }
}
