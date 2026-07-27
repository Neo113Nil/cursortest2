package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.pj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3740pj implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33118a;

    /* renamed from: b, reason: collision with root package name */
    public final C2570Gf f33119b;

    public /* synthetic */ C3740pj(C2570Gf c2570Gf, int i) {
        this.f33118a = i;
        this.f33119b = c2570Gf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f33118a) {
            case 0:
                View view = (View) this.f33119b.f25043v;
                AbstractC3341iD.j(view);
                return view;
            case 1:
                Tt tt = (Tt) this.f33119b.f25044w;
                AbstractC3341iD.j(tt);
                return tt;
            case 2:
                return (InterfaceC2540Ej) this.f33119b.f25042u;
            default:
                return (InterfaceC4061vh) this.f33119b.f25045x;
        }
    }
}
