package com.squareup.cash.payments.backend.api;

/* loaded from: classes.dex */
public interface OfflineManager {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class RemovalReason {
        public static final /* synthetic */ RemovalReason[] $VALUES;
        public static final RemovalReason Cancelled;
        public static final RemovalReason NonRetriableError;
        public static final RemovalReason RetrySuccessful;
        public static final RemovalReason SignOut;

        static {
            RemovalReason removalReason = new RemovalReason("RetrySuccessful", 0);
            RetrySuccessful = removalReason;
            RemovalReason removalReason2 = new RemovalReason("Cancelled", 1);
            Cancelled = removalReason2;
            RemovalReason removalReason3 = new RemovalReason("SignOut", 2);
            SignOut = removalReason3;
            RemovalReason removalReason4 = new RemovalReason("NonRetriableError", 3);
            NonRetriableError = removalReason4;
            $VALUES = new RemovalReason[]{removalReason, removalReason2, removalReason3, removalReason4, new RemovalReason("RemoteClearAppData", 4)};
        }

        public static RemovalReason valueOf(String str) {
            return (RemovalReason) Enum.valueOf(RemovalReason.class, str);
        }

        public static RemovalReason[] values() {
            return (RemovalReason[]) $VALUES.clone();
        }
    }
}
