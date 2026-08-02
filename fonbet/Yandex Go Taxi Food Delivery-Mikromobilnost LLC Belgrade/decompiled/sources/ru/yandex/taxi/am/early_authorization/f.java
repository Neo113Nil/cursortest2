package ru.yandex.taxi.am.early_authorization;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes5.dex */
public final class f implements tpr {
    public final /* synthetic */ m0 a;

    public f(m0 m0Var) {
        this.a = m0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        EarlyAuthorizationInteractor$isLocationPermissionWithAgreementNotShowing$$inlined$filter$1$1 earlyAuthorizationInteractor$isLocationPermissionWithAgreementNotShowing$$inlined$filter$1$1;
        int i;
        if (continuation instanceof EarlyAuthorizationInteractor$isLocationPermissionWithAgreementNotShowing$$inlined$filter$1$1) {
            earlyAuthorizationInteractor$isLocationPermissionWithAgreementNotShowing$$inlined$filter$1$1 = (EarlyAuthorizationInteractor$isLocationPermissionWithAgreementNotShowing$$inlined$filter$1$1) continuation;
            int i2 = earlyAuthorizationInteractor$isLocationPermissionWithAgreementNotShowing$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                earlyAuthorizationInteractor$isLocationPermissionWithAgreementNotShowing$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = earlyAuthorizationInteractor$isLocationPermissionWithAgreementNotShowing$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = earlyAuthorizationInteractor$isLocationPermissionWithAgreementNotShowing$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar);
                    earlyAuthorizationInteractor$isLocationPermissionWithAgreementNotShowing$$inlined$filter$1$1.L$0 = null;
                    earlyAuthorizationInteractor$isLocationPermissionWithAgreementNotShowing$$inlined$filter$1$1.L$1 = null;
                    earlyAuthorizationInteractor$isLocationPermissionWithAgreementNotShowing$$inlined$filter$1$1.L$2 = null;
                    earlyAuthorizationInteractor$isLocationPermissionWithAgreementNotShowing$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(eVar, earlyAuthorizationInteractor$isLocationPermissionWithAgreementNotShowing$$inlined$filter$1$1) == coroutineSingletons) {
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
        earlyAuthorizationInteractor$isLocationPermissionWithAgreementNotShowing$$inlined$filter$1$1 = new EarlyAuthorizationInteractor$isLocationPermissionWithAgreementNotShowing$$inlined$filter$1$1(this, continuation);
        Object obj2 = earlyAuthorizationInteractor$isLocationPermissionWithAgreementNotShowing$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = earlyAuthorizationInteractor$isLocationPermissionWithAgreementNotShowing$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
