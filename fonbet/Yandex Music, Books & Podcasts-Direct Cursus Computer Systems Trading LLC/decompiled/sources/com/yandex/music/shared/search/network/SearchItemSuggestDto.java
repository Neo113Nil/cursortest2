package com.yandex.music.shared.search.network;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import com.yandex.music.shared.dto.album.AlbumDto;
import com.yandex.music.shared.dto.artist.ArtistDto;
import com.yandex.music.shared.dto.playlist.PlaylistHeaderDto;
import com.yandex.music.shared.dto.track.TrackDto;
import com.yandex.music.shared.dto.videoclip.VideoClipDto;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0000\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/yandex/music/shared/search/network/SearchItemSuggestDto;", "", "", "type", "Lcom/yandex/music/shared/dto/artist/ArtistDto;", "artist", "Lcom/yandex/music/shared/dto/track/TrackDto;", "track", "Lcom/yandex/music/shared/dto/album/AlbumDto;", "album", "Lcom/yandex/music/shared/dto/playlist/PlaylistHeaderDto;", "playlistHeader", "Lcom/yandex/music/shared/search/network/WaveDataDto;", "wave", "Lcom/yandex/music/shared/dto/videoclip/VideoClipDto;", "clips", "<init>", "(Ljava/lang/String;Lcom/yandex/music/shared/dto/artist/ArtistDto;Lcom/yandex/music/shared/dto/track/TrackDto;Lcom/yandex/music/shared/dto/album/AlbumDto;Lcom/yandex/music/shared/dto/playlist/PlaylistHeaderDto;Lcom/yandex/music/shared/search/network/WaveDataDto;Lcom/yandex/music/shared/dto/videoclip/VideoClipDto;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Lcom/yandex/music/shared/dto/artist/ArtistDto;", "b", "()Lcom/yandex/music/shared/dto/artist/ArtistDto;", "Lcom/yandex/music/shared/dto/track/TrackDto;", "e", "()Lcom/yandex/music/shared/dto/track/TrackDto;", "Lcom/yandex/music/shared/dto/album/AlbumDto;", "a", "()Lcom/yandex/music/shared/dto/album/AlbumDto;", "Lcom/yandex/music/shared/dto/playlist/PlaylistHeaderDto;", "d", "()Lcom/yandex/music/shared/dto/playlist/PlaylistHeaderDto;", "Lcom/yandex/music/shared/search/network/WaveDataDto;", "g", "()Lcom/yandex/music/shared/search/network/WaveDataDto;", "Lcom/yandex/music/shared/dto/videoclip/VideoClipDto;", "c", "()Lcom/yandex/music/shared/dto/videoclip/VideoClipDto;", "shared-search"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class SearchItemSuggestDto {

    @SerializedName("album")
    private final AlbumDto album;

    @SerializedName("artist")
    private final ArtistDto artist;

    @SerializedName("clip")
    private final VideoClipDto clips;

    @SerializedName("playlist")
    private final PlaylistHeaderDto playlistHeader;

    @SerializedName("track")
    private final TrackDto track;

    @SerializedName("type")
    private final String type;

    @SerializedName("wave")
    private final WaveDataDto wave;

    public SearchItemSuggestDto(String str, ArtistDto artistDto, TrackDto trackDto, AlbumDto albumDto, PlaylistHeaderDto playlistHeaderDto, WaveDataDto waveDataDto, VideoClipDto videoClipDto) {
        this.type = str;
        this.artist = artistDto;
        this.track = trackDto;
        this.album = albumDto;
        this.playlistHeader = playlistHeaderDto;
        this.wave = waveDataDto;
        this.clips = videoClipDto;
    }

    /* renamed from: a, reason: from getter */
    public final AlbumDto getAlbum() {
        return this.album;
    }

    /* renamed from: b, reason: from getter */
    public final ArtistDto getArtist() {
        return this.artist;
    }

    /* renamed from: c, reason: from getter */
    public final VideoClipDto getClips() {
        return this.clips;
    }

    /* renamed from: d, reason: from getter */
    public final PlaylistHeaderDto getPlaylistHeader() {
        return this.playlistHeader;
    }

    /* renamed from: e, reason: from getter */
    public final TrackDto getTrack() {
        return this.track;
    }

    /* renamed from: f, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: g, reason: from getter */
    public final WaveDataDto getWave() {
        return this.wave;
    }
}
