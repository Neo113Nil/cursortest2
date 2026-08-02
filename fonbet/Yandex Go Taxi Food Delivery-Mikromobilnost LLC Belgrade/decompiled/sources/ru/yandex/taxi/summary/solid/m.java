package ru.yandex.taxi.summary.solid;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class m implements tpr {
    public final /* synthetic */ o a;

    public m(o oVar) {
        this.a = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SolidSummaryCommunicationsDelegatePresenter$currentTariffDescriptionFlow$$inlined$map$1$1 solidSummaryCommunicationsDelegatePresenter$currentTariffDescriptionFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof SolidSummaryCommunicationsDelegatePresenter$currentTariffDescriptionFlow$$inlined$map$1$1) {
            solidSummaryCommunicationsDelegatePresenter$currentTariffDescriptionFlow$$inlined$map$1$1 = (SolidSummaryCommunicationsDelegatePresenter$currentTariffDescriptionFlow$$inlined$map$1$1) continuation;
            int i2 = solidSummaryCommunicationsDelegatePresenter$currentTariffDescriptionFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                solidSummaryCommunicationsDelegatePresenter$currentTariffDescriptionFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = solidSummaryCommunicationsDelegatePresenter$currentTariffDescriptionFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = solidSummaryCommunicationsDelegatePresenter$currentTariffDescriptionFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    l lVar = new l(vprVar);
                    solidSummaryCommunicationsDelegatePresenter$currentTariffDescriptionFlow$$inlined$map$1$1.L$0 = null;
                    solidSummaryCommunicationsDelegatePresenter$currentTariffDescriptionFlow$$inlined$map$1$1.L$1 = null;
                    solidSummaryCommunicationsDelegatePresenter$currentTariffDescriptionFlow$$inlined$map$1$1.L$2 = null;
                    solidSummaryCommunicationsDelegatePresenter$currentTariffDescriptionFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(lVar, solidSummaryCommunicationsDelegatePresenter$currentTariffDescriptionFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        solidSummaryCommunicationsDelegatePresenter$currentTariffDescriptionFlow$$inlined$map$1$1 = new SolidSummaryCommunicationsDelegatePresenter$currentTariffDescriptionFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = solidSummaryCommunicationsDelegatePresenter$currentTariffDescriptionFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = solidSummaryCommunicationsDelegatePresenter$currentTariffDescriptionFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
