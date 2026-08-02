package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ZA implements XA {

    /* renamed from: n, reason: collision with root package name */
    public static final ZA f29626n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ ZA[] f29627u;

    static {
        ZA za = new ZA("ALWAYS_TRUE", 0);
        f29626n = za;
        f29627u = new ZA[]{za, new ZA("ALWAYS_FALSE", 1), new ZA("IS_NULL", 2), new ZA("NOT_NULL", 3)};
    }

    public static ZA[] values() {
        return (ZA[]) f29627u.clone();
    }

    @Override // com.google.android.gms.internal.ads.XA
    public final /* synthetic */ boolean a(Object obj) {
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
