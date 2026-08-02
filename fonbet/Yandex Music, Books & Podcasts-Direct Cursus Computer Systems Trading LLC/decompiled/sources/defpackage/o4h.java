package defpackage;

import com.connectsdk.device.DefaultConnectableDeviceStore;
import com.connectsdk.service.DeviceService;
import com.yandex.auth.LegacyAccountType;

/* loaded from: classes3.dex */
public final class o4h {
    public final ueo a;

    public o4h(ueo ueoVar) {
        this.a = ueoVar;
    }

    public static zv a(cko ckoVar) {
        boolean z;
        boolean z2;
        boolean z3;
        int o = s7g.o(ckoVar, "name");
        int o2 = s7g.o(ckoVar, "name_surrogate");
        int o3 = s7g.o(ckoVar, "liked");
        int o4 = s7g.o(ckoVar, "timestamp");
        int o5 = s7g.o(ckoVar, "original_id");
        int o6 = s7g.o(ckoVar, "for_premium");
        int o7 = s7g.o(ckoVar, "for_options");
        int o8 = s7g.o(ckoVar, "cover_uri");
        int o9 = s7g.o(ckoVar, "tracks_stale");
        int o10 = s7g.o(ckoVar, "original_release_year");
        int o11 = s7g.o(ckoVar, "album_type");
        int o12 = s7g.o(ckoVar, "album_meta_type");
        int o13 = s7g.o(ckoVar, "genre_code");
        int o14 = s7g.o(ckoVar, "warning_content");
        int o15 = s7g.o(ckoVar, "short_description");
        int o16 = s7g.o(ckoVar, DeviceService.KEY_DESC);
        int o17 = s7g.o(ckoVar, "likes_count");
        int o18 = s7g.o(ckoVar, "album_for_kids");
        int o19 = s7g.o(ckoVar, "bg_image_url");
        int o20 = s7g.o(ckoVar, "sort_order");
        int o21 = s7g.o(ckoVar, "duration_sec");
        int o22 = s7g.o(ckoVar, "bg_video_url");
        int o23 = s7g.o(ckoVar, "album_disclaimer");
        int o24 = s7g.o(ckoVar, "available");
        int o25 = s7g.o(ckoVar, "version");
        int o26 = s7g.o(ckoVar, "artist_id");
        int o27 = s7g.o(ckoVar, "artist_name");
        int o28 = s7g.o(ckoVar, "artist_disclaimer");
        int o29 = s7g.o(ckoVar, "artist_name_surrogate");
        int o30 = s7g.o(ckoVar, "artist_cover_uri");
        int o31 = s7g.o(ckoVar, "artist_cutout_cover_uri");
        int o32 = s7g.o(ckoVar, "tracks_cached");
        if (o == -1) {
            xq0.q("Missing column 'name' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x0 = ckoVar.x0(o);
        if (o2 == -1) {
            xq0.q("Missing column 'name_surrogate' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x02 = ckoVar.x0(o2);
        if (o3 != -1) {
            ckoVar.getLong(o3);
        }
        if (o4 == -1) {
            xq0.q("Missing column 'timestamp' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x03 = ckoVar.x0(o4);
        if (o5 == -1) {
            xq0.q("Missing column 'original_id' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x04 = ckoVar.x0(o5);
        if (o6 == -1) {
            z = false;
        } else {
            z = ((int) ckoVar.getLong(o6)) != 0;
        }
        String str = null;
        String x05 = (o7 == -1 || ckoVar.isNull(o7)) ? null : ckoVar.x0(o7);
        String x06 = (o8 == -1 || ckoVar.isNull(o8)) ? null : ckoVar.x0(o8);
        int i = o9 == -1 ? 0 : (int) ckoVar.getLong(o9);
        String x07 = (o10 == -1 || ckoVar.isNull(o10)) ? null : ckoVar.x0(o10);
        if (o11 == -1) {
            xq0.q("Missing column 'album_type' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x08 = ckoVar.x0(o11);
        String x09 = (o12 == -1 || ckoVar.isNull(o12)) ? null : ckoVar.x0(o12);
        String x010 = (o13 == -1 || ckoVar.isNull(o13)) ? null : ckoVar.x0(o13);
        if (o14 == -1) {
            xq0.q("Missing column 'warning_content' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x011 = ckoVar.x0(o14);
        String x012 = (o15 == -1 || ckoVar.isNull(o15)) ? null : ckoVar.x0(o15);
        String x013 = (o16 == -1 || ckoVar.isNull(o16)) ? null : ckoVar.x0(o16);
        int i2 = o17 == -1 ? 0 : (int) ckoVar.getLong(o17);
        if (o18 == -1) {
            z2 = false;
        } else {
            z2 = ((int) ckoVar.getLong(o18)) != 0;
        }
        String x014 = (o19 == -1 || ckoVar.isNull(o19)) ? null : ckoVar.x0(o19);
        String x015 = (o20 == -1 || ckoVar.isNull(o20)) ? null : ckoVar.x0(o20);
        Integer valueOf = (o21 == -1 || ckoVar.isNull(o21)) ? null : Integer.valueOf((int) ckoVar.getLong(o21));
        String x016 = (o22 == -1 || ckoVar.isNull(o22)) ? null : ckoVar.x0(o22);
        if (o23 == -1) {
            xq0.q("Missing column 'album_disclaimer' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x017 = ckoVar.x0(o23);
        if (o24 == -1) {
            z3 = false;
        } else {
            z3 = ((int) ckoVar.getLong(o24)) != 0;
        }
        String x018 = (o25 == -1 || ckoVar.isNull(o25)) ? null : ckoVar.x0(o25);
        String x019 = (o26 == -1 || ckoVar.isNull(o26)) ? null : ckoVar.x0(o26);
        String x020 = (o27 == -1 || ckoVar.isNull(o27)) ? null : ckoVar.x0(o27);
        String x021 = (o28 == -1 || ckoVar.isNull(o28)) ? null : ckoVar.x0(o28);
        if (o29 != -1 && !ckoVar.isNull(o29)) {
            ckoVar.x0(o29);
        }
        String x022 = (o30 == -1 || ckoVar.isNull(o30)) ? null : ckoVar.x0(o30);
        if (o31 != -1 && !ckoVar.isNull(o31)) {
            str = ckoVar.x0(o31);
        }
        String str2 = str;
        if (o32 != -1 && !ckoVar.isNull(o32)) {
            ckoVar.getLong(o32);
        }
        return new zv(x0, x02, x03, x04, z, x05, x06, i, x07, x08, x09, x010, x011, x012, x013, i2, z2, x014, x015, valueOf, x016, x017, z3, x018, x019, x020, x021, x022, str2);
    }

    public static zd1 b(cko ckoVar) {
        int o = s7g.o(ckoVar, "name");
        int o2 = s7g.o(ckoVar, "name_surrogate");
        int o3 = s7g.o(ckoVar, "liked");
        int o4 = s7g.o(ckoVar, "timestamp");
        int o5 = s7g.o(ckoVar, "original_id");
        int o6 = s7g.o(ckoVar, "various");
        int o7 = s7g.o(ckoVar, "cover_uri");
        int o8 = s7g.o(ckoVar, "cutout_cover_uri");
        int o9 = s7g.o(ckoVar, "albums_stale");
        int o10 = s7g.o(ckoVar, "tracks_stale");
        int o11 = s7g.o(ckoVar, "artist_for_kids");
        int o12 = s7g.o(ckoVar, "artist_disclaimer");
        int o13 = s7g.o(ckoVar, "available");
        int o14 = s7g.o(ckoVar, "cover_type");
        int o15 = s7g.o(ckoVar, "albums");
        int o16 = s7g.o(ckoVar, "tracks");
        int o17 = s7g.o(ckoVar, "tracks_cached");
        if (o == -1) {
            xq0.q("Missing column 'name' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x0 = ckoVar.x0(o);
        if (o2 == -1) {
            xq0.q("Missing column 'name_surrogate' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x02 = ckoVar.x0(o2);
        if (o3 != -1) {
            ckoVar.getLong(o3);
        }
        if (o4 == -1) {
            xq0.q("Missing column 'timestamp' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x03 = ckoVar.x0(o4);
        if (o5 == -1) {
            xq0.q("Missing column 'original_id' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x04 = ckoVar.x0(o5);
        if (o6 != -1) {
            ckoVar.getLong(o6);
        }
        Integer num = null;
        String x05 = (o7 == -1 || ckoVar.isNull(o7)) ? null : ckoVar.x0(o7);
        String x06 = (o8 == -1 || ckoVar.isNull(o8)) ? null : ckoVar.x0(o8);
        boolean z = false;
        int i = o9 == -1 ? 0 : (int) ckoVar.getLong(o9);
        int i2 = o10 == -1 ? 0 : (int) ckoVar.getLong(o10);
        if (o11 != -1) {
            ckoVar.getLong(o11);
        }
        String x07 = (o12 == -1 || ckoVar.isNull(o12)) ? null : ckoVar.x0(o12);
        if (o13 != -1 && ((int) ckoVar.getLong(o13)) != 0) {
            z = true;
        }
        boolean z2 = z;
        String x08 = (o14 == -1 || ckoVar.isNull(o14)) ? null : ckoVar.x0(o14);
        Integer valueOf = (o15 == -1 || ckoVar.isNull(o15)) ? null : Integer.valueOf((int) ckoVar.getLong(o15));
        Integer valueOf2 = (o16 == -1 || ckoVar.isNull(o16)) ? null : Integer.valueOf((int) ckoVar.getLong(o16));
        if (o17 != -1 && !ckoVar.isNull(o17)) {
            num = Integer.valueOf((int) ckoVar.getLong(o17));
        }
        return new zd1(x0, x02, x03, x04, x05, x06, i, i2, x07, z2, x08, valueOf, valueOf2, num);
    }

    public static qwl c(cko ckoVar) {
        int o = s7g.o(ckoVar, "_id");
        int o2 = s7g.o(ckoVar, "original_id");
        int o3 = s7g.o(ckoVar, "uid");
        int o4 = s7g.o(ckoVar, "uuid");
        int o5 = s7g.o(ckoVar, LegacyAccountType.STRING_LOGIN);
        int o6 = s7g.o(ckoVar, "user_full_name");
        int o7 = s7g.o(ckoVar, "name");
        int o8 = s7g.o(ckoVar, "name_surrogate");
        int o9 = s7g.o(ckoVar, DeviceService.KEY_DESC);
        int o10 = s7g.o(ckoVar, "revision");
        int o11 = s7g.o(ckoVar, "snapshot");
        int o12 = s7g.o(ckoVar, DefaultConnectableDeviceStore.KEY_CREATED);
        int o13 = s7g.o(ckoVar, "visibility");
        int o14 = s7g.o(ckoVar, "sync");
        int o15 = s7g.o(ckoVar, "cover_info");
        int o16 = s7g.o(ckoVar, "position");
        int o17 = s7g.o(ckoVar, "liked");
        int o18 = s7g.o(ckoVar, "likes_count");
        int o19 = s7g.o(ckoVar, "liked_timestamp");
        int o20 = s7g.o(ckoVar, "auto_generated_type");
        int o21 = s7g.o(ckoVar, "target_uid");
        int o22 = s7g.o(ckoVar, "target_login");
        int o23 = s7g.o(ckoVar, "modified");
        int o24 = s7g.o(ckoVar, "made_for_genitive");
        int o25 = s7g.o(ckoVar, "playlist_for_kids");
        int o26 = s7g.o(ckoVar, "bg_image_url");
        int o27 = s7g.o(ckoVar, "bg_video_url");
        int o28 = s7g.o(ckoVar, "tracks");
        int o29 = s7g.o(ckoVar, "tracks_stale");
        int o30 = s7g.o(ckoVar, "duration");
        int o31 = s7g.o(ckoVar, "tracks_cached");
        long j = o == -1 ? 0L : ckoVar.getLong(o);
        if (o2 == -1) {
            xq0.q("Missing column 'original_id' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x0 = ckoVar.x0(o2);
        if (o3 == -1) {
            xq0.q("Missing column 'uid' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x02 = ckoVar.x0(o3);
        Integer num = null;
        String x03 = (o4 == -1 || ckoVar.isNull(o4)) ? null : ckoVar.x0(o4);
        if (o5 == -1) {
            xq0.q("Missing column 'login' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x04 = ckoVar.x0(o5);
        String x05 = (o6 == -1 || ckoVar.isNull(o6)) ? null : ckoVar.x0(o6);
        if (o7 == -1) {
            xq0.q("Missing column 'name' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x06 = ckoVar.x0(o7);
        if (o8 == -1) {
            xq0.q("Missing column 'name_surrogate' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x07 = ckoVar.x0(o8);
        String x08 = (o9 == -1 || ckoVar.isNull(o9)) ? null : ckoVar.x0(o9);
        Integer valueOf = (o10 == -1 || ckoVar.isNull(o10)) ? null : Integer.valueOf((int) ckoVar.getLong(o10));
        Integer valueOf2 = (o11 == -1 || ckoVar.isNull(o11)) ? null : Integer.valueOf((int) ckoVar.getLong(o11));
        if (o12 == -1) {
            xq0.q("Missing column 'created' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x09 = ckoVar.x0(o12);
        if (o13 == -1) {
            xq0.q("Missing column 'visibility' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x010 = ckoVar.x0(o13);
        boolean z = false;
        int i = o14 == -1 ? 0 : (int) ckoVar.getLong(o14);
        String x011 = (o15 == -1 || ckoVar.isNull(o15)) ? null : ckoVar.x0(o15);
        Long valueOf3 = (o16 == -1 || ckoVar.isNull(o16)) ? null : Long.valueOf(ckoVar.getLong(o16));
        if (o17 != -1) {
            ckoVar.getLong(o17);
        }
        Integer valueOf4 = (o18 == -1 || ckoVar.isNull(o18)) ? null : Integer.valueOf((int) ckoVar.getLong(o18));
        String x012 = (o19 == -1 || ckoVar.isNull(o19)) ? null : ckoVar.x0(o19);
        String x013 = (o20 == -1 || ckoVar.isNull(o20)) ? null : ckoVar.x0(o20);
        String x014 = (o21 == -1 || ckoVar.isNull(o21)) ? null : ckoVar.x0(o21);
        String x015 = (o22 == -1 || ckoVar.isNull(o22)) ? null : ckoVar.x0(o22);
        String x016 = (o23 == -1 || ckoVar.isNull(o23)) ? null : ckoVar.x0(o23);
        String x017 = (o24 == -1 || ckoVar.isNull(o24)) ? null : ckoVar.x0(o24);
        if (o25 != -1 && ((int) ckoVar.getLong(o25)) != 0) {
            z = true;
        }
        boolean z2 = z;
        String x018 = (o26 == -1 || ckoVar.isNull(o26)) ? null : ckoVar.x0(o26);
        String x019 = (o27 == -1 || ckoVar.isNull(o27)) ? null : ckoVar.x0(o27);
        Integer valueOf5 = (o28 == -1 || ckoVar.isNull(o28)) ? null : Integer.valueOf((int) ckoVar.getLong(o28));
        Integer valueOf6 = (o29 == -1 || ckoVar.isNull(o29)) ? null : Integer.valueOf((int) ckoVar.getLong(o29));
        Long valueOf7 = (o30 == -1 || ckoVar.isNull(o30)) ? null : Long.valueOf(ckoVar.getLong(o30));
        if (o31 != -1 && !ckoVar.isNull(o31)) {
            num = Integer.valueOf((int) ckoVar.getLong(o31));
        }
        return new qwl(j, x0, x02, x03, x04, x05, x06, x07, x08, valueOf, valueOf2, x09, x010, i, x011, valueOf3, valueOf4, x012, x013, x014, x015, x016, x017, z2, x018, x019, valueOf5, valueOf6, valueOf7, num);
    }

    public static rxs d(cko ckoVar) {
        String x0;
        int i;
        String x02;
        int i2;
        boolean z;
        boolean z2;
        String x03;
        int i3;
        boolean z3;
        boolean z4;
        boolean z5;
        String x04;
        int i4;
        String x05;
        int i5;
        String x06;
        int i6;
        boolean z6;
        String x07;
        int i7;
        String x08;
        int i8;
        String x09;
        int i9;
        String x010;
        int i10;
        String x011;
        int i11;
        Float valueOf;
        int i12;
        Float valueOf2;
        int i13;
        boolean z7;
        String x012;
        int i14;
        String x013;
        int i15;
        String x014;
        int i16;
        String x015;
        int i17;
        int o = s7g.o(ckoVar, "artist_name");
        int o2 = s7g.o(ckoVar, "artist_name_surrogate");
        int o3 = s7g.o(ckoVar, "artist_id");
        int o4 = s7g.o(ckoVar, "artist_track_various");
        int o5 = s7g.o(ckoVar, "artist_disclaimer");
        int o6 = s7g.o(ckoVar, "artist_track_cover_uri");
        int o7 = s7g.o(ckoVar, "artist_track_cutout_cover_uri");
        int o8 = s7g.o(ckoVar, "artist_cover_type");
        int o9 = s7g.o(ckoVar, "timestamp");
        int o10 = s7g.o(ckoVar, "liked_timestamp");
        int o11 = s7g.o(ckoVar, "is_permanent");
        int o12 = s7g.o(ckoVar, "name_surrogate");
        int o13 = s7g.o(ckoVar, "liked");
        int o14 = s7g.o(ckoVar, "playlist_original_ids");
        int o15 = s7g.o(ckoVar, "original_id");
        int o16 = s7g.o(ckoVar, "real_id");
        int o17 = s7g.o(ckoVar, "name");
        int o18 = s7g.o(ckoVar, "version");
        int o19 = s7g.o(ckoVar, "duration");
        int o20 = s7g.o(ckoVar, "warning_content");
        int o21 = s7g.o(ckoVar, "explicit");
        int o22 = s7g.o(ckoVar, "available");
        int o23 = s7g.o(ckoVar, "for_premium");
        int o24 = s7g.o(ckoVar, "for_options");
        int o25 = s7g.o(ckoVar, "lyrics_available");
        int o26 = s7g.o(ckoVar, "txt_lyrics_available");
        int o27 = s7g.o(ckoVar, "sync_lyrics_available");
        int o28 = s7g.o(ckoVar, "track_type");
        int o29 = s7g.o(ckoVar, "track_source");
        int o30 = s7g.o(ckoVar, "track_user");
        int o31 = s7g.o(ckoVar, "ugc_artist_name");
        int o32 = s7g.o(ckoVar, "track_save_progress");
        int o33 = s7g.o(ckoVar, "cover_video_id");
        int o34 = s7g.o(ckoVar, "cover_url");
        int o35 = s7g.o(ckoVar, "color_palette");
        int o36 = s7g.o(ckoVar, "short_description");
        int o37 = s7g.o(ckoVar, "release_date");
        int o38 = s7g.o(ckoVar, "integrated_loudness_db");
        int o39 = s7g.o(ckoVar, "true_peak_db");
        int o40 = s7g.o(ckoVar, "track_for_kids");
        int o41 = s7g.o(ckoVar, "track_disclaimer");
        int o42 = s7g.o(ckoVar, "track_fade");
        int o43 = s7g.o(ckoVar, "special_audio_resources");
        int o44 = s7g.o(ckoVar, "track_video_clip_ids");
        int o45 = s7g.o(ckoVar, "album_name");
        int o46 = s7g.o(ckoVar, "album_id");
        int o47 = s7g.o(ckoVar, "album_type");
        int o48 = s7g.o(ckoVar, "cover_uri");
        int o49 = s7g.o(ckoVar, "vol");
        int o50 = s7g.o(ckoVar, "position");
        String str = null;
        String x016 = (o == -1 || ckoVar.isNull(o)) ? null : ckoVar.x0(o);
        if (o2 != -1 && !ckoVar.isNull(o2)) {
            ckoVar.x0(o2);
        }
        String x017 = (o3 == -1 || ckoVar.isNull(o3)) ? null : ckoVar.x0(o3);
        String x018 = (o4 == -1 || ckoVar.isNull(o4)) ? null : ckoVar.x0(o4);
        String x019 = (o5 == -1 || ckoVar.isNull(o5)) ? null : ckoVar.x0(o5);
        String x020 = (o6 == -1 || ckoVar.isNull(o6)) ? null : ckoVar.x0(o6);
        String x021 = (o7 == -1 || ckoVar.isNull(o7)) ? null : ckoVar.x0(o7);
        String x022 = (o8 == -1 || ckoVar.isNull(o8)) ? null : ckoVar.x0(o8);
        if (o9 == -1) {
            xq0.q("Missing column 'timestamp' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x023 = ckoVar.x0(o9);
        if (o10 != -1 && !ckoVar.isNull(o10)) {
            ckoVar.x0(o10);
        }
        if (o11 != -1) {
            ckoVar.getLong(o11);
        }
        if (o12 == -1) {
            xq0.q("Missing column 'name_surrogate' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x024 = ckoVar.x0(o12);
        if (o13 != -1) {
            ckoVar.getLong(o13);
        }
        if (o14 != -1 && !ckoVar.isNull(o14)) {
            ckoVar.x0(o14);
        }
        if (o15 == -1) {
            xq0.q("Missing column 'original_id' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x025 = ckoVar.x0(o15);
        if (o16 == -1 || ckoVar.isNull(o16)) {
            i = o17;
            x0 = null;
        } else {
            x0 = ckoVar.x0(o16);
            i = o17;
        }
        if (i == -1) {
            xq0.q("Missing column 'name' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x026 = ckoVar.x0(i);
        if (o18 == -1 || ckoVar.isNull(o18)) {
            i2 = o19;
            x02 = null;
        } else {
            x02 = ckoVar.x0(o18);
            i2 = o19;
        }
        long j = i2 == -1 ? 0L : ckoVar.getLong(i2);
        if (o20 == -1) {
            xq0.q("Missing column 'warning_content' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x027 = ckoVar.x0(o20);
        if (o21 == -1) {
            z = false;
        } else {
            z = ((int) ckoVar.getLong(o21)) != 0;
        }
        if (o22 == -1) {
            xq0.q("Missing column 'available' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x028 = ckoVar.x0(o22);
        if (o23 == -1) {
            z2 = false;
        } else {
            z2 = ((int) ckoVar.getLong(o23)) != 0;
        }
        if (o24 == -1 || ckoVar.isNull(o24)) {
            i3 = o25;
            x03 = null;
        } else {
            x03 = ckoVar.x0(o24);
            i3 = o25;
        }
        if (i3 == -1) {
            z3 = false;
        } else {
            z3 = ((int) ckoVar.getLong(i3)) != 0;
        }
        if (o26 == -1) {
            z4 = false;
        } else {
            z4 = ((int) ckoVar.getLong(o26)) != 0;
        }
        if (o27 == -1) {
            z5 = false;
        } else {
            z5 = ((int) ckoVar.getLong(o27)) != 0;
        }
        if (o28 == -1) {
            xq0.q("Missing column 'track_type' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x029 = ckoVar.x0(o28);
        if (o29 == -1 || ckoVar.isNull(o29)) {
            i4 = o30;
            x04 = null;
        } else {
            x04 = ckoVar.x0(o29);
            i4 = o30;
        }
        if (i4 == -1 || ckoVar.isNull(i4)) {
            i5 = o31;
            x05 = null;
        } else {
            x05 = ckoVar.x0(i4);
            i5 = o31;
        }
        if (i5 == -1 || ckoVar.isNull(i5)) {
            i6 = o32;
            x06 = null;
        } else {
            x06 = ckoVar.x0(i5);
            i6 = o32;
        }
        if (i6 == -1) {
            z6 = false;
        } else {
            z6 = ((int) ckoVar.getLong(i6)) != 0;
        }
        if (o33 == -1 || ckoVar.isNull(o33)) {
            i7 = o34;
            x07 = null;
        } else {
            x07 = ckoVar.x0(o33);
            i7 = o34;
        }
        if (i7 == -1 || ckoVar.isNull(i7)) {
            i8 = o35;
            x08 = null;
        } else {
            x08 = ckoVar.x0(i7);
            i8 = o35;
        }
        if (i8 == -1 || ckoVar.isNull(i8)) {
            i9 = o36;
            x09 = null;
        } else {
            x09 = ckoVar.x0(i8);
            i9 = o36;
        }
        if (i9 == -1 || ckoVar.isNull(i9)) {
            i10 = o37;
            x010 = null;
        } else {
            x010 = ckoVar.x0(i9);
            i10 = o37;
        }
        if (i10 == -1 || ckoVar.isNull(i10)) {
            i11 = o38;
            x011 = null;
        } else {
            x011 = ckoVar.x0(i10);
            i11 = o38;
        }
        if (i11 == -1 || ckoVar.isNull(i11)) {
            i12 = o39;
            valueOf = null;
        } else {
            valueOf = Float.valueOf((float) ckoVar.getDouble(i11));
            i12 = o39;
        }
        if (i12 == -1 || ckoVar.isNull(i12)) {
            i13 = o40;
            valueOf2 = null;
        } else {
            valueOf2 = Float.valueOf((float) ckoVar.getDouble(i12));
            i13 = o40;
        }
        if (i13 == -1) {
            z7 = false;
        } else {
            z7 = ((int) ckoVar.getLong(i13)) != 0;
        }
        if (o41 == -1 || ckoVar.isNull(o41)) {
            i14 = o42;
            x012 = null;
        } else {
            x012 = ckoVar.x0(o41);
            i14 = o42;
        }
        if (i14 == -1 || ckoVar.isNull(i14)) {
            i15 = o43;
            x013 = null;
        } else {
            x013 = ckoVar.x0(i14);
            i15 = o43;
        }
        if (i15 == -1 || ckoVar.isNull(i15)) {
            i16 = o44;
            x014 = null;
        } else {
            x014 = ckoVar.x0(i15);
            i16 = o44;
        }
        if (i16 == -1 || ckoVar.isNull(i16)) {
            i17 = o45;
            x015 = null;
        } else {
            x015 = ckoVar.x0(i16);
            i17 = o45;
        }
        if (i17 == -1) {
            xq0.q("Missing column 'album_name' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x030 = ckoVar.x0(i17);
        if (o46 == -1) {
            xq0.q("Missing column 'album_id' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x031 = ckoVar.x0(o46);
        if (o47 == -1) {
            xq0.q("Missing column 'album_type' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x032 = ckoVar.x0(o47);
        if (o48 != -1 && !ckoVar.isNull(o48)) {
            str = ckoVar.x0(o48);
        }
        return new rxs(new ig5(x025, x0, x026, x02, j, x027, z, x028, z2, x03, z3, z4, z5, x029, x04, x05, x06, z6, x07, x08, x09, x010, x011, valueOf, valueOf2, z7, x012, x013, x014, x015, x030, x031, x032, str, o49 == -1 ? 0 : (int) ckoVar.getLong(o49), o50 != -1 ? (int) ckoVar.getLong(o50) : 0), x016, x017, x018, x019, x020, x021, x022, x023, x024);
    }
}
