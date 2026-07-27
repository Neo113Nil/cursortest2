package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Er, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0884Er extends AbstractRunnableC1327Wc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C0877Ek A02;
    public final /* synthetic */ EnumC1782fm A03;

    public C0884Er(C0877Ek c0877Ek, EnumC1782fm enumC1782fm, int i, int i6) {
        this.A02 = c0877Ek;
        this.A03 = enumC1782fm;
        this.A00 = i;
        this.A01 = i6;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1327Wc
    public final void A07() {
        C1840gi c1840gi;
        Handler handler;
        UM um;
        C1840gi c1840gi2;
        UM um2;
        C0862Dv c0862Dv;
        Handler handler2;
        C1840gi c1840gi3;
        UM um3;
        Handler handler3;
        C1840gi c1840gi4;
        C1840gi c1840gi5;
        UM um4;
        E3 e32;
        Handler handler4;
        C1840gi c1840gi6;
        C1840gi c1840gi7;
        Handler handler5;
        UM um5;
        UM um6;
        E9 e9;
        C1840gi c1840gi8;
        UM um7;
        E1 e12;
        if (this.A03 == EnumC1782fm.A07) {
            this.A02.A0M(VH.A0y);
            c1840gi8 = this.A02.A0B;
            c1840gi8.A0F().A3j();
            um7 = this.A02.A0C;
            e12 = C0877Ek.A0J;
            um7.A02(e12);
            return;
        }
        if (this.A03 == EnumC1782fm.A03) {
            this.A02.A0M(VH.A0t);
            this.A02.A04 = true;
            um6 = this.A02.A0C;
            e9 = C0877Ek.A0H;
            um6.A02(e9);
            this.A02.A0L(this.A00);
            return;
        }
        if (this.A03 == EnumC1782fm.A06) {
            this.A02.A0M(VH.A0s);
            c1840gi7 = this.A02.A0B;
            c1840gi7.A0F().A3b();
            this.A02.A04 = true;
            handler5 = this.A02.A08;
            handler5.removeCallbacksAndMessages(null);
            um5 = this.A02.A0C;
            um5.A02(new C4K(this.A01, this.A01));
            this.A02.A0L(this.A01);
            return;
        }
        if (this.A03 == EnumC1782fm.A0A) {
            c1840gi4 = this.A02.A0B;
            if (C1290Up.A1z(c1840gi4)) {
                c1840gi6 = this.A02.A0B;
                c1840gi6.A0B().AGc();
            }
            this.A02.A0M(VH.A0w);
            c1840gi5 = this.A02.A0B;
            c1840gi5.A0F().A3q();
            um4 = this.A02.A0C;
            e32 = C0877Ek.A0I;
            um4.A02(e32);
            handler4 = this.A02.A08;
            handler4.removeCallbacksAndMessages(null);
            this.A02.A0I();
            return;
        }
        if (this.A03 == EnumC1782fm.A05) {
            this.A02.A0M(VH.A0v);
            c1840gi3 = this.A02.A0B;
            c1840gi3.A0F().A3f();
            um3 = this.A02.A0C;
            final int i = this.A00;
            um3.A02(new EB(i) { // from class: com.facebook.ads.redexgen.X.4B
            });
            handler3 = this.A02.A08;
            handler3.removeCallbacksAndMessages(null);
            this.A02.A0L(this.A00);
            return;
        }
        if (this.A03 == EnumC1782fm.A04) {
            this.A02.A0M(VH.A0u);
            c1840gi2 = this.A02.A0B;
            c1840gi2.A0F().A3c();
            um2 = this.A02.A0C;
            c0862Dv = C0877Ek.A0L;
            um2.A02(c0862Dv);
            handler2 = this.A02.A08;
            handler2.removeCallbacksAndMessages(null);
            return;
        }
        if (this.A03 == EnumC1782fm.A09) {
            this.A02.A0M(VH.A0s);
            c1840gi = this.A02.A0B;
            c1840gi.A0F().A3l();
            this.A02.A04 = true;
            handler = this.A02.A08;
            handler.removeCallbacksAndMessages(null);
            um = this.A02.A0C;
            um.A02(new C4K(this.A00, this.A01));
            this.A02.A0L(this.A00);
        }
    }
}
