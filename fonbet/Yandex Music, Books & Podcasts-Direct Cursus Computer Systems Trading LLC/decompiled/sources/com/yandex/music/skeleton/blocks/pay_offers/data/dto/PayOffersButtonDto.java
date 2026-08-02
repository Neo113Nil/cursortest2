package com.yandex.music.skeleton.blocks.pay_offers.data.dto;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import com.yandex.music.shared.dto.domainitem.BlockActionDto;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/music/skeleton/blocks/pay_offers/data/dto/PayOffersButtonDto;", "", "", "title", "", "selected", "Lcom/yandex/music/shared/dto/domainitem/BlockActionDto;", Constants.KEY_ACTION, "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/yandex/music/shared/dto/domainitem/BlockActionDto;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "Lcom/yandex/music/shared/dto/domainitem/BlockActionDto;", "a", "()Lcom/yandex/music/shared/dto/domainitem/BlockActionDto;", "skeleton-blocks"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final /* data */ class PayOffersButtonDto {

    @SerializedName(Constants.KEY_ACTION)
    private final BlockActionDto action;

    @SerializedName("selected")
    private final Boolean selected;

    @SerializedName("title")
    private final String title;

    public PayOffersButtonDto(String str, Boolean bool, BlockActionDto blockActionDto) {
        this.title = str;
        this.selected = bool;
        this.action = blockActionDto;
    }

    /* renamed from: a, reason: from getter */
    public final BlockActionDto getAction() {
        return this.action;
    }

    /* renamed from: b, reason: from getter */
    public final Boolean getSelected() {
        return this.selected;
    }

    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayOffersButtonDto)) {
            return false;
        }
        PayOffersButtonDto payOffersButtonDto = (PayOffersButtonDto) obj;
        return Intrinsics.d(this.title, payOffersButtonDto.title) && Intrinsics.d(this.selected, payOffersButtonDto.selected) && Intrinsics.d(this.action, payOffersButtonDto.action);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.selected;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        BlockActionDto blockActionDto = this.action;
        return hashCode2 + (blockActionDto != null ? blockActionDto.hashCode() : 0);
    }

    public final String toString() {
        return "PayOffersButtonDto(title=" + this.title + ", selected=" + this.selected + ", action=" + this.action + ")";
    }
}
