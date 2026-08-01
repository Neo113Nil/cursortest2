package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowArrayInterface {
    public static final WinterFlowArrayInterface WinterFlowTransactionManagerStrategy;
    public static final /* synthetic */ WinterFlowArrayInterface[] WinterFlowUnitTestResponse;
    public static final WinterFlowArrayInterface WinterFlowVariableVersionControl;

    /* JADX INFO: Fake field, exist only in values array */
    WinterFlowArrayInterface EF0;

    static {
        WinterFlowArrayInterface winterFlowArrayInterface = new WinterFlowArrayInterface("SYNCHRONIZED", 0);
        WinterFlowArrayInterface winterFlowArrayInterface2 = new WinterFlowArrayInterface("PUBLICATION", 1);
        WinterFlowVariableVersionControl = winterFlowArrayInterface2;
        WinterFlowArrayInterface winterFlowArrayInterface3 = new WinterFlowArrayInterface("NONE", 2);
        WinterFlowTransactionManagerStrategy = winterFlowArrayInterface3;
        WinterFlowUnitTestResponse = new WinterFlowArrayInterface[]{winterFlowArrayInterface, winterFlowArrayInterface2, winterFlowArrayInterface3};
    }

    public static WinterFlowArrayInterface valueOf(String str) {
        return (WinterFlowArrayInterface) Enum.valueOf(WinterFlowArrayInterface.class, str);
    }

    public static WinterFlowArrayInterface[] values() {
        return (WinterFlowArrayInterface[]) WinterFlowUnitTestResponse.clone();
    }
}
