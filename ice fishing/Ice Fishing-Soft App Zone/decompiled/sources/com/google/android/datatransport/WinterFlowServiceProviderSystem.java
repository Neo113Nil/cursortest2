package com.google.android.datatransport;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowServiceProviderSystem implements IInterface {
    public final String WinterFlowArrayNetwork;
    public final IBinder WinterFlowCacheManagerAgent;

    public WinterFlowServiceProviderSystem(IBinder iBinder, String str) {
        this.WinterFlowCacheManagerAgent = iBinder;
        this.WinterFlowArrayNetwork = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.WinterFlowCacheManagerAgent;
    }
}
