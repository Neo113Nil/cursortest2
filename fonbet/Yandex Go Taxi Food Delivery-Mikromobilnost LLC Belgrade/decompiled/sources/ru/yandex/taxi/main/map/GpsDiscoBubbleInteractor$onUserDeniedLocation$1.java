package ru.yandex.taxi.main.map;

import defpackage.b2k;
import defpackage.dde0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o9j0;
import defpackage.p9j0;
import defpackage.r0t;
import defpackage.tse;
import defpackage.u6r;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.persuggest.api.finalsuggest.Action;
import ru.yandex.taxi.persuggest.repository.RequestedSourcePointInfoRepositoryImpl;
import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.main.map.GpsDiscoBubbleInteractor$onUserDeniedLocation$1", f = "GpsDiscoBubbleInteractor.kt", l = {HProv.PP_CACHE_SIZE, 120}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class GpsDiscoBubbleInteractor$onUserDeniedLocation$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GpsDiscoBubbleInteractor$onUserDeniedLocation$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GpsDiscoBubbleInteractor$onUserDeniedLocation$1 gpsDiscoBubbleInteractor$onUserDeniedLocation$1 = new GpsDiscoBubbleInteractor$onUserDeniedLocation$1(this.this$0, continuation);
        gpsDiscoBubbleInteractor$onUserDeniedLocation$1.L$0 = obj;
        return gpsDiscoBubbleInteractor$onUserDeniedLocation$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GpsDiscoBubbleInteractor$onUserDeniedLocation$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00dc  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object failure;
        Object failure2;
        p9j0 p9j0Var;
        c cVar;
        Throwable a;
        u6r u6rVar;
        RouteSelectorModalView routeSelectorModalView;
        List list;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            try {
            } catch (Throwable th) {
                failure2 = new Result.Failure(th);
            }
        } catch (Throwable th2) {
            failure = new Result.Failure(th2);
        }
        if (i == 0) {
            kotlin.b.b(obj);
            b2k b2kVar = ((RequestedSourcePointInfoRepositoryImpl) this.this$0.d).b;
            this.L$0 = tseVar;
            this.L$1 = null;
            this.label = 1;
            obj = kotlinx.coroutines.flow.e.y(b2kVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cVar = (c) this.L$3;
                p9j0Var = (p9j0) this.L$1;
                kotlin.b.b(obj);
                u6rVar = (u6r) obj;
                dde0 dde0Var = u6rVar.h;
                int size = (dde0Var != null || (list = dde0Var.a) == null) ? 0 : list.size();
                if ((cVar.c.n(new r0t(0), p9j0Var.a, p9j0Var.b, u6rVar) || size == 0) && (routeSelectorModalView = (RouteSelectorModalView) cVar.k.a.a().i(RouteSelectorModalView.class)) != null) {
                    routeSelectorModalView.onMyLocationTapped();
                }
                failure2 = zy11Var;
                a = Result.a(failure2);
                if (a != null) {
                    jst.e.k(a, "GpsDiscoBubble: failed to request final suggest on user denied location");
                }
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        failure = (p9j0) obj;
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            jst.e.k(a2, "GpsDiscoBubble: failed to get requested source point info");
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        p9j0 p9j0Var2 = (p9j0) failure;
        if (p9j0Var2 != null) {
            o9j0 o9j0Var = p9j0Var2.a.a;
            c cVar2 = this.this$0;
            ru.yandex.taxi.persuggest.source.g gVar = cVar2.b;
            Action action = Action.PIN_DROP;
            this.L$0 = null;
            this.L$1 = p9j0Var2;
            this.L$2 = null;
            this.L$3 = cVar2;
            this.L$4 = null;
            this.label = 2;
            Object a3 = ru.yandex.taxi.persuggest.source.g.a(gVar, o9j0Var, action, this, 4);
            if (a3 != coroutineSingletons) {
                obj = a3;
                p9j0Var = p9j0Var2;
                cVar = cVar2;
                u6rVar = (u6r) obj;
                dde0 dde0Var2 = u6rVar.h;
                if (dde0Var2 != null) {
                }
                if (cVar.c.n(new r0t(0), p9j0Var.a, p9j0Var.b, u6rVar)) {
                }
                routeSelectorModalView.onMyLocationTapped();
                failure2 = zy11Var;
                a = Result.a(failure2);
                if (a != null) {
                }
            }
            return coroutineSingletons;
        }
        return zy11Var;
    }
}
