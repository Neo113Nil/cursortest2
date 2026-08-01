package q7;

import a7.EnumC0442a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4936e {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC4936e f40262n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ EnumC4936e[] f40263u;

    static {
        EnumC4936e enumC4936e = new EnumC4936e("INSTANCE", 0);
        f40262n = enumC4936e;
        f40263u = new EnumC4936e[]{enumC4936e};
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            EnumC0442a enumC0442a = EnumC0442a.f4350n;
        } else {
            new H5.a(11);
        }
    }

    public static EnumC4936e valueOf(String str) {
        return (EnumC4936e) Enum.valueOf(EnumC4936e.class, str);
    }

    public static EnumC4936e[] values() {
        return (EnumC4936e[]) f40263u.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "RandomIdGenerator{}";
    }
}
