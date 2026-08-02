package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.t4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0727t4 extends AbstractC0213b9 {
    @Override // io.appmetrica.analytics.impl.AbstractC0213b9
    public final boolean a(C0467k4 c0467k4, C0467k4 c0467k42) {
        if (Or.a(c0467k42.a)) {
            return true;
        }
        if (Or.a(c0467k4.a)) {
            return false;
        }
        EnumC0271d9 enumC0271d9 = c0467k4.b;
        EnumC0271d9 enumC0271d92 = EnumC0271d9.d;
        C0882ye c0882ye = this.a;
        if (enumC0271d9 == enumC0271d92) {
            if (((Number) c0882ye.a(enumC0271d9)).intValue() >= ((Number) this.a.a(c0467k42.b)).intValue()) {
                return true;
            }
        } else if (((Number) c0882ye.a(enumC0271d9)).intValue() > ((Number) this.a.a(c0467k42.b)).intValue()) {
            return true;
        }
        return false;
    }
}
