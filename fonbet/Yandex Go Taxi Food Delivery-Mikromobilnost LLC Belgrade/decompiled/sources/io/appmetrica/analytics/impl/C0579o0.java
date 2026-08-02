package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.o0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0579o0 {
    public final String a;
    public final long b;

    public C0579o0(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0579o0.class == obj.getClass()) {
            C0579o0 c0579o0 = (C0579o0) obj;
            if (this.b != c0579o0.b) {
                return false;
            }
            String str = this.a;
            String str2 = c0579o0.a;
            if (str == null ? str2 == null : str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.b;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }
}
