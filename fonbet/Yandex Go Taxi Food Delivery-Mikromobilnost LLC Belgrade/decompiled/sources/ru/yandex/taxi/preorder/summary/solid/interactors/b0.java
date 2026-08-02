package ru.yandex.taxi.preorder.summary.solid.interactors;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class b0 implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.internal.h a;

    public b0(kotlinx.coroutines.flow.internal.h hVar) {
        this.a = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SummaryFinalSuggestRepeatRequestInteractor$tariffSuggestModeChangeFlow$lambda$0$$inlined$map$1$1 summaryFinalSuggestRepeatRequestInteractor$tariffSuggestModeChangeFlow$lambda$0$$inlined$map$1$1;
        int i;
        if (continuation instanceof SummaryFinalSuggestRepeatRequestInteractor$tariffSuggestModeChangeFlow$lambda$0$$inlined$map$1$1) {
            summaryFinalSuggestRepeatRequestInteractor$tariffSuggestModeChangeFlow$lambda$0$$inlined$map$1$1 = (SummaryFinalSuggestRepeatRequestInteractor$tariffSuggestModeChangeFlow$lambda$0$$inlined$map$1$1) continuation;
            int i2 = summaryFinalSuggestRepeatRequestInteractor$tariffSuggestModeChangeFlow$lambda$0$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryFinalSuggestRepeatRequestInteractor$tariffSuggestModeChangeFlow$lambda$0$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryFinalSuggestRepeatRequestInteractor$tariffSuggestModeChangeFlow$lambda$0$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryFinalSuggestRepeatRequestInteractor$tariffSuggestModeChangeFlow$lambda$0$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a0 a0Var = new a0(vprVar);
                    summaryFinalSuggestRepeatRequestInteractor$tariffSuggestModeChangeFlow$lambda$0$$inlined$map$1$1.L$0 = null;
                    summaryFinalSuggestRepeatRequestInteractor$tariffSuggestModeChangeFlow$lambda$0$$inlined$map$1$1.L$1 = null;
                    summaryFinalSuggestRepeatRequestInteractor$tariffSuggestModeChangeFlow$lambda$0$$inlined$map$1$1.L$2 = null;
                    summaryFinalSuggestRepeatRequestInteractor$tariffSuggestModeChangeFlow$lambda$0$$inlined$map$1$1.label = 1;
                    if (this.a.collect(a0Var, summaryFinalSuggestRepeatRequestInteractor$tariffSuggestModeChangeFlow$lambda$0$$inlined$map$1$1) == coroutineSingletons) {
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
        summaryFinalSuggestRepeatRequestInteractor$tariffSuggestModeChangeFlow$lambda$0$$inlined$map$1$1 = new SummaryFinalSuggestRepeatRequestInteractor$tariffSuggestModeChangeFlow$lambda$0$$inlined$map$1$1(this, continuation);
        Object obj2 = summaryFinalSuggestRepeatRequestInteractor$tariffSuggestModeChangeFlow$lambda$0$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryFinalSuggestRepeatRequestInteractor$tariffSuggestModeChangeFlow$lambda$0$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
