package defpackage;

import com.yandex.passport.common.core.f;
import com.yandex.passport.internal.database.auth_cookie.d;
import com.yandex.passport.internal.database.auth_cookie.e;
import com.yandex.passport.internal.database.diary.b;
import com.yandex.passport.internal.serialization.a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class m3u extends ot0 {
    public final /* synthetic */ int l;

    public m3u(d dVar) {
        this.l = 6;
    }

    @Override // defpackage.ot0
    public final void s(cko ckoVar, Object obj) {
        int i;
        int i2 = 0;
        switch (this.l) {
            case 0:
                c4u c4uVar = (c4u) obj;
                ckoVar.getClass();
                c4uVar.getClass();
                ckoVar.E(1, c4uVar.a);
                ckoVar.E(2, c4uVar.b);
                ckoVar.E(3, c4uVar.c);
                ckoVar.E(4, c4uVar.d);
                ckoVar.E(5, c4uVar.e);
                String str = c4uVar.f;
                if (str == null) {
                    ckoVar.bindNull(6);
                } else {
                    ckoVar.E(6, str);
                }
                ckoVar.bindLong(7, c4uVar.g);
                ckoVar.E(8, c4uVar.h);
                if (c4uVar.i == null) {
                    ckoVar.bindNull(9);
                } else {
                    ckoVar.bindLong(9, r3.intValue());
                }
                String str2 = c4uVar.j;
                if (str2 != null) {
                    ckoVar.E(10, str2);
                    break;
                } else {
                    ckoVar.bindNull(10);
                    break;
                }
            case 1:
                t9u t9uVar = (t9u) obj;
                ckoVar.getClass();
                t9uVar.getClass();
                ckoVar.E(1, t9uVar.a);
                ckoVar.E(2, t9uVar.b);
                break;
            case 2:
                mou mouVar = (mou) obj;
                ckoVar.getClass();
                mouVar.getClass();
                ckoVar.bindLong(1, mouVar.a);
                ckoVar.E(2, mouVar.b);
                ckoVar.E(3, mouVar.c);
                s9p s9pVar = mouVar.d;
                s9pVar.getClass();
                ckoVar.E(4, CollectionsKt.X(o8g.R(s9pVar), StringUtils.COMMA, null, null, null, 62));
                ckoVar.bindLong(5, mouVar.e);
                String str3 = mouVar.f;
                if (str3 == null) {
                    ckoVar.bindNull(6);
                } else {
                    ckoVar.E(6, str3);
                }
                Long l = mouVar.g;
                if (l == null) {
                    ckoVar.bindNull(7);
                } else {
                    ckoVar.bindLong(7, l.longValue());
                }
                Long l2 = mouVar.h;
                if (l2 == null) {
                    ckoVar.bindNull(8);
                } else {
                    ckoVar.bindLong(8, l2.longValue());
                }
                ckoVar.E(9, mouVar.i);
                String str4 = mouVar.j;
                if (str4 != null) {
                    ckoVar.E(10, str4);
                    break;
                } else {
                    ckoVar.bindNull(10);
                    break;
                }
            case 3:
                k4w k4wVar = (k4w) obj;
                ckoVar.getClass();
                k4wVar.getClass();
                ckoVar.E(1, k4wVar.a);
                ckoVar.E(2, k4wVar.b);
                break;
            case 4:
                t4w t4wVar = (t4w) obj;
                ckoVar.getClass();
                t4wVar.getClass();
                ckoVar.E(1, t4wVar.a);
                ckoVar.bindLong(2, ezf.P(t4wVar.b));
                ckoVar.E(3, t4wVar.c);
                ckoVar.E(4, t4wVar.d);
                q97 q97Var = q97.b;
                ckoVar.bindBlob(5, cxb.l0(t4wVar.e));
                ckoVar.bindBlob(6, cxb.l0(t4wVar.f));
                ckoVar.bindLong(7, t4wVar.g);
                ckoVar.bindLong(8, t4wVar.h);
                ckoVar.bindLong(9, t4wVar.i);
                ckoVar.bindLong(10, t4wVar.k);
                bk2 bk2Var = t4wVar.l;
                bk2Var.getClass();
                int ordinal = bk2Var.ordinal();
                if (ordinal == 0) {
                    i = 0;
                } else if (ordinal != 1) {
                    b6e.s();
                    break;
                } else {
                    i = 1;
                }
                ckoVar.bindLong(11, i);
                ckoVar.bindLong(12, t4wVar.m);
                ckoVar.bindLong(13, t4wVar.n);
                ckoVar.bindLong(14, t4wVar.o);
                ckoVar.bindLong(15, t4wVar.p);
                ckoVar.bindLong(16, t4wVar.q ? 1L : 0L);
                nxj nxjVar = t4wVar.r;
                nxjVar.getClass();
                int ordinal2 = nxjVar.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        b6e.s();
                        break;
                    } else {
                        i2 = 1;
                    }
                }
                ckoVar.bindLong(17, i2);
                ckoVar.bindLong(18, t4wVar.s);
                ckoVar.bindLong(19, t4wVar.t);
                ckoVar.bindLong(20, t4wVar.u);
                ckoVar.bindLong(21, t4wVar.v);
                ckoVar.bindLong(22, t4wVar.w);
                String str5 = t4wVar.x;
                if (str5 == null) {
                    ckoVar.bindNull(23);
                } else {
                    ckoVar.E(23, str5);
                }
                Boolean bool = t4wVar.y;
                if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
                    ckoVar.bindNull(24);
                } else {
                    ckoVar.bindLong(24, r3.intValue());
                }
                fa6 fa6Var = t4wVar.j;
                ckoVar.bindLong(25, ezf.K(fa6Var.a));
                ckoVar.bindBlob(26, ezf.C(fa6Var.b));
                ckoVar.bindLong(27, fa6Var.c ? 1L : 0L);
                ckoVar.bindLong(28, fa6Var.d ? 1L : 0L);
                ckoVar.bindLong(29, fa6Var.e ? 1L : 0L);
                ckoVar.bindLong(30, fa6Var.f ? 1L : 0L);
                ckoVar.bindLong(31, fa6Var.g);
                ckoVar.bindLong(32, fa6Var.h);
                ckoVar.bindBlob(33, ezf.O(fa6Var.i));
                break;
            case 5:
                y4w y4wVar = (y4w) obj;
                ckoVar.getClass();
                y4wVar.getClass();
                ckoVar.E(1, y4wVar.a);
                ckoVar.E(2, y4wVar.b);
                break;
            case 6:
                e eVar = (e) obj;
                f fVar = eVar.a;
                fVar.getClass();
                w3f w3fVar = x3f.d;
                ckoVar.E(1, w3fVar.c(a.a, fVar));
                List list = eVar.b;
                list.getClass();
                w3fVar.getClass();
                ckoVar.E(2, w3fVar.c(new qy0(tkr.a, 0), list));
                String str6 = eVar.c;
                if (str6 != null) {
                    ckoVar.E(3, str6);
                    break;
                } else {
                    ckoVar.bindNull(3);
                    break;
                }
            case 7:
                com.yandex.passport.internal.database.diary.a aVar = (com.yandex.passport.internal.database.diary.a) obj;
                aVar.getClass();
                ckoVar.bindLong(1, 0L);
                String str7 = aVar.a;
                if (str7 == null) {
                    ckoVar.bindNull(2);
                } else {
                    ckoVar.E(2, str7);
                }
                ckoVar.bindLong(3, aVar.b ? 1L : 0L);
                ckoVar.bindLong(4, aVar.c);
                ckoVar.bindNull(5);
                break;
            case 8:
                b bVar = (b) obj;
                bVar.getClass();
                ckoVar.bindLong(1, 0L);
                String str8 = bVar.a;
                if (str8 == null) {
                    ckoVar.bindNull(2);
                } else {
                    ckoVar.E(2, str8);
                }
                String str9 = bVar.b;
                if (str9 == null) {
                    ckoVar.bindNull(3);
                } else {
                    ckoVar.E(3, str9);
                }
                ckoVar.E(4, bVar.c);
                ckoVar.bindLong(5, bVar.d);
                ckoVar.bindNull(6);
                break;
            default:
                com.yandex.passport.internal.database.diary.f fVar2 = (com.yandex.passport.internal.database.diary.f) obj;
                ckoVar.bindLong(1, fVar2.a);
                ckoVar.bindLong(2, fVar2.b);
                break;
        }
    }

    @Override // defpackage.ot0
    public final String w() {
        switch (this.l) {
            case 0:
                return "INSERT OR REPLACE INTO `video_clip` (`video_clip_id`,`title`,`name_surrogate`,`playerId`,`thumbnail`,`previewUrl`,`duration`,`disclaimers`,`like_status`,`timestamp`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            case 1:
                return "INSERT OR IGNORE INTO `video_clip_track` (`video_clip_id`,`track_id`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `wave_feedback` (`id`,`type`,`rotor_session_id`,`seeds`,`timestamp`,`track_id`,`total_played_ms`,`track_duration_ms`,`playable_from`,`batch_id`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
            case 6:
                return "INSERT OR REPLACE INTO `modern_auth_cookie` (`uid`,`cookies`,`domain`) VALUES (?,?,?)";
            case 7:
                return "INSERT OR ABORT INTO `diary_method` (`id`,`name`,`isUiMethod`,`issuedAt`,`uploadId`) VALUES (nullif(?, 0),?,?,?,?)";
            case 8:
                return "INSERT OR ABORT INTO `diary_parameter` (`id`,`name`,`methodName`,`value`,`issuedAt`,`uploadId`) VALUES (nullif(?, 0),?,?,?,?,?)";
            default:
                return "INSERT OR ABORT INTO `diary_upload` (`id`,`uploadedAt`) VALUES (nullif(?, 0),?)";
        }
    }

    public /* synthetic */ m3u(int i) {
        this.l = i;
    }
}
