package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum EI implements InterfaceC3308hL {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    WITH_ID_REQUIREMENT(5),
    UNRECOGNIZED(-1);


    /* renamed from: n, reason: collision with root package name */
    public final int f24692n;

    EI(int i) {
        this.f24692n = i;
    }

    public static EI b(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i == 4) {
            return CRUNCHY;
        }
        if (i != 5) {
            return null;
        }
        return WITH_ID_REQUIREMENT;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3308hL
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f24692n;
        }
        AbstractC3684oL.a();
        throw null;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f24692n);
    }
}
