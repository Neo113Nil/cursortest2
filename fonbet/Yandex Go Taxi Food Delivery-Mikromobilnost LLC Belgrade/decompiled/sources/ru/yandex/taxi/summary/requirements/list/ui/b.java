package ru.yandex.taxi.summary.requirements.list.ui;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vot0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ vot0 b;

    public b(tpr tprVar, vot0 vot0Var) {
        this.a = tprVar;
        this.b = vot0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SpecialNeedsPresenter$attachView$1$invokeSuspend$$inlined$map$1$1 specialNeedsPresenter$attachView$1$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof SpecialNeedsPresenter$attachView$1$invokeSuspend$$inlined$map$1$1) {
            specialNeedsPresenter$attachView$1$invokeSuspend$$inlined$map$1$1 = (SpecialNeedsPresenter$attachView$1$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = specialNeedsPresenter$attachView$1$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                specialNeedsPresenter$attachView$1$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = specialNeedsPresenter$attachView$1$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = specialNeedsPresenter$attachView$1$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    specialNeedsPresenter$attachView$1$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    specialNeedsPresenter$attachView$1$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    specialNeedsPresenter$attachView$1$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    specialNeedsPresenter$attachView$1$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, specialNeedsPresenter$attachView$1$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
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
        specialNeedsPresenter$attachView$1$invokeSuspend$$inlined$map$1$1 = new SpecialNeedsPresenter$attachView$1$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = specialNeedsPresenter$attachView$1$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = specialNeedsPresenter$attachView$1$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
