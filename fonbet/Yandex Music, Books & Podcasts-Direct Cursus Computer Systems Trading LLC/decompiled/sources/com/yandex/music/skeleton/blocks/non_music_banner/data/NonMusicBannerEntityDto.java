package com.yandex.music.skeleton.blocks.non_music_banner.data;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import com.yandex.music.shared.dto.domainitem.BlockActionDto;
import defpackage.daj;
import defpackage.f1d;
import defpackage.jcv;
import defpackage.v75;
import defpackage.vz1;
import defpackage.wct;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.stores.WebPath$Storage;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/music/skeleton/blocks/non_music_banner/data/NonMusicBannerEntityDto;", "", "", ConnectableDevice.KEY_ID, "text", "buttonText", "Lcom/yandex/music/shared/dto/domainitem/BlockActionDto;", Constants.KEY_ACTION, "", "covers", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/music/shared/dto/domainitem/BlockActionDto;Ljava/util/List;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getText", "getButtonText", "Lcom/yandex/music/shared/dto/domainitem/BlockActionDto;", "getAction", "()Lcom/yandex/music/shared/dto/domainitem/BlockActionDto;", "Ljava/util/List;", "getCovers", "()Ljava/util/List;", "skeleton-blocks"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final /* data */ class NonMusicBannerEntityDto {

    @SerializedName(Constants.KEY_ACTION)
    private final BlockActionDto action;

    @SerializedName("buttonText")
    private final String buttonText;

    @SerializedName("covers")
    private final List<String> covers;

    @SerializedName(ConnectableDevice.KEY_ID)
    private final String id;

    @SerializedName("text")
    private final String text;

    public NonMusicBannerEntityDto(String str, String str2, String str3, BlockActionDto blockActionDto, List<String> list) {
        this.id = str;
        this.text = str2;
        this.buttonText = str3;
        this.action = blockActionDto;
        this.covers = list;
    }

    public final daj a() {
        String str;
        ArrayList arrayList;
        String str2 = this.id;
        if (str2 == null || (str = this.text) == null) {
            return null;
        }
        String str3 = this.buttonText;
        BlockActionDto blockActionDto = this.action;
        String deeplink = blockActionDto != null ? blockActionDto.getDeeplink() : null;
        List<String> list = this.covers;
        if (list != null) {
            ArrayList O = CollectionsKt.O(list);
            arrayList = new ArrayList(v75.o(O, 10));
            Iterator it = O.iterator();
            while (it.hasNext()) {
                arrayList.add(new jcv((String) it.next(), WebPath$Storage.AVATARS_NO_CROP).getPathForSize(wct.s()));
            }
        } else {
            arrayList = null;
        }
        return new daj(str2, str, str3, deeplink, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NonMusicBannerEntityDto)) {
            return false;
        }
        NonMusicBannerEntityDto nonMusicBannerEntityDto = (NonMusicBannerEntityDto) obj;
        return Intrinsics.d(this.id, nonMusicBannerEntityDto.id) && Intrinsics.d(this.text, nonMusicBannerEntityDto.text) && Intrinsics.d(this.buttonText, nonMusicBannerEntityDto.buttonText) && Intrinsics.d(this.action, nonMusicBannerEntityDto.action) && Intrinsics.d(this.covers, nonMusicBannerEntityDto.covers);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonText;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BlockActionDto blockActionDto = this.action;
        int hashCode4 = (hashCode3 + (blockActionDto == null ? 0 : blockActionDto.hashCode())) * 31;
        List<String> list = this.covers;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.text;
        String str3 = this.buttonText;
        BlockActionDto blockActionDto = this.action;
        List<String> list = this.covers;
        StringBuilder m = f1d.m("NonMusicBannerEntityDto(id=", str, ", text=", str2, ", buttonText=");
        m.append(str3);
        m.append(", action=");
        m.append(blockActionDto);
        m.append(", covers=");
        return vz1.u(m, list, ")");
    }
}
