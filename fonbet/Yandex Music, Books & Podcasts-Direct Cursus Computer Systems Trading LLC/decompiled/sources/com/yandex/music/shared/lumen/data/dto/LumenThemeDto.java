package com.yandex.music.shared.lumen.data.dto;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import com.yandex.music.shared.dto.domainitem.EntityCoverDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yandex/music/shared/lumen/data/dto/LumenThemeDto;", "", "Lcom/yandex/music/shared/dto/domainitem/EntityCoverDto;", "cover", "<init>", "(Lcom/yandex/music/shared/dto/domainitem/EntityCoverDto;)V", "Lcom/yandex/music/shared/dto/domainitem/EntityCoverDto;", "a", "()Lcom/yandex/music/shared/dto/domainitem/EntityCoverDto;", "shared-lumen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final /* data */ class LumenThemeDto {

    @SerializedName("cover")
    private final EntityCoverDto cover;

    public LumenThemeDto(EntityCoverDto entityCoverDto) {
        this.cover = entityCoverDto;
    }

    /* renamed from: a, reason: from getter */
    public final EntityCoverDto getCover() {
        return this.cover;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LumenThemeDto) && Intrinsics.d(this.cover, ((LumenThemeDto) obj).cover);
    }

    public final int hashCode() {
        EntityCoverDto entityCoverDto = this.cover;
        if (entityCoverDto == null) {
            return 0;
        }
        return entityCoverDto.hashCode();
    }

    public final String toString() {
        return "LumenThemeDto(cover=" + this.cover + ")";
    }
}
