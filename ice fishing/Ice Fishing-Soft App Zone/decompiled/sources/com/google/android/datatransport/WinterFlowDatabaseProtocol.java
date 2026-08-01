package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDatabaseProtocol {
    public static final /* synthetic */ WinterFlowDatabaseProtocol[] WinterFlowResponseEngine;
    public static final WinterFlowDatabaseProtocol WinterFlowRouterRouter;
    public static final WinterFlowDatabaseProtocol WinterFlowSyntax;
    public static final WinterFlowDatabaseProtocol WinterFlowTransactionManagerStrategy;
    public static final WinterFlowDatabaseProtocol WinterFlowUnitTestResponse;
    public static final WinterFlowDatabaseProtocol WinterFlowVariableVersionControl;

    static {
        WinterFlowDatabaseProtocol winterFlowDatabaseProtocol = new WinterFlowDatabaseProtocol("DESTROYED", 0);
        WinterFlowVariableVersionControl = winterFlowDatabaseProtocol;
        WinterFlowDatabaseProtocol winterFlowDatabaseProtocol2 = new WinterFlowDatabaseProtocol("INITIALIZED", 1);
        WinterFlowTransactionManagerStrategy = winterFlowDatabaseProtocol2;
        WinterFlowDatabaseProtocol winterFlowDatabaseProtocol3 = new WinterFlowDatabaseProtocol("CREATED", 2);
        WinterFlowUnitTestResponse = winterFlowDatabaseProtocol3;
        WinterFlowDatabaseProtocol winterFlowDatabaseProtocol4 = new WinterFlowDatabaseProtocol("STARTED", 3);
        WinterFlowRouterRouter = winterFlowDatabaseProtocol4;
        WinterFlowDatabaseProtocol winterFlowDatabaseProtocol5 = new WinterFlowDatabaseProtocol("RESUMED", 4);
        WinterFlowSyntax = winterFlowDatabaseProtocol5;
        WinterFlowResponseEngine = new WinterFlowDatabaseProtocol[]{winterFlowDatabaseProtocol, winterFlowDatabaseProtocol2, winterFlowDatabaseProtocol3, winterFlowDatabaseProtocol4, winterFlowDatabaseProtocol5};
    }

    public static WinterFlowDatabaseProtocol valueOf(String str) {
        return (WinterFlowDatabaseProtocol) Enum.valueOf(WinterFlowDatabaseProtocol.class, str);
    }

    public static WinterFlowDatabaseProtocol[] values() {
        return (WinterFlowDatabaseProtocol[]) WinterFlowResponseEngine.clone();
    }
}
