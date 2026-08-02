package defpackage;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import io.requery.android.database.sqlite.SQLiteDatabase;
import j$.time.ZonedDateTime;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.data.audio.Album$AlbumType;
import ru.yandex.music.data.audio.WarningContent;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes.dex */
public abstract class wyf {
    public static yci C(yci yciVar, Function0 function0, float f, float f2, int i) {
        if ((i & 2) != 0) {
            f = 4;
        }
        if ((i & 4) != 0) {
            f2 = 0;
        }
        yciVar.getClass();
        function0.getClass();
        return a.n(androidx.compose.foundation.a.e(xp3.u(androidx.compose.ui.layout.a.b(yciVar, new mbh(f, f2, 2)), ugo.a(4)), false, null, null, function0, 3), f, f2);
    }

    public static final View D(View view) {
        View view2 = null;
        while (view != null) {
            if (!K(view) || view.isLayoutRequested()) {
                view2 = view;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return view2;
    }

    public static mqs E(String str) {
        return new mqs(str, null, "Track ".concat(str), new k10("1", Album$AlbumType.COMMON.a, str, "Album", 0, 0, false, 240), 0L, t75.c(zp2.k), null, null, null, false, null, false, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, 0L, null, -262208, 511);
    }

    public static final qyf F(nyf nyfVar) {
        nyfVar.getClass();
        bnd bndVar = nyfVar.a;
        while (true) {
            qyf qyfVar = (qyf) ((AtomicReference) bndVar.b).get();
            if (qyfVar != null) {
                return qyfVar;
            }
            wqr n = a4g.n();
            dq7 dq7Var = ca8.a;
            qyf qyfVar2 = new qyf(nyfVar, e.c(n, j5h.a.g));
            AtomicReference atomicReference = (AtomicReference) bndVar.b;
            do {
                Continuation continuation = null;
                if (atomicReference.compareAndSet(null, qyfVar2)) {
                    dq7 dq7Var2 = ca8.a;
                    x97.y(qyfVar2, j5h.a.g, null, new nz5(qyfVar2, continuation, 28), 2);
                    return qyfVar2;
                }
            } while (atomicReference.get() == null);
        }
    }

    public static b2r G() {
        return (b2r) g2r.a.s();
    }

    public static final kotlin.ranges.a H(View view, int i, int i2) {
        int i3 = i2 + i;
        if (!N(view)) {
            return yhn.m(i, i3);
        }
        kotlin.ranges.a.d.getClass();
        return new kotlin.ranges.a(i3 - 1, i, -1);
    }

    public static final ges I() {
        vpc vpcVar = wqc.a;
        return new ges(0L, v7g.z(68), tqc.p, null, null, vpcVar, null, 0L, null, 0, v7g.z(68), null, new h6g(17, e6g.d), 0, 15597529);
    }

    public static sj J() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(j3c.b());
        long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
        long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
        String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
        if (j == 0 || j2 == 0 || string == null) {
            return null;
        }
        sj sjVar = new sj(Long.valueOf(j), Long.valueOf(j2));
        sjVar.a = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
        SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(j3c.b());
        sjVar.c = defaultSharedPreferences2.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage") ? new c7f(defaultSharedPreferences2.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences2.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false), 3) : null;
        sjVar.b = Long.valueOf(System.currentTimeMillis());
        UUID fromString = UUID.fromString(string);
        fromString.getClass();
        sjVar.f = fromString;
        return sjVar;
    }

    public static final boolean K(View view) {
        return view.getWidth() > 0 || view.getHeight() > 0;
    }

    public static final boolean L(mqs mqsVar) {
        mqsVar.getClass();
        x1t x1tVar = x1t.AudioBook;
        String str = mqsVar.q;
        x1tVar.getClass();
        if (str == null) {
            return false;
        }
        return x1tVar.a.contains(str);
    }

    public static boolean M() {
        return ((Boolean) t5j.e.getValue()).booleanValue();
    }

    public static final boolean N(View view) {
        WeakHashMap weakHashMap = wdu.a;
        return view.getLayoutDirection() == 1;
    }

    public static final boolean O(mqs mqsVar) {
        mqsVar.getClass();
        x1t x1tVar = x1t.NonMusic;
        String str = mqsVar.q;
        x1tVar.getClass();
        if (str == null) {
            return false;
        }
        return x1tVar.a.contains(str);
    }

    public static final boolean P(mqs mqsVar) {
        mqsVar.getClass();
        x1t x1tVar = x1t.Podcast;
        String str = mqsVar.q;
        x1tVar.getClass();
        if (str == null) {
            return false;
        }
        return x1tVar.a.contains(str);
    }

    public static b2r Q(b2r b2rVar) {
        if (b2rVar instanceof f9t) {
            f9t f9tVar = (f9t) b2rVar;
            if (f9tVar.t == ldg.r()) {
                f9tVar.r = null;
                return b2rVar;
            }
        }
        if (b2rVar instanceof g9t) {
            g9t g9tVar = (g9t) b2rVar;
            if (g9tVar.h == ldg.r()) {
                g9tVar.g = null;
                return b2rVar;
            }
        }
        b2r h = g2r.h(b2rVar, null, false);
        h.j();
        return h;
    }

    public static final yci R(yci yciVar) {
        yciVar.getClass();
        return androidx.compose.ui.layout.a.b(yciVar, new ep5(20));
    }

    public static final twu S(mm6 mm6Var, kxi kxiVar, k6l k6lVar, pfn pfnVar, nwu nwuVar, qwu qwuVar, uwu uwuVar, List list, Function0 function0, Function1 function1) {
        list.getClass();
        mm6Var.getClass();
        kxiVar.getClass();
        function0.getClass();
        k6lVar.getClass();
        uwuVar.getClass();
        qwuVar.getClass();
        return new twu(mm6Var, kxiVar, k6lVar, pfnVar, nwuVar, qwuVar, uwuVar, list, function0, function1);
    }

    public static twu T(StationId stationId, mm6 mm6Var, kxi kxiVar, Function0 function0, k6l k6lVar, uwu uwuVar, qwu qwuVar, nwu nwuVar, int i) {
        nwu nwuVar2 = (i & 128) != 0 ? null : nwuVar;
        stationId.getClass();
        kxiVar.getClass();
        k6lVar.getClass();
        uwuVar.getClass();
        qwuVar.getClass();
        return S(mm6Var, kxiVar, k6lVar, null, nwuVar2, qwuVar, uwuVar, t75.c(stationId.h()), function0, null);
    }

    public static Object U(Function0 function0, Function1 function1) {
        b2r f9tVar;
        if (function1 == null) {
            return function0.invoke();
        }
        b2r b2rVar = (b2r) g2r.a.s();
        if (b2rVar instanceof f9t) {
            f9t f9tVar2 = (f9t) b2rVar;
            if (f9tVar2.t == ldg.r()) {
                Function1 function12 = f9tVar2.r;
                Function1 function13 = f9tVar2.s;
                try {
                    ((f9t) b2rVar).r = g2r.l(function1, function12, true);
                    ((f9t) b2rVar).s = function13;
                    return function0.invoke();
                } finally {
                    f9tVar2.r = function12;
                    f9tVar2.s = function13;
                }
            }
        }
        if (b2rVar == null || (b2rVar instanceof ypi)) {
            f9tVar = new f9t(b2rVar instanceof ypi ? (ypi) b2rVar : null, function1, null, true, false);
        } else {
            if (function1 == null) {
                return function0.invoke();
            }
            f9tVar = b2rVar.u(function1);
        }
        try {
            b2r j = f9tVar.j();
            try {
                Object invoke = function0.invoke();
                b2r.q(j);
                f9tVar.c();
                return invoke;
            } catch (Throwable th) {
                b2r.q(j);
                throw th;
            }
        } catch (Throwable th2) {
            f9tVar.c();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [byte[], java.io.Serializable] */
    public static anx V(byte[] bArr) {
        UUID[] uuidArr;
        d7k d7kVar = new d7k(bArr);
        if (d7kVar.c < 32) {
            return null;
        }
        d7kVar.H(0);
        int a = d7kVar.a();
        int h = d7kVar.h();
        if (h != a) {
            vq1.n0("PsshAtomUtil", "Advertised atom size (" + h + ") does not match buffer size: " + a);
            return null;
        }
        int h2 = d7kVar.h();
        if (h2 != 1886614376) {
            dfi.o(h2, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int c = ch3.c(d7kVar.h());
        if (c > 1) {
            dfi.o(c, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(d7kVar.p(), d7kVar.p());
        if (c == 1) {
            int z = d7kVar.z();
            uuidArr = new UUID[z];
            for (int i = 0; i < z; i++) {
                uuidArr[i] = new UUID(d7kVar.p(), d7kVar.p());
            }
        } else {
            uuidArr = null;
        }
        int z2 = d7kVar.z();
        int a2 = d7kVar.a();
        if (z2 == a2) {
            ?? r2 = new byte[z2];
            d7kVar.f(r2, 0, z2);
            return new anx(uuid, c, (Serializable) r2, uuidArr);
        }
        vq1.n0("PsshAtomUtil", "Atom data size (" + z2 + ") does not match the bytes left: " + a2);
        return null;
    }

    public static byte[] W(UUID uuid, byte[] bArr) {
        anx V = V(bArr);
        if (V == null) {
            return null;
        }
        UUID uuid2 = (UUID) V.b;
        if (uuid.equals(uuid2)) {
            return (byte[]) V.c;
        }
        vq1.n0("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        if (r0.f(r4) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final owu X(StationId stationId, kxi kxiVar, Function0 function0, k6l k6lVar, uwu uwuVar, qwu qwuVar, nwu nwuVar, Function1 function1, hq5 hq5Var, int i, int i2) {
        nwu nwuVar2;
        boolean z;
        boolean z2;
        Object K;
        stationId.getClass();
        kxiVar.getClass();
        function0.getClass();
        k6lVar.getClass();
        uwuVar.getClass();
        qwuVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(716223440);
        Function1 function12 = (i2 & 256) != 0 ? null : function1;
        if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
            qrm qrmVar = qrm.a;
            oq5Var.p(false);
            return qrmVar;
        }
        Object K2 = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K2 == kjnVar) {
            K2 = tlm.f(gld.R(g.a, oq5Var), oq5Var);
        }
        mm6 mm6Var = ((fs5) K2).a;
        boolean f = oq5Var.f(mm6Var) | oq5Var.f(stationId);
        boolean z3 = true;
        if (((i & 29360128) ^ 12582912) > 8388608) {
            nwuVar2 = nwuVar;
        } else {
            nwuVar2 = nwuVar;
        }
        if ((i & 12582912) != 8388608) {
            z = false;
            boolean z4 = f | z;
            if ((((i & 1879048192) ^ 805306368) > 536870912 || !oq5Var.f(function12)) && (i & 805306368) != 536870912) {
                z3 = false;
            }
            z2 = z4 | z3;
            K = oq5Var.K();
            if (!z2 || K == kjnVar) {
                K = S(mm6Var, kxiVar, k6lVar, null, nwuVar2, qwuVar, uwuVar, t75.c(stationId.h()), function0, function12);
                oq5Var.k0(K);
            }
            owu owuVar = (owu) K;
            oq5Var.p(false);
            return owuVar;
        }
        z = true;
        boolean z42 = f | z;
        if (((i & 1879048192) ^ 805306368) > 536870912) {
        }
        z3 = false;
        z2 = z42 | z3;
        K = oq5Var.K();
        if (!z2) {
        }
        K = S(mm6Var, kxiVar, k6lVar, null, nwuVar2, qwuVar, uwuVar, t75.c(stationId.h()), function0, function12);
        oq5Var.k0(K);
        owu owuVar2 = (owu) K;
        oq5Var.p(false);
        return owuVar2;
    }

    public static final owu Y(StationId stationId, List list, kxi kxiVar, Function0 function0, k6l k6lVar, uwu uwuVar, qwu qwuVar, nwu nwuVar, pfn pfnVar, Function1 function1, hq5 hq5Var, int i, int i2, int i3) {
        stationId.getClass();
        list.getClass();
        kxiVar.getClass();
        function0.getClass();
        k6lVar.getClass();
        uwuVar.getClass();
        qwuVar.getClass();
        nwu nwuVar2 = (i3 & 128) != 0 ? null : nwuVar;
        pfn pfnVar2 = (i3 & 256) != 0 ? null : pfnVar;
        Function1 function12 = (i3 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? null : function1;
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = tlm.f(gld.R(g.a, oq5Var), oq5Var);
        }
        mm6 mm6Var = ((fs5) K).a;
        boolean f = oq5Var.f(stationId) | ((((i & 896) ^ 384) > 256 && oq5Var.f(list)) || (i & 384) == 256) | ((((234881024 & i) ^ 100663296) > 67108864 && oq5Var.f(nwuVar2)) || (i & 100663296) == 67108864) | ((((i2 & 14) ^ 6) > 4 && oq5Var.f(function12)) || (i2 & 6) == 4);
        Object K2 = oq5Var.K();
        if (f || K2 == kjnVar) {
            K2 = S(mm6Var, kxiVar, k6lVar, pfnVar2, nwuVar2, qwuVar, uwuVar, list, function0, function12);
            oq5Var.k0(K2);
        }
        return (owu) K2;
    }

    public static final pzt Z(bde bdeVar, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        jx7 jx7Var = (jx7) oq5Var.j(es5.h);
        float f = bdeVar.j;
        boolean e = oq5Var.e((Float.floatToRawIntBits(jx7Var.getDensity()) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        Object K = oq5Var.K();
        if (e || K == gq5.a) {
            nqd nqdVar = new nqd();
            z(nqdVar, bdeVar.f);
            float f2 = bdeVar.b;
            float f3 = bdeVar.c;
            long floatToRawIntBits = (Float.floatToRawIntBits(jx7Var.n0(f2)) << 32) | (Float.floatToRawIntBits(jx7Var.n0(f3)) & 4294967295L);
            float f4 = bdeVar.d;
            float f5 = bdeVar.e;
            if (Float.isNaN(f4)) {
                f4 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            }
            if (Float.isNaN(f5)) {
                f5 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            }
            long floatToRawIntBits2 = (Float.floatToRawIntBits(f4) << 32) | (4294967295L & Float.floatToRawIntBits(f5));
            pzt pztVar = new pzt(nqdVar);
            String str = bdeVar.a;
            long j = bdeVar.g;
            d43 d43Var = j != 16 ? new d43(j, bdeVar.h) : null;
            boolean z = bdeVar.i;
            pztVar.e.setValue(new nmq(floatToRawIntBits));
            pztVar.f.setValue(Boolean.valueOf(z));
            yyt yytVar = pztVar.g;
            yytVar.g.setValue(d43Var);
            yytVar.i.setValue(new nmq(floatToRawIntBits2));
            yytVar.c = str;
            oq5Var.k0(pztVar);
            K = pztVar;
        }
        return (pzt) K;
    }

    public static final void a(us5 us5Var, Function0 function0, hq5 hq5Var, int i) {
        int i2;
        gz2 gz2Var;
        jzk jzkVar;
        kb5 kb5Var;
        kb5 kb5Var2;
        kb5 kb5Var3;
        int i3;
        grb grbVar;
        jzk jzkVar2 = vnj.i;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1462735358);
        if ((i & 6) == 0) {
            i2 = i | (oq5Var.h(us5Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function0) ? 32 : 16;
        }
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            vci vciVar = vci.a;
            yci e = androidx.compose.foundation.a.e(vciVar, false, null, null, function0, 7);
            kx0 kx0Var = qx0.c;
            gz2 gz2Var2 = b2c.n;
            ta5 a = sa5.a(kx0Var, gz2Var2, oq5Var, 0);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, e);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar2);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var4 = wp5.f;
            g0g.U(oq5Var, a, kb5Var4);
            kb5 kb5Var5 = wp5.e;
            g0g.U(oq5Var, l, kb5Var5);
            kb5 kb5Var6 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var6);
            }
            kb5 kb5Var7 = wp5.d;
            g0g.U(oq5Var, H, kb5Var7);
            if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                oq5Var.Z(1077219775);
                ug3.a(androidx.compose.foundation.a.b(a.d(d.d(xp3.u(vciVar, o5g.F(oq5Var)), 1.0f), 2.1276596f), d85.k, jzkVar2), oq5Var, 0);
                oq5Var.p(false);
                gz2Var = gz2Var2;
                jzkVar = jzkVar2;
                kb5Var2 = kb5Var4;
                kb5Var = kb5Var7;
                grbVar = grbVar2;
                i3 = 0;
                kb5Var3 = kb5Var6;
            } else {
                oq5Var.Z(1077494187);
                gz2Var = gz2Var2;
                jzkVar = jzkVar2;
                kb5Var = kb5Var7;
                kb5Var2 = kb5Var4;
                kb5Var3 = kb5Var6;
                i3 = 0;
                grbVar = grbVar2;
                p1g.a(us5Var.r.a.getPathForSize(wct.s()), rvf.M(R.string.cover_description, oq5Var), a.d(d.d(xp3.u(vciVar, o5g.F(oq5Var)), 1.0f), 2.1276596f), null, null, null, hd6.a, 0.0f, null, 0, oq5Var, ScreenMirroringConfig.Video.BITRATE_1_5MB, 952);
                oq5Var = oq5Var;
                oq5Var.p(false);
            }
            float f = 12;
            u1g.l(oq5Var, d.e(vciVar, f));
            yci g = a.g(vciVar, hxe.b);
            nho a2 = lho.a(qx0.a, b2c.k, oq5Var, i3);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, g);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, kb5Var2);
            g0g.U(oq5Var, l2, kb5Var5);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var);
            l18 l18Var = l18.b;
            bdt I = hag.I(fw5.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            fu5 b = ((fw5) qdcVar.C(I)).b();
            ta5 a3 = sa5.a(kx0Var, b2c.o, oq5Var, 48);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H3 = vnj.H(oq5Var, vciVar);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var2);
            g0g.U(oq5Var, l3, kb5Var5);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var3);
            }
            g0g.U(oq5Var, H3, kb5Var);
            us5Var.getClass();
            uu5 uu5Var = b.b;
            ZonedDateTime zonedDateTime = us5Var.h;
            zonedDateTime.getClass();
            ((ju5) uu5Var.d).getClass();
            String valueOf = String.valueOf(zonedDateTime.getDayOfMonth());
            ges j = nu0.j();
            agr agrVar = eq0.a;
            kb5 kb5Var8 = kb5Var;
            oq5 oq5Var2 = oq5Var;
            xcs.b(valueOf, d.g(vciVar, ff7.P(v7g.z(24), oq5Var), 0.0f, 2), ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, j, oq5Var2, 0, 0, 65528);
            uu5 uu5Var2 = b.b;
            ZonedDateTime zonedDateTime2 = us5Var.h;
            zonedDateTime2.getClass();
            String upperCase = mlr.K(3, ((sld) uu5Var2.g).I(zonedDateTime2)).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            ges i7 = nu0.i();
            long j2 = ((dq0) oq5Var2.j(agrVar)).b.d;
            uu5 uu5Var3 = b.b;
            ZonedDateTime zonedDateTime3 = us5Var.h;
            zonedDateTime3.getClass();
            xcs.b(upperCase, ksw.D(vciVar, ((sld) uu5Var3.h).I(zonedDateTime3), null), j2, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, i7, oq5Var2, 0, 0, 65528);
            oq5Var2.p(true);
            ug3.a(androidx.compose.foundation.a.b(d.r(d.b(a.q(vciVar, 4, 0.0f, f, 0.0f, 10), 1.0f), 1), ((dq0) oq5Var2.j(agrVar)).c.c, jzkVar), oq5Var2, 0);
            ta5 a4 = sa5.a(kx0Var, gz2Var, oq5Var2, 0);
            int i8 = oq5Var2.P;
            androidx.compose.runtime.internal.a l4 = oq5Var2.l();
            yci H4 = vnj.H(oq5Var2, vciVar);
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a4, kb5Var2);
            g0g.U(oq5Var2, l4, kb5Var5);
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i8))) {
                ouj.x(i8, oq5Var2, i8, kb5Var3);
            }
            g0g.U(oq5Var2, H4, kb5Var8);
            xcs.b(us5Var.c, null, ((dq0) oq5Var2.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, nu0.c(), oq5Var2, 0, 3072, 57338);
            xcs.b(b.b(us5Var), null, ((dq0) oq5Var2.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, nu0.i(), oq5Var2, 0, 3072, 57338);
            oq5Var = oq5Var2;
            oq5Var.p(true);
            oq5Var.p(true);
            u1g.l(oq5Var, d.e(vciVar, f));
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x8l(us5Var, function0, i, 2);
        }
    }

    public static final cgv a0(hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        if (K == gq5.a) {
            K = new cgv();
            oq5Var.k0(K);
        }
        return (cgv) K;
    }

    public static final void b(Object obj, Function0 function0, Function0 function02, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-739038579);
        int i2 = (oq5Var.h(obj) ? 4 : 2) | i | 432 | (oq5Var.h(function0) ? 2048 : 1024) | (oq5Var.h(function02) ? 16384 : RemoteCameraConfig.Notification.ID) | 1769472;
        if ((599187 & i2) == 599186 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean z = ((i2 & 7168) == 2048) | ((57344 & i2) == 16384);
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new gqj(function0, function02, 0);
                oq5Var.k0(K);
            }
            d(obj, (Function1) K, oq5Var, i2 & 14);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q6h(obj, function0, function02, i, 14);
        }
    }

    public static void b0(b2r b2rVar, b2r b2rVar2, Function1 function1) {
        if (b2rVar != b2rVar2) {
            b2rVar2.getClass();
            b2r.q(b2rVar);
            b2rVar2.c();
        } else if (b2rVar instanceof f9t) {
            ((f9t) b2rVar).r = function1;
        } else if (b2rVar instanceof g9t) {
            ((g9t) b2rVar).g = function1;
        } else {
            b6e.l(b2rVar, "Non-transparent snapshot was reused: ");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, hq5 hq5Var, int i, int i2) {
        Function0 function06;
        int i3;
        Function0 function07;
        int i4;
        Function0 function08;
        int i5;
        Function0 function09;
        int i6;
        Function0 function010;
        Function0 function011;
        Function0 function012;
        Function0 function013;
        Function0 function014;
        Function0 function015;
        boolean z;
        Object K;
        Function0 function016;
        Function0 function017;
        Function0 function018;
        Function0 function019;
        Function0 function020;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-397008019);
        int i7 = i | 6;
        int i8 = i2 & 2;
        if (i8 != 0) {
            i7 = i | 54;
        } else if ((i & 48) == 0) {
            function06 = function0;
            i7 |= oq5Var.h(function06) ? 32 : 16;
            i3 = i2 & 4;
            if (i3 == 0) {
                i7 |= 384;
            } else if ((i & 384) == 0) {
                function07 = function02;
                i7 |= oq5Var.h(function07) ? 256 : 128;
                i4 = i2 & 8;
                if (i4 != 0) {
                    i7 |= 3072;
                } else if ((i & 3072) == 0) {
                    function08 = function03;
                    i7 |= oq5Var.h(function08) ? 2048 : 1024;
                    i5 = i2 & 16;
                    if (i5 == 0) {
                        i7 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function09 = function04;
                        i7 |= oq5Var.h(function09) ? 16384 : RemoteCameraConfig.Notification.ID;
                        i6 = i2 & 32;
                        if (i6 != 0) {
                            i7 |= 196608;
                            function010 = function05;
                        } else {
                            function010 = function05;
                            if ((i & 196608) == 0) {
                                i7 |= oq5Var.h(function010) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                            }
                        }
                        if ((i7 & 74899) == 74898 || !oq5Var.z()) {
                            function011 = i8 != 0 ? null : function06;
                            function012 = i3 != 0 ? null : function07;
                            function013 = i4 != 0 ? null : function08;
                            function014 = i5 != 0 ? null : function09;
                            function015 = i6 != 0 ? null : function010;
                            z = ((i7 & 14) == 4) | ((i7 & 112) == 32) | ((i7 & 896) == 256) | ((i7 & 7168) == 2048) | ((57344 & i7) == 16384) | ((i7 & 458752) == 131072);
                            K = oq5Var.K();
                            if (!z || K == gq5.a) {
                                K = new r90(function011, function012, function013, function014, function015, 4);
                                oq5Var.k0(K);
                            }
                            e((Function1) K, oq5Var, 0);
                            function016 = function011;
                            function017 = function012;
                            function018 = function013;
                            function019 = function014;
                            function020 = function015;
                        } else {
                            oq5Var.S();
                            function016 = function06;
                            function017 = function07;
                            function018 = function08;
                            function020 = function010;
                            function019 = function09;
                        }
                        r = oq5Var.r();
                        if (r != null) {
                            r.d = new cj(function016, function017, function018, function019, function020, i, i2, 12);
                            return;
                        }
                        return;
                    }
                    function09 = function04;
                    i6 = i2 & 32;
                    if (i6 != 0) {
                    }
                    if ((i7 & 74899) == 74898) {
                    }
                    if (i8 != 0) {
                    }
                    if (i3 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    z = ((i7 & 14) == 4) | ((i7 & 112) == 32) | ((i7 & 896) == 256) | ((i7 & 7168) == 2048) | ((57344 & i7) == 16384) | ((i7 & 458752) == 131072);
                    K = oq5Var.K();
                    if (!z) {
                    }
                    K = new r90(function011, function012, function013, function014, function015, 4);
                    oq5Var.k0(K);
                    e((Function1) K, oq5Var, 0);
                    function016 = function011;
                    function017 = function012;
                    function018 = function013;
                    function019 = function014;
                    function020 = function015;
                    r = oq5Var.r();
                    if (r != null) {
                    }
                }
                function08 = function03;
                i5 = i2 & 16;
                if (i5 == 0) {
                }
                function09 = function04;
                i6 = i2 & 32;
                if (i6 != 0) {
                }
                if ((i7 & 74899) == 74898) {
                }
                if (i8 != 0) {
                }
                if (i3 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                z = ((i7 & 14) == 4) | ((i7 & 112) == 32) | ((i7 & 896) == 256) | ((i7 & 7168) == 2048) | ((57344 & i7) == 16384) | ((i7 & 458752) == 131072);
                K = oq5Var.K();
                if (!z) {
                }
                K = new r90(function011, function012, function013, function014, function015, 4);
                oq5Var.k0(K);
                e((Function1) K, oq5Var, 0);
                function016 = function011;
                function017 = function012;
                function018 = function013;
                function019 = function014;
                function020 = function015;
                r = oq5Var.r();
                if (r != null) {
                }
            }
            function07 = function02;
            i4 = i2 & 8;
            if (i4 != 0) {
            }
            function08 = function03;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            function09 = function04;
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            if ((i7 & 74899) == 74898) {
            }
            if (i8 != 0) {
            }
            if (i3 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            z = ((i7 & 14) == 4) | ((i7 & 112) == 32) | ((i7 & 896) == 256) | ((i7 & 7168) == 2048) | ((57344 & i7) == 16384) | ((i7 & 458752) == 131072);
            K = oq5Var.K();
            if (!z) {
            }
            K = new r90(function011, function012, function013, function014, function015, 4);
            oq5Var.k0(K);
            e((Function1) K, oq5Var, 0);
            function016 = function011;
            function017 = function012;
            function018 = function013;
            function019 = function014;
            function020 = function015;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        function06 = function0;
        i3 = i2 & 4;
        if (i3 == 0) {
        }
        function07 = function02;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        function08 = function03;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        function09 = function04;
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        if ((i7 & 74899) == 74898) {
        }
        if (i8 != 0) {
        }
        if (i3 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        z = ((i7 & 14) == 4) | ((i7 & 112) == 32) | ((i7 & 896) == 256) | ((i7 & 7168) == 2048) | ((57344 & i7) == 16384) | ((i7 & 458752) == 131072);
        K = oq5Var.K();
        if (!z) {
        }
        K = new r90(function011, function012, function013, function014, function015, 4);
        oq5Var.k0(K);
        e((Function1) K, oq5Var, 0);
        function016 = function011;
        function017 = function012;
        function018 = function013;
        function019 = function014;
        function020 = function015;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void d(Object obj, Function1 function1, hq5 hq5Var, int i) {
        int i2;
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-711313779);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function1) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            aqi o0 = szf.o0(function1, oq5Var);
            dzf dzfVar = (dzf) oq5Var.j(ykg.a);
            boolean h = oq5Var.h(dzfVar) | oq5Var.f(o0);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new fqj(dzfVar, o0, 1);
                oq5Var.k0(K);
            }
            gld.j(obj, dzfVar, (Function1) K, oq5Var);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gva(obj, function1, i, 25);
        }
    }

    public static final void e(Function1 function1, hq5 hq5Var, int i) {
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1984552173);
        if ((((oq5Var.h(function1) ? 4 : 2) | i) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            aqi o0 = szf.o0(function1, oq5Var);
            dzf dzfVar = (dzf) oq5Var.j(ykg.a);
            boolean h = oq5Var.h(dzfVar) | oq5Var.f(o0);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new fqj(dzfVar, o0, 0);
                oq5Var.k0(K);
            }
            gld.k(dzfVar, (Function1) K, oq5Var);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ai6(i, 1, function1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e0(e7o e7oVar, v5p v5pVar, cg6 cg6Var) {
        hjs hjsVar;
        int i;
        try {
            if (cg6Var instanceof hjs) {
                hjsVar = (hjs) cg6Var;
                int i2 = hjsVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    hjsVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = hjsVar.k;
                    nm6 nm6Var = nm6.a;
                    i = hjsVar.l;
                    Continuation continuation = null;
                    if (i != 0) {
                        qgg.h0(obj);
                        hjsVar.j = v5pVar;
                        hjsVar.l = 1;
                        Object Q = gld.Q(new fpq(v5pVar, e7oVar, continuation, 20), hjsVar);
                        return Q == nm6Var ? nm6Var : Q;
                    }
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v5p v5pVar2 = hjsVar.j;
                    qgg.h0(obj);
                    return obj;
                }
            }
            if (i != 0) {
            }
        } catch (xis e) {
            if (e.b == v5pVar.hashCode()) {
                return null;
            }
            throw e;
        }
        hjsVar = new hjs(cg6Var);
        Object obj2 = hjsVar.k;
        nm6 nm6Var2 = nm6.a;
        i = hjsVar.l;
        Continuation continuation2 = null;
    }

    public static final void f(dib dibVar, tsf tsfVar, hq5 hq5Var, int i) {
        int i2;
        dibVar.getClass();
        tsfVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(441871346);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(dibVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(tsfVar) ? 32 : 16;
        }
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            boolean h = oq5Var.h(dibVar) | ((i2 & 112) == 32);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new h1j(dibVar, tsfVar, (Continuation) null, 17);
                oq5Var.k0(K);
            }
            gld.w(oq5Var, dibVar, (Function2) K);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gva(dibVar, tsfVar, i, 28);
        }
    }

    public static String f0(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String s;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                s = "null";
            } else {
                try {
                    s = obj.toString();
                } catch (Exception e) {
                    String o = ouj.o(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(o), (Throwable) e);
                    s = hrg.s("<", o, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = s;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, indexOf);
            sb.append(objArr[i]);
            i++;
            i3 = indexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static final void g(dib dibVar, fvf fvfVar, hq5 hq5Var, int i) {
        int i2;
        dibVar.getClass();
        fvfVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1674998090);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(dibVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(fvfVar) ? 32 : 16;
        }
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            Unit unit = Unit.a;
            boolean h = oq5Var.h(dibVar) | ((i2 & 112) == 32);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new h1j(dibVar, fvfVar, (Continuation) null, 18);
                oq5Var.k0(K);
            }
            gld.w(oq5Var, unit, (Function2) K);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gva(dibVar, fvfVar, i, 29);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(lwl lwlVar, Function0 function0, yci yciVar, long j, ges gesVar, Function2 function2, e9g e9gVar, Function0 function02, hq5 hq5Var, int i, int i2) {
        int i3;
        long j2;
        ges gesVar2;
        int i4;
        Function2 function22;
        int i5;
        int i6;
        Function0 function03;
        e9g e9gVar2;
        yci yciVar2;
        Function2 function23;
        long j3;
        Function0 function04;
        oq5 oq5Var;
        ges gesVar3;
        yci yciVar3;
        long j4;
        Function0 function05;
        Function2 function24;
        int i7;
        int i8;
        lwlVar.getClass();
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-624026484);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? oq5Var2.f(lwlVar) : oq5Var2.h(lwlVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var2.h(function0) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= oq5Var2.f(yciVar) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    j2 = j;
                    if (oq5Var2.e(j2)) {
                        i8 = 2048;
                        i3 |= i8;
                    }
                } else {
                    j2 = j;
                }
                i8 = 1024;
                i3 |= i8;
            } else {
                j2 = j;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    gesVar2 = gesVar;
                    if (oq5Var2.f(gesVar2)) {
                        i7 = 16384;
                        i3 |= i7;
                    }
                } else {
                    gesVar2 = gesVar;
                }
                i7 = RemoteCameraConfig.Notification.ID;
                i3 |= i7;
            } else {
                gesVar2 = gesVar;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                function22 = function2;
                i3 |= oq5Var2.h(function22) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                i5 = i2 & 64;
                int i10 = ScreenMirroringConfig.Video.BITRATE_1_5MB;
                if (i5 == 0) {
                    if ((1572864 & i) == 0) {
                        i10 = oq5Var2.d(e9gVar == null ? -1 : e9gVar.ordinal()) ? 1048576 : 524288;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((12582912 & i) == 0) {
                        function03 = function02;
                        i3 |= oq5Var2.h(function03) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
                        if ((i3 & 4793491) == 4793490 || !oq5Var2.z()) {
                            oq5Var2.U();
                            if ((i & 1) != 0 || oq5Var2.y()) {
                                yci yciVar4 = i9 != 0 ? vci.a : yciVar;
                                if ((i2 & 8) != 0) {
                                    j2 = ((dq0) oq5Var2.j(eq0.a)).c.a;
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    h6g h6gVar = nu0.a;
                                    h6g h6gVar2 = h6g.c;
                                    gesVar2 = nu0.j();
                                    i3 &= -57345;
                                }
                                Function2 function25 = i4 != 0 ? cxb.f : function22;
                                e9gVar2 = i5 != 0 ? e9g.a : e9gVar;
                                if (i6 != 0) {
                                    yciVar2 = yciVar4;
                                    function23 = function25;
                                    j3 = j2;
                                    function04 = null;
                                    oq5Var2.q();
                                    int i11 = i3 >> 3;
                                    int i12 = i3 << 3;
                                    oq5Var = oq5Var2;
                                    ngg.i(function0, yciVar2, ild.C(-444579958, new wcj(12, lwlVar, e9gVar2), oq5Var2), false, j3, function04, function23, 0.0f, null, ild.C(1696483409, new wcj(13, lwlVar, gesVar2), oq5Var2), oq5Var, ((i3 >> 6) & 458752) | (i11 & 112) | (i11 & 14) | 805306752 | (57344 & i12) | (3670016 & i12), 392);
                                    gesVar3 = gesVar2;
                                    yciVar3 = yciVar2;
                                    j4 = j3;
                                    function05 = function04;
                                    function24 = function23;
                                } else {
                                    yciVar2 = yciVar4;
                                    function23 = function25;
                                    j3 = j2;
                                }
                            } else {
                                oq5Var2.S();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                yciVar2 = yciVar;
                                e9gVar2 = e9gVar;
                                j3 = j2;
                                function23 = function22;
                            }
                            function04 = function03;
                            oq5Var2.q();
                            int i112 = i3 >> 3;
                            int i122 = i3 << 3;
                            oq5Var = oq5Var2;
                            ngg.i(function0, yciVar2, ild.C(-444579958, new wcj(12, lwlVar, e9gVar2), oq5Var2), false, j3, function04, function23, 0.0f, null, ild.C(1696483409, new wcj(13, lwlVar, gesVar2), oq5Var2), oq5Var, ((i3 >> 6) & 458752) | (i112 & 112) | (i112 & 14) | 805306752 | (57344 & i122) | (3670016 & i122), 392);
                            gesVar3 = gesVar2;
                            yciVar3 = yciVar2;
                            j4 = j3;
                            function05 = function04;
                            function24 = function23;
                        } else {
                            oq5Var2.S();
                            yciVar3 = yciVar;
                            e9gVar2 = e9gVar;
                            oq5Var = oq5Var2;
                            j4 = j2;
                            gesVar3 = gesVar2;
                            function24 = function22;
                            function05 = function03;
                        }
                        xmn r = oq5Var.r();
                        if (r != null) {
                            r.d = new fwl(lwlVar, function0, yciVar3, j4, gesVar3, function24, e9gVar2, function05, i, i2);
                            return;
                        }
                        return;
                    }
                    function03 = function02;
                    if ((i3 & 4793491) == 4793490) {
                    }
                    oq5Var2.U();
                    if ((i & 1) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if ((i2 & 8) != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                }
                i3 |= i10;
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                function03 = function02;
                if ((i3 & 4793491) == 4793490) {
                }
                oq5Var2.U();
                if ((i & 1) != 0) {
                }
                if (i9 != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
            }
            function22 = function2;
            i5 = i2 & 64;
            int i102 = ScreenMirroringConfig.Video.BITRATE_1_5MB;
            if (i5 == 0) {
            }
            i3 |= i102;
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            function03 = function02;
            if ((i3 & 4793491) == 4793490) {
            }
            oq5Var2.U();
            if ((i & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        function22 = function2;
        i5 = i2 & 64;
        int i1022 = ScreenMirroringConfig.Video.BITRATE_1_5MB;
        if (i5 == 0) {
        }
        i3 |= i1022;
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        function03 = function02;
        if ((i3 & 4793491) == 4793490) {
        }
        oq5Var2.U();
        if ((i & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(boolean z, yci yciVar, e9g e9gVar, boolean z2, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        int i4;
        int i5;
        boolean z3;
        e9g e9gVar2;
        yci yciVar3;
        boolean z4;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1077518072);
        if ((i & 6) == 0) {
            i3 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= oq5Var.d(e9gVar == null ? -1 : e9gVar.ordinal()) ? 256 : 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z2;
                i3 |= oq5Var.g(z3) ? 2048 : 1024;
                if ((i3 & 1171) == 1170 || !oq5Var.z()) {
                    yci yciVar4 = i6 != 0 ? vci.a : yciVar2;
                    e9g e9gVar3 = i4 != 0 ? e9g.a : e9gVar;
                    boolean z5 = i5 != 0 ? false : z3;
                    c9g.g(z, qo6.e, true, e9gVar3, yciVar4, z5, null, oq5Var, (i3 & 14) | 432 | ((i3 << 3) & 7168) | ((i3 << 9) & 57344) | ((i3 << 6) & 458752), 64);
                    e9gVar2 = e9gVar3;
                    yciVar3 = yciVar4;
                    z4 = z5;
                } else {
                    oq5Var.S();
                    yciVar3 = yciVar2;
                    z4 = z3;
                    e9gVar2 = e9gVar;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new vkg(z, yciVar3, e9gVar2, z4, i, i2, 1);
                    return;
                }
                return;
            }
            z3 = z2;
            if ((i3 & 1171) == 1170) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            c9g.g(z, qo6.e, true, e9gVar3, yciVar4, z5, null, oq5Var, (i3 & 14) | 432 | ((i3 << 3) & 7168) | ((i3 << 9) & 57344) | ((i3 << 6) & 458752), 64);
            e9gVar2 = e9gVar3;
            yciVar3 = yciVar4;
            z4 = z5;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        z3 = z2;
        if ((i3 & 1171) == 1170) {
        }
        if (i6 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        c9g.g(z, qo6.e, true, e9gVar3, yciVar4, z5, null, oq5Var, (i3 & 14) | 432 | ((i3 << 3) & 7168) | ((i3 << 9) & 57344) | ((i3 << 6) & 458752), 64);
        e9gVar2 = e9gVar3;
        yciVar3 = yciVar4;
        z4 = z5;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void j(List list, at5 at5Var, hq5 hq5Var, int i) {
        list.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(276231250);
        int i2 = (oq5Var.h(list) ? 4 : 2) | i | (oq5Var.h(at5Var) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, vci.a);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            y2x.f(rvf.M(R.string.popular_concerts, oq5Var), null, 0, null, null, oq5Var, 0, 30);
            up6.j(list, null, null, 0.0f, 0.0f, null, null, false, 1, ild.C(1915178190, new tik(6, at5Var), oq5Var), oq5Var, (i2 & 14) | 805306368, 510);
            oq5Var = oq5Var;
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new fhm(list, at5Var, i);
        }
    }

    public static final void k(tx txVar, Function2 function2, Function2 function22, yci yciVar, Function2 function23, hq5 hq5Var, int i) {
        yci yciVar2;
        String str = txVar.a;
        function2.getClass();
        function22.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1257990758);
        int i2 = i | (oq5Var.h(txVar) ? 4 : 2) | (oq5Var.h(function2) ? 32 : 16) | (oq5Var.h(function22) ? 256 : 128) | 3072 | (oq5Var.h(function23) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var.P(i2 & 1, (i2 & 9363) != 9362)) {
            vci vciVar = vci.a;
            yci a = androidx.compose.ui.platform.a.a(vciVar, "related_albums_block");
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
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
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (str == null) {
                oq5Var.Z(559491414);
            } else {
                oq5Var.Z(559491415);
                irf.g(new z43(str), androidx.compose.ui.platform.a.a(vciVar, "related_albums_block_title"), null, false, oq5Var, 48);
            }
            oq5Var.p(false);
            up6.i(txVar.c, null, null, null, 0.0f, 0.0f, 0.0f, null, null, null, false, 0, ild.C(-746327748, new fb1(12, function23, function2, function22), oq5Var), oq5Var, 8, 384, 4094);
            oq5Var = oq5Var;
            oq5Var.p(true);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pli(i, 14, txVar, function2, function22, yciVar2, function23);
        }
    }

    public static final void l(g7p g7pVar, d5p d5pVar, int i, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        g7pVar.getClass();
        d5pVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-930839235);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(g7pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(d5pVar) : oq5Var.h(d5pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            g0g.k(g7pVar.a.a, androidx.compose.ui.platform.a.a(yciVar, "best_result_searched_presave"), null, ild.C(-1641541423, new x8l(d5pVar, g7pVar, i, 8), oq5Var), oq5Var, 3456, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lx(g7pVar, d5pVar, i, yciVar, i2, 14);
        }
    }

    public static final void m(wn5 wn5Var, wn5 wn5Var2, wn5 wn5Var3, Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        Function0 function02;
        yci yciVar2;
        oq5 oq5Var;
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1460572636);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.h(wn5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.h(wn5Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.h(wn5Var3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function02 = function0;
            i2 |= oq5Var2.h(function02) ? 2048 : 1024;
        } else {
            function02 = function0;
        }
        if ((i & 24576) == 0) {
            yciVar2 = yciVar;
            i2 |= oq5Var2.f(yciVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            yciVar2 = yciVar;
        }
        if ((i2 & 9363) == 9362 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            int i3 = i2 >> 9;
            oq5Var = oq5Var2;
            ngg.i(function02, yciVar2, wn5Var, false, d85.m, null, null, 0.0f, null, ild.C(1663341089, new rsk(wn5Var2, wn5Var3), oq5Var2), oq5Var, (i3 & 112) | (i3 & 14) | 805330944 | ((i2 << 6) & 896), 488);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tu(i, 23, wn5Var, wn5Var2, wn5Var3, function0, yciVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0230, code lost:
    
        if (r11 == r10) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x016f, code lost:
    
        if (r10 == r9) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0300, code lost:
    
        if (r13 == r7) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(pas pasVar, um0 um0Var, Locale locale, d85 d85Var, yci yciVar, int i, hq5 hq5Var, int i2, int i3) {
        int i4;
        Locale locale2;
        yci yciVar2;
        int i5;
        int i6;
        int i7;
        Long l;
        int i8;
        kjn kjnVar;
        yci yciVar3;
        String str;
        String str2;
        String str3;
        vci vciVar;
        kjn kjnVar2;
        boolean z;
        int i9;
        d85 d85Var2;
        long j;
        kjn kjnVar3;
        Long l2;
        vci vciVar2;
        kjn kjnVar4;
        String str4;
        long j2;
        kjn kjnVar5;
        String str5;
        vci vciVar3;
        kjn kjnVar6;
        String str6;
        long j3;
        int i10;
        xmn r;
        um0Var.getClass();
        locale.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1316412510);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.f(pasVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.d(um0Var.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            locale2 = locale;
            i4 |= oq5Var.h(locale2) ? 256 : 128;
        } else {
            locale2 = locale;
        }
        if ((i2 & 3072) == 0) {
            i4 |= oq5Var.f(d85Var) ? 2048 : 1024;
        }
        int i11 = i3 & 16;
        if (i11 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var.f(yciVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= 196608;
            } else if ((196608 & i2) == 0) {
                i6 = i;
                i4 |= oq5Var.d(i6) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                if ((74899 & i4) == 74898 || !oq5Var.z()) {
                    vci vciVar4 = vci.a;
                    yci yciVar4 = i11 != 0 ? vciVar4 : yciVar2;
                    if (i5 != 0) {
                        i6 = 0;
                    }
                    ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
                    i7 = oq5Var.P;
                    androidx.compose.runtime.internal.a l3 = oq5Var.l();
                    yci H = vnj.H(oq5Var, yciVar4);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, a, wp5.f);
                    g0g.U(oq5Var, l3, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                        ouj.x(i7, oq5Var, i7, kb5Var);
                    }
                    g0g.U(oq5Var, H, wp5.d);
                    l = pasVar.a;
                    String str7 = pasVar.e;
                    String str8 = pasVar.d;
                    String str9 = pasVar.b;
                    kjn kjnVar7 = gq5.a;
                    if (l == null) {
                        oq5Var.Z(-550336256);
                        oq5Var.p(false);
                        i9 = i4;
                        d85Var2 = d85Var;
                        str2 = str8;
                        str = str9;
                        i8 = i6;
                        kjnVar2 = kjnVar7;
                        str3 = str7;
                        vciVar = vciVar4;
                        yciVar3 = yciVar4;
                        z = false;
                    } else {
                        oq5Var.Z(-550336255);
                        long longValue = l.longValue();
                        int i12 = i6;
                        vm0 b = fn0.b(i12, 0.0f, um0Var, oq5Var, ((i4 >> 15) & 14) | ((i4 << 3) & 896), 2);
                        i8 = i12;
                        String str10 = pasVar.c;
                        if (str10 == null) {
                            str10 = "";
                        }
                        yci d = d.d(vciVar4, 1.0f);
                        boolean f = oq5Var.f(b);
                        Object K = oq5Var.K();
                        if (f) {
                            kjnVar = kjnVar7;
                        } else {
                            kjnVar = kjnVar7;
                        }
                        K = new a9q(b, 18);
                        oq5Var.k0(K);
                        yciVar3 = yciVar4;
                        str = str9;
                        str2 = str8;
                        str3 = str7;
                        vciVar = vciVar4;
                        kjnVar2 = kjnVar;
                        z = false;
                        i9 = i4;
                        bow.b(longValue, d85Var, locale2, s(d, (Function0) K), str10, um0Var, 0L, 0L, oq5Var, ((i4 >> 6) & 112) | (i4 & 896) | ((i4 << 12) & 458752));
                        d85Var2 = d85Var;
                        oq5Var = oq5Var;
                        oq5Var.p(false);
                    }
                    if (str == null) {
                        oq5Var.Z(-549718054);
                        oq5Var.p(z);
                        str4 = str;
                        l2 = l;
                        vciVar2 = vciVar;
                        kjnVar4 = kjnVar2;
                    } else {
                        oq5Var.Z(-549718053);
                        vm0 b2 = fn0.b(((ArrayList) xz0.w(new Object[]{l, str})).size() + i8, 0.0f, um0Var, oq5Var, (i9 << 3) & 896, 2);
                        ges e = nu0.e();
                        if (d85Var2 == null) {
                            oq5Var.Z(403970936);
                            j = ((dq0) oq5Var.j(eq0.a)).b.a;
                            oq5Var.p(z);
                        } else {
                            oq5Var.Z(403969913);
                            oq5Var.p(z);
                            j = d85Var2.a;
                        }
                        vci vciVar5 = vciVar;
                        yci o = a.o(d.d(vciVar5, 1.0f), 16, 0.0f, 2);
                        boolean f2 = oq5Var.f(b2);
                        Object K2 = oq5Var.K();
                        if (f2) {
                            kjnVar3 = kjnVar2;
                        } else {
                            kjnVar3 = kjnVar2;
                        }
                        K2 = new a9q(b2, 19);
                        oq5Var.k0(K2);
                        String str11 = str;
                        l2 = l;
                        oq5 oq5Var2 = oq5Var;
                        vciVar2 = vciVar5;
                        kjnVar4 = kjnVar3;
                        xv7.j(str11, s(o, (Function0) K2), j, 0L, 0L, 3, 0L, 2, false, 4, 0, null, e, oq5Var2, 0, 3120, 55032);
                        str4 = str11;
                        oq5Var = oq5Var2;
                        oq5Var.p(z);
                    }
                    if (str2 == null) {
                        oq5Var.Z(-548918347);
                        oq5Var.p(z);
                        str5 = str2;
                        str6 = str4;
                        vciVar3 = vciVar2;
                        kjnVar6 = kjnVar4;
                    } else {
                        oq5Var.Z(-548918346);
                        String str12 = str2;
                        vm0 b3 = fn0.b(((ArrayList) xz0.w(new Object[]{l2, str4, str12})).size() + i8, 0.0f, um0Var, oq5Var, (i9 << 3) & 896, 2);
                        vci vciVar6 = vciVar2;
                        u1g.l(oq5Var, d.e(vciVar6, 16));
                        ges j4 = nu0.j();
                        if (d85Var == null) {
                            oq5Var.Z(-1355386183);
                            j2 = ((dq0) oq5Var.j(eq0.a)).b.a;
                            oq5Var.p(z);
                        } else {
                            oq5Var.Z(-1355387206);
                            oq5Var.p(z);
                            j2 = d85Var.a;
                        }
                        yci d2 = d.d(vciVar6, 1.0f);
                        boolean f3 = oq5Var.f(b3);
                        Object K3 = oq5Var.K();
                        if (f3) {
                            kjnVar5 = kjnVar4;
                        } else {
                            kjnVar5 = kjnVar4;
                        }
                        K3 = new a9q(b3, 20);
                        oq5Var.k0(K3);
                        oq5 oq5Var3 = oq5Var;
                        str5 = str12;
                        vciVar3 = vciVar6;
                        kjnVar6 = kjnVar5;
                        str6 = str4;
                        xv7.j(str5, s(d2, (Function0) K3), j2, 0L, 0L, 3, 0L, 2, false, 4, 0, null, j4, oq5Var3, 0, 3120, 55032);
                        oq5Var = oq5Var3;
                        oq5Var.p(z);
                    }
                    if (str3 == null) {
                        oq5Var.Z(-548076914);
                    } else {
                        oq5Var.Z(-548076913);
                        String str13 = str3;
                        vm0 b4 = fn0.b(((ArrayList) xz0.w(new Object[]{l2, str6, str5, str13})).size() + i8, 0.0f, um0Var, oq5Var, (i9 << 3) & 896, 2);
                        vci vciVar7 = vciVar3;
                        u1g.l(oq5Var, d.e(vciVar7, 16));
                        ges j5 = nu0.j();
                        if (d85Var == null) {
                            oq5Var.Z(1180222490);
                            j3 = ((dq0) oq5Var.j(eq0.a)).b.a;
                            oq5Var.p(z);
                        } else {
                            oq5Var.Z(1180221467);
                            oq5Var.p(z);
                            j3 = d85Var.a;
                        }
                        yci d3 = d.d(vciVar7, 1.0f);
                        boolean f4 = oq5Var.f(b4);
                        Object K4 = oq5Var.K();
                        if (f4 || K4 == kjnVar6) {
                            K4 = new a9q(b4, 21);
                            oq5Var.k0(K4);
                        }
                        oq5 oq5Var4 = oq5Var;
                        xv7.j(str13, s(d3, (Function0) K4), j3, 0L, 0L, 3, 0L, 2, false, 3, 0, null, j5, oq5Var4, 0, 3120, 55032);
                        oq5Var = oq5Var4;
                    }
                    oq5Var.p(z);
                    oq5Var.p(true);
                    i10 = i8;
                    yciVar2 = yciVar3;
                } else {
                    oq5Var.S();
                    i10 = i6;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new ctb(pasVar, um0Var, locale, d85Var, yciVar2, i10, i2, i3);
                    return;
                }
                return;
            }
            i6 = i;
            if ((74899 & i4) == 74898) {
            }
            vci vciVar42 = vci.a;
            if (i11 != 0) {
            }
            if (i5 != 0) {
            }
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            i7 = oq5Var.P;
            androidx.compose.runtime.internal.a l32 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, yciVar4);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l32, wp5.e);
            kb5 kb5Var2 = wp5.g;
            if (!oq5Var.O) {
            }
            ouj.x(i7, oq5Var, i7, kb5Var2);
            g0g.U(oq5Var, H2, wp5.d);
            l = pasVar.a;
            String str72 = pasVar.e;
            String str82 = pasVar.d;
            String str92 = pasVar.b;
            kjn kjnVar72 = gq5.a;
            if (l == null) {
            }
            if (str == null) {
            }
            if (str2 == null) {
            }
            if (str3 == null) {
            }
            oq5Var.p(z);
            oq5Var.p(true);
            i10 = i8;
            yciVar2 = yciVar3;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i;
        if ((74899 & i4) == 74898) {
        }
        vci vciVar422 = vci.a;
        if (i11 != 0) {
        }
        if (i5 != 0) {
        }
        ta5 a22 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
        i7 = oq5Var.P;
        androidx.compose.runtime.internal.a l322 = oq5Var.l();
        yci H22 = vnj.H(oq5Var, yciVar4);
        xp5.T.getClass();
        grb grbVar22 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, a22, wp5.f);
        g0g.U(oq5Var, l322, wp5.e);
        kb5 kb5Var22 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i7, oq5Var, i7, kb5Var22);
        g0g.U(oq5Var, H22, wp5.d);
        l = pasVar.a;
        String str722 = pasVar.e;
        String str822 = pasVar.d;
        String str922 = pasVar.b;
        kjn kjnVar722 = gq5.a;
        if (l == null) {
        }
        if (str == null) {
        }
        if (str2 == null) {
        }
        if (str3 == null) {
        }
        oq5Var.p(z);
        oq5Var.p(true);
        i10 = i8;
        yciVar2 = yciVar3;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void o(yit yitVar, njt njtVar, spd spdVar, Function0 function0, Function0 function02, yci yciVar, hq5 hq5Var, int i) {
        String str;
        String str2;
        String e;
        String e2;
        String e3;
        kjn kjnVar = gq5.a;
        yitVar.getClass();
        njtVar.getClass();
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1414897076);
        int i2 = i | (oq5Var.h(yitVar) ? 4 : 2) | (oq5Var.h(njtVar) ? 32 : 16) | (oq5Var.h(spdVar) ? 256 : 128) | (oq5Var.h(function0) ? 2048 : 1024) | (oq5Var.h(function02) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if (!oq5Var.P(i2 & 1, (74899 & i2) != 74898)) {
            oq5Var.S();
        } else if (yitVar instanceof o20) {
            oq5Var.Z(-389437364);
            irf.a(((i2 >> 9) & 910) | ((i2 >> 3) & 7168), 16, oq5Var, saf.I((o20) yitVar), yciVar, function0, function02, false);
            oq5Var = oq5Var;
            oq5Var.p(false);
        } else {
            str = "";
            if (yitVar instanceof hm1) {
                oq5Var.Z(-389188589);
                hm1 hm1Var = (hm1) yitVar;
                u51 u51Var = hm1Var.a;
                String str3 = u51Var.b;
                u9b u9bVar = u51Var.c;
                if (u9bVar != null && (e3 = u9bVar.e(wct.s(), WebPath$Storage.AVATARS)) != null) {
                    str = e3;
                }
                wct.a(new q91(str3, str, hm1Var.b), function0, yciVar, false, function02, oq5Var, ((i2 >> 6) & 112) | ((i2 >> 9) & 896) | (i2 & 57344), 8);
                oq5Var = oq5Var;
                oq5Var.p(false);
            } else if (yitVar instanceof s3m) {
                oq5Var.Z(-388923663);
                s3m s3mVar = (s3m) yitVar;
                eul eulVar = s3mVar.a;
                u9b u9bVar2 = eulVar.d;
                swf.j((i2 & 57344) | ((i2 >> 6) & 112) | ((i2 >> 9) & 896), 8, oq5Var, new rab(eulVar.c, "", null, (u9bVar2 == null || (e2 = u9bVar2.e(wct.s(), WebPath$Storage.AVATARS)) == null) ? "" : e2, null, false, s3mVar.b), yciVar, function0, function02, false);
                oq5Var = oq5Var;
                oq5Var.p(false);
            } else {
                if (yitVar instanceof a2g) {
                    oq5Var.Z(-388643578);
                    a2g a2gVar = (a2g) yitVar;
                    eul eulVar2 = a2gVar.a;
                    z6a Q = y9w.Q(eulVar2, a2gVar.b, oq5Var);
                    u9b u9bVar3 = eulVar2.d;
                    if (u9bVar3 != null && (e = u9bVar3.e(wct.s(), WebPath$Storage.AVATARS)) != null) {
                        str = e;
                    }
                    y1g.d(function0, new v1g(eulVar2.c, str, null, qo6.e), (w3g) gld.M(Q.b(), oq5Var).getValue(), yciVar, false, function02, oq5Var, ((i2 >> 9) & 14) | ((i2 >> 6) & 7168) | (458752 & (i2 << 3)), 16);
                    oq5Var.p(false);
                } else if (yitVar instanceof umk) {
                    oq5Var.Z(-388111959);
                    umk umkVar = (umk) yitVar;
                    eul eulVar3 = umkVar.a;
                    String str4 = umkVar.c;
                    wdg.c(new rmk(eulVar3.c, str4 != null ? str4 : "", vz1.w(kg5.M(eulVar3.d, WebPath$Storage.AVATARS)), umkVar.f), function0, yciVar, function02, oq5Var, ((i2 >> 6) & 112) | ((i2 >> 9) & 896) | ((i2 >> 3) & 7168));
                    oq5Var.p(false);
                } else if (yitVar instanceof te4) {
                    oq5Var.Z(-387827348);
                    te4 te4Var = (te4) yitVar;
                    lt ltVar = te4Var.a;
                    z6a Q2 = y9w.Q(ltVar, te4Var.b, oq5Var);
                    lf4 lf4Var = te4Var.c;
                    String str5 = ltVar.c;
                    u9b u9bVar4 = ltVar.e;
                    String e4 = u9bVar4 != null ? u9bVar4.e(wct.s(), WebPath$Storage.AVATARS) : null;
                    v1g v1gVar = new v1g(str5, e4 != null ? e4 : "", ltVar.g, qo6.b);
                    String valueOf = String.valueOf(lf4Var.a);
                    kf4 kf4Var = lf4Var.b;
                    if (kf4Var == null) {
                        kf4Var = kf4.d;
                    }
                    wdp.L(new se4(v1gVar, valueOf, kf4Var), (w3g) gld.M(Q2.b(), oq5Var).getValue(), function0, function02, yciVar, oq5Var, (i2 >> 3) & 65408);
                    oq5Var = oq5Var;
                    oq5Var.p(false);
                } else if (yitVar instanceof r1g) {
                    oq5Var.Z(-387299604);
                    r1g r1gVar = (r1g) yitVar;
                    z6a Q3 = y9w.Q(r1gVar.a, r1gVar.b, oq5Var);
                    lt ltVar2 = r1gVar.a;
                    String str6 = ltVar2.c;
                    u9b u9bVar5 = ltVar2.e;
                    String e5 = u9bVar5 != null ? u9bVar5.e(wct.s(), WebPath$Storage.AVATARS) : null;
                    p1g.c(function0, new v1g(str6, e5 != null ? e5 : "", null, qo6.b), (w3g) gld.M(Q3.b(), oq5Var).getValue(), yciVar, false, function02, oq5Var, ((i2 >> 9) & 14) | ((i2 >> 6) & 7168) | (458752 & (i2 << 3)), 16);
                    oq5Var.p(false);
                } else if (yitVar instanceof fej) {
                    oq5Var.Z(-386773751);
                    fej fejVar = (fej) yitVar;
                    z6a Q4 = y9w.Q(fejVar.a, fejVar.c, oq5Var);
                    lt ltVar3 = fejVar.a;
                    Boolean bool = fejVar.d;
                    w1g.a(function0, g0g.I(ltVar3, bool != null ? bool.booleanValue() : false), (w3g) gld.M(Q4.b(), oq5Var).getValue(), yciVar, false, function02, oq5Var, ((i2 >> 9) & 14) | ((i2 >> 6) & 7168) | (458752 & (i2 << 3)), 16);
                    oq5Var.p(false);
                } else if (yitVar instanceof e6i) {
                    oq5Var.Z(-386259864);
                    e6i e6iVar = (e6i) yitVar;
                    String str7 = e6iVar.a;
                    String str8 = e6iVar.b;
                    String str9 = e6iVar.c;
                    u9b u9bVar6 = e6iVar.d;
                    String e6 = u9bVar6 != null ? u9bVar6.e(wct.s(), WebPath$Storage.AVATARS) : null;
                    pcg.e(new d6i(str7, str8, str9, e6 == null ? "" : e6, (u9bVar6 == null || (str2 = u9bVar6.b) == null) ? null : pd.T(str2)), function0, yciVar, oq5Var, ((i2 >> 6) & 112) | ((i2 >> 9) & 896));
                    oq5Var.p(false);
                } else {
                    if (!(yitVar instanceof llu)) {
                        throw vz1.i(oq5Var, 1788555362, false);
                    }
                    oq5Var.Z(-386010686);
                    llu lluVar = (llu) yitVar;
                    dou douVar = lluVar.a;
                    StationId f = StationId.f(douVar.a);
                    f.getClass();
                    ArrayList R = o8g.R(douVar.b);
                    kxi kxiVar = njtVar.a;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(k6l.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    k6l k6lVar = (k6l) qdcVar.C(I);
                    bdt I2 = hag.I(uwu.class);
                    qdc qdcVar2 = l18Var.a;
                    qdcVar2.getClass();
                    uwu uwuVar = (uwu) qdcVar2.C(I2);
                    bdt I3 = hag.I(qwu.class);
                    qdc qdcVar3 = l18Var.a;
                    qdcVar3.getClass();
                    qwu qwuVar = (qwu) qdcVar3.C(I3);
                    boolean h = oq5Var.h(njtVar) | oq5Var.h(spdVar) | oq5Var.h(yitVar);
                    Object K = oq5Var.K();
                    if (h || K == kjnVar) {
                        K = new ftr(3, njtVar, spdVar, yitVar);
                        oq5Var.k0(K);
                    }
                    Function0 function03 = (Function0) K;
                    boolean h2 = oq5Var.h(njtVar) | oq5Var.h(yitVar) | oq5Var.h(spdVar);
                    Object K2 = oq5Var.K();
                    if (h2 || K2 == kjnVar) {
                        K2 = new wes(njtVar, yitVar, spdVar);
                        oq5Var.k0(K2);
                    }
                    owu Y = Y(f, R, kxiVar, function03, k6lVar, uwuVar, qwuVar, null, null, (Function1) K2, oq5Var, 6, 0, 384);
                    np npVar = lluVar.b;
                    String str10 = douVar.c;
                    String str11 = douVar.d;
                    String str12 = str11.length() > 0 ? str11 : null;
                    String pathForSize = new jcv(npVar.b.a, WebPath$Storage.AVATARS).getPathForSize(wct.s());
                    String str13 = npVar.a;
                    Integer b0 = y2x.b0(npVar.b.b);
                    y1g.a(new klu(str10, str12, pathForSize, str13, b0 != null ? b0.intValue() : c3x.U(d85.n), npVar.c), Y, null, null, oq5Var, 0, 12);
                    oq5Var = oq5Var;
                    oq5Var.p(false);
                }
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pr(yitVar, njtVar, spdVar, function0, function02, yciVar, i, 25);
        }
    }

    public static final void p(yit yitVar, Function0 function0, Function0 function02, yci yciVar, hq5 hq5Var, int i) {
        String e;
        String e2;
        yitVar.getClass();
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1940725111);
        int i2 = i | (oq5Var.h(yitVar) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.h(function02) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024);
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            String str = "";
            if (yitVar instanceof o20) {
                oq5Var.Z(-1586791731);
                o20 o20Var = (o20) yitVar;
                lt ltVar = o20Var.a;
                u9b u9bVar = ltVar.e;
                String e3 = u9bVar != null ? u9bVar.e(wct.s(), WebPath$Storage.AVATARS) : null;
                ghh.a(new ru(ltVar.g, e3 == null ? "" : e3, ltVar.c, CollectionsKt.X(o20Var.b, null, null, null, new u4(19), 31), "", ltVar.d == WarningContent.EXPLICIT), function0, androidx.compose.ui.platform.a.a(yciVar, "list_item"), null, null, null, function02, oq5Var, (i2 & 112) | ((i2 << 12) & 3670016), 56);
                oq5Var = oq5Var;
                oq5Var.p(false);
            } else if (yitVar instanceof hm1) {
                oq5Var.Z(-1586475004);
                u51 u51Var = ((hm1) yitVar).a;
                u9b u9bVar2 = u51Var.c;
                if (u9bVar2 != null && (e2 = u9bVar2.e(wct.s(), WebPath$Storage.AVATARS)) != null) {
                    str = e2;
                }
                jf0.b(function0, new jd1(str, u51Var.b, false, null), androidx.compose.ui.platform.a.a(yciVar, "list_item"), null, null, function02, oq5Var, ((i2 >> 3) & 14) | ((i2 << 9) & 458752), 24);
                oq5Var.p(false);
            } else if (yitVar instanceof s3m) {
                oq5Var.Z(-1586181558);
                eul eulVar = ((s3m) yitVar).a;
                u9b u9bVar3 = eulVar.d;
                h(new lwl((u9bVar3 == null || (e = u9bVar3.e(wct.s(), WebPath$Storage.AVATARS)) == null) ? "" : e, eulVar.c, false, null, ""), function0, androidx.compose.ui.platform.a.a(yciVar, "list_item"), 0L, null, null, null, function02, oq5Var, ((i2 << 15) & 29360128) | (i2 & 112), 120);
                oq5Var = oq5Var;
                oq5Var.p(false);
            } else {
                if (!(yitVar instanceof r1g) && !(yitVar instanceof a2g) && !(yitVar instanceof umk) && !(yitVar instanceof e6i) && !(yitVar instanceof fej) && !(yitVar instanceof llu) && !(yitVar instanceof te4)) {
                    throw vz1.i(oq5Var, -1021018757, false);
                }
                oq5Var.Z(-1585651644);
                oq5Var.p(false);
                Assertions.throwOrSkip("UniversalScreen", new FailedAssertionException("Incorrect entity type"));
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new eim(yitVar, function0, function02, yciVar, i, 1);
        }
    }

    public static final Object q(mwk mwkVar, yxk yxkVar) {
        mwkVar.getClass();
        if (mwkVar.equals(h1b.e)) {
            xq0.q("not supported");
            return null;
        }
        if (mwkVar instanceof jzs) {
            return yxkVar.h((jzs) mwkVar);
        }
        if (mwkVar instanceof k4d) {
            return yxkVar.k((k4d) mwkVar);
        }
        if (mwkVar instanceof foc) {
            return yxkVar.c((foc) mwkVar);
        }
        if (mwkVar instanceof m1q) {
            return yxkVar.i((m1q) mwkVar);
        }
        if (mwkVar instanceof faq) {
            return yxkVar.g((faq) mwkVar);
        }
        if (mwkVar instanceof i5u) {
            return yxkVar.j((i5u) mwkVar);
        }
        xq0.x(f1d.g("Developer Error. All Playable types must be listed in Playable.accept. UnknownType detected ", mwkVar.getClass().getCanonicalName()));
        return null;
    }

    public static final void r(mwk mwkVar, zxk zxkVar) {
        mwkVar.getClass();
        if (mwkVar instanceof jzs) {
            zxkVar.mo5h((jzs) mwkVar);
            return;
        }
        if (mwkVar instanceof k4d) {
            zxkVar.mo8k((k4d) mwkVar);
            return;
        }
        if (mwkVar instanceof foc) {
            zxkVar.mo3c((foc) mwkVar);
            return;
        }
        if (mwkVar instanceof m1q) {
            zxkVar.mo6i((m1q) mwkVar);
            return;
        }
        if (mwkVar instanceof faq) {
            zxkVar.mo4g((faq) mwkVar);
        } else if (mwkVar instanceof i5u) {
            zxkVar.mo7j((i5u) mwkVar);
        } else {
            xq0.x(f1d.g("Developer Error. All Playable types must be listed in Playable.accept. UnknownType detected ", mwkVar.getClass().getCanonicalName()));
        }
    }

    public static final yci s(yci yciVar, Function0 function0) {
        yciVar.getClass();
        function0.getClass();
        return androidx.compose.ui.graphics.a.a(yciVar, new ex(13, function0));
    }

    public static final yci t(yci yciVar, Function0 function0) {
        yciVar.getClass();
        function0.getClass();
        return androidx.compose.ui.draw.a.a(yciVar, new ex(14, function0));
    }

    public static byte[] u(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            allocate.putInt(0);
        } else {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static long v(boolean z, int i, bk2 bk2Var, long j, long j2, int i2, boolean z2, long j3, long j4, long j5, long j6) {
        bk2Var.getClass();
        if (j6 != Long.MAX_VALUE && z2) {
            if (i2 != 0) {
                long j7 = j2 + 900000;
                if (j6 < j7) {
                    return j7;
                }
            }
            return j6;
        }
        if (z) {
            long scalb = bk2Var == bk2.b ? j * i : (long) Math.scalb(j, i - 1);
            if (scalb > 18000000) {
                scalb = 18000000;
            }
            return j2 + scalb;
        }
        if (z2) {
            long j8 = i2 == 0 ? j2 + j3 : j2 + j5;
            return (j4 == j5 || i2 != 0) ? j8 : (j5 - j4) + j8;
        }
        if (j2 == -1) {
            return Long.MAX_VALUE;
        }
        return j2 + j3;
    }

    public static final void w(View view) {
        view.clearAnimation();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                w(viewGroup.getChildAt(i));
            }
        }
    }

    public static afo x(xsr xsrVar) {
        afo afoVar;
        xsrVar.getClass();
        String o = xsrVar.o();
        int b = xsrVar.b();
        o.getClass();
        TreeMap treeMap = afo.h;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(b));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                afoVar = (afo) ceilingEntry.getValue();
                afoVar.a = o;
                afoVar.g = b;
            } else {
                afoVar = new afo(b);
                afoVar.a = o;
                afoVar.g = b;
            }
        }
        xsrVar.z(new hwc(afoVar));
        return afoVar;
    }

    public static uug y() {
        return grn.e == null ? new grn() : new sld(9);
    }

    public static final void z(nqd nqdVar, mzt mztVar) {
        List list = mztVar.j;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ozt oztVar = (ozt) list.get(i);
            if (oztVar instanceof qzt) {
                gak gakVar = new gak();
                qzt qztVar = (qzt) oztVar;
                gakVar.d = qztVar.b;
                gakVar.n = true;
                gakVar.c();
                gakVar.s.i(qztVar.c);
                gakVar.c();
                gakVar.c();
                gakVar.b = qztVar.d;
                gakVar.c();
                gakVar.c = qztVar.e;
                gakVar.c();
                gakVar.g = qztVar.f;
                gakVar.c();
                gakVar.e = qztVar.g;
                gakVar.c();
                gakVar.f = qztVar.h;
                gakVar.o = true;
                gakVar.c();
                gakVar.h = qztVar.i;
                gakVar.o = true;
                gakVar.c();
                gakVar.i = qztVar.j;
                gakVar.o = true;
                gakVar.c();
                gakVar.j = qztVar.k;
                gakVar.o = true;
                gakVar.c();
                gakVar.k = qztVar.l;
                gakVar.p = true;
                gakVar.c();
                gakVar.l = qztVar.m;
                gakVar.p = true;
                gakVar.c();
                gakVar.m = qztVar.n;
                gakVar.p = true;
                gakVar.c();
                nqdVar.e(i, gakVar);
            } else if (oztVar instanceof mzt) {
                nqd nqdVar2 = new nqd();
                mzt mztVar2 = (mzt) oztVar;
                nqdVar2.k = mztVar2.a;
                nqdVar2.c();
                nqdVar2.l = mztVar2.b;
                nqdVar2.s = true;
                nqdVar2.c();
                nqdVar2.o = mztVar2.e;
                nqdVar2.s = true;
                nqdVar2.c();
                nqdVar2.p = mztVar2.f;
                nqdVar2.s = true;
                nqdVar2.c();
                nqdVar2.q = mztVar2.g;
                nqdVar2.s = true;
                nqdVar2.c();
                nqdVar2.r = mztVar2.h;
                nqdVar2.s = true;
                nqdVar2.c();
                nqdVar2.m = mztVar2.c;
                nqdVar2.s = true;
                nqdVar2.c();
                nqdVar2.n = mztVar2.d;
                nqdVar2.s = true;
                nqdVar2.c();
                nqdVar2.f = mztVar2.i;
                nqdVar2.g = true;
                nqdVar2.c();
                z(nqdVar2, mztVar2);
                nqdVar.e(i, nqdVar2);
            }
        }
    }

    public u2i A(y2i y2iVar) {
        ByteBuffer byteBuffer = y2iVar.i;
        byteBuffer.getClass();
        vq1.v(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return B(y2iVar, byteBuffer);
    }

    public abstract u2i B(y2i y2iVar, ByteBuffer byteBuffer);

    public void c0(xeh xehVar) {
        up6.L(xehVar, "observer is null");
        try {
            d0(xehVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            leu.a0(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void d0(xeh xehVar);
}
