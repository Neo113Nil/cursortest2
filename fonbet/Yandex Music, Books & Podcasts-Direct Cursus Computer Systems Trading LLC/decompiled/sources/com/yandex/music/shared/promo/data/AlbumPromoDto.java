package com.yandex.music.shared.promo.data;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import com.yandex.music.shared.dto.domainitem.AlbumDomainItemDto;
import com.yandex.music.shared.dto.domainitem.ArtistDomainItemDto;
import com.yandex.music.shared.dto.domainitem.EntityCoverDto;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/yandex/music/shared/promo/data/AlbumPromoDto;", "", "Lcom/yandex/music/shared/dto/domainitem/AlbumDomainItemDto;", "album", "", "Lcom/yandex/music/shared/dto/domainitem/ArtistDomainItemDto;", "artists", "Lcom/yandex/music/shared/dto/domainitem/EntityCoverDto;", "cover", "", "coverContentMode", "artistId", "Lcom/yandex/music/shared/promo/data/PlaybackReportingPayloadDto;", "playbackReportingPayload", "Lcom/yandex/music/shared/promo/data/PromoReportingPayloadDto;", "promoPayload", "<init>", "(Lcom/yandex/music/shared/dto/domainitem/AlbumDomainItemDto;Ljava/util/List;Lcom/yandex/music/shared/dto/domainitem/EntityCoverDto;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/music/shared/promo/data/PlaybackReportingPayloadDto;Lcom/yandex/music/shared/promo/data/PromoReportingPayloadDto;)V", "Lcom/yandex/music/shared/dto/domainitem/AlbumDomainItemDto;", "a", "()Lcom/yandex/music/shared/dto/domainitem/AlbumDomainItemDto;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lcom/yandex/music/shared/dto/domainitem/EntityCoverDto;", "d", "()Lcom/yandex/music/shared/dto/domainitem/EntityCoverDto;", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "Lcom/yandex/music/shared/promo/data/PlaybackReportingPayloadDto;", "f", "()Lcom/yandex/music/shared/promo/data/PlaybackReportingPayloadDto;", "Lcom/yandex/music/shared/promo/data/PromoReportingPayloadDto;", "g", "()Lcom/yandex/music/shared/promo/data/PromoReportingPayloadDto;", "shared-promo"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class AlbumPromoDto {

    @SerializedName("album")
    private final AlbumDomainItemDto album;

    @SerializedName("advertiserArtistId")
    private final String artistId;

    @SerializedName("artists")
    private final List<ArtistDomainItemDto> artists;

    @SerializedName("cover")
    private final EntityCoverDto cover;

    @SerializedName("coverContentMode")
    private final String coverContentMode;

    @SerializedName("playbackParams")
    private final PlaybackReportingPayloadDto playbackReportingPayload;

    @SerializedName("reporting")
    private final PromoReportingPayloadDto promoPayload;

    public AlbumPromoDto(AlbumDomainItemDto albumDomainItemDto, List<ArtistDomainItemDto> list, EntityCoverDto entityCoverDto, String str, String str2, PlaybackReportingPayloadDto playbackReportingPayloadDto, PromoReportingPayloadDto promoReportingPayloadDto) {
        this.album = albumDomainItemDto;
        this.artists = list;
        this.cover = entityCoverDto;
        this.coverContentMode = str;
        this.artistId = str2;
        this.playbackReportingPayload = playbackReportingPayloadDto;
        this.promoPayload = promoReportingPayloadDto;
    }

    /* renamed from: a, reason: from getter */
    public final AlbumDomainItemDto getAlbum() {
        return this.album;
    }

    /* renamed from: b, reason: from getter */
    public final String getArtistId() {
        return this.artistId;
    }

    /* renamed from: c, reason: from getter */
    public final List getArtists() {
        return this.artists;
    }

    /* renamed from: d, reason: from getter */
    public final EntityCoverDto getCover() {
        return this.cover;
    }

    /* renamed from: e, reason: from getter */
    public final String getCoverContentMode() {
        return this.coverContentMode;
    }

    /* renamed from: f, reason: from getter */
    public final PlaybackReportingPayloadDto getPlaybackReportingPayload() {
        return this.playbackReportingPayload;
    }

    /* renamed from: g, reason: from getter */
    public final PromoReportingPayloadDto getPromoPayload() {
        return this.promoPayload;
    }
}
