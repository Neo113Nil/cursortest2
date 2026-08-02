package defpackage;

import android.content.Context;
import androidx.fragment.app.t;
import androidx.media3.exoplayer.ExoPlayer;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import com.yandex.pulse.metrics.o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a;
import ru.yandex.music.share.ShareNetworkException;

/* loaded from: classes4.dex */
public final class lco extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public Object m;
    public Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lco(tvo tvoVar, suq suqVar, int i, hvq hvqVar, zd3 zd3Var, Continuation continuation) {
        super(2, continuation);
        this.j = 2;
        this.m = tvoVar;
        this.n = suqVar;
        this.k = i;
        this.l = hvqVar;
        this.o = zd3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0059, code lost:
    
        if (r15 != r2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        if (r15 == r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008b, code lost:
    
        return r2;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0089 -> B:8:0x008c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object k(Object obj) {
        si3 si3Var;
        si3 si3Var2;
        gm5 gm5Var;
        e6q e6qVar = (e6q) this.o;
        oi oiVar = (oi) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        Continuation continuation = null;
        if (i == 0) {
            qgg.h0(obj);
            oiVar.getClass();
            zi3 zi3Var = oiVar.d;
            zi3Var.getClass();
            si3Var = new si3(zi3Var);
            this.l = null;
            this.m = si3Var;
            this.n = null;
            this.k = 1;
            obj = si3Var.c(this);
        } else if (i == 1) {
            si3Var = (si3) this.m;
            qgg.h0(obj);
            si3Var2 = si3Var;
            if (!((Boolean) obj).booleanValue()) {
                return Unit.a;
            }
            gm5Var = (gm5) si3Var2.d();
            ssg.a(2, e6q.g, "Download history update request gotten", null);
            jur jurVar = e6qVar.a;
            this.l = null;
            this.m = si3Var2;
            this.n = gm5Var;
            this.k = 2;
            obj = x97.V(dm6.b, new d7i(jurVar, continuation, 23), this);
        } else {
            if (i != 2) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gm5Var = (gm5) this.n;
            si3Var2 = (si3) this.m;
            try {
                try {
                    qgg.h0(obj);
                } catch (Throwable th) {
                    gm5Var.U(Unit.a);
                    throw th;
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th2) {
                si3Var = si3Var2;
                Assertions.throwOrSkip(e6q.g, new FailedAssertionException("Unexpected error in SharedPlayerDownloadHistory.historyUpdateActor", th2));
                gm5Var.U(Unit.a);
            }
            r3t r3tVar = (r3t) obj;
            Set set = r3tVar.a;
            ArrayList arrayList = new ArrayList(v75.o(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((zvs) it.next()).a);
            }
            Set A0 = CollectionsKt.A0(arrayList);
            ArrayList<nq3> arrayList2 = r3tVar.b;
            LinkedHashMap linkedHashMap = new LinkedHashMap(r3tVar.b.size());
            for (nq3 nq3Var : arrayList2) {
                String str = nq3Var.a.a;
                if (linkedHashMap.get(str) == null) {
                    linkedHashMap.put(str, nq3Var);
                }
            }
            Set set2 = r3tVar.c;
            ArrayList arrayList3 = new ArrayList(v75.o(set2, 10));
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((zvs) it2.next()).a);
            }
            Set A02 = CollectionsKt.A0(arrayList3);
            Set set3 = r3tVar.d;
            ArrayList arrayList4 = new ArrayList(v75.o(set3, 10));
            Iterator it3 = set3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((zvs) it3.next()).a);
            }
            Set A03 = CollectionsKt.A0(arrayList4);
            Set set4 = r3tVar.e;
            ArrayList arrayList5 = new ArrayList(v75.o(set4, 10));
            Iterator it4 = set4.iterator();
            while (it4.hasNext()) {
                arrayList5.add(((zvs) it4.next()).a);
            }
            lja ljaVar = new lja(A0, linkedHashMap, A02, A03, CollectionsKt.A0(arrayList5));
            ssg.a(2, e6q.g, "Download history updated permanent:" + A0.size() + ", temp:" + A02.size() + ", auto:" + ((Set) ljaVar.f.getValue()).size(), null);
            xdr xdrVar = e6qVar.d;
            xdrVar.getClass();
            xdrVar.m(null, ljaVar);
            gm5Var.U(Unit.a);
            si3Var = si3Var2;
            this.l = null;
            this.m = si3Var;
            this.n = null;
            this.k = 1;
            obj = si3Var.c(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0080, code lost:
    
        if (defpackage.saf.C(r2, r8) == r3) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0082, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r9 == r3) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object l(Object obj) {
        rar y;
        ut6 rt6Var;
        bus busVar = (bus) this.o;
        nt6 nt6Var = busVar.k;
        mm6 mm6Var = (mm6) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        Continuation continuation = null;
        if (i == 0) {
            qgg.h0(obj);
            y = x97.y(mm6Var, null, null, new zts(busVar, continuation, 0), 3);
            y9b y9bVar = (y9b) busVar.l.a.getValue();
            String str = nt6Var.a;
            this.l = null;
            this.n = y;
            this.k = 1;
            obj = y9bVar.a(str, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rt6Var = (ut6) this.m;
                qgg.h0(obj);
                busVar.m.l(rt6Var);
                return Unit.a;
            }
            y = (rar) this.n;
            qgg.h0(obj);
        }
        rj6 rj6Var = (rj6) obj;
        if (rj6Var instanceof qj6) {
            rt6Var = new tt6(nt6Var, ((bws) ((qj6) rj6Var).a).a);
        } else {
            if (!(rj6Var instanceof pj6)) {
                b6e.s();
                return null;
            }
            rt6Var = new rt6(nt6Var);
        }
        this.l = null;
        this.n = null;
        this.m = rt6Var;
        this.k = 2;
    }

    private final Object n(Object obj) {
        kvm kvmVar = (kvm) this.o;
        ExoPlayer exoPlayer = (ExoPlayer) this.m;
        ltm ltmVar = (ltm) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            ssg.a(3, "TrackPreHeatUtils", "onProgressReachedFlow callbackFlow", null);
            tqn tqnVar = new tqn();
            tzs tzsVar = new tzs(exoPlayer, (Long) this.n, kvmVar, tqnVar, ltmVar);
            exoPlayer.j0(tzsVar);
            u(exoPlayer, (Long) this.n, kvmVar, tqnVar, ltmVar);
            ftr ftrVar = new ftr(2, x97.y(ltmVar, null, null, new uzs(exoPlayer, (Long) this.n, tqnVar, kvmVar, ltmVar, null), 3), exoPlayer, tzsVar);
            this.l = null;
            this.k = 1;
            if (y7g.q(ltmVar, ftrVar, this) == nm6Var) {
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

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a9, code lost:
    
        if (defpackage.x97.V((kotlin.coroutines.CoroutineContext) r8, r9, r21) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0096, code lost:
    
        if (r8 == r0) goto L40;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object o(Object obj) {
        rjc rjcVar;
        boolean z;
        Object w;
        int[] iArr = (int[]) this.n;
        mat matVar = (mat) this.m;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        Continuation continuation = null;
        try {
            if (i == 0) {
                qgg.h0(obj);
                rjcVar = (rjc) this.l;
                tjj tjjVar = matVar.h;
                tjjVar.getClass();
                iArr.getClass();
                ReentrantLock reentrantLock = tjjVar.a;
                reentrantLock.lock();
                try {
                    boolean z2 = false;
                    for (int i2 : iArr) {
                        long[] jArr = tjjVar.b;
                        long j = jArr[i2];
                        jArr[i2] = j + 1;
                        if (j == 0) {
                            tjjVar.d = true;
                            z2 = true;
                        }
                    }
                    if (!z2 && !tjjVar.d) {
                        if (!tjjVar.f) {
                            z = false;
                            reentrantLock.unlock();
                            if (z) {
                                ueo ueoVar = matVar.a;
                                this.l = rjcVar;
                                this.k = 1;
                                w = up6.w(ueoVar, false, this);
                            }
                            xqn xqnVar = new xqn();
                            oxa oxaVar = matVar.i;
                            pm pmVar = new pm(xqnVar, rjcVar, (String[]) this.o, iArr);
                            this.l = null;
                            this.k = 3;
                            oxaVar.s(pmVar, this);
                            return nm6Var;
                        }
                    }
                    z = true;
                    reentrantLock.unlock();
                    if (z) {
                    }
                    xqn xqnVar2 = new xqn();
                    oxa oxaVar2 = matVar.i;
                    pm pmVar2 = new pm(xqnVar2, rjcVar, (String[]) this.o, iArr);
                    this.l = null;
                    this.k = 3;
                    oxaVar2.s(pmVar2, this);
                    return nm6Var;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    throw new fif();
                }
                rjcVar = (rjc) this.l;
                qgg.h0(obj);
                xqn xqnVar22 = new xqn();
                oxa oxaVar22 = matVar.i;
                pm pmVar22 = new pm(xqnVar22, rjcVar, (String[]) this.o, iArr);
                this.l = null;
                this.k = 3;
                oxaVar22.s(pmVar22, this);
                return nm6Var;
            }
            rjcVar = (rjc) this.l;
            qgg.h0(obj);
            w = obj;
            zts ztsVar = new zts(matVar, continuation, 3);
            this.l = rjcVar;
            this.k = 2;
        } catch (Throwable th2) {
            tjj tjjVar2 = matVar.h;
            tjjVar2.getClass();
            iArr.getClass();
            ReentrantLock reentrantLock2 = tjjVar2.a;
            reentrantLock2.lock();
            try {
                boolean z3 = false;
                for (int i3 : iArr) {
                    long[] jArr2 = tjjVar2.b;
                    long j2 = jArr2[i3];
                    jArr2[i3] = j2 - 1;
                    if (j2 == 1) {
                        z3 = true;
                        tjjVar2.d = true;
                    }
                }
                if (!z3 && !tjjVar2.d) {
                    boolean z4 = tjjVar2.f;
                }
                reentrantLock2.unlock();
                throw th2;
            } catch (Throwable th3) {
                reentrantLock2.unlock();
                throw th3;
            }
        }
    }

    private final Object p(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            ss3 t = kg5.t((u0q) this.m, ((dzf) this.n).getLifecycle(), lyf.d);
            jqp jqpVar = new jqp(22, (dsu) this.l, (t) this.o);
            this.k = 1;
            if (t.collect(jqpVar, this) == nm6Var) {
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0081, code lost:
    
        if (defpackage.saf.C(r2, r8) == r3) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0083, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r9 == r3) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object q(Object obj) {
        rar y;
        ut6 rt6Var;
        k3u k3uVar = (k3u) this.o;
        nt6 nt6Var = k3uVar.k;
        mm6 mm6Var = (mm6) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        Continuation continuation = null;
        if (i == 0) {
            qgg.h0(obj);
            y = x97.y(mm6Var, null, null, new zts(k3uVar, continuation, 14), 3);
            y9b y9bVar = (y9b) k3uVar.l.a.getValue();
            String str = nt6Var.a;
            this.l = null;
            this.n = y;
            this.k = 1;
            obj = y9bVar.b(str, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rt6Var = (ut6) this.m;
                qgg.h0(obj);
                k3uVar.m.l(rt6Var);
                return Unit.a;
            }
            y = (rar) this.n;
            qgg.h0(obj);
        }
        rj6 rj6Var = (rj6) obj;
        if (rj6Var instanceof qj6) {
            rt6Var = new tt6(nt6Var, ((l4u) ((qj6) rj6Var).a).a);
        } else {
            if (!(rj6Var instanceof pj6)) {
                b6e.s();
                return null;
            }
            rt6Var = new rt6(nt6Var);
        }
        this.l = null;
        this.n = null;
        this.m = rt6Var;
        this.k = 2;
    }

    private final Object s(Object obj) {
        m4u m4uVar = (m4u) this.m;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            clc clcVar = new clc(szf.s0(new f6u((sdr) this.n, 1)), new fv6(2, 2, null), 4);
            this.k = 1;
            if (zsd.N(clcVar, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        ((aqi) this.l).setValue(Boolean.valueOf(m4uVar.c));
        ((aqi) this.o).setValue(m4uVar.b);
        return Unit.a;
    }

    private final Object t(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            r9u r9uVar = new r9u((tfn) this.m);
            vw5 vw5Var = (vw5) ((yks) this.n).b;
            String str = (String) this.l;
            String str2 = ((s7u) this.o).a;
            this.k = 1;
            obj = vw5Var.a(str, str2, r9uVar, this);
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
        rj6 rj6Var = (rj6) obj;
        if (!(rj6Var instanceof qj6)) {
            if (!(rj6Var instanceof pj6)) {
                b6e.s();
                return null;
            }
            ssg.a(6, "VideoClipRadioFeedbackReporterImpl", "Failed sending feedback for playback start", ((pj6) rj6Var).a());
        }
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean u(ExoPlayer exoPlayer, Long l, kvm kvmVar, tqn tqnVar, ltm ltmVar) {
        if (exoPlayer.c() != 3 || !exoPlayer.e()) {
            return false;
        }
        if (l == null && (l = ywf.N(exoPlayer)) == null) {
            return false;
        }
        long longValue = l.longValue();
        if (Math.max(exoPlayer.J0(), 0L) < Math.max(longValue - (20 * 1000), longValue / 2) || tqnVar.a) {
            return false;
        }
        tqnVar.a = true;
        ((oc4) ltmVar).c(Unit.a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r1v9, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                lco lcoVar = new lco((mco) this.o, continuation, 0);
                lcoVar.l = obj;
                return lcoVar;
            case 1:
                lco lcoVar2 = new lco((ueo) this.m, (zt3) this.n, (veo) this.o, continuation, 1);
                lcoVar2.l = obj;
                return lcoVar2;
            case 2:
                return new lco((tvo) this.m, (suq) this.n, this.k, (hvq) this.l, (zd3) this.o, continuation);
            case 3:
                return new lco((jxg) this.m, (fk0) this.n, (jzg) this.l, (aqi) this.o, continuation, 3);
            case 4:
                lco lcoVar3 = new lco((pjc) this.m, (k3i) this.n, (bml) this.o, continuation, 4);
                lcoVar3.l = obj;
                return lcoVar3;
            case 5:
                return new lco((wkp) this.n, (alp) this.l, (mzb) this.o, continuation);
            case 6:
                lco lcoVar4 = new lco((Function1) this.m, (AtomicReference) this.n, (Function2) this.o, continuation);
                lcoVar4.l = obj;
                return lcoVar4;
            case 7:
                return new lco((aw0) this.m, (Context) this.n, (Throwable) this.l, (gjs) this.o, continuation, 7);
            case 8:
                lco lcoVar5 = new lco((owp) this.m, (zwp) this.o, continuation, 8);
                lcoVar5.l = obj;
                return lcoVar5;
            case 9:
                return new lco((w3q) this.m, (vdr) this.n, (AtomicReference) this.l, (ltm) this.o, continuation, 9);
            case 10:
                return new lco((n5q) this.m, (p5d) this.n, (v2q) this.l, (Long) this.o, continuation, 10);
            case 11:
                lco lcoVar6 = new lco((e6q) this.o, continuation, 11);
                lcoVar6.l = obj;
                return lcoVar6;
            case 12:
                lco lcoVar7 = new lco((rjc) this.n, (Function2) this.o, continuation);
                lcoVar7.l = obj;
                return lcoVar7;
            case 13:
                return new lco((ExoPlayer) this.m, (vzq) this.n, (bqi) this.l, (bqi) this.o, continuation, 13);
            case 14:
                return new lco((ExoPlayer) this.m, (xzq) this.n, (bqi) this.l, (bqi) this.o, continuation, 14);
            case 15:
                return new lco((utr) this.m, (ttr) this.n, (cir) this.l, (ohb) this.o, continuation, 15);
            case 16:
                return new lco((ka0) this.m, (aqi) this.n, (aqi) this.l, (aqi) this.o, continuation, 16);
            case 17:
                lco lcoVar8 = new lco((Function1) this.m, (w3h) this.n, (Function0) this.o, continuation, 17);
                lcoVar8.l = obj;
                return lcoVar8;
            case 18:
                lco lcoVar9 = new lco((a) this.m, (List) this.o, continuation, 18);
                lcoVar9.l = obj;
                return lcoVar9;
            case 19:
                return new lco((gjs) this.m, (e7o) this.n, (mm6) this.l, (Function2) this.o, continuation, 19);
            case 20:
                return new lco((uts) this.m, (gy1) this.n, (zvs) this.l, (vzg) this.o, continuation, 20);
            case 21:
                return new lco((vts) this.m, (zvs) this.n, (vzg) this.l, (gy1) this.o, continuation, 21);
            case 22:
                lco lcoVar10 = new lco((bus) this.o, continuation, 22);
                lcoVar10.l = obj;
                return lcoVar10;
            case 23:
                lco lcoVar11 = new lco((ExoPlayer) this.m, (Long) this.n, (kvm) this.o, continuation, 23);
                lcoVar11.l = obj;
                return lcoVar11;
            case 24:
                lco lcoVar12 = new lco((mat) this.m, (int[]) this.n, (String[]) this.o, continuation, 24);
                lcoVar12.l = obj;
                return lcoVar12;
            case 25:
                return new lco((u0q) this.m, (dzf) this.n, (dsu) this.l, (t) this.o, continuation, 25);
            case 26:
                lco lcoVar13 = new lco((k3u) this.o, continuation, 26);
                lcoVar13.l = obj;
                return lcoVar13;
            case 27:
                return new lco((m4u) this.m, (sdr) this.n, (aqi) this.l, (aqi) this.o, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new lco((tfn) this.m, (yks) this.n, (String) this.l, (s7u) this.o, continuation, 28);
            default:
                return new lco((yks) this.m, (String) this.n, (s7u) this.l, (lxe) this.o, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 18:
                ((lco) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
            case 24:
                ((lco) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((lco) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02b5, code lost:
    
        if (defpackage.x97.V(r2, r3, r29) == r5) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02b8, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x05fa, code lost:
    
        if (r0 == r2) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x05d4, code lost:
    
        if (r3 == r2) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x05ad, code lost:
    
        if (r3 == r2) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0790, code lost:
    
        if (r3 == r0) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x077e, code lost:
    
        if (defpackage.saf.C(r2, r29) == r0) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0915, code lost:
    
        if (r0 == r6) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x08f3, code lost:
    
        if (r2 == r6) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0b1c, code lost:
    
        if (defpackage.fk0.c(r0, r2, r1, null, r29, 12) == r10) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0adc, code lost:
    
        if (defpackage.fk0.c(r0, r2, r1, null, r29, 12) == r10) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0a80, code lost:
    
        if (defpackage.fk0.c(r0, r2, r1, null, r29, 12) == r10) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0a41, code lost:
    
        if (defpackage.fk0.c(r0, r2, r1, null, r29, 12) == r10) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x09fb, code lost:
    
        if (r8.f(r0, r29) == r10) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x09eb, code lost:
    
        if (defpackage.fk0.c(r0, r2, r1, null, r29, 12) == r10) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x09c4, code lost:
    
        if (r8.f(r0, r29) == r10) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0a1a, code lost:
    
        if (r8.f(r2, r29) == r10) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x0a58, code lost:
    
        if (r8.f(r1, r29) == r10) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0a91, code lost:
    
        if (r8.f(r1, r29) == r10) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0ab0, code lost:
    
        if (r8.f(r1, r29) == r10) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0af4, code lost:
    
        if (r8.f(r1, r29) == r10) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0b2e, code lost:
    
        if (r8.f(r1, r29) == r10) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0136, code lost:
    
        if (r0 == r9) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016b, code lost:
    
        if (r0 == r9) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0212, code lost:
    
        if (defpackage.y2x.p(r8, r29) == r5) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x026d, code lost:
    
        if (r2 == r5) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05df  */
    /* JADX WARN: Type inference failed for: r1v17, types: [kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r2v100, types: [r2f] */
    /* JADX WARN: Type inference failed for: r2v149 */
    /* JADX WARN: Type inference failed for: r2v150 */
    /* JADX WARN: Type inference failed for: r2v59, types: [int] */
    /* JADX WARN: Type inference failed for: r2v60, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r2v97, types: [r2f] */
    /* JADX WARN: Type inference failed for: r5v32, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r6v11, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:135:0x03b3 -> B:128:0x03b7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:157:0x0433 -> B:150:0x0437). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:180:0x04f8 -> B:173:0x04c8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:405:0x09eb -> B:402:0x09ef). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x0276 -> B:79:0x02b9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x02b5 -> B:79:0x02b9). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CancellationException cancellationException;
        ou7 p;
        rar y;
        Object d;
        Object V;
        Continuation continuation;
        n7q n7qVar;
        xgh xghVar;
        Object obj2;
        Object obj3;
        Object b;
        smp smpVar;
        Object invoke;
        rar y2;
        Object a;
        a7q a7qVar;
        g5q g5qVar;
        rar y3;
        si3 si3Var;
        rar rarVar;
        Object obj4;
        si3 si3Var2;
        long j;
        long j2;
        rar rarVar2;
        Object obj5;
        long a2;
        Object V2;
        Object b2;
        Object a3;
        int i = 4;
        int i2 = 12;
        int i3 = 11;
        int i4 = 8;
        int i5 = 5;
        int i6 = 2;
        int i7 = 1;
        Continuation continuation2 = null;
        switch (this.j) {
            case 0:
                mco mcoVar = (mco) this.o;
                mm6 mm6Var = (mm6) this.l;
                nm6 nm6Var = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    cancellationException = null;
                    p = x97.p(mm6Var, null, null, new kco(mcoVar, false ? 1 : 0, 0), 3);
                    y = x97.y(mm6Var, null, null, new kco(mcoVar, false ? 1 : 0, 1), 3);
                    acp acpVar = new acp(getContext());
                    acpVar.g(p.G(), new z0i(2, 18, false ? 1 : 0));
                    acpVar.i(new xbp(acpVar, (h3f) y.K().b, g3f.a, qf3.d, bcp.e, new ikc(1, i4, false ? 1 : 0), null), false);
                    this.l = null;
                    this.m = p;
                    this.n = y;
                    this.k = 1;
                    d = acpVar.d(this);
                    if (d == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y = (rar) this.n;
                    ou7 ou7Var = (ou7) this.m;
                    qgg.h0(obj);
                    p = ou7Var;
                    cancellationException = null;
                    d = obj;
                }
                ((Boolean) d).getClass();
                p.g(cancellationException);
                y.g(cancellationException);
                return d;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    CoroutineContext.Element element = ((mm6) this.l).getCoroutineContext().get(d.t0);
                    element.getClass();
                    ?? r1 = (d) element;
                    ueo ueoVar = (ueo) this.m;
                    CoroutineContext plus = ((kotlin.coroutines.a) r1).plus(new m6t(r1));
                    CoroutineContext plus2 = plus.plus(new qfs(plus, ueoVar.k));
                    zt3 zt3Var = (zt3) this.n;
                    r7o r7oVar = z7o.b;
                    veo veoVar = (veo) this.o;
                    this.l = zt3Var;
                    this.k = 1;
                    V = x97.V(plus2, veoVar, this);
                    if (V == nm6Var2) {
                        return nm6Var2;
                    }
                    continuation = zt3Var;
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    continuation = (Continuation) this.l;
                    qgg.h0(obj);
                    V = obj;
                }
                r7o r7oVar2 = z7o.b;
                continuation.resumeWith(V);
                return Unit.a;
            case 2:
                int i10 = this.k;
                suq suqVar = (suq) this.n;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                tvo tvoVar = (tvo) this.m;
                if (tvoVar instanceof qvo) {
                    suqVar.f(i10);
                } else if (!Intrinsics.d(tvoVar, rvo.a)) {
                    if (!(tvoVar instanceof svo)) {
                        b6e.s();
                        return null;
                    }
                    ((hvq) this.l).v(((svo) tvoVar).a, ((wd3) ((zd3) this.o)).e);
                    suqVar.f(i10);
                }
                return Unit.a;
            case 3:
                fxg fxgVar = fxg.a;
                jxg jxgVar = (jxg) this.m;
                aqi aqiVar = (aqi) this.o;
                fk0 fk0Var = (fk0) this.n;
                jzg jzgVar = (jzg) this.l;
                nm6 nm6Var4 = nm6.a;
                switch (this.k) {
                    case 0:
                        qgg.h0(obj);
                        jxg jxgVar2 = (jxg) aqiVar.getValue();
                        aqiVar.setValue(jxgVar);
                        bxg bxgVar = bxg.a;
                        if (!jxgVar.equals(bxgVar)) {
                            hxg hxgVar = hxg.a;
                            if (!jxgVar.equals(hxgVar)) {
                                if (jxgVar.equals(fxgVar)) {
                                    if (Intrinsics.d(jxgVar2, bxgVar)) {
                                        Float f = new Float(jzgVar.b);
                                        this.k = 9;
                                        break;
                                    } else if (Intrinsics.d(jxgVar2, hxgVar)) {
                                        Float f2 = new Float(jzgVar.c);
                                        this.k = 11;
                                        break;
                                    } else {
                                        Float f3 = new Float(jzgVar.d);
                                        this.k = 13;
                                        break;
                                    }
                                } else if (!jxgVar.equals(dxg.a)) {
                                    b6e.s();
                                    return null;
                                }
                                return Unit.a;
                            }
                            if (Intrinsics.d(jxgVar2, bxgVar)) {
                                Float f4 = new Float(jzgVar.b);
                                this.k = 4;
                                break;
                            } else if (Intrinsics.d(jxgVar2, fxgVar)) {
                                Float f5 = new Float(jzgVar.d);
                                this.k = 6;
                                break;
                            } else {
                                Float f6 = new Float(jzgVar.c);
                                this.k = 8;
                                break;
                            }
                        } else {
                            Float f7 = new Float(0.0f);
                            this.k = 1;
                            break;
                        }
                        return nm6Var4;
                    case 1:
                    case 3:
                        qgg.h0(obj);
                        fk0 fk0Var2 = (fk0) this.n;
                        Float f8 = new Float(jzgVar.a);
                        act S = weo.S(jzgVar.e, 0, nya.d, 2);
                        this.k = 2;
                        break;
                    case 2:
                        qgg.h0(obj);
                        Float f9 = new Float(0.0f);
                        this.k = 3;
                        break;
                    case 4:
                        qgg.h0(obj);
                        fk0 fk0Var3 = (fk0) this.n;
                        Float f10 = new Float(jzgVar.c);
                        act S2 = weo.S(jzgVar.f, 0, nya.d, 2);
                        this.k = 5;
                        break;
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                    case 13:
                        qgg.h0(obj);
                        return Unit.a;
                    case 6:
                        qgg.h0(obj);
                        fk0 fk0Var4 = (fk0) this.n;
                        Float f11 = new Float(jzgVar.c);
                        act S3 = weo.S(jzgVar.g, 0, nya.d, 2);
                        this.k = 7;
                        break;
                    case 9:
                        qgg.h0(obj);
                        fk0 fk0Var5 = (fk0) this.n;
                        Float f12 = new Float(jzgVar.d);
                        act S4 = weo.S(jzgVar.f + jzgVar.g, 0, nya.d, 2);
                        this.k = 10;
                        break;
                    case 11:
                        qgg.h0(obj);
                        fk0 fk0Var6 = (fk0) this.n;
                        Float f13 = new Float(jzgVar.d);
                        act S5 = weo.S(jzgVar.g, 0, nya.d, 2);
                        this.k = 12;
                        break;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar = (rjc) this.l;
                    eno S6 = vut.S((pjc) this.m, (k3i) this.n);
                    tek tekVar = new tek(27, (bml) this.o, rjcVar);
                    this.k = 1;
                    if (S6.collect(tekVar, this) == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 5:
                alp alpVar = (alp) this.l;
                wkp wkpVar = (wkp) this.n;
                lu3 lu3Var = wkpVar.i;
                ump umpVar = wkpVar.h;
                ump umpVar2 = wkpVar.f;
                nm6 nm6Var6 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    Object value = wkpVar.b.c.getValue();
                    d6l d6lVar = value instanceof d6l ? (d6l) value : null;
                    n7qVar = d6lVar != null ? d6lVar.a : null;
                    List B = n7qVar != null ? y7g.B(n7qVar) : null;
                    mwk b3 = n7qVar != null ? n7qVar.b() : null;
                    String string = alpVar.c.getString("com.yandex.music.session.MEDIA_ID");
                    if (B != null && string != null) {
                        Iterator it = B.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj3 = it.next();
                                if (Intrinsics.d(((mwk) obj3).b(), string)) {
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        mwk mwkVar = (mwk) obj3;
                        if (mwkVar != null) {
                            b3 = mwkVar;
                        }
                    }
                    this.m = n7qVar;
                    this.k = 1;
                    zgh zghVar = wkpVar.e;
                    ump umpVar3 = wkpVar.g;
                    jyr jyrVar = wkpVar.a.a;
                    fs7 fs7Var = xgh.b;
                    String str = alpVar.b;
                    fs7Var.getClass();
                    rdb rdbVar = xgh.j;
                    rdbVar.getClass();
                    c7 c7Var = new c7(0, rdbVar);
                    while (true) {
                        if (c7Var.hasNext()) {
                            xghVar = (xgh) c7Var.next();
                            if (Intrinsics.d(xghVar.a, str)) {
                            }
                        } else {
                            xghVar = null;
                        }
                    }
                    switch (xghVar == null ? -1 : rkp.a[xghVar.ordinal()]) {
                        case 1:
                            if (b3 != null) {
                                ((t3g) jyrVar.getValue()).s(b3);
                                zghVar.i(true);
                                obj2 = umpVar2;
                                break;
                            }
                            obj2 = umpVar3;
                            break;
                        case 2:
                            if (b3 != null) {
                                ((t3g) jyrVar.getValue()).a(b3);
                                zghVar.h(true);
                                obj2 = umpVar2;
                                break;
                            }
                            obj2 = umpVar3;
                            break;
                        case 3:
                            if (b3 != null) {
                                ((t3g) jyrVar.getValue()).z(b3);
                                zghVar.i(false);
                                obj2 = umpVar2;
                                break;
                            }
                            obj2 = umpVar3;
                            break;
                        case 4:
                            if (b3 != null) {
                                ((t3g) jyrVar.getValue()).z(b3);
                                zghVar.h(false);
                                obj2 = umpVar2;
                                break;
                            }
                            obj2 = umpVar3;
                            break;
                        case 5:
                            obj2 = lu3Var.a(new ukp(wkpVar, null, wkpVar, -15000L), this);
                            break;
                        case 6:
                            obj2 = lu3Var.a(new ukp(wkpVar, null, wkpVar, 30000L), this);
                            wkpVar = wkpVar;
                            break;
                        default:
                            obj2 = umpVar;
                            break;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        b = obj;
                        ump umpVar4 = (ump) b;
                        return Intrinsics.d(umpVar4, umpVar2) ? umpVar4 : umpVar;
                    }
                    n7q n7qVar2 = (n7q) this.m;
                    qgg.h0(obj);
                    n7qVar = n7qVar2;
                    obj2 = obj;
                }
                ump umpVar5 = (ump) obj2;
                if (Intrinsics.d(umpVar5, umpVar2)) {
                    return umpVar5;
                }
                i8l a4 = ((mzb) this.o).a();
                a4.getClass();
                this.m = null;
                this.k = 2;
                b = wkp.b(wkpVar, a4, alpVar, n7qVar, this);
                break;
            case 6:
                AtomicReference atomicReference = (AtomicReference) this.n;
                nm6 nm6Var7 = nm6.a;
                ?? r2 = this.k;
                try {
                    if (r2 == 0) {
                        qgg.h0(obj);
                        mm6 mm6Var2 = (mm6) this.l;
                        smp smpVar2 = new smp(saf.Q(mm6Var2.getCoroutineContext()), ((uif) this.m).invoke(mm6Var2));
                        smp smpVar3 = (smp) atomicReference.getAndSet(smpVar2);
                        if (smpVar3 != null) {
                            r2f r2fVar = smpVar3.a;
                            this.l = smpVar2;
                            this.k = 1;
                            break;
                        }
                        smpVar = smpVar2;
                    } else {
                        if (r2 != 1) {
                            if (r2 != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            smp smpVar4 = (smp) this.l;
                            qgg.h0(obj);
                            invoke = obj;
                            r2 = smpVar4;
                            Object obj6 = r2;
                            while (!atomicReference.compareAndSet(obj6, null) && atomicReference.get() == obj6) {
                            }
                            return invoke;
                        }
                        smp smpVar5 = (smp) this.l;
                        qgg.h0(obj);
                        smpVar = smpVar5;
                    }
                    Function2 function2 = (Function2) this.o;
                    Object obj7 = smpVar.b;
                    this.l = smpVar;
                    this.k = 2;
                    invoke = function2.invoke(obj7, this);
                    r2 = smpVar;
                    break;
                } catch (Throwable th) {
                    while (!atomicReference.compareAndSet(r2, null) && atomicReference.get() == r2) {
                    }
                    throw th;
                }
            case 7:
                Throwable th2 = (Throwable) this.l;
                nm6 nm6Var8 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    aw0 aw0Var = (aw0) this.m;
                    Context context = (Context) this.n;
                    this.k = 1;
                    aw0Var.a(context, th2);
                    if (Unit.a == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                gld.K((gjs) this.o, "Error in composition effect coroutine", th2);
                return Unit.a;
            case 8:
                owp owpVar = (owp) this.m;
                mm6 mm6Var3 = (mm6) this.l;
                nm6 nm6Var9 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    y2 = x97.y(mm6Var3, null, null, new glp(owpVar, continuation2, i6), 3);
                    Context context2 = owpVar.a;
                    co6 co6Var = ((zwp) this.o).b;
                    int b4 = frv.b() * 3;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(cce.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    cce cceVar = (cce) qdcVar.C(I);
                    pce d0 = n7w.d0(co6Var, context2, b4, to6.c(co6Var.b, context2), to6.a(co6Var.b, context2));
                    d0.o = Boolean.FALSE;
                    rce a5 = d0.a();
                    this.l = null;
                    this.n = y2;
                    this.k = 1;
                    a = cceVar.a(a5, this);
                    if (a == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rar rarVar3 = (rar) this.n;
                    qgg.h0(obj);
                    y2 = rarVar3;
                    a = obj;
                }
                sce sceVar = (sce) a;
                y2.g(null);
                if (sceVar instanceof bqr) {
                    return vq2.N(((bqr) sceVar).a, 0, 0, 7);
                }
                if (sceVar instanceof pgb) {
                    ugb ugbVar = ugb.a;
                    throw new ShareNetworkException(0);
                }
                b6e.s();
                return null;
            case 9:
                nm6 nm6Var10 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    xqn i16 = hrg.i(obj);
                    xqn xqnVar = new xqn();
                    xqn xqnVar2 = new xqn();
                    za8 a0 = zsd.a0(new qk3(new eno(new tkc((vdr) this.n, continuation2, i7)), i4), new j1p(7));
                    s3 s3Var = new s3(i16, (Serializable) xqnVar2, (Object) xqnVar, (Serializable) this.l, this.o, 5);
                    this.k = 1;
                    if (a0.collect(s3Var, this) == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 10:
                p5d p5dVar = (p5d) this.n;
                n5q n5qVar = (n5q) this.m;
                a7q a7qVar2 = n5qVar.a;
                Object obj8 = nm6.a;
                int i17 = this.k;
                Continuation continuation3 = null;
                if (i17 == 0) {
                    qgg.h0(obj);
                    EnumSet<Enum> enumSet = n5qVar.h;
                    EnumSet noneOf = EnumSet.noneOf(g5q.class);
                    for (Enum r7 : enumSet) {
                        noneOf.getClass();
                        r7.getClass();
                        int ordinal = ((o5d) r7).ordinal();
                        if (ordinal == 0) {
                            g5qVar = g5q.a;
                        } else if (ordinal == 1) {
                            g5qVar = g5q.b;
                        } else {
                            if (ordinal != 2) {
                                b6e.s();
                                return null;
                            }
                            g5qVar = g5q.c;
                        }
                        noneOf.add(g5qVar);
                    }
                    noneOf.getClass();
                    t0q t0qVar = p5dVar.g;
                    boolean z = p5dVar.c;
                    v2q v2qVar = (v2q) this.l;
                    Long l = (Long) this.o;
                    this.k = 1;
                    a7qVar2.getClass();
                    a7qVar = a7qVar2;
                    Object V3 = x97.V(mal.b(), new r32(a7qVar, v2qVar, noneOf, z, l, t0qVar, (Continuation) null), this);
                    Object obj9 = V3;
                    if (V3 != nm6.a) {
                        obj9 = Unit.a;
                        break;
                    }
                } else {
                    if (i17 != 1) {
                        if (i17 != 2) {
                            if (i17 == 3) {
                                qgg.h0(obj);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        n5qVar.g = null;
                        if (p5dVar.b) {
                            this.k = 3;
                            a7qVar2.getClass();
                            Object V4 = x97.V(mal.b(), new x6q(a7qVar2, continuation3, 7), this);
                            Object obj10 = V4;
                            if (V4 != nm6.a) {
                                obj10 = Unit.a;
                                break;
                            }
                        }
                        return Unit.a;
                    }
                    qgg.h0(obj);
                    a7qVar = a7qVar2;
                }
                Long l2 = n5qVar.g;
                if (l2 != null) {
                    long longValue = l2.longValue();
                    this.k = 2;
                    a7qVar.getClass();
                    a7qVar2 = a7qVar;
                    Object V5 = x97.V(mal.b(), new g84(a7qVar2, longValue, continuation3, 2), this);
                    Object obj11 = V5;
                    if (V5 != nm6.a) {
                        obj11 = Unit.a;
                        break;
                    }
                } else {
                    a7qVar2 = a7qVar;
                }
                n5qVar.g = null;
                if (p5dVar.b) {
                }
                return Unit.a;
            case 11:
                return k(obj);
            case 12:
                nm6 nm6Var11 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    mm6 mm6Var4 = (mm6) this.l;
                    zi3 g = men.g(0, 6, null);
                    y3 = x97.y(mm6Var4, null, null, new v5p(g, (Function2) this.o, (Continuation) null), 3);
                    si3Var = new si3(g);
                } else {
                    if (i18 == 1) {
                        si3Var2 = (si3) this.m;
                        ?? r22 = (r2f) this.l;
                        qgg.h0(obj);
                        rarVar = r22;
                        obj4 = obj;
                        if (((Boolean) obj4).booleanValue()) {
                            rarVar.g(null);
                            return Unit.a;
                        }
                        Object d2 = si3Var2.d();
                        rjc rjcVar2 = (rjc) this.n;
                        this.l = rarVar;
                        this.m = si3Var2;
                        this.k = 2;
                        if (rjcVar2.emit(d2, this) != nm6Var11) {
                            rar rarVar4 = rarVar;
                            si3Var = si3Var2;
                            y3 = rarVar4;
                        }
                        return nm6Var11;
                    }
                    if (i18 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    si3 si3Var3 = (si3) this.m;
                    ?? r23 = (r2f) this.l;
                    qgg.h0(obj);
                    si3Var = si3Var3;
                    y3 = r23;
                }
                this.l = y3;
                this.m = si3Var;
                this.k = 1;
                obj4 = si3Var.c(this);
                if (obj4 != nm6Var11) {
                    si3 si3Var4 = si3Var;
                    rarVar = y3;
                    si3Var2 = si3Var4;
                    if (((Boolean) obj4).booleanValue()) {
                    }
                }
                return nm6Var11;
            case 13:
                vzq vzqVar = (vzq) this.n;
                long j3 = vzqVar.b;
                ExoPlayer exoPlayer = (ExoPlayer) this.m;
                nm6 nm6Var12 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    if (exoPlayer.J0() < vzqVar.c) {
                    }
                    return Unit.a;
                }
                if (i19 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                long J0 = exoPlayer.J0();
                bqi bqiVar = (bqi) this.l;
                bqi bqiVar2 = (bqi) this.o;
                long j4 = vzqVar.c;
                if (J0 <= j4 && j3 <= J0) {
                    Float f14 = new Float(zwf.w(j4, J0, vzqVar.e));
                    xdr xdrVar = (xdr) bqiVar;
                    xdrVar.getClass();
                    xdrVar.m(null, f14);
                    long j5 = vzqVar.d;
                    j = j3 + j5;
                    if (J0 <= j) {
                        Float f15 = new Float(zwf.w(j, J0, j5));
                        xdr xdrVar2 = (xdr) bqiVar2;
                        xdrVar2.getClass();
                        xdrVar2.m(null, f15);
                    }
                }
                if (exoPlayer.J0() < vzqVar.c || !exoPlayer.e()) {
                    return Unit.a;
                }
                long j6 = vzqVar.a;
                this.k = 1;
                if (y2x.o(j6, this) == nm6Var12) {
                    return nm6Var12;
                }
                long J02 = exoPlayer.J0();
                bqi bqiVar3 = (bqi) this.l;
                bqi bqiVar22 = (bqi) this.o;
                long j42 = vzqVar.c;
                if (J02 <= j42) {
                    Float f142 = new Float(zwf.w(j42, J02, vzqVar.e));
                    xdr xdrVar3 = (xdr) bqiVar3;
                    xdrVar3.getClass();
                    xdrVar3.m(null, f142);
                    long j52 = vzqVar.d;
                    j = j3 + j52;
                    if (J02 <= j) {
                    }
                }
                if (exoPlayer.J0() < vzqVar.c) {
                }
                return Unit.a;
            case 14:
                xzq xzqVar = (xzq) this.n;
                long j7 = xzqVar.b;
                ExoPlayer exoPlayer2 = (ExoPlayer) this.m;
                nm6 nm6Var13 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    if (exoPlayer2.J0() < xzqVar.c) {
                    }
                    return Unit.a;
                }
                if (i20 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                long J03 = exoPlayer2.J0();
                bqi bqiVar4 = (bqi) this.l;
                bqi bqiVar5 = (bqi) this.o;
                long j8 = xzqVar.c;
                if (J03 <= j8 && j7 <= J03) {
                    Float f16 = new Float(zwf.w(j8, J03, xzqVar.e));
                    xdr xdrVar4 = (xdr) bqiVar4;
                    xdrVar4.getClass();
                    xdrVar4.m(null, f16);
                    long j9 = xzqVar.d;
                    j2 = j7 + j9;
                    if (J03 <= j2) {
                        Float f17 = new Float(zwf.w(j2, J03, j9));
                        xdr xdrVar5 = (xdr) bqiVar5;
                        xdrVar5.getClass();
                        xdrVar5.m(null, f17);
                    }
                }
                if (exoPlayer2.J0() < xzqVar.c || !exoPlayer2.e()) {
                    return Unit.a;
                }
                long j10 = xzqVar.a;
                this.k = 1;
                if (y2x.o(j10, this) == nm6Var13) {
                    return nm6Var13;
                }
                long J032 = exoPlayer2.J0();
                bqi bqiVar42 = (bqi) this.l;
                bqi bqiVar52 = (bqi) this.o;
                long j82 = xzqVar.c;
                if (J032 <= j82) {
                    Float f162 = new Float(zwf.w(j82, J032, xzqVar.e));
                    xdr xdrVar42 = (xdr) bqiVar42;
                    xdrVar42.getClass();
                    xdrVar42.m(null, f162);
                    long j92 = xzqVar.d;
                    j2 = j7 + j92;
                    if (J032 <= j2) {
                    }
                }
                if (exoPlayer2.J0() < xzqVar.c) {
                }
                return Unit.a;
            case 15:
                nm6 nm6Var14 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    ttr ttrVar = (ttr) ywf.L((utr) this.m, (ttr) this.n);
                    cir cirVar = (cir) this.l;
                    ohb ohbVar = (ohb) this.o;
                    this.k = 1;
                    if (ttrVar.b(cirVar, ohbVar, this) == nm6Var14) {
                        return nm6Var14;
                    }
                } else {
                    if (i21 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 16:
                nm6 nm6Var15 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    eno s0 = szf.s0(new v90((ka0) this.m, i5));
                    tnf tnfVar = new tnf((aqi) this.n, (aqi) this.l, (aqi) this.o, (Continuation) null, 2);
                    this.k = 1;
                    if (zsd.O(s0, tnfVar, this) == nm6Var15) {
                        return nm6Var15;
                    }
                } else {
                    if (i22 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 17:
                pfm pfmVar = (pfm) this.l;
                nm6 nm6Var16 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    i50 i50Var = new i50(pfmVar, (Function1) this.m, (w3h) this.n, (Function0) this.o, 24);
                    this.l = null;
                    this.k = 1;
                    if (g6s.e(pfmVar, null, null, i50Var, this, 7) == nm6Var16) {
                        return nm6Var16;
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 18:
                a aVar = (a) this.m;
                mm6 mm6Var5 = (mm6) this.l;
                nm6 nm6Var17 = nm6.a;
                int i24 = this.k;
                if (i24 != 0) {
                    if (i24 != 1) {
                        if (i24 != 2) {
                            if (i24 != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj);
                            i2 = 12;
                            i3 = 11;
                            msa msaVar = nsa.b;
                            long M = yd5.M(30, ssa.SECONDS);
                            this.l = mm6Var5;
                            this.n = null;
                            this.k = 1;
                            break;
                        } else {
                            rarVar2 = (rar) this.n;
                            qgg.h0(obj);
                            obj5 = obj;
                            if (((Boolean) obj5).booleanValue()) {
                                ssg.a(7, "Deadlock", "Deadlock detected, mask = ".concat(CollectionsKt.X((List) this.o, "", null, null, new dgh(i, aVar), 30)), null);
                                dq7 dq7Var = ca8.a;
                                bsd bsdVar = j5h.a;
                                d7i d7iVar = new d7i(rarVar2, continuation2, 28);
                                this.l = mm6Var5;
                                this.n = null;
                                this.k = 3;
                                break;
                            }
                            i2 = 12;
                            i3 = 11;
                            msa msaVar2 = nsa.b;
                            long M2 = yd5.M(30, ssa.SECONDS);
                            this.l = mm6Var5;
                            this.n = null;
                            this.k = 1;
                        }
                    } else {
                        qgg.h0(obj);
                        rarVar2 = x97.y(mm6Var5, aVar, null, new db(i6, 21, continuation2), 2);
                        acp acpVar2 = new acp(getContext());
                        acpVar2.i(new xbp(acpVar2, (h3f) rarVar2.K().b, g3f.a, qf3.d, bcp.e, new ikc(i7, i3, continuation2), null), false);
                        msa msaVar3 = nsa.b;
                        rzf.K(acpVar2, y2x.c0(yd5.M(5, ssa.SECONDS)), new ikc(i7, i2, continuation2));
                        this.l = mm6Var5;
                        this.n = rarVar2;
                        this.k = 2;
                        obj5 = acpVar2.d(this);
                        break;
                    }
                } else {
                    qgg.h0(obj);
                    msa msaVar22 = nsa.b;
                    long M22 = yd5.M(30, ssa.SECONDS);
                    this.l = mm6Var5;
                    this.n = null;
                    this.k = 1;
                }
            case 19:
                gjs gjsVar = (gjs) this.m;
                nm6 nm6Var18 = nm6.a;
                int i25 = this.k;
                if (i25 != 0 && i25 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                do {
                    Object obj12 = gjsVar.b.get();
                    obj12.getClass();
                    long longValue2 = ((Number) obj12).longValue();
                    ((e7o) this.n).getClass();
                    if (longValue2 <= System.currentTimeMillis()) {
                        gld.L((mm6) this.l, new xis("Timed out of executing block.", ((Function2) this.o).hashCode()));
                        return Unit.a;
                    }
                    a2 = gjsVar.a();
                    this.k = 1;
                } while (y2x.p(a2, this) != nm6Var18);
                return nm6Var18;
            case 20:
                gy1 gy1Var = (gy1) this.n;
                uts utsVar = (uts) this.m;
                nm6 nm6Var19 = nm6.a;
                int i26 = this.k;
                if (i26 != 0) {
                    if (i26 == 1) {
                        qgg.h0(obj);
                        b2 = obj;
                        return (fts) b2;
                    }
                    if (i26 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    V2 = obj;
                    return (fts) V2;
                }
                qgg.h0(obj);
                thr c = utsVar.e.c();
                gy1 gy1Var2 = gy1.d;
                jyr jyrVar2 = utsVar.l;
                if (gy1Var == gy1Var2) {
                    nbo nboVar = (nbo) jyrVar2.getValue();
                    maa maaVar = maa.a;
                    nboVar.getClass();
                    qbo qboVar = (qbo) nbo.b(maaVar).a;
                    zvs zvsVar = (zvs) this.l;
                    vzg vzgVar = (vzg) this.o;
                    this.k = 1;
                    b2 = uts.b(utsVar, qboVar, zvsVar, c, vzgVar, this);
                    break;
                } else {
                    nbo nboVar2 = (nbo) jyrVar2.getValue();
                    maa maaVar2 = maa.a;
                    nboVar2.getClass();
                    qbo qboVar2 = (qbo) nbo.b(maaVar2).a;
                    zvs zvsVar2 = (zvs) this.l;
                    vzg vzgVar2 = (vzg) this.o;
                    this.k = 2;
                    V2 = x97.V(dm6.b, new qts(zvsVar2, c, utsVar, vzgVar2, gy1Var, qboVar2, null), this);
                    break;
                }
                return nm6Var19;
            case 21:
                nm6 nm6Var20 = nm6.a;
                int i27 = this.k;
                if (i27 != 0) {
                    if (i27 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                uts utsVar2 = (uts) ((vts) this.m).b.getValue();
                zvs zvsVar3 = (zvs) this.n;
                vzg vzgVar3 = (vzg) this.l;
                gy1 gy1Var3 = (gy1) this.o;
                this.k = 1;
                utsVar2.getClass();
                Object V6 = x97.V(dm6.b, new lco(utsVar2, gy1Var3, zvsVar3, vzgVar3, (Continuation) null, 20), this);
                return V6 == nm6Var20 ? nm6Var20 : V6;
            case 22:
                return l(obj);
            case 23:
                return n(obj);
            case 24:
                return o(obj);
            case 25:
                return p(obj);
            case 26:
                return q(obj);
            case 27:
                return s(obj);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return t(obj);
            default:
                nm6 nm6Var21 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    vw5 vw5Var = (vw5) ((yks) this.m).b;
                    String str2 = (String) this.n;
                    String str3 = ((s7u) this.l).a;
                    lxe lxeVar = (lxe) this.o;
                    this.k = 1;
                    a3 = vw5Var.a(str2, str3, lxeVar, this);
                    if (a3 == nm6Var21) {
                        return nm6Var21;
                    }
                } else {
                    if (i28 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a3 = obj;
                }
                rj6 rj6Var = (rj6) a3;
                if (!(rj6Var instanceof qj6)) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    ssg.a(6, "VideoClipRadioFeedbackReporterImpl", "Failed sending feedback for playback stop", ((pj6) rj6Var).a());
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lco(rjc rjcVar, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.j = 12;
        this.n = rjcVar;
        this.o = (aur) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lco(wkp wkpVar, alp alpVar, mzb mzbVar, Continuation continuation) {
        super(2, continuation);
        this.j = 5;
        this.n = wkpVar;
        this.l = alpVar;
        this.o = mzbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lco(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.n = obj2;
        this.l = obj3;
        this.o = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lco(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.n = obj2;
        this.o = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lco(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.o = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lco(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.o = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lco(Function1 function1, AtomicReference atomicReference, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.j = 6;
        this.m = (uif) function1;
        this.n = atomicReference;
        this.o = function2;
    }
}
