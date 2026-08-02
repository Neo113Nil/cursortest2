package ru.yandex.taxi.preorder.summary.tariffpage.badge;

import defpackage.a521;
import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class n implements tpr {
    public final /* synthetic */ mth a;
    public final /* synthetic */ a521 b;

    public n(mth mthVar, a521 a521Var) {
        this.a = mthVar;
        this.b = a521Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        UnsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$1 unsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof UnsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$1) {
            unsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$1 = (UnsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$1) continuation;
            int i2 = unsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                unsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = unsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = unsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    m mVar = new m(vprVar, this.b);
                    unsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$1.L$0 = null;
                    unsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$1.L$1 = null;
                    unsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$1.L$2 = null;
                    unsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(mVar, unsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        unsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$1 = new UnsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = unsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = unsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
