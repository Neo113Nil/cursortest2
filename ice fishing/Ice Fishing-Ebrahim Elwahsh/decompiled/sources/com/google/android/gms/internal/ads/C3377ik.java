package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.ik, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3377ik implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31991a;

    /* renamed from: b, reason: collision with root package name */
    public final C2675Mj f31992b;

    /* renamed from: c, reason: collision with root package name */
    public final C4009uN f31993c;

    public C3377ik(C2675Mj c2675Mj, C4009uN c4009uN) {
        this.f31991a = 1;
        this.f31992b = c2675Mj;
        this.f31993c = c4009uN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f31991a) {
            case 0:
                return new C3324hk(this.f31992b.a());
            case 1:
                return new C2558Fl(this.f31992b.a(), (Av) this.f31993c.d());
            case 2:
                return new C2490Bl((Context) this.f31993c.d(), new HashSet(), this.f31992b.a());
            default:
                return new C2475An((C2557Fk) this.f31993c.d(), this.f31992b.a());
        }
    }

    public /* synthetic */ C3377ik(C4009uN c4009uN, C2675Mj c2675Mj, int i) {
        this.f31991a = i;
        this.f31993c = c4009uN;
        this.f31992b = c2675Mj;
    }
}
