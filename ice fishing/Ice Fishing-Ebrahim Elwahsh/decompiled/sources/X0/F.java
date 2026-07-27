package X0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class F {

    /* renamed from: n, reason: collision with root package name */
    public static final F f3643n;

    /* renamed from: u, reason: collision with root package name */
    public static final F f3644u;

    /* renamed from: v, reason: collision with root package name */
    public static final F f3645v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ F[] f3646w;

    static {
        F f6 = new F("AUTOMATIC", 0);
        f3643n = f6;
        F f9 = new F("HARDWARE", 1);
        f3644u = f9;
        F f10 = new F("SOFTWARE", 2);
        f3645v = f10;
        f3646w = new F[]{f6, f9, f10};
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) f3646w.clone();
    }
}
