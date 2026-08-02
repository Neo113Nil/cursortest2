package ru.yandex.taxi.persuggest.source;

import android.os.SystemClock;
import defpackage.d2t;
import defpackage.i4v0;
import defpackage.ir3;
import defpackage.k4v0;
import defpackage.ksw;
import defpackage.m6r;
import defpackage.mdh;
import defpackage.ms2;
import defpackage.ny61;
import defpackage.p0t;
import defpackage.q6r;
import defpackage.q9j0;
import defpackage.sjh;
import defpackage.sta0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.u6r;
import defpackage.uyj;
import defpackage.v5v0;
import defpackage.w6r;
import defpackage.yiq0;
import defpackage.z7l0;
import defpackage.zet0;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.perf.Milestone;
import ru.yandex.taxi.perf.screen.ScreenEndpoint;
import ru.yandex.taxi.persuggest.api.finalsuggest.Action;

/* loaded from: classes9.dex */
public final class c {
    public final ru.yandex.taxi.persuggest.api.a a;
    public final sta0 b;
    public final v5v0 c;
    public final tt2 d;
    public final a e;
    public final ms2 f;
    public final zet0 g;
    public final q9j0 h;
    public final m6r i;
    public final yiq0 j;
    public final w6r k;
    public final k4v0 l;
    public final ru.yandex.taxi.perf.screen.c m;
    public final ir3 n;
    public final ConcurrentHashMap o = new ConcurrentHashMap();

    public c(ru.yandex.taxi.persuggest.api.a aVar, sta0 sta0Var, v5v0 v5v0Var, tt2 tt2Var, a aVar2, ms2 ms2Var, zet0 zet0Var, q9j0 q9j0Var, m6r m6rVar, yiq0 yiq0Var, w6r w6rVar, k4v0 k4v0Var, ru.yandex.taxi.perf.screen.c cVar, ir3 ir3Var) {
        this.a = aVar;
        this.b = sta0Var;
        this.c = v5v0Var;
        this.d = tt2Var;
        this.e = aVar2;
        this.f = ms2Var;
        this.g = zet0Var;
        this.h = q9j0Var;
        this.i = m6rVar;
        this.j = yiq0Var;
        this.k = w6rVar;
        this.l = k4v0Var;
        this.m = cVar;
        this.n = ir3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, q6r q6rVar, boolean z, p0t p0tVar, ContinuationImpl continuationImpl) {
        FinalSuggestRepositoryImpl$requestFinalSuggest$1 finalSuggestRepositoryImpl$requestFinalSuggest$1;
        int i;
        boolean z2;
        long j;
        cVar.getClass();
        if (continuationImpl instanceof FinalSuggestRepositoryImpl$requestFinalSuggest$1) {
            finalSuggestRepositoryImpl$requestFinalSuggest$1 = (FinalSuggestRepositoryImpl$requestFinalSuggest$1) continuationImpl;
            int i2 = finalSuggestRepositoryImpl$requestFinalSuggest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                finalSuggestRepositoryImpl$requestFinalSuggest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = finalSuggestRepositoryImpl$requestFinalSuggest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = finalSuggestRepositoryImpl$requestFinalSuggest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    ru.yandex.taxi.persuggest.api.a aVar = cVar.a;
                    String a = cVar.b.a();
                    finalSuggestRepositoryImpl$requestFinalSuggest$1.L$0 = null;
                    finalSuggestRepositoryImpl$requestFinalSuggest$1.L$1 = null;
                    finalSuggestRepositoryImpl$requestFinalSuggest$1.Z$0 = z;
                    finalSuggestRepositoryImpl$requestFinalSuggest$1.J$0 = elapsedRealtime;
                    finalSuggestRepositoryImpl$requestFinalSuggest$1.label = 1;
                    obj = aVar.c(a, q6rVar, p0tVar, finalSuggestRepositoryImpl$requestFinalSuggest$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    z2 = z;
                    j = elapsedRealtime;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = finalSuggestRepositoryImpl$requestFinalSuggest$1.J$0;
                    z2 = finalSuggestRepositoryImpl$requestFinalSuggest$1.Z$0;
                    kotlin.b.b(obj);
                }
                u6r u6rVar = (u6r) obj;
                if (z2) {
                    ru.yandex.taxi.perf.screen.c cVar2 = cVar.m;
                    ScreenEndpoint screenEndpoint = ScreenEndpoint.FinalSuggest;
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - j;
                    String str = u6rVar.n;
                    if (str == null) {
                        str = "";
                    }
                    cVar2.e(screenEndpoint, elapsedRealtime2, str);
                }
                return obj;
            }
        }
        finalSuggestRepositoryImpl$requestFinalSuggest$1 = new FinalSuggestRepositoryImpl$requestFinalSuggest$1(cVar, continuationImpl);
        Object obj2 = finalSuggestRepositoryImpl$requestFinalSuggest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = finalSuggestRepositoryImpl$requestFinalSuggest$1.label;
        if (i != 0) {
        }
        u6r u6rVar2 = (u6r) obj2;
        if (z2) {
        }
        return obj2;
    }

    public static /* synthetic */ Object c(c cVar, Action action, d2t d2tVar, i4v0 i4v0Var, SuspendLambda suspendLambda, int i) {
        if ((i & 4) != 0) {
            i4v0Var = null;
        }
        return cVar.b(action, d2tVar, i4v0Var, null, suspendLambda);
    }

    public final Object b(Action action, d2t d2tVar, i4v0 i4v0Var, Float f, SuspendLambda suspendLambda) {
        this.d.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new FinalSuggestRepositoryImpl$request$2(d2tVar, this, f, action, i4v0Var, null), suspendLambda);
    }

    public final void d(z7l0 z7l0Var, u6r u6rVar) {
        List list = u6rVar.c;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        this.f.a(Milestone.Suggest);
        String str = ((ksw) kotlin.collections.a.P(list)).b;
        if (str != null) {
            this.c.a.put(z7l0Var.getType(), str);
        }
    }
}
