package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class OO {

    /* renamed from: d, reason: collision with root package name */
    public static final OO f26600d = new I2().b();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26601a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26602b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26603c;

    public /* synthetic */ OO(I2 i22) {
        this.f26601a = i22.f25433a;
        this.f26602b = i22.f25434b;
        this.f26603c = i22.f25435c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OO.class != obj.getClass()) {
            return false;
        }
        OO oo = (OO) obj;
        return this.f26601a == oo.f26601a && this.f26602b == oo.f26602b && this.f26603c == oo.f26603c;
    }

    public final int hashCode() {
        int i = (this.f26601a ? 1 : 0) << 2;
        boolean z3 = this.f26602b;
        return (z3 ? 1 : 0) + (z3 ? 1 : 0) + i + (this.f26603c ? 1 : 0);
    }
}
