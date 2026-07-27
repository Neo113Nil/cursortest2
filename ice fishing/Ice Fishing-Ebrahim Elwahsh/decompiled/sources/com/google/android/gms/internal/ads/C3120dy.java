package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.dy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3120dy implements InterfaceC4279zN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30264a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30265b;

    public C3120dy(C2518Df c2518Df) {
        this.f30264a = 3;
        Objects.requireNonNull(c2518Df);
        this.f30265b = c2518Df;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final /* synthetic */ Object d() {
        switch (this.f30264a) {
            case 0:
                return new C3284gy((C3755pl) ((C3755pl) this.f30265b).f33491a);
            case 1:
                return new C3175ey((C3755pl) ((C3755pl) this.f30265b).f33491a);
            case 2:
                return new C3338hy((C3755pl) ((C3755pl) this.f30265b).f33491a);
            default:
                C2518Df c2518Df = (C2518Df) this.f30265b;
                return new C3390iy((C3755pl) c2518Df.f24453u, (C2518Df) c2518Df.f24456x);
        }
    }

    public C3120dy(C3755pl c3755pl, int i) {
        this.f30264a = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(c3755pl);
                this.f30265b = c3755pl;
                break;
            case 2:
                Objects.requireNonNull(c3755pl);
                this.f30265b = c3755pl;
                break;
            default:
                Objects.requireNonNull(c3755pl);
                this.f30265b = c3755pl;
                break;
        }
    }
}
