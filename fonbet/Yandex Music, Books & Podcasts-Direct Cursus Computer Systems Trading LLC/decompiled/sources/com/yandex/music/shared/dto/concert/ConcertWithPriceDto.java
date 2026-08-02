package com.yandex.music.shared.dto.concert;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/music/shared/dto/concert/ConcertWithPriceDto;", "", "Lcom/yandex/music/shared/dto/concert/ConcertShortDto;", "concert", "Lcom/yandex/music/shared/dto/concert/ConcertPriceDto;", "price", "<init>", "(Lcom/yandex/music/shared/dto/concert/ConcertShortDto;Lcom/yandex/music/shared/dto/concert/ConcertPriceDto;)V", "Lcom/yandex/music/shared/dto/concert/ConcertShortDto;", "a", "()Lcom/yandex/music/shared/dto/concert/ConcertShortDto;", "Lcom/yandex/music/shared/dto/concert/ConcertPriceDto;", "b", "()Lcom/yandex/music/shared/dto/concert/ConcertPriceDto;", "shared-model-parsers"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final /* data */ class ConcertWithPriceDto {

    @SerializedName("concert")
    private final ConcertShortDto concert;

    @SerializedName("minPrice")
    private final ConcertPriceDto price;

    public ConcertWithPriceDto(ConcertShortDto concertShortDto, ConcertPriceDto concertPriceDto) {
        this.concert = concertShortDto;
        this.price = concertPriceDto;
    }

    /* renamed from: a, reason: from getter */
    public final ConcertShortDto getConcert() {
        return this.concert;
    }

    /* renamed from: b, reason: from getter */
    public final ConcertPriceDto getPrice() {
        return this.price;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConcertWithPriceDto)) {
            return false;
        }
        ConcertWithPriceDto concertWithPriceDto = (ConcertWithPriceDto) obj;
        return Intrinsics.d(this.concert, concertWithPriceDto.concert) && Intrinsics.d(this.price, concertWithPriceDto.price);
    }

    public final int hashCode() {
        ConcertShortDto concertShortDto = this.concert;
        int hashCode = (concertShortDto == null ? 0 : concertShortDto.hashCode()) * 31;
        ConcertPriceDto concertPriceDto = this.price;
        return hashCode + (concertPriceDto != null ? concertPriceDto.hashCode() : 0);
    }

    public final String toString() {
        return "ConcertWithPriceDto(concert=" + this.concert + ", price=" + this.price + ")";
    }
}
