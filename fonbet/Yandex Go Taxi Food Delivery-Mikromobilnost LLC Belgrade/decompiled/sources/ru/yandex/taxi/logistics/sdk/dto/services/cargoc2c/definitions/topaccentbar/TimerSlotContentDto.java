package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.topaccentbar;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slot.SlotDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TimerSlotContentDto;", "", "timer", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TimerDto;", "until", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotDto;", "since", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TimerDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotDto;)V", "getTimer", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TimerDto;", "getUntil", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotDto;", "getSince", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TimerSlotContentDto {
    private final SlotDto since;
    private final TimerDto timer;
    private final SlotDto until;

    public TimerSlotContentDto(@Json(name = "timer") TimerDto timerDto, @Json(name = "until") SlotDto slotDto, @Json(name = "since") SlotDto slotDto2) {
        this.timer = timerDto;
        this.until = slotDto;
        this.since = slotDto2;
    }

    public static /* synthetic */ TimerSlotContentDto copy$default(TimerSlotContentDto timerSlotContentDto, TimerDto timerDto, SlotDto slotDto, SlotDto slotDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            timerDto = timerSlotContentDto.timer;
        }
        if ((i & 2) != 0) {
            slotDto = timerSlotContentDto.until;
        }
        if ((i & 4) != 0) {
            slotDto2 = timerSlotContentDto.since;
        }
        return timerSlotContentDto.copy(timerDto, slotDto, slotDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final TimerDto getTimer() {
        return this.timer;
    }

    /* renamed from: component2, reason: from getter */
    public final SlotDto getUntil() {
        return this.until;
    }

    /* renamed from: component3, reason: from getter */
    public final SlotDto getSince() {
        return this.since;
    }

    public final TimerSlotContentDto copy(@Json(name = "timer") TimerDto timer, @Json(name = "until") SlotDto until, @Json(name = "since") SlotDto since) {
        return new TimerSlotContentDto(timer, until, since);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerSlotContentDto)) {
            return false;
        }
        TimerSlotContentDto timerSlotContentDto = (TimerSlotContentDto) other;
        return jl40.l(this.timer, timerSlotContentDto.timer) && jl40.l(this.until, timerSlotContentDto.until) && jl40.l(this.since, timerSlotContentDto.since);
    }

    public final SlotDto getSince() {
        return this.since;
    }

    public final TimerDto getTimer() {
        return this.timer;
    }

    public final SlotDto getUntil() {
        return this.until;
    }

    public int hashCode() {
        int hashCode = this.timer.hashCode() * 31;
        SlotDto slotDto = this.until;
        return this.since.hashCode() + ((hashCode + (slotDto == null ? 0 : slotDto.hashCode())) * 31);
    }

    public String toString() {
        return "TimerSlotContentDto(timer=" + this.timer + ", until=" + this.until + ", since=" + this.since + Extension.C_BRAKE;
    }
}
