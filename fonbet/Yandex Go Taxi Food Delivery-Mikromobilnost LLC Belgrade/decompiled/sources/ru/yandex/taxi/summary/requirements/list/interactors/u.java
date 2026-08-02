package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.b2k;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class u implements tpr {
    public final /* synthetic */ b2k a;
    public final /* synthetic */ v b;

    public u(b2k b2kVar, v vVar) {
        this.a = b2kVar;
        this.b = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RequirementCommunicationsInteractor$notLoadedBannerIdsFlow$$inlined$map$1$1 requirementCommunicationsInteractor$notLoadedBannerIdsFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof RequirementCommunicationsInteractor$notLoadedBannerIdsFlow$$inlined$map$1$1) {
            requirementCommunicationsInteractor$notLoadedBannerIdsFlow$$inlined$map$1$1 = (RequirementCommunicationsInteractor$notLoadedBannerIdsFlow$$inlined$map$1$1) continuation;
            int i2 = requirementCommunicationsInteractor$notLoadedBannerIdsFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementCommunicationsInteractor$notLoadedBannerIdsFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = requirementCommunicationsInteractor$notLoadedBannerIdsFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementCommunicationsInteractor$notLoadedBannerIdsFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t tVar = new t(vprVar, this.b);
                    requirementCommunicationsInteractor$notLoadedBannerIdsFlow$$inlined$map$1$1.L$0 = null;
                    requirementCommunicationsInteractor$notLoadedBannerIdsFlow$$inlined$map$1$1.L$1 = null;
                    requirementCommunicationsInteractor$notLoadedBannerIdsFlow$$inlined$map$1$1.L$2 = null;
                    requirementCommunicationsInteractor$notLoadedBannerIdsFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(tVar, requirementCommunicationsInteractor$notLoadedBannerIdsFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        requirementCommunicationsInteractor$notLoadedBannerIdsFlow$$inlined$map$1$1 = new RequirementCommunicationsInteractor$notLoadedBannerIdsFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = requirementCommunicationsInteractor$notLoadedBannerIdsFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementCommunicationsInteractor$notLoadedBannerIdsFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
