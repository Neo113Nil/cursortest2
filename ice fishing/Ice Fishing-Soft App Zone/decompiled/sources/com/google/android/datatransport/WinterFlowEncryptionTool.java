package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowEncryptionTool {
    public static final /* synthetic */ WinterFlowEncryptionTool[] WinterFlowTransactionManagerStrategy;
    public static final WinterFlowEncryptionTool WinterFlowVariableVersionControl;

    static {
        WinterFlowEncryptionTool winterFlowEncryptionTool = new WinterFlowEncryptionTool("Default", 0);
        WinterFlowVariableVersionControl = winterFlowEncryptionTool;
        WinterFlowTransactionManagerStrategy = new WinterFlowEncryptionTool[]{winterFlowEncryptionTool, new WinterFlowEncryptionTool("UserInput", 1), new WinterFlowEncryptionTool("PreventUserInput", 2)};
    }

    public static WinterFlowEncryptionTool valueOf(String str) {
        return (WinterFlowEncryptionTool) Enum.valueOf(WinterFlowEncryptionTool.class, str);
    }

    public static WinterFlowEncryptionTool[] values() {
        return (WinterFlowEncryptionTool[]) WinterFlowTransactionManagerStrategy.clone();
    }
}
