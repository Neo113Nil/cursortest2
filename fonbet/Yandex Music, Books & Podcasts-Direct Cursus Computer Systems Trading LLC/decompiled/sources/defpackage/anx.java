package defpackage;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.HandlerThread;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueLaunch;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class anx implements que, xnh, trm, dje, tqj {
    public static anx e;
    public int a;
    public Object b;
    public Object c;
    public Object d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        if (r4.equals("HMACSHA1") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public anx(String str, SecretKeySpec secretKeySpec) {
        int i = 0;
        urm urmVar = new urm(i, this);
        this.b = urmVar;
        this.c = str;
        this.d = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str.hashCode()) {
            case -1823053428:
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    i = 1;
                    break;
                }
                i = -1;
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    i = 2;
                    break;
                }
                i = -1;
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    i = 3;
                    break;
                }
                i = -1;
                break;
            default:
                i = -1;
                break;
        }
        switch (i) {
            case 0:
                this.a = 20;
                break;
            case 1:
                this.a = 32;
                break;
            case 2:
                this.a = 48;
                break;
            case 3:
                this.a = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        urmVar.get();
    }

    public static synchronized anx J(Context context) {
        anx anxVar;
        synchronized (anx.class) {
            try {
                if (e == null) {
                    ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new swi("MessengerIpcClient")));
                    anx anxVar2 = new anx();
                    anxVar2.d = new wix(anxVar2);
                    anxVar2.a = 1;
                    anxVar2.c = unconfigurableScheduledExecutorService;
                    anxVar2.b = context.getApplicationContext();
                    e = anxVar2;
                }
                anxVar = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return anxVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(7:5|6|(1:(1:(1:(1:(1:(2:13|14)(6:16|17|18|19|20|21))(10:27|28|29|30|31|32|33|34|(3:37|20|21)|36))(7:44|45|46|47|48|49|50))(11:56|57|58|59|60|61|62|63|64|(4:66|48|49|50)|36))(3:76|77|78))(16:115|116|117|118|119|120|121|122|123|124|125|126|127|128|(1:130)|36)|80|81|82|(3:87|(10:89|57|58|59|60|61|62|63|64|(0))|36)(3:86|49|50)))|153|6|(0)(0)|80|81|82|(1:84)|87|(0)|36|(2:(0)|(1:96))) */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x016f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0170, code lost:
    
        r14 = null;
        r6 = r11;
        r11 = r9;
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0176, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0177, code lost:
    
        r14 = null;
        r16 = r11;
        r11 = r9;
        r9 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    /* JADX WARN: Type inference failed for: r14v15, types: [g4q, ii3, k1l, tqn] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v4, types: [g4q, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(anx anxVar, g4q g4qVar, g4q g4qVar2, PlaybackCommand$QueueLaunch playbackCommand$QueueLaunch, ii3 ii3Var, cg6 cg6Var) {
        i1l i1lVar;
        nm6 nm6Var;
        int i;
        tqn tqnVar;
        g4q g4qVar3;
        g4q g4qVar4;
        ii3 ii3Var2;
        Object obj;
        tqn tqnVar2;
        bsn bsnVar;
        g4q g4qVar5;
        ii3 ii3Var3;
        ?? r14;
        Throwable th;
        k1l k1lVar;
        oqi oqiVar;
        int i2;
        ii3 ii3Var4;
        ii3 ii3Var5;
        tqn tqnVar3;
        int i3;
        Object obj2;
        oqi oqiVar2;
        l8j l8jVar;
        rfg rfgVar;
        ?? r142;
        oqi oqiVar3;
        l8j l8jVar2;
        rfg rfgVar2;
        Continuation continuation;
        oqi oqiVar4;
        Object obj3;
        Object obj4;
        oqi oqiVar5 = (qqi) anxVar.c;
        k1l k1lVar2 = (k1l) anxVar.d;
        x3l x3lVar = k1lVar2.b;
        if (cg6Var instanceof i1l) {
            i1lVar = (i1l) cg6Var;
            int i4 = i1lVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                i1lVar.t = i4 - Integer.MIN_VALUE;
                Object obj5 = i1lVar.r;
                nm6Var = nm6.a;
                i = i1lVar.t;
                Continuation continuation2 = null;
                if (i != 0) {
                    qgg.h0(obj5);
                    tqnVar = new tqn();
                    try {
                        bsnVar = k1lVar2.a;
                        g4qVar3 = g4qVar;
                    } catch (CancellationException e2) {
                        e = e2;
                        g4qVar3 = g4qVar;
                    } catch (Throwable th2) {
                        th = th2;
                        g4qVar3 = g4qVar;
                    }
                    try {
                        i1lVar.j = g4qVar3;
                        g4qVar4 = g4qVar2;
                        try {
                            i1lVar.k = g4qVar4;
                            ii3Var2 = ii3Var;
                            try {
                                try {
                                    i1lVar.l = ii3Var2;
                                    i1lVar.m = tqnVar;
                                    i1lVar.n = tqnVar;
                                    i1lVar.t = 1;
                                    try {
                                        obj5 = a4g.O(new rfg(playbackCommand$QueueLaunch, bsnVar, continuation2, 25), i1lVar);
                                        if (obj5 != nm6Var) {
                                            g4qVar5 = g4qVar3;
                                            ii3Var3 = ii3Var2;
                                            tqnVar2 = tqnVar;
                                        }
                                    } catch (CancellationException e3) {
                                        e = e3;
                                        obj = null;
                                        tqnVar2 = tqnVar;
                                        ssg.a(3, k1l.i, "Queue launch was cancelled", e);
                                        throw e;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    r14 = 0;
                                    String str = k1l.i;
                                    k5r.v("successfulQueueLaunch=", tqnVar.a, 3, str, r14);
                                    if (g4qVar3 != x3lVar.b.getValue() && g4qVar4 == x3lVar.d.getValue()) {
                                        ssg.a(3, str, "Current queue hasn't changed", r14);
                                        throw th;
                                    }
                                    i1lVar.j = r14;
                                    i1lVar.k = r14;
                                    i1lVar.l = ii3Var2;
                                    i1lVar.m = tqnVar;
                                    i1lVar.n = th;
                                    i1lVar.o = oqiVar5;
                                    i1lVar.p = k1lVar2;
                                    i1lVar.q = 0;
                                    i1lVar.t = 4;
                                    if (oqiVar5.a(i1lVar) != nm6Var) {
                                        th = th;
                                        k1lVar = k1lVar2;
                                        oqiVar = oqiVar5;
                                        i2 = 0;
                                        ii3Var4 = ii3Var2;
                                        r142 = r14;
                                        l8jVar2 = l8j.c;
                                        continuation = r142;
                                        rfgVar2 = new rfg(tqnVar, ii3Var4, k1lVar, continuation, 18);
                                        i1lVar.j = r142;
                                        i1lVar.k = r142;
                                        i1lVar.l = r142;
                                        i1lVar.m = r142;
                                        i1lVar.n = th;
                                        i1lVar.o = oqiVar;
                                        i1lVar.p = r142;
                                        i1lVar.q = i2;
                                        i1lVar.t = 5;
                                        if (x97.V(l8jVar2, rfgVar2, i1lVar) != nm6Var) {
                                        }
                                    }
                                    return nm6Var;
                                }
                            } catch (CancellationException e4) {
                                e = e4;
                            }
                        } catch (CancellationException e5) {
                            e = e5;
                            ii3Var2 = ii3Var;
                            obj = null;
                            tqnVar2 = tqnVar;
                            ssg.a(3, k1l.i, "Queue launch was cancelled", e);
                            throw e;
                        } catch (Throwable th4) {
                            th = th4;
                            ii3Var2 = ii3Var;
                            r14 = 0;
                            String str2 = k1l.i;
                            k5r.v("successfulQueueLaunch=", tqnVar.a, 3, str2, r14);
                            if (g4qVar3 != x3lVar.b.getValue()) {
                            }
                            i1lVar.j = r14;
                            i1lVar.k = r14;
                            i1lVar.l = ii3Var2;
                            i1lVar.m = tqnVar;
                            i1lVar.n = th;
                            i1lVar.o = oqiVar5;
                            i1lVar.p = k1lVar2;
                            i1lVar.q = 0;
                            i1lVar.t = 4;
                            if (oqiVar5.a(i1lVar) != nm6Var) {
                            }
                            return nm6Var;
                        }
                    } catch (CancellationException e6) {
                        e = e6;
                        g4qVar4 = g4qVar2;
                        ii3Var2 = ii3Var;
                        obj = null;
                        tqnVar2 = tqnVar;
                        ssg.a(3, k1l.i, "Queue launch was cancelled", e);
                        throw e;
                    } catch (Throwable th5) {
                        th = th5;
                        g4qVar4 = g4qVar2;
                        ii3Var2 = ii3Var;
                        r14 = 0;
                        String str22 = k1l.i;
                        k5r.v("successfulQueueLaunch=", tqnVar.a, 3, str22, r14);
                        if (g4qVar3 != x3lVar.b.getValue()) {
                        }
                        i1lVar.j = r14;
                        i1lVar.k = r14;
                        i1lVar.l = ii3Var2;
                        i1lVar.m = tqnVar;
                        i1lVar.n = th;
                        i1lVar.o = oqiVar5;
                        i1lVar.p = k1lVar2;
                        i1lVar.q = 0;
                        i1lVar.t = 4;
                        if (oqiVar5.a(i1lVar) != nm6Var) {
                        }
                        return nm6Var;
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    tqnVar = (tqn) i1lVar.n;
                    tqnVar2 = i1lVar.m;
                    ii3Var3 = i1lVar.l;
                    g4qVar4 = i1lVar.k;
                    g4qVar5 = i1lVar.j;
                    try {
                        qgg.h0(obj5);
                    } catch (CancellationException e7) {
                        e = e7;
                        ii3Var2 = ii3Var3;
                        g4qVar3 = g4qVar5;
                        obj = null;
                        try {
                            ssg.a(3, k1l.i, "Queue launch was cancelled", e);
                            throw e;
                        } catch (Throwable th6) {
                            th = th6;
                            tqnVar = tqnVar2;
                            r14 = obj;
                            String str222 = k1l.i;
                            k5r.v("successfulQueueLaunch=", tqnVar.a, 3, str222, r14);
                            if (g4qVar3 != x3lVar.b.getValue()) {
                            }
                            i1lVar.j = r14;
                            i1lVar.k = r14;
                            i1lVar.l = ii3Var2;
                            i1lVar.m = tqnVar;
                            i1lVar.n = th;
                            i1lVar.o = oqiVar5;
                            i1lVar.p = k1lVar2;
                            i1lVar.q = 0;
                            i1lVar.t = 4;
                            if (oqiVar5.a(i1lVar) != nm6Var) {
                            }
                            return nm6Var;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        ii3Var2 = ii3Var3;
                        g4qVar3 = g4qVar5;
                        tqnVar = tqnVar2;
                        r14 = 0;
                        String str2222 = k1l.i;
                        k5r.v("successfulQueueLaunch=", tqnVar.a, 3, str2222, r14);
                        if (g4qVar3 != x3lVar.b.getValue()) {
                        }
                        i1lVar.j = r14;
                        i1lVar.k = r14;
                        i1lVar.l = ii3Var2;
                        i1lVar.m = tqnVar;
                        i1lVar.n = th;
                        i1lVar.o = oqiVar5;
                        i1lVar.p = k1lVar2;
                        i1lVar.q = 0;
                        i1lVar.t = 4;
                        if (oqiVar5.a(i1lVar) != nm6Var) {
                        }
                        return nm6Var;
                    }
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            oqiVar2 = (oqi) i1lVar.n;
                            try {
                                qgg.h0(obj5);
                                obj2 = null;
                                oqiVar2.b(obj2);
                                return Unit.a;
                            } catch (Throwable th8) {
                                th = th8;
                                obj2 = null;
                                oqiVar2.b(obj2);
                                throw th;
                            }
                        }
                        if (i != 4) {
                            if (i != 5) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqi oqiVar6 = (oqi) i1lVar.o;
                            th = (Throwable) i1lVar.n;
                            try {
                                qgg.h0(obj5);
                                obj4 = null;
                                oqiVar4 = oqiVar6;
                                oqiVar4.b(obj4);
                                throw th;
                            } catch (Throwable th9) {
                                th = th9;
                                obj3 = null;
                                oqiVar3 = oqiVar6;
                                oqiVar3.b(obj3);
                                throw th;
                            }
                        }
                        i2 = i1lVar.q;
                        k1l k1lVar3 = i1lVar.p;
                        oqi oqiVar7 = (oqi) i1lVar.o;
                        Throwable th10 = (Throwable) i1lVar.n;
                        tqnVar = i1lVar.m;
                        ii3Var4 = i1lVar.l;
                        qgg.h0(obj5);
                        k1lVar = k1lVar3;
                        r142 = 0;
                        oqiVar = oqiVar7;
                        th = th10;
                        try {
                            l8jVar2 = l8j.c;
                            continuation = r142;
                        } catch (Throwable th11) {
                            th = th11;
                        }
                        try {
                            rfgVar2 = new rfg(tqnVar, ii3Var4, k1lVar, continuation, 18);
                            i1lVar.j = r142;
                            i1lVar.k = r142;
                            i1lVar.l = r142;
                            i1lVar.m = r142;
                            i1lVar.n = th;
                            i1lVar.o = oqiVar;
                            i1lVar.p = r142;
                            i1lVar.q = i2;
                            i1lVar.t = 5;
                            if (x97.V(l8jVar2, rfgVar2, i1lVar) != nm6Var) {
                                oqiVar4 = oqiVar;
                                obj4 = r142;
                                oqiVar4.b(obj4);
                                throw th;
                            }
                            return nm6Var;
                        } catch (Throwable th12) {
                            th = th12;
                            r142 = continuation;
                            oqiVar3 = oqiVar;
                            obj3 = r142;
                            oqiVar3.b(obj3);
                            throw th;
                        }
                    }
                    i3 = i1lVar.q;
                    k1lVar2 = (k1l) i1lVar.o;
                    oqiVar5 = (oqi) i1lVar.n;
                    tqnVar3 = i1lVar.m;
                    ii3Var5 = i1lVar.l;
                    qgg.h0(obj5);
                    try {
                        l8jVar = l8j.c;
                        try {
                            rfgVar = new rfg(tqnVar3, ii3Var5, k1lVar2, continuation2, 18);
                            obj2 = null;
                            try {
                                i1lVar.j = null;
                                i1lVar.k = null;
                                i1lVar.l = null;
                                i1lVar.m = null;
                                i1lVar.n = oqiVar5;
                                i1lVar.o = null;
                                i1lVar.q = i3;
                                i1lVar.t = 3;
                                if (x97.V(l8jVar, rfgVar, i1lVar) != nm6Var) {
                                    oqiVar2 = oqiVar5;
                                    oqiVar2.b(obj2);
                                    return Unit.a;
                                }
                                return nm6Var;
                            } catch (Throwable th13) {
                                th = th13;
                                oqiVar2 = oqiVar5;
                                oqiVar2.b(obj2);
                                throw th;
                            }
                        } catch (Throwable th14) {
                            th = th14;
                            obj2 = null;
                        }
                    } catch (Throwable th15) {
                        th = th15;
                        obj2 = null;
                    }
                }
                tqnVar.a = ((Boolean) obj5).booleanValue();
                String str3 = k1l.i;
                k5r.v("successfulQueueLaunch=", tqnVar2.a, 3, str3, null);
                if (g4qVar5 != x3lVar.b.getValue() && g4qVar4 == x3lVar.d.getValue()) {
                    ssg.a(3, str3, "Current queue hasn't changed", null);
                    return Unit.a;
                }
                i1lVar.j = null;
                i1lVar.k = null;
                i1lVar.l = ii3Var3;
                i1lVar.m = tqnVar2;
                i1lVar.n = oqiVar5;
                i1lVar.o = k1lVar2;
                i1lVar.q = 0;
                i1lVar.t = 2;
                if (oqiVar5.a(i1lVar) != nm6Var) {
                    ii3Var5 = ii3Var3;
                    tqnVar3 = tqnVar2;
                    i3 = 0;
                    l8jVar = l8j.c;
                    rfgVar = new rfg(tqnVar3, ii3Var5, k1lVar2, continuation2, 18);
                    obj2 = null;
                    i1lVar.j = null;
                    i1lVar.k = null;
                    i1lVar.l = null;
                    i1lVar.m = null;
                    i1lVar.n = oqiVar5;
                    i1lVar.o = null;
                    i1lVar.q = i3;
                    i1lVar.t = 3;
                    if (x97.V(l8jVar, rfgVar, i1lVar) != nm6Var) {
                    }
                }
                return nm6Var;
            }
        }
        i1lVar = new i1l(anxVar, cg6Var);
        Object obj52 = i1lVar.r;
        nm6Var = nm6.a;
        i = i1lVar.t;
        Continuation continuation22 = null;
        if (i != 0) {
        }
        tqnVar.a = ((Boolean) obj52).booleanValue();
        String str32 = k1l.i;
        k5r.v("successfulQueueLaunch=", tqnVar2.a, 3, str32, null);
        if (g4qVar5 != x3lVar.b.getValue()) {
        }
        i1lVar.j = null;
        i1lVar.k = null;
        i1lVar.l = ii3Var3;
        i1lVar.m = tqnVar2;
        i1lVar.n = oqiVar5;
        i1lVar.o = k1lVar2;
        i1lVar.q = 0;
        i1lVar.t = 2;
        if (oqiVar5.a(i1lVar) != nm6Var) {
        }
        return nm6Var;
    }

    public float A(int i) {
        return ((Number) ((SparseArray) this.d).get(i, Float.valueOf(0.0f))).floatValue();
    }

    public vsr B(ssr ssrVar) {
        ssrVar.getClass();
        Context context = (Context) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        int i = this.a;
        return ((e9r) arrayList.get(i)).a(new anx(context, ssrVar, arrayList, i + 1));
    }

    public void C() {
        HandlerThread handlerThread;
        synchronized (this.b) {
            try {
                vq1.A(this.a > 0);
                int i = this.a - 1;
                this.a = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.d) != null) {
                    handlerThread.quit();
                    this.d = null;
                    this.c = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(6:(2:3|(12:5|6|(1:(3:(1:(5:11|12|13|14|15)(2:21|22))(10:23|24|25|26|27|28|29|30|(3:33|14|15)|32)|19|20)(1:43))(3:51|(1:53)|32)|44|45|(2:47|(2:49|32)(2:50|26))|27|28|29|30|(0)|32))|28|29|30|(0)|32)|54|6|(0)(0)|44|45|(0)|27|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0097, code lost:
    
        r0 = r11;
        r11 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080 A[Catch: all -> 0x0096, TryCatch #1 {all -> 0x0096, blocks: (B:27:0x009b, B:30:0x00ab, B:36:0x00cb, B:37:0x00ce, B:45:0x007a, B:47:0x0080, B:29:0x00a4), top: B:44:0x007a, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r5v10, types: [oqi] */
    /* JADX WARN: Type inference failed for: r8v4, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object D(cg6 cg6Var) {
        j1l j1lVar;
        nm6 nm6Var;
        int i;
        qqi qqiVar;
        k1l k1lVar;
        int i2;
        rar rarVar;
        k1l k1lVar2;
        qqi qqiVar2;
        oqi oqiVar;
        Throwable th;
        ReentrantLock reentrantLock;
        cr crVar;
        tf6 tf6Var;
        try {
            if (cg6Var instanceof j1l) {
                j1lVar = (j1l) cg6Var;
                int i3 = j1lVar.p;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    j1lVar.p = i3 - Integer.MIN_VALUE;
                    Object obj = j1lVar.n;
                    nm6Var = nm6.a;
                    i = j1lVar.p;
                    int i4 = 0;
                    if (i != 0) {
                        qgg.h0(obj);
                        ssg.a(3, k1l.i, "reset()", null);
                        qqiVar = (qqi) this.c;
                        k1l k1lVar3 = (k1l) this.d;
                        j1lVar.j = qqiVar;
                        j1lVar.k = k1lVar3;
                        j1lVar.l = 0;
                        j1lVar.p = 1;
                        if (qqiVar.a(j1lVar) != nm6Var) {
                            k1lVar = k1lVar3;
                            i2 = 0;
                        }
                        return nm6Var;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            i4 = j1lVar.m;
                            i2 = j1lVar.l;
                            k1lVar2 = j1lVar.k;
                            ?? r5 = j1lVar.j;
                            try {
                                qgg.h0(obj);
                                qqiVar2 = r5;
                                qqiVar = qqiVar2;
                                k1lVar = k1lVar2;
                                j6e j6eVar = k1lVar.f;
                                reentrantLock = (ReentrantLock) j6eVar.b;
                                reentrantLock.lock();
                                ((zx0) j6eVar.a).clear();
                                reentrantLock.unlock();
                                crVar = k1lVar.g;
                                tf6Var = k1lVar.d;
                                j1lVar.j = qqiVar;
                                j1lVar.k = null;
                                j1lVar.l = i2;
                                j1lVar.m = i4;
                                j1lVar.p = 3;
                                if (crVar.f0(tf6Var, j1lVar) != nm6Var) {
                                    oqiVar = qqiVar;
                                    oqiVar.b(null);
                                    return Unit.a;
                                }
                                return nm6Var;
                            } catch (Throwable th2) {
                                th = th2;
                                oqiVar = r5;
                            }
                        } else {
                            if (i != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = j1lVar.j;
                            try {
                                qgg.h0(obj);
                                oqiVar.b(null);
                                return Unit.a;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        oqiVar.b(null);
                        throw th;
                    }
                    i2 = j1lVar.l;
                    k1lVar = j1lVar.k;
                    ?? r8 = j1lVar.j;
                    qgg.h0(obj);
                    qqiVar = r8;
                    rarVar = (rar) this.b;
                    if (rarVar != null) {
                        j1lVar.j = qqiVar;
                        j1lVar.k = k1lVar;
                        j1lVar.l = i2;
                        j1lVar.m = 0;
                        j1lVar.p = 2;
                        if (saf.C(rarVar, j1lVar) == nm6Var) {
                            return nm6Var;
                        }
                        k1lVar2 = k1lVar;
                        qqiVar2 = qqiVar;
                        qqiVar = qqiVar2;
                        k1lVar = k1lVar2;
                    }
                    j6e j6eVar2 = k1lVar.f;
                    reentrantLock = (ReentrantLock) j6eVar2.b;
                    reentrantLock.lock();
                    ((zx0) j6eVar2.a).clear();
                    reentrantLock.unlock();
                    crVar = k1lVar.g;
                    tf6Var = k1lVar.d;
                    j1lVar.j = qqiVar;
                    j1lVar.k = null;
                    j1lVar.l = i2;
                    j1lVar.m = i4;
                    j1lVar.p = 3;
                    if (crVar.f0(tf6Var, j1lVar) != nm6Var) {
                    }
                    return nm6Var;
                }
            }
            ((zx0) j6eVar2.a).clear();
            reentrantLock.unlock();
            crVar = k1lVar.g;
            tf6Var = k1lVar.d;
            j1lVar.j = qqiVar;
            j1lVar.k = null;
            j1lVar.l = i2;
            j1lVar.m = i4;
            j1lVar.p = 3;
            if (crVar.f0(tf6Var, j1lVar) != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th4) {
            reentrantLock.unlock();
            throw th4;
        }
        j1lVar = new j1l(this, cg6Var);
        Object obj2 = j1lVar.n;
        nm6Var = nm6.a;
        i = j1lVar.p;
        int i42 = 0;
        if (i != 0) {
        }
        rarVar = (rar) this.b;
        if (rarVar != null) {
        }
        j6e j6eVar22 = k1lVar.f;
        reentrantLock = (ReentrantLock) j6eVar22.b;
        reentrantLock.lock();
    }

    public void E(int i, float f) {
        SparseArray sparseArray = (SparseArray) this.d;
        if (f == 0.0f) {
            sparseArray.remove(i);
        } else {
            sparseArray.put(i, Float.valueOf(Math.abs(f)));
        }
    }

    public void F(pxj pxjVar, int i) {
        if (pxjVar == null) {
            ((pxj) this.d).a(i);
            G();
            return;
        }
        pxjVar.a(i);
        jsg jsgVar = new jsg(11);
        pxjVar.c(Math.min(pxjVar.c, ((pxj) pxjVar.g.d).c), jsgVar);
        if (jsgVar.b > 0) {
            try {
                ((ynb) this.c).flush();
            } catch (IOException e2) {
                b6e.q(e2);
            }
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public void G() {
        /*
            r13 = this;
            java.lang.Object r0 = r13.b
            noj r0 = (defpackage.noj) r0
            pxj[] r1 = r0.j()
            java.util.List r2 = java.util.Arrays.asList(r1)
            java.util.Collections.shuffle(r2)
            java.lang.Object r2 = r13.d
            pxj r2 = (defpackage.pxj) r2
            int r2 = r2.c
            int r3 = r1.length
        L16:
            r4 = 0
            if (r3 <= 0) goto L6a
            if (r2 <= 0) goto L6a
            float r5 = (float) r2
            float r6 = (float) r3
            float r5 = r5 / r6
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            r6 = r4
            r7 = r6
        L26:
            if (r7 >= r3) goto L68
            if (r2 <= 0) goto L68
            r8 = r1[r7]
            int r9 = r8.c
            hi3 r10 = r8.a
            long r11 = r10.b
            int r11 = (int) r11
            int r9 = java.lang.Math.min(r9, r11)
            int r9 = java.lang.Math.max(r4, r9)
            int r11 = r8.d
            int r9 = r9 - r11
            int r9 = java.lang.Math.min(r9, r5)
            int r9 = java.lang.Math.min(r2, r9)
            if (r9 <= 0) goto L4e
            int r11 = r8.d
            int r11 = r11 + r9
            r8.d = r11
            int r2 = r2 - r9
        L4e:
            int r9 = r8.c
            long r10 = r10.b
            int r10 = (int) r10
            int r9 = java.lang.Math.min(r9, r10)
            int r9 = java.lang.Math.max(r4, r9)
            int r10 = r8.d
            int r9 = r9 - r10
            if (r9 <= 0) goto L65
            int r9 = r6 + 1
            r1[r6] = r8
            r6 = r9
        L65:
            int r7 = r7 + 1
            goto L26
        L68:
            r3 = r6
            goto L16
        L6a:
            jsg r1 = new jsg
            r2 = 11
            r1.<init>(r2)
            pxj[] r0 = r0.j()
            int r2 = r0.length
            r3 = r4
        L77:
            if (r3 >= r2) goto L85
            r5 = r0[r3]
            int r6 = r5.d
            r5.c(r6, r1)
            r5.d = r4
            int r3 = r3 + 1
            goto L77
        L85:
            int r0 = r1.b
            if (r0 <= 0) goto L95
            java.lang.Object r0 = r13.c     // Catch: java.io.IOException -> L91
            ynb r0 = (defpackage.ynb) r0     // Catch: java.io.IOException -> L91
            r0.flush()     // Catch: java.io.IOException -> L91
            return
        L91:
            r0 = move-exception
            defpackage.b6e.q(r0)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anx.G():void");
    }

    public void H(char[] cArr, int i) {
        byte[] bArr = (byte[]) this.c;
        if (i < 0) {
            xq0.x("count < 0");
            return;
        }
        if (i > cArr.length) {
            xq0.l(cArr.length, k5r.q(i, "count > string.length: ", " > "));
            return;
        }
        int i2 = 0;
        while (i2 < i) {
            char c = cArr[i2];
            if (c < 128) {
                if (bArr.length - this.a < 1) {
                    v();
                }
                int i3 = this.a;
                int i4 = i3 + 1;
                this.a = i4;
                bArr[i3] = (byte) c;
                i2++;
                int min = Math.min(i, (bArr.length - i4) + i2);
                while (i2 < min) {
                    char c2 = cArr[i2];
                    if (c2 < 128) {
                        int i5 = this.a;
                        this.a = i5 + 1;
                        bArr[i5] = (byte) c2;
                        i2++;
                    }
                }
            } else {
                if (c < 2048) {
                    if (bArr.length - this.a < 2) {
                        v();
                    }
                    int i6 = this.a;
                    int i7 = i6 + 1;
                    this.a = i7;
                    bArr[i6] = (byte) ((c >> 6) | 192);
                    this.a = i6 + 2;
                    bArr[i7] = (byte) ((c & '?') | 128);
                } else if (c < 55296 || c > 57343) {
                    if (bArr.length - this.a < 3) {
                        v();
                    }
                    int i8 = this.a;
                    int i9 = i8 + 1;
                    this.a = i9;
                    bArr[i8] = (byte) ((c >> '\f') | 224);
                    int i10 = i8 + 2;
                    this.a = i10;
                    bArr[i9] = (byte) (((c >> 6) & 63) | 128);
                    this.a = i8 + 3;
                    bArr[i10] = (byte) ((c & '?') | 128);
                } else {
                    int i11 = i2 + 1;
                    char c3 = i11 < i ? cArr[i11] : (char) 0;
                    if (c > 56319 || 56320 > c3 || c3 >= 57344) {
                        if (bArr.length - this.a < 1) {
                            v();
                        }
                        int i12 = this.a;
                        this.a = i12 + 1;
                        bArr[i12] = (byte) 63;
                        i2 = i11;
                    } else {
                        int i13 = (((c & 1023) << 10) | (c3 & 1023)) + SQLiteDatabase.OPEN_FULLMUTEX;
                        if (bArr.length - this.a < 4) {
                            v();
                        }
                        int i14 = this.a;
                        int i15 = i14 + 1;
                        this.a = i15;
                        bArr[i14] = (byte) ((i13 >> 18) | 240);
                        int i16 = i14 + 2;
                        this.a = i16;
                        bArr[i15] = (byte) (((i13 >> 12) & 63) | 128);
                        int i17 = i14 + 3;
                        this.a = i17;
                        bArr[i16] = (byte) (((i13 >> 6) & 63) | 128);
                        this.a = i14 + 4;
                        bArr[i17] = (byte) ((i13 & 63) | 128);
                        i2 += 2;
                    }
                }
                i2++;
            }
        }
    }

    public void I(Throwable th) {
        boolean z = th instanceof TimeoutException;
        r5x r5xVar = (r5x) this.d;
        if (z) {
            r5xVar.G(114, 28, b6x.u);
            l8x.h("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            r5xVar.G(107, 28, b6x.u);
            l8x.h("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        ((Runnable) this.c).run();
    }

    public synchronized onx K(lkx lkxVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(lkxVar.toString()));
            }
            if (!((wix) this.d).d(lkxVar)) {
                wix wixVar = new wix(this);
                this.d = wixVar;
                wixVar.d(lkxVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return lkxVar.b.a;
    }

    @Override // defpackage.xnh
    public int a() {
        return this.a;
    }

    @Override // defpackage.dje
    public void b(int i) {
        SparseArray sparseArray = (SparseArray) this.d;
        sparseArray.clear();
        sparseArray.put(i, Float.valueOf(1.0f));
    }

    @Override // defpackage.dje
    public weo c(int i) {
        pje pjeVar = (pje) this.b;
        wdp wdpVar = pjeVar.c;
        wdp wdpVar2 = pjeVar.b;
        if (wdpVar2 instanceof nje) {
            float f = ((nje) wdpVar).l.i;
            return new lje(su4.e(((nje) wdpVar2).l.i, f, A(i), f));
        }
        if (!(wdpVar2 instanceof oje)) {
            b6e.s();
            return null;
        }
        oje ojeVar = (oje) wdpVar;
        float f2 = ojeVar.m;
        mje mjeVar = ojeVar.l;
        float f3 = mjeVar.i + f2;
        oje ojeVar2 = (oje) wdpVar2;
        float f4 = ojeVar2.m;
        mje mjeVar2 = ojeVar2.l;
        float e2 = su4.e(mjeVar2.i + f4, f3, A(i), f3);
        float f5 = mjeVar.j + f2;
        float e3 = su4.e(mjeVar2.j + f4, f5, A(i), f5);
        float f6 = mjeVar.k;
        return new mje(e2, e3, su4.e(mjeVar2.k, f6, A(i), f6));
    }

    @Override // defpackage.dje
    public int d(int i) {
        pje pjeVar = (pje) this.b;
        wdp wdpVar = pjeVar.b;
        if (!(wdpVar instanceof oje)) {
            return 0;
        }
        oje ojeVar = (oje) pjeVar.c;
        Object evaluate = ((ArgbEvaluator) this.c).evaluate(A(i), Integer.valueOf(ojeVar.n), Integer.valueOf(((oje) wdpVar).n));
        evaluate.getClass();
        return ((Integer) evaluate).intValue();
    }

    @Override // defpackage.que
    public void e(char c) {
        byte[] bArr = (byte[]) this.c;
        if (c < 128) {
            if (bArr.length - this.a < 1) {
                v();
            }
            int i = this.a;
            this.a = i + 1;
            bArr[i] = (byte) c;
            return;
        }
        if (c < 2048) {
            if (bArr.length - this.a < 2) {
                v();
            }
            int i2 = this.a;
            int i3 = i2 + 1;
            this.a = i3;
            bArr[i2] = (byte) ((c >> 6) | 192);
            this.a = i2 + 2;
            bArr[i3] = (byte) ((c & '?') | 128);
            return;
        }
        if (55296 <= c && c < 57344) {
            if (bArr.length - this.a < 1) {
                v();
            }
            int i4 = this.a;
            this.a = i4 + 1;
            bArr[i4] = (byte) 63;
            return;
        }
        if (c < 0) {
            if (bArr.length - this.a < 3) {
                v();
            }
            int i5 = this.a;
            int i6 = i5 + 1;
            this.a = i6;
            bArr[i5] = (byte) 224;
            int i7 = i5 + 2;
            this.a = i7;
            bArr[i6] = (byte) (((c >> 6) & 63) | 128);
            this.a = i5 + 3;
            bArr[i7] = (byte) ((c & '?') | 128);
            return;
        }
        if (c > 65535) {
            throw new c5f(k5r.i(c, "Unexpected code point: "));
        }
        if (bArr.length - this.a < 4) {
            v();
        }
        int i8 = this.a;
        int i9 = i8 + 1;
        this.a = i9;
        bArr[i8] = (byte) 240;
        int i10 = i8 + 2;
        this.a = i10;
        bArr[i9] = (byte) 128;
        int i11 = i8 + 3;
        this.a = i11;
        bArr[i10] = (byte) (((c >> 6) & 63) | 128);
        this.a = i8 + 4;
        bArr[i11] = (byte) ((c & '?') | 128);
    }

    @Override // defpackage.dje
    public void f(int i, float f) {
        E(i, 1.0f - f);
        int i2 = this.a;
        if (i < i2 - 1) {
            E(i + 1, f);
        } else if (i2 > 1) {
            E(0, f);
        }
    }

    @Override // defpackage.dje
    public void h(int i) {
        this.a = i;
    }

    @Override // defpackage.dje
    public RectF i(float f, float f2, float f3, boolean z) {
        return null;
    }

    @Override // defpackage.dje
    public int k(int i) {
        float A = A(i);
        pje pjeVar = (pje) this.b;
        Object evaluate = ((ArgbEvaluator) this.c).evaluate(A, Integer.valueOf(pjeVar.c.h0()), Integer.valueOf(pjeVar.b.h0()));
        evaluate.getClass();
        return ((Integer) evaluate).intValue();
    }

    @Override // defpackage.xnh
    public onh l(int i) {
        hoh hohVar;
        Bundle e2;
        String str;
        onh[] onhVarArr = (onh[]) this.d;
        if (i < 0 || i >= ((List) this.b).size()) {
            return null;
        }
        onh onhVar = onhVarArr[i];
        if (onhVar != null) {
            return onhVar;
        }
        sj sjVar = (sj) this.c;
        mwk mwkVar = (mwk) ((List) sjVar.d).get(i);
        boolean z = i == sjVar.a;
        kfj kfjVar = (kfj) dag.p(mwkVar, (jtc) sjVar.e);
        String pathForSize = kfjVar.e.a.getPathForSize(frv.b());
        pathForSize.getClass();
        Uri parse = Uri.parse(pathForSize);
        if (z) {
            hohVar = ((rnh) sjVar.c).a;
            if (hohVar == null) {
                hohVar = hoh.K;
                hohVar.getClass();
            }
        } else {
            hohVar = hoh.K;
            hohVar.getClass();
        }
        g8c g8cVar = (g8c) sjVar.f;
        if (z) {
            g8cVar.getClass();
            e2 = g8c.e(mwkVar, kfjVar);
            cgh cghVar = (cgh) g8cVar.a;
            j1g j1gVar = cghVar.b;
            j1gVar.getClass();
            int ordinal = j1gVar.ordinal();
            if (ordinal == 0) {
                str = "liked";
            } else if (ordinal == 1) {
                str = "neutral";
            } else {
                if (ordinal != 2) {
                    b6e.s();
                    return null;
                }
                str = "disliked";
            }
            e2.putString("com.yandex.music.media.metadata.like_state", str);
            e2.putBoolean("com.yandex.music.media.metadata.like_support", cghVar.c);
            e2.putBoolean("com.yandex.music.media.metadata.dislike_support", cghVar.d);
        } else {
            g8cVar.getClass();
            e2 = g8c.e(mwkVar, kfjVar);
        }
        eoh a = hohVar.a();
        String str2 = kfjVar.a;
        a.e = str2;
        a.a = str2;
        a.f = kfjVar.b;
        String str3 = kfjVar.d;
        a.b = str3;
        a.c = kfjVar.c;
        a.d = str3;
        a.m = parse;
        if (z) {
            a.i = ((cgh) sjVar.b).a;
        }
        a.H = e2;
        hoh hohVar2 = new hoh(a);
        xmh xmhVar = new xmh();
        ude udeVar = yde.b;
        qsn qsnVar = qsn.e;
        List list = Collections.EMPTY_LIST;
        dnh dnhVar = new dnh();
        jnh jnhVar = jnh.d;
        String b = mwkVar.b();
        b.getClass();
        onh onhVar2 = new onh(b, new anh(xmhVar), null, new fnh(dnhVar), hohVar2, jnhVar);
        onhVarArr[i] = onhVar2;
        return onhVar2;
    }

    @Override // defpackage.trm
    public byte[] m(int i, byte[] bArr) {
        urm urmVar = (urm) this.b;
        if (i > this.a) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) urmVar.get()).update(bArr);
        return Arrays.copyOf(((Mac) urmVar.get()).doFinal(), i);
    }

    @Override // defpackage.dje
    public float n(int i) {
        pje pjeVar = (pje) this.b;
        wdp wdpVar = pjeVar.b;
        if (!(wdpVar instanceof oje)) {
            return 0.0f;
        }
        float f = ((oje) pjeVar.c).m;
        return (A(i) * (((oje) wdpVar).m - f)) + f;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object o(PlaybackCommand$QueueLaunch playbackCommand$QueueLaunch, ii3 ii3Var, Integer num, cg6 cg6Var) {
        f1l f1lVar;
        int i;
        PlaybackCommand$QueueLaunch playbackCommand$QueueLaunch2;
        ii3 ii3Var2;
        Integer num2;
        ii3 ii3Var3;
        Integer num3;
        rar y;
        k1l k1lVar = (k1l) this.d;
        x3l x3lVar = k1lVar.b;
        if (cg6Var instanceof f1l) {
            f1lVar = (f1l) cg6Var;
            int i2 = f1lVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f1lVar.o = i2 - Integer.MIN_VALUE;
                Object obj = f1lVar.m;
                nm6 nm6Var = nm6.a;
                i = f1lVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    rar rarVar = (rar) this.b;
                    if (rarVar == null) {
                        playbackCommand$QueueLaunch2 = playbackCommand$QueueLaunch;
                        ii3Var2 = ii3Var;
                        num2 = num;
                        g4q g4qVar = (g4q) x3lVar.b.getValue();
                        g4q g4qVar2 = (g4q) x3lVar.d.getValue();
                        tf6 tf6Var = k1lVar.d;
                        if (num2 != null) {
                            y = x97.y(tf6Var, null, pm6.d, new y7b(k1lVar, this, g4qVar, g4qVar2, playbackCommand$QueueLaunch2, ii3Var2, num2, null, 7), 1);
                        } else {
                            y = x97.y(tf6Var, null, null, new ckg(this, g4qVar, g4qVar2, playbackCommand$QueueLaunch2, ii3Var2, null, 11), 3);
                        }
                        this.b = y;
                        return Unit.a;
                    }
                    f1lVar.j = playbackCommand$QueueLaunch;
                    f1lVar.k = ii3Var;
                    f1lVar.l = num;
                    f1lVar.o = 1;
                    if (saf.C(rarVar, f1lVar) == nm6Var) {
                        return nm6Var;
                    }
                    playbackCommand$QueueLaunch2 = playbackCommand$QueueLaunch;
                    ii3Var3 = ii3Var;
                    num3 = num;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    num3 = f1lVar.l;
                    ii3Var3 = f1lVar.k;
                    playbackCommand$QueueLaunch2 = f1lVar.j;
                    qgg.h0(obj);
                }
                num2 = num3;
                ii3Var2 = ii3Var3;
                g4q g4qVar3 = (g4q) x3lVar.b.getValue();
                g4q g4qVar22 = (g4q) x3lVar.d.getValue();
                tf6 tf6Var2 = k1lVar.d;
                if (num2 != null) {
                }
                this.b = y;
                return Unit.a;
            }
        }
        f1lVar = new f1l(this, cg6Var);
        Object obj2 = f1lVar.m;
        nm6 nm6Var2 = nm6.a;
        i = f1lVar.o;
        if (i != 0) {
        }
        num2 = num3;
        ii3Var2 = ii3Var3;
        g4q g4qVar32 = (g4q) x3lVar.b.getValue();
        g4q g4qVar222 = (g4q) x3lVar.d.getValue();
        tf6 tf6Var22 = k1lVar.d;
        if (num2 != null) {
        }
        this.b = y;
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.tqj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onSuccess(Object obj) {
        sbx sbxVar = (sbx) this.b;
        String str = (String) this.c;
        int i = this.a;
        SharedPreferences sharedPreferences = (SharedPreferences) this.d;
        Bundle bundle = (Bundle) obj;
        jmp jmpVar = sbxVar.a;
        y1g.G(jmpVar);
        b4x b4xVar = sbxVar.b;
        if (i != 3) {
            if (i == 2) {
                i = 2;
            }
            if (i != 1 || i == 2) {
                zfx zfxVar = new zfx(sharedPreferences, sbxVar, sbxVar.c, bundle, str);
                jmpVar.a(new uiq(19, zfxVar));
                if (b4xVar == null) {
                    ifx ifxVar = new ifx(0, zfxVar);
                    b4x.i.b("register callback = %s", ifxVar);
                    y1g.B("Must be called from the main thread.");
                    b4xVar.b.add(ifxVar);
                    return;
                }
                return;
            }
            return;
        }
        s0x s0xVar = sbxVar.c;
        tao taoVar = new tao();
        taoVar.a = sbxVar;
        taoVar.b = s0xVar;
        taoVar.c = str;
        taoVar.e = new knn(26, taoVar);
        jmpVar.a(new uiq(20, taoVar));
        if (b4xVar != null) {
            ifx ifxVar2 = new ifx(1, taoVar);
            b4x.i.b("register callback = %s", ifxVar2);
            y1g.B("Must be called from the main thread.");
            b4xVar.b.add(ifxVar2);
        }
        if (i != 1) {
        }
        zfx zfxVar2 = new zfx(sharedPreferences, sbxVar, sbxVar.c, bundle, str);
        jmpVar.a(new uiq(19, zfxVar2));
        if (b4xVar == null) {
        }
    }

    public void q(ki3 ki3Var) {
        boolean z;
        k1l k1lVar = (k1l) this.d;
        j6e j6eVar = k1lVar.f;
        zx0 zx0Var = (zx0) j6eVar.a;
        ki3Var.getClass();
        ((ReentrantLock) j6eVar.b).lock();
        try {
            if (zx0Var.c < 10) {
                zx0Var.addLast(ki3Var);
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return;
            }
            String str = k1l.i;
            ReentrantLock reentrantLock = (ReentrantLock) j6eVar.b;
            reentrantLock.lock();
            try {
                List w0 = CollectionsKt.w0((zx0) j6eVar.a);
                reentrantLock.unlock();
                cr crVar = k1lVar.g;
                w2f w2fVar = (w2f) crVar.e;
                Boolean valueOf = w2fVar != null ? Boolean.valueOf(w2fVar.b()) : null;
                w2f w2fVar2 = (w2f) crVar.e;
                Boolean valueOf2 = w2fVar2 != null ? Boolean.valueOf(w2fVar2.isCancelled()) : null;
                w2f w2fVar3 = (w2f) crVar.e;
                Boolean valueOf3 = w2fVar3 != null ? Boolean.valueOf(w2fVar3.X()) : null;
                oi oiVar = (oi) crVar.d;
                Boolean valueOf4 = oiVar != null ? Boolean.valueOf(oiVar.d.B()) : null;
                dfi.r("Commands Buffer overflow\nbuffer=" + w0 + "\nactorState=" + ("actorJob: \nisActive=" + valueOf + ", isCancelled=" + valueOf2 + ", isCompleted=" + valueOf3 + "; actor: \nisClosedForSend=" + valueOf4 + "; batchExecutionResults: \nsubscriptionCount=" + ((x0q) crVar.f).i()), str);
            } finally {
            }
        } finally {
        }
    }

    public void r(boolean z, pxj pxjVar, hi3 hi3Var, boolean z2) {
        o2g.O(hi3Var, "source");
        int min = Math.min(pxjVar.c, ((pxj) pxjVar.g.d).c);
        hi3 hi3Var2 = pxjVar.a;
        boolean z3 = hi3Var2.b > 0;
        int i = (int) hi3Var.b;
        if (z3 || min < i) {
            if (!z3 && min > 0) {
                pxjVar.b(min, hi3Var, false);
            }
            hi3Var2.t0(hi3Var, (int) hi3Var.b);
            pxjVar.f = z | pxjVar.f;
        } else {
            pxjVar.b(i, hi3Var, z);
        }
        if (z2) {
            try {
                ((ynb) this.c).flush();
            } catch (IOException e2) {
                b6e.q(e2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0064, code lost:
    
        if (r9.a(r0) == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009c A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002b, B:14:0x0094, B:16:0x009c, B:17:0x00a1), top: B:11:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b A[Catch: all -> 0x0077, TryCatch #1 {all -> 0x0077, blocks: (B:29:0x0067, B:31:0x006b, B:32:0x007a, B:34:0x007e, B:38:0x00a7, B:39:0x00ac), top: B:28:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a A[Catch: all -> 0x0077, TryCatch #1 {all -> 0x0077, blocks: (B:29:0x0067, B:31:0x006b, B:32:0x007a, B:34:0x007e, B:38:0x00a7, B:39:0x00ac), top: B:28:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r5v4, types: [oqi] */
    /* JADX WARN: Type inference failed for: r7v0, types: [anx] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object s(dyk dykVar, cg6 cg6Var) {
        g1l g1lVar;
        int i;
        qqi qqiVar;
        k1l k1lVar;
        int i2;
        oqi oqiVar;
        k1l k1lVar2;
        oi oiVar;
        try {
            if (cg6Var instanceof g1l) {
                g1lVar = (g1l) cg6Var;
                int i3 = g1lVar.p;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    g1lVar.p = i3 - Integer.MIN_VALUE;
                    Object obj = g1lVar.n;
                    nm6 nm6Var = nm6.a;
                    i = g1lVar.p;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = (qqi) this.c;
                        k1lVar = (k1l) this.d;
                        g1lVar.j = dykVar;
                        g1lVar.k = qqiVar;
                        g1lVar.l = k1lVar;
                        i2 = 0;
                        g1lVar.m = 0;
                        g1lVar.p = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            k1lVar2 = g1lVar.l;
                            oqiVar = g1lVar.k;
                            try {
                                qgg.h0(obj);
                                k1lVar = k1lVar2;
                                oiVar = (oi) k1lVar.g.d;
                                if (oiVar != null) {
                                    oiVar.c(Unit.a);
                                }
                                Unit unit = Unit.a;
                                oqiVar.b(null);
                                return unit;
                            } catch (Throwable th) {
                                th = th;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        int i4 = g1lVar.m;
                        k1lVar = g1lVar.l;
                        ?? r5 = g1lVar.k;
                        dyk dykVar2 = g1lVar.j;
                        qgg.h0(obj);
                        i2 = i4;
                        dykVar = dykVar2;
                        qqiVar = r5;
                    }
                    if (!(dykVar instanceof PlaybackCommand$QueueBound)) {
                        q(new ji3((PlaybackCommand$QueueBound) dykVar));
                        oqiVar = qqiVar;
                        oiVar = (oi) k1lVar.g.d;
                        if (oiVar != null) {
                        }
                        Unit unit2 = Unit.a;
                        oqiVar.b(null);
                        return unit2;
                    }
                    if (!(dykVar instanceof PlaybackCommand$QueueLaunch)) {
                        throw new x7j();
                    }
                    g1lVar.j = null;
                    g1lVar.k = qqiVar;
                    g1lVar.l = k1lVar;
                    g1lVar.m = i2;
                    g1lVar.p = 2;
                    if (o((PlaybackCommand$QueueLaunch) dykVar, null, null, g1lVar) != nm6Var) {
                        oqiVar = qqiVar;
                        k1lVar2 = k1lVar;
                        k1lVar = k1lVar2;
                        oiVar = (oi) k1lVar.g.d;
                        if (oiVar != null) {
                        }
                        Unit unit22 = Unit.a;
                        oqiVar.b(null);
                        return unit22;
                    }
                    return nm6Var;
                }
            }
            if (!(dykVar instanceof PlaybackCommand$QueueBound)) {
            }
        } catch (Throwable th2) {
            th = th2;
            oqiVar = qqiVar;
            oqiVar.b(null);
            throw th;
        }
        g1lVar = new g1l(this, cg6Var);
        Object obj2 = g1lVar.n;
        nm6 nm6Var2 = nm6.a;
        i = g1lVar.p;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(8:(2:3|(11:5|6|7|(1:(4:(2:11|(3:13|14|(1:16))(2:22|23))(2:24|25)|17|18|19)(1:26))(1:46)|27|28|(2:30|(1:32))(2:34|(1:36)(2:39|40))|33|17|18|19))|27|28|(0)(0)|33|17|18|19)|49|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cd, code lost:
    
        if (o(r9, r4, null, r0) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cf, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
    
        if (r7 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0044, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:28:0x0085, B:30:0x008e, B:32:0x00a2, B:34:0x00ad, B:36:0x00b1, B:39:0x00d6, B:40:0x00db), top: B:27:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:28:0x0085, B:30:0x008e, B:32:0x00a2, B:34:0x00ad, B:36:0x00b1, B:39:0x00d6, B:40:0x00db), top: B:27:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [cg6, h1l, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [oqi] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9, types: [oqi] */
    /* JADX WARN: Type inference failed for: r10v3, types: [oqi, qqi] */
    /* JADX WARN: Type inference failed for: r8v0, types: [anx] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(gyk gykVar, cg6 cg6Var) {
        ?? r0;
        int i;
        k1l k1lVar;
        int i2;
        oqi oqiVar;
        try {
            if (cg6Var instanceof h1l) {
                h1l h1lVar = (h1l) cg6Var;
                int i3 = h1lVar.p;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    h1lVar.p = i3 - Integer.MIN_VALUE;
                    r0 = h1lVar;
                    Object obj = r0.n;
                    nm6 nm6Var = nm6.a;
                    i = r0.p;
                    if (i != 0) {
                        qgg.h0(obj);
                        ?? r10 = (qqi) this.c;
                        k1lVar = (k1l) this.d;
                        r0.j = gykVar;
                        r0.k = r10;
                        r0.l = k1lVar;
                        i2 = 0;
                        r0.m = 0;
                        r0.p = 1;
                        Object a = r10.a(r0);
                        oqiVar = r10;
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                oqi oqiVar2 = r0.k;
                                qgg.h0(obj);
                                r0 = oqiVar2;
                            } else {
                                if (i != 3) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                k1l k1lVar2 = r0.l;
                                oqi oqiVar3 = r0.k;
                                qgg.h0(obj);
                                q(null);
                                oi oiVar = (oi) k1lVar2.g.d;
                                r0 = oqiVar3;
                                if (oiVar != null) {
                                    oiVar.c(Unit.a);
                                    r0 = oqiVar3;
                                }
                            }
                            Unit unit = Unit.a;
                            r0.b(null);
                            return unit;
                        }
                        int i4 = r0.m;
                        k1lVar = r0.l;
                        oqi oqiVar4 = r0.k;
                        gyk gykVar2 = r0.j;
                        qgg.h0(obj);
                        oqiVar = oqiVar4;
                        i2 = i4;
                        gykVar = gykVar2;
                    }
                    int i5 = this.a + 1;
                    this.a = i5;
                    if (!(gykVar instanceof eyk)) {
                        q(new ii3(((eyk) gykVar).a, i5));
                        oi oiVar2 = (oi) k1lVar.g.d;
                        if (oiVar2 != null) {
                            oiVar2.c(Unit.a);
                        }
                    } else {
                        if (!(gykVar instanceof fyk)) {
                            throw new x7j();
                        }
                        ii3 ii3Var = new ii3(((fyk) gykVar).b, i5);
                        PlaybackCommand$QueueLaunch playbackCommand$QueueLaunch = ((fyk) gykVar).a;
                        r0.j = null;
                        r0.k = oqiVar;
                        r0.l = null;
                        r0.m = i2;
                        r0.p = 2;
                    }
                    r0 = oqiVar;
                    Unit unit2 = Unit.a;
                    r0.b(null);
                    return unit2;
                }
            }
            int i52 = this.a + 1;
            this.a = i52;
            if (!(gykVar instanceof eyk)) {
            }
            r0 = oqiVar;
            Unit unit22 = Unit.a;
            r0.b(null);
            return unit22;
        } catch (Throwable th) {
            th = th;
            r0 = oqiVar;
            r0.b(null);
            throw th;
        }
        r0 = new h1l(this, cg6Var);
        Object obj2 = r0.n;
        nm6 nm6Var2 = nm6.a;
        i = r0.p;
        if (i != 0) {
        }
    }

    public void u(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.d;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.d = Arrays.copyOf(cArr, i3);
        }
    }

    public void v() {
        ((OutputStream) this.b).write((byte[]) this.c, 0, this.a);
        this.a = 0;
    }

    public String w(qz7 qz7Var, Uri uri, int i) {
        String str = (String) this.d;
        String str2 = (String) this.b;
        String str3 = (String) this.c;
        int i2 = this.a;
        if (i2 == 1) {
            String encodeToString = Base64.encodeToString((qz7Var.a + StringUtils.PROCESS_POSTFIX_DELIMITER + qz7Var.b).getBytes(bjo.g), 0);
            int i3 = dvt.a;
            Locale locale = Locale.US;
            return f1d.g("Basic ", encodeToString);
        }
        if (i2 != 2) {
            throw new r7k(null, new UnsupportedOperationException(), false, 4);
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            String h = cjo.h(i);
            String str4 = qz7Var.a + StringUtils.PROCESS_POSTFIX_DELIMITER + str2 + StringUtils.PROCESS_POSTFIX_DELIMITER + qz7Var.b;
            Charset charset = bjo.g;
            String k0 = dvt.k0(messageDigest.digest((dvt.k0(messageDigest.digest(str4.getBytes(charset))) + StringUtils.PROCESS_POSTFIX_DELIMITER + str3 + StringUtils.PROCESS_POSTFIX_DELIMITER + dvt.k0(messageDigest.digest((h + StringUtils.PROCESS_POSTFIX_DELIMITER + uri).getBytes(charset)))).getBytes(charset)));
            if (str.isEmpty()) {
                return String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", qz7Var.a, str2, str3, uri, k0);
            }
            return String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", qz7Var.a, str2, str3, uri, k0, str);
        } catch (NoSuchAlgorithmException e2) {
            throw new r7k(null, e2, false, 4);
        }
    }

    @Override // defpackage.que
    public void writeLong(long j) {
        z(String.valueOf(j));
    }

    public int x() {
        int i = this.a;
        if (i == 2) {
            return 2048;
        }
        if (i != 3) {
            return 0;
        }
        return RemoteCameraConfig.Mic.BUFFER_SIZE;
    }

    @Override // defpackage.que
    public void y(String str) {
        int i;
        str.getClass();
        u(0, str.length() + 2);
        char[] cArr = (char[]) this.d;
        cArr[0] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, 1);
        int i2 = length + 1;
        int i3 = 1;
        while (i3 < i2) {
            char c = cArr[i3];
            byte[] bArr = pkr.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i4 = i3 - 1; i4 < length2; i4++) {
                    u(i3, 2);
                    char charAt = str.charAt(i4);
                    byte[] bArr2 = pkr.b;
                    if (charAt < bArr2.length) {
                        byte b = bArr2[charAt];
                        if (b == 0) {
                            i = i3 + 1;
                            ((char[]) this.d)[i3] = charAt;
                        } else {
                            if (b == 1) {
                                String str2 = pkr.a[charAt];
                                str2.getClass();
                                u(i3, str2.length());
                                str2.getChars(0, str2.length(), (char[]) this.d, i3);
                                i3 = str2.length() + i3;
                            } else {
                                char[] cArr2 = (char[]) this.d;
                                cArr2[i3] = '\\';
                                cArr2[i3 + 1] = (char) b;
                                i3 += 2;
                            }
                        }
                    } else {
                        i = i3 + 1;
                        ((char[]) this.d)[i3] = charAt;
                    }
                    i3 = i;
                }
                u(i3, 1);
                char[] cArr3 = (char[]) this.d;
                cArr3[i3] = '\"';
                H(cArr3, i3 + 1);
                v();
                return;
            }
            i3++;
        }
        cArr[i2] = '\"';
        H(cArr, length + 2);
        v();
    }

    @Override // defpackage.que
    public void z(String str) {
        str.getClass();
        int length = str.length();
        u(0, length);
        str.getChars(0, length, (char[]) this.d, 0);
        H((char[]) this.d, length);
    }

    public /* synthetic */ anx(Object obj, int i, Serializable serializable, Object obj2) {
        this.b = obj;
        this.a = i;
        this.c = serializable;
        this.d = obj2;
    }

    public anx(n7q n7qVar, cgh cghVar, rnh rnhVar, o8q o8qVar, g3i g3iVar) {
        n7qVar.getClass();
        cghVar.getClass();
        rnhVar.getClass();
        List B = y7g.B(n7qVar);
        this.b = B;
        this.c = new sj(n7qVar, cghVar, rnhVar, o8qVar, g3iVar);
        int size = B.size();
        onh[] onhVarArr = new onh[size];
        for (int i = 0; i < size; i++) {
            onhVarArr[i] = null;
        }
        this.d = onhVarArr;
        this.a = ((List) this.b).size();
    }

    public /* synthetic */ anx(int i, Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.a = i;
    }

    public anx(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.b = str;
        this.a = i2;
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.c = unmodifiableList;
        this.d = bArr;
    }

    public anx(Context context, ssr ssrVar, ArrayList arrayList, int i) {
        context.getClass();
        ssrVar.getClass();
        this.b = context;
        this.c = ssrVar;
        this.d = arrayList;
        this.a = i;
    }
}
