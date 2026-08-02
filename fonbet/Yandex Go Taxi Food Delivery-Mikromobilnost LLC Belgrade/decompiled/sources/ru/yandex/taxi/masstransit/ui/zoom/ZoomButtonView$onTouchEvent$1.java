package ru.yandex.taxi.masstransit.ui.zoom;

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
import kotlinx.coroutines.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.ui.zoom.ZoomButtonView$onTouchEvent$1", f = "ZoomButtonsView.kt", l = {HProv.PP_SAME_MEDIA, 128}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class ZoomButtonView$onTouchEvent$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ZoomButtonView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomButtonView$onTouchEvent$1(ZoomButtonView zoomButtonView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = zoomButtonView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ZoomButtonView$onTouchEvent$1 zoomButtonView$onTouchEvent$1 = new ZoomButtonView$onTouchEvent$1(this.this$0, continuation);
        zoomButtonView$onTouchEvent$1.L$0 = obj;
        return zoomButtonView$onTouchEvent$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ZoomButtonView$onTouchEvent$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
    
        if (kotlinx.coroutines.a.i(200, r7) == r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        sls slsVar;
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
                    slsVar = this.this$0.onHold;
                    slsVar.invoke();
                    this.L$0 = tseVar;
                    this.label = 2;
                    if (a.i(200L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11.a;
            }
            b.b(obj);
        }
        this.this$0.isClick = false;
        while (bvf0.D(tseVar)) {
        }
        return zy11.a;
    }
}
