package com.combinations.level.experts.core.domain.model;

import defpackage.ki1;
import defpackage.oq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ConduitShape {
    private static final /* synthetic */ oq $ENTRIES;
    private static final /* synthetic */ ConduitShape[] $VALUES;
    public static final ConduitShape EMPTY = new ConduitShape("EMPTY", 0);
    public static final ConduitShape TERMINAL = new ConduitShape("TERMINAL", 1);
    public static final ConduitShape ELBOW = new ConduitShape("ELBOW", 2);
    public static final ConduitShape STRAIGHT = new ConduitShape("STRAIGHT", 3);
    public static final ConduitShape TEE = new ConduitShape("TEE", 4);
    public static final ConduitShape CROSS = new ConduitShape("CROSS", 5);

    private static final /* synthetic */ ConduitShape[] $values() {
        return new ConduitShape[]{EMPTY, TERMINAL, ELBOW, STRAIGHT, TEE, CROSS};
    }

    static {
        ConduitShape[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ki1.M3K9sHhK($values);
    }

    private ConduitShape(String str, int i) {
    }

    public static oq getEntries() {
        return $ENTRIES;
    }

    public static ConduitShape valueOf(String str) {
        return (ConduitShape) Enum.valueOf(ConduitShape.class, str);
    }

    public static ConduitShape[] values() {
        return (ConduitShape[]) $VALUES.clone();
    }
}
