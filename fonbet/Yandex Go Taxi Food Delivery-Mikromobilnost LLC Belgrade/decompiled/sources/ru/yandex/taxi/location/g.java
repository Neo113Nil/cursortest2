package ru.yandex.taxi.location;

import android.location.Location;
import defpackage.ck;
import defpackage.eci0;
import defpackage.f8y;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.h3y;
import defpackage.hbp0;
import defpackage.i3y;
import defpackage.jqr;
import defpackage.mse;
import defpackage.ny61;
import defpackage.o400;
import defpackage.on2;
import defpackage.q7y;
import defpackage.sjh;
import defpackage.sls;
import defpackage.t3u;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v551;
import defpackage.wsr0;
import defpackage.xsr0;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.analytics.n;
import ru.yandex.taxi.analytics.o;
import ru.yandex.taxi.analytics.p;

/* loaded from: classes9.dex */
public final class g implements f8y {
    public final v551 a;
    public final q7y b;
    public final a c;
    public final t3u d;
    public final ru.yandex.taxi.location.lbs.b e;
    public final ru.yandex.taxi.location.lbs.gsm.a f;
    public final p g;
    public final ru.yandex.taxi.location.lbs.wifi.a h;
    public final h3y i;
    public final tt2 j;
    public final n k;
    public final o l;
    public final i3y m;
    public volatile Location o;
    public eci0 q;
    public final i3y n = kotlin.a.a(new sls() { // from class: ru.yandex.taxi.location.b
        @Override // defpackage.sls
        public final Object invoke() {
            g gVar = g.this;
            hbp0 hbp0Var = new hbp0(new LbsProviderImpl$scope$2$1(0, gVar.j, tt2.class, "io", "io()Lkotlinx/coroutines/CoroutineDispatcher;", 0), "LbsProvider", (mse) gVar.b.a.getValue());
            hbp0Var.a();
            return hbp0Var;
        }
    });
    public final ConcurrentHashMap p = new ConcurrentHashMap();
    public final kotlinx.coroutines.sync.a r = gtq0.a();

