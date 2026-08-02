package com.yandex.music.shared.wizard3.network.dto;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001BQ\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0002\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R$\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/music/shared/wizard3/network/dto/WizardInitialArtistsDto;", "", "", "Lcom/yandex/music/shared/wizard3/network/dto/WizardFullArtistDto;", "artists", "Lcom/yandex/music/shared/wizard3/network/dto/WizardGenreDto;", "genres", "", "likedArtists", "Lcom/yandex/music/shared/wizard3/network/dto/WizardProgressDto;", "progress", "", "pumpkin", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/yandex/music/shared/wizard3/network/dto/WizardProgressDto;Ljava/lang/Boolean;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "b", "c", "Lcom/yandex/music/shared/wizard3/network/dto/WizardProgressDto;", "d", "()Lcom/yandex/music/shared/wizard3/network/dto/WizardProgressDto;", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "shared-wizard3"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final /* data */ class WizardInitialArtistsDto {

    @SerializedName("artists")
    private final List<WizardFullArtistDto> artists;

    @SerializedName("genres")
    private final List<WizardGenreDto> genres;

    @SerializedName("likedArtists")
    private final List<String> likedArtists;

    @SerializedName("progress")
    private final WizardProgressDto progress;

    @SerializedName("pumpkin")
    private final Boolean pumpkin;

    public WizardInitialArtistsDto(List<WizardFullArtistDto> list, List<WizardGenreDto> list2, List<String> list3, WizardProgressDto wizardProgressDto, Boolean bool) {
        this.artists = list;
        this.genres = list2;
        this.likedArtists = list3;
        this.progress = wizardProgressDto;
        this.pumpkin = bool;
    }

    /* renamed from: a, reason: from getter */
    public final List getArtists() {
        return this.artists;
    }

    /* renamed from: b, reason: from getter */
    public final List getGenres() {
        return this.genres;
    }

    /* renamed from: c, reason: from getter */
    public final List getLikedArtists() {
        return this.likedArtists;
    }

    /* renamed from: d, reason: from getter */
    public final WizardProgressDto getProgress() {
        return this.progress;
    }

    /* renamed from: e, reason: from getter */
    public final Boolean getPumpkin() {
        return this.pumpkin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WizardInitialArtistsDto)) {
            return false;
        }
        WizardInitialArtistsDto wizardInitialArtistsDto = (WizardInitialArtistsDto) obj;
        return Intrinsics.d(this.artists, wizardInitialArtistsDto.artists) && Intrinsics.d(this.genres, wizardInitialArtistsDto.genres) && Intrinsics.d(this.likedArtists, wizardInitialArtistsDto.likedArtists) && Intrinsics.d(this.progress, wizardInitialArtistsDto.progress) && Intrinsics.d(this.pumpkin, wizardInitialArtistsDto.pumpkin);
    }

    public final int hashCode() {
        List<WizardFullArtistDto> list = this.artists;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<WizardGenreDto> list2 = this.genres;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.likedArtists;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        WizardProgressDto wizardProgressDto = this.progress;
        int hashCode4 = (hashCode3 + (wizardProgressDto == null ? 0 : wizardProgressDto.hashCode())) * 31;
        Boolean bool = this.pumpkin;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "WizardInitialArtistsDto(artists=" + this.artists + ", genres=" + this.genres + ", likedArtists=" + this.likedArtists + ", progress=" + this.progress + ", pumpkin=" + this.pumpkin + ")";
    }
}
