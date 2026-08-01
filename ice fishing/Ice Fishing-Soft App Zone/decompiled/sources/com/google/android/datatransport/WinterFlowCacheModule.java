package com.google.android.datatransport;

import java.util.ArrayDeque;
import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCacheModule {
    public Object WinterFlowCacheManagerAgent;
    public final Object WinterFlowHookDataSource;
    public boolean WinterFlowRouterStructure;

    public WinterFlowCacheModule() {
        this.WinterFlowHookDataSource = new Object();
    }

    public void WinterFlowCacheManagerAgent(WinterFlowExceptionParser winterFlowExceptionParser) {
        WinterFlowObjectPlatform winterFlowObjectPlatform;
        synchronized (this.WinterFlowHookDataSource) {
            if (((ArrayDeque) this.WinterFlowCacheManagerAgent) != null && !this.WinterFlowRouterStructure) {
                this.WinterFlowRouterStructure = true;
                while (true) {
                    synchronized (this.WinterFlowHookDataSource) {
                        try {
                            winterFlowObjectPlatform = (WinterFlowObjectPlatform) ((ArrayDeque) this.WinterFlowCacheManagerAgent).poll();
                            if (winterFlowObjectPlatform == null) {
                                this.WinterFlowRouterStructure = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    winterFlowObjectPlatform.WinterFlowRouterStructure(winterFlowExceptionParser);
                }
            }
        }
    }

    public void WinterFlowHookDataSource(WinterFlowObjectPlatform winterFlowObjectPlatform) {
        synchronized (this.WinterFlowHookDataSource) {
            try {
                ArrayDeque arrayDeque = (ArrayDeque) this.WinterFlowCacheManagerAgent;
                if (arrayDeque == null) {
                    arrayDeque = new ArrayDeque();
                    this.WinterFlowCacheManagerAgent = arrayDeque;
                }
                arrayDeque.add(winterFlowObjectPlatform);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean WinterFlowRouterStructure(long j) {
        Object obj;
        ArrayList arrayList = (ArrayList) ((WinterFlowAlgorithmArray) this.WinterFlowCacheManagerAgent).WinterFlowTransactionManagerStrategy;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            if (WinterFlowServerManager.WinterFlowConcurrencyThread(((WinterFlowClassSubsystem) obj).WinterFlowRouterStructure, j)) {
                break;
            }
            i++;
        }
        WinterFlowClassSubsystem winterFlowClassSubsystem = (WinterFlowClassSubsystem) obj;
        if (winterFlowClassSubsystem != null) {
            return winterFlowClassSubsystem.WinterFlowRouterRouter;
        }
        return false;
    }

    public WinterFlowCacheModule(WinterFlowDatabaseRenderer winterFlowDatabaseRenderer, WinterFlowAlgorithmArray winterFlowAlgorithmArray) {
        this.WinterFlowHookDataSource = winterFlowDatabaseRenderer;
        this.WinterFlowCacheManagerAgent = winterFlowAlgorithmArray;
    }
}
