package ru.yandex.taxi.summary.requirements.list.carousel.interactor;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class f implements tpr {
    public final /* synthetic */ d a;

    public f(d dVar) {
        this.a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        UnavailableRequirementsCarouselItemInteractor$unavailableCarouselItemsFlow$$inlined$combineIdentifiable$default$2$1 unavailableRequirementsCarouselItemInteractor$unavailableCarouselItemsFlow$$inlined$combineIdentifiable$default$2$1;
        int i;
        if (continuation instanceof UnavailableRequirementsCarouselItemInteractor$unavailableCarouselItemsFlow$$inlined$combineIdentifiable$default$2$1) {
            unavailableRequirementsCarouselItemInteractor$unavailableCarouselItemsFlow$$inlined$combineIdentifiable$default$2$1 = (UnavailableRequirementsCarouselItemInteractor$unavailableCarouselItemsFlow$$inlined$combineIdentifiable$default$2$1) continuation;
            int i2 = unavailableRequirementsCarouselItemInteractor$unavailableCarouselItemsFlow$$inlined$combineIdentifiable$default$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                unavailableRequirementsCarouselItemInteractor$unavailableCarouselItemsFlow$$inlined$combineIdentifiable$default$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = unavailableRequirementsCarouselItemInteractor$unavailableCarouselItemsFlow$$inlined$combineIdentifiable$default$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = unavailableRequirementsCarouselItemInteractor$unavailableCarouselItemsFlow$$inlined$combineIdentifiable$default$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar);
                    unavailableRequirementsCarouselItemInteractor$unavailableCarouselItemsFlow$$inlined$combineIdentifiable$default$2$1.L$0 = null;
                    unavailableRequirementsCarouselItemInteractor$unavailableCarouselItemsFlow$$inlined$combineIdentifiable$default$2$1.L$1 = null;
                    unavailableRequirementsCarouselItemInteractor$unavailableCarouselItemsFlow$$inlined$combineIdentifiable$default$2$1.L$2 = null;
                    unavailableRequirementsCarouselItemInteractor$unavailableCarouselItemsFlow$$inlined$combineIdentifiable$default$2$1.label = 1;
                    if (this.a.collect(eVar, unavailableRequirementsCarouselItemInteractor$unavailableCarouselItemsFlow$$inlined$combineIdentifiable$default$2$1) == coroutineSingletons) {
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
        unavailableRequirementsCarouselItemInteractor$unavailableCarouselItemsFlow$$inlined$combineIdentifiable$default$2$1 = new UnavailableRequirementsCarouselItemInteractor$unavailableCarouselItemsFlow$$inlined$combineIdentifiable$default$2$1(this, continuation);
        Object obj2 = unavailableRequirementsCarouselItemInteractor$unavailableCarouselItemsFlow$$inlined$combineIdentifiable$default$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = unavailableRequirementsCarouselItemInteractor$unavailableCarouselItemsFlow$$inlined$combineIdentifiable$default$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
