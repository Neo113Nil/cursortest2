package ru.yandex.taxi.summary.solid;

import defpackage.de3;
import defpackage.gsc;
import defpackage.kb5;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class i implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ kb5 b;

    public i(vpr vprVar, kb5 kb5Var) {
        this.a = vprVar;
        this.b = kb5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SolidSummaryCommunicationsDelegatePresenter$communicationsFlow$lambda$4$$inlined$map$2$2$1 solidSummaryCommunicationsDelegatePresenter$communicationsFlow$lambda$4$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof SolidSummaryCommunicationsDelegatePresenter$communicationsFlow$lambda$4$$inlined$map$2$2$1) {
            solidSummaryCommunicationsDelegatePresenter$communicationsFlow$lambda$4$$inlined$map$2$2$1 = (SolidSummaryCommunicationsDelegatePresenter$communicationsFlow$lambda$4$$inlined$map$2$2$1) continuation;
            int i2 = solidSummaryCommunicationsDelegatePresenter$communicationsFlow$lambda$4$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                solidSummaryCommunicationsDelegatePresenter$communicationsFlow$lambda$4$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = solidSummaryCommunicationsDelegatePresenter$communicationsFlow$lambda$4$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = solidSummaryCommunicationsDelegatePresenter$communicationsFlow$lambda$4$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    gsc gscVar = new gsc(this.b, (de3) obj);
                    solidSummaryCommunicationsDelegatePresenter$communicationsFlow$lambda$4$$inlined$map$2$2$1.L$0 = null;
                    solidSummaryCommunicationsDelegatePresenter$communicationsFlow$lambda$4$$inlined$map$2$2$1.L$1 = null;
                    solidSummaryCommunicationsDelegatePresenter$communicationsFlow$lambda$4$$inlined$map$2$2$1.L$2 = null;
                    solidSummaryCommunicationsDelegatePresenter$communicationsFlow$lambda$4$$inlined$map$2$2$1.L$3 = null;
                    solidSummaryCommunicationsDelegatePresenter$communicationsFlow$lambda$4$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(gscVar, solidSummaryCommunicationsDelegatePresenter$communicationsFlow$lambda$4$$inlined$map$2$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        solidSummaryCommunicationsDelegatePresenter$communicationsFlow$lambda$4$$inlined$map$2$2$1 = new SolidSummaryCommunicationsDelegatePresenter$communicationsFlow$lambda$4$$inlined$map$2$2$1(this, continuation);
        Object obj22 = solidSummaryCommunicationsDelegatePresenter$communicationsFlow$lambda$4$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = solidSummaryCommunicationsDelegatePresenter$communicationsFlow$lambda$4$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
