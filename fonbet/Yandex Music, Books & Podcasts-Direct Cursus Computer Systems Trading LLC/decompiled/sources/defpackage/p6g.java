package defpackage;

import android.database.SQLException;
import android.graphics.Bitmap;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.shared.dto.domainitem.WaveColorsDto;
import com.yandex.music.shared.dto.domainitem.WaveDto;
import com.yandex.music.shared.dto.wave.QueryToVibeWaveItemDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.music.share.ShareException;

/* loaded from: classes3.dex */
public abstract class p6g {
    public static final boolean A(e6l e6lVar) {
        e6lVar.getClass();
        if (e6lVar.equals(b6l.a) || (e6lVar instanceof c6l)) {
            return false;
        }
        if (!(e6lVar instanceof d6l)) {
            b6e.s();
            return false;
        }
        int ordinal = ((d6l) e6lVar).d.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 1) {
            b6e.s();
            return false;
        }
        return false;
    }

    public static boolean B(byte b) {
        return b > -65;
    }

    public static final boolean C(e6l e6lVar) {
        e6lVar.getClass();
        if (e6lVar.equals(b6l.a)) {
            return false;
        }
        if (e6lVar instanceof c6l) {
            return ((c6l) e6lVar).a == w0l.b;
        }
        if (e6lVar instanceof d6l) {
            return ((d6l) e6lVar).b == w0l.b;
        }
        b6e.s();
        return false;
    }

    public static final boolean D(e6l e6lVar) {
        if (e6lVar.equals(b6l.a)) {
            return false;
        }
        if (e6lVar instanceof c6l) {
            return ((c6l) e6lVar).a == w0l.c;
        }
        if (e6lVar instanceof d6l) {
            return ((d6l) e6lVar).b == w0l.c;
        }
        b6e.s();
        return false;
    }

    public static final int F(ayg aygVar, String str) {
        dbh d = aygVar.d(str);
        if (d == null) {
            return 0;
        }
        return eeh.b((d.c / aygVar.n) * 1000);
    }

    public static void G(Bitmap bitmap, File file) {
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        bitmap.getClass();
        compressFormat.getClass();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(compressFormat, 75, fileOutputStream);
                fileOutputStream.close();
            } finally {
            }
        } catch (IOException e) {
            throw new ShareException(ugb.a, "Can't save bitmap to file", e);
        }
    }

    public static final void H(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i);
        sb.append(", message: ".concat(str));
        throw new SQLException(sb.toString());
    }

    public static final n7n I(QueryToVibeWaveItemDto queryToVibeWaveItemDto) {
        String name;
        List seeds = queryToVibeWaveItemDto.getSeeds();
        if (seeds != null) {
            ArrayList O = CollectionsKt.O(seeds);
            if (O.isEmpty()) {
                O = null;
            }
            if (O != null && (name = queryToVibeWaveItemDto.getName()) != null) {
                return new n7n(name, queryToVibeWaveItemDto.getDescription(), O);
            }
        }
        return null;
    }

    public static final zsu J(WaveDto waveDto) {
        List seeds;
        waveDto.getClass();
        String title = waveDto.getTitle();
        if (title == null) {
            return null;
        }
        String header = waveDto.getHeader();
        String bgImageUrl = waveDto.getBgImageUrl();
        jcv jcvVar = bgImageUrl != null ? new jcv(bgImageUrl, WebPath$Storage.AVATARS_NO_CROP) : null;
        String compactImageUrl = waveDto.getCompactImageUrl();
        jcv jcvVar2 = compactImageUrl != null ? new jcv(compactImageUrl, WebPath$Storage.AVATARS_NO_CROP) : null;
        String stationId = waveDto.getStationId();
        if (stationId == null || (seeds = waveDto.getSeeds()) == null) {
            return null;
        }
        ArrayList O = CollectionsKt.O(seeds);
        WaveColorsDto colors = waveDto.getColors();
        String average = colors != null ? colors.getAverage() : null;
        WaveColorsDto colors2 = waveDto.getColors();
        return new zsu(title, header, jcvVar, jcvVar2, stationId, O, new rnu(average, colors2 != null ? colors2.getWaveText() : null));
    }

    public static final void a(dwj dwjVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(339871809);
        int i2 = (oq5Var.f(dwjVar) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            iz2 iz2Var = b2c.f;
            vci vciVar = vci.a;
            float f = 32;
            yci g = d.g(a.q(d.d(vciVar, 1.0f), f, 0.0f, f, 0.0f, 10), 56, 0.0f, 2);
            kfh d = ug3.d(iz2Var, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, g);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            xcs.b(dwjVar.a, androidx.compose.ui.platform.a.a(d.d(vciVar, 1.0f), "paywall_options_error_info_text"), ((dq0) oq5Var.j(eq0.a)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, 48, 0, 65016);
            oq5Var = oq5Var;
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ykf(dwjVar, i, 17);
        }
    }

    public static final void b(k4k k4kVar, lvf lvfVar, dib dibVar, i1i i1iVar, tmb tmbVar, hq5 hq5Var, int i) {
        int i2;
        kjn kjnVar;
        i1i i1iVar2;
        k4kVar.getClass();
        lvfVar.getClass();
        dibVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1106927941);
        int i3 = i | (oq5Var.f(k4kVar) ? 4 : 2) | (oq5Var.h(lvfVar) ? 32 : 16) | (oq5Var.h(dibVar) ? 256 : 128) | (oq5Var.f(i1iVar) ? 2048 : 1024) | (oq5Var.h(tmbVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var.P(i3 & 1, (i3 & 9363) != 9362)) {
            ogp.g.e(k4kVar.c, k4kVar.b != null, null, oq5Var, 4096, 4);
            String M = rvf.M(R.string.metatag_all_artists_header, oq5Var);
            int i4 = i3 & 7168;
            boolean z = i4 == 2048;
            Object K = oq5Var.K();
            kjn kjnVar2 = gq5.a;
            if (z || K == kjnVar2) {
                i2 = i3;
                kjnVar = kjnVar2;
                k5h k5hVar = new k5h(0, i1iVar, i1i.class, "onBackClicked", "onBackClicked()V", 0, 7);
                oq5Var.k0(k5hVar);
                K = k5hVar;
            } else {
                i2 = i3;
                kjnVar = kjnVar2;
            }
            Function0 function0 = (Function0) ((h9f) K);
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new opg(29);
                oq5Var.k0(K2);
            }
            Function0 function02 = (Function0) K2;
            boolean z2 = i4 == 2048;
            Object K3 = oq5Var.K();
            if (z2 || K3 == kjnVar) {
                k5h k5hVar2 = new k5h(0, i1iVar, i1i.class, "onRefresh", "onRefresh()V", 0, 8);
                oq5Var.k0(k5hVar2);
                K3 = k5hVar2;
            }
            Function0 function03 = (Function0) ((h9f) K3);
            boolean z3 = i4 == 2048;
            Object K4 = oq5Var.K();
            if (z3 || K4 == kjnVar) {
                K4 = new k5h(0, i1iVar, i1i.class, "onRetry", "onRetry()V", 0, 9);
                i1iVar2 = i1iVar;
                oq5Var.k0(K4);
            } else {
                i1iVar2 = i1iVar;
            }
            Function0 function04 = (Function0) ((h9f) K4);
            vm C = ghh.C(zs4.g(oq5Var), ogp.A(oq5Var));
            wn5 C2 = ild.C(-1815952099, new t31(13, i1iVar2), oq5Var);
            int i5 = lvf.f;
            ezf.h(k4kVar, lvfVar, M, dibVar, function0, function02, function03, function04, tmbVar, null, C, C2, oq5Var, (i2 & 14) | 1576000 | (i2 & 112) | (57344 & (i2 << 6)) | 1073741824 | ((i2 << 15) & 1879048192), 384, 1024);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bj(i, 27, k4kVar, lvfVar, dibVar, i1iVar, tmbVar);
        }
    }

    public static final void c(int i, int i2, hq5 hq5Var, yci yciVar) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(942252325);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        }
        if ((i3 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            vci vciVar = vci.a;
            if (i4 != 0) {
                yciVar = vciVar;
            }
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            s2s.a(androidx.compose.ui.platform.a.a(vciVar, "music_history_tabs_placeholder"), oq5Var, 54);
            u1g.l(oq5Var, d.e(vciVar, 16));
            ezf.n(null, oq5Var, 6);
            avf.m(54, oq5Var, androidx.compose.ui.platform.a.a(vciVar, "music_history_context_wave_placeholder"), true);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new p1i(23);
                oq5Var.k0(K);
            }
            weo.g(null, null, null, null, null, null, false, (Function1) K, oq5Var, 113246208, 127);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new jm0(yciVar, i, i2, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final kbj kbjVar, final Function0 function0, yci yciVar, long j, w3g w3gVar, ges gesVar, boolean z, Function2 function2, e9g e9gVar, hq5 hq5Var, final int i, final int i2) {
        int i3;
        yci yciVar2;
        long j2;
        ges gesVar2;
        int i4;
        boolean z2;
        int i5;
        Function2 function22;
        int i6;
        int i7;
        w3g w3gVar2;
        boolean z3;
        final e9g e9gVar2;
        yci yciVar3;
        long j3;
        Function2 function23;
        oq5 oq5Var;
        final w3g w3gVar3;
        final ges gesVar3;
        final yci yciVar4;
        final Function2 function24;
        final boolean z4;
        final long j4;
        xmn r;
        int i8;
        int i9;
        int i10;
        kbjVar.getClass();
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1262582611);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? oq5Var2.f(kbjVar) : oq5Var2.h(kbjVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var2.h(function0) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var2.f(yciVar2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    j2 = j;
                    if (oq5Var2.e(j2)) {
                        i10 = 2048;
                        i3 |= i10;
                    }
                } else {
                    j2 = j;
                }
                i10 = 1024;
                i3 |= i10;
            } else {
                j2 = j;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    if ((32768 & i) == 0 ? oq5Var2.f(w3gVar) : oq5Var2.h(w3gVar)) {
                        i9 = 16384;
                        i3 |= i9;
                    }
                }
                i9 = RemoteCameraConfig.Notification.ID;
                i3 |= i9;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    gesVar2 = gesVar;
                    if (oq5Var2.f(gesVar2)) {
                        i8 = SQLiteDatabase.OPEN_SHAREDCACHE;
                        i3 |= i8;
                    }
                } else {
                    gesVar2 = gesVar;
                }
                i8 = SQLiteDatabase.OPEN_FULLMUTEX;
                i3 |= i8;
            } else {
                gesVar2 = gesVar;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
            } else if ((1572864 & i) == 0) {
                z2 = z;
                i3 |= oq5Var2.g(z2) ? 1048576 : 524288;
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                } else if ((12582912 & i) == 0) {
                    function22 = function2;
                    i3 |= oq5Var2.h(function22) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
                    i6 = i2 & 256;
                    if (i6 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i7 = i6;
                        i3 |= oq5Var2.d(e9gVar == null ? -1 : e9gVar.ordinal()) ? 67108864 : 33554432;
                        if ((38347923 & i3) == 38347922 || !oq5Var2.z()) {
                            oq5Var2.U();
                            if ((i & 1) != 0 || oq5Var2.y()) {
                                if (i11 != 0) {
                                    yciVar2 = vci.a;
                                }
                                if ((i2 & 8) != 0) {
                                    j2 = ((dq0) oq5Var2.j(eq0.a)).c.a;
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    w3gVar2 = kbjVar.d;
                                    i3 &= -57345;
                                } else {
                                    w3gVar2 = w3gVar;
                                }
                                if ((i2 & 32) != 0) {
                                    h6g h6gVar = nu0.a;
                                    h6g h6gVar2 = h6g.c;
                                    gesVar2 = nu0.j();
                                    i3 &= -458753;
                                }
                                z3 = i4 != 0 ? false : z2;
                                Function2 function25 = i5 != 0 ? tt0.k : function22;
                                e9gVar2 = i7 != 0 ? e9g.a : e9gVar;
                                yciVar3 = yciVar2;
                                j3 = j2;
                                function23 = function25;
                            } else {
                                oq5Var2.S();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                w3gVar2 = w3gVar;
                                yciVar3 = yciVar2;
                                j3 = j2;
                                z3 = z2;
                                function23 = function22;
                                e9gVar2 = e9gVar;
                            }
                            oq5Var2.q();
                            int i12 = i3 >> 3;
                            oq5Var = oq5Var2;
                            ngg.i(function0, yciVar3, ild.C(-570538513, new m2g(27, kbjVar, e9gVar2), oq5Var2), false, j3, null, function23, 0.0f, null, ild.C(1441969736, new s43(kbjVar, w3gVar2, z3, gesVar2, 14), oq5Var2), oq5Var, ((i3 << 3) & 57344) | (i12 & 14) | 805306752 | (i12 & 112) | (i12 & 3670016), 424);
                            w3gVar3 = w3gVar2;
                            gesVar3 = gesVar2;
                            yciVar4 = yciVar3;
                            function24 = function23;
                            z4 = z3;
                            j4 = j3;
                        } else {
                            oq5Var2.S();
                            oq5Var = oq5Var2;
                            yciVar4 = yciVar2;
                            j4 = j2;
                            gesVar3 = gesVar2;
                            z4 = z2;
                            function24 = function22;
                            w3gVar3 = w3gVar;
                            e9gVar2 = e9gVar;
                        }
                        r = oq5Var.r();
                        if (r != null) {
                            r.d = new Function2() { // from class: hbj
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    p6g.d(kbj.this, function0, yciVar4, j4, w3gVar3, gesVar3, z4, function24, e9gVar2, (hq5) obj, rvf.R(i | 1), i2);
                                    return Unit.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i7 = i6;
                    if ((38347923 & i3) == 38347922) {
                    }
                    oq5Var2.U();
                    if ((i & 1) != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if ((i2 & 8) != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    yciVar3 = yciVar2;
                    j3 = j2;
                    function23 = function25;
                    oq5Var2.q();
                    int i122 = i3 >> 3;
                    oq5Var = oq5Var2;
                    ngg.i(function0, yciVar3, ild.C(-570538513, new m2g(27, kbjVar, e9gVar2), oq5Var2), false, j3, null, function23, 0.0f, null, ild.C(1441969736, new s43(kbjVar, w3gVar2, z3, gesVar2, 14), oq5Var2), oq5Var, ((i3 << 3) & 57344) | (i122 & 14) | 805306752 | (i122 & 112) | (i122 & 3670016), 424);
                    w3gVar3 = w3gVar2;
                    gesVar3 = gesVar2;
                    yciVar4 = yciVar3;
                    function24 = function23;
                    z4 = z3;
                    j4 = j3;
                    r = oq5Var.r();
                    if (r != null) {
                    }
                }
                function22 = function2;
                i6 = i2 & 256;
                if (i6 == 0) {
                }
                i7 = i6;
                if ((38347923 & i3) == 38347922) {
                }
                oq5Var2.U();
                if ((i & 1) != 0) {
                }
                if (i11 != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i7 != 0) {
                }
                yciVar3 = yciVar2;
                j3 = j2;
                function23 = function25;
                oq5Var2.q();
                int i1222 = i3 >> 3;
                oq5Var = oq5Var2;
                ngg.i(function0, yciVar3, ild.C(-570538513, new m2g(27, kbjVar, e9gVar2), oq5Var2), false, j3, null, function23, 0.0f, null, ild.C(1441969736, new s43(kbjVar, w3gVar2, z3, gesVar2, 14), oq5Var2), oq5Var, ((i3 << 3) & 57344) | (i1222 & 14) | 805306752 | (i1222 & 112) | (i1222 & 3670016), 424);
                w3gVar3 = w3gVar2;
                gesVar3 = gesVar2;
                yciVar4 = yciVar3;
                function24 = function23;
                z4 = z3;
                j4 = j3;
                r = oq5Var.r();
                if (r != null) {
                }
            }
            z2 = z;
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            function22 = function2;
            i6 = i2 & 256;
            if (i6 == 0) {
            }
            i7 = i6;
            if ((38347923 & i3) == 38347922) {
            }
            oq5Var2.U();
            if ((i & 1) != 0) {
            }
            if (i11 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i7 != 0) {
            }
            yciVar3 = yciVar2;
            j3 = j2;
            function23 = function25;
            oq5Var2.q();
            int i12222 = i3 >> 3;
            oq5Var = oq5Var2;
            ngg.i(function0, yciVar3, ild.C(-570538513, new m2g(27, kbjVar, e9gVar2), oq5Var2), false, j3, null, function23, 0.0f, null, ild.C(1441969736, new s43(kbjVar, w3gVar2, z3, gesVar2, 14), oq5Var2), oq5Var, ((i3 << 3) & 57344) | (i12222 & 14) | 805306752 | (i12222 & 112) | (i12222 & 3670016), 424);
            w3gVar3 = w3gVar2;
            gesVar3 = gesVar2;
            yciVar4 = yciVar3;
            function24 = function23;
            z4 = z3;
            j4 = j3;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        function22 = function2;
        i6 = i2 & 256;
        if (i6 == 0) {
        }
        i7 = i6;
        if ((38347923 & i3) == 38347922) {
        }
        oq5Var2.U();
        if ((i & 1) != 0) {
        }
        if (i11 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i7 != 0) {
        }
        yciVar3 = yciVar2;
        j3 = j2;
        function23 = function25;
        oq5Var2.q();
        int i122222 = i3 >> 3;
        oq5Var = oq5Var2;
        ngg.i(function0, yciVar3, ild.C(-570538513, new m2g(27, kbjVar, e9gVar2), oq5Var2), false, j3, null, function23, 0.0f, null, ild.C(1441969736, new s43(kbjVar, w3gVar2, z3, gesVar2, 14), oq5Var2), oq5Var, ((i3 << 3) & 57344) | (i122222 & 14) | 805306752 | (i122222 & 112) | (i122222 & 3670016), 424);
        w3gVar3 = w3gVar2;
        gesVar3 = gesVar2;
        yciVar4 = yciVar3;
        function24 = function23;
        z4 = z3;
        j4 = j3;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void e(rvj rvjVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1395752461);
        int i2 = (oq5Var.f(rvjVar) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            pd.b(new qzm[0], true, ild.C(1607193796, new ovj(rvjVar, 0, (byte) 0), oq5Var), oq5Var, 432, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ovj(rvjVar, i);
        }
    }

    public static final void f(ewj ewjVar, rvj rvjVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1096324790);
        int i2 = (oq5Var.f(ewjVar) ? 4 : 2) | i | (oq5Var.f(rvjVar) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            iz2 iz2Var = b2c.f;
            yci a = androidx.compose.ui.platform.a.a(d.g(d.d(vci.a, 1.0f), 56, 0.0f, 2), "option_payment_button");
            kfh d = ug3.d(iz2Var, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            o3n o3nVar = ewjVar.a;
            String str = o3nVar.b;
            String str2 = o3nVar.c;
            String str3 = o3nVar.d;
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new y6g(27, rvjVar, ewjVar);
                oq5Var.k0(K);
            }
            p2n.a(str, str2, str3, (Function0) K, r2n.a, null, null, null, oq5Var, 24576, 224);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wcj(ewjVar, rvjVar, i, 3);
        }
    }

    public static final void g(a3m a3mVar, j3m j3mVar, fvf fvfVar, lf5 lf5Var, yci yciVar, o0k o0kVar, hq5 hq5Var, int i) {
        yci yciVar2;
        a3mVar.getClass();
        fvfVar.getClass();
        lf5Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2145453085);
        int i2 = i | (oq5Var.h(a3mVar) ? 4 : 2) | (oq5Var.f(j3mVar) ? 32 : 16) | (oq5Var.f(fvfVar) ? 256 : 128) | (oq5Var.h(lf5Var) ? 2048 : 1024) | 24576 | (oq5Var.f(o0kVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if ((74899 & i2) == 74898 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            boolean h = oq5Var.h(a3mVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                K = new kdd(a3mVar, (Continuation) null, 3);
                oq5Var.k0(K);
            }
            ayn B = s7g.B(fvfVar, (ryc) K, oq5Var, (i2 >> 6) & 14);
            vci vciVar = vci.a;
            yci c = d.c(vciVar, 1.0f);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object K2 = oq5Var.K();
            if (z || K2 == kjnVar) {
                K2 = new s8i(23, j3mVar);
                oq5Var.k0(K2);
            }
            yci b = nfp.b(c, false, (Function1) K2);
            boolean f = oq5Var.f(B) | (i3 == 32) | oq5Var.h(a3mVar) | oq5Var.h(lf5Var);
            Object K3 = oq5Var.K();
            if (f || K3 == kjnVar) {
                i50 i50Var = new i50(j3mVar, B, a3mVar, lf5Var, 14);
                oq5Var.k0(i50Var);
                K3 = i50Var;
            }
            weo.g(b, fvfVar, o0kVar, null, null, null, false, (Function1) K3, oq5Var, ((i2 >> 3) & 112) | ((i2 >> 9) & 896), 248);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pr((Object) a3mVar, (Object) j3mVar, (Object) fvfVar, (Object) lf5Var, yciVar2, (Object) o0kVar, i, 13);
        }
    }

    public static final void h(final jxg jxgVar, hq5 hq5Var, final int i) {
        oq5 oq5Var;
        xmn r;
        Function2 function2;
        float f;
        Object lcoVar;
        fk0 fk0Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(713555262);
        int i2 = (oq5Var2.f(jxgVar) ? 4 : 2) | i;
        if (oq5Var2.P(i2 & 1, (i2 & 3) != 2)) {
            ayg value = y1g.Q(new kyg(!((ma5) oq5Var2.j(pa5.a)).g() ? "query_to_vibe_dark.lottie" : "query_to_vibe_light.lottie"), oq5Var2).getValue();
            if (value == null) {
                r = oq5Var2.r();
                if (r != null) {
                    final int i3 = 0;
                    function2 = new Function2(jxgVar, i, i3) { // from class: x4p
                        public final /* synthetic */ int a;
                        public final /* synthetic */ jxg b;

                        {
                            this.a = i3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.a;
                            hq5 hq5Var2 = (hq5) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    p6g.h(this.b, hq5Var2, rvf.R(1));
                                    break;
                                default:
                                    p6g.h(this.b, hq5Var2, rvf.R(1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    r.d = function2;
                }
                return;
            }
            boolean f2 = oq5Var2.f(value);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (f2 || K == kjnVar) {
                dbh d = value.d("loading");
                float f3 = d == null ? 1.0f : ((d.b + d.c) - 1) / value.m;
                dbh d2 = value.d("success");
                float f4 = d2 == null ? 0.0f : d2.b / value.m;
                dbh d3 = value.d("success");
                float f5 = d3 == null ? 1.0f : (d3.b + d3.c) / value.m;
                f = 0.0f;
                dbh d4 = value.d("playing");
                jzg jzgVar = new jzg(f3, f4, f5, d4 != null ? (d4.b + d4.c) / value.m : 1.0f, F(value, "loading"), F(value, "success"), F(value, "playing"));
                oq5Var2.k0(jzgVar);
                K = jzgVar;
            } else {
                f = 0.0f;
            }
            jzg jzgVar2 = (jzg) K;
            Object K2 = oq5Var2.K();
            if (K2 == kjnVar) {
                K2 = szf.g0(dxg.a);
                oq5Var2.k0(K2);
            }
            aqi aqiVar = (aqi) K2;
            Object K3 = oq5Var2.K();
            if (K3 == kjnVar) {
                K3 = vq2.a(f);
                oq5Var2.k0(K3);
            }
            fk0 fk0Var2 = (fk0) K3;
            boolean h = ((i2 & 14) == 4) | oq5Var2.h(fk0Var2) | oq5Var2.f(jzgVar2);
            Object K4 = oq5Var2.K();
            if (h || K4 == kjnVar) {
                fk0Var = fk0Var2;
                lcoVar = new lco(jxgVar, fk0Var, jzgVar2, aqiVar, (Continuation) null, 3);
                oq5Var2.k0(lcoVar);
            } else {
                lcoVar = K4;
                fk0Var = fk0Var2;
            }
            gld.y(jxgVar, jzgVar2, (Function2) lcoVar, oq5Var2);
            iz2 iz2Var = b2c.e;
            Object K5 = oq5Var2.K();
            if (K5 == kjnVar) {
                K5 = new ep5(23);
                oq5Var2.k0(K5);
            }
            yci b = androidx.compose.ui.layout.a.b(vci.a, (pyc) K5);
            Object K6 = oq5Var2.K();
            if (K6 == kjnVar) {
                K6 = new d0p(12);
                oq5Var2.k0(K6);
            }
            yci a = androidx.compose.ui.graphics.a.a(b, (Function1) K6);
            boolean h2 = oq5Var2.h(fk0Var);
            Object K7 = oq5Var2.K();
            if (h2 || K7 == kjnVar) {
                K7 = new gn6(fk0Var, 3);
                oq5Var2.k0(K7);
            }
            oq5Var = oq5Var2;
            u1g.d(value, (Function0) K7, a, false, null, null, iz2Var, hd6.g, false, oq5Var, 0, 438, 123896);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        r = oq5Var.r();
        if (r != null) {
            final int i4 = 1;
            function2 = new Function2(jxgVar, i, i4) { // from class: x4p
                public final /* synthetic */ int a;
                public final /* synthetic */ jxg b;

                {
                    this.a = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = this.a;
                    hq5 hq5Var2 = (hq5) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
                        case 0:
                            p6g.h(this.b, hq5Var2, rvf.R(1));
                            break;
                        default:
                            p6g.h(this.b, hq5Var2, rvf.R(1));
                            break;
                    }
                    return Unit.a;
                }
            };
            r.d = function2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x027d  */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(m7n m7nVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        oq5 oq5Var;
        yci yciVar3;
        jxg jxgVar;
        String str;
        int i3;
        kb5 kb5Var;
        oq5 oq5Var2;
        k7n k7nVar;
        kb5 kb5Var2;
        int i4;
        String a;
        m7nVar.getClass();
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(-385231614);
        if ((i & 6) == 0) {
            i2 = (oq5Var3.h(m7nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var3.f(yciVar) ? 32 : 16;
        }
        if (oq5Var3.P(i2 & 1, (i2 & 19) != 18)) {
            k7n k7nVar2 = (k7n) m7nVar.g.getValue();
            boolean h = oq5Var3.h(m7nVar);
            Object K = oq5Var3.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                K = new ucm(17, m7nVar);
                oq5Var3.k0(K);
            }
            yci b = com.yandex.music.core.ui.compose.a.b(yciVar, null, 0L, 0.0f, null, (Function2) K, 15);
            yciVar2 = yciVar;
            Object K2 = oq5Var3.K();
            if (K2 == kjnVar) {
                K2 = new d0p(11);
                oq5Var3.k0(K2);
            }
            yci e = d.e(d.d(nfp.b(b, true, (Function1) K2), 1.0f), 96);
            boolean z = k7nVar2 instanceof i7n;
            vci vciVar = vci.a;
            if (z) {
                oq5Var3.Z(-281925878);
                boolean h2 = oq5Var3.h(m7nVar);
                Object K3 = oq5Var3.K();
                if (h2 || K3 == kjnVar) {
                    K3 = new oxo(3, m7nVar);
                    oq5Var3.k0(K3);
                }
                yciVar3 = androidx.compose.foundation.a.e(vciVar, false, null, null, (Function0) K3, 7);
                oq5Var3.p(false);
            } else {
                oq5Var3.Z(-281835792);
                oq5Var3.p(false);
                yciVar3 = vciVar;
            }
            yci f = e.f(yciVar3);
            kfh d = ug3.d(b2c.b, false);
            int i5 = oq5Var3.P;
            androidx.compose.runtime.internal.a l = oq5Var3.l();
            yci H = vnj.H(oq5Var3, f);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var3.d0();
            if (oq5Var3.O) {
                oq5Var3.k(grbVar);
            } else {
                oq5Var3.n0();
            }
            kb5 kb5Var3 = wp5.f;
            g0g.U(oq5Var3, d, kb5Var3);
            kb5 kb5Var4 = wp5.e;
            g0g.U(oq5Var3, l, kb5Var4);
            kb5 kb5Var5 = wp5.g;
            if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var3, i5, kb5Var5);
            }
            kb5 kb5Var6 = wp5.d;
            g0g.U(oq5Var3, H, kb5Var6);
            if (k7nVar2 instanceof j7n) {
                jxgVar = bxg.a;
            } else {
                if (!z) {
                    b6e.s();
                    return;
                }
                jxgVar = ((i7n) k7nVar2).e ? fxg.a : hxg.a;
            }
            h(jxgVar, oq5Var3, 0);
            yci r = d.r(d.b(a.q(vciVar, 8, 0.0f, 0.0f, 0.0f, 14), 1.0f), 64);
            kfh d2 = ug3.d(b2c.f, false);
            int i6 = oq5Var3.P;
            androidx.compose.runtime.internal.a l2 = oq5Var3.l();
            yci H2 = vnj.H(oq5Var3, r);
            oq5Var3.d0();
            if (oq5Var3.O) {
                oq5Var3.k(grbVar);
            } else {
                oq5Var3.n0();
            }
            g0g.U(oq5Var3, d2, kb5Var3);
            g0g.U(oq5Var3, l2, kb5Var4);
            if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var3, i6, kb5Var5);
            }
            g0g.U(oq5Var3, H2, kb5Var6);
            y0h y0hVar = (y0h) gld.M(m7nVar.h, oq5Var3).getValue();
            if (y0hVar == null) {
                oq5Var3.Z(-635091405);
                oq5Var3.p(false);
                i3 = 0;
                str = null;
            } else {
                oq5Var3.Z(-635091404);
                str = !((ma5) oq5Var3.j(pa5.a)).g() ? y0hVar.b : y0hVar.a;
                i3 = 0;
                oq5Var3.p(false);
            }
            a4g.c(str, a0g.E(!((ma5) oq5Var3.j(pa5.a)).g() ? 2131231768 : 2131231769, i3, oq5Var3), null, oq5Var3, i3);
            if (z) {
                i7n i7nVar = (i7n) k7nVar2;
                if (i7nVar.d) {
                    oq5Var3.Z(-634732083);
                    wn5 C = ild.C(301409316, new ucm(18, i7nVar), oq5Var3);
                    kb5Var = kb5Var4;
                    oq5Var2 = oq5Var3;
                    k7nVar = k7nVar2;
                    kb5Var2 = kb5Var5;
                    pd.b(new qzm[i3], true, C, oq5Var2, 432, 0);
                    oq5Var2.p(i3);
                    oq5Var2.p(true);
                    yci q = a.q(b.a.a(vciVar, b2c.e), 80, 0.0f, 16, 0.0f, 10);
                    ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
                    i4 = oq5Var2.P;
                    androidx.compose.runtime.internal.a l3 = oq5Var2.l();
                    yci H3 = vnj.H(oq5Var2, q);
                    oq5Var2.d0();
                    if (oq5Var2.O) {
                        oq5Var2.n0();
                    } else {
                        oq5Var2.k(grbVar);
                    }
                    g0g.U(oq5Var2, a2, kb5Var3);
                    g0g.U(oq5Var2, l3, kb5Var);
                    if (!oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                        ouj.x(i4, oq5Var2, i4, kb5Var2);
                    }
                    g0g.U(oq5Var2, H3, kb5Var6);
                    String b2 = k7nVar.b();
                    ges j = nu0.j();
                    agr agrVar = eq0.a;
                    oq5 oq5Var4 = oq5Var2;
                    xv7.j(b2, null, ((dq0) oq5Var2.j(agrVar)).b.a, 0L, 0L, 0, 0L, 2, false, 2, 0, null, j, oq5Var4, 0, 3120, 55290);
                    oq5Var = oq5Var4;
                    a = k7nVar.a();
                    if (a != null) {
                        oq5Var.Z(-139311392);
                    } else {
                        oq5Var.Z(-139311391);
                        u1g.l(oq5Var, d.e(vciVar, 2));
                        xv7.j(a, null, ((dq0) oq5Var.j(agrVar)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.i(), oq5Var, 0, 3120, 55290);
                    }
                    oq5Var.p(false);
                    oq5Var.p(true);
                    oq5Var.p(true);
                }
            }
            kb5Var = kb5Var4;
            oq5Var2 = oq5Var3;
            k7nVar = k7nVar2;
            kb5Var2 = kb5Var5;
            oq5Var2.Z(-641185012);
            oq5Var2.p(i3);
            oq5Var2.p(true);
            yci q2 = a.q(b.a.a(vciVar, b2c.e), 80, 0.0f, 16, 0.0f, 10);
            ta5 a22 = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
            i4 = oq5Var2.P;
            androidx.compose.runtime.internal.a l32 = oq5Var2.l();
            yci H32 = vnj.H(oq5Var2, q2);
            oq5Var2.d0();
            if (oq5Var2.O) {
            }
            g0g.U(oq5Var2, a22, kb5Var3);
            g0g.U(oq5Var2, l32, kb5Var);
            if (!oq5Var2.O) {
            }
            ouj.x(i4, oq5Var2, i4, kb5Var2);
            g0g.U(oq5Var2, H32, kb5Var6);
            String b22 = k7nVar.b();
            ges j2 = nu0.j();
            agr agrVar2 = eq0.a;
            oq5 oq5Var42 = oq5Var2;
            xv7.j(b22, null, ((dq0) oq5Var2.j(agrVar2)).b.a, 0L, 0L, 0, 0L, 2, false, 2, 0, null, j2, oq5Var42, 0, 3120, 55290);
            oq5Var = oq5Var42;
            a = k7nVar.a();
            if (a != null) {
            }
            oq5Var.p(false);
            oq5Var.p(true);
            oq5Var.p(true);
        } else {
            yciVar2 = yciVar;
            oq5Var = oq5Var3;
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new x8l(m7nVar, yciVar2, i, 12);
        }
    }

    public static final void j(o7r o7rVar, Function0 function0, hq5 hq5Var, int i) {
        o7rVar.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(193888474);
        int i2 = (oq5Var.f(o7rVar) ? 4 : 2) | i | (oq5Var.h(function0) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci c = d.c(vci.a, 1.0f);
            kfh d = ug3.d(b2c.f, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, c);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            c8r c8rVar = (c8r) gld.O(o7rVar.b, oq5Var).getValue();
            if (Intrinsics.d(c8rVar, b8r.a)) {
                oq5Var.Z(1473010808);
                oq5Var.p(false);
            } else {
                if (!(c8rVar instanceof a8r)) {
                    throw vz1.i(oq5Var, 1473007516, false);
                }
                oq5Var.Z(1473012621);
                k((a8r) c8rVar, o7rVar, function0, oq5Var, (i2 << 3) & 1008);
                oq5Var.p(false);
            }
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k0r(o7rVar, function0, i, 4);
        }
    }

    public static final void k(a8r a8rVar, o7r o7rVar, Function0 function0, hq5 hq5Var, int i) {
        int i2;
        int i3;
        oq5 oq5Var;
        a8r a8rVar2 = a8rVar;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-599501747);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(a8rVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? oq5Var2.f(o7rVar) : oq5Var2.h(o7rVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.h(function0) ? 256 : 128;
        }
        int i4 = i2;
        if ((i4 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            dzf dzfVar = (dzf) oq5Var2.j(ykg.a);
            View view = (View) oq5Var2.j(AndroidCompositionLocals_androidKt.f);
            Unit unit = Unit.a;
            int i5 = i4 & 14;
            boolean h = ((i4 & 112) == 32 || ((i4 & 64) != 0 && oq5Var2.h(o7rVar))) | (i5 == 4) | oq5Var2.h(view);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                i3 = i5;
                l1p l1pVar = new l1p(o7rVar, a8rVar2, view, null, 1);
                a8rVar2 = a8rVar2;
                oq5Var2.k0(l1pVar);
                K = l1pVar;
            } else {
                i3 = i5;
            }
            gld.w(oq5Var2, unit, (Function2) K);
            vci vciVar = vci.a;
            yci a = androidx.compose.ui.platform.a.a(d.c(vciVar, 1.0f), "splash_screen_content");
            kfh d = ug3.d(b2c.f, false);
            int i6 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, a);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, d, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var2, i6, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            boolean h2 = ((i4 & 896) == 256) | (i3 == 4) | oq5Var2.h(dzfVar);
            Object K2 = oq5Var2.K();
            if (h2 || K2 == kjnVar) {
                K2 = new zzq(3, function0, a8rVar2, dzfVar);
                oq5Var2.k0(K2);
            }
            oq5Var = oq5Var2;
            androidx.compose.ui.viewinterop.a.a(48, 4, oq5Var, d.c(vciVar, 1.0f), (Function1) K2, null);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new erj(a8rVar, o7rVar, function0, i, 15);
        }
    }

    public static ufc l(float f) {
        return new ufc(f, 0, 0, 0);
    }

    public static final String m(jzs jzsVar, int i) {
        return "trackId = " + jzsVar.a.a + ", source = " + jzsVar.g + ", batchId = " + jzsVar.d + ", position = " + i;
    }

    public static final eoe n(opv opvVar, hq5 hq5Var) {
        return new eoe(opvVar, (jx7) ((oq5) hq5Var).j(es5.h));
    }

    public static final wmm o(rnq rnqVar) {
        rnqVar.getClass();
        if (rnqVar instanceof wmm) {
            return (wmm) rnqVar;
        }
        return null;
    }

    public static ArrayList p(String str, List list) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(((v7u) obj).a)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new s7u(((v7u) it.next()).a, str));
        }
        if (arrayList2.size() != list.size()) {
            List list2 = list;
            ArrayList arrayList3 = new ArrayList(v75.o(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((v7u) it2.next()).a);
            }
            su4.s(2, null, "Radio session(batch=" + str + ") with repeated video clips! " + arrayList3, null);
        }
        return arrayList2;
    }

    public static LinearGradient q(float f, int[] iArr, float[] fArr, int i, int i2) {
        float f2 = i;
        float f3 = f2 / 2.0f;
        float f4 = i2;
        float f5 = f4 / 2.0f;
        double d = (float) ((f * 3.141592653589793d) / 180.0f);
        float abs = Math.abs(f4 * ((float) Math.sin(d))) + Math.abs(f2 * ((float) Math.cos(d)));
        float cos = (((float) Math.cos(d)) * abs) / 2.0f;
        if (Math.abs(0.0f - cos) <= 1.0E-4f) {
            cos = 0.0f;
        }
        float sin = (((float) Math.sin(d)) * abs) / 2.0f;
        float f6 = Math.abs(0.0f - sin) > 1.0E-4f ? sin : 0.0f;
        return new LinearGradient(f3 - cos, f5 + f6, f3 + cos, f5 - f6, iArr, fArr, Shader.TileMode.CLAMP);
    }

    public static final String r(hsb hsbVar) {
        hsbVar.getClass();
        StringBuilder sb = new StringBuilder("Format=");
        sb.append(hsbVar.c);
        sb.append(", p=");
        kjr kjrVar = hsbVar.b;
        sb.append(kjrVar.a);
        sb.append(", g=");
        sb.append(kjrVar.b);
        sb.append(", i=");
        sb.append(kjrVar.c);
        return sb.toString();
    }

    public static final void s(xjo xjoVar, String str) {
        xjoVar.getClass();
        str.getClass();
        cko D0 = xjoVar.D0(str);
        try {
            D0.q();
            i4w.w(D0, null);
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object t(List list, q2a q2aVar, c0o c0oVar, cg6 cg6Var) {
        ndk ndkVar;
        int i;
        int i2;
        Collection arrayList;
        Iterator it;
        int i3;
        if (cg6Var instanceof ndk) {
            ndkVar = (ndk) cg6Var;
            int i4 = ndkVar.r;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                ndkVar.r = i4 - Integer.MIN_VALUE;
                Object obj = ndkVar.q;
                nm6 nm6Var = nm6.a;
                i = ndkVar.r;
                if (i != 0) {
                    qgg.h0(obj);
                    int size = list.size();
                    if (size == 0) {
                        e5b e5bVar = e5b.a;
                        e5bVar.getClass();
                        return e5bVar;
                    }
                    i2 = 0;
                    if (size == 1) {
                        if (list.get(0) != null) {
                            l1j.f();
                            return null;
                        }
                        ndkVar.j = null;
                        ndkVar.k = null;
                        ndkVar.r = 1;
                        throw null;
                    }
                    List list2 = list;
                    arrayList = new ArrayList(v75.o(list2, 10));
                    it = list2.iterator();
                    i3 = 0;
                } else {
                    if (i == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = ndkVar.p;
                    int i5 = ndkVar.o;
                    Collection collection = ndkVar.n;
                    Iterator it2 = ndkVar.m;
                    arrayList = ndkVar.l;
                    c0o c0oVar2 = ndkVar.k;
                    q2a q2aVar2 = ndkVar.j;
                    qgg.h0(obj);
                    collection.add((Map) obj);
                    it = it2;
                    c0oVar = c0oVar2;
                    i2 = i5;
                    q2aVar = q2aVar2;
                }
                if (it.hasNext()) {
                    Iterator it3 = ((List) arrayList).iterator();
                    if (!it3.hasNext()) {
                        qq6.d("Empty collection can't be reduced.");
                        return null;
                    }
                    Object next = it3.next();
                    while (it3.hasNext()) {
                        next = uah.i((Map) next, (Map) it3.next());
                    }
                    return (Map) next;
                }
                if (it.next() != null) {
                    l1j.f();
                    return null;
                }
                ndkVar.j = q2aVar;
                ndkVar.k = c0oVar;
                Collection collection2 = arrayList;
                ndkVar.l = collection2;
                ndkVar.m = it;
                ndkVar.n = collection2;
                ndkVar.o = i2;
                ndkVar.p = i3;
                ndkVar.r = 2;
                throw null;
            }
        }
        ndkVar = new ndk(cg6Var);
        Object obj2 = ndkVar.q;
        nm6 nm6Var2 = nm6.a;
        i = ndkVar.r;
        if (i != 0) {
        }
        if (it.hasNext()) {
        }
    }

    public static f7u u(w7u w7uVar, ArrayList arrayList, int i) {
        w7uVar.getClass();
        List list = arrayList;
        if (arrayList == null) {
            list = c5b.a;
        }
        ArrayList g0 = CollectionsKt.g0(list, p(w7uVar.b, w7uVar.c));
        if (i >= 0) {
            int size = list.size();
            if (i > size) {
                i = size;
            }
        } else {
            i = list.size();
        }
        e7u e7uVar = g0.isEmpty() ? new e7u(-1, -1) : new e7u(i, list.size());
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((s7u) it.next()).b.a);
        }
        return new f7u(arrayList2, g0, e7uVar);
    }

    public static final boolean w(t3h t3hVar) {
        t3hVar.getClass();
        if (t3hVar instanceof s3h) {
            return ((s3h) t3hVar).c;
        }
        if (t3hVar instanceof r3h) {
            return true;
        }
        if (Intrinsics.d(t3hVar, q3h.a)) {
            return false;
        }
        b6e.s();
        return false;
    }

    public static final d6l x(e6l e6lVar) {
        e6lVar.getClass();
        if (e6lVar instanceof d6l) {
            return (d6l) e6lVar;
        }
        return null;
    }

    public static final long y(cds cdsVar, int i, boolean z, boolean z2) {
        ogi ogiVar = cdsVar.b;
        long j = cdsVar.c;
        if (ogiVar.e(i) >= ogiVar.f) {
            return 9205357640488583168L;
        }
        boolean z3 = cdsVar.a(((!z || z2) && (z || !z2)) ? Math.max(i + (-1), 0) : i) == cdsVar.f(i);
        ogiVar.o(i);
        int length = ((mn0) ogiVar.a.b).b.length();
        ArrayList arrayList = ogiVar.h;
        t5k t5kVar = (t5k) arrayList.get(i == length ? u75.g(arrayList) : cb0.w(arrayList, i));
        ih0 ih0Var = t5kVar.a;
        int d = t5kVar.d(i);
        ads adsVar = (ads) ih0Var.d;
        return (Float.floatToRawIntBits(yhn.c(z3 ? adsVar.h(d, false) : adsVar.i(d, false), 0.0f, (int) (j >> 32))) << 32) | (Float.floatToRawIntBits(yhn.c(ogiVar.c(r3), 0.0f, (int) (j & 4294967295L))) & 4294967295L);
    }

    public static final l7l z(e6l e6lVar) {
        e6lVar.getClass();
        if (Intrinsics.d(e6lVar, b6l.a)) {
            return l7l.a;
        }
        if (e6lVar instanceof c6l) {
            return l7l.b;
        }
        if (e6lVar instanceof d6l) {
            return l7l.c;
        }
        b6e.s();
        return null;
    }

    public abstract Rect E();

    public abstract boolean v();
}
