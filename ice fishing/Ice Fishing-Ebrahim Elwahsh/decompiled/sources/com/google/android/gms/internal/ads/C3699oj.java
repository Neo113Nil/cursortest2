package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.oj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3699oj implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33185a;

    /* renamed from: b, reason: collision with root package name */
    public final C2518Df f33186b;

    public /* synthetic */ C3699oj(C2518Df c2518Df, int i) {
        this.f33185a = i;
        this.f33186b = c2518Df;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f33185a) {
            case 0:
                View view = (View) this.f33186b.f24454v;
                AbstractC3137eE.h(view);
                return view;
            case 1:
                Vt vt = (Vt) this.f33186b.f24455w;
                AbstractC3137eE.h(vt);
                return vt;
            case 2:
                return (InterfaceC2505Cj) this.f33186b.f24453u;
            default:
                return (InterfaceC3858rh) this.f33186b.f24456x;
        }
    }
}
