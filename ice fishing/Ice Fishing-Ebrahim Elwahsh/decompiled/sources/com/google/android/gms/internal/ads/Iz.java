package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class Iz implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25667a;

    /* renamed from: b, reason: collision with root package name */
    public final C4117wN f25668b;

    /* renamed from: c, reason: collision with root package name */
    public final C4117wN f25669c;

    /* renamed from: d, reason: collision with root package name */
    public final C4009uN f25670d;

    public Iz(C4117wN c4117wN, C4009uN c4009uN, C4117wN c4117wN2) {
        this.f25667a = 2;
        this.f25668b = c4117wN;
        this.f25670d = c4009uN;
        this.f25669c = c4117wN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f25667a) {
            case 0:
                return new Hz((Context) this.f25668b.f34977a, (C3066cy) this.f25669c.f34977a, (C3619nA) this.f25670d.d());
            case 1:
                return new Gz((Context) this.f25668b.f34977a, (ExecutorService) this.f25669c.f34977a, (Dy) this.f25670d.d());
            default:
                Context context = (Context) this.f25668b.f34977a;
                return new C4050vA(context, C4050vA.f34733g, (ExecutorService) this.f25669c.f34977a);
        }
    }

    public /* synthetic */ Iz(C4117wN c4117wN, C4117wN c4117wN2, C4009uN c4009uN, int i) {
        this.f25667a = i;
        this.f25668b = c4117wN;
        this.f25669c = c4117wN2;
        this.f25670d = c4009uN;
    }
}
