package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3778qK extends Number {

    /* renamed from: n, reason: collision with root package name */
    public final String f33234n;

    public C3778qK(String str) {
        this.f33234n = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f33234n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3778qK) {
            return this.f33234n.equals(((C3778qK) obj).f33234n);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f33234n);
    }

    public final int hashCode() {
        return this.f33234n.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f33234n;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return QC.d(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f33234n;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return QC.d(str).longValue();
        }
    }

    public final String toString() {
        return this.f33234n;
    }
}
