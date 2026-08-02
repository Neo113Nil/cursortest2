package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.banner_carousel;

import defpackage.a0t;
import defpackage.doe;
import defpackage.e0l0;
import defpackage.ny61;
import defpackage.oo0;
import defpackage.qv0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BannerCarouselWidget$special$$inlined$mapNotNull$1$2$1 bannerCarouselWidget$special$$inlined$mapNotNull$1$2$1;
        int i;
        oo0 oo0Var;
        a0t a0tVar;
        if (continuation instanceof BannerCarouselWidget$special$$inlined$mapNotNull$1$2$1) {
            bannerCarouselWidget$special$$inlined$mapNotNull$1$2$1 = (BannerCarouselWidget$special$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = bannerCarouselWidget$special$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bannerCarouselWidget$special$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = bannerCarouselWidget$special$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bannerCarouselWidget$special$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    qv0 qv0Var = (qv0) kotlin.collections.a.S(0, ((e0l0) obj).a);
                    doe doeVar = (qv0Var == null || (oo0Var = qv0Var.a) == null || (a0tVar = oo0Var.f) == null) ? null : new doe(a0tVar.a, a0tVar.b);
                    if (doeVar != null) {
                        bannerCarouselWidget$special$$inlined$mapNotNull$1$2$1.L$0 = null;
                        bannerCarouselWidget$special$$inlined$mapNotNull$1$2$1.L$1 = null;
                        bannerCarouselWidget$special$$inlined$mapNotNull$1$2$1.L$2 = null;
                        bannerCarouselWidget$special$$inlined$mapNotNull$1$2$1.L$3 = null;
                        bannerCarouselWidget$special$$inlined$mapNotNull$1$2$1.L$4 = null;
                        bannerCarouselWidget$special$$inlined$mapNotNull$1$2$1.I$0 = 0;
                        bannerCarouselWidget$special$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(doeVar, bannerCarouselWidget$special$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        bannerCarouselWidget$special$$inlined$mapNotNull$1$2$1 = new BannerCarouselWidget$special$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = bannerCarouselWidget$special$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannerCarouselWidget$special$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
