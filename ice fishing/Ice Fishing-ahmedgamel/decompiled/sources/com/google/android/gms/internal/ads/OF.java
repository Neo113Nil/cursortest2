package com.google.android.gms.internal.ads;

import java.math.BigDecimal;

/* loaded from: classes2.dex */
public final class OF extends Number {

    /* renamed from: n, reason: collision with root package name */
    public final String f27377n;

    public OF(String str) {
        this.f27377n = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f27377n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OF) {
            return this.f27377n.equals(((OF) obj).f27377n);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f27377n);
    }

    public final int hashCode() {
        return this.f27377n.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f27377n;
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
        String str = this.f27377n;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f27377n;
    }
}
