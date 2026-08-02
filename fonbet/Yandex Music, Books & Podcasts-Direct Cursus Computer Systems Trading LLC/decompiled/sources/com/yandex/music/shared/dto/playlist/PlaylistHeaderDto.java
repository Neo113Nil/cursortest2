package com.yandex.music.shared.dto.playlist;

import com.connectsdk.device.DefaultConnectableDeviceStore;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import com.yandex.music.shared.dto.ActionButtonDto;
import com.yandex.music.shared.dto.UserDto;
import com.yandex.music.shared.dto.VibeButtonDto;
import com.yandex.music.shared.dto.trailer.TrailerDto;
import defpackage.f1d;
import defpackage.o8;
import defpackage.qc7;
import defpackage.su4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b;\b\u0086\b\u0018\u00002\u00020\u0001B¹\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\u0010\u0010'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010&\u0012\u0010\u0010)\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010(\u0018\u00010&\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b,\u0010-R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b1\u00100R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b2\u00100R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b3\u00100R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u00106R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b7\u00106R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b8\u00100R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b9\u00100R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b:\u00100R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\b<\u0010=R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\b>\u0010=R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b?\u00106R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\b@\u00106R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010A\u001a\u0004\bB\u0010CR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010D\u001a\u0004\bE\u0010FR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010G\u001a\u0004\bH\u0010IR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010J\u001a\u0004\bK\u0010LR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010M\u001a\u0004\bN\u0010OR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001c\u0010.\u001a\u0004\bP\u00100R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010.\u001a\u0004\bQ\u00100R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001e\u0010.\u001a\u0004\bR\u00100R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00148\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001f\u0010D\u001a\u0004\bS\u0010FR\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b!\u0010T\u001a\u0004\bU\u0010VR\u001c\u0010#\u001a\u0004\u0018\u00010\"8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b#\u0010W\u001a\u0004\bX\u0010YR\u001c\u0010%\u001a\u0004\u0018\u00010$8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b%\u0010Z\u001a\u0004\b[\u0010\\R$\u0010'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010]\u001a\u0004\b^\u0010_R$\u0010)\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010(\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010]\u001a\u0004\b`\u0010_R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b*\u0010.\u001a\u0004\ba\u00100R\u001c\u0010+\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b+\u00104\u001a\u0004\bb\u00106¨\u0006c"}, d2 = {"Lcom/yandex/music/shared/dto/playlist/PlaylistHeaderDto;", "Lo8;", "", "uid", "title", "playlistUuid", "kind", "", "revision", "snapshot", "visibility", DeviceService.KEY_DESC, "descriptionFormatted", "Lqc7;", DefaultConnectableDeviceStore.KEY_CREATED, "modified", "trackCount", "likesCount", "Lcom/yandex/music/shared/dto/UserDto;", "owner", "", "available", "Lcom/yandex/music/shared/dto/playlist/CoverInfoDto;", "cover", "Lcom/yandex/music/shared/dto/playlist/AbsenseFlagDto;", "absense", "Lcom/yandex/music/shared/dto/playlist/MadeForDto;", "madeFor", "autoPlaylistType", "backgroundImageUrl", "backgroundVideoUrl", "childContent", "Lcom/yandex/music/shared/dto/ActionButtonDto;", "actionInfo", "Lcom/yandex/music/shared/dto/VibeButtonDto;", "vibeButtonInfo", "Lcom/yandex/music/shared/dto/trailer/TrailerDto;", "trailer", "", "similarPlaylist", "Lcom/yandex/music/shared/dto/playlist/WrappedTrackDto;", "tracks", "artistPlaylistType", "personalColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqc7;Lqc7;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/yandex/music/shared/dto/UserDto;Ljava/lang/Boolean;Lcom/yandex/music/shared/dto/playlist/CoverInfoDto;Lcom/yandex/music/shared/dto/playlist/AbsenseFlagDto;Lcom/yandex/music/shared/dto/playlist/MadeForDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/yandex/music/shared/dto/ActionButtonDto;Lcom/yandex/music/shared/dto/VibeButtonDto;Lcom/yandex/music/shared/dto/trailer/TrailerDto;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)V", "Ljava/lang/String;", "getUid", "()Ljava/lang/String;", "getTitle", "E", "a", "Ljava/lang/Integer;", "v", "()Ljava/lang/Integer;", "D", "getVisibility", "getDescription", "H", "Lqc7;", "F", "()Lqc7;", "B", "u", "t", "Lcom/yandex/music/shared/dto/UserDto;", "s", "()Lcom/yandex/music/shared/dto/UserDto;", "Ljava/lang/Boolean;", "r", "()Ljava/lang/Boolean;", "Lcom/yandex/music/shared/dto/playlist/CoverInfoDto;", "I", "()Lcom/yandex/music/shared/dto/playlist/CoverInfoDto;", "Lcom/yandex/music/shared/dto/playlist/AbsenseFlagDto;", "c", "()Lcom/yandex/music/shared/dto/playlist/AbsenseFlagDto;", "Lcom/yandex/music/shared/dto/playlist/MadeForDto;", "C", "()Lcom/yandex/music/shared/dto/playlist/MadeForDto;", "y", "x", "z", "w", "Lcom/yandex/music/shared/dto/ActionButtonDto;", "d", "()Lcom/yandex/music/shared/dto/ActionButtonDto;", "Lcom/yandex/music/shared/dto/VibeButtonDto;", "g", "()Lcom/yandex/music/shared/dto/VibeButtonDto;", "Lcom/yandex/music/shared/dto/trailer/TrailerDto;", "G", "()Lcom/yandex/music/shared/dto/trailer/TrailerDto;", "Ljava/util/List;", "e", "()Ljava/util/List;", "f", "J", "A", "shared-model-parsers"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final /* data */ class PlaylistHeaderDto implements o8 {

    @SerializedName("playlistAbsense")
    private final AbsenseFlagDto absense;

    @SerializedName("actionButton")
    private final ActionButtonDto actionInfo;

    @SerializedName("artistPlaylistType")
    private final String artistPlaylistType;

    @SerializedName("generatedPlaylistType")
    private final String autoPlaylistType;

    @SerializedName("available")
    private final Boolean available;

    @SerializedName("backgroundImageUrl")
    private final String backgroundImageUrl;

    @SerializedName("backgroundVideoUrl")
    private final String backgroundVideoUrl;

    @SerializedName("childContent")
    private final Boolean childContent;

    @SerializedName("cover")
    private final CoverInfoDto cover;

    @SerializedName(DefaultConnectableDeviceStore.KEY_CREATED)
    private final qc7 created;

    @SerializedName(DeviceService.KEY_DESC)
    private final String description;

    @SerializedName("descriptionFormatted")
    private final String descriptionFormatted;

    @SerializedName("kind")
    private final String kind;

    @SerializedName("likesCount")
    private final Integer likesCount;

    @SerializedName("madeFor")
    private final MadeForDto madeFor;

    @SerializedName("modified")
    private final qc7 modified;

    @SerializedName("owner")
    private final UserDto owner;

    @SerializedName("personalColor")
    private final Integer personalColor;

    @SerializedName("playlistUuid")
    private final String playlistUuid;

    @SerializedName("revision")
    private final Integer revision;

    @SerializedName("similarPlaylists")
    private final List<PlaylistHeaderDto> similarPlaylist;

    @SerializedName("snapshot")
    private final Integer snapshot;

    @SerializedName("title")
    private final String title;

    @SerializedName("trackCount")
    private final Integer trackCount;

    @SerializedName("tracks")
    private final List<WrappedTrackDto> tracks;

    @SerializedName("trailer")
    private final TrailerDto trailer;

    @SerializedName("uid")
    private final String uid;

    @SerializedName("customWave")
    private final VibeButtonDto vibeButtonInfo;

    @SerializedName("visibility")
    private final String visibility;

    public PlaylistHeaderDto(String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, String str6, String str7, qc7 qc7Var, qc7 qc7Var2, Integer num3, Integer num4, UserDto userDto, Boolean bool, CoverInfoDto coverInfoDto, AbsenseFlagDto absenseFlagDto, MadeForDto madeForDto, String str8, String str9, String str10, Boolean bool2, ActionButtonDto actionButtonDto, VibeButtonDto vibeButtonDto, TrailerDto trailerDto, List<PlaylistHeaderDto> list, List<WrappedTrackDto> list2, String str11, Integer num5) {
        this.uid = str;
        this.title = str2;
        this.playlistUuid = str3;
        this.kind = str4;
        this.revision = num;
        this.snapshot = num2;
        this.visibility = str5;
        this.description = str6;
        this.descriptionFormatted = str7;
        this.created = qc7Var;
        this.modified = qc7Var2;
        this.trackCount = num3;
        this.likesCount = num4;
        this.owner = userDto;
        this.available = bool;
        this.cover = coverInfoDto;
        this.absense = absenseFlagDto;
        this.madeFor = madeForDto;
        this.autoPlaylistType = str8;
        this.backgroundImageUrl = str9;
        this.backgroundVideoUrl = str10;
        this.childContent = bool2;
        this.actionInfo = actionButtonDto;
        this.vibeButtonInfo = vibeButtonDto;
        this.trailer = trailerDto;
        this.similarPlaylist = list;
        this.tracks = list2;
        this.artistPlaylistType = str11;
        this.personalColor = num5;
    }

    public static PlaylistHeaderDto b(String str, PlaylistHeaderDto playlistHeaderDto) {
        String str2 = playlistHeaderDto.uid;
        String str3 = playlistHeaderDto.playlistUuid;
        String str4 = playlistHeaderDto.kind;
        Integer num = playlistHeaderDto.revision;
        Integer num2 = playlistHeaderDto.snapshot;
        String str5 = playlistHeaderDto.visibility;
        String str6 = playlistHeaderDto.description;
        String str7 = playlistHeaderDto.descriptionFormatted;
        qc7 qc7Var = playlistHeaderDto.created;
        qc7 qc7Var2 = playlistHeaderDto.modified;
        Integer num3 = playlistHeaderDto.trackCount;
        Integer num4 = playlistHeaderDto.likesCount;
        UserDto userDto = playlistHeaderDto.owner;
        Boolean bool = playlistHeaderDto.available;
        CoverInfoDto coverInfoDto = playlistHeaderDto.cover;
        AbsenseFlagDto absenseFlagDto = playlistHeaderDto.absense;
        MadeForDto madeForDto = playlistHeaderDto.madeFor;
        String str8 = playlistHeaderDto.autoPlaylistType;
        String str9 = playlistHeaderDto.backgroundImageUrl;
        String str10 = playlistHeaderDto.backgroundVideoUrl;
        Boolean bool2 = playlistHeaderDto.childContent;
        ActionButtonDto actionButtonDto = playlistHeaderDto.actionInfo;
        VibeButtonDto vibeButtonDto = playlistHeaderDto.vibeButtonInfo;
        TrailerDto trailerDto = playlistHeaderDto.trailer;
        List<PlaylistHeaderDto> list = playlistHeaderDto.similarPlaylist;
        List<WrappedTrackDto> list2 = playlistHeaderDto.tracks;
        String str11 = playlistHeaderDto.artistPlaylistType;
        Integer num5 = playlistHeaderDto.personalColor;
        playlistHeaderDto.getClass();
        return new PlaylistHeaderDto(str2, str, str3, str4, num, num2, str5, str6, str7, qc7Var, qc7Var2, num3, num4, userDto, bool, coverInfoDto, absenseFlagDto, madeForDto, str8, str9, str10, bool2, actionButtonDto, vibeButtonDto, trailerDto, list, list2, str11, num5);
    }

    @Override // defpackage.o8
    /* renamed from: A, reason: from getter */
    public final Integer getPersonalColor() {
        return this.personalColor;
    }

    @Override // defpackage.o8
    /* renamed from: B, reason: from getter */
    public final qc7 getModified() {
        return this.modified;
    }

    @Override // defpackage.o8
    /* renamed from: C, reason: from getter */
    public final MadeForDto getMadeFor() {
        return this.madeFor;
    }

    @Override // defpackage.o8
    /* renamed from: D, reason: from getter */
    public final Integer getSnapshot() {
        return this.snapshot;
    }

    @Override // defpackage.o8
    /* renamed from: E, reason: from getter */
    public final String getPlaylistUuid() {
        return this.playlistUuid;
    }

    @Override // defpackage.o8
    /* renamed from: F, reason: from getter */
    public final qc7 getCreated() {
        return this.created;
    }

    @Override // defpackage.o8
    /* renamed from: G, reason: from getter */
    public final TrailerDto getTrailer() {
        return this.trailer;
    }

    @Override // defpackage.o8
    /* renamed from: H, reason: from getter */
    public final String getDescriptionFormatted() {
        return this.descriptionFormatted;
    }

    @Override // defpackage.o8
    /* renamed from: I, reason: from getter */
    public final CoverInfoDto getCover() {
        return this.cover;
    }

    @Override // defpackage.o8
    /* renamed from: J, reason: from getter */
    public final String getArtistPlaylistType() {
        return this.artistPlaylistType;
    }

    @Override // defpackage.o8
    /* renamed from: a, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    /* renamed from: c, reason: from getter */
    public final AbsenseFlagDto getAbsense() {
        return this.absense;
    }

    /* renamed from: d, reason: from getter */
    public final ActionButtonDto getActionInfo() {
        return this.actionInfo;
    }

    /* renamed from: e, reason: from getter */
    public final List getSimilarPlaylist() {
        return this.similarPlaylist;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaylistHeaderDto)) {
            return false;
        }
        PlaylistHeaderDto playlistHeaderDto = (PlaylistHeaderDto) obj;
        return Intrinsics.d(this.uid, playlistHeaderDto.uid) && Intrinsics.d(this.title, playlistHeaderDto.title) && Intrinsics.d(this.playlistUuid, playlistHeaderDto.playlistUuid) && Intrinsics.d(this.kind, playlistHeaderDto.kind) && Intrinsics.d(this.revision, playlistHeaderDto.revision) && Intrinsics.d(this.snapshot, playlistHeaderDto.snapshot) && Intrinsics.d(this.visibility, playlistHeaderDto.visibility) && Intrinsics.d(this.description, playlistHeaderDto.description) && Intrinsics.d(this.descriptionFormatted, playlistHeaderDto.descriptionFormatted) && Intrinsics.d(this.created, playlistHeaderDto.created) && Intrinsics.d(this.modified, playlistHeaderDto.modified) && Intrinsics.d(this.trackCount, playlistHeaderDto.trackCount) && Intrinsics.d(this.likesCount, playlistHeaderDto.likesCount) && Intrinsics.d(this.owner, playlistHeaderDto.owner) && Intrinsics.d(this.available, playlistHeaderDto.available) && Intrinsics.d(this.cover, playlistHeaderDto.cover) && Intrinsics.d(this.absense, playlistHeaderDto.absense) && Intrinsics.d(this.madeFor, playlistHeaderDto.madeFor) && Intrinsics.d(this.autoPlaylistType, playlistHeaderDto.autoPlaylistType) && Intrinsics.d(this.backgroundImageUrl, playlistHeaderDto.backgroundImageUrl) && Intrinsics.d(this.backgroundVideoUrl, playlistHeaderDto.backgroundVideoUrl) && Intrinsics.d(this.childContent, playlistHeaderDto.childContent) && Intrinsics.d(this.actionInfo, playlistHeaderDto.actionInfo) && Intrinsics.d(this.vibeButtonInfo, playlistHeaderDto.vibeButtonInfo) && Intrinsics.d(this.trailer, playlistHeaderDto.trailer) && Intrinsics.d(this.similarPlaylist, playlistHeaderDto.similarPlaylist) && Intrinsics.d(this.tracks, playlistHeaderDto.tracks) && Intrinsics.d(this.artistPlaylistType, playlistHeaderDto.artistPlaylistType) && Intrinsics.d(this.personalColor, playlistHeaderDto.personalColor);
    }

    /* renamed from: f, reason: from getter */
    public final List getTracks() {
        return this.tracks;
    }

    /* renamed from: g, reason: from getter */
    public final VibeButtonDto getVibeButtonInfo() {
        return this.vibeButtonInfo;
    }

    @Override // defpackage.o8
    public final String getDescription() {
        return this.description;
    }

    @Override // defpackage.o8
    public final String getTitle() {
        return this.title;
    }

    @Override // defpackage.o8
    public final String getUid() {
        return this.uid;
    }

    @Override // defpackage.o8
    public final String getVisibility() {
        return this.visibility;
    }

    public final int hashCode() {
        String str = this.uid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.playlistUuid;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.kind;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.revision;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.snapshot;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.visibility;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.description;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.descriptionFormatted;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        qc7 qc7Var = this.created;
        int hashCode10 = (hashCode9 + (qc7Var == null ? 0 : qc7Var.hashCode())) * 31;
        qc7 qc7Var2 = this.modified;
        int hashCode11 = (hashCode10 + (qc7Var2 == null ? 0 : qc7Var2.hashCode())) * 31;
        Integer num3 = this.trackCount;
        int hashCode12 = (hashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.likesCount;
        int hashCode13 = (hashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        UserDto userDto = this.owner;
        int hashCode14 = (hashCode13 + (userDto == null ? 0 : userDto.hashCode())) * 31;
        Boolean bool = this.available;
        int hashCode15 = (hashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        CoverInfoDto coverInfoDto = this.cover;
        int hashCode16 = (hashCode15 + (coverInfoDto == null ? 0 : coverInfoDto.hashCode())) * 31;
        AbsenseFlagDto absenseFlagDto = this.absense;
        int hashCode17 = (hashCode16 + (absenseFlagDto == null ? 0 : absenseFlagDto.hashCode())) * 31;
        MadeForDto madeForDto = this.madeFor;
        int hashCode18 = (hashCode17 + (madeForDto == null ? 0 : madeForDto.hashCode())) * 31;
        String str8 = this.autoPlaylistType;
        int hashCode19 = (hashCode18 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.backgroundImageUrl;
        int hashCode20 = (hashCode19 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.backgroundVideoUrl;
        int hashCode21 = (hashCode20 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool2 = this.childContent;
        int hashCode22 = (hashCode21 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        ActionButtonDto actionButtonDto = this.actionInfo;
        int hashCode23 = (hashCode22 + (actionButtonDto == null ? 0 : actionButtonDto.hashCode())) * 31;
        VibeButtonDto vibeButtonDto = this.vibeButtonInfo;
        int hashCode24 = (hashCode23 + (vibeButtonDto == null ? 0 : vibeButtonDto.hashCode())) * 31;
        TrailerDto trailerDto = this.trailer;
        int hashCode25 = (hashCode24 + (trailerDto == null ? 0 : trailerDto.hashCode())) * 31;
        List<PlaylistHeaderDto> list = this.similarPlaylist;
        int hashCode26 = (hashCode25 + (list == null ? 0 : list.hashCode())) * 31;
        List<WrappedTrackDto> list2 = this.tracks;
        int hashCode27 = (hashCode26 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str11 = this.artistPlaylistType;
        int hashCode28 = (hashCode27 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num5 = this.personalColor;
        return hashCode28 + (num5 != null ? num5.hashCode() : 0);
    }

    @Override // defpackage.o8
    /* renamed from: r, reason: from getter */
    public final Boolean getAvailable() {
        return this.available;
    }

    @Override // defpackage.o8
    /* renamed from: s, reason: from getter */
    public final UserDto getOwner() {
        return this.owner;
    }

    @Override // defpackage.o8
    /* renamed from: t, reason: from getter */
    public final Integer getLikesCount() {
        return this.likesCount;
    }

    public final String toString() {
        String str = this.uid;
        String str2 = this.title;
        String str3 = this.playlistUuid;
        String str4 = this.kind;
        Integer num = this.revision;
        Integer num2 = this.snapshot;
        String str5 = this.visibility;
        String str6 = this.description;
        String str7 = this.descriptionFormatted;
        qc7 qc7Var = this.created;
        qc7 qc7Var2 = this.modified;
        Integer num3 = this.trackCount;
        Integer num4 = this.likesCount;
        UserDto userDto = this.owner;
        Boolean bool = this.available;
        CoverInfoDto coverInfoDto = this.cover;
        AbsenseFlagDto absenseFlagDto = this.absense;
        MadeForDto madeForDto = this.madeFor;
        String str8 = this.autoPlaylistType;
        String str9 = this.backgroundImageUrl;
        String str10 = this.backgroundVideoUrl;
        Boolean bool2 = this.childContent;
        ActionButtonDto actionButtonDto = this.actionInfo;
        VibeButtonDto vibeButtonDto = this.vibeButtonInfo;
        TrailerDto trailerDto = this.trailer;
        List<PlaylistHeaderDto> list = this.similarPlaylist;
        List<WrappedTrackDto> list2 = this.tracks;
        String str11 = this.artistPlaylistType;
        Integer num5 = this.personalColor;
        StringBuilder m = f1d.m("PlaylistHeaderDto(uid=", str, ", title=", str2, ", playlistUuid=");
        su4.v(m, str3, ", kind=", str4, ", revision=");
        m.append(num);
        m.append(", snapshot=");
        m.append(num2);
        m.append(", visibility=");
        su4.v(m, str5, ", description=", str6, ", descriptionFormatted=");
        m.append(str7);
        m.append(", created=");
        m.append(qc7Var);
        m.append(", modified=");
        m.append(qc7Var2);
        m.append(", trackCount=");
        m.append(num3);
        m.append(", likesCount=");
        m.append(num4);
        m.append(", owner=");
        m.append(userDto);
        m.append(", available=");
        m.append(bool);
        m.append(", cover=");
        m.append(coverInfoDto);
        m.append(", absense=");
        m.append(absenseFlagDto);
        m.append(", madeFor=");
        m.append(madeForDto);
        m.append(", autoPlaylistType=");
        su4.v(m, str8, ", backgroundImageUrl=", str9, ", backgroundVideoUrl=");
        m.append(str10);
        m.append(", childContent=");
        m.append(bool2);
        m.append(", actionInfo=");
        m.append(actionButtonDto);
        m.append(", vibeButtonInfo=");
        m.append(vibeButtonDto);
        m.append(", trailer=");
        m.append(trailerDto);
        m.append(", similarPlaylist=");
        m.append(list);
        m.append(", tracks=");
        m.append(list2);
        m.append(", artistPlaylistType=");
        m.append(str11);
        m.append(", personalColor=");
        m.append(num5);
        m.append(")");
        return m.toString();
    }

    @Override // defpackage.o8
    /* renamed from: u, reason: from getter */
    public final Integer getTrackCount() {
        return this.trackCount;
    }

    @Override // defpackage.o8
    /* renamed from: v, reason: from getter */
    public final Integer getRevision() {
        return this.revision;
    }

    @Override // defpackage.o8
    /* renamed from: w, reason: from getter */
    public final Boolean getChildContent() {
        return this.childContent;
    }

    @Override // defpackage.o8
    /* renamed from: x, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    @Override // defpackage.o8
    /* renamed from: y, reason: from getter */
    public final String getAutoPlaylistType() {
        return this.autoPlaylistType;
    }

    @Override // defpackage.o8
    /* renamed from: z, reason: from getter */
    public final String getBackgroundVideoUrl() {
        return this.backgroundVideoUrl;
    }
}
