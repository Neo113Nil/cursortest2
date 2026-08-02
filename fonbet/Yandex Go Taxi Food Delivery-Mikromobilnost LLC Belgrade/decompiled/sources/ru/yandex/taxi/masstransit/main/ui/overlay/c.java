package ru.yandex.taxi.masstransit.main.ui.overlay;

import defpackage.jqr;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.yo30;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class c implements tpr {
    public final /* synthetic */ jqr a;
    public final /* synthetic */ yo30 b;

    public c(jqr jqrVar, yo30 yo30Var) {
        this.a = jqrVar;
        this.b = yo30Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$1 mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof MtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$1) {
            mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$1 = (MtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b);
                    mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$1 = new MtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
