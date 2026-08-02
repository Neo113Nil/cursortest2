package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.d;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public abstract class trp {
    public static final float a = 48;
    public static final float b = 72;
    public static final qs5 c = new qs5(wg.A);

    public static final void a(if5 if5Var, Function0 function0, yci yciVar, wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        long j;
        dd3 dd3Var;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(2034524436);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.d(if5Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.h(wn5Var) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            int ordinal = if5Var.ordinal();
            boolean z = false;
            if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                oq5Var2.Z(967875837);
                j = ((dq0) oq5Var2.j(eq0.a)).d.c;
                oq5Var2.p(false);
            } else {
                if (ordinal != 3) {
                    throw vz1.i(oq5Var2, 967868961, false);
                }
                oq5Var2.Z(967871141);
                j = ((dq0) oq5Var2.j(eq0.a)).d.d;
                oq5Var2.p(false);
            }
            d85 d85Var = (d85) oq5Var2.j(c);
            if (d85Var != null) {
                j = c3x.D(j, d85Var.a);
            }
            long j2 = j;
            int ordinal2 = if5Var.ordinal();
            if (ordinal2 == 0) {
                oq5Var2.Z(-60401387);
                dd3 dd3Var2 = new dd3(2, new f3r(((dq0) oq5Var2.j(eq0.a)).a.a));
                oq5Var2.p(false);
                dd3Var = dd3Var2;
            } else {
                if (ordinal2 != 1 && ordinal2 != 2 && ordinal2 != 3) {
                    throw vz1.i(oq5Var2, 967881324, false);
                }
                oq5Var2.Z(-60133207);
                oq5Var2.p(false);
                dd3Var = null;
            }
            tgo tgoVar = ugo.a;
            yci u = xp3.u(d.o(yciVar, b, a), tgoVar);
            int ordinal3 = if5Var.ordinal();
            if (ordinal3 == 0 || ordinal3 == 1 || ordinal3 == 2) {
                z = true;
            } else if (ordinal3 != 3) {
                b6e.s();
                return;
            }
            oq5Var = oq5Var2;
            q5g.k(a.e(u, z, null, null, function0, 6), tgoVar, j2, 0L, dd3Var, 0.0f, ild.C(-795452592, new hon(20, if5Var, wn5Var), oq5Var2), oq5Var, ScreenMirroringConfig.Video.BITRATE_1_5MB, 40);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new zkl(if5Var, function0, false, yciVar, wn5Var, i, 7);
        }
    }

    public static final void b(if5 if5Var, int i, Function0 function0, yci yciVar, Function0 function02, hq5 hq5Var, int i2, int i3) {
        int i4;
        Function0 function03;
        Function0 function04;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1067920675);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.d(if5Var.ordinal()) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var.h(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        int i5 = i3 & 16;
        if (i5 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= oq5Var.h(function02) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i4 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            function04 = function02;
        } else {
            if (i5 != 0) {
                Object K = oq5Var.K();
                if (K == gq5.a) {
                    K = new qkp(13);
                    oq5Var.k0(K);
                }
                function03 = (Function0) K;
            } else {
                function03 = function02;
            }
            int i6 = (i4 & 14) | 3072;
            int i7 = i4 >> 3;
            a(if5Var, function0, yciVar, ild.C(-670351939, new i80(i, function03), oq5Var), oq5Var, i6 | (i7 & 112) | (i7 & 896));
            function04 = function03;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new xj(if5Var, i, function0, yciVar, function04, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0118 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0134 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(rqp rqpVar, Function0 function0, hq5 hq5Var, int i) {
        if5 if5Var;
        String M;
        int i2;
        String str;
        int ordinal;
        boolean z;
        kjn kjnVar;
        Object K;
        sdr sdrVar;
        boolean f;
        Object K2;
        boolean f2;
        Object K3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1785368506);
        int i3 = 2;
        int i4 = i | (oq5Var.d(rqpVar.ordinal()) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16);
        if ((i4 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            int ordinal2 = rqpVar.ordinal();
            if (ordinal2 == 0) {
                oq5Var.Z(-961285723);
                if5Var = if5.c;
                M = rvf.M(R.string.download_track, oq5Var);
                oq5Var.p(false);
            } else if (ordinal2 != 1) {
                if (ordinal2 == 2) {
                    oq5Var.Z(-961552478);
                    if5Var = if5.c;
                    str = rvf.M(R.string.container_downloaded, oq5Var);
                    oq5Var.p(false);
                    i2 = R.drawable.ic_check_24;
                } else {
                    if (ordinal2 != 3) {
                        throw vz1.i(oq5Var, 2047190561, false);
                    }
                    oq5Var.Z(-960759436);
                    oq5Var.p(false);
                    if5Var = if5.d;
                    i2 = R.drawable.ic_download_24;
                    str = null;
                }
                ordinal = rqpVar.ordinal();
                kjn kjnVar2 = gq5.a;
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        oq5Var.Z(-960153696);
                        z = false;
                        kjnVar = kjnVar2;
                        sdrVar = fgq.s(fgq.D(null, oq5Var, 1), 1.0f, 0.5f, weo.C(new act(800, 100, nya.c), jyn.b, 0L, 4), null, oq5Var, 4536, 8);
                        oq5Var.p(false);
                        f = oq5Var.f(str);
                        K2 = oq5Var.K();
                        if (!f || K2 == kjnVar) {
                            K2 = new srp(str, i3);
                            oq5Var.k0(K2);
                        }
                        yci b2 = nfp.b(vci.a, z, (Function1) K2);
                        f2 = oq5Var.f(sdrVar);
                        K3 = oq5Var.K();
                        if (!f2 || K3 == kjnVar) {
                            K3 = new xtb(sdrVar, 28);
                            oq5Var.k0(K3);
                        }
                        b(if5Var, i2, function0, b2, (Function0) K3, oq5Var, (i4 << 3) & 896, 0);
                    } else if (ordinal != 2 && ordinal != 3) {
                        throw vz1.i(oq5Var, 2047226996, false);
                    }
                }
                z = false;
                kjnVar = kjnVar2;
                oq5Var.Z(-960289972);
                K = oq5Var.K();
                if (K == kjnVar) {
                    K = tlm.h(1.0f, oq5Var);
                }
                sdrVar = (poi) K;
                oq5Var.p(false);
                f = oq5Var.f(str);
                K2 = oq5Var.K();
                if (!f) {
                }
                K2 = new srp(str, i3);
                oq5Var.k0(K2);
                yci b22 = nfp.b(vci.a, z, (Function1) K2);
                f2 = oq5Var.f(sdrVar);
                K3 = oq5Var.K();
                if (!f2) {
                }
                K3 = new xtb(sdrVar, 28);
                oq5Var.k0(K3);
                b(if5Var, i2, function0, b22, (Function0) K3, oq5Var, (i4 << 3) & 896, 0);
            } else {
                oq5Var.Z(-961026532);
                if5Var = if5.c;
                M = rvf.M(R.string.downloading_description, oq5Var);
                oq5Var.p(false);
            }
            i2 = R.drawable.ic_download_24;
            str = M;
            ordinal = rqpVar.ordinal();
            kjn kjnVar22 = gq5.a;
            if (ordinal != 0) {
            }
            z = false;
            kjnVar = kjnVar22;
            oq5Var.Z(-960289972);
            K = oq5Var.K();
            if (K == kjnVar) {
            }
            sdrVar = (poi) K;
            oq5Var.p(false);
            f = oq5Var.f(str);
            K2 = oq5Var.K();
            if (!f) {
            }
            K2 = new srp(str, i3);
            oq5Var.k0(K2);
            yci b222 = nfp.b(vci.a, z, (Function1) K2);
            f2 = oq5Var.f(sdrVar);
            K3 = oq5Var.K();
            if (!f2) {
            }
            K3 = new xtb(sdrVar, 28);
            oq5Var.k0(K3);
            b(if5Var, i2, function0, b222, (Function0) K3, oq5Var, (i4 << 3) & 896, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hon(rqpVar, function0, i, 14);
        }
    }

    public static final void d(sqp sqpVar, Function0 function0, hq5 hq5Var, int i) {
        if5 if5Var;
        String M;
        Function0 function02;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1468234478);
        int i2 = (oq5Var.d(sqpVar.ordinal()) ? 4 : 2) | i | (oq5Var.h(function0) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            function02 = function0;
        } else {
            int ordinal = sqpVar.ordinal();
            if (ordinal == 0) {
                oq5Var.Z(226657802);
                if5Var = if5.d;
                M = rvf.M(R.string.accessibility_disabled, oq5Var);
                oq5Var.p(false);
            } else if (ordinal == 1) {
                oq5Var.Z(227176556);
                if5Var = if5.a;
                M = rvf.M(R.string.accessibility_on_state, oq5Var);
                oq5Var.p(false);
            } else {
                if (ordinal != 2) {
                    throw vz1.i(oq5Var, -2070900238, false);
                }
                oq5Var.Z(226914916);
                if5Var = if5.c;
                M = rvf.M(R.string.accessibility_off_state, oq5Var);
                oq5Var.p(false);
            }
            function02 = function0;
            b(if5Var, R.drawable.ic_lyrics_default_40, function02, nfp.b(vci.a, false, new cb(ouj.o(rvf.M(R.string.menu_element_lyrics, oq5Var), StringUtil.LF, rvf.M(R.string.accessibility_warning, oq5Var)), M, 9)), null, oq5Var, (i2 << 3) & 896, 16);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hon(sqpVar, function02, i, 19);
        }
    }

    public static final void e(tqp tqpVar, Function0 function0, hq5 hq5Var, int i) {
        Function0 function02;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1226165170);
        int i2 = (oq5Var.f(tqpVar) ? 4 : 2) | i | (oq5Var.h(function0) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            function02 = function0;
        } else {
            String str = tqpVar.a + "x";
            if5 if5Var = tqpVar.a == 1.0f ? if5.c : if5.a;
            String M = rvf.M(R.string.player_playback_speed_description, oq5Var);
            boolean f = ((i2 & 14) == 4) | oq5Var.f(M);
            Object K = oq5Var.K();
            int i3 = 14;
            if (f || K == gq5.a) {
                K = new xum(14, M, tqpVar);
                oq5Var.k0(K);
            }
            function02 = function0;
            a(if5Var, function02, nfp.b(vci.a, false, (Function1) K), ild.C(-1959844050, new da1(str, i3), oq5Var), oq5Var, (i2 & 112) | 3072);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hon(tqpVar, function02, i, 15);
        }
    }

    public static final void f(uqp uqpVar, Function0 function0, hq5 hq5Var, int i) {
        if5 if5Var;
        String str;
        Function0 function02;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1490777204);
        int i2 = (oq5Var.d(uqpVar.ordinal()) ? 4 : 2) | i | (oq5Var.h(function0) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            function02 = function0;
        } else {
            int ordinal = uqpVar.ordinal();
            int i3 = 0;
            if (ordinal == 0) {
                oq5Var.Z(1782096686);
                oq5Var.p(false);
                if5Var = if5.d;
                str = null;
            } else {
                if (ordinal != 1) {
                    throw vz1.i(oq5Var, -1882177782, false);
                }
                oq5Var.Z(1782257514);
                if5Var = if5.c;
                str = rvf.M(R.string.quality_settings_button_description, oq5Var);
                oq5Var.p(false);
            }
            boolean f = oq5Var.f(str);
            Object K = oq5Var.K();
            if (f || K == gq5.a) {
                K = new srp(str, i3);
                oq5Var.k0(K);
            }
            function02 = function0;
            b(if5Var, R.drawable.ic_settings_24, function02, nfp.b(vci.a, false, (Function1) K), null, oq5Var, (i2 << 3) & 896, 16);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hon(uqpVar, function02, i, 17);
        }
    }

    public static final void g(vqp vqpVar, Function0 function0, hq5 hq5Var, int i) {
        if5 if5Var;
        String str;
        Function0 function02;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-868000038);
        int i2 = (oq5Var.d(vqpVar.ordinal()) ? 4 : 2) | i | (oq5Var.h(function0) ? 32 : 16);
        int i3 = 18;
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            function02 = function0;
        } else {
            int ordinal = vqpVar.ordinal();
            int i4 = 1;
            int i5 = R.drawable.ic_repeat_24;
            if (ordinal == 0) {
                oq5Var.Z(1409226550);
                oq5Var.p(false);
                if5Var = if5.d;
                str = null;
            } else if (ordinal == 1) {
                oq5Var.Z(1409430406);
                if5Var = if5.c;
                str = rvf.M(R.string.repeat_off, oq5Var);
                oq5Var.p(false);
            } else if (ordinal == 2) {
                oq5Var.Z(1409679305);
                if5Var = if5.a;
                str = rvf.M(R.string.repeat_track, oq5Var);
                oq5Var.p(false);
                i5 = R.drawable.ic_repeat_1_24;
            } else {
                if (ordinal != 3) {
                    throw vz1.i(oq5Var, -924373974, false);
                }
                oq5Var.Z(1409925352);
                if5Var = if5.a;
                str = rvf.M(R.string.repeat_playlist, oq5Var);
                oq5Var.p(false);
            }
            boolean f = oq5Var.f(str);
            Object K = oq5Var.K();
            if (f || K == gq5.a) {
                K = new srp(str, i4);
                oq5Var.k0(K);
            }
            function02 = function0;
            b(if5Var, i5, function02, nfp.b(vci.a, false, (Function1) K), null, oq5Var, (i2 << 3) & 896, 16);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hon(vqpVar, function02, i, i3);
        }
    }

    public static final void h(brp brpVar, lrp lrpVar, hq5 hq5Var, int i) {
        sqp sqpVar;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1594691246);
        int i2 = (oq5Var.h(brpVar) ? 4 : 2) | i | (oq5Var.h(lrpVar) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean z = brpVar instanceof rqp;
            kjn kjnVar = gq5.a;
            if (z) {
                oq5Var.Z(805043482);
                rqp rqpVar = (rqp) brpVar;
                boolean h = oq5Var.h(lrpVar);
                Object K = oq5Var.K();
                if (h || K == kjnVar) {
                    qbp qbpVar = new qbp(0, lrpVar, lrp.class, "onDownloadClick", "onDownloadClick()V", 0, 7);
                    oq5Var.k0(qbpVar);
                    K = qbpVar;
                }
                c(rqpVar, (Function0) ((h9f) K), oq5Var, i2 & 14);
                oq5Var.p(false);
            } else if (brpVar instanceof sqp) {
                oq5Var.Z(805048800);
                hvb hvbVar = (hvb) oq5Var.j(ivb.b);
                if (Intrinsics.d(hvbVar, dvb.a)) {
                    sqpVar = sqp.a;
                } else {
                    if (!(hvbVar instanceof gvb)) {
                        b6e.s();
                        return;
                    }
                    sqpVar = (sqp) brpVar;
                }
                sqp sqpVar2 = sqpVar;
                boolean h2 = oq5Var.h(lrpVar);
                Object K2 = oq5Var.K();
                if (h2 || K2 == kjnVar) {
                    qbp qbpVar2 = new qbp(0, lrpVar, lrp.class, "onLyricsClick", "onLyricsClick()V", 0, 8);
                    oq5Var.k0(qbpVar2);
                    K2 = qbpVar2;
                }
                d(sqpVar2, (Function0) ((h9f) K2), oq5Var, 0);
                oq5Var.p(false);
            } else if (brpVar instanceof uqp) {
                oq5Var.Z(805060088);
                uqp uqpVar = (uqp) brpVar;
                boolean h3 = oq5Var.h(lrpVar);
                Object K3 = oq5Var.K();
                if (h3 || K3 == kjnVar) {
                    qbp qbpVar3 = new qbp(0, lrpVar, lrp.class, "onQualityClick", "onQualityClick()V", 0, 9);
                    oq5Var.k0(qbpVar3);
                    K3 = qbpVar3;
                }
                f(uqpVar, (Function0) ((h9f) K3), oq5Var, i2 & 14);
                oq5Var.p(false);
            } else if (brpVar instanceof vqp) {
                oq5Var.Z(805065142);
                vqp vqpVar = (vqp) brpVar;
                boolean h4 = oq5Var.h(lrpVar);
                Object K4 = oq5Var.K();
                if (h4 || K4 == kjnVar) {
                    qbp qbpVar4 = new qbp(0, lrpVar, lrp.class, "onRepeatClick", "onRepeatClick()V", 0, 10);
                    oq5Var.k0(qbpVar4);
                    K4 = qbpVar4;
                }
                g(vqpVar, (Function0) ((h9f) K4), oq5Var, i2 & 14);
                oq5Var.p(false);
            } else if (brpVar instanceof wqp) {
                oq5Var.Z(805070168);
                wqp wqpVar = (wqp) brpVar;
                boolean h5 = oq5Var.h(lrpVar);
                Object K5 = oq5Var.K();
                if (h5 || K5 == kjnVar) {
                    qbp qbpVar5 = new qbp(0, lrpVar, lrp.class, "onShuffleClick", "onShuffleClick()V", 0, 11);
                    oq5Var.k0(qbpVar5);
                    K5 = qbpVar5;
                }
                k(wqpVar, (Function0) ((h9f) K5), oq5Var, i2 & 14);
                oq5Var.p(false);
            } else if (brpVar instanceof arp) {
                oq5Var.Z(805075188);
                arp arpVar = (arp) brpVar;
                boolean h6 = oq5Var.h(lrpVar);
                Object K6 = oq5Var.K();
                if (h6 || K6 == kjnVar) {
                    qbp qbpVar6 = new qbp(0, lrpVar, lrp.class, "onTimerClick", "onTimerClick()V", 0, 12);
                    oq5Var.k0(qbpVar6);
                    K6 = qbpVar6;
                }
                l(arpVar, (Function0) ((h9f) K6), oq5Var, i2 & 14);
                oq5Var.p(false);
            } else {
                if (!(brpVar instanceof tqp)) {
                    throw vz1.i(oq5Var, 805042449, false);
                }
                oq5Var.Z(805080356);
                tqp tqpVar = (tqp) brpVar;
                boolean h7 = oq5Var.h(lrpVar);
                Object K7 = oq5Var.K();
                if (h7 || K7 == kjnVar) {
                    qbp qbpVar7 = new qbp(0, lrpVar, lrp.class, "onPlaybackSpeedClick", "onPlaybackSpeedClick()V", 0, 13);
                    oq5Var.k0(qbpVar7);
                    K7 = qbpVar7;
                }
                e(tqpVar, (Function0) ((h9f) K7), oq5Var, i2 & 14);
                oq5Var.p(false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hon(brpVar, lrpVar, i, 21);
        }
    }

    public static final void i(lrp lrpVar, yci yciVar, d85 d85Var, hq5 hq5Var, int i, int i2) {
        int i3;
        lrpVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1177446052);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(lrpVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= oq5Var.f(d85Var) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (i4 != 0) {
                yciVar = vci.a;
            }
            if (i5 != 0) {
                d85Var = null;
            }
            etn.l(c.a(d85Var), ild.C(-828551652, new hon(13, lrpVar, yciVar), oq5Var), oq5Var, 56);
        }
        yci yciVar2 = yciVar;
        d85 d85Var2 = d85Var;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new o4p(i, i2, 10, yciVar2, lrpVar, d85Var2);
        }
    }

    public static final void j(int i, yci yciVar, wn5 wn5Var, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1021314739);
        if ((((oq5Var.d(i) ? 4 : 2) | i2 | (oq5Var.f(yciVar) ? 32 : 16)) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            lx0 lx0Var = i > 2 ? qx0.g : qx0.f;
            yci o = androidx.compose.foundation.layout.a.o(d.d(yciVar, 1.0f), v0k.b, 0.0f, 2);
            nho a2 = lho.a(lx0Var, b2c.k, oq5Var, 0);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, o);
            xp5.T.getClass();
            grb grbVar = wp5.b;
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
            g0g.U(oq5Var, H, wp5.d);
            wn5Var.invoke(qho.a, oq5Var, 54);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ce3(i, yciVar, wn5Var, i2);
        }
    }

    public static final void k(wqp wqpVar, Function0 function0, hq5 hq5Var, int i) {
        if5 if5Var;
        String M;
        Function0 function02;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(91598184);
        int i2 = (oq5Var.d(wqpVar.ordinal()) ? 4 : 2) | i | (oq5Var.h(function0) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            function02 = function0;
        } else {
            int ordinal = wqpVar.ordinal();
            if (ordinal == 0) {
                oq5Var.Z(1497718380);
                if5Var = if5.a;
                M = rvf.M(R.string.accessibility_on_state, oq5Var);
                oq5Var.p(false);
            } else {
                if (ordinal != 1) {
                    throw vz1.i(oq5Var, 2126514866, false);
                }
                oq5Var.Z(1497513284);
                if5Var = if5.c;
                M = rvf.M(R.string.accessibility_off_state, oq5Var);
                oq5Var.p(false);
            }
            cb cbVar = new cb(rvf.M(R.string.player_shuffle, oq5Var), M, 9);
            function02 = function0;
            b(if5Var, R.drawable.ic_shuffle_24, function02, nfp.b(vci.a, false, cbVar), null, oq5Var, (i2 << 3) & 896, 16);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hon(wqpVar, function02, i, 22);
        }
    }

    public static final void l(arp arpVar, Function0 function0, hq5 hq5Var, int i) {
        if5 if5Var;
        String M;
        Function0 function02;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1612332608);
        int i2 = 16;
        int i3 = (oq5Var.h(arpVar) ? 4 : 2) | i | (oq5Var.h(function0) ? 32 : 16);
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            function02 = function0;
        } else {
            int i4 = 0;
            if (Intrinsics.d(arpVar, zqp.a)) {
                oq5Var.Z(1913759058);
                if5Var = if5.d;
                M = rvf.M(R.string.accessibility_disabled, oq5Var);
                oq5Var.p(false);
            } else if (Intrinsics.d(arpVar, yqp.a)) {
                oq5Var.Z(1913963596);
                if5Var = if5.c;
                M = rvf.M(R.string.accessibility_off_state, oq5Var);
                oq5Var.p(false);
            } else {
                if (!(arpVar instanceof xqp)) {
                    throw vz1.i(oq5Var, 1031563629, false);
                }
                oq5Var.Z(1914174055);
                if5Var = if5.b;
                M = rvf.M(R.string.accessibility_on_state, oq5Var);
                oq5Var.p(false);
            }
            String M2 = rvf.M(R.string.timer_title, oq5Var);
            boolean f = oq5Var.f(M2) | oq5Var.f(M);
            Object K = oq5Var.K();
            if (f || K == gq5.a) {
                K = new cb(M2, M, 8);
                oq5Var.k0(K);
            }
            function02 = function0;
            a(if5Var, function02, nfp.b(vci.a, true, (Function1) K), ild.C(254571680, new rrp(arpVar, i4), oq5Var), oq5Var, (i3 & 112) | 3072);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hon(arpVar, function02, i, i2);
        }
    }
}
