package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.qv10;
import defpackage.x4e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/TimeslotDto;", "", "title", "", "timestampFrom", "", "timestampTo", "priceSubtitle", "isPaid", "", "<init>", "(Ljava/lang/String;JJLjava/lang/String;Z)V", "getTitle", "()Ljava/lang/String;", "getTimestampFrom", "()J", "getTimestampTo", "getPriceSubtitle", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TimeslotDto {
    private final boolean isPaid;
    private final String priceSubtitle;
    private final long timestampFrom;
    private final long timestampTo;
    private final String title;

    public /* synthetic */ TimeslotDto(String str, long j, long j2, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, j2, str2, (i & 16) != 0 ? false : z);
    }

    public static /* synthetic */ TimeslotDto copy$default(TimeslotDto timeslotDto, String str, long j, long j2, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = timeslotDto.title;
        }
        if ((i & 2) != 0) {
            j = timeslotDto.timestampFrom;
        }
        if ((i & 4) != 0) {
            j2 = timeslotDto.timestampTo;
        }
        if ((i & 8) != 0) {
            str2 = timeslotDto.priceSubtitle;
        }
        if ((i & 16) != 0) {
            z = timeslotDto.isPaid;
        }
        long j3 = j2;
        return timeslotDto.copy(str, j, j3, str2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTimestampFrom() {
        return this.timestampFrom;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTimestampTo() {
        return this.timestampTo;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPriceSubtitle() {
        return this.priceSubtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsPaid() {
        return this.isPaid;
    }

    public final TimeslotDto copy(@Json(name = "title") String title, @Json(name = "timestamp_from") long timestampFrom, @Json(name = "timestamp_to") long timestampTo, @Json(name = "price_subtitle") String priceSubtitle, @Json(name = "is_paid") boolean isPaid) {
        return new TimeslotDto(title, timestampFrom, timestampTo, priceSubtitle, isPaid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeslotDto)) {
            return false;
        }
        TimeslotDto timeslotDto = (TimeslotDto) other;
        return jl40.l(this.title, timeslotDto.title) && this.timestampFrom == timeslotDto.timestampFrom && this.timestampTo == timeslotDto.timestampTo && jl40.l(this.priceSubtitle, timeslotDto.priceSubtitle) && this.isPaid == timeslotDto.isPaid;
    }

    public final String getPriceSubtitle() {
        return this.priceSubtitle;
    }

    public final long getTimestampFrom() {
        return this.timestampFrom;
    }

    public final long getTimestampTo() {
        return this.timestampTo;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int c = qv10.c(qv10.c(this.title.hashCode() * 31, 31, this.timestampFrom), 31, this.timestampTo);
        String str = this.priceSubtitle;
        return Boolean.hashCode(this.isPaid) + ((c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final boolean isPaid() {
        return this.isPaid;
    }

    public String toString() {
        String str = this.title;
        long j = this.timestampFrom;
        long j2 = this.timestampTo;
        String str2 = this.priceSubtitle;
        boolean z = this.isPaid;
        StringBuilder l = x4e.l("TimeslotDto(title=", str, ", timestampFrom=", j);
        x4e.A(j2, ", timestampTo=", ", priceSubtitle=", l);
        return nnm.i(str2, ", isPaid=", Extension.C_BRAKE, l, z);
    }

    public TimeslotDto(@Json(name = "title") String str, @Json(name = "timestamp_from") long j, @Json(name = "timestamp_to") long j2, @Json(name = "price_subtitle") String str2, @Json(name = "is_paid") boolean z) {
        this.title = str;
        this.timestampFrom = j;
        this.timestampTo = j2;
        this.priceSubtitle = str2;
        this.isPaid = z;
    }
}
