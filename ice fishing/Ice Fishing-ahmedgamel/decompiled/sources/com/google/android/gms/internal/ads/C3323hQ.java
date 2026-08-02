package com.google.android.gms.internal.ads;

import java.util.Objects;
import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.hQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3323hQ {

    /* renamed from: a, reason: collision with root package name */
    public final String f31571a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31572b;

    static {
        String str = AbstractC3182eu.f30782a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public C3323hQ(String str, String str2) {
        this.f31571a = AbstractC3182eu.q(str);
        this.f31572b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3323hQ.class == obj.getClass()) {
            C3323hQ c3323hQ = (C3323hQ) obj;
            if (Objects.equals(this.f31571a, c3323hQ.f31571a) && Objects.equals(this.f31572b, c3323hQ.f31572b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f31572b.hashCode() * 31;
        String str = this.f31571a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f31571a;
        int length = String.valueOf(str).length();
        String str2 = this.f31572b;
        StringBuilder sb = new StringBuilder(length + 10 + String.valueOf(str2).length() + 3);
        AbstractC5128c.h(sb, "{ lang=", str, ", '", str2);
        sb.append("' }");
        return sb.toString();
    }
}
