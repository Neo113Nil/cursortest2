package com.google.android.datatransport;

import android.content.Context;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowFrontendIDE {
    public static final WinterFlowFrontendIDE WinterFlowHookDataSource;
    public WinterFlowEventWorker WinterFlowRouterStructure;

    static {
        WinterFlowFrontendIDE winterFlowFrontendIDE = new WinterFlowFrontendIDE();
        winterFlowFrontendIDE.WinterFlowRouterStructure = null;
        WinterFlowHookDataSource = winterFlowFrontendIDE;
    }

    public static WinterFlowEventWorker WinterFlowRouterStructure(Context context) {
        WinterFlowEventWorker winterFlowEventWorker;
        WinterFlowFrontendIDE winterFlowFrontendIDE = WinterFlowHookDataSource;
        synchronized (winterFlowFrontendIDE) {
            try {
                winterFlowEventWorker = winterFlowFrontendIDE.WinterFlowRouterStructure;
                if (winterFlowEventWorker == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    winterFlowEventWorker = new WinterFlowEventWorker(context, 2);
                    winterFlowFrontendIDE.WinterFlowRouterStructure = winterFlowEventWorker;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return winterFlowEventWorker;
    }
}
