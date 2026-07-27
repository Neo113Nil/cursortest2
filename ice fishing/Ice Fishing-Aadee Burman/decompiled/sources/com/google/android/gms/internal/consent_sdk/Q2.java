package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class Q2 extends S2 {
    @Override // com.google.android.gms.internal.consent_sdk.S2
    public final double a(long j6, Object obj) {
        return Double.longBitsToDouble(this.f35614a.getLong(obj, j6));
    }

    @Override // com.google.android.gms.internal.consent_sdk.S2
    public final float b(long j6, Object obj) {
        return Float.intBitsToFloat(this.f35614a.getInt(obj, j6));
    }

    @Override // com.google.android.gms.internal.consent_sdk.S2
    public final void c(Object obj, long j6, boolean z3) {
        if (T2.f35621g) {
            T2.b(obj, j6, z3 ? (byte) 1 : (byte) 0);
        } else {
            T2.c(obj, j6, z3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.S2
    public final void d(Object obj, long j6, byte b9) {
        if (T2.f35621g) {
            T2.b(obj, j6, b9);
        } else {
            T2.c(obj, j6, b9);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.S2
    public final void e(Object obj, long j6, double d2) {
        this.f35614a.putLong(obj, j6, Double.doubleToLongBits(d2));
    }

    @Override // com.google.android.gms.internal.consent_sdk.S2
    public final void f(Object obj, long j6, float f3) {
        this.f35614a.putInt(obj, j6, Float.floatToIntBits(f3));
    }

    @Override // com.google.android.gms.internal.consent_sdk.S2
    public final boolean g(long j6, Object obj) {
        return T2.f35621g ? T2.l(j6, obj) : T2.m(j6, obj);
    }
}
