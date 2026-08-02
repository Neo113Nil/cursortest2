package defpackage;

import android.content.Intent;
import android.view.View;
import androidx.compose.material3.internal.a;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.databases.main.MainDatabase;
import com.yandex.music.shared.playback.core.api.PlaybackQueueStartValidator$InvalidQueueException;
import com.yandex.passport.common.url.b;
import com.yandex.passport.sloth.data.o0;
import com.yandex.passport.sloth.data.y;
import com.yandex.passport.sloth.url.v;
import com.yandex.pulse.metrics.o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.wave.recommendations.StationId;
import ru.yandex.music.url.ui.UrlActivity;

/* loaded from: classes.dex */
public final class w90 extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w90(ueo ueoVar, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.j = 12;
        this.l = ueoVar;
        this.m = (aur) function1;
    }

    /* JADX WARN: Type inference failed for: r2v25, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v3, types: [aur, pyc] */
    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new w90((ia0) this.l, (pyc) this.m, continuation, 0);
            case 1:
                return new w90((ja0) this.l, (pyc) this.m, continuation);
            case 2:
                return new w90((ka0) this.l, (pyc) this.m, continuation, 2);
            case 3:
                return new w90((mj1) this.l, (s91) this.m, continuation, 3);
            case 4:
                return new w90((es6) this.l, (eca) this.m, continuation, 4);
            case 5:
                return new w90((rjc) this.l, (xqn) this.m, continuation, 5);
            case 6:
                return new w90((xlg) this.l, (String) this.m, continuation, 6);
            case 7:
                return new w90((rxv) this.l, (tm0) this.m, continuation, 7);
            case 8:
                return new w90((pui) this.l, (oq) this.m, continuation, 8);
            case 9:
                return new w90((pui) this.l, (cvl) this.m, continuation, 9);
            case 10:
                return new w90((kvf) this.l, (v3k) this.m, continuation, 10);
            case 11:
                return new w90((ueo) this.l, continuation, (lxs) this.m);
            case 12:
                return new w90((ueo) this.l, (Function1) this.m, continuation);
            case 13:
                return new w90((mmo) this.l, (StationId) this.m, continuation, 13);
            case 14:
                return new w90((rus) this.l, (String) this.m, continuation, 14);
            case 15:
                return new w90((b5t) this.l, (l20) this.m, continuation, 15);
            case 16:
                return new w90((b5t) this.l, (fm1) this.m, continuation, 16);
            case 17:
                return new w90((b5t) this.l, (o3m) this.m, continuation, 17);
            case 18:
                return new w90((UrlActivity) this.l, (ypt) this.m, continuation, 18);
            case 19:
                return new w90((s9p) this.l, (hxu) this.m, continuation, 19);
            case 20:
                return new w90((Function2) this.l, (akw) this.m, continuation, 20);
            case 21:
                return new w90((v) this.l, (o0) this.m, continuation, 21);
            case 22:
                return new w90((dp0) this.l, (jqi) this.m, continuation, 22);
            default:
                return new w90((dp0) this.l, (s6n) this.m, continuation, 23);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((w90) create(continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0467, code lost:
    
        if (r2 != null) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0174, code lost:
    
        if (r6 == r0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x015e, code lost:
    
        if (r10 == r0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x06a5, code lost:
    
        if (r1 == r0) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0112, code lost:
    
        if (r0 == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0129, code lost:
    
        if (r0 == r1) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03b2  */
    /* JADX WARN: Type inference failed for: r0v73, types: [nm6] */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v82, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v2, types: [aur, pyc] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long i;
        Object d;
        LinkedList linkedList;
        Serializable b;
        rrl rrlVar;
        List list;
        Object G;
        lxs lxsVar;
        Object invoke;
        Object b2;
        Object b3;
        Object z;
        Object V;
        String str;
        tft bf7Var;
        Intent intent;
        boolean z2;
        cqt T;
        String str2;
        Object f;
        Object f2;
        Object obj2;
        int i2 = 27;
        int i3 = 25;
        int i4 = 10;
        int i5 = 1;
        boolean z3 = true;
        boolean z4 = true;
        Continuation continuation = null;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    ia0 ia0Var = (ia0) this.l;
                    u90 u90Var = new u90(ia0Var, 0);
                    k3 k3Var = new k3((pyc) this.m, ia0Var, null, 3);
                    this.k = 1;
                    if (a.a(u90Var, k3Var, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                ja0 ja0Var = (ja0) this.l;
                t6k t6kVar = ja0Var.j;
                nm6 nm6Var2 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    q90 q90Var = new q90(ja0Var, 2);
                    k3 k3Var2 = new k3(ja0Var, (pyc) this.m, (Continuation) null);
                    this.k = 1;
                    if (com.yandex.music.core.ui.compose.draggable.a.e(q90Var, k3Var2, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Object a = ja0Var.c().a(t6kVar.e());
                if (a != null) {
                    if (Math.abs(t6kVar.e() - ja0Var.c().d(a)) < 0.5f && ((Boolean) ja0Var.a.invoke(a)).booleanValue()) {
                        ja0Var.h.setValue(a);
                        ja0Var.h(a);
                    }
                }
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    ka0 ka0Var = (ka0) this.l;
                    v90 v90Var = new v90(ka0Var, 0);
                    k3 k3Var3 = new k3((pyc) this.m, ka0Var, null, 5);
                    this.k = 1;
                    if (xp3.n(v90Var, k3Var3, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i9 = this.k;
                if (i9 != 0) {
                    if (i9 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                ab1 ab1Var = (ab1) ((mj1) this.l).p.getValue();
                String str3 = ((s91) this.m).a.a;
                this.k = 1;
                Object b4 = ab1Var.b(str3, this);
                return b4 == nm6Var4 ? nm6Var4 : b4;
            case 4:
                eca ecaVar = (eca) this.m;
                wka wkaVar = (wka) ((es6) this.l).a;
                nm6 nm6Var5 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object V2 = x97.V(dm6.b, new fpq(ecaVar, ((yka) wkaVar).a, (Continuation) null, i3), this);
                    Object obj3 = V2;
                    if (V2 != nm6Var5) {
                        obj3 = Unit.a;
                    }
                    if (obj3 != nm6Var5) {
                        obj3 = Unit.a;
                    }
                    if (obj3 == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hca hcaVar = ecaVar.b;
                if (hcaVar instanceof fca) {
                    wo6 wo6Var = new wo6(((yka) wkaVar).d);
                    oq oqVar = ((fca) hcaVar).a;
                    oqVar.getClass();
                    co6 co6Var = oqVar.D;
                    String pathForSize = co6Var.a.getPathForSize(wct.t());
                    pathForSize.getClass();
                    wo6Var.a(pathForSize);
                    String pathForSize2 = co6Var.a.getPathForSize(wct.s());
                    pathForSize2.getClass();
                    wo6Var.a(pathForSize2);
                    CoverPath coverPath = oqVar.s;
                    CoverPath coverPath2 = coverPath.hasCover() ? coverPath : null;
                    if (coverPath2 != null) {
                        String pathForSize3 = coverPath2.getPathForSize(frv.b());
                        pathForSize3.getClass();
                        wo6Var.a(pathForSize3);
                    }
                } else if (hcaVar instanceof gca) {
                    wo6 wo6Var2 = new wo6(((yka) wkaVar).d);
                    cvl cvlVar = ((gca) hcaVar).a;
                    cvlVar.getClass();
                    String pathForSize4 = op7.c(cvlVar).a.getPathForSize(wct.t());
                    pathForSize4.getClass();
                    wo6Var2.a(pathForSize4);
                    String pathForSize5 = op7.c(cvlVar).a.getPathForSize(wct.s());
                    pathForSize5.getClass();
                    wo6Var2.a(pathForSize5);
                    CoverPath a2 = op7.a(cvlVar);
                    CoverPath coverPath3 = a2.hasCover() ? a2 : null;
                    if (coverPath3 != null) {
                        String pathForSize6 = coverPath3.getPathForSize(frv.b());
                        pathForSize6.getClass();
                        wo6Var2.a(pathForSize6);
                    }
                } else if (hcaVar != null) {
                    b6e.s();
                    return null;
                }
                return Unit.a;
            case 5:
                xqn xqnVar = (xqn) this.m;
                nm6 nm6Var6 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar = (rjc) this.l;
                    js3 js3Var = ugj.a;
                    Object obj4 = xqnVar.a;
                    if (obj4 == js3Var) {
                        obj4 = null;
                    }
                    this.k = 1;
                    if (rjcVar.emit(obj4, this) == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                xqnVar.a = null;
                return Unit.a;
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i12 = this.k;
                if (i12 != 0) {
                    if (i12 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                rtl rtlVar = ((xlg) this.l).a;
                String str4 = (String) this.m;
                this.k = 1;
                Serializable g = rtlVar.g(str4, Integer.MAX_VALUE, this);
                return g == nm6Var7 ? nm6Var7 : g;
            case 7:
                rxv rxvVar = (rxv) this.l;
                long j = rxvVar.r;
                x6k x6kVar = rxvVar.m;
                x6k x6kVar2 = rxvVar.n;
                nm6 nm6Var8 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    if (wpe.b(rxvVar.d(), ((wpe) x6kVar2.getValue()).a)) {
                        long g2 = enj.g(rxvVar.g(), ((enj) x6kVar.getValue()).a);
                        Pair pair = (Math.abs(enj.e(g2)) >= ((float) ((int) (j >> 32))) || Math.abs(enj.f(g2)) >= ((float) ((int) (j & 4294967295L)))) ? enj.e(g2) > 0.0f ? new Pair(new Integer(1), new Integer(0)) : enj.e(g2) < 0.0f ? new Pair(new Integer(-1), new Integer(0)) : enj.f(g2) > 0.0f ? new Pair(new Integer(0), new Integer(1)) : enj.f(g2) < 0.0f ? new Pair(new Integer(0), new Integer(-1)) : new Pair(new Integer(0), new Integer(0)) : new Pair(new Integer(0), new Integer(0));
                        i = swf.i(nmq.d(rxvVar.q) * (((int) (rxvVar.d() >> 32)) + ((Number) pair.a).intValue()), nmq.b(rxvVar.q) * (((int) (rxvVar.d() & 4294967295L)) + ((Number) pair.b).intValue()));
                    } else {
                        i = swf.i(nmq.d(rxvVar.q) * ((int) (rxvVar.d() >> 32)), nmq.b(rxvVar.q) * ((int) (rxvVar.d() & 4294967295L)));
                    }
                    fk0 fk0Var = new fk0(new enj(rxvVar.g()), azt.f, null, 12);
                    enj enjVar = new enj(i);
                    tm0 tm0Var = (tm0) this.m;
                    kk6 kk6Var = new kk6(rxvVar, 3);
                    this.k = 1;
                    if (fk0.c(fk0Var, enjVar, tm0Var, kk6Var, this, 4) == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                x6kVar.setValue(new enj(rxvVar.g()));
                x6kVar2.setValue(new wpe(rxvVar.d()));
                rxvVar.o.setValue(ewo.a);
                return Unit.a;
            case 8:
                nm6 nm6Var9 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    ms msVar = (ms) ((pui) this.l).f.getValue();
                    String str5 = ((oq) this.m).a;
                    this.k = 1;
                    d = msVar.d(str5, this);
                    if (d == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    d = obj;
                }
                Pair pair2 = (Pair) d;
                oq oqVar2 = pair2 != null ? (oq) pair2.a : null;
                return (oqVar2 == null || (linkedList = oqVar2.F) == null) ? c5b.a : linkedList;
            case 9:
                nm6 nm6Var10 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    nsl nslVar = (nsl) ((pui) this.l).g.getValue();
                    cvl cvlVar2 = (cvl) this.m;
                    this.k = 1;
                    b = nslVar.b(cvlVar2, this);
                    if (b == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    b = obj;
                }
                Pair pair3 = (Pair) b;
                return (pair3 == null || (rrlVar = (rrl) pair3.a) == null || (list = rrlVar.c) == null) ? c5b.a : list;
            case 10:
                nm6 nm6Var11 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    kvf kvfVar = (kvf) this.l;
                    v3k v3kVar = (v3k) this.m;
                    kvfVar.d = v3kVar.b;
                    pjc pjcVar = v3kVar.a;
                    lrf lrfVar = new lrf(i2, kvfVar, v3kVar);
                    this.k = 1;
                    if (pjcVar.collect(lrfVar, this) == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 11:
                Object obj5 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    bok H = ((MainDatabase) ((ueo) this.l)).H();
                    int Q = v5g.Q((lxs) this.m);
                    this.k = 1;
                    G = up6.G(H.a, true, false, new cv0(Q, 5), this);
                    break;
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    G = obj;
                }
                Iterable<drk> iterable = (Iterable) G;
                obj5 = new ArrayList(v75.o(iterable, 10));
                for (drk drkVar : iterable) {
                    rr5 A = q6k.A(drkVar.b, drkVar.c);
                    tfs tfsVar = wc7.a;
                    Date b5 = wc7.a.b(drkVar.d);
                    int i18 = drkVar.e;
                    if (i18 == 1) {
                        lxsVar = lxs.b;
                    } else if (i18 != 2) {
                        su4.s(2, null, k5r.i(i18, "Invalid Int.toTrackListType value "), null);
                        lxsVar = lxs.a;
                    } else {
                        lxsVar = lxs.c;
                    }
                    obj5.add(new unk(A, b5, lxsVar));
                }
                return obj5;
            case 12:
                ueo ueoVar = (ueo) this.l;
                nm6 nm6Var12 = nm6.a;
                int i19 = this.k;
                try {
                    if (i19 == 0) {
                        qgg.h0(obj);
                        ueoVar.b();
                        ?? r2 = (aur) this.m;
                        this.k = 1;
                        invoke = r2.invoke(this);
                        if (invoke == nm6Var12) {
                            return nm6Var12;
                        }
                    } else {
                        if (i19 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        invoke = obj;
                    }
                    ueoVar.t();
                    ueoVar.g();
                    return invoke;
                } catch (Throwable th) {
                    ueoVar.g();
                    throw th;
                }
            case 13:
                StationId stationId = (StationId) this.m;
                mmo mmoVar = (mmo) this.l;
                nm6 nm6Var13 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    b5d b5dVar = (b5d) mmoVar.c;
                    d5d N = ox6.N(stationId);
                    n5n a3 = ((q4d) mmoVar.d).a();
                    this.k = 1;
                    b2 = b5dVar.b(N, a3, this);
                    if (b2 == nm6Var13) {
                        return nm6Var13;
                    }
                } else {
                    if (i20 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    b2 = obj;
                }
                rj6 rj6Var = (rj6) b2;
                if (rj6Var instanceof qj6) {
                    return (e5d) ((qj6) rj6Var).a;
                }
                if (!(rj6Var instanceof pj6)) {
                    b6e.s();
                    return null;
                }
                throw new PlaybackQueueStartValidator$InvalidQueueException(((pj6) rj6Var).a(), "can't start " + stationId);
            case 14:
                nm6 nm6Var14 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    rus rusVar = (rus) this.l;
                    String str6 = (String) this.m;
                    this.k = 1;
                    List list2 = gys.MyMusicWithKids.a;
                    list2.getClass();
                    b3 = rusVar.b(str6, str6, new thn(list2), Boolean.FALSE, null, this);
                    if (b3 == nm6Var14) {
                        return nm6Var14;
                    }
                } else {
                    if (i21 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    b3 = obj;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = ((Iterable) b3).iterator();
                while (it.hasNext()) {
                    linkedHashSet.addAll(((mqs) it.next()).J);
                }
                return CollectionsKt.w0(linkedHashSet);
            case 15:
                nm6 nm6Var15 = nm6.a;
                int i22 = this.k;
                if (i22 != 0) {
                    if (i22 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                b5t b5tVar = (b5t) this.l;
                String str7 = ((l20) this.m).b.a;
                this.k = 1;
                Serializable a4 = b5t.a(b5tVar, str7, this);
                return a4 == nm6Var15 ? nm6Var15 : a4;
            case 16:
                nm6 nm6Var16 = nm6.a;
                int i23 = this.k;
                if (i23 != 0) {
                    if (i23 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                b5t b5tVar2 = (b5t) this.l;
                String str8 = ((fm1) this.m).b.a;
                this.k = 1;
                Object b6 = b5t.b(b5tVar2, str8, this);
                return b6 == nm6Var16 ? nm6Var16 : b6;
            case 17:
                nm6 nm6Var17 = nm6.a;
                int i24 = this.k;
                if (i24 != 0) {
                    if (i24 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                b5t b5tVar3 = (b5t) this.l;
                nvl d2 = ((o3m) this.m).b.d();
                this.k = 1;
                Object c = b5t.c(b5tVar3, d2, this);
                return c == nm6Var17 ? nm6Var17 : c;
            case 18:
                nm6 nm6Var18 = nm6.a;
                int i25 = this.k;
                int i26 = 4;
                if (i25 == 0) {
                    qgg.h0(obj);
                    UrlActivity urlActivity = (UrlActivity) this.l;
                    ypt yptVar = (ypt) this.m;
                    this.k = 1;
                    z = UrlActivity.z(urlActivity, yptVar, this);
                    break;
                } else {
                    if (i25 != 1) {
                        if (i25 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        V = obj;
                        cuo cuoVar = (cuo) V;
                        UrlActivity urlActivity2 = (UrlActivity) this.l;
                        int i27 = UrlActivity.C;
                        switch (((kqt) cuoVar.a).c) {
                            case 1:
                                str = "SUCCESS";
                                break;
                            case 2:
                                str = "NO_CONNECTION";
                                break;
                            case 3:
                                str = "NO_AUTH";
                                break;
                            case 4:
                                str = "NO_SUBSCRIPTION";
                                break;
                            case 5:
                                str = "NOT_FOUND";
                                break;
                            case 6:
                                str = "INVALID_DATA";
                                break;
                            case 7:
                                str = "USER_TOKEN_EXPIRED";
                                break;
                            case 8:
                                str = "UNKNOWN_ERROR";
                                break;
                            default:
                                str = "null";
                                break;
                        }
                        ssg.a(3, "UrlActivity", "handleSchemeProcessingSuccess: ".concat(str), null);
                        kqt kqtVar = (kqt) cuoVar.a;
                        if (kqtVar.c == 7) {
                            View view = urlActivity2.v;
                            if (view == null) {
                                Intrinsics.j("retryContainer");
                                throw null;
                            }
                            view.setVisibility(0);
                        } else {
                            PlaybackScope r = urlActivity2.r();
                            euo type = kqtVar.a.getType();
                            type.getClass();
                            int i28 = 16;
                            int i29 = 9;
                            int i30 = 13;
                            int i31 = 15;
                            int i32 = 11;
                            int i33 = 6;
                            int i34 = 17;
                            switch (type.ordinal()) {
                                case 0:
                                    bf7Var = new bf7(i34);
                                    Intent intent2 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                        intent2.putExtra("extraFromUrlScheme", true);
                                    }
                                    Intent p = bf7Var.p(urlActivity2, intent2, kqtVar);
                                    p.getClass();
                                    if (kqtVar.c == 1) {
                                        p = bf7Var.g(p, urlActivity2, intent2, kqtVar);
                                        p.getClass();
                                    }
                                    z2 = kqtVar.a.getType() != euo.D || kqtVar.a.getType() == euo.J;
                                    if (!z2) {
                                        Map params = kqtVar.a.getParams();
                                        gj gjVar = params != null ? new gj((String) params.get("utm_campaign"), (String) params.get("utm_medium"), (String) params.get("utm_source"), (String) params.get("utm_term"), (String) params.get("yclid"), (String) params.get("campaign_id")) : null;
                                        p.putExtra("deeplink_target_data", new m6s(gjVar, true));
                                        if (gjVar != null) {
                                            ssg.a(3, "TargetData", "Intent has adData=" + gjVar, null);
                                        }
                                        m6s R = qgg.R(p);
                                        gj gjVar2 = R != null ? R.a : null;
                                        if ((gjVar2 != null ? gjVar2.f : null) == null) {
                                            if (gjVar2 != null) {
                                                str2 = gjVar2.a;
                                                break;
                                            } else {
                                                str2 = null;
                                                break;
                                            }
                                        }
                                        mh7 mh7Var = (mh7) urlActivity2.B.getValue();
                                        mh7Var.getClass();
                                        gjVar2.getClass();
                                        mh7Var.a = gjVar2;
                                    }
                                    f2c f2cVar = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar2 = kqtVar.a;
                                    yptVar2.getClass();
                                    f2cVar.getClass();
                                    T = yptVar2.T();
                                    if (!(T instanceof aqt)) {
                                        nmb nmbVar = f2cVar.b;
                                        qkb qkbVar = qkb.ExternalLaunch;
                                        String G2 = f2cVar.a.G();
                                        wjb wjbVar = wjb.Link;
                                        wjb wjbVar2 = ((aqt) T).a;
                                        String uri = yptVar2.m().toString();
                                        uri.getClass();
                                        nmb.y(nmbVar, qkbVar, qkbVar, G2, wjbVar, null, null, null, null, null, wjbVar, wjbVar2, uri, 4080);
                                    } else if (!Intrinsics.d(T, zpt.a) && !Intrinsics.d(T, bqt.a)) {
                                        b6e.s();
                                        return null;
                                    }
                                    urlActivity2.B(p, z2);
                                    break;
                                case 1:
                                    bf7Var = new bf7(i34);
                                    Intent intent22 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p2 = bf7Var.p(urlActivity2, intent22, kqtVar);
                                    p2.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                        break;
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar2 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar22 = kqtVar.a;
                                    yptVar22.getClass();
                                    f2cVar2.getClass();
                                    T = yptVar22.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p2, z2);
                                    break;
                                case 2:
                                    bf7Var = new n20(false);
                                    Intent intent222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p22 = bf7Var.p(urlActivity2, intent222, kqtVar);
                                    p22.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar22 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar222 = kqtVar.a;
                                    yptVar222.getClass();
                                    f2cVar22.getClass();
                                    T = yptVar222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p22, z2);
                                    break;
                                case 3:
                                    bf7Var = new bf7(2);
                                    Intent intent2222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p222 = bf7Var.p(urlActivity2, intent2222, kqtVar);
                                    p222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar2222 = kqtVar.a;
                                    yptVar2222.getClass();
                                    f2cVar222.getClass();
                                    T = yptVar2222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p222, z2);
                                    break;
                                case 4:
                                    bf7Var = new n20(z3 ? 1 : 0);
                                    Intent intent22222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p2222 = bf7Var.p(urlActivity2, intent22222, kqtVar);
                                    p2222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar2222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar22222 = kqtVar.a;
                                    yptVar22222.getClass();
                                    f2cVar2222.getClass();
                                    T = yptVar22222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p2222, z2);
                                    break;
                                case 5:
                                    bf7Var = new bf7(14);
                                    Intent intent222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p22222 = bf7Var.p(urlActivity2, intent222222, kqtVar);
                                    p22222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar22222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar222222 = kqtVar.a;
                                    yptVar222222.getClass();
                                    f2cVar22222.getClass();
                                    T = yptVar222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p22222, z2);
                                    break;
                                case 6:
                                    bf7Var = new zem(i29);
                                    Intent intent2222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p222222 = bf7Var.p(urlActivity2, intent2222222, kqtVar);
                                    p222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar2222222 = kqtVar.a;
                                    yptVar2222222.getClass();
                                    f2cVar222222.getClass();
                                    T = yptVar2222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p222222, z2);
                                    break;
                                case 7:
                                    bf7Var = new zem(8);
                                    Intent intent22222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p2222222 = bf7Var.p(urlActivity2, intent22222222, kqtVar);
                                    p2222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar2222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar22222222 = kqtVar.a;
                                    yptVar22222222.getClass();
                                    f2cVar2222222.getClass();
                                    T = yptVar22222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p2222222, z2);
                                    break;
                                case 8:
                                    bf7Var = new mka(r);
                                    Intent intent222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p22222222 = bf7Var.p(urlActivity2, intent222222222, kqtVar);
                                    p22222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar22222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar222222222 = kqtVar.a;
                                    yptVar222222222.getClass();
                                    f2cVar22222222.getClass();
                                    T = yptVar222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p22222222, z2);
                                    break;
                                case 9:
                                    bf7Var = new bf7(29);
                                    Intent intent2222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p222222222 = bf7Var.p(urlActivity2, intent2222222222, kqtVar);
                                    p222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar2222222222 = kqtVar.a;
                                    yptVar2222222222.getClass();
                                    f2cVar222222222.getClass();
                                    T = yptVar2222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p222222222, z2);
                                    break;
                                case 10:
                                    bf7Var = new bf7(28);
                                    Intent intent22222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p2222222222 = bf7Var.p(urlActivity2, intent22222222222, kqtVar);
                                    p2222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar2222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar22222222222 = kqtVar.a;
                                    yptVar22222222222.getClass();
                                    f2cVar2222222222.getClass();
                                    T = yptVar22222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p2222222222, z2);
                                    break;
                                case 11:
                                    bf7Var = new bf7(26);
                                    Intent intent222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p22222222222 = bf7Var.p(urlActivity2, intent222222222222, kqtVar);
                                    p22222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar22222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar222222222222 = kqtVar.a;
                                    yptVar222222222222.getClass();
                                    f2cVar22222222222.getClass();
                                    T = yptVar222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p22222222222, z2);
                                    break;
                                case 12:
                                    bf7Var = new bf7(21);
                                    Intent intent2222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p222222222222 = bf7Var.p(urlActivity2, intent2222222222222, kqtVar);
                                    p222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar2222222222222 = kqtVar.a;
                                    yptVar2222222222222.getClass();
                                    f2cVar222222222222.getClass();
                                    T = yptVar2222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p222222222222, z2);
                                    break;
                                case 13:
                                    bf7Var = new bf7(20);
                                    Intent intent22222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p2222222222222 = bf7Var.p(urlActivity2, intent22222222222222, kqtVar);
                                    p2222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar2222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar22222222222222 = kqtVar.a;
                                    yptVar22222222222222.getClass();
                                    f2cVar2222222222222.getClass();
                                    T = yptVar22222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p2222222222222, z2);
                                    break;
                                case 14:
                                    bf7Var = new zem(0);
                                    Intent intent222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p22222222222222 = bf7Var.p(urlActivity2, intent222222222222222, kqtVar);
                                    p22222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar22222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar222222222222222 = kqtVar.a;
                                    yptVar222222222222222.getClass();
                                    f2cVar22222222222222.getClass();
                                    T = yptVar222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p22222222222222, z2);
                                    break;
                                case 15:
                                    bf7Var = new zem(i32);
                                    Intent intent2222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p222222222222222 = bf7Var.p(urlActivity2, intent2222222222222222, kqtVar);
                                    p222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar2222222222222222 = kqtVar.a;
                                    yptVar2222222222222222.getClass();
                                    f2cVar222222222222222.getClass();
                                    T = yptVar2222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p222222222222222, z2);
                                    break;
                                case 16:
                                    bf7Var = new zem(5);
                                    Intent intent22222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p2222222222222222 = bf7Var.p(urlActivity2, intent22222222222222222, kqtVar);
                                    p2222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar2222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar22222222222222222 = kqtVar.a;
                                    yptVar22222222222222222.getClass();
                                    f2cVar2222222222222222.getClass();
                                    T = yptVar22222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p2222222222222222, z2);
                                    break;
                                case 17:
                                    bf7Var = new zem(2);
                                    Intent intent222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p22222222222222222 = bf7Var.p(urlActivity2, intent222222222222222222, kqtVar);
                                    p22222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar22222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar222222222222222222 = kqtVar.a;
                                    yptVar222222222222222222.getClass();
                                    f2cVar22222222222222222.getClass();
                                    T = yptVar222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p22222222222222222, z2);
                                    break;
                                case 18:
                                    bf7Var = new zem(12);
                                    Intent intent2222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p222222222222222222 = bf7Var.p(urlActivity2, intent2222222222222222222, kqtVar);
                                    p222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar2222222222222222222 = kqtVar.a;
                                    yptVar2222222222222222222.getClass();
                                    f2cVar222222222222222222.getClass();
                                    T = yptVar2222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p222222222222222222, z2);
                                    break;
                                case 19:
                                    bf7Var = new bf7(24);
                                    Intent intent22222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p2222222222222222222 = bf7Var.p(urlActivity2, intent22222222222222222222, kqtVar);
                                    p2222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar2222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar22222222222222222222 = kqtVar.a;
                                    yptVar22222222222222222222.getClass();
                                    f2cVar2222222222222222222.getClass();
                                    T = yptVar22222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p2222222222222222222, z2);
                                    break;
                                case 20:
                                    bf7Var = new bf7(i28);
                                    Intent intent222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p22222222222222222222 = bf7Var.p(urlActivity2, intent222222222222222222222, kqtVar);
                                    p22222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar22222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar222222222222222222222 = kqtVar.a;
                                    yptVar222222222222222222222.getClass();
                                    f2cVar22222222222222222222.getClass();
                                    T = yptVar222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p22222222222222222222, z2);
                                    break;
                                case 21:
                                    bf7Var = new zem(7);
                                    Intent intent2222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p222222222222222222222 = bf7Var.p(urlActivity2, intent2222222222222222222222, kqtVar);
                                    p222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar2222222222222222222222 = kqtVar.a;
                                    yptVar2222222222222222222222.getClass();
                                    f2cVar222222222222222222222.getClass();
                                    T = yptVar2222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p222222222222222222222, z2);
                                    break;
                                case 22:
                                    bf7Var = bf7.b;
                                    Intent intent22222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p2222222222222222222222 = bf7Var.p(urlActivity2, intent22222222222222222222222, kqtVar);
                                    p2222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar2222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar22222222222222222222222 = kqtVar.a;
                                    yptVar22222222222222222222222.getClass();
                                    f2cVar2222222222222222222222.getClass();
                                    T = yptVar22222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p2222222222222222222222, z2);
                                    break;
                                case 23:
                                    bf7Var = new zem(z4 ? 1 : 0);
                                    Intent intent222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p22222222222222222222222 = bf7Var.p(urlActivity2, intent222222222222222222222222, kqtVar);
                                    p22222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar22222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar222222222222222222222222 = kqtVar.a;
                                    yptVar222222222222222222222222.getClass();
                                    f2cVar22222222222222222222222.getClass();
                                    T = yptVar222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p22222222222222222222222, z2);
                                    break;
                                case 24:
                                    bf7Var = new bf7(i4);
                                    Intent intent2222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p222222222222222222222222 = bf7Var.p(urlActivity2, intent2222222222222222222222222, kqtVar);
                                    p222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar2222222222222222222222222 = kqtVar.a;
                                    yptVar2222222222222222222222222.getClass();
                                    f2cVar222222222222222222222222.getClass();
                                    T = yptVar2222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p222222222222222222222222, z2);
                                    break;
                                case 25:
                                    bf7Var = new bf7(4);
                                    Intent intent22222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p2222222222222222222222222 = bf7Var.p(urlActivity2, intent22222222222222222222222222, kqtVar);
                                    p2222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar2222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar22222222222222222222222222 = kqtVar.a;
                                    yptVar22222222222222222222222222.getClass();
                                    f2cVar2222222222222222222222222.getClass();
                                    T = yptVar22222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p2222222222222222222222222, z2);
                                    break;
                                case 26:
                                    bf7Var = new bf7(i5);
                                    Intent intent222222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p22222222222222222222222222 = bf7Var.p(urlActivity2, intent222222222222222222222222222, kqtVar);
                                    p22222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar22222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar222222222222222222222222222 = kqtVar.a;
                                    yptVar222222222222222222222222222.getClass();
                                    f2cVar22222222222222222222222222.getClass();
                                    T = yptVar222222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p22222222222222222222222222, z2);
                                    break;
                                case 27:
                                    bf7Var = new zem(4);
                                    Intent intent2222222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p222222222222222222222222222 = bf7Var.p(urlActivity2, intent2222222222222222222222222222, kqtVar);
                                    p222222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar222222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar2222222222222222222222222222 = kqtVar.a;
                                    yptVar2222222222222222222222222222.getClass();
                                    f2cVar222222222222222222222222222.getClass();
                                    T = yptVar2222222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p222222222222222222222222222, z2);
                                    break;
                                case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                    bf7Var = new zem(3);
                                    Intent intent22222222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p2222222222222222222222222222 = bf7Var.p(urlActivity2, intent22222222222222222222222222222, kqtVar);
                                    p2222222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar2222222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar22222222222222222222222222222 = kqtVar.a;
                                    yptVar22222222222222222222222222222.getClass();
                                    f2cVar2222222222222222222222222222.getClass();
                                    T = yptVar22222222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p2222222222222222222222222222, z2);
                                    break;
                                case 29:
                                    bf7Var = new bf7(i30);
                                    Intent intent222222222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p22222222222222222222222222222 = bf7Var.p(urlActivity2, intent222222222222222222222222222222, kqtVar);
                                    p22222222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar22222222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar222222222222222222222222222222 = kqtVar.a;
                                    yptVar222222222222222222222222222222.getClass();
                                    f2cVar22222222222222222222222222222.getClass();
                                    T = yptVar222222222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p22222222222222222222222222222, z2);
                                    break;
                                case 30:
                                    bf7Var = new bf7(5);
                                    Intent intent2222222222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p222222222222222222222222222222 = bf7Var.p(urlActivity2, intent2222222222222222222222222222222, kqtVar);
                                    p222222222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar222222222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar2222222222222222222222222222222 = kqtVar.a;
                                    yptVar2222222222222222222222222222222.getClass();
                                    f2cVar222222222222222222222222222222.getClass();
                                    T = yptVar2222222222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p222222222222222222222222222222, z2);
                                    break;
                                case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                                    bf7Var = new bf7(5);
                                    Intent intent22222222222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p2222222222222222222222222222222 = bf7Var.p(urlActivity2, intent22222222222222222222222222222222, kqtVar);
                                    p2222222222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar2222222222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar22222222222222222222222222222222 = kqtVar.a;
                                    yptVar22222222222222222222222222222222.getClass();
                                    f2cVar2222222222222222222222222222222.getClass();
                                    T = yptVar22222222222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p2222222222222222222222222222222, z2);
                                    break;
                                case 32:
                                    bf7Var = new bf7(12);
                                    Intent intent222222222222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p22222222222222222222222222222222 = bf7Var.p(urlActivity2, intent222222222222222222222222222222222, kqtVar);
                                    p22222222222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar22222222222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar222222222222222222222222222222222 = kqtVar.a;
                                    yptVar222222222222222222222222222222222.getClass();
                                    f2cVar22222222222222222222222222222222.getClass();
                                    T = yptVar222222222222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p22222222222222222222222222222222, z2);
                                    break;
                                case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                                    bf7Var = new o(2);
                                    Intent intent2222222222222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p222222222222222222222222222222222 = bf7Var.p(urlActivity2, intent2222222222222222222222222222222222, kqtVar);
                                    p222222222222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar222222222222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar2222222222222222222222222222222222 = kqtVar.a;
                                    yptVar2222222222222222222222222222222222.getClass();
                                    f2cVar222222222222222222222222222222222.getClass();
                                    T = yptVar2222222222222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p222222222222222222222222222222222, z2);
                                    break;
                                case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                                    bf7Var = new bf7(22);
                                    Intent intent22222222222222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p2222222222222222222222222222222222 = bf7Var.p(urlActivity2, intent22222222222222222222222222222222222, kqtVar);
                                    p2222222222222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar2222222222222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar22222222222222222222222222222222222 = kqtVar.a;
                                    yptVar22222222222222222222222222222222222.getClass();
                                    f2cVar2222222222222222222222222222222222.getClass();
                                    T = yptVar22222222222222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p2222222222222222222222222222222222, z2);
                                    break;
                                case 35:
                                    bf7Var = new zem(i33);
                                    Intent intent222222222222222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p22222222222222222222222222222222222 = bf7Var.p(urlActivity2, intent222222222222222222222222222222222222, kqtVar);
                                    p22222222222222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar22222222222222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar222222222222222222222222222222222222 = kqtVar.a;
                                    yptVar222222222222222222222222222222222222.getClass();
                                    f2cVar22222222222222222222222222222222222.getClass();
                                    T = yptVar222222222222222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p22222222222222222222222222222222222, z2);
                                    break;
                                case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                                    bf7Var = new bf7(8);
                                    Intent intent2222222222222222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p222222222222222222222222222222222222 = bf7Var.p(urlActivity2, intent2222222222222222222222222222222222222, kqtVar);
                                    p222222222222222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar222222222222222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar2222222222222222222222222222222222222 = kqtVar.a;
                                    yptVar2222222222222222222222222222222222222.getClass();
                                    f2cVar222222222222222222222222222222222222.getClass();
                                    T = yptVar2222222222222222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p222222222222222222222222222222222222, z2);
                                    break;
                                case 37:
                                    bf7Var = new bf7(7);
                                    Intent intent22222222222222222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p2222222222222222222222222222222222222 = bf7Var.p(urlActivity2, intent22222222222222222222222222222222222222, kqtVar);
                                    p2222222222222222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar2222222222222222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar22222222222222222222222222222222222222 = kqtVar.a;
                                    yptVar22222222222222222222222222222222222222.getClass();
                                    f2cVar2222222222222222222222222222222222222.getClass();
                                    T = yptVar22222222222222222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p2222222222222222222222222222222222222, z2);
                                    break;
                                case 38:
                                    bf7Var = new hs4(26);
                                    Intent intent222222222222222222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p22222222222222222222222222222222222222 = bf7Var.p(urlActivity2, intent222222222222222222222222222222222222222, kqtVar);
                                    p22222222222222222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar22222222222222222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar222222222222222222222222222222222222222 = kqtVar.a;
                                    yptVar222222222222222222222222222222222222222.getClass();
                                    f2cVar22222222222222222222222222222222222222.getClass();
                                    T = yptVar222222222222222222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p22222222222222222222222222222222222222, z2);
                                    break;
                                case 39:
                                    bf7Var = new bf7(23);
                                    Intent intent2222222222222222222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p222222222222222222222222222222222222222 = bf7Var.p(urlActivity2, intent2222222222222222222222222222222222222222, kqtVar);
                                    p222222222222222222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar222222222222222222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar2222222222222222222222222222222222222222 = kqtVar.a;
                                    yptVar2222222222222222222222222222222222222222.getClass();
                                    f2cVar222222222222222222222222222222222222222.getClass();
                                    T = yptVar2222222222222222222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p222222222222222222222222222222222222222, z2);
                                    break;
                                case 40:
                                    bf7Var = new bf7(3);
                                    Intent intent22222222222222222222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p2222222222222222222222222222222222222222 = bf7Var.p(urlActivity2, intent22222222222222222222222222222222222222222, kqtVar);
                                    p2222222222222222222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar2222222222222222222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar22222222222222222222222222222222222222222 = kqtVar.a;
                                    yptVar22222222222222222222222222222222222222222.getClass();
                                    f2cVar2222222222222222222222222222222222222222.getClass();
                                    T = yptVar22222222222222222222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p2222222222222222222222222222222222222222, z2);
                                    break;
                                case 41:
                                    bf7Var = new zem(i34);
                                    Intent intent222222222222222222222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p22222222222222222222222222222222222222222 = bf7Var.p(urlActivity2, intent222222222222222222222222222222222222222222, kqtVar);
                                    p22222222222222222222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar22222222222222222222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar222222222222222222222222222222222222222222 = kqtVar.a;
                                    yptVar222222222222222222222222222222222222222222.getClass();
                                    f2cVar22222222222222222222222222222222222222222.getClass();
                                    T = yptVar222222222222222222222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p22222222222222222222222222222222222222222, z2);
                                    break;
                                case 42:
                                    bf7Var = new zem(14);
                                    Intent intent2222222222222222222222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p222222222222222222222222222222222222222222 = bf7Var.p(urlActivity2, intent2222222222222222222222222222222222222222222, kqtVar);
                                    p222222222222222222222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar222222222222222222222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar2222222222222222222222222222222222222222222 = kqtVar.a;
                                    yptVar2222222222222222222222222222222222222222222.getClass();
                                    f2cVar222222222222222222222222222222222222222222.getClass();
                                    T = yptVar2222222222222222222222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p222222222222222222222222222222222222222222, z2);
                                    break;
                                case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                                    bf7Var = new bf7(i2);
                                    Intent intent22222222222222222222222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p2222222222222222222222222222222222222222222 = bf7Var.p(urlActivity2, intent22222222222222222222222222222222222222222222, kqtVar);
                                    p2222222222222222222222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar2222222222222222222222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar22222222222222222222222222222222222222222222 = kqtVar.a;
                                    yptVar22222222222222222222222222222222222222222222.getClass();
                                    f2cVar2222222222222222222222222222222222222222222.getClass();
                                    T = yptVar22222222222222222222222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p2222222222222222222222222222222222222222222, z2);
                                    break;
                                case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                                    bf7Var = new bf7(18);
                                    Intent intent222222222222222222222222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p22222222222222222222222222222222222222222222 = bf7Var.p(urlActivity2, intent222222222222222222222222222222222222222222222, kqtVar);
                                    p22222222222222222222222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar22222222222222222222222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar222222222222222222222222222222222222222222222 = kqtVar.a;
                                    yptVar222222222222222222222222222222222222222222222.getClass();
                                    f2cVar22222222222222222222222222222222222222222222.getClass();
                                    T = yptVar222222222222222222222222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p22222222222222222222222222222222222222222222, z2);
                                    break;
                                case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                                    bf7Var = new zem(i28);
                                    Intent intent2222222222222222222222222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p222222222222222222222222222222222222222222222 = bf7Var.p(urlActivity2, intent2222222222222222222222222222222222222222222222, kqtVar);
                                    p222222222222222222222222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar222222222222222222222222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar2222222222222222222222222222222222222222222222 = kqtVar.a;
                                    yptVar2222222222222222222222222222222222222222222222.getClass();
                                    f2cVar222222222222222222222222222222222222222222222.getClass();
                                    T = yptVar2222222222222222222222222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p222222222222222222222222222222222222222222222, z2);
                                    break;
                                case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                                    bf7Var = new zem(i31);
                                    Intent intent22222222222222222222222222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p2222222222222222222222222222222222222222222222 = bf7Var.p(urlActivity2, intent22222222222222222222222222222222222222222222222, kqtVar);
                                    p2222222222222222222222222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar2222222222222222222222222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar22222222222222222222222222222222222222222222222 = kqtVar.a;
                                    yptVar22222222222222222222222222222222222222222222222.getClass();
                                    f2cVar2222222222222222222222222222222222222222222222.getClass();
                                    T = yptVar22222222222222222222222222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p2222222222222222222222222222222222222222222222, z2);
                                    break;
                                case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                                    bf7Var = new bf7(i3);
                                    Intent intent222222222222222222222222222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p22222222222222222222222222222222222222222222222 = bf7Var.p(urlActivity2, intent222222222222222222222222222222222222222222222222, kqtVar);
                                    p22222222222222222222222222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar22222222222222222222222222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar222222222222222222222222222222222222222222222222 = kqtVar.a;
                                    yptVar222222222222222222222222222222222222222222222222.getClass();
                                    f2cVar22222222222222222222222222222222222222222222222.getClass();
                                    T = yptVar222222222222222222222222222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p22222222222222222222222222222222222222222222222, z2);
                                    break;
                                case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                                    bf7Var = new bf7(i29);
                                    Intent intent2222222222222222222222222222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p222222222222222222222222222222222222222222222222 = bf7Var.p(urlActivity2, intent2222222222222222222222222222222222222222222222222, kqtVar);
                                    p222222222222222222222222222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar222222222222222222222222222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar2222222222222222222222222222222222222222222222222 = kqtVar.a;
                                    yptVar2222222222222222222222222222222222222222222222222.getClass();
                                    f2cVar222222222222222222222222222222222222222222222222.getClass();
                                    T = yptVar2222222222222222222222222222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p222222222222222222222222222222222222222222222222, z2);
                                    break;
                                case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                                    bf7Var = new zem(i4);
                                    Intent intent22222222222222222222222222222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p2222222222222222222222222222222222222222222222222 = bf7Var.p(urlActivity2, intent22222222222222222222222222222222222222222222222222, kqtVar);
                                    p2222222222222222222222222222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar2222222222222222222222222222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar22222222222222222222222222222222222222222222222222 = kqtVar.a;
                                    yptVar22222222222222222222222222222222222222222222222222.getClass();
                                    f2cVar2222222222222222222222222222222222222222222222222.getClass();
                                    T = yptVar22222222222222222222222222222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p2222222222222222222222222222222222222222222222222, z2);
                                    break;
                                case 50:
                                    bf7Var = new zem(i30);
                                    Intent intent222222222222222222222222222222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p22222222222222222222222222222222222222222222222222 = bf7Var.p(urlActivity2, intent222222222222222222222222222222222222222222222222222, kqtVar);
                                    p22222222222222222222222222222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar22222222222222222222222222222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar222222222222222222222222222222222222222222222222222 = kqtVar.a;
                                    yptVar222222222222222222222222222222222222222222222222222.getClass();
                                    f2cVar22222222222222222222222222222222222222222222222222.getClass();
                                    T = yptVar222222222222222222222222222222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p22222222222222222222222222222222222222222222222222, z2);
                                    break;
                                case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                                    bf7Var = new bf7(19);
                                    Intent intent2222222222222222222222222222222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p222222222222222222222222222222222222222222222222222 = bf7Var.p(urlActivity2, intent2222222222222222222222222222222222222222222222222222, kqtVar);
                                    p222222222222222222222222222222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar222222222222222222222222222222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar2222222222222222222222222222222222222222222222222222 = kqtVar.a;
                                    yptVar2222222222222222222222222222222222222222222222222222.getClass();
                                    f2cVar222222222222222222222222222222222222222222222222222.getClass();
                                    T = yptVar2222222222222222222222222222222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p222222222222222222222222222222222222222222222222222, z2);
                                    break;
                                case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                                    bf7Var = new bf7(i31);
                                    Intent intent22222222222222222222222222222222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p2222222222222222222222222222222222222222222222222222 = bf7Var.p(urlActivity2, intent22222222222222222222222222222222222222222222222222222, kqtVar);
                                    p2222222222222222222222222222222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar2222222222222222222222222222222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar22222222222222222222222222222222222222222222222222222 = kqtVar.a;
                                    yptVar22222222222222222222222222222222222222222222222222222.getClass();
                                    f2cVar2222222222222222222222222222222222222222222222222222.getClass();
                                    T = yptVar22222222222222222222222222222222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p2222222222222222222222222222222222222222222222222222, z2);
                                    break;
                                case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                                    bf7Var = new bx5(1);
                                    Intent intent222222222222222222222222222222222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p22222222222222222222222222222222222222222222222222222 = bf7Var.p(urlActivity2, intent222222222222222222222222222222222222222222222222222222, kqtVar);
                                    p22222222222222222222222222222222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar22222222222222222222222222222222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar222222222222222222222222222222222222222222222222222222 = kqtVar.a;
                                    yptVar222222222222222222222222222222222222222222222222222222.getClass();
                                    f2cVar22222222222222222222222222222222222222222222222222222.getClass();
                                    T = yptVar222222222222222222222222222222222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p22222222222222222222222222222222222222222222222222222, z2);
                                    break;
                                case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                                    bf7Var = new bf7(i32);
                                    Intent intent2222222222222222222222222222222222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p222222222222222222222222222222222222222222222222222222 = bf7Var.p(urlActivity2, intent2222222222222222222222222222222222222222222222222222222, kqtVar);
                                    p222222222222222222222222222222222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar222222222222222222222222222222222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar2222222222222222222222222222222222222222222222222222222 = kqtVar.a;
                                    yptVar2222222222222222222222222222222222222222222222222222222.getClass();
                                    f2cVar222222222222222222222222222222222222222222222222222222.getClass();
                                    T = yptVar2222222222222222222222222222222222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p222222222222222222222222222222222222222222222222222222, z2);
                                    break;
                                case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                                    bf7Var = new bf7(i33);
                                    Intent intent22222222222222222222222222222222222222222222222222222222 = new Intent("android.intent.action.VIEW", kqtVar.a.m());
                                    intent = urlActivity2.getIntent();
                                    intent.getClass();
                                    if (intent.getBooleanExtra("extraFromUrlScheme", false)) {
                                    }
                                    Intent p2222222222222222222222222222222222222222222222222222222 = bf7Var.p(urlActivity2, intent22222222222222222222222222222222222222222222222222222222, kqtVar);
                                    p2222222222222222222222222222222222222222222222222222222.getClass();
                                    if (kqtVar.c == 1) {
                                    }
                                    if (kqtVar.a.getType() != euo.D) {
                                    }
                                    if (!z2) {
                                    }
                                    f2c f2cVar2222222222222222222222222222222222222222222222222222222 = (f2c) urlActivity2.A.getValue();
                                    ypt yptVar22222222222222222222222222222222222222222222222222222222 = kqtVar.a;
                                    yptVar22222222222222222222222222222222222222222222222222222222.getClass();
                                    f2cVar2222222222222222222222222222222222222222222222222222222.getClass();
                                    T = yptVar22222222222222222222222222222222222222222222222222222222.T();
                                    if (!(T instanceof aqt)) {
                                    }
                                    urlActivity2.B(p2222222222222222222222222222222222222222222222222222222, z2);
                                    break;
                                default:
                                    b6e.s();
                                    return null;
                            }
                        }
                        return Unit.a;
                    }
                    qgg.h0(obj);
                    z = obj;
                }
                dq7 dq7Var = dm6.c;
                h0t h0tVar = new h0t((UrlActivity) this.l, (cuo) z, continuation, i26);
                this.k = 2;
                V = x97.V(dq7Var, h0tVar, this);
                break;
            case 19:
                hxu hxuVar = (hxu) this.m;
                nm6 nm6Var19 = nm6.a;
                int i35 = this.k;
                if (i35 != 0) {
                    if (i35 == 1) {
                        qgg.h0(obj);
                        f2 = obj;
                        return (qxu) f2;
                    }
                    if (i35 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    f = obj;
                    return (qxu) f;
                }
                qgg.h0(obj);
                s9p s9pVar = (s9p) this.l;
                if (s9pVar != null) {
                    u4v u4vVar = new u4v(s9pVar, hxuVar.i);
                    eu7 eu7Var = hxuVar.a;
                    this.k = 1;
                    f2 = hxu.f(hxuVar, eu7Var, u4vVar, this);
                    break;
                } else {
                    eu7 eu7Var2 = hxuVar.a;
                    v4v h = hxu.h(hxuVar, (a5q) hxuVar.b);
                    this.k = 2;
                    f = hxu.f(hxuVar, eu7Var2, h, this);
                    break;
                }
                return nm6Var19;
            case 20:
                nm6 nm6Var20 = nm6.a;
                int i36 = this.k;
                if (i36 != 0) {
                    if (i36 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                Function2 function2 = (Function2) this.l;
                b9n b9nVar = ((akw) this.m).c.a;
                this.k = 1;
                Object invoke2 = function2.invoke(b9nVar, this);
                return invoke2 == nm6Var20 ? nm6Var20 : invoke2;
            case 21:
                nm6 nm6Var21 = nm6.a;
                int i37 = this.k;
                if (i37 == 0) {
                    qgg.h0(obj);
                    v vVar = (v) this.l;
                    y yVar = (y) ((o0) this.m);
                    this.k = 1;
                    Object c2 = v.c(vVar, yVar, this);
                    if (c2 == nm6Var21) {
                        return nm6Var21;
                    }
                    obj2 = c2;
                } else {
                    if (i37 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    obj2 = ((b) obj).a;
                }
                return new b((String) obj2);
            case 22:
                nm6 nm6Var22 = nm6.a;
                int i38 = this.k;
                if (i38 != 0) {
                    if (i38 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                dp0 dp0Var = (dp0) this.l;
                jqi jqiVar = (jqi) this.m;
                dp0Var.getClass();
                gs4 gs4Var = new gs4(dp0Var, jqiVar);
                this.k = 1;
                Object p3 = gs4Var.p(this);
                return p3 == nm6Var22 ? nm6Var22 : p3;
            default:
                nm6 nm6Var23 = nm6.a;
                int i39 = this.k;
                if (i39 != 0) {
                    if (i39 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                dp0 dp0Var2 = (dp0) this.l;
                s6n s6nVar = (s6n) this.m;
                dp0Var2.getClass();
                s6nVar.getClass();
                gs4 gs4Var2 = new gs4(dp0Var2, s6nVar);
                this.k = 1;
                Object p4 = gs4Var2.p(this);
                return p4 == nm6Var23 ? nm6Var23 : p4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w90(ueo ueoVar, Continuation continuation, lxs lxsVar) {
        super(1, continuation);
        this.j = 11;
        this.l = ueoVar;
        this.m = lxsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w90(ja0 ja0Var, pyc pycVar, Continuation continuation) {
        super(1, continuation);
        this.j = 1;
        this.l = ja0Var;
        this.m = (aur) pycVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w90(Object obj, Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }
}
