package ru.yandex.taxi.preorder.source.domain;

import defpackage.dd61;
import defpackage.dqe0;
import defpackage.i6j0;
import defpackage.ny61;
import defpackage.nzb0;
import defpackage.pv0;
import defpackage.pzt0;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class w {
    public final nzb0 a;
    public final dqe0 b;
    public final com.yandex.go.route.interactor.c c;
    public final com.yandex.go.route.interactor.b d;
    public final ru.yandex.taxi.preorder.source.sourcepointzone.a e;
    public final i6j0 f;
    public pzt0 g;

    public w(nzb0 nzb0Var, dqe0 dqe0Var, com.yandex.go.route.interactor.c cVar, com.yandex.go.route.interactor.b bVar, ru.yandex.taxi.preorder.source.sourcepointzone.a aVar, i6j0 i6j0Var) {
        this.a = nzb0Var;
        this.b = dqe0Var;
        this.c = cVar;
        this.d = bVar;
        this.e = aVar;
        this.f = i6j0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(2:11|12)(2:14|15))(2:16|17))(3:28|29|(2:31|32))|18|19|(1:21)|22|(1:26)(2:24|25)))|37|6|7|(0)(0)|18|19|(0)|22|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0042, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        r8 = new kotlin.Result.Failure(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(w wVar, pv0 pv0Var, ContinuationImpl continuationImpl) {
        SourcePointZoneRequestInteractor$request$1 sourcePointZoneRequestInteractor$request$1;
        int i;
        String zoneName;
        wVar.getClass();
        if (continuationImpl instanceof SourcePointZoneRequestInteractor$request$1) {
            sourcePointZoneRequestInteractor$request$1 = (SourcePointZoneRequestInteractor$request$1) continuationImpl;
            int i2 = sourcePointZoneRequestInteractor$request$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sourcePointZoneRequestInteractor$request$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sourcePointZoneRequestInteractor$request$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sourcePointZoneRequestInteractor$request$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.preorder.source.sourcepointzone.a aVar = wVar.e;
                    sourcePointZoneRequestInteractor$request$1.L$0 = pv0Var;
                    sourcePointZoneRequestInteractor$request$1.label = 1;
                    obj = aVar.a(pv0Var, true, sourcePointZoneRequestInteractor$request$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj2 = sourcePointZoneRequestInteractor$request$1.L$1;
                        kotlin.b.b(obj);
                        return obj2;
                    }
                    pv0Var = (pv0) sourcePointZoneRequestInteractor$request$1.L$0;
                    kotlin.b.b(obj);
                }
                Object failure = ((dd61) obj).b;
                i6j0 i6j0Var = wVar.f;
                zzs B = pv0Var.a.B();
                zoneName = pv0Var.a.getZoneName();
                if (zoneName == null) {
                    zoneName = "";
                }
                String str = wVar.b.a.Q;
                sourcePointZoneRequestInteractor$request$1.L$0 = null;
                sourcePointZoneRequestInteractor$request$1.L$1 = failure;
                sourcePointZoneRequestInteractor$request$1.label = 2;
                return i6j0Var.a(B, zoneName, str, sourcePointZoneRequestInteractor$request$1) != coroutineSingletons ? coroutineSingletons : failure;
            }
        }
        sourcePointZoneRequestInteractor$request$1 = new SourcePointZoneRequestInteractor$request$1(wVar, continuationImpl);
        Object obj3 = sourcePointZoneRequestInteractor$request$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sourcePointZoneRequestInteractor$request$1.label;
        if (i != 0) {
        }
        Object failure2 = ((dd61) obj3).b;
        i6j0 i6j0Var2 = wVar.f;
        zzs B2 = pv0Var.a.B();
        zoneName = pv0Var.a.getZoneName();
        if (zoneName == null) {
        }
        String str2 = wVar.b.a.Q;
        sourcePointZoneRequestInteractor$request$1.L$0 = null;
        sourcePointZoneRequestInteractor$request$1.L$1 = failure2;
        sourcePointZoneRequestInteractor$request$1.label = 2;
        if (i6j0Var2.a(B2, zoneName, str2, sourcePointZoneRequestInteractor$request$1) != coroutineSingletons2) {
        }
    }
}
