package ru.yandex.taxi.masstransit.stoproute.ui.overlay;

import com.yandex.mapkit.geometry.BoundingBox;
import defpackage.b340;
import defpackage.dr30;
import defpackage.er30;
import defpackage.fi6;
import defpackage.gci0;
import defpackage.gh00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.stoproute.ui.overlay.MtStopRouteOverlayPresenter$attachView$2", f = "MtStopRouteOverlayPresenter.kt", l = {43}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtStopRouteOverlayPresenter$attachView$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b340 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtStopRouteOverlayPresenter$attachView$2(b340 b340Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = b340Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtStopRouteOverlayPresenter$attachView$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtStopRouteOverlayPresenter$attachView$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            gci0 gci0Var = this.this$0.A.b;
            MtStopRouteOverlayPresenter$attachView$2$sections$1 mtStopRouteOverlayPresenter$attachView$2$sections$1 = new MtStopRouteOverlayPresenter$attachView$2$sections$1(2, null);
            this.label = 1;
            obj = e.x(gci0Var, mtStopRouteOverlayPresenter$attachView$2$sections$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        b340 b340Var = this.this$0;
        b340Var.getClass();
        fi6 fi6Var = new fi6();
        for (er30 er30Var : (List) obj) {
            if (er30Var instanceof dr30) {
                fi6Var.d(((dr30) er30Var).a.a);
            }
        }
        try {
            failure = fi6Var.g();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        BoundingBox boundingBox = (BoundingBox) failure;
        if (boundingBox != null) {
            ((gh00) b340Var.z).A(boundingBox, null);
        }
        return zy11.a;
    }
}
