package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.widget.FrameLayout;
import com.anythink.basead.exoplayer.f;
import com.anythink.core.common.s.a.c;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.d4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1616d4 extends FrameLayout {
    public static byte[] A0L;
    public static String[] A0M = {"nL4f6tElOIWkWIMY", "pafc", "mmt", "r2KL", "cPD1EcNrMsc9Il", "HjHry0SxIHtlyHB0wW8GJ6CkWWRugdPq", "pjLQgfnHLp272wJByK44k5CENQyu64qM", "USuv5isgmNE5xLLzg"};
    public EnumC1727et A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AbstractC2005jd A05;
    public final C1246Sx A06;
    public final C1840gi A07;
    public final VI A08;
    public final InterfaceC1381Yh A09;
    public final ZU A0A;
    public final InterfaceC1615d3 A0B;
    public final C0887Eu A0C;
    public final C0877Ek A0D;
    public final C4L A0E;
    public final EA A0F;
    public final E8 A0G;
    public final E4 A0H;
    public final E2 A0I;
    public final E0 A0J;
    public final AbstractC0866Dz A0K;

    public static String A02(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i, i + i6);
        int i10 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0M[0].length() != 16) {
                throw new RuntimeException();
            }
            A0M[0] = "7kRjpWt7kPSYf5Zn";
            if (i10 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 13);
            i10++;
        }
    }

    public static void A0C() {
        A0L = new byte[]{-112, -94, -97, -97, -110, -101, -95, -127, -106, -102, -110, -81, -64, -67, -84, -65, -76, -70, -71, -20, -12, -13, -28, -29, -14, -29, -9, -11, -25, -26, -60, -5, -41, -11, -25, -12, -19, -17, -20, -28, -17, -30, -16, -16};
    }

    static {
        A0C();
    }

    public C1616d4(C1840gi c1840gi, VA va, AbstractC2005jd abstractC2005jd, C1246Sx c1246Sx, VI vi, InterfaceC1381Yh interfaceC1381Yh, ZU zu, InterfaceC1615d3 interfaceC1615d3) {
        super(c1840gi);
        boolean z3;
        this.A0J = new E0() { // from class: com.facebook.ads.redexgen.X.5w
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i, int i6, int i9) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
                for (int i10 = 0; i10 < copyOfRange.length; i10++) {
                    copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 124);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{53, 55, 42, 53, 38, 55, 42, 41};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.UN
            /* renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final void A03(E1 e12) {
                InterfaceC1615d3 interfaceC1615d32;
                JSONObject A03;
                C1616d4.this.A03 = true;
                interfaceC1615d32 = C1616d4.this.A0B;
                A03 = C1616d4.this.A03();
                interfaceC1615d32.AGR(A00(0, 8, 73), A03);
            }
        };
        this.A0I = new E2() { // from class: com.facebook.ads.redexgen.X.5s
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i, int i6, int i9) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
                for (int i10 = 0; i10 < copyOfRange.length; i10++) {
                    copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 106);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{112, 108, 97, 121};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.UN
            /* renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final void A03(E3 e32) {
                InterfaceC1615d3 interfaceC1615d32;
                JSONObject A03;
                C1616d4.this.A04 = true;
                interfaceC1615d32 = C1616d4.this.A0B;
                A03 = C1616d4.this.A03();
                interfaceC1615d32.AGR(A00(0, 4, 106), A03);
            }
        };
        this.A0H = new E4() { // from class: com.facebook.ads.redexgen.X.5r
            public static byte[] A01;
            public static String[] A02 = {"QUZtp6d2PVvxohxxHBY0lFVIZrOHPJmP", "NfxzKLWElZxETrhEeUBSDM4deWBqLSti", "M1wrkGT1p8fg9I16hadPO98y5LyXX3HA", "lshWtPbnAXBsXbgnJLDmxkjrZI", "6PixpSZW8UzyowqAm", "UIpIdTluG2bhvKFOHpQ9k0cfwSXrRmCx", "lSmcWeUXMp1pu4geeqYJMaSrMHF509BD", "gheUZ0KSYWPh4kTG81LfbEHF2a7TTHcT"};

            public static String A00(int i, int i6, int i9) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
                int i10 = 0;
                while (true) {
                    int length = copyOfRange.length;
                    if (A02[6].charAt(28) != '0') {
                        throw new RuntimeException();
                    }
                    A02[6] = "QE45n4HEQOiTUZDVXPk8ylx4JLny0ok5";
                    if (i10 >= length) {
                        return new String(copyOfRange);
                    }
                    copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 111);
                    i10++;
                }
            }

            public static void A01() {
                A01 = new byte[]{59, 44, c.f16317b, 62, 48};
            }

            static {
                A01();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.UN
            /* renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final void A03(C4B c4b) {
                InterfaceC1615d3 interfaceC1615d32;
                JSONObject A03;
                interfaceC1615d32 = C1616d4.this.A0B;
                A03 = C1616d4.this.A03();
                interfaceC1615d32.AGR(A00(0, 5, 92), A03);
            }
        };
        this.A0K = new AbstractC0866Dz() { // from class: com.facebook.ads.redexgen.X.5q
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C4A c4a) {
                C1616d4.this.A0H(c4a);
                C1616d4.this.A0A();
            }
        };
        this.A0F = new EA() { // from class: com.facebook.ads.redexgen.X.5n
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i, int i6, int i9) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
                for (int i10 = 0; i10 < copyOfRange.length; i10++) {
                    copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 95);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{107, 103, 101, 120, 100, 109, 124, 109, 108};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.UN
            /* renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final void A03(C4K c4k) {
                InterfaceC1615d3 interfaceC1615d32;
                C0877Ek c0877Ek;
                JSONObject A04;
                C1616d4.this.A07();
                interfaceC1615d32 = C1616d4.this.A0B;
                C1616d4 c1616d4 = C1616d4.this;
                c0877Ek = C1616d4.this.A0D;
                A04 = c1616d4.A04(c0877Ek.getDuration());
                interfaceC1615d32.AGR(A00(0, 9, 87), A04);
            }
        };
        this.A0G = new C06645m(this);
        this.A03 = false;
        this.A04 = false;
        this.A02 = false;
        this.A01 = false;
        this.A07 = c1840gi;
        this.A05 = abstractC2005jd;
        this.A06 = c1246Sx;
        this.A08 = vi;
        this.A09 = interfaceC1381Yh;
        this.A0A = zu;
        this.A0D = new C0877Ek(c1840gi);
        this.A0B = interfaceC1615d3;
        this.A0D.setFunnelLoggingHandler(vi);
        this.A0D.getEventBus().A03(this.A0J, this.A0I, this.A0H, this.A0K, this.A0F, this.A0G);
        this.A0E = new C4L(c1840gi, va, this.A0D, abstractC2005jd.A2E());
        if (C1290Up.A20(this.A07)) {
            z3 = true;
            this.A0C = new C0887Eu(c1840gi, va, this.A0D, abstractC2005jd.A2E(), false, this.A0E, null);
        } else {
            z3 = true;
            this.A0C = null;
        }
        A0B();
        this.A0D.setVideoURI(this.A06.A0T(this.A05.A29().A0H().A09()));
        A09();
        YB.A0N(this, this.A05.A28().A01().A08(z3));
        String videoUrl = abstractC2005jd.A29().A0H().A08();
        if (!TextUtils.isEmpty(videoUrl)) {
            AbstractC1541br.A00(c1840gi, this, videoUrl);
        }
        addView(this.A0D, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject A03() {
        return A04(this.A0D.getCurrentPositionInMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject A04(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A02(0, 11, 32), i);
            jSONObject.put(A02(11, 8, 62), this.A0D.getDuration());
            jSONObject.put(A02(19, 5, 114), this.A0D.A0m());
            jSONObject.put(A02(24, 12, 117), this.A0D.A0o());
            return jSONObject;
        } catch (JSONException e9) {
            throw new RuntimeException(e9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        if (this.A02) {
            return;
        }
        this.A02 = true;
    }

    private void A08() {
        this.A0D.postDelayed(new JC(this), C1290Up.A0O(this.A07));
    }

    private void A09() {
        this.A0D.postDelayed(new J8(this), C1290Up.A0P(this.A07));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        this.A0B.AGR(A02(36, 8, 112), A03());
    }

    private void A0B() {
        if (!TextUtils.isEmpty(this.A05.A29().A0H().A08())) {
            C3S c3s = new C3S(this.A07);
            this.A0D.A0f(c3s);
            c3s.setImage(this.A05.A29().A0H().A08());
        }
        AnonymousClass34 anonymousClass34 = new AnonymousClass34(this.A07, true, this.A08);
        this.A0D.A0f(anonymousClass34);
        this.A0D.A0f(new C0848Dh(anonymousClass34, EnumC1743f9.A02, true));
        this.A0D.A0f(new C3B(this.A07));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(C4A c4a) {
        if (this.A0D.getState() == EnumC1782fm.A02 && C1290Up.A1e(this.A07)) {
            this.A0D.postDelayed(new J5(this, c4a), f.f7187a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(String str) {
        this.A07.A0F().A3a(str);
        if (C1290Up.A1f(this.A07)) {
            A07();
        } else {
            this.A09.A4j(this.A0A.A81());
            this.A09.A4j(this.A0A.A7w());
        }
    }

    public final void A0N() {
        this.A0D.setVolume(this.A05.A29().A0H().A0A() ? 0.0f : 1.0f);
        this.A0D.A0e(EnumC1727et.A02, 26);
        A08();
    }

    public final void A0O() {
        if (this.A0D != null) {
            if (!this.A02) {
                this.A0D.A0d(EnumC1719el.A03);
            }
            this.A0D.getEventBus().A04(this.A0J, this.A0I, this.A0H, this.A0K, this.A0F, this.A0G);
            this.A0D.A0W();
        }
        if (this.A0C != null) {
            this.A0C.A07();
        }
        this.A0E.A0p();
    }

    public final void A0P() {
        this.A0D.A0b(9);
        YB.A0W(this);
        YB.A0H(this.A0D);
        YB.A0d(this.A0D);
    }

    public final void A0Q() {
        this.A0D.A0d(EnumC1719el.A04);
    }

    public final void A0R(boolean z3) {
        if (z3) {
            this.A0D.setVolume(0.0f);
        } else {
            this.A0D.setVolume(1.0f);
        }
        A0A();
    }

    public final void A0S(boolean z3) {
        if (this.A0D.A0n()) {
            return;
        }
        this.A00 = this.A0D.getVideoStartReason();
        this.A01 = z3;
        this.A0D.A0i(false, 19);
    }

    public final void A0T(boolean z3) {
        if (this.A0D.A0o() || this.A02 || this.A0D.getState() == EnumC1782fm.A06 || this.A00 == null) {
            return;
        }
        if (!this.A01 || z3) {
            this.A0D.A0e(this.A00, 27);
        }
    }

    public final void A0U(boolean z3) {
        this.A0D.A0i(z3, 18);
    }

    public final void A0V(boolean z3) {
        this.A0D.A0e(EnumC1727et.A04, 25);
    }
}
