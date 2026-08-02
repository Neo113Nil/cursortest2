package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Er, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0904Er extends AbstractRunnableC1347Wc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C0897Ek A02;
    public final /* synthetic */ EnumC1802fm A03;

    public C0904Er(C0897Ek c0897Ek, EnumC1802fm enumC1802fm, int i, int i4) {
        this.A02 = c0897Ek;
        this.A03 = enumC1802fm;
        this.A00 = i;
        this.A01 = i4;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        C1860gi c1860gi;
        Handler handler;
        UM um;
        C1860gi c1860gi2;
        UM um2;
        C0882Dv c0882Dv;
        Handler handler2;
        C1860gi c1860gi3;
        UM um3;
        Handler handler3;
        C1860gi c1860gi4;
        C1860gi c1860gi5;
        UM um4;
        E3 e32;
        Handler handler4;
        C1860gi c1860gi6;
        C1860gi c1860gi7;
        Handler handler5;
        UM um5;
        UM um6;
        E9 e9;
        C1860gi c1860gi8;
        UM um7;
        E1 e12;
        if (this.A03 == EnumC1802fm.A07) {
            this.A02.A0M(VH.A0y);
            c1860gi8 = this.A02.A0B;
            c1860gi8.A0F().A3j();
            um7 = this.A02.A0C;
            e12 = C0897Ek.A0J;
            um7.A02(e12);
            return;
        }
        if (this.A03 == EnumC1802fm.A03) {
            this.A02.A0M(VH.A0t);
            this.A02.A04 = true;
            um6 = this.A02.A0C;
            e9 = C0897Ek.A0H;
            um6.A02(e9);
            this.A02.A0L(this.A00);
            return;
        }
        if (this.A03 == EnumC1802fm.A06) {
            this.A02.A0M(VH.A0s);
            c1860gi7 = this.A02.A0B;
            c1860gi7.A0F().A3b();
            this.A02.A04 = true;
            handler5 = this.A02.A08;
            handler5.removeCallbacksAndMessages(null);
            um5 = this.A02.A0C;
            um5.A02(new C4K(this.A01, this.A01));
            this.A02.A0L(this.A01);
            return;
        }
        if (this.A03 == EnumC1802fm.A0A) {
            c1860gi4 = this.A02.A0B;
            if (C1310Up.A1z(c1860gi4)) {
                c1860gi6 = this.A02.A0B;
                c1860gi6.A0B().AGc();
            }
            this.A02.A0M(VH.A0w);
            c1860gi5 = this.A02.A0B;
            c1860gi5.A0F().A3q();
            um4 = this.A02.A0C;
            e32 = C0897Ek.A0I;
            um4.A02(e32);
            handler4 = this.A02.A08;
            handler4.removeCallbacksAndMessages(null);
            this.A02.A0I();
            return;
        }
        if (this.A03 == EnumC1802fm.A05) {
            this.A02.A0M(VH.A0v);
            c1860gi3 = this.A02.A0B;
            c1860gi3.A0F().A3f();
            um3 = this.A02.A0C;
            final int i = this.A00;
            um3.A02(new EB(i) { // from class: com.facebook.ads.redexgen.X.4B
            });
            handler3 = this.A02.A08;
            handler3.removeCallbacksAndMessages(null);
            this.A02.A0L(this.A00);
            return;
        }
        if (this.A03 == EnumC1802fm.A04) {
            this.A02.A0M(VH.A0u);
            c1860gi2 = this.A02.A0B;
            c1860gi2.A0F().A3c();
            um2 = this.A02.A0C;
            c0882Dv = C0897Ek.A0L;
            um2.A02(c0882Dv);
            handler2 = this.A02.A08;
            handler2.removeCallbacksAndMessages(null);
            return;
        }
        if (this.A03 == EnumC1802fm.A09) {
            this.A02.A0M(VH.A0s);
            c1860gi = this.A02.A0B;
            c1860gi.A0F().A3l();
            this.A02.A04 = true;
            handler = this.A02.A08;
            handler.removeCallbacksAndMessages(null);
            um = this.A02.A0C;
            um.A02(new C4K(this.A00, this.A01));
            this.A02.A0L(this.A00);
        }
    }
}
