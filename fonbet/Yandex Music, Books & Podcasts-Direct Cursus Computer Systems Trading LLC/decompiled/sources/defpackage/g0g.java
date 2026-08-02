package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.core.ui.compose.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public abstract class g0g {
    public static final void A(s2v s2vVar, sdr sdrVar, sdr sdrVar2, sdr sdrVar3, ab0 ab0Var, onu onuVar, hq5 hq5Var, int i) {
        int i2;
        sdrVar.getClass();
        sdrVar3.getClass();
        ab0Var.getClass();
        onuVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-370540139);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var.f(s2vVar) : oq5Var.h(s2vVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(sdrVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(sdrVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(sdrVar3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.h(ab0Var) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.d(onuVar.ordinal()) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i2) == 74898 && oq5Var.z()) {
            oq5Var.S();
        } else {
            vci vciVar = vci.a;
            yci c = d.c(vciVar, 1.0f);
            kfh d = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, c);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            U(oq5Var, d, wp5.f);
            U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            U(oq5Var, H, wp5.d);
            c4v c4vVar = (c4v) sdrVar.getValue();
            if (c4vVar instanceof z3v) {
                oq5Var.Z(-1023077377);
                cb0.s(ild.C(-442222142, new u0v(1, s2vVar, onuVar), oq5Var), vnj.e, d.c(vciVar, 1.0f), oq5Var, 438);
                oq5Var.p(false);
            } else if (Intrinsics.d(c4vVar, a4v.a)) {
                oq5Var.Z(-1022404088);
                szf.x(d.c(vciVar, 1.0f), onuVar, vnj.f, oq5Var, ((i2 >> 12) & 112) | 390, 0);
                oq5Var.p(false);
            } else {
                if (!(c4vVar instanceof b4v)) {
                    throw vz1.i(oq5Var, -1002836096, false);
                }
                oq5Var.Z(-1022117059);
                B(sdrVar2, (b4v) c4vVar, sdrVar3, s2vVar, ab0Var, onuVar, oq5Var, ((i2 >> 6) & 14) | ((i2 >> 3) & 896) | ((i2 << 9) & 7168) | (57344 & i2) | (i2 & 458752));
                oq5Var = oq5Var;
                oq5Var.p(false);
            }
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu0(s2vVar, sdrVar, sdrVar2, sdrVar3, ab0Var, onuVar, i, 19);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x02a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void B(sdr sdrVar, b4v b4vVar, sdr sdrVar2, s2v s2vVar, ab0 ab0Var, onu onuVar, hq5 hq5Var, int i) {
        int i2;
        Float f;
        boolean z;
        act actVar;
        act actVar2;
        boolean z2;
        int i3;
        boolean z3;
        Object K;
        boolean z4;
        Object K2;
        boolean z5;
        Object K3;
        z7t z7tVar;
        int i4;
        Function1 function1;
        boolean z6;
        Object K4;
        Function1 function12;
        Function0 function0;
        boolean z7;
        Object K5;
        Function0 function02;
        Function0 function03;
        boolean z8;
        Object K6;
        Function0 function04;
        Object K7;
        List list;
        oq5 oq5Var;
        l3v l3vVar;
        int i5;
        int i6;
        kjn kjnVar;
        int i7;
        boolean z9;
        boolean f2;
        Object K8;
        kjn kjnVar2;
        Function0 function05;
        boolean z10;
        Object K9;
        z7t z7tVar2;
        l3v l3vVar2;
        Function0 function06;
        int i8;
        s2v s2vVar2;
        int i9;
        Object K10;
        int i10;
        boolean z11;
        Object K11;
        boolean z12;
        Object K12;
        boolean z13;
        Object K13;
        List list2;
        boolean h;
        Object K14;
        boolean z14;
        boolean f3;
        Object K15;
        oq5 oq5Var2;
        onu onuVar2;
        l3v l3vVar3 = b4vVar.a;
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(640724552);
        if ((i & 6) == 0) {
            i2 = (oq5Var3.f(sdrVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var3.h(b4vVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var3.f(sdrVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? oq5Var3.f(s2vVar) : oq5Var3.h(s2vVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var3.h(ab0Var) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var3.d(onuVar.ordinal()) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i2) == 74898 && oq5Var3.z()) {
            oq5Var3.S();
            onuVar2 = onuVar;
            oq5Var2 = oq5Var3;
        } else {
            aqi O = gld.O(s2vVar.i, oq5Var3);
            Object K16 = oq5Var3.K();
            kjn kjnVar3 = gq5.a;
            if (K16 == kjnVar3) {
                K16 = szf.U(new f6u(O, 18));
                oq5Var3.k0(K16);
            }
            sdr sdrVar3 = (sdr) K16;
            boolean booleanValue = ((Boolean) sdrVar3.getValue()).booleanValue();
            aqi K17 = ksw.K(oq5Var3);
            Object K18 = oq5Var3.K();
            if (K18 == kjnVar3) {
                K18 = szf.U(new stu(sdrVar, K17, 2));
                oq5Var3.k0(K18);
            }
            sdr sdrVar4 = (sdr) K18;
            d8t e = i8t.e(Boolean.valueOf((((Boolean) sdrVar.getValue()).booleanValue() || ((Boolean) K17.getValue()).booleanValue() || (!booleanValue && q5g.D(onuVar))) ? false : true), "WavePauseTransition", oq5Var3, 48, 0);
            x6k x6kVar = e.d;
            oct octVar = azt.a;
            boolean booleanValue2 = ((Boolean) e.c()).booleanValue();
            oq5Var3.Z(-1753584239);
            float f4 = booleanValue2 ? 1.0f : 0.0f;
            oq5Var3.p(false);
            Float valueOf = Float.valueOf(f4);
            boolean booleanValue3 = ((Boolean) x6kVar.getValue()).booleanValue();
            oq5Var3.Z(-1753584239);
            float f5 = booleanValue3 ? 1.0f : 0.0f;
            oq5Var3.p(false);
            Float valueOf2 = Float.valueOf(f5);
            x7t f6 = e.f();
            f6.getClass();
            oq5Var3.Z(-1216923370);
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            if (f6.c(bool, bool2)) {
                f = valueOf2;
                z = false;
                actVar = new act(150, 0, lya.a);
            } else {
                f = valueOf2;
                z = false;
                actVar = new act(150, 150, lya.a);
            }
            oq5Var3.p(z);
            z7t c = i8t.c(e, valueOf, f, actVar, octVar, oq5Var3, 196608);
            boolean booleanValue4 = ((Boolean) e.c()).booleanValue();
            oq5Var3.Z(1245498954);
            float f7 = booleanValue4 ? 1.0f : 0.0f;
            oq5Var3.p(z);
            Float valueOf3 = Float.valueOf(f7);
            boolean booleanValue5 = ((Boolean) x6kVar.getValue()).booleanValue();
            oq5Var3.Z(1245498954);
            float f8 = booleanValue5 ? 1.0f : 0.0f;
            oq5Var3.p(z);
            Float valueOf4 = Float.valueOf(f8);
            x7t f9 = e.f();
            f9.getClass();
            oq5Var3.Z(823534501);
            if (f9.c(bool, bool2)) {
                actVar2 = new act(150, 150, lya.a);
                z2 = false;
            } else {
                z2 = false;
                actVar2 = new act(150, 0, lya.a);
            }
            act actVar3 = actVar2;
            oq5Var3.p(z2);
            z7t c2 = i8t.c(e, valueOf3, valueOf4, actVar3, octVar, oq5Var3, 196608);
            Object K19 = oq5Var3.K();
            if (K19 == kjnVar3) {
                K19 = szf.U(new f6u(c2, 19));
                oq5Var3.k0(K19);
            }
            sdr sdrVar5 = (sdr) K19;
            int i11 = i2 & 7168;
            boolean z15 = (i11 == 2048 || ((i2 & 4096) != 0 && oq5Var3.f(s2vVar))) ? true : z2;
            Object K20 = oq5Var3.K();
            if (z15 || K20 == kjnVar3) {
                K20 = new qtu(s2vVar, 4);
                oq5Var3.k0(K20);
            }
            Function1 function13 = (Function1) K20;
            int i12 = i2 >> 6;
            int i13 = ((i2 >> 3) & 14) | (i12 & 112);
            String M = rvf.M(R.string.player_skip_description, oq5Var3);
            String M2 = rvf.M(R.string.player_previous_description, oq5Var3);
            int i14 = (i13 & 112) ^ 48;
            if (i14 <= 32 || !oq5Var3.h(s2vVar)) {
                i3 = i13;
                if ((i3 & 48) != 32) {
                    z3 = false;
                    K = oq5Var3.K();
                    if (!z3 || K == kjnVar3) {
                        K = new ttu(s2vVar, 2);
                        oq5Var3.k0(K);
                    }
                    nw6 nw6Var = new nw6(M, (Function0) K);
                    if (l3vVar3.c == null) {
                        nw6Var = null;
                    }
                    z4 = (i14 <= 32 && oq5Var3.h(s2vVar)) || (i3 & 48) == 32;
                    K2 = oq5Var3.K();
                    if (!z4 || K2 == kjnVar3) {
                        K2 = new ttu(s2vVar, 3);
                        oq5Var3.k0(K2);
                    }
                    List w = xz0.w(new nw6[]{nw6Var, l3vVar3.a != null ? new nw6(M2, (Function0) K2) : null});
                    l2v l2vVar = l3vVar3.b;
                    z5 = i11 != 2048 || ((i2 & 4096) != 0 && oq5Var3.h(s2vVar));
                    K3 = oq5Var3.K();
                    if (!z5 || K3 == kjnVar3) {
                        z7tVar = c;
                        i4 = i12;
                        lgq lgqVar = new lgq(1, s2vVar, s2v.class, "onLikeClick", "onLikeClick(Z)V", 0, 27);
                        oq5Var3.k0(lgqVar);
                        K3 = lgqVar;
                    } else {
                        z7tVar = c;
                        i4 = i12;
                    }
                    function1 = (Function1) ((h9f) K3);
                    z6 = i11 != 2048 || ((i2 & 4096) != 0 && oq5Var3.h(s2vVar));
                    K4 = oq5Var3.K();
                    if (!z6 || K4 == kjnVar3) {
                        function12 = function1;
                        vtu vtuVar = new vtu(0, s2vVar, s2v.class, "onPlayClick", "onPlayClick()V", 0, 6);
                        oq5Var3.k0(vtuVar);
                        K4 = vtuVar;
                    } else {
                        function12 = function1;
                    }
                    function0 = (Function0) ((h9f) K4);
                    z7 = i11 != 2048 || ((i2 & 4096) != 0 && oq5Var3.h(s2vVar));
                    K5 = oq5Var3.K();
                    if (!z7 || K5 == kjnVar3) {
                        function02 = function0;
                        vtu vtuVar2 = new vtu(0, s2vVar, s2v.class, "openExpandedPlayer", "openExpandedPlayer()V", 0, 7);
                        oq5Var3.k0(vtuVar2);
                        K5 = vtuVar2;
                    } else {
                        function02 = function0;
                    }
                    function03 = (Function0) ((h9f) K5);
                    z8 = i11 != 2048 || ((i2 & 4096) != 0 && oq5Var3.h(s2vVar));
                    K6 = oq5Var3.K();
                    if (!z8 || K6 == kjnVar3) {
                        function04 = function03;
                        lgq lgqVar2 = new lgq(1, s2vVar, s2v.class, "onSeek", "onSeek(F)V", 0, 28);
                        oq5Var3.k0(lgqVar2);
                        K6 = lgqVar2;
                    } else {
                        function04 = function03;
                    }
                    Function1 function14 = (Function1) ((h9f) K6);
                    float f10 = r2v.a;
                    sdrVar2.getClass();
                    function12.getClass();
                    function02.getClass();
                    function04.getClass();
                    function14.getClass();
                    aqi o0 = szf.o0(l2vVar, oq5Var3);
                    aqi o02 = szf.o0(function12, oq5Var3);
                    aqi o03 = szf.o0(function02, oq5Var3);
                    aqi o04 = szf.o0(function04, oq5Var3);
                    aqi o05 = szf.o0(function14, oq5Var3);
                    K7 = oq5Var3.K();
                    if (K7 != kjnVar3) {
                        kjnVar = kjnVar3;
                        list = w;
                        i7 = i4;
                        oq5Var = oq5Var3;
                        l3vVar = l3vVar3;
                        i6 = i2;
                        z9 = true;
                        wn5 wn5Var = new wn5(new g0d(sdrVar2, sdrVar, sdrVar3, o0, o02, o03, o04, o05), 2033408746, true);
                        oq5Var.k0(wn5Var);
                        K7 = wn5Var;
                        i5 = i11;
                    } else {
                        list = w;
                        oq5Var = oq5Var3;
                        l3vVar = l3vVar3;
                        i5 = i11;
                        i6 = i2;
                        kjnVar = kjnVar3;
                        i7 = i4;
                        z9 = true;
                    }
                    z7t z7tVar3 = z7tVar;
                    pyc pycVar = (pyc) K7;
                    f2 = oq5Var.f(c2);
                    K8 = oq5Var.K();
                    kjnVar2 = kjnVar;
                    if (!f2 || K8 == kjnVar2) {
                        K8 = new f6u(c2, 20);
                        oq5Var.k0(K8);
                    }
                    function05 = (Function0) K8;
                    z10 = (i5 != 2048 || ((i6 & 4096) != 0 && oq5Var.h(s2vVar))) ? z9 : false;
                    K9 = oq5Var.K();
                    if (!z10 || K9 == kjnVar2) {
                        z7tVar2 = c2;
                        l3vVar2 = l3vVar;
                        function06 = function05;
                        i8 = 2048;
                        s2vVar2 = s2vVar;
                        i9 = i5;
                        vtu vtuVar3 = new vtu(0, s2vVar2, s2v.class, "onPlayClick", "onPlayClick()V", 0, 5);
                        oq5Var.k0(vtuVar3);
                        K9 = vtuVar3;
                    } else {
                        z7tVar2 = c2;
                        function06 = function05;
                        l3vVar2 = l3vVar;
                        i8 = 2048;
                        s2vVar2 = s2vVar;
                        i9 = i5;
                    }
                    aqi o06 = szf.o0(function06, oq5Var);
                    aqi o07 = szf.o0((Function0) ((h9f) K9), oq5Var);
                    K10 = oq5Var.K();
                    if (K10 == kjnVar2) {
                        wn5 wn5Var2 = new wn5(new u0v(2, o06, o07), -1623396297, true);
                        oq5Var.k0(wn5Var2);
                        K10 = wn5Var2;
                    }
                    Function2 function2 = (Function2) K10;
                    yci c3 = d.c(vci.a, 1.0f);
                    kfh d = ug3.d(b2c.b, false);
                    i10 = oq5Var.P;
                    a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, c3);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.n0();
                    } else {
                        oq5Var.k(grbVar);
                    }
                    U(oq5Var, d, wp5.f);
                    U(oq5Var, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i10))) {
                        ouj.x(i10, oq5Var, i10, kb5Var);
                    }
                    U(oq5Var, H, wp5.d);
                    z11 = i9 != i8 || ((i6 & 4096) != 0 && oq5Var.h(s2vVar2));
                    K11 = oq5Var.K();
                    if (!z11 || K11 == kjnVar2) {
                        K11 = new vtu(0, s2vVar2, s2v.class, "openExpandedPlayer", "openExpandedPlayer()V", 0, 2);
                        oq5Var.k0(K11);
                    }
                    h9f h9fVar = (h9f) K11;
                    z12 = i9 != i8 || ((i6 & 4096) != 0 && oq5Var.h(s2vVar2));
                    K12 = oq5Var.K();
                    if (!z12 || K12 == kjnVar2) {
                        K12 = new vtu(0, s2vVar2, s2v.class, "onPlayClick", "onPlayClick()V", 0, 3);
                        oq5Var.k0(K12);
                    }
                    h9f h9fVar2 = (h9f) K12;
                    z13 = i9 != i8 || ((i6 & 4096) != 0 && oq5Var.h(s2vVar2));
                    K13 = oq5Var.K();
                    if (!z13 || K13 == kjnVar2) {
                        K13 = new vtu(0, s2vVar2, s2v.class, "onWaveScreenPrimaryEntityClick", "onWaveScreenPrimaryEntityClick()V", 0, 4);
                        oq5Var.k0(K13);
                    }
                    boolean z16 = !booleanValue;
                    Function0 function07 = (Function0) h9fVar;
                    Function0 function08 = (Function0) ((h9f) K13);
                    Function0 function09 = (Function0) h9fVar2;
                    list2 = list;
                    h = oq5Var.h(b4vVar) | oq5Var.h(list2);
                    K14 = oq5Var.K();
                    if (!h || K14 == kjnVar2) {
                        z14 = true;
                        K14 = new rtu(b4vVar, list2, 1 == true ? 1 : 0);
                        oq5Var.k0(K14);
                    } else {
                        z14 = true;
                    }
                    Function1 function15 = (Function1) K14;
                    f3 = oq5Var.f(z7tVar3);
                    K15 = oq5Var.K();
                    if (!f3 || K15 == kjnVar2) {
                        K15 = new f6u(z7tVar3, 21);
                        oq5Var.k0(K15);
                    }
                    z7t z7tVar4 = z7tVar2;
                    int i15 = i6;
                    oq5 oq5Var4 = oq5Var;
                    szf.w(l3vVar2, sdrVar4, ab0Var, function07, function08, function09, function13, null, function15, onuVar, null, (Function0) K15, z16, pycVar, function2, oq5Var4, (i7 & 896) | 48 | ((i6 << 12) & 1879048192), 0, 1152);
                    oq5Var2 = oq5Var4;
                    if (((Boolean) sdrVar5.getValue()).booleanValue()) {
                        onuVar2 = onuVar;
                        oq5Var2.Z(1252342048);
                    } else {
                        oq5Var2.Z(1261053265);
                        boolean f11 = oq5Var2.f(z7tVar4);
                        Object K21 = oq5Var2.K();
                        if (f11 || K21 == kjnVar2) {
                            K21 = new f6u(z7tVar4, 17);
                            oq5Var2.k0(K21);
                        }
                        int i16 = (i15 >> 15) & 14;
                        onuVar2 = onuVar;
                        z(onuVar2, (Function0) K21, list2, oq5Var2, i16);
                    }
                    oq5Var2.p(false);
                    oq5Var2.p(z14);
                }
            } else {
                i3 = i13;
            }
            z3 = true;
            K = oq5Var3.K();
            if (!z3) {
            }
            K = new ttu(s2vVar, 2);
            oq5Var3.k0(K);
            nw6 nw6Var2 = new nw6(M, (Function0) K);
            if (l3vVar3.c == null) {
            }
            if (i14 <= 32) {
            }
            K2 = oq5Var3.K();
            if (!z4) {
            }
            K2 = new ttu(s2vVar, 3);
            oq5Var3.k0(K2);
            List w2 = xz0.w(new nw6[]{nw6Var2, l3vVar3.a != null ? new nw6(M2, (Function0) K2) : null});
            l2v l2vVar2 = l3vVar3.b;
            if (i11 != 2048) {
            }
            K3 = oq5Var3.K();
            if (z5) {
            }
            z7tVar = c;
            i4 = i12;
            lgq lgqVar3 = new lgq(1, s2vVar, s2v.class, "onLikeClick", "onLikeClick(Z)V", 0, 27);
            oq5Var3.k0(lgqVar3);
            K3 = lgqVar3;
            function1 = (Function1) ((h9f) K3);
            if (i11 != 2048) {
            }
            K4 = oq5Var3.K();
            if (z6) {
            }
            function12 = function1;
            vtu vtuVar4 = new vtu(0, s2vVar, s2v.class, "onPlayClick", "onPlayClick()V", 0, 6);
            oq5Var3.k0(vtuVar4);
            K4 = vtuVar4;
            function0 = (Function0) ((h9f) K4);
            if (i11 != 2048) {
            }
            K5 = oq5Var3.K();
            if (z7) {
            }
            function02 = function0;
            vtu vtuVar22 = new vtu(0, s2vVar, s2v.class, "openExpandedPlayer", "openExpandedPlayer()V", 0, 7);
            oq5Var3.k0(vtuVar22);
            K5 = vtuVar22;
            function03 = (Function0) ((h9f) K5);
            if (i11 != 2048) {
            }
            K6 = oq5Var3.K();
            if (z8) {
            }
            function04 = function03;
            lgq lgqVar22 = new lgq(1, s2vVar, s2v.class, "onSeek", "onSeek(F)V", 0, 28);
            oq5Var3.k0(lgqVar22);
            K6 = lgqVar22;
            Function1 function142 = (Function1) ((h9f) K6);
            float f102 = r2v.a;
            sdrVar2.getClass();
            function12.getClass();
            function02.getClass();
            function04.getClass();
            function142.getClass();
            aqi o08 = szf.o0(l2vVar2, oq5Var3);
            aqi o022 = szf.o0(function12, oq5Var3);
            aqi o032 = szf.o0(function02, oq5Var3);
            aqi o042 = szf.o0(function04, oq5Var3);
            aqi o052 = szf.o0(function142, oq5Var3);
            K7 = oq5Var3.K();
            if (K7 != kjnVar3) {
            }
            z7t z7tVar32 = z7tVar;
            pyc pycVar2 = (pyc) K7;
            f2 = oq5Var.f(c2);
            K8 = oq5Var.K();
            kjnVar2 = kjnVar;
            if (!f2) {
            }
            K8 = new f6u(c2, 20);
            oq5Var.k0(K8);
            function05 = (Function0) K8;
            if (i5 != 2048) {
            }
            K9 = oq5Var.K();
            if (z10) {
            }
            z7tVar2 = c2;
            l3vVar2 = l3vVar;
            function06 = function05;
            i8 = 2048;
            s2vVar2 = s2vVar;
            i9 = i5;
            vtu vtuVar32 = new vtu(0, s2vVar2, s2v.class, "onPlayClick", "onPlayClick()V", 0, 5);
            oq5Var.k0(vtuVar32);
            K9 = vtuVar32;
            aqi o062 = szf.o0(function06, oq5Var);
            aqi o072 = szf.o0((Function0) ((h9f) K9), oq5Var);
            K10 = oq5Var.K();
            if (K10 == kjnVar2) {
            }
            Function2 function22 = (Function2) K10;
            yci c32 = d.c(vci.a, 1.0f);
            kfh d2 = ug3.d(b2c.b, false);
            i10 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, c32);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
            }
            U(oq5Var, d2, wp5.f);
            U(oq5Var, l2, wp5.e);
            kb5 kb5Var2 = wp5.g;
            if (!oq5Var.O) {
            }
            ouj.x(i10, oq5Var, i10, kb5Var2);
            U(oq5Var, H2, wp5.d);
            if (i9 != i8) {
            }
            K11 = oq5Var.K();
            if (!z11) {
            }
            K11 = new vtu(0, s2vVar2, s2v.class, "openExpandedPlayer", "openExpandedPlayer()V", 0, 2);
            oq5Var.k0(K11);
            h9f h9fVar3 = (h9f) K11;
            if (i9 != i8) {
            }
            K12 = oq5Var.K();
            if (!z12) {
            }
            K12 = new vtu(0, s2vVar2, s2v.class, "onPlayClick", "onPlayClick()V", 0, 3);
            oq5Var.k0(K12);
            h9f h9fVar22 = (h9f) K12;
            if (i9 != i8) {
            }
            K13 = oq5Var.K();
            if (!z13) {
            }
            K13 = new vtu(0, s2vVar2, s2v.class, "onWaveScreenPrimaryEntityClick", "onWaveScreenPrimaryEntityClick()V", 0, 4);
            oq5Var.k0(K13);
            boolean z162 = !booleanValue;
            Function0 function072 = (Function0) h9fVar3;
            Function0 function082 = (Function0) ((h9f) K13);
            Function0 function092 = (Function0) h9fVar22;
            list2 = list;
            h = oq5Var.h(b4vVar) | oq5Var.h(list2);
            K14 = oq5Var.K();
            if (h) {
            }
            z14 = true;
            K14 = new rtu(b4vVar, list2, 1 == true ? 1 : 0);
            oq5Var.k0(K14);
            Function1 function152 = (Function1) K14;
            f3 = oq5Var.f(z7tVar32);
            K15 = oq5Var.K();
            if (!f3) {
            }
            K15 = new f6u(z7tVar32, 21);
            oq5Var.k0(K15);
            z7t z7tVar42 = z7tVar2;
            int i152 = i6;
            oq5 oq5Var42 = oq5Var;
            szf.w(l3vVar2, sdrVar4, ab0Var, function072, function082, function092, function13, null, function152, onuVar, null, (Function0) K15, z162, pycVar2, function22, oq5Var42, (i7 & 896) | 48 | ((i6 << 12) & 1879048192), 0, 1152);
            oq5Var2 = oq5Var42;
            if (((Boolean) sdrVar5.getValue()).booleanValue()) {
            }
            oq5Var2.p(false);
            oq5Var2.p(z14);
        }
        xmn r = oq5Var2.r();
        if (r != null) {
            r.d = new uu0(sdrVar, b4vVar, sdrVar2, s2vVar, ab0Var, onuVar2, i, 20);
        }
    }

    public static final lwg C(oq oqVar, List list) {
        oqVar.getClass();
        return new lwg(new mwg(oqVar.b, etn.w(oqVar), vz1.w(oqVar.o), oqVar.D.b, oqVar.i(), oqVar.g.b()), new hwg(lxe.B(oqVar), list, oqVar.B));
    }

    public static final lwg D(lt ltVar, List list, boolean z) {
        ltVar.getClass();
        String str = ltVar.c;
        String X = list != null ? CollectionsKt.X(list, ", ", null, null, new brg(8), 30) : null;
        u9b u9bVar = ltVar.e;
        String e = u9bVar != null ? u9bVar.e(wct.s(), WebPath$Storage.AVATARS) : null;
        if (e == null) {
            e = "";
        }
        return new lwg(new mwg(str, X, e, qo6.b, ltVar.g, ltVar.d.b()), new hwg(ltVar, list, z));
    }

    public static final lwg E(c01 c01Var) {
        c01Var.getClass();
        String str = c01Var.b;
        String pathForSize = c01Var.k.getPathForSize(wct.s());
        if (pathForSize == null) {
            pathForSize = "";
        }
        return new lwg(new mwg(str, null, pathForSize, c01Var.q.b, (jzb) c01Var.u.getValue(), false), new iwg(ghh.P(c01Var), c01Var.p));
    }

    public static final lwg F(u51 u51Var, boolean z) {
        u51Var.getClass();
        String str = u51Var.b;
        u9b u9bVar = u51Var.c;
        String e = u9bVar != null ? u9bVar.e(wct.s(), WebPath$Storage.AVATARS) : null;
        if (e == null) {
            e = "";
        }
        return new lwg(new mwg(str, null, e, qo6.d, u51Var.f, false), new iwg(u51Var, z));
    }

    public static final lwg G(cvl cvlVar) {
        cvlVar.getClass();
        return new lwg(new mwg(cvlVar.b, cvlVar.q, vz1.w(op7.c(cvlVar).a), op7.c(cvlVar).b, null, false), new jwg(bfg.J(cvlVar), cvlVar.x));
    }

    public static final lwg H(eul eulVar, boolean z) {
        eulVar.getClass();
        return new lwg(new mwg(eulVar.c, null, vz1.w(op7.b(eulVar).a), qo6.e, null, false), new jwg(eulVar, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static x1g I(lt ltVar, boolean z) {
        boolean z2;
        String e;
        if (z) {
            l18 l18Var = l18.b;
            bdt I = hag.I(k8w.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            if (!v3g.E(((m8w) ((k8w) qdcVar.C(I))).a).i.contains("bookmate")) {
                z2 = true;
                String str = ltVar.c;
                u9b u9bVar = ltVar.e;
                e = u9bVar == null ? u9bVar.e(wct.s(), WebPath$Storage.AVATARS) : null;
                if (e == null) {
                    e = "";
                }
                return new x1g(new v1g(str, e, ltVar.g, qo6.g), z2);
            }
        }
        z2 = false;
        String str2 = ltVar.c;
        u9b u9bVar2 = ltVar.e;
        if (u9bVar2 == null) {
        }
        if (e == null) {
        }
        return new x1g(new v1g(str2, e, ltVar.g, qo6.g), z2);
    }

    public static ckq J() {
        return new ckq("дочь разбойника", null, null, new nn6("https://avatars.yandex.net/get-music-content/34131/41fec1cf.a.301333-1/300x300", "https://avatars.mds.yandex.net/get-music-misc/28592/img.68eebe12749d24738fe2018e/300x300", "https://avatars.mds.yandex.net/get-music-misc/28592/img.68eebdb294053d016bcd7bf0/300x300"), null, dtq.b);
    }

    public static String K(String str, XmlPullParser xmlPullParser) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static final mn0 L(ybs ybsVar) {
        mn0 mn0Var = ybsVar.a;
        long j = ybsVar.b;
        mn0Var.getClass();
        return mn0Var.subSequence(rds.e(j), rds.d(j));
    }

    public static final mn0 M(ybs ybsVar, int i) {
        mn0 mn0Var = ybsVar.a;
        long j = ybsVar.b;
        return mn0Var.subSequence(rds.d(j), Math.min(rds.d(j) + i, ybsVar.a.b.length()));
    }

    public static final mn0 N(ybs ybsVar, int i) {
        mn0 mn0Var = ybsVar.a;
        long j = ybsVar.b;
        return mn0Var.subSequence(Math.max(0, rds.e(j) - i), rds.e(j));
    }

    public static final y9u O(mwk mwkVar) {
        mwkVar.getClass();
        return !mwkVar.equals(h1b.e) ? (y9u) wyf.q(mwkVar, gos.g) : v9u.a;
    }

    public static final String P(rnv rnvVar) {
        if (rnvVar.equals(mnv.a)) {
            return "3";
        }
        if (rnvVar instanceof nnv) {
            aab aabVar = ((nnv) rnvVar).a;
            if (aabVar instanceof eul) {
                return ((eul) aabVar).f;
            }
            if (aabVar instanceof lt) {
                return ((lt) aabVar).a;
            }
            if (aabVar instanceof u51) {
                return ((u51) aabVar).a;
            }
            b6e.s();
            return null;
        }
        if (!(rnvVar instanceof pnv)) {
            if (rnvVar instanceof qnv) {
                return StationId.e(o8g.E(((qnv) rnvVar).a)).h();
            }
            b6e.s();
            return null;
        }
        aab aabVar2 = ((pnv) rnvVar).a;
        if (aabVar2 instanceof eul) {
            return ((eul) aabVar2).f;
        }
        if (aabVar2 instanceof lt) {
            return ((lt) aabVar2).a;
        }
        if (aabVar2 instanceof u51) {
            return ((u51) aabVar2).a;
        }
        b6e.s();
        return null;
    }

    public static boolean Q(String str, XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean R(String str, XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static s0u S(String str) {
        String group;
        if (str == null || StringsKt.U(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
        if (!matcher.matches() || (group = matcher.group(1)) == null) {
            return null;
        }
        int parseInt = Integer.parseInt(group);
        String group2 = matcher.group(2);
        if (group2 == null) {
            return null;
        }
        int parseInt2 = Integer.parseInt(group2);
        String group3 = matcher.group(3);
        if (group3 == null) {
            return null;
        }
        int parseInt3 = Integer.parseInt(group3);
        String group4 = matcher.group(4) != null ? matcher.group(4) : "";
        group4.getClass();
        return new s0u(group4, parseInt, parseInt2, parseInt3);
    }

    public static int T(v94 v94Var, int i, int i2, int i3) {
        vq1.v(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        pd.y(pd.y(i4, i5), 1 << i3);
        if (v94Var.b() < i) {
            return -1;
        }
        int i6 = v94Var.i(i);
        if (i6 == i4) {
            if (v94Var.b() < i2) {
                return -1;
            }
            int i7 = v94Var.i(i2);
            i6 += i7;
            if (i7 == i5) {
                if (v94Var.b() < i3) {
                    return -1;
                }
                return v94Var.i(i3) + i6;
            }
        }
        return i6;
    }

    public static final void U(hq5 hq5Var, Object obj, Function2 function2) {
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.O || !Intrinsics.d(oq5Var.K(), obj)) {
            oq5Var.k0(obj);
            oq5Var.b(obj, function2);
        }
    }

    public static void V(v94 v94Var) {
        v94Var.t(3);
        v94Var.t(8);
        boolean h = v94Var.h();
        boolean h2 = v94Var.h();
        if (h) {
            v94Var.t(5);
        }
        if (h2) {
            v94Var.t(6);
        }
    }

    public static void W(v94 v94Var) {
        int i;
        int i2 = v94Var.i(2);
        if (i2 == 0) {
            v94Var.t(6);
            return;
        }
        int T = T(v94Var, 5, 8, 16) + 1;
        if (i2 == 1) {
            v94Var.t(T * 7);
            return;
        }
        if (i2 == 2) {
            boolean h = v94Var.h();
            int i3 = h ? 1 : 5;
            int i4 = h ? 7 : 5;
            int i5 = h ? 8 : 6;
            int i6 = 0;
            while (i6 < T) {
                if (v94Var.h()) {
                    v94Var.t(7);
                    i = 0;
                } else {
                    if (v94Var.i(2) == 3 && v94Var.i(i4) * i3 != 0) {
                        v94Var.s();
                    }
                    i = v94Var.i(i5) * i3;
                    if (i != 0 && i != 180) {
                        v94Var.s();
                    }
                    v94Var.s();
                }
                if (i != 0 && i != 180 && v94Var.h()) {
                    i6++;
                }
                i6++;
            }
        }
    }

    public static final pkb X(rnv rnvVar) {
        rnvVar.getClass();
        if (Intrinsics.d(rnvVar, mnv.a)) {
            return pkb.Playlist;
        }
        if (rnvVar instanceof nnv) {
            aab aabVar = ((nnv) rnvVar).a;
            if (aabVar instanceof eul) {
                return pkb.Playlist;
            }
            if (aabVar instanceof lt) {
                return pkb.Album;
            }
            if (aabVar instanceof u51) {
                return pkb.Artist;
            }
            b6e.s();
            return null;
        }
        if (!(rnvVar instanceof pnv)) {
            if (rnvVar instanceof qnv) {
                return pkb.Wave;
            }
            b6e.s();
            return null;
        }
        aab aabVar2 = ((pnv) rnvVar).a;
        if (aabVar2 instanceof eul) {
            return pkb.Playlist;
        }
        if (aabVar2 instanceof lt) {
            return lxe.w((lt) aabVar2) ? pkb.Audiobook : lxe.x((lt) aabVar2) ? pkb.Podcast : pkb.Album;
        }
        if (aabVar2 instanceof u51) {
            return pkb.Artist;
        }
        b6e.s();
        return null;
    }

    public static eml Y(j1g j1gVar) {
        return new eml(j1gVar, true, true);
    }

    public static String Z(gbx gbxVar) {
        StringBuilder sb = new StringBuilder(gbxVar.n());
        for (int i = 0; i < gbxVar.n(); i++) {
            byte a = gbxVar.a(i);
            if (a == 34) {
                sb.append("\\\"");
            } else if (a == 39) {
                sb.append("\\'");
            } else if (a != 92) {
                switch (a) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a < 32 || a > 126) {
                            sb.append('\\');
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            sb.append((char) ((a & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final void a(g06 g06Var, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-612785265);
        int i2 = (oq5Var.f(g06Var) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            agr agrVar = es5.h;
            etn.l(agrVar.a(new kx7(((jx7) oq5Var.j(agrVar)).getDensity(), 1.0f)), ild.C(-1461471153, new yzo(g06Var), oq5Var), oq5Var, 56);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yzo(g06Var, i);
        }
    }

    public static final void b(bci bciVar, Function0 function0, hq5 hq5Var, int i) {
        bciVar.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1092477285);
        int i2 = i | (oq5Var.h(bciVar) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yd5.f(null, null, bciVar, null, null, false, false, false, 0L, 0L, 0.0f, ild.C(135755460, new f0g(0, function0), oq5Var), oq5Var, 4096 | ((i2 << 9) & 7168), 4087);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t1b(bciVar, function0, i, 26);
        }
    }

    public static final void c(nsp nspVar, Function1 function1, hq5 hq5Var, int i) {
        int i2;
        d85 f;
        Integer valueOf;
        String M;
        Integer valueOf2 = Integer.valueOf(R.drawable.ic_lyrics_default_40);
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-28581148);
        if ((i & 6) == 0) {
            i2 = (oq5Var.d(nspVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function1) ? 32 : 16;
        }
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            int ordinal = nspVar.ordinal();
            if (ordinal == 0) {
                oq5Var.Z(-1696672724);
                f = k5r.f(oq5Var, false, ((dq0) oq5Var.j(eq0.a)).a.e);
            } else if (ordinal == 1) {
                oq5Var.Z(-1057189479);
                oq5Var.p(false);
                f = null;
            } else if (ordinal == 2) {
                oq5Var.Z(-1696668789);
                f = k5r.f(oq5Var, false, ((dq0) oq5Var.j(eq0.a)).a.a);
            } else {
                if (ordinal != 3) {
                    throw vz1.i(oq5Var, -1696675222, false);
                }
                oq5Var.Z(-1696666579);
                f = k5r.f(oq5Var, false, ((dq0) oq5Var.j(eq0.a)).a.c);
            }
            int ordinal2 = nspVar.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    valueOf2 = null;
                } else if (ordinal2 == 2) {
                    valueOf2 = Integer.valueOf(R.drawable.ic_lyrics_active_40);
                } else if (ordinal2 != 3) {
                    b6e.s();
                    return;
                }
            }
            int ordinal3 = nspVar.ordinal();
            if (ordinal3 == 0) {
                valueOf = Integer.valueOf(R.string.accessibility_disabled);
            } else if (ordinal3 == 1) {
                valueOf = null;
            } else if (ordinal3 == 2) {
                valueOf = Integer.valueOf(R.string.accessibility_on_state);
            } else {
                if (ordinal3 != 3) {
                    b6e.s();
                    return;
                }
                valueOf = Integer.valueOf(R.string.accessibility_off_state);
            }
            if (valueOf == null) {
                oq5Var.Z(-1056371389);
                oq5Var.p(false);
                M = null;
            } else {
                oq5Var.Z(-1056371388);
                M = rvf.M(valueOf.intValue(), oq5Var);
                oq5Var.p(false);
            }
            if (f == null || valueOf2 == null || M == null) {
                oq5Var.Z(-1067525250);
            } else {
                oq5Var.Z(-1056241994);
                boolean z = nspVar != nsp.a;
                yci D = ksw.D(b.d(androidx.compose.ui.platform.a.a(vci.a, "lyrics_button"), tah.b(new Pair("lyrics_on", Boolean.valueOf(nspVar == nsp.c)))), rvf.M(R.string.menu_element_lyrics, oq5Var) + StringUtil.LF + rvf.M(R.string.accessibility_warning, oq5Var), M);
                boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object K = oq5Var.K();
                if (z2 || K == gq5.a) {
                    K = new rln(11, function1, nspVar);
                    oq5Var.k0(K);
                }
                aae.a((Function0) K, D, z, ild.C(-1554901363, new hon(12, valueOf2, f), oq5Var), oq5Var, 24576, 8);
            }
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x8l(nspVar, function1, i, 18);
        }
    }

    public static final void d(int i, int i2, long j, hq5 hq5Var, yci yciVar) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(432456737);
        int i3 = (oq5Var.d(i) ? 4 : 2) | i2 | (oq5Var.f(yciVar) ? 256 : 128);
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            w4k E = a0g.E(i, i3 & 14, oq5Var);
            yci c = d.c(yciVar, 1.0f);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new fn1(j, 7);
                oq5Var.k0(K);
            }
            irf.r(E, null, androidx.compose.ui.draw.a.a(c, (Function1) K), null, hd6.c, 0.0f, null, oq5Var, 24624, 104);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new irj(i, i2, j, yciVar);
        }
    }

    public static final void e(g5k g5kVar, boolean z, hq5 hq5Var, int i) {
        boolean z2;
        boolean z3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1537633246);
        int i2 = (oq5Var.f(g5kVar) ? 4 : 2) | i | (oq5Var.g(z) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            vci vciVar = vci.a;
            yci d = d.d(vciVar, 1.0f);
            iz2 iz2Var = b2c.f;
            kfh d2 = ug3.d(iz2Var, false);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, d);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            U(oq5Var, d2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            U(oq5Var, H, kb5Var4);
            aqi O = gld.O(g5kVar.g, oq5Var);
            boolean z4 = (i2 & 14) == 4;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z4 || K == kjnVar) {
                K = new s8i(11, g5kVar);
                oq5Var.k0(K);
            }
            Function1 function1 = (Function1) K;
            yci d3 = d.d(vciVar, 1.0f);
            boolean f = oq5Var.f(O);
            Object K2 = oq5Var.K();
            if (f || K2 == kjnVar) {
                K2 = new xp(O, 14);
                oq5Var.k0(K2);
            }
            androidx.compose.ui.viewinterop.a.a(48, 0, oq5Var, d3, function1, (Function1) K2);
            if (z || !(((q5k) O.getValue()) instanceof p5k)) {
                z2 = false;
                z3 = true;
                oq5Var.Z(850064010);
            } else {
                oq5Var.Z(851644483);
                yci d4 = d.d(d.e(vciVar, 60), 1.0f);
                kfh d5 = ug3.d(iz2Var, false);
                int i4 = oq5Var.P;
                a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, d4);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                U(oq5Var, d5, kb5Var);
                U(oq5Var, l2, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var, i4, kb5Var3);
                }
                U(oq5Var, H2, kb5Var4);
                z2 = false;
                z3 = true;
                pd.g(0, 1, oq5Var, null);
                oq5Var.p(true);
            }
            oq5Var.p(z2);
            oq5Var.p(z3);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new e5k(g5kVar, z, i);
        }
    }

    public static final void f(cyl cylVar, tmb tmbVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        cyl cylVar2;
        boolean z;
        qzl qzlVar;
        boolean z2;
        Object msjVar;
        float f;
        cyl cylVar3;
        cyl cylVar4 = cylVar;
        cylVar4.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1664568131);
        int i2 = (oq5Var2.h(cylVar4) ? 4 : 2) | i | (oq5Var2.h(tmbVar) ? 32 : 16);
        if (oq5Var2.P(i2 & 1, (i2 & 19) != 18)) {
            boolean h = oq5Var2.h(cylVar4);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                msj msjVar2 = new msj(0, cylVar4, cyl.class, "onStart", "onStart()V", 0, 26);
                oq5Var2.k0(msjVar2);
                K = msjVar2;
            }
            Function0 function0 = (Function0) ((h9f) K);
            boolean h2 = oq5Var2.h(cylVar4);
            Object K2 = oq5Var2.K();
            if (h2 || K2 == kjnVar) {
                msj msjVar3 = new msj(0, cylVar4, cyl.class, "onStop", "onStop()V", 0, 27);
                cylVar2 = cylVar4;
                oq5Var2.k0(msjVar3);
                K2 = msjVar3;
            } else {
                cylVar2 = cylVar4;
            }
            wyf.c(function0, null, null, (Function0) ((h9f) K2), null, oq5Var2, 0, 45);
            aqi M = gld.M(cylVar2.m, oq5Var2);
            aqi M2 = gld.M(cylVar2.n, oq5Var2);
            a0m a0mVar = (a0m) gld.M(cylVar2.j, oq5Var2).getValue();
            mud O = vnj.O(bcb.a(oq5Var2), ((Boolean) M.getValue()).booleanValue() ? new bud(c3x.U(((ymk) M2.getValue()).d)) : cylVar2.l, oq5Var2);
            boolean z3 = a0mVar instanceof xzl;
            ogp.g.e(a0mVar instanceof tzl, z3, null, oq5Var2, 4096, 4);
            if (z3) {
                oq5Var2.Z(-542045811);
                float e = zs4.e(oq5Var2);
                vci vciVar = vci.a;
                yci c = d.c(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, 0.0f, e, 7), 1.0f);
                kfh d = ug3.d(b2c.b, false);
                int i3 = oq5Var2.P;
                a l = oq5Var2.l();
                yci H = vnj.H(oq5Var2, c);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(grbVar);
                } else {
                    oq5Var2.n0();
                }
                U(oq5Var2, d, wp5.f);
                U(oq5Var2, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                    ouj.x(i3, oq5Var2, i3, kb5Var);
                }
                U(oq5Var2, H, wp5.d);
                boolean h3 = oq5Var2.h(cylVar2);
                Object K3 = oq5Var2.K();
                if (h3 || K3 == kjnVar) {
                    cyl cylVar5 = cylVar2;
                    f = 1.0f;
                    cylVar3 = cylVar5;
                    msjVar = new msj(0, cylVar3, cyl.class, "onBackClick", "onBackClick()V", 0, 28);
                    oq5Var2.k0(msjVar);
                } else {
                    msjVar = K3;
                    cylVar3 = cylVar2;
                    f = 1.0f;
                }
                Function0 function02 = (Function0) ((h9f) msjVar);
                boolean h4 = oq5Var2.h(cylVar3);
                Object K4 = oq5Var2.K();
                if (h4 || K4 == kjnVar) {
                    msj msjVar4 = new msj(0, cylVar3, cyl.class, "onSearchClick", "onSearchClick()V", 0, 29);
                    oq5Var2.k0(msjVar4);
                    K4 = msjVar4;
                }
                Function0 function03 = (Function0) ((h9f) K4);
                boolean h5 = oq5Var2.h(cylVar3);
                Object K5 = oq5Var2.K();
                if (h5 || K5 == kjnVar) {
                    ayl aylVar = new ayl(0, cylVar3, cyl.class, "onOverflowClick", "onOverflowClick()V", 0, 0);
                    oq5Var2.k0(aylVar);
                    K5 = aylVar;
                }
                oq5Var = oq5Var2;
                tt0.r(O, function02, function03, (Function0) ((h9f) K5), d.d(vciVar, f), oq5Var, 24576);
                oq5Var2.p(true);
                oq5Var2.p(false);
                cylVar4 = cylVar;
            } else {
                cylVar4 = cylVar2;
                if (a0mVar instanceof zzl) {
                    oq5Var2.Z(-541394563);
                    zzl zzlVar = (zzl) a0mVar;
                    if (zzlVar instanceof szl) {
                        oq5Var2.Z(1922200349);
                        gf4 gf4Var = ((szl) a0mVar).f;
                        gf4Var.getClass();
                        boolean f2 = oq5Var2.f(gf4Var);
                        Object K6 = oq5Var2.K();
                        if (f2 || K6 == kjnVar) {
                            K6 = cylVar4.b(gf4Var.a, gf4Var.a(), gf4Var.d, true);
                            oq5Var2.k0(K6);
                        }
                        qzlVar = (qzl) K6;
                        oq5Var2.p(false);
                    } else {
                        if (!(zzlVar instanceof yzl)) {
                            throw vz1.i(oq5Var2, 1922197830, false);
                        }
                        oq5Var2.Z(1922204419);
                        zul zulVar = ((yzl) a0mVar).f;
                        zulVar.getClass();
                        boolean f3 = oq5Var2.f(zulVar);
                        Object K7 = oq5Var2.K();
                        if (f3 || K7 == kjnVar) {
                            cylVar4.g = zulVar;
                            List list = zulVar.b;
                            cylVar4.i = list;
                            cvl cvlVar = zulVar.a;
                            if (list == null) {
                                list = c5b.a;
                            }
                            z = false;
                            K7 = cylVar4.b(cvlVar, list, zulVar.e, false);
                            oq5Var2.k0(K7);
                        } else {
                            z = false;
                        }
                        qzlVar = (qzl) K7;
                        oq5Var2.p(z);
                    }
                    qzl qzlVar2 = qzlVar;
                    boolean booleanValue = ((Boolean) gld.M(cylVar4.k, oq5Var2).getValue()).booleanValue();
                    boolean h6 = oq5Var2.h(cylVar4);
                    Object K8 = oq5Var2.K();
                    if (h6 || K8 == kjnVar) {
                        z2 = booleanValue;
                        ayl aylVar2 = new ayl(0, cylVar4, cyl.class, "onRefresh", "onRefresh()V", 0, 1);
                        oq5Var2.k0(aylVar2);
                        K8 = aylVar2;
                    } else {
                        z2 = booleanValue;
                    }
                    bcx.j(z2, (Function0) ((h9f) K8), ild.C(674308465, new q6h(19, qzlVar2, zzlVar, O), oq5Var2), oq5Var2, 384);
                    oq5Var2.p(false);
                    oq5Var = oq5Var2;
                } else {
                    if (!(a0mVar instanceof wzl)) {
                        throw vz1.i(oq5Var2, 1922179715, false);
                    }
                    oq5Var2.Z(-539188107);
                    oq5Var = oq5Var2;
                    q5g.k(null, null, 0L, 0L, null, 0.0f, ild.C(-2014733113, new q6h(20, (wzl) a0mVar, cylVar4, tmbVar), oq5Var2), oq5Var, ScreenMirroringConfig.Video.BITRATE_1_5MB, 63);
                    oq5Var.p(false);
                }
            }
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wcj(cylVar4, tmbVar, i, 14);
        }
    }

    public static final void g(qtn qtnVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        int i2;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1133380776);
        if ((((oq5Var2.f(qtnVar) ? 4 : 2) | i) & 19) == 18 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
            i2 = 1;
        } else {
            yci a = androidx.compose.ui.platform.a.a(yciVar, "cover_with_lock");
            kfh d = ug3.d(b2c.b, false);
            int i3 = oq5Var2.P;
            a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, a);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            U(oq5Var2, d, wp5.f);
            U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var2, i3, kb5Var);
            }
            U(oq5Var2, H, wp5.d);
            String str = qtnVar.a;
            qo6 qo6Var = qo6.c;
            oq5Var = oq5Var2;
            d43 d43Var = new d43(d85.b(d85.b, 0.2f, 0.0f, 0.0f, 0.0f, 14), 24);
            vci vciVar = vci.a;
            irf.y(str, qo6Var, d.c(vciVar, 1.0f), false, false, d43Var, null, null, oq5Var, 432, 216);
            gae.b(a0g.E(R.drawable.ic_lock_mid_24, 0, oq5Var), null, androidx.compose.foundation.layout.b.a.a(vciVar, b2c.h), d85.b(d85.f, 0.9f, 0.0f, 0.0f, 0.0f, 14), oq5Var, 3120, 0);
            i2 = 1;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hon(qtnVar, yciVar, i, i2);
        }
    }

    public static final void h(rjm rjmVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(724863868);
        if ((((oq5Var.f(rjmVar) ? 4 : 2) | i | 48) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            wn5 C = ild.C(1290516734, new pjm(rjmVar, 1), oq5Var);
            wn5 C2 = ild.C(-523275969, new pjm(rjmVar, 2), oq5Var);
            wn5 C3 = ild.C(1957898624, new pjm(rjmVar, 3), oq5Var);
            vci vciVar = vci.a;
            sk3.i(C, C2, C3, androidx.compose.ui.platform.a.a(androidx.compose.foundation.a.k(vciVar, true, null), "pre_save_bottom_sheet_dialog_header"), null, null, oq5Var, 438, 48);
            yciVar = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wcj(rjmVar, yciVar, i, 22);
        }
    }

    public static final void i(e4n e4nVar, hq5 hq5Var, int i) {
        e4nVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(411640649);
        int i2 = (oq5Var.h(e4nVar) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            pd.b(new qzm[0], false, ild.C(-1460656078, new f4n(e4nVar), oq5Var), oq5Var, 0, 2);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new f4n(e4nVar, i);
        }
    }

    public static final void j(tsp tspVar, Function0 function0, hq5 hq5Var, int i) {
        int i2;
        Function0 function02;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-240979531);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(tspVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function0) ? 32 : 16;
        }
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            if (tspVar instanceof rsp) {
                oq5Var.Z(-2130675518);
                kfh d = ug3.d(b2c.b, false);
                int i3 = oq5Var.P;
                a l = oq5Var.l();
                vci vciVar = vci.a;
                yci H = vnj.H(oq5Var, vciVar);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                U(oq5Var, d, wp5.f);
                U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                    ouj.x(i3, oq5Var, i3, kb5Var);
                }
                U(oq5Var, H, wp5.d);
                function02 = function0;
                aae.a(function02, androidx.compose.ui.platform.a.a(ksw.D(vciVar, rvf.M(R.string.quality_settings_button_description, oq5Var), null), "quality_settings_button"), false, bkp.c, oq5Var, ((i2 >> 3) & 14) | 24576, 12);
                oq5Var.p(true);
            } else {
                function02 = function0;
                oq5Var.Z(-2135118035);
            }
            oq5Var.p(false);
        } else {
            function02 = function0;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x8l(tspVar, function02, i, 15);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(qtn qtnVar, yci yciVar, Function0 function0, Function2 function2, hq5 hq5Var, int i, int i2) {
        Function0 function02;
        Function0 function03;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1625040844);
        int i3 = (oq5Var.f(qtnVar) ? 4 : 2) | i | (oq5Var.f(yciVar) ? 32 : 16);
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            function02 = function0;
            i3 |= oq5Var.h(function02) ? 256 : 128;
            if ((i3 & 1171) == 1170 || !oq5Var.z()) {
                Function0 function04 = i4 == 0 ? null : function02;
                ltg.i(b.c(yciVar, "is_explicit", Boolean.valueOf(qtnVar.f)), false, d85.m, function04, null, ild.C(-1187599226, new hon(2, qtnVar, function2), oq5Var), oq5Var, ((i3 << 3) & 7168) | 196992, 18);
                function03 = function04;
            } else {
                oq5Var.S();
                function03 = function02;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new hq((Object) qtnVar, yciVar, (Object) function03, (Object) function2, i, i2, 19);
                return;
            }
            return;
        }
        function02 = function0;
        if ((i3 & 1171) == 1170) {
        }
        if (i4 == 0) {
        }
        ltg.i(b.c(yciVar, "is_explicit", Boolean.valueOf(qtnVar.f)), false, d85.m, function04, null, ild.C(-1187599226, new hon(2, qtnVar, function2), oq5Var), oq5Var, ((i3 << 3) & 7168) | 196992, 18);
        function03 = function04;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void l(wsp wspVar, Function1 function1, hq5 hq5Var, int i) {
        int i2;
        int i3;
        String str;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1944287428);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(wspVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function1) ? 32 : 16;
        }
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            if (wspVar instanceof usp) {
                oq5Var.Z(338022820);
                nyn nynVar = ((usp) wspVar).a;
                int ordinal = nynVar.ordinal();
                if (ordinal == 0) {
                    i3 = R.string.repeat_off;
                } else if (ordinal == 1) {
                    i3 = R.string.repeat_track;
                } else {
                    if (ordinal != 2) {
                        b6e.s();
                        return;
                    }
                    i3 = R.string.repeat_playlist;
                }
                yci a = androidx.compose.ui.platform.a.a(ksw.D(vci.a, rvf.M(i3, oq5Var), null), "repeat_button");
                int ordinal2 = nynVar.ordinal();
                if (ordinal2 == 0) {
                    str = "repeat_none";
                } else if (ordinal2 == 1) {
                    str = "repeat_one";
                } else {
                    if (ordinal2 != 2) {
                        b6e.s();
                        return;
                    }
                    str = "repeat_all";
                }
                yci c = b.c(a, "repeat_state", str);
                boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
                Object K = oq5Var.K();
                if (z || K == gq5.a) {
                    K = new rln(10, function1, wspVar);
                    oq5Var.k0(K);
                }
                aae.a((Function0) K, c, false, ild.C(417967213, new ucm(22, wspVar), oq5Var), oq5Var, 24576, 12);
            } else {
                oq5Var.Z(335224574);
            }
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x8l(wspVar, function1, i, 17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m(wn5 wn5Var, String str, yci yciVar, Function0 function0, long j, int i, hq5 hq5Var, int i2, int i3) {
        int i4;
        yci yciVar2;
        int i5;
        Function0 function02;
        int i6;
        int i7;
        int i8;
        int i9;
        long c;
        int i10;
        long j2;
        yci yciVar3;
        xmn r;
        str.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1469315682);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.h(wn5Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.f(str) ? 32 : 16;
        }
        int i11 = i3 & 4;
        if (i11 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var.f(yciVar2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                function02 = function0;
                i4 |= oq5Var.h(function02) ? 2048 : 1024;
                if ((i2 & 24576) == 0) {
                    i4 |= RemoteCameraConfig.Notification.ID;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((196608 & i2) == 0) {
                    i7 = i;
                    i4 |= oq5Var.d(i7) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                    if ((74899 & i4) == 74898 || !oq5Var.z()) {
                        oq5Var.U();
                        i8 = i2 & 1;
                        vci vciVar = vci.a;
                        if (i8 != 0 || oq5Var.y()) {
                            if (i11 != 0) {
                                yciVar2 = vciVar;
                            }
                            if (i5 != 0) {
                                Object K = oq5Var.K();
                                if (K == gq5.a) {
                                    K = new s2(28);
                                    oq5Var.k0(K);
                                }
                                function02 = (Function0) K;
                            }
                            i9 = i4 & (-57345);
                            c = ((q9b) oq5Var.j(s9b.a)).c(oq5Var);
                            if (i6 != 0) {
                                i7 = 1;
                            }
                        } else {
                            oq5Var.S();
                            i9 = i4 & (-57345);
                            c = j;
                        }
                        oq5Var.q();
                        ta5 a = sa5.a(qx0.c, b2c.o, oq5Var, 48);
                        i10 = oq5Var.P;
                        a l = oq5Var.l();
                        yci H = vnj.H(oq5Var, yciVar2);
                        xp5.T.getClass();
                        grb grbVar = wp5.b;
                        oq5Var.d0();
                        yci yciVar4 = yciVar2;
                        if (oq5Var.O) {
                            oq5Var.n0();
                        } else {
                            oq5Var.k(grbVar);
                        }
                        U(oq5Var, a, wp5.f);
                        U(oq5Var, l, wp5.e);
                        kb5 kb5Var = wp5.g;
                        if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i10))) {
                            ouj.x(i10, oq5Var, i10, kb5Var);
                        }
                        U(oq5Var, H, wp5.d);
                        wn5Var.invoke(oq5Var, Integer.valueOf(i9 & 14));
                        u1g.l(oq5Var, d.e(vciVar, 8));
                        zwf.i(c, ild.C(-1246412179, new ky5(function02, str, i7), oq5Var), oq5Var, 48);
                        oq5Var.p(true);
                        j2 = c;
                        yciVar3 = yciVar4;
                    } else {
                        oq5Var.S();
                        yciVar3 = yciVar2;
                        j2 = j;
                    }
                    Function0 function03 = function02;
                    int i12 = i7;
                    r = oq5Var.r();
                    if (r == null) {
                        r.d = new fgo(wn5Var, str, yciVar3, function03, j2, i12, i2, i3);
                        return;
                    }
                    return;
                }
                i7 = i;
                if ((74899 & i4) == 74898) {
                }
                oq5Var.U();
                i8 = i2 & 1;
                vci vciVar2 = vci.a;
                if (i8 != 0) {
                }
                if (i11 != 0) {
                }
                if (i5 != 0) {
                }
                i9 = i4 & (-57345);
                c = ((q9b) oq5Var.j(s9b.a)).c(oq5Var);
                if (i6 != 0) {
                }
                oq5Var.q();
                ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var, 48);
                i10 = oq5Var.P;
                a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, yciVar2);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var.d0();
                yci yciVar42 = yciVar2;
                if (oq5Var.O) {
                }
                U(oq5Var, a2, wp5.f);
                U(oq5Var, l2, wp5.e);
                kb5 kb5Var2 = wp5.g;
                if (!oq5Var.O) {
                }
                ouj.x(i10, oq5Var, i10, kb5Var2);
                U(oq5Var, H2, wp5.d);
                wn5Var.invoke(oq5Var, Integer.valueOf(i9 & 14));
                u1g.l(oq5Var, d.e(vciVar2, 8));
                zwf.i(c, ild.C(-1246412179, new ky5(function02, str, i7), oq5Var), oq5Var, 48);
                oq5Var.p(true);
                j2 = c;
                yciVar3 = yciVar42;
                Function0 function032 = function02;
                int i122 = i7;
                r = oq5Var.r();
                if (r == null) {
                }
            }
            function02 = function0;
            if ((i2 & 24576) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i;
            if ((74899 & i4) == 74898) {
            }
            oq5Var.U();
            i8 = i2 & 1;
            vci vciVar22 = vci.a;
            if (i8 != 0) {
            }
            if (i11 != 0) {
            }
            if (i5 != 0) {
            }
            i9 = i4 & (-57345);
            c = ((q9b) oq5Var.j(s9b.a)).c(oq5Var);
            if (i6 != 0) {
            }
            oq5Var.q();
            ta5 a22 = sa5.a(qx0.c, b2c.o, oq5Var, 48);
            i10 = oq5Var.P;
            a l22 = oq5Var.l();
            yci H22 = vnj.H(oq5Var, yciVar2);
            xp5.T.getClass();
            grb grbVar22 = wp5.b;
            oq5Var.d0();
            yci yciVar422 = yciVar2;
            if (oq5Var.O) {
            }
            U(oq5Var, a22, wp5.f);
            U(oq5Var, l22, wp5.e);
            kb5 kb5Var22 = wp5.g;
            if (!oq5Var.O) {
            }
            ouj.x(i10, oq5Var, i10, kb5Var22);
            U(oq5Var, H22, wp5.d);
            wn5Var.invoke(oq5Var, Integer.valueOf(i9 & 14));
            u1g.l(oq5Var, d.e(vciVar22, 8));
            zwf.i(c, ild.C(-1246412179, new ky5(function02, str, i7), oq5Var), oq5Var, 48);
            oq5Var.p(true);
            j2 = c;
            yciVar3 = yciVar422;
            Function0 function0322 = function02;
            int i1222 = i7;
            r = oq5Var.r();
            if (r == null) {
            }
        }
        yciVar2 = yciVar;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        function02 = function0;
        if ((i2 & 24576) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i;
        if ((74899 & i4) == 74898) {
        }
        oq5Var.U();
        i8 = i2 & 1;
        vci vciVar222 = vci.a;
        if (i8 != 0) {
        }
        if (i11 != 0) {
        }
        if (i5 != 0) {
        }
        i9 = i4 & (-57345);
        c = ((q9b) oq5Var.j(s9b.a)).c(oq5Var);
        if (i6 != 0) {
        }
        oq5Var.q();
        ta5 a222 = sa5.a(qx0.c, b2c.o, oq5Var, 48);
        i10 = oq5Var.P;
        a l222 = oq5Var.l();
        yci H222 = vnj.H(oq5Var, yciVar2);
        xp5.T.getClass();
        grb grbVar222 = wp5.b;
        oq5Var.d0();
        yci yciVar4222 = yciVar2;
        if (oq5Var.O) {
        }
        U(oq5Var, a222, wp5.f);
        U(oq5Var, l222, wp5.e);
        kb5 kb5Var222 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i10, oq5Var, i10, kb5Var222);
        U(oq5Var, H222, wp5.d);
        wn5Var.invoke(oq5Var, Integer.valueOf(i9 & 14));
        u1g.l(oq5Var, d.e(vciVar222, 8));
        zwf.i(c, ild.C(-1246412179, new ky5(function02, str, i7), oq5Var), oq5Var, 48);
        oq5Var.p(true);
        j2 = c;
        yciVar3 = yciVar4222;
        Function0 function03222 = function02;
        int i12222 = i7;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void n(g06 g06Var, Function0 function0, Function0 function02, boolean z, yci yciVar, hq5 hq5Var, int i) {
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1899887934);
        int i2 = i | (oq5Var.f(g06Var) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.h(function02) ? 256 : 128) | (oq5Var.g(z) ? 2048 : 1024) | (oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var.P(i2 & 1, (i2 & 9363) != 9362)) {
            float f = 14;
            int i3 = i2 << 3;
            u2x.e((pw5) g06Var.a, ild.C(37699197, new wzo(z, g06Var), oq5Var), function0, function02, yciVar, false, ild.C(899769602, new wzo(g06Var, z), oq5Var), false, new q0k(16, f, 12, f), oq5Var, (i3 & 7168) | (i3 & 896) | 1572912 | (i2 & 57344), 160);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qr(g06Var, function0, function02, z, yciVar, i);
        }
    }

    public static final void o(g06 g06Var, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(71535308);
        if ((i & 6) == 0) {
            i2 = i | (oq5Var.f(g06Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            vci vciVar = vci.a;
            yci a = androidx.compose.ui.platform.a.a(vciVar, "concert_item_title");
            String str = (String) g06Var.b;
            ges j = nu0.j();
            agr agrVar = eq0.a;
            xv7.j(str, a, ((dq0) oq5Var.j(agrVar)).b.a, 0L, 0L, 0, 0L, 2, false, 1, 0, null, j, oq5Var, 48, 3120, 55288);
            xv7.i(new mn0(StringsKt.t0(((pw5) g06Var.a).g).toString()), androidx.compose.ui.platform.a.a(vciVar, "concert_city_info"), ((dq0) oq5Var.j(agrVar)).b.b, 0L, 0L, 0, 0L, 0, false, 2, 0, null, null, nu0.i(), null, null, oq5Var, 48, 3072, 909304);
            oq5Var = oq5Var;
            String str2 = (String) g06Var.c;
            if (str2 == null) {
                oq5Var.Z(805241865);
                oq5Var.p(false);
            } else {
                oq5Var.Z(805241866);
                u1g.l(oq5Var, d.e(vciVar, mu0.a));
                xv7.i(new mn0(str2), androidx.compose.ui.platform.a.a(vciVar, "concert_age_info"), ((dq0) oq5Var.j(agrVar)).b.b, 0L, 0L, 0, 0L, 0, false, 1, 0, null, null, nu0.i(), null, null, oq5Var, 48, 3072, 909304);
                oq5Var = oq5Var;
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i4(g06Var, i, 18);
        }
    }

    public static final void p(final g06 g06Var, final boolean z, final yci yciVar, hq5 hq5Var, final int i) {
        xmn r;
        Function2 function2;
        grb grbVar;
        kb5 kb5Var;
        vci vciVar;
        agr agrVar;
        boolean z2;
        boolean z3;
        boolean z4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-376638975);
        int w = oq5Var.w();
        int i2 = i | (oq5Var.f(g06Var) ? 4 : 2) | (oq5Var.g(z) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            ges j = nu0.j();
            ta5 a = sa5.a(qx0.e, b2c.n, oq5Var, 6);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar2);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var2 = wp5.f;
            U(oq5Var, a, kb5Var2);
            kb5 kb5Var3 = wp5.e;
            U(oq5Var, l, kb5Var3);
            kb5 kb5Var4 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var4);
            }
            kb5 kb5Var5 = wp5.d;
            U(oq5Var, H, kb5Var5);
            oq5Var.Z(1920056437);
            if (!z) {
                oq5Var.Z(1919994839);
                o(g06Var, oq5Var, i2 & 14);
                oq5Var.t(w);
                r = oq5Var.r();
                if (r != null) {
                    final int i4 = 0;
                    function2 = new Function2(g06Var, z, yciVar, i, i4) { // from class: xzo
                        public final /* synthetic */ int a;
                        public final /* synthetic */ g06 b;
                        public final /* synthetic */ boolean c;
                        public final /* synthetic */ yci d;

                        {
                            this.a = i4;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.a;
                            hq5 hq5Var2 = (hq5) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    g0g.p(this.b, this.c, this.d, hq5Var2, rvf.R(385));
                                    break;
                                default:
                                    g0g.p(this.b, this.c, this.d, hq5Var2, rvf.R(385));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    r.d = function2;
                }
                return;
            }
            oq5Var.Z(1915014379);
            oq5Var.p(false);
            vci vciVar2 = vci.a;
            yci a2 = androidx.compose.ui.platform.a.a(vciVar2, "concert_item_title");
            String str = (String) g06Var.b;
            pw5 pw5Var = (pw5) g06Var.a;
            agr agrVar2 = eq0.a;
            xv7.j(str, a2, ((dq0) oq5Var.j(agrVar2)).b.a, 0L, 0L, 0, 0L, 2, false, 2, 0, null, j, oq5Var, 48, 3120, 55288);
            yci d = d.d(vciVar2, 1.0f);
            x2i x2iVar = qx0.a;
            nho a3 = lho.a(x2iVar, b2c.k, oq5Var, 0);
            int i5 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, d);
            oq5Var.d0();
            if (oq5Var.O) {
                grbVar = grbVar2;
                oq5Var.k(grbVar);
            } else {
                grbVar = grbVar2;
                oq5Var.n0();
            }
            U(oq5Var, a3, kb5Var2);
            U(oq5Var, l2, kb5Var3);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                kb5Var = kb5Var4;
                ouj.x(i5, oq5Var, i5, kb5Var);
            } else {
                kb5Var = kb5Var4;
            }
            U(oq5Var, H2, kb5Var5);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            yci a4 = androidx.compose.ui.platform.a.a(new LayoutWeightElement(false, 1.0f), "concert_event_info");
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new i6o(26);
                oq5Var.k0(K);
            }
            kb5 kb5Var6 = kb5Var;
            grb grbVar3 = grbVar;
            xcs.c(new mn0(j66.d0(pw5Var.b.d(), oq5Var)), nfp.a(a4, (Function1) K), ((dq0) oq5Var.j(agrVar2)).b.b, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, null, j, oq5Var, 0, 3120, 120824);
            oq5 oq5Var2 = oq5Var;
            String str2 = (String) g06Var.c;
            if (str2 == null) {
                oq5Var2.Z(-1310941095);
                oq5Var2.p(false);
                z2 = false;
                agrVar = agrVar2;
                vciVar = vciVar2;
            } else {
                oq5Var2.Z(-1310941094);
                vciVar = vciVar2;
                agrVar = agrVar2;
                xcs.b(" • ".concat(str2), androidx.compose.ui.platform.a.a(vciVar2, "concert_content_rating"), ((dq0) oq5Var2.j(agrVar2)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, j, oq5Var2, 48, 3072, 57336);
                oq5Var2 = oq5Var2;
                z2 = false;
                oq5Var2.p(false);
            }
            oq5Var2.p(true);
            vci vciVar3 = vciVar;
            agr agrVar3 = agrVar;
            oq5 oq5Var3 = oq5Var2;
            xv7.i(new mn0(StringsKt.t0(pw5Var.g).toString()), androidx.compose.ui.platform.a.a(vciVar3, "concert_city_info"), ((dq0) oq5Var2.j(agrVar3)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, null, j, null, null, oq5Var3, 48, 3120, 907256);
            oq5Var = oq5Var3;
            Integer num = pw5Var.m;
            if (num == null) {
                oq5Var.Z(1921940956);
                oq5Var.p(false);
                z4 = false;
                z3 = true;
            } else {
                oq5Var.Z(1921940957);
                int intValue = num.intValue();
                hz2 hz2Var = b2c.l;
                yci D = ksw.D(androidx.compose.ui.platform.a.a(vciVar3, "concert_cashback"), pw5Var.o, null);
                nho a5 = lho.a(x2iVar, hz2Var, oq5Var, 48);
                int i6 = oq5Var.P;
                a l3 = oq5Var.l();
                yci H3 = vnj.H(oq5Var, D);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar3);
                } else {
                    oq5Var.n0();
                }
                U(oq5Var, a5, kb5Var2);
                U(oq5Var, l3, kb5Var3);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var, i6, kb5Var6);
                }
                U(oq5Var, H3, kb5Var5);
                gae.b(a0g.E(R.drawable.ic_plus_12, 0, oq5Var), null, d.m(vciVar3, 12), ((dq0) oq5Var.j(agrVar3)).b.a, oq5Var, 432, 0);
                u1g.l(oq5Var, d.r(vciVar3, 4));
                xcs.b(intValue + "%", null, ((dq0) oq5Var.j(agrVar3)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, j, oq5Var, 0, 3120, 55290);
                oq5Var = oq5Var;
                z3 = true;
                oq5Var.p(true);
                z4 = false;
                oq5Var.p(false);
            }
            oq5Var.p(z4);
            oq5Var.p(z3);
        } else {
            oq5Var.S();
        }
        r = oq5Var.r();
        if (r != null) {
            final int i7 = 1;
            function2 = new Function2(g06Var, z, yciVar, i, i7) { // from class: xzo
                public final /* synthetic */ int a;
                public final /* synthetic */ g06 b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ yci d;

                {
                    this.a = i7;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.a;
                    hq5 hq5Var2 = (hq5) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            g0g.p(this.b, this.c, this.d, hq5Var2, rvf.R(385));
                            break;
                        default:
                            g0g.p(this.b, this.c, this.d, hq5Var2, rvf.R(385));
                            break;
                    }
                    return Unit.a;
                }
            };
            r.d = function2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23, types: [int] */
    /* JADX WARN: Type inference failed for: r1v24, types: [int] */
    /* JADX WARN: Type inference failed for: r1v25, types: [int] */
    /* JADX WARN: Type inference failed for: r26v18 */
    /* JADX WARN: Type inference failed for: r26v5, types: [int] */
    /* JADX WARN: Type inference failed for: r26v7 */
    public static final void q(dtp dtpVar, Function1 function1, Function1 function12, Function1 function13, Function0 function0, Function0 function02, Function1 function14, yci yciVar, hq5 hq5Var, int i, int i2) {
        yci yciVar2;
        int i3;
        Function1 function15 = function12;
        Function0 function03 = function02;
        dtpVar.getClass();
        wsp wspVar = dtpVar.a;
        function1.getClass();
        function15.getClass();
        function13.getClass();
        function0.getClass();
        function03.getClass();
        function14.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-45220864);
        int i4 = (oq5Var.f(dtpVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= oq5Var.h(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= oq5Var.h(function15) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= oq5Var.h(function13) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= oq5Var.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i4 |= oq5Var.h(function03) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i4 |= oq5Var.h(function14) ? 1048576 : 524288;
        }
        int i5 = i2 & 128;
        if (i5 != 0) {
            i3 = i4 | 12582912;
            yciVar2 = yciVar;
        } else {
            yciVar2 = yciVar;
            i3 = i4 | (oq5Var.f(yciVar2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE);
        }
        if (oq5Var.P(i3 & 1, (4793491 & i3) != 4793490)) {
            yci yciVar3 = i5 != 0 ? vci.a : yciVar2;
            yci a = androidx.compose.ui.platform.a.a(d.d(yciVar3, 1.0f), "settings");
            nsp nspVar = dtpVar.f;
            qsp qspVar = dtpVar.e;
            ctp ctpVar = dtpVar.d;
            int i6 = i3;
            tsp tspVar = dtpVar.c;
            zsp zspVar = dtpVar.b;
            boolean z = wspVar instanceof usp;
            boolean z2 = z;
            if (zspVar instanceof xsp) {
                z2 = (z ? 1 : 0) + 1;
            }
            boolean z3 = z2;
            if (tspVar instanceof rsp) {
                z3 = (z2 ? 1 : 0) + 1;
            }
            boolean z4 = z3;
            if (ctpVar instanceof atp) {
                z4 = (z3 ? 1 : 0) + 1;
            }
            ?? r26 = z4;
            if (qspVar instanceof osp) {
                r26 = (z4 ? 1 : 0) + 1;
            }
            int i7 = (nspVar == nsp.c || nspVar == nsp.d || nspVar == nsp.a) ? r26 + 1 : r26;
            yci yciVar4 = yciVar3;
            nho a2 = lho.a(i7 > 3 ? qx0.g : qx0.h, b2c.k, oq5Var, 48);
            int i8 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            U(oq5Var, a2, wp5.f);
            U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                ouj.x(i8, oq5Var, i8, kb5Var);
            }
            U(oq5Var, H, wp5.d);
            l(wspVar, function1, oq5Var, i6 & 112);
            u(qspVar, function13, oq5Var, (i6 >> 6) & 112);
            j(tspVar, function0, oq5Var, (i6 >> 9) & 112);
            c(nspVar, function14, oq5Var, (i6 >> 15) & 112);
            function03 = function02;
            w(ctpVar, function03, oq5Var, (i6 >> 12) & 112);
            function15 = function12;
            r(zspVar, function15, oq5Var, (i6 >> 3) & 112);
            oq5Var.p(true);
            yciVar2 = yciVar4;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gd1(dtpVar, function1, function15, function13, function0, function03, function14, yciVar2, i, i2);
        }
    }

    public static final void r(zsp zspVar, Function1 function1, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1944045758);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(zspVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function1) ? 32 : 16;
        }
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            if (zspVar instanceof xsp) {
                oq5Var.Z(-1727958075);
                boolean z = ((xsp) zspVar).a;
                String M = rvf.M(z ? R.string.accessibility_on_state : R.string.accessibility_off_state, oq5Var);
                boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
                Object K = oq5Var.K();
                if (z2 || K == gq5.a) {
                    K = new rln(12, function1, zspVar);
                    oq5Var.k0(K);
                }
                aae.a((Function0) K, b.c(androidx.compose.ui.platform.a.a(ksw.D(vci.a, rvf.M(R.string.player_shuffle, oq5Var), M), "shuffle_button"), "shuffle_on", Boolean.valueOf(z)), false, ild.C(141042859, new ucm(23, zspVar), oq5Var), oq5Var, 24576, 12);
            } else {
                oq5Var.Z(-1733156992);
            }
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x8l(zspVar, function1, i, 19);
        }
    }

    public static final void s(q53 q53Var, eqp eqpVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        String string;
        int i2;
        boolean z;
        oq5 oq5Var2;
        eqp eqpVar2;
        boolean z2;
        int i3;
        fk0 fk0Var;
        oq5 oq5Var3;
        eqp eqpVar3;
        int i4;
        boolean z3;
        boolean z4;
        fk0 fk0Var2;
        boolean z5;
        eqpVar.getClass();
        oq5 oq5Var4 = (oq5) hq5Var;
        oq5Var4.b0(1866341609);
        int i5 = i | (oq5Var4.f(q53Var) ? 4 : 2) | (oq5Var4.f(eqpVar) ? 32 : 16) | (oq5Var4.f(yciVar) ? 256 : 128);
        if (oq5Var4.P(i5 & 1, (i5 & 147) != 146)) {
            yci a = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(yciVar, 0.0f, 16, 0.0f, 0.0f, 13), "sound_block");
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var4, 0);
            int i6 = oq5Var4.P;
            a l = oq5Var4.l();
            yci H = vnj.H(oq5Var4, a);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var4.d0();
            if (oq5Var4.O) {
                oq5Var4.k(grbVar);
            } else {
                oq5Var4.n0();
            }
            U(oq5Var4, a2, wp5.f);
            U(oq5Var4, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var4, i6, kb5Var);
            }
            U(oq5Var4, H, wp5.d);
            a0g.v(0, oq5Var4, null, rvf.M(R.string.sound_settings_title, oq5Var4));
            String M = rvf.M(R.string.quality_settings_title, oq5Var4);
            i7q i7qVar = q53Var.b;
            Context context = (Context) oq5Var4.j(AndroidCompositionLocals_androidKt.b);
            int ordinal = i7qVar.ordinal();
            if (ordinal == 0) {
                string = context.getString(R.string.quality_settings_list_element_low);
                string.getClass();
            } else if (ordinal == 1) {
                string = context.getString(R.string.quality_settings_list_element_high);
                string.getClass();
            } else if (ordinal == 2) {
                string = context.getString(R.string.quality_settings_list_element_lossless);
                string.getClass();
            } else if (ordinal != 3) {
                b6e.s();
                return;
            } else {
                string = context.getString(R.string.quality_settings_list_element_auto);
                string.getClass();
            }
            String str = string;
            int i7 = i5 & 112;
            boolean z6 = i7 == 32;
            Object K = oq5Var4.K();
            kjn kjnVar = gq5.a;
            if (z6 || K == kjnVar) {
                i2 = i5;
                z = false;
                vuq vuqVar = new vuq(0, eqpVar, eqp.class, "onQualitySettingsClick", "onQualitySettingsClick()V", 0, 11);
                oq5Var4.k0(vuqVar);
                K = vuqVar;
            } else {
                i2 = i5;
                z = false;
            }
            vci vciVar = vci.a;
            a0g.b(M, str, (Function0) ((h9f) K), androidx.compose.ui.platform.a.a(vciVar, "quality_settings"), null, oq5Var4, 3072, 16);
            if (q53Var.c) {
                oq5Var4.Z(-1056748146);
                String M2 = rvf.M(R.string.equalizer, oq5Var4);
                String M3 = rvf.M(R.string.open_in_external_app, oq5Var4);
                boolean z7 = i7 != 32 ? z : true;
                Object K2 = oq5Var4.K();
                if (z7 || K2 == kjnVar) {
                    K2 = new vuq(0, eqpVar, eqp.class, "onEqualizerClick", "onEqualizerClick()V", 0, 12);
                    oq5Var4.k0(K2);
                }
                eqpVar2 = eqpVar;
                a0g.b(M2, M3, (Function0) ((h9f) K2), androidx.compose.ui.platform.a.a(vciVar, "equalizer"), null, oq5Var4, 3072, 16);
                oq5Var2 = oq5Var4;
            } else {
                oq5Var2 = oq5Var4;
                eqpVar2 = eqpVar;
                oq5Var2.Z(-1059184157);
            }
            oq5Var2.p(z);
            int i8 = ((i2 >> 3) & 14) | 48;
            fk0 N = u1g.N(eqpVar2, lsp.d, oq5Var2, i8);
            String M4 = rvf.M(R.string.settings_crossfade_subtitle, oq5Var2);
            String M5 = rvf.M(R.string.settings_crossfade_description, oq5Var2);
            boolean z8 = q53Var.a;
            boolean z9 = i7 != 32 ? z : true;
            Object K3 = oq5Var2.K();
            if (z9 || K3 == kjnVar) {
                z2 = z8;
                i3 = i8;
                eqp eqpVar4 = eqpVar2;
                fk0Var = N;
                oq5Var3 = oq5Var2;
                lgq lgqVar = new lgq(1, eqpVar4, eqp.class, "onCrossfadeSwitcherClick", "onCrossfadeSwitcherClick(Z)V", 0, 3);
                oq5Var3.k0(lgqVar);
                K3 = lgqVar;
            } else {
                oq5Var3 = oq5Var2;
                fk0Var = N;
                i3 = i8;
                z2 = z8;
            }
            Function1 function1 = (Function1) ((h9f) K3);
            boolean h = oq5Var3.h(fk0Var);
            Object K4 = oq5Var3.K();
            if (h || K4 == kjnVar) {
                K4 = new kw4(fk0Var, 7);
                oq5Var3.k0(K4);
            }
            a0g.s(M4, M5, z2, function1, b.c(androidx.compose.ui.platform.a.a(wyf.t(vciVar, (Function0) K4), "crossfade"), "crossfade_state", Boolean.valueOf(q53Var.a)), oq5Var3, 0);
            if (q53Var.g) {
                oq5Var3.Z(-1055727161);
                String M6 = rvf.M(R.string.settings_autoplay_title, oq5Var3);
                String M7 = rvf.M(R.string.settings_autoplay_subtitle, oq5Var3);
                boolean z10 = q53Var.f;
                boolean z11 = i7 != 32 ? z : true;
                Object K5 = oq5Var3.K();
                if (z11 || K5 == kjnVar) {
                    z5 = z10;
                    lgq lgqVar2 = new lgq(1, eqpVar, eqp.class, "onAutoplaySwitcherClick", "onAutoplaySwitcherClick(Z)V", 0, 4);
                    eqpVar3 = eqpVar;
                    oq5Var3.k0(lgqVar2);
                    K5 = lgqVar2;
                } else {
                    eqpVar3 = eqpVar;
                    z5 = z10;
                }
                a0g.s(M6, M7, z5, (Function1) ((h9f) K5), b.c(androidx.compose.ui.platform.a.a(vciVar, "settings_autoplay_switcher"), "autoplay_state", Boolean.valueOf(q53Var.f)), oq5Var3, 0);
            } else {
                eqpVar3 = eqpVar;
                oq5Var3.Z(-1059184157);
            }
            oq5Var3.p(z);
            if (q53Var.e) {
                oq5Var3.Z(-1055113578);
                i4 = i3;
                fk0 N2 = u1g.N(eqpVar3, lsp.e, oq5Var3, i4);
                String M8 = rvf.M(R.string.video_shot_title, oq5Var3);
                String M9 = rvf.M(R.string.video_shot_description, oq5Var3);
                boolean z12 = q53Var.d;
                boolean z13 = i7 != 32 ? z : true;
                Object K6 = oq5Var3.K();
                if (z13 || K6 == kjnVar) {
                    z4 = z12;
                    fk0Var2 = N2;
                    lgq lgqVar3 = new lgq(1, eqpVar, eqp.class, "onVideoShotSwitcherClick", "onVideoShotSwitcherClick(Z)V", 0, 5);
                    eqpVar3 = eqpVar;
                    oq5Var3.k0(lgqVar3);
                    K6 = lgqVar3;
                } else {
                    fk0Var2 = N2;
                    z4 = z12;
                }
                Function1 function12 = (Function1) ((h9f) K6);
                boolean h2 = oq5Var3.h(fk0Var2);
                Object K7 = oq5Var3.K();
                if (h2 || K7 == kjnVar) {
                    K7 = new kw4(fk0Var2, 8);
                    oq5Var3.k0(K7);
                }
                a0g.s(M8, M9, z4, function12, b.c(androidx.compose.ui.platform.a.a(wyf.t(vciVar, (Function0) K7), "settings_video_shots_switcher"), "video_shots_state", Boolean.valueOf(q53Var.d)), oq5Var3, 0);
            } else {
                i4 = i3;
                oq5Var3.Z(-1059184157);
            }
            oq5Var3.p(z);
            if (q53Var.i) {
                oq5Var3.Z(-1054334579);
                fk0 N3 = u1g.N(eqpVar3, lsp.f, oq5Var3, i4);
                String M10 = rvf.M(R.string.settings_shake_title, oq5Var3);
                String M11 = rvf.M(R.string.settings_shake_subtitle, oq5Var3);
                boolean z14 = q53Var.h;
                boolean z15 = i7 != 32 ? z : true;
                Object K8 = oq5Var3.K();
                if (z15 || K8 == kjnVar) {
                    z3 = z14;
                    lgq lgqVar4 = new lgq(1, eqpVar, eqp.class, "onShakeSwitcherClick", "onShakeSwitcherClick(Z)V", 0, 6);
                    oq5Var3.k0(lgqVar4);
                    K8 = lgqVar4;
                } else {
                    z3 = z14;
                }
                Function1 function13 = (Function1) ((h9f) K8);
                boolean h3 = oq5Var3.h(N3);
                Object K9 = oq5Var3.K();
                if (h3 || K9 == kjnVar) {
                    K9 = new kw4(N3, 9);
                    oq5Var3.k0(K9);
                }
                oq5Var = oq5Var3;
                a0g.s(M10, M11, z3, function13, b.c(androidx.compose.ui.platform.a.a(wyf.t(vciVar, (Function0) K9), "settings_wave_shake_switcher"), "wave_shake_state", Boolean.valueOf(q53Var.h)), oq5Var, 0);
            } else {
                oq5Var = oq5Var3;
                oq5Var.Z(-1059184157);
            }
            oq5Var.p(z);
            oq5Var.p(true);
        } else {
            oq5Var = oq5Var4;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t2n(q53Var, eqpVar, yciVar, i, 19);
        }
    }

    public static final void t(p53 p53Var, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-904390272);
        int i2 = (oq5Var.f(p53Var) ? 4 : 2) | i | (oq5Var.f(yciVar) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            pm0.a(lm0.l, ild.C(-1441943735, new l3r(yciVar, p53Var), oq5Var), oq5Var, 48, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new l3r(p53Var, yciVar, i);
        }
    }

    public static final void u(qsp qspVar, Function1 function1, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1187568673);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(qspVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function1) ? 32 : 16;
        }
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            if (qspVar instanceof osp) {
                oq5Var.Z(1212957343);
                boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
                Object K = oq5Var.K();
                if (z || K == gq5.a) {
                    K = new rln(9, function1, qspVar);
                    oq5Var.k0(K);
                }
                float f = ((osp) qspVar).a.a;
                aae.a((Function0) K, b.c(androidx.compose.ui.platform.a.a(ksw.D(vci.a, rvf.M(R.string.player_playback_speed_description, oq5Var), String.valueOf(f)), "playback_speed_button"), "playback_speed", Float.valueOf(f)), false, ild.C(1494871306, new ucm(21, qspVar), oq5Var), oq5Var, 24576, 12);
            } else {
                oq5Var.Z(1204297121);
            }
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x8l(qspVar, function1, i, i3);
        }
    }

    public static final void v(kor korVar, hq5 hq5Var, int i) {
        kor korVar2;
        oq5 oq5Var;
        korVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1540403750);
        if (oq5Var2.P(i & 1, (i & 3) != 2)) {
            aqi O = gld.O(korVar.d, oq5Var2);
            vci vciVar = vci.a;
            yci o = androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, 0.0f, 16, 7), 20, 0.0f, 2);
            ta5 a = sa5.a(qx0.c, b2c.o, oq5Var2, 48);
            int i2 = oq5Var2.P;
            a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, o);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            U(oq5Var2, a, wp5.f);
            U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var2, i2, kb5Var);
            }
            U(oq5Var2, H, wp5.d);
            float f = 311;
            a0g.r((por) O.getValue(), d.t(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 8, 0.0f, 0.0f, 13), 0.0f, f, 1), oq5Var2, 48);
            yci t = d.t(vciVar, 0.0f, f, 1);
            por porVar = (por) O.getValue();
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new vuq(0, korVar, kor.class, "onClick", "onClick()V", 0, 17);
                oq5Var2.k0(K);
            }
            h9f h9fVar = (h9f) K;
            Object K2 = oq5Var2.K();
            if (K2 == kjnVar) {
                K2 = new vuq(0, korVar, kor.class, "onRetryClick", "onRetryClick()V", 0, 18);
                korVar2 = korVar;
                oq5Var2.k0(K2);
            } else {
                korVar2 = korVar;
            }
            oq5Var = oq5Var2;
            u1g.m(porVar, (Function0) h9fVar, (Function0) ((h9f) K2), t, oq5Var, 3072);
            oq5Var.p(true);
        } else {
            korVar2 = korVar;
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new f5r(korVar2, i, 4);
        }
    }

    public static final void w(ctp ctpVar, Function0 function0, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1129030295);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(ctpVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function0) ? 32 : 16;
        }
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            if (ctpVar instanceof atp) {
                oq5Var.Z(-1052422084);
                boolean z = ((atp) ctpVar).a instanceof opl;
                String M = rvf.M(z ? R.string.accessibility_on_state : R.string.accessibility_off_state, oq5Var);
                boolean z2 = (i2 & 112) == 32;
                Object K = oq5Var.K();
                if (z2 || K == gq5.a) {
                    K = new g1j(19, function0);
                    oq5Var.k0(K);
                }
                aae.a((Function0) K, b.c(androidx.compose.ui.platform.a.a(ksw.D(vci.a, rvf.M(R.string.timer_title, oq5Var), M), "timer_button"), "timer_on", Boolean.valueOf(z)), false, ild.C(634742610, new ucm(20, ctpVar), oq5Var), oq5Var, 24576, 12);
            } else {
                oq5Var.Z(-1059009863);
            }
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x8l(ctpVar, function0, i, 14);
        }
    }

    public static final void x(y5t y5tVar, tmb tmbVar, Function1 function1, hq5 hq5Var, int i) {
        tmbVar.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1137290564);
        int i2 = i | (oq5Var.h(y5tVar) ? 4 : 2) | (oq5Var.h(tmbVar) ? 32 : 16) | (oq5Var.h(function1) ? 256 : 128);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            vci vciVar = vci.a;
            yci a = androidx.compose.ui.platform.a.a(d.e(d.d(vciVar, 1.0f), 500), "trailer_bottom_sheet_error");
            kfh d = ug3.d(b2c.f, false);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            U(oq5Var, d, kb5Var);
            kb5 kb5Var2 = wp5.e;
            U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            U(oq5Var, H, kb5Var4);
            if (y5tVar.c) {
                oq5Var.Z(-1474686487);
                ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var, 48);
                int i4 = oq5Var.P;
                a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, vciVar);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                U(oq5Var, a2, kb5Var);
                U(oq5Var, l2, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var, i4, kb5Var3);
                }
                U(oq5Var, H2, kb5Var4);
                String M = rvf.M(R.string.trailer_loading_error, oq5Var);
                ges c = nu0.c();
                agr agrVar = eq0.a;
                xcs.b(M, androidx.compose.ui.platform.a.a(vciVar, "trailer_bottom_sheet_error_title"), ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, c, oq5Var, 48, 0, 65528);
                xcs.b(vz1.o(vciVar, 12, oq5Var, R.string.fix_soon_error_message, oq5Var), null, ((dq0) oq5Var.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, 0, 0, 65530);
                oq5Var = oq5Var;
                oq5Var.p(true);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-1473964993);
                rvf.j(function1, tmbVar, null, 0, true, null, oq5Var, ((i2 >> 6) & 14) | 24640 | (i2 & 112), 44);
                oq5Var.p(false);
            }
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kws(y5tVar, tmbVar, function1, i, 1);
        }
    }

    public static final void y(eku ekuVar, jz3 jz3Var, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(469421189);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(ekuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(jz3Var) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            vci vciVar = vci.a;
            yci d = d.d(vciVar, 1.0f);
            long j = ekuVar.c;
            jzk jzkVar = vnj.i;
            yci p1 = gut.p1(androidx.compose.foundation.a.b(d, j, jzkVar));
            kfh d2 = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, p1);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            U(oq5Var, d2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            U(oq5Var, H, kb5Var4);
            float f = 8;
            float f2 = 24;
            yci n = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.e(androidx.compose.foundation.a.b(xp3.u(androidx.compose.foundation.layout.a.n(vciVar, 16, f), ugo.a(f2)), ekuVar.b, jzkVar), false, null, null, jz3Var, 7), 20, f2);
            nho a = lho.a(qx0.a, b2c.l, oq5Var, 48);
            int i4 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, n);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            U(oq5Var, a, kb5Var);
            U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            U(oq5Var, H2, kb5Var4);
            gae.b(a0g.E(R.drawable.ic_offline_mode_lte_wi_fi_40, 0, oq5Var), null, d.m(vciVar, f2), ekuVar.d, oq5Var, 432, 0);
            u1g.l(oq5Var, d.r(vciVar, f));
            String M = rvf.M(R.string.vpn_offline_button_label, oq5Var);
            long j2 = ekuVar.d;
            ges gesVar = ekuVar.a;
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            xcs.b(M, new LayoutWeightElement(true, 1.0f), j2, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, gesVar, oq5Var, 0, 0, 65528);
            oq5Var = oq5Var;
            gae.b(a0g.E(R.drawable.ic_arrow_mid_right_24, 0, oq5Var), null, d.m(vciVar, f2), ekuVar.d, oq5Var, 432, 0);
            oq5Var.p(true);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x8l(ekuVar, jz3Var, i, 27);
        }
    }

    public static final void z(onu onuVar, Function0 function0, List list, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(269941687);
        if ((i & 6) == 0) {
            i2 = (oq5Var.d(onuVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(list) : oq5Var.h(list) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            cb0.s(ild.C(-2075585050, new mqr(rvf.M(R.string.rup_block_title, oq5Var), list, onuVar, function0, 9), oq5Var), vnj.g, d.c(vci.a, 1.0f), oq5Var, 438);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new erj(onuVar, function0, list, i, 23);
        }
    }
}
