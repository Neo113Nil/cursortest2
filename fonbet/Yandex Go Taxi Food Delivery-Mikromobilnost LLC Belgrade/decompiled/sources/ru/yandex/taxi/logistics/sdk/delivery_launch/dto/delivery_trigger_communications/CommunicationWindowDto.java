package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_trigger_communications;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/CommunicationWindowDto;", "", "startTime", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/TimeDto;", "endTime", "<init>", "(Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/TimeDto;Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/TimeDto;)V", "getStartTime", "()Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/TimeDto;", "getEndTime", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CommunicationWindowDto {
    private final TimeDto endTime;
    private final TimeDto startTime;

    public CommunicationWindowDto(@Json(name = "start_time") TimeDto timeDto, @Json(name = "end_time") TimeDto timeDto2) {
        this.startTime = timeDto;
        this.endTime = timeDto2;
    }

    public static /* synthetic */ CommunicationWindowDto copy$default(CommunicationWindowDto communicationWindowDto, TimeDto timeDto, TimeDto timeDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            timeDto = communicationWindowDto.startTime;
        }
        if ((i & 2) != 0) {
            timeDto2 = communicationWindowDto.endTime;
        }
        return communicationWindowDto.copy(timeDto, timeDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final TimeDto getStartTime() {
        return this.startTime;
    }

    /* renamed from: component2, reason: from getter */
    public final TimeDto getEndTime() {
        return this.endTime;
    }

    public final CommunicationWindowDto copy(@Json(name = "start_time") TimeDto startTime, @Json(name = "end_time") TimeDto endTime) {
        return new CommunicationWindowDto(startTime, endTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommunicationWindowDto)) {
            return false;
        }
        CommunicationWindowDto communicationWindowDto = (CommunicationWindowDto) other;
        return jl40.l(this.startTime, communicationWindowDto.startTime) && jl40.l(this.endTime, communicationWindowDto.endTime);
    }

    public final TimeDto getEndTime() {
        return this.endTime;
    }

    public final TimeDto getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return this.endTime.hashCode() + (this.startTime.hashCode() * 31);
    }

    public String toString() {
        return "CommunicationWindowDto(startTime=" + this.startTime + ", endTime=" + this.endTime + Extension.C_BRAKE;
    }
}
