package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.n9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC3628n9 implements XK {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);


    /* renamed from: n, reason: collision with root package name */
    public final int f33476n;

    EnumC3628n9(int i) {
        this.f33476n = i;
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final int c() {
        return this.f33476n;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f33476n);
    }
}
