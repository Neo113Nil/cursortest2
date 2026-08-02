package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class S8 implements B8 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28129n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f28130u;

    public S8(T8 t82) {
        Objects.requireNonNull(t82);
        this.f28130u = t82;
    }

    @Override // com.google.android.gms.internal.ads.B8
    public final void e0(boolean z6) {
        switch (this.f28129n) {
            case 0:
                T8 t82 = (T8) this.f28130u;
                if (!z6) {
                    t82.q();
                    break;
                } else {
                    t82.w();
                    break;
                }
            case 1:
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32776D)).booleanValue()) {
                    ((Ev) this.f28130u).a(z6);
                    break;
                }
                break;
            default:
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32776D)).booleanValue()) {
                    ((Kv) this.f28130u).c(z6);
                    break;
                }
                break;
        }
    }

    public S8(Ev ev) {
        Objects.requireNonNull(ev);
        this.f28130u = ev;
    }

    public S8(Kv kv) {
        Objects.requireNonNull(kv);
        this.f28130u = kv;
    }
}
