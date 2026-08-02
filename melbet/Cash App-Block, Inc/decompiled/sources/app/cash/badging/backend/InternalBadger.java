package app.cash.badging.backend;

/* loaded from: classes.dex */
public interface InternalBadger {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public final class ClearResult {
        public static final /* synthetic */ ClearResult[] $VALUES;
        public static final ClearResult Failure;
        public static final ClearResult Retry;
        public static final ClearResult Success;

        static {
            ClearResult clearResult = new ClearResult("Success", 0);
            Success = clearResult;
            ClearResult clearResult2 = new ClearResult("Retry", 1);
            Retry = clearResult2;
            ClearResult clearResult3 = new ClearResult("Failure", 2);
            Failure = clearResult3;
            $VALUES = new ClearResult[]{clearResult, clearResult2, clearResult3};
        }

        public static ClearResult valueOf(String str) {
            return (ClearResult) Enum.valueOf(ClearResult.class, str);
        }

        public static ClearResult[] values() {
            return (ClearResult[]) $VALUES.clone();
        }
    }
}
