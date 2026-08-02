package com.yandex.music.shared.skeleton.blocks.instyle;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import com.yandex.music.shared.dto.domainitem.AlbumDomainItemDto;
import com.yandex.music.shared.dto.domainitem.ArtistDomainItemDto;
import com.yandex.music.shared.dto.trailer.TrailerDto;
import defpackage.dhe;
import defpackage.lt;
import defpackage.ltg;
import defpackage.u51;
import defpackage.xee;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/music/shared/skeleton/blocks/instyle/InStyleItemDto;", "", "Lcom/yandex/music/shared/dto/domainitem/AlbumDomainItemDto;", "album", "", "Lcom/yandex/music/shared/dto/domainitem/ArtistDomainItemDto;", "artists", "Lcom/yandex/music/shared/dto/trailer/TrailerDto;", "trailer", "<init>", "(Lcom/yandex/music/shared/dto/domainitem/AlbumDomainItemDto;Ljava/util/List;Lcom/yandex/music/shared/dto/trailer/TrailerDto;)V", "Lcom/yandex/music/shared/dto/domainitem/AlbumDomainItemDto;", "getAlbum", "()Lcom/yandex/music/shared/dto/domainitem/AlbumDomainItemDto;", "Ljava/util/List;", "getArtists", "()Ljava/util/List;", "Lcom/yandex/music/shared/dto/trailer/TrailerDto;", "getTrailer", "()Lcom/yandex/music/shared/dto/trailer/TrailerDto;", "shared-skeleton-blocks"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final /* data */ class InStyleItemDto {

    @SerializedName("album")
    private final AlbumDomainItemDto album;

    @SerializedName("artists")
    private final List<ArtistDomainItemDto> artists;

    @SerializedName("trailer")
    private final TrailerDto trailer;

    public InStyleItemDto(AlbumDomainItemDto albumDomainItemDto, List<ArtistDomainItemDto> list, TrailerDto trailerDto) {
        this.album = albumDomainItemDto;
        this.artists = list;
        this.trailer = trailerDto;
    }

    public final dhe a() {
        lt J;
        List<ArtistDomainItemDto> list;
        Boolean available;
        AlbumDomainItemDto albumDomainItemDto = this.album;
        if (albumDomainItemDto == null || (J = xee.J(albumDomainItemDto)) == null || (list = this.artists) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ArtistDomainItemDto artistDomainItemDto : list) {
            u51 K = artistDomainItemDto != null ? ltg.K(artistDomainItemDto) : null;
            if (K != null) {
                arrayList.add(K);
            }
        }
        TrailerDto trailerDto = this.trailer;
        return new dhe(J, arrayList, (trailerDto == null || (available = trailerDto.getAvailable()) == null) ? false : available.booleanValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InStyleItemDto)) {
            return false;
        }
        InStyleItemDto inStyleItemDto = (InStyleItemDto) obj;
        return Intrinsics.d(this.album, inStyleItemDto.album) && Intrinsics.d(this.artists, inStyleItemDto.artists) && Intrinsics.d(this.trailer, inStyleItemDto.trailer);
    }

    public final int hashCode() {
        AlbumDomainItemDto albumDomainItemDto = this.album;
        int hashCode = (albumDomainItemDto == null ? 0 : albumDomainItemDto.hashCode()) * 31;
        List<ArtistDomainItemDto> list = this.artists;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        TrailerDto trailerDto = this.trailer;
        return hashCode2 + (trailerDto != null ? trailerDto.hashCode() : 0);
    }

    public final String toString() {
        return "InStyleItemDto(album=" + this.album + ", artists=" + this.artists + ", trailer=" + this.trailer + ")";
    }
}
