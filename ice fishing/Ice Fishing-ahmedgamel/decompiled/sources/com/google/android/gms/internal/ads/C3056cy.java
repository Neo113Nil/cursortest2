package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.cy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3056cy implements InterfaceC3511lN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29648a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29649b;

    public C3056cy(C2570Gf c2570Gf) {
        this.f29648a = 3;
        Objects.requireNonNull(c2570Gf);
        this.f29649b = c2570Gf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final /* synthetic */ Object f() {
        switch (this.f29648a) {
            case 0:
                return new C3163ey((C3796ql) ((C3796ql) this.f29649b).f33378a);
            case 1:
                return new C3109dy((C3796ql) ((C3796ql) this.f29649b).f33378a);
            case 2:
                return new C3217fy((C3796ql) ((C3796ql) this.f29649b).f33378a);
            default:
                C2570Gf c2570Gf = (C2570Gf) this.f29649b;
                return new C3271gy((C3796ql) c2570Gf.f25042u, (C2570Gf) c2570Gf.f25045x);
        }
    }

    public C3056cy(C3796ql c3796ql, int i) {
        this.f29648a = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(c3796ql);
                this.f29649b = c3796ql;
                break;
            case 2:
                Objects.requireNonNull(c3796ql);
                this.f29649b = c3796ql;
                break;
            default:
                Objects.requireNonNull(c3796ql);
                this.f29649b = c3796ql;
                break;
        }
    }
}
