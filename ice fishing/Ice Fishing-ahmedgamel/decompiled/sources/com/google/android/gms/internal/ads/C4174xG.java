package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.xG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4174xG implements InterfaceC4282zG {

    /* renamed from: a, reason: collision with root package name */
    public final C3263gK f35749a;

    /* renamed from: b, reason: collision with root package name */
    public final C3261gI f35750b;

    /* renamed from: c, reason: collision with root package name */
    public final C3956tE f35751c;

    public C4174xG(C3261gI c3261gI, C3263gK c3263gK, C3956tE c3956tE) {
        this.f35750b = c3261gI;
        this.f35749a = c3263gK;
        this.f35751c = c3956tE;
    }

    public static C4174xG a(String str, C3956tE c3956tE, HK hk) {
        int i;
        C3207fI D8 = C3261gI.D();
        D8.h();
        ((C3261gI) D8.f28504u).F(str);
        if (c3956tE.equals(C3956tE.f35015c)) {
            i = 2;
        } else if (c3956tE.equals(C3956tE.f35016d)) {
            i = 3;
        } else if (c3956tE.equals(C3956tE.f35017e)) {
            i = 4;
        } else if (c3956tE.equals(C3956tE.f35018f)) {
            i = 5;
        } else if (c3956tE.equals(C3956tE.f35019g)) {
            i = 6;
        } else {
            if (!c3956tE.equals(C3956tE.f35020h)) {
                throw new GeneralSecurityException("Unknown OutputPrefixType ".concat(c3956tE.f35038b));
            }
            i = 7;
        }
        D8.h();
        ((C3261gI) D8.f28504u).I(i);
        D8.h();
        ((C3261gI) D8.f28504u).G(hk);
        return b((C3261gI) D8.j());
    }

    public static C4174xG b(C3261gI c3261gI) {
        C3956tE c3956tE;
        C3263gK b9 = DG.b(c3261gI.A());
        int H8 = c3261gI.H() - 2;
        if (H8 == 0) {
            c3956tE = C3956tE.f35015c;
        } else if (H8 == 1) {
            c3956tE = C3956tE.f35016d;
        } else if (H8 == 2) {
            c3956tE = C3956tE.f35017e;
        } else if (H8 == 3) {
            c3956tE = C3956tE.f35018f;
        } else if (H8 == 4) {
            c3956tE = C3956tE.f35019g;
        } else {
            if (H8 != 5) {
                throw new GeneralSecurityException("Unknown OutputPrefixType ".concat(Integer.toString(H8)));
            }
            c3956tE = C3956tE.f35020h;
        }
        return new C4174xG(c3261gI, b9, c3956tE);
    }
}
