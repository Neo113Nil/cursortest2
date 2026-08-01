package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSessionSystem {
    public static final /* synthetic */ WinterFlowSessionSystem[] WinterFlowTransactionManagerStrategy;
    public static final WinterFlowSessionSystem WinterFlowVariableVersionControl;

    /* JADX INFO: Fake field, exist only in values array */
    WinterFlowSessionSystem EF0;

    static {
        WinterFlowSessionSystem winterFlowSessionSystem = new WinterFlowSessionSystem("UNKNOWN", 0);
        WinterFlowSessionSystem winterFlowSessionSystem2 = new WinterFlowSessionSystem("ANDROID_FIREBASE", 1);
        WinterFlowVariableVersionControl = winterFlowSessionSystem2;
        WinterFlowTransactionManagerStrategy = new WinterFlowSessionSystem[]{winterFlowSessionSystem, winterFlowSessionSystem2};
    }

    public static WinterFlowSessionSystem valueOf(String str) {
        return (WinterFlowSessionSystem) Enum.valueOf(WinterFlowSessionSystem.class, str);
    }

    public static WinterFlowSessionSystem[] values() {
        return (WinterFlowSessionSystem[]) WinterFlowTransactionManagerStrategy.clone();
    }
}
