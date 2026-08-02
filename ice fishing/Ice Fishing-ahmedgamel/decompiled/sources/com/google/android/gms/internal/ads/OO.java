package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class OO {

    /* renamed from: d, reason: collision with root package name */
    public static final OO f27382d = new I2().b();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f27383a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27384b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27385c;

    public /* synthetic */ OO(I2 i22) {
        this.f27383a = i22.f26176a;
        this.f27384b = i22.f26177b;
        this.f27385c = i22.f26178c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OO.class != obj.getClass()) {
            return false;
        }
        OO oo = (OO) obj;
        return this.f27383a == oo.f27383a && this.f27384b == oo.f27384b && this.f27385c == oo.f27385c;
    }

    public final int hashCode() {
        int i = (this.f27383a ? 1 : 0) << 2;
        boolean z6 = this.f27384b;
        return (z6 ? 1 : 0) + (z6 ? 1 : 0) + i + (this.f27385c ? 1 : 0);
    }
}
