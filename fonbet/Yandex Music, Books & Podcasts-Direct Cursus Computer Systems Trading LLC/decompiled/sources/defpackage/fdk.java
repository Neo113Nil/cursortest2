package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class fdk {
    public static final /* synthetic */ fdk[] a = {new fdk("CriticalError", 0), new fdk("Unhandled", 1), new fdk("ResponseUnhandled", 2), new fdk("Parse", 3), new fdk("Serialize", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    fdk EF5;

    public static fdk valueOf(String str) {
        return (fdk) Enum.valueOf(fdk.class, str);
    }

    public static fdk[] values() {
        return (fdk[]) a.clone();
    }
}
