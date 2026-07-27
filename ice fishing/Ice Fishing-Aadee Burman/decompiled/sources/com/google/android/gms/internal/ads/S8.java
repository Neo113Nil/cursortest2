package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class S8 implements B8 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27415n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f27416u;

    public S8(T8 t82) {
        Objects.requireNonNull(t82);
        this.f27416u = t82;
    }

    @Override // com.google.android.gms.internal.ads.B8
    public final void e0(boolean z3) {
        switch (this.f27415n) {
            case 0:
                T8 t82 = (T8) this.f27416u;
                if (!z3) {
                    t82.q();
                    break;
                } else {
                    t82.w();
                    break;
                }
            case 1:
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f31996D)).booleanValue()) {
                    ((Ev) this.f27416u).a(z3);
                    break;
                }
                break;
            default:
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f31996D)).booleanValue()) {
                    ((Kv) this.f27416u).c(z3);
                    break;
                }
                break;
        }
    }

    public S8(Ev ev) {
        Objects.requireNonNull(ev);
        this.f27416u = ev;
    }

    public S8(Kv kv) {
        Objects.requireNonNull(kv);
        this.f27416u = kv;
    }
}
