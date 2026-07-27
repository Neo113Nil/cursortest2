package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;

/* renamed from: com.google.android.gms.internal.ads.kh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3481kh extends AbstractC3804qg {

    /* renamed from: v, reason: collision with root package name */
    public final C4289zg f32312v;

    /* renamed from: w, reason: collision with root package name */
    public C3535lh f32313w;

    /* renamed from: x, reason: collision with root package name */
    public C3965tg f32314x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f32315y;

    /* renamed from: z, reason: collision with root package name */
    public int f32316z;

    public C3481kh(Context context, C4289zg c4289zg) {
        super(context);
        this.f32316z = 1;
        this.f32315y = false;
        this.f32312v = c4289zg;
        c4289zg.a(this);
    }

    public final boolean D() {
        int i = this.f32316z;
        return (i == 1 || i == 2 || this.f32313w == null) ? false : true;
    }

    public final void E(int i) {
        C2485Bg c2485Bg = this.f33738u;
        C4289zg c4289zg = this.f32312v;
        if (i == 4) {
            c4289zg.d();
            c2485Bg.f24056d = true;
            c2485Bg.a();
        } else if (this.f32316z == 4) {
            c4289zg.f35594m = false;
            c2485Bg.f24056d = false;
            c2485Bg.a();
        }
        this.f32316z = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final String d() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final void e(C3965tg c3965tg) {
        this.f32314x = c3965tg;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final void f(String str) {
        if (str != null) {
            Uri.parse(str).toString();
            this.f32313w = new C3535lh(0);
            E(3);
            t2.G.f40858l.post(new RunnableC3427jh(this, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final void g() {
        t2.C.k("AdImmersivePlayerView stop");
        C3535lh c3535lh = this.f32313w;
        if (c3535lh != null) {
            c3535lh.f32574a.set(false);
            this.f32313w = null;
            E(1);
        }
        this.f32312v.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final void h() {
        t2.C.k("AdImmersivePlayerView play");
        if (D()) {
            this.f32313w.f32574a.set(true);
            E(4);
            this.f33737n.f34832c = true;
            t2.G.f40858l.post(new RunnableC3427jh(this, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final void i() {
        t2.C.k("AdImmersivePlayerView pause");
        if (D() && this.f32313w.f32574a.get()) {
            this.f32313w.f32574a.set(false);
            E(5);
            t2.G.f40858l.post(new RunnableC3427jh(this, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final int j() {
        return D() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final int k() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final void l(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27);
        sb.append("AdImmersivePlayerView seek ");
        sb.append(i);
        t2.C.k(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final void m(float f6, float f9) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2468Ag
    public final void n() {
        if (this.f32313w != null) {
            this.f33738u.getClass();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final int o() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final int p() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final long q() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final long r() {
        return 0L;
    }

    @Override // android.view.View
    public final String toString() {
        String name = C3481kh.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return D.y.o(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final long x() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final int y() {
        return D() ? 0 : -1;
    }
}