    public g(on2 on2Var, v551 v551Var, q7y q7yVar, a aVar, t3u t3uVar, ru.yandex.taxi.location.lbs.b bVar, ru.yandex.taxi.location.lbs.gsm.a aVar2, p pVar, ru.yandex.taxi.location.lbs.wifi.a aVar3, h3y h3yVar, tt2 tt2Var, n nVar, o oVar) {
        this.a = v551Var;
        this.b = q7yVar;
        this.c = aVar;
        this.d = t3uVar;
        this.e = bVar;
        this.f = aVar2;
        this.g = pVar;
        this.h = aVar3;
        this.i = h3yVar;
        this.j = tt2Var;
        this.k = nVar;
        this.l = oVar;
        this.m = kotlin.a.a(new ck(on2Var, 12));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v13 java.util.List<android.telephony.CellInfo>, still in use, count: 1, list:
          (r11v13 java.util.List<android.telephony.CellInfo>) from 0x00a4: INVOKE (r11v15 java.util.Iterator) = (r11v13 java.util.List<android.telephony.CellInfo>) INTERFACE call: java.lang.Iterable.iterator():java.util.Iterator A[MD:():java.util.Iterator<T> (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.simplifyMoveInsns(CodeShrinkVisitor.java:289)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.processForceInlineInsns(RegionMakerVisitor.java:43)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:29)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(ru.yandex.taxi.location.g r8, java.lang.String r9, java.util.List r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.yandex.taxi.location.g.a(ru.yandex.taxi.location.g, java.lang.String, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0054 A[Catch: all -> 0x00a6, TRY_LEAVE, TryCatch #0 {all -> 0x00a6, blocks: (B:11:0x0050, B:13:0x0054, B:17:0x00a8), top: B:10:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a8 A[Catch: all -> 0x00a6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00a6, blocks: (B:11:0x0050, B:13:0x0054, B:17:0x00a8), top: B:10:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r5v6, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object b(g gVar, String str, ContinuationImpl continuationImpl) {
        LbsProviderImpl$locationUpdatesFromLbs$1 lbsProviderImpl$locationUpdatesFromLbs$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        eci0 eci0Var;
        try {
            if (continuationImpl instanceof LbsProviderImpl$locationUpdatesFromLbs$1) {
                lbsProviderImpl$locationUpdatesFromLbs$1 = (LbsProviderImpl$locationUpdatesFromLbs$1) continuationImpl;
                int i2 = lbsProviderImpl$locationUpdatesFromLbs$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lbsProviderImpl$locationUpdatesFromLbs$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = lbsProviderImpl$locationUpdatesFromLbs$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = lbsProviderImpl$locationUpdatesFromLbs$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = gVar.r;
                        lbsProviderImpl$locationUpdatesFromLbs$1.L$0 = gVar;
                        lbsProviderImpl$locationUpdatesFromLbs$1.L$1 = str;
                        lbsProviderImpl$locationUpdatesFromLbs$1.L$2 = aVar;
                        lbsProviderImpl$locationUpdatesFromLbs$1.label = 1;
                        if (aVar.a(lbsProviderImpl$locationUpdatesFromLbs$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r5 = (g050) lbsProviderImpl$locationUpdatesFromLbs$1.L$2;
                        str = (String) lbsProviderImpl$locationUpdatesFromLbs$1.L$1;
                        g gVar2 = (g) lbsProviderImpl$locationUpdatesFromLbs$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r5;
                        gVar = gVar2;
                    }
                    eci0Var = gVar.q;
                    if (eci0Var == null) {
                        return new k(com.yandex.go.coroutines.b.d(eci0Var, new LbsProviderImpl$locationUpdatesFromLbs$2$1(gVar, str, null)), new LbsProviderImpl$locationUpdatesFromLbs$2$2(gVar, str, null));
                    }
                    eci0 O = kotlinx.coroutines.flow.e.O(com.yandex.go.coroutines.b.c(com.yandex.go.coroutines.b.d(com.yandex.go.coroutines.b.d(com.yandex.go.coroutines.b.f(new kotlinx.coroutines.flow.o(gVar.c(gVar.h.a()), new LbsProviderImpl$locationUpdatesFromLbs$2$resultFlow$1$1(gVar, null)), new LbsProviderImpl$locationUpdatesFromLbs$2$resultFlow$1$2(gVar, null)), new LbsProviderImpl$locationUpdatesFromLbs$2$resultFlow$1$3(gVar, null)), new LbsProviderImpl$locationUpdatesFromLbs$2$resultFlow$1$4(gVar, null)), new LbsProviderImpl$locationUpdatesFromLbs$2$resultFlow$1$5(gVar, null)), (hbp0) gVar.n.getValue(), wsr0.a(xsr0.a, 3), 0);
                    gVar.q = O;
                    return O;
                }
            }
            eci0Var = gVar.q;
            if (eci0Var == null) {
            }
        } finally {
            aVar.d(null);
        }
        lbsProviderImpl$locationUpdatesFromLbs$1 = new LbsProviderImpl$locationUpdatesFromLbs$1(gVar, continuationImpl);
        Object obj2 = lbsProviderImpl$locationUpdatesFromLbs$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lbsProviderImpl$locationUpdatesFromLbs$1.label;
        if (i != 0) {
        }
    }

    public final jqr c(r0 r0Var) {
        a aVar = this.c;
        String b = aVar.a.b();
        String a = aVar.a.a();
        int i = 3;
        tpr d = com.yandex.go.coroutines.b.d(new jqr(new f(kotlinx.coroutines.flow.e.T(new d(r0Var, this), 1), this), new LbsProviderImpl$requestLocation$3(this, null), i), new LbsProviderImpl$requestLocation$4(this, null));
        this.j.getClass();
        sjh sjhVar = uyj.a;
        return new jqr(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.F(d, o400.a), new LbsProviderImpl$requestLocation$$inlined$flatMapLatest$1(null, this, b, a)), new LbsProviderImpl$requestLocation$6(this, null), i);
    }
}
