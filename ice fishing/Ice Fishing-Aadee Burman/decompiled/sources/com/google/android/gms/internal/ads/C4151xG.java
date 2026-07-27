package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.xG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4151xG implements InterfaceC4259zG {

    /* renamed from: a, reason: collision with root package name */
    public final C3240gK f34968a;

    /* renamed from: b, reason: collision with root package name */
    public final C3238gI f34969b;

    /* renamed from: c, reason: collision with root package name */
    public final C3933tE f34970c;

    public C4151xG(C3238gI c3238gI, C3240gK c3240gK, C3933tE c3933tE) {
        this.f34969b = c3238gI;
        this.f34968a = c3240gK;
        this.f34970c = c3933tE;
    }

    public static C4151xG a(String str, C3933tE c3933tE, HK hk) {
        int i;
        C3184fI D8 = C3238gI.D();
        D8.h();
        ((C3238gI) D8.f27721u).F(str);
        if (c3933tE.equals(C3933tE.f34229c)) {
            i = 2;
        } else if (c3933tE.equals(C3933tE.f34230d)) {
            i = 3;
        } else if (c3933tE.equals(C3933tE.f34231e)) {
            i = 4;
        } else if (c3933tE.equals(C3933tE.f34232f)) {
            i = 5;
        } else if (c3933tE.equals(C3933tE.f34233g)) {
            i = 6;
        } else {
            if (!c3933tE.equals(C3933tE.f34234h)) {
                throw new GeneralSecurityException("Unknown OutputPrefixType ".concat(c3933tE.f34252b));
            }
            i = 7;
        }
        D8.h();
        ((C3238gI) D8.f27721u).I(i);
        D8.h();
        ((C3238gI) D8.f27721u).G(hk);
        return b((C3238gI) D8.j());
    }

    public static C4151xG b(C3238gI c3238gI) {
        C3933tE c3933tE;
        C3240gK b9 = DG.b(c3238gI.A());
        int H8 = c3238gI.H() - 2;
        if (H8 == 0) {
            c3933tE = C3933tE.f34229c;
        } else if (H8 == 1) {
            c3933tE = C3933tE.f34230d;
        } else if (H8 == 2) {
            c3933tE = C3933tE.f34231e;
        } else if (H8 == 3) {
            c3933tE = C3933tE.f34232f;
        } else if (H8 == 4) {
            c3933tE = C3933tE.f34233g;
        } else {
            if (H8 != 5) {
                throw new GeneralSecurityException("Unknown OutputPrefixType ".concat(Integer.toString(H8)));
            }
            c3933tE = C3933tE.f34234h;
        }
        return new C4151xG(c3238gI, b9, c3933tE);
    }
}
