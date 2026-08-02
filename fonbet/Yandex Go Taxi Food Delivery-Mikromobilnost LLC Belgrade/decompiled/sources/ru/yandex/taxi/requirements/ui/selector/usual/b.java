package ru.yandex.taxi.requirements.ui.selector.usual;

import defpackage.ny61;
import defpackage.qv21;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes6.dex */
public final class b implements tpr {
    public final /* synthetic */ m0 a;
    public final /* synthetic */ qv21 b;

    public b(m0 m0Var, qv21 qv21Var) {
        this.a = m0Var;
        this.b = qv21Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        UsualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$1 usualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof UsualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$1) {
            usualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$1 = (UsualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = usualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                usualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = usualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = usualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    usualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    usualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    usualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    usualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, usualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
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
        usualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$1 = new UsualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = usualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = usualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
