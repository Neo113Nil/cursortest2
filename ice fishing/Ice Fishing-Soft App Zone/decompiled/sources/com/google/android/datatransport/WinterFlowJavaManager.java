package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowJavaManager {
    public static final /* synthetic */ WinterFlowServerProtocol WinterFlowResponseEngine;
    public static final WinterFlowJavaManager WinterFlowRouterRouter;
    public static final /* synthetic */ WinterFlowJavaManager[] WinterFlowSyntax;
    public final int WinterFlowTransactionManagerStrategy;
    public final int WinterFlowUnitTestResponse;
    public final int WinterFlowVariableVersionControl;

    static {
        WinterFlowJavaManager winterFlowJavaManager = new WinterFlowJavaManager("EASY", 0, 10, 30, 0);
        WinterFlowRouterRouter = winterFlowJavaManager;
        WinterFlowJavaManager[] winterFlowJavaManagerArr = {winterFlowJavaManager, new WinterFlowJavaManager("NORMAL", 1, 20, 40, 150), new WinterFlowJavaManager("HARD", 2, 40, 50, 300), new WinterFlowJavaManager("EXTREME", 3, 60, 60, 500)};
        WinterFlowSyntax = winterFlowJavaManagerArr;
        WinterFlowResponseEngine = new WinterFlowServerProtocol(winterFlowJavaManagerArr);
    }

    public WinterFlowJavaManager(String str, int i, int i2, int i3, int i4) {
        this.WinterFlowVariableVersionControl = i2;
        this.WinterFlowTransactionManagerStrategy = i3;
        this.WinterFlowUnitTestResponse = i4;
    }

    public static WinterFlowJavaManager valueOf(String str) {
        return (WinterFlowJavaManager) Enum.valueOf(WinterFlowJavaManager.class, str);
    }

    public static WinterFlowJavaManager[] values() {
        return (WinterFlowJavaManager[]) WinterFlowSyntax.clone();
    }
}
