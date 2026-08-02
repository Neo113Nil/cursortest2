package androidx.compose.animation;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.al0;
import defpackage.aqi;
import defpackage.azt;
import defpackage.b2c;
import defpackage.bl0;
import defpackage.d5;
import defpackage.d8t;
import defpackage.dnq;
import defpackage.edi;
import defpackage.ezd;
import defpackage.g0g;
import defpackage.g40;
import defpackage.gl0;
import defpackage.gq5;
import defpackage.hl0;
import defpackage.hq5;
import defpackage.i8t;
import defpackage.ild;
import defpackage.kb5;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.s2r;
import defpackage.szf;
import defpackage.t7t;
import defpackage.tpi;
import defpackage.ul0;
import defpackage.vci;
import defpackage.vk0;
import defpackage.vnj;
import defpackage.vso;
import defpackage.wn5;
import defpackage.wp5;
import defpackage.x6k;
import defpackage.xci;
import defpackage.xmn;
import defpackage.xp3;
import defpackage.xp5;
import defpackage.xz0;
import defpackage.yci;
import defpackage.zd6;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ListIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        long j = Integer.MIN_VALUE;
        a = (j & 4294967295L) | (j << 32);
    }

    public static final void a(d8t d8tVar, yci yciVar, Function1 function1, g40 g40Var, Function1 function12, wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        Function1 function13;
        oq5 oq5Var;
        hl0 hl0Var;
        s2r s2rVar;
        final hl0 hl0Var2;
        final t7t t7tVar;
        boolean z;
        d8t d8tVar2 = d8tVar;
        Function1 function14 = function1;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-114689412);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(d8tVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.h(function14) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.f(g40Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.h(function12) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        wn5 wn5Var2 = wn5Var;
        if ((196608 & i) == 0) {
            i2 |= oq5Var2.h(wn5Var2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if (oq5Var2.P(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object K = oq5Var2.K();
            Object obj = gq5.a;
            if (z2 || K == obj) {
                K = new hl0(d8tVar2, g40Var);
                oq5Var2.k0(K);
            }
            hl0 hl0Var3 = (hl0) K;
            boolean z3 = i3 == 4;
            Object K2 = oq5Var2.K();
            Object obj2 = K2;
            if (z3 || K2 == obj) {
                Object[] objArr = {d8tVar2.c()};
                s2r s2rVar2 = new s2r();
                s2rVar2.addAll(xz0.X(objArr));
                oq5Var2.k0(s2rVar2);
                obj2 = s2rVar2;
            }
            s2r s2rVar3 = (s2r) obj2;
            boolean z4 = i3 == 4;
            Object K3 = oq5Var2.K();
            if (z4 || K3 == obj) {
                long[] jArr = vso.a;
                K3 = new tpi();
                oq5Var2.k0(K3);
            }
            tpi tpiVar = (tpi) K3;
            Object c = d8tVar2.c();
            x6k x6kVar = d8tVar2.d;
            if (!s2rVar3.contains(c)) {
                s2rVar3.clear();
                s2rVar3.add(d8tVar2.c());
            }
            if (Intrinsics.d(d8tVar2.c(), x6kVar.getValue())) {
                if (s2rVar3.size() != 1 || !Intrinsics.d(s2rVar3.get(0), d8tVar2.c())) {
                    s2rVar3.clear();
                    s2rVar3.add(d8tVar2.c());
                }
                if (tpiVar.e != 1 || tpiVar.c(d8tVar2.c())) {
                    tpiVar.a();
                }
                hl0Var3.b = g40Var;
            }
            if (!Intrinsics.d(d8tVar2.c(), x6kVar.getValue()) && !s2rVar3.contains(x6kVar.getValue())) {
                ListIterator listIterator = s2rVar3.listIterator();
                int i4 = 0;
                while (true) {
                    ezd ezdVar = (ezd) listIterator;
                    if (!ezdVar.hasNext()) {
                        i4 = -1;
                        break;
                    }
                    Object invoke = function12.invoke(ezdVar.next());
                    ListIterator listIterator2 = listIterator;
                    if (Intrinsics.d(invoke, function12.invoke(x6kVar.getValue()))) {
                        break;
                    }
                    i4++;
                    listIterator = listIterator2;
                }
                if (i4 == -1) {
                    s2rVar3.add(x6kVar.getValue());
                } else {
                    s2rVar3.set(i4, x6kVar.getValue());
                }
            }
            if (tpiVar.c(x6kVar.getValue()) && tpiVar.c(d8tVar2.c())) {
                oq5Var2.Z(919489879);
                oq5Var2.p(false);
                function13 = function14;
                hl0Var = hl0Var3;
            } else {
                oq5Var2.Z(916905750);
                tpiVar.a();
                int size = s2rVar3.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj3 = s2rVar3.get(i5);
                    tpiVar.m(obj3, ild.C(885640742, new ul0(d8tVar2, obj3, function14, hl0Var3, s2rVar3, wn5Var2), oq5Var2));
                    i5++;
                    d8tVar2 = d8tVar;
                    function14 = function14;
                    wn5Var2 = wn5Var;
                }
                function13 = function14;
                hl0Var = hl0Var3;
                oq5Var2.p(false);
            }
            boolean f = oq5Var2.f(d8tVar.f()) | oq5Var2.f(hl0Var);
            Object K4 = oq5Var2.K();
            if (f || K4 == obj) {
                K4 = (zd6) function13.invoke(hl0Var);
                oq5Var2.k0(K4);
            }
            zd6 zd6Var = (zd6) K4;
            d8t d8tVar3 = hl0Var.a;
            boolean f2 = oq5Var2.f(hl0Var);
            Object K5 = oq5Var2.K();
            if (f2 || K5 == obj) {
                K5 = szf.g0(Boolean.FALSE);
                oq5Var2.k0(K5);
            }
            aqi aqiVar = (aqi) K5;
            final aqi o0 = szf.o0(zd6Var.d, oq5Var2);
            if (Intrinsics.d(d8tVar3.c(), d8tVar3.d.getValue())) {
                aqiVar.setValue(Boolean.FALSE);
            } else if (o0.getValue() != null) {
                aqiVar.setValue(Boolean.TRUE);
            }
            boolean booleanValue = ((Boolean) aqiVar.getValue()).booleanValue();
            yci yciVar2 = vci.a;
            if (booleanValue) {
                oq5Var2.Z(249676467);
                hl0 hl0Var4 = hl0Var;
                s2rVar = s2rVar3;
                oq5Var = oq5Var2;
                hl0Var2 = hl0Var4;
                t7tVar = i8t.b(hl0Var4.a, azt.h, null, oq5Var, 0, 2);
                boolean f3 = oq5Var.f(t7tVar);
                Object K6 = oq5Var.K();
                if (f3 || K6 == obj) {
                    dnq dnqVar = (dnq) o0.getValue();
                    if (dnqVar == null || dnqVar.a) {
                        yciVar2 = xp3.v(yciVar2);
                    }
                    oq5Var.k0(yciVar2);
                    K6 = yciVar2;
                }
                yciVar2 = (yci) K6;
                oq5Var.p(false);
            } else {
                s2rVar = s2rVar3;
                oq5Var = oq5Var2;
                hl0Var2 = hl0Var;
                oq5Var.Z(249942509);
                oq5Var.p(false);
                t7tVar = null;
            }
            yci f4 = yciVar.f(yciVar2.f(new edi(t7tVar, o0, hl0Var2) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierElement
                public final t7t a;
                public final aqi b;
                public final hl0 c;

                {
                    this.a = t7tVar;
                    this.b = o0;
                    this.c = hl0Var2;
                }

                @Override // defpackage.edi
                public final xci e() {
                    gl0 gl0Var = new gl0(1);
                    gl0Var.p = this.a;
                    gl0Var.q = this.b;
                    gl0Var.r = this.c;
                    gl0Var.s = a.a;
                    return gl0Var;
                }

                public final boolean equals(Object obj4) {
                    if (!(obj4 instanceof AnimatedContentTransitionScopeImpl$SizeModifierElement)) {
                        return false;
                    }
                    AnimatedContentTransitionScopeImpl$SizeModifierElement animatedContentTransitionScopeImpl$SizeModifierElement = (AnimatedContentTransitionScopeImpl$SizeModifierElement) obj4;
                    return Intrinsics.d(animatedContentTransitionScopeImpl$SizeModifierElement.a, this.a) && animatedContentTransitionScopeImpl$SizeModifierElement.b.equals(this.b);
                }

                public final int hashCode() {
                    int hashCode = this.c.hashCode() * 31;
                    t7t t7tVar2 = this.a;
                    return this.b.hashCode() + ((hashCode + (t7tVar2 != null ? t7tVar2.hashCode() : 0)) * 31);
                }

                @Override // defpackage.edi
                public final void j(xci xciVar) {
                    gl0 gl0Var = (gl0) xciVar;
                    gl0Var.p = this.a;
                    gl0Var.q = this.b;
                    gl0Var.r = this.c;
                }
            }));
            Object K7 = oq5Var.K();
            if (K7 == obj) {
                K7 = new bl0(hl0Var2);
                oq5Var.k0(K7);
            }
            bl0 bl0Var = (bl0) K7;
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, f4);
            xp5.T.getClass();
            Function0 function0 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(function0);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, bl0Var, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            oq5Var.Z(-1490874326);
            int size2 = s2rVar.size();
            int i7 = 0;
            while (i7 < size2) {
                s2r s2rVar4 = s2rVar;
                Object obj4 = s2rVar4.get(i7);
                oq5Var.W(1908442329, function12.invoke(obj4));
                Function2 function2 = (Function2) tpiVar.g(obj4);
                if (function2 == null) {
                    oq5Var.Z(-967793488);
                    z = false;
                } else {
                    z = false;
                    oq5Var.Z(1908443505);
                    function2.invoke(oq5Var, 0);
                }
                oq5Var.p(z);
                oq5Var.p(z);
                i7++;
                s2rVar = s2rVar4;
            }
            oq5Var.p(false);
            oq5Var.p(true);
        } else {
            function13 = function14;
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new al0(d8tVar, yciVar, function13, g40Var, function12, wn5Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(Object obj, yci yciVar, Function1 function1, g40 g40Var, String str, Function1 function12, wn5 wn5Var, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        int i4;
        g40 g40Var2;
        int i5;
        Function1 function13;
        yci yciVar3;
        g40 g40Var3;
        Function1 function14;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2132720749);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? oq5Var.f(obj) : oq5Var.h(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= oq5Var.h(function1) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                g40Var2 = g40Var;
                i3 |= oq5Var.f(g40Var2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    i3 |= oq5Var.f(str) ? 16384 : RemoteCameraConfig.Notification.ID;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    function13 = function12;
                    i3 |= oq5Var.h(function13) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                    if ((1572864 & i) == 0) {
                        i3 |= oq5Var.h(wn5Var) ? 1048576 : 524288;
                    }
                    if (oq5Var.P(i3 & 1, (599187 & i3) == 599186)) {
                        oq5Var.S();
                        yciVar3 = yciVar2;
                        g40Var3 = g40Var2;
                        function14 = function13;
                    } else {
                        yci yciVar4 = i6 != 0 ? vci.a : yciVar2;
                        g40 g40Var4 = i4 != 0 ? b2c.b : g40Var2;
                        if (i5 != 0) {
                            function13 = d5.X;
                        }
                        d8t e = i8t.e(obj, str, oq5Var, (i3 & 14) | ((i3 >> 9) & 112), 0);
                        int i7 = i3 & 8176;
                        int i8 = i3 >> 3;
                        Function1 function15 = function13;
                        a(e, yciVar4, function1, g40Var4, function15, wn5Var, oq5Var, i7 | (57344 & i8) | (i8 & 458752));
                        yciVar3 = yciVar4;
                        g40Var3 = g40Var4;
                        function14 = function15;
                    }
                    r = oq5Var.r();
                    if (r == null) {
                        r.d = new vk0(obj, yciVar3, function1, g40Var3, str, function14, wn5Var, i, i2);
                        return;
                    }
                    return;
                }
                function13 = function12;
                if ((1572864 & i) == 0) {
                }
                if (oq5Var.P(i3 & 1, (599187 & i3) == 599186)) {
                }
                r = oq5Var.r();
                if (r == null) {
                }
            }
            g40Var2 = g40Var;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            function13 = function12;
            if ((1572864 & i) == 0) {
            }
            if (oq5Var.P(i3 & 1, (599187 & i3) == 599186)) {
            }
            r = oq5Var.r();
            if (r == null) {
            }
        }
        yciVar2 = yciVar;
        if ((i & 384) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        g40Var2 = g40Var;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        function13 = function12;
        if ((1572864 & i) == 0) {
        }
        if (oq5Var.P(i3 & 1, (599187 & i3) == 599186)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }
}
