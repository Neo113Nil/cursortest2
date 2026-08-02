package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.Eo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2565Eo implements InterfaceC4088vl {

    /* renamed from: n, reason: collision with root package name */
    public final Bundle f25409n = new Bundle();

    @Override // com.google.android.gms.internal.ads.InterfaceC4088vl
    public final void G(String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4088vl
    public final synchronized void b(String str) {
        this.f25409n.putInt(str, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4088vl
    public final synchronized void c(String str, String str2) {
        this.f25409n.putInt(str, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4088vl
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4088vl
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4088vl
    public final synchronized void z(String str) {
        this.f25409n.putInt(str, 2);
    }
}
