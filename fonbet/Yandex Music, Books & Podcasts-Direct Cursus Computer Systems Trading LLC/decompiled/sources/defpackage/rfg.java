package defpackage;

import android.util.Base64;
import android.util.Log;
import com.connectsdk.service.command.ServiceCommand;
import com.yandex.media.ynison.service.e0;
import com.yandex.music.databases.main.MainDatabase;
import com.yandex.music.databases.user.UserDatabase;
import com.yandex.music.mixes.data.remote.MixesApi;
import com.yandex.music.mixes.data.remote.MixesEntitiesDto;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.modernfit.MethodHandler;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import com.yandex.pulse.metrics.o;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes4.dex */
public final class rfg extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public Object m;
    public /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public rfg(nyf nyfVar, lyf lyfVar, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.j = 29;
        this.m = nyfVar;
        this.n = lyfVar;
        this.o = (aur) function2;
    }

    private final Object k(Object obj) {
        Object obj2 = this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            ssg.a(3, "OfflineModePlaybackPlugin", vz1.q("isOffline = ", "; managing queue", booleanValue), null);
            oq7 oq7Var = ((clj) this.m).a;
            if (booleanValue) {
                d6l x = p6g.x((e6l) oq7Var.a.c.getValue());
                n7q n7qVar = x != null ? x.a : null;
                if (n7qVar != null) {
                    zkj zkjVar = (zkj) this.n;
                    this.l = null;
                    this.k = 1;
                    if (wdg.z(n7qVar, zkjVar, this) == nm6Var) {
                        return nm6Var;
                    }
                }
            } else {
                d6l x2 = p6g.x((e6l) oq7Var.a.c.getValue());
                n7q n7qVar2 = x2 != null ? x2.a : null;
                if (n7qVar2 != null) {
                    wdg.A(n7qVar2, (alj) this.o);
                }
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }

    private final Object l(Object obj) {
        tqn tqnVar;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            if (((slm) this.m).isEnabled()) {
                tqn tqnVar2 = new tqn();
                Function2 function2 = (Function2) this.n;
                alc alcVar = new alc(zsd.V((zi3) ((fmq) this.o).c), new ow1(tqnVar2, (Continuation) null, 5));
                this.l = tqnVar2;
                this.k = 1;
                if (function2.invoke(alcVar, this) == nm6Var) {
                    return nm6Var;
                }
                tqnVar = tqnVar2;
            }
            return Unit.a;
        }
        if (i != 1) {
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        tqnVar = (tqn) this.l;
        qgg.h0(obj);
        if (!tqnVar.a) {
            xq0.q("You must collect the progress flow");
            return null;
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0092, code lost:
    
        if (r0.f(r8) == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object n(Object obj) {
        pjq pjqVar;
        x1k x1kVar;
        pjq pjqVar2;
        qqi qqiVar;
        qu2 s;
        w1k w1kVar = (w1k) this.o;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        Throwable th = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (i == 0) {
            qgg.h0(obj);
            pjqVar = (pjq) this.n;
            if (!w1kVar.g.compareAndSet(false, true)) {
                xq0.q("Attempt to collect twice from pageEventFlow, which is an illegal operation. Did you forget to call Flow<PagingData<*>>.cachedIn(coroutineScope)?");
                return null;
            }
            x97.y(pjqVar, null, null, new h1j((Object) w1kVar, (Object) pjqVar, (Continuation) (objArr3 == true ? 1 : 0), 15), 3);
            zi3 g = men.g(0, 6, null);
            x97.y(pjqVar, null, null, new h1j((Object) w1kVar, (Object) g, (Continuation) (objArr2 == true ? 1 : 0), 16), 3);
            x97.y(pjqVar, null, null, new rlg((Object) g, (Object) w1kVar, (Continuation) (objArr == true ? 1 : 0), 19), 3);
            this.n = pjqVar;
            this.l = null;
            this.m = null;
            this.k = 2;
        } else {
            if (i == 1) {
                x1k x1kVar2 = (x1k) ((qqi) this.m);
                if (((x1k) this.l) != null) {
                    l1j.f();
                    return null;
                }
                qgg.h0(obj);
                x1kVar2.b.a(null);
                throw null;
            }
            if (i != 2) {
                if (i != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qqiVar = (qqi) this.m;
                x1kVar = (x1k) this.l;
                pjqVar2 = (pjq) this.n;
                qgg.h0(obj);
                try {
                    s = x1kVar.b.j.s(pfg.a);
                    qqiVar.b(null);
                    if (!(s instanceof lfg)) {
                        w1k.d(w1kVar, pjqVar2);
                    }
                    return Unit.a;
                } catch (Throwable th2) {
                    qqiVar.b(null);
                    throw th2;
                }
            }
            pjq pjqVar3 = (pjq) this.n;
            qgg.h0(obj);
            pjqVar = pjqVar3;
        }
        x1kVar = w1kVar.i;
        qqi qqiVar2 = x1kVar.a;
        this.n = pjqVar;
        this.l = x1kVar;
        this.m = qqiVar2;
        this.k = 3;
        if (qqiVar2.a(this) != nm6Var) {
            pjqVar2 = pjqVar;
            qqiVar = qqiVar2;
            s = x1kVar.b.j.s(pfg.a);
            qqiVar.b(null);
            if (!(s instanceof lfg)) {
            }
            return Unit.a;
        }
        return nm6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        if (r1.emit(r3, r5) == r0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object o(Object obj) {
        rjc rjcVar;
        x1k x1kVar;
        qqi qqiVar;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        try {
            if (i == 0) {
                qgg.h0(obj);
                rjcVar = (rjc) this.n;
                x1kVar = ((w1k) this.o).i;
                qqi qqiVar2 = x1kVar.a;
                this.n = x1kVar;
                this.l = qqiVar2;
                this.m = rjcVar;
                this.k = 1;
                if (qqiVar2.a(this) != nm6Var) {
                    qqiVar = qqiVar2;
                }
                return nm6Var;
            }
            if (i != 1) {
                if (i == 2) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rjcVar = (rjc) this.m;
            qqiVar = (qqi) this.l;
            x1kVar = (x1k) this.n;
            qgg.h0(obj);
            ofg Z = x1kVar.b.j.Z();
            qqiVar.b(null);
            b1k b1kVar = new b1k(Z, null);
            this.n = null;
            this.l = null;
            this.m = null;
            this.k = 2;
        } catch (Throwable th) {
            qqiVar.b(null);
            throw th;
        }
    }

    private final Object p(Object obj) {
        List list;
        List list2;
        ReentrantLock reentrantLock;
        ii3 ii3Var = (ii3) this.n;
        k1l k1lVar = (k1l) this.o;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            boolean z = ((tqn) this.m).a;
            if (!z || ii3Var == null) {
                k5r.v("Reset current buffer with empty list. Successful queue launch = ", z, 3, k1l.i, null);
                list = c5b.a;
            } else {
                list = t75.c(ii3Var);
                ssg.a(3, k1l.i, dfi.c(ii3Var.a.size(), "Reset current buffer with batch of ", " commands. Successful queue launch = true"), null);
            }
            list2 = list;
            j6e j6eVar = k1lVar.f;
            reentrantLock = (ReentrantLock) j6eVar.b;
            reentrantLock.lock();
            try {
                ((zx0) j6eVar.a).clear();
                reentrantLock.unlock();
                cr crVar = k1lVar.g;
                tf6 tf6Var = k1lVar.d;
                this.l = list2;
                this.k = 1;
                if (crVar.f0(tf6Var, this) == nm6Var) {
                    return nm6Var;
                }
            } finally {
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = (List) this.l;
            qgg.h0(obj);
        }
        j6e j6eVar2 = k1lVar.f;
        j6eVar2.getClass();
        list2.getClass();
        if (list2.size() > 10) {
            xq0.o(dfi.c(list2.size(), "Developer Error. PlaybackCommandsSupplier should not accept array larger than its size ", " >= 10"));
            return null;
        }
        reentrantLock = (ReentrantLock) j6eVar2.b;
        reentrantLock.lock();
        try {
            ((zx0) j6eVar2.a).addAll(list2);
            reentrantLock.unlock();
            oi oiVar = (oi) k1lVar.g.d;
            if (oiVar != null) {
                oiVar.c(Unit.a);
            }
            return Unit.a;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0147 A[LOOP:0: B:25:0x0141->B:27:0x0147, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object q(Object obj) {
        Pair pair;
        hjm hjmVar;
        String str = (String) this.n;
        vgl vglVar = (vgl) this.m;
        xol xolVar = (xol) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            ConcurrentHashMap concurrentHashMap = xolVar.l;
            String str2 = vglVar.b;
            Object obj2 = concurrentHashMap.get(str2);
            if (obj2 == null) {
                obj2 = xolVar.n.getAndSet(false) ? hld.i(fwk.OTHER) : hld.j();
                Object putIfAbsent = concurrentHashMap.putIfAbsent(str2, obj2);
                if (putIfAbsent != null) {
                    obj2 = putIfAbsent;
                }
            }
            this.k = 1;
            obj = ((gm5) obj2).s(this);
            if (obj == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        fwk fwkVar = (fwk) obj;
        xolVar.getClass();
        int ordinal = fwkVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1 || ordinal == 2) {
                ReentrantLock reentrantLock = xolVar.i;
                reentrantLock.lock();
                try {
                    tim timVar = (tim) xolVar.h.get(str);
                    if (timVar != null) {
                        if (timVar instanceof rim) {
                            hjmVar = hjm.META_LOADED;
                        } else if (timVar instanceof sim) {
                            hjmVar = hjm.PRACTICALLY_PREFETCHED;
                        } else {
                            if (!(timVar instanceof qim)) {
                                throw new x7j();
                            }
                            hjmVar = hjm.FULLY_PREFETCHED;
                        }
                        pair = new Pair(hjmVar, Integer.valueOf(timVar.b));
                    } else {
                        pair = new Pair(hjm.NONE, 0);
                    }
                    hjm hjmVar2 = (hjm) pair.a;
                    int intValue = ((Number) pair.b).intValue();
                    nnd nndVar = xolVar.a.a;
                    String S = asq.S(vglVar.d);
                    String uuid = xolVar.j.toString();
                    uuid.getClass();
                    dxb dxbVar = (dxb) this.o;
                    hjmVar2.getClass();
                    anx anxVar = new anx();
                    anxVar.b = fwkVar;
                    anxVar.c = hjmVar2;
                    anxVar.a = intValue;
                    anxVar.d = dxbVar;
                    nndVar.getClass();
                    str.getClass();
                    qdc qdcVar = (qdc) nndVar.b;
                    mib mibVar = (mib) ((jyr) qdcVar.b).getValue();
                    p3i p3iVar = new p3i(450);
                    p3iVar.e("allowPreheatWithoutCrossfade", ((Boolean) ((sgl) qdcVar.c).a.a).booleanValue());
                    new izn(str, S, uuid, anxVar).d(p3iVar);
                    LinkedHashMap a = p3iVar.a();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(a.size()));
                    for (Map.Entry entry : a.entrySet()) {
                        linkedHashMap.put(entry.getKey(), ((t3i) entry.getValue()).getValue());
                    }
                    mibVar.b("WANT_PLAY_TRACK2", linkedHashMap);
                    return Unit.a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            if (ordinal != 3) {
                b6e.s();
                return null;
            }
        }
        pair = new Pair(hjm.NONE, 0);
        hjm hjmVar22 = (hjm) pair.a;
        int intValue2 = ((Number) pair.b).intValue();
        nnd nndVar2 = xolVar.a.a;
        String S2 = asq.S(vglVar.d);
        String uuid2 = xolVar.j.toString();
        uuid2.getClass();
        dxb dxbVar2 = (dxb) this.o;
        hjmVar22.getClass();
        anx anxVar2 = new anx();
        anxVar2.b = fwkVar;
        anxVar2.c = hjmVar22;
        anxVar2.a = intValue2;
        anxVar2.d = dxbVar2;
        nndVar2.getClass();
        str.getClass();
        qdc qdcVar2 = (qdc) nndVar2.b;
        mib mibVar2 = (mib) ((jyr) qdcVar2.b).getValue();
        p3i p3iVar2 = new p3i(450);
        p3iVar2.e("allowPreheatWithoutCrossfade", ((Boolean) ((sgl) qdcVar2.c).a.a).booleanValue());
        new izn(str, S2, uuid2, anxVar2).d(p3iVar2);
        LinkedHashMap a2 = p3iVar2.a();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(tah.a(a2.size()));
        while (r9.hasNext()) {
        }
        mibVar2.b("WANT_PLAY_TRACK2", linkedHashMap2);
        return Unit.a;
    }

    private final Object s(Object obj) {
        xdr xdrVar;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            gcm gcmVar = (gcm) this.m;
            xdr xdrVar2 = gcmVar.B;
            mt mtVar = (mt) this.n;
            String str = ((vbm) this.o).c;
            this.l = xdrVar2;
            this.k = 1;
            obj = gcmVar.M(mtVar, str, this);
            if (obj == nm6Var) {
                return nm6Var;
            }
            xdrVar = xdrVar2;
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xdrVar = (xdr) this.l;
            qgg.h0(obj);
        }
        xdrVar.l(obj);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r0.f(r1, r14) == r6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c8, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        if (defpackage.fk0.c(r1, r1, r2, null, r14, 12) == r6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        if (r1.f(r1, r14) == r6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ac, code lost:
    
        if (r0.f(r1, r14) == r6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c6, code lost:
    
        if (defpackage.fk0.c(r0, r1, r2, null, r14, 12) == r6) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object t(Object obj) {
        fk0 fk0Var = (fk0) this.m;
        ixg ixgVar = (ixg) this.l;
        aqi aqiVar = (aqi) this.o;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            ixg ixgVar2 = (ixg) aqiVar.getValue();
            aqiVar.setValue(ixgVar);
            cxg cxgVar = cxg.a;
            if (ixgVar.equals(cxgVar)) {
                Float f = new Float(0.0f);
                this.k = 1;
            } else {
                gxg gxgVar = gxg.a;
                boolean equals = ixgVar.equals(gxgVar);
                exg exgVar = exg.a;
                if (equals) {
                    boolean d = Intrinsics.d(ixgVar2, exgVar);
                    fk0 fk0Var2 = (fk0) this.m;
                    if (d) {
                        Float f2 = new Float(0.0f);
                        act actVar = (act) this.n;
                        this.k = 2;
                    } else {
                        Float f3 = new Float(0.0f);
                        this.k = 3;
                    }
                } else {
                    if (!ixgVar.equals(exgVar)) {
                        b6e.s();
                        return null;
                    }
                    if (Intrinsics.d(ixgVar2, cxgVar) || Intrinsics.d(ixgVar2, gxgVar)) {
                        fk0 fk0Var3 = (fk0) this.m;
                        Float f4 = new Float(1.0f);
                        act actVar2 = (act) this.n;
                        this.k = 4;
                    } else {
                        Float f5 = new Float(1.0f);
                        this.k = 5;
                    }
                }
            }
        } else {
            if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r8 == r1) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object u(Object obj) {
        fkg fkgVar;
        String str;
        String str2 = (String) this.o;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            b9n b9nVar = (b9n) this.n;
            fkg fkgVar2 = b9nVar.d;
            pjc g = b9nVar.c.g();
            this.l = fkgVar2;
            this.m = str2;
            this.k = 1;
            obj = zsd.g0(g, this);
            if (obj != nm6Var) {
                fkgVar = fkgVar2;
                str = str2;
            }
            return nm6Var;
        }
        if (i != 1) {
            if (i != 2) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
            e5d e5dVar = (e5d) obj;
            if (e5dVar != null) {
                StationId f = StationId.f(str2);
                if (Intrinsics.d(f, StationId.a)) {
                    f = null;
                }
                if (f != null) {
                    return new baq(f, e5dVar);
                }
            }
            return null;
        }
        str = (String) this.m;
        fkgVar = (fkg) this.l;
        qgg.h0(obj);
        String str3 = ((xxq) obj).a;
        this.l = null;
        this.m = null;
        this.k = 2;
        fkgVar.getClass();
        obj = x97.V(dm6.b, new ga3(fkgVar, str3, str, null), this);
    }

    private final Object v(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            rtl rtlVar = (rtl) ((b9n) this.l).a.g.getValue();
            String str = (String) this.m;
            List c = t75.c(new nvl((String) this.n, (String) this.o));
            this.k = 1;
            obj = rtlVar.j(str, c, this);
            if (obj == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return CollectionsKt.firstOrNull((List) obj);
    }

    private final Object w(Object obj) {
        ou7 ou7Var;
        dyk dykVar = (dyk) this.n;
        mm6 mm6Var = (mm6) this.m;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            ssg.a(3, "RegisteredCommandsDistributor", "Start command: " + dykVar, null);
            ou7 p = x97.p(mm6Var, null, pm6.d, new xrn(dykVar, (bsn) this.o, null), 1);
            ssg.a(3, "RegisteredCommandsDistributor", "End command: ".concat(dykVar.getClass().getSimpleName()), null);
            this.m = null;
            this.l = p;
            this.k = 1;
            if (p.j0(this) == nm6Var) {
                return nm6Var;
            }
            ou7Var = p;
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ou7Var = (ou7) this.l;
            qgg.h0(obj);
        }
        return Boolean.valueOf(ou7Var.z() instanceof CancellationException ? false : ((Boolean) ou7Var.o()).booleanValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x01be, code lost:
    
        if (r14 == r5) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0198, code lost:
    
        if (r14 == r5) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x016d, code lost:
    
        if (r14 == r5) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0145, code lost:
    
        if (r14 == r5) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011d, code lost:
    
        if (r14 == r5) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object x(Object obj) {
        xqn xqnVar;
        Boolean bool;
        xqn xqnVar2;
        xqn xqnVar3;
        xqn xqnVar4;
        xqn xqnVar5;
        Unit unit;
        Object c;
        qvn qvnVar = (qvn) this.o;
        nm6 nm6Var = nm6.a;
        switch (this.k) {
            case 0:
                qgg.h0(obj);
                JSONObject jSONObject = (JSONObject) this.n;
                Log.d("SessionConfigFetcher", "Fetched settings: " + jSONObject);
                xqn xqnVar6 = new xqn();
                xqnVar = new xqn();
                xqn xqnVar7 = new xqn();
                if (jSONObject.has("app_quality")) {
                    Object obj2 = jSONObject.get("app_quality");
                    obj2.getClass();
                    JSONObject jSONObject2 = (JSONObject) obj2;
                    try {
                        bool = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                    } catch (JSONException e) {
                        e = e;
                        bool = null;
                    }
                    try {
                        if (jSONObject2.has("sampling_rate")) {
                            xqnVar6.a = (Double) jSONObject2.get("sampling_rate");
                        }
                        if (jSONObject2.has("session_timeout_seconds")) {
                            xqnVar.a = (Integer) jSONObject2.get("session_timeout_seconds");
                        }
                        if (jSONObject2.has("cache_duration")) {
                            xqnVar7.a = (Integer) jSONObject2.get("cache_duration");
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        Log.e("SessionConfigFetcher", "Error parsing the configs remotely fetched: ", e);
                        if (bool == null) {
                        }
                    }
                } else {
                    bool = null;
                }
                if (bool == null) {
                    ipp e3 = qvnVar.e();
                    this.n = xqnVar6;
                    this.l = xqnVar;
                    this.m = xqnVar7;
                    this.k = 1;
                    Object c2 = e3.c(ipp.c, bool, this);
                    if (c2 != nm6.a) {
                        c2 = Unit.a;
                    }
                    if (c2 != nm6Var) {
                        xqnVar4 = xqnVar6;
                        xqnVar5 = xqnVar;
                        xqnVar3 = xqnVar7;
                        xqnVar = xqnVar5;
                        xqnVar2 = xqnVar4;
                        if (((Integer) xqnVar.a) != null) {
                            ipp e4 = qvnVar.e();
                            Integer num = (Integer) xqnVar.a;
                            this.n = xqnVar2;
                            this.l = xqnVar3;
                            this.m = null;
                            this.k = 2;
                            Object c3 = e4.c(ipp.e, num, this);
                            if (c3 != nm6.a) {
                                c3 = Unit.a;
                                break;
                            }
                        }
                        if (((Double) xqnVar2.a) != null) {
                            ipp e5 = qvnVar.e();
                            Double d = (Double) xqnVar2.a;
                            this.n = xqnVar3;
                            this.l = null;
                            this.m = null;
                            this.k = 3;
                            Object c4 = e5.c(ipp.d, d, this);
                            if (c4 != nm6.a) {
                                c4 = Unit.a;
                                break;
                            }
                        }
                        if (((Integer) xqnVar3.a) == null) {
                            unit = null;
                            if (unit == null) {
                                ipp e6 = qvnVar.e();
                                Integer num2 = new Integer(86400);
                                this.n = null;
                                this.l = null;
                                this.m = null;
                                this.k = 5;
                                Object c5 = e6.c(ipp.f, num2, this);
                                if (c5 != nm6.a) {
                                    c5 = Unit.a;
                                    break;
                                }
                            }
                            ipp e7 = qvnVar.e();
                            Long l = new Long(System.currentTimeMillis());
                            this.n = null;
                            this.l = null;
                            this.m = null;
                            this.k = 6;
                            c = e7.c(ipp.g, l, this);
                            if (c != nm6.a) {
                                c = Unit.a;
                                break;
                            }
                        } else {
                            ipp e8 = qvnVar.e();
                            Integer num3 = (Integer) xqnVar3.a;
                            this.n = null;
                            this.l = null;
                            this.m = null;
                            this.k = 4;
                            Object c6 = e8.c(ipp.f, num3, this);
                            if (c6 != nm6.a) {
                                c6 = Unit.a;
                                break;
                            }
                        }
                    }
                    return nm6Var;
                }
                xqnVar2 = xqnVar6;
                xqnVar3 = xqnVar7;
                if (((Integer) xqnVar.a) != null) {
                }
                if (((Double) xqnVar2.a) != null) {
                }
                if (((Integer) xqnVar3.a) == null) {
                }
                break;
            case 1:
                xqnVar3 = (xqn) this.m;
                xqnVar5 = (xqn) this.l;
                xqnVar4 = (xqn) this.n;
                qgg.h0(obj);
                xqnVar = xqnVar5;
                xqnVar2 = xqnVar4;
                if (((Integer) xqnVar.a) != null) {
                }
                if (((Double) xqnVar2.a) != null) {
                }
                if (((Integer) xqnVar3.a) == null) {
                }
                break;
            case 2:
                xqnVar3 = (xqn) this.l;
                xqnVar2 = (xqn) this.n;
                qgg.h0(obj);
                if (((Double) xqnVar2.a) != null) {
                }
                if (((Integer) xqnVar3.a) == null) {
                }
                break;
            case 3:
                xqnVar3 = (xqn) this.n;
                qgg.h0(obj);
                if (((Integer) xqnVar3.a) == null) {
                }
                break;
            case 4:
                qgg.h0(obj);
                unit = Unit.a;
                if (unit == null) {
                }
                ipp e72 = qvnVar.e();
                Long l2 = new Long(System.currentTimeMillis());
                this.n = null;
                this.l = null;
                this.m = null;
                this.k = 6;
                c = e72.c(ipp.g, l2, this);
                if (c != nm6.a) {
                }
                break;
            case 5:
                qgg.h0(obj);
                ipp e722 = qvnVar.e();
                Long l22 = new Long(System.currentTimeMillis());
                this.n = null;
                this.l = null;
                this.m = null;
                this.k = 6;
                c = e722.c(ipp.g, l22, this);
                if (c != nm6.a) {
                }
                break;
            case 6:
                qgg.h0(obj);
                return Unit.a;
            default:
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        if (r0.invoke(r9, r8) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d8, code lost:
    
        if (r0.invoke(r2, r8) != r1) goto L37;
     */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object y(Object obj) {
        z0i z0iVar = (z0i) this.o;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        try {
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = e.toString();
            }
            this.k = 3;
        }
        if (i == 0) {
            qgg.h0(obj);
            URLConnection openConnection = rvn.a((rvn) this.l).openConnection();
            openConnection.getClass();
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
            httpsURLConnection.setRequestMethod(ServiceCommand.TYPE_GET);
            httpsURLConnection.setRequestProperty("Accept", "application/json");
            for (Map.Entry entry : this.m.entrySet()) {
                httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int responseCode = httpsURLConnection.getResponseCode();
            if (responseCode == 200) {
                InputStream inputStream = httpsURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
                bufferedReader.close();
                inputStream.close();
                JSONObject jSONObject = new JSONObject(sb.toString());
                rfg rfgVar = (rfg) this.n;
                this.k = 1;
                if (rfgVar.invoke(jSONObject, this) == nm6Var) {
                    return nm6Var;
                }
            } else {
                String str = "Bad response code: " + responseCode;
                this.k = 2;
            }
        } else if (i == 1 || i == 2) {
            qgg.h0(obj);
        } else {
            if (i != 3) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0042, code lost:
    
        if (r8.a(r7) == r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object z(Object obj) {
        qqi qqiVar;
        Object obj2;
        oqi oqiVar;
        Throwable th;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        Continuation continuation = null;
        try {
            if (i == 0) {
                qgg.h0(obj);
                qqiVar = (qqi) this.n;
                obj2 = (aur) this.o;
                this.l = qqiVar;
                this.m = obj2;
                this.k = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oqiVar = (oqi) this.l;
                    try {
                        qgg.h0(obj);
                        oqiVar.b(null);
                        return Unit.a;
                    } catch (Throwable th2) {
                        th = th2;
                        oqiVar.b(null);
                        throw th;
                    }
                }
                obj2 = (Function2) ((aur) this.m);
                ?? r3 = (oqi) this.l;
                qgg.h0(obj);
                qqiVar = r3;
            }
            s1n s1nVar = new s1n(obj2, continuation, 18);
            this.l = qqiVar;
            this.m = null;
            this.k = 2;
            if (gld.Q(s1nVar, this) != nm6Var) {
                oqiVar = qqiVar;
                oqiVar.b(null);
                return Unit.a;
            }
            return nm6Var;
        } catch (Throwable th3) {
            oqiVar = qqiVar;
            th = th3;
            oqiVar.b(null);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r3v24, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new rfg((sfg) this.l, (sfm) this.m, (qne) this.n, (Function1) this.o, continuation, 0);
            case 1:
                rfg rfgVar = new rfg((fkg) this.m, (String) this.n, (f5q) this.o, continuation, 1);
                rfgVar.l = obj;
                return rfgVar;
            case 2:
                return new rfg((e0) this.l, (fkg) this.m, (String) this.n, (String) this.o, continuation, 2);
            case 3:
                return new rfg((klg) this.l, (i1m) this.m, (cvl) this.n, (mqs) this.o, continuation, 3);
            case 4:
                return new rfg((klg) this.l, (cvl) this.m, (List) this.n, (List) this.o, continuation, 4);
            case 5:
                return new rfg((xlg) this.l, (ykf) this.m, (String) this.n, (String) this.o, continuation, 5);
            case 6:
                return new rfg((xlg) this.l, (String) this.m, (String) this.n, continuation, (xlg) this.o);
            case 7:
                return new rfg((xlg) this.l, (i1m) this.m, (cvl) this.n, (mqs) this.o, continuation, 7);
            case 8:
                return new rfg((xlg) this.l, (cvl) this.m, (List) this.n, (List) this.o, continuation, 8);
            case 9:
                return new rfg((z77) this.l, (String) this.m, (tpi) this.n, (ime) this.o, continuation, 9);
            case 10:
                return new rfg((UserDatabase) this.l, (MainDatabase) this.m, (d5h) this.n, (String) this.o, continuation, 10);
            case 11:
                return new rfg((MethodHandler) this.l, (String) this.m, (Type) this.n, (Object[]) this.o, continuation, 11);
            case 12:
                return new rfg((o8i) this.l, (String) this.m, (b80) this.n, (String) this.o, continuation, 12);
            case 13:
                rfg rfgVar2 = new rfg(continuation, (clj) this.m, (zkj) this.n, (alj) this.o);
                rfgVar2.l = obj;
                return rfgVar2;
            case 14:
                return new rfg((kvh) this.l, continuation, (clj) this.m, (zkj) this.n, (alj) this.o);
            case 15:
                return new rfg((slm) this.m, (Function2) this.n, (fmq) this.o, continuation, 15);
            case 16:
                rfg rfgVar3 = new rfg((w1k) this.o, continuation, 16);
                rfgVar3.n = obj;
                return rfgVar3;
            case 17:
                rfg rfgVar4 = new rfg((w1k) this.o, continuation, 17);
                rfgVar4.n = obj;
                return rfgVar4;
            case 18:
                return new rfg((tqn) this.m, (ii3) this.n, (k1l) this.o, continuation, 18);
            case 19:
                return new rfg((xol) this.l, (vgl) this.m, (String) this.n, (dxb) this.o, continuation, 19);
            case 20:
                return new rfg((btl) this.l, (String) this.m, (String) this.n, (String) this.o, continuation, 20);
            case 21:
                return new rfg((gcm) this.m, (mt) this.n, (vbm) this.o, continuation, 21);
            case 22:
                return new rfg((ixg) this.l, (fk0) this.m, (act) this.n, (aqi) this.o, continuation, 22);
            case 23:
                return new rfg((b9n) this.n, (String) this.o, continuation, 23);
            case 24:
                return new rfg((b9n) this.l, (String) this.m, (String) this.n, (String) this.o, continuation, 24);
            case 25:
                rfg rfgVar5 = new rfg((dyk) this.n, (bsn) this.o, continuation, 25);
                rfgVar5.m = obj;
                return rfgVar5;
            case 26:
                rfg rfgVar6 = new rfg((qvn) this.o, continuation, 26);
                rfgVar6.n = obj;
                return rfgVar6;
            case 27:
                return new rfg((rvn) this.l, this.m, (rfg) this.n, (z0i) this.o, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new rfg((qqi) this.n, (Function2) this.o, continuation);
            default:
                rfg rfgVar7 = new rfg((nyf) this.m, (lyf) this.n, (Function2) this.o, continuation);
                rfgVar7.l = obj;
                return rfgVar7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((rfg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0144, code lost:
    
        if (r1 == r0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01ea, code lost:
    
        if (r6 == r4) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0333, code lost:
    
        if (r3.b(r2, r0, r23) == r4) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0305, code lost:
    
        if (r3.a(r1, false, r23) == r4) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02fc, code lost:
    
        if (defpackage.xlg.f(r2, r1, r0, r8, r23) == r4) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x039a, code lost:
    
        if (r2.b(r1, r0, r23) == r3) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0381, code lost:
    
        if (r2.a(r0, true, r23) == r3) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0378, code lost:
    
        if (defpackage.xlg.e(r1, r4, r23) == r3) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x055d, code lost:
    
        if (r1.b(r3, r0, r23) == r4) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0527, code lost:
    
        if (r1.a(r2, false, r23) == r4) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x04fe, code lost:
    
        if (r0 == r4) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0516, code lost:
    
        if (r1.n(r11, r13, r23) == r4) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x064f, code lost:
    
        if (r1.b(r2, r0, r23) == r4) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x05de, code lost:
    
        if (r0 == r4) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x062e, code lost:
    
        if (r1.a(r0, true, r23) == r4) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x09ed, code lost:
    
        if (r0.f(r1, r2, r3, "sessionId", r23) == r14) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x09d2, code lost:
    
        if (r0.g(r1, r3, r2, "seeds", r23) == r14) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x098b, code lost:
    
        if (r0.f(r1, r2, r3, "idForFrom", r23) == r14) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0970, code lost:
    
        if (r0.f(r1, r2, r3, "waveDescription", r23) == r14) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x08fc, code lost:
    
        if (r0.g(r1, r2, r3, "seeds", r23) == r14) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x08e0, code lost:
    
        if (r0.f(r1, r2, r3, "name", r23) == r14) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x08c5, code lost:
    
        if (r0.f(r1, r2, r3, "idForFrom", r23) == r14) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x08aa, code lost:
    
        if (r0.f(r1, r2, r3, "url", r23) == r14) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x088b, code lost:
    
        if (r0.f(r1, r2, r3, "backgroundColor", r23) == r14) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0870, code lost:
    
        if (r0.f(r1, r2, r3, "videoUrl", r23) == r14) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0855, code lost:
    
        if (r0.f(r1, r2, r3, "subtitle", r23) == r14) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x083a, code lost:
    
        if (r0.f(r1, r2, r3, "imageUrl", r23) == r14) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x07ae, code lost:
    
        if (r0.f(r1, "", r3, "remoteId", r23) == r14) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x07c9, code lost:
    
        if (defpackage.fkg.d(r0, r1, r2, r3, "album", r23) == r14) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x07e4, code lost:
    
        if (r0.f(r1, r2, r3, "videoId", r23) == r14) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0802, code lost:
    
        if (r0.f(r1, r2, r3, "name", r23) == r14) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0821, code lost:
    
        if (r0.f(r1, r2, r3, "title", r23) == r14) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0918, code lost:
    
        if (defpackage.fkg.d(r0, r1, r2, r3, "playlist", r23) == r14) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0936, code lost:
    
        if (r0.g(r1, r2, r3, "trackIds", r23) == r14) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0955, code lost:
    
        if (r0.f(r1, r2, r3, "name", r23) == r14) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0a08, code lost:
    
        if (defpackage.fkg.d(r0, r1, r2, r3, "artist", r23) == r14) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0794, code lost:
    
        if (r0.f(r1, r2, r3, com.connectsdk.service.DeviceService.KEY_DESC, r23) == r14) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x077e, code lost:
    
        if (r0.g(r1, r3, r2, "possibleTracks", r23) == r14) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0742, code lost:
    
        if (r0.f(r1, r2, r3, com.connectsdk.device.ConnectableDevice.KEY_ID, r23) == r14) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0728, code lost:
    
        if (defpackage.fkg.a(r0, r1, r2, r23) == r14) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0a98, code lost:
    
        if (r0 != r3) goto L443;
     */
    /* JADX WARN: Type inference failed for: r10v5, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object invoke;
        Object l;
        Object V;
        Object V2;
        Object t7oVar;
        Object c;
        Object N;
        Serializable d;
        int i = 3;
        Continuation continuation = null;
        switch (this.j) {
            case 0:
                qne qneVar = (qne) this.n;
                sfg sfgVar = (sfg) this.l;
                g0c g0cVar = sfgVar.b;
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                try {
                } catch (Exception e) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = e.toString();
                    }
                    qne m = qne.m(qneVar, message, 2);
                    x60 x60Var = (x60) g0cVar;
                    x60Var.getClass();
                    x60Var.a(m);
                    Function1 function1 = (Function1) this.o;
                    this.k = 2;
                    invoke = function1.invoke(this);
                    break;
                }
                if (i2 == 0) {
                    qgg.h0(obj);
                    xiu xiuVar = sfgVar.a;
                    JSONObject M = ((sfm) this.m).M();
                    this.k = 1;
                    l = xiuVar.l(M, this);
                    if (l == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        invoke = obj;
                        return (uv8) invoke;
                    }
                    qgg.h0(obj);
                    l = obj;
                }
                JSONObject jSONObject = (JSONObject) l;
                qne A = qneVar.A(null);
                x60 x60Var2 = (x60) g0cVar;
                x60Var2.getClass();
                x60Var2.a(A);
                JSONObject jSONObject2 = jSONObject.getJSONObject("templates");
                JSONObject jSONObject3 = jSONObject.getJSONObject("card");
                jSONObject2.getClass();
                jSONObject3.getClass();
                return new uv8(jSONObject2, jSONObject3);
            case 1:
                fkg fkgVar = (fkg) this.m;
                f5q f5qVar = (f5q) this.o;
                lpi lpiVar = (lpi) this.l;
                nm6 nm6Var2 = nm6.a;
                switch (this.k) {
                    case 0:
                        qgg.h0(obj);
                        String str = (String) this.n;
                        this.l = lpiVar;
                        this.k = 1;
                        break;
                    case 1:
                        qgg.h0(obj);
                        String id = f5qVar.getId().getId();
                        String str2 = (String) this.n;
                        this.l = lpiVar;
                        this.k = 2;
                        break;
                    case 2:
                        qgg.h0(obj);
                        List c2 = f5qVar.c();
                        ArrayList arrayList = new ArrayList(v75.o(c2, 10));
                        Iterator it = c2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((mqs) it.next()).a);
                        }
                        String str3 = (String) this.n;
                        this.l = lpiVar;
                        this.k = 3;
                        break;
                    case 3:
                        qgg.h0(obj);
                        String description = f5qVar.getDescription();
                        String str4 = (String) this.n;
                        this.l = lpiVar;
                        this.k = 4;
                        break;
                    case 4:
                        qgg.h0(obj);
                        if (f5qVar instanceof oaq) {
                            String str5 = (String) this.n;
                            this.l = null;
                            this.k = 5;
                            break;
                        } else if (f5qVar instanceof o9q) {
                            oq oqVar = ((o9q) f5qVar).a;
                            String str6 = (String) this.n;
                            this.l = null;
                            this.k = 6;
                            break;
                        } else if (f5qVar instanceof taq) {
                            String str7 = ((taq) f5qVar).a;
                            String str8 = (String) this.n;
                            this.l = null;
                            this.k = 7;
                            break;
                        } else {
                            if (!(f5qVar instanceof xaq)) {
                                if (f5qVar instanceof baq) {
                                    String str9 = ((baq) f5qVar).b.c;
                                    String str10 = (String) this.n;
                                    this.l = lpiVar;
                                    this.k = 9;
                                    break;
                                } else if (f5qVar instanceof q9q) {
                                    cvl cvlVar = ((q9q) f5qVar).b;
                                    String str11 = (String) this.n;
                                    this.l = null;
                                    this.k = 18;
                                    break;
                                } else if (f5qVar instanceof r9q) {
                                    List list = ((r9q) f5qVar).b;
                                    String str12 = (String) this.n;
                                    this.l = null;
                                    this.k = 19;
                                    break;
                                } else if (f5qVar instanceof abq) {
                                    String str13 = ((abq) f5qVar).c.a;
                                    String str14 = (String) this.n;
                                    this.l = lpiVar;
                                    this.k = 20;
                                    break;
                                } else {
                                    if (!(f5qVar instanceof p9q)) {
                                        b6e.s();
                                        return null;
                                    }
                                    c01 c01Var = ((p9q) f5qVar).a;
                                    String str15 = (String) this.n;
                                    this.l = null;
                                    this.k = 25;
                                    break;
                                }
                                return nm6Var2;
                            }
                            String description2 = ((xaq) f5qVar).getDescription();
                            String str16 = (String) this.n;
                            this.l = null;
                            this.k = 8;
                            break;
                        }
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 17:
                    case 18:
                    case 19:
                    case 24:
                    case 25:
                        qgg.h0(obj);
                        return Unit.a;
                    case 9:
                        qgg.h0(obj);
                        String str17 = ((baq) f5qVar).b.e;
                        String str18 = (String) this.n;
                        this.l = lpiVar;
                        this.k = 10;
                        break;
                    case 10:
                        qgg.h0(obj);
                        String str19 = ((baq) f5qVar).b.d;
                        String str20 = (String) this.n;
                        this.l = lpiVar;
                        this.k = 11;
                        break;
                    case 11:
                        qgg.h0(obj);
                        String str21 = ((baq) f5qVar).b.f;
                        String str22 = (String) this.n;
                        this.l = lpiVar;
                        this.k = 12;
                        break;
                    case 12:
                        qgg.h0(obj);
                        String str23 = ((baq) f5qVar).b.g;
                        String str24 = (String) this.n;
                        this.l = lpiVar;
                        this.k = 13;
                        break;
                    case 13:
                        qgg.h0(obj);
                        String uri = ((baq) f5qVar).b.b.toString();
                        String str25 = (String) this.n;
                        this.l = lpiVar;
                        this.k = 14;
                        break;
                    case 14:
                        qgg.h0(obj);
                        String str26 = ((baq) f5qVar).g.d;
                        String str27 = (String) this.n;
                        this.l = lpiVar;
                        this.k = 15;
                        break;
                    case 15:
                        qgg.h0(obj);
                        String str28 = ((baq) f5qVar).g.c;
                        String str29 = (String) this.n;
                        this.l = lpiVar;
                        this.k = 16;
                        break;
                    case 16:
                        qgg.h0(obj);
                        List list2 = ((baq) f5qVar).g.b;
                        String str30 = (String) this.n;
                        this.l = null;
                        this.k = 17;
                        break;
                    case 20:
                        qgg.h0(obj);
                        String str31 = ((abq) f5qVar).c.b;
                        String str32 = (String) this.n;
                        this.l = lpiVar;
                        this.k = 21;
                        break;
                    case 21:
                        qgg.h0(obj);
                        String str33 = ((abq) f5qVar).d.b;
                        String str34 = (String) this.n;
                        this.l = lpiVar;
                        this.k = 22;
                        break;
                    case 22:
                        qgg.h0(obj);
                        List list3 = ((abq) f5qVar).a.d().a;
                        ArrayList arrayList2 = new ArrayList(v75.o(list3, 10));
                        Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(o8g.Q((g9p) it2.next()));
                        }
                        String str35 = (String) this.n;
                        this.l = lpiVar;
                        this.k = 23;
                        break;
                    case 23:
                        qgg.h0(obj);
                        String id2 = ((abq) f5qVar).a.getId();
                        String str36 = (String) this.n;
                        this.l = null;
                        this.k = 24;
                        break;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 2:
                fkg fkgVar2 = (fkg) this.m;
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ((e0) this.l).writeTo(byteArrayOutputStream);
                String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                wb7 wb7Var = (wb7) fkgVar2.b.getValue();
                ckg ckgVar = new ckg(fkgVar2, encodeToString, (String) this.n, (String) this.o, (Continuation) null, 0);
                this.k = 1;
                Object a = lmm.a(wb7Var, ckgVar, this);
                return a == nm6Var3 ? nm6Var3 : a;
            case 3:
                cvl cvlVar2 = (cvl) this.n;
                l18 l18Var = l18.b;
                klg klgVar = (klg) this.l;
                Object obj2 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    jyr jyrVar = i2q.e;
                    if (!lsq.v()) {
                        btl btlVar = klgVar.c;
                        i1m i1mVar = (i1m) this.m;
                        btlVar.getClass();
                        i1mVar.getClass();
                        bdt I = hag.I(frt.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        String str37 = ((frt) qdcVar.C(I)).c().a;
                        str37.getClass();
                        ((Number) x97.D(g.a, new c5l(btlVar, str37, (Serializable) i1mVar, (Continuation) null, 6))).intValue();
                        pi4 pi4Var = (pi4) klgVar.d.getValue();
                        this.k = 2;
                        break;
                    } else {
                        cvl cvlVar3 = (cvl) this.n;
                        mqs mqsVar = (mqs) this.o;
                        i1m i1mVar2 = (i1m) this.m;
                        bdt I2 = hag.I(frt.class);
                        qdc qdcVar2 = l18Var.a;
                        qdcVar2.getClass();
                        ((frt) qdcVar2.C(I2)).c().a.getClass();
                        xlg a2 = klgVar.a();
                        this.k = 1;
                        a2.getClass();
                        Object V3 = x97.V(dm6.a, new rfg(a2, i1mVar2, cvlVar3, mqsVar, null, 7), this);
                        if (V3 != obj2) {
                            V3 = Unit.a;
                            break;
                        }
                    }
                    return obj2;
                }
                if (i4 == 1) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                if (i4 == 2) {
                    qgg.h0(obj);
                    pi4 pi4Var2 = (pi4) klgVar.d.getValue();
                    List c3 = t75.c(((mqs) this.o).a);
                    nvl g = cvlVar2.g();
                    this.k = 3;
                    break;
                } else {
                    if (i4 == 3) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 4:
                List list4 = (List) this.n;
                cvl cvlVar4 = (cvl) this.m;
                klg klgVar2 = (klg) this.l;
                Object obj3 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    jyr jyrVar2 = i2q.e;
                    if (!lsq.v()) {
                        btl btlVar2 = klgVar2.c;
                        long j = cvlVar4.k;
                        b38 K = qgg.K(list4, (List) this.o);
                        this.k = 2;
                        break;
                    } else {
                        cvl cvlVar5 = (cvl) this.m;
                        List list5 = (List) this.n;
                        List list6 = (List) this.o;
                        l18 l18Var2 = l18.b;
                        bdt I3 = hag.I(frt.class);
                        qdc qdcVar3 = l18Var2.a;
                        qdcVar3.getClass();
                        ((frt) qdcVar3.C(I3)).c().a.getClass();
                        xlg a3 = klgVar2.a();
                        this.k = 1;
                        a3.getClass();
                        Object V4 = x97.V(dm6.a, new rfg(a3, cvlVar5, list5, list6, null, 8), this);
                        if (V4 != obj3) {
                            V4 = Unit.a;
                            break;
                        }
                    }
                    return obj3;
                }
                if (i5 == 1) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                if (i5 == 2) {
                    qgg.h0(obj);
                    pi4 pi4Var3 = (pi4) klgVar2.d.getValue();
                    this.k = 3;
                    break;
                } else if (i5 == 3) {
                    qgg.h0(obj);
                    pi4 pi4Var4 = (pi4) klgVar2.d.getValue();
                    List list7 = list4;
                    ArrayList arrayList3 = new ArrayList(v75.o(list7, 10));
                    Iterator it3 = list7.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((mqs) it3.next()).a);
                    }
                    nvl g2 = cvlVar4.g();
                    this.k = 4;
                    break;
                } else {
                    if (i5 != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 5:
                nm6 nm6Var4 = nm6.a;
                int i6 = this.k;
                try {
                    if (i6 == 0) {
                        qgg.h0(obj);
                        xlg xlgVar = (xlg) this.l;
                        ykf ykfVar = (ykf) this.m;
                        String str38 = (String) this.n;
                        String str39 = (String) this.o;
                        String str40 = xlgVar.e.c().a;
                        str40.getClass();
                        ga3 ga3Var = new ga3(xlgVar, ykfVar, (Continuation) null, xlgVar, str40, str38, str39);
                        mn7 mn7Var = dm6.b;
                        this.k = 1;
                        V = x97.V(mn7Var, ga3Var, this);
                        if (V == nm6Var4) {
                            return nm6Var4;
                        }
                    } else {
                        if (i6 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        V = obj;
                    }
                    return (rrl) V;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (IllegalStateException e3) {
                    Assertions.throwOrSkip("LocalPlaylistRepository", new FailedAssertionException(hrg.r("Failed to get playlist uid ", (String) this.n, ", kind ", (String) this.o), e3));
                    return null;
                }
            case 6:
                nm6 nm6Var5 = nm6.a;
                int i7 = this.k;
                try {
                    if (i7 == 0) {
                        qgg.h0(obj);
                        xlg xlgVar2 = (xlg) this.l;
                        String str41 = (String) this.m;
                        String str42 = (String) this.n;
                        String str43 = xlgVar2.e.c().a;
                        str43.getClass();
                        ga3 ga3Var2 = new ga3(xlgVar2, (Continuation) null, xlgVar2, str43, str41, str42, (xlg) this.o);
                        mn7 mn7Var2 = dm6.b;
                        this.k = 1;
                        V2 = x97.V(mn7Var2, ga3Var2, this);
                        if (V2 == nm6Var5) {
                            return nm6Var5;
                        }
                    } else {
                        if (i7 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        V2 = obj;
                    }
                    return (rrl) V2;
                } catch (CancellationException e4) {
                    throw e4;
                } catch (IllegalStateException e5) {
                    Assertions.throwOrSkip("LocalPlaylistRepository", new FailedAssertionException(hrg.r("Failed to get playlist uid ", (String) this.m, ", kind ", (String) this.n), e5));
                    return null;
                }
            case 7:
                cvl cvlVar6 = (cvl) this.n;
                xlg xlgVar3 = (xlg) this.l;
                pi4 pi4Var5 = xlgVar3.d;
                nm6 nm6Var6 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    List c4 = t75.c(new Long(((i1m) this.m).a));
                    this.k = 1;
                    break;
                } else if (i8 == 1) {
                    qgg.h0(obj);
                } else if (i8 == 2) {
                    qgg.h0(obj);
                    List c5 = t75.c(((mqs) this.o).a);
                    nvl g3 = cvlVar6.g();
                    this.k = 3;
                    break;
                } else {
                    if (i8 == 3) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this.k = 2;
                break;
            case 8:
                List list8 = (List) this.n;
                cvl cvlVar7 = (cvl) this.m;
                xlg xlgVar4 = (xlg) this.l;
                pi4 pi4Var6 = xlgVar4.d;
                nm6 nm6Var7 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    List list9 = (List) this.o;
                    this.k = 1;
                    break;
                } else if (i9 == 1) {
                    qgg.h0(obj);
                } else if (i9 == 2) {
                    qgg.h0(obj);
                    List list10 = list8;
                    ArrayList arrayList4 = new ArrayList(v75.o(list10, 10));
                    Iterator it4 = list10.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(((mqs) it4.next()).a);
                    }
                    nvl g4 = cvlVar7.g();
                    this.k = 3;
                    break;
                } else {
                    if (i9 == 3) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this.k = 2;
                break;
            case 9:
                nm6 nm6Var8 = nm6.a;
                int i10 = this.k;
                try {
                    if (i10 == 0) {
                        qgg.h0(obj);
                        z77 z77Var = (z77) this.l;
                        String concat = "[DailyAppWidgetSdk] ".concat((String) this.m);
                        tpi tpiVar = (tpi) this.n;
                        jah jahVar = tpiVar.f;
                        if (jahVar == null) {
                            jahVar = new jah(tpiVar);
                            tpiVar.f = jahVar;
                        }
                        zqg zqgVar = new zqg(z77Var, concat, jahVar);
                        ime imeVar = (ime) this.o;
                        r7o r7oVar = z7o.b;
                        e5m e5mVar = (e5m) imeVar.b;
                        this.k = 1;
                        if (e5mVar.invoke(zqgVar, this) == nm6Var8) {
                            return nm6Var8;
                        }
                    } else {
                        if (i10 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    t7oVar = Unit.a;
                    r7o r7oVar2 = z7o.b;
                } catch (CancellationException e6) {
                    throw e6;
                } catch (Throwable th) {
                    r7o r7oVar3 = z7o.b;
                    t7oVar = new t7o(th);
                }
                return new z7o(t7oVar);
            case 10:
                MainDatabase mainDatabase = (MainDatabase) this.m;
                UserDatabase userDatabase = (UserDatabase) this.l;
                nm6 nm6Var9 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    clc clcVar = new clc(userDatabase.i().a(new String[]{"tracks_cache"}), new seg(mainDatabase, userDatabase, continuation, i), 4);
                    pm pmVar = new pm(userDatabase, mainDatabase, (d5h) this.n, (String) this.o, 10);
                    this.k = 1;
                    if (clcVar.collect(pmVar, this) == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 11:
                Object[] objArr = (Object[]) this.o;
                Type type = (Type) this.n;
                String str44 = (String) this.m;
                MethodHandler methodHandler = (MethodHandler) this.l;
                nm6 nm6Var10 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    type.getClass();
                    this.k = 1;
                    c = methodHandler.c(str44, type, objArr, this);
                    break;
                } else {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    c = obj;
                }
                if (c != null) {
                    return c;
                }
                Object p = y7g.p(methodHandler.a, methodHandler.b, Arrays.copyOf(objArr, objArr.length));
                type.getClass();
                p.getClass();
                this.k = 2;
                Object b = methodHandler.b(str44, type, p, this);
                if (b != nm6Var10) {
                    return b;
                }
                return nm6Var10;
            case 12:
                Object obj4 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<MixesEntitiesDto>> b2 = ((MixesApi) ((o8i) this.l).a.getValue()).b((String) this.m, (b80) this.n, (String) this.o);
                    this.k = 1;
                    N = swf.N(b2, this);
                    break;
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    N = obj;
                }
                bii biiVar = (bii) N;
                if (biiVar instanceof aii) {
                    ArrayList F = neg.F((MixesEntitiesDto) ((aii) biiVar).a);
                    if (F != null) {
                        return new qj6(F);
                    }
                    obj4 = new nj6(null);
                    return obj4;
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i14 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str45 = name == null ? "" : name;
                    String message2 = musicBackendInvocationError.getMessage();
                    return new kj6(i14, musicBackendInvocationError.getDetails(), str45, message2 == null ? "" : message2, xhiVar.a);
                }
                if (biiVar instanceof yhi) {
                    yhi yhiVar = (yhi) biiVar;
                    return new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                }
                if (biiVar instanceof zhi) {
                    return uwf.J((zhi) biiVar);
                }
                b6e.s();
                return null;
            case 13:
                return k(obj);
            case 14:
                nm6 nm6Var11 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    kvh kvhVar = (kvh) this.l;
                    rfg rfgVar = new rfg((Continuation) null, (clj) this.m, (zkj) this.n, (alj) this.o);
                    this.k = 1;
                    if (zsd.O(kvhVar, rfgVar, this) == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 15:
                return l(obj);
            case 16:
                return n(obj);
            case 17:
                return o(obj);
            case 18:
                return p(obj);
            case 19:
                return q(obj);
            case 20:
                nm6 nm6Var12 = nm6.a;
                int i16 = this.k;
                if (i16 != 0) {
                    if (i16 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                rtl rtlVar = ((btl) this.l).c;
                String str46 = (String) this.m;
                nvl nvlVar = new nvl((String) this.n, (String) this.o);
                this.k = 1;
                d = rtlVar.d(str46, nvlVar, true, this);
                return d == nm6Var12 ? nm6Var12 : d;
            case 21:
                return s(obj);
            case 22:
                return t(obj);
            case 23:
                return u(obj);
            case 24:
                return v(obj);
            case 25:
                return w(obj);
            case 26:
                return x(obj);
            case 27:
                return y(obj);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return z(obj);
            default:
                nm6 nm6Var13 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    mm6 mm6Var = (mm6) this.l;
                    dq7 dq7Var = ca8.a;
                    bsd bsdVar = j5h.a.g;
                    xg xgVar = new xg((nyf) this.m, (lyf) this.n, mm6Var, (Function2) this.o, (Continuation) null);
                    this.k = 1;
                    if (x97.V(bsdVar, xgVar, this) == nm6Var13) {
                        return nm6Var13;
                    }
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfg(xlg xlgVar, String str, String str2, Continuation continuation, xlg xlgVar2) {
        super(2, continuation);
        this.j = 6;
        this.l = xlgVar;
        this.m = str;
        this.n = str2;
        this.o = xlgVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfg(kvh kvhVar, Continuation continuation, clj cljVar, zkj zkjVar, alj aljVar) {
        super(2, continuation);
        this.j = 14;
        this.l = kvhVar;
        this.m = cljVar;
        this.n = zkjVar;
        this.o = aljVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public rfg(qqi qqiVar, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.j = 28;
        this.n = qqiVar;
        this.o = (aur) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rfg(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
        this.o = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rfg(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.n = obj2;
        this.o = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rfg(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.n = obj;
        this.o = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rfg(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.o = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfg(Continuation continuation, clj cljVar, zkj zkjVar, alj aljVar) {
        super(2, continuation);
        this.j = 13;
        this.m = cljVar;
        this.n = zkjVar;
        this.o = aljVar;
    }
}
