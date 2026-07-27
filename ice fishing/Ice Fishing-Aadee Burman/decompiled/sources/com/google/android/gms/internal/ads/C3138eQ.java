package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.eQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3138eQ {

    /* renamed from: a, reason: collision with root package name */
    public final String f29932a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29933b;

    static {
        String str = AbstractC3159eu.f29993a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public C3138eQ(String str, String str2) {
        this.f29932a = AbstractC3159eu.q(str);
        this.f29933b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3138eQ.class == obj.getClass()) {
            C3138eQ c3138eQ = (C3138eQ) obj;
            if (Objects.equals(this.f29932a, c3138eQ.f29932a) && Objects.equals(this.f29933b, c3138eQ.f29933b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f29933b.hashCode() * 31;
        String str = this.f29932a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f29932a;
        int length = String.valueOf(str).length();
        String str2 = this.f29933b;
        StringBuilder sb = new StringBuilder(length + 10 + String.valueOf(str2).length() + 3);
        u1.h.i(sb, "{ lang=", str, ", '", str2);
        sb.append("' }");
        return sb.toString();
    }
}
