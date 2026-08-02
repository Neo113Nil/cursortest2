package ru.yandex.taxi.preorder.summary.solid;

import defpackage.av1;
import defpackage.f4e;
import defpackage.fnx0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;

    public g(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SolidSummaryPresenter$attachView$26$invokeSuspend$$inlined$mapNotNull$1$2$1 solidSummaryPresenter$attachView$26$invokeSuspend$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof SolidSummaryPresenter$attachView$26$invokeSuspend$$inlined$mapNotNull$1$2$1) {
            solidSummaryPresenter$attachView$26$invokeSuspend$$inlined$mapNotNull$1$2$1 = (SolidSummaryPresenter$attachView$26$invokeSuspend$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = solidSummaryPresenter$attachView$26$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                solidSummaryPresenter$attachView$26$invokeSuspend$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = solidSummaryPresenter$attachView$26$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = solidSummaryPresenter$attachView$26$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    av1 d = ru.yandex.taxi.tariffs.model.b.d(((fnx0) obj).c);
                    f4e f4eVar = d != null ? d.c : null;
                    if (f4eVar != null) {
                        solidSummaryPresenter$attachView$26$invokeSuspend$$inlined$mapNotNull$1$2$1.L$0 = null;
                        solidSummaryPresenter$attachView$26$invokeSuspend$$inlined$mapNotNull$1$2$1.L$1 = null;
                        solidSummaryPresenter$attachView$26$invokeSuspend$$inlined$mapNotNull$1$2$1.L$2 = null;
                        solidSummaryPresenter$attachView$26$invokeSuspend$$inlined$mapNotNull$1$2$1.L$3 = null;
                        solidSummaryPresenter$attachView$26$invokeSuspend$$inlined$mapNotNull$1$2$1.L$4 = null;
                        solidSummaryPresenter$attachView$26$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(f4eVar, solidSummaryPresenter$attachView$26$invokeSuspend$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        solidSummaryPresenter$attachView$26$invokeSuspend$$inlined$mapNotNull$1$2$1 = new SolidSummaryPresenter$attachView$26$invokeSuspend$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = solidSummaryPresenter$attachView$26$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = solidSummaryPresenter$attachView$26$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
