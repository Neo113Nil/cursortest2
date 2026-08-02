package ru.yandex.taxi.preorder.summary.tariffpage.badge;

import defpackage.a521;
import defpackage.bh11;
import defpackage.f1h0;
import defpackage.jbx0;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wl4;
import defpackage.zy11;
import java.util.Collections;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final class m implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ a521 b;

    public m(vpr vprVar, a521 a521Var) {
        this.a = vprVar;
        this.b = a521Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UnsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$2$1 unsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$2$1;
        int i;
        Object singletonList;
        if (continuation instanceof UnsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$2$1) {
            unsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$2$1 = (UnsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$2$1) continuation;
            int i2 = unsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                unsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = unsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = unsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    a521 a521Var = this.b;
                    String r = a521Var.a.r(((mi31) obj).a);
                    if (r == null) {
                        singletonList = EmptyList.a;
                    } else {
                        singletonList = Collections.singletonList(new wl4(null, FormattedText.Companion.c(r), null, 0, null, null, null, new jbx0(f1h0.cross_in_circle), null, null, null, null, new bh11(6, a521Var), 65277));
                    }
                    unsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$2$1.L$0 = null;
                    unsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$2$1.L$1 = null;
                    unsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$2$1.L$2 = null;
                    unsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$2$1.L$3 = null;
                    unsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(singletonList, unsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        unsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$2$1 = new UnsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = unsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = unsupportedRequirementsTariffBadgeIntractor$badgesFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
