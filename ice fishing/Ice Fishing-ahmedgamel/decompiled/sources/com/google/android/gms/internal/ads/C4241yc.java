package com.google.android.gms.internal.ads;

import R2.InterfaceC0377c;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.yc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4241yc implements InterfaceC0377c, InterfaceC3544lg {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C3490kg f35964n;

    public /* synthetic */ C4241yc(C3490kg c3490kg) {
        this.f35964n = c3490kg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3544lg, com.google.android.gms.internal.ads.InterfaceC3431jb
    /* renamed from: c */
    public void mo0c() {
        this.f35964n.c(new N2.n("Cannot get Javascript Engine"));
    }

    @Override // R2.InterfaceC0377c
    public void onConnectionFailed(O2.b bVar) {
        this.f35964n.c(new RuntimeException("Connection failed."));
    }

    public C4241yc(P1.h hVar, C3490kg c3490kg) {
        this.f35964n = c3490kg;
        Objects.requireNonNull(hVar);
    }
}
