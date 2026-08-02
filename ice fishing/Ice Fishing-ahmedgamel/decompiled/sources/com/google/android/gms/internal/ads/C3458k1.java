package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.k1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3458k1 extends X0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3136e1 f32147b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3404j1 f32148c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3458k1(C3404j1 c3404j1, InterfaceC3136e1 interfaceC3136e1, InterfaceC3136e1 interfaceC3136e12) {
        super(interfaceC3136e1);
        this.f32147b = interfaceC3136e12;
        Objects.requireNonNull(c3404j1);
        this.f32148c = c3404j1;
    }

    @Override // com.google.android.gms.internal.ads.X0, com.google.android.gms.internal.ads.InterfaceC3136e1
    public final C3083d1 b(long j6) {
        C3083d1 b9 = this.f32147b.b(j6);
        C3190f1 c3190f1 = b9.f30432a;
        long j9 = c3190f1.f30800a;
        long j10 = this.f32148c.f31943u;
        C3190f1 c3190f12 = new C3190f1(j9, c3190f1.f30801b + j10);
        C3190f1 c3190f13 = b9.f30433b;
        return new C3083d1(c3190f12, new C3190f1(c3190f13.f30800a, c3190f13.f30801b + j10));
    }
}
