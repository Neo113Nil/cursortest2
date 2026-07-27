package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4292zw implements InterfaceC3922t3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f35475a;

    public C4292zw(int i) {
        this.f35475a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4292zw) && this.f35475a == ((C4292zw) obj).f35475a;
    }

    public final int hashCode() {
        return this.f35475a;
    }

    public final String toString() {
        int i = this.f35475a;
        return D.y.m(i, "Mp4AlternateGroup: ", new StringBuilder(String.valueOf(i).length() + 19));
    }
}
