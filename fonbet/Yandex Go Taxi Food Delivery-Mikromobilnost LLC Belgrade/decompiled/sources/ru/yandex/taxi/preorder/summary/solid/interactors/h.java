package ru.yandex.taxi.preorder.summary.solid.interactors;

import defpackage.fnx0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes6.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;

    public h(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AlternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$filter$1$2$1 alternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof AlternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$filter$1$2$1) {
            alternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$filter$1$2$1 = (AlternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$filter$1$2$1) continuation;
            int i2 = alternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                alternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = alternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = alternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (((fnx0) obj).b == SelectionOrigin.USER) {
                        alternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$filter$1$2$1.L$0 = null;
                        alternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$filter$1$2$1.L$1 = null;
                        alternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$filter$1$2$1.L$2 = null;
                        alternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$filter$1$2$1.L$3 = null;
                        alternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, alternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        alternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$filter$1$2$1 = new AlternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = alternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = alternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
