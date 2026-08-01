package com.instagram.common.viewpoint.core;

import android.os.Bundle;

/* renamed from: com.facebook.ads.redexgen.X.qC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2394qC implements AnonymousClass24 {
    public final long A00;
    public final long A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public static final C2394qC A06 = new C05972v().A0A();
    public static final AnonymousClass23<AW> A05 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.qD
        @Override // com.instagram.common.viewpoint.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            AW A0B;
            A0B = new C05972v().A06(bundle.getLong(C2394qC.A01(0), 0L)).A05(bundle.getLong(C2394qC.A01(1), Long.MIN_VALUE)).A08(bundle.getBoolean(C2394qC.A01(2), false)).A07(bundle.getBoolean(C2394qC.A01(3), false)).A09(bundle.getBoolean(C2394qC.A01(4), false)).A0B();
            return A0B;
        }
    };

    public C2394qC(C05972v c05972v) {
        long j6;
        long j9;
        boolean z3;
        boolean z6;
        boolean z9;
        j6 = c05972v.A01;
        this.A01 = j6;
        j9 = c05972v.A00;
        this.A00 = j9;
        z3 = c05972v.A03;
        this.A03 = z3;
        z6 = c05972v.A02;
        this.A02 = z6;
        z9 = c05972v.A04;
        this.A04 = z9;
    }

    public static String A01(int i) {
        return Integer.toString(i, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2394qC)) {
            return false;
        }
        C2394qC c2394qC = (C2394qC) obj;
        return this.A01 == c2394qC.A01 && this.A00 == c2394qC.A00 && this.A03 == c2394qC.A03 && this.A02 == c2394qC.A02 && this.A04 == c2394qC.A04;
    }

    public final int hashCode() {
        return (((((((((int) (this.A01 ^ (this.A01 >>> 32))) * 31) + ((int) (this.A00 ^ (this.A00 >>> 32)))) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A04 ? 1 : 0);
    }
}
