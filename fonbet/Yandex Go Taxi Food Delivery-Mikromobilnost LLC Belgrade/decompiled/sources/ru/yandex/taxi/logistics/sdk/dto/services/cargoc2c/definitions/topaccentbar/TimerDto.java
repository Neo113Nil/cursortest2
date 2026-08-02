package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.topaccentbar;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TimerDto;", "", ClidProvider.TIMESTAMP, "", "placeholder", "", "format", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "getTimestamp", "()J", "getPlaceholder", "()Ljava/lang/String;", "getFormat", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TimerDto {
    private final String format;
    private final String placeholder;
    private final long timestamp;

    public TimerDto(@Json(name = "timestamp") long j, @Json(name = "placeholder") String str, @Json(name = "format") String str2) {
        this.timestamp = j;
        this.placeholder = str;
        this.format = str2;
    }

    public static /* synthetic */ TimerDto copy$default(TimerDto timerDto, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = timerDto.timestamp;
        }
        if ((i & 2) != 0) {
            str = timerDto.placeholder;
        }
        if ((i & 4) != 0) {
            str2 = timerDto.format;
        }
        return timerDto.copy(j, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFormat() {
        return this.format;
    }

    public final TimerDto copy(@Json(name = "timestamp") long timestamp, @Json(name = "placeholder") String placeholder, @Json(name = "format") String format) {
        return new TimerDto(timestamp, placeholder, format);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerDto)) {
            return false;
        }
        TimerDto timerDto = (TimerDto) other;
        return this.timestamp == timerDto.timestamp && jl40.l(this.placeholder, timerDto.placeholder) && jl40.l(this.format, timerDto.format);
    }

    public final String getFormat() {
        return this.format;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return this.format.hashCode() + unr0.b(Long.hashCode(this.timestamp) * 31, 31, this.placeholder);
    }

    public String toString() {
        long j = this.timestamp;
        String str = this.placeholder;
        return unr0.r(x4e.k("TimerDto(timestamp=", j, ", placeholder=", str), ", format=", this.format, Extension.C_BRAKE);
    }
}
