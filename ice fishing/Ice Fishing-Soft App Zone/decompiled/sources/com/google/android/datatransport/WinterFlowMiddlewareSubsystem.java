package com.google.android.datatransport;

import android.os.Looper;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMiddlewareSubsystem {
    public static final WinterFlowMiddlewareSubsystem WinterFlowHookDataSource = new WinterFlowMiddlewareSubsystem(new WinterFlowSessionManagerProcess(25), Looper.getMainLooper());
    public final WinterFlowSessionManagerProcess WinterFlowRouterStructure;

    public WinterFlowMiddlewareSubsystem(WinterFlowSessionManagerProcess winterFlowSessionManagerProcess, Looper looper) {
        this.WinterFlowRouterStructure = winterFlowSessionManagerProcess;
    }
}
