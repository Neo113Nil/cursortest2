package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.graphics.Color;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.exoplayer.b;
import com.anythink.core.common.s.a.c;
import com.facebook.ads.AudienceNetworkActivity;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class SK {
    public static byte[] A03;
    public static String[] A04 = {"7eYgc6nX0dsf322XCwrRtT4qf3VEDMEl", "N2aCi32Gol", "cuafTeer1Z9Nb4my1kZzytDheJ", "azEUnMktT72nkCVYlmExjP7IGMIAzJqn", "aTKXKGIT8RKHn5PSJkltcYzomGOefmaB", "Nd0le1Epfxq6", "TvHh8Lt9J0iHJl7ueer52F53TQqp", "ytw5TrFQH6uy2HyuHBs1okCv8Ad5jbub"};
    public C1493b6 A00;
    public final AudienceNetworkActivity A01;
    public final C1839gi A02;

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 24);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{98, -125, c.f16474a, -109, -123, -7, -15, -16, -11, -19, 0, -11, -5, -6, -48, -19, 0, -19, -27, -31, -42, -40, -38, -30, -38, -29, -23, -66, -39, -73, -86, -74, -70, -86, -72, -71, -103, -82, -78, -86};
    }

    static {
        A01();
    }

    public SK(C1839gi c1839gi, AudienceNetworkActivity audienceNetworkActivity) {
        this.A02 = c1839gi;
        this.A01 = audienceNetworkActivity;
    }

    private void A02(int i, int i4) {
        if (this.A01.getWindow() != null) {
            this.A01.getWindow().setFlags(i, i4);
        }
    }

    public final C1687eF A03(Intent intent, RelativeLayout relativeLayout) {
        String stringExtra = intent.getStringExtra(A00(5, 13, 116));
        if (stringExtra != null) {
            C1839gi c1839gi = this.A02;
            String[] strArr = A04;
            if (strArr[3].charAt(3) == strArr[4].charAt(3)) {
                throw new RuntimeException();
            }
            A04[0] = "OM7lzL5hLk1NAc94R8uXA4rWzYteyBdY";
            C1687eF A01 = AbstractC1686eE.A01(c1839gi, stringExtra);
            if (A01 != null) {
                relativeLayout.addView(A01, new RelativeLayout.LayoutParams(-1, -1));
            }
            return A01;
        }
        return null;
    }

    public final void A04() {
        if (C1289Up.A2J(this.A01)) {
            A02(b.bc, b.bc);
        }
    }

    public final void A05() {
        if (this.A00 != null && C1289Up.A1C(this.A01)) {
            this.A00.A07();
        }
    }

    public final void A06() {
        if (C1289Up.A2R(this.A01)) {
            A02(128, 128);
        }
    }

    public final void A07(Intent intent, WK wk, RelativeLayout relativeLayout) {
        if (C1289Up.A1C(this.A01)) {
            WK wk2 = WK.A03;
            if (A04[1].length() == 14) {
                throw new RuntimeException();
            }
            A04[7] = "MXPR3PNgo3gwYNs9J3I1TINqSxswEDcD";
            if (wk != wk2) {
                this.A00 = new C1493b6();
                this.A00.A0C(intent.getStringExtra(A00(18, 11, 93)));
                C1493b6 c1493b6 = this.A00;
                String placementId = this.A01.getPackageName();
                c1493b6.A0B(placementId);
                long longExtra = intent.getLongExtra(A00(29, 11, 45), 0L);
                if (longExtra != 0) {
                    C1493b6 c1493b62 = this.A00;
                    String[] strArr = A04;
                    if (strArr[3].charAt(3) == strArr[4].charAt(3)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A04;
                    strArr2[2] = "JayLC9GMOZb39CtRqvAFG5wuJA";
                    strArr2[5] = "0wpddTnUpSmY";
                    c1493b62.A09(longExtra);
                }
                TextView textView = new TextView(this.A01);
                String placementId2 = A00(0, 5, 6);
                textView.setText(placementId2);
                textView.setTextColor(-1);
                YB.A0N(textView, Color.argb(160, 0, 0, 0));
                textView.setPadding(5, 5, 5, 5);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12, -1);
                layoutParams.addRule(11, -1);
                textView.setLayoutParams(layoutParams);
                ViewOnLongClickListenerC1213Rq viewOnLongClickListenerC1213Rq = new ViewOnLongClickListenerC1213Rq(this.A00, relativeLayout);
                textView.setOnLongClickListener(viewOnLongClickListenerC1213Rq);
                relativeLayout.setOnLongClickListener(viewOnLongClickListenerC1213Rq);
                relativeLayout.getOverlay().add(this.A00);
            }
        }
    }

    public final void A08(WK wk, boolean z8) {
        if (C1289Up.A2w(this.A02)) {
            WK wk2 = WK.A03;
            if (A04[6].length() != 28) {
                throw new RuntimeException();
            }
            A04[7] = "F6KEK3QPfCxrYVAsBDZ1FiU7CVmTBzj2";
            if (wk == wk2 && z8) {
                String[] strArr = A04;
                if (strArr[2].length() != strArr[5].length()) {
                    A04[7] = "F5zIc02zmRZruFOjSfi1BFnSSwvtFdhl";
                    A02(512, 512);
                    return;
                } else {
                    A04[6] = "OJkKw3fFO6sWC1hd1CstPV3CXDwl";
                    A02(512, 512);
                    return;
                }
            }
        }
        this.A01.requestWindowFeature(1);
        A02(1024, 1024);
    }
}
