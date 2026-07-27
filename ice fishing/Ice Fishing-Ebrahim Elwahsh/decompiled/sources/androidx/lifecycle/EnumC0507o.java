package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0507o {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC0507o f5276n;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC0507o f5277u;

    /* renamed from: v, reason: collision with root package name */
    public static final EnumC0507o f5278v;

    /* renamed from: w, reason: collision with root package name */
    public static final EnumC0507o f5279w;

    /* renamed from: x, reason: collision with root package name */
    public static final EnumC0507o f5280x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ EnumC0507o[] f5281y;

    static {
        EnumC0507o enumC0507o = new EnumC0507o("DESTROYED", 0);
        f5276n = enumC0507o;
        EnumC0507o enumC0507o2 = new EnumC0507o("INITIALIZED", 1);
        f5277u = enumC0507o2;
        EnumC0507o enumC0507o3 = new EnumC0507o("CREATED", 2);
        f5278v = enumC0507o3;
        EnumC0507o enumC0507o4 = new EnumC0507o("STARTED", 3);
        f5279w = enumC0507o4;
        EnumC0507o enumC0507o5 = new EnumC0507o("RESUMED", 4);
        f5280x = enumC0507o5;
        f5281y = new EnumC0507o[]{enumC0507o, enumC0507o2, enumC0507o3, enumC0507o4, enumC0507o5};
    }

    public static EnumC0507o valueOf(String str) {
        return (EnumC0507o) Enum.valueOf(EnumC0507o.class, str);
    }

    public static EnumC0507o[] values() {
        return (EnumC0507o[]) f5281y.clone();
    }
}
