package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.Region;
import android.util.DisplayMetrics;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.media3.extractor.FlacStreamMetadata;
import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.shared.promo.data.ReportingConfigDto;
import io.appmetrica.analytics.rtm.internal.Constants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ru.yandex.music.R;
import ru.yandex.music.concert.ConcertActivity;

/* loaded from: classes5.dex */
public abstract class bkp implements l6b, wq5 {
    public static final wn5 a = new wn5(new rz3(1), -1096505616, false);
    public static final wn5 b = new wn5(new io5(20), 9832336, false);
    public static final wn5 c;
    public static final wn5 d;
    public static final wu1 e;
    public static final wu1 f;
    public static final ynn g;

    static {
        new wn5(new io5(21), -980337376, false);
        c = new wn5(new ro5(16), -841980584, false);
        new wn5(new ro5(17), -733522820, false);
        d = new wn5(new dp5(27), 1573608598, false);
        e = new wu1("io.grpc.internal.GrpcAttributes.securityLevel");
        f = new wu1("io.grpc.internal.GrpcAttributes.clientEagAttrs");
        g = new ynn(0.0f, 0.0f, 10.0f, 10.0f);
    }

    public static final void G(we4 we4Var, d85 d85Var, um0 um0Var, hq5 hq5Var, int i) {
        int i2;
        long j;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1100202869);
        if ((i & 48) == 0) {
            i2 = (oq5Var.f(we4Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(d85Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.d(um0Var.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 1169) == 1168 && oq5Var.z()) {
            oq5Var.S();
        } else {
            long h = ((Boolean) oq5Var.j(koe.a)).booleanValue() ? c3x.h(4287221203L) : d85.m;
            vci vciVar = vci.a;
            p1g.a(we4Var.a, rvf.M(R.string.artist_avatar, oq5Var), a.b(xp3.u(d.m(vciVar, 136), ugo.a), h, vnj.i), null, null, null, hd6.a, 0.0f, null, 0, oq5Var, ScreenMirroringConfig.Video.BITRATE_1_5MB, 952);
            u1g.l(oq5Var, d.e(vciVar, 8));
            vm0 b2 = fn0.b(we4Var.c.size(), 0.0f, um0Var, oq5Var, (i2 >> 3) & 896, 2);
            String str = we4Var.b;
            if (str == null) {
                oq5Var.Z(-1247510876);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-1247510875);
                boolean f2 = oq5Var.f(b2);
                Object K = oq5Var.K();
                if (f2 || K == gq5.a) {
                    K = new la1(b2, 12);
                    oq5Var.k0(K);
                }
                yci s = wyf.s(vciVar, (Function0) K);
                ges d2 = nu0.d();
                if (d85Var == null) {
                    oq5Var.Z(1687522164);
                    j = ((dq0) oq5Var.j(eq0.a)).b.a;
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(1687521141);
                    oq5Var.p(false);
                    j = d85Var.a;
                }
                xv7.j(str, s, j, 0L, 0L, 3, 0L, 2, false, 2, 0, null, d2, oq5Var, 0, 3120, 55032);
                oq5Var = oq5Var;
                oq5Var.p(false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new b3(we4Var, d85Var, um0Var, i, 21);
        }
    }

    public static final void H(yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2046746102);
        if (oq5Var.P(i & 1, (i & 3) != 2)) {
            pm0.a(lm0.c, ild.C(-750085441, new u71(yciVar, 0), oq5Var), oq5Var, 48, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u71(yciVar, i, 1);
        }
    }

    public static final void I(dz1 dz1Var, hq5 hq5Var, int i) {
        dz1 dz1Var2;
        fvf fvfVar;
        iz1 iz1Var;
        dz1Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1224870590);
        int i2 = (oq5Var.h(dz1Var) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            fvf a2 = hvf.a(0, 0, oq5Var, 0, 3);
            iz1 iz1Var2 = (iz1) gld.M(dz1Var.i, oq5Var).getValue();
            ogp.g.e(false, iz1Var2 instanceof gz1, null, oq5Var, 4096, 5);
            boolean h = oq5Var.h(dz1Var);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                fvfVar = a2;
                iz1Var = iz1Var2;
                oi1 oi1Var = new oi1(0, dz1Var, dz1.class, "onBackClick", "onBackClick()V", 0, 10);
                oq5Var.k0(oi1Var);
                K = oi1Var;
            } else {
                iz1Var = iz1Var2;
                fvfVar = a2;
            }
            h9f h9fVar = (h9f) K;
            boolean h2 = oq5Var.h(dz1Var);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                oi1 oi1Var2 = new oi1(0, dz1Var, dz1.class, "onSearchClick", "onSearchClick()V", 0, 11);
                dz1Var2 = dz1Var;
                oq5Var.k0(oi1Var2);
                K2 = oi1Var2;
            } else {
                dz1Var2 = dz1Var;
            }
            u7g.i(R.string.collection_audiobooks_title, fvfVar, (Function0) h9fVar, null, (Function0) ((h9f) K2), ild.C(-769377054, new xk(13, iz1Var, fvfVar, dz1Var2), oq5Var), oq5Var, 199680);
        } else {
            dz1Var2 = dz1Var;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q2(dz1Var2, i, 15);
        }
    }

