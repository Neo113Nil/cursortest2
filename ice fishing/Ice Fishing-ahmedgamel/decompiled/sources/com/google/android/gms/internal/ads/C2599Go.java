package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Go, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2599Go {

    /* renamed from: a, reason: collision with root package name */
    public final Object f25891a;

    /* renamed from: b, reason: collision with root package name */
    public M.h f25892b = new M.h(5);

    /* renamed from: c, reason: collision with root package name */
    public boolean f25893c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25894d;

    public C2599Go(Object obj) {
        this.f25891a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2599Go.class != obj.getClass()) {
            return false;
        }
        return this.f25891a.equals(((C2599Go) obj).f25891a);
    }

    public final int hashCode() {
        return this.f25891a.hashCode();
    }
}
