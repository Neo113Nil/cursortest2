package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.pj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3763pj implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33907a;

    /* renamed from: b, reason: collision with root package name */
    public final C2590Gf f33908b;

    public /* synthetic */ C3763pj(C2590Gf c2590Gf, int i) {
        this.f33907a = i;
        this.f33908b = c2590Gf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f33907a) {
            case 0:
                View view = (View) this.f33908b.f25831v;
                AbstractC3364iD.j(view);
                return view;
            case 1:
                Tt tt = (Tt) this.f33908b.f25832w;
                AbstractC3364iD.j(tt);
                return tt;
            case 2:
                return (InterfaceC2560Ej) this.f33908b.f25830u;
            default:
                return (InterfaceC4084vh) this.f33908b.f25833x;
        }
    }
}
