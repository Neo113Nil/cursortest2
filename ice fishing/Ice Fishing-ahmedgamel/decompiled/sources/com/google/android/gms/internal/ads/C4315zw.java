package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4315zw implements InterfaceC3945t3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f36244a;

    public C4315zw(int i) {
        this.f36244a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4315zw) && this.f36244a == ((C4315zw) obj).f36244a;
    }

    public final int hashCode() {
        return this.f36244a;
    }

    public final String toString() {
        int i = this.f36244a;
        return D.x.k(i, "Mp4AlternateGroup: ", new StringBuilder(String.valueOf(i).length() + 19));
    }
}
