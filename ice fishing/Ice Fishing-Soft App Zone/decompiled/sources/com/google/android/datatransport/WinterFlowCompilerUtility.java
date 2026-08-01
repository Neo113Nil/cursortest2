package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCompilerUtility {
    public static final WinterFlowCompilerUtility WinterFlowRouterRouter;
    public static final /* synthetic */ WinterFlowCompilerUtility[] WinterFlowSyntax;
    public static final WinterFlowCompilerUtility WinterFlowTransactionManagerStrategy;
    public static final WinterFlowCompilerUtility WinterFlowUnitTestResponse;
    public static final WinterFlowCompilerUtility WinterFlowVariableVersionControl;

    /* JADX INFO: Fake field, exist only in values array */
    WinterFlowCompilerUtility EF0;

    static {
        WinterFlowCompilerUtility winterFlowCompilerUtility = new WinterFlowCompilerUtility("MAIN", 0);
        WinterFlowCompilerUtility winterFlowCompilerUtility2 = new WinterFlowCompilerUtility("RULES", 1);
        WinterFlowVariableVersionControl = winterFlowCompilerUtility2;
        WinterFlowCompilerUtility winterFlowCompilerUtility3 = new WinterFlowCompilerUtility("ARCHIVE", 2);
        WinterFlowTransactionManagerStrategy = winterFlowCompilerUtility3;
        WinterFlowCompilerUtility winterFlowCompilerUtility4 = new WinterFlowCompilerUtility("GO", 3);
        WinterFlowUnitTestResponse = winterFlowCompilerUtility4;
        WinterFlowCompilerUtility winterFlowCompilerUtility5 = new WinterFlowCompilerUtility("DIFFICULTY", 4);
        WinterFlowRouterRouter = winterFlowCompilerUtility5;
        WinterFlowSyntax = new WinterFlowCompilerUtility[]{winterFlowCompilerUtility, winterFlowCompilerUtility2, winterFlowCompilerUtility3, winterFlowCompilerUtility4, winterFlowCompilerUtility5};
    }

    public static WinterFlowCompilerUtility valueOf(String str) {
        return (WinterFlowCompilerUtility) Enum.valueOf(WinterFlowCompilerUtility.class, str);
    }

    public static WinterFlowCompilerUtility[] values() {
        return (WinterFlowCompilerUtility[]) WinterFlowSyntax.clone();
    }
}
