package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.k9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC3456k9 implements InterfaceC3308hL {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);


    /* renamed from: n, reason: collision with root package name */
    public final int f32271n;

    EnumC3456k9(int i) {
        this.f32271n = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3308hL
    public final int a() {
        return this.f32271n;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f32271n);
    }
}
