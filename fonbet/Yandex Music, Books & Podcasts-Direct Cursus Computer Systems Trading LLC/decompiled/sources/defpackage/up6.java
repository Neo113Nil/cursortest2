package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public abstract class up6 {
    public static final rre a = new rre(15);
    public static final wn5 b = new wn5(new fo5(28), -1479299378, false);
    public static final wn5 c = new wn5(new ro5(1), -787209586, false);
    public static final wn5 d = new wn5(new ro5(2), -1147669297, false);
    public static final wn5 e = new wn5(new po5(3), -606191397, false);
    public static final wn5 f = new wn5(new po5(4), 1381173442, false);
    public static final wn5 g = new wn5(new bp5(18), -1471166066, false);
    public static final wn5 h = new wn5(new bp5(19), -1348262129, false);
    public static final wn5 i = new wn5(new bp5(20), -1225358192, false);
    public static final wn5 j = new wn5(new ap5(7), 1639232194, false);
    public static final wn5 k = new wn5(new bp5(21), -610838507, false);
    public static final hm9 l = new hm9(28);
    public static final i6c m = new i6c("is_user_verifying_platform_authenticator_available_for_credential", 1);
    public static final i6c n = new i6c("is_user_verifying_platform_authenticator_available", 1);
    public static bde o;

    public static final boolean A(a0q a0qVar, String str) {
        a0qVar.getClass();
        str.getClass();
        return Intrinsics.d(o8g.i(a0qVar, b2c.r), str);
    }

    public static final boolean B(n7q n7qVar, String str) {
        n7qVar.getClass();
        str.getClass();
        return ((Boolean) wdg.A(n7qVar, new yee(str, 1))).booleanValue();
    }

    public static final fg5 C(mm6 mm6Var, mqs mqsVar, Context context, ag5 ag5Var, boolean z) {
        mm6Var.getClass();
        mqsVar.getClass();
        context.getClass();
        ag5Var.getClass();
        l18 l18Var = l18.b;
        bdt I = hag.I(lf5.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        return new fg5((lf5) qdcVar.C(I), mqsVar, z, mm6Var, context, ag5Var);
    }

    public static final void D(Object obj) {
        if (obj != null) {
            return;
        }
        wvs.p("Got unexpected null");
    }

    public static final String E(int i2, String str) {
        if (str.length() > i2) {
            return str;
        }
        int length = i2 - str.length();
        return O(0, Integer.valueOf(length), i2 > 1 ? c.q(length + 1, "*") : "*").concat(str);
    }

    public static final Object F(ueo ueoVar, boolean z, boolean z2, Function1 function1) {
        ueoVar.getClass();
        ueoVar.a();
        ThreadLocal threadLocal = ueoVar.k;
        if (ueoVar.o() && !ueoVar.p()) {
            CoroutineContext coroutineContext = (CoroutineContext) threadLocal.get();
            if ((coroutineContext != null ? (m6t) coroutineContext.get(m6t.b) : null) != null) {
                xq0.q("Cannot access database on a different coroutine context inherited from a suspending transaction.");
                return null;
            }
        }
        CoroutineContext coroutineContext2 = (CoroutineContext) threadLocal.get();
        if (coroutineContext2 == null) {
            coroutineContext2 = g.a;
        }
        return o5g.P(new oz6(coroutineContext2, ueoVar, z2, z, function1, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object G(ueo ueoVar, boolean z, boolean z2, Function1 function1, Continuation continuation) {
        pz6 pz6Var;
        int i2;
        boolean z3;
        ueo ueoVar2;
        Function1 function12;
        boolean z4;
        if (continuation instanceof pz6) {
            pz6Var = (pz6) continuation;
            int i3 = pz6Var.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pz6Var.o = i3 - Integer.MIN_VALUE;
                pz6 pz6Var2 = pz6Var;
                Object obj = pz6Var2.n;
                nm6 nm6Var = nm6.a;
                i2 = pz6Var2.o;
                if (i2 != 0) {
                    qgg.h0(obj);
                    if (ueoVar.o() && ueoVar.r() && ueoVar.p()) {
                        mz6 mz6Var = new mz6(z2, z, ueoVar, null, function1, 1);
                        pz6Var2.o = 1;
                        Object u = ueoVar.u(z, mz6Var, pz6Var2);
                        if (u != nm6Var) {
                            return u;
                        }
                    } else {
                        z3 = z;
                        pz6Var2.j = ueoVar;
                        pz6Var2.k = function1;
                        pz6Var2.l = z3;
                        pz6Var2.m = z2;
                        pz6Var2.o = 2;
                        CoroutineContext w = w(ueoVar, z2, pz6Var2);
                        if (w != nm6Var) {
                            ueoVar2 = ueoVar;
                            function12 = function1;
                            obj = w;
                            z4 = z2;
                        }
                    }
                }
                if (i2 == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                if (i2 != 2) {
                    if (i2 == 3) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z5 = pz6Var2.m;
                z3 = pz6Var2.l;
                Function1 function13 = pz6Var2.k;
                ueo ueoVar3 = pz6Var2.j;
                qgg.h0(obj);
                z4 = z5;
                function12 = function13;
                ueoVar2 = ueoVar3;
                nz6 nz6Var = new nz6((Continuation) null, ueoVar2, z3, z4, function12);
                pz6Var2.j = null;
                pz6Var2.k = null;
                pz6Var2.o = 3;
                Object V = x97.V((CoroutineContext) obj, nz6Var, pz6Var2);
                return V != nm6Var ? nm6Var : V;
            }
        }
        pz6Var = new pz6(continuation);
        pz6 pz6Var22 = pz6Var;
        Object obj2 = pz6Var22.n;
        nm6 nm6Var2 = nm6.a;
        i2 = pz6Var22.o;
        if (i2 != 0) {
        }
        nz6 nz6Var2 = new nz6((Continuation) null, ueoVar2, z3, z4, function12);
        pz6Var22.j = null;
        pz6Var22.k = null;
        pz6Var22.o = 3;
        Object V2 = x97.V((CoroutineContext) obj2, nz6Var2, pz6Var22);
        if (V2 != nm6Var2) {
        }
    }

    public static final bg5 H(mqs mqsVar, ag5 ag5Var, hq5 hq5Var, int i2, int i3) {
        mqsVar.getClass();
        ag5Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(-421193757);
        if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
            crm crmVar = crm.a;
            oq5Var.p(false);
            return crmVar;
        }
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = gld.R(g.a, oq5Var);
            oq5Var.k0(K);
        }
        mm6 mm6Var = (mm6) K;
        Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
        boolean z = true;
        boolean f2 = oq5Var.f(mqsVar) | ((((i2 & 896) ^ 384) > 256 && oq5Var.f(ag5Var)) || (i2 & 384) == 256) | oq5Var.f(context);
        if ((((i2 & 7168) ^ 3072) <= 2048 || !oq5Var.g(false)) && (i2 & 3072) != 2048) {
            z = false;
        }
        boolean z2 = f2 | z;
        Object K2 = oq5Var.K();
        if (z2 || K2 == kjnVar) {
            K2 = C(mm6Var, mqsVar, context, ag5Var, false);
            oq5Var.k0(K2);
        }
        bg5 bg5Var = (bg5) K2;
        oq5Var.p(false);
        return bg5Var;
    }

    public static final bg5 I(mqs mqsVar, Function1 function1, Function1 function12, Function2 function2, hq5 hq5Var) {
        mqsVar.getClass();
        function1.getClass();
        function12.getClass();
        function2.getClass();
        boolean f2 = ((oq5) hq5Var).f(function1) | ((oq5) hq5Var).f(function12);
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        if (f2 || K == gq5.a) {
            K = new cg5(function1, function12, function2);
            oq5Var.k0(K);
        }
        return H(mqsVar, (cg5) K, oq5Var, 6, 0);
    }

    public static final hs1 J(hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        if (K == gq5.a) {
            K = new hs1();
            oq5Var.k0(K);
        }
        return (hs1) K;
    }

    public static final void K(pce pceVar, hs1 hs1Var) {
        hs1Var.getClass();
        Integer valueOf = Integer.valueOf(hs1Var.a.h());
        h4b h4bVar = pceVar.t;
        if (h4bVar == null) {
            h4bVar = new h4b(25);
            pceVar.t = h4bVar;
        }
        ((LinkedHashMap) h4bVar.a).put("retry_hash", new l6k(valueOf));
    }

    public static void L(Object obj, String str) {
        if (obj != null) {
            return;
        }
        jj4.j(str);
    }

    public static final int M(RecyclerView recyclerView) {
        int computeVerticalScrollRange;
        int E;
        LinearLayoutManager y = y(recyclerView);
        Integer valueOf = y != null ? Integer.valueOf(y.p) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            computeVerticalScrollRange = recyclerView.computeHorizontalScrollRange();
            E = bg3.F(recyclerView);
        } else {
            computeVerticalScrollRange = recyclerView.computeVerticalScrollRange();
            E = bg3.E(recyclerView);
        }
        return computeVerticalScrollRange - E;
    }

    public static final void N(RecyclerView recyclerView, int i2, jk9 jk9Var, DisplayMetrics displayMetrics, boolean z) {
        RecyclerView recyclerView2;
        le0 le0Var;
        int ordinal = jk9Var.ordinal();
        if (ordinal == 0) {
            i2 = bg3.x(Integer.valueOf(i2), displayMetrics);
        } else if (ordinal == 1) {
            i2 = eeh.b(bg3.a0(Integer.valueOf(i2), displayMetrics));
        } else if (ordinal != 2) {
            b6e.s();
            return;
        }
        LinearLayoutManager y = y(recyclerView);
        if (y == null) {
            return;
        }
        if (z) {
            recyclerView2 = recyclerView;
            le0Var = new le0(2, recyclerView2, RecyclerView.class, "smoothScrollBy", "smoothScrollBy(II)V", 0, 12);
        } else {
            le0 le0Var2 = new le0(2, recyclerView, RecyclerView.class, "scrollBy", "scrollBy(II)V", 0, 13);
            recyclerView2 = recyclerView;
            le0Var = le0Var2;
        }
        int i3 = y.p;
        if (i3 == 0) {
            le0Var.invoke(Integer.valueOf(i2 - recyclerView2.computeHorizontalScrollOffset()), 0);
        } else {
            if (i3 != 1) {
                return;
            }
            le0Var.invoke(0, Integer.valueOf(i2 - recyclerView2.computeVerticalScrollOffset()));
        }
    }

    public static final String O(int i2, Integer num, String str) {
        str.getClass();
        int length = str.length();
        if (i2 < 0) {
            i2 = Math.max(0, i2 + length);
        }
        if (num != null) {
            int intValue = num.intValue();
            int intValue2 = num.intValue();
            length = intValue >= 0 ? Math.min(intValue2, length) : intValue2 + length;
        }
        return i2 < length ? mlr.J(str, yhn.m(i2, length)) : "";
    }

    public static final ArrayList P(String str, String str2) {
        str.getClass();
        return u1g.F(StringsKt.d0(str, new String[]{str2}, false, Integer.MAX_VALUE), p2c.a);
    }

    public static Integer Q(String str) {
        str.getClass();
        return StringsKt.q0(str);
    }

    public static final String R(int i2, Integer num, String str) {
        str.getClass();
        int length = str.length();
        if (i2 < 0) {
            i2 = Math.max(i2 + length, 0);
        }
        int min = Math.min(Math.max(num.intValue(), 0), length - i2);
        return min <= 0 ? "" : mlr.J(str, yhn.m(i2, min + i2));
    }

    public static final String S(int i2, Integer num, String str) {
        str.getClass();
        int length = str.length();
        int intValue = num.intValue();
        int d2 = yhn.d(i2, 0, length);
        int d3 = yhn.d(intValue, 0, length);
        return mlr.J(str, yhn.m(Math.min(d2, d3), Math.max(d2, d3)));
    }

    public static String T(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i3)) {
            return "CornerRadius.circular(" + jf0.a0(Float.intBitsToFloat(i2)) + ')';
        }
        return "CornerRadius.elliptical(" + jf0.a0(Float.intBitsToFloat(i2)) + ", " + jf0.a0(Float.intBitsToFloat(i3)) + ')';
    }

    public static void U(int i2, String str) {
        if (i2 > 0) {
            return;
        }
        l1j.h(i2, str, " > 0 required but it was ");
    }

    public static final void a(n9b n9bVar, Function0 function0) {
        n9bVar.getClass();
        function0.getClass();
        n9bVar.a.a(new wn5(new zk(2, function0), -4809150, true));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(Function0 function0, wn5 wn5Var, yci yciVar, Function2 function2, Function2 function22, dup dupVar, long j2, long j3, z18 z18Var, hq5 hq5Var, int i2, int i3) {
        Function0 function02;
        int i4;
        yci yciVar2;
        int i5;
        wn5 wn5Var2;
        Function2 function23;
        dup dupVar2;
        long j4;
        z18 z18Var2;
        oq5 oq5Var;
        long j5;
        xmn r;
        yci yciVar3;
        int i6;
        long j6;
        long b2;
        z18 z18Var3;
        dup dupVar3;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-606536823);
        if ((i2 & 6) == 0) {
            function02 = function0;
            i4 = (oq5Var2.h(function02) ? 4 : 2) | i2;
        } else {
            function02 = function0;
            i4 = i2;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var2.f(yciVar2) ? 256 : 128;
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i4 |= oq5Var2.h(null) ? 16384 : RemoteCameraConfig.Notification.ID;
            }
            i5 = i4 | 843579392;
            if (oq5Var2.P(i5 & 1, (306783379 & i5) == 306783378)) {
                wn5Var2 = wn5Var;
                function23 = function2;
                oq5Var2.S();
                dupVar2 = dupVar;
                j4 = j2;
                z18Var2 = z18Var;
                oq5Var = oq5Var2;
                j5 = j3;
            } else {
                oq5Var2.U();
                if ((i2 & 1) == 0 || oq5Var2.y()) {
                    yciVar3 = i7 != 0 ? vci.a : yciVar2;
                    tgo tgoVar = ((ivp) oq5Var2.j(kvp.a)).b;
                    long f2 = ((ma5) oq5Var2.j(pa5.a)).f();
                    i6 = i5 & (-267911169);
                    j6 = f2;
                    b2 = pa5.b(f2, oq5Var2);
                    z18Var3 = new z18(7);
                    dupVar3 = tgoVar;
                } else {
                    oq5Var2.S();
                    i6 = i5 & (-267911169);
                    dupVar3 = dupVar;
                    j6 = j2;
                    b2 = j3;
                    z18Var3 = z18Var;
                    yciVar3 = yciVar2;
                }
                oq5Var2.q();
                wn5Var2 = wn5Var;
                function23 = function2;
                c(function02, ild.C(1167440211, new u30(function23, wn5Var2, 2), oq5Var2), yciVar3, function22, dupVar3, j6, b2, z18Var3, oq5Var2, (i6 & 896) | (i6 & 14) | 48 | (((2147483646 & i6) >> 3) & 7168) | 100687872);
                yciVar2 = yciVar3;
                z18Var2 = z18Var3;
                oq5Var = oq5Var2;
                j5 = b2;
                j4 = j6;
                dupVar2 = dupVar3;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new kb0(function0, wn5Var2, yciVar2, function23, function22, dupVar2, j4, j5, z18Var2, i2, i3);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((i3 & 16) == 0) {
        }
        i5 = i4 | 843579392;
        if (oq5Var2.P(i5 & 1, (306783379 & i5) == 306783378)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void c(Function0 function0, wn5 wn5Var, yci yciVar, Function2 function2, dup dupVar, long j2, long j3, z18 z18Var, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1035523925);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(wn5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.h(null) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.h(function2) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i3 |= oq5Var.f(dupVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i2) == 0) {
            i3 |= oq5Var.e(j2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= oq5Var.e(j3) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((100663296 & i2) == 0) {
            i3 |= oq5Var.f(z18Var) ? 67108864 : 33554432;
        }
        if (oq5Var.P(i3 & 1, (38347923 & i3) != 38347922)) {
            oq5Var.U();
            if ((i2 & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
            }
            oq5Var.q();
            xv7.h(function0, z18Var, ild.C(-66632952, new v30(wn5Var, yciVar, function2, dupVar, j2, j3), oq5Var), oq5Var, (i3 & 14) | 384 | (((268435454 & i3) >> 21) & 112));
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lb0(function0, wn5Var, yciVar, function2, dupVar, j2, j3, z18Var, i2);
        }
    }

    public static final void d(nii niiVar, sk1 sk1Var, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        yci yciVar2;
        niiVar.getClass();
        sk1Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-608212905);
        if ((i2 & 6) == 0) {
            i3 = i2 | (oq5Var.f(niiVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(sk1Var) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if ((i4 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            Object obj = (wk1) szf.Q(sk1Var.b.h, oq5Var).getValue();
            boolean z = obj instanceof uk1;
            vci vciVar = vci.a;
            if (z) {
                oq5Var.Z(-377038989);
                jf0.o(niiVar, ((uk1) obj).a, vciVar, oq5Var, ((i4 << 3) & 7168) | (i4 & 14));
                oq5Var.p(false);
            } else {
                if (!(obj instanceof vk1)) {
                    throw vz1.i(oq5Var, -377041727, false);
                }
                oq5Var.Z(-377031503);
                vk1 vk1Var = (vk1) obj;
                ArrayList arrayList = vk1Var.a;
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((mk1) it.next()).a);
                }
                context.getClass();
                boolean f2 = oq5Var.f(context) | oq5Var.f(arrayList);
                Object K = oq5Var.K();
                Object obj2 = gq5.a;
                if (f2 || K == obj2) {
                    K = new gl1(context, sk1Var, arrayList);
                    oq5Var.k0(K);
                }
                gl1 gl1Var = (gl1) K;
                yci a2 = a.a(vciVar, "artist_tracks_success_pager");
                boolean f3 = oq5Var.f(obj) | oq5Var.h(sk1Var);
                Object K2 = oq5Var.K();
                if (f3 || K2 == obj2) {
                    K2 = new ar(8, vk1Var, sk1Var);
                    oq5Var.k0(K2);
                }
                jf0.n(niiVar, arrayList2, gl1Var, a2, (pyc) K2, null, oq5Var, i4 & 14);
                oq5Var.p(false);
            }
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new b3(niiVar, sk1Var, yciVar2, i2, 12);
        }
    }

    public static final void e(rx2 rx2Var, boolean z, boolean z2, hq5 hq5Var, int i2) {
        rx2 rx2Var2;
        oq5 oq5Var;
        yci u;
        float f2;
        vci vciVar;
        String str;
        kjn kjnVar;
        h9f h9fVar;
        Object oi1Var;
        kjn kjnVar2;
        boolean z3;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-14688266);
        int i3 = (oq5Var2.h(rx2Var) ? 4 : 2) | i2 | (oq5Var2.g(z) ? 32 : 16);
        if (oq5Var2.P(i3 & 1, (i3 & 147) != 146)) {
            oq5Var2.Z(-1230511962);
            vci vciVar2 = vci.a;
            u = d.u(a.a(vciVar2, "battery_permissions"), b2c.l, (r2 & 2) == 0);
            if (z2) {
                oq5Var2.Z(-801681525);
                bfg.Q(u, bfg.C(oq5Var2), false, 14);
            } else {
                oq5Var2.Z(-804728360);
            }
            oq5Var2.p(false);
            oq5Var2.p(false);
            float f3 = 16;
            float f4 = 0;
            yci u2 = xp3.u(d.d(u, 1.0f), ugo.b(f3, f3, f4, f4));
            agr agrVar = eq0.a;
            yci b2 = androidx.compose.foundation.a.b(u2, ((dq0) oq5Var2.j(agrVar)).c.b, vnj.i);
            ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var2, 48);
            int i4 = oq5Var2.P;
            androidx.compose.runtime.internal.a l2 = oq5Var2.l();
            yci H = vnj.H(oq5Var2, b2);
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
            float f5 = 52;
            u1g.l(oq5Var2, d.e(vciVar2, f5));
            irf.r(a0g.E(2131231350, 0, oq5Var2), null, d.e(vciVar2, 120), null, null, 0.0f, null, oq5Var2, 432, 120);
            float f6 = 32;
            String o2 = vz1.o(vciVar2, f6, oq5Var2, R.string.battery_restrictions_dialog_title, oq5Var2);
            yci o3 = androidx.compose.foundation.layout.a.o(d.d(vciVar2, 1.0f), f6, 0.0f, 2);
            Object K = oq5Var2.K();
            kjn kjnVar3 = gq5.a;
            if (K == kjnVar3) {
                K = new gn2(19);
                oq5Var2.k0(K);
            }
            xcs.b(o2, nfp.b(o3, false, (Function1) K), ((dq0) oq5Var2.j(agrVar)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.c(), oq5Var2, 0, 0, 65016);
            xcs.b(vz1.o(vciVar2, 8, oq5Var2, R.string.battery_restrictions_dialog_subtitle, oq5Var2), androidx.compose.foundation.layout.a.o(d.d(vciVar2, 1.0f), f6, 0.0f, 2), ((dq0) oq5Var2.j(agrVar)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var2, 48, 0, 65016);
            oq5Var = oq5Var2;
            u1g.l(oq5Var, d.e(vciVar2, f6));
            String M = rvf.M(z ? R.string.battery_restrictions_btn_settings : R.string.battery_restrictions_btn_instruction, oq5Var);
            float f7 = 42;
            yci o4 = androidx.compose.foundation.layout.a.o(d.d(vciVar2, 1.0f), f7, 0.0f, 2);
            if (z) {
                oq5Var.Z(-1808940138);
                boolean h2 = oq5Var.h(rx2Var);
                Object K2 = oq5Var.K();
                if (h2 || K2 == kjnVar3) {
                    f2 = f5;
                    str = M;
                    kjnVar2 = kjnVar3;
                    vciVar = vciVar2;
                    z3 = false;
                    oi1Var = new oi1(0, rx2Var, rx2.class, "onSettingsButtonClick", "onSettingsButtonClick()V", 0, 18);
                    oq5Var.k0(oi1Var);
                } else {
                    f2 = f5;
                    oi1Var = K2;
                    kjnVar2 = kjnVar3;
                    vciVar = vciVar2;
                    str = M;
                    z3 = false;
                }
                h9fVar = (h9f) oi1Var;
                oq5Var.p(z3);
                rx2Var2 = rx2Var;
                kjnVar = kjnVar2;
            } else {
                f2 = f5;
                kjn kjnVar4 = kjnVar3;
                vciVar = vciVar2;
                str = M;
                oq5Var.Z(-1808902349);
                boolean h3 = oq5Var.h(rx2Var);
                Object K3 = oq5Var.K();
                if (!h3) {
                    if (K3 == kjnVar4) {
                        kjnVar4 = kjnVar4;
                    } else {
                        kjnVar = kjnVar4;
                        rx2Var2 = rx2Var;
                        h9fVar = (h9f) K3;
                        oq5Var.p(false);
                    }
                }
                kjnVar = kjnVar4;
                oi1 oi1Var2 = new oi1(0, rx2Var, rx2.class, "onInstructionButtonClick", "onInstructionButtonClick()V", 0, 19);
                rx2Var2 = rx2Var;
                oq5Var.k0(oi1Var2);
                K3 = oi1Var2;
                h9fVar = (h9f) K3;
                oq5Var.p(false);
            }
            hdg.o(str, (Function0) h9fVar, o4, 0.0f, oq5Var, 384, 8);
            vci vciVar3 = vciVar;
            String o5 = vz1.o(vciVar3, 12, oq5Var, R.string.battery_restrictions_btn_support, oq5Var);
            yci o6 = androidx.compose.foundation.layout.a.o(d.d(vciVar3, 1.0f), f7, 0.0f, 2);
            boolean h4 = oq5Var.h(rx2Var2);
            Object K4 = oq5Var.K();
            if (h4 || K4 == kjnVar) {
                oi1 oi1Var3 = new oi1(0, rx2Var, rx2.class, "onSupportButtonClick", "onSupportButtonClick()V", 0, 20);
                rx2Var2 = rx2Var;
                oq5Var.k0(oi1Var3);
                K4 = oi1Var3;
            }
            hdg.t(o5, (Function0) ((h9f) K4), o6, null, oq5Var, 384, 8);
            u1g.l(oq5Var, d.e(vciVar3, f2));
            WeakHashMap weakHashMap = rqv.w;
            u1g.l(oq5Var, s7g.F(z7l.h(oq5Var).e));
            oq5Var.p(true);
        } else {
            rx2Var2 = rx2Var;
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new l32(rx2Var2, z, z2, i2);
        }
    }

    public static final void f(List list, hq5 hq5Var, int i2) {
        List list2;
        list.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-409184909);
        int i3 = (oq5Var.f(list) ? 4 : 2) | i2;
        if (oq5Var.P(i3 & 1, (i3 & 3) != 2)) {
            list2 = list;
            lqd.b(list2, d.d(vci.a, 1.0f), 4, null, new mqd(16, 12), ild.C(-225388074, new s44(ywf.s(oq5Var), 0), oq5Var), oq5Var, (i3 & 14) | 197040, 8);
        } else {
            list2 = list;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t44(i2, 0, list2);
        }
    }

    public static final void g(y26 y26Var, yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        yci yciVar2;
        vci vciVar;
        y26Var.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-973045610);
        int i3 = (oq5Var2.f(y26Var) ? 4 : 2) | i2 | 48;
        if (oq5Var2.P(i3 & 1, (i3 & 19) != 18)) {
            h36 h36Var = (h36) szf.Q(y26Var.getState(), oq5Var2).getValue();
            boolean z = h36Var instanceof f36;
            vci vciVar2 = vci.a;
            if (z) {
                oq5Var2.Z(-1267226931);
                oq5Var = oq5Var2;
                vciVar = vciVar2;
                i(((f36) h36Var).a, a.a(vciVar2, "concerts_top_block"), null, null, 0.0f, 0.0f, 0.0f, null, null, null, false, 0, ild.C(1066820629, new t31(7, y26Var), oq5Var2), oq5Var, 0, 384, 4092);
                oq5Var.p(false);
            } else {
                vciVar = vciVar2;
                oq5Var = oq5Var2;
                if (!(h36Var instanceof g36)) {
                    throw vz1.i(oq5Var, 1206045113, false);
                }
                oq5Var.Z(-1265278023);
                ArrayList arrayList = new ArrayList(10);
                for (int i4 = 0; i4 < 10; i4++) {
                    arrayList.add(Unit.a);
                }
                j(arrayList, vciVar, null, 0.0f, 0.0f, null, null, false, 0, ild.C(1226368081, new tt5(2, (g36) h36Var), oq5Var), oq5Var, 102236208, 700);
                oq5Var.p(false);
            }
            yciVar2 = vciVar;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kw5(y26Var, yciVar2, i2, 5);
        }
    }

    public static final void h(iwa iwaVar, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        d85 T;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(369481269);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(iwaVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            String str = iwaVar.k;
            long j2 = (str == null || (T = pd.T(str)) == null) ? d85.f : T.a;
            kfh d2 = ug3.d(b2c.b, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            ift iftVar = ((xwa) oq5Var.j(ywa.a)).d;
            yci a2 = b.a.a(vci.a, b2c.e);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new xga(29);
                oq5Var.k0(K);
            }
            iftVar.a(androidx.compose.ui.graphics.a.a(a2, (Function1) K), j2, oq5Var, 0);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new oua(iwaVar, yciVar, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(final List list, yci yciVar, Function2 function2, o0k o0kVar, float f2, float f3, float f4, fvf fvfVar, Function2 function22, Function1 function1, boolean z, int i2, final wn5 wn5Var, hq5 hq5Var, final int i3, final int i4, final int i5) {
        int i6;
        yci yciVar2;
        int i7;
        Function2 function23;
        int i8;
        int i9;
        final float f5;
        int i10;
        float f6;
        int i11;
        float f7;
        fvf fvfVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        yci yciVar3;
        final float f8;
        final fvf a2;
        Function1 function12;
        final boolean z2;
        final Function2 function24;
        final Function2 function25;
        final float f9;
        final float f10;
        final Function1 function13;
        final o0k o0kVar2;
        final int i20;
        oq5 oq5Var;
        final Function2 function26;
        final boolean z3;
        final Function1 function14;
        final float f11;
        final int i21;
        final o0k o0kVar3;
        final Function2 function27;
        final yci yciVar4;
        xmn r;
        int i22;
        list.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1167252301);
        if ((i3 & 6) == 0) {
            i6 = ((i3 & 8) == 0 ? oq5Var2.f(list) : oq5Var2.h(list) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i23 = i5 & 2;
        if (i23 != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            yciVar2 = yciVar;
            i6 |= oq5Var2.f(yciVar2) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i3 & 384) == 0) {
                function23 = function2;
                i6 |= oq5Var2.h(function23) ? 256 : 128;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    i6 |= oq5Var2.f(o0kVar) ? 2048 : 1024;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        f5 = f2;
                        i6 |= oq5Var2.c(f5) ? 16384 : RemoteCameraConfig.Notification.ID;
                        i10 = i5 & 32;
                        if (i10 != 0) {
                            i6 |= 196608;
                            f6 = f3;
                        } else {
                            f6 = f3;
                            if ((i3 & 196608) == 0) {
                                i6 |= oq5Var2.c(f6) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                            }
                        }
                        i11 = i5 & 64;
                        if (i11 != 0) {
                            i6 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
                            f7 = f4;
                        } else {
                            f7 = f4;
                            if ((i3 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
                                i6 |= oq5Var2.c(f7) ? 1048576 : 524288;
                            }
                        }
                        if ((i3 & 12582912) == 0) {
                            if ((i5 & 128) == 0) {
                                fvfVar2 = fvfVar;
                                if (oq5Var2.f(fvfVar2)) {
                                    i22 = 8388608;
                                    i6 |= i22;
                                }
                            } else {
                                fvfVar2 = fvfVar;
                            }
                            i22 = RemoteCameraConfig.Camera.BITRATE;
                            i6 |= i22;
                        } else {
                            fvfVar2 = fvfVar;
                        }
                        i12 = i5 & 256;
                        if (i12 != 0) {
                            i6 |= 100663296;
                        } else if ((i3 & 100663296) == 0) {
                            i6 |= oq5Var2.h(function22) ? 67108864 : 33554432;
                        }
                        i13 = i5 & RemoteCameraConfig.Mic.BUFFER_SIZE;
                        if (i13 != 0) {
                            i6 |= 805306368;
                        } else if ((i3 & 805306368) == 0) {
                            i14 = i13;
                            i6 |= oq5Var2.h(function1) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                            i15 = i5 & 1024;
                            if (i15 == 0) {
                                i17 = i4 | 6;
                                i16 = i15;
                            } else if ((i4 & 6) == 0) {
                                i16 = i15;
                                i17 = i4 | (oq5Var2.g(z) ? 4 : 2);
                            } else {
                                i16 = i15;
                                i17 = i4;
                            }
                            i18 = i5 & 2048;
                            if (i18 == 0) {
                                i17 |= 48;
                            } else if ((i4 & 48) == 0) {
                                i19 = i18;
                                i17 |= oq5Var2.d(i2) ? 32 : 16;
                                if ((i4 & 384) == 0) {
                                    i17 |= oq5Var2.h(wn5Var) ? 256 : 128;
                                }
                                int i24 = i17;
                                if ((i6 & 306783379) != 306783378 && (i24 & 147) == 146 && oq5Var2.z()) {
                                    oq5Var2.S();
                                    o0kVar3 = o0kVar;
                                    function14 = function1;
                                    i21 = i2;
                                    oq5Var = oq5Var2;
                                    f8 = f6;
                                    f11 = f7;
                                    yciVar4 = yciVar2;
                                    a2 = fvfVar2;
                                    function26 = function23;
                                    function27 = function22;
                                    z3 = z;
                                } else {
                                    oq5Var2.U();
                                    if ((i3 & 1) != 0 || oq5Var2.y()) {
                                        yciVar3 = i23 != 0 ? vci.a : yciVar2;
                                        if (i7 != 0) {
                                            function23 = null;
                                        }
                                        o0k o0kVar4 = i8 != 0 ? vt0.c : o0kVar;
                                        if (i9 != 0) {
                                            f5 = vt0.a;
                                        }
                                        f8 = i10 != 0 ? vt0.b : f6;
                                        float f12 = i11 != 0 ? Float.NaN : f7;
                                        a2 = (i5 & 128) != 0 ? hvf.a(0, 0, oq5Var2, 0, 3) : fvfVar2;
                                        Function2 function28 = i12 == 0 ? function22 : null;
                                        if (i14 != 0) {
                                            Object K = oq5Var2.K();
                                            if (K == gq5.a) {
                                                K = new g4d(21);
                                                oq5Var2.k0(K);
                                            }
                                            function12 = (Function1) K;
                                        } else {
                                            function12 = function1;
                                        }
                                        z2 = i16 != 0 ? true : z;
                                        if (i19 != 0) {
                                            float f13 = vt0.a;
                                            function24 = function23;
                                            function25 = function28;
                                            f9 = f5;
                                            f10 = f12;
                                            function13 = function12;
                                            o0kVar2 = o0kVar4;
                                            i20 = 2;
                                        } else {
                                            function24 = function23;
                                            function25 = function28;
                                            f9 = f5;
                                            f10 = f12;
                                            function13 = function12;
                                            o0kVar2 = o0kVar4;
                                            i20 = i2;
                                        }
                                    } else {
                                        oq5Var2.S();
                                        z2 = z;
                                        i20 = i2;
                                        f9 = f5;
                                        f8 = f6;
                                        f10 = f7;
                                        yciVar3 = yciVar2;
                                        a2 = fvfVar2;
                                        function24 = function23;
                                        o0kVar2 = o0kVar;
                                        function25 = function22;
                                        function13 = function1;
                                    }
                                    oq5Var2.q();
                                    final float f14 = androidx.compose.foundation.layout.a.f(o0kVar2, (xof) oq5Var2.j(es5.n));
                                    oq5Var = oq5Var2;
                                    bg3.a(d.d(yciVar3, 1.0f), null, false, ild.C(-1088998601, new pyc() { // from class: dqd
                                        @Override // defpackage.pyc
                                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                                            androidx.compose.foundation.layout.c cVar = (androidx.compose.foundation.layout.c) obj;
                                            hq5 hq5Var2 = (hq5) obj2;
                                            int intValue = ((Integer) obj3).intValue();
                                            cVar.getClass();
                                            if ((intValue & 6) == 0) {
                                                intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                                            }
                                            if ((intValue & 19) == 18) {
                                                oq5 oq5Var3 = (oq5) hq5Var2;
                                                if (oq5Var3.z()) {
                                                    oq5Var3.S();
                                                    return Unit.a;
                                                }
                                            }
                                            float e2 = cVar.e();
                                            float f15 = vt0.d;
                                            List list2 = list;
                                            List list3 = list2;
                                            int size = list3.size();
                                            float f16 = f14;
                                            float f17 = f9;
                                            float s = o5g.s(e2, f16, f17, f15, i20, size, f10, f8, hq5Var2, 0);
                                            float e3 = cVar.e() - f16;
                                            float size2 = list3.size();
                                            boolean z4 = Float.compare((e3 - (s * size2)) - (size2 * f17), (float) 0) >= 0;
                                            Boolean valueOf = Boolean.valueOf(z4);
                                            oq5 oq5Var4 = (oq5) hq5Var2;
                                            Object obj4 = function13;
                                            boolean f18 = oq5Var4.f(obj4) | oq5Var4.g(z4);
                                            Object K2 = oq5Var4.K();
                                            Object obj5 = gq5.a;
                                            if (f18 || K2 == obj5) {
                                                K2 = new ze1(obj4, z4, null, 5);
                                                oq5Var4.k0(K2);
                                            }
                                            gld.w(oq5Var4, valueOf, (Function2) K2);
                                            ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var4, 0);
                                            int i25 = oq5Var4.P;
                                            androidx.compose.runtime.internal.a l2 = oq5Var4.l();
                                            vci vciVar = vci.a;
                                            yci H = vnj.H(oq5Var4, vciVar);
                                            xp5.T.getClass();
                                            Function0 function0 = wp5.b;
                                            oq5Var4.d0();
                                            if (oq5Var4.O) {
                                                oq5Var4.k(function0);
                                            } else {
                                                oq5Var4.n0();
                                            }
                                            g0g.U(oq5Var4, a3, wp5.f);
                                            g0g.U(oq5Var4, l2, wp5.e);
                                            kb5 kb5Var = wp5.g;
                                            if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i25))) {
                                                ouj.x(i25, oq5Var4, i25, kb5Var);
                                            }
                                            g0g.U(oq5Var4, H, wp5.d);
                                            nx0 g2 = qx0.g(f17);
                                            yci a4 = a.a(d.d(vciVar, 1.0f), "grid_lazy_row");
                                            boolean h2 = oq5Var4.h(list2);
                                            Function2 function29 = function24;
                                            boolean f19 = h2 | oq5Var4.f(function29) | oq5Var4.c(s);
                                            wn5 wn5Var2 = wn5Var;
                                            boolean f20 = f19 | oq5Var4.f(wn5Var2);
                                            Object K3 = oq5Var4.K();
                                            if (f20 || K3 == obj5) {
                                                K3 = new ta0(list2, function29, s, wn5Var2);
                                                oq5Var4.k0(K3);
                                            }
                                            weo.h(a4, a2, o0kVar2, g2, null, null, z2, (Function1) K3, oq5Var4, 6, 104);
                                            if (z4) {
                                                oq5Var4.Z(-1178382815);
                                            } else {
                                                oq5Var4.Z(2040377993);
                                                Function2 function210 = function25;
                                                if (function210 == null) {
                                                    oq5Var4.Z(-1172791656);
                                                } else {
                                                    oq5Var4.Z(2040377993);
                                                    function210.invoke(oq5Var4, 0);
                                                }
                                                oq5Var4.p(false);
                                            }
                                            oq5Var4.p(false);
                                            oq5Var4.p(true);
                                            return Unit.a;
                                        }
                                    }, oq5Var), oq5Var, 3072, 6);
                                    float f15 = f10;
                                    f5 = f9;
                                    function26 = function24;
                                    z3 = z2;
                                    function14 = function13;
                                    f11 = f15;
                                    i21 = i20;
                                    o0kVar3 = o0kVar2;
                                    function27 = function25;
                                    yciVar4 = yciVar3;
                                }
                                r = oq5Var.r();
                                if (r != null) {
                                    r.d = new Function2() { // from class: eqd
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            ((Integer) obj2).getClass();
                                            int R = rvf.R(i3 | 1);
                                            int R2 = rvf.R(i4);
                                            up6.i(list, yciVar4, function26, o0kVar3, f5, f8, f11, a2, function27, function14, z3, i21, wn5Var, (hq5) obj, R, R2, i5);
                                            return Unit.a;
                                        }
                                    };
                                    return;
                                }
                                return;
                            }
                            i19 = i18;
                            if ((i4 & 384) == 0) {
                            }
                            int i242 = i17;
                            if ((i6 & 306783379) != 306783378) {
                            }
                            oq5Var2.U();
                            if ((i3 & 1) != 0) {
                            }
                            if (i23 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if ((i5 & 128) != 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i14 != 0) {
                            }
                            if (i16 != 0) {
                            }
                            if (i19 != 0) {
                            }
                            oq5Var2.q();
                            final float f142 = androidx.compose.foundation.layout.a.f(o0kVar2, (xof) oq5Var2.j(es5.n));
                            oq5Var = oq5Var2;
                            bg3.a(d.d(yciVar3, 1.0f), null, false, ild.C(-1088998601, new pyc() { // from class: dqd
                                @Override // defpackage.pyc
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    androidx.compose.foundation.layout.c cVar = (androidx.compose.foundation.layout.c) obj;
                                    hq5 hq5Var2 = (hq5) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    cVar.getClass();
                                    if ((intValue & 6) == 0) {
                                        intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                                    }
                                    if ((intValue & 19) == 18) {
                                        oq5 oq5Var3 = (oq5) hq5Var2;
                                        if (oq5Var3.z()) {
                                            oq5Var3.S();
                                            return Unit.a;
                                        }
                                    }
                                    float e2 = cVar.e();
                                    float f152 = vt0.d;
                                    List list2 = list;
                                    List list3 = list2;
                                    int size = list3.size();
                                    float f16 = f142;
                                    float f17 = f9;
                                    float s = o5g.s(e2, f16, f17, f152, i20, size, f10, f8, hq5Var2, 0);
                                    float e3 = cVar.e() - f16;
                                    float size2 = list3.size();
                                    boolean z4 = Float.compare((e3 - (s * size2)) - (size2 * f17), (float) 0) >= 0;
                                    Boolean valueOf = Boolean.valueOf(z4);
                                    oq5 oq5Var4 = (oq5) hq5Var2;
                                    Object obj4 = function13;
                                    boolean f18 = oq5Var4.f(obj4) | oq5Var4.g(z4);
                                    Object K2 = oq5Var4.K();
                                    Object obj5 = gq5.a;
                                    if (f18 || K2 == obj5) {
                                        K2 = new ze1(obj4, z4, null, 5);
                                        oq5Var4.k0(K2);
                                    }
                                    gld.w(oq5Var4, valueOf, (Function2) K2);
                                    ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var4, 0);
                                    int i25 = oq5Var4.P;
                                    androidx.compose.runtime.internal.a l2 = oq5Var4.l();
                                    vci vciVar = vci.a;
                                    yci H = vnj.H(oq5Var4, vciVar);
                                    xp5.T.getClass();
                                    Function0 function0 = wp5.b;
                                    oq5Var4.d0();
                                    if (oq5Var4.O) {
                                        oq5Var4.k(function0);
                                    } else {
                                        oq5Var4.n0();
                                    }
                                    g0g.U(oq5Var4, a3, wp5.f);
                                    g0g.U(oq5Var4, l2, wp5.e);
                                    kb5 kb5Var = wp5.g;
                                    if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i25))) {
                                        ouj.x(i25, oq5Var4, i25, kb5Var);
                                    }
                                    g0g.U(oq5Var4, H, wp5.d);
                                    nx0 g2 = qx0.g(f17);
                                    yci a4 = a.a(d.d(vciVar, 1.0f), "grid_lazy_row");
                                    boolean h2 = oq5Var4.h(list2);
                                    Function2 function29 = function24;
                                    boolean f19 = h2 | oq5Var4.f(function29) | oq5Var4.c(s);
                                    wn5 wn5Var2 = wn5Var;
                                    boolean f20 = f19 | oq5Var4.f(wn5Var2);
                                    Object K3 = oq5Var4.K();
                                    if (f20 || K3 == obj5) {
                                        K3 = new ta0(list2, function29, s, wn5Var2);
                                        oq5Var4.k0(K3);
                                    }
                                    weo.h(a4, a2, o0kVar2, g2, null, null, z2, (Function1) K3, oq5Var4, 6, 104);
                                    if (z4) {
                                        oq5Var4.Z(-1178382815);
                                    } else {
                                        oq5Var4.Z(2040377993);
                                        Function2 function210 = function25;
                                        if (function210 == null) {
                                            oq5Var4.Z(-1172791656);
                                        } else {
                                            oq5Var4.Z(2040377993);
                                            function210.invoke(oq5Var4, 0);
                                        }
                                        oq5Var4.p(false);
                                    }
                                    oq5Var4.p(false);
                                    oq5Var4.p(true);
                                    return Unit.a;
                                }
                            }, oq5Var), oq5Var, 3072, 6);
                            float f152 = f10;
                            f5 = f9;
                            function26 = function24;
                            z3 = z2;
                            function14 = function13;
                            f11 = f152;
                            i21 = i20;
                            o0kVar3 = o0kVar2;
                            function27 = function25;
                            yciVar4 = yciVar3;
                            r = oq5Var.r();
                            if (r != null) {
                            }
                        }
                        i14 = i13;
                        i15 = i5 & 1024;
                        if (i15 == 0) {
                        }
                        i18 = i5 & 2048;
                        if (i18 == 0) {
                        }
                        i19 = i18;
                        if ((i4 & 384) == 0) {
                        }
                        int i2422 = i17;
                        if ((i6 & 306783379) != 306783378) {
                        }
                        oq5Var2.U();
                        if ((i3 & 1) != 0) {
                        }
                        if (i23 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if ((i5 & 128) != 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i14 != 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i19 != 0) {
                        }
                        oq5Var2.q();
                        final float f1422 = androidx.compose.foundation.layout.a.f(o0kVar2, (xof) oq5Var2.j(es5.n));
                        oq5Var = oq5Var2;
                        bg3.a(d.d(yciVar3, 1.0f), null, false, ild.C(-1088998601, new pyc() { // from class: dqd
                            @Override // defpackage.pyc
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                androidx.compose.foundation.layout.c cVar = (androidx.compose.foundation.layout.c) obj;
                                hq5 hq5Var2 = (hq5) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                cVar.getClass();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                                }
                                if ((intValue & 19) == 18) {
                                    oq5 oq5Var3 = (oq5) hq5Var2;
                                    if (oq5Var3.z()) {
                                        oq5Var3.S();
                                        return Unit.a;
                                    }
                                }
                                float e2 = cVar.e();
                                float f1522 = vt0.d;
                                List list2 = list;
                                List list3 = list2;
                                int size = list3.size();
                                float f16 = f1422;
                                float f17 = f9;
                                float s = o5g.s(e2, f16, f17, f1522, i20, size, f10, f8, hq5Var2, 0);
                                float e3 = cVar.e() - f16;
                                float size2 = list3.size();
                                boolean z4 = Float.compare((e3 - (s * size2)) - (size2 * f17), (float) 0) >= 0;
                                Boolean valueOf = Boolean.valueOf(z4);
                                oq5 oq5Var4 = (oq5) hq5Var2;
                                Object obj4 = function13;
                                boolean f18 = oq5Var4.f(obj4) | oq5Var4.g(z4);
                                Object K2 = oq5Var4.K();
                                Object obj5 = gq5.a;
                                if (f18 || K2 == obj5) {
                                    K2 = new ze1(obj4, z4, null, 5);
                                    oq5Var4.k0(K2);
                                }
                                gld.w(oq5Var4, valueOf, (Function2) K2);
                                ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var4, 0);
                                int i25 = oq5Var4.P;
                                androidx.compose.runtime.internal.a l2 = oq5Var4.l();
                                vci vciVar = vci.a;
                                yci H = vnj.H(oq5Var4, vciVar);
                                xp5.T.getClass();
                                Function0 function0 = wp5.b;
                                oq5Var4.d0();
                                if (oq5Var4.O) {
                                    oq5Var4.k(function0);
                                } else {
                                    oq5Var4.n0();
                                }
                                g0g.U(oq5Var4, a3, wp5.f);
                                g0g.U(oq5Var4, l2, wp5.e);
                                kb5 kb5Var = wp5.g;
                                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i25))) {
                                    ouj.x(i25, oq5Var4, i25, kb5Var);
                                }
                                g0g.U(oq5Var4, H, wp5.d);
                                nx0 g2 = qx0.g(f17);
                                yci a4 = a.a(d.d(vciVar, 1.0f), "grid_lazy_row");
                                boolean h2 = oq5Var4.h(list2);
                                Function2 function29 = function24;
                                boolean f19 = h2 | oq5Var4.f(function29) | oq5Var4.c(s);
                                wn5 wn5Var2 = wn5Var;
                                boolean f20 = f19 | oq5Var4.f(wn5Var2);
                                Object K3 = oq5Var4.K();
                                if (f20 || K3 == obj5) {
                                    K3 = new ta0(list2, function29, s, wn5Var2);
                                    oq5Var4.k0(K3);
                                }
                                weo.h(a4, a2, o0kVar2, g2, null, null, z2, (Function1) K3, oq5Var4, 6, 104);
                                if (z4) {
                                    oq5Var4.Z(-1178382815);
                                } else {
                                    oq5Var4.Z(2040377993);
                                    Function2 function210 = function25;
                                    if (function210 == null) {
                                        oq5Var4.Z(-1172791656);
                                    } else {
                                        oq5Var4.Z(2040377993);
                                        function210.invoke(oq5Var4, 0);
                                    }
                                    oq5Var4.p(false);
                                }
                                oq5Var4.p(false);
                                oq5Var4.p(true);
                                return Unit.a;
                            }
                        }, oq5Var), oq5Var, 3072, 6);
                        float f1522 = f10;
                        f5 = f9;
                        function26 = function24;
                        z3 = z2;
                        function14 = function13;
                        f11 = f1522;
                        i21 = i20;
                        o0kVar3 = o0kVar2;
                        function27 = function25;
                        yciVar4 = yciVar3;
                        r = oq5Var.r();
                        if (r != null) {
                        }
                    }
                    f5 = f2;
                    i10 = i5 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i5 & 64;
                    if (i11 != 0) {
                    }
                    if ((i3 & 12582912) == 0) {
                    }
                    i12 = i5 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i5 & RemoteCameraConfig.Mic.BUFFER_SIZE;
                    if (i13 != 0) {
                    }
                    i14 = i13;
                    i15 = i5 & 1024;
                    if (i15 == 0) {
                    }
                    i18 = i5 & 2048;
                    if (i18 == 0) {
                    }
                    i19 = i18;
                    if ((i4 & 384) == 0) {
                    }
                    int i24222 = i17;
                    if ((i6 & 306783379) != 306783378) {
                    }
                    oq5Var2.U();
                    if ((i3 & 1) != 0) {
                    }
                    if (i23 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if ((i5 & 128) != 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    oq5Var2.q();
                    final float f14222 = androidx.compose.foundation.layout.a.f(o0kVar2, (xof) oq5Var2.j(es5.n));
                    oq5Var = oq5Var2;
                    bg3.a(d.d(yciVar3, 1.0f), null, false, ild.C(-1088998601, new pyc() { // from class: dqd
                        @Override // defpackage.pyc
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            androidx.compose.foundation.layout.c cVar = (androidx.compose.foundation.layout.c) obj;
                            hq5 hq5Var2 = (hq5) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            cVar.getClass();
                            if ((intValue & 6) == 0) {
                                intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                            }
                            if ((intValue & 19) == 18) {
                                oq5 oq5Var3 = (oq5) hq5Var2;
                                if (oq5Var3.z()) {
                                    oq5Var3.S();
                                    return Unit.a;
                                }
                            }
                            float e2 = cVar.e();
                            float f15222 = vt0.d;
                            List list2 = list;
                            List list3 = list2;
                            int size = list3.size();
                            float f16 = f14222;
                            float f17 = f9;
                            float s = o5g.s(e2, f16, f17, f15222, i20, size, f10, f8, hq5Var2, 0);
                            float e3 = cVar.e() - f16;
                            float size2 = list3.size();
                            boolean z4 = Float.compare((e3 - (s * size2)) - (size2 * f17), (float) 0) >= 0;
                            Boolean valueOf = Boolean.valueOf(z4);
                            oq5 oq5Var4 = (oq5) hq5Var2;
                            Object obj4 = function13;
                            boolean f18 = oq5Var4.f(obj4) | oq5Var4.g(z4);
                            Object K2 = oq5Var4.K();
                            Object obj5 = gq5.a;
                            if (f18 || K2 == obj5) {
                                K2 = new ze1(obj4, z4, null, 5);
                                oq5Var4.k0(K2);
                            }
                            gld.w(oq5Var4, valueOf, (Function2) K2);
                            ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var4, 0);
                            int i25 = oq5Var4.P;
                            androidx.compose.runtime.internal.a l2 = oq5Var4.l();
                            vci vciVar = vci.a;
                            yci H = vnj.H(oq5Var4, vciVar);
                            xp5.T.getClass();
                            Function0 function0 = wp5.b;
                            oq5Var4.d0();
                            if (oq5Var4.O) {
                                oq5Var4.k(function0);
                            } else {
                                oq5Var4.n0();
                            }
                            g0g.U(oq5Var4, a3, wp5.f);
                            g0g.U(oq5Var4, l2, wp5.e);
                            kb5 kb5Var = wp5.g;
                            if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i25))) {
                                ouj.x(i25, oq5Var4, i25, kb5Var);
                            }
                            g0g.U(oq5Var4, H, wp5.d);
                            nx0 g2 = qx0.g(f17);
                            yci a4 = a.a(d.d(vciVar, 1.0f), "grid_lazy_row");
                            boolean h2 = oq5Var4.h(list2);
                            Function2 function29 = function24;
                            boolean f19 = h2 | oq5Var4.f(function29) | oq5Var4.c(s);
                            wn5 wn5Var2 = wn5Var;
                            boolean f20 = f19 | oq5Var4.f(wn5Var2);
                            Object K3 = oq5Var4.K();
                            if (f20 || K3 == obj5) {
                                K3 = new ta0(list2, function29, s, wn5Var2);
                                oq5Var4.k0(K3);
                            }
                            weo.h(a4, a2, o0kVar2, g2, null, null, z2, (Function1) K3, oq5Var4, 6, 104);
                            if (z4) {
                                oq5Var4.Z(-1178382815);
                            } else {
                                oq5Var4.Z(2040377993);
                                Function2 function210 = function25;
                                if (function210 == null) {
                                    oq5Var4.Z(-1172791656);
                                } else {
                                    oq5Var4.Z(2040377993);
                                    function210.invoke(oq5Var4, 0);
                                }
                                oq5Var4.p(false);
                            }
                            oq5Var4.p(false);
                            oq5Var4.p(true);
                            return Unit.a;
                        }
                    }, oq5Var), oq5Var, 3072, 6);
                    float f15222 = f10;
                    f5 = f9;
                    function26 = function24;
                    z3 = z2;
                    function14 = function13;
                    f11 = f15222;
                    i21 = i20;
                    o0kVar3 = o0kVar2;
                    function27 = function25;
                    yciVar4 = yciVar3;
                    r = oq5Var.r();
                    if (r != null) {
                    }
                }
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                f5 = f2;
                i10 = i5 & 32;
                if (i10 != 0) {
                }
                i11 = i5 & 64;
                if (i11 != 0) {
                }
                if ((i3 & 12582912) == 0) {
                }
                i12 = i5 & 256;
                if (i12 != 0) {
                }
                i13 = i5 & RemoteCameraConfig.Mic.BUFFER_SIZE;
                if (i13 != 0) {
                }
                i14 = i13;
                i15 = i5 & 1024;
                if (i15 == 0) {
                }
                i18 = i5 & 2048;
                if (i18 == 0) {
                }
                i19 = i18;
                if ((i4 & 384) == 0) {
                }
                int i242222 = i17;
                if ((i6 & 306783379) != 306783378) {
                }
                oq5Var2.U();
                if ((i3 & 1) != 0) {
                }
                if (i23 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if ((i5 & 128) != 0) {
                }
                if (i12 == 0) {
                }
                if (i14 != 0) {
                }
                if (i16 != 0) {
                }
                if (i19 != 0) {
                }
                oq5Var2.q();
                final float f142222 = androidx.compose.foundation.layout.a.f(o0kVar2, (xof) oq5Var2.j(es5.n));
                oq5Var = oq5Var2;
                bg3.a(d.d(yciVar3, 1.0f), null, false, ild.C(-1088998601, new pyc() { // from class: dqd
                    @Override // defpackage.pyc
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        androidx.compose.foundation.layout.c cVar = (androidx.compose.foundation.layout.c) obj;
                        hq5 hq5Var2 = (hq5) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        cVar.getClass();
                        if ((intValue & 6) == 0) {
                            intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                        }
                        if ((intValue & 19) == 18) {
                            oq5 oq5Var3 = (oq5) hq5Var2;
                            if (oq5Var3.z()) {
                                oq5Var3.S();
                                return Unit.a;
                            }
                        }
                        float e2 = cVar.e();
                        float f152222 = vt0.d;
                        List list2 = list;
                        List list3 = list2;
                        int size = list3.size();
                        float f16 = f142222;
                        float f17 = f9;
                        float s = o5g.s(e2, f16, f17, f152222, i20, size, f10, f8, hq5Var2, 0);
                        float e3 = cVar.e() - f16;
                        float size2 = list3.size();
                        boolean z4 = Float.compare((e3 - (s * size2)) - (size2 * f17), (float) 0) >= 0;
                        Boolean valueOf = Boolean.valueOf(z4);
                        oq5 oq5Var4 = (oq5) hq5Var2;
                        Object obj4 = function13;
                        boolean f18 = oq5Var4.f(obj4) | oq5Var4.g(z4);
                        Object K2 = oq5Var4.K();
                        Object obj5 = gq5.a;
                        if (f18 || K2 == obj5) {
                            K2 = new ze1(obj4, z4, null, 5);
                            oq5Var4.k0(K2);
                        }
                        gld.w(oq5Var4, valueOf, (Function2) K2);
                        ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var4, 0);
                        int i25 = oq5Var4.P;
                        androidx.compose.runtime.internal.a l2 = oq5Var4.l();
                        vci vciVar = vci.a;
                        yci H = vnj.H(oq5Var4, vciVar);
                        xp5.T.getClass();
                        Function0 function0 = wp5.b;
                        oq5Var4.d0();
                        if (oq5Var4.O) {
                            oq5Var4.k(function0);
                        } else {
                            oq5Var4.n0();
                        }
                        g0g.U(oq5Var4, a3, wp5.f);
                        g0g.U(oq5Var4, l2, wp5.e);
                        kb5 kb5Var = wp5.g;
                        if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i25))) {
                            ouj.x(i25, oq5Var4, i25, kb5Var);
                        }
                        g0g.U(oq5Var4, H, wp5.d);
                        nx0 g2 = qx0.g(f17);
                        yci a4 = a.a(d.d(vciVar, 1.0f), "grid_lazy_row");
                        boolean h2 = oq5Var4.h(list2);
                        Function2 function29 = function24;
                        boolean f19 = h2 | oq5Var4.f(function29) | oq5Var4.c(s);
                        wn5 wn5Var2 = wn5Var;
                        boolean f20 = f19 | oq5Var4.f(wn5Var2);
                        Object K3 = oq5Var4.K();
                        if (f20 || K3 == obj5) {
                            K3 = new ta0(list2, function29, s, wn5Var2);
                            oq5Var4.k0(K3);
                        }
                        weo.h(a4, a2, o0kVar2, g2, null, null, z2, (Function1) K3, oq5Var4, 6, 104);
                        if (z4) {
                            oq5Var4.Z(-1178382815);
                        } else {
                            oq5Var4.Z(2040377993);
                            Function2 function210 = function25;
                            if (function210 == null) {
                                oq5Var4.Z(-1172791656);
                            } else {
                                oq5Var4.Z(2040377993);
                                function210.invoke(oq5Var4, 0);
                            }
                            oq5Var4.p(false);
                        }
                        oq5Var4.p(false);
                        oq5Var4.p(true);
                        return Unit.a;
                    }
                }, oq5Var), oq5Var, 3072, 6);
                float f152222 = f10;
                f5 = f9;
                function26 = function24;
                z3 = z2;
                function14 = function13;
                f11 = f152222;
                i21 = i20;
                o0kVar3 = o0kVar2;
                function27 = function25;
                yciVar4 = yciVar3;
                r = oq5Var.r();
                if (r != null) {
                }
            }
            function23 = function2;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            f5 = f2;
            i10 = i5 & 32;
            if (i10 != 0) {
            }
            i11 = i5 & 64;
            if (i11 != 0) {
            }
            if ((i3 & 12582912) == 0) {
            }
            i12 = i5 & 256;
            if (i12 != 0) {
            }
            i13 = i5 & RemoteCameraConfig.Mic.BUFFER_SIZE;
            if (i13 != 0) {
            }
            i14 = i13;
            i15 = i5 & 1024;
            if (i15 == 0) {
            }
            i18 = i5 & 2048;
            if (i18 == 0) {
            }
            i19 = i18;
            if ((i4 & 384) == 0) {
            }
            int i2422222 = i17;
            if ((i6 & 306783379) != 306783378) {
            }
            oq5Var2.U();
            if ((i3 & 1) != 0) {
            }
            if (i23 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if ((i5 & 128) != 0) {
            }
            if (i12 == 0) {
            }
            if (i14 != 0) {
            }
            if (i16 != 0) {
            }
            if (i19 != 0) {
            }
            oq5Var2.q();
            final float f1422222 = androidx.compose.foundation.layout.a.f(o0kVar2, (xof) oq5Var2.j(es5.n));
            oq5Var = oq5Var2;
            bg3.a(d.d(yciVar3, 1.0f), null, false, ild.C(-1088998601, new pyc() { // from class: dqd
                @Override // defpackage.pyc
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.foundation.layout.c cVar = (androidx.compose.foundation.layout.c) obj;
                    hq5 hq5Var2 = (hq5) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    cVar.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                    }
                    if ((intValue & 19) == 18) {
                        oq5 oq5Var3 = (oq5) hq5Var2;
                        if (oq5Var3.z()) {
                            oq5Var3.S();
                            return Unit.a;
                        }
                    }
                    float e2 = cVar.e();
                    float f1522222 = vt0.d;
                    List list2 = list;
                    List list3 = list2;
                    int size = list3.size();
                    float f16 = f1422222;
                    float f17 = f9;
                    float s = o5g.s(e2, f16, f17, f1522222, i20, size, f10, f8, hq5Var2, 0);
                    float e3 = cVar.e() - f16;
                    float size2 = list3.size();
                    boolean z4 = Float.compare((e3 - (s * size2)) - (size2 * f17), (float) 0) >= 0;
                    Boolean valueOf = Boolean.valueOf(z4);
                    oq5 oq5Var4 = (oq5) hq5Var2;
                    Object obj4 = function13;
                    boolean f18 = oq5Var4.f(obj4) | oq5Var4.g(z4);
                    Object K2 = oq5Var4.K();
                    Object obj5 = gq5.a;
                    if (f18 || K2 == obj5) {
                        K2 = new ze1(obj4, z4, null, 5);
                        oq5Var4.k0(K2);
                    }
                    gld.w(oq5Var4, valueOf, (Function2) K2);
                    ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var4, 0);
                    int i25 = oq5Var4.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var4.l();
                    vci vciVar = vci.a;
                    yci H = vnj.H(oq5Var4, vciVar);
                    xp5.T.getClass();
                    Function0 function0 = wp5.b;
                    oq5Var4.d0();
                    if (oq5Var4.O) {
                        oq5Var4.k(function0);
                    } else {
                        oq5Var4.n0();
                    }
                    g0g.U(oq5Var4, a3, wp5.f);
                    g0g.U(oq5Var4, l2, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i25))) {
                        ouj.x(i25, oq5Var4, i25, kb5Var);
                    }
                    g0g.U(oq5Var4, H, wp5.d);
                    nx0 g2 = qx0.g(f17);
                    yci a4 = a.a(d.d(vciVar, 1.0f), "grid_lazy_row");
                    boolean h2 = oq5Var4.h(list2);
                    Function2 function29 = function24;
                    boolean f19 = h2 | oq5Var4.f(function29) | oq5Var4.c(s);
                    wn5 wn5Var2 = wn5Var;
                    boolean f20 = f19 | oq5Var4.f(wn5Var2);
                    Object K3 = oq5Var4.K();
                    if (f20 || K3 == obj5) {
                        K3 = new ta0(list2, function29, s, wn5Var2);
                        oq5Var4.k0(K3);
                    }
                    weo.h(a4, a2, o0kVar2, g2, null, null, z2, (Function1) K3, oq5Var4, 6, 104);
                    if (z4) {
                        oq5Var4.Z(-1178382815);
                    } else {
                        oq5Var4.Z(2040377993);
                        Function2 function210 = function25;
                        if (function210 == null) {
                            oq5Var4.Z(-1172791656);
                        } else {
                            oq5Var4.Z(2040377993);
                            function210.invoke(oq5Var4, 0);
                        }
                        oq5Var4.p(false);
                    }
                    oq5Var4.p(false);
                    oq5Var4.p(true);
                    return Unit.a;
                }
            }, oq5Var), oq5Var, 3072, 6);
            float f1522222 = f10;
            f5 = f9;
            function26 = function24;
            z3 = z2;
            function14 = function13;
            f11 = f1522222;
            i21 = i20;
            o0kVar3 = o0kVar2;
            function27 = function25;
            yciVar4 = yciVar3;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        function23 = function2;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        f5 = f2;
        i10 = i5 & 32;
        if (i10 != 0) {
        }
        i11 = i5 & 64;
        if (i11 != 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        i12 = i5 & 256;
        if (i12 != 0) {
        }
        i13 = i5 & RemoteCameraConfig.Mic.BUFFER_SIZE;
        if (i13 != 0) {
        }
        i14 = i13;
        i15 = i5 & 1024;
        if (i15 == 0) {
        }
        i18 = i5 & 2048;
        if (i18 == 0) {
        }
        i19 = i18;
        if ((i4 & 384) == 0) {
        }
        int i24222222 = i17;
        if ((i6 & 306783379) != 306783378) {
        }
        oq5Var2.U();
        if ((i3 & 1) != 0) {
        }
        if (i23 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if ((i5 & 128) != 0) {
        }
        if (i12 == 0) {
        }
        if (i14 != 0) {
        }
        if (i16 != 0) {
        }
        if (i19 != 0) {
        }
        oq5Var2.q();
        final float f14222222 = androidx.compose.foundation.layout.a.f(o0kVar2, (xof) oq5Var2.j(es5.n));
        oq5Var = oq5Var2;
        bg3.a(d.d(yciVar3, 1.0f), null, false, ild.C(-1088998601, new pyc() { // from class: dqd
            @Override // defpackage.pyc
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                androidx.compose.foundation.layout.c cVar = (androidx.compose.foundation.layout.c) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                cVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                float e2 = cVar.e();
                float f15222222 = vt0.d;
                List list2 = list;
                List list3 = list2;
                int size = list3.size();
                float f16 = f14222222;
                float f17 = f9;
                float s = o5g.s(e2, f16, f17, f15222222, i20, size, f10, f8, hq5Var2, 0);
                float e3 = cVar.e() - f16;
                float size2 = list3.size();
                boolean z4 = Float.compare((e3 - (s * size2)) - (size2 * f17), (float) 0) >= 0;
                Boolean valueOf = Boolean.valueOf(z4);
                oq5 oq5Var4 = (oq5) hq5Var2;
                Object obj4 = function13;
                boolean f18 = oq5Var4.f(obj4) | oq5Var4.g(z4);
                Object K2 = oq5Var4.K();
                Object obj5 = gq5.a;
                if (f18 || K2 == obj5) {
                    K2 = new ze1(obj4, z4, null, 5);
                    oq5Var4.k0(K2);
                }
                gld.w(oq5Var4, valueOf, (Function2) K2);
                ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var4, 0);
                int i25 = oq5Var4.P;
                androidx.compose.runtime.internal.a l2 = oq5Var4.l();
                vci vciVar = vci.a;
                yci H = vnj.H(oq5Var4, vciVar);
                xp5.T.getClass();
                Function0 function0 = wp5.b;
                oq5Var4.d0();
                if (oq5Var4.O) {
                    oq5Var4.k(function0);
                } else {
                    oq5Var4.n0();
                }
                g0g.U(oq5Var4, a3, wp5.f);
                g0g.U(oq5Var4, l2, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i25))) {
                    ouj.x(i25, oq5Var4, i25, kb5Var);
                }
                g0g.U(oq5Var4, H, wp5.d);
                nx0 g2 = qx0.g(f17);
                yci a4 = a.a(d.d(vciVar, 1.0f), "grid_lazy_row");
                boolean h2 = oq5Var4.h(list2);
                Function2 function29 = function24;
                boolean f19 = h2 | oq5Var4.f(function29) | oq5Var4.c(s);
                wn5 wn5Var2 = wn5Var;
                boolean f20 = f19 | oq5Var4.f(wn5Var2);
                Object K3 = oq5Var4.K();
                if (f20 || K3 == obj5) {
                    K3 = new ta0(list2, function29, s, wn5Var2);
                    oq5Var4.k0(K3);
                }
                weo.h(a4, a2, o0kVar2, g2, null, null, z2, (Function1) K3, oq5Var4, 6, 104);
                if (z4) {
                    oq5Var4.Z(-1178382815);
                } else {
                    oq5Var4.Z(2040377993);
                    Function2 function210 = function25;
                    if (function210 == null) {
                        oq5Var4.Z(-1172791656);
                    } else {
                        oq5Var4.Z(2040377993);
                        function210.invoke(oq5Var4, 0);
                    }
                    oq5Var4.p(false);
                }
                oq5Var4.p(false);
                oq5Var4.p(true);
                return Unit.a;
            }
        }, oq5Var), oq5Var, 3072, 6);
        float f15222222 = f10;
        f5 = f9;
        function26 = function24;
        z3 = z2;
        function14 = function13;
        f11 = f15222222;
        i21 = i20;
        o0kVar3 = o0kVar2;
        function27 = function25;
        yciVar4 = yciVar3;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(final List list, yci yciVar, o0k o0kVar, float f2, float f3, fvf fvfVar, Function1 function1, boolean z, int i2, final wn5 wn5Var, hq5 hq5Var, final int i3, final int i4) {
        int i5;
        yci yciVar2;
        int i6;
        o0k o0kVar2;
        int i7;
        float f4;
        int i8;
        int i9;
        boolean z2;
        int i10;
        int i11;
        fvf a2;
        Object K;
        float f5;
        Function1 function12;
        int i12;
        final o0k o0kVar3;
        final float f6;
        final yci yciVar3;
        final float f7;
        final fvf fvfVar2;
        final Function1 function13;
        final boolean z3;
        final int i13;
        xmn r;
        list.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1753937298);
        if ((i3 & 6) == 0) {
            i5 = ((i3 & 8) == 0 ? oq5Var.f(list) : oq5Var.h(list) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i14 = i4 & 2;
        if (i14 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            yciVar2 = yciVar;
            i5 |= oq5Var.f(yciVar2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 384) == 0) {
                o0kVar2 = o0kVar;
                i5 |= oq5Var.f(o0kVar2) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    f4 = f2;
                    i5 |= oq5Var.c(f4) ? 2048 : 1024;
                    int i15 = i5 | 24576;
                    if ((196608 & i3) == 0) {
                        i15 = 90112 | i5;
                    }
                    if ((i4 & 64) == 0) {
                        i15 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
                    } else if ((i3 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
                        i15 |= oq5Var.h(null) ? 1048576 : 524288;
                    }
                    i8 = 12582912 | i15;
                    i9 = i4 & 256;
                    if (i9 == 0) {
                        i8 = 113246208 | i15;
                    } else if ((100663296 & i3) == 0) {
                        z2 = z;
                        i8 |= oq5Var.g(z2) ? 67108864 : 33554432;
                        i10 = i4 & RemoteCameraConfig.Mic.BUFFER_SIZE;
                        if (i10 != 0) {
                            i8 |= 805306368;
                        } else if ((805306368 & i3) == 0) {
                            i11 = i2;
                            i8 |= oq5Var.d(i11) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                            if ((i8 & 306783379) == 306783378 || !oq5Var.z()) {
                                oq5Var.U();
                                int i16 = 1;
                                if ((i3 & 1) != 0 || oq5Var.y()) {
                                    if (i14 != 0) {
                                        yciVar2 = vci.a;
                                    }
                                    if (i6 != 0) {
                                        o0kVar2 = vt0.c;
                                    }
                                    if (i7 != 0) {
                                        f4 = vt0.a;
                                    }
                                    a2 = hvf.a(0, 0, oq5Var, 0, 3);
                                    int i17 = i8 & (-458753);
                                    K = oq5Var.K();
                                    if (K == gq5.a) {
                                        K = new g4d(20);
                                        oq5Var.k0(K);
                                    }
                                    Function1 function14 = (Function1) K;
                                    if (i9 != 0) {
                                        z2 = true;
                                    }
                                    f5 = Float.NaN;
                                    if (i10 == 0) {
                                        float f8 = vt0.a;
                                        function12 = function14;
                                        i11 = 2;
                                    } else {
                                        function12 = function14;
                                    }
                                    i12 = i17;
                                    o0kVar3 = o0kVar2;
                                } else {
                                    oq5Var.S();
                                    f5 = f3;
                                    function12 = function1;
                                    i12 = i8 & (-458753);
                                    o0kVar3 = o0kVar2;
                                    a2 = fvfVar;
                                }
                                oq5Var.q();
                                int i18 = i12 << 3;
                                fvf fvfVar3 = a2;
                                int i19 = i12 << 6;
                                int i20 = i12 >> 24;
                                yci yciVar4 = yciVar2;
                                float f9 = f5;
                                f6 = f4;
                                boolean z4 = z2;
                                int i21 = i11;
                                i(list, yciVar4, null, o0kVar3, f6, 0.0f, f9, fvfVar3, null, function12, z4, i21, ild.C(1324737129, new lo1(wn5Var, i16), oq5Var), oq5Var, (i18 & 7168) | (i12 & 126) | (57344 & i18) | (3670016 & i19) | (234881024 & i19) | (i19 & 1879048192), (i20 & 112) | (i20 & 14) | 384, 36);
                                yciVar3 = yciVar4;
                                f7 = f9;
                                fvfVar2 = fvfVar3;
                                function13 = function12;
                                z3 = z4;
                                i13 = i21;
                            } else {
                                oq5Var.S();
                                f7 = f3;
                                function13 = function1;
                                yciVar3 = yciVar2;
                                o0kVar3 = o0kVar2;
                                f6 = f4;
                                z3 = z2;
                                i13 = i11;
                                fvfVar2 = fvfVar;
                            }
                            r = oq5Var.r();
                            if (r == null) {
                                r.d = new Function2() { // from class: cqd
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        up6.j(list, yciVar3, o0kVar3, f6, f7, fvfVar2, function13, z3, i13, wn5Var, (hq5) obj, rvf.R(i3 | 1), i4);
                                        return Unit.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        i11 = i2;
                        if ((i8 & 306783379) == 306783378) {
                        }
                        oq5Var.U();
                        int i162 = 1;
                        if ((i3 & 1) != 0) {
                        }
                        if (i14 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        a2 = hvf.a(0, 0, oq5Var, 0, 3);
                        int i172 = i8 & (-458753);
                        K = oq5Var.K();
                        if (K == gq5.a) {
                        }
                        Function1 function142 = (Function1) K;
                        if (i9 != 0) {
                        }
                        f5 = Float.NaN;
                        if (i10 == 0) {
                        }
                        i12 = i172;
                        o0kVar3 = o0kVar2;
                        oq5Var.q();
                        int i182 = i12 << 3;
                        fvf fvfVar32 = a2;
                        int i192 = i12 << 6;
                        int i202 = i12 >> 24;
                        yci yciVar42 = yciVar2;
                        float f92 = f5;
                        f6 = f4;
                        boolean z42 = z2;
                        int i212 = i11;
                        i(list, yciVar42, null, o0kVar3, f6, 0.0f, f92, fvfVar32, null, function12, z42, i212, ild.C(1324737129, new lo1(wn5Var, i162), oq5Var), oq5Var, (i182 & 7168) | (i12 & 126) | (57344 & i182) | (3670016 & i192) | (234881024 & i192) | (i192 & 1879048192), (i202 & 112) | (i202 & 14) | 384, 36);
                        yciVar3 = yciVar42;
                        f7 = f92;
                        fvfVar2 = fvfVar32;
                        function13 = function12;
                        z3 = z42;
                        i13 = i212;
                        r = oq5Var.r();
                        if (r == null) {
                        }
                    }
                    z2 = z;
                    i10 = i4 & RemoteCameraConfig.Mic.BUFFER_SIZE;
                    if (i10 != 0) {
                    }
                    i11 = i2;
                    if ((i8 & 306783379) == 306783378) {
                    }
                    oq5Var.U();
                    int i1622 = 1;
                    if ((i3 & 1) != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    a2 = hvf.a(0, 0, oq5Var, 0, 3);
                    int i1722 = i8 & (-458753);
                    K = oq5Var.K();
                    if (K == gq5.a) {
                    }
                    Function1 function1422 = (Function1) K;
                    if (i9 != 0) {
                    }
                    f5 = Float.NaN;
                    if (i10 == 0) {
                    }
                    i12 = i1722;
                    o0kVar3 = o0kVar2;
                    oq5Var.q();
                    int i1822 = i12 << 3;
                    fvf fvfVar322 = a2;
                    int i1922 = i12 << 6;
                    int i2022 = i12 >> 24;
                    yci yciVar422 = yciVar2;
                    float f922 = f5;
                    f6 = f4;
                    boolean z422 = z2;
                    int i2122 = i11;
                    i(list, yciVar422, null, o0kVar3, f6, 0.0f, f922, fvfVar322, null, function12, z422, i2122, ild.C(1324737129, new lo1(wn5Var, i1622), oq5Var), oq5Var, (i1822 & 7168) | (i12 & 126) | (57344 & i1822) | (3670016 & i1922) | (234881024 & i1922) | (i1922 & 1879048192), (i2022 & 112) | (i2022 & 14) | 384, 36);
                    yciVar3 = yciVar422;
                    f7 = f922;
                    fvfVar2 = fvfVar322;
                    function13 = function12;
                    z3 = z422;
                    i13 = i2122;
                    r = oq5Var.r();
                    if (r == null) {
                    }
                }
                f4 = f2;
                int i152 = i5 | 24576;
                if ((196608 & i3) == 0) {
                }
                if ((i4 & 64) == 0) {
                }
                i8 = 12582912 | i152;
                i9 = i4 & 256;
                if (i9 == 0) {
                }
                z2 = z;
                i10 = i4 & RemoteCameraConfig.Mic.BUFFER_SIZE;
                if (i10 != 0) {
                }
                i11 = i2;
                if ((i8 & 306783379) == 306783378) {
                }
                oq5Var.U();
                int i16222 = 1;
                if ((i3 & 1) != 0) {
                }
                if (i14 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                a2 = hvf.a(0, 0, oq5Var, 0, 3);
                int i17222 = i8 & (-458753);
                K = oq5Var.K();
                if (K == gq5.a) {
                }
                Function1 function14222 = (Function1) K;
                if (i9 != 0) {
                }
                f5 = Float.NaN;
                if (i10 == 0) {
                }
                i12 = i17222;
                o0kVar3 = o0kVar2;
                oq5Var.q();
                int i18222 = i12 << 3;
                fvf fvfVar3222 = a2;
                int i19222 = i12 << 6;
                int i20222 = i12 >> 24;
                yci yciVar4222 = yciVar2;
                float f9222 = f5;
                f6 = f4;
                boolean z4222 = z2;
                int i21222 = i11;
                i(list, yciVar4222, null, o0kVar3, f6, 0.0f, f9222, fvfVar3222, null, function12, z4222, i21222, ild.C(1324737129, new lo1(wn5Var, i16222), oq5Var), oq5Var, (i18222 & 7168) | (i12 & 126) | (57344 & i18222) | (3670016 & i19222) | (234881024 & i19222) | (i19222 & 1879048192), (i20222 & 112) | (i20222 & 14) | 384, 36);
                yciVar3 = yciVar4222;
                f7 = f9222;
                fvfVar2 = fvfVar3222;
                function13 = function12;
                z3 = z4222;
                i13 = i21222;
                r = oq5Var.r();
                if (r == null) {
                }
            }
            o0kVar2 = o0kVar;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            f4 = f2;
            int i1522 = i5 | 24576;
            if ((196608 & i3) == 0) {
            }
            if ((i4 & 64) == 0) {
            }
            i8 = 12582912 | i1522;
            i9 = i4 & 256;
            if (i9 == 0) {
            }
            z2 = z;
            i10 = i4 & RemoteCameraConfig.Mic.BUFFER_SIZE;
            if (i10 != 0) {
            }
            i11 = i2;
            if ((i8 & 306783379) == 306783378) {
            }
            oq5Var.U();
            int i162222 = 1;
            if ((i3 & 1) != 0) {
            }
            if (i14 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            a2 = hvf.a(0, 0, oq5Var, 0, 3);
            int i172222 = i8 & (-458753);
            K = oq5Var.K();
            if (K == gq5.a) {
            }
            Function1 function142222 = (Function1) K;
            if (i9 != 0) {
            }
            f5 = Float.NaN;
            if (i10 == 0) {
            }
            i12 = i172222;
            o0kVar3 = o0kVar2;
            oq5Var.q();
            int i182222 = i12 << 3;
            fvf fvfVar32222 = a2;
            int i192222 = i12 << 6;
            int i202222 = i12 >> 24;
            yci yciVar42222 = yciVar2;
            float f92222 = f5;
            f6 = f4;
            boolean z42222 = z2;
            int i212222 = i11;
            i(list, yciVar42222, null, o0kVar3, f6, 0.0f, f92222, fvfVar32222, null, function12, z42222, i212222, ild.C(1324737129, new lo1(wn5Var, i162222), oq5Var), oq5Var, (i182222 & 7168) | (i12 & 126) | (57344 & i182222) | (3670016 & i192222) | (234881024 & i192222) | (i192222 & 1879048192), (i202222 & 112) | (i202222 & 14) | 384, 36);
            yciVar3 = yciVar42222;
            f7 = f92222;
            fvfVar2 = fvfVar32222;
            function13 = function12;
            z3 = z42222;
            i13 = i212222;
            r = oq5Var.r();
            if (r == null) {
            }
        }
        yciVar2 = yciVar;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        o0kVar2 = o0kVar;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        f4 = f2;
        int i15222 = i5 | 24576;
        if ((196608 & i3) == 0) {
        }
        if ((i4 & 64) == 0) {
        }
        i8 = 12582912 | i15222;
        i9 = i4 & 256;
        if (i9 == 0) {
        }
        z2 = z;
        i10 = i4 & RemoteCameraConfig.Mic.BUFFER_SIZE;
        if (i10 != 0) {
        }
        i11 = i2;
        if ((i8 & 306783379) == 306783378) {
        }
        oq5Var.U();
        int i1622222 = 1;
        if ((i3 & 1) != 0) {
        }
        if (i14 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        a2 = hvf.a(0, 0, oq5Var, 0, 3);
        int i1722222 = i8 & (-458753);
        K = oq5Var.K();
        if (K == gq5.a) {
        }
        Function1 function1422222 = (Function1) K;
        if (i9 != 0) {
        }
        f5 = Float.NaN;
        if (i10 == 0) {
        }
        i12 = i1722222;
        o0kVar3 = o0kVar2;
        oq5Var.q();
        int i1822222 = i12 << 3;
        fvf fvfVar322222 = a2;
        int i1922222 = i12 << 6;
        int i2022222 = i12 >> 24;
        yci yciVar422222 = yciVar2;
        float f922222 = f5;
        f6 = f4;
        boolean z422222 = z2;
        int i2122222 = i11;
        i(list, yciVar422222, null, o0kVar3, f6, 0.0f, f922222, fvfVar322222, null, function12, z422222, i2122222, ild.C(1324737129, new lo1(wn5Var, i1622222), oq5Var), oq5Var, (i1822222 & 7168) | (i12 & 126) | (57344 & i1822222) | (3670016 & i1922222) | (234881024 & i1922222) | (i1922222 & 1879048192), (i2022222 & 112) | (i2022222 & 14) | 384, 36);
        yciVar3 = yciVar422222;
        f7 = f922222;
        fvfVar2 = fvfVar322222;
        function13 = function12;
        z3 = z422222;
        i13 = i2122222;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void k(ArrayList arrayList, zgf zgfVar, fvf fvfVar, o0k o0kVar, hq5 hq5Var, int i2) {
        int i3;
        zgfVar.getClass();
        fvfVar.getClass();
        o0kVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1214723236);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(arrayList) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(zgfVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(fvfVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(o0kVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            c3x.t(fvfVar, arrayList, oq5Var, ((i3 >> 6) & 14) | ((i3 << 3) & 112));
            vm C = ghh.C(o0kVar, androidx.compose.foundation.layout.a.c(0.0f, 24, 0.0f, 16, 5));
            yci c2 = d.c(vci.a, 1.0f);
            boolean h2 = oq5Var.h(arrayList) | oq5Var.h(zgfVar);
            Object K = oq5Var.K();
            if (h2 || K == gq5.a) {
                K = new dae(8, arrayList, zgfVar);
                oq5Var.k0(K);
            }
            weo.f(c2, fvfVar, C, null, null, null, false, null, (Function1) K, oq5Var, ((i3 >> 3) & 112) | 6, 504);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wda(i2, 17, arrayList, zgfVar, fvfVar, o0kVar);
        }
    }

    public static final void l(y26 y26Var, d36 d36Var, hq5 hq5Var, int i2) {
        int i3;
        int i4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1706187685);
        if ((i2 & 6) == 0) {
            i3 = i2 | ((i2 & 8) == 0 ? oq5Var.f(y26Var) : oq5Var.h(y26Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(d36Var) ? 32 : 16;
        }
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            String M = rvf.M(R.string.show_more_item_text, oq5Var);
            vci vciVar = vci.a;
            yci d2 = androidx.compose.foundation.layout.a.d(d.c(vciVar, 1.0f), 0.66f);
            kfh d3 = ug3.d(b2c.b, false);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, d2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, d3, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l2, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            yci a2 = b.a.a(vciVar, b2c.f);
            int i6 = i3 & 14;
            int i7 = i3 & 112;
            int i8 = i3;
            boolean f2 = (i7 == 32) | oq5Var.f(M) | (i6 == 4 || ((i3 & 8) != 0 && oq5Var.h(y26Var)));
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (f2 || K == kjnVar) {
                K = new g3(20, M, y26Var, d36Var);
                oq5Var.k0(K);
            }
            yci b2 = nfp.b(a2, true, (Function1) K);
            gz2 gz2Var = b2c.o;
            ta5 a3 = sa5.a(qx0.e, gz2Var, oq5Var, 54);
            int i9 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, b2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var);
            g0g.U(oq5Var, l3, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i9))) {
                ouj.x(i9, oq5Var, i9, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            agr agrVar = eq0.a;
            long j2 = ((dq0) oq5Var.j(agrVar)).a.a;
            long j3 = ((dq0) oq5Var.j(agrVar)).c.c;
            HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(gz2Var);
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new kz5(7);
                oq5Var.k0(K2);
            }
            yci b3 = nfp.b(horizontalAlignElement, false, (Function1) K2);
            long b4 = d85.b(((dq0) oq5Var.j(agrVar)).d.c, 0.08f, 0.0f, 0.0f, 0.0f, 14);
            int i10 = 8;
            boolean z = (i7 == 32) | (i6 == 4 || ((i8 & 8) != 0 && oq5Var.h(y26Var)));
            Object K3 = oq5Var.K();
            if (z || K3 == kjnVar) {
                i4 = 1;
                K3 = new v26(y26Var, d36Var, i4);
                oq5Var.k0(K3);
            } else {
                i4 = 1;
            }
            a0g.d((Function0) K3, true, b4, j2, j3, b3, 0.0f, false, zc4.c, oq5Var, 100663344, 192);
            u1g.l(oq5Var, d.e(vciVar, 8));
            ges j4 = nu0.j();
            long b5 = d85.b(((dq0) oq5Var.j(agrVar)).b.a, 0.9f, 0.0f, 0.0f, 0.0f, 14);
            Object K4 = oq5Var.K();
            if (K4 == kjnVar) {
                K4 = new kz5(i10);
                oq5Var.k0(K4);
            }
            xcs.b(M, nfp.b(vciVar, false, (Function1) K4), b5, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, j4, oq5Var, 0, 0, 65016);
            oq5Var = oq5Var;
            oq5Var.p(true);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new z2(y26Var, d36Var, i2, 21);
        }
    }

    public static Object m(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final poi n(boolean z, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = tlm.h(1.0f, oq5Var);
        }
        poi poiVar = (poi) K;
        aqi o0 = szf.o0(Boolean.valueOf(z), oq5Var);
        Unit unit = Unit.a;
        boolean f2 = oq5Var.f(o0);
        Object K2 = oq5Var.K();
        if (f2 || K2 == kjnVar) {
            K2 = new v3(o0, poiVar, (Continuation) null, 13);
            oq5Var.k0(K2);
        }
        gld.w(oq5Var, unit, (Function2) K2);
        return poiVar;
    }

    public static final udb q(String str, Enum[] enumArr, String[] strArr, Annotation[][] annotationArr) {
        enumArr.getClass();
        pdb pdbVar = new pdb(str, enumArr.length);
        int length = enumArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            Enum r5 = enumArr[i2];
            int i4 = i3 + 1;
            String str2 = (String) xz0.E(i3, strArr);
            if (str2 == null) {
                str2 = r5.name();
            }
            pdbVar.k(str2, false);
            Annotation[] annotationArr2 = (Annotation[]) xz0.E(i3, annotationArr);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    annotation.getClass();
                    int i5 = pdbVar.d;
                    List[] listArr = pdbVar.f;
                    List list = listArr[i5];
                    if (list == null) {
                        list = new ArrayList(1);
                        listArr[pdbVar.d] = list;
                    }
                    list.add(annotation);
                }
            }
            i2++;
            i3 = i4;
        }
        udb udbVar = new udb(str, enumArr);
        udbVar.c = pdbVar;
        return udbVar;
    }

    public static final void r(xjo xjoVar) {
        xjoVar.getClass();
        n8g b2 = t75.b();
        cko D0 = xjoVar.D0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (D0.q()) {
            try {
                b2.add(D0.x0(0));
            } finally {
            }
        }
        i4w.w(D0, null);
        ListIterator listIterator = t75.a(b2).listIterator(0);
        while (true) {
            ezd ezdVar = (ezd) listIterator;
            if (!ezdVar.hasNext()) {
                return;
            }
            String str = (String) ezdVar.next();
            if (c.v(str, "room_fts_content_sync_", false)) {
                p6g.s(xjoVar, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static boolean s(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final boolean t(long j2, long j3) {
        return j2 == j3;
    }

    public static final bde u() {
        bde bdeVar = o;
        if (bdeVar != null) {
            return bdeVar;
        }
        ade adeVar = new ade("AutoMirrored.Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        c5b c5bVar = nzt.a;
        f3r f3rVar = new f3r(d85.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new qak(20.0f, 11.0f));
        arrayList.add(new oak(7.83f));
        arrayList.add(new xak(5.59f, -5.59f));
        arrayList.add(new pak(12.0f, 4.0f));
        arrayList.add(new xak(-8.0f, 8.0f));
        arrayList.add(new xak(8.0f, 8.0f));
        arrayList.add(new xak(1.41f, -1.41f));
        arrayList.add(new pak(7.83f, 13.0f));
        arrayList.add(new oak(20.0f));
        arrayList.add(new cbk(-2.0f));
        arrayList.add(mak.c);
        ade.a(adeVar, arrayList, 0, f3rVar, 2);
        bde b2 = adeVar.b();
        o = b2;
        return b2;
    }

    public static final CoroutineContext w(ueo ueoVar, boolean z, cg6 cg6Var) {
        m6t m6tVar = (m6t) cg6Var.getContext().get(m6t.b);
        CoroutineContext coroutineContext = m6tVar != null ? m6tVar.a : null;
        if (!ueoVar.o()) {
            tf6 tf6Var = ueoVar.b;
            if (tf6Var == null) {
                Intrinsics.j("coroutineScope");
                throw null;
            }
            CoroutineContext coroutineContext2 = tf6Var.a;
            if (coroutineContext == null) {
                coroutineContext = g.a;
            }
            return coroutineContext2.plus(coroutineContext);
        }
        if (coroutineContext != null) {
            tf6 tf6Var2 = ueoVar.b;
            if (tf6Var2 != null) {
                return tf6Var2.a.plus(coroutineContext);
            }
            Intrinsics.j("coroutineScope");
            throw null;
        }
        if (z) {
            CoroutineContext coroutineContext3 = ueoVar.c;
            if (coroutineContext3 != null) {
                return coroutineContext3;
            }
            Intrinsics.j("transactionContext");
            throw null;
        }
        tf6 tf6Var3 = ueoVar.b;
        if (tf6Var3 != null) {
            return tf6Var3.a;
        }
        Intrinsics.j("coroutineScope");
        throw null;
    }

    public static final void x(dpc dpcVar) {
        mpf mpfVar;
        uzj uzjVar;
        f8j f8jVar = dpcVar.a.h;
        if (f8jVar == null || (mpfVar = f8jVar.l) == null || (uzjVar = mpfVar.n) == null) {
            return;
        }
        uzjVar.getFocusOwner();
    }

    public static final LinearLayoutManager y(RecyclerView recyclerView) {
        yon layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        return null;
    }

    public static final long z(Number number) {
        if (number instanceof Long) {
            return number.longValue();
        }
        if (number instanceof Integer) {
            return number.longValue();
        }
        if (number instanceof Byte) {
            return number.longValue();
        }
        throw new Error("Unsupported type in `int64` function: " + number);
    }

    public abstract boolean o(Object obj, Object obj2);

    public abstract boolean p(Object obj, Object obj2);

    public Object v(Object obj, Object obj2) {
        return null;
    }
}
