package ru.yandex.taxi.preorder.summary.solid;

import defpackage.hnr0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;

    public b(hnr0 hnr0Var) {
        this.a = hnr0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SolidSummaryPresenter$attachView$$inlined$map$1$1 solidSummaryPresenter$attachView$$inlined$map$1$1;
        int i;
        if (continuation instanceof SolidSummaryPresenter$attachView$$inlined$map$1$1) {
            solidSummaryPresenter$attachView$$inlined$map$1$1 = (SolidSummaryPresenter$attachView$$inlined$map$1$1) continuation;
            int i2 = solidSummaryPresenter$attachView$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                solidSummaryPresenter$attachView$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = solidSummaryPresenter$attachView$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = solidSummaryPresenter$attachView$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar);
                    solidSummaryPresenter$attachView$$inlined$map$1$1.L$0 = null;
                    solidSummaryPresenter$attachView$$inlined$map$1$1.L$1 = null;
                    solidSummaryPresenter$attachView$$inlined$map$1$1.L$2 = null;
                    solidSummaryPresenter$attachView$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, solidSummaryPresenter$attachView$$inlined$map$1$1) == coroutineSingletons) {
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
        solidSummaryPresenter$attachView$$inlined$map$1$1 = new SolidSummaryPresenter$attachView$$inlined$map$1$1(this, continuation);
        Object obj2 = solidSummaryPresenter$attachView$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = solidSummaryPresenter$attachView$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
