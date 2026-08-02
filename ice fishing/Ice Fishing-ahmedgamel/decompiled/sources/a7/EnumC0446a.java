package a7;

import java.util.Random;
import java.util.function.Supplier;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0446a implements Supplier {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC0446a f4318n;

    /* renamed from: u, reason: collision with root package name */
    public static final Random f4319u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ EnumC0446a[] f4320v;

    static {
        EnumC0446a enumC0446a = new EnumC0446a("INSTANCE", 0);
        f4318n = enumC0446a;
        f4320v = new EnumC0446a[]{enumC0446a};
        f4319u = new Random();
    }

    public static EnumC0446a valueOf(String str) {
        return (EnumC0446a) Enum.valueOf(EnumC0446a.class, str);
    }

    public static EnumC0446a[] values() {
        return (EnumC0446a[]) f4320v.clone();
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return f4319u;
    }
}
