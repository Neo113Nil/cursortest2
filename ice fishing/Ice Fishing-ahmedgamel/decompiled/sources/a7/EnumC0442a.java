package a7;

import java.util.Random;
import java.util.function.Supplier;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0442a implements Supplier {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC0442a f4350n;

    /* renamed from: u, reason: collision with root package name */
    public static final Random f4351u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ EnumC0442a[] f4352v;

    static {
        EnumC0442a enumC0442a = new EnumC0442a("INSTANCE", 0);
        f4350n = enumC0442a;
        f4352v = new EnumC0442a[]{enumC0442a};
        f4351u = new Random();
    }

    public static EnumC0442a valueOf(String str) {
        return (EnumC0442a) Enum.valueOf(EnumC0442a.class, str);
    }

    public static EnumC0442a[] values() {
        return (EnumC0442a[]) f4352v.clone();
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return f4351u;
    }
}
