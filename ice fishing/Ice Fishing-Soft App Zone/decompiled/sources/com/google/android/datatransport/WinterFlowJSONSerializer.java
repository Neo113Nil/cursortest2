package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowJSONSerializer {
    public static final /* synthetic */ WinterFlowJSONSerializer[] WinterFlowRouterRouter;
    public static final WinterFlowJSONSerializer WinterFlowTransactionManagerStrategy;
    public static final WinterFlowJSONSerializer WinterFlowUnitTestResponse;
    public static final WinterFlowJSONSerializer WinterFlowVariableVersionControl;

    static {
        WinterFlowJSONSerializer winterFlowJSONSerializer = new WinterFlowJSONSerializer("Initial", 0);
        WinterFlowVariableVersionControl = winterFlowJSONSerializer;
        WinterFlowJSONSerializer winterFlowJSONSerializer2 = new WinterFlowJSONSerializer("Main", 1);
        WinterFlowTransactionManagerStrategy = winterFlowJSONSerializer2;
        WinterFlowJSONSerializer winterFlowJSONSerializer3 = new WinterFlowJSONSerializer("Final", 2);
        WinterFlowUnitTestResponse = winterFlowJSONSerializer3;
        WinterFlowRouterRouter = new WinterFlowJSONSerializer[]{winterFlowJSONSerializer, winterFlowJSONSerializer2, winterFlowJSONSerializer3};
    }

    public static WinterFlowJSONSerializer valueOf(String str) {
        return (WinterFlowJSONSerializer) Enum.valueOf(WinterFlowJSONSerializer.class, str);
    }

    public static WinterFlowJSONSerializer[] values() {
        return (WinterFlowJSONSerializer[]) WinterFlowRouterRouter.clone();
    }
}
