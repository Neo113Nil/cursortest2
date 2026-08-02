package ru.yandex.taxi.preorder.summary.solid.interactors;

import defpackage.av1;
import defpackage.ex1;
import defpackage.fid0;
import defpackage.fnx0;
import defpackage.gl2;
import defpackage.i2d0;
import defpackage.njc;
import defpackage.nu1;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.pnx0;
import defpackage.q8f;
import defpackage.tr40;
import defpackage.umd0;
import defpackage.v2h;
import defpackage.vpr;
import defpackage.w511;
import defpackage.xu1;
import defpackage.xx00;
import defpackage.zu1;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class j implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ l b;

    public j(vpr vprVar, l lVar) {
        this.a = vprVar;
        this.b = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AlternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$mapNotNull$1$2$1 alternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$mapNotNull$1$2$1;
        int i;
        ex1 ex1Var;
        xu1 xu1Var;
        ru.yandex.taxi.tariffs.model.a aVar;
        List list;
        Object obj2;
        if (continuation instanceof AlternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$mapNotNull$1$2$1) {
            alternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$mapNotNull$1$2$1 = (AlternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = alternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                alternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = alternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = alternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    this.b.c.g(null, false);
                    pex0 pex0Var = ((fnx0) obj).c;
                    pex0 pex0Var2 = pex0Var.M0;
                    if (pex0Var2 == null || (aVar = pex0Var2.t0) == null || (list = aVar.a) == null) {
                        ex1Var = null;
                    } else {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (((ex1) obj2).a() == pex0Var) {
                                break;
                            }
                        }
                        ex1Var = (ex1) obj2;
                    }
                    if (ex1Var instanceof xu1) {
                        xu1Var = (xu1) ex1Var;
                    } else {
                        if (!(ex1Var instanceof fid0) && !(ex1Var instanceof zu1) && !(ex1Var instanceof av1) && !(ex1Var instanceof q8f) && !(ex1Var instanceof v2h) && !(ex1Var instanceof tr40) && !(ex1Var instanceof umd0) && !(ex1Var instanceof i2d0) && !(ex1Var instanceof pnx0) && !(ex1Var instanceof nu1) && !(ex1Var instanceof gl2) && !(ex1Var instanceof njc) && !(ex1Var instanceof xx00) && ex1Var != null) {
                            w511.b();
                            return null;
                        }
                        xu1Var = null;
                    }
                    if (xu1Var != null) {
                        alternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$mapNotNull$1$2$1.L$0 = null;
                        alternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$mapNotNull$1$2$1.L$1 = null;
                        alternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$mapNotNull$1$2$1.L$2 = null;
                        alternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$mapNotNull$1$2$1.L$3 = null;
                        alternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$mapNotNull$1$2$1.L$4 = null;
                        alternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(xu1Var, alternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        alternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$mapNotNull$1$2$1 = new AlternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj32 = alternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = alternativePaymentActionsInteractor$collectActionsOnAltPaymentMethodAlternative$2$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
