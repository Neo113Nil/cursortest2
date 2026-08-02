package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class G8 {

    /* renamed from: a, reason: collision with root package name */
    public final long f25727a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25728b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25729c;

    public G8(int i, long j6, String str) {
        this.f25727a = j6;
        this.f25728b = str;
        this.f25729c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof G8)) {
            return false;
        }
        G8 g82 = (G8) obj;
        return g82.f25727a == this.f25727a && g82.f25729c == this.f25729c;
    }

    public final int hashCode() {
        return (int) this.f25727a;
    }
}
