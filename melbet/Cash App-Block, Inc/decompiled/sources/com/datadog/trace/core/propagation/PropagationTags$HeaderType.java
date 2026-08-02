package com.datadog.trace.core.propagation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PropagationTags$HeaderType {
    public static final /* synthetic */ PropagationTags$HeaderType[] $VALUES;
    public static final PropagationTags$HeaderType DATADOG;
    public static final PropagationTags$HeaderType W3C;
    public static final int numValues;

    static {
        PropagationTags$HeaderType propagationTags$HeaderType = new PropagationTags$HeaderType("DATADOG", 0);
        DATADOG = propagationTags$HeaderType;
        PropagationTags$HeaderType propagationTags$HeaderType2 = new PropagationTags$HeaderType("W3C", 1);
        W3C = propagationTags$HeaderType2;
        $VALUES = new PropagationTags$HeaderType[]{propagationTags$HeaderType, propagationTags$HeaderType2};
        numValues = values().length;
    }

    public static PropagationTags$HeaderType valueOf(String str) {
        return (PropagationTags$HeaderType) Enum.valueOf(PropagationTags$HeaderType.class, str);
    }

    public static PropagationTags$HeaderType[] values() {
        return (PropagationTags$HeaderType[]) $VALUES.clone();
    }
}
