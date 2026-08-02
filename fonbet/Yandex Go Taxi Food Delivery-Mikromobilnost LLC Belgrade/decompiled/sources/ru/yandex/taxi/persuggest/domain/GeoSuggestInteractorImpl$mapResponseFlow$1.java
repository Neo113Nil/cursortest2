package ru.yandex.taxi.persuggest.domain;

import defpackage.d2t;
import defpackage.e2t;
import defpackage.f2t;
import defpackage.g2t;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r0t;
import defpackage.s8o;
import defpackage.tls;
import defpackage.v6r;
import defpackage.vpr;
import defpackage.w1t;
import defpackage.wls;
import defpackage.x1t;
import defpackage.z1t;
import defpackage.z7l0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "Lkotlin/Result;", "Lg2t;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.persuggest.domain.GeoSuggestInteractorImpl$mapResponseFlow$1", f = "GeoSuggestInteractorImpl.kt", l = {577, 587, 593}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class GeoSuggestInteractorImpl$mapResponseFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $cacheBlock;
    final /* synthetic */ d2t $params;
    final /* synthetic */ tls $request;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeoSuggestInteractorImpl$mapResponseFlow$1(g gVar, d2t d2tVar, tls tlsVar, tls tlsVar2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$params = d2tVar;
        this.$request = tlsVar;
        this.$cacheBlock = tlsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GeoSuggestInteractorImpl$mapResponseFlow$1 geoSuggestInteractorImpl$mapResponseFlow$1 = new GeoSuggestInteractorImpl$mapResponseFlow$1(this.this$0, this.$params, this.$request, this.$cacheBlock, continuation);
        geoSuggestInteractorImpl$mapResponseFlow$1.L$0 = obj;
        return geoSuggestInteractorImpl$mapResponseFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GeoSuggestInteractorImpl$mapResponseFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x011c, code lost:
    
        if (r0.emit(r15, r14) != r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ce, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ed  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d2t d2tVar;
        g gVar;
        Throwable th;
        g gVar2;
        tls tlsVar;
        d2t d2tVar2;
        g gVar3;
        z7l0 z7l0Var;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                g gVar4 = this.this$0;
                d2tVar = this.$params;
                tls tlsVar2 = this.$request;
                tls tlsVar3 = this.$cacheBlock;
                try {
                    e2t e2tVar = gVar4.c;
                    z7l0 z7l0Var2 = d2tVar.a.a;
                    f2t f2tVar = (f2t) e2tVar;
                    f2tVar.getClass();
                    if (z7l0Var2 == RoutePointType.POINT_A) {
                        r0 r0Var = f2tVar.f;
                        z1t z1tVar = z1t.a;
                        r0Var.getClass();
                        r0Var.m(null, z1tVar);
                    }
                    this.L$0 = vprVar;
                    this.L$1 = gVar4;
                    this.L$2 = d2tVar;
                    this.L$3 = tlsVar3;
                    this.L$4 = gVar4;
                    this.L$5 = d2tVar;
                    this.label = 1;
                    Object invoke = tlsVar2.invoke(this);
                    if (invoke != coroutineSingletons) {
                        gVar2 = gVar4;
                        tlsVar = tlsVar3;
                        d2tVar2 = d2tVar;
                        obj = invoke;
                        gVar3 = gVar2;
                    }
                } catch (Throwable th2) {
                    gVar = gVar4;
                    th = th2;
                    ((f2t) gVar.c).d.j0();
                    e2t e2tVar2 = gVar.c;
                    z7l0Var = d2tVar.a.a;
                    f2t f2tVar2 = (f2t) e2tVar2;
                    f2tVar2.getClass();
                    if (z7l0Var == RoutePointType.POINT_A) {
                        r0 r0Var2 = f2tVar2.f;
                        Object obj2 = s8o.B(th) ? w1t.a : x1t.a;
                        r0Var2.getClass();
                        r0Var2.m(null, obj2);
                    }
                    Result result = new Result(new Result.Failure(th));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.label = 3;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i == 2) {
                    d2tVar = (d2t) this.L$2;
                    gVar = (g) this.L$1;
                    try {
                        kotlin.b.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        ((f2t) gVar.c).d.j0();
                        e2t e2tVar22 = gVar.c;
                        z7l0Var = d2tVar.a.a;
                        f2t f2tVar22 = (f2t) e2tVar22;
                        f2tVar22.getClass();
                        if (z7l0Var == RoutePointType.POINT_A) {
                        }
                        Result result2 = new Result(new Result.Failure(th));
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.label = 3;
                    }
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
            d2tVar = (d2t) this.L$5;
            gVar3 = (g) this.L$4;
            tlsVar = (tls) this.L$3;
            d2tVar2 = (d2t) this.L$2;
            gVar2 = (g) this.L$1;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th4) {
                th = th4;
                gVar = gVar3;
                ((f2t) gVar.c).d.j0();
                e2t e2tVar222 = gVar.c;
                z7l0Var = d2tVar.a.a;
                f2t f2tVar222 = (f2t) e2tVar222;
                f2tVar222.getClass();
                if (z7l0Var == RoutePointType.POINT_A) {
                }
                Result result22 = new Result(new Result.Failure(th));
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.label = 3;
            }
            g2t g2tVar = new g2t((v6r) obj, d2tVar2.b, new r0t(0));
            ((f2t) gVar2.c).d.j0();
            if (tlsVar != null) {
                tlsVar.invoke(g2tVar);
            }
            Result result3 = new Result(g2tVar);
            this.L$0 = vprVar;
            this.L$1 = gVar3;
            this.L$2 = d2tVar;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.label = 2;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
