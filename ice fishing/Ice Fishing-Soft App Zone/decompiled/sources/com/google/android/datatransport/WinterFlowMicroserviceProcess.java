package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMicroserviceProcess {
    private static final /* synthetic */ WinterFlowBandwidthDebug $ENTRIES;
    private static final /* synthetic */ WinterFlowMicroserviceProcess[] $VALUES;
    public static final WinterFlowDecoratorCache Companion;
    public static final WinterFlowMicroserviceProcess ON_ANY;
    public static final WinterFlowMicroserviceProcess ON_CREATE;
    public static final WinterFlowMicroserviceProcess ON_DESTROY;
    public static final WinterFlowMicroserviceProcess ON_PAUSE;
    public static final WinterFlowMicroserviceProcess ON_RESUME;
    public static final WinterFlowMicroserviceProcess ON_START;
    public static final WinterFlowMicroserviceProcess ON_STOP;

    static {
        WinterFlowMicroserviceProcess winterFlowMicroserviceProcess = new WinterFlowMicroserviceProcess("ON_CREATE", 0);
        ON_CREATE = winterFlowMicroserviceProcess;
        WinterFlowMicroserviceProcess winterFlowMicroserviceProcess2 = new WinterFlowMicroserviceProcess("ON_START", 1);
        ON_START = winterFlowMicroserviceProcess2;
        WinterFlowMicroserviceProcess winterFlowMicroserviceProcess3 = new WinterFlowMicroserviceProcess("ON_RESUME", 2);
        ON_RESUME = winterFlowMicroserviceProcess3;
        WinterFlowMicroserviceProcess winterFlowMicroserviceProcess4 = new WinterFlowMicroserviceProcess("ON_PAUSE", 3);
        ON_PAUSE = winterFlowMicroserviceProcess4;
        WinterFlowMicroserviceProcess winterFlowMicroserviceProcess5 = new WinterFlowMicroserviceProcess("ON_STOP", 4);
        ON_STOP = winterFlowMicroserviceProcess5;
        WinterFlowMicroserviceProcess winterFlowMicroserviceProcess6 = new WinterFlowMicroserviceProcess("ON_DESTROY", 5);
        ON_DESTROY = winterFlowMicroserviceProcess6;
        WinterFlowMicroserviceProcess winterFlowMicroserviceProcess7 = new WinterFlowMicroserviceProcess("ON_ANY", 6);
        ON_ANY = winterFlowMicroserviceProcess7;
        WinterFlowMicroserviceProcess[] winterFlowMicroserviceProcessArr = {winterFlowMicroserviceProcess, winterFlowMicroserviceProcess2, winterFlowMicroserviceProcess3, winterFlowMicroserviceProcess4, winterFlowMicroserviceProcess5, winterFlowMicroserviceProcess6, winterFlowMicroserviceProcess7};
        $VALUES = winterFlowMicroserviceProcessArr;
        $ENTRIES = new WinterFlowServerProtocol(winterFlowMicroserviceProcessArr);
        Companion = new WinterFlowDecoratorCache();
    }

    public static WinterFlowMicroserviceProcess valueOf(String str) {
        return (WinterFlowMicroserviceProcess) Enum.valueOf(WinterFlowMicroserviceProcess.class, str);
    }

    public static WinterFlowMicroserviceProcess[] values() {
        return (WinterFlowMicroserviceProcess[]) $VALUES.clone();
    }

    public final WinterFlowDatabaseProtocol WinterFlowRouterStructure() {
        switch (WinterFlowMiddlewareAlgorithm.WinterFlowRouterStructure[ordinal()]) {
            case 1:
            case 2:
                return WinterFlowDatabaseProtocol.WinterFlowUnitTestResponse;
            case 3:
            case 4:
                return WinterFlowDatabaseProtocol.WinterFlowRouterRouter;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                return WinterFlowDatabaseProtocol.WinterFlowSyntax;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                return WinterFlowDatabaseProtocol.WinterFlowVariableVersionControl;
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                return null;
        }
    }
}
