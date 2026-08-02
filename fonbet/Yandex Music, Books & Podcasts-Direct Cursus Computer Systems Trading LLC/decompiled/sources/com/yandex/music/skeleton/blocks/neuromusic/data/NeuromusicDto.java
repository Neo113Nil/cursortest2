package com.yandex.music.skeleton.blocks.neuromusic.data;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.d85;
import defpackage.jcv;
import defpackage.pd;
import defpackage.s2j;
import defpackage.t2j;
import defpackage.wct;
import kotlin.Metadata;
import ru.yandex.music.data.stores.WebPath$Storage;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/music/skeleton/blocks/neuromusic/data/NeuromusicDto;", "", "", "stationId", "title", "imageUrl", "Lcom/yandex/music/skeleton/blocks/neuromusic/data/NeuromusicButtonStyleDto;", "style", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/music/skeleton/blocks/neuromusic/data/NeuromusicButtonStyleDto;)V", "Ljava/lang/String;", "getStationId", "()Ljava/lang/String;", "getTitle", "getImageUrl", "Lcom/yandex/music/skeleton/blocks/neuromusic/data/NeuromusicButtonStyleDto;", "getStyle", "()Lcom/yandex/music/skeleton/blocks/neuromusic/data/NeuromusicButtonStyleDto;", "skeleton-blocks"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class NeuromusicDto {

    @SerializedName("imageUrl")
    private final String imageUrl;

    @SerializedName("stationId")
    private final String stationId;

    @SerializedName("style")
    private final NeuromusicButtonStyleDto style;

    @SerializedName("title")
    private final String title;

    public NeuromusicDto(String str, String str2, String str3, NeuromusicButtonStyleDto neuromusicButtonStyleDto) {
        this.stationId = str;
        this.title = str2;
        this.imageUrl = str3;
        this.style = neuromusicButtonStyleDto;
    }

    public final t2j a() {
        String str;
        String str2 = this.stationId;
        if (str2 == null || (str = this.title) == null) {
            return null;
        }
        String str3 = this.imageUrl;
        String pathForSize = str3 != null ? new jcv(str3, WebPath$Storage.AVATARS).getPathForSize(wct.s()) : null;
        NeuromusicButtonStyleDto neuromusicButtonStyleDto = this.style;
        d85 T = pd.T(neuromusicButtonStyleDto != null ? neuromusicButtonStyleDto.getBackgroundColor() : null);
        NeuromusicButtonStyleDto neuromusicButtonStyleDto2 = this.style;
        return new t2j(str2, str, pathForSize, new s2j(T, pd.T(neuromusicButtonStyleDto2 != null ? neuromusicButtonStyleDto2.getTitleColor() : null)));
    }
}
