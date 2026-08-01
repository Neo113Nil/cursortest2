package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowObjectQueue {
    public static final /* synthetic */ WinterFlowObjectQueue[] WinterFlowTransactionManagerStrategy;
    public static final WinterFlowObjectQueue WinterFlowVariableVersionControl;

    static {
        WinterFlowObjectQueue winterFlowObjectQueue = new WinterFlowObjectQueue("DEFAULT", 0);
        WinterFlowVariableVersionControl = winterFlowObjectQueue;
        WinterFlowTransactionManagerStrategy = new WinterFlowObjectQueue[]{winterFlowObjectQueue, new WinterFlowObjectQueue("SIGNED", 1), new WinterFlowObjectQueue("FIXED", 2)};
    }

    public static WinterFlowObjectQueue valueOf(String str) {
        return (WinterFlowObjectQueue) Enum.valueOf(WinterFlowObjectQueue.class, str);
    }

    public static WinterFlowObjectQueue[] values() {
        return (WinterFlowObjectQueue[]) WinterFlowTransactionManagerStrategy.clone();
    }
}
