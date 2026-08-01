package com.google.android.datatransport;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowXMLSubsystem implements ServiceConnection {
    public final long WinterFlowRouterStructure;
    public boolean WinterFlowHookDataSource = false;
    public final LinkedBlockingQueue WinterFlowCacheManagerAgent = new LinkedBlockingQueue(1);

    public WinterFlowXMLSubsystem(long j) {
        this.WinterFlowRouterStructure = j;
    }

    public final IBinder WinterFlowRouterStructure() {
        if (this.WinterFlowHookDataSource) {
            throw new IllegalStateException();
        }
        this.WinterFlowHookDataSource = true;
        return (IBinder) this.WinterFlowCacheManagerAgent.poll(this.WinterFlowRouterStructure, TimeUnit.MILLISECONDS);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.WinterFlowCacheManagerAgent.put(iBinder);
        } catch (InterruptedException unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
