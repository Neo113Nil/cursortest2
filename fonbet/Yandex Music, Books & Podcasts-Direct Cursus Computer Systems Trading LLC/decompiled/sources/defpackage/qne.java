package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.HandlerThread;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.cardview.widget.CardView;
import com.connectsdk.service.DeviceService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.Task;
import com.yandex.plus.log.api.a;
import com.yandex.plus.log.api.b;
import java.io.File;
import java.nio.channels.FileChannel;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import ru.yandex.music.gallery.GalleryWidgetActivity;

/* loaded from: classes.dex */
public class qne implements xzc, gih, xjn, yjo, p33, iip, aqr, cb7, kip, adu, i6s {
    public static final Status c = new Status(8, "The connection to Google Play services was lost", null, null);
    public Object a;
    public Object b;

    public qne(int i) {
        switch (i) {
            case 4:
                this.a = new Rect();
                this.b = new Rect();
                break;
            case 14:
                bdt I = hag.I(a14.class);
                l18 l18Var = l18.b;
                this.a = (a14) l18Var.c(I);
                this.b = (yzp) l18Var.c(hag.I(yzp.class));
                break;
            case 18:
                this.a = new LinkedHashMap();
                Object obj = null;
                this.b = new r0o(obj, obj, false, 1);
                break;
            case 23:
                this.a = new HashMap();
                this.b = new ozw(28, (byte) 0);
                break;
            default:
                this.a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
                this.b = new yxw(this);
                break;
        }
    }

    public static /* synthetic */ qne m(qne qneVar, String str, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        return qneVar.k(str, null);
    }

