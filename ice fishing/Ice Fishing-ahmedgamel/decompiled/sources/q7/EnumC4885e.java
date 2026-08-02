package q7;

import a7.EnumC0446a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4885e {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC4885e f40073n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ EnumC4885e[] f40074u;

    static {
        EnumC4885e enumC4885e = new EnumC4885e("INSTANCE", 0);
        f40073n = enumC4885e;
        f40074u = new EnumC4885e[]{enumC4885e};
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            EnumC0446a enumC0446a = EnumC0446a.f4318n;
        } else {
            new H5.a(11);
        }
    }

    public static EnumC4885e valueOf(String str) {
        return (EnumC4885e) Enum.valueOf(EnumC4885e.class, str);
    }

    public static EnumC4885e[] values() {
        return (EnumC4885e[]) f40074u.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "RandomIdGenerator{}";
    }
}
