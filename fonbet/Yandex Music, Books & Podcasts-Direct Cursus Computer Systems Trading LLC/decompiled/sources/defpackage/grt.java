package defpackage;

import android.content.Context;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes5.dex */
public final /* synthetic */ class grt implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ grt(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        drt drtVar;
        List split$default;
        String str;
        Integer valueOf;
        switch (this.a) {
            case 0:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new cpr((frt) l13Var.a.D(hag.I(frt.class), l13Var, l13Var.b));
            case 1:
                ((rsr) obj).getClass();
                return Unit.a;
            case 2:
                ((rsr) obj).getClass();
                return Unit.a;
            case 3:
                rsr rsrVar = (rsr) obj;
                rsrVar.getClass();
                rsrVar.execSQL("ALTER TABLE wave_feedback ADD COLUMN seeds TEXT NOT NULL DEFAULT ''");
                return Unit.a;
            case 4:
                rsr rsrVar2 = (rsr) obj;
                rsrVar2.getClass();
                rsrVar2.execSQL("ALTER TABLE tracks_cache ADD COLUMN realQuality TEXT NOT NULL DEFAULT 'Normal'");
                rsrVar2.execSQL("UPDATE tracks_cache SET realQuality = quality");
                return Unit.a;
            case 5:
                rsr rsrVar3 = (rsr) obj;
                rsrVar3.getClass();
                rsrVar3.execSQL("CREATE TABLE IF NOT EXISTS `auto_tracks_cache_info` (`track_id` TEXT NOT NULL, `cache_info` TEXT NOT NULL, PRIMARY KEY(`track_id`))");
                return Unit.a;
            case 6:
                rsr rsrVar4 = (rsr) obj;
                rsrVar4.getClass();
                o8g.C(rsrVar4, "CREATE TABLE IF NOT EXISTS `tracks_cache` (`track_id` TEXT NOT NULL, `quality` TEXT NOT NULL, `storage` TEXT NOT NULL, `cache_type` TEXT NOT NULL DEFAULT 'Temp', `container` TEXT NOT NULL, `added_timestamp` INTEGER NOT NULL, `uri` TEXT NOT NULL, `gain` INTEGER, `truePeakDb` REAL, `integratedLoudnessDb` REAL, `codec` TEXT NOT NULL DEFAULT 'unknown', `bitrate` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`track_id`, `quality`, `storage`))");
                return Unit.a;
            case 7:
                rsr rsrVar5 = (rsr) obj;
                rsrVar5.getClass();
                rsrVar5.execSQL("CREATE TABLE IF NOT EXISTS `wave_feedback` (`id` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, `type` TEXT NOT NULL, `rotor_session_id` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `track_id` TEXT, `total_played_ms` INTEGER, `track_duration_ms` INTEGER, `playable_from` TEXT NOT NULL, `batch_id` TEXT)");
                return Unit.a;
            case 8:
                rsr rsrVar6 = (rsr) obj;
                rsrVar6.getClass();
                rsrVar6.execSQL("ALTER TABLE tracks_cache ADD COLUMN codec TEXT NOT NULL DEFAULT 'unknown'");
                rsrVar6.execSQL("ALTER TABLE tracks_cache ADD COLUMN bitrate INTEGER NOT NULL DEFAULT 0");
                return Unit.a;
            case 9:
                rsr rsrVar7 = (rsr) obj;
                rsrVar7.getClass();
                rsrVar7.execSQL("UPDATE tracks_cache SET cache_type = 'Strong' WHERE tracks_cache.is_permanent == 1");
                rsrVar7.execSQL("DELETE FROM downloadedAlbums");
                rsrVar7.execSQL("DELETE FROM downloadedPlaylists");
                return Unit.a;
            case 10:
                rsr rsrVar8 = (rsr) obj;
                rsrVar8.getClass();
                rsrVar8.execSQL("CREATE TABLE downloadedAlbums (\nalbumId TEXT NOT NULL UNIQUE,\ndownloadedTimestamp INTEGER NOT NULL\n)");
                rsrVar8.execSQL("CREATE TABLE downloadedPlaylists (\nuserUid TEXT NOT NULL,\nuserLogin TEXT NOT NULL,\nuserName TEXT,\nkind TEXT NOT NULL,\ndownloadedTimestamp INTEGER NOT NULL\n)");
                rsrVar8.execSQL("CREATE UNIQUE INDEX downloadedPlaylists_ind_userUid_kind ON downloadedPlaylists (userUid, kind)");
                return Unit.a;
            case 11:
                rsr rsrVar9 = (rsr) obj;
                rsrVar9.getClass();
                rsrVar9.execSQL("ALTER TABLE tracks_cache ADD COLUMN cache_type TEXT NOT NULL DEFAULT 'Temp'");
                rsrVar9.execSQL("UPDATE tracks_cache SET cache_type = CASE WHEN is_permanent = 0 THEN 'Temp' ELSE 'Strong' END;");
                return Unit.a;
            case 12:
                rsr rsrVar10 = (rsr) obj;
                rsrVar10.getClass();
                rsrVar10.execSQL("ALTER TABLE tracks_cache ADD COLUMN gain INTEGER");
                rsrVar10.execSQL("ALTER TABLE tracks_cache ADD COLUMN truePeakDb REAL");
                rsrVar10.execSQL("ALTER TABLE tracks_cache ADD COLUMN integratedLoudnessDb REAL");
                return Unit.a;
            case 13:
                rsr rsrVar11 = (rsr) obj;
                rsrVar11.getClass();
                rsrVar11.execSQL("DROP TABLE IF EXISTS prerolls");
                return Unit.a;
            case 14:
                rsr rsrVar12 = (rsr) obj;
                rsrVar12.getClass();
                rsrVar12.execSQL("ALTER TABLE playbackProgress ADD COLUMN totalLengthMills INTEGER NOT NULL DEFAULT 0");
                return Unit.a;
            case 15:
                rsr rsrVar13 = (rsr) obj;
                rsrVar13.getClass();
                rsrVar13.execSQL("CREATE TABLE tracks_cache (\ntrack_id TEXT NOT NULL,\nquality TEXT NOT NULL,\nstorage TEXT NOT NULL,\nis_permanent INTEGER NOT NULL,\ncontainer TEXT NOT NULL,\nadded_timestamp INTEGER NOT NULL,\nuri TEXT NOT NULL,\nUNIQUE (track_id, quality, storage)\n)");
                rsrVar13.execSQL("CREATE INDEX tracks_cache_ind_track_id ON tracks_cache (track_id)");
                return Unit.a;
            case 16:
                rsr rsrVar14 = (rsr) obj;
                rsrVar14.getClass();
                rsrVar14.execSQL("CREATE TABLE albumTrackOrder (\nalbumId TEXT NOT NULL UNIQUE,\ntrackOrder INTEGER NOT NULL\n)");
                rsrVar14.execSQL("CREATE UNIQUE INDEX albumTrackOrder_ind_albumId ON albumTrackOrder (albumId)");
                return Unit.a;
            case 17:
                rsr rsrVar15 = (rsr) obj;
                rsrVar15.getClass();
                rsrVar15.execSQL("DROP TABLE IF EXISTS playbackSpeed");
                rsrVar15.execSQL("CREATE TABLE playbackSpeed (\nalbumId TEXT NOT NULL UNIQUE,\nplaybackSpeed INTEGER NOT NULL\n)");
                rsrVar15.execSQL("CREATE UNIQUE INDEX playbackSpeed_ind_albumId ON playbackSpeed (albumId)");
                return Unit.a;
            case 18:
                ((rsr) obj).getClass();
                return Unit.a;
            case 19:
                rsr rsrVar16 = (rsr) obj;
                rsrVar16.getClass();
                rsrVar16.execSQL("CREATE TABLE playbackProgress (\ntrackId TEXT NOT NULL UNIQUE,\nprogress INTEGER NOT NULL,\ncomplete INTEGER NOT NULL,\nupdateTimeMills INTEGER NOT NULL\n)");
                rsrVar16.execSQL("CREATE UNIQUE INDEX playbackProgress_ind_trackId ON playbackProgress (trackId)");
                return Unit.a;
            case 20:
                yxc yxcVar = (yxc) obj;
                return new Pair((yxcVar == null || (drtVar = yxcVar.a) == null) ? null : drtVar.a, yxcVar != null ? Boolean.valueOf(yxcVar.h) : null);
            case 21:
                String str2 = (String) obj;
                str2.getClass();
                split$default = StringsKt__StringsKt.split$default(str2, new String[]{"=#="}, false, 0, 6, null);
                return split$default;
            case 22:
                List list = (List) obj;
                list.getClass();
                return Boolean.valueOf(list.size() == 2);
            case 23:
                ou0 ou0Var = (ou0) obj;
                ou0Var.getClass();
                return Boolean.valueOf(ou0Var == ou0.c);
            case 24:
                vz1.e((o18) obj, wa.class).E(new grt(25));
                return Unit.a;
            case 25:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new wa(l13Var2.b(hag.I(Context.class), true));
            case 26:
                Pair pair = (Pair) obj;
                pair.getClass();
                Boolean bool = (Boolean) pair.a;
                bool.getClass();
                x1u a = s2u.a((y9u) pair.b);
                return new Pair(bool, a != null ? a.a : null);
            case 27:
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                cko D0 = xjoVar.D0("SELECT * FROM video_clip WHERE like_status != 0");
                try {
                    int v = s7g.v(D0, "video_clip_id");
                    int v2 = s7g.v(D0, "title");
                    int v3 = s7g.v(D0, "name_surrogate");
                    int v4 = s7g.v(D0, "playerId");
                    int v5 = s7g.v(D0, "thumbnail");
                    int v6 = s7g.v(D0, "previewUrl");
                    int v7 = s7g.v(D0, "duration");
                    int v8 = s7g.v(D0, "disclaimers");
                    int v9 = s7g.v(D0, "like_status");
                    int v10 = s7g.v(D0, "timestamp");
                    ArrayList arrayList = new ArrayList();
                    while (D0.q()) {
                        String x0 = D0.x0(v);
                        String x02 = D0.x0(v2);
                        String x03 = D0.x0(v3);
                        String x04 = D0.x0(v4);
                        String x05 = D0.x0(v5);
                        String x06 = D0.isNull(v6) ? null : D0.x0(v6);
                        long j = D0.getLong(v7);
                        String x07 = D0.x0(v8);
                        if (D0.isNull(v9)) {
                            str = x0;
                            valueOf = null;
                        } else {
                            str = x0;
                            valueOf = Integer.valueOf((int) D0.getLong(v9));
                        }
                        arrayList.add(new c4u(str, x02, x03, x04, x05, x06, j, x07, valueOf, D0.isNull(v10) ? null : D0.x0(v10)));
                    }
                    return arrayList;
                } finally {
                    D0.close();
                }
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, gp4.class).D(new grt(29));
                o18Var.b(hag.I(nc5.class)).D(new d4u(0));
                o18Var.b(hag.I(p6u.class)).E(new d4u(1));
                o18Var.b(hag.I(g4u.class)).E(new d4u(2));
                o18Var.b(hag.I(w5u.class)).D(new d4u(3));
                o18Var.b(hag.I(u9u.class)).E(new d4u(4));
                o18Var.b(hag.I(e4u.class)).D(new d4u(5));
                o18Var.b(hag.I(h4u.class)).E(new d4u(6));
                o18Var.b(hag.I(s2u.class)).E(new d4u(7));
                return Unit.a;
            default:
                ((l13) obj).getClass();
                return new gp4();
        }
    }

    public /* synthetic */ grt(int i, Object obj) {
        this.a = i;
    }
}
