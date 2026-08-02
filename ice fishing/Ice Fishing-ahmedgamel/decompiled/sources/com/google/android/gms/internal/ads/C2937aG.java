package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.aG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2937aG extends AbstractC3848rE {

    /* renamed from: a, reason: collision with root package name */
    public final C4174xG f29816a;

    public C2937aG(C4174xG c4174xG) {
        this.f29816a = c4174xG;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3848rE
    public final boolean a() {
        return this.f29816a.f35750b.H() != 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2937aG)) {
            return false;
        }
        C4174xG c4174xG = ((C2937aG) obj).f29816a;
        C4174xG c4174xG2 = this.f29816a;
        if (c4174xG2.f35750b.H() == c4174xG.f35750b.H()) {
            C3261gI c3261gI = c4174xG2.f35750b;
            String A9 = c3261gI.A();
            C3261gI c3261gI2 = c4174xG.f35750b;
            if (A9.equals(c3261gI2.A()) && c3261gI.B().equals(c3261gI2.B())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        C4174xG c4174xG = this.f29816a;
        return Objects.hash(c4174xG.f35750b, c4174xG.f35749a);
    }

    public final String toString() {
        C4174xG c4174xG = this.f29816a;
        String A9 = c4174xG.f35750b.A();
        int H8 = c4174xG.f35750b.H() - 2;
        return D.x.m("(typeUrl=", A9, ", outputPrefixType=", H8 != 1 ? H8 != 2 ? H8 != 3 ? H8 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }
}
