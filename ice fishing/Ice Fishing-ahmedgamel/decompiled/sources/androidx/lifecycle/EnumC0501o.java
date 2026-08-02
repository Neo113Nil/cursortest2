package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0501o {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC0501o f5131n;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC0501o f5132u;

    /* renamed from: v, reason: collision with root package name */
    public static final EnumC0501o f5133v;

    /* renamed from: w, reason: collision with root package name */
    public static final EnumC0501o f5134w;

    /* renamed from: x, reason: collision with root package name */
    public static final EnumC0501o f5135x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ EnumC0501o[] f5136y;

    static {
        EnumC0501o enumC0501o = new EnumC0501o("DESTROYED", 0);
        f5131n = enumC0501o;
        EnumC0501o enumC0501o2 = new EnumC0501o("INITIALIZED", 1);
        f5132u = enumC0501o2;
        EnumC0501o enumC0501o3 = new EnumC0501o("CREATED", 2);
        f5133v = enumC0501o3;
        EnumC0501o enumC0501o4 = new EnumC0501o("STARTED", 3);
        f5134w = enumC0501o4;
        EnumC0501o enumC0501o5 = new EnumC0501o("RESUMED", 4);
        f5135x = enumC0501o5;
        f5136y = new EnumC0501o[]{enumC0501o, enumC0501o2, enumC0501o3, enumC0501o4, enumC0501o5};
    }

    public static EnumC0501o valueOf(String str) {
        return (EnumC0501o) Enum.valueOf(EnumC0501o.class, str);
    }

    public static EnumC0501o[] values() {
        return (EnumC0501o[]) f5136y.clone();
    }
}
