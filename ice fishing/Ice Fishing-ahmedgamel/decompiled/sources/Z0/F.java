package Z0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class F {

    /* renamed from: n, reason: collision with root package name */
    public static final F f3939n;

    /* renamed from: u, reason: collision with root package name */
    public static final F f3940u;

    /* renamed from: v, reason: collision with root package name */
    public static final F f3941v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ F[] f3942w;

    static {
        F f2 = new F("AUTOMATIC", 0);
        f3939n = f2;
        F f9 = new F("HARDWARE", 1);
        f3940u = f9;
        F f10 = new F("SOFTWARE", 2);
        f3941v = f10;
        f3942w = new F[]{f2, f9, f10};
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) f3942w.clone();
    }
}
