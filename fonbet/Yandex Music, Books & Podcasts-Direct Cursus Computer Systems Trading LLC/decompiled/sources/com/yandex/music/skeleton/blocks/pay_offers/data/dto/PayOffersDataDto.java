package com.yandex.music.skeleton.blocks.pay_offers.data.dto;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import com.yandex.music.shared.dto.domainitem.EntityCoverDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/music/skeleton/blocks/pay_offers/data/dto/PayOffersDataDto;", "", "", "text", "Lcom/yandex/music/shared/dto/domainitem/EntityCoverDto;", "cover", "Lcom/yandex/music/skeleton/blocks/pay_offers/data/dto/PayOffersButtonDto;", "button", "<init>", "(Ljava/lang/String;Lcom/yandex/music/shared/dto/domainitem/EntityCoverDto;Lcom/yandex/music/skeleton/blocks/pay_offers/data/dto/PayOffersButtonDto;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/yandex/music/shared/dto/domainitem/EntityCoverDto;", "b", "()Lcom/yandex/music/shared/dto/domainitem/EntityCoverDto;", "Lcom/yandex/music/skeleton/blocks/pay_offers/data/dto/PayOffersButtonDto;", "a", "()Lcom/yandex/music/skeleton/blocks/pay_offers/data/dto/PayOffersButtonDto;", "skeleton-blocks"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final /* data */ class PayOffersDataDto {

    @SerializedName("button")
    private final PayOffersButtonDto button;

    @SerializedName("cover")
    private final EntityCoverDto cover;

    @SerializedName("text")
    private final String text;

    public PayOffersDataDto(String str, EntityCoverDto entityCoverDto, PayOffersButtonDto payOffersButtonDto) {
        this.text = str;
        this.cover = entityCoverDto;
        this.button = payOffersButtonDto;
    }

    /* renamed from: a, reason: from getter */
    public final PayOffersButtonDto getButton() {
        return this.button;
    }

    /* renamed from: b, reason: from getter */
    public final EntityCoverDto getCover() {
        return this.cover;
    }

    /* renamed from: c, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayOffersDataDto)) {
            return false;
        }
        PayOffersDataDto payOffersDataDto = (PayOffersDataDto) obj;
        return Intrinsics.d(this.text, payOffersDataDto.text) && Intrinsics.d(this.cover, payOffersDataDto.cover) && Intrinsics.d(this.button, payOffersDataDto.button);
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        EntityCoverDto entityCoverDto = this.cover;
        int hashCode2 = (hashCode + (entityCoverDto == null ? 0 : entityCoverDto.hashCode())) * 31;
        PayOffersButtonDto payOffersButtonDto = this.button;
        return hashCode2 + (payOffersButtonDto != null ? payOffersButtonDto.hashCode() : 0);
    }

    public final String toString() {
        return "PayOffersDataDto(text=" + this.text + ", cover=" + this.cover + ", button=" + this.button + ")";
    }
}
