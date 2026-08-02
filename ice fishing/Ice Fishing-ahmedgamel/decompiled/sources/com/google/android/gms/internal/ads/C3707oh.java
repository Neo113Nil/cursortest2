package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;

/* renamed from: com.google.android.gms.internal.ads.oh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3707oh extends AbstractC3975tg {

    /* renamed from: v, reason: collision with root package name */
    public final C2523Cg f33703v;

    /* renamed from: w, reason: collision with root package name */
    public C3761ph f33704w;

    /* renamed from: x, reason: collision with root package name */
    public C4137wg f33705x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f33706y;

    /* renamed from: z, reason: collision with root package name */
    public int f33707z;

    public C3707oh(Context context, C2523Cg c2523Cg) {
        super(context);
        this.f33707z = 1;
        this.f33706y = false;
        this.f33703v = c2523Cg;
        c2523Cg.a(this);
    }

    public final boolean D() {
        int i = this.f33707z;
        return (i == 1 || i == 2 || this.f33704w == null) ? false : true;
    }

    public final void E(int i) {
        C2557Eg c2557Eg = this.f35108u;
        C2523Cg c2523Cg = this.f33703v;
        if (i == 4) {
            c2523Cg.d();
            c2557Eg.f25393d = true;
            c2557Eg.a();
        } else if (this.f33707z == 4) {
            c2523Cg.f24930m = false;
            c2557Eg.f25393d = false;
            c2557Eg.a();
        }
        this.f33707z = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final String d() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final void e(C4137wg c4137wg) {
        this.f33705x = c4137wg;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final void f(String str) {
        if (str != null) {
            Uri.parse(str).toString();
            this.f33704w = new C3761ph(0);
            E(3);
            w2.D.f41627l.post(new RunnableC3599mh(this, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final void g() {
        w2.z.k("AdImmersivePlayerView stop");
        C3761ph c3761ph = this.f33704w;
        if (c3761ph != null) {
            c3761ph.f33867a.set(false);
            this.f33704w = null;
            E(1);
        }
        this.f33703v.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final void h() {
        w2.z.k("AdImmersivePlayerView play");
        if (D()) {
            this.f33704w.f33867a.set(true);
            E(4);
            this.f35107n.f35983c = true;
            w2.D.f41627l.post(new RunnableC3599mh(this, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final void i() {
        w2.z.k("AdImmersivePlayerView pause");
        if (D() && this.f33704w.f33867a.get()) {
            this.f33704w.f33867a.set(false);
            E(5);
            w2.D.f41627l.post(new RunnableC3599mh(this, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final int j() {
        return D() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final int k() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final void l(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27);
        sb.append("AdImmersivePlayerView seek ");
        sb.append(i);
        w2.z.k(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540Dg
    public final void m() {
        if (this.f33704w != null) {
            this.f35108u.getClass();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final void n(float f2, float f9) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final int o() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final int p() {
        return 0;
    }

    @Override // android.view.View
    public final String toString() {
        String name = C3707oh.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return D.x.p(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final long v() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final long w() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final long x() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3975tg
    public final int y() {
        return D() ? 0 : -1;
    }
}
