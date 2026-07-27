package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class X3 implements Comparable {

    /* renamed from: n, reason: collision with root package name */
    public final int f28600n;

    /* renamed from: u, reason: collision with root package name */
    public final T3 f28601u;

    public X3(int i, T3 t32) {
        this.f28600n = i;
        this.f28601u = t32;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.f28600n, ((X3) obj).f28600n);
    }
}
