package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0097n {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0097n f2038a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0097n f2039b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0097n f2040c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0097n f2041d;
    public static final EnumC0097n e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0097n[] f2042f;

    static {
        EnumC0097n enumC0097n = new EnumC0097n("DESTROYED", 0);
        f2038a = enumC0097n;
        EnumC0097n enumC0097n2 = new EnumC0097n("INITIALIZED", 1);
        f2039b = enumC0097n2;
        EnumC0097n enumC0097n3 = new EnumC0097n("CREATED", 2);
        f2040c = enumC0097n3;
        EnumC0097n enumC0097n4 = new EnumC0097n("STARTED", 3);
        f2041d = enumC0097n4;
        EnumC0097n enumC0097n5 = new EnumC0097n("RESUMED", 4);
        e = enumC0097n5;
        f2042f = new EnumC0097n[]{enumC0097n, enumC0097n2, enumC0097n3, enumC0097n4, enumC0097n5};
    }

    public static EnumC0097n valueOf(String str) {
        return (EnumC0097n) Enum.valueOf(EnumC0097n.class, str);
    }

    public static EnumC0097n[] values() {
        return (EnumC0097n[]) f2042f.clone();
    }
}
