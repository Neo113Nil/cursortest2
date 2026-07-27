package com.google.android.gms.internal.ads;

import P2.InterfaceC0373c;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.yc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4218yc implements InterfaceC0373c, InterfaceC3521lg {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C3467kg f35174n;

    public /* synthetic */ C4218yc(C3467kg c3467kg) {
        this.f35174n = c3467kg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3521lg, com.google.android.gms.internal.ads.InterfaceC3408jb
    /* renamed from: c */
    public void mo0c() {
        this.f35174n.c(new L2.m("Cannot get Javascript Engine"));
    }

    @Override // P2.InterfaceC0373c
    public void onConnectionFailed(M2.b bVar) {
        this.f35174n.c(new RuntimeException("Connection failed."));
    }

    public C4218yc(N1.h hVar, C3467kg c3467kg) {
        this.f35174n = c3467kg;
        Objects.requireNonNull(hVar);
    }
}
