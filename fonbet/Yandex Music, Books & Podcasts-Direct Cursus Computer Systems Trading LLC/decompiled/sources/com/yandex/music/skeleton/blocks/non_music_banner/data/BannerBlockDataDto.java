package com.yandex.music.skeleton.blocks.non_music_banner.data;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import com.yandex.music.shared.skeleton.data.core.api.block.model.SkeletonBlockSourceDto;
import defpackage.su4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/yandex/music/skeleton/blocks/non_music_banner/data/BannerBlockDataDto;", "", "", "bannerId", "Lcom/yandex/music/shared/skeleton/data/core/api/block/model/SkeletonBlockSourceDto;", "source", "showPolicy", "<init>", "(Ljava/lang/String;Lcom/yandex/music/shared/skeleton/data/core/api/block/model/SkeletonBlockSourceDto;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/yandex/music/shared/skeleton/data/core/api/block/model/SkeletonBlockSourceDto;", "c", "()Lcom/yandex/music/shared/skeleton/data/core/api/block/model/SkeletonBlockSourceDto;", "b", "skeleton-blocks"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final /* data */ class BannerBlockDataDto {

    @SerializedName("bannerId")
    private final String bannerId;

    @SerializedName("showPolicy")
    private final String showPolicy;

    @SerializedName("source")
    private final SkeletonBlockSourceDto source;

    public BannerBlockDataDto(String str, SkeletonBlockSourceDto skeletonBlockSourceDto, String str2) {
        this.bannerId = str;
        this.source = skeletonBlockSourceDto;
        this.showPolicy = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getBannerId() {
        return this.bannerId;
    }

    /* renamed from: b, reason: from getter */
    public final String getShowPolicy() {
        return this.showPolicy;
    }

    /* renamed from: c, reason: from getter */
    public final SkeletonBlockSourceDto getSource() {
        return this.source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerBlockDataDto)) {
            return false;
        }
        BannerBlockDataDto bannerBlockDataDto = (BannerBlockDataDto) obj;
        return Intrinsics.d(this.bannerId, bannerBlockDataDto.bannerId) && Intrinsics.d(this.source, bannerBlockDataDto.source) && Intrinsics.d(this.showPolicy, bannerBlockDataDto.showPolicy);
    }

    public final int hashCode() {
        String str = this.bannerId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        SkeletonBlockSourceDto skeletonBlockSourceDto = this.source;
        int hashCode2 = (hashCode + (skeletonBlockSourceDto == null ? 0 : skeletonBlockSourceDto.hashCode())) * 31;
        String str2 = this.showPolicy;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.bannerId;
        SkeletonBlockSourceDto skeletonBlockSourceDto = this.source;
        String str2 = this.showPolicy;
        StringBuilder sb = new StringBuilder("BannerBlockDataDto(bannerId=");
        sb.append(str);
        sb.append(", source=");
        sb.append(skeletonBlockSourceDto);
        sb.append(", showPolicy=");
        return su4.o(sb, str2, ")");
    }
}
