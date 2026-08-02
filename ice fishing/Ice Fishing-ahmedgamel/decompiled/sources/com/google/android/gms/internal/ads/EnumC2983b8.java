package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.b8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC2983b8 implements XK {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6),
    RISCV64(7),
    UNKNOWN(com.anythink.core.common.n.a.k.f15618h);


    /* renamed from: n, reason: collision with root package name */
    public final int f30015n;

    EnumC2983b8(int i) {
        this.f30015n = i;
    }

    public static EnumC2983b8 a(int i) {
        if (i == 0) {
            return UNSUPPORTED;
        }
        if (i == 2) {
            return ARM7;
        }
        if (i == 999) {
            return UNKNOWN;
        }
        if (i == 4) {
            return X86;
        }
        if (i == 5) {
            return ARM64;
        }
        if (i == 6) {
            return X86_64;
        }
        if (i != 7) {
            return null;
        }
        return RISCV64;
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final int c() {
        return this.f30015n;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f30015n);
    }
}
