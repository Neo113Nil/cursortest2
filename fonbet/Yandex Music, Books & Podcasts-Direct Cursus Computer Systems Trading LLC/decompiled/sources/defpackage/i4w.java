package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.work.impl.WorkDatabase;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.yandex.music.shared.dto.playlist.chart.ChartPositionInfoDto;
import com.yandex.music.shared.utils.ThrowablesKt;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.security.cert.CertPathValidatorException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.crypto.BadPaddingException;
import javax.net.ssl.SSLException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public abstract class i4w {
    public static final wn5 a = new wn5(new h3(20), 1994375056, false);
    public static final wn5 b = new wn5(new jo5(17), -230331378, false);
    public static final wn5 c = new wn5(new ro5(24), -1179254389, false);
    public static final wn5 d = new wn5(new ro5(25), -622633508, false);
    public static final wn5 e;
    public static final wn5 f;
    public static final wn5 g;
    public static final wn5 h;
    public static final wn5 i;
    public static final wn5 j;
    public static final wn5 k;
    public static final wn5 l;
    public static final wn5 m;
    public static final wn5 n;
    public static final jkv o;
    public static final jkv p;
    public static final jkv q;
    public static final jkv r;
    public static final float[] s;
    public static final Object t;
    public static final Object u;
    public static boolean v;
    public static long w;

    static {
        int i2 = 26;
        e = new wn5(new ro5(i2), -1190605731, false);
        int i3 = 27;
        new wn5(new ro5(i3), 2120969302, false);
        int i4 = 29;
        f = new wn5(new dp5(i4), -980389019, false);
        g = new wn5(new rz3(i2), 247472232, false);
        h = new wn5(new ep5(3), 813347198, false);
        i = new wn5(new ep5(4), -509018312, false);
        j = new wn5(new rz3(i3), 308405404, false);
        k = new wn5(new ep5(5), 572063151, false);
        l = new wn5(new rz3(28), -1426240332, false);
        m = new wn5(new rz3(i4), -262659147, false);
        n = new wn5(new fp5(0), -1333907789, false);
        o = new jkv(0.31006f, 0.31616f);
        p = new jkv(0.34567f, 0.3585f);
        q = new jkv(0.32168f, 0.33767f);
        r = new jkv(0.31271f, 0.32902f);
        s = new float[]{0.964212f, 1.0f, 0.825188f};
        t = new Object();
        u = new Object();
    }

    public static final boolean A(Collection collection, Collection collection2, Function2 function2) {
        collection.getClass();
        if (collection == collection2) {
            return true;
        }
        if (collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        Iterator it = collection.iterator();
        Iterator it2 = collection2.iterator();
        do {
            boolean hasNext = it.hasNext();
            if (hasNext != it2.hasNext()) {
                return false;
            }
            if (!hasNext) {
                return true;
            }
        } while (((Boolean) function2.invoke(it.next(), it2.next())).booleanValue());
        return false;
    }

    public static final g4w B(Context context, r46 r46Var) {
        seo A;
        context.getClass();
        j4w j4wVar = new j4w(r46Var.c);
        final Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        qhp qhpVar = j4wVar.a;
        qhpVar.getClass();
        z7l z7lVar = r46Var.d;
        boolean z = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        z7lVar.getClass();
        if (z) {
            A = new seo(applicationContext, WorkDatabase.class, null);
            A.i = true;
        } else {
            A = hyf.A(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            A.h = new usr() { // from class: t3w
                @Override // defpackage.usr
                public final vsr create(tsr tsrVar) {
                    String str = tsrVar.b;
                    ssr ssrVar = tsrVar.c;
                    ssrVar.getClass();
                    if (str != null && str.length() != 0) {
                        return new fwc(applicationContext, str, ssrVar, true, true);
                    }
                    xq0.x("Must set a non-null database name to a configuration that uses the no backup directory.");
                    return null;
                }
            };
        }
        A.f = qhpVar;
        A.d.add(new wm4(z7lVar));
        A.a(g5h.B);
        A.a(new m1o(applicationContext, 2, 3));
        A.a(g5h.C);
        A.a(g5h.D);
        A.a(new m1o(applicationContext, 5, 6));
        A.a(g5h.E);
        A.a(g5h.F);
        A.a(g5h.G);
        A.a(new m1o(applicationContext));
        A.a(new m1o(applicationContext, 10, 11));
        A.a(g5h.x);
        A.a(g5h.y);
        A.a(g5h.z);
        A.a(g5h.A);
        A.a(new m1o(applicationContext, 21, 22));
        A.q = false;
        A.r = true;
        A.s = true;
        WorkDatabase workDatabase = (WorkDatabase) A.b();
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        l2t l2tVar = new l2t(applicationContext2, j4wVar);
        htm htmVar = new htm(context.getApplicationContext(), r46Var, j4wVar, workDatabase);
        return new g4w(context.getApplicationContext(), r46Var, j4wVar, workDatabase, (List) h4w.a.b(context, r46Var, j4wVar, workDatabase, l2tVar, htmVar), htmVar, l2tVar);
    }

    public static final Object C(i5f i5fVar, t9f t9fVar, InputStream inputStream) {
        t9fVar.getClass();
        inputStream.getClass();
        mka mkaVar = new mka(inputStream);
        le4 le4Var = (le4) mkaVar.a;
        try {
            bkn bknVar = new bkn(mkaVar, sd4.c.d(16384));
            try {
                Object e2 = new wjr(i5fVar, j6w.c, bknVar, t9fVar.getDescriptor(), null).e(t9fVar);
                bknVar.o();
                bknVar.I();
                return e2;
            } catch (Throwable th) {
                bknVar.I();
                throw th;
            }
        } finally {
            le4Var.getClass();
            fm3 fm3Var = fm3.c;
            byte[] array = le4Var.c.array();
            array.getClass();
            fm3Var.getClass();
            fm3Var.a(array);
        }
    }

    public static final void D(i5f i5fVar, t9f t9fVar, Object obj, OutputStream outputStream) {
        t9fVar.getClass();
        anx anxVar = new anx();
        anxVar.b = outputStream;
        anxVar.c = gm3.c.c(RemoteCameraConfig.Mic.BUFFER_SIZE);
        anxVar.d = rd4.c.d(128);
        byte[] bArr = (byte[]) anxVar.c;
        try {
            wdp.f0(i5fVar, anxVar, t9fVar, obj);
        } finally {
            anxVar.v();
            rd4 rd4Var = rd4.c;
            char[] cArr = (char[]) anxVar.d;
            rd4Var.getClass();
            cArr.getClass();
            rd4Var.b(cArr);
            gm3 gm3Var = gm3.c;
            gm3Var.getClass();
            bArr.getClass();
            gm3Var.a(bArr);
        }
    }

    public static final boolean E(rf9 rf9Var, rf9 rf9Var2) {
        if (rf9Var == null) {
            return rf9Var2 == null;
        }
        if (rf9Var instanceof pf9) {
            if (rf9Var2 instanceof pf9) {
                ag9 ag9Var = ((pf9) rf9Var).b;
                szb szbVar = ag9Var.a;
                ag9 ag9Var2 = ((pf9) rf9Var2).b;
                if (xp3.B(szbVar, ag9Var2.a) && xp3.B(ag9Var.b, ag9Var2.b)) {
                    return true;
                }
            }
        } else {
            if (!(rf9Var instanceof qf9)) {
                b6e.s();
                return false;
            }
            if ((rf9Var2 instanceof qf9) && xp3.B(((qf9) rf9Var).b.a, ((qf9) rf9Var2).b.a)) {
                return true;
            }
        }
        return false;
    }

    public static final int F(int i2, ttf ttfVar, Object obj) {
        int d2;
        return (obj == null || ttfVar.a() == 0 || (i2 < ttfVar.a() && obj.equals(ttfVar.e(i2))) || (d2 = ttfVar.d(obj)) == -1) ? i2 : d2;
    }

    public static char G(int i2) {
        char c2 = (char) (i2 < 10 ? i2 + 48 : ((char) (i2 + 97)) - '\n');
        return Character.isLetter(c2) ? (char) (c2 - ' ') : c2;
    }

    public static final long H(w4k w4kVar, jd6 jd6Var, long j2) {
        long f2 = jd6Var.f(w4kVar.i(), j2);
        return a4g.i(sso.a(f2) * nmq.d(w4kVar.i()), sso.b(f2) * nmq.b(w4kVar.i()));
    }

    public static final zt3 J(Continuation continuation) {
        zt3 zt3Var;
        zt3 zt3Var2;
        if (!(continuation instanceof v98)) {
            return new zt3(1, continuation);
        }
        v98 v98Var = (v98) continuation;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v98.h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(v98Var);
            zt3Var = null;
            js3 js3Var = w98.b;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(v98Var, js3Var);
                zt3Var2 = null;
                break;
            }
            if (obj instanceof zt3) {
                while (!atomicReferenceFieldUpdater.compareAndSet(v98Var, obj, js3Var)) {
                    if (atomicReferenceFieldUpdater.get(v98Var) != obj) {
                        break;
                    }
                }
                zt3Var2 = (zt3) obj;
                break loop0;
            }
            if (obj != js3Var && !(obj instanceof Throwable)) {
                b6e.l(obj, "Inconsistent state ");
                return null;
            }
        }
        if (zt3Var2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = zt3.g;
            Object obj2 = atomicReferenceFieldUpdater2.get(zt3Var2);
            if (!(obj2 instanceof qm5) || ((qm5) obj2).d == null) {
                zt3.f.set(zt3Var2, 536870911);
                atomicReferenceFieldUpdater2.set(zt3Var2, fh.a);
                zt3Var = zt3Var2;
            } else {
                zt3Var2.n();
            }
            if (zt3Var != null) {
                return zt3Var;
            }
        }
        return new zt3(2, continuation);
    }

    public static final boolean K(rf9 rf9Var) {
        if (rf9Var == null) {
            return true;
        }
        if (rf9Var instanceof pf9) {
            ag9 ag9Var = ((pf9) rf9Var).b;
            return (ag9Var.a instanceof ozb) && (ag9Var.b instanceof ozb);
        }
        if (rf9Var instanceof qf9) {
            return ((qf9) rf9Var).b.a instanceof ozb;
        }
        b6e.s();
        return false;
    }

    public static final boolean L(List list) {
        if (list != null) {
            List<f89> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return true;
            }
            for (f89 f89Var : list2) {
                if (f89Var != null && (!(f89Var.a instanceof ozb) || !(f89Var.b instanceof ozb))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean M(Throwable th) {
        th.getClass();
        for (Throwable th2 : ThrowablesKt.meAndCauses(th)) {
            if ((th2 instanceof SocketTimeoutException) || (th2 instanceof UnknownHostException) || (th2 instanceof SocketException) || (th2 instanceof EOFException) || (th2 instanceof SSLException) || (th2 instanceof ProtocolException) || (th2 instanceof CertPathValidatorException) || (th2 instanceof BadPaddingException)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean N(List list) {
        if (list != null) {
            List<nf9> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return true;
            }
            for (nf9 nf9Var : list2) {
                if (nf9Var != null && (!(nf9Var.a instanceof ozb) || !(nf9Var.b instanceof ozb))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final void O(ImageView imageView, co6 co6Var, int i2) {
        imageView.getClass();
        co6Var.getClass();
        Context context = imageView.getContext();
        context.getClass();
        pce X = X(co6Var, context, i2);
        X.f(imageView);
        rce a2 = X.a();
        l18 l18Var = l18.b;
        bdt I = hag.I(cce.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        ((cce) qdcVar.C(I)).d(a2);
    }

    public static long R(int i2, byte[] bArr) {
        int i3 = bArr[i2];
        int i4 = bArr[i2 + 1];
        int i5 = bArr[i2 + 2];
        int i6 = bArr[i2 + 3];
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        if ((i6 & 128) == 128) {
            i6 = (i6 & 127) + 128;
        }
        return (i3 << 24) + (i4 << 16) + (i5 << 8) + i6;
    }

    public static long S(int i2, byte[] bArr) {
        long R = R(i2, bArr);
        long R2 = R(i2 + 4, bArr);
        if (R == 0 && R2 == 0) {
            return 0L;
        }
        return ((R2 * 1000) / 4294967296L) + ((R - 2208988800L) * 1000);
    }

    public static boolean T(char c2) {
        if ('a' <= c2 && c2 < '{') {
            return false;
        }
        if ('A' > c2 || c2 >= '[') {
            return (('0' <= c2 && c2 < ':') || c2 == ' ' || c2 == '_' || c2 == '.') ? false : true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r3.equals("same") == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final jf4 U(ChartPositionInfoDto chartPositionInfoDto) {
        Integer position = chartPositionInfoDto.getPosition();
        mf4 mf4Var = null;
        if (position == null) {
            return null;
        }
        int intValue = position.intValue();
        String progress = chartPositionInfoDto.getProgress();
        if (progress != null) {
            int hashCode = progress.hashCode();
            tno tnoVar = tno.a;
            if (hashCode == 3739) {
                if (progress.equals("up")) {
                    Integer shift = chartPositionInfoDto.getShift();
                    if (shift != null) {
                        int intValue2 = shift.intValue();
                        if (intValue2 != 0) {
                            mf4Var = new umt(intValue2);
                        }
                        mf4Var = tnoVar;
                    }
                }
                su4.s(2, null, f1d.g("Unknown chart progress type ", chartPositionInfoDto.getProgress()), null);
            } else if (hashCode == 108960) {
                if (progress.equals("new")) {
                    mf4Var = u2j.a;
                }
                su4.s(2, null, f1d.g("Unknown chart progress type ", chartPositionInfoDto.getProgress()), null);
            } else if (hashCode != 3089570) {
                if (hashCode == 3522662) {
                }
                su4.s(2, null, f1d.g("Unknown chart progress type ", chartPositionInfoDto.getProgress()), null);
            } else {
                if (progress.equals("down")) {
                    Integer shift2 = chartPositionInfoDto.getShift();
                    if (shift2 != null) {
                        int intValue3 = shift2.intValue();
                        if (intValue3 != 0) {
                            mf4Var = new t9a(intValue3);
                        }
                        mf4Var = tnoVar;
                    }
                }
                su4.s(2, null, f1d.g("Unknown chart progress type ", chartPositionInfoDto.getProgress()), null);
            }
        }
        return new jf4(intValue, mf4Var);
    }

    public static final la5 V(g89 g89Var, xzb xzbVar) {
        ArrayList arrayList;
        List list = g89Var.b;
        if (list != null) {
            List<f89> list2 = list;
            arrayList = new ArrayList(v75.o(list2, 10));
            for (f89 f89Var : list2) {
                arrayList.add(new Pair(f89Var.a.a(xzbVar), Float.valueOf((float) ((Number) f89Var.b.a(xzbVar)).doubleValue())));
            }
        } else {
            arrayList = null;
        }
        vzb vzbVar = g89Var.c;
        return r(arrayList, vzbVar != null ? vzbVar.a(xzbVar) : null);
    }

    public static final la5 W(of9 of9Var, xzb xzbVar) {
        ArrayList arrayList;
        List list = of9Var.c;
        if (list != null) {
            List<nf9> list2 = list;
            arrayList = new ArrayList(v75.o(list2, 10));
            for (nf9 nf9Var : list2) {
                arrayList.add(new Pair(nf9Var.a.a(xzbVar), Float.valueOf((float) ((Number) nf9Var.b.a(xzbVar)).doubleValue())));
            }
        } else {
            arrayList = null;
        }
        vzb vzbVar = of9Var.d;
        return r(arrayList, vzbVar != null ? vzbVar.a(xzbVar) : null);
    }

    public static final pce X(co6 co6Var, Context context, int i2) {
        co6Var.getClass();
        context.getClass();
        qo6 qo6Var = co6Var.b;
        return n7w.d0(co6Var, context, i2, to6.c(qo6Var, context), to6.a(qo6Var, context));
    }

    public static final hag Y(rf9 rf9Var, DisplayMetrics displayMetrics, xzb xzbVar) {
        if (rf9Var instanceof pf9) {
            ag9 ag9Var = ((pf9) rf9Var).b;
            return new bfn(bg3.i0(((Number) ag9Var.b.a(xzbVar)).longValue(), (jk9) ag9Var.a.a(xzbVar), displayMetrics));
        }
        if (rf9Var instanceof qf9) {
            return new cfn((float) ((Number) ((qf9) rf9Var).b.a.a(xzbVar)).doubleValue());
        }
        b6e.s();
        return null;
    }

    public static final pcg Z(mg9 mg9Var, DisplayMetrics displayMetrics, xzb xzbVar) {
        if (mg9Var instanceof kg9) {
            return new efn(bg3.j0(((kg9) mg9Var).b, displayMetrics, xzbVar));
        }
        if (!(mg9Var instanceof lg9)) {
            b6e.s();
            return null;
        }
        int ordinal = ((yg9) ((lg9) mg9Var).b.a.a(xzbVar)).ordinal();
        int i2 = 1;
        if (ordinal != 0) {
            if (ordinal != 1) {
                i2 = 3;
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        b6e.s();
                        return null;
                    }
                    i2 = 4;
                }
            } else {
                i2 = 2;
            }
        }
        return new ffn(i2);
    }

    public static final void a(fz fzVar, tmb tmbVar, hq5 hq5Var, int i2) {
        boolean z;
        r00 r00Var;
        boolean z2;
        boolean z3;
        fz fzVar2 = fzVar;
        fzVar2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(214044927);
        int i3 = (oq5Var.h(fzVar2) ? 4 : 2) | i2 | (oq5Var.h(tmbVar) ? 32 : 16);
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            vdr vdrVar = fzVar2.l;
            xdr xdrVar = fzVar2.m;
            r00 r00Var2 = (r00) szf.Q(vdrVar, oq5Var).getValue();
            mud O = vnj.O(bcb.a(oq5Var), (dud) szf.Q(fzVar2.k, oq5Var).getValue(), oq5Var);
            boolean z4 = r00Var2 instanceof m00;
            ogp.g.e(r00Var2 instanceof k00, z4, null, oq5Var, 4096, 4);
            kjn kjnVar = gq5.a;
            if (z4) {
                oq5Var.Z(-1413253437);
                float e2 = zs4.e(oq5Var);
                vci vciVar = vci.a;
                yci c2 = d.c(a.q(vciVar, 0.0f, 0.0f, 0.0f, e2, 7), 1.0f);
                kfh d2 = ug3.d(b2c.b, false);
                int i4 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H = vnj.H(oq5Var, c2);
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
                boolean h2 = oq5Var.h(fzVar2);
                Object K = oq5Var.K();
                if (h2 || K == kjnVar) {
                    z2 = true;
                    z3 = false;
                    c3 c3Var = new c3(0, fzVar2, fz.class, "onBackClick", "onBackClick()V", 0, 20);
                    oq5Var.k0(c3Var);
                    K = c3Var;
                } else {
                    z2 = true;
                    z3 = false;
                }
                Function0 function0 = (Function0) ((h9f) K);
                boolean h3 = oq5Var.h(fzVar2);
                Object K2 = oq5Var.K();
                if (h3 || K2 == kjnVar) {
                    c3 c3Var2 = new c3(0, fzVar2, fz.class, "onSearchClick", "onSearchClick()V", 0, 21);
                    oq5Var.k0(c3Var2);
                    K2 = c3Var2;
                }
                Function0 function02 = (Function0) ((h9f) K2);
                boolean h4 = oq5Var.h(fzVar2);
                Object K3 = oq5Var.K();
                if (h4 || K3 == kjnVar) {
                    c3 c3Var3 = new c3(0, fzVar2, fz.class, "onOverflowClick", "onOverflowClick()V", 0, 22);
                    oq5Var.k0(c3Var3);
                    K3 = c3Var3;
                }
                tt0.l("", O, function0, function02, (Function0) ((h9f) K3), d.d(vciVar, 1.0f), oq5Var, 196614);
                oq5Var.p(z2);
                oq5Var.p(z3);
                fzVar2 = fzVar;
            } else if (r00Var2 instanceof o00) {
                oq5Var.Z(-1412545242);
                boolean booleanValue = ((Boolean) szf.Q(xdrVar, oq5Var).getValue()).booleanValue();
                boolean h5 = oq5Var.h(fzVar2);
                Object K4 = oq5Var.K();
                if (h5 || K4 == kjnVar) {
                    r00Var = r00Var2;
                    c3 c3Var4 = new c3(0, fzVar2, fz.class, "onRefresh", "onRefresh()V", 0, 23);
                    oq5Var.k0(c3Var4);
                    K4 = c3Var4;
                } else {
                    r00Var = r00Var2;
                }
                bcx.j(booleanValue, (Function0) ((h9f) K4), ild.C(-23512019, new x3(8, fzVar2, (o00) r00Var, O), oq5Var), oq5Var, 384);
                oq5Var.p(false);
            } else if (r00Var2 instanceof p00) {
                oq5Var.Z(-1410840211);
                boolean booleanValue2 = ((Boolean) szf.Q(xdrVar, oq5Var).getValue()).booleanValue();
                boolean h6 = oq5Var.h(fzVar2);
                Object K5 = oq5Var.K();
                if (h6 || K5 == kjnVar) {
                    z = booleanValue2;
                    c3 c3Var5 = new c3(0, fzVar2, fz.class, "onRefresh", "onRefresh()V", 0, 24);
                    oq5Var.k0(c3Var5);
                    K5 = c3Var5;
                } else {
                    z = booleanValue2;
                }
                bcx.j(z, (Function0) ((h9f) K5), ild.C(699778414, new x3(9, fzVar2, (p00) r00Var2, O), oq5Var), oq5Var, 384);
                oq5Var.p(false);
            } else if (Intrinsics.d(r00Var2, k00.a)) {
                oq5Var.Z(-1409828650);
                q5g.k(null, null, 0L, 0L, null, 0.0f, ild.C(2088505796, new wy(fzVar2, tmbVar), oq5Var), oq5Var, ScreenMirroringConfig.Video.BITRATE_1_5MB, 63);
                oq5Var = oq5Var;
                oq5Var.p(false);
            } else {
                if (!(r00Var2 instanceof q00)) {
                    throw vz1.i(oq5Var, -461227465, false);
                }
                oq5Var.Z(-1408746409);
                q5g.k(null, null, 0L, 0L, null, 0.0f, ild.C(-1483171067, new xy((q00) r00Var2, fzVar2, 0), oq5Var), oq5Var, ScreenMirroringConfig.Video.BITRATE_1_5MB, 63);
                oq5Var = oq5Var;
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new wy(fzVar2, tmbVar, i2);
        }
    }

    public static final eu7 a0(eu7 eu7Var, ArrayList arrayList, boolean z) {
        eu7Var.getClass();
        if (arrayList.isEmpty()) {
            return eu7Var;
        }
        cu7 cu7Var = eu7Var.a;
        cu7Var.getClass();
        if (!arrayList.isEmpty()) {
            cu7Var = cu7.a(cu7Var, null, CollectionsKt.g0(cu7Var.b, arrayList), 1);
        }
        eu7 a2 = eu7.a(eu7Var, cu7Var, null, 2);
        du7 du7Var = a2.b;
        if (!z) {
            return b0(a2);
        }
        int i2 = du7Var.b;
        cu7 cu7Var2 = a2.a;
        if (Intrinsics.e(i2, cu7Var2.a.getElements().size()) < 0) {
            return a2;
        }
        List list = cu7Var2.b;
        if (!list.isEmpty()) {
            return eu7.a(a2, new cu7(wdp.o0(cu7Var2.a, (mwk) CollectionsKt.Q(list)), CollectionsKt.L(list, 1)), null, 2);
        }
        rj7.g("Recommended elements must not be empty for correction of position out of bounds. position = ".concat(ran.a(du7Var.b)));
        return null;
    }

    public static final void b(xbb xbbVar, twu twuVar, yci yciVar, hq5 hq5Var, int i2) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1610234272);
        int i3 = (oq5Var.h(xbbVar) ? 4 : 2) | i2 | (oq5Var.h(twuVar) ? 32 : 16) | 384;
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            xp3.f(xbbVar, twuVar, null, oq5Var, (i3 & 112) | (i3 & 14) | 8 | 384, 8);
            yciVar2 = vci.a;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new ca1(xbbVar, twuVar, yciVar2, i2, 0);
        }
    }

    public static final eu7 b0(eu7 eu7Var) {
        du7 du7Var = eu7Var.b;
        int i2 = du7Var.a;
        cu7 cu7Var = eu7Var.a;
        if (Intrinsics.e(i2, cu7Var.a.getElements().size()) < 0) {
            return eu7Var;
        }
        List list = cu7Var.b;
        if (!list.isEmpty()) {
            return eu7.a(eu7Var, new cu7(wdp.o0(cu7Var.a, (mwk) CollectionsKt.Q(list)), CollectionsKt.L(list, 1)), null, 2);
        }
        rj7.g("Recommended elements must not be empty for correction of position out of bounds. position = ".concat(ran.a(du7Var.a)));
        return null;
    }

    public static final void c(xbb xbbVar, yci yciVar, hq5 hq5Var, int i2) {
        wn5 wn5Var;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1003912712);
        if ((((oq5Var.h(xbbVar) ? 4 : 2) | i2 | 48) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            wn5 C = ild.C(1911155978, new aa1(xbbVar, 1), oq5Var);
            wn5 C2 = ild.C(-240327157, new aa1(xbbVar, 2), oq5Var);
            String str = xbbVar.c;
            if (str == null) {
                oq5Var.Z(1707676062);
                oq5Var.p(false);
                wn5Var = null;
            } else {
                oq5Var.Z(1707676063);
                wn5 C3 = ild.C(-1292395327, new da1(str, 0), oq5Var);
                oq5Var.p(false);
                wn5Var = C3;
            }
            vci vciVar = vci.a;
            sk3.i(C, C2, wn5Var, androidx.compose.foundation.a.k(vciVar, true, null), null, null, oq5Var, 54, 48);
            yciVar = vciVar;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new ea1(xbbVar, yciVar, i2, 0);
        }
    }

    public static final yci c0(yci yciVar, fuw fuwVar, ai3 ai3Var) {
        yci u2;
        yci c2 = d.c(yciVar, 1.0f);
        yci yciVar2 = vci.a;
        if (fuwVar != null) {
            yci r2 = vnj.r(yciVar2, "com.yandex.music.design.modifiers.zoomable", new Object[0], new aqp(16, fuwVar, new rsw(1), new ztw(fuwVar, null)));
            if (r2 != null) {
                yciVar2 = r2;
            }
        }
        u2 = d.u(c2.f(yciVar2), b2c.l, (r2 & 2) == 0);
        return androidx.compose.ui.draw.a.c(d.d(u2, 1.0f), new at5(25, ai3Var));
    }

    public static final void d(boolean z, sb3 sb3Var, Function0 function0, Function0 function02, hq5 hq5Var, int i2) {
        String str;
        sb3Var.getClass();
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1807355974);
        int i3 = i2 | (oq5Var.g(z) ? 4 : 2) | (oq5Var.f(sb3Var) ? 32 : 16) | (oq5Var.h(function0) ? 256 : 128) | (oq5Var.h(function02) ? 2048 : 1024);
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = R.string.listen;
            if (z) {
                str = vz1.n(oq5Var, -1231601709, R.string.pause, oq5Var, false);
            } else {
                oq5Var.Z(-1231527960);
                if (sb3Var.equals(qb3.a)) {
                    oq5Var.Z(-1231473340);
                    oq5Var.p(false);
                    str = "";
                } else if (sb3Var.equals(qb3.b)) {
                    str = vz1.n(oq5Var, -1702291392, R.string.listen, oq5Var, false);
                } else {
                    if (!(sb3Var instanceof rb3)) {
                        throw vz1.i(oq5Var, -1702294694, false);
                    }
                    oq5Var.Z(-1702288318);
                    oq5Var.p(false);
                    str = ((rb3) sb3Var).a;
                }
                oq5Var.p(false);
            }
            oq5Var.Z(-1702286375);
            StringBuilder sb = new StringBuilder();
            if (z) {
                i4 = R.string.pause;
            }
            sb.append(rvf.M(i4, oq5Var));
            if (!z && (sb3Var instanceof rb3)) {
                sb.append(StringUtil.SPACE + ((rb3) sb3Var).a);
            }
            String sb2 = sb.toString();
            oq5Var.p(false);
            yci t2 = d.t(androidx.compose.ui.platform.a.a(vci.a, "book_playback_button"), ggo.a, 0.0f, 2);
            boolean f2 = oq5Var.f(sb2);
            Object K = oq5Var.K();
            int i5 = 6;
            if (f2 || K == gq5.a) {
                K = new wq(sb2, i5);
                oq5Var.k0(K);
            }
            g0g.m(ild.C(-97249246, new j93(function02, z), oq5Var), str, nfp.b(t2, true, (Function1) K), function0, 0L, 0, oq5Var, ((i3 << 3) & 7168) | 6, 48);
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new s43(z, sb3Var, function0, function02, i2, 1);
        }
    }

    public static final void e(iv5 iv5Var, dib dibVar, yci yciVar, Function1 function1, hq5 hq5Var, int i2) {
        yci f2;
        iv5Var.getClass();
        dibVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-406640381);
        int i3 = i2 | (oq5Var.h(iv5Var) ? 4 : 2) | (oq5Var.h(dibVar) ? 32 : 16) | (oq5Var.h(function1) ? 1048576 : 524288);
        if ((599187 & i3) == 599186 && oq5Var.z()) {
            oq5Var.S();
        } else {
            mv5 mv5Var = (mv5) szf.Q(iv5Var.b, oq5Var).getValue();
            if (Intrinsics.d(mv5Var, jv5.a)) {
                oq5Var.Z(60630515);
                u1g.l(oq5Var, yciVar);
                oq5Var.p(false);
            } else if (Intrinsics.d(mv5Var, kv5.a)) {
                oq5Var.Z(60632307);
                u1g.l(oq5Var, yciVar);
                oq5Var.p(false);
            } else {
                if (!(mv5Var instanceof lv5)) {
                    throw vz1.i(oq5Var, 60628250, false);
                }
                oq5Var.Z(60634816);
                lv5 lv5Var = (lv5) mv5Var;
                oq5Var.Z(60640159);
                if (function1 == null) {
                    f2 = yciVar;
                } else {
                    Object K = oq5Var.K();
                    kjn kjnVar = gq5.a;
                    if (K == kjnVar) {
                        K = vz1.h(oq5Var);
                    }
                    uoi uoiVar = (uoi) K;
                    boolean h2 = oq5Var.h(mv5Var) | oq5Var.f(function1);
                    Object K2 = oq5Var.K();
                    if (h2 || K2 == kjnVar) {
                        K2 = new ap1(29, function1, lv5Var);
                        oq5Var.k0(K2);
                    }
                    f2 = yciVar.f(androidx.compose.foundation.a.d(vci.a, uoiVar, null, false, null, null, (Function0) K2, 28));
                }
                oq5Var.p(false);
                g(lv5Var, dibVar, iv5Var, f2, oq5Var, ((i3 << 6) & 896) | (i3 & 112) | 1794048);
                oq5Var.p(false);
            }
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new av5(i2, 0, iv5Var, dibVar, yciVar, function1);
        }
    }

    public static final void f(zu5 zu5Var, hs1 hs1Var, fuw fuwVar, yci yciVar, hq5 hq5Var, int i2) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-769191107);
        int i3 = i2 | (oq5Var.f(zu5Var) ? 4 : 2) | (oq5Var.f(hs1Var) ? 32 : 16) | (oq5Var.g(true) ? 256 : 128);
        d51 d51Var = hd6.a;
        int i4 = i3 | (oq5Var.f(d51Var) ? 2048 : 1024) | (oq5Var.f(fuwVar) ? 16384 : RemoteCameraConfig.Notification.ID) | 196608;
        if ((74899 & i4) == 74898 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            vci vciVar = vci.a;
            yci a2 = androidx.compose.ui.platform.a.a(vciVar, "concert_gallery_photo");
            p0d p0dVar = zu5Var.a;
            String str = p0dVar.b;
            String str2 = p0dVar.a;
            oq5Var.Z(-1321180368);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = h01.c;
                oq5Var.k0(K);
            }
            oq5Var.p(false);
            j(str, str2, hs1Var, d51Var, fuwVar, a2, (Function1) K, null, oq5Var, ((i4 << 3) & 896) | (i4 & 7168) | (i4 & 57344), 128);
            yciVar2 = vciVar;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new av5(zu5Var, hs1Var, fuwVar, yciVar2, i2, 1);
        }
    }

    public static final void g(lv5 lv5Var, dib dibVar, iv5 iv5Var, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1345599914);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var2.f(lv5Var) : oq5Var2.h(lv5Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.h(dibVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var2.h(iv5Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var2.f(yciVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var2.g(false) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        boolean z = true;
        if ((196608 & i2) == 0) {
            i3 |= oq5Var2.g(true) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i2) == 0) {
            i3 |= oq5Var2.f(hd6.a) ? 1048576 : 524288;
        }
        if ((599187 & i3) == 599186 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            int i4 = lv5Var.a;
            int i5 = i3 & 14;
            boolean z2 = i5 == 4 || ((i3 & 8) != 0 && oq5Var2.h(lv5Var));
            Object K = oq5Var2.K();
            Object obj = gq5.a;
            if (z2 || K == obj) {
                K = new r25(11, lv5Var);
                oq5Var2.k0(K);
            }
            fp7 b2 = r3k.b(i4, (Function0) K, oq5Var2, 0, 2);
            hs1 J = up6.J(oq5Var2);
            boolean h2 = oq5Var2.h(dibVar) | oq5Var2.f(J);
            Object K2 = oq5Var2.K();
            Continuation continuation = null;
            if (h2 || K2 == obj) {
                K2 = new ev5(dibVar, J, continuation, 0);
                oq5Var2.k0(K2);
            }
            gld.w(oq5Var2, dibVar, (Function2) K2);
            Integer valueOf = Integer.valueOf(lv5Var.c);
            boolean f2 = oq5Var2.f(b2);
            if (i5 != 4 && ((i3 & 8) == 0 || !oq5Var2.h(lv5Var))) {
                z = false;
            }
            boolean z3 = f2 | z;
            Object K3 = oq5Var2.K();
            if (z3 || K3 == obj) {
                K3 = new vv4(b2, lv5Var, continuation, 10);
                oq5Var2.k0(K3);
            }
            gld.w(oq5Var2, valueOf, (Function2) K3);
            Integer valueOf2 = Integer.valueOf(b2.j());
            boolean h3 = oq5Var2.h(iv5Var) | oq5Var2.f(b2);
            Object K4 = oq5Var2.K();
            if (h3 || K4 == obj) {
                K4 = new fv5(iv5Var, b2, continuation, 0);
                oq5Var2.k0(K4);
            }
            gld.w(oq5Var2, valueOf2, (Function2) K4);
            Integer valueOf3 = Integer.valueOf(b2.q());
            boolean h4 = oq5Var2.h(iv5Var) | oq5Var2.f(b2);
            Object K5 = oq5Var2.K();
            if (h4 || K5 == obj) {
                K5 = new fv5(iv5Var, b2, continuation, 1);
                oq5Var2.k0(K5);
            }
            gld.w(oq5Var2, valueOf3, (Function2) K5);
            Unit unit = Unit.a;
            boolean f3 = oq5Var2.f(b2) | oq5Var2.h(iv5Var);
            Object K6 = oq5Var2.K();
            if (f3 || K6 == obj) {
                K6 = new vv4(b2, iv5Var, continuation, 11);
                oq5Var2.k0(K6);
            }
            gld.w(oq5Var2, unit, (Function2) K6);
            yci a2 = androidx.compose.ui.platform.a.a(yciVar, "concert_gallery");
            boolean z4 = lv5Var.f;
            Object K7 = oq5Var2.K();
            if (K7 == obj) {
                K7 = new uv1(15);
                oq5Var2.k0(K7);
            }
            oq5Var = oq5Var2;
            rvf.b(b2, a2, null, null, 5, 0.0f, null, null, z4, (Function1) K7, null, null, ild.C(528897140, new fb1(5, lv5Var, b2, J), oq5Var2), oq5Var, 24576, 3078, 6892);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new uu(i2, 22, lv5Var, dibVar, iv5Var, yciVar);
        }
    }

    public static final void h(zg6 zg6Var, yci yciVar, hq5 hq5Var, int i2) {
        zg6Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1955657828);
        if ((((oq5Var.h(zg6Var) ? 4 : 2) | i2 | 48) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            float f2 = ug6.a;
            float p2 = w1g.p(nu0.j(), 2, oq5Var, 48, 0);
            float f3 = (ug6.b * 2) + ug6.e;
            cma cmaVar = new cma(w1g.p(nu0.i(), 1, oq5Var, 48, 0));
            cma cmaVar2 = new cma(ff7.P(v7g.z(16), oq5Var));
            if (cmaVar.compareTo(cmaVar2) < 0) {
                cmaVar = cmaVar2;
            }
            tt0.g(gld.M(zg6Var.h, oq5Var).getValue(), null, null, "ContinueListenBlockCrossfade", ild.C(-1651802865, new sg6(((cma) yhn.a(new cma(p2 + f3 + cmaVar.a), new cma(ug6.d))).a, zg6Var), oq5Var), oq5Var, 27648, 6);
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            Unit unit = Unit.a;
            boolean h2 = oq5Var.h(zg6Var) | oq5Var.h(context);
            Object K = oq5Var.K();
            if (h2 || K == gq5.a) {
                K = new vv4(zg6Var, context, (Continuation) null, 25);
                oq5Var.k0(K);
            }
            gld.w(oq5Var, unit, (Function2) K);
            yciVar = vci.a;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new kw5(zg6Var, yciVar, i2, 9);
        }
    }

    public static final void i(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, rfa rfaVar, fvf fvfVar, o0k o0kVar, hq5 hq5Var, int i2) {
        int i3;
        ArrayList arrayList4;
        oq5 oq5Var;
        rfaVar.getClass();
        fvfVar.getClass();
        o0kVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1259527633);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.h(arrayList) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            arrayList4 = arrayList2;
            i3 |= oq5Var2.f(arrayList4) ? 32 : 16;
        } else {
            arrayList4 = arrayList2;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var2.h(arrayList3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var2.h(rfaVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var2.f(fvfVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i3 |= oq5Var2.f(o0kVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i4 = i3;
        if (oq5Var2.P(i4 & 1, (74899 & i4) != 74898)) {
            vm C = ghh.C(o0kVar, a.c(0.0f, 0.0f, 0.0f, 16, 7));
            yci a2 = androidx.compose.ui.platform.a.a(d.c(vci.a, 1.0f), "collection_downloaded_kids_blocks");
            boolean h2 = oq5Var2.h(arrayList) | oq5Var2.h(rfaVar) | ((i4 & 112) == 32) | oq5Var2.h(arrayList3);
            Object K = oq5Var2.K();
            if (h2 || K == gq5.a) {
                i50 i50Var = new i50(arrayList, arrayList4, arrayList3, rfaVar, 7);
                oq5Var2.k0(i50Var);
                K = i50Var;
            }
            oq5Var = oq5Var2;
            weo.f(a2, fvfVar, C, null, null, null, false, null, (Function1) K, oq5Var, ((i4 >> 9) & 112) | 6, 504);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new uu0(arrayList, arrayList2, arrayList3, rfaVar, fvfVar, o0kVar, i2, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(String str, String str2, hs1 hs1Var, jd6 jd6Var, fuw fuwVar, yci yciVar, Function1 function1, m85 m85Var, hq5 hq5Var, int i2, int i3) {
        int i4;
        fuw fuwVar2;
        yci yciVar2;
        int i5;
        Object K;
        boolean booleanValue;
        int i6;
        boolean z;
        m85 m85Var2;
        xmn r2;
        str.getClass();
        str2.getClass();
        hs1Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(660946296);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.f(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.f(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var.f(hs1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= oq5Var.f(jd6Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            fuwVar2 = fuwVar;
            i4 |= oq5Var.f(fuwVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            fuwVar2 = fuwVar;
        }
        int i7 = i3 & 32;
        if (i7 != 0) {
            i4 |= 196608;
        } else if ((196608 & i2) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var.f(yciVar2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            if ((1572864 & i2) == 0) {
                i4 |= oq5Var.h(function1) ? 1048576 : 524288;
            }
            i5 = i4 | 12582912;
            if ((4793491 & i5) == 4793490 || !oq5Var.z()) {
                vci vciVar = vci.a;
                yci yciVar3 = i7 == 0 ? vciVar : yciVar2;
                nzf nzfVar = new nzf(d85.e, d85.m);
                K = oq5Var.K();
                if (K == gq5.a) {
                    K = Boolean.valueOf(Build.VERSION.SDK_INT >= 31);
                    oq5Var.k0(K);
                }
                booleanValue = ((Boolean) K).booleanValue();
                iz2 iz2Var = b2c.f;
                kfh d2 = ug3.d(iz2Var, false);
                i6 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H = vnj.H(oq5Var, yciVar3);
                xp5.T.getClass();
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
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var, i6, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                yci f2 = d.c(vciVar, 1.0f).f(!booleanValue ? men.s(vciVar, 16, vnj.i) : vciVar);
                pce pceVar = new pce((Context) oq5Var.j(AndroidCompositionLocals_androidKt.b));
                pceVar.c = str2;
                if (booleanValue) {
                    z = true;
                    pceVar.j = xee.L(xz0.X(new e7t[]{new g3r(true)}));
                } else {
                    z = true;
                }
                int i8 = i5 << 3;
                p1g.a(pceVar.a(), null, f2, null, null, null, hd6.a, 0.0f, nzfVar, 0, oq5Var, (234881024 & i8) | 1572912, 696);
                yciVar2 = yciVar3;
                k(str, str2, hs1Var, fuwVar2, jd6Var, b.a.a(vciVar, iz2Var), function1, oq5Var, (i5 & 1022) | ((i5 >> 3) & 7168) | (i8 & 57344) | (i5 & 3670016));
                oq5Var.p(z);
                m85Var2 = nzfVar;
            } else {
                oq5Var.S();
                m85Var2 = m85Var;
            }
            yci yciVar4 = yciVar2;
            r2 = oq5Var.r();
            if (r2 == null) {
                r2.d = new gd1(str, str2, hs1Var, jd6Var, fuwVar, yciVar4, function1, m85Var2, i2, i3);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((1572864 & i2) == 0) {
        }
        i5 = i4 | 12582912;
        if ((4793491 & i5) == 4793490) {
        }
        vci vciVar2 = vci.a;
        if (i7 == 0) {
        }
        nzf nzfVar2 = new nzf(d85.e, d85.m);
        K = oq5Var.K();
        if (K == gq5.a) {
        }
        booleanValue = ((Boolean) K).booleanValue();
        iz2 iz2Var2 = b2c.f;
        kfh d22 = ug3.d(iz2Var2, false);
        i6 = oq5Var.P;
        androidx.compose.runtime.internal.a l22 = oq5Var.l();
        yci H2 = vnj.H(oq5Var, yciVar3);
        xp5.T.getClass();
        grb grbVar2 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, d22, wp5.f);
        g0g.U(oq5Var, l22, wp5.e);
        kb5 kb5Var2 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i6, oq5Var, i6, kb5Var2);
        g0g.U(oq5Var, H2, wp5.d);
        yci f22 = d.c(vciVar2, 1.0f).f(!booleanValue ? men.s(vciVar2, 16, vnj.i) : vciVar2);
        pce pceVar2 = new pce((Context) oq5Var.j(AndroidCompositionLocals_androidKt.b));
        pceVar2.c = str2;
        if (booleanValue) {
        }
        int i82 = i5 << 3;
        p1g.a(pceVar2.a(), null, f22, null, null, null, hd6.a, 0.0f, nzfVar2, 0, oq5Var, (234881024 & i82) | 1572912, 696);
        yciVar2 = yciVar3;
        k(str, str2, hs1Var, fuwVar2, jd6Var, b.a.a(vciVar2, iz2Var2), function1, oq5Var, (i5 & 1022) | ((i5 >> 3) & 7168) | (i82 & 57344) | (i5 & 3670016));
        oq5Var.p(z);
        m85Var2 = nzfVar2;
        yci yciVar42 = yciVar2;
        r2 = oq5Var.r();
        if (r2 == null) {
        }
    }

    public static final void k(String str, String str2, hs1 hs1Var, fuw fuwVar, jd6 jd6Var, yci yciVar, Function1 function1, hq5 hq5Var, int i2) {
        int i3;
        aqi aqiVar;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(210254830);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(hs1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(fuwVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.f(jd6Var) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i3 |= oq5Var.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i2) == 0) {
            i3 |= oq5Var.h(function1) ? 1048576 : 524288;
        }
        if ((599187 & i3) == 599186 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.g0(new d85(d85.m));
                oq5Var.k0(K);
            }
            aqi aqiVar2 = (aqi) K;
            int i4 = i3;
            sdr b2 = bmq.b(((d85) aqiVar2.getValue()).a, null, null, oq5Var, 0, 14);
            boolean e2 = oq5Var.e(((d85) b2.getValue()).a);
            Object K2 = oq5Var.K();
            Continuation continuation = null;
            if (e2 || K2 == kjnVar) {
                K2 = function1 != null ? (ai3) function1.invoke(new d85(((d85) b2.getValue()).a)) : null;
                oq5Var.k0(K2);
            }
            ai3 ai3Var = (ai3) K2;
            boolean z = (i4 & 14) == 4;
            Object K3 = oq5Var.K();
            if (z || K3 == kjnVar) {
                K3 = szf.g0(Boolean.FALSE);
                oq5Var.k0(K3);
            }
            aqi aqiVar3 = (aqi) K3;
            Object K4 = oq5Var.K();
            if (K4 == kjnVar) {
                aqiVar = aqiVar3;
                K4 = szf.g0(new nmq(9205357640488583168L));
                oq5Var.k0(K4);
            } else {
                aqiVar = aqiVar3;
            }
            aqi aqiVar4 = (aqi) K4;
            nmq nmqVar = new nmq(((nmq) aqiVar4.getValue()).a);
            boolean z2 = (i4 & 7168) == 2048;
            Object K5 = oq5Var.K();
            if (z2 || K5 == kjnVar) {
                K5 = new nz5(fuwVar, aqiVar4, continuation, 17);
                oq5Var.k0(K5);
            }
            gld.w(oq5Var, nmqVar, (Function2) K5);
            Object K6 = oq5Var.K();
            if (K6 == kjnVar) {
                K6 = tlm.f(gld.R(g.a, oq5Var), oq5Var);
            }
            mm6 mm6Var = ((fs5) K6).a;
            agr agrVar = AndroidCompositionLocals_androidKt.b;
            pce pceVar = new pce((Context) oq5Var.j(agrVar));
            pceVar.c = str;
            up6.K(pceVar, hs1Var);
            aqi aqiVar5 = aqiVar;
            pceVar.e = new es6(mm6Var, aqiVar2, aqiVar5);
            rce a2 = pceVar.a();
            pce pceVar2 = new pce((Context) oq5Var.j(agrVar));
            pceVar2.c = str2;
            up6.K(pceVar2, hs1Var);
            pceVar2.e = new pt0(mm6Var, aqiVar2);
            wn5 C = ild.C(1127215556, new g0d(yciVar, fuwVar, ai3Var, pceVar2.a(), jd6Var, a2, aqiVar5, aqiVar4), oq5Var);
            oq5Var = oq5Var;
            bg3.a(null, null, false, C, oq5Var, 3072, 7);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new kv(str, str2, hs1Var, fuwVar, jd6Var, yciVar, function1, i2);
        }
    }

    public static final void l(yke ykeVar, xke xkeVar, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        yci yciVar2;
        ykeVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(849851431);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var.f(ykeVar) : oq5Var.h(ykeVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(xkeVar) ? 32 : 16;
        }
        if (((i3 | 384) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            fle m2 = ykeVar.m();
            tt0.g(gld.O(m2.c, oq5Var).getValue(), null, null, "informer_container_state", ild.C(-2082564982, new gab(xkeVar, m2), oq5Var), oq5Var, 27648, 6);
            yciVar2 = vci.a;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new yja(ykeVar, xkeVar, yciVar2, i2, 9);
        }
    }

    public static final void m(zu5 zu5Var, int i2, hq5 hq5Var, int i3) {
        int i4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(302756105);
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? oq5Var.f(zu5Var) : oq5Var.h(zu5Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= oq5Var.d(i2) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci b2 = androidx.compose.foundation.a.b(a.d(d.d(vci.a, 1.0f), 1.0f), d85.b(d85.g, 0.7f, 0.0f, 0.0f, 0.0f, 14), vnj.i);
            kfh d2 = ug3.d(b2c.b, false);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, b2);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            xcs.b("Item: " + zu5Var + ", Page: " + i2, null, 0L, v7g.z(32), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, oq5Var, 3072, 0, 131062);
            oq5Var = oq5Var;
            oq5Var.p(true);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new cv5(zu5Var, i2, i3, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fe, code lost:
    
        if (r8 > 15) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0104, code lost:
    
        if (r13 == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0107, code lost:
    
        defpackage.kac.f("SNTP: Zero transmitTime");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long n() {
        byte b2;
        SocketTimeoutException socketTimeoutException;
        byte[] bArr;
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            Object obj = u;
            synchronized (obj) {
            }
            datagramSocket.setSoTimeout(1000);
            synchronized (obj) {
            }
            InetAddress[] allByName = InetAddress.getAllByName("time.android.com");
            int length = allByName.length;
            byte b3 = 0;
            SocketTimeoutException socketTimeoutException2 = null;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                byte[] bArr2 = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr2, 48, allByName[i2], 123);
                bArr2[b3] = 27;
                long currentTimeMillis = System.currentTimeMillis();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (currentTimeMillis == 0) {
                    Arrays.fill(bArr2, 40, 48, b3);
                    b2 = b3;
                    socketTimeoutException = socketTimeoutException2;
                    bArr = bArr2;
                } else {
                    long j2 = currentTimeMillis / 1000;
                    long j3 = currentTimeMillis - (j2 * 1000);
                    b2 = b3;
                    socketTimeoutException = socketTimeoutException2;
                    long j4 = j2 + 2208988800L;
                    bArr = bArr2;
                    bArr[40] = (byte) (j4 >> 24);
                    bArr[41] = (byte) (j4 >> 16);
                    bArr[42] = (byte) (j4 >> 8);
                    bArr[43] = (byte) j4;
                    long j5 = (j3 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j5 >> 24);
                    bArr[45] = (byte) (j5 >> 16);
                    bArr[46] = (byte) (j5 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                }
                datagramSocket.send(datagramPacket);
                byte[] bArr3 = bArr;
                try {
                    datagramSocket.receive(new DatagramPacket(bArr3, 48));
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j6 = (elapsedRealtime2 - elapsedRealtime) + currentTimeMillis;
                    byte b4 = bArr3[b2];
                    byte b5 = (byte) ((b4 >> 6) & 3);
                    byte b6 = (byte) (b4 & 7);
                    int i4 = bArr3[1] & 255;
                    long S = S(24, bArr3);
                    long S2 = S(32, bArr3);
                    long S3 = S(40, bArr3);
                    if (b5 != 3) {
                        if (b6 != 4 && b6 != 5) {
                            kac.f(k5r.i(b6, "SNTP: Untrusted mode: "));
                        }
                        kac.f(k5r.i(i4, "SNTP: Untrusted stratum: "));
                    } else {
                        kac.f("SNTP: Unsynchronized server");
                    }
                    long j7 = (j6 + (((S3 - j6) + (S2 - S)) / 2)) - elapsedRealtime2;
                    datagramSocket.close();
                    return j7;
                } catch (SocketTimeoutException e2) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException2 = e2;
                    } else {
                        SocketTimeoutException socketTimeoutException3 = socketTimeoutException;
                        socketTimeoutException3.addSuppressed(e2);
                        socketTimeoutException2 = socketTimeoutException3;
                    }
                    int i5 = i3 + 1;
                    if (i3 >= 10) {
                        break;
                    }
                    i2++;
                    i3 = i5;
                    b3 = b2;
                }
            }
            socketTimeoutException2.getClass();
            throw socketTimeoutException2;
        } finally {
        }
    }

    public static final boolean o(String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (Intrinsics.e(charAt, 128) >= 0 || Character.isLetter(charAt)) {
                return true;
            }
        }
        return false;
    }

    public static final la5 r(ArrayList arrayList, List list) {
        if (arrayList == null) {
            return list != null ? new la5(null, CollectionsKt.v0(list)) : la5.c;
        }
        List o0 = CollectionsKt.o0(arrayList, new dl4(21));
        int size = o0.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ((Number) ((Pair) o0.get(i2)).a).intValue();
        }
        int size2 = o0.size();
        float[] fArr = new float[size2];
        for (int i3 = 0; i3 < size2; i3++) {
            fArr[i3] = ((Number) ((Pair) o0.get(i3)).b).floatValue();
        }
        return new la5(fArr, iArr);
    }

    public static bhc s(ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = 0;
        kotlin.ranges.a l2 = yhn.l(1, yhn.m(0, arrayList.size()));
        int i3 = l2.a;
        int i4 = l2.b;
        int i5 = l2.c;
        if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
            while (true) {
                w1g.n(((zgc) arrayList.get(i3)).d, new tg3(linkedHashMap, i3, 2));
                if (i3 == i4) {
                    break;
                }
                i3 += i5;
            }
        }
        ArrayList x0 = CollectionsKt.x0(CollectionsKt.z0(linkedHashMap.values()));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = x0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            List list = (List) next;
            list.getClass();
            if (list.size() > 1) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            List list2 = (List) it2.next();
            list2.getClass();
            arrayList3 = u1g.A(arrayList3, list2);
        }
        y5 y5Var = new y5(11, new s7w(arrayList3));
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList) {
            int i6 = i2 + 1;
            if (i2 < 0) {
                u75.n();
                throw null;
            }
            if (((Boolean) y5Var.invoke(obj, Integer.valueOf(i2))).booleanValue()) {
                arrayList4.add(obj);
            }
            i2 = i6;
        }
        ArrayList arrayList5 = new ArrayList(arrayList4);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            zgc zgcVar = (zgc) it3.next();
            w1g.n(zgcVar.d, new wgc(zgcVar, linkedHashMap2));
        }
        return new bhc(linkedHashMap2);
    }

    public static final void w(AutoCloseable autoCloseable, Throwable th) {
        boolean isTerminated;
        if (autoCloseable != null) {
            if (th != null) {
                try {
                    k5r.u(autoCloseable);
                    return;
                } catch (Throwable th2) {
                    fob.a(th, th2);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                }
                if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                    return;
                } else {
                    e7o.e();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static final eu7 x(eu7 eu7Var, int i2) {
        eu7Var.getClass();
        cu7 cu7Var = eu7Var.a;
        cu7Var.getClass();
        List list = cu7Var.b;
        if (list.size() > i2) {
            cu7Var = i2 <= 0 ? cu7.a(cu7Var, null, c5b.a, 1) : cu7.a(cu7Var, null, list.subList(0, i2), 1);
        }
        return eu7.a(eu7Var, cu7Var, null, 2);
    }

    public static final boolean y(g89 g89Var, g89 g89Var2) {
        List list;
        List list2 = g89Var.b;
        List list3 = g89Var2.b;
        List list4 = list2;
        if ((list4 == null || list4.isEmpty()) && ((list = list3) == null || list.isEmpty())) {
            return xp3.C(g89Var.c, g89Var2.c);
        }
        if (list2 == null) {
            list2 = c5b.a;
        }
        if (list3 == null) {
            list3 = c5b.a;
        }
        if (list2.size() == list3.size()) {
            int i2 = 0;
            for (Object obj : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    u75.n();
                    throw null;
                }
                f89 f89Var = (f89) list3.get(i2);
                f89 f89Var2 = (f89) obj;
                if (f89Var2 != null || f89Var != null) {
                    if (xp3.B(f89Var2 != null ? f89Var2.a : null, f89Var != null ? f89Var.a : null)) {
                        if (xp3.B(f89Var2 != null ? f89Var2.b : null, f89Var != null ? f89Var.b : null)) {
                        }
                    }
                }
                i2 = i3;
            }
            return true;
        }
        return false;
    }

    public static final boolean z(of9 of9Var, of9 of9Var2) {
        List list;
        List list2 = of9Var.c;
        List list3 = of9Var2.c;
        List list4 = list2;
        if ((list4 == null || list4.isEmpty()) && ((list = list3) == null || list.isEmpty())) {
            return xp3.C(of9Var.d, of9Var2.d);
        }
        if (list2 == null) {
            list2 = c5b.a;
        }
        if (list3 == null) {
            list3 = c5b.a;
        }
        if (list2.size() == list3.size()) {
            int i2 = 0;
            for (Object obj : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    u75.n();
                    throw null;
                }
                nf9 nf9Var = (nf9) list3.get(i2);
                nf9 nf9Var2 = (nf9) obj;
                if (nf9Var2 != null || nf9Var != null) {
                    if (xp3.B(nf9Var2 != null ? nf9Var2.a : null, nf9Var != null ? nf9Var.a : null)) {
                        if (xp3.B(nf9Var2 != null ? nf9Var2.b : null, nf9Var != null ? nf9Var.b : null)) {
                        }
                    }
                }
                i2 = i3;
            }
            return true;
        }
        return false;
    }

    public List I(GoogleSignInOptions googleSignInOptions) {
        return Collections.EMPTY_LIST;
    }

    public abstract void P(i9 i9Var, i9 i9Var2);

    public abstract void Q(i9 i9Var, Thread thread);

    public fo0 p(Context context, Looper looper, rn5 rn5Var, Object obj, rmd rmdVar, smd smdVar) {
        return q(context, looper, rn5Var, obj, rmdVar, smdVar);
    }

    public fo0 q(Context context, Looper looper, rn5 rn5Var, Object obj, rmd rmdVar, smd smdVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract boolean t(k9 k9Var, c9 c9Var, c9 c9Var2);

    public abstract boolean u(k9 k9Var, Object obj, Object obj2);

    public abstract boolean v(k9 k9Var, i9 i9Var, i9 i9Var2);
}
