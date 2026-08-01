package com.google.android.datatransport;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProcessorModule implements Executor {
    public static final Handler WinterFlowTransactionManagerStrategy;
    public static final /* synthetic */ WinterFlowProcessorModule[] WinterFlowUnitTestResponse;
    public static final WinterFlowProcessorModule WinterFlowVariableVersionControl;

    static {
        WinterFlowProcessorModule winterFlowProcessorModule = new WinterFlowProcessorModule("INSTANCE", 0);
        WinterFlowVariableVersionControl = winterFlowProcessorModule;
        WinterFlowUnitTestResponse = new WinterFlowProcessorModule[]{winterFlowProcessorModule};
        WinterFlowTransactionManagerStrategy = new Handler(Looper.getMainLooper());
    }

    public static WinterFlowProcessorModule valueOf(String str) {
        return (WinterFlowProcessorModule) Enum.valueOf(WinterFlowProcessorModule.class, str);
    }

    public static WinterFlowProcessorModule[] values() {
        return (WinterFlowProcessorModule[]) WinterFlowUnitTestResponse.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        WinterFlowTransactionManagerStrategy.post(runnable);
    }
}
