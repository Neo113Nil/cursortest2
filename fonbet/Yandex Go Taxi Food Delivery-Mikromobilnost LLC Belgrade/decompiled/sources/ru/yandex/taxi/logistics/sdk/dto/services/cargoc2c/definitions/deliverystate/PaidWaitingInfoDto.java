package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PaidWaitingInfoDto;", "", "freeWaitingUntil", "", "waitingPrice", "", "paidWaitingTitle", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "getFreeWaitingUntil", "()J", "getWaitingPrice", "()Ljava/lang/String;", "getPaidWaitingTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PaidWaitingInfoDto {
    private final long freeWaitingUntil;
    private final String paidWaitingTitle;
    private final String waitingPrice;

    public PaidWaitingInfoDto(@Json(name = "free_waiting_until") long j, @Json(name = "waiting_price") String str, @Json(name = "paid_waiting_title") String str2) {
        this.freeWaitingUntil = j;
        this.waitingPrice = str;
        this.paidWaitingTitle = str2;
    }

    public static /* synthetic */ PaidWaitingInfoDto copy$default(PaidWaitingInfoDto paidWaitingInfoDto, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = paidWaitingInfoDto.freeWaitingUntil;
        }
        if ((i & 2) != 0) {
            str = paidWaitingInfoDto.waitingPrice;
        }
        if ((i & 4) != 0) {
            str2 = paidWaitingInfoDto.paidWaitingTitle;
        }
        return paidWaitingInfoDto.copy(j, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getFreeWaitingUntil() {
        return this.freeWaitingUntil;
    }

    /* renamed from: component2, reason: from getter */
    public final String getWaitingPrice() {
        return this.waitingPrice;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPaidWaitingTitle() {
        return this.paidWaitingTitle;
    }

    public final PaidWaitingInfoDto copy(@Json(name = "free_waiting_until") long freeWaitingUntil, @Json(name = "waiting_price") String waitingPrice, @Json(name = "paid_waiting_title") String paidWaitingTitle) {
        return new PaidWaitingInfoDto(freeWaitingUntil, waitingPrice, paidWaitingTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaidWaitingInfoDto)) {
            return false;
        }
        PaidWaitingInfoDto paidWaitingInfoDto = (PaidWaitingInfoDto) other;
        return this.freeWaitingUntil == paidWaitingInfoDto.freeWaitingUntil && jl40.l(this.waitingPrice, paidWaitingInfoDto.waitingPrice) && jl40.l(this.paidWaitingTitle, paidWaitingInfoDto.paidWaitingTitle);
    }

    public final long getFreeWaitingUntil() {
        return this.freeWaitingUntil;
    }

    public final String getPaidWaitingTitle() {
        return this.paidWaitingTitle;
    }

    public final String getWaitingPrice() {
        return this.waitingPrice;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.freeWaitingUntil) * 31;
        String str = this.waitingPrice;
        return this.paidWaitingTitle.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        long j = this.freeWaitingUntil;
        String str = this.waitingPrice;
        return unr0.r(x4e.k("PaidWaitingInfoDto(freeWaitingUntil=", j, ", waitingPrice=", str), ", paidWaitingTitle=", this.paidWaitingTitle, Extension.C_BRAKE);
    }
}
