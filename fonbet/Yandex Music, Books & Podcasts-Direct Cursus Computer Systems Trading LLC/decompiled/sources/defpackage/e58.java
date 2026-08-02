package defpackage;

import androidx.work.impl.WorkDatabase_Impl;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.device.DefaultConnectableDeviceStore;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.airplay.PListParser;
import com.yandex.auth.LegacyAccountType;
import com.yandex.music.databases.main.MainDatabase_Impl;
import com.yandex.music.databases.user.UserDatabase_Impl;
import com.yandex.music.shared.disclaimers.db.DisclaimerDatabase_Impl;
import com.yandex.music.shared.play.audio2.db.PlayAudioDatabase_Impl;
import com.yandex.passport.internal.database.PassportDatabase_Impl;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class e58 extends yeo {
    public final /* synthetic */ int d = 4;
    public final /* synthetic */ ueo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e58(PlayAudioDatabase_Impl playAudioDatabase_Impl) {
        super(29, "4a5dc0093ec1ff6a2328f6ca2e4ee09d", "773301d414fe19a48a08673a99ee784d");
        this.e = playAudioDatabase_Impl;
    }

    private final c7f k(xjo xjoVar) {
        xjoVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("album_id", new c2s(1, 1, "album_id", "TEXT", null, true));
        f2s f2sVar = new f2s("album_operation", linkedHashMap, v3w.i(linkedHashMap, "operation", new c2s(0, 1, "operation", "INTEGER", null, false)), new LinkedHashSet());
        f2s J = pcg.J(xjoVar, "album_operation");
        if (!f2sVar.equals(J)) {
            return new c7f(false, v3w.d("album_operation(com.yandex.music.databases.main.operations.AlbumOperationDbRow).\n Expected:\n", f2sVar, "\n Found:\n", J), 1);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("artist_id", new c2s(1, 1, "artist_id", "TEXT", null, true));
        f2s f2sVar2 = new f2s("artist_operation", linkedHashMap2, v3w.i(linkedHashMap2, "operation", new c2s(0, 1, "operation", "INTEGER", null, false)), new LinkedHashSet());
        f2s J2 = pcg.J(xjoVar, "artist_operation");
        if (!f2sVar2.equals(J2)) {
            return new c7f(false, v3w.d("artist_operation(com.yandex.music.databases.main.operations.ArtistOperationDbRow).\n Expected:\n", f2sVar2, "\n Found:\n", J2), 1);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("playlist_id", new c2s(1, 1, "playlist_id", "TEXT", null, true));
        f2s f2sVar3 = new f2s("playlist_operation", linkedHashMap3, v3w.i(linkedHashMap3, "operation", new c2s(0, 1, "operation", "INTEGER", null, false)), new LinkedHashSet());
        f2s J3 = pcg.J(xjoVar, "playlist_operation");
        if (!f2sVar3.equals(J3)) {
            return new c7f(false, v3w.d("playlist_operation(com.yandex.music.databases.main.operations.PlaylistOperationDbRow).\n Expected:\n", f2sVar3, "\n Found:\n", J3), 1);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("video_clip_id", new c2s(1, 1, "video_clip_id", "TEXT", null, true));
        linkedHashMap4.put("operation", new c2s(0, 1, "operation", "INTEGER", null, true));
        f2s f2sVar4 = new f2s("video_clip_operation", linkedHashMap4, v3w.i(linkedHashMap4, "timestamp", new c2s(0, 1, "timestamp", "INTEGER", null, true)), new LinkedHashSet());
        f2s J4 = pcg.J(xjoVar, "video_clip_operation");
        if (!f2sVar4.equals(J4)) {
            return new c7f(false, v3w.d("video_clip_operation(com.yandex.music.databases.main.operations.VideoClipOperationDbRow).\n Expected:\n", f2sVar4, "\n Found:\n", J4), 1);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("_id", new c2s(1, 1, "_id", "INTEGER", null, false));
        linkedHashMap5.put("playlist_id", new c2s(0, 1, "playlist_id", "INTEGER", null, false));
        linkedHashMap5.put("operation", new c2s(0, 1, "operation", "INTEGER", null, false));
        linkedHashMap5.put("position", new c2s(0, 1, "position", "INTEGER", null, false));
        linkedHashMap5.put("track_id", new c2s(0, 1, "track_id", "TEXT", null, false));
        linkedHashMap5.put("album_id", new c2s(0, 1, "album_id", "TEXT", null, false));
        f2s f2sVar5 = new f2s("track_operation", linkedHashMap5, v3w.i(linkedHashMap5, "timestamp", new c2s(0, 1, "timestamp", "INTEGER", null, false)), new LinkedHashSet());
        f2s J5 = pcg.J(xjoVar, "track_operation");
        if (!f2sVar5.equals(J5)) {
            return new c7f(false, v3w.d("track_operation(com.yandex.music.databases.main.operations.TrackOperationDbRow).\n Expected:\n", f2sVar5, "\n Found:\n", J5), 1);
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("original_id", new c2s(1, 1, "original_id", "TEXT", null, true));
        linkedHashMap6.put("name", new c2s(0, 1, "name", "TEXT", null, true));
        linkedHashMap6.put("name_surrogate", new c2s(0, 1, "name_surrogate", "TEXT", null, true));
        linkedHashMap6.put("liked", new c2s(0, 1, "liked", "INTEGER", null, true));
        linkedHashMap6.put("disliked", new c2s(0, 1, "disliked", "INTEGER", null, true));
        linkedHashMap6.put("timestamp", new c2s(0, 1, "timestamp", "TEXT", null, true));
        linkedHashMap6.put("various", new c2s(0, 1, "various", "INTEGER", null, true));
        linkedHashMap6.put("cover_uri", new c2s(0, 1, "cover_uri", "TEXT", null, false));
        linkedHashMap6.put("albums_stale", new c2s(0, 1, "albums_stale", "INTEGER", null, true));
        linkedHashMap6.put("tracks_stale", new c2s(0, 1, "tracks_stale", "INTEGER", null, true));
        linkedHashMap6.put("artist_for_kids", new c2s(0, 1, "artist_for_kids", "INTEGER", null, true));
        linkedHashMap6.put("artist_disclaimer", new c2s(0, 1, "artist_disclaimer", "TEXT", null, false));
        linkedHashMap6.put("available", new c2s(0, 1, "available", "INTEGER", "1", true));
        linkedHashMap6.put("cover_type", new c2s(0, 1, "cover_type", "TEXT", null, false));
        LinkedHashSet i = v3w.i(linkedHashMap6, "cutout_cover_uri", new c2s(0, 1, "cutout_cover_uri", "TEXT", null, false));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new e2s("index_artist_name_surrogate", false, t75.c("name_surrogate"), t75.c("ASC")));
        f2s f2sVar6 = new f2s("artist", linkedHashMap6, i, linkedHashSet);
        f2s J6 = pcg.J(xjoVar, "artist");
        if (!f2sVar6.equals(J6)) {
            return new c7f(false, v3w.d("artist(com.yandex.music.databases.main.entities.artist.ArtistDbRow).\n Expected:\n", f2sVar6, "\n Found:\n", J6), 1);
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("original_id", new c2s(1, 1, "original_id", "TEXT", null, true));
        linkedHashMap7.put("name", new c2s(0, 1, "name", "TEXT", null, true));
        linkedHashMap7.put("name_surrogate", new c2s(0, 1, "name_surrogate", "TEXT", null, true));
        linkedHashMap7.put("liked", new c2s(0, 1, "liked", "INTEGER", null, true));
        linkedHashMap7.put("likes_count", new c2s(0, 1, "likes_count", "INTEGER", null, true));
        linkedHashMap7.put("timestamp", new c2s(0, 1, "timestamp", "TEXT", null, true));
        linkedHashMap7.put("cover_uri", new c2s(0, 1, "cover_uri", "TEXT", null, false));
        linkedHashMap7.put("original_release_year", new c2s(0, 1, "original_release_year", "TEXT", null, false));
        linkedHashMap7.put("album_type", new c2s(0, 1, "album_type", "TEXT", null, true));
        linkedHashMap7.put("album_meta_type", new c2s(0, 1, "album_meta_type", "TEXT", null, false));
        linkedHashMap7.put("short_description", new c2s(0, 1, "short_description", "TEXT", null, false));
        linkedHashMap7.put(DeviceService.KEY_DESC, new c2s(0, 1, DeviceService.KEY_DESC, "TEXT", null, false));
        linkedHashMap7.put("for_premium", new c2s(0, 1, "for_premium", "INTEGER", null, true));
        linkedHashMap7.put("for_options", new c2s(0, 1, "for_options", "TEXT", null, false));
        linkedHashMap7.put("tracks_stale", new c2s(0, 1, "tracks_stale", "INTEGER", null, true));
        linkedHashMap7.put("warning_content", new c2s(0, 1, "warning_content", "TEXT", null, true));
        linkedHashMap7.put("genre_code", new c2s(0, 1, "genre_code", "TEXT", null, false));
        linkedHashMap7.put("album_for_kids", new c2s(0, 1, "album_for_kids", "INTEGER", null, true));
        linkedHashMap7.put("bg_image_url", new c2s(0, 1, "bg_image_url", "TEXT", null, false));
        linkedHashMap7.put("bg_video_url", new c2s(0, 1, "bg_video_url", "TEXT", null, false));
        linkedHashMap7.put("sort_order", new c2s(0, 1, "sort_order", "TEXT", null, false));
        linkedHashMap7.put("duration_sec", new c2s(0, 1, "duration_sec", "INTEGER", null, false));
        linkedHashMap7.put("album_disclaimer", new c2s(0, 1, "album_disclaimer", "TEXT", null, true));
        linkedHashMap7.put("available", new c2s(0, 1, "available", "INTEGER", "1", true));
        LinkedHashSet i2 = v3w.i(linkedHashMap7, "version", new c2s(0, 1, "version", "TEXT", null, false));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new e2s("index_album_name_surrogate", false, t75.c("name_surrogate"), t75.c("ASC")));
        f2s f2sVar7 = new f2s("album", linkedHashMap7, i2, linkedHashSet2);
        f2s J7 = pcg.J(xjoVar, "album");
        if (!f2sVar7.equals(J7)) {
            return new c7f(false, v3w.d("album(com.yandex.music.databases.main.entities.album.AlbumDbRow).\n Expected:\n", f2sVar7, "\n Found:\n", J7), 1);
        }
        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
        linkedHashMap8.put("_id", new c2s(1, 1, "_id", "INTEGER", null, true));
        linkedHashMap8.put("uuid", new c2s(0, 1, "uuid", "TEXT", null, false));
        linkedHashMap8.put("original_id", new c2s(0, 1, "original_id", "TEXT", null, true));
        linkedHashMap8.put("uid", new c2s(0, 1, "uid", "TEXT", null, true));
        linkedHashMap8.put(LegacyAccountType.STRING_LOGIN, new c2s(0, 1, LegacyAccountType.STRING_LOGIN, "TEXT", null, true));
        linkedHashMap8.put("user_full_name", new c2s(0, 1, "user_full_name", "TEXT", null, false));
        linkedHashMap8.put("name", new c2s(0, 1, "name", "TEXT", null, true));
        linkedHashMap8.put("name_surrogate", new c2s(0, 1, "name_surrogate", "TEXT", null, true));
        linkedHashMap8.put(DeviceService.KEY_DESC, new c2s(0, 1, DeviceService.KEY_DESC, "TEXT", null, false));
        linkedHashMap8.put("revision", new c2s(0, 1, "revision", "INTEGER", null, false));
        linkedHashMap8.put("snapshot", new c2s(0, 1, "snapshot", "INTEGER", null, false));
        linkedHashMap8.put(DefaultConnectableDeviceStore.KEY_CREATED, new c2s(0, 1, DefaultConnectableDeviceStore.KEY_CREATED, "TEXT", null, true));
        linkedHashMap8.put("visibility", new c2s(0, 1, "visibility", "TEXT", null, true));
        linkedHashMap8.put("sync", new c2s(0, 1, "sync", "INTEGER", null, true));
        linkedHashMap8.put("cover_info", new c2s(0, 1, "cover_info", "TEXT", null, false));
        linkedHashMap8.put("position", new c2s(0, 1, "position", "INTEGER", null, false));
        linkedHashMap8.put("tracks", new c2s(0, 1, "tracks", "INTEGER", null, false));
        linkedHashMap8.put("liked", new c2s(0, 1, "liked", "INTEGER", null, true));
        linkedHashMap8.put("liked_timestamp", new c2s(0, 1, "liked_timestamp", "TEXT", null, false));
        linkedHashMap8.put("likes_count", new c2s(0, 1, "likes_count", "INTEGER", null, false));
        linkedHashMap8.put("auto_generated_type", new c2s(0, 1, "auto_generated_type", "TEXT", null, false));
        linkedHashMap8.put("modified", new c2s(0, 1, "modified", "TEXT", null, false));
        linkedHashMap8.put("made_for_genitive", new c2s(0, 1, "made_for_genitive", "TEXT", null, false));
        linkedHashMap8.put("target_uid", new c2s(0, 1, "target_uid", "TEXT", null, false));
        linkedHashMap8.put("target_login", new c2s(0, 1, "target_login", "TEXT", null, false));
        linkedHashMap8.put("playlist_for_kids", new c2s(0, 1, "playlist_for_kids", "INTEGER", null, true));
        linkedHashMap8.put("bg_image_url", new c2s(0, 1, "bg_image_url", "TEXT", null, false));
        LinkedHashSet i3 = v3w.i(linkedHashMap8, "bg_video_url", new c2s(0, 1, "bg_video_url", "TEXT", null, false));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        linkedHashSet3.add(new e2s("index_playlist_original_id_uid", true, u75.h("original_id", "uid"), u75.h("ASC", "ASC")));
        f2s f2sVar8 = new f2s("playlist", linkedHashMap8, i3, linkedHashSet3);
        f2s J8 = pcg.J(xjoVar, "playlist");
        if (!f2sVar8.equals(J8)) {
            return new c7f(false, v3w.d("playlist(com.yandex.music.databases.main.entities.playlist.PlaylistDbRow).\n Expected:\n", f2sVar8, "\n Found:\n", J8), 1);
        }
        LinkedHashMap linkedHashMap9 = new LinkedHashMap();
        linkedHashMap9.put("original_id", new c2s(1, 1, "original_id", "TEXT", null, true));
        linkedHashMap9.put("real_id", new c2s(0, 1, "real_id", "TEXT", null, false));
        linkedHashMap9.put("name", new c2s(0, 1, "name", "TEXT", null, true));
        linkedHashMap9.put("name_surrogate", new c2s(0, 1, "name_surrogate", "TEXT", null, true));
        linkedHashMap9.put("version", new c2s(0, 1, "version", "TEXT", null, false));
        linkedHashMap9.put("duration", new c2s(0, 1, "duration", "INTEGER", null, true));
        linkedHashMap9.put("warning_content", new c2s(0, 1, "warning_content", "TEXT", null, true));
        linkedHashMap9.put("explicit", new c2s(0, 1, "explicit", "INTEGER", null, true));
        linkedHashMap9.put("available", new c2s(0, 1, "available", "TEXT", null, true));
        linkedHashMap9.put("for_premium", new c2s(0, 1, "for_premium", "INTEGER", null, true));
        linkedHashMap9.put("for_options", new c2s(0, 1, "for_options", "TEXT", null, false));
        linkedHashMap9.put("lyrics_available", new c2s(0, 1, "lyrics_available", "INTEGER", null, true));
        linkedHashMap9.put("txt_lyrics_available", new c2s(0, 1, "txt_lyrics_available", "INTEGER", null, true));
        linkedHashMap9.put("sync_lyrics_available", new c2s(0, 1, "sync_lyrics_available", "INTEGER", null, true));
        linkedHashMap9.put("track_type", new c2s(0, 1, "track_type", "TEXT", null, true));
        linkedHashMap9.put("track_source", new c2s(0, 1, "track_source", "TEXT", null, false));
        linkedHashMap9.put("track_user", new c2s(0, 1, "track_user", "TEXT", null, false));
        linkedHashMap9.put("ugc_artist_name", new c2s(0, 1, "ugc_artist_name", "TEXT", null, false));
        linkedHashMap9.put("track_save_progress", new c2s(0, 1, "track_save_progress", "INTEGER", null, true));
        linkedHashMap9.put("cover_video_id", new c2s(0, 1, "cover_video_id", "TEXT", null, false));
        linkedHashMap9.put("cover_url", new c2s(0, 1, "cover_url", "TEXT", null, false));
        linkedHashMap9.put("color_palette", new c2s(0, 1, "color_palette", "TEXT", null, false));
        linkedHashMap9.put("short_description", new c2s(0, 1, "short_description", "TEXT", null, false));
        linkedHashMap9.put("release_date", new c2s(0, 1, "release_date", "TEXT", null, false));
        linkedHashMap9.put("integrated_loudness_db", new c2s(0, 1, "integrated_loudness_db", "REAL", null, false));
        linkedHashMap9.put("true_peak_db", new c2s(0, 1, "true_peak_db", "REAL", null, false));
        linkedHashMap9.put("track_for_kids", new c2s(0, 1, "track_for_kids", "INTEGER", null, true));
        linkedHashMap9.put("track_disclaimer", new c2s(0, 1, "track_disclaimer", "TEXT", null, false));
        linkedHashMap9.put("track_fade", new c2s(0, 1, "track_fade", "TEXT", null, false));
        linkedHashMap9.put("special_audio_resources", new c2s(0, 1, "special_audio_resources", "TEXT", null, false));
        LinkedHashSet i4 = v3w.i(linkedHashMap9, "track_video_clip_ids", new c2s(0, 1, "track_video_clip_ids", "TEXT", null, false));
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new e2s("index_track_name", false, t75.c("name"), t75.c("ASC")));
        linkedHashSet4.add(new e2s("index_track_name_surrogate", false, t75.c("name_surrogate"), t75.c("ASC")));
        f2s f2sVar9 = new f2s("track", linkedHashMap9, i4, linkedHashSet4);
        f2s J9 = pcg.J(xjoVar, "track");
        if (!f2sVar9.equals(J9)) {
            return new c7f(false, v3w.d("track(com.yandex.music.databases.main.entities.track.TrackDbRow).\n Expected:\n", f2sVar9, "\n Found:\n", J9), 1);
        }
        LinkedHashMap linkedHashMap10 = new LinkedHashMap();
        linkedHashMap10.put("album_id", new c2s(1, 1, "album_id", "TEXT", null, true));
        linkedHashMap10.put("album_name", new c2s(0, 1, "album_name", "TEXT", null, true));
        linkedHashMap10.put("track_id", new c2s(2, 1, "track_id", "TEXT", null, true));
        linkedHashMap10.put("vol", new c2s(0, 1, "vol", "INTEGER", null, true));
        LinkedHashSet i5 = v3w.i(linkedHashMap10, "position", new c2s(0, 1, "position", "INTEGER", null, true));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        linkedHashSet5.add(new e2s("index_album_track_track_id", false, t75.c("track_id"), t75.c("ASC")));
        f2s f2sVar10 = new f2s("album_track", linkedHashMap10, i5, linkedHashSet5);
        f2s J10 = pcg.J(xjoVar, "album_track");
        if (!f2sVar10.equals(J10)) {
            return new c7f(false, v3w.d("album_track(com.yandex.music.databases.main.entities.joins.AlbumTrackDbRow).\n Expected:\n", f2sVar10, "\n Found:\n", J10), 1);
        }
        LinkedHashMap linkedHashMap11 = new LinkedHashMap();
        linkedHashMap11.put("artist_id", new c2s(1, 1, "artist_id", "TEXT", null, true));
        linkedHashMap11.put("track_id", new c2s(2, 1, "track_id", "TEXT", null, true));
        linkedHashMap11.put("artist_name", new c2s(0, 1, "artist_name", "TEXT", null, true));
        linkedHashMap11.put("artist_track_various", new c2s(0, 1, "artist_track_various", "INTEGER", null, true));
        linkedHashMap11.put("artist_track_cover_uri", new c2s(0, 1, "artist_track_cover_uri", "TEXT", null, false));
        linkedHashMap11.put("artist_track_cutout_cover_uri", new c2s(0, 1, "artist_track_cutout_cover_uri", "TEXT", null, false));
        LinkedHashSet i6 = v3w.i(linkedHashMap11, "artist_cover_type", new c2s(0, 1, "artist_cover_type", "TEXT", null, false));
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        linkedHashSet6.add(new e2s("index_artist_track_track_id", false, t75.c("track_id"), t75.c("ASC")));
        f2s f2sVar11 = new f2s("artist_track", linkedHashMap11, i6, linkedHashSet6);
        f2s J11 = pcg.J(xjoVar, "artist_track");
        if (!f2sVar11.equals(J11)) {
            return new c7f(false, v3w.d("artist_track(com.yandex.music.databases.main.entities.joins.ArtistTrackDbRow).\n Expected:\n", f2sVar11, "\n Found:\n", J11), 1);
        }
        LinkedHashMap linkedHashMap12 = new LinkedHashMap();
        linkedHashMap12.put("album_id", new c2s(1, 1, "album_id", "TEXT", null, true));
        linkedHashMap12.put("artist_id", new c2s(2, 1, "artist_id", "TEXT", null, true));
        linkedHashMap12.put("artist_name", new c2s(0, 1, "artist_name", "TEXT", null, true));
        LinkedHashSet i7 = v3w.i(linkedHashMap12, "role", new c2s(0, 1, "role", "INTEGER", null, true));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        linkedHashSet7.add(new e2s("index_album_artist_artist_id", false, t75.c("artist_id"), t75.c("ASC")));
        f2s f2sVar12 = new f2s("album_artist", linkedHashMap12, i7, linkedHashSet7);
        f2s J12 = pcg.J(xjoVar, "album_artist");
        if (!f2sVar12.equals(J12)) {
            return new c7f(false, v3w.d("album_artist(com.yandex.music.databases.main.entities.joins.AlbumArtistDbRow).\n Expected:\n", f2sVar12, "\n Found:\n", J12), 1);
        }
        LinkedHashMap linkedHashMap13 = new LinkedHashMap();
        linkedHashMap13.put("_id", new c2s(1, 1, "_id", "INTEGER", null, true));
        linkedHashMap13.put("playlist_id", new c2s(0, 1, "playlist_id", "INTEGER", null, true));
        linkedHashMap13.put("track_id", new c2s(0, 1, "track_id", "TEXT", null, true));
        linkedHashMap13.put("album_id", new c2s(0, 1, "album_id", "TEXT", null, true));
        linkedHashMap13.put("timestamp", new c2s(0, 1, "timestamp", "TEXT", null, true));
        LinkedHashSet i8 = v3w.i(linkedHashMap13, "position", new c2s(0, 1, "position", "INTEGER", null, true));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        linkedHashSet8.add(new e2s("index_playlist_track_playlist_id_track_id_album_id", false, u75.h("playlist_id", "track_id", "album_id"), u75.h("ASC", "ASC", "ASC")));
        linkedHashSet8.add(new e2s("index_playlist_track_playlist_id", false, t75.c("playlist_id"), t75.c("ASC")));
        linkedHashSet8.add(new e2s("index_playlist_track_timestamp", false, t75.c("timestamp"), t75.c("ASC")));
        linkedHashSet8.add(new e2s("index_playlist_track_track_id", false, t75.c("track_id"), t75.c("ASC")));
        linkedHashSet8.add(new e2s("index_playlist_track_album_id", false, t75.c("album_id"), t75.c("ASC")));
        f2s f2sVar13 = new f2s("playlist_track", linkedHashMap13, i8, linkedHashSet8);
        f2s J13 = pcg.J(xjoVar, "playlist_track");
        if (!f2sVar13.equals(J13)) {
            return new c7f(false, v3w.d("playlist_track(com.yandex.music.databases.main.entities.joins.PlaylistTrackDbRow).\n Expected:\n", f2sVar13, "\n Found:\n", J13), 1);
        }
        LinkedHashMap linkedHashMap14 = new LinkedHashMap();
        linkedHashMap14.put("original_id", new c2s(1, 1, "original_id", "TEXT", null, true));
        linkedHashMap14.put("artists", new c2s(0, 1, "artists", "TEXT", null, true));
        linkedHashMap14.put("release_date", new c2s(0, 1, "release_date", "TEXT", null, true));
        linkedHashMap14.put("pre_save_date", new c2s(0, 1, "pre_save_date", "TEXT", null, true));
        linkedHashMap14.put("milliseconds_until_release", new c2s(0, 1, "milliseconds_until_release", "INTEGER", null, true));
        linkedHashMap14.put("cover_uri", new c2s(0, 1, "cover_uri", "TEXT", null, true));
        linkedHashMap14.put("title", new c2s(0, 1, "title", "TEXT", null, false));
        linkedHashMap14.put("type_raw", new c2s(0, 1, "type_raw", "TEXT", null, false));
        linkedHashMap14.put("warning_content", new c2s(0, 1, "warning_content", "TEXT", null, true));
        linkedHashMap14.put("is_pre_saved", new c2s(0, 1, "is_pre_saved", "INTEGER", null, true));
        linkedHashMap14.put("available", new c2s(0, 1, "available", "INTEGER", "1", true));
        f2s f2sVar14 = new f2s("pre_saves", linkedHashMap14, v3w.i(linkedHashMap14, "disclaimers", new c2s(0, 1, "disclaimers", "TEXT", null, false)), new LinkedHashSet());
        f2s J14 = pcg.J(xjoVar, "pre_saves");
        if (!f2sVar14.equals(J14)) {
            return new c7f(false, v3w.d("pre_saves(com.yandex.music.databases.main.entities.presaves.PreSavesDbRow).\n Expected:\n", f2sVar14, "\n Found:\n", J14), 1);
        }
        LinkedHashMap linkedHashMap15 = new LinkedHashMap();
        linkedHashMap15.put("pre_save_id", new c2s(1, 1, "pre_save_id", "TEXT", null, true));
        linkedHashMap15.put("artist_id", new c2s(0, 1, "artist_id", "TEXT", null, true));
        f2s f2sVar15 = new f2s("pre_save_operation", linkedHashMap15, v3w.i(linkedHashMap15, "type", new c2s(0, 1, "type", "TEXT", null, true)), new LinkedHashSet());
        f2s J15 = pcg.J(xjoVar, "pre_save_operation");
        if (!f2sVar15.equals(J15)) {
            return new c7f(false, v3w.d("pre_save_operation(com.yandex.music.databases.main.entities.presavesOperation.PreSaveOperationDbRow).\n Expected:\n", f2sVar15, "\n Found:\n", J15), 1);
        }
        LinkedHashMap linkedHashMap16 = new LinkedHashMap();
        linkedHashMap16.put("track_id", new c2s(1, 1, "track_id", "TEXT", null, true));
        f2s f2sVar16 = new f2s("tracks_cache_mirror", linkedHashMap16, v3w.i(linkedHashMap16, "is_permanent", new c2s(0, 1, "is_permanent", "INTEGER", null, true)), new LinkedHashSet());
        f2s J16 = pcg.J(xjoVar, "tracks_cache_mirror");
        if (!f2sVar16.equals(J16)) {
            return new c7f(false, v3w.d("tracks_cache_mirror(com.yandex.music.databases.main.entities.trackscachemirror.TracksCacheMirrorDbRow).\n Expected:\n", f2sVar16, "\n Found:\n", J16), 1);
        }
        LinkedHashMap linkedHashMap17 = new LinkedHashMap();
        linkedHashMap17.put("_id", new c2s(1, 1, "_id", "INTEGER", null, true));
        linkedHashMap17.put("track_id", new c2s(0, 1, "track_id", "TEXT", null, true));
        linkedHashMap17.put("album_id", new c2s(0, 1, "album_id", "TEXT", null, false));
        linkedHashMap17.put("timestamp", new c2s(0, 1, "timestamp", "TEXT", null, false));
        LinkedHashSet i9 = v3w.i(linkedHashMap17, "track_list_type", new c2s(0, 1, "track_list_type", "INTEGER", null, true));
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        linkedHashSet9.add(new e2s("index_phonotekaSyncSavedTrack_track_list_type_track_id_album_id", true, u75.h("track_list_type", "track_id", "album_id"), u75.h("ASC", "ASC", "ASC")));
        f2s f2sVar17 = new f2s("phonotekaSyncSavedTrack", linkedHashMap17, i9, linkedHashSet9);
        f2s J17 = pcg.J(xjoVar, "phonotekaSyncSavedTrack");
        if (!f2sVar17.equals(J17)) {
            return new c7f(false, v3w.d("phonotekaSyncSavedTrack(com.yandex.music.databases.main.entities.phonotekasync.PhonotekaSyncSavedTrackDbRow).\n Expected:\n", f2sVar17, "\n Found:\n", J17), 1);
        }
        LinkedHashMap linkedHashMap18 = new LinkedHashMap();
        linkedHashMap18.put("video_clip_id", new c2s(1, 1, "video_clip_id", "TEXT", null, true));
        linkedHashMap18.put("title", new c2s(0, 1, "title", "TEXT", null, true));
        linkedHashMap18.put("name_surrogate", new c2s(0, 1, "name_surrogate", "TEXT", null, true));
        linkedHashMap18.put("playerId", new c2s(0, 1, "playerId", "TEXT", null, true));
        linkedHashMap18.put("thumbnail", new c2s(0, 1, "thumbnail", "TEXT", null, true));
        linkedHashMap18.put("previewUrl", new c2s(0, 1, "previewUrl", "TEXT", null, false));
        linkedHashMap18.put("duration", new c2s(0, 1, "duration", "INTEGER", null, true));
        linkedHashMap18.put("disclaimers", new c2s(0, 1, "disclaimers", "TEXT", null, true));
        linkedHashMap18.put("like_status", new c2s(0, 1, "like_status", "INTEGER", null, false));
        f2s f2sVar18 = new f2s("video_clip", linkedHashMap18, v3w.i(linkedHashMap18, "timestamp", new c2s(0, 1, "timestamp", "TEXT", null, false)), new LinkedHashSet());
        f2s J18 = pcg.J(xjoVar, "video_clip");
        if (!f2sVar18.equals(J18)) {
            return new c7f(false, v3w.d("video_clip(com.yandex.music.databases.main.entities.videoclip.VideoClipDbRow).\n Expected:\n", f2sVar18, "\n Found:\n", J18), 1);
        }
        LinkedHashMap linkedHashMap19 = new LinkedHashMap();
        linkedHashMap19.put("video_clip_id", new c2s(1, 1, "video_clip_id", "TEXT", null, true));
        f2s f2sVar19 = new f2s("video_clip_artist", linkedHashMap19, v3w.i(linkedHashMap19, "artist_id", new c2s(2, 1, "artist_id", "TEXT", null, true)), new LinkedHashSet());
        f2s J19 = pcg.J(xjoVar, "video_clip_artist");
        if (!f2sVar19.equals(J19)) {
            return new c7f(false, v3w.d("video_clip_artist(com.yandex.music.databases.main.entities.joins.VideoClipArtistDbRow).\n Expected:\n", f2sVar19, "\n Found:\n", J19), 1);
        }
        LinkedHashMap linkedHashMap20 = new LinkedHashMap();
        linkedHashMap20.put("video_clip_id", new c2s(1, 1, "video_clip_id", "TEXT", null, true));
        f2s f2sVar20 = new f2s("video_clip_track", linkedHashMap20, v3w.i(linkedHashMap20, "track_id", new c2s(2, 1, "track_id", "TEXT", null, true)), new LinkedHashSet());
        f2s J20 = pcg.J(xjoVar, "video_clip_track");
        if (!f2sVar20.equals(J20)) {
            return new c7f(false, v3w.d("video_clip_track(com.yandex.music.databases.main.entities.joins.VideoClipTrackDbRow).\n Expected:\n", f2sVar20, "\n Found:\n", J20), 1);
        }
        LinkedHashMap linkedHashMap21 = new LinkedHashMap();
        linkedHashMap21.put("artist_name", new c2s(0, 1, "artist_name", "TEXT", null, false));
        linkedHashMap21.put("artist_name_surrogate", new c2s(0, 1, "artist_name_surrogate", "TEXT", null, false));
        linkedHashMap21.put("artist_id", new c2s(0, 1, "artist_id", "TEXT", null, false));
        linkedHashMap21.put("artist_track_various", new c2s(0, 1, "artist_track_various", "TEXT", null, false));
        linkedHashMap21.put("artist_disclaimer", new c2s(0, 1, "artist_disclaimer", "TEXT", null, false));
        linkedHashMap21.put("artist_track_cover_uri", new c2s(0, 1, "artist_track_cover_uri", "TEXT", null, false));
        linkedHashMap21.put("artist_track_cutout_cover_uri", new c2s(0, 1, "artist_track_cutout_cover_uri", "TEXT", null, false));
        linkedHashMap21.put("artist_cover_type", new c2s(0, 1, "artist_cover_type", "TEXT", null, false));
        linkedHashMap21.put("timestamp", new c2s(0, 1, "timestamp", "TEXT", null, true));
        linkedHashMap21.put("liked_timestamp", new c2s(0, 1, "liked_timestamp", "TEXT", null, false));
        linkedHashMap21.put("is_permanent", new c2s(0, 1, "is_permanent", "INTEGER", null, true));
        linkedHashMap21.put("name_surrogate", new c2s(0, 1, "name_surrogate", "TEXT", null, true));
        linkedHashMap21.put("liked", new c2s(0, 1, "liked", "INTEGER", null, true));
        linkedHashMap21.put("playlist_original_ids", new c2s(0, 1, "playlist_original_ids", "TEXT", null, false));
        linkedHashMap21.put("original_id", new c2s(1, 1, "original_id", "TEXT", null, true));
        linkedHashMap21.put("real_id", new c2s(0, 1, "real_id", "TEXT", null, false));
        linkedHashMap21.put("name", new c2s(0, 1, "name", "TEXT", null, true));
        linkedHashMap21.put("version", new c2s(0, 1, "version", "TEXT", null, false));
        linkedHashMap21.put("duration", new c2s(0, 1, "duration", "INTEGER", null, true));
        linkedHashMap21.put("warning_content", new c2s(0, 1, "warning_content", "TEXT", null, true));
        linkedHashMap21.put("explicit", new c2s(0, 1, "explicit", "INTEGER", null, true));
        linkedHashMap21.put("available", new c2s(0, 1, "available", "TEXT", null, true));
        linkedHashMap21.put("for_premium", new c2s(0, 1, "for_premium", "INTEGER", null, true));
        linkedHashMap21.put("for_options", new c2s(0, 1, "for_options", "TEXT", null, false));
        linkedHashMap21.put("lyrics_available", new c2s(0, 1, "lyrics_available", "INTEGER", null, true));
        linkedHashMap21.put("txt_lyrics_available", new c2s(0, 1, "txt_lyrics_available", "INTEGER", null, true));
        linkedHashMap21.put("sync_lyrics_available", new c2s(0, 1, "sync_lyrics_available", "INTEGER", null, true));
        linkedHashMap21.put("track_type", new c2s(0, 1, "track_type", "TEXT", null, true));
        linkedHashMap21.put("track_source", new c2s(0, 1, "track_source", "TEXT", null, false));
        linkedHashMap21.put("track_user", new c2s(0, 1, "track_user", "TEXT", null, false));
        linkedHashMap21.put("ugc_artist_name", new c2s(0, 1, "ugc_artist_name", "TEXT", null, false));
        linkedHashMap21.put("track_save_progress", new c2s(0, 1, "track_save_progress", "INTEGER", null, true));
        linkedHashMap21.put("cover_video_id", new c2s(0, 1, "cover_video_id", "TEXT", null, false));
        linkedHashMap21.put("cover_url", new c2s(0, 1, "cover_url", "TEXT", null, false));
        linkedHashMap21.put("color_palette", new c2s(0, 1, "color_palette", "TEXT", null, false));
        linkedHashMap21.put("short_description", new c2s(0, 1, "short_description", "TEXT", null, false));
        linkedHashMap21.put("release_date", new c2s(0, 1, "release_date", "TEXT", null, false));
        linkedHashMap21.put("integrated_loudness_db", new c2s(0, 1, "integrated_loudness_db", "REAL", null, false));
        linkedHashMap21.put("true_peak_db", new c2s(0, 1, "true_peak_db", "REAL", null, false));
        linkedHashMap21.put("track_for_kids", new c2s(0, 1, "track_for_kids", "INTEGER", null, true));
        linkedHashMap21.put("track_disclaimer", new c2s(0, 1, "track_disclaimer", "TEXT", null, false));
        linkedHashMap21.put("track_fade", new c2s(0, 1, "track_fade", "TEXT", null, false));
        linkedHashMap21.put("special_audio_resources", new c2s(0, 1, "special_audio_resources", "TEXT", null, false));
        linkedHashMap21.put("track_video_clip_ids", new c2s(0, 1, "track_video_clip_ids", "TEXT", null, false));
        linkedHashMap21.put("album_name", new c2s(0, 1, "album_name", "TEXT", null, true));
        linkedHashMap21.put("album_id", new c2s(2, 1, "album_id", "TEXT", null, true));
        linkedHashMap21.put("album_type", new c2s(0, 1, "album_type", "TEXT", null, true));
        linkedHashMap21.put("cover_uri", new c2s(0, 1, "cover_uri", "TEXT", null, false));
        linkedHashMap21.put("vol", new c2s(0, 1, "vol", "INTEGER", null, true));
        f2s f2sVar21 = new f2s("track_mview", linkedHashMap21, v3w.i(linkedHashMap21, "position", new c2s(0, 1, "position", "INTEGER", null, true)), new LinkedHashSet());
        f2s J21 = pcg.J(xjoVar, "track_mview");
        if (!f2sVar21.equals(J21)) {
            return new c7f(false, v3w.d("track_mview(com.yandex.music.databases.main.entities.track.TrackMViewDbRow).\n Expected:\n", f2sVar21, "\n Found:\n", J21), 1);
        }
        LinkedHashMap linkedHashMap22 = new LinkedHashMap();
        linkedHashMap22.put("_id", new c2s(0, 1, "_id", "INTEGER", null, true));
        linkedHashMap22.put("original_id", new c2s(1, 1, "original_id", "TEXT", null, true));
        linkedHashMap22.put("uid", new c2s(2, 1, "uid", "TEXT", null, true));
        linkedHashMap22.put("uuid", new c2s(0, 1, "uuid", "TEXT", null, false));
        linkedHashMap22.put(LegacyAccountType.STRING_LOGIN, new c2s(0, 1, LegacyAccountType.STRING_LOGIN, "TEXT", null, true));
        linkedHashMap22.put("user_full_name", new c2s(0, 1, "user_full_name", "TEXT", null, false));
        linkedHashMap22.put("name", new c2s(0, 1, "name", "TEXT", null, true));
        linkedHashMap22.put("name_surrogate", new c2s(0, 1, "name_surrogate", "TEXT", null, true));
        linkedHashMap22.put(DeviceService.KEY_DESC, new c2s(0, 1, DeviceService.KEY_DESC, "TEXT", null, false));
        linkedHashMap22.put("revision", new c2s(0, 1, "revision", "INTEGER", null, false));
        linkedHashMap22.put("snapshot", new c2s(0, 1, "snapshot", "INTEGER", null, false));
        linkedHashMap22.put(DefaultConnectableDeviceStore.KEY_CREATED, new c2s(0, 1, DefaultConnectableDeviceStore.KEY_CREATED, "TEXT", null, true));
        linkedHashMap22.put("visibility", new c2s(0, 1, "visibility", "TEXT", null, true));
        linkedHashMap22.put("sync", new c2s(0, 1, "sync", "INTEGER", null, true));
        linkedHashMap22.put("cover_info", new c2s(0, 1, "cover_info", "TEXT", null, false));
        linkedHashMap22.put("position", new c2s(0, 1, "position", "INTEGER", null, false));
        linkedHashMap22.put("liked", new c2s(0, 1, "liked", "INTEGER", null, true));
        linkedHashMap22.put("likes_count", new c2s(0, 1, "likes_count", "INTEGER", null, false));
        linkedHashMap22.put("liked_timestamp", new c2s(0, 1, "liked_timestamp", "TEXT", null, false));
        linkedHashMap22.put("auto_generated_type", new c2s(0, 1, "auto_generated_type", "TEXT", null, false));
        linkedHashMap22.put("target_uid", new c2s(0, 1, "target_uid", "TEXT", null, false));
        linkedHashMap22.put("target_login", new c2s(0, 1, "target_login", "TEXT", null, false));
        linkedHashMap22.put("modified", new c2s(0, 1, "modified", "TEXT", null, false));
        linkedHashMap22.put("made_for_genitive", new c2s(0, 1, "made_for_genitive", "TEXT", null, false));
        linkedHashMap22.put("playlist_for_kids", new c2s(0, 1, "playlist_for_kids", "INTEGER", null, true));
        linkedHashMap22.put("bg_image_url", new c2s(0, 1, "bg_image_url", "TEXT", null, false));
        linkedHashMap22.put("bg_video_url", new c2s(0, 1, "bg_video_url", "TEXT", null, false));
        linkedHashMap22.put("tracks", new c2s(0, 1, "tracks", "INTEGER", null, false));
        linkedHashMap22.put("tracks_stale", new c2s(0, 1, "tracks_stale", "INTEGER", null, false));
        linkedHashMap22.put("duration", new c2s(0, 1, "duration", "INTEGER", null, false));
        f2s f2sVar22 = new f2s("playlist_mview", linkedHashMap22, v3w.i(linkedHashMap22, "tracks_cached", new c2s(0, 1, "tracks_cached", "INTEGER", null, false)), new LinkedHashSet());
        f2s J22 = pcg.J(xjoVar, "playlist_mview");
        if (!f2sVar22.equals(J22)) {
            return new c7f(false, v3w.d("playlist_mview(com.yandex.music.databases.main.entities.playlist.PlaylistMViewDbRow).\n Expected:\n", f2sVar22, "\n Found:\n", J22), 1);
        }
        LinkedHashMap linkedHashMap23 = new LinkedHashMap();
        linkedHashMap23.put("name", new c2s(0, 1, "name", "TEXT", null, true));
        linkedHashMap23.put("name_surrogate", new c2s(0, 1, "name_surrogate", "TEXT", null, true));
        linkedHashMap23.put("liked", new c2s(0, 1, "liked", "INTEGER", null, true));
        linkedHashMap23.put("timestamp", new c2s(0, 1, "timestamp", "TEXT", null, true));
        linkedHashMap23.put("original_id", new c2s(1, 1, "original_id", "TEXT", null, true));
        linkedHashMap23.put("for_premium", new c2s(0, 1, "for_premium", "INTEGER", null, true));
        linkedHashMap23.put("for_options", new c2s(0, 1, "for_options", "TEXT", null, false));
        linkedHashMap23.put("cover_uri", new c2s(0, 1, "cover_uri", "TEXT", null, false));
        linkedHashMap23.put("tracks_stale", new c2s(0, 1, "tracks_stale", "INTEGER", null, true));
        linkedHashMap23.put("original_release_year", new c2s(0, 1, "original_release_year", "TEXT", null, false));
        linkedHashMap23.put("album_type", new c2s(0, 1, "album_type", "TEXT", null, true));
        linkedHashMap23.put("album_meta_type", new c2s(0, 1, "album_meta_type", "TEXT", null, false));
        linkedHashMap23.put("genre_code", new c2s(0, 1, "genre_code", "TEXT", null, false));
        linkedHashMap23.put("warning_content", new c2s(0, 1, "warning_content", "TEXT", null, true));
        linkedHashMap23.put("short_description", new c2s(0, 1, "short_description", "TEXT", null, false));
        linkedHashMap23.put(DeviceService.KEY_DESC, new c2s(0, 1, DeviceService.KEY_DESC, "TEXT", null, false));
        linkedHashMap23.put("likes_count", new c2s(0, 1, "likes_count", "INTEGER", null, true));
        linkedHashMap23.put("album_for_kids", new c2s(0, 1, "album_for_kids", "INTEGER", null, true));
        linkedHashMap23.put("bg_image_url", new c2s(0, 1, "bg_image_url", "TEXT", null, false));
        linkedHashMap23.put("sort_order", new c2s(0, 1, "sort_order", "TEXT", null, false));
        linkedHashMap23.put("duration_sec", new c2s(0, 1, "duration_sec", "INTEGER", null, false));
        linkedHashMap23.put("bg_video_url", new c2s(0, 1, "bg_video_url", "TEXT", null, false));
        linkedHashMap23.put("album_disclaimer", new c2s(0, 1, "album_disclaimer", "TEXT", null, true));
        linkedHashMap23.put("available", new c2s(0, 1, "available", "INTEGER", null, true));
        linkedHashMap23.put("version", new c2s(0, 1, "version", "TEXT", null, false));
        linkedHashMap23.put("artist_id", new c2s(0, 1, "artist_id", "TEXT", null, false));
        linkedHashMap23.put("artist_name", new c2s(0, 1, "artist_name", "TEXT", null, false));
        linkedHashMap23.put("artist_disclaimer", new c2s(0, 1, "artist_disclaimer", "TEXT", null, false));
        linkedHashMap23.put("artist_name_surrogate", new c2s(0, 1, "artist_name_surrogate", "TEXT", null, false));
        linkedHashMap23.put("artist_cover_uri", new c2s(0, 1, "artist_cover_uri", "TEXT", null, false));
        linkedHashMap23.put("artist_cutout_cover_uri", new c2s(0, 1, "artist_cutout_cover_uri", "TEXT", null, false));
        f2s f2sVar23 = new f2s("album_mview", linkedHashMap23, v3w.i(linkedHashMap23, "tracks_cached", new c2s(0, 1, "tracks_cached", "INTEGER", null, false)), new LinkedHashSet());
        f2s J23 = pcg.J(xjoVar, "album_mview");
        if (!f2sVar23.equals(J23)) {
            return new c7f(false, v3w.d("album_mview(com.yandex.music.databases.main.entities.album.AlbumMViewDbRow).\n Expected:\n", f2sVar23, "\n Found:\n", J23), 1);
        }
        LinkedHashMap linkedHashMap24 = new LinkedHashMap();
        linkedHashMap24.put("name", new c2s(0, 1, "name", "TEXT", null, true));
        linkedHashMap24.put("name_surrogate", new c2s(0, 1, "name_surrogate", "TEXT", null, true));
        linkedHashMap24.put("liked", new c2s(0, 1, "liked", "INTEGER", null, true));
        linkedHashMap24.put("timestamp", new c2s(0, 1, "timestamp", "TEXT", null, true));
        linkedHashMap24.put("original_id", new c2s(1, 1, "original_id", "TEXT", null, true));
        linkedHashMap24.put("various", new c2s(0, 1, "various", "INTEGER", null, true));
        linkedHashMap24.put("cover_uri", new c2s(0, 1, "cover_uri", "TEXT", null, false));
        linkedHashMap24.put("cutout_cover_uri", new c2s(0, 1, "cutout_cover_uri", "TEXT", null, false));
        linkedHashMap24.put("albums_stale", new c2s(0, 1, "albums_stale", "INTEGER", null, true));
        linkedHashMap24.put("tracks_stale", new c2s(0, 1, "tracks_stale", "INTEGER", null, true));
        linkedHashMap24.put("artist_for_kids", new c2s(0, 1, "artist_for_kids", "INTEGER", null, true));
        linkedHashMap24.put("artist_disclaimer", new c2s(0, 1, "artist_disclaimer", "TEXT", null, false));
        linkedHashMap24.put("available", new c2s(0, 1, "available", "INTEGER", null, true));
        linkedHashMap24.put("cover_type", new c2s(0, 1, "cover_type", "TEXT", null, false));
        linkedHashMap24.put("albums", new c2s(0, 1, "albums", "INTEGER", null, false));
        linkedHashMap24.put("tracks", new c2s(0, 1, "tracks", "INTEGER", null, false));
        f2s f2sVar24 = new f2s("artist_mview", linkedHashMap24, v3w.i(linkedHashMap24, "tracks_cached", new c2s(0, 1, "tracks_cached", "INTEGER", null, false)), new LinkedHashSet());
        f2s J24 = pcg.J(xjoVar, "artist_mview");
        if (!f2sVar24.equals(J24)) {
            return new c7f(false, v3w.d("artist_mview(com.yandex.music.databases.main.entities.artist.ArtistMViewDbRow).\n Expected:\n", f2sVar24, "\n Found:\n", J24), 1);
        }
        ueu ueuVar = new ueu("playlist_view", "CREATE VIEW `playlist_view` AS SELECT\n  playlist_track._id AS _id,\n  playlist_track.playlist_id AS playlist_id,\n  playlist_track.timestamp AS timestamp,\n  playlist_track.position AS position_playlist,\n  playlist_track.album_id AS playlist_album_id,\n  track.duration AS duration,\n  track.name AS name,\n  track.name_surrogate AS name_surrogate,\n  track.version AS version,\n  track.original_id AS original_id,\n  track.real_id AS real_id,\n  track.warning_content AS warning_content,\n  track.explicit AS explicit,\n  track.available AS available,\n  track.for_premium AS for_premium,\n  track.for_options AS for_options,\n  track.lyrics_available AS lyrics_available,\n  track.txt_lyrics_available AS txt_lyrics_available,\n  track.sync_lyrics_available AS sync_lyrics_available,\n  track.track_type AS track_type,\n  track.track_source AS track_source,\n  track.track_user AS track_user,\n  track.ugc_artist_name AS ugc_artist_name,\n  track.track_save_progress AS track_save_progress,\n  track.cover_video_id AS cover_video_id,\n  track.cover_url AS cover_url,\n  track.color_palette AS color_palette,\n  track.special_audio_resources AS special_audio_resources,\n  track.short_description AS short_description,\n  track.release_date AS release_date,\n  track.track_for_kids AS track_for_kids,\n  track.integrated_loudness_db AS integrated_loudness_db,\n  track.true_peak_db AS true_peak_db,\n  track.track_disclaimer AS track_disclaimer,\n  track.track_fade AS track_fade,\n  track.track_video_clip_ids AS track_video_clip_ids,\n  TrackAlbumData.album_id AS album_id,\n  TrackAlbumData.album_name AS album_name,\n  TrackAlbumData.position AS position,\n  TrackAlbumData.vol AS vol,\n  TrackAlbumData.album_type AS album_type,\n  TrackAlbumData.cover_uri AS cover_uri,\n  TrackArtistData.artist_id AS artist_id,\n  TrackArtistData.artist_name AS artist_name,\n  TrackArtistData.artist_track_various AS artist_track_various,\n  TrackArtistData.artist_track_cover_uri AS artist_track_cover_uri,\n  TrackArtistData.artist_track_cutout_cover_uri AS artist_track_cutout_cover_uri,\n  TrackArtistData.artist_cover_type AS artist_cover_type,\n  TrackArtistData.artist_disclaimer AS artist_disclaimer,\n  TrackArtistData.artist_name_surrogate AS artist_name_surrogate\nFROM\n  playlist_track\n  JOIN track ON track.original_id = playlist_track.track_id\n  JOIN (\n    SELECT\n      album_track.track_id AS track_id,\n      -- We must pick one album from grouping. So we album_id special column as a MAX(), other columns are bare\n      -- https://sqlite.org/lang_select.html#bare_columns_in_an_aggregate_query\n      MAX(album_track.album_id),\n      album.original_id AS album_id,\n      album.name AS album_name,\n      album.album_type AS album_type,\n      album.cover_uri AS cover_uri,\n      album_track.position AS position,\n      album_track.vol AS vol\n    FROM album_track JOIN album ON album.original_id = album_track.album_id\n    GROUP BY album_track.track_id\n  ) AS TrackAlbumData ON TrackAlbumData.track_id = playlist_track.track_id\n  JOIN (\n    SELECT\n      artist_track.track_id AS track_id,\n      GROUP_CONCAT(artist_track.artist_id || '#|') AS artist_id,\n      GROUP_CONCAT(artist_track.artist_name || '#|') AS artist_name,\n      GROUP_CONCAT(artist_track.artist_track_various || '#|') AS artist_track_various,\n      GROUP_CONCAT(COALESCE(artist_track.artist_track_cover_uri, 'null') || '#|') AS artist_track_cover_uri,\n      GROUP_CONCAT(COALESCE(artist_track.artist_track_cutout_cover_uri, 'null') || '#|') AS artist_track_cutout_cover_uri,\n      GROUP_CONCAT(COALESCE(artist_track.artist_cover_type, 'null') || '#|') AS artist_cover_type,\n      GROUP_CONCAT(COALESCE(artist.artist_disclaimer, 'null') || '#|') AS artist_disclaimer,\n      GROUP_CONCAT(artist.name_surrogate || '#|') AS artist_name_surrogate\n    FROM artist_track JOIN artist ON artist.original_id = artist_track.artist_id\n    GROUP BY artist_track.track_id\n  ) AS TrackArtistData ON TrackArtistData.track_id = playlist_track.track_id");
        ueu B = zdg.B(xjoVar, "playlist_view");
        if (!ueuVar.equals(B)) {
            return new c7f(false, "playlist_view(com.yandex.music.databases.main.entities.playlistview.PlaylistViewDbRow).\n Expected:\n" + ueuVar + "\n Found:\n" + B, 1);
        }
        ueu ueuVar2 = new ueu("track_view", "CREATE VIEW `track_view` AS SELECT\n  track.duration AS duration,\n  track.name AS name,\n  track.version AS version,\n  track.original_id AS original_id,\n  track.real_id AS real_id,\n  track.warning_content AS warning_content,\n  track.explicit AS explicit,\n  track.available AS available,\n  track.for_premium AS for_premium,\n  track.for_options AS for_options,\n  track.lyrics_available AS lyrics_available,\n  track.txt_lyrics_available AS txt_lyrics_available,\n  track.sync_lyrics_available AS sync_lyrics_available,\n  track.track_type AS track_type,\n  track.track_source AS track_source,\n  track.track_user AS track_user,\n  track.ugc_artist_name AS ugc_artist_name,\n  track.track_save_progress AS track_save_progress,\n  track.cover_video_id AS cover_video_id,\n  track.cover_url AS cover_url,\n  track.color_palette AS color_palette,\n  track.short_description AS short_description,\n  track.release_date AS release_date,\n  track.track_for_kids AS track_for_kids,\n  track.integrated_loudness_db AS integrated_loudness_db,\n  track.true_peak_db AS true_peak_db,\n  track.track_disclaimer AS track_disclaimer,\n  track.track_fade AS track_fade,\n  track.special_audio_resources AS special_audio_resources,\n  track.track_video_clip_ids AS track_video_clip_ids,\n  album_track.album_id AS album_id,\n  album_track.album_name AS album_name,\n  album_track.vol AS vol,\n  album_track.position AS position,\n  artist_track.artist_id AS artist_id,\n  artist_track.artist_name AS artist_name,\n  artist_track.artist_track_various AS artist_track_various,\n  artist_track.artist_track_cover_uri AS artist_track_cover_uri,\n  artist_track.artist_track_cutout_cover_uri AS artist_track_cutout_cover_uri,\n  artist.artist_disclaimer AS artist_disclaimer,\n  album.original_release_year AS original_release_year,\n  album.cover_uri AS cover_uri,\n  album.album_type AS album_type,\n  album.sort_order AS sort_order\nFROM\n  track\n  JOIN artist_track ON artist_track.track_id = track.original_id\n  JOIN artist ON artist.original_id = artist_track.artist_id\n  JOIN album_track ON album_track.track_id = track.original_id\n  JOIN album ON album.original_id = album_track.album_id\nGROUP BY\n  track.original_id,\n  album_track.album_id,\n  artist_track.artist_id");
        ueu B2 = zdg.B(xjoVar, "track_view");
        if (ueuVar2.equals(B2)) {
            return new c7f(true, (String) null, 1);
        }
        return new c7f(false, "track_view(com.yandex.music.databases.main.entities.trackview.TrackViewDbRow).\n Expected:\n" + ueuVar2 + "\n Found:\n" + B2, 1);
    }

    private final c7f l(xjo xjoVar) {
        xjoVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("work_spec_id", new c2s(1, 1, "work_spec_id", "TEXT", null, true));
        LinkedHashSet i = v3w.i(linkedHashMap, "prerequisite_id", new c2s(2, 1, "prerequisite_id", "TEXT", null, true));
        i.add(new d2s("WorkSpec", "CASCADE", "CASCADE", t75.c("work_spec_id"), t75.c(ConnectableDevice.KEY_ID)));
        i.add(new d2s("WorkSpec", "CASCADE", "CASCADE", t75.c("prerequisite_id"), t75.c(ConnectableDevice.KEY_ID)));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new e2s("index_Dependency_work_spec_id", false, t75.c("work_spec_id"), t75.c("ASC")));
        linkedHashSet.add(new e2s("index_Dependency_prerequisite_id", false, t75.c("prerequisite_id"), t75.c("ASC")));
        f2s f2sVar = new f2s("Dependency", linkedHashMap, i, linkedHashSet);
        f2s J = pcg.J(xjoVar, "Dependency");
        if (!f2sVar.equals(J)) {
            return new c7f(false, v3w.d("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", f2sVar, "\n Found:\n", J), 1);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(ConnectableDevice.KEY_ID, new c2s(1, 1, ConnectableDevice.KEY_ID, "TEXT", null, true));
        linkedHashMap2.put("state", new c2s(0, 1, "state", "INTEGER", null, true));
        linkedHashMap2.put("worker_class_name", new c2s(0, 1, "worker_class_name", "TEXT", null, true));
        linkedHashMap2.put("input_merger_class_name", new c2s(0, 1, "input_merger_class_name", "TEXT", null, true));
        linkedHashMap2.put("input", new c2s(0, 1, "input", "BLOB", null, true));
        linkedHashMap2.put("output", new c2s(0, 1, "output", "BLOB", null, true));
        linkedHashMap2.put("initial_delay", new c2s(0, 1, "initial_delay", "INTEGER", null, true));
        linkedHashMap2.put("interval_duration", new c2s(0, 1, "interval_duration", "INTEGER", null, true));
        linkedHashMap2.put("flex_duration", new c2s(0, 1, "flex_duration", "INTEGER", null, true));
        linkedHashMap2.put("run_attempt_count", new c2s(0, 1, "run_attempt_count", "INTEGER", null, true));
        linkedHashMap2.put("backoff_policy", new c2s(0, 1, "backoff_policy", "INTEGER", null, true));
        linkedHashMap2.put("backoff_delay_duration", new c2s(0, 1, "backoff_delay_duration", "INTEGER", null, true));
        linkedHashMap2.put("last_enqueue_time", new c2s(0, 1, "last_enqueue_time", "INTEGER", "-1", true));
        linkedHashMap2.put("minimum_retention_duration", new c2s(0, 1, "minimum_retention_duration", "INTEGER", null, true));
        linkedHashMap2.put("schedule_requested_at", new c2s(0, 1, "schedule_requested_at", "INTEGER", null, true));
        linkedHashMap2.put("run_in_foreground", new c2s(0, 1, "run_in_foreground", "INTEGER", null, true));
        linkedHashMap2.put("out_of_quota_policy", new c2s(0, 1, "out_of_quota_policy", "INTEGER", null, true));
        linkedHashMap2.put("period_count", new c2s(0, 1, "period_count", "INTEGER", CommonUrlParts.Values.FALSE_INTEGER, true));
        linkedHashMap2.put("generation", new c2s(0, 1, "generation", "INTEGER", CommonUrlParts.Values.FALSE_INTEGER, true));
        linkedHashMap2.put("next_schedule_time_override", new c2s(0, 1, "next_schedule_time_override", "INTEGER", "9223372036854775807", true));
        linkedHashMap2.put("next_schedule_time_override_generation", new c2s(0, 1, "next_schedule_time_override_generation", "INTEGER", CommonUrlParts.Values.FALSE_INTEGER, true));
        linkedHashMap2.put("stop_reason", new c2s(0, 1, "stop_reason", "INTEGER", "-256", true));
        linkedHashMap2.put("trace_tag", new c2s(0, 1, "trace_tag", "TEXT", null, false));
        linkedHashMap2.put("backoff_on_system_interruptions", new c2s(0, 1, "backoff_on_system_interruptions", "INTEGER", null, false));
        linkedHashMap2.put("required_network_type", new c2s(0, 1, "required_network_type", "INTEGER", null, true));
        linkedHashMap2.put("required_network_request", new c2s(0, 1, "required_network_request", "BLOB", "x''", true));
        linkedHashMap2.put("requires_charging", new c2s(0, 1, "requires_charging", "INTEGER", null, true));
        linkedHashMap2.put("requires_device_idle", new c2s(0, 1, "requires_device_idle", "INTEGER", null, true));
        linkedHashMap2.put("requires_battery_not_low", new c2s(0, 1, "requires_battery_not_low", "INTEGER", null, true));
        linkedHashMap2.put("requires_storage_not_low", new c2s(0, 1, "requires_storage_not_low", "INTEGER", null, true));
        linkedHashMap2.put("trigger_content_update_delay", new c2s(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
        linkedHashMap2.put("trigger_max_content_delay", new c2s(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
        LinkedHashSet i2 = v3w.i(linkedHashMap2, "content_uri_triggers", new c2s(0, 1, "content_uri_triggers", "BLOB", null, true));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new e2s("index_WorkSpec_schedule_requested_at", false, t75.c("schedule_requested_at"), t75.c("ASC")));
        linkedHashSet2.add(new e2s("index_WorkSpec_last_enqueue_time", false, t75.c("last_enqueue_time"), t75.c("ASC")));
        f2s f2sVar2 = new f2s("WorkSpec", linkedHashMap2, i2, linkedHashSet2);
        f2s J2 = pcg.J(xjoVar, "WorkSpec");
        if (!f2sVar2.equals(J2)) {
            return new c7f(false, v3w.d("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", f2sVar2, "\n Found:\n", J2), 1);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("tag", new c2s(1, 1, "tag", "TEXT", null, true));
        LinkedHashSet i3 = v3w.i(linkedHashMap3, "work_spec_id", new c2s(2, 1, "work_spec_id", "TEXT", null, true));
        i3.add(new d2s("WorkSpec", "CASCADE", "CASCADE", t75.c("work_spec_id"), t75.c(ConnectableDevice.KEY_ID)));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        linkedHashSet3.add(new e2s("index_WorkTag_work_spec_id", false, t75.c("work_spec_id"), t75.c("ASC")));
        f2s f2sVar3 = new f2s("WorkTag", linkedHashMap3, i3, linkedHashSet3);
        f2s J3 = pcg.J(xjoVar, "WorkTag");
        if (!f2sVar3.equals(J3)) {
            return new c7f(false, v3w.d("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", f2sVar3, "\n Found:\n", J3), 1);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("work_spec_id", new c2s(1, 1, "work_spec_id", "TEXT", null, true));
        linkedHashMap4.put("generation", new c2s(2, 1, "generation", "INTEGER", CommonUrlParts.Values.FALSE_INTEGER, true));
        LinkedHashSet i4 = v3w.i(linkedHashMap4, "system_id", new c2s(0, 1, "system_id", "INTEGER", null, true));
        i4.add(new d2s("WorkSpec", "CASCADE", "CASCADE", t75.c("work_spec_id"), t75.c(ConnectableDevice.KEY_ID)));
        f2s f2sVar4 = new f2s("SystemIdInfo", linkedHashMap4, i4, new LinkedHashSet());
        f2s J4 = pcg.J(xjoVar, "SystemIdInfo");
        if (!f2sVar4.equals(J4)) {
            return new c7f(false, v3w.d("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", f2sVar4, "\n Found:\n", J4), 1);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("name", new c2s(1, 1, "name", "TEXT", null, true));
        LinkedHashSet i5 = v3w.i(linkedHashMap5, "work_spec_id", new c2s(2, 1, "work_spec_id", "TEXT", null, true));
        i5.add(new d2s("WorkSpec", "CASCADE", "CASCADE", t75.c("work_spec_id"), t75.c(ConnectableDevice.KEY_ID)));
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new e2s("index_WorkName_work_spec_id", false, t75.c("work_spec_id"), t75.c("ASC")));
        f2s f2sVar5 = new f2s("WorkName", linkedHashMap5, i5, linkedHashSet4);
        f2s J5 = pcg.J(xjoVar, "WorkName");
        if (!f2sVar5.equals(J5)) {
            return new c7f(false, v3w.d("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", f2sVar5, "\n Found:\n", J5), 1);
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("work_spec_id", new c2s(1, 1, "work_spec_id", "TEXT", null, true));
        LinkedHashSet i6 = v3w.i(linkedHashMap6, "progress", new c2s(0, 1, "progress", "BLOB", null, true));
        i6.add(new d2s("WorkSpec", "CASCADE", "CASCADE", t75.c("work_spec_id"), t75.c(ConnectableDevice.KEY_ID)));
        f2s f2sVar6 = new f2s("WorkProgress", linkedHashMap6, i6, new LinkedHashSet());
        f2s J6 = pcg.J(xjoVar, "WorkProgress");
        if (!f2sVar6.equals(J6)) {
            return new c7f(false, v3w.d("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", f2sVar6, "\n Found:\n", J6), 1);
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put(PListParser.TAG_KEY, new c2s(1, 1, PListParser.TAG_KEY, "TEXT", null, true));
        f2s f2sVar7 = new f2s("Preference", linkedHashMap7, v3w.i(linkedHashMap7, "long_value", new c2s(0, 1, "long_value", "INTEGER", null, false)), new LinkedHashSet());
        f2s J7 = pcg.J(xjoVar, "Preference");
        return !f2sVar7.equals(J7) ? new c7f(false, v3w.d("Preference(androidx.work.impl.model.Preference).\n Expected:\n", f2sVar7, "\n Found:\n", J7), 1) : new c7f(true, (String) null, 1);
    }

    @Override // defpackage.yeo
    public final void a(xjo xjoVar) {
        switch (this.d) {
            case 0:
                v3w.j(xjoVar, xjoVar, "CREATE TABLE IF NOT EXISTS `artistDisclaimers` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `artistId` TEXT NOT NULL, `foreignAgentText` TEXT NOT NULL)", xjoVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_artistDisclaimers_artistId` ON `artistDisclaimers` (`artistId`)");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `disclaimers` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `id` TEXT NOT NULL, `type` TEXT NOT NULL, `reason` TEXT, `title` TEXT, `description` TEXT, `detailsText` TEXT, `detailsUrl` TEXT)");
                p6g.s(xjoVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_disclaimers_id_type` ON `disclaimers` (`id`, `type`)");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                p6g.s(xjoVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '84a06c641b70e6d557d24bbad59ec5ff')");
                break;
            case 1:
                v3w.j(xjoVar, xjoVar, "CREATE TABLE IF NOT EXISTS `album_operation` (`album_id` TEXT NOT NULL, `operation` INTEGER, PRIMARY KEY(`album_id`))", xjoVar, "CREATE TABLE IF NOT EXISTS `artist_operation` (`artist_id` TEXT NOT NULL, `operation` INTEGER, PRIMARY KEY(`artist_id`))");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `playlist_operation` (`playlist_id` TEXT NOT NULL, `operation` INTEGER, PRIMARY KEY(`playlist_id`))");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `video_clip_operation` (`video_clip_id` TEXT NOT NULL, `operation` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`video_clip_id`))");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `track_operation` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT, `playlist_id` INTEGER, `operation` INTEGER, `position` INTEGER, `track_id` TEXT, `album_id` TEXT, `timestamp` INTEGER)");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `artist` (`original_id` TEXT NOT NULL, `name` TEXT NOT NULL, `name_surrogate` TEXT NOT NULL, `liked` INTEGER NOT NULL, `disliked` INTEGER NOT NULL, `timestamp` TEXT NOT NULL, `various` INTEGER NOT NULL, `cover_uri` TEXT, `albums_stale` INTEGER NOT NULL, `tracks_stale` INTEGER NOT NULL, `artist_for_kids` INTEGER NOT NULL, `artist_disclaimer` TEXT, `available` INTEGER NOT NULL DEFAULT 1, `cover_type` TEXT, `cutout_cover_uri` TEXT, PRIMARY KEY(`original_id`))");
                p6g.s(xjoVar, "CREATE INDEX IF NOT EXISTS `index_artist_name_surrogate` ON `artist` (`name_surrogate`)");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `album` (`original_id` TEXT NOT NULL, `name` TEXT NOT NULL, `name_surrogate` TEXT NOT NULL, `liked` INTEGER NOT NULL, `likes_count` INTEGER NOT NULL, `timestamp` TEXT NOT NULL, `cover_uri` TEXT, `original_release_year` TEXT, `album_type` TEXT NOT NULL, `album_meta_type` TEXT, `short_description` TEXT, `description` TEXT, `for_premium` INTEGER NOT NULL, `for_options` TEXT, `tracks_stale` INTEGER NOT NULL, `warning_content` TEXT NOT NULL, `genre_code` TEXT, `album_for_kids` INTEGER NOT NULL, `bg_image_url` TEXT, `bg_video_url` TEXT, `sort_order` TEXT, `duration_sec` INTEGER, `album_disclaimer` TEXT NOT NULL, `available` INTEGER NOT NULL DEFAULT 1, `version` TEXT, PRIMARY KEY(`original_id`))");
                p6g.s(xjoVar, "CREATE INDEX IF NOT EXISTS `index_album_name_surrogate` ON `album` (`name_surrogate`)");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `playlist` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `uuid` TEXT, `original_id` TEXT NOT NULL, `uid` TEXT NOT NULL, `login` TEXT NOT NULL, `user_full_name` TEXT, `name` TEXT NOT NULL, `name_surrogate` TEXT NOT NULL, `description` TEXT, `revision` INTEGER, `snapshot` INTEGER, `created` TEXT NOT NULL, `visibility` TEXT NOT NULL, `sync` INTEGER NOT NULL, `cover_info` TEXT, `position` INTEGER, `tracks` INTEGER, `liked` INTEGER NOT NULL, `liked_timestamp` TEXT, `likes_count` INTEGER, `auto_generated_type` TEXT, `modified` TEXT, `made_for_genitive` TEXT, `target_uid` TEXT, `target_login` TEXT, `playlist_for_kids` INTEGER NOT NULL, `bg_image_url` TEXT, `bg_video_url` TEXT)");
                p6g.s(xjoVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_playlist_original_id_uid` ON `playlist` (`original_id`, `uid`)");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `track` (`original_id` TEXT NOT NULL, `real_id` TEXT, `name` TEXT NOT NULL, `name_surrogate` TEXT NOT NULL, `version` TEXT, `duration` INTEGER NOT NULL, `warning_content` TEXT NOT NULL, `explicit` INTEGER NOT NULL, `available` TEXT NOT NULL, `for_premium` INTEGER NOT NULL, `for_options` TEXT, `lyrics_available` INTEGER NOT NULL, `txt_lyrics_available` INTEGER NOT NULL, `sync_lyrics_available` INTEGER NOT NULL, `track_type` TEXT NOT NULL, `track_source` TEXT, `track_user` TEXT, `ugc_artist_name` TEXT, `track_save_progress` INTEGER NOT NULL, `cover_video_id` TEXT, `cover_url` TEXT, `color_palette` TEXT, `short_description` TEXT, `release_date` TEXT, `integrated_loudness_db` REAL, `true_peak_db` REAL, `track_for_kids` INTEGER NOT NULL, `track_disclaimer` TEXT, `track_fade` TEXT, `special_audio_resources` TEXT, `track_video_clip_ids` TEXT, PRIMARY KEY(`original_id`))");
                p6g.s(xjoVar, "CREATE INDEX IF NOT EXISTS `index_track_name` ON `track` (`name`)");
                p6g.s(xjoVar, "CREATE INDEX IF NOT EXISTS `index_track_name_surrogate` ON `track` (`name_surrogate`)");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `album_track` (`album_id` TEXT NOT NULL, `album_name` TEXT NOT NULL, `track_id` TEXT NOT NULL, `vol` INTEGER NOT NULL, `position` INTEGER NOT NULL, PRIMARY KEY(`album_id`, `track_id`))");
                p6g.s(xjoVar, "CREATE INDEX IF NOT EXISTS `index_album_track_track_id` ON `album_track` (`track_id`)");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `artist_track` (`artist_id` TEXT NOT NULL, `track_id` TEXT NOT NULL, `artist_name` TEXT NOT NULL, `artist_track_various` INTEGER NOT NULL, `artist_track_cover_uri` TEXT, `artist_track_cutout_cover_uri` TEXT, `artist_cover_type` TEXT, PRIMARY KEY(`artist_id`, `track_id`))");
                p6g.s(xjoVar, "CREATE INDEX IF NOT EXISTS `index_artist_track_track_id` ON `artist_track` (`track_id`)");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `album_artist` (`album_id` TEXT NOT NULL, `artist_id` TEXT NOT NULL, `artist_name` TEXT NOT NULL, `role` INTEGER NOT NULL, PRIMARY KEY(`album_id`, `artist_id`))");
                p6g.s(xjoVar, "CREATE INDEX IF NOT EXISTS `index_album_artist_artist_id` ON `album_artist` (`artist_id`)");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `playlist_track` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `playlist_id` INTEGER NOT NULL, `track_id` TEXT NOT NULL, `album_id` TEXT NOT NULL, `timestamp` TEXT NOT NULL, `position` INTEGER NOT NULL)");
                p6g.s(xjoVar, "CREATE INDEX IF NOT EXISTS `index_playlist_track_playlist_id_track_id_album_id` ON `playlist_track` (`playlist_id`, `track_id`, `album_id`)");
                p6g.s(xjoVar, "CREATE INDEX IF NOT EXISTS `index_playlist_track_playlist_id` ON `playlist_track` (`playlist_id`)");
                p6g.s(xjoVar, "CREATE INDEX IF NOT EXISTS `index_playlist_track_timestamp` ON `playlist_track` (`timestamp`)");
                p6g.s(xjoVar, "CREATE INDEX IF NOT EXISTS `index_playlist_track_track_id` ON `playlist_track` (`track_id`)");
                p6g.s(xjoVar, "CREATE INDEX IF NOT EXISTS `index_playlist_track_album_id` ON `playlist_track` (`album_id`)");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `pre_saves` (`original_id` TEXT NOT NULL, `artists` TEXT NOT NULL, `release_date` TEXT NOT NULL, `pre_save_date` TEXT NOT NULL, `milliseconds_until_release` INTEGER NOT NULL, `cover_uri` TEXT NOT NULL, `title` TEXT, `type_raw` TEXT, `warning_content` TEXT NOT NULL, `is_pre_saved` INTEGER NOT NULL, `available` INTEGER NOT NULL DEFAULT 1, `disclaimers` TEXT, PRIMARY KEY(`original_id`))");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `pre_save_operation` (`pre_save_id` TEXT NOT NULL, `artist_id` TEXT NOT NULL, `type` TEXT NOT NULL, PRIMARY KEY(`pre_save_id`))");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `tracks_cache_mirror` (`track_id` TEXT NOT NULL, `is_permanent` INTEGER NOT NULL, PRIMARY KEY(`track_id`))");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `phonotekaSyncSavedTrack` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `track_id` TEXT NOT NULL, `album_id` TEXT, `timestamp` TEXT, `track_list_type` INTEGER NOT NULL)");
                p6g.s(xjoVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_phonotekaSyncSavedTrack_track_list_type_track_id_album_id` ON `phonotekaSyncSavedTrack` (`track_list_type`, `track_id`, `album_id`)");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `video_clip` (`video_clip_id` TEXT NOT NULL, `title` TEXT NOT NULL, `name_surrogate` TEXT NOT NULL, `playerId` TEXT NOT NULL, `thumbnail` TEXT NOT NULL, `previewUrl` TEXT, `duration` INTEGER NOT NULL, `disclaimers` TEXT NOT NULL, `like_status` INTEGER, `timestamp` TEXT, PRIMARY KEY(`video_clip_id`))");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `video_clip_artist` (`video_clip_id` TEXT NOT NULL, `artist_id` TEXT NOT NULL, PRIMARY KEY(`video_clip_id`, `artist_id`))");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `video_clip_track` (`video_clip_id` TEXT NOT NULL, `track_id` TEXT NOT NULL, PRIMARY KEY(`video_clip_id`, `track_id`))");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `track_mview` (`artist_name` TEXT, `artist_name_surrogate` TEXT, `artist_id` TEXT, `artist_track_various` TEXT, `artist_disclaimer` TEXT, `artist_track_cover_uri` TEXT, `artist_track_cutout_cover_uri` TEXT, `artist_cover_type` TEXT, `timestamp` TEXT NOT NULL, `liked_timestamp` TEXT, `is_permanent` INTEGER NOT NULL, `name_surrogate` TEXT NOT NULL, `liked` INTEGER NOT NULL, `playlist_original_ids` TEXT, `original_id` TEXT NOT NULL, `real_id` TEXT, `name` TEXT NOT NULL, `version` TEXT, `duration` INTEGER NOT NULL, `warning_content` TEXT NOT NULL, `explicit` INTEGER NOT NULL, `available` TEXT NOT NULL, `for_premium` INTEGER NOT NULL, `for_options` TEXT, `lyrics_available` INTEGER NOT NULL, `txt_lyrics_available` INTEGER NOT NULL, `sync_lyrics_available` INTEGER NOT NULL, `track_type` TEXT NOT NULL, `track_source` TEXT, `track_user` TEXT, `ugc_artist_name` TEXT, `track_save_progress` INTEGER NOT NULL, `cover_video_id` TEXT, `cover_url` TEXT, `color_palette` TEXT, `short_description` TEXT, `release_date` TEXT, `integrated_loudness_db` REAL, `true_peak_db` REAL, `track_for_kids` INTEGER NOT NULL, `track_disclaimer` TEXT, `track_fade` TEXT, `special_audio_resources` TEXT, `track_video_clip_ids` TEXT, `album_name` TEXT NOT NULL, `album_id` TEXT NOT NULL, `album_type` TEXT NOT NULL, `cover_uri` TEXT, `vol` INTEGER NOT NULL, `position` INTEGER NOT NULL, PRIMARY KEY(`original_id`, `album_id`))");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `playlist_mview` (`_id` INTEGER NOT NULL, `original_id` TEXT NOT NULL, `uid` TEXT NOT NULL, `uuid` TEXT, `login` TEXT NOT NULL, `user_full_name` TEXT, `name` TEXT NOT NULL, `name_surrogate` TEXT NOT NULL, `description` TEXT, `revision` INTEGER, `snapshot` INTEGER, `created` TEXT NOT NULL, `visibility` TEXT NOT NULL, `sync` INTEGER NOT NULL, `cover_info` TEXT, `position` INTEGER, `liked` INTEGER NOT NULL, `likes_count` INTEGER, `liked_timestamp` TEXT, `auto_generated_type` TEXT, `target_uid` TEXT, `target_login` TEXT, `modified` TEXT, `made_for_genitive` TEXT, `playlist_for_kids` INTEGER NOT NULL, `bg_image_url` TEXT, `bg_video_url` TEXT, `tracks` INTEGER, `tracks_stale` INTEGER, `duration` INTEGER, `tracks_cached` INTEGER, PRIMARY KEY(`original_id`, `uid`))");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `album_mview` (`name` TEXT NOT NULL, `name_surrogate` TEXT NOT NULL, `liked` INTEGER NOT NULL, `timestamp` TEXT NOT NULL, `original_id` TEXT NOT NULL, `for_premium` INTEGER NOT NULL, `for_options` TEXT, `cover_uri` TEXT, `tracks_stale` INTEGER NOT NULL, `original_release_year` TEXT, `album_type` TEXT NOT NULL, `album_meta_type` TEXT, `genre_code` TEXT, `warning_content` TEXT NOT NULL, `short_description` TEXT, `description` TEXT, `likes_count` INTEGER NOT NULL, `album_for_kids` INTEGER NOT NULL, `bg_image_url` TEXT, `sort_order` TEXT, `duration_sec` INTEGER, `bg_video_url` TEXT, `album_disclaimer` TEXT NOT NULL, `available` INTEGER NOT NULL, `version` TEXT, `artist_id` TEXT, `artist_name` TEXT, `artist_disclaimer` TEXT, `artist_name_surrogate` TEXT, `artist_cover_uri` TEXT, `artist_cutout_cover_uri` TEXT, `tracks_cached` INTEGER, PRIMARY KEY(`original_id`))");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `artist_mview` (`name` TEXT NOT NULL, `name_surrogate` TEXT NOT NULL, `liked` INTEGER NOT NULL, `timestamp` TEXT NOT NULL, `original_id` TEXT NOT NULL, `various` INTEGER NOT NULL, `cover_uri` TEXT, `cutout_cover_uri` TEXT, `albums_stale` INTEGER NOT NULL, `tracks_stale` INTEGER NOT NULL, `artist_for_kids` INTEGER NOT NULL, `artist_disclaimer` TEXT, `available` INTEGER NOT NULL, `cover_type` TEXT, `albums` INTEGER, `tracks` INTEGER, `tracks_cached` INTEGER, PRIMARY KEY(`original_id`))");
                p6g.s(xjoVar, "CREATE VIEW `playlist_view` AS SELECT\n  playlist_track._id AS _id,\n  playlist_track.playlist_id AS playlist_id,\n  playlist_track.timestamp AS timestamp,\n  playlist_track.position AS position_playlist,\n  playlist_track.album_id AS playlist_album_id,\n  track.duration AS duration,\n  track.name AS name,\n  track.name_surrogate AS name_surrogate,\n  track.version AS version,\n  track.original_id AS original_id,\n  track.real_id AS real_id,\n  track.warning_content AS warning_content,\n  track.explicit AS explicit,\n  track.available AS available,\n  track.for_premium AS for_premium,\n  track.for_options AS for_options,\n  track.lyrics_available AS lyrics_available,\n  track.txt_lyrics_available AS txt_lyrics_available,\n  track.sync_lyrics_available AS sync_lyrics_available,\n  track.track_type AS track_type,\n  track.track_source AS track_source,\n  track.track_user AS track_user,\n  track.ugc_artist_name AS ugc_artist_name,\n  track.track_save_progress AS track_save_progress,\n  track.cover_video_id AS cover_video_id,\n  track.cover_url AS cover_url,\n  track.color_palette AS color_palette,\n  track.special_audio_resources AS special_audio_resources,\n  track.short_description AS short_description,\n  track.release_date AS release_date,\n  track.track_for_kids AS track_for_kids,\n  track.integrated_loudness_db AS integrated_loudness_db,\n  track.true_peak_db AS true_peak_db,\n  track.track_disclaimer AS track_disclaimer,\n  track.track_fade AS track_fade,\n  track.track_video_clip_ids AS track_video_clip_ids,\n  TrackAlbumData.album_id AS album_id,\n  TrackAlbumData.album_name AS album_name,\n  TrackAlbumData.position AS position,\n  TrackAlbumData.vol AS vol,\n  TrackAlbumData.album_type AS album_type,\n  TrackAlbumData.cover_uri AS cover_uri,\n  TrackArtistData.artist_id AS artist_id,\n  TrackArtistData.artist_name AS artist_name,\n  TrackArtistData.artist_track_various AS artist_track_various,\n  TrackArtistData.artist_track_cover_uri AS artist_track_cover_uri,\n  TrackArtistData.artist_track_cutout_cover_uri AS artist_track_cutout_cover_uri,\n  TrackArtistData.artist_cover_type AS artist_cover_type,\n  TrackArtistData.artist_disclaimer AS artist_disclaimer,\n  TrackArtistData.artist_name_surrogate AS artist_name_surrogate\nFROM\n  playlist_track\n  JOIN track ON track.original_id = playlist_track.track_id\n  JOIN (\n    SELECT\n      album_track.track_id AS track_id,\n      -- We must pick one album from grouping. So we album_id special column as a MAX(), other columns are bare\n      -- https://sqlite.org/lang_select.html#bare_columns_in_an_aggregate_query\n      MAX(album_track.album_id),\n      album.original_id AS album_id,\n      album.name AS album_name,\n      album.album_type AS album_type,\n      album.cover_uri AS cover_uri,\n      album_track.position AS position,\n      album_track.vol AS vol\n    FROM album_track JOIN album ON album.original_id = album_track.album_id\n    GROUP BY album_track.track_id\n  ) AS TrackAlbumData ON TrackAlbumData.track_id = playlist_track.track_id\n  JOIN (\n    SELECT\n      artist_track.track_id AS track_id,\n      GROUP_CONCAT(artist_track.artist_id || '#|') AS artist_id,\n      GROUP_CONCAT(artist_track.artist_name || '#|') AS artist_name,\n      GROUP_CONCAT(artist_track.artist_track_various || '#|') AS artist_track_various,\n      GROUP_CONCAT(COALESCE(artist_track.artist_track_cover_uri, 'null') || '#|') AS artist_track_cover_uri,\n      GROUP_CONCAT(COALESCE(artist_track.artist_track_cutout_cover_uri, 'null') || '#|') AS artist_track_cutout_cover_uri,\n      GROUP_CONCAT(COALESCE(artist_track.artist_cover_type, 'null') || '#|') AS artist_cover_type,\n      GROUP_CONCAT(COALESCE(artist.artist_disclaimer, 'null') || '#|') AS artist_disclaimer,\n      GROUP_CONCAT(artist.name_surrogate || '#|') AS artist_name_surrogate\n    FROM artist_track JOIN artist ON artist.original_id = artist_track.artist_id\n    GROUP BY artist_track.track_id\n  ) AS TrackArtistData ON TrackArtistData.track_id = playlist_track.track_id");
                p6g.s(xjoVar, "CREATE VIEW `track_view` AS SELECT\n  track.duration AS duration,\n  track.name AS name,\n  track.version AS version,\n  track.original_id AS original_id,\n  track.real_id AS real_id,\n  track.warning_content AS warning_content,\n  track.explicit AS explicit,\n  track.available AS available,\n  track.for_premium AS for_premium,\n  track.for_options AS for_options,\n  track.lyrics_available AS lyrics_available,\n  track.txt_lyrics_available AS txt_lyrics_available,\n  track.sync_lyrics_available AS sync_lyrics_available,\n  track.track_type AS track_type,\n  track.track_source AS track_source,\n  track.track_user AS track_user,\n  track.ugc_artist_name AS ugc_artist_name,\n  track.track_save_progress AS track_save_progress,\n  track.cover_video_id AS cover_video_id,\n  track.cover_url AS cover_url,\n  track.color_palette AS color_palette,\n  track.short_description AS short_description,\n  track.release_date AS release_date,\n  track.track_for_kids AS track_for_kids,\n  track.integrated_loudness_db AS integrated_loudness_db,\n  track.true_peak_db AS true_peak_db,\n  track.track_disclaimer AS track_disclaimer,\n  track.track_fade AS track_fade,\n  track.special_audio_resources AS special_audio_resources,\n  track.track_video_clip_ids AS track_video_clip_ids,\n  album_track.album_id AS album_id,\n  album_track.album_name AS album_name,\n  album_track.vol AS vol,\n  album_track.position AS position,\n  artist_track.artist_id AS artist_id,\n  artist_track.artist_name AS artist_name,\n  artist_track.artist_track_various AS artist_track_various,\n  artist_track.artist_track_cover_uri AS artist_track_cover_uri,\n  artist_track.artist_track_cutout_cover_uri AS artist_track_cutout_cover_uri,\n  artist.artist_disclaimer AS artist_disclaimer,\n  album.original_release_year AS original_release_year,\n  album.cover_uri AS cover_uri,\n  album.album_type AS album_type,\n  album.sort_order AS sort_order\nFROM\n  track\n  JOIN artist_track ON artist_track.track_id = track.original_id\n  JOIN artist ON artist.original_id = artist_track.artist_id\n  JOIN album_track ON album_track.track_id = track.original_id\n  JOIN album ON album.original_id = album_track.album_id\nGROUP BY\n  track.original_id,\n  album_track.album_id,\n  artist_track.artist_id");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                p6g.s(xjoVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a644f63b7ee71329b003f7ab81813257')");
                break;
            case 2:
                v3w.j(xjoVar, xjoVar, "CREATE TABLE IF NOT EXISTS `PlayAudioBundle` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mAddTracksToPlayerTime` TEXT, `mAlbumID` TEXT, `mAliceSessionId` TEXT, `mAudioAuto` TEXT, `mAudioOutputName` TEXT, `mAudioOutputType` TEXT, `mBlockId` TEXT, `batchId` TEXT, `pumpkin` INTEGER, `autoflow` INTEGER, `offlineWave` INTEGER, `mContext` TEXT, `mContextItem` TEXT, `mEndPosition` REAL, `seeked` INTEGER, `paused` INTEGER, `mEntityId` TEXT, `mEventId` TEXT, `mFrom` TEXT, `repeated` INTEGER, `mGenerativeStreamId` TEXT, `mIsFromCache` INTEGER, `mListenActivity` TEXT, `mMeta` TEXT, `startTimestamp` TEXT, `mPlayedTime` TEXT, `mPlaylistId` TEXT, `mRadioSessionId` TEXT, `mStartPosition` REAL, `mTotalPlayedTime` REAL, `mTrackID` TEXT, `mTrackLength` REAL, `mUniquePlayId` TEXT, `mUserID` TEXT, `maxPlayerStage` TEXT, `isSmartPreview` INTEGER DEFAULT 0, `navigationId` TEXT, `utmCampaign` TEXT, `utmMedium` TEXT, `utmSource` TEXT, `utmTerm` TEXT, `yclid` TEXT, `playbackActionId` TEXT, `changeReason` TEXT, `continued` INTEGER, `expectedTrackLength` REAL, `fadeMode` TEXT, `isLivePlayableIndex` INTEGER)", xjoVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_PlayAudioBundle_mUniquePlayId_mListenActivity` ON `PlayAudioBundle` (`mUniquePlayId`, `mListenActivity`)");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                p6g.s(xjoVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4a5dc0093ec1ff6a2328f6ca2e4ee09d')");
                break;
            case 3:
                v3w.j(xjoVar, xjoVar, "CREATE TABLE IF NOT EXISTS `playbackSpeed` (`albumId` TEXT NOT NULL, `playbackSpeed` INTEGER NOT NULL, PRIMARY KEY(`albumId`))", xjoVar, "CREATE TABLE IF NOT EXISTS `albumTrackOrder` (`albumId` TEXT NOT NULL, `trackOrder` INTEGER NOT NULL, PRIMARY KEY(`albumId`))");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `tracks_cache` (`track_id` TEXT NOT NULL, `quality` TEXT NOT NULL, `storage` TEXT NOT NULL, `cache_type` TEXT NOT NULL DEFAULT 'Temp', `container` TEXT NOT NULL, `added_timestamp` INTEGER NOT NULL, `uri` TEXT NOT NULL, `gain` INTEGER, `truePeakDb` REAL, `integratedLoudnessDb` REAL, `codec` TEXT NOT NULL DEFAULT 'unknown', `bitrate` INTEGER NOT NULL DEFAULT 0, `realQuality` TEXT NOT NULL DEFAULT 'Normal', PRIMARY KEY(`track_id`, `quality`, `storage`))");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `playbackProgress` (`trackId` TEXT NOT NULL, `progress` INTEGER NOT NULL, `complete` INTEGER NOT NULL, `updateTimeMills` INTEGER NOT NULL, `totalLengthMills` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`trackId`))");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `downloadedAlbums` (`albumId` TEXT NOT NULL, `downloadedTimestamp` INTEGER NOT NULL, PRIMARY KEY(`albumId`))");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `downloadedPlaylists` (`userUid` TEXT NOT NULL, `userLogin` TEXT NOT NULL, `userName` TEXT, `kind` TEXT NOT NULL, `downloadedTimestamp` INTEGER NOT NULL, PRIMARY KEY(`userUid`, `kind`))");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `wave_feedback` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type` TEXT NOT NULL, `rotor_session_id` TEXT NOT NULL, `seeds` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `track_id` TEXT, `total_played_ms` INTEGER, `track_duration_ms` INTEGER, `playable_from` TEXT NOT NULL, `batch_id` TEXT)");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `auto_tracks_cache_info` (`track_id` TEXT NOT NULL, `cache_info` TEXT NOT NULL, PRIMARY KEY(`track_id`))");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                p6g.s(xjoVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ac758d6acb5e4155290ba86f26b39946')");
                break;
            case 4:
                v3w.j(xjoVar, xjoVar, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", xjoVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                p6g.s(xjoVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                p6g.s(xjoVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                p6g.s(xjoVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                p6g.s(xjoVar, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                p6g.s(xjoVar, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                p6g.s(xjoVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
                break;
            default:
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `diary_method` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `isUiMethod` INTEGER NOT NULL, `issuedAt` INTEGER NOT NULL, `uploadId` INTEGER)");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `diary_parameter` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `methodName` TEXT NOT NULL, `value` TEXT NOT NULL, `issuedAt` INTEGER NOT NULL, `uploadId` INTEGER)");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `diary_upload` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `uploadedAt` INTEGER NOT NULL)");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `modern_auth_cookie` (`uid` TEXT NOT NULL, `cookies` TEXT NOT NULL, `domain` TEXT NOT NULL DEFAULT '', PRIMARY KEY(`uid`, `domain`))");
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                p6g.s(xjoVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '51126f9ef807fa748bae1e4190fbd279')");
                break;
        }
    }

    @Override // defpackage.yeo
    public final void b(xjo xjoVar) {
        switch (this.d) {
            case 0:
                v3w.j(xjoVar, xjoVar, "DROP TABLE IF EXISTS `artistDisclaimers`", xjoVar, "DROP TABLE IF EXISTS `disclaimers`");
                break;
            case 1:
                v3w.j(xjoVar, xjoVar, "DROP TABLE IF EXISTS `album_operation`", xjoVar, "DROP TABLE IF EXISTS `artist_operation`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `playlist_operation`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `video_clip_operation`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `track_operation`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `artist`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `album`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `playlist`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `track`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `album_track`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `artist_track`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `album_artist`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `playlist_track`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `pre_saves`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `pre_save_operation`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `tracks_cache_mirror`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `phonotekaSyncSavedTrack`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `video_clip`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `video_clip_artist`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `video_clip_track`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `track_mview`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `playlist_mview`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `album_mview`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `artist_mview`");
                p6g.s(xjoVar, "DROP VIEW IF EXISTS `playlist_view`");
                p6g.s(xjoVar, "DROP VIEW IF EXISTS `track_view`");
                break;
            case 2:
                xjoVar.getClass();
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `PlayAudioBundle`");
                break;
            case 3:
                v3w.j(xjoVar, xjoVar, "DROP TABLE IF EXISTS `playbackSpeed`", xjoVar, "DROP TABLE IF EXISTS `albumTrackOrder`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `tracks_cache`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `playbackProgress`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `downloadedAlbums`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `downloadedPlaylists`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `wave_feedback`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `auto_tracks_cache_info`");
                break;
            case 4:
                v3w.j(xjoVar, xjoVar, "DROP TABLE IF EXISTS `Dependency`", xjoVar, "DROP TABLE IF EXISTS `WorkSpec`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `WorkTag`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `SystemIdInfo`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `WorkName`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `WorkProgress`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `Preference`");
                break;
            default:
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `diary_method`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `diary_parameter`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `diary_upload`");
                p6g.s(xjoVar, "DROP TABLE IF EXISTS `modern_auth_cookie`");
                break;
        }
    }

    @Override // defpackage.yeo
    public final void c(xjo xjoVar) {
        switch (this.d) {
            case 0:
                xjoVar.getClass();
                break;
            case 1:
                xjoVar.getClass();
                break;
            case 2:
                xjoVar.getClass();
                break;
            case 3:
                xjoVar.getClass();
                break;
            case 4:
                xjoVar.getClass();
                break;
        }
    }

    @Override // defpackage.yeo
    public final void d(xjo xjoVar) {
        int i = this.d;
        ueo ueoVar = this.e;
        switch (i) {
            case 0:
                xjoVar.getClass();
                ((DisclaimerDatabase_Impl) ueoVar).q(xjoVar);
                break;
            case 1:
                xjoVar.getClass();
                int i2 = MainDatabase_Impl.L;
                ((MainDatabase_Impl) ueoVar).q(xjoVar);
                break;
            case 2:
                xjoVar.getClass();
                ((PlayAudioDatabase_Impl) ueoVar).q(xjoVar);
                break;
            case 3:
                xjoVar.getClass();
                int i3 = UserDatabase_Impl.w;
                ((UserDatabase_Impl) ueoVar).q(xjoVar);
                break;
            case 4:
                xjoVar.getClass();
                p6g.s(xjoVar, "PRAGMA foreign_keys = ON");
                ((WorkDatabase_Impl) ueoVar).q(xjoVar);
                break;
            default:
                ((PassportDatabase_Impl) ueoVar).q(xjoVar);
                break;
        }
    }

    @Override // defpackage.yeo
    public final void e(xjo xjoVar) {
        switch (this.d) {
            case 0:
                xjoVar.getClass();
                break;
            case 1:
                xjoVar.getClass();
                break;
            case 2:
                xjoVar.getClass();
                break;
            case 3:
                xjoVar.getClass();
                break;
            case 4:
                xjoVar.getClass();
                break;
        }
    }

    @Override // defpackage.yeo
    public final void f(xjo xjoVar) {
        switch (this.d) {
            case 0:
                xjoVar.getClass();
                up6.r(xjoVar);
                break;
            case 1:
                xjoVar.getClass();
                up6.r(xjoVar);
                break;
            case 2:
                xjoVar.getClass();
                up6.r(xjoVar);
                break;
            case 3:
                xjoVar.getClass();
                up6.r(xjoVar);
                break;
            case 4:
                xjoVar.getClass();
                up6.r(xjoVar);
                break;
            default:
                up6.r(xjoVar);
                break;
        }
    }

    @Override // defpackage.yeo
    public final c7f g(xjo xjoVar) {
        switch (this.d) {
            case 0:
                xjoVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("_id", new c2s(1, 1, "_id", "INTEGER", null, true));
                linkedHashMap.put("artistId", new c2s(0, 1, "artistId", "TEXT", null, true));
                LinkedHashSet i = v3w.i(linkedHashMap, "foreignAgentText", new c2s(0, 1, "foreignAgentText", "TEXT", null, true));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(new e2s("index_artistDisclaimers_artistId", true, t75.c("artistId"), t75.c("ASC")));
                f2s f2sVar = new f2s("artistDisclaimers", linkedHashMap, i, linkedHashSet);
                f2s J = pcg.J(xjoVar, "artistDisclaimers");
                if (!f2sVar.equals(J)) {
                    return new c7f(false, v3w.d("artistDisclaimers(com.yandex.music.shared.disclaimers.db.ArtistDisclaimerEntity).\n Expected:\n", f2sVar, "\n Found:\n", J), 1);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("_id", new c2s(1, 1, "_id", "INTEGER", null, true));
                linkedHashMap2.put(ConnectableDevice.KEY_ID, new c2s(0, 1, ConnectableDevice.KEY_ID, "TEXT", null, true));
                linkedHashMap2.put("type", new c2s(0, 1, "type", "TEXT", null, true));
                linkedHashMap2.put("reason", new c2s(0, 1, "reason", "TEXT", null, false));
                linkedHashMap2.put("title", new c2s(0, 1, "title", "TEXT", null, false));
                linkedHashMap2.put(DeviceService.KEY_DESC, new c2s(0, 1, DeviceService.KEY_DESC, "TEXT", null, false));
                linkedHashMap2.put("detailsText", new c2s(0, 1, "detailsText", "TEXT", null, false));
                LinkedHashSet i2 = v3w.i(linkedHashMap2, "detailsUrl", new c2s(0, 1, "detailsUrl", "TEXT", null, false));
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                linkedHashSet2.add(new e2s("index_disclaimers_id_type", true, u75.h(ConnectableDevice.KEY_ID, "type"), u75.h("ASC", "ASC")));
                f2s f2sVar2 = new f2s("disclaimers", linkedHashMap2, i2, linkedHashSet2);
                f2s J2 = pcg.J(xjoVar, "disclaimers");
                return !f2sVar2.equals(J2) ? new c7f(false, v3w.d("disclaimers(com.yandex.music.shared.disclaimers.db.DisclaimerEntity).\n Expected:\n", f2sVar2, "\n Found:\n", J2), 1) : new c7f(true, (String) null, 1);
            case 1:
                return k(xjoVar);
            case 2:
                xjoVar.getClass();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("_id", new c2s(1, 1, "_id", "INTEGER", null, true));
                linkedHashMap3.put("mAddTracksToPlayerTime", new c2s(0, 1, "mAddTracksToPlayerTime", "TEXT", null, false));
                linkedHashMap3.put("mAlbumID", new c2s(0, 1, "mAlbumID", "TEXT", null, false));
                linkedHashMap3.put("mAliceSessionId", new c2s(0, 1, "mAliceSessionId", "TEXT", null, false));
                linkedHashMap3.put("mAudioAuto", new c2s(0, 1, "mAudioAuto", "TEXT", null, false));
                linkedHashMap3.put("mAudioOutputName", new c2s(0, 1, "mAudioOutputName", "TEXT", null, false));
                linkedHashMap3.put("mAudioOutputType", new c2s(0, 1, "mAudioOutputType", "TEXT", null, false));
                linkedHashMap3.put("mBlockId", new c2s(0, 1, "mBlockId", "TEXT", null, false));
                linkedHashMap3.put("batchId", new c2s(0, 1, "batchId", "TEXT", null, false));
                linkedHashMap3.put("pumpkin", new c2s(0, 1, "pumpkin", "INTEGER", null, false));
                linkedHashMap3.put("autoflow", new c2s(0, 1, "autoflow", "INTEGER", null, false));
                linkedHashMap3.put("offlineWave", new c2s(0, 1, "offlineWave", "INTEGER", null, false));
                linkedHashMap3.put("mContext", new c2s(0, 1, "mContext", "TEXT", null, false));
                linkedHashMap3.put("mContextItem", new c2s(0, 1, "mContextItem", "TEXT", null, false));
                linkedHashMap3.put("mEndPosition", new c2s(0, 1, "mEndPosition", "REAL", null, false));
                linkedHashMap3.put("seeked", new c2s(0, 1, "seeked", "INTEGER", null, false));
                linkedHashMap3.put("paused", new c2s(0, 1, "paused", "INTEGER", null, false));
                linkedHashMap3.put("mEntityId", new c2s(0, 1, "mEntityId", "TEXT", null, false));
                linkedHashMap3.put("mEventId", new c2s(0, 1, "mEventId", "TEXT", null, false));
                linkedHashMap3.put("mFrom", new c2s(0, 1, "mFrom", "TEXT", null, false));
                linkedHashMap3.put("repeated", new c2s(0, 1, "repeated", "INTEGER", null, false));
                linkedHashMap3.put("mGenerativeStreamId", new c2s(0, 1, "mGenerativeStreamId", "TEXT", null, false));
                linkedHashMap3.put("mIsFromCache", new c2s(0, 1, "mIsFromCache", "INTEGER", null, false));
                linkedHashMap3.put("mListenActivity", new c2s(0, 1, "mListenActivity", "TEXT", null, false));
                linkedHashMap3.put("mMeta", new c2s(0, 1, "mMeta", "TEXT", null, false));
                linkedHashMap3.put("startTimestamp", new c2s(0, 1, "startTimestamp", "TEXT", null, false));
                linkedHashMap3.put("mPlayedTime", new c2s(0, 1, "mPlayedTime", "TEXT", null, false));
                linkedHashMap3.put("mPlaylistId", new c2s(0, 1, "mPlaylistId", "TEXT", null, false));
                linkedHashMap3.put("mRadioSessionId", new c2s(0, 1, "mRadioSessionId", "TEXT", null, false));
                linkedHashMap3.put("mStartPosition", new c2s(0, 1, "mStartPosition", "REAL", null, false));
                linkedHashMap3.put("mTotalPlayedTime", new c2s(0, 1, "mTotalPlayedTime", "REAL", null, false));
                linkedHashMap3.put("mTrackID", new c2s(0, 1, "mTrackID", "TEXT", null, false));
                linkedHashMap3.put("mTrackLength", new c2s(0, 1, "mTrackLength", "REAL", null, false));
                linkedHashMap3.put("mUniquePlayId", new c2s(0, 1, "mUniquePlayId", "TEXT", null, false));
                linkedHashMap3.put("mUserID", new c2s(0, 1, "mUserID", "TEXT", null, false));
                linkedHashMap3.put("maxPlayerStage", new c2s(0, 1, "maxPlayerStage", "TEXT", null, false));
                linkedHashMap3.put("isSmartPreview", new c2s(0, 1, "isSmartPreview", "INTEGER", CommonUrlParts.Values.FALSE_INTEGER, false));
                linkedHashMap3.put("navigationId", new c2s(0, 1, "navigationId", "TEXT", null, false));
                linkedHashMap3.put("utmCampaign", new c2s(0, 1, "utmCampaign", "TEXT", null, false));
                linkedHashMap3.put("utmMedium", new c2s(0, 1, "utmMedium", "TEXT", null, false));
                linkedHashMap3.put("utmSource", new c2s(0, 1, "utmSource", "TEXT", null, false));
                linkedHashMap3.put("utmTerm", new c2s(0, 1, "utmTerm", "TEXT", null, false));
                linkedHashMap3.put("yclid", new c2s(0, 1, "yclid", "TEXT", null, false));
                linkedHashMap3.put("playbackActionId", new c2s(0, 1, "playbackActionId", "TEXT", null, false));
                linkedHashMap3.put("changeReason", new c2s(0, 1, "changeReason", "TEXT", null, false));
                linkedHashMap3.put("continued", new c2s(0, 1, "continued", "INTEGER", null, false));
                linkedHashMap3.put("expectedTrackLength", new c2s(0, 1, "expectedTrackLength", "REAL", null, false));
                linkedHashMap3.put("fadeMode", new c2s(0, 1, "fadeMode", "TEXT", null, false));
                LinkedHashSet i3 = v3w.i(linkedHashMap3, "isLivePlayableIndex", new c2s(0, 1, "isLivePlayableIndex", "INTEGER", null, false));
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                linkedHashSet3.add(new e2s("index_PlayAudioBundle_mUniquePlayId_mListenActivity", true, u75.h("mUniquePlayId", "mListenActivity"), u75.h("ASC", "ASC")));
                f2s f2sVar3 = new f2s("PlayAudioBundle", linkedHashMap3, i3, linkedHashSet3);
                f2s J3 = pcg.J(xjoVar, "PlayAudioBundle");
                return !f2sVar3.equals(J3) ? new c7f(false, v3w.d("PlayAudioBundle(com.yandex.music.shared.play.audio2.db.PlayAudioEntity).\n Expected:\n", f2sVar3, "\n Found:\n", J3), 1) : new c7f(true, (String) null, 1);
            case 3:
                xjoVar.getClass();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                linkedHashMap4.put("albumId", new c2s(1, 1, "albumId", "TEXT", null, true));
                f2s f2sVar4 = new f2s("playbackSpeed", linkedHashMap4, v3w.i(linkedHashMap4, "playbackSpeed", new c2s(0, 1, "playbackSpeed", "INTEGER", null, true)), new LinkedHashSet());
                f2s J4 = pcg.J(xjoVar, "playbackSpeed");
                if (!f2sVar4.equals(J4)) {
                    return new c7f(false, v3w.d("playbackSpeed(com.yandex.music.databases.user.playback.speed.PlaybackSpeedDbRow).\n Expected:\n", f2sVar4, "\n Found:\n", J4), 1);
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                linkedHashMap5.put("albumId", new c2s(1, 1, "albumId", "TEXT", null, true));
                f2s f2sVar5 = new f2s("albumTrackOrder", linkedHashMap5, v3w.i(linkedHashMap5, "trackOrder", new c2s(0, 1, "trackOrder", "INTEGER", null, true)), new LinkedHashSet());
                f2s J5 = pcg.J(xjoVar, "albumTrackOrder");
                if (!f2sVar5.equals(J5)) {
                    return new c7f(false, v3w.d("albumTrackOrder(com.yandex.music.databases.user.albumorder.AlbumTrackOrderDbRow).\n Expected:\n", f2sVar5, "\n Found:\n", J5), 1);
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                linkedHashMap6.put("track_id", new c2s(1, 1, "track_id", "TEXT", null, true));
                linkedHashMap6.put("quality", new c2s(2, 1, "quality", "TEXT", null, true));
                linkedHashMap6.put("storage", new c2s(3, 1, "storage", "TEXT", null, true));
                linkedHashMap6.put("cache_type", new c2s(0, 1, "cache_type", "TEXT", "'Temp'", true));
                linkedHashMap6.put("container", new c2s(0, 1, "container", "TEXT", null, true));
                linkedHashMap6.put("added_timestamp", new c2s(0, 1, "added_timestamp", "INTEGER", null, true));
                linkedHashMap6.put("uri", new c2s(0, 1, "uri", "TEXT", null, true));
                linkedHashMap6.put("gain", new c2s(0, 1, "gain", "INTEGER", null, false));
                linkedHashMap6.put("truePeakDb", new c2s(0, 1, "truePeakDb", "REAL", null, false));
                linkedHashMap6.put("integratedLoudnessDb", new c2s(0, 1, "integratedLoudnessDb", "REAL", null, false));
                linkedHashMap6.put("codec", new c2s(0, 1, "codec", "TEXT", "'unknown'", true));
                linkedHashMap6.put("bitrate", new c2s(0, 1, "bitrate", "INTEGER", CommonUrlParts.Values.FALSE_INTEGER, true));
                f2s f2sVar6 = new f2s("tracks_cache", linkedHashMap6, v3w.i(linkedHashMap6, "realQuality", new c2s(0, 1, "realQuality", "TEXT", "'Normal'", true)), new LinkedHashSet());
                f2s J6 = pcg.J(xjoVar, "tracks_cache");
                if (!f2sVar6.equals(J6)) {
                    return new c7f(false, v3w.d("tracks_cache(com.yandex.music.databases.user.cache.TracksCacheDbRow).\n Expected:\n", f2sVar6, "\n Found:\n", J6), 1);
                }
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                linkedHashMap7.put("trackId", new c2s(1, 1, "trackId", "TEXT", null, true));
                linkedHashMap7.put("progress", new c2s(0, 1, "progress", "INTEGER", null, true));
                linkedHashMap7.put("complete", new c2s(0, 1, "complete", "INTEGER", null, true));
                linkedHashMap7.put("updateTimeMills", new c2s(0, 1, "updateTimeMills", "INTEGER", null, true));
                f2s f2sVar7 = new f2s("playbackProgress", linkedHashMap7, v3w.i(linkedHashMap7, "totalLengthMills", new c2s(0, 1, "totalLengthMills", "INTEGER", CommonUrlParts.Values.FALSE_INTEGER, true)), new LinkedHashSet());
                f2s J7 = pcg.J(xjoVar, "playbackProgress");
                if (!f2sVar7.equals(J7)) {
                    return new c7f(false, v3w.d("playbackProgress(com.yandex.music.databases.user.playback.progress.PlaybackProgressDbRow).\n Expected:\n", f2sVar7, "\n Found:\n", J7), 1);
                }
                LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                linkedHashMap8.put("albumId", new c2s(1, 1, "albumId", "TEXT", null, true));
                f2s f2sVar8 = new f2s("downloadedAlbums", linkedHashMap8, v3w.i(linkedHashMap8, "downloadedTimestamp", new c2s(0, 1, "downloadedTimestamp", "INTEGER", null, true)), new LinkedHashSet());
                f2s J8 = pcg.J(xjoVar, "downloadedAlbums");
                if (!f2sVar8.equals(J8)) {
                    return new c7f(false, v3w.d("downloadedAlbums(com.yandex.music.databases.user.downloaded.album.DownloadedAlbumDbRow).\n Expected:\n", f2sVar8, "\n Found:\n", J8), 1);
                }
                LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                linkedHashMap9.put("userUid", new c2s(1, 1, "userUid", "TEXT", null, true));
                linkedHashMap9.put("userLogin", new c2s(0, 1, "userLogin", "TEXT", null, true));
                linkedHashMap9.put("userName", new c2s(0, 1, "userName", "TEXT", null, false));
                linkedHashMap9.put("kind", new c2s(2, 1, "kind", "TEXT", null, true));
                f2s f2sVar9 = new f2s("downloadedPlaylists", linkedHashMap9, v3w.i(linkedHashMap9, "downloadedTimestamp", new c2s(0, 1, "downloadedTimestamp", "INTEGER", null, true)), new LinkedHashSet());
                f2s J9 = pcg.J(xjoVar, "downloadedPlaylists");
                if (!f2sVar9.equals(J9)) {
                    return new c7f(false, v3w.d("downloadedPlaylists(com.yandex.music.databases.user.downloaded.playlist.DownloadedPlaylistDbRow).\n Expected:\n", f2sVar9, "\n Found:\n", J9), 1);
                }
                LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                linkedHashMap10.put(ConnectableDevice.KEY_ID, new c2s(1, 1, ConnectableDevice.KEY_ID, "INTEGER", null, true));
                linkedHashMap10.put("type", new c2s(0, 1, "type", "TEXT", null, true));
                linkedHashMap10.put("rotor_session_id", new c2s(0, 1, "rotor_session_id", "TEXT", null, true));
                linkedHashMap10.put("seeds", new c2s(0, 1, "seeds", "TEXT", null, true));
                linkedHashMap10.put("timestamp", new c2s(0, 1, "timestamp", "INTEGER", null, true));
                linkedHashMap10.put("track_id", new c2s(0, 1, "track_id", "TEXT", null, false));
                linkedHashMap10.put("total_played_ms", new c2s(0, 1, "total_played_ms", "INTEGER", null, false));
                linkedHashMap10.put("track_duration_ms", new c2s(0, 1, "track_duration_ms", "INTEGER", null, false));
                linkedHashMap10.put("playable_from", new c2s(0, 1, "playable_from", "TEXT", null, true));
                f2s f2sVar10 = new f2s("wave_feedback", linkedHashMap10, v3w.i(linkedHashMap10, "batch_id", new c2s(0, 1, "batch_id", "TEXT", null, false)), new LinkedHashSet());
                f2s J10 = pcg.J(xjoVar, "wave_feedback");
                if (!f2sVar10.equals(J10)) {
                    return new c7f(false, v3w.d("wave_feedback(com.yandex.music.databases.user.wave.WaveFeedbackDbRow).\n Expected:\n", f2sVar10, "\n Found:\n", J10), 1);
                }
                LinkedHashMap linkedHashMap11 = new LinkedHashMap();
                linkedHashMap11.put("track_id", new c2s(1, 1, "track_id", "TEXT", null, true));
                f2s f2sVar11 = new f2s("auto_tracks_cache_info", linkedHashMap11, v3w.i(linkedHashMap11, "cache_info", new c2s(0, 1, "cache_info", "TEXT", null, true)), new LinkedHashSet());
                f2s J11 = pcg.J(xjoVar, "auto_tracks_cache_info");
                return !f2sVar11.equals(J11) ? new c7f(false, v3w.d("auto_tracks_cache_info(com.yandex.music.databases.user.cache.autocache.AutoTracksCacheInfoDbRow).\n Expected:\n", f2sVar11, "\n Found:\n", J11), 1) : new c7f(true, (String) null, 1);
            case 4:
                return l(xjoVar);
            default:
                HashMap hashMap = new HashMap(5);
                hashMap.put(ConnectableDevice.KEY_ID, new c2s(1, 1, ConnectableDevice.KEY_ID, "INTEGER", null, true));
                hashMap.put("name", new c2s(0, 1, "name", "TEXT", null, true));
                hashMap.put("isUiMethod", new c2s(0, 1, "isUiMethod", "INTEGER", null, true));
                hashMap.put("issuedAt", new c2s(0, 1, "issuedAt", "INTEGER", null, true));
                hashMap.put("uploadId", new c2s(0, 1, "uploadId", "INTEGER", null, false));
                f2s f2sVar12 = new f2s("diary_method", hashMap, new HashSet(0), new HashSet(0));
                f2s J12 = pcg.J(xjoVar, "diary_method");
                if (!f2sVar12.equals(J12)) {
                    return new c7f(false, v3w.d("diary_method(com.yandex.passport.internal.database.diary.DiaryMethodEntity).\n Expected:\n", f2sVar12, "\n Found:\n", J12), 1);
                }
                HashMap hashMap2 = new HashMap(6);
                hashMap2.put(ConnectableDevice.KEY_ID, new c2s(1, 1, ConnectableDevice.KEY_ID, "INTEGER", null, true));
                hashMap2.put("name", new c2s(0, 1, "name", "TEXT", null, true));
                hashMap2.put("methodName", new c2s(0, 1, "methodName", "TEXT", null, true));
                hashMap2.put(Constants.KEY_VALUE, new c2s(0, 1, Constants.KEY_VALUE, "TEXT", null, true));
                hashMap2.put("issuedAt", new c2s(0, 1, "issuedAt", "INTEGER", null, true));
                hashMap2.put("uploadId", new c2s(0, 1, "uploadId", "INTEGER", null, false));
                f2s f2sVar13 = new f2s("diary_parameter", hashMap2, new HashSet(0), new HashSet(0));
                f2s J13 = pcg.J(xjoVar, "diary_parameter");
                if (!f2sVar13.equals(J13)) {
                    return new c7f(false, v3w.d("diary_parameter(com.yandex.passport.internal.database.diary.DiaryParameterEntity).\n Expected:\n", f2sVar13, "\n Found:\n", J13), 1);
                }
                HashMap hashMap3 = new HashMap(2);
                hashMap3.put(ConnectableDevice.KEY_ID, new c2s(1, 1, ConnectableDevice.KEY_ID, "INTEGER", null, true));
                hashMap3.put("uploadedAt", new c2s(0, 1, "uploadedAt", "INTEGER", null, true));
                f2s f2sVar14 = new f2s("diary_upload", hashMap3, new HashSet(0), new HashSet(0));
                f2s J14 = pcg.J(xjoVar, "diary_upload");
                if (!f2sVar14.equals(J14)) {
                    return new c7f(false, v3w.d("diary_upload(com.yandex.passport.internal.database.diary.DiaryUploadEntity).\n Expected:\n", f2sVar14, "\n Found:\n", J14), 1);
                }
                HashMap hashMap4 = new HashMap(3);
                hashMap4.put("uid", new c2s(1, 1, "uid", "TEXT", null, true));
                hashMap4.put("cookies", new c2s(0, 1, "cookies", "TEXT", null, true));
                hashMap4.put("domain", new c2s(2, 1, "domain", "TEXT", "''", true));
                f2s f2sVar15 = new f2s("modern_auth_cookie", hashMap4, new HashSet(0), new HashSet(0));
                f2s J15 = pcg.J(xjoVar, "modern_auth_cookie");
                return !f2sVar15.equals(J15) ? new c7f(false, v3w.d("modern_auth_cookie(com.yandex.passport.internal.database.auth_cookie.AuthCookieEntity).\n Expected:\n", f2sVar15, "\n Found:\n", J15), 1) : new c7f(true, (String) null, 1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e58(DisclaimerDatabase_Impl disclaimerDatabase_Impl) {
        super(3, "84a06c641b70e6d557d24bbad59ec5ff", "60805cdbed1735c0b5f7a400d86bbfd2");
        this.e = disclaimerDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e58(PassportDatabase_Impl passportDatabase_Impl) {
        super(3, "51126f9ef807fa748bae1e4190fbd279", "ada19719cca56d05ee2aa2bb2b6f85c5");
        this.e = passportDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e58(WorkDatabase_Impl workDatabase_Impl) {
        super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        this.e = workDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e58(UserDatabase_Impl userDatabase_Impl) {
        super(22, "ac758d6acb5e4155290ba86f26b39946", "d9ef644300581aeb5450e9fe8fd46b5d");
        this.e = userDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e58(MainDatabase_Impl mainDatabase_Impl) {
        super(156, "a644f63b7ee71329b003f7ab81813257", "0522a2c7092d8c9404329f63b91bcfa1");
        this.e = mainDatabase_Impl;
    }

    private final void i(xjo xjoVar) {
    }

    private final void j(xjo xjoVar) {
    }
}
