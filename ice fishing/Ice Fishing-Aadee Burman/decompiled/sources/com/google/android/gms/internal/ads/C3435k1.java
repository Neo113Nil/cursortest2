package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.k1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3435k1 extends X0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3113e1 f31368b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3381j1 f31369c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3435k1(C3381j1 c3381j1, InterfaceC3113e1 interfaceC3113e1, InterfaceC3113e1 interfaceC3113e12) {
        super(interfaceC3113e1);
        this.f31368b = interfaceC3113e12;
        Objects.requireNonNull(c3381j1);
        this.f31369c = c3381j1;
    }

    @Override // com.google.android.gms.internal.ads.X0, com.google.android.gms.internal.ads.InterfaceC3113e1
    public final C3060d1 b(long j6) {
        C3060d1 b9 = this.f31368b.b(j6);
        C3167f1 c3167f1 = b9.f29660a;
        long j9 = c3167f1.f30013a;
        long j10 = this.f31369c.f31156u;
        C3167f1 c3167f12 = new C3167f1(j9, c3167f1.f30014b + j10);
        C3167f1 c3167f13 = b9.f29661b;
        return new C3060d1(c3167f12, new C3167f1(c3167f13.f30013a, c3167f13.f30014b + j10));
    }
}
