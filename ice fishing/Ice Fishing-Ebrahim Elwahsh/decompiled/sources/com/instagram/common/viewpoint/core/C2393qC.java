package com.instagram.common.viewpoint.core;

import android.os.Bundle;

/* renamed from: com.facebook.ads.redexgen.X.qC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2393qC implements AnonymousClass24 {
    public final long A00;
    public final long A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public static final C2393qC A06 = new C05962v().A0A();
    public static final AnonymousClass23<AW> A05 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.qD
        @Override // com.instagram.common.viewpoint.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            AW A0B;
            A0B = new C05962v().A06(bundle.getLong(C2393qC.A01(0), 0L)).A05(bundle.getLong(C2393qC.A01(1), Long.MIN_VALUE)).A08(bundle.getBoolean(C2393qC.A01(2), false)).A07(bundle.getBoolean(C2393qC.A01(3), false)).A09(bundle.getBoolean(C2393qC.A01(4), false)).A0B();
            return A0B;
        }
    };

    public C2393qC(C05962v c05962v) {
        long j9;
        long j10;
        boolean z8;
        boolean z9;
        boolean z10;
        j9 = c05962v.A01;
        this.A01 = j9;
        j10 = c05962v.A00;
        this.A00 = j10;
        z8 = c05962v.A03;
        this.A03 = z8;
        z9 = c05962v.A02;
        this.A02 = z9;
        z10 = c05962v.A04;
        this.A04 = z10;
    }

    public static String A01(int i) {
        return Integer.toString(i, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2393qC)) {
            return false;
        }
        C2393qC c2393qC = (C2393qC) obj;
        return this.A01 == c2393qC.A01 && this.A00 == c2393qC.A00 && this.A03 == c2393qC.A03 && this.A02 == c2393qC.A02 && this.A04 == c2393qC.A04;
    }

    public final int hashCode() {
        return (((((((((int) (this.A01 ^ (this.A01 >>> 32))) * 31) + ((int) (this.A00 ^ (this.A00 >>> 32)))) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A04 ? 1 : 0);
    }
}
