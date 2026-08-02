package com.yandex.music.shared.dto.track;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.yandex.metrica.push.common.CoreConstants;
import com.yandex.music.shared.dto.album.AlbumDto;
import com.yandex.music.shared.dto.artist.ArtistDto;
import defpackage.erq;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\bB\u0018\u00002\u00020\u0001:\u0002mnB¯\u0003\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0013\u0012\u0010\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\u0010\u0010%\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0013\u0012\b\u0010&\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010'\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010(\u001a\u0004\u0018\u00010\r\u0012\u0010\u0010)\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0013\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\b\u0010,\u001a\u0004\u0018\u00010*\u0012\u0018\u0010.\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010-\u0012\u0010\u0010/\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0013\u0012\u0010\u00100\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0013¢\u0006\u0004\b1\u00102R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b6\u00105R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b7\u00105R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b8\u00105R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b9\u00105R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b=\u00105R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bB\u0010CR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\bD\u00105R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\bE\u00105R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\bF\u0010@R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\bG\u00105R$\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010H\u001a\u0004\bI\u0010JR$\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010H\u001a\u0004\bK\u0010JR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010>\u001a\u0004\bL\u0010@R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010>\u001a\u0004\bM\u0010@R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010N\u001a\u0004\bO\u0010PR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u00103\u001a\u0004\bQ\u00105R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u00103\u001a\u0004\bR\u00105R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u00103\u001a\u0004\bS\u00105R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u00103\u001a\u0004\bT\u00105R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u00103\u001a\u0004\bU\u00105R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u00103\u001a\u0004\bV\u00105R\u001c\u0010\"\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010>\u001a\u0004\bW\u0010@R\u001c\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010X\u001a\u0004\bY\u0010ZR$\u0010%\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010H\u001a\u0004\b[\u0010JR\u001c\u0010&\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010>\u001a\u0004\b\\\u0010@R\u001c\u0010'\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010>\u001a\u0004\b]\u0010@R\u001c\u0010(\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010A\u001a\u0004\b^\u0010CR$\u0010)\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010H\u001a\u0004\b_\u0010JR\u001c\u0010+\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010`\u001a\u0004\ba\u0010bR\u001c\u0010,\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010`\u001a\u0004\bc\u0010bR,\u0010.\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010d\u001a\u0004\be\u0010fR$\u0010/\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010H\u001a\u0004\bg\u0010JR$\u00100\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010H\u001a\u0004\bh\u0010JR$\u0010l\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bI\u00103\u001a\u0004\bi\u00105\"\u0004\bj\u0010k¨\u0006o"}, d2 = {"Lcom/yandex/music/shared/dto/track/TrackDto;", "", "", ConnectableDevice.KEY_ID, "realId", "title", "type", "trackSource", "Lcom/yandex/music/shared/dto/track/TrackUserInfoDto;", "userInfo", "ugcArtistName", "", "rememberPosition", "", "durationMs", "pubDate", "version", "available", "contentWarning", "", "Lcom/yandex/music/shared/dto/album/AlbumDto;", "albums", "Lcom/yandex/music/shared/dto/artist/ArtistDto;", "artists", "best", "lyricsAvailable", "Lcom/yandex/music/shared/dto/track/TrackDto$LyricsInfoDto;", "lyricsInfo", "error", "backgroundVideoUri", "playerId", "coverUri", "shortDescription", "episodeType", "isSuitableForChildren", "Lcom/yandex/music/shared/dto/track/TrackLoudnessDto;", "loudnessDto", "availableForOptions", "availableForPremiumUsers", "availableFullWithoutPermission", "previewDurationMs", "disclaimer", "Lcom/yandex/music/shared/dto/track/TrackFadeDto;", "fade", "mixFade", "", "colorPalette", "specialAudioResources", "videoClipIds", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/music/shared/dto/track/TrackUserInfoDto;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/yandex/music/shared/dto/track/TrackDto$LyricsInfoDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/yandex/music/shared/dto/track/TrackLoudnessDto;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/util/List;Lcom/yandex/music/shared/dto/track/TrackFadeDto;Lcom/yandex/music/shared/dto/track/TrackFadeDto;Ljava/util/Map;Ljava/util/List;Ljava/util/List;)V", "Ljava/lang/String;", "p", "()Ljava/lang/String;", "y", "C", "E", "D", "Lcom/yandex/music/shared/dto/track/TrackUserInfoDto;", "G", "()Lcom/yandex/music/shared/dto/track/TrackUserInfoDto;", "F", "Ljava/lang/Boolean;", "z", "()Ljava/lang/Boolean;", "Ljava/lang/Long;", "l", "()Ljava/lang/Long;", "w", "H", "c", CoreConstants.PushMessage.SERVICE_TYPE, "Ljava/util/List;", "a", "()Ljava/util/List;", "b", "getBest", "r", "Lcom/yandex/music/shared/dto/track/TrackDto$LyricsInfoDto;", "s", "()Lcom/yandex/music/shared/dto/track/TrackDto$LyricsInfoDto;", "n", "g", "u", "j", "A", "m", "J", "Lcom/yandex/music/shared/dto/track/TrackLoudnessDto;", "q", "()Lcom/yandex/music/shared/dto/track/TrackLoudnessDto;", "d", "e", "f", "v", "k", "Lcom/yandex/music/shared/dto/track/TrackFadeDto;", "o", "()Lcom/yandex/music/shared/dto/track/TrackFadeDto;", "t", "Ljava/util/Map;", "h", "()Ljava/util/Map;", "B", "I", "x", "setRawJson", "(Ljava/lang/String;)V", "rawJson", "LyricsInfoDto", "TrackDtoTypeAdapter", "shared-model-parsers"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class TrackDto {

    /* renamed from: a, reason: from kotlin metadata */
    @erq
    private String rawJson;

    @SerializedName("albums")
    private final List<AlbumDto> albums;

    @SerializedName("artists")
    private final List<ArtistDto> artists;

    @SerializedName("available")
    private final Boolean available;

    @SerializedName("availableForOptions")
    private final List<String> availableForOptions;

    @SerializedName("availableForPremiumUsers")
    private final Boolean availableForPremiumUsers;

    @SerializedName("availableFullWithoutPermission")
    private final Boolean availableFullWithoutPermission;

    @SerializedName("backgroundVideoUri")
    private final String backgroundVideoUri;

    @SerializedName("best")
    private final Boolean best;

    @SerializedName("derivedColors")
    private final Map<String, String> colorPalette;

    @SerializedName("contentWarning")
    private final String contentWarning;

    @SerializedName("coverUri")
    private final String coverUri;

    @SerializedName("disclaimers")
    private final List<String> disclaimer;

    @SerializedName("durationMs")
    private final Long durationMs;

    @SerializedName("podcastEpisodeType")
    private final String episodeType;

    @SerializedName("error")
    private final String error;

    @SerializedName("fade")
    private final TrackFadeDto fade;

    @SerializedName(ConnectableDevice.KEY_ID)
    private final String id;

    @SerializedName("isSuitableForChildren")
    private final Boolean isSuitableForChildren;

    @SerializedName("r128")
    private final TrackLoudnessDto loudnessDto;

    @SerializedName("lyricsAvailable")
    private final Boolean lyricsAvailable;

    @SerializedName("lyricsInfo")
    private final LyricsInfoDto lyricsInfo;

    @SerializedName("mixFade")
    private final TrackFadeDto mixFade;

    @SerializedName("playerId")
    private final String playerId;

    @SerializedName("previewDurationMs")
    private final Long previewDurationMs;

    @SerializedName("pubDate")
    private final String pubDate;

    @SerializedName("realId")
    private final String realId;

    @SerializedName("rememberPosition")
    private final Boolean rememberPosition;

    @SerializedName("shortDescription")
    private final String shortDescription;

    @SerializedName("specialAudioResources")
    private final List<String> specialAudioResources;

    @SerializedName("title")
    private final String title;

    @SerializedName("trackSource")
    private final String trackSource;

    @SerializedName("type")
    private final String type;

    @SerializedName("ugcArtistName")
    private final String ugcArtistName;

    @SerializedName("userInfo")
    private final TrackUserInfoDto userInfo;

    @SerializedName("version")
    private final String version;

    @SerializedName("clipIds")
    private final List<String> videoClipIds;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/yandex/music/shared/dto/track/TrackDto$LyricsInfoDto;", "", "", "hasAvailableTextLyrics", "hasAvailableSyncLyrics", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "a", "shared-model-parsers"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final /* data */ class LyricsInfoDto {

        @SerializedName("hasAvailableSyncLyrics")
        private final Boolean hasAvailableSyncLyrics;

        @SerializedName("hasAvailableTextLyrics")
        private final Boolean hasAvailableTextLyrics;

        public LyricsInfoDto(Boolean bool, Boolean bool2) {
            this.hasAvailableTextLyrics = bool;
            this.hasAvailableSyncLyrics = bool2;
        }

        /* renamed from: a, reason: from getter */
        public final Boolean getHasAvailableSyncLyrics() {
            return this.hasAvailableSyncLyrics;
        }

        /* renamed from: b, reason: from getter */
        public final Boolean getHasAvailableTextLyrics() {
            return this.hasAvailableTextLyrics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LyricsInfoDto)) {
                return false;
            }
            LyricsInfoDto lyricsInfoDto = (LyricsInfoDto) obj;
            return Intrinsics.d(this.hasAvailableTextLyrics, lyricsInfoDto.hasAvailableTextLyrics) && Intrinsics.d(this.hasAvailableSyncLyrics, lyricsInfoDto.hasAvailableSyncLyrics);
        }

        public final int hashCode() {
            Boolean bool = this.hasAvailableTextLyrics;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.hasAvailableSyncLyrics;
            return hashCode + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final String toString() {
            return "LyricsInfoDto(hasAvailableTextLyrics=" + this.hasAvailableTextLyrics + ", hasAvailableSyncLyrics=" + this.hasAvailableSyncLyrics + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/yandex/music/shared/dto/track/TrackDto$TrackDtoTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/yandex/music/shared/dto/track/TrackDto;", "shared-model-parsers"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class TrackDtoTypeAdapter extends TypeAdapter<TrackDto> {
        public final TypeAdapter a;

        public TrackDtoTypeAdapter(TypeAdapter typeAdapter, TypeAdapter typeAdapter2) {
            typeAdapter2.getClass();
            this.a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final Object b(JsonReader jsonReader) {
            jsonReader.getClass();
            return (TrackDto) this.a.b(jsonReader);
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(JsonWriter jsonWriter, Object obj) {
            jsonWriter.getClass();
            this.a.c(jsonWriter, (TrackDto) obj);
        }
    }

    public TrackDto(String str, String str2, String str3, String str4, String str5, TrackUserInfoDto trackUserInfoDto, String str6, Boolean bool, Long l, String str7, String str8, Boolean bool2, String str9, List<AlbumDto> list, List<ArtistDto> list2, Boolean bool3, Boolean bool4, LyricsInfoDto lyricsInfoDto, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool5, TrackLoudnessDto trackLoudnessDto, List<String> list3, Boolean bool6, Boolean bool7, Long l2, List<String> list4, TrackFadeDto trackFadeDto, TrackFadeDto trackFadeDto2, Map<String, String> map, List<String> list5, List<String> list6) {
        this.id = str;
        this.realId = str2;
        this.title = str3;
        this.type = str4;
        this.trackSource = str5;
        this.userInfo = trackUserInfoDto;
        this.ugcArtistName = str6;
        this.rememberPosition = bool;
        this.durationMs = l;
        this.pubDate = str7;
        this.version = str8;
        this.available = bool2;
        this.contentWarning = str9;
        this.albums = list;
        this.artists = list2;
        this.best = bool3;
        this.lyricsAvailable = bool4;
        this.lyricsInfo = lyricsInfoDto;
        this.error = str10;
        this.backgroundVideoUri = str11;
        this.playerId = str12;
        this.coverUri = str13;
        this.shortDescription = str14;
        this.episodeType = str15;
        this.isSuitableForChildren = bool5;
        this.loudnessDto = trackLoudnessDto;
        this.availableForOptions = list3;
        this.availableForPremiumUsers = bool6;
        this.availableFullWithoutPermission = bool7;
        this.previewDurationMs = l2;
        this.disclaimer = list4;
        this.fade = trackFadeDto;
        this.mixFade = trackFadeDto2;
        this.colorPalette = map;
        this.specialAudioResources = list5;
        this.videoClipIds = list6;
    }

    /* renamed from: A, reason: from getter */
    public final String getShortDescription() {
        return this.shortDescription;
    }

    /* renamed from: B, reason: from getter */
    public final List getSpecialAudioResources() {
        return this.specialAudioResources;
    }

    /* renamed from: C, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: D, reason: from getter */
    public final String getTrackSource() {
        return this.trackSource;
    }

    /* renamed from: E, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: F, reason: from getter */
    public final String getUgcArtistName() {
        return this.ugcArtistName;
    }

    /* renamed from: G, reason: from getter */
    public final TrackUserInfoDto getUserInfo() {
        return this.userInfo;
    }

    /* renamed from: H, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: I, reason: from getter */
    public final List getVideoClipIds() {
        return this.videoClipIds;
    }

    /* renamed from: J, reason: from getter */
    public final Boolean getIsSuitableForChildren() {
        return this.isSuitableForChildren;
    }

    /* renamed from: a, reason: from getter */
    public final List getAlbums() {
        return this.albums;
    }

    /* renamed from: b, reason: from getter */
    public final List getArtists() {
        return this.artists;
    }

    /* renamed from: c, reason: from getter */
    public final Boolean getAvailable() {
        return this.available;
    }

    /* renamed from: d, reason: from getter */
    public final List getAvailableForOptions() {
        return this.availableForOptions;
    }

    /* renamed from: e, reason: from getter */
    public final Boolean getAvailableForPremiumUsers() {
        return this.availableForPremiumUsers;
    }

    /* renamed from: f, reason: from getter */
    public final Boolean getAvailableFullWithoutPermission() {
        return this.availableFullWithoutPermission;
    }

    /* renamed from: g, reason: from getter */
    public final String getBackgroundVideoUri() {
        return this.backgroundVideoUri;
    }

    /* renamed from: h, reason: from getter */
    public final Map getColorPalette() {
        return this.colorPalette;
    }

    /* renamed from: i, reason: from getter */
    public final String getContentWarning() {
        return this.contentWarning;
    }

    /* renamed from: j, reason: from getter */
    public final String getCoverUri() {
        return this.coverUri;
    }

    /* renamed from: k, reason: from getter */
    public final List getDisclaimer() {
        return this.disclaimer;
    }

    /* renamed from: l, reason: from getter */
    public final Long getDurationMs() {
        return this.durationMs;
    }

    /* renamed from: m, reason: from getter */
    public final String getEpisodeType() {
        return this.episodeType;
    }

    /* renamed from: n, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: o, reason: from getter */
    public final TrackFadeDto getFade() {
        return this.fade;
    }

    /* renamed from: p, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: q, reason: from getter */
    public final TrackLoudnessDto getLoudnessDto() {
        return this.loudnessDto;
    }

    /* renamed from: r, reason: from getter */
    public final Boolean getLyricsAvailable() {
        return this.lyricsAvailable;
    }

    /* renamed from: s, reason: from getter */
    public final LyricsInfoDto getLyricsInfo() {
        return this.lyricsInfo;
    }

    /* renamed from: t, reason: from getter */
    public final TrackFadeDto getMixFade() {
        return this.mixFade;
    }

    /* renamed from: u, reason: from getter */
    public final String getPlayerId() {
        return this.playerId;
    }

    /* renamed from: v, reason: from getter */
    public final Long getPreviewDurationMs() {
        return this.previewDurationMs;
    }

    /* renamed from: w, reason: from getter */
    public final String getPubDate() {
        return this.pubDate;
    }

    /* renamed from: x, reason: from getter */
    public final String getRawJson() {
        return this.rawJson;
    }

    /* renamed from: y, reason: from getter */
    public final String getRealId() {
        return this.realId;
    }

    /* renamed from: z, reason: from getter */
    public final Boolean getRememberPosition() {
        return this.rememberPosition;
    }
}
