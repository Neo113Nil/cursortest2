package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Z3 implements Comparable {

    /* renamed from: n, reason: collision with root package name */
    public final int f28835n;

    /* renamed from: u, reason: collision with root package name */
    public final V3 f28836u;

    public Z3(int i, V3 v32) {
        this.f28835n = i;
        this.f28836u = v32;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.f28835n, ((Z3) obj).f28835n);
    }
}
