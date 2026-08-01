package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowUnitTestNode {
    public static final /* synthetic */ WinterFlowUnitTestNode[] WinterFlowTransactionManagerStrategy;
    public static final WinterFlowUnitTestNode WinterFlowVariableVersionControl;

    static {
        WinterFlowUnitTestNode winterFlowUnitTestNode = new WinterFlowUnitTestNode("Inherit", 0);
        WinterFlowVariableVersionControl = winterFlowUnitTestNode;
        WinterFlowTransactionManagerStrategy = new WinterFlowUnitTestNode[]{winterFlowUnitTestNode, new WinterFlowUnitTestNode("SecureOn", 1), new WinterFlowUnitTestNode("SecureOff", 2)};
    }

    public static WinterFlowUnitTestNode valueOf(String str) {
        return (WinterFlowUnitTestNode) Enum.valueOf(WinterFlowUnitTestNode.class, str);
    }

    public static WinterFlowUnitTestNode[] values() {
        return (WinterFlowUnitTestNode[]) WinterFlowTransactionManagerStrategy.clone();
    }
}
