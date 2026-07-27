package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.aG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2914aG extends AbstractC3825rE {

    /* renamed from: a, reason: collision with root package name */
    public final C4151xG f29046a;

    public C2914aG(C4151xG c4151xG) {
        this.f29046a = c4151xG;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3825rE
    public final boolean a() {
        return this.f29046a.f34969b.H() != 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2914aG)) {
            return false;
        }
        C4151xG c4151xG = ((C2914aG) obj).f29046a;
        C4151xG c4151xG2 = this.f29046a;
        if (c4151xG2.f34969b.H() == c4151xG.f34969b.H()) {
            C3238gI c3238gI = c4151xG2.f34969b;
            String A9 = c3238gI.A();
            C3238gI c3238gI2 = c4151xG.f34969b;
            if (A9.equals(c3238gI2.A()) && c3238gI.B().equals(c3238gI2.B())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        C4151xG c4151xG = this.f29046a;
        return Objects.hash(c4151xG.f34969b, c4151xG.f34968a);
    }

    public final String toString() {
        C4151xG c4151xG = this.f29046a;
        String A9 = c4151xG.f34969b.A();
        int H8 = c4151xG.f34969b.H() - 2;
        return D.y.p("(typeUrl=", A9, ", outputPrefixType=", H8 != 1 ? H8 != 2 ? H8 != 3 ? H8 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }
}
