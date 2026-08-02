package ru.yandex.taxi.masstransit.geopayment.experiment.external_auth;

import defpackage.a930;
import defpackage.g92;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class b implements tpr {
    public final /* synthetic */ g92 a;
    public final /* synthetic */ a930 b;

    public b(g92 g92Var, a930 a930Var) {
        this.a = g92Var;
        this.b = a930Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MosmetroOnboardingConfigProviderImpl$onboardingConfigFlow$$inlined$map$1$1 mosmetroOnboardingConfigProviderImpl$onboardingConfigFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof MosmetroOnboardingConfigProviderImpl$onboardingConfigFlow$$inlined$map$1$1) {
            mosmetroOnboardingConfigProviderImpl$onboardingConfigFlow$$inlined$map$1$1 = (MosmetroOnboardingConfigProviderImpl$onboardingConfigFlow$$inlined$map$1$1) continuation;
            int i2 = mosmetroOnboardingConfigProviderImpl$onboardingConfigFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mosmetroOnboardingConfigProviderImpl$onboardingConfigFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mosmetroOnboardingConfigProviderImpl$onboardingConfigFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mosmetroOnboardingConfigProviderImpl$onboardingConfigFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    mosmetroOnboardingConfigProviderImpl$onboardingConfigFlow$$inlined$map$1$1.L$0 = null;
                    mosmetroOnboardingConfigProviderImpl$onboardingConfigFlow$$inlined$map$1$1.L$1 = null;
                    mosmetroOnboardingConfigProviderImpl$onboardingConfigFlow$$inlined$map$1$1.L$2 = null;
                    mosmetroOnboardingConfigProviderImpl$onboardingConfigFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, mosmetroOnboardingConfigProviderImpl$onboardingConfigFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        mosmetroOnboardingConfigProviderImpl$onboardingConfigFlow$$inlined$map$1$1 = new MosmetroOnboardingConfigProviderImpl$onboardingConfigFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = mosmetroOnboardingConfigProviderImpl$onboardingConfigFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mosmetroOnboardingConfigProviderImpl$onboardingConfigFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
