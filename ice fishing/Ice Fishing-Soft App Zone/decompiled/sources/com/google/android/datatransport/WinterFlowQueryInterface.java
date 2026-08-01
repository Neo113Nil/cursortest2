package com.google.android.datatransport;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowQueryInterface extends ContentObserver {
    public final /* synthetic */ WinterFlowWorkerThreadPool WinterFlowRouterStructure;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowQueryInterface(WinterFlowWorkerThreadPool winterFlowWorkerThreadPool, Handler handler) {
        super(handler);
        this.WinterFlowRouterStructure = winterFlowWorkerThreadPool;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.WinterFlowRouterStructure.WinterFlowUnitTestResponse(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }
}
