package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class G8 {

    /* renamed from: a, reason: collision with root package name */
    public final long f24937a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24938b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24939c;

    public G8(int i, long j6, String str) {
        this.f24937a = j6;
        this.f24938b = str;
        this.f24939c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof G8)) {
            return false;
        }
        G8 g82 = (G8) obj;
        return g82.f24937a == this.f24937a && g82.f24939c == this.f24939c;
    }

    public final int hashCode() {
        return (int) this.f24937a;
    }
}
