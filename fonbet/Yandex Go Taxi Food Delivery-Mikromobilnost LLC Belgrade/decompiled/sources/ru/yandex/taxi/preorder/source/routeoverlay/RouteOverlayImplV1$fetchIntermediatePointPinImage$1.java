package ru.yandex.taxi.preorder.source.routeoverlay;

import defpackage.bl00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sq00;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.routeoverlay.RouteOverlayImplV1$fetchIntermediatePointPinImage$1", f = "RouteOverlayImplV1.kt", l = {482}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RouteOverlayImplV1$fetchIntermediatePointPinImage$1 extends SuspendLambda implements wls {
    final /* synthetic */ sq00 $mapPinInfo;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteOverlayImplV1$fetchIntermediatePointPinImage$1(a aVar, sq00 sq00Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$mapPinInfo = sq00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteOverlayImplV1$fetchIntermediatePointPinImage$1(this.this$0, this.$mapPinInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteOverlayImplV1$fetchIntermediatePointPinImage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                a aVar2 = this.this$0;
                sq00 sq00Var = this.$mapPinInfo;
                com.yandex.go.pin.api.widget.b bVar = aVar2.G;
                this.L$0 = aVar2;
                this.label = 1;
                Object e = bVar.e(sq00Var, this);
                if (e == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = e;
                aVar = aVar2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = (a) this.L$0;
                b.b(obj);
            }
            aVar.e0 = (bl00) obj;
            aVar.Mg();
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable unused) {
        }
        return zy11.a;
    }
}
