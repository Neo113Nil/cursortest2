package ru.yandex.taxi.masstransit.main.ui.overlay;

import defpackage.ny61;
import defpackage.pfu0;
import defpackage.qfu0;
import defpackage.vpr;
import defpackage.yo30;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ yo30 b;

    public b(vpr vprVar, yo30 yo30Var) {
        this.a = vprVar;
        this.b = yo30Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
    
        if (r9.emit(r7, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1 mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        qfu0 qfu0Var;
        vpr vprVar2;
        if (continuation instanceof MtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1) {
            mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1 = (MtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pfu0 pfu0Var = (pfu0) obj;
                    vprVar = this.a;
                    if (pfu0Var != null) {
                        ru.yandex.taxi.masstransit.stopbubble.factory.a aVar = this.b.y;
                        mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                        mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                        mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                        mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                        mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$4 = vprVar;
                        mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$5 = null;
                        mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$6 = null;
                        mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                        Object a = aVar.a(pfu0Var, mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1);
                        if (a != coroutineSingletons) {
                            obj2 = a;
                            vprVar2 = vprVar;
                        }
                        return coroutineSingletons;
                    }
                    qfu0Var = null;
                    mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$4 = null;
                    mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$5 = null;
                    mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$6 = null;
                    mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.label = 2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar2 = (vpr) mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                }
                qfu0 qfu0Var2 = (qfu0) obj2;
                vprVar = vprVar2;
                qfu0Var = qfu0Var2;
                mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$4 = null;
                mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$5 = null;
                mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$6 = null;
                mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.label = 2;
            }
        }
        mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1 = new MtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        qfu0 qfu0Var22 = (qfu0) obj22;
        vprVar = vprVar2;
        qfu0Var = qfu0Var22;
        mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
        mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
        mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
        mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
        mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$4 = null;
        mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$5 = null;
        mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$6 = null;
        mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.label = 2;
    }
}
