package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.pZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2355pZ implements AnonymousClass24 {
    public final int A00;
    public final C2362pg A01;
    public final boolean A02;
    public final int[] A03;
    public final boolean[] A04;
    public static final String A07 = C5C.A0h(0);
    public static final String A09 = C5C.A0h(1);
    public static final String A08 = C5C.A0h(3);
    public static final String A06 = C5C.A0h(4);
    public static final AnonymousClass23<C2355pZ> A05 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pa
        @Override // com.instagram.common.viewpoint.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            return C2355pZ.A00(bundle);
        }
    };

    public C2355pZ(C2362pg c2362pg, boolean z8, int[] iArr, boolean[] zArr) {
        this.A00 = c2362pg.A01;
        boolean z9 = false;
        AbstractC06233y.A07(this.A00 == iArr.length && this.A00 == zArr.length);
        this.A01 = c2362pg;
        if (z8 && this.A00 > 1) {
            z9 = true;
        }
        this.A02 = z9;
        this.A03 = (int[]) iArr.clone();
        this.A04 = (boolean[]) zArr.clone();
    }

    public static /* synthetic */ C2355pZ A00(Bundle bundle) {
        C2362pg A6f = C2362pg.A06.A6f((Bundle) AbstractC06233y.A01(bundle.getBundle(A07)));
        int[] iArr = (int[]) AbstractC2062ka.A00(bundle.getIntArray(A09), new int[A6f.A01]);
        boolean[] selected = (boolean[]) AbstractC2062ka.A00(bundle.getBooleanArray(A08), new boolean[A6f.A01]);
        return new C2355pZ(A6f, bundle.getBoolean(A06, false), iArr, selected);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2355pZ c2355pZ = (C2355pZ) obj;
        if (this.A02 == c2355pZ.A02 && this.A01.equals(c2355pZ.A01) && Arrays.equals(this.A03, c2355pZ.A03) && Arrays.equals(this.A04, c2355pZ.A04)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.A01.hashCode() * 31) + (this.A02 ? 1 : 0)) * 31) + Arrays.hashCode(this.A03)) * 31) + Arrays.hashCode(this.A04);
    }
}
