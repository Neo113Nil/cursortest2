package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class Y1 extends AbstractC2900a2 {

    /* renamed from: b, reason: collision with root package name */
    public final String f28633b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28634c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28635d;

    public Y1(String str, String str2, String str3) {
        super(com.anythink.basead.exoplayer.g.b.e.f7298a);
        this.f28633b = str;
        this.f28634c = str2;
        this.f28635d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Y1.class == obj.getClass()) {
            Y1 y12 = (Y1) obj;
            if (Objects.equals(this.f28634c, y12.f28634c) && Objects.equals(this.f28633b, y12.f28633b) && Objects.equals(this.f28635d, y12.f28635d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f28634c.hashCode() + ((this.f28633b.hashCode() + 527) * 31);
        String str = this.f28635d;
        return (hashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2900a2
    public final String toString() {
        String str = this.f29009a;
        int length = String.valueOf(str).length();
        String str2 = this.f28635d;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f28633b;
        int a9 = u1.h.a(length + 11, 14, str3);
        String str4 = this.f28634c;
        StringBuilder sb = new StringBuilder(str4.length() + a9 + 7 + length2);
        u1.h.i(sb, str, ": language=", str3, ", description=");
        return D.y.s(sb, str4, ", text=", str2);
    }
}
