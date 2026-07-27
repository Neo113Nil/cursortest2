package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum X7 implements InterfaceC3308hL {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6),
    RISCV64(7),
    UNKNOWN(com.anythink.core.common.n.a.k.f14989h);


    /* renamed from: n, reason: collision with root package name */
    public final int f28615n;

    X7(int i) {
        this.f28615n = i;
    }

    public static X7 b(int i) {
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

    @Override // com.google.android.gms.internal.ads.InterfaceC3308hL
    public final int a() {
        return this.f28615n;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f28615n);
    }
}
