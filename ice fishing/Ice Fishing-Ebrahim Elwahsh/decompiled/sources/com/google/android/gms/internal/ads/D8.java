package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class D8 {

    /* renamed from: a, reason: collision with root package name */
    public final long f24344a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24345b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24346c;

    public D8(int i, long j9, String str) {
        this.f24344a = j9;
        this.f24345b = str;
        this.f24346c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof D8)) {
            return false;
        }
        D8 d82 = (D8) obj;
        return d82.f24344a == this.f24344a && d82.f24346c == this.f24346c;
    }

    public final int hashCode() {
        return (int) this.f24344a;
    }
}
