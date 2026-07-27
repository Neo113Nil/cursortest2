package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3177f implements Comparable {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f30561n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f30562u;

    public C3177f(TP tp, int i) {
        this.f30561n = 1 == (tp.f27767e & 1);
        this.f30562u = AbstractC3149eQ.J(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3177f c3177f = (C3177f) obj;
        return NB.f26491a.d(this.f30562u, c3177f.f30562u).d(this.f30561n, c3177f.f30561n).e();
    }
}
