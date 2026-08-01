package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSoftwareManager {
    public static final /* synthetic */ WinterFlowSoftwareManager[] WinterFlowRouterRouter;
    public static final WinterFlowSoftwareManager WinterFlowTransactionManagerStrategy;
    public static final WinterFlowSoftwareManager WinterFlowUnitTestResponse;
    public static final WinterFlowSoftwareManager WinterFlowVariableVersionControl;

    static {
        WinterFlowSoftwareManager winterFlowSoftwareManager = new WinterFlowSoftwareManager("ContinueTraversal", 0);
        WinterFlowVariableVersionControl = winterFlowSoftwareManager;
        WinterFlowSoftwareManager winterFlowSoftwareManager2 = new WinterFlowSoftwareManager("SkipSubtreeAndContinueTraversal", 1);
        WinterFlowTransactionManagerStrategy = winterFlowSoftwareManager2;
        WinterFlowSoftwareManager winterFlowSoftwareManager3 = new WinterFlowSoftwareManager("CancelTraversal", 2);
        WinterFlowUnitTestResponse = winterFlowSoftwareManager3;
        WinterFlowRouterRouter = new WinterFlowSoftwareManager[]{winterFlowSoftwareManager, winterFlowSoftwareManager2, winterFlowSoftwareManager3};
    }

    public static WinterFlowSoftwareManager valueOf(String str) {
        return (WinterFlowSoftwareManager) Enum.valueOf(WinterFlowSoftwareManager.class, str);
    }

    public static WinterFlowSoftwareManager[] values() {
        return (WinterFlowSoftwareManager[]) WinterFlowRouterRouter.clone();
    }
}
