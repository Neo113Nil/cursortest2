package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum WH implements XK {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* renamed from: n, reason: collision with root package name */
    public final int f29137n;

    WH(int i) {
        this.f29137n = i;
    }

    public static WH a(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i == 2) {
            return SHA384;
        }
        if (i == 3) {
            return SHA256;
        }
        if (i == 4) {
            return SHA512;
        }
        if (i != 5) {
            return null;
        }
        return SHA224;
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final int c() {
        if (this != UNRECOGNIZED) {
            return this.f29137n;
        }
        AbstractC3103dL.a();
        throw null;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f29137n);
    }
}