    public static uvf u(qne qneVar, jnq jnqVar, tmb tmbVar) {
        l18 l18Var = l18.b;
        bdt I = hag.I(u26.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        u26 u26Var = (u26) qdcVar.C(I);
        jnqVar.getClass();
        tmbVar.getClass();
        return new uvf(new wl(jnqVar, tmbVar, qneVar, u26Var, 28));
    }

    public static void v(qne qneVar, w43 w43Var, thj thjVar, int i) {
        if ((i & 2) != 0) {
            thjVar = null;
        }
        qneVar.getClass();
        ((rmb) qneVar.b).i(ghh.Q(w43Var.a()), thjVar, null, ghh.r(w43Var.a()));
        ((r63) qneVar.a).a(w43Var);
    }

    public qne A(vtm vtmVar) {
        String concat = ((String) this.a).concat("_success");
        Long s = s();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        q1f q1fVar = (q1f) linkedHashMap.get(DeviceService.KEY_DESC);
        String str = null;
        if (q1fVar != null) {
            jkr jkrVar = q1fVar.a == r1f.c ? (jkr) q1fVar : null;
            if (jkrVar != null) {
                str = jkrVar.b;
            }
        }
        if (s == null) {
            return mvn.y(concat);
        }
        linkedHashMap.getClass();
        vtm vtmVar2 = new vtm((Map) linkedHashMap);
        vtmVar2.u(s.longValue(), "origin_eventus_id");
        if (vtmVar != null) {
            vtmVar2 = vtmVar2.q(vtmVar);
        }
        if (str != null) {
            vtmVar2.w(DeviceService.KEY_DESC, "Успешно: ".concat(str));
        }
        return mvn.K(concat, vtmVar2);
    }

    @Override // defpackage.cb7
    public Object C(Object obj, wa7 wa7Var) {
        return ((cb7) this.b).C(obj, wa7Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0072, code lost:
    
        if (r3 == r6) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object D(c01 c01Var, j1g j1gVar, cg6 cg6Var) {
        wb1 wb1Var;
        int i;
        boolean z;
        c01 c01Var2;
        boolean z2;
        boolean z3;
        boolean z4;
        Date date;
        Long l;
        x41 x41Var;
        c01 c01Var3 = c01Var;
        j1g j1gVar2 = j1gVar;
        jyr jyrVar = ((xnk) this.b).a;
        if (cg6Var instanceof wb1) {
            wb1Var = (wb1) cg6Var;
            int i2 = wb1Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wb1Var.o = i2 - Integer.MIN_VALUE;
                Object obj = wb1Var.m;
                nm6 nm6Var = nm6.a;
                i = wb1Var.o;
                String str = null;
                if (i != 0) {
                    qgg.h0(obj);
                    if (j1gVar2 != null) {
                        z = j1gVar2 == j1g.a;
                        if (j1gVar2 == null) {
                            String str2 = c01Var3.a;
                            wb1Var.j = c01Var3;
                            wb1Var.k = null;
                            wb1Var.l = z;
                            wb1Var.o = 2;
                            Object f = ((t3g) jyrVar.getValue()).f(str2, wb1Var);
                            if (f != nm6Var) {
                                c01Var2 = c01Var3;
                                z2 = z;
                                obj = f;
                                z3 = ((Boolean) obj).booleanValue();
                                z4 = z2;
                                c01Var3 = c01Var2;
                                boolean z5 = z3;
                                date = c01Var3.r;
                                String str3 = c01Var3.b;
                                if (date != null) {
                                }
                                if (l != null) {
                                }
                                date = new Date(System.currentTimeMillis());
                                String str4 = c01Var3.a;
                                String obj2 = StringsKt.t0(str3).toString();
                                String R = q7g.R(StringsKt.t0(str3).toString());
                                R.getClass();
                                String a = wc7.a(date);
                                boolean z6 = c01Var3.c;
                                String I = men.I(c01Var3.k);
                                String I2 = men.I(c01Var3.l);
                                a01 a01Var = c01Var3.j;
                                int i3 = a01Var.b + a01Var.d;
                                int i4 = a01Var.a;
                                String Q = q7g.Q(c01Var3.n);
                                boolean z7 = c01Var3.e;
                                x41Var = c01Var3.o;
                                if (x41Var != null) {
                                }
                                return new q51(str4, obj2, R, z4, z5, a, z6, I, i3, i4, false, Q, z7, str, I2);
                            }
                            return nm6Var;
                        }
                        z3 = j1gVar2 == j1g.c;
                        z4 = z;
                        boolean z52 = z3;
                        date = c01Var3.r;
                        String str32 = c01Var3.b;
                        if (date != null) {
                        }
                        if (l != null) {
                            date = new Date(System.currentTimeMillis());
                            String str42 = c01Var3.a;
                            String obj22 = StringsKt.t0(str32).toString();
                            String R2 = q7g.R(StringsKt.t0(str32).toString());
                            R2.getClass();
                            String a2 = wc7.a(date);
                            boolean z62 = c01Var3.c;
                            String I3 = men.I(c01Var3.k);
                            String I22 = men.I(c01Var3.l);
                            a01 a01Var2 = c01Var3.j;
                            int i32 = a01Var2.b + a01Var2.d;
                            int i42 = a01Var2.a;
                            String Q2 = q7g.Q(c01Var3.n);
                            boolean z72 = c01Var3.e;
                            x41Var = c01Var3.o;
                            if (x41Var != null) {
                                if (x41Var != x41.a) {
                                }
                            }
                            return new q51(str42, obj22, R2, z4, z52, a2, z62, I3, i32, i42, false, Q2, z72, str, I22);
                        }
                        date = new Date(System.currentTimeMillis());
                        String str422 = c01Var3.a;
                        String obj222 = StringsKt.t0(str32).toString();
                        String R22 = q7g.R(StringsKt.t0(str32).toString());
                        R22.getClass();
                        String a22 = wc7.a(date);
                        boolean z622 = c01Var3.c;
                        String I32 = men.I(c01Var3.k);
                        String I222 = men.I(c01Var3.l);
                        a01 a01Var22 = c01Var3.j;
                        int i322 = a01Var22.b + a01Var22.d;
                        int i422 = a01Var22.a;
                        String Q22 = q7g.Q(c01Var3.n);
                        boolean z722 = c01Var3.e;
                        x41Var = c01Var3.o;
                        if (x41Var != null) {
                        }
                        return new q51(str422, obj222, R22, z4, z52, a22, z622, I32, i322, i422, false, Q22, z722, str, I222);
                    }
                    String str5 = c01Var3.a;
                    wb1Var.j = c01Var3;
                    wb1Var.k = j1gVar2;
                    wb1Var.o = 1;
                    obj = ((t3g) jyrVar.getValue()).g(str5, wb1Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z2 = wb1Var.l;
                        c01Var2 = wb1Var.j;
                        qgg.h0(obj);
                        z3 = ((Boolean) obj).booleanValue();
                        z4 = z2;
                        c01Var3 = c01Var2;
                        boolean z522 = z3;
                        date = c01Var3.r;
                        String str322 = c01Var3.b;
                        l = date != null ? new Long(date.getTime()) : null;
                        if ((l != null && l.longValue() == 0) || l == null) {
                            date = new Date(System.currentTimeMillis());
                        }
                        String str4222 = c01Var3.a;
                        String obj2222 = StringsKt.t0(str322).toString();
                        String R222 = q7g.R(StringsKt.t0(str322).toString());
                        R222.getClass();
                        String a222 = wc7.a(date);
                        boolean z6222 = c01Var3.c;
                        String I322 = men.I(c01Var3.k);
                        String I2222 = men.I(c01Var3.l);
                        a01 a01Var222 = c01Var3.j;
                        int i3222 = a01Var222.b + a01Var222.d;
                        int i4222 = a01Var222.a;
                        String Q222 = q7g.Q(c01Var3.n);
                        boolean z7222 = c01Var3.e;
                        x41Var = c01Var3.o;
                        if (x41Var != null && x41Var != x41.c) {
                            str = x41Var != x41.a ? "from-artist-photos" : "from-album-cover";
                        }
                        return new q51(str4222, obj2222, R222, z4, z522, a222, z6222, I322, i3222, i4222, false, Q222, z7222, str, I2222);
                    }
                    j1g j1gVar3 = wb1Var.k;
                    c01 c01Var4 = wb1Var.j;
                    qgg.h0(obj);
                    j1gVar2 = j1gVar3;
                    c01Var3 = c01Var4;
                }
                z = ((Boolean) obj).booleanValue();
                if (j1gVar2 == null) {
                }
            }
        }
        wb1Var = new wb1(this, cg6Var);
        Object obj3 = wb1Var.m;
        nm6 nm6Var2 = nm6.a;
        i = wb1Var.o;
        String str6 = null;
        if (i != 0) {
        }
        z = ((Boolean) obj3).booleanValue();
        if (j1gVar2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void E() {
        boolean z;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) ((Set) this.a).toArray(new BasePendingResult[0])) {
            basePendingResult.g.set(null);
            synchronized (basePendingResult.a) {
                try {
                    if (((tmd) basePendingResult.c.get()) != null) {
                        if (!basePendingResult.m) {
                        }
                        synchronized (basePendingResult.a) {
                            z = basePendingResult.k;
                        }
                    }
                    basePendingResult.b();
                    synchronized (basePendingResult.a) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                ((Set) this.a).remove(basePendingResult);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.cb7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object M(cg6 cg6Var) {
        ab7 ab7Var;
        int i;
        if (cg6Var instanceof ab7) {
            ab7Var = (ab7) cg6Var;
            int i2 = ab7Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ab7Var.l = i2 - Integer.MIN_VALUE;
                Object obj = ab7Var.j;
                nm6 nm6Var = nm6.a;
                i = ab7Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    n71 n71Var = new n71(this, (cb7) this.b, (Continuation) null, 5);
                    ab7Var.l = 1;
                    obj = gld.Q(n71Var, ab7Var);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ab7Var.l = 2;
                Object H = ((mu7) obj).H(ab7Var);
                return H != nm6Var ? nm6Var : H;
            }
        }
        ab7Var = new ab7(this, cg6Var);
        Object obj2 = ab7Var.j;
        nm6 nm6Var2 = nm6.a;
        i = ab7Var.l;
        if (i != 0) {
        }
        ab7Var.l = 2;
        Object H2 = ((mu7) obj2).H(ab7Var);
        if (H2 != nm6Var2) {
        }
    }

    @Override // defpackage.cb7
    public Object N(Object obj, cg6 cg6Var) {
        Object N = ((cb7) this.b).N(obj, cg6Var);
        return N == nm6.a ? N : Unit.a;
    }

    @Override // defpackage.cb7
    public ya7 S(qec qecVar) {
        return new ya7(this, qecVar);
    }

    @Override // defpackage.xzc
    public void a(int i) {
        yi1 yi1Var = (yi1) this.a;
        q43 a = yi1Var.q.a();
        g70 g70Var = g70.b;
        c70 c70Var = c70.a;
        a.a(new h70(g70Var));
        zh1 zh1Var = yi1Var.e;
        ka1 ka1Var = (ka1) this.b;
        np2 np2Var = (np2) zh1Var.a.b;
        ka1Var.getClass();
        String str = ka1Var.e;
        List list = ka1Var.f;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            list = c5b.a;
        }
        g1d g1dVar = new g1d(i, str, list, false, true);
        int i2 = GalleryWidgetActivity.y;
        np2Var.startActivity(bow.o(np2Var, g1dVar));
    }

    @Override // defpackage.iip
    public t9f b(f9f f9fVar) {
        Object putIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        Class P = leu.P(f9fVar);
        Object obj = concurrentHashMap.get(P);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(P, (obj = new op3((t9f) ((Function1) this.a).invoke(f9fVar))))) != null) {
            obj = putIfAbsent;
        }
        return ((op3) obj).a;
    }

    @Override // defpackage.p33
    public lcg d(byte[] bArr) {
        byte[] bArr2;
        le3 le3Var = (le3) this.b;
        if (le3Var == null || (bArr2 = (byte[]) le3Var.a) == null || !Arrays.equals(bArr2, bArr)) {
            lcg d = ((gb7) this.a).d(bArr);
            this.b = new le3(bArr, d);
            return d;
        }
        lcg lcgVar = (lcg) ((le3) this.b).b;
        vq1.B(lcgVar);
        return lcgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00bc A[Catch: all -> 0x00bd, TRY_ENTER, TryCatch #6 {all -> 0x00bd, blocks: (B:61:0x00bc, B:62:0x00bf, B:63:0x00d7), top: B:59:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bf A[Catch: all -> 0x00bd, TryCatch #6 {all -> 0x00bd, blocks: (B:61:0x00bc, B:62:0x00bf, B:63:0x00d7), top: B:59:0x00ba }] */
    @Override // defpackage.yjo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xjo e(String str) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        str.getClass();
        v97 v97Var = (v97) this.b;
        if (!str.equals(":memory:")) {
            str = ((jc7) v97Var.d).a.getDatabasePath(str).getAbsolutePath();
            str.getClass();
        }
        boolean z = true;
        mob mobVar = new mob(str, (v97Var.b || v97Var.c || str.equals(":memory:")) ? false : true);
        ReentrantLock reentrantLock = mobVar.a;
        reentrantLock.lock();
        yfx yfxVar = mobVar.b;
        if (yfxVar != null) {
            try {
                yfxVar.t();
            } catch (Throwable th) {
                th = th;
                z = false;
                try {
                    if (!z) {
                        throw th;
                    }
                    throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
        try {
            try {
                if (v97Var.c) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                xjo e = ((yjo) this.a).e(str);
                if (v97Var.b) {
                    v97.f(e);
                    if (((jc7) v97Var.d).g == teo.c) {
                        p6g.s(e, "PRAGMA synchronous = NORMAL");
                    } else {
                        p6g.s(e, "PRAGMA synchronous = FULL");
                    }
                    ((yeo) v97Var.e).d(e);
                } else {
                    try {
                        v97Var.c = true;
                        v97.a(v97Var, e);
                        v97Var.c = false;
                    } catch (Throwable th2) {
                        v97Var.c = false;
                        throw th2;
                    }
                }
                if (yfxVar != null && (fileChannel2 = (FileChannel) yfxVar.c) != null) {
                    try {
                        fileChannel2.close();
                        yfxVar.c = null;
                    } finally {
                    }
                }
                return e;
            } catch (Throwable th3) {
                if (yfxVar != null && (fileChannel = (FileChannel) yfxVar.c) != null) {
                    try {
                        fileChannel.close();
                        yfxVar.c = null;
                    } finally {
                    }
                }
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            if (!z) {
            }
        }
    }

    @Override // defpackage.i6s
    public void f(Drawable drawable) {
        ftb ftbVar = (ftb) this.a;
        drawable.getClass();
        Integer num = ((jvd) this.b).c.c;
        if (num != null) {
            ftbVar.a().setBackgroundColor(num.intValue());
        }
        ftbVar.a().setImageDrawable(drawable);
    }

    @Override // defpackage.kip
    public t9f g(String str) {
        arf arfVar = (arf) ((LinkedHashMap) this.b).get(str);
        t9f t9fVar = arfVar != null ? (t9f) arfVar.getValue() : null;
        b bVar = (b) this.a;
        if (t9fVar != null) {
            a aVar = a.c;
            if (bVar.b(aVar)) {
                bVar.c(aVar, "DescriptorScaffoldSerializerSelector", hrg.q("Serializer for scaffold type = ", str, " found"));
                return t9fVar;
            }
        } else {
            a aVar2 = a.d;
            if (bVar.b(aVar2)) {
                bVar.c(aVar2, "DescriptorScaffoldSerializerSelector", hrg.q("Serializer for scaffold type = ", str, " not found!"));
            }
        }
        return t9fVar;
    }

    @Override // defpackage.sjn
    public Object getValue(Object obj, s9f s9fVar) {
        s9fVar.getClass();
        return ((AtomicReference) this.b).get();
    }

    @Override // defpackage.gih
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public st1 h(rdk rdkVar) {
        MediaCodec mediaCodec;
        String str = ((mih) rdkVar.b).a;
        st1 st1Var = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                st1 st1Var2 = new st1(mediaCodec, (HandlerThread) ((rt1) this.a).get(), new vt1(mediaCodec, (HandlerThread) ((rt1) this.b).get()), (uzg) rdkVar.g);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) rdkVar.e;
                    st1.u(st1Var2, (MediaFormat) rdkVar.c, surface, (MediaCrypto) rdkVar.f, (surface == null && ((mih) rdkVar.b).k && dvt.a >= 35) ? 8 : 0);
                    return st1Var2;
                } catch (Exception e) {
                    e = e;
                    st1Var = st1Var2;
                    if (st1Var != null) {
                        st1Var.a();
                    } else if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodec = null;
        }
    }

    @Override // defpackage.i6s
    public void j(Drawable drawable) {
        ftb ftbVar = (ftb) this.a;
        ftbVar.a().setBackgroundColor(0);
        ftbVar.a().setImageDrawable(drawable);
    }

    public qne k(String str, vtm vtmVar) {
        String concat = ((String) this.a).concat("_failure");
        Long s = s();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        q1f q1fVar = (q1f) linkedHashMap.get(DeviceService.KEY_DESC);
        String str2 = null;
        if (q1fVar != null) {
            jkr jkrVar = q1fVar.a == r1f.c ? (jkr) q1fVar : null;
            if (jkrVar != null) {
                str2 = jkrVar.b;
            }
        }
        if (s == null) {
            return mvn.y(concat);
        }
        linkedHashMap.getClass();
        vtm vtmVar2 = new vtm((Map) linkedHashMap);
        vtmVar2.u(s.longValue(), "origin_eventus_id");
        w1g.B((LinkedHashMap) vtmVar2.a, "error", new mc3(true));
        if (str != null) {
            vtmVar2.w("reason", str);
        }
        if (vtmVar != null) {
            vtmVar2 = vtmVar2.q(vtmVar);
        }
        if (str2 != null) {
            vtmVar2.w(DeviceService.KEY_DESC, "Неуспешно: ".concat(str2));
        }
        return mvn.K(concat, vtmVar2);
    }

    @Override // defpackage.aqr
    public Task l(Object obj) {
        Boolean bool = (Boolean) obj;
        gp6 gp6Var = (gp6) this.b;
        if (bool.booleanValue()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
            }
            boolean booleanValue = bool.booleanValue();
            v97 v97Var = gp6Var.b;
            if (booleanValue) {
                ((i8s) v97Var.h).d(null);
                return ((Task) this.a).m((vq6) gp6Var.e.a, new sld(22, this));
            }
            v97Var.getClass();
            xq0.q("An invalid data collection token was used.");
            return null;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
        }
        jac jacVar = gp6Var.g;
        Iterator it = jac.r(((File) jacVar.c).listFiles(gp6.r)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        jac jacVar2 = ((tq6) gp6Var.m.b).b;
        tq6.a(jac.r(((File) jacVar2.e).listFiles()));
        tq6.a(jac.r(((File) jacVar2.f).listFiles()));
        tq6.a(jac.r(((File) jacVar2.g).listFiles()));
        gp6Var.q.d(null);
        return ywf.w(null);
    }

    @Override // defpackage.yjo
    public boolean n() {
        return ((yjo) this.a).n();
    }

    @Override // defpackage.i6s
    public void p(Drawable drawable) {
        ftb ftbVar = (ftb) this.a;
        ftbVar.a().setBackgroundColor(0);
        ftbVar.a().setImageDrawable(drawable);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    public InputMethodManager r() {
        return (InputMethodManager) this.b.getValue();
    }

    public Long s() {
        q1f q1fVar = (q1f) ((LinkedHashMap) this.b).get("eventus_id");
        if (q1fVar != null && q1fVar.a == r1f.a) {
            return Long.valueOf(((oqe) q1fVar).b);
        }
        return null;
    }

    @Override // defpackage.xjn
    public void setValue(Object obj, s9f s9fVar, Object obj2) {
        s9fVar.getClass();
        Object andSet = ((AtomicReference) this.b).getAndSet(obj2);
        if (andSet != null) {
            ((Function2) this.a).invoke(obj, andSet);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0113, code lost:
    
        if (defpackage.tyf.N(r1, r5, r2) != r3) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r17v0, types: [qne] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00cc -> B:22:0x00d0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(String str, Iterable iterable, Map map, cg6 cg6Var) {
        vb1 vb1Var;
        int i;
        ArrayList arrayList;
        Iterator it;
        int i2;
        int i3;
        String str2;
        vb1 vb1Var2;
        Map map2;
        List list;
        j1g j1gVar;
        int i4;
        if (cg6Var instanceof vb1) {
            vb1Var = (vb1) cg6Var;
            int i5 = vb1Var.t;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                vb1Var.t = i5 - Integer.MIN_VALUE;
                Object obj = vb1Var.r;
                nm6 nm6Var = nm6.a;
                i = vb1Var.t;
                if (i != 0) {
                    qgg.h0(obj);
                    arrayList = new ArrayList(v75.o(iterable, 10));
                    it = iterable.iterator();
                    i2 = 0;
                    i3 = 0;
                    str2 = str;
                    vb1Var2 = vb1Var;
                    map2 = map;
                    if (it.hasNext()) {
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    int i6 = vb1Var.q;
                    int i7 = vb1Var.p;
                    Collection collection = vb1Var.o;
                    Iterator it2 = vb1Var.n;
                    Collection collection2 = vb1Var.m;
                    List list2 = vb1Var.l;
                    Map map3 = vb1Var.k;
                    String str3 = vb1Var.j;
                    qgg.h0(obj);
                    it = it2;
                    arrayList = collection2;
                    int i8 = i7;
                    i2 = i6;
                    vb1Var2 = vb1Var;
                    map2 = map3;
                    collection.add((q51) obj);
                    i3 = i8;
                    str2 = str3;
                    if (it.hasNext()) {
                        c01 c01Var = (c01) it.next();
                        if (map2 == null) {
                            j1gVar = null;
                        } else {
                            Object obj2 = map2.get(c01Var.a);
                            if (obj2 == null) {
                                obj2 = j1g.b;
                            }
                            j1gVar = (j1g) obj2;
                        }
                        vb1Var2.j = str2;
                        vb1Var2.k = map2;
                        vb1Var2.l = null;
                        ArrayList arrayList2 = arrayList;
                        vb1Var2.m = arrayList2;
                        vb1Var2.n = it;
                        vb1Var2.o = arrayList2;
                        vb1Var2.p = i3;
                        vb1Var2.q = i2;
                        vb1Var2.t = 1;
                        Object D = D(c01Var, j1gVar, vb1Var2);
                        if (D != nm6Var) {
                            str3 = str2;
                            obj = D;
                            i8 = i3;
                            collection = arrayList;
                            collection.add((q51) obj);
                            i3 = i8;
                            str2 = str3;
                            if (it.hasNext()) {
                                ArrayList arrayList3 = arrayList;
                                i5h i5hVar = (i5h) this.a;
                                vb1Var2.j = null;
                                vb1Var2.k = null;
                                vb1Var2.l = arrayList3;
                                vb1Var2.m = null;
                                vb1Var2.n = null;
                                vb1Var2.o = null;
                                vb1Var2.t = 2;
                                obj = i5hVar.b(str2, vb1Var2);
                                if (obj != nm6Var) {
                                    vb1 vb1Var3 = vb1Var2;
                                    list = arrayList3;
                                    vb1Var = vb1Var3;
                                    ueo ueoVar = (ueo) obj;
                                    aa0 aa0Var = new aa0(ueoVar, (Continuation) null, list);
                                    vb1Var.j = null;
                                    vb1Var.k = null;
                                    vb1Var.l = null;
                                    vb1Var.p = 0;
                                    i4 = 3;
                                    vb1Var.t = 3;
                                }
                            }
                        }
                    }
                    return nm6Var;
                }
                if (i != 2) {
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list3 = vb1Var.l;
                    Map map4 = vb1Var.k;
                    qgg.h0(obj);
                    i4 = 3;
                    ssg.a(i4, null, "insert artists", null);
                    return Unit.a;
                }
                list = vb1Var.l;
                Map map5 = vb1Var.k;
                qgg.h0(obj);
                ueo ueoVar2 = (ueo) obj;
                aa0 aa0Var2 = new aa0(ueoVar2, (Continuation) null, list);
                vb1Var.j = null;
                vb1Var.k = null;
                vb1Var.l = null;
                vb1Var.p = 0;
                i4 = 3;
                vb1Var.t = 3;
            }
        }
        vb1Var = new vb1(this, cg6Var);
        Object obj3 = vb1Var.r;
        nm6 nm6Var2 = nm6.a;
        i = vb1Var.t;
        if (i != 0) {
        }
    }

    public void x(String str) {
        y68 y68Var;
        synchronized (this) {
            try {
                Object obj = ((HashMap) this.a).get(str);
                w1g.s(obj, "Argument must not be null");
                y68Var = (y68) obj;
                int i = y68Var.b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + y68Var.b);
                }
                int i2 = i - 1;
                y68Var.b = i2;
                if (i2 == 0) {
                    y68 y68Var2 = (y68) ((HashMap) this.a).remove(str);
                    if (!y68Var2.equals(y68Var)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + y68Var + ", but actually removed: " + y68Var2 + ", safeKey: " + str);
                    }
                    ozw ozwVar = (ozw) this.b;
                    synchronized (((ArrayDeque) ozwVar.b)) {
                        try {
                            if (((ArrayDeque) ozwVar.b).size() < 10) {
                                ((ArrayDeque) ozwVar.b).offer(y68Var2);
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        y68Var.a.unlock();
    }

    public void y() {
        qjb.b.getClass();
        qjb.c.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        w1g.n((LinkedHashMap) this.b, new u60(linkedHashMap, 2));
        linkedHashMap.put("timestamp", Long.valueOf(qee.n()));
        linkedHashMap.put("version", 1);
        "EVENTUS_".concat((String) this.a);
    }

    public void z(int i, int i2, int i3, int i4) {
        CardView cardView = (CardView) this.b;
        cardView.d.set(i, i2, i3, i4);
        Rect rect = cardView.c;
        super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    public /* synthetic */ qne(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ qne(Object obj, Object obj2, boolean z) {
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ qne(Object obj, boolean z) {
        this.b = obj;
    }

    public /* synthetic */ qne(Object obj) {
        this.a = obj;
    }

    public qne(Map map, h0o h0oVar) {
        map.getClass();
        this.a = map;
        this.b = h0oVar;
    }

    public qne(String str, vtm vtmVar) {
        this.a = str;
        vtmVar.w("event_name", str);
        this.b = (LinkedHashMap) vtmVar.a;
    }

    public qne(View view) {
        this.a = view;
        this.b = btf.a(bwf.c, new ypb(9, this));
    }

    public qne(Function2 function2) {
        this.a = function2;
        this.b = new AtomicReference();
    }

    public qne(v97 v97Var, yjo yjoVar) {
        yjoVar.getClass();
        this.b = v97Var;
        this.a = yjoVar;
    }

    public qne(Function1 function1) {
        this.a = function1;
        this.b = new ConcurrentHashMap();
    }
}
