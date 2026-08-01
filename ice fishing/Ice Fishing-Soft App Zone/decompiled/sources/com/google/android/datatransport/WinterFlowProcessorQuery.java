package com.google.android.datatransport;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProcessorQuery extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService WinterFlowRouterStructure;

    public WinterFlowProcessorQuery(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.WinterFlowRouterStructure = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        ((WinterFlowVersionProvider) iInterface).getClass();
        obj.getClass();
        this.WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy.remove((Integer) obj);
    }
}
