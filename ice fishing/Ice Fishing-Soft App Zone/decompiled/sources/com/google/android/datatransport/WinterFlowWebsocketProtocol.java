package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowWebsocketProtocol {
    public static final /* synthetic */ WinterFlowWebsocketProtocol[] WinterFlowRouterRouter;
    public static final WinterFlowWebsocketProtocol WinterFlowTransactionManagerStrategy;
    public static final WinterFlowWebsocketProtocol WinterFlowUnitTestResponse;
    public static final WinterFlowWebsocketProtocol WinterFlowVariableVersionControl;

    static {
        WinterFlowWebsocketProtocol winterFlowWebsocketProtocol = new WinterFlowWebsocketProtocol("Unknown", 0);
        WinterFlowVariableVersionControl = winterFlowWebsocketProtocol;
        WinterFlowWebsocketProtocol winterFlowWebsocketProtocol2 = new WinterFlowWebsocketProtocol("Dispatching", 1);
        WinterFlowTransactionManagerStrategy = winterFlowWebsocketProtocol2;
        WinterFlowWebsocketProtocol winterFlowWebsocketProtocol3 = new WinterFlowWebsocketProtocol("NotDispatching", 2);
        WinterFlowUnitTestResponse = winterFlowWebsocketProtocol3;
        WinterFlowRouterRouter = new WinterFlowWebsocketProtocol[]{winterFlowWebsocketProtocol, winterFlowWebsocketProtocol2, winterFlowWebsocketProtocol3};
    }

    public static WinterFlowWebsocketProtocol valueOf(String str) {
        return (WinterFlowWebsocketProtocol) Enum.valueOf(WinterFlowWebsocketProtocol.class, str);
    }

    public static WinterFlowWebsocketProtocol[] values() {
        return (WinterFlowWebsocketProtocol[]) WinterFlowRouterRouter.clone();
    }
}
