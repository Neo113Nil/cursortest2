package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.video.m3.player.ui.debug.model.CurrentStreamType;
import ru.yandex.video.m3.player.ui.debug.model.CurrentVideoType;
import ru.yandex.video.m3.player.ui.debug.model.DrmMode;

/* loaded from: classes6.dex */
public abstract class lf7 {
    public static final qs5 a = new qs5(bs5.K);

    public static final void a(qe7 qe7Var, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        String M;
        CurrentVideoType currentVideoType;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-220750962);
        int i3 = i & 6;
        qho qhoVar = qho.a;
        if (i3 == 0) {
            i2 = (oq5Var.f(qhoVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(qe7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        int i4 = i2;
        int i5 = 0;
        if ((i4 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci a2 = qhoVar.a(j(oq5Var) ? 0.8f : 0.75f, yciVar, true);
            oq5Var.a0(-483455358);
            ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            oq5Var.a0(-1323940314);
            int i6 = oq5Var.P;
            a l = oq5Var.l();
            xp5.T.getClass();
            grb grbVar = wp5.b;
            wn5 A = ghh.A(a2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var);
            }
            A.invoke(new lrq(oq5Var), oq5Var, 0);
            oq5Var.a0(2058660585);
            String M2 = rvf.M(R.string.bandwidth_estimation_label, oq5Var);
            tk2 tk2Var = qe7Var.l;
            String str = qe7Var.r;
            oq5Var.a0(218942534);
            String i7 = neg.i(tk2Var != null ? Long.valueOf(tk2Var.b) : null, oq5Var);
            oq5Var.p(false);
            List list = qe7Var.u;
            long j = qe7Var.x;
            wct.B(oq5Var).getClass();
            wct.B(oq5Var).getClass();
            int i8 = 6 | ((i4 << 9) & 458752);
            quj.f(M2, i7, list, j, yciVar, oq5Var, i8);
            float f = 2;
            u1g.l(oq5Var, d.e(yciVar, f));
            String M3 = rvf.M(R.string.buffer_size_label, oq5Var);
            pi3 pi3Var = qe7Var.o;
            Long l2 = qe7Var.p;
            oq5Var.a0(-2045450263);
            String N = rvf.N(R.string.buffer_size_template, new Object[]{Float.valueOf((pi3Var != null ? Float.valueOf(pi3Var.b / 1000.0f) : r10).floatValue()), Float.valueOf((l2 != null ? Float.valueOf(l2.longValue() / 1000.0f) : -1).floatValue())}, oq5Var);
            oq5Var.p(false);
            List list2 = qe7Var.w;
            long j2 = qe7Var.x;
            wct.B(oq5Var).getClass();
            wct.B(oq5Var).getClass();
            quj.f(M3, N, list2, j2, yciVar, oq5Var, i8);
            u1g.l(oq5Var, d.e(yciVar, f));
            String M4 = rvf.M(R.string.bytes_loaded_label, oq5Var);
            rn3 rn3Var = qe7Var.n;
            oq5Var.a0(1893563310);
            String i9 = neg.i(rn3Var != null ? Long.valueOf(rn3Var.a) : null, oq5Var);
            oq5Var.p(false);
            List list3 = qe7Var.v;
            long j3 = qe7Var.x;
            wct.B(oq5Var).getClass();
            wct.B(oq5Var).getClass();
            quj.g(M4, i9, list3, j3, yciVar, oq5Var, i8);
            zmf zmfVar = qe7Var.q;
            wb6 wb6Var = qe7Var.b;
            boolean z = (wb6Var == null || (currentVideoType = wb6Var.c) == null || (currentVideoType != CurrentVideoType.LIVE && currentVideoType != CurrentVideoType.EVENT)) ? false : true;
            oq5Var.a0(1789155981);
            if (zmfVar != null && z) {
                String M5 = rvf.M(R.string.latency_label, oq5Var);
                oq5Var.a0(-465033004);
                Long l3 = zmfVar.a;
                Long l4 = zmfVar.b;
                if (l3.longValue() < 0 || l4.longValue() < 0) {
                    oq5Var.a0(-1719580823);
                    M = rvf.M(R.string.latency_not_in_live_text, oq5Var);
                    oq5Var.p(false);
                } else {
                    oq5Var.a0(-1719686006);
                    M = rvf.N(R.string.latency_in_live_template, new Object[]{l3, l4}, oq5Var);
                    oq5Var.p(false);
                }
                oq5Var.p(false);
                wct.B(oq5Var).getClass();
                wct.B(oq5Var).getClass();
                quj.h(6 | ((i4 << 3) & 7168), oq5Var, yciVar, M5, M);
            }
            oq5Var.p(false);
            String M6 = rvf.M(R.string.extra_info_label, oq5Var);
            String str2 = qe7Var.k;
            String str3 = qe7Var.s;
            oq5Var.a0(479630744);
            oq5Var.a0(-711665997);
            if (str2 == null) {
                str2 = neg.z(oq5Var);
            }
            oq5Var.p(false);
            oq5Var.a0(-711664468);
            if (str3 == null) {
                str3 = neg.z(oq5Var);
            }
            oq5Var.p(false);
            String N2 = rvf.N(R.string.extra_info_template, new Object[]{str2, str3}, oq5Var);
            oq5Var.p(false);
            wct.B(oq5Var).getClass();
            wct.B(oq5Var).getClass();
            int i10 = 6 | ((i4 << 3) & 7168);
            quj.h(i10, oq5Var, yciVar, M6, N2);
            oq5Var.a0(1789182060);
            if (str != null) {
                String M7 = rvf.M(R.string.last_error_label, oq5Var);
                oq5Var.a0(-770330235);
                oq5Var.p(false);
                wct.B(oq5Var).getClass();
                wct.B(oq5Var).getClass();
                quj.h(i10, oq5Var, yciVar, M7, str);
            }
            k5r.s(oq5Var, false, false, true, false);
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kf7(qe7Var, yciVar, i, i5);
        }
    }

    public static final void b(vdr vdrVar, yci yciVar, xbl xblVar, wbl wblVar, hq5 hq5Var, int i) {
        vdrVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-905909998);
        int i2 = (oq5Var.h(vdrVar) ? 4 : 2) | i | 48 | (oq5Var.f(xblVar) ? 256 : 128) | (oq5Var.f(wblVar) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.U();
            if ((i & 1) == 0 || oq5Var.y()) {
                yciVar = vci.a;
            } else {
                oq5Var.S();
            }
            oq5Var.q();
            etn.l(a.a(xblVar), ild.s(oq5Var, -2066768430, new lf0(4, wblVar, yciVar, bcx.x(vdrVar, oq5Var, i2 & 14))), oq5Var, 56);
        }
        yci yciVar2 = yciVar;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pu6(vdrVar, yciVar2, xblVar, wblVar, i);
        }
    }

    public static final void c(wb6 wb6Var, DrmMode drmMode, boolean z, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1068870031);
        int i3 = i & 6;
        wa5 wa5Var = wa5.a;
        if (i3 == 0) {
            i2 = (oq5Var.f(wa5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(wb6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(drmMode) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.g(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            yciVar2 = yciVar;
            i2 |= oq5Var.f(yciVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            yciVar2 = yciVar;
        }
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            String M = rvf.M(R.string.content_label, oq5Var);
            int i4 = i2 >> 3;
            oq5Var.a0(812058684);
            oq5Var.a0(-592165939);
            if (wb6Var != null) {
                String str = wb6Var.a;
                oq5Var.a0(-592165388);
                if (str == null) {
                    str = neg.z(oq5Var);
                }
                oq5Var.p(false);
                oq5Var.a0(-592163558);
                if (z) {
                    r10 = str;
                } else {
                    String name = drmMode != null ? drmMode.name() : null;
                    oq5Var.a0(276583051);
                    if (name == null) {
                        name = neg.z(oq5Var);
                    }
                    oq5Var.p(false);
                    CurrentVideoType currentVideoType = wb6Var.c;
                    String name2 = currentVideoType != null ? currentVideoType.name() : null;
                    oq5Var.a0(276584953);
                    if (name2 == null) {
                        name2 = neg.z(oq5Var);
                    }
                    oq5Var.p(false);
                    CurrentStreamType currentStreamType = wb6Var.b;
                    r10 = currentStreamType != null ? currentStreamType.name() : null;
                    oq5Var.a0(276587322);
                    if (r10 == null) {
                        r10 = neg.z(oq5Var);
                    }
                    oq5Var.p(false);
                    r10 = rvf.N(R.string.content_template, new Object[]{str, name, name2, r10}, oq5Var);
                }
                oq5Var.p(false);
            }
            oq5Var.p(false);
            if (r10 == null) {
                r10 = neg.z(oq5Var);
            }
            oq5Var.p(false);
            oq5Var.a0(1222878633);
            qs5 qs5Var = a;
            xbl xblVar = (xbl) oq5Var.j(qs5Var);
            oq5Var.p(false);
            xblVar.getClass();
            oq5Var.a0(1222878633);
            xbl xblVar2 = (xbl) oq5Var.j(qs5Var);
            oq5Var.p(false);
            xblVar2.getClass();
            quj.e(wa5Var, M, r10, yciVar2, true, oq5Var, (i2 & 14) | (i4 & 7168));
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new jf7(wb6Var, drmMode, z, yciVar, i, 0);
        }
    }

    public static final void d(qe7 qe7Var, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1127788655);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(qe7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            oq5Var.a0(693286680);
            nho a2 = lho.a(qx0.a, b2c.k, oq5Var, 0);
            oq5Var.a0(-1323940314);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            xp5.T.getClass();
            grb grbVar = wp5.b;
            wn5 A = ghh.A(vci.a);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            A.invoke(new lrq(oq5Var), oq5Var, 0);
            oq5Var.a0(2058660585);
            int i4 = i2 << 3;
            a(qe7Var, yciVar, oq5Var, (i4 & 896) | (i4 & 112) | 6);
            yciVar2 = yciVar;
            cb0.j(qe7Var.a, qe7Var.y, qe7Var.t, yciVar2, oq5Var, 6 | ((i2 << 9) & 57344));
            k5r.s(oq5Var, false, true, false, false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kf7(qe7Var, yciVar2, i, 1);
        }
    }

    public static final void e(zpr zprVar, boolean z, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        String str;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2023424689);
        int i3 = i & 6;
        wa5 wa5Var = wa5.a;
        if (i3 == 0) {
            i2 = (oq5Var.f(wa5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(zprVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            String M = rvf.M(R.string.subtitles_track_label, oq5Var);
            oq5Var.a0(-1770215484);
            oq5Var.a0(-708832655);
            if (zprVar == null) {
                str = null;
            } else {
                str = zprVar.a;
                oq5Var.a0(-708832157);
                if (str == null) {
                    str = neg.z(oq5Var);
                }
                oq5Var.p(false);
                oq5Var.a0(-708830336);
                if (!z) {
                    Object obj = zprVar.b;
                    oq5Var.a0(2089616836);
                    if (obj == null) {
                        obj = neg.z(oq5Var);
                    }
                    oq5Var.p(false);
                    String str2 = zprVar.c;
                    oq5Var.a0(2089619077);
                    if (str2 == null) {
                        str2 = neg.z(oq5Var);
                    }
                    oq5Var.p(false);
                    str = rvf.N(R.string.subtitle_track_template, new Object[]{str, obj, str2}, oq5Var);
                }
                oq5Var.p(false);
            }
            oq5Var.p(false);
            if (str == null) {
                str = neg.z(oq5Var);
            }
            oq5Var.p(false);
            oq5Var.a0(1222878633);
            qs5 qs5Var = a;
            xbl xblVar = (xbl) oq5Var.j(qs5Var);
            oq5Var.p(false);
            boolean z2 = xblVar.a;
            oq5Var.a0(1222878633);
            xbl xblVar2 = (xbl) oq5Var.j(qs5Var);
            oq5Var.p(false);
            xblVar2.getClass();
            String str3 = str;
            yciVar2 = yciVar;
            quj.e(wa5Var, M, str3, yciVar2, z2, oq5Var, i2 & 7182);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new si0(zprVar, z, yciVar2, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    public static final void f(jg7 jg7Var, jg7 jg7Var2, int i, boolean z, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        String str;
        boolean z2;
        boolean z3;
        String str2;
        ?? r1;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(73893652);
        int i4 = i2 & 6;
        wa5 wa5Var = wa5.a;
        if (i4 == 0) {
            i3 = (oq5Var.f(wa5Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(jg7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(jg7Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.d(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.g(z) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i3 |= oq5Var.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i3) == 74898 && oq5Var.z()) {
            oq5Var.S();
        } else {
            String M = rvf.M(R.string.video_decoder_label, oq5Var);
            Integer valueOf = Integer.valueOf(i);
            int i5 = i3 >> 6;
            oq5Var.a0(-1027636450);
            oq5Var.a0(1283211371);
            if (jg7Var == null) {
                z3 = false;
                str = null;
            } else {
                str = jg7Var.a;
                oq5Var.a0(1283211079);
                if (str == null) {
                    str = neg.z(oq5Var);
                }
                oq5Var.p(false);
                oq5Var.a0(1283213442);
                if (z) {
                    z2 = false;
                } else {
                    Integer num = jg7Var.b;
                    if (num == null) {
                        num = r3;
                    }
                    Integer num2 = jg7Var.c;
                    if (num2 == null) {
                        num2 = r3;
                    }
                    Integer num3 = jg7Var.d;
                    if (num3 == null) {
                        num3 = r3;
                    }
                    Object obj = jg7Var.e;
                    oq5Var.a0(-454098667);
                    if (obj == null) {
                        obj = neg.z(oq5Var);
                    }
                    oq5Var.p(false);
                    oq5Var.a0(1222878633);
                    xbl xblVar = (xbl) oq5Var.j(a);
                    z2 = false;
                    z2 = false;
                    oq5Var.p(false);
                    if (xblVar.b) {
                        oq5Var.a0(-1191946483);
                        str = rvf.N(R.string.video_decoder_template, new Object[]{str, num, num2, num3, obj, valueOf}, oq5Var);
                        oq5Var.p(false);
                    } else {
                        oq5Var.a0(-1191640823);
                        str = rvf.N(R.string.video_decoder_template_no_inits_reuses_releases, new Object[]{str, obj, valueOf}, oq5Var);
                        oq5Var.p(false);
                    }
                }
                oq5Var.p(z2);
                z3 = z2;
            }
            oq5Var.p(z3);
            if (str == null) {
                str = neg.z(oq5Var);
            }
            oq5Var.p(z3);
            String M2 = rvf.M(R.string.audio_decoder_label, oq5Var);
            oq5Var.a0(1613072256);
            oq5Var.a0(-155948684);
            if (jg7Var2 == null) {
                str2 = null;
                r1 = z3;
            } else {
                str2 = jg7Var2.a;
                oq5Var.a0(-155948372);
                if (str2 == null) {
                    str2 = neg.z(oq5Var);
                }
                oq5Var.p(z3);
                oq5Var.a0(-155946613);
                boolean z4 = z3;
                if (!z) {
                    Integer num4 = jg7Var2.b;
                    if (num4 == null) {
                        num4 = r3;
                    }
                    Integer num5 = jg7Var2.c;
                    if (num5 == null) {
                        num5 = r3;
                    }
                    Integer num6 = jg7Var2.d;
                    r3 = num6 != null ? num6 : -1;
                    Boolean bool = jg7Var2.e;
                    oq5Var.a0(-444207878);
                    Object z5 = bool == null ? neg.z(oq5Var) : bool;
                    oq5Var.p(false);
                    str2 = rvf.N(R.string.audio_decoder_template, new Object[]{str2, num4, num5, r3, z5}, oq5Var);
                    z4 = false;
                }
                oq5Var.p(z4);
                r1 = z4;
            }
            oq5Var.p(r1);
            if (str2 == null) {
                str2 = neg.z(oq5Var);
            }
            String str3 = str2;
            oq5Var.p(r1);
            if (j(oq5Var)) {
                oq5Var.a0(-1221290723);
                oq5Var.a0(693286680);
                nho a2 = lho.a(qx0.a, b2c.k, oq5Var, r1);
                oq5Var.a0(-1323940314);
                int i6 = oq5Var.P;
                a l = oq5Var.l();
                xp5.T.getClass();
                grb grbVar = wp5.b;
                wn5 A = ghh.A(vci.a);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a2, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var, i6, kb5Var);
                }
                A.invoke(new lrq(oq5Var), oq5Var, 0);
                oq5Var.a0(2058660585);
                wct.B(oq5Var).getClass();
                wct.B(oq5Var).getClass();
                int i7 = (i5 & 7168) | 6;
                quj.d(i7, oq5Var, yciVar, M, str);
                wct.B(oq5Var).getClass();
                wct.B(oq5Var).getClass();
                quj.d(i7, oq5Var, yciVar, M2, str3);
                k5r.s(oq5Var, false, true, false, false);
                oq5Var.p(false);
            } else {
                oq5Var.a0(-1220657331);
                wct.B(oq5Var).getClass();
                wct.B(oq5Var).getClass();
                int i8 = (i3 & 14) | (i5 & 7168);
                quj.e(wa5Var, M, str, yciVar, true, oq5Var, i8);
                wct.B(oq5Var).getClass();
                wct.B(oq5Var).getClass();
                quj.e(wa5Var, M2, str3, yciVar, true, oq5Var, i8);
                oq5Var.p(false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new eh3(jg7Var, jg7Var2, i, z, yciVar, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v13 */
    public static final void g(vcu vcuVar, sy1 sy1Var, boolean z, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        String str;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-461443808);
        int i3 = i & 6;
        wa5 wa5Var = wa5.a;
        if (i3 == 0) {
            i2 = (oq5Var.f(wa5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(vcuVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(sy1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.g(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            String M = rvf.M(R.string.video_track_label, oq5Var);
            int i4 = i2 >> 3;
            oq5Var.a0(1063523268);
            oq5Var.a0(-726086903);
            String str2 = null;
            ?? r11 = 0;
            boolean z2 = false;
            if (vcuVar == null) {
                str = null;
            } else {
                str = vcuVar.a;
                oq5Var.a0(-726086400);
                if (str == null) {
                    str = neg.z(oq5Var);
                }
                oq5Var.p(false);
                oq5Var.a0(-726084677);
                if (!z) {
                    String i5 = neg.i(vcuVar.b, oq5Var);
                    mmq mmqVar = vcuVar.c;
                    oq5Var.a0(-189909404);
                    oq5Var.p(false);
                    str = rvf.N(R.string.video_track_template, new Object[]{str, i5, mmqVar}, oq5Var);
                }
                oq5Var.p(false);
            }
            oq5Var.p(false);
            if (str == null) {
                str = neg.z(oq5Var);
            }
            oq5Var.p(false);
            String M2 = rvf.M(R.string.audio_track_label, oq5Var);
            oq5Var.a0(1857187492);
            oq5Var.a0(2129696936);
            if (sy1Var != null) {
                str2 = sy1Var.a;
                oq5Var.a0(2129697445);
                if (str2 == null) {
                    str2 = neg.z(oq5Var);
                }
                oq5Var.p(false);
                oq5Var.a0(2129699162);
                if (!z) {
                    String i6 = neg.i(sy1Var.b, oq5Var);
                    String str3 = sy1Var.c;
                    oq5Var.a0(-180042681);
                    if (str3 == null) {
                        str3 = neg.z(oq5Var);
                    }
                    oq5Var.p(false);
                    str2 = rvf.N(R.string.audio_track_template, new Object[]{str2, i6, str3}, oq5Var);
                    z2 = false;
                }
                oq5Var.p(z2);
                r11 = z2;
            }
            oq5Var.p(r11);
            if (str2 == null) {
                str2 = neg.z(oq5Var);
            }
            String str4 = str2;
            oq5Var.p(r11);
            if (j(oq5Var)) {
                oq5Var.a0(348161181);
                oq5Var.a0(693286680);
                nho a2 = lho.a(qx0.a, b2c.k, oq5Var, r11);
                oq5Var.a0(-1323940314);
                int i7 = oq5Var.P;
                a l = oq5Var.l();
                xp5.T.getClass();
                grb grbVar = wp5.b;
                wn5 A = ghh.A(vci.a);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a2, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                    ouj.x(i7, oq5Var, i7, kb5Var);
                }
                A.invoke(new lrq(oq5Var), oq5Var, 0);
                oq5Var.a0(2058660585);
                wct.B(oq5Var).getClass();
                wct.B(oq5Var).getClass();
                int i8 = (i4 & 7168) | 6;
                quj.d(i8, oq5Var, yciVar, M, str);
                wct.B(oq5Var).getClass();
                wct.B(oq5Var).getClass();
                quj.d(i8, oq5Var, yciVar, M2, str4);
                k5r.s(oq5Var, false, true, false, false);
                oq5Var.p(false);
            } else {
                oq5Var.a0(348786637);
                wct.B(oq5Var).getClass();
                wct.B(oq5Var).getClass();
                int i9 = (i2 & 14) | (i4 & 7168);
                quj.e(wa5Var, M, str, yciVar, true, oq5Var, i9);
                wct.B(oq5Var).getClass();
                wct.B(oq5Var).getClass();
                quj.e(wa5Var, M2, str4, yciVar, true, oq5Var, i9);
                oq5Var.p(false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new jf7(vcuVar, sy1Var, z, yciVar, i, 1);
        }
    }

    public static final void h(mmq mmqVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-442871730);
        int i3 = i & 6;
        wa5 wa5Var = wa5.a;
        if (i3 == 0) {
            i2 = (oq5Var.f(wa5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(mmqVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            String M = rvf.M(R.string.viewport_size_label, oq5Var);
            oq5Var.a0(1288106552);
            String mmqVar2 = mmqVar != null ? mmqVar.toString() : null;
            if (mmqVar2 == null) {
                mmqVar2 = neg.z(oq5Var);
            }
            oq5Var.p(false);
            oq5Var.a0(1222878633);
            qs5 qs5Var = a;
            xbl xblVar = (xbl) oq5Var.j(qs5Var);
            oq5Var.p(false);
            xblVar.getClass();
            oq5Var.a0(1222878633);
            xbl xblVar2 = (xbl) oq5Var.j(qs5Var);
            oq5Var.p(false);
            xblVar2.getClass();
            yciVar2 = yciVar;
            quj.e(wa5Var, M, mmqVar2, yciVar2, true, oq5Var, (i2 & 14) | ((i2 << 3) & 7168));
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kg0(i, 8, yciVar2, mmqVar);
        }
    }

    public static final void i(int i, hq5 hq5Var, yci yciVar, String str) {
        int i2;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1835137996);
        int i3 = i & 6;
        wa5 wa5Var = wa5.a;
        int i4 = 2;
        if (i3 == 0) {
            i2 = (oq5Var.f(wa5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            String M = rvf.M(R.string.vsid_label, oq5Var);
            oq5Var.a0(1717188119);
            String z = str == null ? neg.z(oq5Var) : str;
            oq5Var.p(false);
            oq5Var.a0(1222878633);
            qs5 qs5Var = a;
            xbl xblVar = (xbl) oq5Var.j(qs5Var);
            oq5Var.p(false);
            xblVar.getClass();
            oq5Var.a0(1222878633);
            xbl xblVar2 = (xbl) oq5Var.j(qs5Var);
            oq5Var.p(false);
            xblVar2.getClass();
            yciVar2 = yciVar;
            quj.e(wa5Var, M, z, yciVar2, true, oq5Var, (i2 & 14) | ((i2 << 3) & 7168));
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new v73(str, yciVar2, i, i4);
        }
    }

    public static final boolean j(hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.a0(-1091839180);
        boolean z = ((Configuration) oq5Var.j(AndroidCompositionLocals_androidKt.a)).orientation == 2;
        oq5Var.p(false);
        return z;
    }
}
