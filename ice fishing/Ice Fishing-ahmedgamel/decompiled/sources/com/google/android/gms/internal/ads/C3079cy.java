package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.cy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3079cy implements InterfaceC3534lN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30420a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30421b;

    public C3079cy(C2590Gf c2590Gf) {
        this.f30420a = 3;
        Objects.requireNonNull(c2590Gf);
        this.f30421b = c2590Gf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final /* synthetic */ Object f() {
        switch (this.f30420a) {
            case 0:
                return new C3186ey((C3819ql) ((C3819ql) this.f30421b).f34160a);
            case 1:
                return new C3132dy((C3819ql) ((C3819ql) this.f30421b).f34160a);
            case 2:
                return new C3240fy((C3819ql) ((C3819ql) this.f30421b).f34160a);
            default:
                C2590Gf c2590Gf = (C2590Gf) this.f30421b;
                return new C3294gy((C3819ql) c2590Gf.f25830u, (C2590Gf) c2590Gf.f25833x);
        }
    }

    public C3079cy(C3819ql c3819ql, int i) {
        this.f30420a = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(c3819ql);
                this.f30421b = c3819ql;
                break;
            case 2:
                Objects.requireNonNull(c3819ql);
                this.f30421b = c3819ql;
                break;
            default:
                Objects.requireNonNull(c3819ql);
                this.f30421b = c3819ql;
                break;
        }
    }
}
