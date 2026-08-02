package defpackage;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.glance.session.SessionWorker;
import com.yandex.pulse.metrics.o;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.video.m3.player.b;
import ru.yandex.video.m3.player.d;
import ru.yandex.video.m3.player.impl.tracking.event.ErrorPlayerData;
import ru.yandex.video.m3.player.impl.tracking.event.Event;
import ru.yandex.video.m3.player.impl.tracking.event.EventDefault;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;
import ru.yandex.video.m3.player.impl.tracking.event.EventsLabel;
import ru.yandex.video.m3.player.impl.tracking.event.StateBasedEventData;
import ru.yandex.video.m3.player.tracking.LoadError;

/* loaded from: classes3.dex */
public final class n6p extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6p(Continuation continuation, cur curVar, zvs zvsVar) {
        super(2, continuation);
        this.j = 9;
        this.k = curVar;
        this.l = zvsVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                n6p n6pVar = new n6p((p6p) this.l, continuation, 0);
                n6pVar.k = obj;
                return n6pVar;
            case 1:
                n6p n6pVar2 = new n6p((SessionWorker) this.l, continuation, 1);
                n6pVar2.k = obj;
                return n6pVar2;
            case 2:
                n6p n6pVar3 = new n6p((msp) this.l, continuation, 2);
                n6pVar3.k = obj;
                return n6pVar3;
            case 3:
                n6p n6pVar4 = new n6p((pyp) this.l, continuation, 3);
                n6pVar4.k = obj;
                return n6pVar4;
            case 4:
                return new n6p((a7q) this.k, (nej) this.l, continuation, 4);
            case 5:
                n6p n6pVar5 = new n6p((jp0) this.l, continuation, 5);
                n6pVar5.k = obj;
                return n6pVar5;
            case 6:
                return new n6p((swq) this.k, (qj6) this.l, continuation, 6);
            case 7:
                return new n6p((LoadError) this.k, (x3n) this.l, continuation, 7);
            case 8:
                return new n6p((Context) this.k, (k0r) this.l, continuation, 8);
            case 9:
                return new n6p(continuation, (cur) this.k, (zvs) this.l);
            case 10:
                return new n6p((jur) this.k, (zvs) this.l, continuation, 10);
            case 11:
                return new n6p((dxr) this.k, (vk2) this.l, continuation, 11);
            case 12:
                return new n6p((i9s) this.k, (h4q) this.l, continuation, 12);
            case 13:
                n6p n6pVar6 = new n6p((List) this.l, continuation, 13);
                n6pVar6.k = obj;
                return n6pVar6;
            case 14:
                n6p n6pVar7 = new n6p((mwk) this.l, continuation, 14);
                n6pVar7.k = obj;
                return n6pVar7;
            case 15:
                return new n6p((mm6) this.k, (i0l) this.l, continuation, 15);
            case 16:
                return new n6p((sjt) this.k, (njt) this.l, continuation, 16);
            case 17:
                return new n6p((dn9) this.k, (ant) this.l, continuation, 17);
            case 18:
                return new n6p((dn9) this.k, (lnt) this.l, continuation, 18);
            case 19:
                return new n6p((cst) this.k, (String) this.l, continuation, 19);
            case 20:
                return new n6p((xxq) this.k, (bjt) this.l, continuation, 20);
            case 21:
                return new n6p((a6u) this.k, (p5d) this.l, continuation, 21);
            case 22:
                return new n6p((a6u) this.k, (h4q) this.l, continuation, 22);
            case 23:
                return new n6p((a6u) this.k, (n4q) this.l, continuation, 23);
            case 24:
                return new n6p((qju) this.k, (hn5) this.l, continuation, 24);
            case 25:
                n6p n6pVar8 = new n6p((yju) this.l, continuation, 25);
                n6pVar8.k = obj;
                return n6pVar8;
            case 26:
                return new n6p((Function0) this.k, (aqi) this.l, continuation, 26);
            case 27:
                n6p n6pVar9 = new n6p((u2r) this.l, continuation, 27);
                n6pVar9.k = obj;
                return n6pVar9;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new n6p((u2r) this.k, (mm6) this.l, continuation, 28);
            default:
                n6p n6pVar10 = new n6p(continuation, (a3w) this.l);
                n6pVar10.k = obj;
                return n6pVar10;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((n6p) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((n6p) create((omp) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((n6p) create((msp) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((n6p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((n6p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((n6p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((n6p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((n6p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((n6p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((n6p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((n6p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((n6p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((n6p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((n6p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((n6p) create((d6l) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((n6p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((n6p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 17:
                return ((n6p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((n6p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 19:
                return ((n6p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 20:
                return ((n6p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 21:
                return ((n6p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 22:
                return ((n6p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 23:
                return ((n6p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 24:
                return ((n6p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 25:
                return ((n6p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 26:
                return ((n6p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 27:
                return ((n6p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return ((n6p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((n6p) create(obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:244:0x075e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x06f0 A[SYNTHETIC] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ndp ndpVar;
        g24 g24Var;
        String str;
        x1u x1uVar;
        gbw gbwVar;
        Object xzvVar;
        zp2 zp2Var;
        List list;
        Object obj2;
        int i = 27;
        int i2 = 10;
        int i3 = 7;
        boolean z = false;
        r6 = false;
        boolean z2 = false;
        z = false;
        int i4 = 1;
        int i5 = 3;
        switch (this.j) {
            case 0:
                String str2 = (String) this.k;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                xdr xdrVar = ((p6p) this.l).m;
                m6p m6pVar = StringsKt.U(str2) ? m6p.a : m6p.b;
                xdrVar.getClass();
                xdrVar.m(null, m6pVar);
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return (aw0) ((omp) this.k).a.get(((SessionWorker) this.l).k);
            case 2:
                msp mspVar = (msp) this.k;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(Intrinsics.d(mspVar, (msp) this.l));
            case 3:
                mm6 mm6Var = (mm6) this.k;
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                pyp pypVar = (pyp) this.l;
                ox6.B(zsd.M0(zsd.b0(new ail(24, new p6o(pypVar.a.a.c, i2), pypVar)), new gv6(false ? 1 : 0, mm6Var, pypVar, 11)), mm6Var, new lyp(pypVar));
                return Unit.a;
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                ncl nclVar = ((a7q) this.k).g;
                nej nejVar = (nej) this.l;
                nclVar.getClass();
                nejVar.getClass();
                mal.a();
                nclVar.m.f(nejVar);
                return Unit.a;
            case 5:
                mm6 mm6Var2 = (mm6) this.k;
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                jp0 jp0Var = (jp0) this.l;
                jp0Var.d = mm6Var2;
                x97.y(mm6Var2, null, null, new iiq(jp0Var, false ? 1 : 0, i4), 3);
                return x97.y(mm6Var2, null, null, new iiq(jp0Var, false ? 1 : 0, 2), 3);
            case 6:
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                pdp pdpVar = ((swq) this.k).p;
                List<xsq> list2 = ((ptq) ((qj6) this.l).a).b;
                pdpVar.getClass();
                list2.getClass();
                for (xsq xsqVar : list2) {
                    if (xsqVar instanceof fsq) {
                        q14 q14Var = ((fsq) xsqVar).g;
                        String str3 = q14Var.a;
                        if (str3 != null && (g24Var = (g24) CollectionsKt.firstOrNull(q14Var.b)) != null) {
                            ndpVar = new ndp(str3, sk3.Z(g24Var));
                            if (ndpVar == null) {
                                pdpVar.a(ndpVar.a, ndpVar.b);
                            }
                        }
                    } else if (!(xsqVar instanceof psq) && !(xsqVar instanceof csq) && !(xsqVar instanceof dsq) && !(xsqVar instanceof gsq) && !(xsqVar instanceof hsq) && !(xsqVar instanceof isq) && !(xsqVar instanceof jsq) && !(xsqVar instanceof msq) && !(xsqVar instanceof osq) && !(xsqVar instanceof rsq) && !(xsqVar instanceof ssq) && !(xsqVar instanceof tsq) && !(xsqVar instanceof nsq) && !(xsqVar instanceof usq)) {
                        b6e.s();
                        return null;
                    }
                    ndpVar = null;
                    if (ndpVar == null) {
                    }
                }
                return Unit.a;
            case 7:
                x3n x3nVar = (x3n) this.l;
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                LoadError loadError = (LoadError) this.k;
                Throwable throwable = loadError.getThrowable();
                String t = throwable != null ? gos.t(throwable) : "NETWORK_MEDIA";
                String str4 = loadError.getUri().toString();
                Event event = Event.LOAD_ERROR;
                String eventName = event.getEventName();
                EventType eventType = EventType.ERROR;
                String exceptionMessage = loadError.getExceptionMessage();
                String str5 = exceptionMessage == null ? "" : exceptionMessage;
                String eventName2 = event.getEventName();
                Throwable throwable2 = loadError.getThrowable();
                String stackTraceString = throwable2 != null ? Log.getStackTraceString(throwable2) : null;
                ErrorPlayerData errorPlayerData = new ErrorPlayerData(str5, eventName2, false, stackTraceString == null ? "" : stackTraceString, null, null, t, new StateBasedEventData(null, null, null, false, null, null, null, null), n4f.a.to(loadError));
                vsg vsgVar = (vsg) x3nVar.a;
                String str6 = vsgVar.c;
                String str7 = vsgVar.a;
                long currentTimeMillis = System.currentTimeMillis();
                String str8 = vsgVar.e;
                wt0 wt0Var = vsgVar.f;
                ((ylr) x3nVar.c).c(new EventDefault(str6, str7, -1, eventName, currentTimeMillis, new EventsLabel(str8, wt0Var.b, String.valueOf(wt0Var.c), null, null), y9w.q(eventType), str4, vsgVar.g, null, null, vsgVar.d, null, null, Boolean.FALSE, null, errorPlayerData, Integer.valueOf(((AtomicInteger) ((c5p) x3nVar.b).b).getAndIncrement()), null, vsgVar.b, -1));
                return Unit.a;
            case 8:
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                String uuid = UUID.randomUUID().toString();
                uuid.getClass();
                File B = vq2.B((Context) this.k, uuid);
                if (B == null) {
                    ssg.a(6, "SupportChat", "Support chat creating log file error", null);
                    return Unit.a;
                }
                ssg.a(3, null, "Support chat sending logs", null);
                k0r k0rVar = (k0r) this.l;
                String path = B.getPath();
                path.getClass();
                k0rVar.invoke(new String[]{path}, new kzp(i, B));
                return Unit.a;
            case 9:
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                q3t q3tVar = ((cur) this.k).a;
                zvs zvsVar = (zvs) this.l;
                String a = q3tVar.n.a();
                a.getClass();
                ssg.a(3, "TracksCacheRepositoryImpl", "markAllTrackRecordsAsTemporary(" + zvsVar + ")", null);
                j3t j3tVar = q3tVar.a;
                String str9 = zvsVar.a;
                v3w.l("markAllTrackRecordsAsTemporary ", str9, 4, "TracksCacheDatabaseImpl", null);
                o3t o3tVar = j3tVar.a;
                css cssVar = css.f;
                cssVar.getClass();
                i3t a2 = o3tVar.a(a);
                a2.getClass();
                up6.F(a2.a, false, true, new wes(i3, cssVar, zvsVar));
                q3tVar.h(str9, false, pjs.b);
                return Unit.a;
            case 10:
                nm6 nm6Var11 = nm6.a;
                qgg.h0(obj);
                xdr xdrVar2 = saa.a;
                return ((jur) this.k).a.e((zvs) this.l);
            case 11:
                nm6 nm6Var12 = nm6.a;
                qgg.h0(obj);
                ((kpm) ((dxr) this.k).a).A((vk2) this.l);
                return Unit.a;
            case 12:
                nm6 nm6Var13 = nm6.a;
                qgg.h0(obj);
                ssg.a(4, "TestPlayer", "setPlaybackSpeed " + ((h4q) this.l), null);
                ((i9s) this.k).l = (h4q) this.l;
                return Unit.a;
            case 13:
                mm6 mm6Var3 = (mm6) this.k;
                nm6 nm6Var14 = nm6.a;
                qgg.h0(obj);
                List list3 = (List) this.l;
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    x97.y(mm6Var3, null, null, new lco(it.next(), (Object) list3, (Continuation) (false ? 1 : 0), 18), 3);
                }
                return Unit.a;
            case 14:
                d6l d6lVar = (d6l) this.k;
                nm6 nm6Var15 = nm6.a;
                qgg.h0(obj);
                if (Intrinsics.d(d6lVar.a.b(), (mwk) this.l) && d6lVar.c == v0l.d) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 15:
                nm6 nm6Var16 = nm6.a;
                qgg.h0(obj);
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new jt7(3));
                newSingleThreadExecutor.getClass();
                uob uobVar = new uob(newSingleThreadExecutor);
                tf6 X = gld.X(gld.X((mm6) this.k, uobVar), new im6("TrackPreFetchControlPlugin"));
                qzs qzsVar = (qzs) ((mzs) ((jyr) ((i0l) this.l).b).getValue());
                qzsVar.getClass();
                if (!qzsVar.g.compareAndSet(false, true)) {
                    xq0.q("already initialized");
                    return null;
                }
                f7l f7lVar = qzsVar.a;
                x97.y(X, null, null, new fpq(new u21(i2, q6k.m(new mpq(14, zsd.a0(new u21(i2, f7lVar.c, f7lVar.d, new u1c(i5, i4, false ? 1 : 0)), new j1p(19)), qzsVar), new phs(26), q6k.g), qzsVar.h, new tmj(i5, i4, false ? 1 : 0)), (Continuation) null, qzsVar, X), 3);
                r2f r2fVar = (r2f) X.a.get(o6c.l);
                if (r2fVar != null) {
                    r2fVar.R(new r3s(5, uobVar));
                }
                return Unit.a;
            case 16:
                nm6 nm6Var17 = nm6.a;
                qgg.h0(obj);
                if (((qjt) ((sjt) this.k)).b instanceof ejt) {
                    ((ckt) ((njt) this.l).e.b).k.d();
                }
                return Unit.a;
            case 17:
                nm6 nm6Var18 = nm6.a;
                qgg.h0(obj);
                try {
                    ((g3a) ((dn9) this.k).f).f(new w2a(((ant) this.l).a));
                } catch (IllegalStateException unused) {
                }
                return Unit.a;
            case 18:
                nm6 nm6Var19 = nm6.a;
                qgg.h0(obj);
                try {
                    g3a g3aVar = (g3a) ((dn9) this.k).f;
                    lnt lntVar = (lnt) this.l;
                    g3aVar.f(new x2a(lntVar.a, lntVar.b));
                } catch (IllegalStateException unused2) {
                }
                return Unit.a;
            case 19:
                nm6 nm6Var20 = nm6.a;
                qgg.h0(obj);
                ((cst) this.k).a.d((String) this.l);
                return Unit.a;
            case 20:
                nm6 nm6Var21 = nm6.a;
                qgg.h0(obj);
                xxq xxqVar = (xxq) this.k;
                xxqVar.getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(i5h.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                i5h i5hVar = (i5h) qdcVar.C(I);
                h5h h5hVar = i5hVar.i;
                synchronized (h5hVar) {
                    try {
                        ssg.a(3, "MainDbProvider", "User " + xxqVar.a + " was provided", null);
                        HashMap hashMap = h5hVar.a;
                        String str10 = xxqVar.a;
                        Object obj3 = hashMap.get(str10);
                        Object obj4 = obj3;
                        if (obj3 == null) {
                            gm5 j = hld.j();
                            hashMap.put(str10, j);
                            obj4 = j;
                        }
                        ((gm5) obj4).U(xxqVar);
                    } finally {
                    }
                }
                synchronized (zc4.l) {
                    if (!Intrinsics.d(xxqVar.a, zc4.m)) {
                        zc4.m = xxqVar.a;
                        ssg.a(4, "YMDatabaseOpenHelperSwitcher", "switching db for user " + xxqVar, null);
                        i5hVar.d(xxqVar.a);
                    }
                }
                xxq xxqVar2 = (xxq) this.k;
                bdt I2 = hag.I(fq3.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                fq3 fq3Var = (fq3) qdcVar2.C(I2);
                synchronized (fq3Var) {
                    xxqVar2.getClass();
                    khr khrVar = fq3Var.a;
                    synchronized (khrVar) {
                        khrVar.b = xxqVar2;
                        khrVar.c(khrVar.b());
                    }
                    fq3Var.a();
                }
                ssg.a(4, null, "switch finished", null);
                return Unit.a;
            case 21:
                nm6 nm6Var22 = nm6.a;
                qgg.h0(obj);
                p5d p5dVar = (p5d) this.l;
                ssg.a(3, "VideoClipPlayer", "prepare " + p5dVar, null);
                a6u a6uVar = (a6u) this.k;
                w1f w1fVar = a6uVar.e;
                mwk mwkVar = p5dVar.a;
                a6uVar.f = mwkVar;
                i5u i5uVar = mwkVar instanceof i5u ? (i5u) mwkVar : null;
                ((g4u) a6uVar.c.getValue()).a.l(null);
                gbw gbwVar2 = a6uVar.d;
                if (gbwVar2 != null) {
                    gbwVar2.stop();
                }
                a6uVar.g = p5dVar.b;
                if (p5dVar.c) {
                    gbw gbwVar3 = a6uVar.d;
                    w1fVar.b(gbwVar3 != null ? gbwVar3.a.getVolume() : 1.0f);
                } else {
                    w1fVar.getClass();
                    ssg.a(3, "VolumeMuteControl", "setUnmute()", null);
                    ((AtomicBoolean) w1fVar.b).set(false);
                    Iterator it2 = ((CopyOnWriteArrayList) w1fVar.c).iterator();
                    while (it2.hasNext()) {
                        ((Function1) it2.next()).invoke(Boolean.FALSE);
                    }
                }
                a6u.y(a6uVar, tnl.b);
                gbw gbwVar4 = a6uVar.d;
                if (gbwVar4 == null) {
                    fbw fbwVar = (fbw) a6uVar.b.getValue();
                    d9w d9wVar = new d9w(i3);
                    fbwVar.getClass();
                    Context context = fbwVar.a;
                    b s = zsd.s(context, new ebw(fbwVar, d9wVar, false ? 1 : 0));
                    d dVar = new d();
                    dVar.a = context;
                    dVar.c = s;
                    tao taoVar = fbwVar.c;
                    taoVar.getClass();
                    dVar.b = taoVar;
                    zr7 zr7Var = fbwVar.e;
                    zr7Var.getClass();
                    dVar.f = zr7Var;
                    dVar.d = true;
                    paw a3 = dVar.a(null);
                    gbw gbwVar5 = new gbw(a3);
                    a3.I(new y5u(a6uVar));
                    a6uVar.d = gbwVar5;
                    gbwVar4 = gbwVar5;
                }
                if (i5uVar == null || (x1uVar = i5uVar.a) == null || (str = x1uVar.c) == null) {
                    str = "";
                }
                gbwVar4.H(str, a4g.e(a6uVar.g, new wes(15, p5dVar, i5uVar)));
                return Unit.a;
            case 22:
                nm6 nm6Var23 = nm6.a;
                qgg.h0(obj);
                gbw gbwVar6 = ((a6u) this.k).d;
                if (gbwVar6 != null) {
                    gbwVar6.u(((h4q) this.l).a);
                }
                return Unit.a;
            case 23:
                nm6 nm6Var24 = nm6.a;
                qgg.h0(obj);
                a6u a6uVar2 = (a6u) this.k;
                w1f w1fVar2 = a6uVar2.e;
                n4q n4qVar = (n4q) this.l;
                if (w1fVar2.a(n4qVar.a) && (gbwVar = a6uVar2.d) != null) {
                    gbwVar.t(n4qVar.a);
                }
                return Unit.a;
            case 24:
                nm6 nm6Var25 = nm6.a;
                qgg.h0(obj);
                hn5 hn5Var = (hn5) this.l;
                try {
                    ActivityInfo activityInfo = hn5Var.getPackageManager().getActivityInfo(hn5Var.getComponentName(), 0);
                    activityInfo.getClass();
                    if ((activityInfo.flags & 128) != 0) {
                        z2 = true;
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                }
                return Boolean.valueOf(z2);
            case 25:
                nm6 nm6Var26 = nm6.a;
                qgg.h0(obj);
                l18 l18Var2 = l18.b;
                bdt I3 = hag.I(Context.class);
                qdc qdcVar3 = l18Var2.a;
                qdcVar3.getClass();
                Context context2 = (Context) qdcVar3.C(I3);
                yju yjuVar = (yju) this.l;
                try {
                    r7o r7oVar = z7o.b;
                    if (yjuVar.h()) {
                        new File(context2.getFilesDir(), "soft_mode_disabled_exp").delete();
                    } else {
                        new File(context2.getFilesDir(), "soft_mode_disabled_exp").createNewFile();
                    }
                } catch (Throwable unused4) {
                    r7o r7oVar2 = z7o.b;
                }
                return Unit.a;
            case 26:
                nm6 nm6Var27 = nm6.a;
                qgg.h0(obj);
                aqi aqiVar = (aqi) this.l;
                if (((Boolean) aqiVar.getValue()).booleanValue()) {
                    aqiVar.setValue(Boolean.FALSE);
                } else {
                    ((Function0) this.k).invoke();
                }
                return Unit.a;
            case 27:
                mm6 mm6Var4 = (mm6) this.k;
                nm6 nm6Var28 = nm6.a;
                qgg.h0(obj);
                Iterator it3 = ((u2r) this.l).b.iterator();
                while (it3.hasNext()) {
                    x97.y(mm6Var4, null, null, new v41(i3, (fk0) ((Map.Entry) it3.next()).getValue(), false ? 1 : 0), 3);
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                nm6 nm6Var29 = nm6.a;
                qgg.h0(obj);
                u2r u2rVar = (u2r) this.k;
                if (u2rVar.size() == 0) {
                    return Unit.a;
                }
                x97.y((mm6) this.l, null, null, new n6p((Object) u2rVar, (Continuation) (false ? 1 : 0), i), 3).R(new q0v(13, u2rVar));
                return Unit.a;
            default:
                Object obj5 = this.k;
                nm6 nm6Var30 = nm6.a;
                qgg.h0(obj);
                e6l e6lVar = (e6l) obj5;
                a3w a3wVar = (a3w) this.l;
                xdr xdrVar3 = a3wVar.j;
                if (Intrinsics.d(e6lVar, b6l.a) || (e6lVar instanceof c6l)) {
                    xzvVar = new xzv(((zzv) xdrVar3.getValue()).c());
                } else {
                    if (!(e6lVar instanceof d6l)) {
                        b6e.s();
                        return null;
                    }
                    mqs a4 = ((d6l) e6lVar).a.b().a();
                    String str11 = (String) a3wVar.k.getValue();
                    if (a4 == null || (list = a4.f) == null) {
                        zp2Var = null;
                    } else {
                        Iterator it4 = list.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                obj2 = it4.next();
                                if (Intrinsics.d(((zp2) obj2).a, str11)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        zp2Var = (zp2) obj2;
                    }
                    xzvVar = (!p6g.C(e6lVar) || a4 == null || zp2Var == null) ? new xzv(p6g.A(e6lVar)) : new yzv(a4.i(), str11, a4.a, a4.c, a4.y, p6g.A(e6lVar));
                }
                xdrVar3.getClass();
                xdrVar3.m(null, xzvVar);
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n6p(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n6p(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = obj;
        this.l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6p(Continuation continuation, a3w a3wVar) {
        super(2, continuation);
        this.j = 29;
        this.l = a3wVar;
    }
}
