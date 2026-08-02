package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.music.core.ui.compose.a;
import com.yandex.music.core.ui.compose.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes3.dex */
public abstract class e9q {
    public static final float a = 500;
    public static final float b = 48;
    public static final float c = 8;

    public static final void a(lnu lnuVar, owu owuVar, yci yciVar, float f, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        float f2;
        lnuVar.getClass();
        owuVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1089425475);
        if ((i & 6) == 0) {
            i3 = (oq5Var.f(lnuVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.h(owuVar) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        int i5 = i3 | 3072;
        if ((i5 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
            f2 = f;
        } else {
            if (i4 != 0) {
                yciVar = vci.a;
            }
            yci yciVar3 = yciVar;
            boolean z = !((ma5) oq5Var.j(pa5.a)).g();
            int i6 = i5 & 126;
            int i7 = i5 << 3;
            float f3 = a;
            c(lnuVar, owuVar, z, yciVar3, f3, oq5Var, i6 | (i7 & 7168) | (i7 & 57344));
            yciVar2 = yciVar3;
            f2 = f3;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new z8q(lnuVar, owuVar, yciVar2, f2, i, i2, 0);
        }
    }

    public static final void b(lnu lnuVar, owu owuVar, qy7 qy7Var, yci yciVar, float f, hq5 hq5Var, int i, int i2) {
        int i3;
        boolean booleanValue;
        owu owuVar2;
        lnu lnuVar2;
        yci yciVar2;
        float f2;
        owuVar.getClass();
        qy7Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2077065220);
        int i4 = (oq5Var.f(lnuVar) ? 4 : 2) | i | (oq5Var.h(owuVar) ? 32 : 16) | (oq5Var.f(qy7Var) ? 256 : 128);
        if ((i & 3072) == 0) {
            i4 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 = i4 | 24576;
        } else {
            i3 = i4 | (oq5Var.c(f) ? 16384 : RemoteCameraConfig.Notification.ID);
        }
        if ((i3 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            owuVar2 = owuVar;
            f2 = f;
            lnuVar2 = lnuVar;
            yciVar2 = yciVar;
        } else {
            if (i5 != 0) {
                f = a;
            }
            float f3 = f;
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = qy7Var.a();
                oq5Var.k0(K);
            }
            jtt jttVar = (jtt) K;
            jttVar.getClass();
            oq5Var.Z(-1202337306);
            if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                oq5Var.Z(1196678064);
                booleanValue = xv7.B(oq5Var);
                oq5Var.p(false);
                oq5Var.p(false);
            } else {
                oq5Var.Z(1174186076);
                oq5Var.p(false);
                booleanValue = ((Boolean) szf.Q(jttVar.a(), oq5Var).getValue()).booleanValue();
                oq5Var.p(false);
            }
            owuVar2 = owuVar;
            c(lnuVar, owuVar2, booleanValue, yciVar, f3, oq5Var, i3 & 64638);
            lnuVar2 = lnuVar;
            yciVar2 = yciVar;
            f2 = f3;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new v04(lnuVar2, owuVar2, qy7Var, yciVar2, f2, i, i2);
        }
    }

    public static final void c(lnu lnuVar, owu owuVar, boolean z, yci yciVar, float f, hq5 hq5Var, int i) {
        int i2;
        int i3;
        boolean booleanValue;
        Object inuVar;
        owu owuVar2;
        boolean z2;
        oq5 oq5Var;
        String str;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1688453154);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(lnuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.h(owuVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.c(f) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i4 = i2;
        if ((i4 & 9363) == 9362 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            aqi M = gld.M(owuVar.c(), oq5Var2);
            String str2 = lnuVar.a;
            String str3 = lnuVar.e;
            nmu nmuVar = lnuVar.f;
            qmu qmuVar = (qmu) M.getValue();
            long j = lnuVar.c;
            amu amuVar = lnuVar.d;
            String pathForSize = (amuVar == null || (str = amuVar.a) == null) ? null : new jcv(str, WebPath$Storage.AVATARS_NO_CROP).getPathForSize(frv.b());
            String str4 = lnuVar.b;
            d85 d85Var = lnuVar.g;
            d85 d85Var2 = lnuVar.h;
            str2.getClass();
            nmuVar.getClass();
            qmuVar.getClass();
            kjn kjnVar = gq5.a;
            if (j != 16) {
                oq5Var2.Z(1842869585);
                oq5Var2.p(false);
                i3 = i4;
                booleanValue = false;
            } else {
                oq5Var2.Z(1842902011);
                Boolean bool = Boolean.TRUE;
                Object K = oq5Var2.K();
                if (K == kjnVar) {
                    i3 = i4;
                    K = new k5u(2, 1, null);
                    oq5Var2.k0(K);
                } else {
                    i3 = i4;
                }
                booleanValue = ((Boolean) szf.i0(oq5Var2, bool, (Function2) K).getValue()).booleanValue();
                oq5Var2.p(false);
            }
            boolean booleanValue2 = ((Boolean) oq5Var2.j(koe.a)).booleanValue();
            v3g v3gVar = omu.b;
            if (booleanValue2) {
                if (str3 != null) {
                    v3gVar = new pmu("image", nmuVar);
                }
            } else if (str3 != null && !StringsKt.U(str3)) {
                v3gVar = new pmu(str3, nmuVar);
            }
            boolean f2 = oq5Var2.f(str2) | oq5Var2.f(v3gVar) | oq5Var2.d(qmuVar.ordinal()) | oq5Var2.g(booleanValue) | oq5Var2.e(j) | oq5Var2.f(pathForSize) | oq5Var2.f(str4) | oq5Var2.f(d85Var) | oq5Var2.f(d85Var2);
            Object K2 = oq5Var2.K();
            if (f2 || K2 == kjnVar) {
                if (booleanValue) {
                    inuVar = new hnu(str2, v3gVar, str4, d85Var, d85Var2);
                } else {
                    v3g v3gVar2 = v3gVar;
                    if (j == 16) {
                        j = oa5.a;
                    }
                    inuVar = new inu(str2, v3gVar2, qmuVar, j, pathForSize, str4, d85Var, d85Var2);
                }
                K2 = inuVar;
                oq5Var2.k0(K2);
            }
            jnu jnuVar = (jnu) K2;
            if (jnuVar instanceof inu) {
                oq5Var2.Z(-1948200058);
                owuVar2 = owuVar;
                boolean h = oq5Var2.h(owuVar2);
                Object K3 = oq5Var2.K();
                if (h || K3 == kjnVar) {
                    K3 = new oxo(19, owuVar2);
                    oq5Var2.k0(K3);
                }
                z2 = false;
                a.a((Function0) K3, oq5Var2, 0);
            } else {
                owuVar2 = owuVar;
                z2 = false;
                oq5Var2.Z(-1954726240);
            }
            oq5Var2.p(z2);
            boolean h2 = oq5Var2.h(owuVar2);
            Object K4 = oq5Var2.K();
            if (h2 || K4 == kjnVar) {
                bml bmlVar = new bml(1, owuVar, owu.class, "onClick", "onClick(Lcom/yandex/music/model/playback/wave/WaveButtonPlaybackState;)V", 0, 29);
                oq5Var2.k0(bmlVar);
                K4 = bmlVar;
            }
            Function1 function1 = (Function1) ((h9f) K4);
            int i5 = i3 << 6;
            oq5Var = oq5Var2;
            d(jnuVar, function1, !owuVar.a(), f, z, yciVar, oq5Var, ((i3 >> 3) & 7168) | (57344 & i5) | (i5 & 458752));
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new rgo(lnuVar, owuVar, z, yciVar, f, i);
        }
    }

    public static final void d(final jnu jnuVar, final Function1 function1, final boolean z, final float f, final boolean z2, final yci yciVar, hq5 hq5Var, final int i) {
        int i2;
        Pair pair;
        qmu qmuVar;
        boolean z3;
        boolean z4;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1744058433);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(jnuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.h(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.c(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.g(z2) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var2.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i2) == 74898 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            if (jnuVar instanceof hnu) {
                hnu hnuVar = (hnu) jnuVar;
                pair = new Pair(new kmu(hnuVar.a, hnuVar.b, qmu.d, d85.n, hnuVar.c, hnuVar.d, hnuVar.e), hmu.a);
            } else if (!(jnuVar instanceof inu)) {
                b6e.s();
                return;
            } else {
                inu inuVar = (inu) jnuVar;
                pair = new Pair(new kmu(inuVar.a, inuVar.b, inuVar.c, inuVar.d, inuVar.f, inuVar.g, inuVar.h), new imu(inuVar.d, inuVar.e));
            }
            kmu kmuVar = (kmu) pair.a;
            jmu jmuVar = (jmu) pair.b;
            qmu qmuVar2 = kmuVar.c;
            if (qmuVar2 == qmu.b) {
                qmuVar = qmuVar2;
                z3 = true;
            } else {
                qmuVar = qmuVar2;
                z3 = false;
            }
            boolean a2 = qmuVar.a();
            Object K = oq5Var2.K();
            Object obj = gq5.a;
            if (K == obj) {
                K = vz1.h(oq5Var2);
            }
            uoi uoiVar = (uoi) K;
            vm0 b2 = nnu.b(uoiVar, oq5Var2, 6);
            int i3 = i2;
            if (z) {
                oq5Var2.Z(-1023570680);
                nnu.a(uoiVar, oq5Var2, 6);
                z4 = false;
            } else {
                z4 = false;
                oq5Var2.Z(-1032282269);
            }
            oq5Var2.p(z4);
            yci t = d.t(yciVar, 0.0f, f, 1);
            boolean f2 = oq5Var2.f(b2);
            Object K2 = oq5Var2.K();
            if (f2 || K2 == obj) {
                K2 = new xp(b2, 16);
                oq5Var2.k0(K2);
            }
            yci u = xp3.u(androidx.compose.ui.graphics.a.a(t, (Function1) K2), o5g.D(oq5Var2));
            boolean z5 = !z3;
            boolean f3 = ((i3 & 112) == 32) | oq5Var2.f(kmuVar);
            Object K3 = oq5Var2.K();
            int i4 = 20;
            if (f3 || K3 == obj) {
                K3 = new rln(i4, function1, kmuVar);
                oq5Var2.k0(K3);
            }
            yci d = androidx.compose.foundation.a.d(u, uoiVar, null, z5, null, null, (Function0) K3, 24);
            knu[] knuVarArr = knu.a;
            yci d2 = b.d(androidx.compose.ui.platform.a.a(d, "wave_button"), tah.b(new Pair("vibe_button_is_playing", Boolean.valueOf(a2 && !z3))));
            Object K4 = oq5Var2.K();
            if (K4 == obj) {
                K4 = new e7q(19);
                oq5Var2.k0(K4);
            }
            yci b3 = nfp.b(d2, false, (Function1) K4);
            kfh d3 = ug3.d(b2c.b, false);
            int i5 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, b3);
            xp5.T.getClass();
            Function0 function0 = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(function0);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, d3, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var2, i5, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            e(jmuVar, oq5Var2, 6);
            String str = kmuVar.a;
            long j = kmuVar.d;
            v3g v3gVar = kmuVar.b;
            boolean f4 = oq5Var2.f(b2);
            Object K5 = oq5Var2.K();
            if (f4 || K5 == obj) {
                K5 = new a9q(b2, 0);
                oq5Var2.k0(K5);
            }
            Function0 function02 = (Function0) K5;
            String str2 = kmuVar.e;
            d85 d85Var = kmuVar.f;
            d85 d85Var2 = kmuVar.g;
            yci c2 = b.c(androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.a.a(vci.a, b2c.f), "wave_button"), "vibe_button_is_playing", Boolean.valueOf(a2));
            boolean z6 = (i3 & 14) == 4;
            Object K6 = oq5Var2.K();
            if (z6 || K6 == obj) {
                K6 = new oxo(20, jnuVar);
                oq5Var2.k0(K6);
            }
            g(str, a2, z3, j, v3gVar, function02, str2, d85Var, d85Var2, z2, wyf.s(c2, (Function0) K6), oq5Var2, (i3 << 15) & 1879048192);
            oq5Var = oq5Var2;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: b9q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    e9q.d(jnu.this, function1, z, f, z2, yciVar, (hq5) obj2, rvf.R(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(jmu jmuVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1540327890);
        int i2 = (oq5Var.f(jmuVar) ? 32 : 16) | i;
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean d = Intrinsics.d(jmuVar, hmu.a);
            vci vciVar = vci.a;
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.a;
            kjn kjnVar = gq5.a;
            if (d) {
                oq5Var.Z(-477430577);
                wje f = pm0.f(oq5Var);
                boolean f2 = oq5Var.f(f);
                Object K = oq5Var.K();
                if (f2 || K == kjnVar) {
                    K = new a9q(f, 1);
                    oq5Var.k0(K);
                }
                u1g.l(oq5Var, androidx.compose.foundation.a.b(bVar.b(wyf.s(vciVar, (Function0) K)), ((dq0) oq5Var.j(eq0.a)).c.c, o5g.D(oq5Var)));
                oq5Var.p(false);
            } else {
                if (!(jmuVar instanceof imu)) {
                    throw vz1.i(oq5Var, 1508618270, false);
                }
                oq5Var.Z(-477043852);
                imu imuVar = (imu) jmuVar;
                String str = imuVar.b;
                d43 d43Var = new d43(imuVar.a, 15);
                yci b2 = bVar.b(vciVar);
                boolean z = (i2 & 112) == 32;
                Object K2 = oq5Var.K();
                if (z || K2 == kjnVar) {
                    K2 = new xpp(2, jmuVar);
                    oq5Var.k0(K2);
                }
                f(str, wyf.t(b2, (Function0) K2), d43Var, oq5Var, 0);
                oq5Var.p(false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ucm(jmuVar, i, 28);
        }
    }

    public static final void f(final String str, final yci yciVar, final m85 m85Var, hq5 hq5Var, final int i) {
        xmn r;
        Function2 function2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(918320376);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.f(yciVar) ? 32 : 16) | (oq5Var.f(m85Var) ? 256 : 128);
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                oq5Var.Z(-1259192499);
                u1g.l(oq5Var, androidx.compose.foundation.a.b(yciVar, d85.b(d85.l, 0.1f, 0.0f, 0.0f, 0.0f, 14), vnj.i));
                oq5Var.p(false);
                r = oq5Var.r();
                if (r != null) {
                    final int i3 = 0;
                    function2 = new Function2(str, yciVar, m85Var, i, i3) { // from class: v8q
                        public final /* synthetic */ int a;
                        public final /* synthetic */ String b;
                        public final /* synthetic */ yci c;
                        public final /* synthetic */ m85 d;

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
                                    e9q.f(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                                    break;
                                default:
                                    e9q.f(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    r.d = function2;
                }
                return;
            }
            oq5Var.Z(-1270754166);
            oq5Var.p(false);
            p1g.a(str, null, yciVar, null, null, b2c.f, hd6.a, 0.0f, m85Var, 0, oq5Var, (i2 & 14) | 1769520 | ((i2 << 3) & 896) | ((i2 << 18) & 234881024), 664);
        }
        r = oq5Var.r();
        if (r != null) {
            final int i4 = 1;
            function2 = new Function2(str, yciVar, m85Var, i, i4) { // from class: v8q
                public final /* synthetic */ int a;
                public final /* synthetic */ String b;
                public final /* synthetic */ yci c;
                public final /* synthetic */ m85 d;

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
                            e9q.f(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                            break;
                        default:
                            e9q.f(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                            break;
                    }
                    return Unit.a;
                }
            };
            r.d = function2;
        }
    }

    public static final void g(final String str, final boolean z, final boolean z2, final long j, final v3g v3gVar, final Function0 function0, final String str2, final d85 d85Var, final d85 d85Var2, final boolean z3, final yci yciVar, hq5 hq5Var, final int i) {
        int i2;
        boolean z4;
        v3g v3gVar2;
        Function0 function02;
        String str3;
        d85 d85Var3;
        d85 d85Var4;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-784990495);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z4 = z2;
            i2 |= oq5Var2.g(z4) ? 256 : 128;
        } else {
            z4 = z2;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.e(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            v3gVar2 = v3gVar;
            i2 |= oq5Var2.f(v3gVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            v3gVar2 = v3gVar;
        }
        if ((196608 & i) == 0) {
            function02 = function0;
            i2 |= oq5Var2.h(function02) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            function02 = function0;
        }
        if ((1572864 & i) == 0) {
            str3 = str2;
            i2 |= oq5Var2.f(str3) ? 1048576 : 524288;
        } else {
            str3 = str2;
        }
        if ((12582912 & i) == 0) {
            d85Var3 = d85Var;
            i2 |= oq5Var2.f(d85Var3) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        } else {
            d85Var3 = d85Var;
        }
        if ((100663296 & i) == 0) {
            d85Var4 = d85Var2;
            i2 |= oq5Var2.f(d85Var4) ? 67108864 : 33554432;
        } else {
            d85Var4 = d85Var2;
        }
        if ((i & 805306368) == 0) {
            i2 |= oq5Var2.g(z3) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        char c2 = 4;
        if (!oq5Var2.f(yciVar)) {
            c2 = 2;
        }
        if ((i2 & 306783379) == 306783378 && (c2 & 3) == 2 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            qzm[] qzmVarArr = new qzm[0];
            boolean z5 = j != 16 || z3;
            final d85 d85Var5 = d85Var4;
            final String str4 = str3;
            final boolean z6 = z4;
            final v3g v3gVar3 = v3gVar2;
            final Function0 function03 = function02;
            final d85 d85Var6 = d85Var3;
            wn5 C = ild.C(-1893296791, new Function2() { // from class: c9q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String str5;
                    sdr sdrVar;
                    sdr sdrVar2;
                    oq5 oq5Var3;
                    hq5 hq5Var2;
                    vci vciVar;
                    v3g v3gVar4;
                    boolean z7;
                    boolean z8;
                    long j2;
                    hq5 hq5Var3 = (hq5) obj;
                    if ((((Integer) obj2).intValue() & 3) == 2) {
                        oq5 oq5Var4 = (oq5) hq5Var3;
                        if (oq5Var4.z()) {
                            oq5Var4.S();
                            return Unit.a;
                        }
                    }
                    lx0 lx0Var = qx0.g;
                    hz2 hz2Var = b2c.l;
                    String str6 = str4;
                    yci d = d.d(androidx.compose.foundation.layout.a.n(d.e(yci.this, nnu.c(!(str6 == null || str6.length() == 0), hq5Var3)), e9q.c, nnu.a), 1.0f);
                    nho a2 = lho.a(lx0Var, hz2Var, hq5Var3, 54);
                    oq5 oq5Var5 = (oq5) hq5Var3;
                    int i3 = oq5Var5.P;
                    androidx.compose.runtime.internal.a l = oq5Var5.l();
                    yci H = vnj.H(hq5Var3, d);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var5.d0();
                    if (oq5Var5.O) {
                        oq5Var5.k(grbVar);
                    } else {
                        oq5Var5.n0();
                    }
                    kb5 kb5Var = wp5.f;
                    g0g.U(hq5Var3, a2, kb5Var);
                    kb5 kb5Var2 = wp5.e;
                    g0g.U(hq5Var3, l, kb5Var2);
                    kb5 kb5Var3 = wp5.g;
                    if (oq5Var5.O || !Intrinsics.d(oq5Var5.K(), Integer.valueOf(i3))) {
                        ouj.x(i3, oq5Var5, i3, kb5Var3);
                    }
                    kb5 kb5Var4 = wp5.d;
                    g0g.U(hq5Var3, H, kb5Var4);
                    omu omuVar = omu.b;
                    v3g v3gVar5 = v3gVar3;
                    boolean equals = v3gVar5.equals(omuVar);
                    vci vciVar2 = vci.a;
                    if (equals) {
                        oq5Var5.Z(-1088644392);
                        u1g.l(hq5Var3, d.e(vciVar2, e9q.b));
                        oq5Var5.p(false);
                    } else {
                        if (!(v3gVar5 instanceof pmu)) {
                            throw vz1.i(oq5Var5, -1088646612, false);
                        }
                        oq5Var5.Z(-1088640054);
                        e9q.h((pmu) v3gVar5, hq5Var3, 0);
                        oq5Var5.p(false);
                    }
                    gz2 gz2Var = b2c.o;
                    lx0 lx0Var2 = qx0.e;
                    if (1.0f <= 0.0d) {
                        qme.a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(false, 1.0f);
                    Function0 function04 = function03;
                    boolean f = oq5Var5.f(function04);
                    Object K = oq5Var5.K();
                    kjn kjnVar = gq5.a;
                    if (f || K == kjnVar) {
                        str5 = str6;
                        K = new ex(19, function04);
                        oq5Var5.k0(K);
                    } else {
                        str5 = str6;
                    }
                    yci a3 = androidx.compose.ui.graphics.a.a(layoutWeightElement, (Function1) K);
                    ta5 a4 = sa5.a(lx0Var2, gz2Var, hq5Var3, 54);
                    int i4 = oq5Var5.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var5.l();
                    yci H2 = vnj.H(hq5Var3, a3);
                    oq5Var5.d0();
                    if (oq5Var5.O) {
                        oq5Var5.k(grbVar);
                    } else {
                        oq5Var5.n0();
                    }
                    g0g.U(hq5Var3, a4, kb5Var);
                    g0g.U(hq5Var3, l2, kb5Var2);
                    if (oq5Var5.O || !Intrinsics.d(oq5Var5.K(), Integer.valueOf(i4))) {
                        ouj.x(i4, oq5Var5, i4, kb5Var3);
                    }
                    g0g.U(hq5Var3, H2, kb5Var4);
                    if (z6) {
                        oq5Var5.Z(189914484);
                        sdrVar = pm0.f(hq5Var3);
                        oq5Var5.p(false);
                    } else {
                        oq5Var5.Z(189983335);
                        Object K2 = oq5Var5.K();
                        if (K2 == kjnVar) {
                            K2 = tlm.h(1.0f, oq5Var5);
                        }
                        sdrVar = (poi) K2;
                        oq5Var5.p(false);
                    }
                    if (str5 == null || str5.length() == 0) {
                        sdrVar2 = sdrVar;
                        oq5Var3 = oq5Var5;
                        hq5Var2 = hq5Var3;
                        vciVar = vciVar2;
                        v3gVar4 = v3gVar5;
                        z7 = false;
                        oq5Var3.Z(175464051);
                    } else {
                        oq5Var5.Z(190159198);
                        h6g h6gVar = nu0.a;
                        h6g h6gVar2 = h6g.c;
                        ges i5 = nu0.i();
                        d85 d85Var7 = d85Var6;
                        if (d85Var7 != null) {
                            oq5Var5.Z(421782206);
                            z8 = false;
                            oq5Var5.p(false);
                            j2 = d85Var7.a;
                        } else {
                            z8 = false;
                            long j3 = j;
                            if (j3 != 16) {
                                oq5Var5.Z(421785127);
                                oq5Var5.p(false);
                                j2 = jf0.c0(j3);
                            } else {
                                oq5Var5.Z(190499640);
                                j2 = ((dq0) ((oq5) hq5Var3).j(eq0.a)).b.a;
                                oq5Var5.p(false);
                            }
                        }
                        yci o = androidx.compose.foundation.layout.a.o(vciVar2, 2, 0.0f, 2);
                        boolean f2 = oq5Var5.f(sdrVar);
                        Object K3 = oq5Var5.K();
                        if (f2 || K3 == kjnVar) {
                            K3 = new xtb(sdrVar, 29);
                            oq5Var5.k0(K3);
                        }
                        hq5Var2 = hq5Var3;
                        sdrVar2 = sdrVar;
                        vciVar = vciVar2;
                        v3gVar4 = v3gVar5;
                        oq5Var3 = oq5Var5;
                        xcs.b(str5, androidx.compose.ui.platform.a.a(wyf.s(o, (Function0) K3), "wave_button_header"), j2, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, i5, hq5Var2, 0, 3120, 55288);
                        z7 = false;
                    }
                    oq5Var3.p(z7);
                    hq5 hq5Var4 = hq5Var2;
                    e9q.j(str, z, ((Number) sdrVar2.getValue()).floatValue(), d85Var5, hq5Var4, 24576);
                    oq5Var3.p(true);
                    if (v3gVar4 instanceof pmu) {
                        oq5Var3.Z(613857942);
                        u1g.l(hq5Var4, d.m(vciVar, 48));
                        oq5Var3.p(z7);
                    } else {
                        oq5Var3.Z(613935039);
                        u1g.l(hq5Var4, vciVar);
                        oq5Var3.p(z7);
                    }
                    oq5Var3.p(true);
                    return Unit.a;
                }
            }, oq5Var2);
            oq5Var = oq5Var2;
            jf0.a(qzmVarArr, null, z5, C, oq5Var, 3072, 2);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: d9q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    e9q.g(str, z, z2, j, v3gVar, function0, str2, d85Var, d85Var2, z3, yciVar, (hq5) obj, rvf.R(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void h(final pmu pmuVar, hq5 hq5Var, final int i) {
        tgo tgoVar;
        xmn r;
        Function2 function2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(428420249);
        if ((((oq5Var.f(pmuVar) ? 4 : 2) | i) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            int ordinal = pmuVar.c.ordinal();
            if (ordinal == 0) {
                oq5Var.Z(-1574999964);
                oq5Var.p(false);
                tgoVar = null;
            } else if (ordinal == 1) {
                oq5Var.Z(-604994228);
                tgoVar = o5g.E(oq5Var);
                oq5Var.p(false);
            } else {
                if (ordinal != 2) {
                    throw vz1.i(oq5Var, -604998105, false);
                }
                oq5Var.Z(-604992252);
                oq5Var.p(false);
                tgoVar = ugo.a;
            }
            float f = b;
            yci yciVar = vci.a;
            yci a2 = androidx.compose.ui.platform.a.a(d.m(yciVar, f), "wave_button_image");
            if (tgoVar != null) {
                yciVar = xp3.u(yciVar, tgoVar);
            }
            yci f2 = a2.f(yciVar);
            if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                oq5Var.Z(-1574661691);
                u1g.l(oq5Var, androidx.compose.foundation.a.b(f2, c3x.h(4287221203L), vnj.i));
                oq5Var.p(false);
                r = oq5Var.r();
                if (r != null) {
                    final int i2 = 0;
                    function2 = new Function2(pmuVar, i, i2) { // from class: x8q
                        public final /* synthetic */ int a;
                        public final /* synthetic */ pmu b;

                        {
                            this.a = i2;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i3 = this.a;
                            hq5 hq5Var2 = (hq5) obj;
                            ((Integer) obj2).getClass();
                            switch (i3) {
                                case 0:
                                    e9q.h(this.b, hq5Var2, rvf.R(1));
                                    break;
                                default:
                                    e9q.h(this.b, hq5Var2, rvf.R(1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    r.d = function2;
                }
                return;
            }
            oq5Var.Z(-1587096535);
            oq5Var.p(false);
            p1g.a(pmuVar.b, null, f2, null, null, b2c.f, hd6.a, 0.0f, null, 0, oq5Var, 1769520, 920);
        }
        r = oq5Var.r();
        if (r != null) {
            final int i3 = 1;
            function2 = new Function2(pmuVar, i, i3) { // from class: x8q
                public final /* synthetic */ int a;
                public final /* synthetic */ pmu b;

                {
                    this.a = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i32 = this.a;
                    hq5 hq5Var2 = (hq5) obj;
                    ((Integer) obj2).getClass();
                    switch (i32) {
                        case 0:
                            e9q.h(this.b, hq5Var2, rvf.R(1));
                            break;
                        default:
                            e9q.h(this.b, hq5Var2, rvf.R(1));
                            break;
                    }
                    return Unit.a;
                }
            };
            r.d = function2;
        }
    }

    public static final void i(int i, int i2, hq5 hq5Var, yci yciVar, boolean z, boolean z2) {
        int i3;
        int i4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-33907551);
        if ((i & 6) == 0) {
            i3 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 = i3 | 384;
        } else {
            i4 = i3 | (oq5Var.f(yciVar) ? 256 : 128);
        }
        if ((i4 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (i5 != 0) {
                yciVar = vci.a;
            }
            ivf.k(i4 & 14, 0, oq5Var, xp3.u(d.e(d.d(yciVar, 1.0f), nnu.c(z2, oq5Var)), o5g.D(oq5Var)), z);
        }
        yci yciVar2 = yciVar;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lsj(z, z2, yciVar2, i, i2, 1);
        }
    }

    public static final void j(String str, boolean z, float f, d85 d85Var, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-111902923);
        if ((((oq5Var.f(str) ? 4 : 2) | i | (oq5Var.g(z) ? 32 : 16) | (oq5Var.c(f) ? 256 : 128) | (oq5Var.f(d85Var) ? 2048 : 1024)) & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            etn.l(es5.n.a(xof.a), ild.C(1528013429, new w8q(f, str, z, d85Var), oq5Var), oq5Var, 56);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new w8q(str, z, f, d85Var, i);
        }
    }
}
