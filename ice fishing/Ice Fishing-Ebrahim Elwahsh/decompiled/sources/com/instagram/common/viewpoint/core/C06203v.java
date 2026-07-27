package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.3v, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C06203v extends AbstractC0859Dt {
    public static String[] A01 = {"A0hxmHyocA20uKbzLNrX1cuoBFAzY21E", "I9xoCKjiIf8OmMJxcwGdtcNw1YuiDvi3", "dl", "8cu3hn6v04Mabo0DRb3BoKxPmV6m17RH", "M3PfsQ0uQOYBe23ut3RBur7M821ZKE4o", "dBLXd4nh7JPFvxg4r1eMmoTDEY", "dzagYupPsp4H2uhompZ2DySoLx14PfZd", "Z1qzuvaE1jq9Ec95ZFgzh3McR3fZkyWy"};
    public final /* synthetic */ C0852Dm A00;

    public C06203v(C0852Dm c0852Dm) {
        this.A00 = c0852Dm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0860Du c0860Du) {
        C0876Ek c0876Ek;
        boolean z8;
        Handler handler;
        boolean A0G;
        boolean z9;
        Handler handler2;
        int i;
        c0876Ek = this.A00.A01;
        if (c0876Ek == null) {
            return;
        }
        z8 = this.A00.A05;
        if (!z8 && c0860Du.A00().getAction() == 0) {
            C0852Dm c0852Dm = this.A00;
            String[] strArr = A01;
            if (strArr[5].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A01[4] = "8qKCS4QoQxaUoDKBRazWJt0HJmuP0GoR";
            handler = c0852Dm.A07;
            handler.removeCallbacksAndMessages(null);
            A0G = this.A00.A0G(EnumC1752fJ.A04);
            if (A0G) {
                this.A00.A03();
                C0852Dm c0852Dm2 = this.A00;
                if (A01[3].charAt(1) != 'x') {
                    A01[3] = "krfS0sgwBFPIM38aK2Y5K2a50FO4BQxK";
                    c0852Dm2.A06(true, false);
                } else {
                    c0852Dm2.A06(true, false);
                }
            }
            z9 = this.A00.A04;
            if (!z9) {
                return;
            }
            handler2 = this.A00.A07;
            C0853Dn c0853Dn = new C0853Dn(this);
            i = this.A00.A00;
            handler2.postDelayed(c0853Dn, i);
        }
    }
}
