package com.google.android.gms.internal.ads;

import java.math.BigDecimal;

/* loaded from: classes2.dex */
public final class OF extends Number {

    /* renamed from: n, reason: collision with root package name */
    public final String f26595n;

    public OF(String str) {
        this.f26595n = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f26595n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OF) {
            return this.f26595n.equals(((OF) obj).f26595n);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f26595n);
    }

    public final int hashCode() {
        return this.f26595n.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f26595n;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f26595n;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f26595n;
    }
}
