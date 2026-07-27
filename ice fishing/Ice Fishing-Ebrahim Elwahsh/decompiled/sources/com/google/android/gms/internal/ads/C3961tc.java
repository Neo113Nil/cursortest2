package com.google.android.gms.internal.ads;

import O2.InterfaceC0366c;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.tc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3961tc implements InterfaceC0366c, InterfaceC3373ig {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C3320hg f34422n;

    public /* synthetic */ C3961tc(C3320hg c3320hg) {
        this.f34422n = c3320hg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3373ig, com.google.android.gms.internal.ads.InterfaceC3152eb, com.google.android.gms.internal.ads.Kr
    /* renamed from: a */
    public void mo0a() {
        this.f34422n.b(new K2.m("Cannot get Javascript Engine"));
    }

    @Override // O2.InterfaceC0366c
    public void onConnectionFailed(L2.b bVar) {
        this.f34422n.b(new RuntimeException("Connection failed."));
    }

    public C3961tc(N1.h hVar, C3320hg c3320hg) {
        this.f34422n = c3320hg;
        Objects.requireNonNull(hVar);
    }
}
