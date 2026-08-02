package defpackage;

import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ScrollCaptureSession;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.yandex.music.shared.bdui.trigger.network.TriggerApi;
import com.yandex.music.shared.bdui.trigger.network.dto.TriggerPollingRequestDto;
import com.yandex.music.shared.playback.core.api.PlaybackQueueStartValidator$InvalidQueueException;
import com.yandex.music.shared.promo.data.AlbumPromoFeedbackRequest;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import com.yandex.pulse.metrics.o;
import j$.time.Duration;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.c;

/* loaded from: classes4.dex */
public final class v3 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public Object m;
    public Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(mp6 mp6Var, int i, String str, String str2, Throwable th, Continuation continuation) {
        super(2, continuation);
        this.j = 28;
        this.m = mp6Var;
        this.k = i;
        this.l = str;
        this.n = str2;
        this.o = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, r2f] */
    /* JADX WARN: Type inference failed for: r1v8, types: [r2f] */
    /* JADX WARN: Type inference failed for: r7v6, types: [aur, kotlin.jvm.functions.Function1] */
    private final Object k(Object obj) {
        AtomicReference atomicReference = ((lu3) this.l).a;
        mm6 mm6Var = (mm6) this.m;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        try {
            if (i == 0) {
                qgg.h0(obj);
                ?? Q = saf.Q(mm6Var.getCoroutineContext());
                r2f r2fVar = (r2f) atomicReference.getAndSet(Q);
                if (r2fVar != null) {
                    r2fVar.g(null);
                }
                ?? r7 = (aur) this.o;
                this.m = null;
                this.n = Q;
                this.k = 1;
                obj = r7.invoke(this);
                mm6Var = Q;
                if (obj == nm6Var) {
                    return nm6Var;
                }
            } else {
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ?? r1 = (r2f) this.n;
                qgg.h0(obj);
                mm6Var = r1;
            }
            mm6 mm6Var2 = mm6Var;
            while (!atomicReference.compareAndSet(mm6Var2, null) && atomicReference.get() == mm6Var2) {
            }
            return obj;
        } catch (Throwable th) {
            while (!atomicReference.compareAndSet(mm6Var, null) && atomicReference.get() == mm6Var) {
            }
            throw th;
        }
    }

    private final Object l(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            tqn tqnVar = new tqn();
            xqn xqnVar = new xqn();
            xqnVar.a = ((l54) ((aqi) this.m).getValue()).b;
            u24 u24Var = new u24(szf.s0(new jc((aqi) this.n, 5)), xqnVar, 1);
            ga3 ga3Var = new ga3(xqnVar, (wn5) this.l, tqnVar, (Function0) this.o, (aqi) this.m, null);
            this.k = 1;
            if (zsd.O(u24Var, ga3Var, this) == nm6Var) {
                return nm6Var;
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

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        if (defpackage.gld.Q(r8, r7) == r0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object n(Object obj) {
        bjh bjhVar;
        hr4 hr4Var;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        Continuation continuation = null;
        try {
        } catch (Throwable unused) {
            r7o r7oVar = z7o.b;
        }
        if (i == 0) {
            qgg.h0(obj);
            hr4 hr4Var2 = (hr4) this.l;
            bjhVar = (bjh) this.o;
            r7o r7oVar2 = z7o.b;
            k5 k5Var = new k5(22, bjhVar);
            this.m = hr4Var2;
            this.n = bjhVar;
            this.k = 1;
            if (hr4.b(hr4Var2, k5Var, this) == nm6Var) {
                return nm6Var;
            }
            hr4Var = hr4Var2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                r7o r7oVar3 = z7o.b;
                return Unit.a;
            }
            bjhVar = (bjh) this.n;
            hr4Var = (hr4) this.m;
            qgg.h0(obj);
        }
        if (bjhVar instanceof zih) {
            ja4 ja4Var = new ja4(hr4Var, continuation, 3);
            this.m = null;
            this.n = null;
            this.k = 2;
        }
        r7o r7oVar32 = z7o.b;
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0067, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object o(Object obj) {
        xv4 xv4Var;
        rjc rjcVar = (rjc) this.m;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            xv4 xv4Var2 = (xv4) this.o;
            jv4 jv4Var = (jv4) xv4Var2.r.getValue();
            this.m = null;
            this.n = rjcVar;
            this.l = xv4Var2;
            this.k = 1;
            Enum b = ((v55) jv4Var.b.getValue()).b(this);
            if (b != nm6Var) {
                xv4Var = xv4Var2;
                obj = b;
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
        xv4 xv4Var3 = (xv4) this.l;
        rjc rjcVar2 = (rjc) this.n;
        qgg.h0(obj);
        xv4Var = xv4Var3;
        rjcVar = rjcVar2;
        xv4.a(xv4Var, (dk1) obj);
        Unit unit = Unit.a;
        this.m = null;
        this.n = null;
        this.l = null;
        this.k = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x009b, code lost:
    
        if (r3 == r4) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0054, code lost:
    
        if (r5 == r4) goto L93;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object p(Object obj) {
        Object m;
        List list;
        r3q a;
        Object z;
        List list2;
        v80 v80Var;
        long j;
        l18 l18Var = l18.b;
        og5 og5Var = (og5) this.o;
        mm6 mm6Var = (mm6) this.m;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            sfm sfmVar = ((se5) og5Var.c).d;
            this.m = mm6Var;
            this.k = 1;
            m = sfmVar.m(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    return obj;
                }
                r3q r3qVar = (r3q) this.l;
                list = (List) this.n;
                qgg.h0(obj);
                a = r3qVar;
                z = obj;
                hof hofVar = (hof) z;
                if (hofVar == null) {
                    String str = "Unable to create launched entity info for simple queue for " + ((se5) og5Var.c);
                    Assertions.throwOrSkip$default(new FailedAssertionException(str), null, 2, null);
                    throw new PlaybackQueueStartValidator$InvalidQueueException(new IllegalArgumentException(str), null);
                }
                boolean z2 = hofVar.b;
                hyn hynVar = hofVar.d;
                int i2 = 0;
                if (!hofVar.a) {
                    bdt I = hag.I(Context.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    SharedPreferences sharedPreferences = ((Context) qdcVar.C(I)).getSharedPreferences("Yandex_Music", 0);
                    sharedPreferences.getClass();
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putBoolean("is_shuffle", z2);
                    edit.apply();
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putInt("repeat_mode", hynVar.a);
                    edit2.apply();
                }
                Integer num = new Integer(hofVar.f);
                int intValue = num.intValue();
                if (intValue < 0 || intValue >= list.size()) {
                    num = null;
                }
                int intValue2 = num != null ? num.intValue() : list.indexOf(hofVar.e);
                if (z2) {
                    list2 = ((se5) og5Var.c).o;
                    if (list2 == null) {
                        list2 = CollectionsKt.x0(u75.f(list));
                        Collections.shuffle(list2);
                    }
                } else {
                    list2 = null;
                }
                if (intValue2 < 0 || intValue2 >= list.size()) {
                    intValue2 = list2 == null ? 0 : yhn.j(u75.f(list), phn.a);
                }
                long j2 = ((se5) og5Var.c).i;
                if (j2 == -1) {
                    bdt I2 = hag.I(r1l.class);
                    qdc qdcVar2 = l18Var.a;
                    qdcVar2.getClass();
                    r1l r1lVar = (r1l) qdcVar2.C(I2);
                    mqs mqsVar = (mqs) CollectionsKt.S(list, intValue2);
                    if (mqsVar != null) {
                        Long a2 = r1lVar.a(mqsVar.a);
                        Pair pair = a2 != null ? new Pair(mqsVar, Long.valueOf(a2.longValue())) : null;
                        if (pair != null) {
                            mqs mqsVar2 = (mqs) pair.a;
                            long longValue = ((Number) pair.b).longValue();
                            Long valueOf = Long.valueOf(longValue);
                            if (r1l.c(longValue, mqsVar2.e)) {
                                valueOf = null;
                            }
                            if (valueOf != null) {
                                j = valueOf.longValue();
                                j2 = j;
                            }
                        }
                    }
                    j = 0;
                    j2 = j;
                }
                b6v b6vVar = new b6v(a);
                List list3 = list;
                ArrayList arrayList = new ArrayList(v75.o(list3, 10));
                for (Object obj2 : list3) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        u75.n();
                        throw null;
                    }
                    mqs mqsVar3 = (mqs) obj2;
                    se5 se5Var = (se5) og5Var.c;
                    List list4 = se5Var.j.b;
                    if (list4 == null || (v80Var = (v80) list4.get(i2)) == null) {
                        v80Var = se5Var.j.a;
                    }
                    b6v b6vVar2 = b6vVar;
                    arrayList.add(new jzs(mqsVar3, v80Var, null, null, null, null, b6vVar2, se5Var.l));
                    i2 = i3;
                    b6vVar = b6vVar2;
                }
                jyu jyuVar = new jyu(new c5q(new q3r("default"), ((se5) og5Var.c).j.a.b));
                wsu wsuVar = new wsu(arrayList, c5b.a, new ssu(intValue2, arrayList.size(), new Long(j2)), z2 ? new seq(((se5) og5Var.c).o, true) : req.a, false);
                nyn K = t7g.K(hynVar);
                h4q h4qVar = (h4q) og5Var.d;
                boolean z3 = og5Var.b;
                h4qVar.getClass();
                this.m = null;
                this.n = null;
                this.l = null;
                this.k = 3;
                bdt I3 = hag.I(f5v.class);
                qdc qdcVar3 = l18Var.a;
                qdcVar3.getClass();
                Object V = x97.V(dm6.b, new r1w(new evj((f5v) qdcVar3.C(I3), jyuVar, wsuVar, K, h4qVar, z3), null, 8), this);
                return V == nm6Var ? nm6Var : V;
            }
            qgg.h0(obj);
            m = obj;
        }
        list = (List) m;
        if (list.isEmpty()) {
            throw new PlaybackQueueStartValidator$InvalidQueueException(new IllegalArgumentException("Simple Queue must have at least one track "), null);
        }
        se5 se5Var2 = (se5) og5Var.c;
        c cVar = se5Var2.a;
        String str2 = se5Var2.m;
        Object obj3 = se5Var2.k.a;
        z1p z1pVar = obj3 instanceof z1p ? (z1p) obj3 : null;
        a = t3q.a(cVar, str2, z1pVar != null ? u1g.R(z1pVar) : null, new zga(list, 3));
        mvn mvnVar = hof.g;
        se5 se5Var3 = (se5) og5Var.c;
        this.m = mm6Var;
        this.n = list;
        this.l = a;
        this.k = 2;
        z = mvnVar.z(se5Var3, list, this);
    }

    private final Object q(Object obj) {
        Object value;
        oi5 oi5Var = (oi5) this.n;
        mm6 mm6Var = (mm6) this.m;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            ik5 c = oi5Var.c();
            ArrayList arrayList = (ArrayList) this.l;
            Map map = (Map) this.o;
            this.m = mm6Var;
            this.k = 1;
            obj = c.a(((TriggerApi) c.a.getValue()).a(new TriggerPollingRequestDto(arrayList, map)), this);
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
        xyo xyoVar = (xyo) obj;
        if (!(xyoVar instanceof wyo)) {
            return Unit.a;
        }
        jyr jyrVar = oi5Var.d;
        xdr xdrVar = oi5Var.e;
        qk5 qk5Var = (qk5) jyrVar.getValue();
        Map map2 = (Map) xdrVar.getValue();
        Map map3 = (Map) ((wyo) xyoVar).a;
        LinkedHashMap a = qk5Var.a(uah.i(map2, map3));
        Set keySet = map3.keySet();
        int a2 = tah.a(v75.o(keySet, 10));
        if (a2 < 16) {
            a2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a2);
        for (Object obj2 : keySet) {
            Collection collection = (List) a.get((String) obj2);
            if (collection == null) {
                collection = c5b.a;
            }
            linkedHashMap.put(obj2, collection);
        }
        do {
            value = xdrVar.getValue();
        } while (!xdrVar.k(value, uah.i((Map) value, linkedHashMap)));
        kcc kccVar = new kcc(new lhc(CollectionsKt.F(linkedHashMap.entrySet()), new z35(13), ihp.a));
        while (kccVar.hasNext()) {
            Pair pair = (Pair) kccVar.next();
            x97.y(mm6Var, null, null, new rc4(oi5Var, (String) pair.a, (mh5) pair.b, null, 15), 3);
        }
        return Unit.a;
    }

    private final Object s(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            ik5 c = ((oi5) this.m).c();
            String str = (String) this.l;
            String str2 = (String) this.n;
            String str3 = (String) this.o;
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
            this.k = 1;
            if (c.c(str, str2, str3, e5bVar, this) == nm6Var) {
                return nm6Var;
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

    private final Object t(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i != 0) {
            if (i == 1) {
                qgg.h0(obj);
                return obj;
            }
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qgg.h0(obj);
        xj5 xj5Var = (xj5) this.m;
        zh5 zh5Var = (zh5) this.n;
        Activity activity = (Activity) this.o;
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        boolean h = ((yg5) ((byb) qdcVar.C(I)).c(ern.a(yg5.class))).h();
        String str = (String) this.l;
        this.k = 1;
        Object e = xj5Var.e(zh5Var, activity, h, str, this);
        return e == nm6Var ? nm6Var : e;
    }

    private final Object u(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            sp5 sp5Var = (sp5) this.m;
            ScrollCaptureSession scrollCaptureSession = (ScrollCaptureSession) this.n;
            Rect rect = (Rect) this.l;
            aqe aqeVar = new aqe(rect.left, rect.top, rect.right, rect.bottom);
            this.k = 1;
            obj = sp5.a(sp5Var, scrollCaptureSession, aqeVar, this);
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
        ((Consumer) this.o).accept(uwf.C((aqe) obj));
        return Unit.a;
    }

    private final Object v(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            kpm kpmVar = (kpm) this.m;
            t4w t4wVar = (t4w) this.n;
            this.k = 1;
            obj = y96.a(kpmVar, t4wVar, this);
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
        ((AtomicInteger) this.l).set(((Number) obj).intValue());
        ((lcg) this.o).cancel(true);
        return Unit.a;
    }

    private final Object w(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i != 0) {
            if (i == 1) {
                qgg.h0(obj);
                return obj;
            }
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qgg.h0(obj);
        ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.m;
        ucg ucgVar = (ucg) this.n;
        kpm kpmVar = (kpm) this.l;
        t4w t4wVar = (t4w) this.o;
        this.k = 1;
        Object e = ConstraintTrackingWorker.e(constraintTrackingWorker, ucgVar, kpmVar, t4wVar, this);
        return e == nm6Var ? nm6Var : e;
    }

    private final Object x(Object obj) {
        dc6 dc6Var = (dc6) this.n;
        xzi xziVar = dc6Var.s;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        try {
            try {
                if (i == 0) {
                    qgg.h0(obj);
                    r2f Q = saf.Q(((mm6) this.m).getCoroutineContext());
                    dc6Var.x = true;
                    iyo iyoVar = dc6Var.p;
                    hqi hqiVar = hqi.a;
                    ov ovVar = new ov((wmt) this.l, dc6Var, (sh3) this.o, Q, (Continuation) null, 14);
                    this.k = 1;
                    if (iyoVar.e(hqiVar, ovVar, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                xziVar.d0();
                dc6Var.x = false;
                xziVar.V(null);
                dc6Var.u = false;
                return Unit.a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            dc6Var.x = false;
            xziVar.V(null);
            dc6Var.u = false;
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [aur, kotlin.jvm.functions.Function2] */
    private final Object y(Object obj) {
        BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.o;
        tf6 tf6Var = (tf6) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        try {
            try {
                try {
                    try {
                        if (i == 0) {
                            qgg.h0(obj);
                            mm6 mm6Var = (mm6) this.m;
                            ?? r3 = (aur) this.n;
                            this.k = 1;
                            if (r3.invoke(mm6Var, this) == nm6Var) {
                                return nm6Var;
                            }
                        } else {
                            if (i != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj);
                        }
                    } catch (CancellationException e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    Log.e("GlanceAppWidget", "BroadcastReceiver execution failed", th);
                }
                gld.L(tf6Var, null);
                return Unit.a;
            } catch (Throwable th2) {
                gld.L(tf6Var, null);
                throw th2;
            }
        } finally {
            try {
                pendingResult.finish();
            } catch (IllegalStateException e2) {
                Log.e("GlanceAppWidget", "Error thrown when trying to finish broadcast", e2);
            }
        }
    }

    private final Object z(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        ((mp6) this.m).log(this.k, (String) this.l, (String) this.n, (Throwable) this.o);
        return Unit.a;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v8, types: [aur, kotlin.jvm.functions.Function1] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                v3 v3Var = new v3((w3) this.n, (String) this.l, (mwk) this.o, continuation, 0);
                v3Var.m = obj;
                return v3Var;
            case 1:
                return new v3((gx) this.m, (fx) this.n, (String) this.l, (gj) this.o, continuation, 1);
            case 2:
                v3 v3Var2 = new v3((d2j) this.n, (Duration) this.l, (Duration) this.o, continuation, 2);
                v3Var2.m = obj;
                return v3Var2;
            case 3:
                return new v3(this.m, (Parcelable) this.n, this.o, (String) this.l, continuation, 3);
            case 4:
                return new v3(4, (m5) this.m, (xb0) this.n, (String) this.l, (String) this.o, continuation);
            case 5:
                v3 v3Var3 = new v3((Function1) this.n, (ch0) this.l, (nwf) this.o, continuation, 5);
                v3Var3.m = obj;
                return v3Var3;
            case 6:
                return new v3(this.m, (fk0) this.n, (aqi) this.l, (aqi) this.o, continuation, 6);
            case 7:
                v3 v3Var4 = new v3((aw0) this.n, (Context) this.l, (aqi) this.o, continuation, 7);
                v3Var4.m = obj;
                return v3Var4;
            case 8:
                v3 v3Var5 = new v3((pv0) this.n, (Context) this.l, (rkd) this.o, continuation, 8);
                v3Var5.m = obj;
                return v3Var5;
            case 9:
                v3 v3Var6 = new v3((m11) this.o, continuation, 9);
                v3Var6.m = obj;
                return v3Var6;
            case 10:
                return new v3((bi1) this.m, (u51) this.n, (xpt) this.l, (v5) this.o, continuation, 10);
            case 11:
                return new v3(this.o, (String) this.l, continuation, 11);
            case 12:
                return new v3(this.o, (String) this.l, continuation, 12);
            case 13:
                v3 v3Var7 = new v3((aqi) this.l, (poi) this.o, continuation, 13);
                v3Var7.m = obj;
                return v3Var7;
            case 14:
                v3 v3Var8 = new v3((pr3) this.n, (String) this.o, continuation);
                v3Var8.l = ((zrt) obj).a;
                return v3Var8;
            case 15:
                v3 v3Var9 = new v3((lu3) this.l, (Function1) this.o, continuation);
                v3Var9.m = obj;
                return v3Var9;
            case 16:
                return new v3((aqi) this.m, (aqi) this.n, (wn5) this.l, (Function0) this.o, continuation, 16);
            case 17:
                v3 v3Var10 = new v3((hr4) this.l, (bjh) this.o, continuation, 17);
                v3Var10.m = obj;
                return v3Var10;
            case 18:
                v3 v3Var11 = new v3((xv4) this.o, continuation, 18);
                v3Var11.m = obj;
                return v3Var11;
            case 19:
                v3 v3Var12 = new v3((og5) this.o, continuation, 19);
                v3Var12.m = obj;
                return v3Var12;
            case 20:
                v3 v3Var13 = new v3((oi5) this.n, (ArrayList) this.l, (Map) this.o, continuation, 20);
                v3Var13.m = obj;
                return v3Var13;
            case 21:
                return new v3(21, (oi5) this.m, (String) this.n, (String) this.l, (String) this.o, continuation);
            case 22:
                return new v3(this.m, (Parcelable) this.n, this.o, (String) this.l, continuation, 22);
            case 23:
                return new v3((sp5) this.m, (ScrollCaptureSession) this.n, (Rect) this.l, (Consumer) this.o, continuation, 23);
            case 24:
                return new v3((kpm) this.m, (t4w) this.n, (AtomicInteger) this.l, (lcg) this.o, continuation, 24);
            case 25:
                return new v3((ConstraintTrackingWorker) this.m, (ucg) this.n, (kpm) this.l, (t4w) this.o, continuation, 25);
            case 26:
                v3 v3Var14 = new v3((dc6) this.n, (wmt) this.l, (sh3) this.o, continuation, 26);
                v3Var14.m = obj;
                return v3Var14;
            case 27:
                v3 v3Var15 = new v3((Function2) this.n, (tf6) this.l, (BroadcastReceiver.PendingResult) this.o, continuation);
                v3Var15.m = obj;
                return v3Var15;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new v3((mp6) this.m, this.k, (String) this.l, (String) this.n, (Throwable) this.o, continuation);
            default:
                return new v3((kv6) this.n, (u2q) this.l, (u2q) this.o, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 5:
                ((v3) create((th0) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
            case 14:
                String str = ((zrt) obj).a;
                v3 v3Var = new v3((pr3) this.n, (String) this.o, (Continuation) obj2);
                v3Var.l = str;
                break;
        }
        return ((v3) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0388, code lost:
    
        if (r0 == r4) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0374, code lost:
    
        if (r2 == r4) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03de, code lost:
    
        if (defpackage.zsd.h0(r1, r2, r29) == r7) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0503, code lost:
    
        if (r0 == r15) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x04c5, code lost:
    
        if (r0 == r15) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0631, code lost:
    
        if (r0 == r12) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x05f3, code lost:
    
        if (r0 == r12) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0064, code lost:
    
        if (r1 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0155, code lost:
    
        if (r1.h0(r2, r29) == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0100, code lost:
    
        if (r1 != null) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0257 A[LOOP:0: B:23:0x0251->B:25:0x0257, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0202  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:136:0x0423 -> B:129:0x03c9). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object obj2;
        String str;
        Object invoke;
        Object invoke2;
        jtm jtmVar;
        Object obj3;
        uqf uqfVar;
        Object c;
        ypi ypiVar;
        ypi C;
        long m;
        q6k fwVar;
        Object k;
        jbj jbjVar;
        oq oqVar;
        Object a2;
        na1 na1Var;
        jyr jyrVar;
        jyr jyrVar2;
        nm6 nm6Var;
        Object b;
        List list;
        Object b2;
        List list2;
        Object b3;
        List list3;
        jyr jyrVar3;
        h82 h82Var;
        Continuation continuation;
        nm6 nm6Var2;
        jyr jyrVar4;
        Object b4;
        List list4;
        Object b5;
        List list5;
        Object b6;
        List list6;
        pjc s0;
        Object e;
        c01 c01Var;
        Object h;
        zwf i1;
        zwf zwfVar;
        eps epsVar;
        lve lveVar;
        lve lveVar2;
        Iterator it;
        o4c o4cVar;
        int i = 3;
        int i2 = 2;
        int i3 = 1;
        Continuation continuation2 = null;
        switch (this.j) {
            case 0:
                String str2 = (String) this.l;
                w3 w3Var = (w3) this.n;
                rjc rjcVar = (rjc) this.m;
                nm6 nm6Var3 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    y2 y2Var = w3Var.e;
                    this.m = rjcVar;
                    this.k = 1;
                    a = y2Var.a(str2, this);
                    if (a == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        if (i4 == 3) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a = obj;
                }
                rj6 rj6Var = (rj6) a;
                if (rj6Var instanceof pj6) {
                    c73 c73Var = new c73(w3Var.a());
                    this.m = null;
                    this.k = 2;
                    if (rjcVar.emit(c73Var, this) == nm6Var3) {
                        return nm6Var3;
                    }
                    return Unit.a;
                }
                if (!(rj6Var instanceof qj6)) {
                    b6e.s();
                    return null;
                }
                xqn xqnVar = new xqn();
                d3 d3Var = w3Var.g;
                d3Var.getClass();
                str2.getClass();
                pjc d = ((mu) ((cu) d3Var.a.getValue())).d(str2);
                s3 s3Var = new s3((qj6) rj6Var, w3Var, xqnVar, (mwk) this.o, rjcVar, 0);
                this.m = null;
                this.k = 3;
                Object collect = d.collect(new u3(s3Var, xqnVar, 0), this);
                if (collect != nm6Var3) {
                    collect = Unit.a;
                }
                if (collect == nm6Var3) {
                    return nm6Var3;
                }
                return Unit.a;
            case 1:
                Object obj4 = nm6.a;
                int i5 = this.k;
                if (i5 != 0) {
                    if (i5 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                ox oxVar = ((gx) this.m).a;
                fx fxVar = (fx) this.n;
                String str3 = (String) this.l;
                gj gjVar = (gj) this.o;
                this.k = 1;
                String str4 = gjVar.e;
                String str5 = gjVar.a;
                if (str4 == null || str5 == null) {
                    ssg.a(6, "AlbumPromoRepository", "postFeedback called with empty adData: " + gjVar, null);
                    obj2 = Unit.a;
                } else {
                    int ordinal = fxVar.ordinal();
                    if (ordinal == 0) {
                        str = "like";
                    } else {
                        if (ordinal != 1) {
                            b6e.s();
                            return null;
                        }
                        str = "dislike";
                    }
                    obj2 = uwf.h(oxVar.a.a(new AlbumPromoFeedbackRequest(str, str4, str5, str3)), this);
                    if (obj2 != obj4) {
                        obj2 = Unit.a;
                    }
                }
                if (obj2 == obj4) {
                    return obj4;
                }
                return Unit.a;
            case 2:
                d2j d2jVar = (d2j) this.n;
                mm6 mm6Var = (mm6) this.m;
                nm6 nm6Var4 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    Duration duration = (Duration) this.l;
                    Duration duration2 = (Duration) this.o;
                    this.m = mm6Var;
                    this.k = 1;
                    d2jVar.d(e2j.a, duration, duration2);
                    d2jVar.d(e2j.b, duration, duration2);
                    if (Unit.a == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                if (gld.T(mm6Var)) {
                    Duration duration3 = d2j.f;
                    Function2 function2 = d2jVar.a;
                    if (function2 != null) {
                        function2.invoke(d2jVar, Boolean.FALSE);
                    }
                }
                return Unit.a;
            case 3:
                nm6 nm6Var5 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    ua2 ua2Var = (ua2) this.m;
                    this.k = 1;
                    invoke = ua2Var.invoke(this);
                    if (invoke == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    invoke = obj;
                }
                rj6 rj6Var2 = (rj6) invoke;
                if (rj6Var2 != null) {
                    jcv jcvVar = (jcv) this.n;
                    xb0 xb0Var = (xb0) this.o;
                    String str6 = (String) this.l;
                    if (rj6Var2 instanceof qj6) {
                        g2b g2bVar = (g2b) ((qj6) rj6Var2).a;
                        if (jcvVar != null) {
                            List list7 = g2bVar.a;
                            ArrayList arrayList = new ArrayList(v75.o(list7, 10));
                            Iterator it2 = list7.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(zsu.a((zsu) it2.next(), jcvVar));
                            }
                            g2bVar = new g2b(arrayList, g2bVar.b);
                        }
                        c62 c62Var = xb0Var.a;
                        str6.getClass();
                        g2bVar.getClass();
                        c62Var.e.put(str6, g2bVar);
                    } else if (!(rj6Var2 instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                }
                return Unit.a;
            case 4:
                nm6 nm6Var6 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    m5 m5Var = (m5) this.m;
                    this.k = 1;
                    invoke2 = m5Var.invoke(this);
                    if (invoke2 == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    invoke2 = obj;
                }
                rj6 rj6Var3 = (rj6) invoke2;
                String str7 = (String) this.l;
                xb0 xb0Var2 = (xb0) this.n;
                String str8 = (String) this.o;
                if (rj6Var3 instanceof qj6) {
                    gmu gmuVar = (gmu) ((qj6) rj6Var3).a;
                    if (str7 != null) {
                        gmuVar = gmu.a(gmuVar, str7);
                    }
                    c62 c62Var2 = xb0Var2.a;
                    gmuVar.getClass();
                    c62Var2.f.put(str8, gmuVar);
                } else if (!(rj6Var3 instanceof pj6)) {
                    b6e.s();
                    return null;
                }
                return Unit.a;
            case 5:
                nm6 nm6Var7 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    ov ovVar = new ov((th0) this.m, (Function1) this.n, (ch0) this.l, (nwf) this.o, (Continuation) null, 3);
                    this.k = 1;
                    if (gld.Q(ovVar, this) == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj7.f();
                return null;
            case 6:
                fk0 fk0Var = (fk0) this.n;
                nm6 nm6Var8 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    if (!Intrinsics.d(this.m, fk0Var.e.getValue())) {
                        fk0 fk0Var2 = (fk0) this.n;
                        Object obj5 = this.m;
                        aqi aqiVar = (aqi) this.l;
                        b9r b9rVar = pk0.a;
                        tm0 tm0Var = (tm0) aqiVar.getValue();
                        this.k = 1;
                        if (fk0.c(fk0Var2, obj5, tm0Var, null, this, 12) == nm6Var8) {
                            return nm6Var8;
                        }
                    }
                    return Unit.a;
                }
                if (i10 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                aqi aqiVar2 = (aqi) this.o;
                b9r b9rVar2 = pk0.a;
                Function1 function1 = (Function1) aqiVar2.getValue();
                if (function1 != null) {
                    function1.invoke(fk0Var.e());
                }
                return Unit.a;
            case 7:
                Context context = (Context) this.l;
                aw0 aw0Var = (aw0) this.n;
                nm6 nm6Var9 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    jtmVar = (jtm) this.m;
                    if (aw0Var.i.getValue() != null || (uqfVar = aw0Var.d.b) == null) {
                        obj3 = null;
                        aqi aqiVar3 = (aqi) this.o;
                        b2r k2 = g2r.k();
                        ypiVar = !(k2 instanceof ypi) ? (ypi) k2 : null;
                        if (ypiVar != null || (C = ypiVar.C(null, null)) == null) {
                            xq0.q("Cannot create a mutable snapshot of an read-only snapshot");
                            return null;
                        }
                        try {
                            b2r j = C.j();
                            try {
                                rv0 rv0Var = aw0Var.e;
                                x6k x6kVar = aw0Var.j;
                                int i12 = rv0Var.a;
                                if (!(Integer.MIN_VALUE <= i12 && i12 < -1)) {
                                    Object systemService = context.getSystemService("appwidget");
                                    systemService.getClass();
                                    AppWidgetManager appWidgetManager = (AppWidgetManager) systemService;
                                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                                    AppWidgetProviderInfo appWidgetInfo = appWidgetManager.getAppWidgetInfo(rv0Var.a);
                                    if (appWidgetInfo == null) {
                                        m = 0;
                                    } else {
                                        int min = Math.min(appWidgetInfo.minWidth, (appWidgetInfo.resizeMode & 1) != 0 ? appWidgetInfo.minResizeWidth : Integer.MAX_VALUE);
                                        int min2 = Math.min(appWidgetInfo.minHeight, (2 & appWidgetInfo.resizeMode) != 0 ? appWidgetInfo.minResizeHeight : Integer.MAX_VALUE);
                                        float f = displayMetrics.density;
                                        m = xv.m(min / f, min2 / f);
                                    }
                                    aqiVar3.setValue(new fma(m));
                                    if (((Bundle) x6kVar.getValue()) == null) {
                                        x6kVar.setValue(appWidgetManager.getAppWidgetOptions(rv0Var.a));
                                    }
                                }
                                if (obj3 != null) {
                                    aw0Var.i.setValue(obj3);
                                }
                                jtmVar.setValue(Boolean.TRUE);
                                b2r.q(j);
                                C.w().w();
                                C.c();
                                return Unit.a;
                            } catch (Throwable th) {
                                b2r.q(j);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            C.c();
                            throw th2;
                        }
                    }
                    bld bldVar = aw0Var.f;
                    String str9 = aw0Var.a;
                    this.m = jtmVar;
                    this.k = 1;
                    c = bldVar.c(context, uqfVar, str9, this);
                    if (c == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jtmVar = (jtm) this.m;
                    qgg.h0(obj);
                    c = obj;
                }
                obj3 = c;
                aqi aqiVar32 = (aqi) this.o;
                b2r k22 = g2r.k();
                if (!(k22 instanceof ypi)) {
                }
                if (ypiVar != null) {
                }
                xq0.q("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            case 8:
                nm6 nm6Var10 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    dw0 dw0Var = new dw0(new AtomicReference(null), (ltm) this.m);
                    k3 k3Var = new k3((pv0) this.n, (Context) this.l, (rkd) this.o, (Continuation) null, 14);
                    this.k = 1;
                    if (x97.V(dw0Var, k3Var, this) == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 9:
                oq oqVar2 = (oq) this.m;
                nm6 nm6Var11 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    if (!u2x.I(oqVar2)) {
                        String w = vz1.w(oqVar2.o);
                        String str10 = oqVar2.b;
                        String x = etn.x(oqVar2);
                        String str11 = x.length() > 0 ? x : null;
                        String o0 = etn.o0(oqVar2);
                        fwVar = new fw(new ru(oqVar2.i(), w, str10, str11, o0.length() > 0 ? o0 : null, oqVar2.g.b()));
                        return new u01(fwVar, oqVar2);
                    }
                    jbj jbjVar2 = jbj.a;
                    u3g u3gVar = (u3g) ((m11) this.o).m.getValue();
                    String str12 = oqVar2.a;
                    this.m = oqVar2;
                    this.n = jbjVar2;
                    this.l = oqVar2;
                    this.k = 1;
                    k = ((t3g) u3gVar).k(str12, this);
                    if (k == nm6Var11) {
                        return nm6Var11;
                    }
                    jbjVar = jbjVar2;
                    oqVar = oqVar2;
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oq oqVar3 = (oq) this.l;
                    jbj jbjVar3 = (jbj) this.n;
                    qgg.h0(obj);
                    jbjVar = jbjVar3;
                    oqVar = oqVar3;
                    k = obj;
                }
                boolean booleanValue = ((Boolean) k).booleanValue();
                jbjVar.getClass();
                fwVar = new gw(jbj.e(oqVar, booleanValue));
                return new u01(fwVar, oqVar2);
            case 10:
                bi1 bi1Var = (bi1) this.m;
                np2 np2Var = (np2) bi1Var.b;
                nm6 nm6Var12 = nm6.a;
                int i15 = this.k;
                try {
                    if (i15 == 0) {
                        qgg.h0(obj);
                        o21 o21Var = (o21) ((jyr) bi1Var.r).getValue();
                        String str13 = ((u51) this.n).a;
                        this.k = 1;
                        a2 = o21Var.a(str13, this);
                        if (a2 == nm6Var12) {
                            return nm6Var12;
                        }
                    } else {
                        if (i15 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        a2 = obj;
                    }
                    Pair pair = (Pair) a2;
                    if (pair == null || (na1Var = (na1) pair.a) == null) {
                        throw new IOException("Fail to load ArtistInfo");
                    }
                    List a3 = na1Var.a();
                    xpt xptVar = (xpt) this.l;
                    a0g.H(np2Var, a3, xptVar != null ? xptVar.c : null, xptVar != null ? xptVar.b : null, false, new rh1(xptVar, bi1Var, (u51) this.n, na1Var, (v5) this.o, 1));
                    return Unit.a;
                } catch (IOException e2) {
                    new lum(np2Var).Q(e2);
                    return Unit.a;
                }
            case 11:
                String str14 = (String) this.l;
                w42 w42Var = (w42) this.o;
                jyr jyrVar5 = w42Var.f;
                jyr jyrVar6 = w42Var.d;
                nm6 nm6Var13 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    e12 e12Var = (e12) jyrVar6.getValue();
                    String string = ((dd0) jyrVar5.getValue()).a.getString(R.string.android_auto_kids_albums_title);
                    string.getClass();
                    o42[] o42VarArr = o42.a;
                    y02 y02Var = y02.b;
                    int i17 = 1;
                    q42 q42Var = new q42(w42Var, continuation2, i17);
                    r42 r42Var = new r42(w42Var, continuation2, i17);
                    this.k = 1;
                    jyrVar = jyrVar6;
                    jyrVar2 = jyrVar5;
                    nm6Var = nm6Var13;
                    b = e12Var.b(string, "COLLECTION_KIDS_ALBUMS_MEDIA_ID", null, y02Var, y02Var, 9, q42Var, r42Var, this);
                    break;
                } else {
                    if (i16 != 1) {
                        if (i16 != 2) {
                            if (i16 != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            List list8 = (List) this.n;
                            list3 = (List) this.m;
                            qgg.h0(obj);
                            list2 = list8;
                            b3 = obj;
                            return CollectionsKt.g0(CollectionsKt.g0(list3, list2), (List) b3);
                        }
                        List list9 = (List) this.m;
                        qgg.h0(obj);
                        jyrVar2 = jyrVar5;
                        list = list9;
                        jyrVar = jyrVar6;
                        nm6Var = nm6Var13;
                        b2 = obj;
                        list2 = (List) b2;
                        e12 e12Var2 = (e12) jyrVar.getValue();
                        String string2 = ((dd0) jyrVar2.getValue()).a.getString(R.string.android_auto_kids_tracks_title);
                        string2.getClass();
                        o42[] o42VarArr2 = o42.a;
                        y02 y02Var2 = y02.a;
                        y02 y02Var3 = y02.b;
                        s42 s42Var = new s42(w42Var, str14, continuation2, 3);
                        t42 t42Var = new t42(w42Var, str14, continuation2, 1);
                        this.m = list;
                        this.n = list2;
                        this.k = 3;
                        b3 = e12Var2.b(string2, "COLLECTION_KIDS_TRACKS_MEDIA_ID", y02Var2, y02Var3, y02Var2, 9, s42Var, t42Var, this);
                        if (b3 != nm6Var) {
                            list3 = list;
                            return CollectionsKt.g0(CollectionsKt.g0(list3, list2), (List) b3);
                        }
                        return nm6Var;
                    }
                    qgg.h0(obj);
                    jyrVar2 = jyrVar5;
                    jyrVar = jyrVar6;
                    nm6Var = nm6Var13;
                    b = obj;
                }
                list = (List) b;
                e12 e12Var3 = (e12) jyrVar.getValue();
                String string3 = ((dd0) jyrVar2.getValue()).a.getString(R.string.android_auto_kids_playlists_title);
                string3.getClass();
                o42[] o42VarArr3 = o42.a;
                y02 y02Var4 = y02.b;
                q42 q42Var2 = new q42(w42Var, continuation2, i2);
                v42 v42Var = new v42(w42Var, continuation2, 0);
                this.m = list;
                this.k = 2;
                b2 = e12Var3.b(string3, "COLLECTION_KIDS_PLAYLISTS_MEDIA_ID", null, y02Var4, y02Var4, 9, q42Var2, v42Var, this);
                break;
            case 12:
                String str15 = (String) this.l;
                h82 h82Var2 = (h82) this.o;
                jyr jyrVar7 = h82Var2.f;
                jyr jyrVar8 = h82Var2.d;
                nm6 nm6Var14 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    e12 e12Var4 = (e12) jyrVar8.getValue();
                    String string4 = ((dd0) jyrVar7.getValue()).a.getString(R.string.android_auto_kids_albums_title);
                    string4.getClass();
                    b72 b72Var = b72.b;
                    y02 y02Var5 = y02.b;
                    c82 c82Var = new c82(h82Var2, continuation2, i3);
                    d82 d82Var = new d82(h82Var2, continuation2, i3);
                    this.k = 1;
                    jyrVar3 = jyrVar7;
                    h82Var = h82Var2;
                    continuation = null;
                    nm6Var2 = nm6Var14;
                    jyrVar4 = jyrVar8;
                    b4 = e12Var4.b(string4, "DOWNLOADED_KIDS_ALBUMS_MEDIA_ID", null, y02Var5, y02Var5, 9, c82Var, d82Var, this);
                    break;
                } else {
                    if (i18 != 1) {
                        if (i18 != 2) {
                            if (i18 != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            List list10 = (List) this.n;
                            list6 = (List) this.m;
                            qgg.h0(obj);
                            list5 = list10;
                            b6 = obj;
                            return CollectionsKt.g0(CollectionsKt.g0(list6, list5), (List) b6);
                        }
                        List list11 = (List) this.m;
                        qgg.h0(obj);
                        h82Var = h82Var2;
                        list4 = list11;
                        jyrVar3 = jyrVar7;
                        jyrVar4 = jyrVar8;
                        nm6Var2 = nm6Var14;
                        continuation = null;
                        b5 = obj;
                        list5 = (List) b5;
                        e12 e12Var5 = (e12) jyrVar4.getValue();
                        String string5 = ((dd0) jyrVar3.getValue()).a.getString(R.string.android_auto_kids_tracks_title);
                        string5.getClass();
                        b72 b72Var2 = b72.b;
                        y02 y02Var6 = y02.a;
                        y02 y02Var7 = y02.b;
                        e82 e82Var = new e82(h82Var, str15, continuation, 3);
                        f82 f82Var = new f82(h82Var, str15, continuation, 1);
                        this.m = list4;
                        this.n = list5;
                        this.k = 3;
                        b6 = e12Var5.b(string5, "DOWNLOADED_KIDS_TRACKS_MEDIA_ID", y02Var6, y02Var7, y02Var6, 9, e82Var, f82Var, this);
                        if (b6 != nm6Var2) {
                            list6 = list4;
                            return CollectionsKt.g0(CollectionsKt.g0(list6, list5), (List) b6);
                        }
                        return nm6Var2;
                    }
                    qgg.h0(obj);
                    h82Var = h82Var2;
                    jyrVar3 = jyrVar7;
                    jyrVar4 = jyrVar8;
                    nm6Var2 = nm6Var14;
                    continuation = null;
                    b4 = obj;
                }
                list4 = (List) b4;
                e12 e12Var6 = (e12) jyrVar4.getValue();
                String string6 = ((dd0) jyrVar3.getValue()).a.getString(R.string.android_auto_kids_playlists_title);
                string6.getClass();
                b72 b72Var3 = b72.b;
                y02 y02Var8 = y02.b;
                c82 c82Var2 = new c82(h82Var, continuation, i2);
                v42 v42Var2 = new v42(h82Var, continuation, 1);
                this.m = list4;
                this.k = 2;
                b5 = e12Var6.b(string6, "DOWNLOADED_KIDS_PLAYLISTS_MEDIA_ID", null, y02Var8, y02Var8, 9, c82Var2, v42Var2, this);
                break;
            case 13:
                mm6 mm6Var2 = (mm6) this.m;
                nm6 nm6Var15 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    s0 = szf.s0(new jc((aqi) this.l, i));
                } else {
                    if (i19 == 1) {
                        s0 = (pjc) this.n;
                        qgg.h0(obj);
                        mm6 mm6Var3 = mm6Var2;
                        pjc pjcVar = s0;
                        fcf fcfVar = new fcf();
                        fcfVar.a = 1600;
                        Float valueOf = Float.valueOf(1.0f);
                        fcfVar.a(valueOf, 0);
                        fcfVar.a(Float.valueOf(0.5f), 800);
                        fcfVar.a(valueOf, 1600);
                        gcf gcfVar = new gcf(fcfVar);
                        pv pvVar = new pv((poi) this.o, i2);
                        this.m = mm6Var3;
                        this.n = pjcVar;
                        this.k = 2;
                        if (v5g.p(1.0f, 1.0f, gcfVar, pvVar, this, 4) != nm6Var15) {
                            mm6Var2 = mm6Var3;
                            s0 = pjcVar;
                        }
                        return nm6Var15;
                    }
                    if (i19 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    s0 = (pjc) this.n;
                    qgg.h0(obj);
                }
                if (!gld.T(mm6Var2)) {
                    return Unit.a;
                }
                lf2 lf2Var = new lf2(i2, i, continuation2);
                this.m = mm6Var2;
                this.n = s0;
                this.k = 1;
                break;
            case 14:
                String str16 = (String) this.o;
                pr3 pr3Var = (pr3) this.n;
                String str17 = (String) this.l;
                nm6 nm6Var16 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    p51 p51Var = pr3Var.b;
                    this.l = str17;
                    this.k = 1;
                    e = p51Var.e(str17, str16, this);
                    break;
                } else {
                    if (i20 != 1) {
                        if (i20 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c01 c01Var2 = (c01) this.m;
                        qgg.h0(obj);
                        c01Var = c01Var2;
                        h = obj;
                        return new mr3(c01Var, (List) h);
                    }
                    qgg.h0(obj);
                    e = obj;
                }
                c01Var = (c01) e;
                if (c01Var != null) {
                    rus rusVar = pr3Var.e;
                    this.l = null;
                    this.m = c01Var;
                    this.k = 2;
                    h = rusVar.h(str17, str16, this);
                    break;
                } else {
                    return null;
                }
            case 15:
                return k(obj);
            case 16:
                return l(obj);
            case 17:
                return n(obj);
            case 18:
                return o(obj);
            case 19:
                return p(obj);
            case 20:
                return q(obj);
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
                nm6 nm6Var17 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    kv6 kv6Var = (kv6) this.n;
                    boolean z = kv6Var.e;
                    u2q u2qVar = (u2q) this.l;
                    u2q u2qVar2 = (u2q) this.o;
                    if (!z) {
                        i1 = kv6.i1(kv6Var, u2qVar, u2qVar2);
                        if (i1 != null) {
                            if (i1.z(((kv6) this.n).k1().J0())) {
                                i1 = null;
                                break;
                            }
                        }
                        return Unit.a;
                    }
                    i1 = kv6.i1(kv6Var, u2qVar, u2qVar2);
                    if (i1 != null) {
                        if (i1.z(((kv6) this.n).k1().J0())) {
                            i1 = null;
                            break;
                        }
                    }
                    kv6 kv6Var2 = (kv6) this.n;
                    u2q u2qVar3 = (u2q) this.l;
                    u2q u2qVar4 = (u2q) this.o;
                    kv6Var2.getClass();
                    qvs b7 = u2qVar3.b();
                    long duration4 = b7 != null ? kv6Var2.k1().getDuration() - (b7.d - b7.c) : kv6Var2.k1().getDuration();
                    qvs b8 = u2qVar3.b();
                    i1 = ywf.r(b8 != null ? qvs.a(b8, 0L, duration4, kv6Var2.k1().getDuration(), 3) : null, u2qVar4.b(), kv6Var2.k1().getDuration(), kv6Var2.d, kv6Var2.e);
                    if (i1 == null || i1.z(((kv6) this.n).k1().J0())) {
                        i1 = null;
                    }
                    if (i1 == null) {
                        return Unit.a;
                    }
                    ((kv6) this.n).s = new Long(i1.L());
                    kv6 kv6Var3 = (kv6) this.n;
                    if (!kv6Var3.f) {
                        kv6Var3.y = new Long(i1.M());
                    }
                    kv6 kv6Var4 = (kv6) this.n;
                    kv6Var4.w = (u2q) this.o;
                    long E = i1.E();
                    msa msaVar = nsa.b;
                    kv6Var4.x = new zu6(E, yd5.N(i1.F(), ssa.MILLISECONDS));
                    ExoPlayer k1 = ((kv6) this.n).k1();
                    this.m = i1;
                    this.k = 1;
                    break;
                } else {
                    if (i21 != 1) {
                        if (i21 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        zwf zwfVar2 = (zwf) this.m;
                        qgg.h0(obj);
                        zwfVar = zwfVar2;
                        ExoPlayer exoPlayer = ((kv6) this.n).l.h().a.a;
                        epsVar = ((kv6) this.n).l;
                        u2q u2qVar5 = (u2q) this.o;
                        epsVar.getClass();
                        u2qVar5.getClass();
                        mal.a();
                        lveVar = (lve) epsVar.d;
                        epsVar.d = epsVar.h();
                        if (lveVar == null) {
                            ssg.a(3, "InternalPlayerManager", "checkOrClear " + ((Object) String.valueOf(lveVar)) + ", args(" + String.valueOf(u2qVar5) + ") ", null);
                            kve kveVar = lveVar.b;
                            if (!Intrinsics.d(kveVar != null ? kveVar.a : null, u2qVar5) || lveVar.a.a.k() != null) {
                                lveVar = eps.e(lveVar);
                                lveVar.a.a.stop();
                            }
                        } else {
                            ssg.a(3, "InternalPlayerManager", hrg.q("swapPlayerWithOverlapping create new current player, args(", String.valueOf(u2qVar5), ") "), null);
                            lveVar = new lve(epsVar.f(), null);
                        }
                        epsVar.c = lveVar;
                        eps.i("swapPlayerWithOverlapping", String.valueOf(u2qVar5), new jve(epsVar, i2));
                        ssg.a(3, "InternalPlayerManager", "setFadeMode fade updated, args() ", null);
                        lveVar2 = (lve) epsVar.d;
                        if (lveVar2 != null && (o4cVar = lveVar2.a) != null) {
                            o4cVar.b.i = l4c.b;
                        }
                        epsVar.h().a.b.i = l4c.a;
                        it = ((ArrayList) epsVar.e).iterator();
                        while (it.hasNext()) {
                            ((f8l) it.next()).p(4);
                        }
                        if (epsVar.h().a.a.k() != null) {
                            Assertions.throwOrSkip("InternalPlayerManager", new FailedAssertionException("swapped on player with error, before swap listeners, fixing player"));
                            lve e3 = eps.e(epsVar.h());
                            e3.a.a.stop();
                            epsVar.c = e3;
                        }
                        epsVar.j((lve) epsVar.d, epsVar.h());
                        ssg.a(3, "CrossfadingExoPlayerImpl", "players swapped", null);
                        kv6 kv6Var5 = (kv6) this.n;
                        xdr xdrVar = kv6Var5.u;
                        Float f2 = new Float(1 - ((Number) kv6Var5.t.getValue()).floatValue());
                        xdrVar.getClass();
                        xdrVar.m(null, f2);
                        xdr xdrVar2 = ((kv6) this.n).t;
                        Float f3 = new Float(0.0f);
                        xdrVar2.getClass();
                        xdrVar2.m(null, f3);
                        ssg.a(3, "CrossfadingExoPlayerImpl", "listeners swapped", null);
                        kv6 kv6Var6 = (kv6) this.n;
                        tf6 tf6Var = kv6Var6.n;
                        ExoPlayer k12 = kv6Var6.k1();
                        kv6 kv6Var7 = (kv6) this.n;
                        zwfVar.e0(tf6Var, k12, exoPlayer, kv6Var7.t, kv6Var7.u);
                        return Unit.a;
                    }
                    i1 = (zwf) this.m;
                    qgg.h0(obj);
                }
                kv6 kv6Var8 = (kv6) this.n;
                if (kv6Var8.f) {
                    kv6Var8.y = new Long(i1.M());
                }
                ExoPlayer k13 = ((kv6) this.n).k1();
                xdr xdrVar3 = ((kv6) this.n).t;
                this.m = i1;
                this.k = 2;
                if (i1.f0(k13, xdrVar3, this) != nm6Var17) {
                    zwfVar = i1;
                    ExoPlayer exoPlayer2 = ((kv6) this.n).l.h().a.a;
                    epsVar = ((kv6) this.n).l;
                    u2q u2qVar52 = (u2q) this.o;
                    epsVar.getClass();
                    u2qVar52.getClass();
                    mal.a();
                    lveVar = (lve) epsVar.d;
                    epsVar.d = epsVar.h();
                    if (lveVar == null) {
                    }
                    epsVar.c = lveVar;
                    eps.i("swapPlayerWithOverlapping", String.valueOf(u2qVar52), new jve(epsVar, i2));
                    ssg.a(3, "InternalPlayerManager", "setFadeMode fade updated, args() ", null);
                    lveVar2 = (lve) epsVar.d;
                    if (lveVar2 != null) {
                        o4cVar.b.i = l4c.b;
                    }
                    epsVar.h().a.b.i = l4c.a;
                    it = ((ArrayList) epsVar.e).iterator();
                    while (it.hasNext()) {
                    }
                    if (epsVar.h().a.a.k() != null) {
                    }
                    epsVar.j((lve) epsVar.d, epsVar.h());
                    ssg.a(3, "CrossfadingExoPlayerImpl", "players swapped", null);
                    kv6 kv6Var52 = (kv6) this.n;
                    xdr xdrVar4 = kv6Var52.u;
                    Float f22 = new Float(1 - ((Number) kv6Var52.t.getValue()).floatValue());
                    xdrVar4.getClass();
                    xdrVar4.m(null, f22);
                    xdr xdrVar22 = ((kv6) this.n).t;
                    Float f32 = new Float(0.0f);
                    xdrVar22.getClass();
                    xdrVar22.m(null, f32);
                    ssg.a(3, "CrossfadingExoPlayerImpl", "listeners swapped", null);
                    kv6 kv6Var62 = (kv6) this.n;
                    tf6 tf6Var2 = kv6Var62.n;
                    ExoPlayer k122 = kv6Var62.k1();
                    kv6 kv6Var72 = (kv6) this.n;
                    zwfVar.e0(tf6Var2, k122, exoPlayer2, kv6Var72.t, kv6Var72.u);
                    return Unit.a;
                }
                return nm6Var17;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(pr3 pr3Var, String str, Continuation continuation) {
        super(2, continuation);
        this.j = 14;
        this.n = pr3Var;
        this.o = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v3(lu3 lu3Var, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.j = 15;
        this.l = lu3Var;
        this.o = (aur) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v3(int i, Object obj, Object obj2, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.l = str;
        this.n = obj2;
        this.o = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v3(Object obj, Parcelable parcelable, Object obj2, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.n = parcelable;
        this.o = obj2;
        this.l = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v3(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.n = obj2;
        this.l = obj3;
        this.o = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v3(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.n = obj;
        this.l = obj2;
        this.o = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v3(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.o = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v3(Object obj, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.o = obj;
        this.l = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v3(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.o = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v3(Function2 function2, tf6 tf6Var, BroadcastReceiver.PendingResult pendingResult, Continuation continuation) {
        super(2, continuation);
        this.j = 27;
        this.n = (aur) function2;
        this.l = tf6Var;
        this.o = pendingResult;
    }
}
