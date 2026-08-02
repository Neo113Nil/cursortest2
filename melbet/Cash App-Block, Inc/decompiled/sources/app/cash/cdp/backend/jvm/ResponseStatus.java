package app.cash.cdp.backend.jvm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ResponseStatus {
    public static final /* synthetic */ ResponseStatus[] $VALUES;
    public static final ResponseStatus RECOVERABLE_FAILURE;
    public static final ResponseStatus SUCCESS;
    public static final ResponseStatus UNRECOVERABLE_FAILURE;

    static {
        ResponseStatus responseStatus = new ResponseStatus("SUCCESS", 0);
        SUCCESS = responseStatus;
        ResponseStatus responseStatus2 = new ResponseStatus("RECOVERABLE_FAILURE", 1);
        RECOVERABLE_FAILURE = responseStatus2;
        ResponseStatus responseStatus3 = new ResponseStatus("UNRECOVERABLE_FAILURE", 2);
        UNRECOVERABLE_FAILURE = responseStatus3;
        $VALUES = new ResponseStatus[]{responseStatus, responseStatus2, responseStatus3};
    }

    public static ResponseStatus valueOf(String str) {
        return (ResponseStatus) Enum.valueOf(ResponseStatus.class, str);
    }

    public static ResponseStatus[] values() {
        return (ResponseStatus[]) $VALUES.clone();
    }
}
