package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;

/* renamed from: com.google.android.gms.internal.ads.oh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3684oh extends AbstractC3952tg {

    /* renamed from: v, reason: collision with root package name */
    public final C2503Cg f32917v;

    /* renamed from: w, reason: collision with root package name */
    public C3738ph f32918w;

    /* renamed from: x, reason: collision with root package name */
    public C4114wg f32919x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f32920y;

    /* renamed from: z, reason: collision with root package name */
    public int f32921z;

    public C3684oh(Context context, C2503Cg c2503Cg) {
        super(context);
        this.f32921z = 1;
        this.f32920y = false;
        this.f32917v = c2503Cg;
        c2503Cg.a(this);
    }

    public final boolean D() {
        int i = this.f32921z;
        return (i == 1 || i == 2 || this.f32918w == null) ? false : true;
    }

    public final void E(int i) {
        C2537Eg c2537Eg = this.f34329u;
        C2503Cg c2503Cg = this.f32917v;
        if (i == 4) {
            c2503Cg.d();
            c2537Eg.f24640d = true;
            c2537Eg.a();
        } else if (this.f32921z == 4) {
            c2503Cg.f24195m = false;
            c2537Eg.f24640d = false;
            c2537Eg.a();
        }
        this.f32921z = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final String d() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final void e(C4114wg c4114wg) {
        this.f32919x = c4114wg;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final void f(String str) {
        if (str != null) {
            Uri.parse(str).toString();
            this.f32918w = new C3738ph(0);
            E(3);
            u2.D.f41234l.post(new RunnableC3576mh(this, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final void g() {
        u2.z.k("AdImmersivePlayerView stop");
        C3738ph c3738ph = this.f32918w;
        if (c3738ph != null) {
            c3738ph.f33077a.set(false);
            this.f32918w = null;
            E(1);
        }
        this.f32917v.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final void h() {
        u2.z.k("AdImmersivePlayerView play");
        if (D()) {
            this.f32918w.f33077a.set(true);
            E(4);
            this.f34328n.f35193c = true;
            u2.D.f41234l.post(new RunnableC3576mh(this, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final void i() {
        u2.z.k("AdImmersivePlayerView pause");
        if (D() && this.f32918w.f33077a.get()) {
            this.f32918w.f33077a.set(false);
            E(5);
            u2.D.f41234l.post(new RunnableC3576mh(this, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final int j() {
        return D() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final int k() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final void l(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27);
        sb.append("AdImmersivePlayerView seek ");
        sb.append(i);
        u2.z.k(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2520Dg
    public final void m() {
        if (this.f32918w != null) {
            this.f34329u.getClass();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final void n(float f3, float f9) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final int o() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final int p() {
        return 0;
    }

    @Override // android.view.View
    public final String toString() {
        String name = C3684oh.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return D.y.s(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final long v() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final long w() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final long x() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3952tg
    public final int y() {
        return D() ? 0 : -1;
    }
}
