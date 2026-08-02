package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.3v, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C06413v extends AbstractC0880Dt {
    public static String[] A01 = {"A0hxmHyocA20uKbzLNrX1cuoBFAzY21E", "I9xoCKjiIf8OmMJxcwGdtcNw1YuiDvi3", "dl", "8cu3hn6v04Mabo0DRb3BoKxPmV6m17RH", "M3PfsQ0uQOYBe23ut3RBur7M821ZKE4o", "dBLXd4nh7JPFvxg4r1eMmoTDEY", "dzagYupPsp4H2uhompZ2DySoLx14PfZd", "Z1qzuvaE1jq9Ec95ZFgzh3McR3fZkyWy"};
    public final /* synthetic */ C0873Dm A00;

    public C06413v(C0873Dm c0873Dm) {
        this.A00 = c0873Dm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0881Du c0881Du) {
        C0897Ek c0897Ek;
        boolean z6;
        Handler handler;
        boolean A0G;
        boolean z9;
        Handler handler2;
        int i;
        c0897Ek = this.A00.A01;
        if (c0897Ek == null) {
            return;
        }
        z6 = this.A00.A05;
        if (!z6 && c0881Du.A00().getAction() == 0) {
            C0873Dm c0873Dm = this.A00;
            String[] strArr = A01;
            if (strArr[5].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A01[4] = "8qKCS4QoQxaUoDKBRazWJt0HJmuP0GoR";
            handler = c0873Dm.A07;
            handler.removeCallbacksAndMessages(null);
            A0G = this.A00.A0G(EnumC1773fJ.A04);
            if (A0G) {
                this.A00.A03();
                C0873Dm c0873Dm2 = this.A00;
                if (A01[3].charAt(1) != 'x') {
                    A01[3] = "krfS0sgwBFPIM38aK2Y5K2a50FO4BQxK";
                    c0873Dm2.A06(true, false);
                } else {
                    c0873Dm2.A06(true, false);
                }
            }
            z9 = this.A00.A04;
            if (!z9) {
                return;
            }
            handler2 = this.A00.A07;
            C0874Dn c0874Dn = new C0874Dn(this);
            i = this.A00.A00;
            handler2.postDelayed(c0874Dn, i);
        }
    }
}
