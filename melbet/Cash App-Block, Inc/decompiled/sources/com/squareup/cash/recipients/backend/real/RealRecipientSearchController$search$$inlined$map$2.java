package com.squareup.cash.recipients.backend.real;

import app.cash.local.store.real.RealLocalInstalledStore$showGeoTab$$inlined$map$1$2;
import com.squareup.cash.data.contacts.RealContactRepository$contacts$$inlined$map$1;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager$select$$inlined$map$1$2;
import com.squareup.cash.session.backend.RealUrlAuthenticator$special$$inlined$filter$1$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes7.dex */
public final class RealRecipientSearchController$search$$inlined$map$2 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealContactRepository$contacts$$inlined$map$1 $this_unsafeTransform$inlined;

    public /* synthetic */ RealRecipientSearchController$search$$inlined$map$2(RealContactRepository$contacts$$inlined$map$1 realContactRepository$contacts$$inlined$map$1, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = realContactRepository$contacts$$inlined$map$1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        RealContactRepository$contacts$$inlined$map$1 realContactRepository$contacts$$inlined$map$1 = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = realContactRepository$contacts$$inlined$map$1.collect(new RealUrlAuthenticator$special$$inlined$filter$1$2(flowCollector, 5), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = realContactRepository$contacts$$inlined$map$1.collect(new RealLocalInstalledStore$showGeoTab$$inlined$map$1$2(flowCollector, 20), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect3 = realContactRepository$contacts$$inlined$map$1.collect(new RealP2pSettingsManager$select$$inlined$map$1$2(flowCollector, 18), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
