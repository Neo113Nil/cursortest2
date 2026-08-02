package com.squareup.cash.featureflags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ContainerMode {
    public static final /* synthetic */ ContainerMode[] $VALUES = {new ContainerMode("RespectFlag", 0), new ContainerMode("ForceView", 1), new ContainerMode("ForceCompose", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    ContainerMode EF5;

    public static ContainerMode valueOf(String str) {
        return (ContainerMode) Enum.valueOf(ContainerMode.class, str);
    }

    public static ContainerMode[] values() {
        return (ContainerMode[]) $VALUES.clone();
    }
}
