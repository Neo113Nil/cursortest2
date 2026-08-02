package com.yandex.music.skeleton.blocks.banner.data;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import com.yandex.music.shared.dto.domainitem.BlockActionDto;
import defpackage.f1d;
import defpackage.jcv;
import defpackage.rm2;
import defpackage.su4;
import defpackage.wct;
import defpackage.y2x;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.stores.WebPath$Storage;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/music/skeleton/blocks/banner/data/BannerEntityDto;", "", "", "title", "titleColor", "backgroundColor", "imageUrl", "Lcom/yandex/music/shared/dto/domainitem/BlockActionDto;", Constants.KEY_ACTION, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/music/shared/dto/domainitem/BlockActionDto;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getTitleColor", "getBackgroundColor", "getImageUrl", "Lcom/yandex/music/shared/dto/domainitem/BlockActionDto;", "getAction", "()Lcom/yandex/music/shared/dto/domainitem/BlockActionDto;", "skeleton-blocks"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final /* data */ class BannerEntityDto {

    @SerializedName(Constants.KEY_ACTION)
    private final BlockActionDto action;

    @SerializedName("backgroundColor")
    private final String backgroundColor;

    @SerializedName("imageUrl")
    private final String imageUrl;

    @SerializedName("title")
    private final String title;

    @SerializedName("titleColor")
    private final String titleColor;

    public BannerEntityDto(String str, String str2, String str3, String str4, BlockActionDto blockActionDto) {
        this.title = str;
        this.titleColor = str2;
        this.backgroundColor = str3;
        this.imageUrl = str4;
        this.action = blockActionDto;
    }

    public final rm2 a() {
        String str;
        Integer b0;
        Integer b02;
        String deeplink;
        String str2 = this.title;
        if (str2 == null || (str = this.titleColor) == null || (b0 = y2x.b0(str)) == null) {
            return null;
        }
        int intValue = b0.intValue();
        String str3 = this.backgroundColor;
        if (str3 == null || (b02 = y2x.b0(str3)) == null) {
            return null;
        }
        int intValue2 = b02.intValue();
        String str4 = this.imageUrl;
        String pathForSize = str4 != null ? new jcv(str4, WebPath$Storage.AVATARS_NO_CROP).getPathForSize(wct.s()) : null;
        BlockActionDto blockActionDto = this.action;
        if (blockActionDto == null || (deeplink = blockActionDto.getDeeplink()) == null) {
            return null;
        }
        return new rm2(str2, intValue, intValue2, pathForSize, deeplink);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerEntityDto)) {
            return false;
        }
        BannerEntityDto bannerEntityDto = (BannerEntityDto) obj;
        return Intrinsics.d(this.title, bannerEntityDto.title) && Intrinsics.d(this.titleColor, bannerEntityDto.titleColor) && Intrinsics.d(this.backgroundColor, bannerEntityDto.backgroundColor) && Intrinsics.d(this.imageUrl, bannerEntityDto.imageUrl) && Intrinsics.d(this.action, bannerEntityDto.action);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.titleColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.imageUrl;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BlockActionDto blockActionDto = this.action;
        return hashCode4 + (blockActionDto != null ? blockActionDto.hashCode() : 0);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.titleColor;
        String str3 = this.backgroundColor;
        String str4 = this.imageUrl;
        BlockActionDto blockActionDto = this.action;
        StringBuilder m = f1d.m("BannerEntityDto(title=", str, ", titleColor=", str2, ", backgroundColor=");
        su4.v(m, str3, ", imageUrl=", str4, ", action=");
        m.append(blockActionDto);
        m.append(")");
        return m.toString();
    }
}
