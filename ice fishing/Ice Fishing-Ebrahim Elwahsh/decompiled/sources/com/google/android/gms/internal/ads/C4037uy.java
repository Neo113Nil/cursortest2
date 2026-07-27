package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.uy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4037uy implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34684a;

    /* renamed from: b, reason: collision with root package name */
    public final C4009uN f34685b;

    /* renamed from: c, reason: collision with root package name */
    public final C4009uN f34686c;

    public /* synthetic */ C4037uy(C4009uN c4009uN, C4009uN c4009uN2, int i) {
        this.f34684a = i;
        this.f34685b = c4009uN;
        this.f34686c = c4009uN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final /* bridge */ /* synthetic */ Object d() {
        switch (this.f34684a) {
            case 0:
                Executor executor = (Executor) this.f34685b.d();
                return new C3983ty(executor);
            default:
                return new C4158xA((Wx) this.f34685b.d(), (Dy) this.f34686c.d());
        }
    }
}
