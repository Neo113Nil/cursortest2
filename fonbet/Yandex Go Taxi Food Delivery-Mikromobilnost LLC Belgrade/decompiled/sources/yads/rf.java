package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class rf {
    public static final rf b;
    public static final rf c;
    public static final rf d;
    public static final /* synthetic */ rf[] e;

    static {
        rf rfVar = new rf("UNKNOWN", 0);
        b = rfVar;
        rf rfVar2 = new rf("NETWORK", 1);
        c = rfVar2;
        rf rfVar3 = new rf("INVALID_RESPONSE", 2);
        d = rfVar3;
        e = new rf[]{rfVar, rfVar2, rfVar3};
    }

    public static rf valueOf(String str) {
        return (rf) Enum.valueOf(rf.class, str);
    }

    public static rf[] values() {
        return (rf[]) e.clone();
    }
}
