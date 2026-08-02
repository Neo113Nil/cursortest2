package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_trigger_communications;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/TimeDto;", "", "hours", "", "minutes", "<init>", "(II)V", "getHours", "()I", "getMinutes", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TimeDto {
    private final int hours;
    private final int minutes;

    public TimeDto(@Json(name = "hours") int i, @Json(name = "minutes") int i2) {
        this.hours = i;
        this.minutes = i2;
    }

    public static /* synthetic */ TimeDto copy$default(TimeDto timeDto, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = timeDto.hours;
        }
        if ((i3 & 2) != 0) {
            i2 = timeDto.minutes;
        }
        return timeDto.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getHours() {
        return this.hours;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMinutes() {
        return this.minutes;
    }

    public final TimeDto copy(@Json(name = "hours") int hours, @Json(name = "minutes") int minutes) {
        return new TimeDto(hours, minutes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeDto)) {
            return false;
        }
        TimeDto timeDto = (TimeDto) other;
        return this.hours == timeDto.hours && this.minutes == timeDto.minutes;
    }

    public final int getHours() {
        return this.hours;
    }

    public final int getMinutes() {
        return this.minutes;
    }

    public int hashCode() {
        return Integer.hashCode(this.minutes) + (Integer.hashCode(this.hours) * 31);
    }

    public String toString() {
        return b64.d(this.hours, this.minutes, "TimeDto(hours=", ", minutes=", Extension.C_BRAKE);
    }
}
