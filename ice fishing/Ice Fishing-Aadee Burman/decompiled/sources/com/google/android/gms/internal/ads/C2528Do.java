package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.Do, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2528Do implements InterfaceC4011ul {

    /* renamed from: n, reason: collision with root package name */
    public final Bundle f24461n = new Bundle();

    @Override // com.google.android.gms.internal.ads.InterfaceC4011ul
    public final void H(String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4011ul
    public final synchronized void b(String str) {
        this.f24461n.putInt(str, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4011ul
    public final synchronized void c(String str, String str2) {
        this.f24461n.putInt(str, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4011ul
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4011ul
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4011ul
    public final synchronized void z(String str) {
        this.f24461n.putInt(str, 2);
    }
}
