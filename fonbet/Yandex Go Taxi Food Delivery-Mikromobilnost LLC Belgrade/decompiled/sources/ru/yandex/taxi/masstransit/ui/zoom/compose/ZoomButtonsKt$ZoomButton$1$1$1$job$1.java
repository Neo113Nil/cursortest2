package ru.yandex.taxi.masstransit.ui.zoom.compose;

import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.ui.zoom.compose.ZoomButtonsKt$ZoomButton$1$1$1$job$1", f = "ZoomButtons.kt", l = {120, HProv.PP_SAME_MEDIA}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ZoomButtonsKt$ZoomButton$1$1$1$job$1 extends SuspendLambda implements wls {
    final /* synthetic */ sls $onHold;
    final /* synthetic */ Ref$BooleanRef $wasHeld;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomButtonsKt$ZoomButton$1$1$1$job$1(Ref$BooleanRef ref$BooleanRef, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.$wasHeld = ref$BooleanRef;
        this.$onHold = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ZoomButtonsKt$ZoomButton$1$1$1$job$1 zoomButtonsKt$ZoomButton$1$1$1$job$1 = new ZoomButtonsKt$ZoomButton$1$1$1$job$1(this.$wasHeld, this.$onHold, continuation);
        zoomButtonsKt$ZoomButton$1$1$1$job$1.L$0 = obj;
        return zoomButtonsKt$ZoomButton$1$1$1$job$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ZoomButtonsKt$ZoomButton$1$1$1$job$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
    
        if (kotlinx.coroutines.a.i(200, r7) == r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            this.L$0 = tseVar;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                while (bvf0.D(tseVar)) {
                    this.$onHold.invoke();
                    this.L$0 = tseVar;
                    this.label = 2;
                    if (kotlinx.coroutines.a.i(200L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11.a;
            }
            b.b(obj);
        }
        this.$wasHeld.element = true;
        while (bvf0.D(tseVar)) {
        }
        return zy11.a;
    }
}
