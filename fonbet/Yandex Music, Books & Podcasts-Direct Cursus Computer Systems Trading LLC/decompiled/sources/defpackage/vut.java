package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes5.dex */
public abstract class vut {
    public static uut a = null;
    public static boolean b = false;
    public static final wn5 c = new wn5(new rz3(3), 1294177282, false);
    public static final wn5 d = new wn5(new io5(27), -774990416, false);
    public static final wn5 e = new wn5(new ro5(21), -1691700041, false);
    public static final wn5 f = new wn5(new ro5(22), 11599790, false);
    public static final wn5 g = new wn5(new dp5(28), 1286539016, false);
    public static final wn5 h = new wn5(new ep5(2), 551075783, false);
    public static final char[] i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final vfs j = new vfs(0, new long[0], new Object[0]);

    public static final boolean A(bk9 bk9Var, bk9 bk9Var2) {
        if (bk9Var == null) {
            return bk9Var2 == null;
        }
        if (!(bk9Var instanceof yj9)) {
            if (bk9Var instanceof zj9) {
                if (bk9Var2 instanceof zj9) {
                    a99 a99Var = ((zj9) bk9Var).b;
                    kk9 kk9Var = a99Var.a;
                    kk9 kk9Var2 = a99Var.b;
                    szb szbVar = a99Var.c;
                    a99 a99Var2 = ((zj9) bk9Var2).b;
                    kk9 kk9Var3 = a99Var2.a;
                    kk9 kk9Var4 = a99Var2.b;
                    if (xp3.B(szbVar, a99Var2.c)) {
                        if (xp3.B(kk9Var2 != null ? kk9Var2.b : null, kk9Var4 != null ? kk9Var4.b : null)) {
                            if (xp3.B(kk9Var2 != null ? kk9Var2.a : null, kk9Var4 != null ? kk9Var4.a : null)) {
                                if (xp3.B(kk9Var != null ? kk9Var.b : null, kk9Var3 != null ? kk9Var3.b : null)) {
                                    if (xp3.B(kk9Var != null ? kk9Var.a : null, kk9Var3 != null ? kk9Var3.a : null)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (!(bk9Var instanceof ak9)) {
                    b6e.s();
                    return false;
                }
                if (bk9Var2 instanceof ak9) {
                    x1a x1aVar = ((ak9) bk9Var).b;
                    kk9 kk9Var5 = x1aVar.b;
                    kk9 kk9Var6 = x1aVar.c;
                    szb szbVar2 = x1aVar.a;
                    x1a x1aVar2 = ((ak9) bk9Var2).b;
                    kk9 kk9Var7 = x1aVar2.b;
                    kk9 kk9Var8 = x1aVar2.c;
                    if (xp3.B(szbVar2, x1aVar2.a)) {
                        if (xp3.B(kk9Var6 != null ? kk9Var6.b : null, kk9Var8 != null ? kk9Var8.b : null)) {
                            if (xp3.B(kk9Var6 != null ? kk9Var6.a : null, kk9Var8 != null ? kk9Var8.a : null)) {
                                if (xp3.B(kk9Var5 != null ? kk9Var5.b : null, kk9Var7 != null ? kk9Var7.b : null)) {
                                    if (xp3.B(kk9Var5 != null ? kk9Var5.a : null, kk9Var7 != null ? kk9Var7.a : null)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if (bk9Var2 instanceof yj9) {
            jz8 jz8Var = ((yj9) bk9Var).b;
            szb szbVar3 = jz8Var.b;
            jz8 jz8Var2 = ((yj9) bk9Var2).b;
            if (xp3.B(szbVar3, jz8Var2.b) && xp3.B(jz8Var.a, jz8Var2.a)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean B(ln9 ln9Var, ln9 ln9Var2) {
        if (ln9Var == null && ln9Var2 == null) {
            return true;
        }
        if (!xp3.B(ln9Var != null ? ln9Var.a : null, ln9Var2 != null ? ln9Var2.a : null)) {
            return false;
        }
        if (xp3.B(ln9Var != null ? ln9Var.d : null, ln9Var2 != null ? ln9Var2.d : null)) {
            return xp3.B(ln9Var != null ? ln9Var.c : null, ln9Var2 != null ? ln9Var2.c : null);
        }
        return false;
    }

    public static df4 C() {
        btq btqVar = dtq.b;
        pas pasVar = new pas(102030L, "Короткий текст", null, null, "Каждый сезон звучит по своему", btqVar, "https://avatars.mds.yandex.net/get-music-misc/2406661/img.6543b69f17dfa91083743b6e/orig", etq.b, "Zivertsdikjgnbdskjlvan");
        etq etqVar = etq.a;
        return new df4(pasVar, null, false, u75.h(new cf4("Fred again.. Fred again.. Fred again.. Fred again..", "Subtitle Fred again.. Fred again.. Fred again..", "https://avatars.yandex.net/get-music-content/34131/41fec1cf.a.301333-1/300x300", etqVar), new cf4("Fred again.. Fred again.. Fred again.. Fred again..", "Subtitle Fred again.. Fred again.. Fred again..", "https://avatars.yandex.net/get-music-content/34131/41fec1cf.a.301333-1/300x300", etqVar), new cf4("Fred again.. Fred again.. Fred again.. Fred again..", "Subtitle Fred again.. Fred again.. Fred again..", "https://avatars.yandex.net/get-music-content/34131/41fec1cf.a.301333-1/300x300", etqVar), new cf4("Fred again.. Fred again.. Fred again.. Fred again..", "Subtitle Fred again.. Fred again..Fred again..", "https://avatars.yandex.net/get-music-content/34131/41fec1cf.a.301333-1/300x300", etqVar), new cf4("Fred again..", "Subtitle", "https://avatars.yandex.net/get-music-content/34131/41fec1cf.a.301333-1/300x300", etqVar)), btqVar);
    }

    public static /* synthetic */ pjc D(hzc hzcVar, CoroutineContext coroutineContext, int i2, oi3 oi3Var, int i3) {
        if ((i3 & 1) != 0) {
            coroutineContext = g.a;
        }
        if ((i3 & 2) != 0) {
            i2 = -3;
        }
        if ((i3 & 4) != 0) {
            oi3Var = oi3.a;
        }
        return hzcVar.c(coroutineContext, i2, oi3Var);
    }

    public static final boolean E(n7q n7qVar) {
        n7qVar.getClass();
        return ((Boolean) wdg.A(n7qVar, new kjn(16))).booleanValue();
    }

    public static iag I(hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.a0(-2115993395);
        iag iagVar = (iag) oq5Var.j(r8g.a);
        oq5Var.p(false);
        return iagVar;
    }

    public static final boolean J(mo8 mo8Var) {
        vzb vzbVar;
        boolean z;
        vzb vzbVar2;
        boolean z2;
        if (mo8Var != null) {
            if (mo8Var instanceof lo8) {
                return ((lo8) mo8Var).b.a instanceof ozb;
            }
            if (mo8Var instanceof ho8) {
                k29 k29Var = ((ho8) mo8Var).b;
                if ((k29Var.a instanceof ozb) && (k29Var.b instanceof ozb) && (k29Var.c instanceof ozb)) {
                    List list = k29Var.d;
                    if (list != null) {
                        List<hy8> list2 = list;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            for (hy8 hy8Var : list2) {
                                if (hy8Var == null || (hy8Var instanceof gy8)) {
                                    z2 = true;
                                } else {
                                    if (!(hy8Var instanceof fy8)) {
                                        b6e.s();
                                        return false;
                                    }
                                    z2 = ((fy8) hy8Var).b.a instanceof ozb;
                                }
                                if (!z2) {
                                    break;
                                }
                            }
                        }
                    }
                    if (!(k29Var.e instanceof ozb) || !(k29Var.f instanceof ozb) || !(k29Var.g instanceof ozb)) {
                        break;
                    }
                }
                return false;
            }
            if (!(mo8Var instanceof io8)) {
                if (!(mo8Var instanceof ko8)) {
                    if (!(mo8Var instanceof jo8)) {
                        b6e.s();
                        return false;
                    }
                    l99 l99Var = ((jo8) mo8Var).b;
                    if (l99Var.a instanceof ozb) {
                        kc8 kc8Var = l99Var.b;
                        if (kc8Var == null || ((kc8Var.b instanceof ozb) && (kc8Var.d instanceof ozb) && (kc8Var.c instanceof ozb) && (kc8Var.a instanceof ozb))) {
                        }
                    }
                    return false;
                }
                of9 of9Var = ((ko8) mo8Var).b;
                List list3 = of9Var.c;
                boolean N = i4w.N(list3);
                List list4 = list3;
                boolean z3 = !(list4 == null || list4.isEmpty()) || (vzbVar = of9Var.d) == null || (vzbVar instanceof i86);
                if (i4w.K(of9Var.a) && i4w.K(of9Var.b)) {
                    mg9 mg9Var = of9Var.e;
                    if (mg9Var != null) {
                        if (mg9Var instanceof kg9) {
                            jz8 jz8Var = ((kg9) mg9Var).b;
                            if (!(jz8Var.a instanceof ozb) || !(jz8Var.b instanceof ozb)) {
                                z = false;
                            }
                        } else {
                            if (!(mg9Var instanceof lg9)) {
                                b6e.s();
                                return false;
                            }
                            z = ((lg9) mg9Var).b.a instanceof ozb;
                        }
                        if (z || !z3 || !N) {
                            break;
                        }
                    }
                    z = true;
                    if (z) {
                    }
                }
                return false;
            }
            g89 g89Var = ((io8) mo8Var).b;
            List list5 = g89Var.b;
            boolean L = i4w.L(list5);
            List list6 = list5;
            boolean z4 = !(list6 == null || list6.isEmpty()) || (vzbVar2 = g89Var.c) == null || (vzbVar2 instanceof i86);
            if (!(g89Var.a instanceof ozb) || !z4 || !L) {
                return false;
            }
        }
        return true;
    }

    public static final boolean K(dx8 dx8Var) {
        if (dx8Var == null) {
            return true;
        }
        lj9 lj9Var = dx8Var.b;
        if (!(lj9Var.a instanceof ozb)) {
            return false;
        }
        kj9 kj9Var = lj9Var.b;
        if (kj9Var != null) {
            if (kj9Var instanceof jj9) {
                qh9 qh9Var = ((jj9) kj9Var).b;
                if (!xp3.V(qh9Var.a) || !P(qh9Var.e) || !M(qh9Var.d) || !M(qh9Var.c) || !M(qh9Var.b)) {
                    return false;
                }
            } else {
                if (!(kj9Var instanceof ij9)) {
                    b6e.s();
                    return false;
                }
                zq8 zq8Var = ((ij9) kj9Var).b;
                if (!xp3.V(zq8Var.a)) {
                    return false;
                }
                ln9 ln9Var = zq8Var.c;
                if ((ln9Var != null && !P(ln9Var)) || !M(zq8Var.b)) {
                    return false;
                }
            }
        }
        return P(lj9Var.c);
    }

    public static final boolean L(ix8 ix8Var) {
        if (ix8Var == null) {
            return true;
        }
        return (ix8Var.c instanceof ozb) && (ix8Var.f instanceof ozb) && (ix8Var.d instanceof ozb) && (ix8Var.a instanceof ozb) && xp3.V(ix8Var.e) && xp3.V(ix8Var.b);
    }

    public static final boolean M(jz8 jz8Var) {
        if (jz8Var == null) {
            return true;
        }
        return (jz8Var.b instanceof ozb) && (jz8Var.a instanceof ozb);
    }

    public static final boolean N(xd9 xd9Var) {
        if (xd9Var == null) {
            return true;
        }
        if (xd9Var instanceof vd9) {
            yd9 yd9Var = ((vd9) xd9Var).b;
            return (yd9Var.b instanceof ozb) && (yd9Var.a instanceof ozb);
        }
        if (xd9Var instanceof wd9) {
            return ((wd9) xd9Var).b.a instanceof ozb;
        }
        b6e.s();
        return false;
    }

    public static final boolean O(bk9 bk9Var) {
        if (bk9Var == null) {
            return true;
        }
        if (bk9Var instanceof yj9) {
            jz8 jz8Var = ((yj9) bk9Var).b;
            return (jz8Var.b instanceof ozb) && (jz8Var.a instanceof ozb);
        }
        if (bk9Var instanceof zj9) {
            a99 a99Var = ((zj9) bk9Var).b;
            kk9 kk9Var = a99Var.a;
            kk9 kk9Var2 = a99Var.b;
            if (!xp3.V(a99Var.c)) {
                return false;
            }
            if (!xp3.V(kk9Var2 != null ? kk9Var2.b : null)) {
                return false;
            }
            if (!xp3.V(kk9Var2 != null ? kk9Var2.a : null)) {
                return false;
            }
            if (xp3.V(kk9Var != null ? kk9Var.b : null)) {
                return xp3.V(kk9Var != null ? kk9Var.a : null);
            }
            return false;
        }
        if (!(bk9Var instanceof ak9)) {
            b6e.s();
            return false;
        }
        x1a x1aVar = ((ak9) bk9Var).b;
        kk9 kk9Var3 = x1aVar.b;
        kk9 kk9Var4 = x1aVar.c;
        if (!xp3.V(x1aVar.a)) {
            return false;
        }
        if (!xp3.V(kk9Var4 != null ? kk9Var4.b : null)) {
            return false;
        }
        if (!xp3.V(kk9Var4 != null ? kk9Var4.a : null)) {
            return false;
        }
        if (xp3.V(kk9Var3 != null ? kk9Var3.b : null)) {
            return xp3.V(kk9Var3 != null ? kk9Var3.a : null);
        }
        return false;
    }

    public static final boolean P(ln9 ln9Var) {
        if (ln9Var == null) {
            return true;
        }
        return (ln9Var.a instanceof ozb) && (ln9Var.d instanceof ozb) && (ln9Var.c instanceof ozb);
    }

    public static final void Q(String str) {
        System.err.println("SLF4J: " + str);
    }

    public static final String R(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final eno S(pjc pjcVar, Object obj) {
        pjcVar.getClass();
        return new eno(new lkc(pjcVar, obj, (Continuation) null));
    }

    public static sgr T(we6 we6Var) {
        o2g.O(we6Var, "context must not be null");
        if (!we6Var.I()) {
            return null;
        }
        Throwable g2 = we6Var.g();
        if (g2 == null) {
            return sgr.f.i("io.grpc.Context was cancelled without error");
        }
        if (g2 instanceof TimeoutException) {
            return sgr.i.i(g2.getMessage()).h(g2);
        }
        sgr f2 = sgr.f(g2);
        return (rgr.UNKNOWN.equals(f2.a) && f2.c == g2) ? sgr.f.i("Context cancelled").h(g2) : f2.h(g2);
    }

    public static final String U(Exception exc) {
        exc.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            PrintWriter printWriter = new PrintWriter(stringWriter);
            try {
                exc.printStackTrace(printWriter);
                printWriter.close();
                String stringWriter2 = stringWriter.toString();
                stringWriter.close();
                stringWriter2.getClass();
                return stringWriter2;
            } finally {
            }
        } finally {
        }
    }

    public static final void V(String str, f9f f9fVar) {
        String sb;
        f9fVar.getClass();
        StringBuilder sb2 = new StringBuilder("in the polymorphic scope of '");
        lm4 lm4Var = (lm4) f9fVar;
        sb2.append(lm4Var.h());
        sb2.append('\'');
        String sb3 = sb2.toString();
        if (str == null) {
            sb = ouj.k('.', "Class discriminator was missing and no default serializers were registered ", sb3);
        } else {
            StringBuilder m = f1d.m("Serializer for subclass '", str, "' is not found ", sb3, ".\nCheck if class with serial name '");
            su4.v(m, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            m.append(lm4Var.h());
            m.append("' has to be sealed and '@Serializable'.");
            sb = m.toString();
        }
        throw new zhp(sb);
    }

    public static final sx W(String str) {
        switch (str.hashCode()) {
            case 423701874:
                if (str.equals("labels-albums")) {
                    return sx.c;
                }
                return null;
            case 438203910:
                if (str.equals("similar-albums")) {
                    return sx.d;
                }
                return null;
            case 990834917:
                if (str.equals("authors-books")) {
                    return sx.a;
                }
                return null;
            case 1564148627:
                if (str.equals("category-albums")) {
                    return sx.b;
                }
                return null;
            default:
                return null;
        }
    }

    public static final void a(yi1 yi1Var, ka1 ka1Var, tvd tvdVar, yci yciVar, hq5 hq5Var, int i2) {
        ka1Var.getClass();
        tvdVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2034625389);
        int i3 = i2 | (oq5Var.h(yi1Var) ? 4 : 2) | (oq5Var.f(ka1Var) ? 32 : 16) | (oq5Var.f(tvdVar) ? 256 : 128) | (oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if ((i3 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean z = (i3 & 896) == 256;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z || K == kjnVar) {
                K = new nr(tvdVar, 3);
                oq5Var.k0(K);
            }
            Function0 function0 = (Function0) K;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = szf.U(new or(4, function0));
                oq5Var.k0(K2);
            }
            if (((Boolean) ((sdr) K2).getValue()).booleanValue()) {
                oq5Var.Z(1348878389);
                b(yi1Var, ka1Var, tvdVar, ka1Var.k, function0, yciVar, oq5Var, ((i3 << 6) & 3670016) | (i3 & 8190));
            } else {
                oq5Var.Z(1347297327);
            }
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wl(i2, 13, yi1Var, ka1Var, tvdVar, yciVar);
        }
    }

    public static final void b(yi1 yi1Var, ka1 ka1Var, tvd tvdVar, boolean z, Function0 function0, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-198546309);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.h(yi1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.f(ka1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var2.f(tvdVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var2.g(true) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var2.g(z) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i3 |= oq5Var2.h(function0) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i2) == 0) {
            i3 |= oq5Var2.f(yciVar) ? 1048576 : 524288;
        }
        if ((i3 & 599187) == 599186 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            yci s = wyf.s(yciVar, function0);
            Object K = oq5Var2.K();
            if (K == gq5.a) {
                K = szf.U(new nr(tvdVar, 1));
                oq5Var2.k0(K);
            }
            oq5Var = oq5Var2;
            p9b.a(ild.C(-924075416, new qr(ka1Var, yi1Var, function0, z, tvdVar), oq5Var2), s, ((Boolean) ((sdr) K).getValue()).booleanValue(), oq5Var, 6, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new dq(yi1Var, ka1Var, tvdVar, z, function0, yciVar, i2);
        }
    }

    public static final void c(q32 q32Var, iyq iyqVar, boolean z, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        q32 q32Var2 = q32Var;
        q32Var2.getClass();
        iyqVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(789503909);
        int i3 = 2;
        int i4 = i2 | (oq5Var2.h(q32Var2) ? 4 : 2) | (oq5Var2.h(iyqVar) ? 32 : 16) | (oq5Var2.g(z) ? 256 : 128);
        int i5 = 1;
        if (oq5Var2.P(i4 & 1, (i4 & 147) != 146)) {
            iyqVar.a(((Boolean) szf.Q(q32Var2.f, oq5Var2).getValue()).booleanValue(), oq5Var2, (i4 & 112) | 64);
            ogp ogpVar = ogp.g;
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new jle(i3);
                oq5Var2.k0(K);
            }
            ogpVar.f((kle) K, oq5Var2, 64);
            fvf a2 = hvf.a(0, 0, oq5Var2, 0, 3);
            String M = rvf.M(R.string.auto_download_screen_title, oq5Var2);
            boolean h2 = oq5Var2.h(q32Var2);
            Object K2 = oq5Var2.K();
            if (h2 || K2 == kjnVar) {
                oi1 oi1Var = new oi1(0, q32Var, q32.class, "onBackClick", "onBackClick()V", 0, 15);
                q32Var2 = q32Var;
                oq5Var2.k0(oi1Var);
                K2 = oi1Var;
            }
            oq5Var = oq5Var2;
            xp3.d(M, a2, null, ghh.C(zs4.g(oq5Var2), ogp.A(oq5Var2)), (Function0) ((h9f) K2), null, false, false, null, null, null, ild.C(835237167, new qt(q32Var2, a2, z, i5), oq5Var2), oq5Var, 0, 48, 2020);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new oc1(q32Var2, iyqVar, z, i2, 3);
        }
    }

    public static final void d(l75 l75Var, pfn pfnVar, mmu mmuVar, jzi jziVar, kxi kxiVar, hq5 hq5Var, int i2) {
        boolean z;
        owu owuVar;
        long j2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(532294921);
        int i3 = i2 | (oq5Var.f(l75Var) ? 4 : 2) | (oq5Var.h(pfnVar) ? 32 : 16) | (oq5Var.f(mmuVar) ? 256 : 128) | (oq5Var.f(jziVar) ? 2048 : 1024) | (oq5Var.h(kxiVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var.P(i3 & 1, (i3 & 9363) != 9362)) {
            if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                oq5Var.Z(579007791);
                oq5Var.p(false);
                owuVar = qrm.a;
                z = false;
            } else {
                oq5Var.Z(579093196);
                StationId stationId = mmuVar.d;
                List list = mmuVar.e;
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
                boolean z2 = ((i3 & 896) == 256) | ((i3 & 14) == 4);
                Object K = oq5Var.K();
                if (z2 || K == gq5.a) {
                    K = new ap1(22, l75Var, mmuVar);
                    oq5Var.k0(K);
                }
                int i4 = ((i3 >> 3) & 7168) | 6 | ((i3 << 15) & 234881024) | ((i3 << 24) & 1879048192);
                z = false;
                owu Y = wyf.Y(stationId, list, kxiVar, (Function0) K, k6lVar, uwuVar, qwuVar, jziVar, pfnVar, null, oq5Var, i4, 0, RemoteCameraConfig.Mic.BUFFER_SIZE);
                oq5Var = oq5Var;
                oq5Var.p(false);
                owuVar = Y;
            }
            d85 d85Var = mmuVar.f.a;
            String str = mmuVar.a;
            String str2 = mmuVar.b;
            if (d85Var == null) {
                oq5Var.Z(434346095);
                j2 = kg5.r(R.color.mymusic_favorite_vibe, oq5Var);
                oq5Var.p(z);
            } else {
                oq5Var.Z(434345661);
                oq5Var.p(z);
                j2 = d85Var.a;
            }
            lnu lnuVar = new lnu(str, str2, j2, new amu(mmuVar.c, null, null), null, nmu.b, mmuVar.f.b, null, 128);
            vci vciVar = vci.a;
            knu[] knuVarArr = knu.a;
            float f2 = 16;
            a4g.o(lnuVar, owuVar, a.q(androidx.compose.ui.platform.a.a(vciVar, "wave_favorite_button"), f2, 4, f2, 0.0f, 8), 0.0f, oq5Var, 0, 8);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bj(i2, 11, l75Var, pfnVar, mmuVar, jziVar, kxiVar);
        }
    }

    public static final void e(boolean z, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1073942099);
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            pm0.a(null, ild.C(-340463460, new sm(15, z), oq5Var), oq5Var, 48, 1);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new sm(i2, 16, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v33 */
    public static final void f(h93 h93Var, wdj wdjVar, Function0 function0, Function0 function02, Function0 function03, yci yciVar, hq5 hq5Var, int i2) {
        Function0 function04;
        wdj wdjVar2;
        oq5 oq5Var;
        vci vciVar;
        kb5 kb5Var;
        kb5 kb5Var2;
        saj sajVar;
        boolean z;
        grb grbVar;
        kb5 kb5Var3;
        kb5 kb5Var4;
        ?? r5;
        oq5 oq5Var2;
        kb5 kb5Var5;
        kb5 kb5Var6;
        String str;
        kb5 kb5Var7;
        kjn kjnVar;
        vci vciVar2;
        kb5 kb5Var8;
        kb5 kb5Var9;
        boolean z2;
        oq5 oq5Var3;
        kb5 kb5Var10;
        kb5 kb5Var11;
        kb5 kb5Var12;
        oq5 oq5Var4;
        boolean z3;
        oq5 oq5Var5;
        boolean z4;
        hz2 hz2Var = b2c.k;
        h93Var.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        oq5 oq5Var6 = (oq5) hq5Var;
        oq5Var6.b0(1166819333);
        int i3 = i2 | (oq5Var6.f(h93Var) ? 4 : 2) | (oq5Var6.h(wdjVar) ? 32 : 16) | (oq5Var6.h(function0) ? 256 : 128) | (oq5Var6.h(function02) ? 2048 : 1024) | (oq5Var6.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if (oq5Var6.P(i3 & 1, (74899 & i3) != 74898)) {
            kx0 kx0Var = qx0.c;
            gz2 gz2Var = b2c.n;
            ta5 a2 = sa5.a(kx0Var, gz2Var, oq5Var6, 0);
            int i4 = oq5Var6.P;
            androidx.compose.runtime.internal.a l = oq5Var6.l();
            yci H = vnj.H(oq5Var6, yciVar);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var6.d0();
            if (oq5Var6.O) {
                oq5Var6.k(grbVar2);
            } else {
                oq5Var6.n0();
            }
            kb5 kb5Var13 = wp5.f;
            g0g.U(oq5Var6, a2, kb5Var13);
            kb5 kb5Var14 = wp5.e;
            g0g.U(oq5Var6, l, kb5Var14);
            kb5 kb5Var15 = wp5.g;
            if (oq5Var6.O || !Intrinsics.d(oq5Var6.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var6, i4, kb5Var15);
            }
            kb5 kb5Var16 = wp5.d;
            g0g.U(oq5Var6, H, kb5Var16);
            String str2 = h93Var.a;
            saj sajVar2 = h93Var.e;
            vci vciVar3 = vci.a;
            if (str2 == null) {
                oq5Var6.Z(-1477438880);
                oq5Var6.p(false);
                kb5Var2 = kb5Var16;
                sajVar = sajVar2;
                r5 = 0;
                kb5Var = kb5Var15;
                kb5Var3 = kb5Var13;
                kb5Var4 = kb5Var14;
                vciVar = vciVar3;
                z = true;
                oq5Var2 = oq5Var6;
                grbVar = grbVar2;
            } else {
                oq5Var6.Z(-1477438879);
                float f2 = 16;
                vciVar = vciVar3;
                yci a3 = androidx.compose.ui.platform.a.a(d.d(wyf.C(a.q(vciVar3, f2, 0.0f, f2, 12, 2), function0, 0.0f, 0.0f, 14), 1.0f), "non_music_description_block");
                ta5 a4 = sa5.a(kx0Var, gz2Var, oq5Var6, 0);
                int i5 = oq5Var6.P;
                androidx.compose.runtime.internal.a l2 = oq5Var6.l();
                yci H2 = vnj.H(oq5Var6, a3);
                oq5Var6.d0();
                if (oq5Var6.O) {
                    oq5Var6.k(grbVar2);
                } else {
                    oq5Var6.n0();
                }
                g0g.U(oq5Var6, a4, kb5Var13);
                g0g.U(oq5Var6, l2, kb5Var14);
                if (oq5Var6.O || !Intrinsics.d(oq5Var6.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var6, i5, kb5Var15);
                }
                g0g.U(oq5Var6, H2, kb5Var16);
                ges j2 = nu0.j();
                agr agrVar = eq0.a;
                long j3 = ((dq0) oq5Var6.j(agrVar)).b.a;
                kb5Var = kb5Var15;
                kb5Var2 = kb5Var16;
                sajVar = sajVar2;
                z = true;
                grbVar = grbVar2;
                kb5Var3 = kb5Var13;
                kb5Var4 = kb5Var14;
                xcs.b(str2, null, j3, 0L, null, 0L, null, null, 0L, 2, false, 3, 0, null, j2, oq5Var6, 0, 3120, 55290);
                xcs.b(rvf.M(R.string.non_music_screen_read_more, oq5Var6), null, ((dq0) oq5Var6.j(agrVar)).b.d, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var6, 0, 3120, 55290);
                oq5 oq5Var7 = oq5Var6;
                oq5Var7.p(true);
                r5 = 0;
                oq5Var7.p(false);
                oq5Var2 = oq5Var7;
            }
            ArrayList arrayList = h93Var.b;
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            ArrayList arrayList2 = arrayList;
            kjn kjnVar2 = gq5.a;
            if (arrayList2 == null) {
                oq5Var2.Z(-1476444617);
                oq5Var2.p(r5);
                kb5Var8 = kb5Var2;
                kb5Var6 = kb5Var4;
                kb5Var7 = kb5Var3;
                z2 = r5;
                str = StringUtil.SPACE;
                kjnVar = kjnVar2;
                vciVar2 = vciVar;
                kb5Var9 = kb5Var;
                oq5Var3 = oq5Var2;
            } else {
                oq5Var2.Z(-1476444616);
                vci vciVar4 = vciVar;
                yci e2 = androidx.compose.foundation.a.e(vciVar4, false, null, null, function02, 7);
                float f3 = 16;
                float f4 = 4;
                yci p = a.p(e2, f3, f4, f3, f4);
                Object K = oq5Var2.K();
                if (K == kjnVar2) {
                    K = new mz2(3);
                    oq5Var2.k0(K);
                }
                yci b2 = nfp.b(p, z, (Function1) K);
                nho a5 = lho.a(qx0.a, hz2Var, oq5Var2, r5);
                int i6 = oq5Var2.P;
                androidx.compose.runtime.internal.a l3 = oq5Var2.l();
                yci H3 = vnj.H(oq5Var2, b2);
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(grbVar);
                } else {
                    oq5Var2.n0();
                }
                g0g.U(oq5Var2, a5, kb5Var3);
                g0g.U(oq5Var2, l3, kb5Var4);
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i6))) {
                    kb5Var5 = kb5Var;
                    ouj.x(i6, oq5Var2, i6, kb5Var5);
                } else {
                    kb5Var5 = kb5Var;
                }
                kb5 kb5Var17 = kb5Var2;
                g0g.U(oq5Var2, H3, kb5Var17);
                String quantityString = gdg.K(oq5Var2).getQuantityString(R.plurals.non_music_screen_speaker, arrayList2.size());
                ges j4 = nu0.j();
                agr agrVar2 = eq0.a;
                long j5 = ((dq0) oq5Var2.j(agrVar2)).b.b;
                oq5 oq5Var8 = oq5Var2;
                kb5Var6 = kb5Var4;
                str = StringUtil.SPACE;
                kb5Var7 = kb5Var3;
                kjnVar = kjnVar2;
                vciVar2 = vciVar4;
                kb5Var8 = kb5Var17;
                kb5Var9 = kb5Var5;
                xcs.b(quantityString, null, j5, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, j4, oq5Var8, 0, 3120, 55290);
                xcs.b(str.concat(CollectionsKt.X(arrayList2, null, null, null, null, 63)), d.d(vciVar2, 1.0f), ((dq0) oq5Var8.j(agrVar2)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var8, 48, 3120, 55288);
                oq5 oq5Var9 = oq5Var8;
                oq5Var9.p(true);
                z2 = false;
                oq5Var9.p(false);
                oq5Var3 = oq5Var9;
            }
            String str3 = h93Var.c;
            if (str3 == null) {
                oq5Var3.Z(-1475343559);
                oq5Var3.p(z2);
                kb5Var11 = kb5Var9;
                kb5Var12 = kb5Var8;
                oq5Var4 = oq5Var3;
            } else {
                oq5Var3.Z(-1475343558);
                float f5 = 16;
                int i7 = 4;
                float f6 = 4;
                yci p2 = a.p(vciVar2, f5, f6, f5, f6);
                Object K2 = oq5Var3.K();
                if (K2 == kjnVar) {
                    K2 = new mz2(i7);
                    oq5Var3.k0(K2);
                }
                yci b3 = nfp.b(p2, true, (Function1) K2);
                nho a6 = lho.a(qx0.a, hz2Var, oq5Var3, 0);
                int i8 = oq5Var3.P;
                androidx.compose.runtime.internal.a l4 = oq5Var3.l();
                yci H4 = vnj.H(oq5Var3, b3);
                oq5Var3.d0();
                if (oq5Var3.O) {
                    oq5Var3.k(grbVar);
                } else {
                    oq5Var3.n0();
                }
                kb5 kb5Var18 = kb5Var7;
                g0g.U(oq5Var3, a6, kb5Var18);
                kb5 kb5Var19 = kb5Var6;
                g0g.U(oq5Var3, l4, kb5Var19);
                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i8))) {
                    kb5Var10 = kb5Var9;
                    ouj.x(i8, oq5Var3, i8, kb5Var10);
                } else {
                    kb5Var10 = kb5Var9;
                }
                kb5 kb5Var20 = kb5Var8;
                g0g.U(oq5Var3, H4, kb5Var20);
                String M = rvf.M(R.string.non_music_screen_total_duration, oq5Var3);
                ges j6 = nu0.j();
                agr agrVar3 = eq0.a;
                kb5Var7 = kb5Var18;
                kb5Var6 = kb5Var19;
                kb5Var11 = kb5Var10;
                kb5Var12 = kb5Var20;
                oq5 oq5Var10 = oq5Var3;
                xcs.b(M, null, ((dq0) oq5Var3.j(agrVar3)).b.b, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, j6, oq5Var10, 0, 3120, 55290);
                vciVar2 = vciVar2;
                xcs.b(str.concat(str3), d.d(vciVar2, 1.0f), ((dq0) oq5Var10.j(agrVar3)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var10, 48, 3120, 55288);
                oq5 oq5Var11 = oq5Var10;
                oq5Var11.p(true);
                oq5Var11.p(false);
                oq5Var4 = oq5Var11;
            }
            if (h93Var.d) {
                oq5Var4.Z(-1474330013);
                float f7 = 16;
                float f8 = 4;
                yci p3 = a.p(vciVar2, f7, f8, f7, f8);
                Object K3 = oq5Var4.K();
                if (K3 == kjnVar) {
                    K3 = new mz2(5);
                    oq5Var4.k0(K3);
                }
                yci b4 = nfp.b(p3, true, (Function1) K3);
                nho a7 = lho.a(qx0.a, hz2Var, oq5Var4, 0);
                int i9 = oq5Var4.P;
                androidx.compose.runtime.internal.a l5 = oq5Var4.l();
                yci H5 = vnj.H(oq5Var4, b4);
                oq5Var4.d0();
                if (oq5Var4.O) {
                    oq5Var4.k(grbVar);
                } else {
                    oq5Var4.n0();
                }
                g0g.U(oq5Var4, a7, kb5Var7);
                g0g.U(oq5Var4, l5, kb5Var6);
                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i9))) {
                    ouj.x(i9, oq5Var4, i9, kb5Var11);
                }
                g0g.U(oq5Var4, H5, kb5Var12);
                String M2 = rvf.M(R.string.non_music_screen_age_restriction, oq5Var4);
                ges j7 = nu0.j();
                agr agrVar4 = eq0.a;
                oq5 oq5Var12 = oq5Var4;
                xcs.b(M2, null, ((dq0) oq5Var4.j(agrVar4)).b.b, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, j7, oq5Var12, 0, 3120, 55290);
                xcs.b(" 18+", d.d(vciVar2, 1.0f), ((dq0) oq5Var12.j(agrVar4)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var12, 54, 3120, 55288);
                oq5 oq5Var13 = oq5Var12;
                oq5Var13.p(true);
                z3 = false;
                oq5Var5 = oq5Var13;
            } else {
                z3 = false;
                oq5Var4.Z(-1479044493);
                oq5Var5 = oq5Var4;
            }
            oq5Var5.p(z3);
            if (wdjVar == null || sajVar == null) {
                wdjVar2 = wdjVar;
                function04 = function03;
                z4 = false;
                oq5Var5.Z(-1479044493);
            } else {
                oq5Var5.Z(-1473315693);
                raj rajVar = sajVar.a;
                yci a8 = androidx.compose.ui.platform.a.a(a.q(vciVar2, 0.0f, 12, 0.0f, 0.0f, 13), "preview_track");
                Object K4 = oq5Var5.K();
                if (K4 == kjnVar) {
                    function04 = function03;
                    K4 = new or(8, function04);
                    oq5Var5.k0(K4);
                } else {
                    function04 = function03;
                }
                Function0 function05 = (Function0) K4;
                a8.getClass();
                function05.getClass();
                wdjVar2 = wdjVar;
                o5g.d(rajVar, wdjVar2, androidx.compose.ui.layout.a.d(a8, new ex(2, function05)), oq5Var5, i3 & 112);
                z4 = false;
            }
            oq5Var5.p(z4);
            oq5Var5.p(true);
            oq5Var = oq5Var5;
        } else {
            function04 = function03;
            oq5 oq5Var14 = oq5Var6;
            wdjVar2 = wdjVar;
            oq5Var14.S();
            oq5Var = oq5Var14;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pr(h93Var, wdjVar2, function0, function02, function04, yciVar, i2, 4);
        }
    }

    public static final void g(l75 l75Var, hq5 hq5Var, int i2) {
        l75 l75Var2;
        oq5 oq5Var;
        boolean z;
        long j2;
        l75Var.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(665893668);
        int i3 = (oq5Var2.f(l75Var) ? 4 : 2) | i2;
        int i4 = 1;
        if (oq5Var2.P(i3 & 1, (i3 & 3) != 2)) {
            gz2 gz2Var = b2c.o;
            lx0 lx0Var = qx0.e;
            vci vciVar = vci.a;
            yci a2 = androidx.compose.ui.platform.a.a(d.c(vciVar, 1.0f), "collection_wave_block");
            ta5 a3 = sa5.a(lx0Var, gz2Var, oq5Var2, 54);
            int i5 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, a2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a3, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var2, i5, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            p75 p75Var = (p75) gld.O(l75Var.d, oq5Var2).getValue();
            if (p75Var instanceof n75) {
                oq5Var2.Z(-1017299914);
                n75 n75Var = (n75) p75Var;
                mmu mmuVar = n75Var.a;
                int i6 = i3 & 14;
                d(l75Var, n75Var.b, mmuVar, l75Var.e, l75Var.c, oq5Var2, i6);
                l75Var2 = l75Var;
                u1g.l(oq5Var2, d.e(vciVar, 8));
                d85 d85Var = mmuVar.f.a;
                if (d85Var == null) {
                    oq5Var2.Z(-1833917548);
                    j2 = kg5.r(R.color.mymusic_favorite_vibe, oq5Var2);
                    oq5Var2.p(false);
                } else {
                    oq5Var2.Z(-1833918881);
                    oq5Var2.p(false);
                    j2 = d85Var.a;
                }
                long j3 = j2;
                mn0 m = o8g.m(f8g.Y(R.string.collection_wave_onboarding_text, oq5Var2), j3, oq5Var2, 0, 0);
                oq5Var = oq5Var2;
                Object K = oq5Var.K();
                kjn kjnVar = gq5.a;
                if (K == kjnVar) {
                    K = vz1.h(oq5Var);
                }
                uoi uoiVar = (uoi) K;
                boolean e2 = (i6 == 4) | oq5Var.e(j3);
                Object K2 = oq5Var.K();
                if (e2 || K2 == kjnVar) {
                    K2 = new sz4(l75Var2, j3, i4);
                    oq5Var.k0(K2);
                }
                z = true;
                xv7.i(m, androidx.compose.ui.platform.a.a(a.o(androidx.compose.foundation.a.d(vciVar, uoiVar, null, false, null, null, (Function0) K2, 28), 24, 0.0f, 2), "wave_music_color_text"), ((dq0) oq5Var.j(eq0.a)).b.b, 0L, 0L, 3, 0L, 0, false, 0, 0, null, null, nu0.i(), null, null, oq5Var, 0, 0, 917240);
                oq5Var.p(false);
            } else {
                l75Var2 = l75Var;
                oq5Var = oq5Var2;
                z = true;
                if (p75Var instanceof o75) {
                    oq5Var.Z(-1833888260);
                    e(true, oq5Var, 6);
                    oq5Var.p(false);
                } else {
                    if (!(p75Var instanceof m75)) {
                        throw vz1.i(oq5Var, -1833933441, false);
                    }
                    oq5Var.Z(-1833885091);
                    e(false, oq5Var, 6);
                    oq5Var.p(false);
                }
            }
            oq5Var.p(z);
        } else {
            l75Var2 = l75Var;
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kv4(l75Var2, i2, 5);
        }
    }

    public static final void h(ut5 ut5Var, hq5 hq5Var, int i2) {
        ut5 ut5Var2;
        ut5Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(890707100);
        if ((((oq5Var.h(ut5Var) ? 4 : 2) | i2) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
            ut5Var2 = ut5Var;
        } else {
            ut5Var2 = ut5Var;
            pm0.a(null, ild.C(-1080688603, new s43((bu5) gld.O(ut5Var.h, oq5Var).getValue(), ut5Var2, ((Boolean) gld.O(ut5Var.i, oq5Var).getValue()).booleanValue(), wsf.a(oq5Var), 7), oq5Var), oq5Var, 48, 1);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kv4(ut5Var2, i2, 9);
        }
    }

    public static final void i(po6 po6Var, bg5 bg5Var, yci yciVar, hq5 hq5Var, int i2) {
        po6 po6Var2;
        kjn kjnVar;
        po6Var.getClass();
        bg5Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1915690413);
        int i3 = (oq5Var.f(po6Var) ? 4 : 2) | i2 | (oq5Var.h(bg5Var) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        int i4 = i3;
        if ((i4 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            aqi M = gld.M(bg5Var.l(), oq5Var);
            aqi M2 = gld.M(bg5Var.c(), oq5Var);
            aqi M3 = gld.M(bg5Var.h(), oq5Var);
            if (bg5Var.k()) {
                po6Var2 = po6Var;
            } else {
                String str = po6Var.a;
                String str2 = po6Var.b;
                String str3 = po6Var.c;
                boolean z = po6Var.d;
                jzb jzbVar = po6Var.e;
                boolean z2 = po6Var.g;
                str2.getClass();
                po6Var2 = new po6(str, str2, str3, z, jzbVar, false, z2);
            }
            rba rbaVar = (rba) M.getValue();
            lzs lzsVar = (lzs) M2.getValue();
            frs frsVar = (frs) M3.getValue();
            boolean j2 = bg5Var.j();
            boolean h2 = oq5Var.h(bg5Var);
            Object K = oq5Var.K();
            kjn kjnVar2 = gq5.a;
            if (h2 || K == kjnVar2) {
                kjnVar = kjnVar2;
                ej6 ej6Var = new ej6(0, bg5Var, bg5.class, "onClick", "onClick()V", 0, 5);
                oq5Var.k0(ej6Var);
                K = ej6Var;
            } else {
                kjnVar = kjnVar2;
            }
            Function0 function0 = (Function0) ((h9f) K);
            boolean h3 = oq5Var.h(bg5Var);
            Object K2 = oq5Var.K();
            if (h3 || K2 == kjnVar) {
                ej6 ej6Var2 = new ej6(0, bg5Var, bg5.class, "onLongClick", "onLongClick()V", 0, 6);
                oq5Var.k0(ej6Var2);
                K2 = ej6Var2;
            }
            Function0 function02 = (Function0) ((h9f) K2);
            boolean h4 = oq5Var.h(bg5Var);
            Object K3 = oq5Var.K();
            if (h4 || K3 == kjnVar) {
                ej6 ej6Var3 = new ej6(0, bg5Var, bg5.class, "onOverflowClick", "onOverflowClick()V", 0, 7);
                oq5Var.k0(ej6Var3);
                K3 = ej6Var3;
            }
            j(po6Var2, rbaVar, lzsVar, frsVar, j2, function0, function02, (Function0) ((h9f) K3), yciVar, oq5Var, (i4 << 18) & 234881024);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new b3(po6Var, bg5Var, yciVar, i2, 28);
        }
    }

    public static final void j(po6 po6Var, rba rbaVar, lzs lzsVar, frs frsVar, boolean z, Function0 function0, Function0 function02, Function0 function03, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var;
        po6Var.getClass();
        rbaVar.getClass();
        lzsVar.getClass();
        frsVar.getClass();
        function0.getClass();
        function03.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-118467241);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var2.f(po6Var) : oq5Var2.h(po6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.d(rbaVar.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var2.d(lzsVar.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var2.d(frsVar.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var2.g(z) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i2 & 196608) == 0) {
            i3 |= oq5Var2.h(function0) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i2) == 0) {
            i3 |= oq5Var2.h(function02) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= oq5Var2.h(function03) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((100663296 & i2) == 0) {
            i3 |= oq5Var2.f(yciVar) ? 67108864 : 33554432;
        }
        if ((38347923 & i3) == 38347922 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            int i4 = 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3);
            int i5 = i3 << 3;
            oq5Var = oq5Var2;
            t7g.c(new hg5(po6Var.b, po6Var.c, po6Var.d, po6Var.e, po6Var.f), rbaVar, lzsVar, frsVar, z, nxq.b, function0, function02, function03, yciVar, null, null, ild.C(-805555509, new lo6(po6Var, lzsVar, frsVar), oq5Var2), oq5Var, i4 | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192), 384, 3072);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new mc(po6Var, rbaVar, lzsVar, frsVar, z, function0, function02, function03, yciVar, i2, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(int i2, int i3, hq5 hq5Var, yci yciVar, boolean z) {
        int i4;
        yci yciVar2;
        Object K;
        kjn kjnVar;
        Object K2;
        oq5 oq5Var;
        yci yciVar3;
        xmn r;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1761379586);
        if ((i2 & 6) == 0) {
            i4 = i2 | (oq5Var2.g(z) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var2.f(yciVar2) ? 32 : 16;
            if ((i4 & 19) == 18 || !oq5Var2.z()) {
                yci yciVar4 = i5 == 0 ? vci.a : yciVar2;
                int i6 = i4;
                zyj zyjVar = zyj.a;
                rba rbaVar = rba.a;
                lzs lzsVar = lzs.a;
                nxq nxqVar = nxq.b;
                K = oq5Var2.K();
                kjnVar = gq5.a;
                if (K == kjnVar) {
                    K = new cp5(20);
                    oq5Var2.k0(K);
                }
                Function0 function0 = (Function0) K;
                K2 = oq5Var2.K();
                if (K2 == kjnVar) {
                    K2 = new cp5(21);
                    oq5Var2.k0(K2);
                }
                oq5Var = oq5Var2;
                qgg.l(zyjVar, rbaVar, lzsVar, false, true, function0, null, (Function0) K2, ild.C(-924884548, new sm(20, z), oq5Var2), ild.C(-1217270373, new sm(21, z), oq5Var2), yciVar4, nxqVar, null, null, null, null, 0L, 0L, null, null, false, oq5Var, 920350134, ((i6 >> 3) & 14) | 48, 6, 1044480);
                yciVar3 = yciVar4;
            } else {
                oq5Var2.S();
                oq5Var = oq5Var2;
                yciVar3 = yciVar2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new n10(z, yciVar3, i2, i3, 2);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((i4 & 19) == 18) {
        }
        if (i5 == 0) {
        }
        int i62 = i4;
        zyj zyjVar2 = zyj.a;
        rba rbaVar2 = rba.a;
        lzs lzsVar2 = lzs.a;
        nxq nxqVar2 = nxq.b;
        K = oq5Var2.K();
        kjnVar = gq5.a;
        if (K == kjnVar) {
        }
        Function0 function02 = (Function0) K;
        K2 = oq5Var2.K();
        if (K2 == kjnVar) {
        }
        oq5Var = oq5Var2;
        qgg.l(zyjVar2, rbaVar2, lzsVar2, false, true, function02, null, (Function0) K2, ild.C(-924884548, new sm(20, z), oq5Var2), ild.C(-1217270373, new sm(21, z), oq5Var2), yciVar4, nxqVar2, null, null, null, null, 0L, 0L, null, null, false, oq5Var, 920350134, ((i62 >> 3) & 14) | 48, 6, 1044480);
        yciVar3 = yciVar4;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static it7 l(String str) {
        str.getClass();
        return new it7(str);
    }

    public static final void m(ArrayList arrayList, ArrayList arrayList2, tea teaVar, fvf fvfVar, o0k o0kVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var;
        teaVar.getClass();
        fvfVar.getClass();
        o0kVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1552192887);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.h(arrayList) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.h(arrayList2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var2.h(teaVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var2.f(fvfVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var2.f(o0kVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if (oq5Var2.P(i3 & 1, (i3 & 9363) != 9362)) {
            vm C = ghh.C(o0kVar, a.c(0.0f, 0.0f, 0.0f, 16, 7));
            yci a2 = androidx.compose.ui.platform.a.a(d.c(vci.a, 1.0f), "collection_downloaded_audiobooks_blocks");
            boolean h2 = oq5Var2.h(arrayList) | oq5Var2.h(teaVar) | oq5Var2.h(arrayList2);
            Object K = oq5Var2.K();
            if (h2 || K == gq5.a) {
                K = new g3(24, arrayList, arrayList2, teaVar);
                oq5Var2.k0(K);
            }
            oq5Var = oq5Var2;
            weo.f(a2, fvfVar, C, null, null, null, false, null, (Function1) K, oq5Var, ((i3 >> 6) & 112) | 6, 504);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tu(i2, 11, arrayList, arrayList2, teaVar, fvfVar, o0kVar);
        }
    }

    public static final void n(zrj zrjVar, c0p c0pVar, p0p p0pVar, boolean z, Function1 function1, yci yciVar, hq5 hq5Var, int i2) {
        yci yciVar2;
        c0pVar.getClass();
        p0pVar.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1122784877);
        int i3 = i2 | (oq5Var.f(zrjVar) ? 4 : 2) | (oq5Var.d(c0pVar.ordinal()) ? 32 : 16) | (oq5Var.d(p0pVar.ordinal()) ? 256 : 128) | (oq5Var.g(z) ? 2048 : 1024) | (oq5Var.h(function1) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var.P(i3 & 1, (74899 & i3) != 74898)) {
            yciVar2 = yciVar;
            o(yciVar2, ild.C(-1332670290, new qr(6, zrjVar, function1, p0pVar, c0pVar, z), oq5Var), oq5Var, 54);
        } else {
            yciVar2 = yciVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k5b(zrjVar, c0pVar, p0pVar, z, function1, yciVar2, i2, 0);
        }
    }

    public static final void o(yci yciVar, wn5 wn5Var, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1577777980);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(yciVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(wn5Var) ? 32 : 16;
        }
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new sjq();
                oq5Var.k0(K);
            }
            sjq sjqVar = (sjq) K;
            yci f2 = yciVar.f(sjqVar.d);
            boolean h2 = oq5Var.h(sjqVar);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                K2 = new n5b(0, sjqVar);
                oq5Var.k0(K2);
            }
            kfh kfhVar = (kfh) K2;
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, f2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            int i5 = ((((i3 >> 3) & 14) << 6) & 896) | 6;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, kfhVar, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            eta.l((i5 >> 6) & 14, wn5Var, oq5Var, true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ce3(yciVar, wn5Var, i2, 2);
        }
    }

    public static final void p(boolean z, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(273226445);
        if ((((oq5Var.g(z) ? 4 : 2) | i2) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            pm0.a(null, ild.C(1281806948, new ui7(z, ff7.P(v7g.z(24), oq5Var)), oq5Var), oq5Var, 48, 1);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new sm(i2, 24, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x018f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r0.K(), java.lang.Integer.valueOf(r8)) == false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void q(String str, long j2, obh obhVar, Function0 function0, pyc pycVar, hq5 hq5Var, int i2) {
        int i3;
        int i4;
        boolean z;
        str.getClass();
        obhVar.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-978229348);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.e(j2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(obhVar) : oq5Var.h(obhVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.h(function0) ? 2048 : 1024;
        }
        int i5 = i2 & 24576;
        vci vciVar = vci.a;
        if (i5 == 0) {
            i3 |= oq5Var.f(vciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i3 |= oq5Var.h(pycVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i3) == 74898 && oq5Var.z()) {
            oq5Var.S();
        } else {
            float P = ff7.P(v7g.z(24), oq5Var);
            lx0 lx0Var = qx0.e;
            float f2 = 8;
            yci e2 = d.e(a.o(d.d(vciVar, 1.0f), f2, 0.0f, 2), P);
            float f3 = com.yandex.music.design.components.animation.a.a;
            mrb mrbVar = new mrb(1, f2);
            fk0 fk0Var = obhVar.b;
            Pair pair = obh.c;
            Object obj = pair.a;
            ((Number) obj).floatValue();
            Float f4 = (Float) (Intrinsics.d(pair.b, obhVar.a) ? obj : null);
            yci b2 = com.yandex.music.design.components.animation.a.b(e2, mrbVar, f4 != null ? f4.floatValue() : 0.0f, fk0Var);
            g4c[] g4cVarArr = {g4c.a, g4c.b};
            float f5 = pii.a;
            b2.getClass();
            yci r = vnj.r(q7g.N(b2), "basicFadingEdge", new Object[0], new ng6(pii.b, (g4c[]) Arrays.copyOf(g4cVarArr, 2), pii.a));
            boolean z2 = (i3 & 7168) == 2048;
            Object K = oq5Var.K();
            if (z2 || K == gq5.a) {
                K = new or(22, function0);
                oq5Var.k0(K);
            }
            yci e3 = androidx.compose.foundation.a.e(r, false, null, null, (Function0) K, 7);
            nho a2 = lho.a(lx0Var, b2c.k, oq5Var, 6);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, e3);
            xp5.T.getClass();
            Function0 function02 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(function02);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O) {
                i4 = i3;
            } else {
                i4 = i3;
            }
            ouj.x(i6, oq5Var, i6, kb5Var3);
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            hz2 hz2Var = b2c.l;
            yci o = a.o(d.c(vciVar, 1.0f), f2, 0.0f, 2);
            nho a3 = lho.a(qx0.a, hz2Var, oq5Var, 48);
            int i7 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, o);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(function02);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var, i7, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            if (pycVar != null) {
                oq5Var.Z(-1620485684);
                pycVar.invoke(new cma(P), oq5Var, Integer.valueOf((i4 >> 12) & 112));
                u1g.l(oq5Var, d.r(vciVar, ff7.P(v7g.z(6), oq5Var)));
                z = false;
            } else {
                z = false;
                oq5Var.Z(-1623358578);
            }
            oq5Var.p(z);
            xcs.b(str, null, j2, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, nu0.j(), oq5Var, (i4 & 14) | ((i4 << 3) & 896), 3072, 57338);
            oq5Var.p(true);
            oq5Var.p(true);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new pb1(str, j2, obhVar, function0, pycVar, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void r(String str, lzs lzsVar, yci yciVar, o0k o0kVar, float f2, boolean z, hq5 hq5Var, int i2, int i3) {
        yci yciVar2;
        int i4;
        o0k o0kVar2;
        float f3;
        int i5;
        int i6;
        int i7;
        o0k o0kVar3;
        boolean z2;
        float f4;
        yci yciVar3;
        o0k o0kVar4;
        xmn r;
        int i8;
        str.getClass();
        lzsVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1165693565);
        int i9 = (oq5Var.f(str) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i9 |= oq5Var.d(lzsVar.ordinal()) ? 32 : 16;
        }
        int i10 = i3 & 4;
        if (i10 != 0) {
            i4 = i9 | 384;
            yciVar2 = yciVar;
        } else {
            yciVar2 = yciVar;
            i4 = i9 | (oq5Var.f(yciVar2) ? 256 : 128);
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                o0kVar2 = o0kVar;
                if (oq5Var.f(o0kVar2)) {
                    i8 = 2048;
                    i4 |= i8;
                }
            } else {
                o0kVar2 = o0kVar;
            }
            i8 = 1024;
            i4 |= i8;
        } else {
            o0kVar2 = o0kVar;
        }
        int i11 = i3 & 16;
        if (i11 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            f3 = f2;
            i4 |= oq5Var.c(f3) ? 16384 : RemoteCameraConfig.Notification.ID;
            i5 = i4 | (!oq5Var.g(z) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
            if ((74899 & i5) == 74898 || !oq5Var.z()) {
                oq5Var.U();
                i6 = i2 & 1;
                vci vciVar = vci.a;
                if (i6 != 0 || oq5Var.y()) {
                    if (i10 != 0) {
                        yciVar2 = vciVar;
                    }
                    if ((i3 & 8) != 0) {
                        float f5 = 12;
                        i5 &= -7169;
                        o0kVar2 = new q0k(16, f5, 0, f5);
                    }
                    if (i11 != 0) {
                        f3 = 52;
                    }
                } else {
                    oq5Var.S();
                    if ((i3 & 8) != 0) {
                        i5 &= -7169;
                    }
                }
                int i12 = i5;
                o0k o0kVar5 = o0kVar2;
                float f6 = f3;
                oq5Var.q();
                yci D = ksw.D(androidx.compose.ui.platform.a.a(d.m(a.l(yciVar2, o0kVar5), f6), "track_cover"), null, null);
                kfh d2 = ug3.d(b2c.f, false);
                i7 = oq5Var.P;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                yci H = vnj.H(oq5Var, D);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, d2, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                    ouj.x(i7, oq5Var, i7, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                if (z) {
                    o0kVar3 = o0kVar5;
                    z2 = true;
                    oq5Var.Z(925687089);
                    qo6 qo6Var = qo6.a;
                    yci b2 = b.a.b(vciVar);
                    lzs lzsVar2 = lzs.a;
                    irf.y(str, qo6Var, b2, lzsVar != lzsVar2, false, null, null, null, oq5Var, (i12 & 14) | 48, 240);
                    oq5Var = oq5Var;
                    if (lzsVar != lzsVar2) {
                        oq5Var.Z(925994299);
                        orl.a(0, 6, 0L, oq5Var, null, lzsVar == lzs.b);
                    } else {
                        oq5Var.Z(919762059);
                    }
                    oq5Var.p(false);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(925371416);
                    qo6 qo6Var2 = qo6.a;
                    o0kVar3 = o0kVar5;
                    z2 = true;
                    swf.d(qo6Var2, gce.d, androidx.compose.ui.platform.a.a(xp3.u(vciVar, irf.R(qo6Var2, oq5Var)), "track_image_placeholder"), null, 0L, 0L, false, oq5Var, 54, 120);
                    oq5Var = oq5Var;
                    oq5Var.p(false);
                }
                oq5Var.p(z2);
                yci yciVar4 = yciVar2;
                f4 = f6;
                yciVar3 = yciVar4;
                o0kVar4 = o0kVar3;
            } else {
                oq5Var.S();
                yciVar3 = yciVar2;
                o0kVar4 = o0kVar2;
                f4 = f3;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new mo6(str, lzsVar, yciVar3, o0kVar4, f4, z, i2, i3);
                return;
            }
            return;
        }
        f3 = f2;
        i5 = i4 | (!oq5Var.g(z) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if ((74899 & i5) == 74898) {
        }
        oq5Var.U();
        i6 = i2 & 1;
        vci vciVar2 = vci.a;
        if (i6 != 0) {
        }
        if (i10 != 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if (i11 != 0) {
        }
        int i122 = i5;
        o0k o0kVar52 = o0kVar2;
        float f62 = f3;
        oq5Var.q();
        yci D2 = ksw.D(androidx.compose.ui.platform.a.a(d.m(a.l(yciVar2, o0kVar52), f62), "track_cover"), null, null);
        kfh d22 = ug3.d(b2c.f, false);
        i7 = oq5Var.P;
        androidx.compose.runtime.internal.a l2 = oq5Var.l();
        yci H2 = vnj.H(oq5Var, D2);
        xp5.T.getClass();
        grb grbVar2 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, d22, wp5.f);
        g0g.U(oq5Var, l2, wp5.e);
        kb5 kb5Var2 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i7, oq5Var, i7, kb5Var2);
        g0g.U(oq5Var, H2, wp5.d);
        if (z) {
        }
        oq5Var.p(z2);
        yci yciVar42 = yciVar2;
        f4 = f62;
        yciVar3 = yciVar42;
        o0kVar4 = o0kVar3;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final pn0 s(c cVar, Function1 function1) {
        cVar.getClass();
        function1.getClass();
        kn0 kn0Var = new kn0();
        function1.invoke(kn0Var);
        return new pn0(cVar.d(), cVar.c(), new nim(kn0Var.h(), "…"), 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0102, code lost:
    
        if (r2 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0148, code lost:
    
        if (defpackage.i4w.z(r7, r8) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0127, code lost:
    
        if (defpackage.xp3.B(r1.b, r2.b) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0142, code lost:
    
        if (defpackage.xp3.B(((defpackage.lg9) r1).b.a, ((defpackage.lg9) r2).b.a) != false) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean t(mo8 mo8Var, mo8 mo8Var2) {
        if (mo8Var == null) {
            return mo8Var2 == null;
        }
        if (!(mo8Var instanceof lo8)) {
            if (mo8Var instanceof ho8) {
                k29 k29Var = ((ho8) mo8Var).b;
                List list = k29Var.d;
                if (list == null) {
                    list = c5b.a;
                }
                if (mo8Var2 instanceof ho8) {
                    szb szbVar = k29Var.a;
                    k29 k29Var2 = ((ho8) mo8Var2).b;
                    if (xp3.B(szbVar, k29Var2.a) && xp3.B(k29Var.b, k29Var2.b) && xp3.B(k29Var.c, k29Var2.c)) {
                        List list2 = k29Var2.d;
                        if (list2 == null) {
                            list2 = c5b.a;
                        }
                        if (list.size() == list2.size()) {
                            Iterator it = list.iterator();
                            int i2 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    if (!xp3.B(k29Var.e, k29Var2.e) || !xp3.B(k29Var.f, k29Var2.f) || !xp3.B(k29Var.g, k29Var2.g)) {
                                        break;
                                    }
                                    return true;
                                }
                                Object next = it.next();
                                int i3 = i2 + 1;
                                if (i2 < 0) {
                                    u75.n();
                                    throw null;
                                }
                                if (!x((hy8) next, (hy8) list2.get(i2))) {
                                    break;
                                }
                                i2 = i3;
                            }
                        }
                    }
                }
            } else if (mo8Var instanceof io8) {
                if (mo8Var2 instanceof io8) {
                    g89 g89Var = ((io8) mo8Var).b;
                    szb szbVar2 = g89Var.a;
                    g89 g89Var2 = ((io8) mo8Var2).b;
                    if (!xp3.B(szbVar2, g89Var2.a) || !i4w.y(g89Var, g89Var2)) {
                        break;
                    }
                    return true;
                }
            } else if (mo8Var instanceof ko8) {
                if (mo8Var2 instanceof ko8) {
                    of9 of9Var = ((ko8) mo8Var).b;
                    rf9 rf9Var = of9Var.a;
                    of9 of9Var2 = ((ko8) mo8Var2).b;
                    if (i4w.E(rf9Var, of9Var2.a) && i4w.E(of9Var.b, of9Var2.b)) {
                        mg9 mg9Var = of9Var.e;
                        mg9 mg9Var2 = of9Var2.e;
                        if (mg9Var != null) {
                            if (mg9Var instanceof kg9) {
                                if (mg9Var2 instanceof kg9) {
                                    jz8 jz8Var = ((kg9) mg9Var).b;
                                    szb szbVar3 = jz8Var.a;
                                    jz8 jz8Var2 = ((kg9) mg9Var2).b;
                                    if (xp3.B(szbVar3, jz8Var2.a)) {
                                    }
                                }
                            } else {
                                if (!(mg9Var instanceof lg9)) {
                                    b6e.s();
                                    return false;
                                }
                                if (mg9Var2 instanceof lg9) {
                                }
                            }
                        }
                    }
                }
            } else {
                if (!(mo8Var instanceof jo8)) {
                    b6e.s();
                    return false;
                }
                if (mo8Var2 instanceof jo8) {
                    l99 l99Var = ((jo8) mo8Var).b;
                    szb szbVar4 = l99Var.a;
                    l99 l99Var2 = ((jo8) mo8Var2).b;
                    if (xp3.B(szbVar4, l99Var2.a)) {
                        kc8 kc8Var = l99Var.b;
                        kc8 kc8Var2 = l99Var2.b;
                        if (kc8Var == null && kc8Var2 == null) {
                            return true;
                        }
                        if (xp3.B(kc8Var != null ? kc8Var.b : null, kc8Var2 != null ? kc8Var2.b : null)) {
                            if (xp3.B(kc8Var != null ? kc8Var.d : null, kc8Var2 != null ? kc8Var2.d : null)) {
                                if (xp3.B(kc8Var != null ? kc8Var.c : null, kc8Var2 != null ? kc8Var2.c : null)) {
                                    if (xp3.B(kc8Var != null ? kc8Var.a : null, kc8Var2 != null ? kc8Var2.a : null)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if ((mo8Var2 instanceof lo8) && xp3.B(((lo8) mo8Var).b.a, ((lo8) mo8Var2).b.a)) {
            return true;
        }
        return false;
    }

    public static final boolean u(ow8 ow8Var, ow8 ow8Var2) {
        if (ow8Var == null && ow8Var2 == null) {
            return true;
        }
        if (xp3.B(ow8Var != null ? ow8Var.a : null, ow8Var2 != null ? ow8Var2.a : null)) {
            return xp3.B(ow8Var != null ? ow8Var.b : null, ow8Var2 != null ? ow8Var2.b : null);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        if (r2 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009b, code lost:
    
        if (B(r5.c, r6.c) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        if (y(r1.b, r2.b) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
    
        if (y(r1.b, r2.b) != false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean v(dx8 dx8Var, dx8 dx8Var2) {
        if (dx8Var == null) {
            return dx8Var2 == null;
        }
        lj9 lj9Var = dx8Var.b;
        if (dx8Var2 != null) {
            lj9 lj9Var2 = dx8Var2.b;
            if (xp3.B(lj9Var.a, lj9Var2.a)) {
                kj9 kj9Var = lj9Var.b;
                kj9 kj9Var2 = lj9Var2.b;
                if (kj9Var != null) {
                    if (kj9Var instanceof jj9) {
                        if (kj9Var2 instanceof jj9) {
                            qh9 qh9Var = ((jj9) kj9Var).b;
                            szb szbVar = qh9Var.a;
                            qh9 qh9Var2 = ((jj9) kj9Var2).b;
                            if (xp3.B(szbVar, qh9Var2.a)) {
                                if (B(qh9Var.e, qh9Var2.e)) {
                                    if (y(qh9Var.d, qh9Var2.d)) {
                                        if (y(qh9Var.c, qh9Var2.c)) {
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (!(kj9Var instanceof ij9)) {
                            b6e.s();
                            return false;
                        }
                        if (kj9Var2 instanceof ij9) {
                            zq8 zq8Var = ((ij9) kj9Var).b;
                            szb szbVar2 = zq8Var.a;
                            zq8 zq8Var2 = ((ij9) kj9Var2).b;
                            if (xp3.B(szbVar2, zq8Var2.a)) {
                                if (B(zq8Var.c, zq8Var2.c)) {
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean w(ix8 ix8Var, ix8 ix8Var2) {
        if (ix8Var == null && ix8Var2 == null) {
            return true;
        }
        if (!xp3.B(ix8Var != null ? ix8Var.c : null, ix8Var2 != null ? ix8Var2.c : null)) {
            return false;
        }
        if (!xp3.B(ix8Var != null ? ix8Var.f : null, ix8Var2 != null ? ix8Var2.f : null)) {
            return false;
        }
        if (!xp3.B(ix8Var != null ? ix8Var.d : null, ix8Var2 != null ? ix8Var2.d : null)) {
            return false;
        }
        if (!xp3.B(ix8Var != null ? ix8Var.a : null, ix8Var2 != null ? ix8Var2.a : null)) {
            return false;
        }
        if (xp3.B(ix8Var != null ? ix8Var.e : null, ix8Var2 != null ? ix8Var2.e : null)) {
            return xp3.B(ix8Var != null ? ix8Var.b : null, ix8Var2 != null ? ix8Var2.b : null);
        }
        return false;
    }

    public static final boolean x(hy8 hy8Var, hy8 hy8Var2) {
        if (hy8Var == null) {
            return hy8Var2 == null;
        }
        if (hy8Var instanceof gy8) {
            return hy8Var2 instanceof gy8;
        }
        if (hy8Var instanceof fy8) {
            return (hy8Var2 instanceof fy8) && xp3.B(((fy8) hy8Var).b.a, ((fy8) hy8Var2).b.a);
        }
        b6e.s();
        return false;
    }

    public static final boolean y(jz8 jz8Var, jz8 jz8Var2) {
        if (jz8Var == null && jz8Var2 == null) {
            return true;
        }
        if (xp3.B(jz8Var != null ? jz8Var.b : null, jz8Var2 != null ? jz8Var2.b : null)) {
            return xp3.B(jz8Var != null ? jz8Var.a : null, jz8Var2 != null ? jz8Var2.a : null);
        }
        return false;
    }

    public static final boolean z(xd9 xd9Var, xd9 xd9Var2) {
        if (xd9Var == null) {
            return xd9Var2 == null;
        }
        if (xd9Var instanceof vd9) {
            if (xd9Var2 instanceof vd9) {
                yd9 yd9Var = ((vd9) xd9Var).b;
                szb szbVar = yd9Var.b;
                yd9 yd9Var2 = ((vd9) xd9Var2).b;
                if (xp3.B(szbVar, yd9Var2.b) && xp3.B(yd9Var.a, yd9Var2.a)) {
                    return true;
                }
            }
        } else {
            if (!(xd9Var instanceof wd9)) {
                b6e.s();
                return false;
            }
            if ((xd9Var2 instanceof wd9) && xp3.B(((wd9) xd9Var).b.a, ((wd9) xd9Var2).b.a)) {
                return true;
            }
        }
        return false;
    }

    public Object F(int i2) {
        dxe z = G().z(i2);
        return z.c.getType().invoke(Integer.valueOf(i2 - z.a));
    }

    public abstract x0 G();

    public Object H(int i2) {
        Object invoke;
        dxe z = G().z(i2);
        int i3 = i2 - z.a;
        Function1 key = z.c.getKey();
        return (key == null || (invoke = key.invoke(Integer.valueOf(i3))) == null) ? new wn7(i2) : invoke;
    }
}
