package com.yandex.music.communication.dynamic.banner.data;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.f1d;
import defpackage.su4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/yandex/music/communication/dynamic/banner/data/DynamicBannerBlockDataDto;", "", "", "showPolicy", "title", "anchorId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "a", "dynamic-banner-block"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final /* data */ class DynamicBannerBlockDataDto {

    @SerializedName("anchorId")
    private final String anchorId;

    @SerializedName("showPolicy")
    private final String showPolicy;

    @SerializedName("title")
    private final String title;

    public DynamicBannerBlockDataDto(String str, String str2, String str3) {
        this.showPolicy = str;
        this.title = str2;
        this.anchorId = str3;
    }

    /* renamed from: a, reason: from getter */
    public final String getAnchorId() {
        return this.anchorId;
    }

    /* renamed from: b, reason: from getter */
    public final String getShowPolicy() {
        return this.showPolicy;
    }

    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicBannerBlockDataDto)) {
            return false;
        }
        DynamicBannerBlockDataDto dynamicBannerBlockDataDto = (DynamicBannerBlockDataDto) obj;
        return Intrinsics.d(this.showPolicy, dynamicBannerBlockDataDto.showPolicy) && Intrinsics.d(this.title, dynamicBannerBlockDataDto.title) && Intrinsics.d(this.anchorId, dynamicBannerBlockDataDto.anchorId);
    }

    public final int hashCode() {
        String str = this.showPolicy;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.anchorId;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.showPolicy;
        String str2 = this.title;
        return su4.o(f1d.m("DynamicBannerBlockDataDto(showPolicy=", str, ", title=", str2, ", anchorId="), this.anchorId, ")");
    }
}
