package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.provider.Settings;
import android.text.TextUtils;
import com.yandex.auth.LegacyAccountType;
import com.yandex.music.shared.utils.assertions.Assertions;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import ru.yandex.music.data.audio.Album$AlbumType;
import ru.yandex.music.data.audio.WarningContent;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class e5h extends ow7 {
    public final xxq c;
    public final Context d;
    public final p5c e;
    public final l9w f;
    public final p4h g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5h(xxq xxqVar, Context context, p5c p5cVar, l9w l9wVar, p4h p4hVar, ssr ssrVar) {
        super(ssrVar);
        xxqVar.getClass();
        context.getClass();
        ssrVar.getClass();
        this.c = xxqVar;
        this.d = context;
        this.e = p5cVar;
        this.f = l9wVar;
        this.g = p4hVar;
    }

    @Override // defpackage.ow7, defpackage.ssr
    public final void d(rsr rsrVar) {
        rsrVar.getClass();
        this.b.d(rsrVar);
        String a = this.e.a();
        a.getClass();
        xxq xxqVar = this.c;
        xxqVar.getClass();
        k10 k10Var = k10.i;
        String str = k10Var.a;
        String str2 = k10Var.d;
        rsrVar.execSQL("INSERT INTO album(name,name_surrogate,timestamp,warning_content,original_id,album_type,liked,likes_count,for_premium,tracks_stale,album_for_kids,album_disclaimer) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)", new Object[]{str2, q7g.R(str2), "1970-01-01T00:00:00+0000", "NONE", str, Album$AlbumType.COMMON.a, 0, -1, 0, -1, 0, ""});
        zp2 zp2Var = zp2.k;
        String str3 = zp2Var.a;
        String str4 = zp2Var.b;
        rsrVar.execSQL("INSERT INTO artist(name,name_surrogate,timestamp,original_id,liked,disliked,various,artist_for_kids,albums_stale,tracks_stale) VALUES (?,?,?,?,?,?,?,?,?,?)", new Object[]{str4, q7g.R(str4), "1970-01-01T00:00:00+0000", str3, 0, 0, 0, 0, -1, -1});
        if (xxqVar.a()) {
            q7g.L(rsrVar, xxqVar, a, 0, "3");
        }
        q7g.L(rsrVar, xxqVar, "disliked", 4, "-14");
        q7g.L(rsrVar, xxqVar, "metadata", 4, "-15");
        String str5 = xxqVar.a;
        str5.getClass();
        this.g.b(rsrVar, str5);
    }

    @Override // defpackage.ow7, defpackage.ssr
    public final void f(rsr rsrVar) {
        rsrVar.getClass();
        this.b.f(rsrVar);
        String a = this.e.a();
        a.getClass();
        xxq xxqVar = this.c;
        xxqVar.getClass();
        boolean a2 = xxqVar.a();
        String str = xxqVar.a;
        boolean z = true;
        boolean z2 = false;
        if (a2 && !q7g.K(rsrVar, str, "3")) {
            if (xxqVar.a()) {
                q7g.L(rsrVar, xxqVar, a, 0, "3");
            }
            z2 = true;
        }
        if (!q7g.K(rsrVar, str, "-14")) {
            q7g.L(rsrVar, xxqVar, "disliked", 4, "-14");
            z2 = true;
        }
        if (q7g.K(rsrVar, str, "-15")) {
            z = z2;
        } else {
            q7g.L(rsrVar, xxqVar, "metadata", 4, "-15");
        }
        if (z) {
            str.getClass();
            this.g.b(rsrVar, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0bb9  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x092a  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x093a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x094a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x095f  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x097e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0991  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x099a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x09d5  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x09de  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x09f1  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x09fa  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0a0d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0a1f  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0a2f  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0a44  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0a54  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0a5d  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0a75  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0a8a  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0a93  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0aa9  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0ab2  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0ac9  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0ad2  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0ae0  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0aee  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0aff  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0b0d  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0b1c  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0b25  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0b2e  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0b37  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0b4a  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0b53  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0b73  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0b81  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0ac3  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0a70  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0a08  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0925  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0540  */
    @Override // defpackage.ow7, defpackage.ssr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(rsr rsrVar, int i, int i2) {
        xxq xxqVar;
        String str;
        xxq xxqVar2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i3;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        Context context;
        String str15;
        String str16;
        String str17;
        int i4;
        String str18;
        String str19;
        int i5;
        int i6;
        int i7;
        int i8;
        String str20;
        Cursor cursor;
        int i9;
        Cursor cursor2;
        int i10;
        byte b;
        Integer num;
        String valueOf;
        ArrayList<String> arrayList;
        String absolutePath;
        rsr rsrVar2 = rsrVar;
        rsrVar2.getClass();
        ssg.a(3, "MainDatabase", "upgrade database from " + i + " to " + i2, null);
        getClass();
        bow.z("main_db_upgrade", i + " to " + i2);
        xxq xxqVar3 = this.c;
        if (i < 128) {
            Timber.d("Migrate to %s", Integer.valueOf(i));
            if (i != 128) {
                if (i < 49) {
                    Timber.d("migrating to 2.0", new Object[0]);
                    rsrVar2.execSQL("DROP VIEW IF EXISTS cache_tracks_view");
                    rsrVar2.execSQL("DROP VIEW IF EXISTS ydisk_view");
                    hrg.x(rsrVar2, "DROP VIEW IF EXISTS genre_view", "DROP VIEW IF EXISTS album_view", "DROP VIEW IF EXISTS artist_view", "DROP TABLE IF EXISTS yd_directory");
                    hrg.x(rsrVar2, "DROP TABLE IF EXISTS yd_directory_track", "DROP TABLE IF EXISTS yd_album_track", "DROP TABLE IF EXISTS radio_station", "DROP TABLE IF EXISTS genre");
                    hrg.x(rsrVar2, "DROP TABLE IF EXISTS genre_title", "DROP TABLE IF EXISTS pending", "DROP TRIGGER IF EXISTS trig_name", "DROP TABLE IF EXISTS artist");
                    hrg.x(rsrVar2, "DROP TABLE IF EXISTS album", "DROP TABLE IF EXISTS track", "DROP TABLE IF EXISTS playlist", "DROP TABLE IF EXISTS track_operation");
                    hrg.x(rsrVar2, "DROP TABLE IF EXISTS album_operation", "DROP TABLE IF EXISTS artist_operation", "DROP TABLE IF EXISTS playlist_operation", "DROP TABLE IF EXISTS album_track");
                    hrg.x(rsrVar2, "DROP TABLE IF EXISTS artist_track", "DROP TABLE IF EXISTS album_artist", "DROP TABLE IF EXISTS playlist_track", "DROP TABLE IF EXISTS cache_info");
                    hrg.x(rsrVar2, "CREATE TABLE IF NOT EXISTS artist(_id integer primary key autoincrement, original_id text not null UNIQUE, name text, name_surrogate text, liked integer, disliked integer, not_synced integer, timestamp datetime not null, various integer, cover_uri text, albums_stale integer, tracks_stale integer, storage_type text not null, artist_for_kids integer default 0,artist_disclaimer text, cover_type text);", "CREATE TABLE IF NOT EXISTS album(_id integer primary key autoincrement, original_id text not null UNIQUE, name text, name_surrogate text, liked integer, likes_count integer, timestamp datetime not null, cover_uri text, original_release_year text, album_type text, album_meta_type text, short_description text, description text, storage_type text not null, for_premium integer default 0, for_options text, tracks_stale integer, warning_content text not null, genre_code text, album_for_kids integer default 0,bg_image_url text, bg_video_url text, sort_order text, duration_sec integer, album_disclaimer text);", "CREATE TABLE IF NOT EXISTS track(_id integer primary key autoincrement, original_id text not null UNIQUE, real_id text, name text, name_surrogate text, version text, duration integer, storage_type text not null, warning_content text not null, explicit integer, available text, for_premium integer default 0, for_options text, lyrics_available integer default 1, txt_lyrics_available integer default 1, sync_lyrics_available integer default 1, track_type text not null, track_source text, track_user text, track_save_progress integer default 0, cover_video_url text, cover_video_id text, cover_url text, short_description text, release_date text, integrated_loudness_db real, true_peak_db real, track_for_kids integer default 0, track_disclaimer text, track_fade text);", "CREATE TABLE IF NOT EXISTS playlist(_id integer primary key autoincrement, original_id text not null, uid text not null, login text not null, user_full_name text, name text, name_surrogate text, description text, revision integer, snapshot integer, created datetime not null, visibility text not null default public, storage_type text not null, sync integer default 0, cover_info text, position integer default -1, tracks integer, liked integer, liked_timestamp datetime, likes_count integer, auto_generated_type text, modified datetime, made_for_genitive text, target_uid text, target_login text, playlist_for_kids integer,bg_image_url text,bg_video_url text);");
                    hrg.x(rsrVar2, "CREATE TABLE IF NOT EXISTS track_operation(_id integer primary key autoincrement, playlist_id integer, operation integer, position integer, track_id text,album_id text);", "CREATE TABLE IF NOT EXISTS album_operation(_id integer primary key autoincrement, album_id text NOT NULL UNIQUE, operation integer);", "CREATE TABLE IF NOT EXISTS artist_operation(_id integer primary key autoincrement, artist_id text NOT NULL UNIQUE, operation integer);", "CREATE TABLE IF NOT EXISTS playlist_operation(_id integer primary key autoincrement, playlist_id text NOT NULL UNIQUE, operation integer);");
                    hrg.x(rsrVar2, "CREATE TABLE IF NOT EXISTS album_track(_id integer primary key autoincrement, album_id text, album_name text, track_id text, vol integer not null default 1, position integer);", "CREATE TABLE IF NOT EXISTS artist_track(_id integer primary key autoincrement, artist_id text, artist_name text, artist_track_various integer not null default 0, artist_track_cover_uri text, track_id text, artist_cover_type text);", "CREATE TABLE IF NOT EXISTS album_artist(_id integer primary key autoincrement, album_id text, artist_id text, artist_name text, role integer);", "CREATE TABLE IF NOT EXISTS playlist_track(_id integer primary key autoincrement, playlist_id integer, track_id text not null, album_id text not null default 0, timestamp datetime not null, position integer);");
                    rsrVar2.execSQL("CREATE TABLE IF NOT EXISTS cache_info(_id integer primary key autoincrement, track_id text not null, storage text not null, downloaded integer, full integer, is_permanent integer default 0, codec text not null, bitrate integer, download_token text, chunk blob not null, manifest_uri text);");
                    rsrVar2.execSQL("INSERT INTO album(name,timestamp,storage_type,warning_content,original_id) VALUES ('unknown','1970-01-01T00:00:00+0000','UNKNOWN','none', 0)");
                    rsrVar2.execSQL("INSERT INTO artist(name,timestamp,storage_type,original_id) VALUES ('unknown','1970-01-01T00:00:00+0000','UNKNOWN',0)");
                    String a = this.e.a();
                    if (xxqVar3.a()) {
                        rsrVar2.execSQL("INSERT INTO playlist(tracks,revision,uid,name,sync,login,snapshot,storage_type,created,original_id) VALUES (0,-1,?,?,0,?,0,'YCATALOG','1970-01-01T00:00:00+0000',3)", new Object[]{xxqVar3.a, a, xxqVar3.b});
                    }
                    xxqVar = xxqVar3;
                    str19 = "DROP VIEW IF EXISTS track_view";
                } else {
                    if (i < 50) {
                        Timber.d("migrating to 2.1", new Object[0]);
                        rsrVar2.execSQL("DROP TABLE IF EXISTS parameter");
                    }
                    if (i < 54) {
                        String str21 = xxqVar3.a;
                        Timber.d("migrating to 2.2", new Object[0]);
                        rsrVar2.execSQL("DROP TABLE IF EXISTS music_files");
                        rsrVar2.execSQL("delete from album where liked=1 AND original_id not in (select distinct album_id from album_track);");
                        rsrVar2.execSQL("update album set liked=0");
                        ContentValues contentValues = new ContentValues(1);
                        contentValues.put("revision", (Integer) (-1));
                        rsrVar2.update("playlist", 0, contentValues, "uid<>?", new String[]{str21});
                        hrg.x(rsrVar2, "DROP VIEW IF EXISTS album_artist_view", "DROP INDEX IF EXISTS album_original_id", "DROP INDEX IF EXISTS ix_album_name_surrogate", "DROP INDEX IF EXISTS album_track_id");
                        hrg.x(rsrVar2, "DROP INDEX IF EXISTS artist_album_id", "DROP INDEX IF EXISTS artist_original_id", "DROP INDEX IF EXISTS ix_artist_name_surrogate", "DROP INDEX IF EXISTS artist_track_id");
                        hrg.x(rsrVar2, "DROP INDEX IF EXISTS playlist_kind_uid", "DROP INDEX IF EXISTS playlist_track_album_id", "DROP INDEX IF EXISTS playlist_track_timestamp", "DROP INDEX IF EXISTS track_original_id");
                        hrg.x(rsrVar2, "DROP INDEX IF EXISTS ix_track_name", "DROP INDEX IF EXISTS ix_track_name_surrogate", "DROP INDEX IF EXISTS ctrack_original_id", "DROP INDEX IF EXISTS ix_ctrack_name");
                        hrg.x(rsrVar2, "DROP INDEX IF EXISTS ix_ctrack_name_surrogate", "DROP INDEX IF EXISTS calbum_track_id", "DROP INDEX IF EXISTS cartist_track_id", "DROP INDEX IF EXISTS cartist_album_id");
                        hrg.x(rsrVar2, "DROP INDEX IF EXISTS playlist_ctrack_album_id", "DROP INDEX IF EXISTS playlist_ctrack_timestamp", "DROP INDEX IF EXISTS op_album_id", "DROP INDEX IF EXISTS op_artist_id");
                        rsrVar2.execSQL("DROP INDEX IF EXISTS op_playlist_id");
                        rsrVar2.execSQL("INSERT INTO playlist(tracks,revision,uid,name,sync,login,snapshot,storage_type,created,original_id) VALUES (0,-1,?,'cached',4,?,0,'YCATALOG','1970-01-01T00:00:00+0000',-13)", new Object[]{xxqVar3.a, xxqVar3.b});
                    }
                    Context context2 = this.d;
                    if (i < 55) {
                        Timber.d("migrating to 2.6", new Object[0]);
                        rsrVar2.execSQL("CREATE TABLE IF NOT EXISTS cache_info( _id integer primary key autoincrement,  track_id text not null,  storage text not null,  downloaded integer,  full integer,  is_permanent integer default 0,  codec text not null,  bitrate integer);");
                        rsrVar2.execSQL("insert into cache_info(track_id,storage,downloaded,full,is_permanent,codec,bitrate)  select  original_id,  track_path,  downloaded_size,  file_size,  0 as is_permanent,  'AAC' as codec,  -1 as bitrate  from track where track_path like '%/music/aac/%' and downloaded_size>0");
                        rsrVar2.execSQL("insert into cache_info(track_id,storage,downloaded,full,is_permanent,codec,bitrate)  select  original_id,  track_path,  downloaded_size,  file_size,  0 as is_permanent,  'MP3' as codec,  -1 as bitrate  from track where track_path like '%/music/mp3/%' and downloaded_size>0");
                        rsrVar2.execSQL("update cache_info  set is_permanent=1  where downloaded=full");
                        int[] iArr = {64, 96, 128, 160, 192, 256, 320};
                        int i11 = 0;
                        for (int i12 = 7; i11 < i12; i12 = 7) {
                            int i13 = iArr[i11];
                            rsrVar2.execSQL(dfi.f("update cache_info  set bitrate = ", i13, i13, "  where storage like '%music/%/", "/%'"));
                            i11++;
                        }
                        ArrayList V = j66.V(context2);
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = V.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (!((lhr) next).c) {
                                arrayList2.add(next);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            Timber.d("found removable locations: %s", V);
                            absolutePath = V.isEmpty() ? "/storage/emulated/0/Android/data/ru.yandex.music/files/" : ((lhr) V.get(0)).a.getAbsolutePath();
                        } else {
                            Timber.d("found non-removable locations: %s", V);
                            absolutePath = ((lhr) arrayList2.get(0)).a.getAbsolutePath();
                        }
                        String str22 = "%Android/data/" + context2.getPackageName();
                        StringBuilder sb = new StringBuilder("update cache_info  set storage = '");
                        thr thrVar = thr.d;
                        sb.append(thrVar);
                        sb.append("'  where storage not like '");
                        sb.append(absolutePath);
                        sb.append("%'   and storage like '");
                        sb.append(str22);
                        sb.append("/files/%'");
                        rsrVar2.execSQL(sb.toString());
                        rsrVar2.execSQL("update cache_info  set storage = '" + thrVar + "'  where storage not like '" + absolutePath + "%'   and storage like '" + str22 + "/cache/%'");
                        StringBuilder sb2 = new StringBuilder("update cache_info  set storage = '");
                        sb2.append(thr.c);
                        sb2.append("'  where storage like '");
                        sb2.append(absolutePath);
                        sb2.append("%'");
                        rsrVar2.execSQL(sb2.toString());
                        asq.L(rsrVar2, "track", "CREATE TABLE IF NOT EXISTS track (_id integer primary key autoincrement, original_id text not null UNIQUE, name text, name_surrogate text, version text, duration integer, storage_type text not null, explicit integer, token text, available text);");
                        rsrVar2.execSQL("alter table playlist add column login text not null default '';");
                        rsrVar2.execSQL("update playlist set revision = -1;");
                    }
                    String str23 = "playlist_track";
                    String str24 = "album_track";
                    String str25 = "track_operation";
                    Context context3 = context2;
                    String str26 = "original_id";
                    if (i < 57) {
                        str3 = "DROP VIEW IF EXISTS track_view";
                        asq.u(rsrVar2, "album", "original_id", "unknown_album", CommonUrlParts.Values.FALSE_INTEGER);
                        asq.u(rsrVar2, "album_operation", "album_id", "unknown_album", CommonUrlParts.Values.FALSE_INTEGER);
                        asq.u(rsrVar2, "track_operation", "album_id", "unknown_album", CommonUrlParts.Values.FALSE_INTEGER);
                        asq.u(rsrVar2, "album_track", "album_id", "unknown_album", CommonUrlParts.Values.FALSE_INTEGER);
                        str2 = "album";
                        asq.u(rsrVar2, "album_artist", "album_id", "unknown_album", CommonUrlParts.Values.FALSE_INTEGER);
                        asq.u(rsrVar2, "playlist_track", "album_id", "unknown_album", CommonUrlParts.Values.FALSE_INTEGER);
                        asq.u(rsrVar2, "artist", "original_id", "unknown_artist", CommonUrlParts.Values.FALSE_INTEGER);
                        str = "artist";
                        xxqVar2 = xxqVar3;
                        asq.u(rsrVar2, "artist_operation", "artist_id", "unknown_artist", CommonUrlParts.Values.FALSE_INTEGER);
                        asq.u(rsrVar2, "artist_track", "artist_id", "unknown_artist", CommonUrlParts.Values.FALSE_INTEGER);
                        asq.u(rsrVar2, "album_artist", "artist_id", "unknown_artist", CommonUrlParts.Values.FALSE_INTEGER);
                        asq.u(rsrVar2, "track", "original_id", "UNKNOWN_TRACK_ID", CommonUrlParts.Values.FALSE_INTEGER);
                        asq.u(rsrVar2, "track_operation", "track_id", "UNKNOWN_TRACK_ID", CommonUrlParts.Values.FALSE_INTEGER);
                        asq.u(rsrVar2, "cache_info", "track_id", "UNKNOWN_TRACK_ID", CommonUrlParts.Values.FALSE_INTEGER);
                        asq.u(rsrVar2, "artist_track", "track_id", "UNKNOWN_TRACK_ID", CommonUrlParts.Values.FALSE_INTEGER);
                        asq.u(rsrVar2, "album_track", "track_id", "UNKNOWN_TRACK_ID", CommonUrlParts.Values.FALSE_INTEGER);
                        asq.u(rsrVar2, "playlist_track", "track_id", "UNKNOWN_TRACK_ID", CommonUrlParts.Values.FALSE_INTEGER);
                    } else {
                        str = "artist";
                        xxqVar2 = xxqVar3;
                        str2 = "album";
                        str3 = "DROP VIEW IF EXISTS track_view";
                    }
                    if (i < 58) {
                        rsrVar2.execSQL("alter table playlist add column position integer default -1;");
                    }
                    if (i < 61) {
                        rsrVar2.delete("track", "storage_type=?", new String[]{"LOCAL"});
                    }
                    String str27 = "_id";
                    if (i < 62) {
                        hrg.x(rsrVar2, "DELETE FROM catalog_playlist_track WHERE track_id NOT IN (SELECT track_id FROM cache_info);", "INSERT INTO playlist_track(playlist_id, track_id, album_id, position, timestamp) SELECT playlist_id, track_id, album_id, position, timestamp FROM catalog_playlist_track;", "INSERT INTO album_artist(artist_id, artist_name, album_id, role) SELECT artist_id, artist_name, album_id, role FROM catalog_album_artist ar WHERE ar.artist_id NOT IN (SELECT artist_id FROM album_artist) OR ar.album_id NOT IN (SELECT album_id FROM album_artist)", "DROP VIEW IF EXISTS catalog_track_view");
                        hrg.x(rsrVar2, "DROP VIEW IF EXISTS catalog_playlist_view", "DROP TABLE IF EXISTS catalog_playlist_track", "DROP TABLE IF EXISTS catalog_album_artist", "DROP TABLE IF EXISTS catalog_artist_track");
                        rsrVar2.execSQL("DROP TABLE IF EXISTS catalog_album_track");
                        rsrVar2.execSQL("DROP TABLE IF EXISTS catalog_track");
                        Cursor query = rsrVar2.query("SELECT _id FROM playlist WHERE original_id=?", new String[]{"-13"});
                        try {
                            num = query.moveToFirst() ? Integer.valueOf(query.getInt(query.getColumnIndex("_id"))) : null;
                            try {
                                query.close();
                            } catch (SQLException e) {
                                e = e;
                                Assertions.fail(e);
                                if (num != null) {
                                }
                                if (valueOf == null) {
                                }
                                rsrVar2.execSQL("update playlist_operation set playlist_id=replace(playlist_id,'-',':')");
                                rsrVar2.execSQL("alter table playlist add column liked integer default 0");
                                StringBuilder sb3 = new StringBuilder("update playlist set liked=1 where uid<>");
                                xxqVar = xxqVar2;
                                sb3.append(xxqVar.a);
                                rsrVar2.execSQL(sb3.toString());
                                rsrVar2.execSQL("update playlist set original_id=3 where original_id=-99");
                                rsrVar2.execSQL("alter table cache_info add column download_token text");
                                rsrVar2.execSQL("update cache_info set download_token= (select token from track where original_id=track_id)");
                                asq.L(rsrVar2, "track", "CREATE TABLE IF NOT EXISTS track (_id integer primary key autoincrement, original_id text not null UNIQUE, name text, name_surrogate text, version text, duration integer, storage_type text not null, explicit integer, available text);");
                                rsrVar2.execSQL("CREATE TABLE IF NOT EXISTS play_history(_id integer primary key autoincrement, context text not null, context_id text, client text not null, latest_track_id text not null, latest_track_album_id text, play_time datetime not null);");
                                if (i < 63) {
                                }
                                if (i < 64) {
                                }
                                if (i < 65) {
                                }
                                if (i < 66) {
                                }
                                if (i < 67) {
                                }
                                if (i < 68) {
                                }
                                if (i < 71) {
                                }
                                if (i < 72) {
                                }
                                if (i < 73) {
                                }
                                if (i < 74) {
                                }
                                if (i < 75) {
                                }
                                String str28 = StringUtils.PROCESS_POSTFIX_DELIMITER;
                                if (i < 76) {
                                }
                                if (i < 77) {
                                }
                                if (i < 79) {
                                }
                                if (i < 81) {
                                }
                                if (i < 82) {
                                }
                                if (i < 84) {
                                }
                                if (i < 85) {
                                }
                                if (i < 86) {
                                }
                                if (i < 87) {
                                }
                                if (i < 88) {
                                }
                                if (i < 89) {
                                }
                                if (i < 91) {
                                }
                                if (i < 92) {
                                }
                                if (i < 93) {
                                }
                                if (i < 94) {
                                }
                                if (i < 95) {
                                }
                                if (i < 96) {
                                }
                                if (i < 98) {
                                }
                                if (i < 99) {
                                }
                                if (i < 100) {
                                }
                                if (i < 101) {
                                }
                                if (i < 102) {
                                }
                                if (i < 103) {
                                }
                                if (i < 104) {
                                }
                                if (i < 105) {
                                }
                                if (i < 106) {
                                }
                                if (i < 107) {
                                }
                                if (i < 108) {
                                }
                                if (i < 109) {
                                }
                                if (i < 111) {
                                }
                                if (i < 112) {
                                }
                                if (i < 113) {
                                }
                                if (i < 114) {
                                }
                                if (i < 115) {
                                }
                                if (i < 116) {
                                }
                                if (i < 117) {
                                }
                                if (i < 118) {
                                }
                                if (i < 120) {
                                }
                                if (i < 121) {
                                }
                                if (i < 122) {
                                }
                                if (i < 123) {
                                }
                                if (i < 124) {
                                }
                                if (i < 125) {
                                }
                                if (i < 126) {
                                }
                                if (i < 127) {
                                }
                                if (i < 128) {
                                }
                                hrg.x(rsrVar2, "DROP VIEW IF EXISTS playlist_view", str19, "DROP VIEW IF EXISTS album_meta", "DROP VIEW IF EXISTS artist_meta");
                                hrg.x(rsrVar2, "DROP VIEW IF EXISTS album_artist_meta", "DROP VIEW IF EXISTS cache_info_view", "CREATE VIEW IF NOT EXISTS cache_info_view AS SELECT cache_info.track_id AS track_id,MAX(cache_info.is_permanent) AS is_permanent FROM cache_info GROUP BY cache_info.track_id", "CREATE VIEW IF NOT EXISTS playlist_view AS SELECT playlist_track._id AS _id,playlist_track.playlist_id AS playlist_id,playlist_track._id AS key,playlist_track.timestamp AS timestamp,playlist_track.position AS position_playlist,playlist_track.album_id AS playlist_album_id,track.duration AS duration,track.name AS name,track.name_surrogate AS name_surrogate,track.version AS version,track.original_id AS original_id,track.real_id AS real_id,track.warning_content AS warning_content,track.explicit AS explicit,track.storage_type AS storage_type,track.available AS available,track.for_premium AS for_premium,track.for_options AS for_options,track.lyrics_available AS lyrics_available,track.txt_lyrics_available AS txt_lyrics_available,track.sync_lyrics_available AS sync_lyrics_available,track.track_type AS track_type,track.track_source AS track_source,track.track_user AS track_user,track.track_save_progress AS track_save_progress,track.cover_video_id AS cover_video_id,track.cover_url AS cover_url,track.short_description AS short_description,track.release_date AS release_date,track.track_for_kids AS track_for_kids,track.integrated_loudness_db AS integrated_loudness_db,track.true_peak_db AS true_peak_db,track.track_disclaimer AS track_disclaimer,track.track_fade AS track_fade,album_track.album_id AS album_id,album_track.album_name AS album_name,album_track.position AS position,album_track.vol AS vol,album.album_type AS album_type,album.original_release_year AS original_release_year,album.cover_uri AS cover_uri,GROUP_CONCAT(artist_track.artist_id || '#|') AS artist_id,GROUP_CONCAT(artist_track.artist_name || '#|') AS artist_name,GROUP_CONCAT(artist_track.artist_track_various || '#|') AS artist_track_various,GROUP_CONCAT(artist_track.artist_track_cover_uri || '#|') AS artist_track_cover_uri,GROUP_CONCAT(artist_track.artist_cover_type || '#|') AS artist_cover_type,GROUP_CONCAT(artist.artist_disclaimer || '#|') AS artist_disclaimer,GROUP_CONCAT(artist.name_surrogate || '#|') AS artist_name_surrogate,MAX(cache_info.is_permanent) AS is_permanent,MIN(ABS(playlist_track.album_id - album_track.album_id)) FROM playlist_track JOIN artist ON artist.original_id=artist_track.artist_id JOIN track ON playlist_track.track_id=track.original_id JOIN album_track ON playlist_track.track_id=album_track.track_id JOIN artist_track ON artist_track.track_id=track.original_id JOIN album ON album.original_id=album_track.album_id LEFT JOIN cache_info ON cache_info.track_id=track.original_id GROUP BY playlist_track.playlist_id,playlist_track.track_id,playlist_track.position");
                                hrg.x(rsrVar2, "CREATE VIEW IF NOT EXISTS track_view AS SELECT album_track._id AS _id,track.duration AS duration,track.name AS name,track.name_surrogate AS name_surrogate,track.version AS version,track.original_id AS original_id,track.real_id AS real_id,track.warning_content AS warning_content,track.explicit AS explicit,track.storage_type AS storage_type,track.available AS available,track.for_premium AS for_premium,track.for_options AS for_options,track.lyrics_available AS lyrics_available,track.txt_lyrics_available AS txt_lyrics_available,track.sync_lyrics_available AS sync_lyrics_available,track.track_type AS track_type,track.track_source AS track_source,track.track_user AS track_user,track.track_save_progress AS track_save_progress,track.cover_video_id AS cover_video_id,track.cover_url AS cover_url,track.short_description AS short_description,track.release_date AS release_date,track.track_for_kids AS track_for_kids,track.integrated_loudness_db AS integrated_loudness_db,track.true_peak_db AS true_peak_db,track.track_disclaimer AS track_disclaimer,track.track_fade AS track_fade,album_track.album_id AS album_id,album_track.album_name AS album_name,album_track.vol AS vol,album_track.position AS position,artist_track.artist_id AS artist_id,artist_track.artist_name AS artist_name,artist_track.artist_track_various AS artist_track_various,artist_track.artist_track_cover_uri AS artist_track_cover_uri,artist.artist_disclaimer AS artist_disclaimer,album.original_release_year AS original_release_year,album.cover_uri AS cover_uri,artist_track.artist_cover_type AS artist_cover_type,album.album_type AS album_type,album.sort_order AS sort_order,MAX(cache_info.is_permanent) AS is_permanent FROM track JOIN artist_track ON artist_track.track_id=track.original_id JOIN artist ON artist.original_id=artist_track.artist_id JOIN album_track ON album_track.track_id=track.original_id JOIN album ON album.original_id=album_track.album_id LEFT JOIN cache_info ON cache_info.track_id=track.original_id GROUP BY track.original_id,album_track.album_id,artist_track.artist_id", "CREATE VIEW IF NOT EXISTS album_meta AS SELECT album.original_id AS original_id,SUM(cache_info_view.is_permanent) AS tracks_cached FROM album JOIN album_track ON album_track.album_id=album.original_id JOIN cache_info_view ON cache_info_view.track_id=album_track.track_id GROUP BY album.original_id", "CREATE VIEW IF NOT EXISTS artist_meta AS SELECT artist.original_id AS original_id,COUNT(artist_track.track_id) AS tracks,SUM(cache_info_view.is_permanent) AS tracks_cached FROM artist JOIN artist_track ON artist_track.artist_id=artist.original_id JOIN cache_info_view ON cache_info_view.track_id=artist_track.track_id GROUP BY artist.original_id", "CREATE VIEW IF NOT EXISTS album_artist_meta AS SELECT album_artist.album_id AS album_id,album_artist.artist_id AS artist_id,album_artist.artist_name AS artist_name FROM album_artist");
                                asq.z(rsrVar2);
                                super.g(rsrVar2, i >= 128 ? i : 128, i2);
                                String str29 = xxqVar.a;
                                str29.getClass();
                                this.g.b(rsrVar2, str29);
                            }
                            valueOf = num != null ? String.valueOf(num) : null;
                            if (valueOf == null) {
                                str4 = "playlist_track";
                                str5 = "album_track";
                            } else {
                                Cursor query2 = rsrVar2.query("SELECT album_id, COUNT(track_id) FROM playlist_track WHERE playlist_id=? GROUP BY album_id", new String[]{valueOf});
                                try {
                                    try {
                                        arrayList = new ArrayList(query2.getCount());
                                        try {
                                            if (query2.moveToFirst()) {
                                                while (true) {
                                                    int i14 = query2.getInt(1);
                                                    str4 = str23;
                                                    try {
                                                        String string = query2.getString(0);
                                                        str5 = str24;
                                                        try {
                                                            Timber.d("consider to like %s\thaving %s tracks", string, Integer.valueOf(i14));
                                                            if (i14 > 1) {
                                                                arrayList.add(string);
                                                            }
                                                            if (!query2.moveToNext()) {
                                                                break;
                                                            }
                                                            str23 = str4;
                                                            str24 = str5;
                                                        } catch (SQLException e2) {
                                                            e = e2;
                                                            Assertions.fail(e);
                                                            query2.close();
                                                            if (arrayList != null) {
                                                            }
                                                            rsrVar2.execSQL("update playlist_operation set playlist_id=replace(playlist_id,'-',':')");
                                                            rsrVar2.execSQL("alter table playlist add column liked integer default 0");
                                                            StringBuilder sb32 = new StringBuilder("update playlist set liked=1 where uid<>");
                                                            xxqVar = xxqVar2;
                                                            sb32.append(xxqVar.a);
                                                            rsrVar2.execSQL(sb32.toString());
                                                            rsrVar2.execSQL("update playlist set original_id=3 where original_id=-99");
                                                            rsrVar2.execSQL("alter table cache_info add column download_token text");
                                                            rsrVar2.execSQL("update cache_info set download_token= (select token from track where original_id=track_id)");
                                                            asq.L(rsrVar2, "track", "CREATE TABLE IF NOT EXISTS track (_id integer primary key autoincrement, original_id text not null UNIQUE, name text, name_surrogate text, version text, duration integer, storage_type text not null, explicit integer, available text);");
                                                            rsrVar2.execSQL("CREATE TABLE IF NOT EXISTS play_history(_id integer primary key autoincrement, context text not null, context_id text, client text not null, latest_track_id text not null, latest_track_album_id text, play_time datetime not null);");
                                                            if (i < 63) {
                                                            }
                                                            if (i < 64) {
                                                            }
                                                            if (i < 65) {
                                                            }
                                                            if (i < 66) {
                                                            }
                                                            if (i < 67) {
                                                            }
                                                            if (i < 68) {
                                                            }
                                                            if (i < 71) {
                                                            }
                                                            if (i < 72) {
                                                            }
                                                            if (i < 73) {
                                                            }
                                                            if (i < 74) {
                                                            }
                                                            if (i < 75) {
                                                            }
                                                            String str282 = StringUtils.PROCESS_POSTFIX_DELIMITER;
                                                            if (i < 76) {
                                                            }
                                                            if (i < 77) {
                                                            }
                                                            if (i < 79) {
                                                            }
                                                            if (i < 81) {
                                                            }
                                                            if (i < 82) {
                                                            }
                                                            if (i < 84) {
                                                            }
                                                            if (i < 85) {
                                                            }
                                                            if (i < 86) {
                                                            }
                                                            if (i < 87) {
                                                            }
                                                            if (i < 88) {
                                                            }
                                                            if (i < 89) {
                                                            }
                                                            if (i < 91) {
                                                            }
                                                            if (i < 92) {
                                                            }
                                                            if (i < 93) {
                                                            }
                                                            if (i < 94) {
                                                            }
                                                            if (i < 95) {
                                                            }
                                                            if (i < 96) {
                                                            }
                                                            if (i < 98) {
                                                            }
                                                            if (i < 99) {
                                                            }
                                                            if (i < 100) {
                                                            }
                                                            if (i < 101) {
                                                            }
                                                            if (i < 102) {
                                                            }
                                                            if (i < 103) {
                                                            }
                                                            if (i < 104) {
                                                            }
                                                            if (i < 105) {
                                                            }
                                                            if (i < 106) {
                                                            }
                                                            if (i < 107) {
                                                            }
                                                            if (i < 108) {
                                                            }
                                                            if (i < 109) {
                                                            }
                                                            if (i < 111) {
                                                            }
                                                            if (i < 112) {
                                                            }
                                                            if (i < 113) {
                                                            }
                                                            if (i < 114) {
                                                            }
                                                            if (i < 115) {
                                                            }
                                                            if (i < 116) {
                                                            }
                                                            if (i < 117) {
                                                            }
                                                            if (i < 118) {
                                                            }
                                                            if (i < 120) {
                                                            }
                                                            if (i < 121) {
                                                            }
                                                            if (i < 122) {
                                                            }
                                                            if (i < 123) {
                                                            }
                                                            if (i < 124) {
                                                            }
                                                            if (i < 125) {
                                                            }
                                                            if (i < 126) {
                                                            }
                                                            if (i < 127) {
                                                            }
                                                            if (i < 128) {
                                                            }
                                                            hrg.x(rsrVar2, "DROP VIEW IF EXISTS playlist_view", str19, "DROP VIEW IF EXISTS album_meta", "DROP VIEW IF EXISTS artist_meta");
                                                            hrg.x(rsrVar2, "DROP VIEW IF EXISTS album_artist_meta", "DROP VIEW IF EXISTS cache_info_view", "CREATE VIEW IF NOT EXISTS cache_info_view AS SELECT cache_info.track_id AS track_id,MAX(cache_info.is_permanent) AS is_permanent FROM cache_info GROUP BY cache_info.track_id", "CREATE VIEW IF NOT EXISTS playlist_view AS SELECT playlist_track._id AS _id,playlist_track.playlist_id AS playlist_id,playlist_track._id AS key,playlist_track.timestamp AS timestamp,playlist_track.position AS position_playlist,playlist_track.album_id AS playlist_album_id,track.duration AS duration,track.name AS name,track.name_surrogate AS name_surrogate,track.version AS version,track.original_id AS original_id,track.real_id AS real_id,track.warning_content AS warning_content,track.explicit AS explicit,track.storage_type AS storage_type,track.available AS available,track.for_premium AS for_premium,track.for_options AS for_options,track.lyrics_available AS lyrics_available,track.txt_lyrics_available AS txt_lyrics_available,track.sync_lyrics_available AS sync_lyrics_available,track.track_type AS track_type,track.track_source AS track_source,track.track_user AS track_user,track.track_save_progress AS track_save_progress,track.cover_video_id AS cover_video_id,track.cover_url AS cover_url,track.short_description AS short_description,track.release_date AS release_date,track.track_for_kids AS track_for_kids,track.integrated_loudness_db AS integrated_loudness_db,track.true_peak_db AS true_peak_db,track.track_disclaimer AS track_disclaimer,track.track_fade AS track_fade,album_track.album_id AS album_id,album_track.album_name AS album_name,album_track.position AS position,album_track.vol AS vol,album.album_type AS album_type,album.original_release_year AS original_release_year,album.cover_uri AS cover_uri,GROUP_CONCAT(artist_track.artist_id || '#|') AS artist_id,GROUP_CONCAT(artist_track.artist_name || '#|') AS artist_name,GROUP_CONCAT(artist_track.artist_track_various || '#|') AS artist_track_various,GROUP_CONCAT(artist_track.artist_track_cover_uri || '#|') AS artist_track_cover_uri,GROUP_CONCAT(artist_track.artist_cover_type || '#|') AS artist_cover_type,GROUP_CONCAT(artist.artist_disclaimer || '#|') AS artist_disclaimer,GROUP_CONCAT(artist.name_surrogate || '#|') AS artist_name_surrogate,MAX(cache_info.is_permanent) AS is_permanent,MIN(ABS(playlist_track.album_id - album_track.album_id)) FROM playlist_track JOIN artist ON artist.original_id=artist_track.artist_id JOIN track ON playlist_track.track_id=track.original_id JOIN album_track ON playlist_track.track_id=album_track.track_id JOIN artist_track ON artist_track.track_id=track.original_id JOIN album ON album.original_id=album_track.album_id LEFT JOIN cache_info ON cache_info.track_id=track.original_id GROUP BY playlist_track.playlist_id,playlist_track.track_id,playlist_track.position");
                                                            hrg.x(rsrVar2, "CREATE VIEW IF NOT EXISTS track_view AS SELECT album_track._id AS _id,track.duration AS duration,track.name AS name,track.name_surrogate AS name_surrogate,track.version AS version,track.original_id AS original_id,track.real_id AS real_id,track.warning_content AS warning_content,track.explicit AS explicit,track.storage_type AS storage_type,track.available AS available,track.for_premium AS for_premium,track.for_options AS for_options,track.lyrics_available AS lyrics_available,track.txt_lyrics_available AS txt_lyrics_available,track.sync_lyrics_available AS sync_lyrics_available,track.track_type AS track_type,track.track_source AS track_source,track.track_user AS track_user,track.track_save_progress AS track_save_progress,track.cover_video_id AS cover_video_id,track.cover_url AS cover_url,track.short_description AS short_description,track.release_date AS release_date,track.track_for_kids AS track_for_kids,track.integrated_loudness_db AS integrated_loudness_db,track.true_peak_db AS true_peak_db,track.track_disclaimer AS track_disclaimer,track.track_fade AS track_fade,album_track.album_id AS album_id,album_track.album_name AS album_name,album_track.vol AS vol,album_track.position AS position,artist_track.artist_id AS artist_id,artist_track.artist_name AS artist_name,artist_track.artist_track_various AS artist_track_various,artist_track.artist_track_cover_uri AS artist_track_cover_uri,artist.artist_disclaimer AS artist_disclaimer,album.original_release_year AS original_release_year,album.cover_uri AS cover_uri,artist_track.artist_cover_type AS artist_cover_type,album.album_type AS album_type,album.sort_order AS sort_order,MAX(cache_info.is_permanent) AS is_permanent FROM track JOIN artist_track ON artist_track.track_id=track.original_id JOIN artist ON artist.original_id=artist_track.artist_id JOIN album_track ON album_track.track_id=track.original_id JOIN album ON album.original_id=album_track.album_id LEFT JOIN cache_info ON cache_info.track_id=track.original_id GROUP BY track.original_id,album_track.album_id,artist_track.artist_id", "CREATE VIEW IF NOT EXISTS album_meta AS SELECT album.original_id AS original_id,SUM(cache_info_view.is_permanent) AS tracks_cached FROM album JOIN album_track ON album_track.album_id=album.original_id JOIN cache_info_view ON cache_info_view.track_id=album_track.track_id GROUP BY album.original_id", "CREATE VIEW IF NOT EXISTS artist_meta AS SELECT artist.original_id AS original_id,COUNT(artist_track.track_id) AS tracks,SUM(cache_info_view.is_permanent) AS tracks_cached FROM artist JOIN artist_track ON artist_track.artist_id=artist.original_id JOIN cache_info_view ON cache_info_view.track_id=artist_track.track_id GROUP BY artist.original_id", "CREATE VIEW IF NOT EXISTS album_artist_meta AS SELECT album_artist.album_id AS album_id,album_artist.artist_id AS artist_id,album_artist.artist_name AS artist_name FROM album_artist");
                                                            asq.z(rsrVar2);
                                                            super.g(rsrVar2, i >= 128 ? i : 128, i2);
                                                            String str292 = xxqVar.a;
                                                            str292.getClass();
                                                            this.g.b(rsrVar2, str292);
                                                        }
                                                    } catch (SQLException e3) {
                                                        e = e3;
                                                        str5 = str24;
                                                        Assertions.fail(e);
                                                        query2.close();
                                                        if (arrayList != null) {
                                                        }
                                                        rsrVar2.execSQL("update playlist_operation set playlist_id=replace(playlist_id,'-',':')");
                                                        rsrVar2.execSQL("alter table playlist add column liked integer default 0");
                                                        StringBuilder sb322 = new StringBuilder("update playlist set liked=1 where uid<>");
                                                        xxqVar = xxqVar2;
                                                        sb322.append(xxqVar.a);
                                                        rsrVar2.execSQL(sb322.toString());
                                                        rsrVar2.execSQL("update playlist set original_id=3 where original_id=-99");
                                                        rsrVar2.execSQL("alter table cache_info add column download_token text");
                                                        rsrVar2.execSQL("update cache_info set download_token= (select token from track where original_id=track_id)");
                                                        asq.L(rsrVar2, "track", "CREATE TABLE IF NOT EXISTS track (_id integer primary key autoincrement, original_id text not null UNIQUE, name text, name_surrogate text, version text, duration integer, storage_type text not null, explicit integer, available text);");
                                                        rsrVar2.execSQL("CREATE TABLE IF NOT EXISTS play_history(_id integer primary key autoincrement, context text not null, context_id text, client text not null, latest_track_id text not null, latest_track_album_id text, play_time datetime not null);");
                                                        if (i < 63) {
                                                        }
                                                        if (i < 64) {
                                                        }
                                                        if (i < 65) {
                                                        }
                                                        if (i < 66) {
                                                        }
                                                        if (i < 67) {
                                                        }
                                                        if (i < 68) {
                                                        }
                                                        if (i < 71) {
                                                        }
                                                        if (i < 72) {
                                                        }
                                                        if (i < 73) {
                                                        }
                                                        if (i < 74) {
                                                        }
                                                        if (i < 75) {
                                                        }
                                                        String str2822 = StringUtils.PROCESS_POSTFIX_DELIMITER;
                                                        if (i < 76) {
                                                        }
                                                        if (i < 77) {
                                                        }
                                                        if (i < 79) {
                                                        }
                                                        if (i < 81) {
                                                        }
                                                        if (i < 82) {
                                                        }
                                                        if (i < 84) {
                                                        }
                                                        if (i < 85) {
                                                        }
                                                        if (i < 86) {
                                                        }
                                                        if (i < 87) {
                                                        }
                                                        if (i < 88) {
                                                        }
                                                        if (i < 89) {
                                                        }
                                                        if (i < 91) {
                                                        }
                                                        if (i < 92) {
                                                        }
                                                        if (i < 93) {
                                                        }
                                                        if (i < 94) {
                                                        }
                                                        if (i < 95) {
                                                        }
                                                        if (i < 96) {
                                                        }
                                                        if (i < 98) {
                                                        }
                                                        if (i < 99) {
                                                        }
                                                        if (i < 100) {
                                                        }
                                                        if (i < 101) {
                                                        }
                                                        if (i < 102) {
                                                        }
                                                        if (i < 103) {
                                                        }
                                                        if (i < 104) {
                                                        }
                                                        if (i < 105) {
                                                        }
                                                        if (i < 106) {
                                                        }
                                                        if (i < 107) {
                                                        }
                                                        if (i < 108) {
                                                        }
                                                        if (i < 109) {
                                                        }
                                                        if (i < 111) {
                                                        }
                                                        if (i < 112) {
                                                        }
                                                        if (i < 113) {
                                                        }
                                                        if (i < 114) {
                                                        }
                                                        if (i < 115) {
                                                        }
                                                        if (i < 116) {
                                                        }
                                                        if (i < 117) {
                                                        }
                                                        if (i < 118) {
                                                        }
                                                        if (i < 120) {
                                                        }
                                                        if (i < 121) {
                                                        }
                                                        if (i < 122) {
                                                        }
                                                        if (i < 123) {
                                                        }
                                                        if (i < 124) {
                                                        }
                                                        if (i < 125) {
                                                        }
                                                        if (i < 126) {
                                                        }
                                                        if (i < 127) {
                                                        }
                                                        if (i < 128) {
                                                        }
                                                        hrg.x(rsrVar2, "DROP VIEW IF EXISTS playlist_view", str19, "DROP VIEW IF EXISTS album_meta", "DROP VIEW IF EXISTS artist_meta");
                                                        hrg.x(rsrVar2, "DROP VIEW IF EXISTS album_artist_meta", "DROP VIEW IF EXISTS cache_info_view", "CREATE VIEW IF NOT EXISTS cache_info_view AS SELECT cache_info.track_id AS track_id,MAX(cache_info.is_permanent) AS is_permanent FROM cache_info GROUP BY cache_info.track_id", "CREATE VIEW IF NOT EXISTS playlist_view AS SELECT playlist_track._id AS _id,playlist_track.playlist_id AS playlist_id,playlist_track._id AS key,playlist_track.timestamp AS timestamp,playlist_track.position AS position_playlist,playlist_track.album_id AS playlist_album_id,track.duration AS duration,track.name AS name,track.name_surrogate AS name_surrogate,track.version AS version,track.original_id AS original_id,track.real_id AS real_id,track.warning_content AS warning_content,track.explicit AS explicit,track.storage_type AS storage_type,track.available AS available,track.for_premium AS for_premium,track.for_options AS for_options,track.lyrics_available AS lyrics_available,track.txt_lyrics_available AS txt_lyrics_available,track.sync_lyrics_available AS sync_lyrics_available,track.track_type AS track_type,track.track_source AS track_source,track.track_user AS track_user,track.track_save_progress AS track_save_progress,track.cover_video_id AS cover_video_id,track.cover_url AS cover_url,track.short_description AS short_description,track.release_date AS release_date,track.track_for_kids AS track_for_kids,track.integrated_loudness_db AS integrated_loudness_db,track.true_peak_db AS true_peak_db,track.track_disclaimer AS track_disclaimer,track.track_fade AS track_fade,album_track.album_id AS album_id,album_track.album_name AS album_name,album_track.position AS position,album_track.vol AS vol,album.album_type AS album_type,album.original_release_year AS original_release_year,album.cover_uri AS cover_uri,GROUP_CONCAT(artist_track.artist_id || '#|') AS artist_id,GROUP_CONCAT(artist_track.artist_name || '#|') AS artist_name,GROUP_CONCAT(artist_track.artist_track_various || '#|') AS artist_track_various,GROUP_CONCAT(artist_track.artist_track_cover_uri || '#|') AS artist_track_cover_uri,GROUP_CONCAT(artist_track.artist_cover_type || '#|') AS artist_cover_type,GROUP_CONCAT(artist.artist_disclaimer || '#|') AS artist_disclaimer,GROUP_CONCAT(artist.name_surrogate || '#|') AS artist_name_surrogate,MAX(cache_info.is_permanent) AS is_permanent,MIN(ABS(playlist_track.album_id - album_track.album_id)) FROM playlist_track JOIN artist ON artist.original_id=artist_track.artist_id JOIN track ON playlist_track.track_id=track.original_id JOIN album_track ON playlist_track.track_id=album_track.track_id JOIN artist_track ON artist_track.track_id=track.original_id JOIN album ON album.original_id=album_track.album_id LEFT JOIN cache_info ON cache_info.track_id=track.original_id GROUP BY playlist_track.playlist_id,playlist_track.track_id,playlist_track.position");
                                                        hrg.x(rsrVar2, "CREATE VIEW IF NOT EXISTS track_view AS SELECT album_track._id AS _id,track.duration AS duration,track.name AS name,track.name_surrogate AS name_surrogate,track.version AS version,track.original_id AS original_id,track.real_id AS real_id,track.warning_content AS warning_content,track.explicit AS explicit,track.storage_type AS storage_type,track.available AS available,track.for_premium AS for_premium,track.for_options AS for_options,track.lyrics_available AS lyrics_available,track.txt_lyrics_available AS txt_lyrics_available,track.sync_lyrics_available AS sync_lyrics_available,track.track_type AS track_type,track.track_source AS track_source,track.track_user AS track_user,track.track_save_progress AS track_save_progress,track.cover_video_id AS cover_video_id,track.cover_url AS cover_url,track.short_description AS short_description,track.release_date AS release_date,track.track_for_kids AS track_for_kids,track.integrated_loudness_db AS integrated_loudness_db,track.true_peak_db AS true_peak_db,track.track_disclaimer AS track_disclaimer,track.track_fade AS track_fade,album_track.album_id AS album_id,album_track.album_name AS album_name,album_track.vol AS vol,album_track.position AS position,artist_track.artist_id AS artist_id,artist_track.artist_name AS artist_name,artist_track.artist_track_various AS artist_track_various,artist_track.artist_track_cover_uri AS artist_track_cover_uri,artist.artist_disclaimer AS artist_disclaimer,album.original_release_year AS original_release_year,album.cover_uri AS cover_uri,artist_track.artist_cover_type AS artist_cover_type,album.album_type AS album_type,album.sort_order AS sort_order,MAX(cache_info.is_permanent) AS is_permanent FROM track JOIN artist_track ON artist_track.track_id=track.original_id JOIN artist ON artist.original_id=artist_track.artist_id JOIN album_track ON album_track.track_id=track.original_id JOIN album ON album.original_id=album_track.album_id LEFT JOIN cache_info ON cache_info.track_id=track.original_id GROUP BY track.original_id,album_track.album_id,artist_track.artist_id", "CREATE VIEW IF NOT EXISTS album_meta AS SELECT album.original_id AS original_id,SUM(cache_info_view.is_permanent) AS tracks_cached FROM album JOIN album_track ON album_track.album_id=album.original_id JOIN cache_info_view ON cache_info_view.track_id=album_track.track_id GROUP BY album.original_id", "CREATE VIEW IF NOT EXISTS artist_meta AS SELECT artist.original_id AS original_id,COUNT(artist_track.track_id) AS tracks,SUM(cache_info_view.is_permanent) AS tracks_cached FROM artist JOIN artist_track ON artist_track.artist_id=artist.original_id JOIN cache_info_view ON cache_info_view.track_id=artist_track.track_id GROUP BY artist.original_id", "CREATE VIEW IF NOT EXISTS album_artist_meta AS SELECT album_artist.album_id AS album_id,album_artist.artist_id AS artist_id,album_artist.artist_name AS artist_name FROM album_artist");
                                                        asq.z(rsrVar2);
                                                        super.g(rsrVar2, i >= 128 ? i : 128, i2);
                                                        String str2922 = xxqVar.a;
                                                        str2922.getClass();
                                                        this.g.b(rsrVar2, str2922);
                                                    }
                                                }
                                            } else {
                                                str4 = "playlist_track";
                                                str5 = "album_track";
                                            }
                                        } catch (SQLException e4) {
                                            e = e4;
                                            str4 = str23;
                                        }
                                    } catch (SQLException e5) {
                                        e = e5;
                                        str4 = "playlist_track";
                                        str5 = "album_track";
                                        arrayList = null;
                                    }
                                    query2.close();
                                    if (arrayList != null) {
                                        ContentValues contentValues2 = new ContentValues(2);
                                        for (String str30 : arrayList) {
                                            contentValues2.put("operation", (Integer) 0);
                                            contentValues2.put("album_id", str30);
                                            rsrVar2.insert("album_operation", 4, contentValues2);
                                        }
                                    }
                                } catch (Throwable th) {
                                    query2.close();
                                    throw th;
                                }
                            }
                            rsrVar2.execSQL("update playlist_operation set playlist_id=replace(playlist_id,'-',':')");
                            rsrVar2.execSQL("alter table playlist add column liked integer default 0");
                            StringBuilder sb3222 = new StringBuilder("update playlist set liked=1 where uid<>");
                            xxqVar = xxqVar2;
                            sb3222.append(xxqVar.a);
                            rsrVar2.execSQL(sb3222.toString());
                            rsrVar2.execSQL("update playlist set original_id=3 where original_id=-99");
                            rsrVar2.execSQL("alter table cache_info add column download_token text");
                            rsrVar2.execSQL("update cache_info set download_token= (select token from track where original_id=track_id)");
                            asq.L(rsrVar2, "track", "CREATE TABLE IF NOT EXISTS track (_id integer primary key autoincrement, original_id text not null UNIQUE, name text, name_surrogate text, version text, duration integer, storage_type text not null, explicit integer, available text);");
                            rsrVar2.execSQL("CREATE TABLE IF NOT EXISTS play_history(_id integer primary key autoincrement, context text not null, context_id text, client text not null, latest_track_id text not null, latest_track_album_id text, play_time datetime not null);");
                        } catch (Throwable th2) {
                            try {
                                if (query == null) {
                                    throw th2;
                                }
                                try {
                                    query.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            } catch (SQLException e6) {
                                e = e6;
                                num = null;
                                Assertions.fail(e);
                                if (num != null) {
                                }
                                if (valueOf == null) {
                                }
                                rsrVar2.execSQL("update playlist_operation set playlist_id=replace(playlist_id,'-',':')");
                                rsrVar2.execSQL("alter table playlist add column liked integer default 0");
                                StringBuilder sb32222 = new StringBuilder("update playlist set liked=1 where uid<>");
                                xxqVar = xxqVar2;
                                sb32222.append(xxqVar.a);
                                rsrVar2.execSQL(sb32222.toString());
                                rsrVar2.execSQL("update playlist set original_id=3 where original_id=-99");
                                rsrVar2.execSQL("alter table cache_info add column download_token text");
                                rsrVar2.execSQL("update cache_info set download_token= (select token from track where original_id=track_id)");
                                asq.L(rsrVar2, "track", "CREATE TABLE IF NOT EXISTS track (_id integer primary key autoincrement, original_id text not null UNIQUE, name text, name_surrogate text, version text, duration integer, storage_type text not null, explicit integer, available text);");
                                rsrVar2.execSQL("CREATE TABLE IF NOT EXISTS play_history(_id integer primary key autoincrement, context text not null, context_id text, client text not null, latest_track_id text not null, latest_track_album_id text, play_time datetime not null);");
                                if (i < 63) {
                                }
                                if (i < 64) {
                                }
                                if (i < 65) {
                                }
                                if (i < 66) {
                                }
                                if (i < 67) {
                                }
                                if (i < 68) {
                                }
                                if (i < 71) {
                                }
                                if (i < 72) {
                                }
                                if (i < 73) {
                                }
                                if (i < 74) {
                                }
                                if (i < 75) {
                                }
                                String str28222 = StringUtils.PROCESS_POSTFIX_DELIMITER;
                                if (i < 76) {
                                }
                                if (i < 77) {
                                }
                                if (i < 79) {
                                }
                                if (i < 81) {
                                }
                                if (i < 82) {
                                }
                                if (i < 84) {
                                }
                                if (i < 85) {
                                }
                                if (i < 86) {
                                }
                                if (i < 87) {
                                }
                                if (i < 88) {
                                }
                                if (i < 89) {
                                }
                                if (i < 91) {
                                }
                                if (i < 92) {
                                }
                                if (i < 93) {
                                }
                                if (i < 94) {
                                }
                                if (i < 95) {
                                }
                                if (i < 96) {
                                }
                                if (i < 98) {
                                }
                                if (i < 99) {
                                }
                                if (i < 100) {
                                }
                                if (i < 101) {
                                }
                                if (i < 102) {
                                }
                                if (i < 103) {
                                }
                                if (i < 104) {
                                }
                                if (i < 105) {
                                }
                                if (i < 106) {
                                }
                                if (i < 107) {
                                }
                                if (i < 108) {
                                }
                                if (i < 109) {
                                }
                                if (i < 111) {
                                }
                                if (i < 112) {
                                }
                                if (i < 113) {
                                }
                                if (i < 114) {
                                }
                                if (i < 115) {
                                }
                                if (i < 116) {
                                }
                                if (i < 117) {
                                }
                                if (i < 118) {
                                }
                                if (i < 120) {
                                }
                                if (i < 121) {
                                }
                                if (i < 122) {
                                }
                                if (i < 123) {
                                }
                                if (i < 124) {
                                }
                                if (i < 125) {
                                }
                                if (i < 126) {
                                }
                                if (i < 127) {
                                }
                                if (i < 128) {
                                }
                                hrg.x(rsrVar2, "DROP VIEW IF EXISTS playlist_view", str19, "DROP VIEW IF EXISTS album_meta", "DROP VIEW IF EXISTS artist_meta");
                                hrg.x(rsrVar2, "DROP VIEW IF EXISTS album_artist_meta", "DROP VIEW IF EXISTS cache_info_view", "CREATE VIEW IF NOT EXISTS cache_info_view AS SELECT cache_info.track_id AS track_id,MAX(cache_info.is_permanent) AS is_permanent FROM cache_info GROUP BY cache_info.track_id", "CREATE VIEW IF NOT EXISTS playlist_view AS SELECT playlist_track._id AS _id,playlist_track.playlist_id AS playlist_id,playlist_track._id AS key,playlist_track.timestamp AS timestamp,playlist_track.position AS position_playlist,playlist_track.album_id AS playlist_album_id,track.duration AS duration,track.name AS name,track.name_surrogate AS name_surrogate,track.version AS version,track.original_id AS original_id,track.real_id AS real_id,track.warning_content AS warning_content,track.explicit AS explicit,track.storage_type AS storage_type,track.available AS available,track.for_premium AS for_premium,track.for_options AS for_options,track.lyrics_available AS lyrics_available,track.txt_lyrics_available AS txt_lyrics_available,track.sync_lyrics_available AS sync_lyrics_available,track.track_type AS track_type,track.track_source AS track_source,track.track_user AS track_user,track.track_save_progress AS track_save_progress,track.cover_video_id AS cover_video_id,track.cover_url AS cover_url,track.short_description AS short_description,track.release_date AS release_date,track.track_for_kids AS track_for_kids,track.integrated_loudness_db AS integrated_loudness_db,track.true_peak_db AS true_peak_db,track.track_disclaimer AS track_disclaimer,track.track_fade AS track_fade,album_track.album_id AS album_id,album_track.album_name AS album_name,album_track.position AS position,album_track.vol AS vol,album.album_type AS album_type,album.original_release_year AS original_release_year,album.cover_uri AS cover_uri,GROUP_CONCAT(artist_track.artist_id || '#|') AS artist_id,GROUP_CONCAT(artist_track.artist_name || '#|') AS artist_name,GROUP_CONCAT(artist_track.artist_track_various || '#|') AS artist_track_various,GROUP_CONCAT(artist_track.artist_track_cover_uri || '#|') AS artist_track_cover_uri,GROUP_CONCAT(artist_track.artist_cover_type || '#|') AS artist_cover_type,GROUP_CONCAT(artist.artist_disclaimer || '#|') AS artist_disclaimer,GROUP_CONCAT(artist.name_surrogate || '#|') AS artist_name_surrogate,MAX(cache_info.is_permanent) AS is_permanent,MIN(ABS(playlist_track.album_id - album_track.album_id)) FROM playlist_track JOIN artist ON artist.original_id=artist_track.artist_id JOIN track ON playlist_track.track_id=track.original_id JOIN album_track ON playlist_track.track_id=album_track.track_id JOIN artist_track ON artist_track.track_id=track.original_id JOIN album ON album.original_id=album_track.album_id LEFT JOIN cache_info ON cache_info.track_id=track.original_id GROUP BY playlist_track.playlist_id,playlist_track.track_id,playlist_track.position");
                                hrg.x(rsrVar2, "CREATE VIEW IF NOT EXISTS track_view AS SELECT album_track._id AS _id,track.duration AS duration,track.name AS name,track.name_surrogate AS name_surrogate,track.version AS version,track.original_id AS original_id,track.real_id AS real_id,track.warning_content AS warning_content,track.explicit AS explicit,track.storage_type AS storage_type,track.available AS available,track.for_premium AS for_premium,track.for_options AS for_options,track.lyrics_available AS lyrics_available,track.txt_lyrics_available AS txt_lyrics_available,track.sync_lyrics_available AS sync_lyrics_available,track.track_type AS track_type,track.track_source AS track_source,track.track_user AS track_user,track.track_save_progress AS track_save_progress,track.cover_video_id AS cover_video_id,track.cover_url AS cover_url,track.short_description AS short_description,track.release_date AS release_date,track.track_for_kids AS track_for_kids,track.integrated_loudness_db AS integrated_loudness_db,track.true_peak_db AS true_peak_db,track.track_disclaimer AS track_disclaimer,track.track_fade AS track_fade,album_track.album_id AS album_id,album_track.album_name AS album_name,album_track.vol AS vol,album_track.position AS position,artist_track.artist_id AS artist_id,artist_track.artist_name AS artist_name,artist_track.artist_track_various AS artist_track_various,artist_track.artist_track_cover_uri AS artist_track_cover_uri,artist.artist_disclaimer AS artist_disclaimer,album.original_release_year AS original_release_year,album.cover_uri AS cover_uri,artist_track.artist_cover_type AS artist_cover_type,album.album_type AS album_type,album.sort_order AS sort_order,MAX(cache_info.is_permanent) AS is_permanent FROM track JOIN artist_track ON artist_track.track_id=track.original_id JOIN artist ON artist.original_id=artist_track.artist_id JOIN album_track ON album_track.track_id=track.original_id JOIN album ON album.original_id=album_track.album_id LEFT JOIN cache_info ON cache_info.track_id=track.original_id GROUP BY track.original_id,album_track.album_id,artist_track.artist_id", "CREATE VIEW IF NOT EXISTS album_meta AS SELECT album.original_id AS original_id,SUM(cache_info_view.is_permanent) AS tracks_cached FROM album JOIN album_track ON album_track.album_id=album.original_id JOIN cache_info_view ON cache_info_view.track_id=album_track.track_id GROUP BY album.original_id", "CREATE VIEW IF NOT EXISTS artist_meta AS SELECT artist.original_id AS original_id,COUNT(artist_track.track_id) AS tracks,SUM(cache_info_view.is_permanent) AS tracks_cached FROM artist JOIN artist_track ON artist_track.artist_id=artist.original_id JOIN cache_info_view ON cache_info_view.track_id=artist_track.track_id GROUP BY artist.original_id", "CREATE VIEW IF NOT EXISTS album_artist_meta AS SELECT album_artist.album_id AS album_id,album_artist.artist_id AS artist_id,album_artist.artist_name AS artist_name FROM album_artist");
                                asq.z(rsrVar2);
                                super.g(rsrVar2, i >= 128 ? i : 128, i2);
                                String str29222 = xxqVar.a;
                                str29222.getClass();
                                this.g.b(rsrVar2, str29222);
                            }
                            e = e6;
                            num = null;
                        }
                    } else {
                        str4 = "playlist_track";
                        str5 = "album_track";
                        xxqVar = xxqVar2;
                    }
                    if (i < 63) {
                        rsrVar2.execSQL("alter table track add column owner_id text;");
                        rsrVar2.execSQL("alter table track add column owner_login text;");
                    }
                    if (i < 64) {
                        rsrVar2.execSQL("CREATE TABLE IF NOT EXISTS experiments ( name TEXT PRIMARY KEY, value TEXT NOT NULL );");
                    }
                    if (i < 65) {
                        rsrVar2.execSQL("CREATE TABLE IF NOT EXISTS playlist_branding(_id integer primary key autoincrement, playlist_id integer, branded_cover text not null, branded_background integer not null, branded_url text);");
                    }
                    if (i < 66) {
                        rsrVar2.execSQL("alter table playlist_branding add column branded_pixels text");
                        rsrVar2.execSQL("alter table playlist_branding add column branded_theme text");
                    }
                    if (i < 67) {
                        str7 = str;
                        asq.Y(rsrVar2, str7);
                        asq.Y(rsrVar2, "track");
                        str6 = str2;
                        asq.Y(rsrVar2, str6);
                        asq.Y(rsrVar2, "playlist");
                    } else {
                        str6 = str2;
                        str7 = str;
                    }
                    if (i < 68) {
                        Timber.d("updateCacheEncryptionInfo", new Object[0]);
                        String string2 = Settings.Secure.getString(context3.getContentResolver(), "android_id");
                        if (TextUtils.isEmpty(string2)) {
                            i10 = 1;
                            b = 85;
                        } else {
                            i10 = 1;
                            b = (byte) string2.charAt(string2.length() - 1);
                        }
                        byte b2 = b;
                        StringBuilder sb4 = new StringBuilder("ALTER TABLE cache_info ADD COLUMN chunk BLOB NOT NULL DEFAULT X'");
                        byte[] bArr = new byte[i10];
                        bArr[0] = b2;
                        sb4.append(jxd.g(bArr, mxd.d));
                        sb4.append("'");
                        rsrVar2.execSQL(sb4.toString());
                        Timber.d("addLikesPlaylistColumn", new Object[0]);
                        rsrVar2.execSQL("ALTER TABLE playlist add column likes_count INTEGER;");
                        Timber.d("create table playlist_contest_info", new Object[0]);
                        rsrVar2.execSQL("CREATE TABLE IF NOT EXISTS playlist_contest_info(user_id text not null, playlist_id integer not null, contest_id text not null, contest_status text, contest_sent text, can_edit integer, UNIQUE (contest_id, user_id) ON CONFLICT REPLACE); ");
                    }
                    if (i < 71) {
                        rsrVar2.execSQL("INSERT INTO playlist(tracks,revision,uid,name,sync,login,storage_type,created,original_id) VALUES (0,-1,?,'disliked',4,?,'YCATALOG','1970-01-01T00:00:00+0000',-14)", new Object[]{xxqVar.a, xxqVar.b});
                        rsrVar2.execSQL("alter table album add column album_type text default '';");
                    }
                    if (i < 72) {
                        Timber.d("migrateTo201806()", new Object[0]);
                        StringBuilder sb5 = new StringBuilder("alter table track add column warning_content text default '");
                        WarningContent warningContent = WarningContent.NONE;
                        sb5.append(warningContent.name());
                        sb5.append("';");
                        rsrVar2.execSQL(sb5.toString());
                        str8 = "track";
                        rsrVar2.execSQL("alter table album add column warning_content text default '" + warningContent.name() + "';");
                        rsrVar2.execSQL("alter table playlist add column auto_generated_type text;");
                        hrg.x(rsrVar2, "alter table playlist add column target_uid text;", "alter table playlist add column target_login text;", "alter table playlist add column modified datetime;", "alter table playlist add column made_for_genitive text;");
                    } else {
                        str8 = "track";
                    }
                    if (i < 73) {
                        i3 = 0;
                        Timber.d("migrateTo2018061()", new Object[0]);
                        rsrVar2.execSQL("alter table playlist_branding add column branded_screen_theme text;");
                        rsrVar2.execSQL("alter table playlist_branding add column branded_url_button_text text;");
                    } else {
                        i3 = 0;
                    }
                    if (i < 74) {
                        Timber.d("migrateTo2018071()", new Object[i3]);
                        rsrVar2.execSQL("alter table track add column lyrics_available integer default 1;");
                    }
                    if (i < 75) {
                        Timber.d("migrateTo201809()", new Object[i3]);
                        rsrVar2.execSQL("alter table playlist add column snapshot integer default 0;");
                    }
                    String str282222 = StringUtils.PROCESS_POSTFIX_DELIMITER;
                    if (i < 76) {
                        Timber.d("migrateTo201811()", new Object[i3]);
                        Cursor query3 = rsrVar2.query("SELECT album_id FROM track_operation WHERE album_id LIKE '%:%'");
                        try {
                            int columnIndex = query3.getColumnIndex("album_id");
                            while (query3.moveToNext()) {
                                String string3 = query3.getString(columnIndex);
                                String str31 = string3.split(str282222, 2)[1];
                                cursor2 = query3;
                                try {
                                    String str32 = str282222;
                                    ContentValues contentValues3 = new ContentValues(1);
                                    contentValues3.put("album_id", str31);
                                    String str33 = str6;
                                    String str34 = str8;
                                    String str35 = str27;
                                    String str36 = str4;
                                    String str37 = str7;
                                    Context context4 = context3;
                                    String str38 = str5;
                                    int i15 = columnIndex;
                                    String str39 = str26;
                                    String str40 = str25;
                                    rsrVar2 = rsrVar;
                                    rsrVar2.update("track_operation", 0, contentValues3, "album_id=?", new String[]{string3});
                                    str4 = str36;
                                    str27 = str35;
                                    str8 = str34;
                                    str282222 = str32;
                                    str25 = str40;
                                    columnIndex = i15;
                                    query3 = cursor2;
                                    str26 = str39;
                                    str6 = str33;
                                    context3 = context4;
                                    str5 = str38;
                                    str7 = str37;
                                } catch (Throwable th4) {
                                    th = th4;
                                    cursor2.close();
                                    throw th;
                                }
                            }
                            String str41 = str8;
                            str9 = str27;
                            str10 = str4;
                            str11 = str41;
                            str12 = str282222;
                            str13 = str6;
                            str14 = str7;
                            context = context3;
                            str15 = str5;
                            str16 = str26;
                            str17 = str25;
                            query3.close();
                        } catch (Throwable th5) {
                            th = th5;
                            cursor2 = query3;
                        }
                    } else {
                        String str42 = str8;
                        str9 = "_id";
                        str10 = str4;
                        str11 = str42;
                        str12 = StringUtils.PROCESS_POSTFIX_DELIMITER;
                        str13 = str6;
                        str14 = str7;
                        context = context3;
                        str15 = str5;
                        str16 = "original_id";
                        str17 = "track_operation";
                    }
                    if (i < 77) {
                        i4 = 0;
                        Timber.d("migrateTo2019031()", new Object[0]);
                        asq.u(rsrVar2, "playlist", LegacyAccountType.STRING_LOGIN, xxqVar.a, xxqVar.b);
                    } else {
                        i4 = 0;
                    }
                    if (i < 79) {
                        Timber.d("migrateTo2019052()", new Object[i4]);
                        Cursor query4 = rsrVar2.query("SELECT album_id, track_id FROM track_operation WHERE album_id LIKE '%:%' OR track_id LIKE 'android:%'");
                        try {
                            int columnIndex2 = query4.getColumnIndex("album_id");
                            int columnIndex3 = query4.getColumnIndex("track_id");
                            while (query4.moveToNext()) {
                                String string4 = query4.getString(columnIndex2);
                                int i16 = columnIndex2;
                                String string5 = query4.getString(columnIndex3);
                                cursor = query4;
                                try {
                                    if (string5.startsWith(ConstantDeviceInfo.APP_PLATFORM)) {
                                        Timber.d("migration2019052 delete operation from track_operation with invalid track_id = %s", string5);
                                        rsrVar2.delete(str17, "track_id=?", new String[]{string5});
                                        i9 = columnIndex3;
                                    } else {
                                        Timber.d("migration2019052 delete operation from track_operation with invalid album_id = %s", string4);
                                        String str43 = string4.split(str12, 2)[1];
                                        i9 = columnIndex3;
                                        ContentValues contentValues4 = new ContentValues(1);
                                        contentValues4.put("album_id", str43);
                                        rsrVar2.update("track_operation", 0, contentValues4, "album_id=?", new String[]{string4});
                                    }
                                    columnIndex3 = i9;
                                    columnIndex2 = i16;
                                    query4 = cursor;
                                } catch (Throwable th6) {
                                    th = th6;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            query4.close();
                            Cursor query5 = rsrVar2.query("SELECT track_id FROM album_track WHERE track_id LIKE 'android:%'");
                            try {
                                int columnIndex4 = query5.getColumnIndex("track_id");
                                while (query5.moveToNext()) {
                                    String string6 = query5.getString(columnIndex4);
                                    Timber.d("migration2019052 delete albumTrack from album_track with invalid track_id = %s", string6);
                                    rsrVar2.delete(str15, "track_id=?", new String[]{string6});
                                }
                                query5.close();
                                query5 = rsrVar2.query("SELECT track_id FROM artist_track WHERE track_id LIKE 'android:%'");
                                try {
                                    int columnIndex5 = query5.getColumnIndex("track_id");
                                    while (query5.moveToNext()) {
                                        String string7 = query5.getString(columnIndex5);
                                        Timber.d("migration2019052 delete artistTrack from artist_track with invalid track_id = %s", string7);
                                        rsrVar2.delete("artist_track", "track_id=?", new String[]{string7});
                                    }
                                    query5.close();
                                    query5 = rsrVar2.query("SELECT track_id FROM playlist_track WHERE track_id LIKE 'android:%'");
                                    try {
                                        int columnIndex6 = query5.getColumnIndex("track_id");
                                        while (query5.moveToNext()) {
                                            String string8 = query5.getString(columnIndex6);
                                            Timber.d("migration2019052 delete playlistTrack from playlist_track with invalid track_id = %s", string8);
                                            rsrVar2.delete(str10, "track_id=?", new String[]{string8});
                                        }
                                        query5.close();
                                        query5 = rsrVar2.query("SELECT original_id FROM track WHERE original_id LIKE 'android:%'");
                                        try {
                                            int columnIndex7 = query5.getColumnIndex(str16);
                                            while (query5.moveToNext()) {
                                                String string9 = query5.getString(columnIndex7);
                                                Timber.d("migration2019052 delete track from track with invalid original_id = %s", string9);
                                                String str44 = str11;
                                                rsrVar2.delete(str44, "original_id=?", new String[]{string9});
                                                str11 = str44;
                                            }
                                            str18 = str11;
                                        } finally {
                                        }
                                    } finally {
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            cursor = query4;
                        }
                    } else {
                        str18 = str11;
                    }
                    if (i < 81) {
                        Timber.d("migrateTo2019102()", new Object[0]);
                        rsrVar2.execSQL("alter table track add column track_type text not null default 'music';");
                        rsrVar2.execSQL("alter table track add column track_save_progress integer default 0;");
                        str19 = str3;
                        rsrVar2.execSQL(str19);
                        rsrVar2.execSQL("CREATE VIEW IF NOT EXISTS track_view AS SELECT album_track._id AS _id,track.duration AS duration,track.name AS name,track.name_surrogate AS name_surrogate,track.version AS version,track.original_id AS original_id,track.warning_content AS warning_content,track.explicit AS explicit,track.storage_type AS storage_type,track.available AS available,track.owner_id AS owner_id,track.owner_login AS owner_login,track.lyrics_available AS lyrics_available,album_track.album_id AS album_id,album_track.album_name AS album_name,album_track.vol AS vol,album_track.position AS position,artist_track.artist_id AS artist_id,artist_track.artist_name AS artist_name,album.original_release_year AS original_release_year,album.cover_uri AS cover_uri,album.album_type AS album_type,MAX(cache_info.is_permanent) AS is_permanent FROM track JOIN artist_track ON artist_track.track_id=track.original_id JOIN album_track ON album_track.track_id=track.original_id JOIN album ON album.original_id=album_track.album_id LEFT JOIN cache_info ON cache_info.track_id=track.original_id GROUP BY track.original_id,album_track.album_id,artist_track.artist_id");
                        StringBuilder sb6 = new StringBuilder("UPDATE track SET (track_type, track_save_progress) =('podcast-episode', '1') WHERE EXISTS (SELECT album_type FROM track_view WHERE track_view._id=track._id AND track_view.album_type='");
                        quk qukVar = lqs.b;
                        sb6.append(Album$AlbumType.PODCAST.a);
                        sb6.append("' LIMIT 1)");
                        rsrVar2.execSQL(sb6.toString());
                        rsrVar2.execSQL("UPDATE track SET track_type = (SELECT album_type FROM track_view WHERE track_view._id=track._id LIMIT 1), track_save_progress = '1' WHERE EXISTS (SELECT album_type FROM track_view WHERE track_view._id=track._id AND track_view.album_type IN ('article', '" + Album$AlbumType.ASMR.a + "', '" + Album$AlbumType.NOISE.a + "', '" + Album$AlbumType.RADIO_RECORD.a + "', 'show', 'lecture', '" + Album$AlbumType.FAIRY_TALE.a + "', 'poetry') LIMIT 1)");
                    } else {
                        str19 = str3;
                    }
                    if (i < 82) {
                        i5 = 0;
                        Timber.d("migrateAlbumMetaType()", new Object[0]);
                        rsrVar2.execSQL("alter table album add column album_meta_type text;");
                    } else {
                        i5 = 0;
                    }
                    if (i < 84) {
                        Timber.d("migrateAlbumShortDescription()", new Object[i5]);
                        rsrVar2.execSQL("alter table album add column short_description text;");
                        Timber.d("migrateCacheInfoHls()", new Object[i5]);
                        rsrVar2.execSQL("alter table cache_info add column manifest_uri text;");
                    }
                    if (i < 85) {
                        Timber.d("migrateTo2020101()", new Object[i5]);
                        rsrVar2.execSQL("CREATE TABLE IF NOT EXISTS play_history_non_music(_id integer primary key autoincrement, context text not null, context_id text, client text not null, latest_track_id text not null, latest_track_album_id text, play_time datetime not null);");
                    }
                    if (i < 86) {
                        Timber.d("migrateTracksAddVideoCover()", new Object[i5]);
                        rsrVar2.execSQL("alter table track add column cover_video_url text;");
                    }
                    if (i < 87) {
                        Timber.d("migrateAlbumLikesCount()", new Object[i5]);
                        rsrVar2.execSQL("alter table album add column likes_count integer;");
                        Timber.d("migrateUpdatePlaylistLoginName()", new Object[i5]);
                        if (xxqVar.a()) {
                            rsrVar2.execSQL("UPDATE playlist SET login='" + xxqVar.b + "'; WHERE original_id = 3");
                        }
                    }
                    if (i < 88) {
                        hrg.x(rsrVar2, "UPDATE album SET album_type='asmr' WHERE album_type = 'ASMR'", "UPDATE track SET track_type='asmr' WHERE track_type = 'ASMR'", "UPDATE album SET album_type='fairy_tail' WHERE album_type = 'fairy-tail'", "UPDATE track SET track_type='fairy_tail' WHERE track_type = 'fairy-tail'");
                        rsrVar2.execSQL("UPDATE album SET album_type='radio_record' WHERE album_type = 'radio-record'");
                        rsrVar2.execSQL("UPDATE track SET track_type='radio_record' WHERE track_type = 'radio-record'");
                        i6 = 0;
                        Timber.d("migrateTracksAddCover()", new Object[0]);
                        rsrVar2.execSQL("alter table track add column cover_url text;");
                    } else {
                        i6 = 0;
                    }
                    if (i < 89) {
                        Timber.d("migrateAlbumDescription()", new Object[i6]);
                        rsrVar2.execSQL("alter table album add column description text;");
                    }
                    if (i < 91) {
                        Timber.d("migrateTrackDescription()", new Object[i6]);
                        rsrVar2.execSQL("alter table track add column short_description text;");
                    }
                    if (i < 92) {
                        Timber.d("migrateArtistTrackCover()", new Object[i6]);
                        rsrVar2.execSQL("alter table artist_track add column artist_track_various integer not null default 0;");
                        rsrVar2.execSQL("alter table artist_track add column artist_track_cover_uri text;");
                    }
                    if (i < 93) {
                        Timber.d("deleteNonMusicHistory()", new Object[i6]);
                        rsrVar2.execSQL("DROP VIEW IF EXISTS album_play_history_view_non_music");
                        rsrVar2.execSQL("DROP VIEW IF EXISTS artist_play_history_view_non_music");
                        rsrVar2.execSQL("DROP VIEW IF EXISTS playlist_play_history_view_non_music");
                        rsrVar2.execSQL("DROP TABLE IF EXISTS play_history_non_music");
                    }
                    if (i < 94) {
                        rsrVar2.execSQL("alter table track add column track_for_kids integer default 0");
                        rsrVar2.execSQL("alter table album add column album_for_kids integer default 0");
                        rsrVar2.execSQL("alter table artist add column artist_for_kids integer default 0");
                    }
                    if (i < 95) {
                        rsrVar2.execSQL("alter table playlist add column playlist_for_kids integer default 0");
                    }
                    if (i < 96) {
                        Cursor query6 = rsrVar2.query(" SELECT _id FROM playlist WHERE original_id=-13");
                        int columnIndex8 = query6.getColumnIndex(str9);
                        if (query6.moveToNext()) {
                            String string10 = query6.getString(columnIndex8);
                            StringBuilder u = ouj.u("INSERT INTO playlist_track(playlist_id,track_id,album_id,position,timestamp) SELECT ", string10, ",original_id,album_id,position,timestamp FROM track_mview tm WHERE available='");
                            u.append(dg2.b);
                            u.append("' AND is_permanent=1 AND NOT EXISTS (SELECT track_id FROM playlist_track pt WHERE playlist_id=");
                            u.append(string10);
                            u.append(" AND pt.track_id=tm.original_id)");
                            rsrVar2.execSQL(u.toString());
                        }
                    }
                    if (i < 98) {
                        rsrVar2.execSQL("alter table playlist add column bg_image_url text;");
                    }
                    if (i < 99) {
                        rsrVar2.execSQL("alter table playlist add column action_text text;");
                        rsrVar2.execSQL("alter table playlist add column action_url text;");
                        rsrVar2.execSQL("alter table playlist add column action_color text;");
                    }
                    if (i < 100) {
                        rsrVar2.execSQL("alter table album add column bg_image_url text;");
                    }
                    if (i < 101) {
                        i7 = 0;
                        Timber.d("migrateTracksAddVideoVhId()", new Object[0]);
                        rsrVar2.execSQL("alter table track add column cover_video_id text;");
                    } else {
                        i7 = 0;
                    }
                    if (i < 102) {
                        Timber.d("dropGenresDb()", new Object[i7]);
                        context.deleteDatabase("genres.db");
                    }
                    if (i < 103) {
                        Timber.d("dropAdvertTable()", new Object[i7]);
                        rsrVar2.execSQL("DROP TABLE IF EXISTS advert_reports");
                    }
                    if (i < 104) {
                        Timber.d("dropContestInfoTable()", new Object[i7]);
                        rsrVar2.execSQL("DROP TABLE IF EXISTS playlist_contest_info");
                        rsrVar2.execSQL("DROP VIEW IF EXISTS contest_tracks_view");
                    }
                    if (i < 105) {
                        Timber.d("removeTrackOwner()", new Object[i7]);
                        asq.L(rsrVar2, str18, "CREATE TABLE IF NOT EXISTS track(_id integer primary key autoincrement, original_id text not null UNIQUE, name text, name_surrogate text, version text, duration integer, storage_type text not null, warning_content text not null, explicit integer, available text, lyrics_available integer default 1, track_type text not null, track_save_progress integer default 0, cover_video_url text, cover_video_id text, cover_url text, short_description text, track_for_kids integer default 0);");
                    }
                    if (i < 106) {
                        rsrVar2.execSQL("ALTER TABLE album ADD COLUMN duration_sec INTEGER;");
                    }
                    if (i < 107) {
                        i8 = 0;
                        Timber.d("addBackgroundVideoUrlInAlbumAndPlaylist()", new Object[0]);
                        rsrVar2.execSQL("alter table album add column bg_video_url text;");
                        rsrVar2.execSQL("alter table playlist add column bg_video_url text;");
                    } else {
                        i8 = 0;
                    }
                    if (i < 108) {
                        Timber.d("addTracksSyncLyrics()", new Object[i8]);
                        rsrVar2.execSQL("alter table track add column txt_lyrics_available text;");
                        rsrVar2.execSQL("alter table track add column sync_lyrics_available text;");
                    }
                    if (i < 109) {
                        rsrVar2.execSQL("ALTER TABLE track ADD COLUMN release_date TEXT;");
                    }
                    if (i < 111) {
                        Timber.d("removeActionInfoInPlaylist()", new Object[0]);
                        asq.L(rsrVar2, "playlist", "CREATE TABLE IF NOT EXISTS playlist(_id integer primary key autoincrement, original_id text not null, uid text not null, login text not null, name text, name_surrogate text, description text, revision integer, snapshot integer, created datetime not null, visibility text not null default public, storage_type text not null, sync integer default 0, cover_info text, position integer default -1, tracks integer, liked integer, likes_count integer, auto_generated_type text, modified datetime, made_for_genitive text, target_uid text, target_login text, playlist_for_kids integer,bg_image_url text,bg_video_url text);");
                        rsrVar2.execSQL("DROP TABLE IF EXISTS playlist_branding");
                    }
                    if (i < 112) {
                        rsrVar2.execSQL("ALTER TABLE track ADD COLUMN real_id TEXT;");
                    }
                    if (i < 113) {
                        asq.Y(rsrVar2, str14);
                        asq.Y(rsrVar2, str18);
                        str20 = str13;
                        asq.Y(rsrVar2, str20);
                        asq.Y(rsrVar2, "playlist");
                    } else {
                        str20 = str13;
                    }
                    if (i < 114) {
                        rsrVar2.execSQL("ALTER TABLE album ADD COLUMN sort_order TEXT;");
                    }
                    if (i < 115) {
                        rsrVar2.execSQL("alter table artist add column disliked integer default 0");
                        rsrVar2.execSQL("alter table artist add column not_synced integer default 0");
                    }
                    if (i < 116) {
                        rsrVar2.execSQL("ALTER TABLE track ADD COLUMN integrated_loudness_db REAL;");
                        rsrVar2.execSQL("ALTER TABLE track ADD COLUMN true_peak_db REAL;");
                    }
                    if (i < 117) {
                        Timber.d("addUserFullNameOwnerInPlaylist()", new Object[0]);
                        rsrVar2.execSQL("alter table playlist add column user_full_name text;");
                    }
                    if (i < 118) {
                        rsrVar2.execSQL("ALTER TABLE track ADD COLUMN track_source TEXT;");
                        rsrVar2.execSQL("ALTER TABLE track ADD COLUMN track_user TEXT;");
                    }
                    if (i < 120) {
                        hrg.x(rsrVar2, "ALTER TABLE album ADD COLUMN for_premium INTEGER DEFAULT 0;", "ALTER TABLE album ADD COLUMN for_options TEXT;", "ALTER TABLE track ADD COLUMN for_premium INTEGER DEFAULT 0;", "ALTER TABLE track ADD COLUMN for_options TEXT;");
                    }
                    if (i < 121) {
                        rsrVar2.execSQL("ALTER TABLE track ADD COLUMN track_disclaimer TEXT;");
                    }
                    if (i < 122) {
                        rsrVar2.execSQL("ALTER TABLE album ADD COLUMN album_disclaimer TEXT;");
                    }
                    if (i < 123) {
                        rsrVar2.execSQL("ALTER TABLE track ADD COLUMN track_fade TEXT;");
                    }
                    if (i < 124) {
                        asq.X(rsrVar2, str18, "track_disclaimer");
                        asq.X(rsrVar2, str20, "album_disclaimer");
                        rsrVar2.execSQL("ALTER TABLE artist ADD COLUMN artist_disclaimer TEXT;");
                    }
                    if (i < 125) {
                        rsrVar2.execSQL("ALTER TABLE playlist ADD COLUMN liked_timestamp datetime");
                    }
                    if (i < 126) {
                        Timber.d("deleteAllHistory()", new Object[0]);
                        rsrVar2.execSQL("DROP VIEW IF EXISTS album_play_history_view");
                        rsrVar2.execSQL("DROP VIEW IF EXISTS artist_play_history_view");
                        rsrVar2.execSQL("DROP VIEW IF EXISTS playlist_play_history_view");
                        rsrVar2.execSQL("DROP TABLE IF EXISTS play_history");
                    }
                    if (i < 127) {
                        rsrVar2.execSQL("CREATE TABLE IF NOT EXISTS pre_saves( original_id text not null UNIQUE,  artists text not null,  release_date datetime not null,  pre_save_date datetime not null,  milliseconds_until_release integer,  cover_uri text,  title text,  type_raw text not null,  warning_content text,  is_pre_saved integer default 0);");
                        rsrVar2.execSQL("CREATE TABLE IF NOT EXISTS pre_save_operation( _id integer primary key autoincrement,  pre_save_id text not null UNIQUE,  artist_id text not null,  type text not null);");
                    }
                    if (i < 128) {
                        rsrVar2.execSQL("alter table artist_track add column artist_cover_type text");
                        rsrVar2.execSQL("alter table artist add column cover_type text");
                    }
                }
                hrg.x(rsrVar2, "DROP VIEW IF EXISTS playlist_view", str19, "DROP VIEW IF EXISTS album_meta", "DROP VIEW IF EXISTS artist_meta");
                hrg.x(rsrVar2, "DROP VIEW IF EXISTS album_artist_meta", "DROP VIEW IF EXISTS cache_info_view", "CREATE VIEW IF NOT EXISTS cache_info_view AS SELECT cache_info.track_id AS track_id,MAX(cache_info.is_permanent) AS is_permanent FROM cache_info GROUP BY cache_info.track_id", "CREATE VIEW IF NOT EXISTS playlist_view AS SELECT playlist_track._id AS _id,playlist_track.playlist_id AS playlist_id,playlist_track._id AS key,playlist_track.timestamp AS timestamp,playlist_track.position AS position_playlist,playlist_track.album_id AS playlist_album_id,track.duration AS duration,track.name AS name,track.name_surrogate AS name_surrogate,track.version AS version,track.original_id AS original_id,track.real_id AS real_id,track.warning_content AS warning_content,track.explicit AS explicit,track.storage_type AS storage_type,track.available AS available,track.for_premium AS for_premium,track.for_options AS for_options,track.lyrics_available AS lyrics_available,track.txt_lyrics_available AS txt_lyrics_available,track.sync_lyrics_available AS sync_lyrics_available,track.track_type AS track_type,track.track_source AS track_source,track.track_user AS track_user,track.track_save_progress AS track_save_progress,track.cover_video_id AS cover_video_id,track.cover_url AS cover_url,track.short_description AS short_description,track.release_date AS release_date,track.track_for_kids AS track_for_kids,track.integrated_loudness_db AS integrated_loudness_db,track.true_peak_db AS true_peak_db,track.track_disclaimer AS track_disclaimer,track.track_fade AS track_fade,album_track.album_id AS album_id,album_track.album_name AS album_name,album_track.position AS position,album_track.vol AS vol,album.album_type AS album_type,album.original_release_year AS original_release_year,album.cover_uri AS cover_uri,GROUP_CONCAT(artist_track.artist_id || '#|') AS artist_id,GROUP_CONCAT(artist_track.artist_name || '#|') AS artist_name,GROUP_CONCAT(artist_track.artist_track_various || '#|') AS artist_track_various,GROUP_CONCAT(artist_track.artist_track_cover_uri || '#|') AS artist_track_cover_uri,GROUP_CONCAT(artist_track.artist_cover_type || '#|') AS artist_cover_type,GROUP_CONCAT(artist.artist_disclaimer || '#|') AS artist_disclaimer,GROUP_CONCAT(artist.name_surrogate || '#|') AS artist_name_surrogate,MAX(cache_info.is_permanent) AS is_permanent,MIN(ABS(playlist_track.album_id - album_track.album_id)) FROM playlist_track JOIN artist ON artist.original_id=artist_track.artist_id JOIN track ON playlist_track.track_id=track.original_id JOIN album_track ON playlist_track.track_id=album_track.track_id JOIN artist_track ON artist_track.track_id=track.original_id JOIN album ON album.original_id=album_track.album_id LEFT JOIN cache_info ON cache_info.track_id=track.original_id GROUP BY playlist_track.playlist_id,playlist_track.track_id,playlist_track.position");
                hrg.x(rsrVar2, "CREATE VIEW IF NOT EXISTS track_view AS SELECT album_track._id AS _id,track.duration AS duration,track.name AS name,track.name_surrogate AS name_surrogate,track.version AS version,track.original_id AS original_id,track.real_id AS real_id,track.warning_content AS warning_content,track.explicit AS explicit,track.storage_type AS storage_type,track.available AS available,track.for_premium AS for_premium,track.for_options AS for_options,track.lyrics_available AS lyrics_available,track.txt_lyrics_available AS txt_lyrics_available,track.sync_lyrics_available AS sync_lyrics_available,track.track_type AS track_type,track.track_source AS track_source,track.track_user AS track_user,track.track_save_progress AS track_save_progress,track.cover_video_id AS cover_video_id,track.cover_url AS cover_url,track.short_description AS short_description,track.release_date AS release_date,track.track_for_kids AS track_for_kids,track.integrated_loudness_db AS integrated_loudness_db,track.true_peak_db AS true_peak_db,track.track_disclaimer AS track_disclaimer,track.track_fade AS track_fade,album_track.album_id AS album_id,album_track.album_name AS album_name,album_track.vol AS vol,album_track.position AS position,artist_track.artist_id AS artist_id,artist_track.artist_name AS artist_name,artist_track.artist_track_various AS artist_track_various,artist_track.artist_track_cover_uri AS artist_track_cover_uri,artist.artist_disclaimer AS artist_disclaimer,album.original_release_year AS original_release_year,album.cover_uri AS cover_uri,artist_track.artist_cover_type AS artist_cover_type,album.album_type AS album_type,album.sort_order AS sort_order,MAX(cache_info.is_permanent) AS is_permanent FROM track JOIN artist_track ON artist_track.track_id=track.original_id JOIN artist ON artist.original_id=artist_track.artist_id JOIN album_track ON album_track.track_id=track.original_id JOIN album ON album.original_id=album_track.album_id LEFT JOIN cache_info ON cache_info.track_id=track.original_id GROUP BY track.original_id,album_track.album_id,artist_track.artist_id", "CREATE VIEW IF NOT EXISTS album_meta AS SELECT album.original_id AS original_id,SUM(cache_info_view.is_permanent) AS tracks_cached FROM album JOIN album_track ON album_track.album_id=album.original_id JOIN cache_info_view ON cache_info_view.track_id=album_track.track_id GROUP BY album.original_id", "CREATE VIEW IF NOT EXISTS artist_meta AS SELECT artist.original_id AS original_id,COUNT(artist_track.track_id) AS tracks,SUM(cache_info_view.is_permanent) AS tracks_cached FROM artist JOIN artist_track ON artist_track.artist_id=artist.original_id JOIN cache_info_view ON cache_info_view.track_id=artist_track.track_id GROUP BY artist.original_id", "CREATE VIEW IF NOT EXISTS album_artist_meta AS SELECT album_artist.album_id AS album_id,album_artist.artist_id AS artist_id,album_artist.artist_name AS artist_name FROM album_artist");
                asq.z(rsrVar2);
                super.g(rsrVar2, i >= 128 ? i : 128, i2);
                String str292222 = xxqVar.a;
                str292222.getClass();
                this.g.b(rsrVar2, str292222);
            }
        }
        xxqVar = xxqVar3;
        super.g(rsrVar2, i >= 128 ? i : 128, i2);
        String str2922222 = xxqVar.a;
        str2922222.getClass();
        this.g.b(rsrVar2, str2922222);
    }
}
