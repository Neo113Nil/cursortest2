package com.squareup.cash.blockers.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class BlockerExitStatus {
    public static final /* synthetic */ BlockerExitStatus[] $VALUES;
    public static final BlockerExitStatus CANCELLED;
    public static final BlockerExitStatus FINISHED;

    static {
        BlockerExitStatus blockerExitStatus = new BlockerExitStatus("CANCELLED", 0);
        CANCELLED = blockerExitStatus;
        BlockerExitStatus blockerExitStatus2 = new BlockerExitStatus("FINISHED", 1);
        FINISHED = blockerExitStatus2;
        $VALUES = new BlockerExitStatus[]{blockerExitStatus, blockerExitStatus2, new BlockerExitStatus("FAILED", 2), new BlockerExitStatus("ABANDONED", 3)};
    }

    public static BlockerExitStatus valueOf(String str) {
        return (BlockerExitStatus) Enum.valueOf(BlockerExitStatus.class, str);
    }

    public static BlockerExitStatus[] values() {
        return (BlockerExitStatus[]) $VALUES.clone();
    }
}
