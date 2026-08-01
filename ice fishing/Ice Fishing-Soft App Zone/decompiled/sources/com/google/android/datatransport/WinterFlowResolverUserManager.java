package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowResolverUserManager {
    public static final WinterFlowResolverUserManager WinterFlowResponseEngine;
    public static final WinterFlowResolverUserManager WinterFlowRouterRouter;
    public static final /* synthetic */ WinterFlowResolverUserManager[] WinterFlowServerProtocol;
    public static final WinterFlowResolverUserManager WinterFlowSyntax;
    public static final WinterFlowResolverUserManager WinterFlowTransactionAgent;
    public static final WinterFlowResolverUserManager WinterFlowTransactionManagerStrategy;
    public static final WinterFlowResolverUserManager WinterFlowUnitTestResponse;
    public static final WinterFlowResolverUserManager WinterFlowVariableVersionControl;

    static {
        WinterFlowResolverUserManager winterFlowResolverUserManager = new WinterFlowResolverUserManager("Invalid", 0);
        WinterFlowVariableVersionControl = winterFlowResolverUserManager;
        WinterFlowResolverUserManager winterFlowResolverUserManager2 = new WinterFlowResolverUserManager("Cancelled", 1);
        WinterFlowTransactionManagerStrategy = winterFlowResolverUserManager2;
        WinterFlowResolverUserManager winterFlowResolverUserManager3 = new WinterFlowResolverUserManager("InitialPending", 2);
        WinterFlowUnitTestResponse = winterFlowResolverUserManager3;
        WinterFlowResolverUserManager winterFlowResolverUserManager4 = new WinterFlowResolverUserManager("RecomposePending", 3);
        WinterFlowRouterRouter = winterFlowResolverUserManager4;
        WinterFlowResolverUserManager winterFlowResolverUserManager5 = new WinterFlowResolverUserManager("Recomposing", 4);
        WinterFlowSyntax = winterFlowResolverUserManager5;
        WinterFlowResolverUserManager winterFlowResolverUserManager6 = new WinterFlowResolverUserManager("ApplyPending", 5);
        WinterFlowResponseEngine = winterFlowResolverUserManager6;
        WinterFlowResolverUserManager winterFlowResolverUserManager7 = new WinterFlowResolverUserManager("Applied", 6);
        WinterFlowTransactionAgent = winterFlowResolverUserManager7;
        WinterFlowServerProtocol = new WinterFlowResolverUserManager[]{winterFlowResolverUserManager, winterFlowResolverUserManager2, winterFlowResolverUserManager3, winterFlowResolverUserManager4, winterFlowResolverUserManager5, winterFlowResolverUserManager6, winterFlowResolverUserManager7};
    }

    public static WinterFlowResolverUserManager valueOf(String str) {
        return (WinterFlowResolverUserManager) Enum.valueOf(WinterFlowResolverUserManager.class, str);
    }

    public static WinterFlowResolverUserManager[] values() {
        return (WinterFlowResolverUserManager[]) WinterFlowServerProtocol.clone();
    }
}
