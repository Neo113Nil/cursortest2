package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TimePickerSlotsDto;", "", "from", "", "to", "stepMinutes", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getFrom", "()Ljava/lang/String;", "getTo", "getStepMinutes", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TimePickerSlotsDto {
    private final String from;
    private final int stepMinutes;
    private final String to;

    public TimePickerSlotsDto(@Json(name = "from") String str, @Json(name = "to") String str2, @Json(name = "step_minutes") int i) {
        this.from = str;
        this.to = str2;
        this.stepMinutes = i;
    }

    public static /* synthetic */ TimePickerSlotsDto copy$default(TimePickerSlotsDto timePickerSlotsDto, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = timePickerSlotsDto.from;
        }
        if ((i2 & 2) != 0) {
            str2 = timePickerSlotsDto.to;
        }
        if ((i2 & 4) != 0) {
            i = timePickerSlotsDto.stepMinutes;
        }
        return timePickerSlotsDto.copy(str, str2, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTo() {
        return this.to;
    }

    /* renamed from: component3, reason: from getter */
    public final int getStepMinutes() {
        return this.stepMinutes;
    }

    public final TimePickerSlotsDto copy(@Json(name = "from") String from, @Json(name = "to") String to, @Json(name = "step_minutes") int stepMinutes) {
        return new TimePickerSlotsDto(from, to, stepMinutes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimePickerSlotsDto)) {
            return false;
        }
        TimePickerSlotsDto timePickerSlotsDto = (TimePickerSlotsDto) other;
        return jl40.l(this.from, timePickerSlotsDto.from) && jl40.l(this.to, timePickerSlotsDto.to) && this.stepMinutes == timePickerSlotsDto.stepMinutes;
    }

    public final String getFrom() {
        return this.from;
    }

    public final int getStepMinutes() {
        return this.stepMinutes;
    }

    public final String getTo() {
        return this.to;
    }

    public int hashCode() {
        return Integer.hashCode(this.stepMinutes) + unr0.b(this.from.hashCode() * 31, 31, this.to);
    }

    public String toString() {
        return oyr.m(this.stepMinutes, Extension.C_BRAKE, b64.v("TimePickerSlotsDto(from=", this.from, ", to=", this.to, ", stepMinutes="));
    }
}
