package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.runtime.internal.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes5.dex */
public abstract class ff7 {
    public static final char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'};
    public static final wn5 b = new wn5(new io5(0), 92618664, false);
    public static final wn5 c = new wn5(new po5(6), 50000908, false);
    public static final wn5 d = new wn5(new bp5(24), -820384586, false);
    public static final wn5 e = new wn5(new bp5(25), 1298666389, false);
    public static final wn5 f = new wn5(new bp5(26), -877249932, false);
    public static final wn5 g = new wn5(new ap5(9), -154720258, false);
    public static final wn5 h = new wn5(new bp5(27), 1128070351, false);
    public static final String[] i = {"http", "https"};
    public static final boolean[] j = new boolean[3];
    public static final Object k = new Object();
    public static boolean l;
    public static int m;
    public static volatile xzi n;
    public static volatile jzi o;

    public static final String B(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final t9f C(t9f t9fVar) {
        t9fVar.getClass();
        return t9fVar.getDescriptor().c() ? t9fVar : new zgj(t9fVar);
    }

    public static final List D(String str) {
        List split$default;
        if (str == null || str.length() == 0) {
            return c5b.a;
        }
        split$default = StringsKt__StringsKt.split$default(StringsKt.a0(str, "#|"), new String[]{"#|,"}, false, 0, 6, null);
        return split$default;
    }

    public static final List E(String str) {
        List split$default;
        if (str == null || str.length() == 0) {
            return c5b.a;
        }
        split$default = StringsKt__StringsKt.split$default(StringsKt.a0(str, "#|"), new String[]{"#|,"}, false, 0, 6, null);
        List<String> list = split$default;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        for (String str2 : list) {
            if (Intrinsics.d(str2, "null")) {
                str2 = null;
            }
            arrayList.add(str2);
        }
        return arrayList;
    }

    public static final boolean F(tg5 tg5Var) {
        tg5Var.getClass();
        if (!(tg5Var instanceof rg5)) {
            if (tg5Var.equals(sg5.a)) {
                return false;
            }
            b6e.s();
            return false;
        }
        rg5 rg5Var = (rg5) tg5Var;
        LinkedHashSet<xh5> i2 = wop.i(rg5Var.a, rg5Var.b);
        if (i2.isEmpty()) {
            return false;
        }
        for (xh5 xh5Var : i2) {
            if (!(xh5Var instanceof dh5) && !(xh5Var instanceof kh5) && !(xh5Var instanceof lh5)) {
                if ((xh5Var instanceof mh5) || (xh5Var instanceof ph5) || (xh5Var instanceof vh5)) {
                    return true;
                }
                b6e.s();
                return false;
            }
        }
        return false;
    }

    public static final boolean G(dpc dpcVar) {
        mpf mpfVar;
        f8j f8jVar;
        mpf mpfVar2;
        f8j f8jVar2 = dpcVar.h;
        return (f8jVar2 == null || (mpfVar = f8jVar2.l) == null || !mpfVar.H() || (f8jVar = dpcVar.h) == null || (mpfVar2 = f8jVar.l) == null || !mpfVar2.G()) ? false : true;
    }

    public static final boolean H(Context context) {
        context.getClass();
        AccessibilityManager a2 = l1b.a(context);
        return a2.isEnabled() && a2.isTouchExplorationEnabled();
    }

    public static xzi I(Context context) {
        xzi xziVar;
        jzi jziVar;
        xzi xziVar2 = n;
        if (xziVar2 != null) {
            return xziVar2;
        }
        synchronized (xzi.class) {
            try {
                xziVar = n;
                if (xziVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    jzi jziVar2 = o;
                    if (jziVar2 == null) {
                        synchronized (jzi.class) {
                            try {
                                jziVar = o;
                                if (jziVar == null) {
                                    jziVar = new jzi(new oif(applicationContext));
                                    o = jziVar;
                                }
                            } finally {
                            }
                        }
                        jziVar2 = jziVar;
                    }
                    xziVar = new xzi(jziVar2, new hs4(20));
                    n = xziVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return xziVar;
    }

    public static LinkedHashMap J(int i2) {
        return new LinkedHashMap(i2 < 3 ? i2 + 1 : i2 < 1073741824 ? (int) ((i2 / 0.75f) + 1.0f) : Integer.MAX_VALUE);
    }

    public static final int K(float f2, hq5 hq5Var) {
        return ((jx7) ((oq5) hq5Var).j(es5.h)).L(f2);
    }

    public static final Object L(Function0 function0) {
        Looper mainLooper = Looper.getMainLooper();
        if (Intrinsics.d(mainLooper, Looper.myLooper())) {
            return function0.invoke();
        }
        AtomicReference atomicReference = new AtomicReference(null);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Handler(mainLooper).post(new cy1(5, atomicReference, function0, countDownLatch));
        countDownLatch.await();
        Object obj = atomicReference.get();
        if (obj != null) {
            return obj;
        }
        xq0.q("There is a bug with lock used in runOnUiSafe function");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x009d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d((defpackage.gtf) r5.d(r0), (defpackage.gtf) r10.d(r0)) != false) goto L97;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object M(dpc dpcVar, int i2, Function1 function1) {
        int i3;
        int i4;
        Object obj;
        xci xciVar;
        cr crVar;
        if (!dpcVar.a.n) {
            sme.b("visitAncestors called on an unattached node");
        }
        xci xciVar2 = dpcVar.a.e;
        mpf F = bcx.F(dpcVar);
        loop0: while (true) {
            i3 = 0;
            i4 = 1;
            obj = null;
            if (F == null) {
                xciVar = null;
                break;
            }
            if ((((xci) F.F.f).d & 1024) != 0) {
                while (xciVar2 != null) {
                    if ((xciVar2.c & 1024) != 0) {
                        xciVar = xciVar2;
                        eqi eqiVar = null;
                        while (xciVar != null) {
                            if (xciVar instanceof dpc) {
                                break loop0;
                            }
                            if ((xciVar.c & 1024) != 0 && (xciVar instanceof cw7)) {
                                int i5 = 0;
                                for (xci xciVar3 = ((cw7) xciVar).p; xciVar3 != null; xciVar3 = xciVar3.f) {
                                    if ((xciVar3.c & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            xciVar = xciVar3;
                                        } else {
                                            if (eqiVar == null) {
                                                eqiVar = new eqi(new xci[16]);
                                            }
                                            if (xciVar != null) {
                                                eqiVar.d(xciVar);
                                                xciVar = null;
                                            }
                                            eqiVar.d(xciVar3);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            xciVar = bcx.p(eqiVar);
                        }
                    }
                    xciVar2 = xciVar2.e;
                }
            }
            F = F.u();
            xciVar2 = (F == null || (crVar = F.F) == null) ? null : (i4s) crVar.e;
        }
        dpc dpcVar2 = (dpc) xciVar;
        if (dpcVar2 != null) {
            pzm pzmVar = ez2.a;
        }
        gtf gtfVar = (gtf) dpcVar.d(ez2.a);
        if (gtfVar != null) {
            int i6 = 5;
            if (i2 != 5) {
                i6 = 6;
                if (i2 != 6) {
                    i6 = 3;
                    if (i2 != 3) {
                        i6 = 4;
                        if (i2 != 4) {
                            if (i2 == 1) {
                                i4 = 2;
                            } else if (i2 != 2) {
                                xq0.q("Unsupported direction for beyond bounds layout");
                                return null;
                            }
                            if (gtfVar.o.a() > 0 || !gtfVar.o.c() || !gtfVar.n) {
                                return function1.invoke(gtf.s);
                            }
                            boolean T0 = gtfVar.T0(i4);
                            htf htfVar = gtfVar.o;
                            int e2 = T0 ? htfVar.e() : htfVar.d();
                            xqn xqnVar = new xqn();
                            oxa oxaVar = gtfVar.p;
                            oxaVar.getClass();
                            dtf dtfVar = new dtf(e2, e2);
                            ((eqi) oxaVar.b).d(dtfVar);
                            xqnVar.a = dtfVar;
                            int b2 = gtfVar.o.b() * 2;
                            int a2 = gtfVar.o.a();
                            if (b2 > a2) {
                                b2 = a2;
                            }
                            while (obj == null && gtfVar.S0((dtf) xqnVar.a, i4) && i3 < b2) {
                                dtf dtfVar2 = (dtf) xqnVar.a;
                                int i7 = dtfVar2.a;
                                int i8 = dtfVar2.b;
                                if (gtfVar.T0(i4)) {
                                    i8++;
                                } else {
                                    i7--;
                                }
                                oxa oxaVar2 = gtfVar.p;
                                oxaVar2.getClass();
                                dtf dtfVar3 = new dtf(i7, i8);
                                ((eqi) oxaVar2.b).d(dtfVar3);
                                ((eqi) gtfVar.p.b).l((dtf) xqnVar.a);
                                xqnVar.a = dtfVar3;
                                i3++;
                                bcx.F(gtfVar).l();
                                obj = function1.invoke(new ftf(gtfVar, xqnVar, i4));
                            }
                            ((eqi) gtfVar.p.b).l((dtf) xqnVar.a);
                            bcx.F(gtfVar).l();
                            return obj;
                        }
                    }
                }
            }
            i4 = i6;
            if (gtfVar.o.a() > 0) {
            }
            return function1.invoke(gtf.s);
        }
        return null;
    }

    public static final void N(ekr ekrVar) {
        ekrVar.getClass();
        tkr tkrVar = tkr.a;
    }

    public static final String O(Continuation continuation) {
        Object t7oVar;
        if (continuation instanceof v98) {
            return ((v98) continuation).toString();
        }
        try {
            r7o r7oVar = z7o.b;
            t7oVar = continuation + '@' + B(continuation);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (z7o.a(t7oVar) != null) {
            t7oVar = continuation.getClass().getName() + '@' + B(continuation);
        }
        return (String) t7oVar;
    }

    public static final float P(long j2, hq5 hq5Var) {
        return ((jx7) ((oq5) hq5Var).j(es5.h)).p(j2);
    }

    public static final float Q(float f2, hq5 hq5Var) {
        return ((jx7) ((oq5) hq5Var).j(es5.h)).n0(f2);
    }

    public static final void a(int i2, hq5 hq5Var, yci yciVar, Function0 function0, boolean z) {
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-701726680);
        int i3 = (oq5Var.g(z) ? 4 : 2) | i2 | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            int i4 = i3 >> 3;
            aae.a(function0, yciVar, false, ild.C(-337575924, new sm(0, z), oq5Var), oq5Var, (i4 & 14) | 24576 | (i4 & 112), 12);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tm(z, function0, yciVar, i2, 0);
        }
    }

    public static final void b(String str, d85 d85Var, um0 um0Var, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        int i4;
        long j2;
        vci vciVar;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1044628993);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(d85Var) ? 32 : 16;
        }
        int i5 = i3;
        if ((i2 & 384) == 0) {
            i4 = (oq5Var.d(0) ? 256 : 128) | i5;
        } else {
            i4 = i5;
        }
        if ((i2 & 3072) == 0) {
            i4 |= oq5Var.d(um0Var.ordinal()) ? 2048 : 1024;
        }
        int i6 = i4 | 24576;
        if ((i6 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            vm0 b2 = fn0.b(0, 0.0f, um0Var, oq5Var, ((i6 >> 6) & 14) | ((i6 >> 3) & 896), 2);
            ges j3 = nu0.j();
            float p = w1g.p(j3, 3, oq5Var, 48, 0);
            vci vciVar2 = vci.a;
            yci e2 = d.e(vciVar2, p);
            kfh d2 = ug3.d(b2c.b, false);
            int i7 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, e2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var, i7, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (str == null) {
                oq5Var.Z(-930097944);
                oq5Var.p(false);
                vciVar = vciVar2;
            } else {
                oq5Var.Z(-930097943);
                yci o2 = androidx.compose.foundation.layout.a.o(vciVar2, 16, 0.0f, 2);
                boolean f2 = oq5Var.f(b2);
                Object K = oq5Var.K();
                if (f2 || K == gq5.a) {
                    K = new la1(b2, 6);
                    oq5Var.k0(K);
                }
                yci a2 = b.a.a(wyf.s(o2, (Function0) K), b2c.i);
                if (d85Var == null) {
                    oq5Var.Z(-2110104560);
                    j2 = ((dq0) oq5Var.j(eq0.a)).b.a;
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(-2110105583);
                    oq5Var.p(false);
                    j2 = d85Var.a;
                }
                vciVar = vciVar2;
                xv7.j(str, a2, j2, 0L, 0L, 3, 0L, 2, false, 3, 0, null, j3, oq5Var, i6 & 14, 3120, 55032);
                oq5Var = oq5Var;
                oq5Var.p(false);
            }
            oq5Var.p(true);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu(str, d85Var, false, um0Var, yciVar2, i2, 17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public static final void c(String str, String str2, d85 d85Var, um0 um0Var, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        int i4;
        iz2 iz2Var;
        boolean z;
        long j2;
        Object obj;
        vm0 vm0Var;
        kb5 kb5Var;
        kb5 kb5Var2;
        kb5 kb5Var3;
        grb grbVar;
        kb5 kb5Var4;
        iz2 iz2Var2;
        ?? r1;
        oq5 oq5Var;
        long j3;
        boolean z2;
        oq5 oq5Var2;
        oq5 oq5Var3;
        oq5 oq5Var4 = (oq5) hq5Var;
        oq5Var4.b0(406801513);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var4.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var4.f(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var4.f(d85Var) ? 256 : 128;
        }
        int i5 = i3;
        if ((i2 & 3072) == 0) {
            i4 = (oq5Var4.d(2) ? 2048 : 1024) | i5;
        } else {
            i4 = i5;
        }
        if ((i2 & 24576) == 0) {
            i4 |= oq5Var4.d(um0Var.ordinal()) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i4 |= oq5Var4.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i4) == 74898 && oq5Var4.z()) {
            oq5Var4.S();
            oq5Var3 = oq5Var4;
        } else {
            vm0 b2 = fn0.b(2, 0.0f, um0Var, oq5Var4, ((i4 >> 9) & 14) | ((i4 >> 6) & 896), 2);
            ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var4, 48);
            int i6 = oq5Var4.P;
            a l2 = oq5Var4.l();
            yci H = vnj.H(oq5Var4, yciVar);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var4.d0();
            if (oq5Var4.O) {
                oq5Var4.k(grbVar2);
            } else {
                oq5Var4.n0();
            }
            kb5 kb5Var5 = wp5.f;
            g0g.U(oq5Var4, a2, kb5Var5);
            kb5 kb5Var6 = wp5.e;
            g0g.U(oq5Var4, l2, kb5Var6);
            kb5 kb5Var7 = wp5.g;
            if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var4, i6, kb5Var7);
            }
            kb5 kb5Var8 = wp5.d;
            g0g.U(oq5Var4, H, kb5Var8);
            float f2 = 8;
            float p = w1g.p(nu0.j(), 2, oq5Var4, 48, 0) + f2;
            vci vciVar = vci.a;
            yci e2 = d.e(vciVar, p);
            iz2 iz2Var3 = b2c.b;
            kfh d2 = ug3.d(iz2Var3, false);
            int i7 = oq5Var4.P;
            a l3 = oq5Var4.l();
            yci H2 = vnj.H(oq5Var4, e2);
            oq5Var4.d0();
            if (oq5Var4.O) {
                oq5Var4.k(grbVar2);
            } else {
                oq5Var4.n0();
            }
            g0g.U(oq5Var4, d2, kb5Var5);
            g0g.U(oq5Var4, l3, kb5Var6);
            if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var4, i7, kb5Var7);
            }
            g0g.U(oq5Var4, H2, kb5Var8);
            Object obj2 = gq5.a;
            if (str2 == null) {
                oq5Var4.Z(862937569);
                oq5Var4.p(false);
                obj = obj2;
                vm0Var = b2;
                kb5Var = kb5Var6;
                kb5Var2 = kb5Var8;
                r1 = 0;
                kb5Var3 = kb5Var7;
                iz2Var2 = iz2Var3;
                grbVar = grbVar2;
                kb5Var4 = kb5Var5;
                oq5Var = oq5Var4;
            } else {
                oq5Var4.Z(862937570);
                yci o2 = androidx.compose.foundation.layout.a.o(b.a.a(vciVar, b2c.i), 16, 0.0f, 2);
                boolean f3 = oq5Var4.f(b2);
                Object K = oq5Var4.K();
                if (f3 || K == obj2) {
                    K = new la1(b2, 7);
                    oq5Var4.k0(K);
                }
                yci s = wyf.s(o2, (Function0) K);
                ges j4 = nu0.j();
                if (d85Var == null) {
                    oq5Var4.Z(-1861238738);
                    iz2Var = iz2Var3;
                    j2 = ((dq0) oq5Var4.j(eq0.a)).b.a;
                    z = false;
                    oq5Var4.p(false);
                } else {
                    iz2Var = iz2Var3;
                    z = false;
                    oq5Var4.Z(-1861239761);
                    oq5Var4.p(false);
                    j2 = d85Var.a;
                }
                obj = obj2;
                vm0Var = b2;
                kb5Var = kb5Var6;
                kb5Var2 = kb5Var8;
                kb5Var3 = kb5Var7;
                grbVar = grbVar2;
                kb5Var4 = kb5Var5;
                iz2Var2 = iz2Var;
                xv7.j(str2, s, j2, 0L, 0L, 3, 0L, 2, false, 2, 0, null, j4, oq5Var4, 0, 3120, 55032);
                oq5 oq5Var5 = oq5Var4;
                r1 = 0;
                eta.p(vciVar, f2, oq5Var5, false);
                oq5Var = oq5Var5;
            }
            oq5Var.p(true);
            ges e3 = nu0.e();
            yci e4 = d.e(vciVar, w1g.p(e3, 2, oq5Var, 48, r1));
            kfh d3 = ug3.d(iz2Var2, r1);
            int i8 = oq5Var.P;
            a l4 = oq5Var.l();
            yci H3 = vnj.H(oq5Var, e4);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d3, kb5Var4);
            g0g.U(oq5Var, l4, kb5Var);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                ouj.x(i8, oq5Var, i8, kb5Var3);
            }
            g0g.U(oq5Var, H3, kb5Var2);
            if (str == null) {
                oq5Var.Z(404877323);
                oq5Var.p(r1);
                z2 = true;
                oq5Var2 = oq5Var;
            } else {
                oq5Var.Z(404877324);
                yci o3 = androidx.compose.foundation.layout.a.o(vciVar, 16, 0.0f, 2);
                vm0 vm0Var2 = vm0Var;
                boolean f4 = oq5Var.f(vm0Var2);
                Object K2 = oq5Var.K();
                if (f4 || K2 == obj) {
                    K2 = new la1(vm0Var2, 8);
                    oq5Var.k0(K2);
                }
                yci s2 = wyf.s(o3, (Function0) K2);
                if (d85Var == null) {
                    oq5Var.Z(540869541);
                    j3 = ((dq0) oq5Var.j(eq0.a)).b.a;
                    oq5Var.p(r1);
                } else {
                    oq5Var.Z(540868518);
                    oq5Var.p(r1);
                    j3 = d85Var.a;
                }
                oq5 oq5Var6 = oq5Var;
                xv7.j(str, s2, j3, 0L, 0L, 3, 0L, 2, false, 2, 0, null, e3, oq5Var6, 0, 3120, 55032);
                oq5 oq5Var7 = oq5Var6;
                oq5Var7.p(false);
                z2 = true;
                oq5Var2 = oq5Var7;
            }
            oq5Var2.p(z2);
            oq5Var2.p(z2);
            oq5Var3 = oq5Var2;
        }
        xmn r = oq5Var3.r();
        if (r != null) {
            r.d = new tu(i2, 4, str, str2, d85Var, um0Var, yciVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    public static final void d(fe3 fe3Var, d85 d85Var, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        int i4;
        vci vciVar;
        ?? r1;
        List list;
        oq5 oq5Var;
        kb5 kb5Var;
        float f2;
        float f3;
        boolean z;
        oq5 oq5Var2;
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(-1056654481);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var3.f(fe3Var) : oq5Var3.h(fe3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var3.f(d85Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var3.f(yciVar) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && oq5Var3.z()) {
            oq5Var3.S();
            oq5Var2 = oq5Var3;
        } else {
            ta5 a2 = sa5.a(qx0.g(16), b2c.n, oq5Var3, 6);
            int i5 = oq5Var3.P;
            a l2 = oq5Var3.l();
            yci H = vnj.H(oq5Var3, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var3.d0();
            if (oq5Var3.O) {
                oq5Var3.k(grbVar);
            } else {
                oq5Var3.n0();
            }
            kb5 kb5Var2 = wp5.f;
            g0g.U(oq5Var3, a2, kb5Var2);
            kb5 kb5Var3 = wp5.e;
            g0g.U(oq5Var3, l2, kb5Var3);
            kb5 kb5Var4 = wp5.g;
            if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var3, i5, kb5Var4);
            }
            kb5 kb5Var5 = wp5.d;
            g0g.U(oq5Var3, H, kb5Var5);
            List list2 = fe3Var.a;
            ge3 ge3Var = (ge3) CollectionsKt.S(list2, 0);
            vci vciVar2 = vci.a;
            if (ge3Var == null) {
                oq5Var3.Z(-734449693);
                oq5Var3.p(false);
                i4 = i3;
                list = list2;
                r1 = 0;
                vciVar = vciVar2;
                oq5Var = oq5Var3;
            } else {
                oq5Var3.Z(-734449692);
                int i6 = ((i3 << 3) & 896) | 3072;
                i4 = i3;
                vciVar = vciVar2;
                r1 = 0;
                list = list2;
                m(ge3Var.a, ge3Var.b, d85Var, d.d(vciVar2, 1.0f), oq5Var3, i6);
                oq5 oq5Var4 = oq5Var3;
                oq5Var4.p(false);
                oq5Var = oq5Var4;
            }
            ge3 ge3Var2 = (ge3) CollectionsKt.S(list, 1);
            if (ge3Var2 == null) {
                oq5Var.Z(-734160680);
                oq5Var.p(r1);
                kb5Var = kb5Var5;
                f2 = 1.0f;
            } else {
                oq5Var.Z(-734160679);
                kb5Var = kb5Var5;
                f2 = 1.0f;
                h(ge3Var2.a, ge3Var2.b, d85Var, 1, d.d(vciVar, 1.0f), oq5Var, ((i4 << 3) & 896) | 27648);
                oq5Var.p(r1);
            }
            yci d2 = d.d(vciVar, f2);
            nho a3 = lho.a(qx0.a, b2c.k, oq5Var, r1);
            int i7 = oq5Var.P;
            a l3 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, d2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var2);
            g0g.U(oq5Var, l3, kb5Var3);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var, i7, kb5Var4);
            }
            g0g.U(oq5Var, H2, kb5Var);
            ge3 ge3Var3 = (ge3) CollectionsKt.S(list, 2);
            if (ge3Var3 == null) {
                oq5Var.Z(195992251);
                oq5Var.p(r1);
                f3 = Float.MAX_VALUE;
                z = true;
            } else {
                oq5Var.Z(195992252);
                String str = ge3Var3.a;
                String str2 = ge3Var3.b;
                f3 = Float.MAX_VALUE;
                if (1.0f <= 0.0d) {
                    qme.a("invalid weight; must be greater than zero");
                }
                z = true;
                h(str, str2, d85Var, 2, new LayoutWeightElement(true, 1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f), oq5Var, ((i4 << 3) & 896) | 3072);
                oq5Var.p(r1);
            }
            ge3 ge3Var4 = (ge3) CollectionsKt.S(list, 3);
            if (ge3Var4 == null) {
                oq5Var.Z(196353184);
            } else {
                oq5Var.Z(196353185);
                u1g.l(oq5Var, d.r(vciVar, 5));
                String str3 = ge3Var4.a;
                String str4 = ge3Var4.b;
                if (1.0f <= 0.0d) {
                    qme.a("invalid weight; must be greater than zero");
                }
                h(str3, str4, d85Var, 2, new LayoutWeightElement(z, 1.0f > f3 ? f3 : 1.0f), oq5Var, ((i4 << 3) & 896) | 3072);
            }
            oq5Var.p(r1);
            oq5Var.p(z);
            oq5Var.p(z);
            oq5Var2 = oq5Var;
        }
        xmn r = oq5Var2.r();
        if (r != null) {
            r.d = new b3(fe3Var, d85Var, yciVar, i2, 23);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(o54 o54Var, j54 j54Var, hvq hvqVar, um0 um0Var, d85 d85Var, boolean z, yci yciVar, zsq zsqVar, o3k o3kVar, hq5 hq5Var, int i2, int i3) {
        int i4;
        o3k o3kVar2;
        int i5;
        o3k o3kVar3;
        kjn kjnVar;
        o3k o3kVar4;
        o3k o3kVar5;
        boolean z2;
        boolean f2;
        Object K;
        kjn kjnVar2;
        int i6;
        int i7;
        g24 g24Var;
        boolean z3;
        kjn kjnVar3;
        boolean z4;
        boolean z5;
        zsq zsqVar2;
        o3k o3kVar6;
        yci yciVar2;
        o3k o3kVar7;
        zsq zsqVar3;
        xmn r;
        hvqVar.getClass();
        um0Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-808295709);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? oq5Var.f(o54Var) : oq5Var.h(o54Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var.h(hvqVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= oq5Var.d(um0Var.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= oq5Var.f(d85Var) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i4 |= oq5Var.g(z) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i8 = 1572864 | i4;
        int i9 = i3 & 128;
        if (i9 != 0) {
            i8 = 14155776 | i4;
        } else if ((12582912 & i2) == 0) {
            i8 |= (16777216 & i2) == 0 ? oq5Var.f(zsqVar) : oq5Var.h(zsqVar) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        int i10 = i3 & 256;
        if (i10 != 0) {
            i8 |= 100663296;
        } else if ((100663296 & i2) == 0) {
            o3kVar2 = o3kVar;
            i8 |= oq5Var.f(o3kVar2) ? 67108864 : 33554432;
            i5 = i8;
            if ((38347907 & i5) == 38347906 || !oq5Var.z()) {
                zsq zsqVar4 = i9 == 0 ? null : zsqVar;
                o3kVar3 = i10 == 0 ? null : o3kVar2;
                int i11 = i5 >> 3;
                vm0 a2 = fn0.a(new act(1000, (kya) null, 6), 0.0f, um0Var, oq5Var, 6 | (i11 & 896), 2);
                kjnVar = gq5.a;
                if (o3kVar3 != null) {
                    oq5Var.Z(616922533);
                    int i12 = o54Var.c;
                    boolean z6 = (i5 & 14) == 4 || ((i5 & 8) != 0 && oq5Var.h(o54Var));
                    Object K2 = oq5Var.K();
                    if (z6 || K2 == kjnVar) {
                        K2 = new e54(o54Var, 0);
                        oq5Var.k0(K2);
                    }
                    o3kVar4 = r3k.b(i12, (Function0) K2, oq5Var, 0, 2);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(616922099);
                    oq5Var.p(false);
                    o3kVar4 = o3kVar3;
                }
                boolean booleanValue = ((Boolean) ksw.K(oq5Var).getValue()).booleanValue();
                if (!o54Var.b || z || booleanValue || o54Var.d.b.size() < 2) {
                    o3kVar5 = o3kVar4;
                    z2 = true;
                } else {
                    o3kVar5 = o3kVar4;
                    z2 = false;
                }
                vci vciVar = vci.a;
                yci c2 = d.c(vciVar, 1.0f);
                f2 = oq5Var.f(a2);
                K = oq5Var.K();
                if (!f2 || K == kjnVar) {
                    kjnVar2 = kjnVar;
                    K = new la1(a2, 9);
                    oq5Var.k0(K);
                } else {
                    kjnVar2 = kjnVar;
                }
                yci s = wyf.s(c2, (Function0) K);
                kfh d2 = ug3.d(b2c.f, false);
                i6 = oq5Var.P;
                a l2 = oq5Var.l();
                yci H = vnj.H(oq5Var, s);
                xp5.T.getClass();
                boolean z7 = z2;
                grb grbVar = wp5.b;
                oq5Var.d0();
                o3k o3kVar8 = o3kVar5;
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                kb5 kb5Var = wp5.f;
                g0g.U(oq5Var, d2, kb5Var);
                kb5 kb5Var2 = wp5.e;
                g0g.U(oq5Var, l2, kb5Var2);
                kb5 kb5Var3 = wp5.g;
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var, i6, kb5Var3);
                }
                kb5 kb5Var4 = wp5.d;
                g0g.U(oq5Var, H, kb5Var4);
                ta5 a3 = sa5.a(qx0.e, b2c.o, oq5Var, 54);
                i7 = oq5Var.P;
                a l3 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, vciVar);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, a3, kb5Var);
                g0g.U(oq5Var, l3, kb5Var2);
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                    ouj.x(i7, oq5Var, i7, kb5Var3);
                }
                g0g.U(oq5Var, H2, kb5Var4);
                g24Var = o54Var.e;
                if (g24Var != null) {
                    oq5Var.Z(-841596992);
                    oq5Var.p(false);
                    kjnVar3 = kjnVar2;
                    z5 = z7;
                    zsqVar2 = zsqVar4;
                    o3kVar6 = o3kVar8;
                    z4 = true;
                    z3 = false;
                } else {
                    oq5Var.Z(-841596991);
                    r(g24Var, um0Var, d85Var, oq5Var, i11 & 8064);
                    u1g.l(oq5Var, d.e(vciVar, 12));
                    zsq zsqVar5 = zsqVar4;
                    z3 = false;
                    kjnVar3 = kjnVar2;
                    z4 = true;
                    p(o54Var, o3kVar8, um0Var, z7, hvqVar, zsqVar5, oq5Var, (i5 & 7182) | ((i5 << 9) & 458752) | (i11 & 3670016));
                    z5 = z7;
                    zsqVar2 = zsqVar5;
                    oq5Var = oq5Var;
                    o3kVar6 = o3kVar8;
                    q(g24Var, d85Var, um0Var, null, oq5Var, ((i5 >> 9) & 112) | (i5 & 7168));
                    oq5Var.p(false);
                }
                oq5Var.p(z4);
                if (z5) {
                    oq5Var.Z(670442081);
                    int j2 = o3kVar6.j();
                    int n2 = o3kVar6.n();
                    yci a4 = b.a.a(vciVar, b2c.i);
                    m2k G = zdg.G(oq5Var);
                    Object K3 = oq5Var.K();
                    if (K3 == kjnVar3) {
                        K3 = new h14(7);
                        oq5Var.k0(K3);
                    }
                    oq5 oq5Var2 = oq5Var;
                    ivf.j(j2, null, (Function1) K3, n2, G, a4, oq5Var2, 432, 0);
                    oq5Var = oq5Var2;
                } else {
                    oq5Var.Z(664531993);
                }
                oq5Var.p(z3);
                oq5Var.p(z4);
                yciVar2 = vciVar;
                o3kVar7 = o3kVar3;
                zsqVar3 = zsqVar2;
            } else {
                oq5Var.S();
                yciVar2 = yciVar;
                zsqVar3 = zsqVar;
                o3kVar7 = o3kVar2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new bq(o54Var, j54Var, hvqVar, um0Var, d85Var, z, yciVar2, zsqVar3, o3kVar7, i2, i3, 1);
                return;
            }
            return;
        }
        o3kVar2 = o3kVar;
        i5 = i8;
        if ((38347907 & i5) == 38347906) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        int i112 = i5 >> 3;
        vm0 a22 = fn0.a(new act(1000, (kya) null, 6), 0.0f, um0Var, oq5Var, 6 | (i112 & 896), 2);
        kjnVar = gq5.a;
        if (o3kVar3 != null) {
        }
        boolean booleanValue2 = ((Boolean) ksw.K(oq5Var).getValue()).booleanValue();
        if (o54Var.b) {
        }
        o3kVar5 = o3kVar4;
        z2 = true;
        vci vciVar2 = vci.a;
        yci c22 = d.c(vciVar2, 1.0f);
        f2 = oq5Var.f(a22);
        K = oq5Var.K();
        if (f2) {
        }
        kjnVar2 = kjnVar;
        K = new la1(a22, 9);
        oq5Var.k0(K);
        yci s2 = wyf.s(c22, (Function0) K);
        kfh d22 = ug3.d(b2c.f, false);
        i6 = oq5Var.P;
        a l22 = oq5Var.l();
        yci H3 = vnj.H(oq5Var, s2);
        xp5.T.getClass();
        boolean z72 = z2;
        grb grbVar2 = wp5.b;
        oq5Var.d0();
        o3k o3kVar82 = o3kVar5;
        if (oq5Var.O) {
        }
        kb5 kb5Var5 = wp5.f;
        g0g.U(oq5Var, d22, kb5Var5);
        kb5 kb5Var22 = wp5.e;
        g0g.U(oq5Var, l22, kb5Var22);
        kb5 kb5Var32 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i6, oq5Var, i6, kb5Var32);
        kb5 kb5Var42 = wp5.d;
        g0g.U(oq5Var, H3, kb5Var42);
        ta5 a32 = sa5.a(qx0.e, b2c.o, oq5Var, 54);
        i7 = oq5Var.P;
        a l32 = oq5Var.l();
        yci H22 = vnj.H(oq5Var, vciVar2);
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, a32, kb5Var5);
        g0g.U(oq5Var, l32, kb5Var22);
        if (!oq5Var.O) {
        }
        ouj.x(i7, oq5Var, i7, kb5Var32);
        g0g.U(oq5Var, H22, kb5Var42);
        g24Var = o54Var.e;
        if (g24Var != null) {
        }
        oq5Var.p(z4);
        if (z5) {
        }
        oq5Var.p(z3);
        oq5Var.p(z4);
        yciVar2 = vciVar2;
        o3kVar7 = o3kVar3;
        zsqVar3 = zsqVar2;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(qs4 qs4Var, d85 d85Var, yci yciVar, hq5 hq5Var, int i2, int i3) {
        int i4;
        yci yciVar2;
        int i5;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-726973286);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? oq5Var.f(qs4Var) : oq5Var.h(qs4Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.f(d85Var) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var.f(yciVar2) ? 256 : 128;
            if ((i4 & 147) == 146 || !oq5Var.z()) {
                vci vciVar = vci.a;
                if (i6 != 0) {
                    yciVar2 = vciVar;
                }
                ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
                i5 = oq5Var.P;
                a l2 = oq5Var.l();
                yci H = vnj.H(oq5Var, yciVar2);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, a2, wp5.f);
                g0g.U(oq5Var, l2, wp5.e);
                kb5 kb5Var = wp5.g;
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var, i5, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                hps hpsVar = qs4Var.b;
                cce cceVar = (cce) oq5Var.j(tkg.a);
                if (!(((double) 1.0f) <= 0.0d)) {
                    qme.a("invalid weight; must be greater than zero");
                }
                s(hpsVar, cceVar, androidx.compose.foundation.layout.a.d(new LayoutWeightElement(false, 1.0f), 1.25f).f(new HorizontalAlignElement(b2c.o)), oq5Var, 0);
                u1g.l(oq5Var, d.e(vciVar, 40));
                float f2 = 16;
                d(qs4Var.c, d85Var, androidx.compose.foundation.layout.a.o(vciVar, f2, 0.0f, 2), oq5Var, (i4 & 112) | 384);
                eta.p(vciVar, f2, oq5Var, true);
            } else {
                oq5Var.S();
            }
            yci yciVar3 = yciVar2;
            r = oq5Var.r();
            if (r == null) {
                r.d = new lx(qs4Var, d85Var, yciVar3, i2, i3, 2);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((i4 & 147) == 146) {
        }
        vci vciVar2 = vci.a;
        if (i6 != 0) {
        }
        ta5 a22 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
        i5 = oq5Var.P;
        a l22 = oq5Var.l();
        yci H2 = vnj.H(oq5Var, yciVar2);
        xp5.T.getClass();
        grb grbVar2 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, a22, wp5.f);
        g0g.U(oq5Var, l22, wp5.e);
        kb5 kb5Var2 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i5, oq5Var, i5, kb5Var2);
        g0g.U(oq5Var, H2, wp5.d);
        hps hpsVar2 = qs4Var.b;
        cce cceVar2 = (cce) oq5Var.j(tkg.a);
        if (!(((double) 1.0f) <= 0.0d)) {
        }
        s(hpsVar2, cceVar2, androidx.compose.foundation.layout.a.d(new LayoutWeightElement(false, 1.0f), 1.25f).f(new HorizontalAlignElement(b2c.o)), oq5Var, 0);
        u1g.l(oq5Var, d.e(vciVar2, 40));
        float f22 = 16;
        d(qs4Var.c, d85Var, androidx.compose.foundation.layout.a.o(vciVar2, f22, 0.0f, 2), oq5Var, (i4 & 112) | 384);
        eta.p(vciVar2, f22, oq5Var, true);
        yci yciVar32 = yciVar2;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0280  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(ys4 ys4Var, ws4 ws4Var, hvq hvqVar, um0 um0Var, d85 d85Var, boolean z, yci yciVar, zsq zsqVar, o3k o3kVar, hq5 hq5Var, int i2, int i3) {
        int i4;
        d85 d85Var2;
        o3k o3kVar2;
        o3k o3kVar3;
        boolean z2;
        o3k o3kVar4;
        vci vciVar;
        boolean f2;
        Object K;
        zsq zsqVar2;
        int i5;
        boolean z3;
        o3k o3kVar5;
        vci vciVar2;
        boolean z4;
        zsq zsqVar3;
        yci yciVar2;
        zsq zsqVar4;
        xmn r;
        zsq zsqVar5 = zsqVar;
        hvqVar.getClass();
        um0Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1142035994);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? oq5Var.f(ys4Var) : oq5Var.h(ys4Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var.h(hvqVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= oq5Var.d(um0Var.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            d85Var2 = d85Var;
            i4 |= oq5Var.f(d85Var2) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            d85Var2 = d85Var;
        }
        if ((196608 & i2) == 0) {
            i4 |= oq5Var.g(z) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i6 = 1572864 | i4;
        int i7 = i3 & 128;
        if (i7 != 0) {
            i6 = 14155776 | i4;
        } else if ((12582912 & i2) == 0) {
            i6 |= (16777216 & i2) == 0 ? oq5Var.f(zsqVar5) : oq5Var.h(zsqVar5) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        int i8 = i3 & 256;
        if (i8 != 0) {
            i6 |= 100663296;
        } else if ((100663296 & i2) == 0) {
            o3kVar2 = o3kVar;
            i6 |= oq5Var.f(o3kVar2) ? 67108864 : 33554432;
            if ((38347907 & i6) == 38347906 || !oq5Var.z()) {
                if (i7 != 0) {
                    zsqVar5 = null;
                }
                o3kVar3 = i8 == 0 ? null : o3kVar2;
                vm0 a2 = fn0.a(new act(1000, (kya) null, 6), 0.0f, um0Var, oq5Var, ((i6 >> 3) & 896) | 6, 2);
                boolean booleanValue = ((Boolean) ksw.K(oq5Var).getValue()).booleanValue();
                kjn kjnVar = gq5.a;
                if (o3kVar3 != null) {
                    oq5Var.Z(2015057511);
                    int i9 = ys4Var.a;
                    boolean z5 = (i6 & 14) == 4 || ((i6 & 8) != 0 && oq5Var.h(ys4Var));
                    Object K2 = oq5Var.K();
                    if (z5 || K2 == kjnVar) {
                        K2 = new ts4(ys4Var, 0);
                        oq5Var.k0(K2);
                    }
                    fp7 b2 = r3k.b(i9, (Function0) K2, oq5Var, 0, 2);
                    oq5Var.p(false);
                    o3kVar4 = b2;
                    z2 = booleanValue;
                } else {
                    oq5Var.Z(2015057077);
                    oq5Var.p(false);
                    z2 = booleanValue;
                    o3kVar4 = o3kVar3;
                }
                vciVar = vci.a;
                yci c2 = d.c(vciVar, 1.0f);
                f2 = oq5Var.f(a2);
                K = oq5Var.K();
                if (!f2 || K == kjnVar) {
                    zsqVar2 = zsqVar5;
                    K = new la1(a2, 17);
                    oq5Var.k0(K);
                } else {
                    zsqVar2 = zsqVar5;
                }
                yci s = wyf.s(c2, (Function0) K);
                kfh d2 = ug3.d(b2c.c, false);
                i5 = oq5Var.P;
                a l2 = oq5Var.l();
                yci H = vnj.H(oq5Var, s);
                xp5.T.getClass();
                z3 = z2;
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, d2, wp5.f);
                g0g.U(oq5Var, l2, wp5.e);
                kb5 kb5Var = wp5.g;
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var, i5, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                o3kVar5 = o3kVar4;
                qs4 qs4Var = ys4Var.c;
                if (z3 || qs4Var == null) {
                    vciVar2 = vciVar;
                    z4 = true;
                    oq5Var.Z(-1048555444);
                    zsqVar3 = zsqVar2;
                    rvf.b(o3kVar5, null, null, null, 0, 0.0f, b2c.k, null, false, null, null, null, ild.C(-1380256358, new ln1(ys4Var, d85Var, zsqVar3, hvqVar, 2), oq5Var), oq5Var, ScreenMirroringConfig.Video.BITRATE_1_5MB, 3072, 8126);
                    oq5Var = oq5Var;
                    if (ys4Var.b.a.size() <= 1 && !z) {
                        oq5Var.Z(-1053535966);
                    } else {
                        oq5Var.Z(-1047563475);
                        int j2 = o3kVar5.j();
                        int n2 = o3kVar5.n();
                        yci a3 = b.a.a(vciVar2, b2c.i);
                        m2k G = zdg.G(oq5Var);
                        Object K3 = oq5Var.K();
                        if (K3 == kjnVar) {
                            K3 = new sm4(10);
                            oq5Var.k0(K3);
                        }
                        ivf.j(j2, null, (Function1) K3, n2, G, a3, oq5Var, 432, 0);
                        oq5Var = oq5Var;
                    }
                    oq5Var.p(false);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(-1048742219);
                    int i10 = (i6 >> 9) & 112;
                    vciVar2 = vciVar;
                    d85 d85Var3 = d85Var2;
                    z4 = true;
                    f(qs4Var, d85Var3, null, oq5Var, i10, 4);
                    oq5Var.p(false);
                    zsqVar3 = zsqVar2;
                }
                oq5Var.p(z4);
                yciVar2 = vciVar2;
                zsqVar4 = zsqVar3;
            } else {
                oq5Var.S();
                yciVar2 = yciVar;
                zsqVar4 = zsqVar5;
                o3kVar3 = o3kVar2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new bq(ys4Var, ws4Var, hvqVar, um0Var, d85Var, z, yciVar2, zsqVar4, o3kVar3, i2, i3, 2);
                return;
            }
            return;
        }
        o3kVar2 = o3kVar;
        if ((38347907 & i6) == 38347906) {
        }
        if (i7 != 0) {
        }
        if (i8 == 0) {
        }
        vm0 a22 = fn0.a(new act(1000, (kya) null, 6), 0.0f, um0Var, oq5Var, ((i6 >> 3) & 896) | 6, 2);
        boolean booleanValue2 = ((Boolean) ksw.K(oq5Var).getValue()).booleanValue();
        kjn kjnVar2 = gq5.a;
        if (o3kVar3 != null) {
        }
        vciVar = vci.a;
        yci c22 = d.c(vciVar, 1.0f);
        f2 = oq5Var.f(a22);
        K = oq5Var.K();
        if (f2) {
        }
        zsqVar2 = zsqVar5;
        K = new la1(a22, 17);
        oq5Var.k0(K);
        yci s2 = wyf.s(c22, (Function0) K);
        kfh d22 = ug3.d(b2c.c, false);
        i5 = oq5Var.P;
        a l22 = oq5Var.l();
        yci H2 = vnj.H(oq5Var, s2);
        xp5.T.getClass();
        z3 = z2;
        grb grbVar2 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, d22, wp5.f);
        g0g.U(oq5Var, l22, wp5.e);
        kb5 kb5Var2 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i5, oq5Var, i5, kb5Var2);
        g0g.U(oq5Var, H2, wp5.d);
        o3kVar5 = o3kVar4;
        qs4 qs4Var2 = ys4Var.c;
        if (z3) {
        }
        vciVar2 = vciVar;
        z4 = true;
        oq5Var.Z(-1048555444);
        zsqVar3 = zsqVar2;
        rvf.b(o3kVar5, null, null, null, 0, 0.0f, b2c.k, null, false, null, null, null, ild.C(-1380256358, new ln1(ys4Var, d85Var, zsqVar3, hvqVar, 2), oq5Var), oq5Var, ScreenMirroringConfig.Video.BITRATE_1_5MB, 3072, 8126);
        oq5Var = oq5Var;
        if (ys4Var.b.a.size() <= 1 && !z) {
        }
        oq5Var.p(false);
        oq5Var.p(false);
        oq5Var.p(z4);
        yciVar2 = vciVar2;
        zsqVar4 = zsqVar3;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void h(String str, String str2, d85 d85Var, int i2, yci yciVar, hq5 hq5Var, int i3) {
        String str3;
        int i4;
        String str4;
        long j2;
        long j3;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(912697810);
        if ((i3 & 6) == 0) {
            str3 = str;
            i4 = (oq5Var2.f(str3) ? 4 : 2) | i3;
        } else {
            str3 = str;
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            str4 = str2;
            i4 |= oq5Var2.f(str4) ? 32 : 16;
        } else {
            str4 = str2;
        }
        if ((i3 & 384) == 0) {
            i4 |= oq5Var2.f(d85Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= oq5Var2.d(i2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= oq5Var2.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i4 & 9363) == 9362 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var2, 48);
            int i5 = oq5Var2.P;
            a l2 = oq5Var2.l();
            yci H = vnj.H(oq5Var2, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a2, wp5.f);
            g0g.U(oq5Var2, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var2, i5, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            ges j4 = nu0.j();
            if (d85Var == null) {
                oq5Var2.Z(1406954095);
                j2 = ((dq0) oq5Var2.j(eq0.a)).b.a;
                oq5Var2.p(false);
            } else {
                oq5Var2.Z(1406953072);
                oq5Var2.p(false);
                j2 = d85Var.a;
            }
            xcs.b(str3, null, d85.b(j2, 0.75f, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, new o9s(3), 0L, 2, false, 1, 0, null, j4, oq5Var2, i4 & 14, 3120, 54778);
            ges c2 = nu0.c();
            if (d85Var == null) {
                oq5Var2.Z(1406963823);
                j3 = ((dq0) oq5Var2.j(eq0.a)).b.a;
                oq5Var2.p(false);
            } else {
                oq5Var2.Z(1406962800);
                oq5Var2.p(false);
                j3 = d85Var.a;
            }
            xcs.b(str4, null, j3, 0L, null, 0L, null, new o9s(3), 0L, 2, false, i2, 0, null, c2, oq5Var2, (i4 >> 3) & 14, (i4 & 7168) | 48, 54778);
            oq5Var = oq5Var2;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hq(str, str2, d85Var, i2, yciVar, i3, 5);
        }
    }

    public static final lx7 i(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f3 = context.getResources().getDisplayMetrics().density;
        lqc a2 = mqc.a(f2);
        if (a2 == null) {
            a2 = new n6g(f2);
        }
        return new lx7(f3, f2, a2);
    }

    public static final void j(float f2, int i2, hq5 hq5Var, ukd ukdVar, plv plvVar) {
        b95 b95Var;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1148719958);
        int i3 = i2 | 6 | (oq5Var.f(plvVar) ? 32 : 16) | (oq5Var.c(f2) ? 256 : 128);
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            ukdVar = skd.a;
            ukd I = o5g.I(o5g.A(ukdVar), f2);
            if (plvVar instanceof nlv) {
                oq5Var.Z(-113272390);
                oq5Var.p(false);
                b95Var = new sfc(((nlv) plvVar).c);
            } else {
                if (!Intrinsics.d(plvVar, olv.b)) {
                    throw vz1.i(oq5Var, -113274550, false);
                }
                oq5Var.Z(-113268740);
                b95Var = ((fxa) oq5Var.j(cs5.e)).g;
                oq5Var.p(false);
            }
            p1g.o(I.d(new uj2(b95Var)), oq5Var, 0);
        } else {
            oq5Var.S();
        }
        ukd ukdVar2 = ukdVar;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new eh6(ukdVar2, plvVar, f2, i2, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(String str, String str2, yci yciVar, hq5 hq5Var, int i2, int i3) {
        yci yciVar2;
        d85 T;
        long j2;
        oq5 oq5Var;
        xmn r;
        str.getClass();
        str2.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(378997395);
        int i4 = (oq5Var2.f(str) ? 4 : 2) | i2 | (oq5Var2.f(str2) ? 32 : 16);
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var2.f(yciVar2) ? 256 : 128;
            if ((i4 & 147) == 146 || !oq5Var2.z()) {
                if (i5 != 0) {
                    yciVar2 = vci.a;
                }
                ges gesVar = gdg.F(oq5Var2).e;
                T = pd.T(str2);
                if (T != null) {
                    oq5Var2.Z(-855713670);
                    j2 = ((dq0) oq5Var2.j(eq0.a)).b.a;
                    oq5Var2.p(false);
                } else {
                    oq5Var2.Z(-855715685);
                    oq5Var2.p(false);
                    j2 = T.a;
                }
                oq5Var = oq5Var2;
                xcs.b(str, yciVar2, d85.b(j2, 0.5f, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, gesVar, oq5Var, (i4 & 14) | ((i4 >> 3) & 112), 0, 65016);
            } else {
                oq5Var2.S();
                oq5Var = oq5Var2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new lx(str, str2, yciVar2, i2, i3, 9);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((i4 & 147) == 146) {
        }
        if (i5 != 0) {
        }
        ges gesVar2 = gdg.F(oq5Var2).e;
        T = pd.T(str2);
        if (T != null) {
        }
        oq5Var = oq5Var2;
        xcs.b(str, yciVar2, d85.b(j2, 0.5f, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, gesVar2, oq5Var, (i4 & 14) | ((i4 >> 3) & 112), 0, 65016);
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void l(ArrayList arrayList, heb hebVar, fvf fvfVar, o0k o0kVar, hq5 hq5Var, int i2) {
        int i3;
        hebVar.getClass();
        fvfVar.getClass();
        o0kVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1855982279);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(arrayList) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(hebVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(fvfVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(o0kVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            c3x.t(fvfVar, arrayList, oq5Var, ((i3 >> 6) & 14) | ((i3 << 3) & 112));
            boolean f2 = oq5Var.f(arrayList);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            Object obj = K;
            if (f2 || K == kjnVar) {
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((gdj) it.next()).a);
                }
                oq5Var.k0(arrayList2);
                obj = arrayList2;
            }
            List list = (List) obj;
            vm C = ghh.C(o0kVar, androidx.compose.foundation.layout.a.a(0.0f, 16, 1));
            yci a2 = androidx.compose.ui.platform.a.a(d.c(vci.a, 1.0f), "episodes_list");
            boolean h2 = oq5Var.h(arrayList) | oq5Var.h(hebVar) | oq5Var.h(list);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                K2 = new g3(29, arrayList, hebVar, list);
                oq5Var.k0(K2);
            }
            weo.f(a2, fvfVar, C, null, null, null, false, null, (Function1) K2, oq5Var, ((i3 >> 3) & 112) | 6, 504);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wda(i2, 3, arrayList, hebVar, fvfVar, o0kVar);
        }
    }

    public static final void m(String str, String str2, d85 d85Var, yci yciVar, hq5 hq5Var, int i2) {
        String str3;
        int i3;
        String str4;
        long j2;
        long j3;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1212235614);
        if ((i2 & 6) == 0) {
            str3 = str;
            i3 = (oq5Var2.f(str3) ? 4 : 2) | i2;
        } else {
            str3 = str;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            str4 = str2;
            i3 |= oq5Var2.f(str4) ? 32 : 16;
        } else {
            str4 = str2;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var2.f(d85Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var2.f(yciVar) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var2, 48);
            int i4 = oq5Var2.P;
            a l2 = oq5Var2.l();
            yci H = vnj.H(oq5Var2, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a2, wp5.f);
            g0g.U(oq5Var2, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var2, i4, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            ges j4 = nu0.j();
            if (d85Var == null) {
                oq5Var2.Z(-236823173);
                j2 = ((dq0) oq5Var2.j(eq0.a)).b.a;
                oq5Var2.p(false);
            } else {
                oq5Var2.Z(-236824196);
                oq5Var2.p(false);
                j2 = d85Var.a;
            }
            xcs.b(str3, null, d85.b(j2, 0.75f, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, new o9s(3), 0L, 2, false, 1, 0, null, j4, oq5Var2, i3 & 14, 3120, 54778);
            ges e2 = nu0.e();
            if (d85Var == null) {
                oq5Var2.Z(-236813445);
                j3 = ((dq0) oq5Var2.j(eq0.a)).b.a;
                oq5Var2.p(false);
            } else {
                oq5Var2.Z(-236814468);
                oq5Var2.p(false);
                j3 = d85Var.a;
            }
            xcs.b(str4, null, j3, 0L, null, 0L, null, new o9s(3), 0L, 2, false, 2, 0, null, e2, oq5Var2, (i3 >> 3) & 14, 3120, 54778);
            oq5Var = oq5Var2;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu(str, str2, false, d85Var, yciVar, i2, 19);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(Function0 function0, yci yciVar, boolean z, y9e y9eVar, wn5 wn5Var, hq5 hq5Var, int i2, int i3) {
        int i4;
        yci yciVar2;
        int i5;
        yci yciVar3;
        long j2;
        y9e y9eVar2;
        long j3;
        int i6;
        y9e y9eVar3;
        boolean z2;
        int i7;
        yci yciVar4;
        boolean z3;
        y9e y9eVar4;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1142896114);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.h(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var.f(yciVar2) ? 32 : 16;
            int i9 = i4 | 384;
            if ((i2 & 3072) == 0) {
                i9 = i4 | 1408;
            }
            i5 = i9 | 24576;
            if ((196608 & i2) == 0) {
                i5 |= oq5Var.h(wn5Var) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            }
            if ((74899 & i5) == 74898 || !oq5Var.z()) {
                oq5Var.U();
                if ((i2 & 1) != 0 || oq5Var.y()) {
                    yciVar3 = i8 == 0 ? vci.a : yciVar2;
                    oq5Var.Z(-1519621781);
                    j2 = ((d85) oq5Var.j(rb6.a)).a;
                    i95 i95Var = (i95) oq5Var.j(j95.a);
                    y9eVar2 = i95Var.M;
                    if (y9eVar2 == null) {
                        long j4 = d85.m;
                        y9eVar2 = new y9e(j4, j2, j4, d85.b(j2, 0.38f, 0.0f, 0.0f, 0.0f, 14));
                        j2 = j2;
                        i95Var.M = y9eVar2;
                    }
                    j3 = y9eVar2.b;
                    if (d85.c(j3, j2)) {
                        long j5 = j2;
                        long b2 = d85.b(j5, 0.38f, 0.0f, 0.0f, 0.0f, 14);
                        long j6 = y9eVar2.a;
                        long j7 = y9eVar2.c;
                        long j8 = j5 != 16 ? j5 : j3;
                        if (b2 == 16) {
                            b2 = y9eVar2.d;
                        }
                        y9e y9eVar5 = new y9e(j6, j8, j7, b2);
                        oq5Var.p(false);
                        y9eVar2 = y9eVar5;
                    } else {
                        oq5Var.p(false);
                    }
                    i6 = i5 & (-7169);
                    y9eVar3 = y9eVar2;
                    z2 = true;
                } else {
                    oq5Var.S();
                    z2 = z;
                    i6 = i5 & (-7169);
                    yciVar3 = yciVar2;
                    y9eVar3 = y9eVar;
                }
                oq5Var.q();
                agr agrVar = xre.a;
                yci f2 = yciVar3.f(MinimumInteractiveModifier.a);
                float f3 = bae.b;
                yci d2 = androidx.compose.foundation.a.d(androidx.compose.foundation.a.b(xp3.u(d.m(f2, f3), jvp.a(5, oq5Var)), !z2 ? y9eVar3.a : y9eVar3.c, vnj.i), null, deo.a(f3 / 2, oq5Var, 54, 4), z2, null, new meo(0), function0, 8);
                kfh d3 = ug3.d(b2c.f, false);
                i7 = oq5Var.P;
                a l2 = oq5Var.l();
                yci H = vnj.H(oq5Var, d2);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, d3, wp5.f);
                g0g.U(oq5Var, l2, wp5.e);
                kb5 kb5Var = wp5.g;
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                    ouj.x(i7, oq5Var, i7, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                etn.l(rb6.a.a(new d85(!z2 ? y9eVar3.b : y9eVar3.d)), wn5Var, oq5Var, ((i6 >> 12) & 112) | 8);
                oq5Var.p(true);
                yciVar4 = yciVar3;
                z3 = z2;
                y9eVar4 = y9eVar3;
            } else {
                oq5Var.S();
                z3 = z;
                y9eVar4 = y9eVar;
                yciVar4 = yciVar2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new z9e(function0, yciVar4, z3, y9eVar4, wn5Var, i2, i3);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        int i92 = i4 | 384;
        if ((i2 & 3072) == 0) {
        }
        i5 = i92 | 24576;
        if ((196608 & i2) == 0) {
        }
        if ((74899 & i5) == 74898) {
        }
        oq5Var.U();
        if ((i2 & 1) != 0) {
        }
        if (i8 == 0) {
        }
        oq5Var.Z(-1519621781);
        j2 = ((d85) oq5Var.j(rb6.a)).a;
        i95 i95Var2 = (i95) oq5Var.j(j95.a);
        y9eVar2 = i95Var2.M;
        if (y9eVar2 == null) {
        }
        j3 = y9eVar2.b;
        if (d85.c(j3, j2)) {
        }
        i6 = i5 & (-7169);
        y9eVar3 = y9eVar2;
        z2 = true;
        oq5Var.q();
        agr agrVar2 = xre.a;
        yci f22 = yciVar3.f(MinimumInteractiveModifier.a);
        float f32 = bae.b;
        yci d22 = androidx.compose.foundation.a.d(androidx.compose.foundation.a.b(xp3.u(d.m(f22, f32), jvp.a(5, oq5Var)), !z2 ? y9eVar3.a : y9eVar3.c, vnj.i), null, deo.a(f32 / 2, oq5Var, 54, 4), z2, null, new meo(0), function0, 8);
        kfh d32 = ug3.d(b2c.f, false);
        i7 = oq5Var.P;
        a l22 = oq5Var.l();
        yci H2 = vnj.H(oq5Var, d22);
        xp5.T.getClass();
        grb grbVar2 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, d32, wp5.f);
        g0g.U(oq5Var, l22, wp5.e);
        kb5 kb5Var2 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i7, oq5Var, i7, kb5Var2);
        g0g.U(oq5Var, H2, wp5.d);
        etn.l(rb6.a.a(new d85(!z2 ? y9eVar3.b : y9eVar3.d)), wn5Var, oq5Var, ((i6 >> 12) & 112) | 8);
        oq5Var.p(true);
        yciVar4 = yciVar3;
        z3 = z2;
        y9eVar4 = y9eVar3;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final wsd o(t9f t9fVar, t9f t9fVar2) {
        t9fVar.getClass();
        t9fVar2.getClass();
        return new wsd(t9fVar, t9fVar2, 1);
    }

    public static final void p(o54 o54Var, o3k o3kVar, um0 um0Var, boolean z, hvq hvqVar, zsq zsqVar, hq5 hq5Var, int i2) {
        int i3;
        boolean z2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-516738585);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var.f(o54Var) : oq5Var.h(o54Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(o3kVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.d(1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.d(um0Var.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            z2 = z;
            i3 |= oq5Var.g(z2) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            z2 = z;
        }
        if ((196608 & i2) == 0) {
            i3 |= oq5Var.h(hvqVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i2) == 0) {
            i3 |= (2097152 & i2) == 0 ? oq5Var.f(zsqVar) : oq5Var.h(zsqVar) ? 1048576 : 524288;
        }
        if ((599187 & i3) == 599186 && oq5Var.z()) {
            oq5Var.S();
        } else {
            vm0 b2 = fn0.b(1, 0.0f, um0Var, oq5Var, ((i3 >> 6) & 14) | ((i3 >> 3) & 896), 2);
            yci d2 = d.d(vci.a, 1.0f);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new h14(8);
                oq5Var.k0(K);
            }
            bg3.a(nfp.b(d2, false, (Function1) K), b2c.f, false, ild.C(-503493807, new h54(z2, b2, o3kVar, o54Var, zsqVar, hvqVar, 0), oq5Var), oq5Var, 3120, 4);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new dq(i2, 5, o54Var, o3kVar, um0Var, hvqVar, zsqVar, z);
        }
    }

    public static final void q(g24 g24Var, d85 d85Var, um0 um0Var, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1571915585);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(g24Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(d85Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.d(2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.d(um0Var.ordinal()) ? 2048 : 1024;
        }
        int i4 = i3 | 24576;
        if ((i4 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            if (g24Var == null) {
                throw vz1.i(oq5Var, 1217617140, false);
            }
            oq5Var.Z(-908519731);
            vci vciVar = vci.a;
            c(g24Var.a, g24Var.b, d85Var, um0Var, vciVar, oq5Var, (i4 << 3) & 524160);
            oq5Var.p(false);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu(g24Var, d85Var, false, um0Var, yciVar2, i2, 18);
        }
    }

    public static final void r(g24 g24Var, um0 um0Var, d85 d85Var, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-344990435);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(g24Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.d(0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.d(um0Var.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(d85Var) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (g24Var == null) {
                throw vz1.i(oq5Var, -823321366, false);
            }
            oq5Var.Z(246896023);
            int i4 = (i3 >> 6) & 112;
            int i5 = i3 << 3;
            b(g24Var.c, d85Var, um0Var, null, oq5Var, i4 | (i5 & 896) | (i5 & 7168));
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new b3(g24Var, um0Var, d85Var, i2, 19);
        }
    }

    public static final void s(final hps hpsVar, final cce cceVar, final yci yciVar, hq5 hq5Var, final int i2) {
        hps hpsVar2;
        cce cceVar2;
        xmn r;
        Function2 function2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1258850376);
        if (((i2 | (oq5Var.f(hpsVar) ? 4 : 2) | (oq5Var.h(cceVar) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128)) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            hpsVar2 = hpsVar;
            cceVar2 = cceVar;
        } else {
            if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                oq5Var.Z(-1242709761);
                qo6 qo6Var = qo6.k;
                gce gceVar = gce.d;
                Object K = oq5Var.K();
                if (K == gq5.a) {
                    K = new sm4(11);
                    oq5Var.k0(K);
                }
                swf.d(qo6Var, gceVar, androidx.compose.ui.draw.a.c(yciVar, (Function1) K), null, 0L, 0L, false, oq5Var, 54, 120);
                oq5Var.p(false);
                r = oq5Var.r();
                if (r != null) {
                    final int i3 = 1;
                    function2 = new Function2(hpsVar, cceVar, yciVar, i2, i3) { // from class: us4
                        public final /* synthetic */ int a;
                        public final /* synthetic */ hps b;
                        public final /* synthetic */ cce c;
                        public final /* synthetic */ yci d;

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
                                    ff7.s(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                                    break;
                                default:
                                    ff7.s(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    r.d = function2;
                }
                return;
            }
            hpsVar2 = hpsVar;
            cceVar2 = cceVar;
            oq5Var.Z(-1250080166);
            oq5Var.p(false);
            bg3.a(xp3.v(yciVar), null, false, ild.C(820305310, new ar(19, hpsVar2, cceVar2), oq5Var), oq5Var, 3072, 6);
        }
        r = oq5Var.r();
        if (r != null) {
            final int i4 = 0;
            final hps hpsVar3 = hpsVar2;
            final cce cceVar3 = cceVar2;
            function2 = new Function2(hpsVar3, cceVar3, yciVar, i2, i4) { // from class: us4
                public final /* synthetic */ int a;
                public final /* synthetic */ hps b;
                public final /* synthetic */ cce c;
                public final /* synthetic */ yci d;

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
                            ff7.s(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                            break;
                        default:
                            ff7.s(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                            break;
                    }
                    return Unit.a;
                }
            };
            r.d = function2;
        }
    }

    public static Uri t(String str) {
        str.getClass();
        return Uri.parse("yandexmusic://artist/".concat(str));
    }

    public static void u(ba6 ba6Var, j7g j7gVar, aa6 aa6Var) {
        aa6Var.o = -1;
        o86 o86Var = aa6Var.N;
        o86 o86Var2 = aa6Var.M;
        o86 o86Var3 = aa6Var.K;
        o86 o86Var4 = aa6Var.L;
        o86 o86Var5 = aa6Var.J;
        aa6Var.p = -1;
        z96 z96Var = ba6Var.U[0];
        z96 z96Var2 = z96.d;
        z96 z96Var3 = z96.b;
        if (z96Var != z96Var3 && aa6Var.U[0] == z96Var2) {
            int i2 = o86Var5.g;
            int r = ba6Var.r() - o86Var4.g;
            o86Var5.i = j7gVar.k(o86Var5);
            o86Var4.i = j7gVar.k(o86Var4);
            j7gVar.d(o86Var5.i, i2);
            j7gVar.d(o86Var4.i, r);
            aa6Var.o = 2;
            aa6Var.a0 = i2;
            int i3 = r - i2;
            aa6Var.W = i3;
            int i4 = aa6Var.d0;
            if (i3 < i4) {
                aa6Var.W = i4;
            }
        }
        if (ba6Var.U[1] == z96Var3 || aa6Var.U[1] != z96Var2) {
            return;
        }
        int i5 = o86Var3.g;
        int l2 = ba6Var.l() - o86Var2.g;
        o86Var3.i = j7gVar.k(o86Var3);
        o86Var2.i = j7gVar.k(o86Var2);
        j7gVar.d(o86Var3.i, i5);
        j7gVar.d(o86Var2.i, l2);
        if (aa6Var.c0 > 0 || aa6Var.i0 == 8) {
            i3r k2 = j7gVar.k(o86Var);
            o86Var.i = k2;
            j7gVar.d(k2, aa6Var.c0 + i5);
        }
        aa6Var.p = 2;
        aa6Var.b0 = i5;
        int i6 = l2 - i5;
        aa6Var.X = i6;
        int i7 = aa6Var.e0;
        if (i6 < i7) {
            aa6Var.X = i7;
        }
    }

    public static c01 v(mqs mqsVar) {
        mqsVar.getClass();
        zp2 zp2Var = (zp2) CollectionsKt.firstOrNull(mqsVar.f);
        if (zp2Var == null) {
            zp2Var = zp2.k;
        }
        return new c01(zp2Var.a, zp2Var.b, false, false, null, 0, null, null, null, zp2Var.f, null, false, 57340);
    }

    public static final boolean w(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    public static final dpc x(dpc dpcVar) {
        dpc dpcVar2 = ((uoc) bcx.G(dpcVar).getFocusOwner()).l;
        if (dpcVar2 == null || !dpcVar2.n) {
            return null;
        }
        return dpcVar2;
    }

    public static final ynn y(dpc dpcVar) {
        f8j f8jVar = dpcVar.h;
        return f8jVar != null ? ltg.D(f8jVar).y(f8jVar, false) : ynn.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final dpc z(dpc dpcVar) {
        dpc dpcVar2;
        int ordinal;
        boolean z = dpcVar.a.n;
        if (z) {
            if (!z) {
                sme.b("visitChildren called on an unattached node");
            }
            eqi eqiVar = new eqi(new xci[16]);
            xci xciVar = dpcVar.a;
            xci xciVar2 = xciVar.f;
            if (xciVar2 == null) {
                bcx.o(eqiVar, xciVar);
            } else {
                eqiVar.d(xciVar2);
            }
            loop0: while (true) {
                int i2 = eqiVar.c;
                if (i2 == 0) {
                    break;
                }
                xci xciVar3 = (xci) eqiVar.m(i2 - 1);
                if ((xciVar3.d & 1024) == 0) {
                    bcx.o(eqiVar, xciVar3);
                } else {
                    while (true) {
                        if (xciVar3 == null) {
                            break;
                        }
                        if ((xciVar3.c & 1024) != 0) {
                            eqi eqiVar2 = null;
                            while (xciVar3 != null) {
                                if (xciVar3 instanceof dpc) {
                                    dpcVar2 = (dpc) xciVar3;
                                    if (dpcVar2.a.n && ((ordinal = dpcVar2.U0().ordinal()) == 0 || ordinal == 1 || ordinal == 2)) {
                                        break loop0;
                                    }
                                } else if ((xciVar3.c & 1024) != 0 && (xciVar3 instanceof cw7)) {
                                    int i3 = 0;
                                    for (xci xciVar4 = ((cw7) xciVar3).p; xciVar4 != null; xciVar4 = xciVar4.f) {
                                        if ((xciVar4.c & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                xciVar3 = xciVar4;
                                            } else {
                                                if (eqiVar2 == null) {
                                                    eqiVar2 = new eqi(new xci[16]);
                                                }
                                                if (xciVar3 != null) {
                                                    eqiVar2.d(xciVar3);
                                                    xciVar3 = null;
                                                }
                                                eqiVar2.d(xciVar4);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                xciVar3 = bcx.p(eqiVar2);
                            }
                        } else {
                            xciVar3 = xciVar3.f;
                        }
                    }
                }
            }
            return dpcVar2;
        }
        return null;
    }

    public abstract void A(xup xupVar, float f2, float f3);
}
