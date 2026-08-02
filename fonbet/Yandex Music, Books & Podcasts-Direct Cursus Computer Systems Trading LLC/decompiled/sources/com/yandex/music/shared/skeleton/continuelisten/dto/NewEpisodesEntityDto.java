package com.yandex.music.shared.skeleton.continuelisten.dto;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import com.yandex.music.shared.dto.domainitem.EntityCoverDto;
import defpackage.vz1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R$\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/music/shared/skeleton/continuelisten/dto/NewEpisodesEntityDto;", "", "", "title", "", "trackCount", "", "Lcom/yandex/music/shared/dto/domainitem/EntityCoverDto;", "covers", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "Ljava/util/List;", "a", "()Ljava/util/List;", "shared-skeleton-continue-listen-block"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final /* data */ class NewEpisodesEntityDto {

    @SerializedName("covers")
    private final List<EntityCoverDto> covers;

    @SerializedName("title")
    private final String title;

    @SerializedName("trackCount")
    private final Integer trackCount;

    public NewEpisodesEntityDto(String str, Integer num, List<EntityCoverDto> list) {
        this.title = str;
        this.trackCount = num;
        this.covers = list;
    }

    /* renamed from: a, reason: from getter */
    public final List getCovers() {
        return this.covers;
    }

    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: c, reason: from getter */
    public final Integer getTrackCount() {
        return this.trackCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewEpisodesEntityDto)) {
            return false;
        }
        NewEpisodesEntityDto newEpisodesEntityDto = (NewEpisodesEntityDto) obj;
        return Intrinsics.d(this.title, newEpisodesEntityDto.title) && Intrinsics.d(this.trackCount, newEpisodesEntityDto.trackCount) && Intrinsics.d(this.covers, newEpisodesEntityDto.covers);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.trackCount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<EntityCoverDto> list = this.covers;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.title;
        Integer num = this.trackCount;
        List<EntityCoverDto> list = this.covers;
        StringBuilder sb = new StringBuilder("NewEpisodesEntityDto(title=");
        sb.append(str);
        sb.append(", trackCount=");
        sb.append(num);
        sb.append(", covers=");
        return vz1.u(sb, list, ")");
    }
}
