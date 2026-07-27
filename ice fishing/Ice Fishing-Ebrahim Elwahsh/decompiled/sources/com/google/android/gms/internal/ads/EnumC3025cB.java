package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.google.android.gms.internal.ads.cB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3025cB implements InterfaceC2916aB {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC3025cB f29647n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ EnumC3025cB[] f29648u;

    static {
        EnumC3025cB enumC3025cB = new EnumC3025cB("ALWAYS_TRUE", 0);
        f29647n = enumC3025cB;
        f29648u = new EnumC3025cB[]{enumC3025cB, new EnumC3025cB("ALWAYS_FALSE", 1), new EnumC3025cB("IS_NULL", 2), new EnumC3025cB("NOT_NULL", 3)};
    }

    public static EnumC3025cB[] values() {
        return (EnumC3025cB[]) f29648u.clone();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2916aB
    public final /* synthetic */ boolean b(Object obj) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return obj != null;
                }
                throw null;
            }
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Enum
    public final /* synthetic */ String toString() {
        int ordinal = ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? super.toString() : "Predicates.notNull()" : "Predicates.isNull()" : "Predicates.alwaysFalse()" : "Predicates.alwaysTrue()";
    }
}
