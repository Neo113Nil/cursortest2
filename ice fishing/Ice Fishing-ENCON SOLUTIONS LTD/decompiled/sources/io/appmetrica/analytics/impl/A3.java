package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class A3 extends R7 {
    @Override // io.appmetrica.analytics.impl.R7
    public final boolean a(C0706r3 c0706r3, C0706r3 c0706r32) {
        if (!AbstractC0572lo.a(c0706r32.f6806a)) {
            if (AbstractC0572lo.a(c0706r3.f6806a)) {
                return false;
            }
            S7 s7 = c0706r3.f6807b;
            if (s7 == S7.f5045c) {
                if (((Number) this.f4987a.a(s7)).intValue() < ((Number) this.f4987a.a(c0706r32.f6807b)).intValue()) {
                    return false;
                }
            } else if (((Number) this.f4987a.a(s7)).intValue() <= ((Number) this.f4987a.a(c0706r32.f6807b)).intValue()) {
                return false;
            }
        }
        return true;
    }
}
