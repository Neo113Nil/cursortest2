package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0497o {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC0497o f5164n;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC0497o f5165u;

    /* renamed from: v, reason: collision with root package name */
    public static final EnumC0497o f5166v;

    /* renamed from: w, reason: collision with root package name */
    public static final EnumC0497o f5167w;

    /* renamed from: x, reason: collision with root package name */
    public static final EnumC0497o f5168x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ EnumC0497o[] f5169y;

    static {
        EnumC0497o enumC0497o = new EnumC0497o("DESTROYED", 0);
        f5164n = enumC0497o;
        EnumC0497o enumC0497o2 = new EnumC0497o("INITIALIZED", 1);
        f5165u = enumC0497o2;
        EnumC0497o enumC0497o3 = new EnumC0497o("CREATED", 2);
        f5166v = enumC0497o3;
        EnumC0497o enumC0497o4 = new EnumC0497o("STARTED", 3);
        f5167w = enumC0497o4;
        EnumC0497o enumC0497o5 = new EnumC0497o("RESUMED", 4);
        f5168x = enumC0497o5;
        f5169y = new EnumC0497o[]{enumC0497o, enumC0497o2, enumC0497o3, enumC0497o4, enumC0497o5};
    }

    public static EnumC0497o valueOf(String str) {
        return (EnumC0497o) Enum.valueOf(EnumC0497o.class, str);
    }

    public static EnumC0497o[] values() {
        return (EnumC0497o[]) f5169y.clone();
    }
}
