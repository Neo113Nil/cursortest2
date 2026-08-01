package com.google.android.datatransport;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDeserializationSubsystem {
    public static final /* synthetic */ WinterFlowDeserializationSubsystem[] WinterFlowTransactionManagerStrategy;
    public static final WinterFlowDeserializationSubsystem WinterFlowVariableVersionControl;

    static {
        WinterFlowDeserializationSubsystem winterFlowDeserializationSubsystem = new WinterFlowDeserializationSubsystem("DEFAULT", 0);
        WinterFlowVariableVersionControl = winterFlowDeserializationSubsystem;
        WinterFlowDeserializationSubsystem winterFlowDeserializationSubsystem2 = new WinterFlowDeserializationSubsystem("UNMETERED_ONLY", 1);
        WinterFlowDeserializationSubsystem winterFlowDeserializationSubsystem3 = new WinterFlowDeserializationSubsystem("UNMETERED_OR_DAILY", 2);
        WinterFlowDeserializationSubsystem winterFlowDeserializationSubsystem4 = new WinterFlowDeserializationSubsystem("FAST_IF_RADIO_AWAKE", 3);
        WinterFlowDeserializationSubsystem winterFlowDeserializationSubsystem5 = new WinterFlowDeserializationSubsystem("NEVER", 4);
        WinterFlowDeserializationSubsystem winterFlowDeserializationSubsystem6 = new WinterFlowDeserializationSubsystem("UNRECOGNIZED", 5);
        WinterFlowTransactionManagerStrategy = new WinterFlowDeserializationSubsystem[]{winterFlowDeserializationSubsystem, winterFlowDeserializationSubsystem2, winterFlowDeserializationSubsystem3, winterFlowDeserializationSubsystem4, winterFlowDeserializationSubsystem5, winterFlowDeserializationSubsystem6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, winterFlowDeserializationSubsystem);
        sparseArray.put(1, winterFlowDeserializationSubsystem2);
        sparseArray.put(2, winterFlowDeserializationSubsystem3);
        sparseArray.put(3, winterFlowDeserializationSubsystem4);
        sparseArray.put(4, winterFlowDeserializationSubsystem5);
        sparseArray.put(-1, winterFlowDeserializationSubsystem6);
    }

    public static WinterFlowDeserializationSubsystem valueOf(String str) {
        return (WinterFlowDeserializationSubsystem) Enum.valueOf(WinterFlowDeserializationSubsystem.class, str);
    }

    public static WinterFlowDeserializationSubsystem[] values() {
        return (WinterFlowDeserializationSubsystem[]) WinterFlowTransactionManagerStrategy.clone();
    }
}
