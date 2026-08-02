package com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import com.yandex.music.shared.dto.domainitem.EntityCoverDto;
import defpackage.su4;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/content/ChartArtistSlideListItemDto;", "", "", Constants.KEY_VALUE, "", "title", "subtitle", "titleType", "Lcom/yandex/music/shared/dto/domainitem/EntityCoverDto;", "cover", "coverType", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/music/shared/dto/domainitem/EntityCoverDto;Ljava/lang/String;)V", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "e", "Lcom/yandex/music/shared/dto/domainitem/EntityCoverDto;", "a", "()Lcom/yandex/music/shared/dto/domainitem/EntityCoverDto;", "b", "shared-slides-ui-music-logic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final /* data */ class ChartArtistSlideListItemDto {

    @SerializedName("cover")
    private final EntityCoverDto cover;

    @SerializedName("coverType")
    private final String coverType;

    @SerializedName("subtitle")
    private final String subtitle;

    @SerializedName("title")
    private final String title;

    @SerializedName("titleType")
    private final String titleType;

    @SerializedName(Constants.KEY_VALUE)
    private final Long value;

    public ChartArtistSlideListItemDto(Long l, String str, String str2, String str3, EntityCoverDto entityCoverDto, String str4) {
        this.value = l;
        this.title = str;
        this.subtitle = str2;
        this.titleType = str3;
        this.cover = entityCoverDto;
        this.coverType = str4;
    }

    /* renamed from: a, reason: from getter */
    public final EntityCoverDto getCover() {
        return this.cover;
    }

    /* renamed from: b, reason: from getter */
    public final String getCoverType() {
        return this.coverType;
    }

    /* renamed from: c, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: e, reason: from getter */
    public final String getTitleType() {
        return this.titleType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChartArtistSlideListItemDto)) {
            return false;
        }
        ChartArtistSlideListItemDto chartArtistSlideListItemDto = (ChartArtistSlideListItemDto) obj;
        return Intrinsics.d(this.value, chartArtistSlideListItemDto.value) && Intrinsics.d(this.title, chartArtistSlideListItemDto.title) && Intrinsics.d(this.subtitle, chartArtistSlideListItemDto.subtitle) && Intrinsics.d(this.titleType, chartArtistSlideListItemDto.titleType) && Intrinsics.d(this.cover, chartArtistSlideListItemDto.cover) && Intrinsics.d(this.coverType, chartArtistSlideListItemDto.coverType);
    }

    /* renamed from: f, reason: from getter */
    public final Long getValue() {
        return this.value;
    }

    public final int hashCode() {
        Long l = this.value;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.titleType;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        EntityCoverDto entityCoverDto = this.cover;
        int hashCode5 = (hashCode4 + (entityCoverDto == null ? 0 : entityCoverDto.hashCode())) * 31;
        String str4 = this.coverType;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        Long l = this.value;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.titleType;
        EntityCoverDto entityCoverDto = this.cover;
        String str4 = this.coverType;
        StringBuilder sb = new StringBuilder("ChartArtistSlideListItemDto(value=");
        sb.append(l);
        sb.append(", title=");
        sb.append(str);
        sb.append(", subtitle=");
        su4.v(sb, str2, ", titleType=", str3, ", cover=");
        sb.append(entityCoverDto);
        sb.append(", coverType=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
