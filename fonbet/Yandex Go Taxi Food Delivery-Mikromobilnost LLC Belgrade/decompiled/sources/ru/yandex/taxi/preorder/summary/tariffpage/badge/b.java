package ru.yandex.taxi.preorder.summary.tariffpage.badge;

import defpackage.fj6;
import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class b implements tpr {
    public final /* synthetic */ mth a;
    public final /* synthetic */ fj6 b;

    public b(mth mthVar, fj6 fj6Var) {
        this.a = mthVar;
        this.b = fj6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        BrandingBadgeInteractor$badgesFlow$$inlined$map$1$1 brandingBadgeInteractor$badgesFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof BrandingBadgeInteractor$badgesFlow$$inlined$map$1$1) {
            brandingBadgeInteractor$badgesFlow$$inlined$map$1$1 = (BrandingBadgeInteractor$badgesFlow$$inlined$map$1$1) continuation;
            int i2 = brandingBadgeInteractor$badgesFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                brandingBadgeInteractor$badgesFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = brandingBadgeInteractor$badgesFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = brandingBadgeInteractor$badgesFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    brandingBadgeInteractor$badgesFlow$$inlined$map$1$1.L$0 = null;
                    brandingBadgeInteractor$badgesFlow$$inlined$map$1$1.L$1 = null;
                    brandingBadgeInteractor$badgesFlow$$inlined$map$1$1.L$2 = null;
                    brandingBadgeInteractor$badgesFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, brandingBadgeInteractor$badgesFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        brandingBadgeInteractor$badgesFlow$$inlined$map$1$1 = new BrandingBadgeInteractor$badgesFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = brandingBadgeInteractor$badgesFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = brandingBadgeInteractor$badgesFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
