package com.squareup.cash.pools.backend.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class CreatePoolFailureReason {
    public static final /* synthetic */ CreatePoolFailureReason[] $VALUES;
    public static final CreatePoolFailureReason GENERIC;
    public static final CreatePoolFailureReason INVALID_NAME;
    public static final CreatePoolFailureReason MAX_OPEN_POOL_LIMIT;
    public static final CreatePoolFailureReason REQUIRES_IDV;
    public static final CreatePoolFailureReason RISK_BLOCKED;
    public static final CreatePoolFailureReason RISK_BLOCKED_ELIGIBILITY;

    static {
        CreatePoolFailureReason createPoolFailureReason = new CreatePoolFailureReason("INVALID_NAME", 0);
        INVALID_NAME = createPoolFailureReason;
        CreatePoolFailureReason createPoolFailureReason2 = new CreatePoolFailureReason("MAX_OPEN_POOL_LIMIT", 1);
        MAX_OPEN_POOL_LIMIT = createPoolFailureReason2;
        CreatePoolFailureReason createPoolFailureReason3 = new CreatePoolFailureReason("REQUIRES_IDV", 2);
        REQUIRES_IDV = createPoolFailureReason3;
        CreatePoolFailureReason createPoolFailureReason4 = new CreatePoolFailureReason("RISK_BLOCKED", 3);
        RISK_BLOCKED = createPoolFailureReason4;
        CreatePoolFailureReason createPoolFailureReason5 = new CreatePoolFailureReason("RISK_BLOCKED_ELIGIBILITY", 4);
        RISK_BLOCKED_ELIGIBILITY = createPoolFailureReason5;
        CreatePoolFailureReason createPoolFailureReason6 = new CreatePoolFailureReason("GENERIC", 5);
        GENERIC = createPoolFailureReason6;
        $VALUES = new CreatePoolFailureReason[]{createPoolFailureReason, createPoolFailureReason2, createPoolFailureReason3, createPoolFailureReason4, createPoolFailureReason5, createPoolFailureReason6};
    }

    public static CreatePoolFailureReason valueOf(String str) {
        return (CreatePoolFailureReason) Enum.valueOf(CreatePoolFailureReason.class, str);
    }

    public static CreatePoolFailureReason[] values() {
        return (CreatePoolFailureReason[]) $VALUES.clone();
    }
}