    public static final void J(v83 v83Var, hq5 hq5Var, int i) {
        v83Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1845994846);
        int i2 = (oq5Var.h(v83Var) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            b93 b93Var = (b93) szf.Q(v83Var.i, oq5Var).getValue();
            fvf a2 = hvf.a(0, 0, oq5Var, 0, 3);
            boolean h = oq5Var.h(v83Var);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                oi1 oi1Var = new oi1(0, v83Var, v83.class, "onBackClicked", "onBackClicked()V", 0, 24);
                oq5Var.k0(oi1Var);
                K = oi1Var;
            }
            Function0 function0 = (Function0) ((h9f) K);
            boolean h2 = oq5Var.h(v83Var);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                oi1 oi1Var2 = new oi1(0, v83Var, v83.class, "onSearchClicked", "onSearchClicked()V", 0, 25);
                oq5Var.k0(oi1Var2);
                K2 = oi1Var2;
            }
            Function0 function02 = (Function0) ((h9f) K2);
            boolean h3 = oq5Var.h(v83Var);
            Object K3 = oq5Var.K();
            if (h3 || K3 == kjnVar) {
                oi1 oi1Var3 = new oi1(0, v83Var, v83.class, "openSortBottomSheet", "openSortBottomSheet()V", 0, 26);
                oq5Var.k0(oi1Var3);
                K3 = oi1Var3;
            }
            kg5.g(R.string.audiobooks_title_episodes, a2, function0, function02, (Function0) ((h9f) K3), ild.C(1829964177, new xk(15, b93Var, v83Var, a2), oq5Var), oq5Var, 196608, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q2(v83Var, i, 17);
        }
    }

    public static final void K(we4 we4Var, um0 um0Var, hvq hvqVar, d85 d85Var, yci yciVar, zsq zsqVar, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        zsq zsqVar2 = zsqVar;
        um0Var.getClass();
        hvqVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-865664779);
        if ((i & 6) == 0) {
            i3 = (oq5Var.f(we4Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.d(um0Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.h(hvqVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var.f(d85Var) ? 2048 : 1024;
        }
        int i4 = i3 | 24576;
        int i5 = i2 & 32;
        if (i5 != 0) {
            i4 = 221184 | i3;
        } else if ((196608 & i) == 0) {
            i4 |= (i & SQLiteDatabase.OPEN_PRIVATECACHE) == 0 ? oq5Var.f(zsqVar2) : oq5Var.h(zsqVar2) ? 131072 : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i4) == 74898 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            if (i5 != 0) {
                zsqVar2 = null;
            }
            int i6 = i4 << 3;
            int i7 = (i6 & 896) | 6;
            vm0 a2 = fn0.a(new act(1000, (kya) null, 6), 0.0f, um0Var, oq5Var, i7, 2);
            vci vciVar = vci.a;
            float f2 = 16;
            yci q = androidx.compose.foundation.layout.a.q(d.c(vciVar, 1.0f), f2, 0.0f, f2, 0.0f, 10);
            boolean f3 = oq5Var.f(a2);
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (f3 || K == obj) {
                K = new la1(a2, 11);
                oq5Var.k0(K);
            }
            yci s = wyf.s(q, (Function0) K);
            boolean h = ((458752 & i4) == 131072 || ((i4 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && oq5Var.h(zsqVar2))) | oq5Var.h(hvqVar);
            Object K2 = oq5Var.K();
            if (h || K2 == obj) {
                K2 = new ko1(zsqVar2, hvqVar, 2);
                oq5Var.k0(K2);
            }
            yci b2 = com.yandex.music.core.ui.compose.a.b(s, null, 0L, 0.0f, null, (Function2) K2, 15);
            ta5 a3 = sa5.a(we4Var.d.a, b2c.o, oq5Var, 48);
            int i8 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                ouj.x(i8, oq5Var, i8, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            float f4 = 24;
            G(we4Var, d85Var, um0Var, oq5Var, ((i4 << 6) & 7168) | 6 | (i6 & 112) | ((i4 >> 3) & 896));
            u1g.l(oq5Var, d.e(vciVar, f4));
            oq5Var = oq5Var;
            qwp.d(we4Var.c, um0Var, hvqVar.a(), d85Var, new HorizontalAlignElement(b2c.n), oq5Var, (i6 & 57344) | i7);
            eta.p(vciVar, f4, oq5Var, true);
            yciVar2 = vciVar;
        }
        zsq zsqVar3 = zsqVar2;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new fd1((Object) we4Var, (Object) um0Var, (Object) hvqVar, d85Var, yciVar2, zsqVar3, i, i2, 3);
        }
    }

    public static final void L(final String str, final Integer num, final String str2, final d85 d85Var, final yci yciVar, float f2, final String str3, final boolean z, hq5 hq5Var, final int i) {
        boolean z2;
        long j;
        kb5 kb5Var;
        kb5 kb5Var2;
        boolean z3;
        kb5 kb5Var3;
        vci vciVar;
        float f3;
        kb5 kb5Var4;
        grb grbVar;
        yci u;
        float f4;
        int i2;
        boolean z4;
        final float f5;
        long j2;
        long j3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1849149253);
        int i3 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.f(num) ? 256 : 128) | (oq5Var.f(str2) ? 2048 : 1024) | (oq5Var.f(d85Var) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | ScreenMirroringConfig.Video.BITRATE_1_5MB | (oq5Var.f(str3) ? 8388608 : RemoteCameraConfig.Camera.BITRATE) | (oq5Var.g(z) ? 67108864 : 33554432) | 805306368;
        if ((i3 & 306783379) == 306783378 && oq5Var.z()) {
            oq5Var.S();
            f5 = f2;
        } else {
            float f6 = 80;
            nho a2 = lho.a(qx0.a, b2c.l, oq5Var, 48);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar2);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var5 = wp5.f;
            g0g.U(oq5Var, a2, kb5Var5);
            kb5 kb5Var6 = wp5.e;
            g0g.U(oq5Var, l, kb5Var6);
            kb5 kb5Var7 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var7);
            }
            kb5 kb5Var8 = wp5.d;
            g0g.U(oq5Var, H, kb5Var8);
            vci vciVar2 = vci.a;
            if (num == null) {
                oq5Var.Z(-827296229);
                oq5Var.p(false);
                kb5Var2 = kb5Var8;
                f3 = f6;
                kb5Var3 = kb5Var6;
                z3 = false;
                kb5Var = kb5Var7;
                grbVar = grbVar2;
                kb5Var4 = kb5Var5;
                vciVar = vciVar2;
            } else {
                oq5Var.Z(-827296228);
                String valueOf = String.valueOf(num.intValue());
                yci q = androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 0.0f, 8, 0.0f, 11);
                ges e2 = nu0.e();
                if (d85Var == null) {
                    oq5Var.Z(-1309341164);
                    j = ((dq0) oq5Var.j(eq0.a)).b.a;
                    z2 = false;
                    oq5Var.p(false);
                } else {
                    z2 = false;
                    oq5Var.Z(-1309342187);
                    oq5Var.p(false);
                    j = d85Var.a;
                }
                kb5Var = kb5Var7;
                kb5Var2 = kb5Var8;
                z3 = z2;
                kb5Var3 = kb5Var6;
                vciVar = vciVar2;
                f3 = f6;
                long j4 = j;
                kb5Var4 = kb5Var5;
                grbVar = grbVar2;
                xcs.b(valueOf, q, j4, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, e2, oq5Var, 48, 0, 65528);
                oq5Var = oq5Var;
                oq5Var.p(z3);
            }
            htq htqVar = new htq(z ? etq.b : etq.a);
            yci m = d.m(vciVar, f3);
            if (z) {
                oq5Var.Z(-826736120);
                u = if4.b(1.0f, ((dq0) oq5Var.j(eq0.a)).c.a, true);
                oq5Var.p(z3);
            } else {
                oq5Var.Z(-826447789);
                oq5Var.p(z3);
                u = xp3.u(vciVar, ugo.a(10));
            }
            ocg.e(str2, htqVar, m.f(u), null, oq5Var, (i3 >> 9) & 14, 8);
            yci q2 = androidx.compose.foundation.layout.a.q(vciVar, 12, 0.0f, 0.0f, 0.0f, 14);
            ta5 a3 = sa5.a(qx0.e, b2c.n, oq5Var, 6);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, q2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var4);
            g0g.U(oq5Var, l2, kb5Var3);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H2, kb5Var2);
            if (str != null) {
                oq5Var.Z(-1263584563);
                ges j5 = nu0.j();
                if (d85Var == null) {
                    oq5Var.Z(1483264776);
                    long j6 = ((dq0) oq5Var.j(eq0.a)).b.a;
                    oq5Var.p(z3);
                    j3 = j6;
                } else {
                    oq5Var.Z(1483263753);
                    oq5Var.p(z3);
                    j3 = d85Var.a;
                }
                f4 = f3;
                oq5 oq5Var2 = oq5Var;
                xcs.b(str, null, j3, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, j5, oq5Var2, i3 & 14, 3120, 55290);
                oq5Var = oq5Var2;
                z4 = false;
                oq5Var.p(false);
                i2 = -1266446111;
            } else {
                f4 = f3;
                i2 = -1266446111;
                z4 = z3;
                oq5Var.Z(-1266446111);
                oq5Var.p(z4);
            }
            if (str3 != null) {
                oq5Var.Z(-1263244183);
                ges c2 = nu0.c();
                if (d85Var == null) {
                    oq5Var.Z(1483275880);
                    j2 = ((dq0) oq5Var.j(eq0.a)).b.a;
                    oq5Var.p(z4);
                } else {
                    oq5Var.Z(1483274857);
                    oq5Var.p(z4);
                    j2 = d85Var.a;
                }
                oq5 oq5Var3 = oq5Var;
                xcs.b(str3, null, j2, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, c2, oq5Var3, (i3 >> 21) & 14, 3120, 55290);
                oq5Var = oq5Var3;
                z4 = false;
            } else {
                oq5Var.Z(i2);
            }
            oq5Var.p(z4);
            oq5Var.p(true);
            oq5Var.p(true);
            f5 = f4;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2(str, num, str2, d85Var, yciVar, f5, str3, z, i) { // from class: fo6
                public final /* synthetic */ String a;
                public final /* synthetic */ Integer b;
                public final /* synthetic */ String c;
                public final /* synthetic */ d85 d;
                public final /* synthetic */ yci e;
                public final /* synthetic */ float f;
                public final /* synthetic */ String g;
                public final /* synthetic */ boolean h;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(49);
                    bkp.L(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (hq5) obj, R);
                    return Unit.a;
                }
            };
        }
    }

    public static final void M(ArrayList arrayList, hda hdaVar, fvf fvfVar, o0k o0kVar, hq5 hq5Var, int i) {
        int i2;
        hdaVar.getClass();
        fvfVar.getClass();
        o0kVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-329027979);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(arrayList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(hdaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(fvfVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(o0kVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            c3x.t(fvfVar, arrayList, oq5Var, ((i2 >> 6) & 14) | ((i2 << 3) & 112));
            vm C = ghh.C(o0kVar, androidx.compose.foundation.layout.a.c(0.0f, 24, 0.0f, 16, 5));
            yci a2 = androidx.compose.ui.platform.a.a(d.c(vci.a, 1.0f), "album_list");
            boolean h = oq5Var.h(arrayList) | oq5Var.h(hdaVar);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new ny2(20, arrayList, hdaVar);
                oq5Var.k0(K);
            }
            weo.f(a2, fvfVar, C, null, null, null, false, null, (Function1) K, oq5Var, ((i2 >> 3) & 112) | 6, 504);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu(i, 29, arrayList, hdaVar, fvfVar, o0kVar);
        }
    }

    public static final void N(Function0 function0, Function0 function02, Function0 function03, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        Function0 function04;
        function0.getClass();
        function02.getClass();
        function03.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1446139642);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function02) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function04 = function03;
            i2 |= oq5Var.h(function04) ? 256 : 128;
        } else {
            function04 = function03;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            gz2 gz2Var = b2c.o;
            float f2 = 16;
            yci a2 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.m(yciVar, f2), "empty_page_state");
            ta5 a3 = sa5.a(qx0.c, gz2Var, oq5Var, 48);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            w4k E = a0g.E(R.drawable.ic_unavailable_24, 0, oq5Var);
            agr agrVar = eq0.a;
            long j = ((dq0) oq5Var.j(agrVar)).a.c;
            vci vciVar = vci.a;
            int i4 = i2;
            gae.b(E, null, d.m(vciVar, 72), j, oq5Var, 432, 0);
            float f3 = 8;
            xcs.b(vz1.o(vciVar, f3, oq5Var, R.string.url_noPage, oq5Var), null, ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.c(), oq5Var, 0, 0, 65530);
            xcs.b(vz1.o(vciVar, f3, oq5Var, R.string.url_description, oq5Var), null, ((dq0) oq5Var.j(agrVar)).b.b, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, 0, 0, 65018);
            oq5Var = oq5Var;
            u1g.l(oq5Var, d.e(vciVar, f2));
            bcx.d(function0, null, false, ghh.b, oq5Var, (i4 & 14) | 3072, 6);
            bcx.d(function02, null, false, ghh.c, oq5Var, ((i4 >> 3) & 14) | 3072, 6);
            bcx.d(function04, null, false, ghh.d, oq5Var, ((i4 >> 6) & 14) | 3072, 6);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wda(i, 2, function0, function02, function03, yciVar);
        }
    }

    public static final void O(yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(267387816);
        if (oq5Var.P(i & 1, (i & 3) != 2)) {
            nho a2 = lho.a(qx0.a, b2c.l, oq5Var, 48);
            int i2 = oq5Var.P;
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
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            vci vciVar = vci.a;
            pm0.c(xp3.u(d.m(vciVar, 52), o5g.E(oq5Var)), oq5Var, 0);
            u1g.l(oq5Var, d.r(vciVar, 12));
            ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, vciVar);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            pm0.d(d.r(vciVar, 148), nu0.j(), oq5Var, 6);
            pm0.d(d.r(vciVar, 64), nu0.i(), oq5Var, 6);
            oq5Var.p(true);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u71(yciVar, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void P(q0d q0dVar, d1d d1dVar, Function0 function0, yci yciVar, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        int i4;
        a1d a1dVar;
        oq5 oq5Var;
        boolean z;
        boolean z2;
        int i5;
        IntRange intRange;
        xmn r;
        q0dVar.getClass();
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1452330659);
        if ((i & 6) == 0) {
            i3 = (oq5Var2.h(q0dVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? oq5Var2.f(d1dVar) : oq5Var2.h(d1dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var2.h(function0) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var2.f(yciVar2) ? 2048 : 1024;
            if ((i3 & 1171) == 1170 || !oq5Var2.z()) {
                vci vciVar = vci.a;
                yci yciVar3 = i6 == 0 ? vciVar : yciVar2;
                yci a2 = androidx.compose.ui.platform.a.a(yciVar3, "fullscreen_gallery");
                kfh d2 = ug3.d(b2c.b, false);
                i4 = oq5Var2.P;
                androidx.compose.runtime.internal.a l = oq5Var2.l();
                yci H = vnj.H(oq5Var2, a2);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.n0();
                } else {
                    oq5Var2.k(grbVar);
                }
                g0g.U(oq5Var2, d2, wp5.f);
                g0g.U(oq5Var2, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (!oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var2, i4, kb5Var);
                }
                g0g.U(oq5Var2, H, wp5.d);
                iz2 iz2Var = b2c.c;
                b bVar = b.a;
                Q(function0, f8g.g0(gut.p1(d.d(bVar.a(vciVar, iz2Var), 1.0f)), 2.0f), oq5Var2, (i3 >> 6) & 14);
                n7w.o(q0dVar, d1dVar, d.c(vciVar, 1.0f), oq5Var2, (i3 & 112) | (i3 & 14) | 384);
                a1dVar = (a1d) szf.Q(q0dVar.getState(), oq5Var2).getValue();
                if (!Intrinsics.d(a1dVar, y0d.a)) {
                    oq5Var = oq5Var2;
                    yciVar2 = yciVar3;
                    z = true;
                } else if (a1dVar instanceof z0d) {
                    z0d z0dVar = (z0d) a1dVar;
                    List list = z0dVar.e;
                    if (list.size() > 1 && z0dVar.f) {
                        oq5Var2.Z(-272417199);
                        yci q = androidx.compose.foundation.layout.a.q(gut.a0(f8g.g0(bVar.a(vciVar, b2c.i), 2.0f)), 0.0f, 0.0f, 0.0f, 11, 7);
                        int i7 = z0dVar.b;
                        int size = list.size();
                        IntRange intRange2 = z0dVar.d;
                        boolean h = oq5Var2.h(q0dVar);
                        Object K = oq5Var2.K();
                        if (h || K == gq5.a) {
                            i5 = i7;
                            intRange = intRange2;
                            aub aubVar = new aub(1, q0dVar, q0d.class, "onIndicatorRangeChanged", "onIndicatorRangeChanged(Lkotlin/ranges/IntRange;)V", 0, 3);
                            oq5Var2.k0(aubVar);
                            K = aubVar;
                        } else {
                            intRange = intRange2;
                            i5 = i7;
                        }
                        jx7 jx7Var = (jx7) oq5Var2.j(es5.h);
                        float n0 = jx7Var.n0(3);
                        float n02 = jx7Var.n0(2);
                        float n03 = jx7Var.n0(1);
                        float n04 = jx7Var.n0(4);
                        agr agrVar = eq0.a;
                        m2k m2kVar = new m2k(n0, n02, n03, n04, ((dq0) oq5Var2.j(agrVar)).a.c, ((dq0) oq5Var2.j(agrVar)).a.a, 10);
                        yciVar2 = yciVar3;
                        z = true;
                        z2 = false;
                        ivf.j(i5, intRange, (Function1) ((h9f) K), size, m2kVar, q, oq5Var2, 0, 0);
                        oq5Var = oq5Var2;
                    } else {
                        oq5Var = oq5Var2;
                        yciVar2 = yciVar3;
                        z = true;
                        z2 = false;
                        oq5Var.Z(-274925781);
                    }
                    oq5Var.p(z2);
                } else {
                    oq5Var = oq5Var2;
                    yciVar2 = yciVar3;
                    z = true;
                    if (!Intrinsics.d(a1dVar, x0d.a)) {
                        b6e.s();
                        return;
                    }
                }
                oq5Var.p(z);
            } else {
                oq5Var2.S();
                oq5Var = oq5Var2;
            }
            yci yciVar4 = yciVar2;
            r = oq5Var.r();
            if (r == null) {
                r.d = new hq((Object) q0dVar, (Object) d1dVar, (Object) function0, yciVar4, i, i2, 13);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((i3 & 1171) == 1170) {
        }
        vci vciVar2 = vci.a;
        if (i6 == 0) {
        }
        yci a22 = androidx.compose.ui.platform.a.a(yciVar3, "fullscreen_gallery");
        kfh d22 = ug3.d(b2c.b, false);
        i4 = oq5Var2.P;
        androidx.compose.runtime.internal.a l2 = oq5Var2.l();
        yci H2 = vnj.H(oq5Var2, a22);
        xp5.T.getClass();
        grb grbVar2 = wp5.b;
        oq5Var2.d0();
        if (oq5Var2.O) {
        }
        g0g.U(oq5Var2, d22, wp5.f);
        g0g.U(oq5Var2, l2, wp5.e);
        kb5 kb5Var2 = wp5.g;
        if (!oq5Var2.O) {
        }
        ouj.x(i4, oq5Var2, i4, kb5Var2);
        g0g.U(oq5Var2, H2, wp5.d);
        iz2 iz2Var2 = b2c.c;
        b bVar2 = b.a;
        Q(function0, f8g.g0(gut.p1(d.d(bVar2.a(vciVar2, iz2Var2), 1.0f)), 2.0f), oq5Var2, (i3 >> 6) & 14);
        n7w.o(q0dVar, d1dVar, d.c(vciVar2, 1.0f), oq5Var2, (i3 & 112) | (i3 & 14) | 384);
        a1dVar = (a1d) szf.Q(q0dVar.getState(), oq5Var2).getValue();
        if (!Intrinsics.d(a1dVar, y0d.a)) {
        }
        oq5Var.p(z);
        yci yciVar42 = yciVar2;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void Q(Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        Function0 function02;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-970601072);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            function02 = function0;
        } else {
            nho a2 = lho.a(qx0.a, b2c.k, oq5Var, 0);
            int i3 = oq5Var.P;
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
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            function02 = function0;
            aae.a(function02, null, false, b, oq5Var, (i2 & 14) | 24576, 14);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            u1g.l(oq5Var, new LayoutWeightElement(true, 1.0f));
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ni6(function02, yciVar, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void R(uvd uvdVar, String str, Function0 function0, yci yciVar, ges gesVar, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        ges gesVar2;
        ges d2;
        int i4;
        yci yciVar3;
        oq5 oq5Var;
        yci yciVar4;
        ges gesVar3;
        xmn r;
        int i5;
        uvdVar.getClass();
        str.getClass();
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-2024519529);
        if ((i & 6) == 0) {
            i3 = (oq5Var2.f(uvdVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var2.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var2.h(function0) ? 256 : 128;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var2.f(yciVar2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 8) == 0) {
                    gesVar2 = gesVar;
                    if (oq5Var2.f(gesVar2)) {
                        i5 = 16384;
                        i3 |= i5;
                    }
                } else {
                    gesVar2 = gesVar;
                }
                i5 = RemoteCameraConfig.Notification.ID;
                i3 |= i5;
            } else {
                gesVar2 = gesVar;
            }
            if ((i3 & 9363) == 9362 || !oq5Var2.z()) {
                oq5Var2.U();
                if ((i & 1) != 0 || oq5Var2.y()) {
                    if (i6 != 0) {
                        yciVar2 = vci.a;
                    }
                    if ((i2 & 8) != 0) {
                        d2 = nu0.d();
                        i4 = i3 & (-57345);
                        yciVar3 = yciVar2;
                        oq5Var2.q();
                        float f2 = 4;
                        oq5Var = oq5Var2;
                        xv7.j(str, androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.o(a.e(xp3.u(yciVar3, ugo.a(f2)), false, null, null, function0, 7), f2, 0.0f, 2), "title"), ((dq0) oq5Var2.j(eq0.a)).b.a, 0L, 0L, 3, 0L, 2, false, uvdVar.a ? 2 : 1, 0, null, d2, oq5Var, (i4 >> 3) & 14, (3670016 & (i4 << 6)) | 48, 55032);
                        yciVar4 = yciVar3;
                        gesVar3 = d2;
                    }
                } else {
                    oq5Var2.S();
                    if ((i2 & 8) != 0) {
                        i3 &= -57345;
                    }
                }
                i4 = i3;
                yciVar3 = yciVar2;
                d2 = gesVar2;
                oq5Var2.q();
                float f22 = 4;
                oq5Var = oq5Var2;
                xv7.j(str, androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.o(a.e(xp3.u(yciVar3, ugo.a(f22)), false, null, null, function0, 7), f22, 0.0f, 2), "title"), ((dq0) oq5Var2.j(eq0.a)).b.a, 0L, 0L, 3, 0L, 2, false, uvdVar.a ? 2 : 1, 0, null, d2, oq5Var, (i4 >> 3) & 14, (3670016 & (i4 << 6)) | 48, 55032);
                yciVar4 = yciVar3;
                gesVar3 = d2;
            } else {
                oq5Var2.S();
                oq5Var = oq5Var2;
                yciVar4 = yciVar2;
                gesVar3 = gesVar2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new cj((Object) uvdVar, str, function0, yciVar4, (Object) gesVar3, i, i2, 8);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((i & 24576) != 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        oq5Var2.U();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        i4 = i3;
        yciVar3 = yciVar2;
        d2 = gesVar2;
        oq5Var2.q();
        float f222 = 4;
        oq5Var = oq5Var2;
        xv7.j(str, androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.o(a.e(xp3.u(yciVar3, ugo.a(f222)), false, null, null, function0, 7), f222, 0.0f, 2), "title"), ((dq0) oq5Var2.j(eq0.a)).b.a, 0L, 0L, 3, 0L, 2, false, uvdVar.a ? 2 : 1, 0, null, d2, oq5Var, (i4 >> 3) & 14, (3670016 & (i4 << 6)) | 48, 55032);
        yciVar4 = yciVar3;
        gesVar3 = d2;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final String S(q1f q1fVar) {
        String valueOf;
        q1fVar.getClass();
        r1f r1fVar = q1fVar.a;
        switch (r1fVar.ordinal()) {
            case 0:
                valueOf = String.valueOf(((oqe) q1fVar).b);
                break;
            case 1:
                valueOf = String.valueOf(((d9a) q1fVar).b);
                break;
            case 2:
                String str = ((jkr) q1fVar).b;
                valueOf = hrg.A(str, "\"", str, "\"");
                break;
            case 3:
                if (!((mc3) q1fVar).b) {
                    valueOf = PListParser.TAG_FALSE;
                    break;
                } else {
                    valueOf = PListParser.TAG_TRUE;
                    break;
                }
            case 4:
                valueOf = "null";
                break;
            case 5:
                ArrayList arrayList = new ArrayList();
                w1g.n(((z9h) q1fVar).b, new y5(15, arrayList));
                valueOf = hrg.q("{", CollectionsKt.X(arrayList, ", ", null, null, null, 62), "}");
                break;
            case 6:
                ArrayList arrayList2 = ((my0) q1fVar).b;
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(S((q1f) it.next()));
                }
                valueOf = hrg.q("[", CollectionsKt.X(arrayList3, ", ", null, null, null, 62), "]");
                break;
            default:
                b6e.s();
                return null;
        }
        return hrg.s("<JSONItem kind: ", U(r1fVar), ", value: ", valueOf, ">");
    }

    public static final Serializable T(q1f q1fVar) {
        q1fVar.getClass();
        int ordinal = q1fVar.a.ordinal();
        if (ordinal == 0) {
            oqe oqeVar = (oqe) q1fVar;
            boolean z = oqeVar.c;
            long j = oqeVar.b;
            return z ? Long.valueOf(j) : Integer.valueOf((int) j);
        }
        if (ordinal == 1) {
            return Double.valueOf(((d9a) q1fVar).b);
        }
        if (ordinal == 2) {
            return ((jkr) q1fVar).b;
        }
        if (ordinal == 3) {
            return Boolean.valueOf(((mc3) q1fVar).b);
        }
        if (ordinal == 5) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            w1g.n(((z9h) q1fVar).b, new u60(linkedHashMap, 7));
            return linkedHashMap;
        }
        if (ordinal != 6) {
            return null;
        }
        ArrayList arrayList = ((my0) q1fVar).b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(T((q1f) it.next()));
        }
        return arrayList2;
    }

    public static final String U(r1f r1fVar) {
        r1fVar.getClass();
        switch (r1fVar.ordinal()) {
            case 0:
                return PListParser.TAG_INTEGER;
            case 1:
                return "double";
            case 2:
                return PListParser.TAG_STRING;
            case 3:
                return "boolean";
            case 4:
                return "nullItem";
            case 5:
                return "map";
            case 6:
                return PListParser.TAG_ARRAY;
            default:
                b6e.s();
                return null;
        }
    }

    public static final void V(yci yciVar, tsf tsfVar, jqd jqdVar, o0k o0kVar, jic jicVar, boolean z, qg0 qg0Var, ox0 ox0Var, mx0 mx0Var, Function1 function1, hq5 hq5Var, int i, int i2) {
        int i3;
        int i4;
        tsf tsfVar2;
        oq5 oq5Var;
        int i5;
        boolean z2;
        boolean z3;
        tsf tsfVar3;
        p9f p9fVar;
        boolean z4;
        yci yciVar2;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(708740370);
        if ((i & 6) == 0) {
            i3 = (oq5Var2.f(yciVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var2.f(tsfVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var2.f(jqdVar) : oq5Var2.h(jqdVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var2.f(o0kVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var2.g(false) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i & 196608) == 0) {
            i3 |= oq5Var2.g(true) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            i3 |= oq5Var2.f(jicVar) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= oq5Var2.g(z) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((i & 100663296) == 0) {
            i3 |= oq5Var2.f(qg0Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= oq5Var2.f(ox0Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (oq5Var2.f(mx0Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var2.h(function1) ? 32 : 16;
        }
        if (oq5Var2.P(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            oq5Var2.U();
            if ((i & 1) != 0 && !oq5Var2.y()) {
                oq5Var2.S();
            }
            oq5Var2.q();
            int i6 = i3 >> 3;
            int i7 = i6 & 14;
            int i8 = i7 | (i4 & 112);
            aqi o0 = szf.o0(function1, oq5Var2);
            boolean z5 = (((i8 & 14) ^ 6) > 4 && oq5Var2.f(tsfVar)) || (i8 & 6) == 4;
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (z5 || K == kjnVar) {
                rwd rwdVar = rwd.h;
                i5 = i3;
                K = new jk6(0, 2, sdr.class, szf.T(rwdVar, new ssb(9, szf.T(rwdVar, new uv2(o0, 2)), tsfVar)), Constants.KEY_VALUE, "getValue()Ljava/lang/Object;");
                oq5Var2.k0(K);
            } else {
                i5 = i3;
            }
            p9f p9fVar2 = (p9f) K;
            int i9 = i7 | ((i5 >> 9) & 112);
            boolean z6 = ((((i9 & 14) ^ 6) > 4 && oq5Var2.f(tsfVar)) || (i9 & 6) == 4) | ((((i9 & 112) ^ 48) > 32 && oq5Var2.g(false)) || (i9 & 48) == 32);
            Object K2 = oq5Var2.K();
            if (z6 || K2 == kjnVar) {
                K2 = new svf(tsfVar);
                oq5Var2.k0(K2);
            }
            svf svfVar = (svf) K2;
            Object K3 = oq5Var2.K();
            if (K3 == kjnVar) {
                K3 = gld.R(g.a, oq5Var2);
                oq5Var2.k0(K3);
            }
            mm6 mm6Var = (mm6) K3;
            uod uodVar = (uod) oq5Var2.j(es5.g);
            wfl wflVar = !((Boolean) oq5Var2.j(es5.v)).booleanValue() ? bhr.a : null;
            int i10 = (i5 & 524272) | ((i4 << 18) & 3670016) | ((i5 >> 6) & 29360128);
            boolean f2 = ((((458752 & i10) ^ 196608) > 131072 && oq5Var2.g(true)) || (i10 & 196608) == 131072) | ((((i10 & 112) ^ 48) > 32 && oq5Var2.f(tsfVar)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && oq5Var2.f(jqdVar)) || (i10 & 384) == 256) | ((((i10 & 7168) ^ 3072) > 2048 && oq5Var2.f(o0kVar)) || (i10 & 3072) == 2048) | ((((57344 & i10) ^ 24576) > 16384 && oq5Var2.g(false)) || (i10 & 24576) == 16384) | ((((i10 & 3670016) ^ ScreenMirroringConfig.Video.BITRATE_1_5MB) > 1048576 && oq5Var2.f(mx0Var)) || (i10 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 1048576) | ((((i10 & 29360128) ^ 12582912) > 8388608 && oq5Var2.f(ox0Var)) || (i10 & 12582912) == 8388608) | oq5Var2.f(uodVar);
            Object K4 = oq5Var2.K();
            if (f2 || K4 == kjnVar) {
                z2 = false;
                z3 = true;
                K4 = new hsf(tsfVar, o0kVar, p9fVar2, jqdVar, ox0Var, mx0Var, mm6Var, uodVar, wflVar);
                tsfVar3 = tsfVar;
                p9fVar = p9fVar2;
                oq5Var2.k0(K4);
            } else {
                tsfVar3 = tsfVar;
                p9fVar = p9fVar2;
                z2 = false;
                z3 = true;
            }
            Function2 function2 = (Function2) K4;
            bxj bxjVar = bxj.a;
            if (z) {
                oq5Var2.Z(-1614890700);
                boolean z7 = (((i7 ^ 6) <= 4 || !oq5Var2.f(tsfVar3)) && (i6 & 6) != 4) ? z2 : z3;
                Object K5 = oq5Var2.K();
                if (z7 || K5 == kjnVar) {
                    K5 = new xrf(tsfVar3);
                    oq5Var2.k0(K5);
                }
                z4 = false;
                yciVar2 = androidx.compose.foundation.lazy.layout.a.a((xrf) K5, tsfVar3.n, false, bxjVar);
                oq5Var2.p(z2);
            } else {
                z4 = false;
                oq5Var2.Z(-1614595456);
                oq5Var2.p(z2);
                yciVar2 = vci.a;
            }
            boolean z8 = z4;
            p9f p9fVar3 = p9fVar;
            yci f3 = androidx.compose.foundation.lazy.layout.a.b(yciVar.f(tsfVar3.k).f(tsfVar3.l), p9fVar, svfVar, bxjVar, z, z8).f(yciVar2).f(tsfVar3.m.k);
            tsf tsfVar4 = tsfVar3;
            tsfVar2 = tsfVar4;
            oq5Var = oq5Var2;
            n7w.t(p9fVar3, a.n(f3, tsfVar4, bxjVar, z, z8, jicVar, tsfVar4.f, false, qg0Var, null), tsfVar2.o, function2, oq5Var, 0, 0);
        } else {
            tsfVar2 = tsfVar;
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new esf(yciVar, tsfVar2, jqdVar, o0kVar, jicVar, z, qg0Var, ox0Var, mx0Var, function1, i, i2);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003d -> B:10:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object W(defpackage.hur r8, defpackage.kq2 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.ef6
            if (r0 == 0) goto L13
            r0 = r9
            ef6 r0 = (defpackage.ef6) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ef6 r0 = new ef6
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.k
            nm6 r1 = defpackage.nm6.a
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            hur r8 = r0.j
            defpackage.qgg.h0(r9)
            goto L40
        L29:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.xq0.q(r8)
            r8 = 0
            return r8
        L30:
            defpackage.qgg.h0(r9)
        L33:
            r0.j = r8
            r0.l = r3
            gfm r9 = defpackage.gfm.b
            java.lang.Object r9 = r8.a(r9, r0)
            if (r9 != r1) goto L40
            return r1
        L40:
            ffm r9 = (defpackage.ffm) r9
            int r2 = r9.c
            java.util.List r9 = r9.a
            r2 = r2 & 66
            if (r2 == 0) goto L33
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r4 = 0
            r5 = r4
        L53:
            if (r5 >= r2) goto L6c
            java.lang.Object r6 = r9.get(r5)
            lfm r6 = (defpackage.lfm) r6
            boolean r7 = r6.b()
            if (r7 != 0) goto L33
            boolean r7 = r6.h
            if (r7 != 0) goto L33
            boolean r6 = r6.d
            if (r6 == 0) goto L33
            int r5 = r5 + 1
            goto L53
        L6c:
            java.lang.Object r8 = r9.get(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkp.W(hur, kq2):java.lang.Object");
    }

    public static final thj X(avo avoVar) {
        avoVar.getClass();
        String str = avoVar.b;
        pkb pkbVar = avoVar.a;
        pkbVar.getClass();
        str.getClass();
        return new thj(pkbVar, str, 1, 1, "");
    }

    public static final dkn Y(mm6 mm6Var, pjc pjcVar) {
        pjcVar.getClass();
        mm6Var.getClass();
        Continuation continuation = null;
        pjc M = hyf.M(new yjc(pjcVar, new l1(continuation, mm6Var, 10), null, 1));
        int i = 3;
        ea0 ea0Var = new ea0(i, continuation);
        M.getClass();
        return zsd.D0(new alc(new clc(new qk3(new eno(new yjc(M, ea0Var, null, 0)), 1), new db(2, 2, continuation)), new kr3(i, 0, continuation)), mm6Var, lbq.b);
    }

    public static boolean Z(d7k d7kVar, FlacStreamMetadata flacStreamMetadata, int i, ci0 ci0Var) {
        long x = d7kVar.x();
        long j = x >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        int i2 = (int) ((x >> 12) & 15);
        int i3 = (int) ((x >> 8) & 15);
        int i4 = (int) ((x >> 4) & 15);
        int i5 = (int) ((x >> 1) & 7);
        boolean z2 = (x & 1) == 1;
        if (i4 <= 7) {
            if (i4 != flacStreamMetadata.channels - 1) {
                return false;
            }
        } else if (i4 > 10 || flacStreamMetadata.channels != 2) {
            return false;
        }
        if (!(i5 == 0 || i5 == flacStreamMetadata.bitsPerSampleLookupKey) || z2) {
            return false;
        }
        try {
            long C = d7kVar.C();
            if (!z) {
                C *= flacStreamMetadata.maxBlockSizeSamples;
            }
            ci0Var.a = C;
            int n0 = n0(i2, d7kVar);
            if (n0 == -1 || n0 > flacStreamMetadata.maxBlockSizeSamples) {
                return false;
            }
            int i6 = flacStreamMetadata.sampleRate;
            if (i3 != 0) {
                if (i3 <= 11) {
                    if (i3 != flacStreamMetadata.sampleRateLookupKey) {
                        return false;
                    }
                } else if (i3 != 12) {
                    if (i3 > 14) {
                        return false;
                    }
                    int B = d7kVar.B();
                    if (i3 == 14) {
                        B *= 10;
                    }
                    if (B != i6) {
                        return false;
                    }
                } else if (d7kVar.v() * 1000 != i6) {
                    return false;
                }
            }
            int v = d7kVar.v();
            int i7 = d7kVar.b;
            byte[] bArr = d7kVar.a;
            int i8 = i7 - 1;
            int i9 = 0;
            for (int i10 = d7kVar.b; i10 < i8; i10++) {
                i9 = dvt.n[i9 ^ (bArr[i10] & 255)];
            }
            int i11 = dvt.a;
            return v == i9;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static final y7o a0(q1f q1fVar, Function1 function1) {
        q1fVar.getClass();
        function1.getClass();
        try {
            return ngg.F(function1.invoke(q1fVar));
        } catch (RuntimeException e2) {
            if (e2 instanceof r7w) {
                return new y7o(null, new mac(hrg.s("Failed to deserialize JSONItem: \"", S(q1fVar), "\", error: \"", ((r7w) e2).getMessage(), "\""), (Throwable) null));
            }
            return new y7o(null, new mac("Failed to deserialize JSONItem: \"" + S(q1fVar) + "\", unkown error: \"" + e2 + "\"", (Throwable) null));
        }
    }

    public static final qwo d0(ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((qwo) arrayList.get(i2)).a == i) {
                return (qwo) arrayList.get(i2);
            }
        }
        return null;
    }

    public static final soi e0(tfp tfpVar) {
        qfp a2 = tfpVar.a();
        mpf mpfVar = a2.c;
        if (!mpfVar.H() || !mpfVar.G()) {
            soi soiVar = vpe.a;
            soiVar.getClass();
            return soiVar;
        }
        soi soiVar2 = new soi(48);
        ynn e2 = a2.e();
        f0(new Region(Math.round(e2.a), Math.round(e2.b), Math.round(e2.c), Math.round(e2.d)), a2, soiVar2, a2, new Region());
        return soiVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f0(Region region, qfp qfpVar, soi soiVar, qfp qfpVar2, Region region2) {
        ynn ynnVar;
        mpf mpfVar;
        sv7 u;
        int i = qfpVar.g;
        mpf mpfVar2 = qfpVar2.c;
        int i2 = qfpVar2.g;
        boolean z = (mpfVar2.H() && mpfVar2.G()) ? false : true;
        if (region.isEmpty() && i2 != i) {
            return;
        }
        if (z && !qfpVar2.e) {
            return;
        }
        sv7 sv7Var = qfpVar2.a;
        jfp jfpVar = qfpVar2.d;
        if (jfpVar.c && (u = bfg.u(mpfVar2)) != null) {
            sv7Var = u;
        }
        xci xciVar = ((xci) sv7Var).a;
        Object g2 = jfpVar.a.g(hfp.b);
        if (g2 == null) {
            g2 = null;
        }
        boolean z2 = g2 != null;
        if (xciVar.a.n) {
            if (z2) {
                f8j D = bcx.D(xciVar, 8);
                if (D.b1().n) {
                    wof D2 = ltg.D(D);
                    spi spiVar = D.y;
                    if (spiVar == null) {
                        spiVar = new spi();
                        D.y = spiVar;
                    }
                    long R0 = D.R0(D.a1());
                    int i3 = (int) (R0 >> 32);
                    spiVar.b = -Float.intBitsToFloat(i3);
                    int i4 = (int) (R0 & 4294967295L);
                    spiVar.c = -Float.intBitsToFloat(i4);
                    spiVar.d = Float.intBitsToFloat(i3) + D.a0();
                    spiVar.e = Float.intBitsToFloat(i4) + D.Z();
                    while (D != D2) {
                        D.s1(spiVar, false, true);
                        if (!spiVar.b()) {
                            D = D.n;
                            D.getClass();
                        }
                    }
                    ynnVar = new ynn(spiVar.b, spiVar.c, spiVar.d, spiVar.e);
                }
            } else {
                f8j D3 = bcx.D(xciVar, 8);
                ynnVar = ltg.D(D3).y(D3, true);
            }
            int round = Math.round(ynnVar.a);
            int round2 = Math.round(ynnVar.b);
            int round3 = Math.round(ynnVar.c);
            int round4 = Math.round(ynnVar.d);
            region2.set(round, round2, round3, round4);
            if (i2 == i) {
                i2 = -1;
            }
            if (region2.op(region, Region.Op.INTERSECT)) {
                if (qfpVar2.e) {
                    qfp j = qfpVar2.j();
                    ynn e2 = (j == null || (mpfVar = j.c) == null || !mpfVar.H()) ? g : j.e();
                    soiVar.h(i2, new sfp(qfpVar2, new Rect(Math.round(e2.a), Math.round(e2.b), Math.round(e2.c), Math.round(e2.d))));
                    return;
                } else {
                    if (i2 == -1) {
                        soiVar.h(i2, new sfp(qfpVar2, region2.getBounds()));
                        return;
                    }
                    return;
                }
            }
            soiVar.h(i2, new sfp(qfpVar2, region2.getBounds()));
            List h = qfp.h(4, qfpVar2);
            for (int size = h.size() - 1; -1 < size; size--) {
                if (!((qfp) h.get(size)).i().a.c(ufp.y)) {
                    f0(region, qfpVar, soiVar, (qfp) h.get(size), region2);
                }
            }
            if (l0(qfpVar2)) {
                region.op(round, round2, round3, round4, Region.Op.DIFFERENCE);
                return;
            }
            return;
        }
        ynnVar = ynn.e;
        int round5 = Math.round(ynnVar.a);
        int round22 = Math.round(ynnVar.b);
        int round32 = Math.round(ynnVar.c);
        int round42 = Math.round(ynnVar.d);
        region2.set(round5, round22, round32, round42);
        if (i2 == i) {
        }
        if (region2.op(region, Region.Op.INTERSECT)) {
        }
    }

    public static Set g0(String str, Map map) {
        rgr valueOf;
        List R = qwp.R(str, map);
        if (R == null) {
            return null;
        }
        EnumSet noneOf = EnumSet.noneOf(rgr.class);
        for (Object obj : R) {
            if (obj instanceof Double) {
                Double d2 = (Double) obj;
                int intValue = d2.intValue();
                szf.v0(obj, "Status code %s is not integral", ((double) intValue) == d2.doubleValue());
                valueOf = sgr.e(intValue).a;
                szf.v0(obj, "Status code %s is not valid", valueOf.a == d2.intValue());
            } else {
                if (!(obj instanceof String)) {
                    StringBuilder sb = new StringBuilder("Can not convert status code ");
                    sb.append(obj);
                    Class<?> cls = obj.getClass();
                    sb.append(" to Status.Code, because its type is ");
                    sb.append(cls);
                    throw new wp3(sb.toString());
                }
                try {
                    valueOf = rgr.valueOf((String) obj);
                } catch (IllegalArgumentException e2) {
                    throw new wp3(dfi.g("Status code ", " is not valid", obj), e2);
                }
            }
            noneOf.add(valueOf);
        }
        return Collections.unmodifiableSet(noneOf);
    }

    public static List h0(Map map) {
        String X;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            List R = qwp.R("loadBalancingConfig", map);
            if (R == null) {
                R = null;
            } else {
                qwp.F(R);
            }
            arrayList.addAll(R);
        }
        if (arrayList.isEmpty() && (X = qwp.X("loadBalancingPolicy", map)) != null) {
            arrayList.add(Collections.singletonMap(X.toLowerCase(Locale.ROOT), Collections.EMPTY_MAP));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static final cds i0(jfp jfpVar) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        Object g2 = jfpVar.a.g(hfp.a);
        if (g2 == null) {
            g2 = null;
        }
        sa saVar = (sa) g2;
        if (saVar == null || (function1 = (Function1) saVar.b) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (cds) arrayList.get(0);
    }

    public static Intent j0(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        Intent putExtra = new Intent(context, (Class<?>) ConcertActivity.class).putExtra("extra.concert.params", new vs5(str, str2, cud.a));
        putExtra.getClass();
        return putExtra;
    }

    public static final boolean k0(qfp qfpVar) {
        f8j c2 = qfpVar.c();
        tpi tpiVar = qfpVar.d.a;
        return (c2 != null ? c2.j1() : false) || tpiVar.c(ufp.o) || tpiVar.c(ufp.n);
    }

    public static final boolean l0(qfp qfpVar) {
        if (!k0(qfpVar)) {
            jfp jfpVar = qfpVar.d;
            if (jfpVar.c) {
                return true;
            }
            tpi tpiVar = jfpVar.a;
            Object[] objArr = tpiVar.b;
            Object[] objArr2 = tpiVar.c;
            long[] jArr = tpiVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                Object obj2 = objArr2[i4];
                                if (((xfp) obj).c) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    public static mn0 m0(int i, String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder(16);
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        sb.append(str);
        if (i > 0) {
            sb.append(" · ");
            sb.append(String.valueOf(i));
        }
        String sb2 = sb.toString();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(((jn0) arrayList.get(i2)).a(sb.length()));
        }
        return new mn0(sb2, arrayList2);
    }

    public static int n0(int i, d7k d7kVar) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return d7kVar.v() + 1;
            case 7:
                return d7kVar.B() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(2:3|(8:5|6|7|(1:(2:10|11)(2:18|19))(3:20|21|(1:23))|12|13|14|15))|7|(0)(0)|12|13|14|15|(2:(1:25)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        defpackage.ssg.a(4, r7, "animation was cancelled", null);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o0(mqi mqiVar, hqi hqiVar, Function0 function0, String str, Function1 function1, cg6 cg6Var) {
        xm0 xm0Var;
        int i;
        try {
            if (cg6Var instanceof xm0) {
                xm0Var = (xm0) cg6Var;
                int i2 = xm0Var.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    xm0Var.m = i2 - Integer.MIN_VALUE;
                    Object obj = xm0Var.l;
                    Object obj2 = nm6.a;
                    i = xm0Var.m;
                    if (i != 0) {
                        qgg.h0(obj);
                        xm0Var.j = function0;
                        xm0Var.k = str;
                        xm0Var.m = 1;
                        if (mqiVar.b(hqiVar, function1, xm0Var) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = xm0Var.k;
                        function0 = xm0Var.j;
                        qgg.h0(obj);
                    }
                    return Unit.a;
                }
            }
            if (i != 0) {
            }
            return Unit.a;
        } finally {
            function0.invoke();
        }
        xm0Var = new xm0(cg6Var);
        Object obj3 = xm0Var.l;
        Object obj22 = nm6.a;
        i = xm0Var.m;
    }

    public static lwi p0(List list, eeg eegVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zjp zjpVar = (zjp) it.next();
            String str = zjpVar.a;
            deg b2 = eegVar.b(str);
            if (b2 != null) {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(bkp.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                lwi c2 = b2.c(zjpVar.b);
                return c2.a != null ? c2 : new lwi(new akp(b2, c2.b));
            }
            arrayList.add(str);
        }
        return new lwi(sgr.g.i("None of " + arrayList + " specified by Service Config are available."));
    }

    public static final oj0 q0(uj0 uj0Var, int i) {
        Object obj;
        Iterator<T> it = uj0Var.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((mpf) ((Map.Entry) obj).getKey()).b == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (oj0) entry.getValue();
        }
        return null;
    }

    public static final String r0(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).toString();
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (Intrinsics.d(obj, Boolean.TRUE)) {
            return "yes";
        }
        if (Intrinsics.d(obj, Boolean.FALSE)) {
            return "no";
        }
        if (obj == null) {
            return "null";
        }
        return null;
    }

    public static final String s0(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static final diu t0(ReportingConfigDto reportingConfigDto, int i) {
        String url = reportingConfigDto.getUrl();
        if (url == null) {
            return null;
        }
        Integer timeMs = reportingConfigDto.getTimeMs();
        if (timeMs != null) {
            i = timeMs.intValue();
        }
        return new diu(url, i);
    }

    public static List u0(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            if (map.size() != 1) {
                throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
            }
            String str = (String) ((Map.Entry) map.entrySet().iterator().next()).getKey();
            arrayList.add(new zjp(str, qwp.V(str, map)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static final float v0(ln9 ln9Var, xzb xzbVar, DisplayMetrics displayMetrics) {
        szb szbVar;
        szb szbVar2;
        jk9 jk9Var = (ln9Var == null || (szbVar2 = ln9Var.c) == null) ? null : (jk9) szbVar2.a(xzbVar);
        int i = jk9Var == null ? -1 : up8.a[jk9Var.ordinal()];
        if (i == 1) {
            return bg3.y((Number) ln9Var.d.a(xzbVar), displayMetrics);
        }
        if (i == 2) {
            return bg3.a0((Number) ln9Var.d.a(xzbVar), displayMetrics);
        }
        if (i == 3) {
            return (float) ((Number) ln9Var.d.a(xzbVar)).doubleValue();
        }
        if (ln9Var == null || (szbVar = ln9Var.d) == null) {
            return 0.0f;
        }
        return (float) ((Number) szbVar.a(xzbVar)).doubleValue();
    }

    public static final Object w0(Function1 function1, cg6 cg6Var) {
        if (cg6Var.getContext().get(d51.g) == null) {
            return bzf.D(cg6Var.getContext()).P(function1, cg6Var);
        }
        l1j.f();
        return null;
    }

    @Override // defpackage.wq5
    public void A(int i, int i2, mhp mhpVar) {
        mhpVar.getClass();
        b0(mhpVar, i);
        C(i2);
    }

    @Override // defpackage.wq5
    public void B(asm asmVar, int i, char c2) {
        asmVar.getClass();
        b0(asmVar, i);
        z(c2);
    }

    @Override // defpackage.l6b
    public void C(int i) {
        c0(Integer.valueOf(i));
    }

    @Override // defpackage.l6b
    public void E(String str) {
        str.getClass();
        c0(str);
    }

    @Override // defpackage.wq5
    public void F(mhp mhpVar, int i, float f2) {
        mhpVar.getClass();
        b0(mhpVar, i);
        y(f2);
    }

    @Override // defpackage.wq5
    public void b(mhp mhpVar) {
        mhpVar.getClass();
    }

    public void b0(mhp mhpVar, int i) {
        mhpVar.getClass();
    }

    @Override // defpackage.l6b
    public wq5 c(mhp mhpVar) {
        mhpVar.getClass();
        return this;
    }

    public void c0(Object obj) {
        obj.getClass();
        throw new zhp("Non-serializable " + ern.a(obj.getClass()) + " is not supported by " + ern.a(getClass()) + " encoder");
    }

    @Override // defpackage.wq5
    public boolean e(mhp mhpVar) {
        mhpVar.getClass();
        return true;
    }

    @Override // defpackage.l6b
    public void f(double d2) {
        c0(Double.valueOf(d2));
    }

    @Override // defpackage.wq5
    public void g(mhp mhpVar, int i, long j) {
        mhpVar.getClass();
        b0(mhpVar, i);
        r(j);
    }

    @Override // defpackage.l6b
    public void h(byte b2) {
        c0(Byte.valueOf(b2));
    }

    @Override // defpackage.l6b
    public l6b i(mhp mhpVar) {
        mhpVar.getClass();
        return this;
    }

    @Override // defpackage.wq5
    public void j(mhp mhpVar, int i, boolean z) {
        mhpVar.getClass();
        b0(mhpVar, i);
        x(z);
    }

    @Override // defpackage.wq5
    public void k(mhp mhpVar, int i, t9f t9fVar, Object obj) {
        mhpVar.getClass();
        t9fVar.getClass();
        b0(mhpVar, i);
        v(t9fVar, obj);
    }

    @Override // defpackage.wq5
    public void l(mhp mhpVar, int i, double d2) {
        mhpVar.getClass();
        b0(mhpVar, i);
        f(d2);
    }

    @Override // defpackage.wq5
    public void m(asm asmVar, int i, byte b2) {
        asmVar.getClass();
        b0(asmVar, i);
        h(b2);
    }

    @Override // defpackage.l6b
    public void n(mhp mhpVar, int i) {
        mhpVar.getClass();
        c0(Integer.valueOf(i));
    }

    @Override // defpackage.wq5
    public void o(asm asmVar, int i, short s) {
        asmVar.getClass();
        b0(asmVar, i);
        w(s);
    }

    @Override // defpackage.wq5
    public void p(mhp mhpVar, int i, String str) {
        mhpVar.getClass();
        str.getClass();
        b0(mhpVar, i);
        E(str);
    }

    @Override // defpackage.wq5
    public void q(mhp mhpVar, int i, t9f t9fVar, Object obj) {
        mhpVar.getClass();
        t9fVar.getClass();
        b0(mhpVar, i);
        if (t9fVar.getDescriptor().c()) {
            v(t9fVar, obj);
        } else if (obj == null) {
            u();
        } else {
            v(t9fVar, obj);
        }
    }

    @Override // defpackage.l6b
    public void r(long j) {
        c0(Long.valueOf(j));
    }

    @Override // defpackage.wq5
    public l6b s(asm asmVar, int i) {
        asmVar.getClass();
        b0(asmVar, i);
        return i(asmVar.h(i));
    }

    @Override // defpackage.l6b
    public wq5 t(mhp mhpVar, int i) {
        mhpVar.getClass();
        return c(mhpVar);
    }

    @Override // defpackage.l6b
    public void u() {
        throw new zhp("'null' is not supported by default");
    }

    @Override // defpackage.l6b
    public void v(t9f t9fVar, Object obj) {
        t9fVar.getClass();
        t9fVar.serialize(this, obj);
    }

    @Override // defpackage.l6b
    public void w(short s) {
        c0(Short.valueOf(s));
    }

    @Override // defpackage.l6b
    public void x(boolean z) {
        c0(Boolean.valueOf(z));
    }

    @Override // defpackage.l6b
    public void y(float f2) {
        c0(Float.valueOf(f2));
    }

    @Override // defpackage.l6b
    public void z(char c2) {
        c0(Character.valueOf(c2));
    }
}
