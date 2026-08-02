package com.squareup.cash.clientrouting.routers.work;

import app.cash.broadway.navigation.Navigator;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.account.types.SignedInState;
import com.squareup.cash.account.types.SignedInStateManager;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.initialscreenloader.backend.RealSquareStaffSwitchAccountContextStore;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class SquareStaffSwitchAccountRouter {
    public final RealSquareStaffSwitchAccountContextStore contextStore;
    public final SignedInStateManager signedInStateManager;

    public SquareStaffSwitchAccountRouter(Navigator navigator, RealSquareStaffSwitchAccountContextStore realSquareStaffSwitchAccountContextStore, SignedInStateManager signedInStateManager) {
        navigator.getClass();
        this.contextStore = realSquareStaffSwitchAccountContextStore;
        this.signedInStateManager = signedInStateManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.SquareStaffSwitchAccount squareStaffSwitchAccount, ContinuationImpl continuationImpl) {
        SquareStaffSwitchAccountRouter$route$1 squareStaffSwitchAccountRouter$route$1;
        int i;
        if (continuationImpl instanceof SquareStaffSwitchAccountRouter$route$1) {
            squareStaffSwitchAccountRouter$route$1 = (SquareStaffSwitchAccountRouter$route$1) continuationImpl;
            int i2 = squareStaffSwitchAccountRouter$route$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                squareStaffSwitchAccountRouter$route$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = squareStaffSwitchAccountRouter$route$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = squareStaffSwitchAccountRouter$route$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str = squareStaffSwitchAccount.invitationToken;
                    squareStaffSwitchAccountRouter$route$1.label = 1;
                    if (this.contextStore.save(str, squareStaffSwitchAccountRouter$route$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                this.signedInStateManager.update(SignedInState.SIGNED_OUT);
                return Unit.INSTANCE;
            }
        }
        squareStaffSwitchAccountRouter$route$1 = new SquareStaffSwitchAccountRouter$route$1(this, continuationImpl);
        Object obj2 = squareStaffSwitchAccountRouter$route$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = squareStaffSwitchAccountRouter$route$1.label;
        if (i != 0) {
        }
        this.signedInStateManager.update(SignedInState.SIGNED_OUT);
        return Unit.INSTANCE;
    }
}
