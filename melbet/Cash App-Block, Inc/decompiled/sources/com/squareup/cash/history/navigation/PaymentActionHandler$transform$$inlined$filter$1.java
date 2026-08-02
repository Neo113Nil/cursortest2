package com.squareup.cash.history.navigation;

import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferPresenter$special$$inlined$map$1$2;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$map$1;
import com.squareup.cash.graphics.swampgl.components.Camera$special$$inlined$map$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class PaymentActionHandler$transform$$inlined$filter$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AppLockMonitor$special$$inlined$map$2 $this_unsafeTransform$inlined;

    public /* synthetic */ PaymentActionHandler$transform$$inlined$filter$1(AppLockMonitor$special$$inlined$map$2 appLockMonitor$special$$inlined$map$2, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = appLockMonitor$special$$inlined$map$2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        AppLockMonitor$special$$inlined$map$2 appLockMonitor$special$$inlined$map$2 = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = appLockMonitor$special$$inlined$map$2.collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, 14), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = appLockMonitor$special$$inlined$map$2.collect(new BitcoinTransferPresenter$special$$inlined$map$1$2(flowCollector, 21), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = appLockMonitor$special$$inlined$map$2.collect(new RealGooglePayer$createWallet$$inlined$map$1.AnonymousClass2(flowCollector, 19), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = appLockMonitor$special$$inlined$map$2.collect(new RealGooglePayer$createWallet$$inlined$map$1.AnonymousClass2(flowCollector, 20), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect5 = appLockMonitor$special$$inlined$map$2.collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, 16), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
