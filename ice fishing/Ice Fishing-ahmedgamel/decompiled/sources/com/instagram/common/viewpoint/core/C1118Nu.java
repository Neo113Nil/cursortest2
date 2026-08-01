package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.text.TextUtils;
import com.anythink.core.common.s.a.c;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Nu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1118Nu {
    public static byte[] A05;
    public static String[] A06 = {"SwW", "nKJOmWTx3LjNZvOp7YbBROgXIyGkfXUh", "cNvS8LZQYgXEdOP85dYAvAy4C3J", "ICxq6EmLG0dgZi7UJ5PBV2wBsvrmCfpb", "tKedy3gZYTLe", "bmz0vq", "hvIAQTYE0cdtFIL2", "tj9oqRvQS19ndgZTuA"};
    public C1246Sx A00;
    public EnumC1501bD A01 = EnumC1501bD.A05;
    public ArrayList<C1624dC> A02 = new ArrayList<>();
    public final NQ A03;
    public final InterfaceC1117Nt A04;

    public static String A04(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 97);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-35, 23, 35, 28, 27, -66, -29, -23, -38, -25, -29, -42, -31, -107, -70, -25, -25, -28, -25, -107, -89, -91, -91, -85, -107, -20, -34, -23, -35, -28, -22, -23, -107, -42, -107, -21, -42, -31, -34, -39, -107, -74, -39, -66, -29, -37, -28, -93, 21, 24, 19, 24, 21, 40, 21, 19, 22, 41, 34, 24, 32, 25, -29, -14, -21, -36, -31, -38, -30, -25, -40, -23, -38, -21, -38, -26, -20, 18, 23, 16, 24, 29, 20, 19, -16, 19, -13, 16, 35, 16, -15, 36, 29, 19, 27, 20, c.f16318c, 68, 74, 59, 72, 73, 74, c.f16318c, 74, c.f16318c, 55, 66};
    }

    static {
        A06();
    }

    public C1118Nu(C1840gi c1840gi, O8 o82, InterfaceC1117Nt interfaceC1117Nt, String str) {
        JSONObject dataObject = o82.A03();
        this.A03 = A01(c1840gi, o82, str, dataObject);
        this.A04 = interfaceC1117Nt;
    }

    private AdError A00(C1840gi c1840gi, AbstractC2005jd abstractC2005jd) {
        if (abstractC2005jd == null || abstractC2005jd.A2G().isEmpty()) {
            c1840gi.A08().ABC(A04(62, 3, 33), AbstractC1252Td.A0Z, new C1253Te(A04(5, 43, 20)));
            return AdError.internalError(AdError.INTERNAL_ERROR_2006);
        }
        return null;
    }

    public static NQ A01(C1840gi c1840gi, O8 o82, String str, JSONObject jSONObject) {
        NQ nq = null;
        if (jSONObject.has(A04(65, 12, 24))) {
            try {
                nq = C1999jT.A01(jSONObject, c1840gi, true);
                nq.A1Q(true);
                nq.A1N(A04(96, 12, 117));
            } catch (JSONException unused) {
            }
        }
        if (nq == null) {
            nq = C07177n.A00(jSONObject, c1840gi);
        }
        nq.A1M(str);
        C1272Tx A01 = o82.A01();
        if (A01 != null) {
            nq.A1I(A01.A06());
        }
        return nq;
    }

    private C1246Sx A03(C1840gi c1840gi) {
        return this.A00 != null ? this.A00 : new C1246Sx(c1840gi);
    }

    private void A08(C1840gi c1840gi, C07177n c07177n) {
        C1112No playableData = c07177n.A29().A0H().A07();
        A0B(playableData != null ? playableData.A0H() : EnumC1501bD.A05);
        C1985jC c1985jC = new C1985jC(this);
        C1246Sx c1246Sx = new C1246Sx(c1840gi);
        boolean z3 = C1290Up.A2H(c1840gi) && SN.A0A(c07177n.A1H());
        if (z3) {
            SN unifiedAssetsLoader = new SN(c1246Sx, c07177n.A1H(), c07177n.A10(), c07177n.A1D(), z3, new C1984jB(this));
            c1246Sx.A0e(new VI(c07177n.A2E(), c1840gi.A0A()));
            unifiedAssetsLoader.A0B();
            return;
        }
        O5.A02(c1840gi, c07177n, true, c1985jC);
    }

    private void A09(C1840gi c1840gi, EnumSet<CacheFlag> enumSet, AbstractC2005jd abstractC2005jd, int i, InterfaceC1117Nt interfaceC1117Nt) {
        boolean isDSL = abstractC2005jd.A1g();
        C1246Sx A03 = A03(c1840gi);
        A03.A0e(new VI(abstractC2005jd.A2E(), c1840gi.A0A()));
        boolean z3 = C1290Up.A2H(c1840gi) && SN.A0A(abstractC2005jd.A1H());
        if (z3) {
            new SN(A03, abstractC2005jd.A1H(), abstractC2005jd.A10(), abstractC2005jd.A1D(), z3, new C1988jF(this, c1840gi, isDSL, abstractC2005jd, interfaceC1117Nt)).A0B();
            return;
        }
        String A04 = A04(96, 12, 117);
        if (isDSL) {
            C1242St c1242St = new C1242St(abstractC2005jd.A0x(), abstractC2005jd.A1D(), A04);
            c1242St.A04 = true;
            c1242St.A03 = A04(0, 5, 78);
            A03.A0Y(c1242St);
        }
        A03.A0d(new C1244Sv(abstractC2005jd.A2C().A01(), C1677e4.A04, C1677e4.A04, abstractC2005jd.A1D(), A04(96, 12, 117)));
        boolean isUnifiedAssetsLoaderEnabled = enumSet.contains(CacheFlag.VIDEO);
        int i6 = 0;
        boolean A30 = C1290Up.A30(c1840gi, C1767fX.A03());
        for (NR nr : abstractC2005jd.A2G()) {
            C1244Sv c1244Sv = new C1244Sv(nr.A0H().A08(), O1.A00(nr.A0H()), O1.A01(nr.A0H()), abstractC2005jd.A1D(), A04(96, 12, 117));
            if (i6 == 0) {
                A03.A0c(c1244Sv);
            } else {
                A03.A0d(c1244Sv);
            }
            Iterator<String> it = nr.A0K().A02().iterator();
            while (it.hasNext()) {
                A03.A0d(new C1244Sv(it.next(), -1, -1, abstractC2005jd.A1D(), A04(96, 12, 117)));
            }
            if (isUnifiedAssetsLoaderEnabled && !TextUtils.isEmpty(nr.A0H().A09())) {
                C1242St c1242St2 = new C1242St(nr.A0H().A09(), abstractC2005jd.A1D(), A04(96, 12, 117), nr.A0H().A06());
                c1242St2.A04 = false;
                if (i6 == 0) {
                    if (isDSL && !A30) {
                        A03.A0Y(c1242St2);
                    } else {
                        A03.A0b(c1242St2);
                    }
                } else if (isDSL && !A30) {
                    A03.A0Z(c1242St2);
                } else {
                    A03.A0a(c1242St2);
                }
            }
            i6++;
        }
        if (abstractC2005jd.A1W() && !TextUtils.isEmpty(abstractC2005jd.A11())) {
            A03.A0d(new C1244Sv(abstractC2005jd.A11(), C1154Pe.A0A, C1154Pe.A0A, abstractC2005jd.A1D(), A04(96, 12, 117)));
        }
        O0.A00(abstractC2005jd, A03, A04);
        A03.A0X(new C1986jD(this, c1840gi, isDSL, abstractC2005jd, interfaceC1117Nt), new C1239Sq(abstractC2005jd.A1D(), A04, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A(C1840gi c1840gi, EnumSet<CacheFlag> enumSet, C1999jT c1999jT, AbstractC2005jd abstractC2005jd, int i, InterfaceC1117Nt interfaceC1117Nt) {
        A09(c1840gi, enumSet, abstractC2005jd, i, new C1990jH(this, c1840gi, abstractC2005jd, c1999jT, i, interfaceC1117Nt, enumSet));
    }

    private void A0B(EnumC1501bD enumC1501bD) {
        this.A01 = enumC1501bD;
    }

    private boolean A0C(C1840gi c1840gi, AbstractC2005jd abstractC2005jd) {
        AdError A00 = A00(c1840gi, abstractC2005jd);
        if (A00 != null) {
            this.A04.ACo(A00);
            return true;
        }
        return false;
    }

    public final NQ A0D() {
        return this.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        return com.instagram.common.viewpoint.core.WK.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WK A0E() {
        if (this.A03.A1b()) {
            return WK.A04;
        }
        AbstractC2005jd abstractC2005jd = (AbstractC2005jd) this.A03;
        if (abstractC2005jd.A1g()) {
            return WK.A06;
        }
        if (abstractC2005jd.A2G().size() > 1) {
            return WK.A0A;
        }
        C1112No A07 = abstractC2005jd.A29().A0H().A07();
        if (A06[4].length() == 14) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "HO5lN2vl3hawZ3xdOTbB4PXxItmZOFKM";
        strArr[3] = "QabHGQsenJFHZf5mHftqzVXi6FXcwsQx";
        if (A07 != null) {
            if (!abstractC2005jd.A1n()) {
                boolean A1u = abstractC2005jd.A1u();
                if (A06[0].length() != 2) {
                    String[] strArr2 = A06;
                    strArr2[1] = "iV2CDA2M2IfUZLXvhnmiNr1pV0Sur2CQ";
                    strArr2[3] = "GDT4frbvCKvkZrCQcOaJTMqN9T6RIdn0";
                }
            }
            return WK.A0E;
        }
        boolean A0L = A0L(abstractC2005jd);
        if (A06[0].length() == 2) {
            throw new RuntimeException();
        }
        A06[0] = "iDu";
        if (A0L) {
            return WK.A0D;
        }
        return WK.A0B;
    }

    public final EnumC1501bD A0F() {
        return this.A01;
    }

    public final String A0G() {
        if (this.A03.A1b()) {
            return ((C1999jT) this.A03).A2A();
        }
        return ((AbstractC2005jd) this.A03).A2E();
    }

    public final void A0H() {
        this.A04.AKX();
    }

    public final void A0I(Intent intent, RewardData rewardData, String str) {
        this.A03.A1K(rewardData);
        this.A03.A1O(str);
        if (A0D().A1b()) {
            intent.putExtra(A04(77, 19, 78), this.A03);
        }
        intent.putExtra(A04(48, 14, 83), this.A03);
    }

    public final void A0J(C1840gi c1840gi, EnumSet<CacheFlag> enumSet) {
        if (A0E() == WK.A04) {
            C1999jT c1999jT = (C1999jT) this.A03;
            AbstractC2005jd A26 = c1999jT.A26();
            if (A0C(c1840gi, A26) || A26 == null) {
                return;
            }
            this.A04.AHY();
            A0A(c1840gi, enumSet, c1999jT, A26, 0, this.A04);
            return;
        }
        AbstractC2005jd abstractC2005jd = (AbstractC2005jd) this.A03;
        if (A06[5].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "h3j4XQE4N9RDZ4AU6tvjsFYKX3e30HKG";
        strArr[3] = "lDhcJ7lgFtqhZjTb781X3zaoWDc2BWUc";
        if (A0C(c1840gi, abstractC2005jd)) {
            return;
        }
        this.A04.AHY();
        if (A0E() == WK.A0C) {
            C07177n c07177n = (C07177n) this.A03;
            String[] strArr2 = A06;
            if (strArr2[2].length() != strArr2[6].length()) {
                A06[7] = "0uVLF1bkkTEn2WeYm46QMmOd1A6";
                A08(c1840gi, c07177n);
                return;
            } else {
                A08(c1840gi, c07177n);
                return;
            }
        }
        A09(c1840gi, enumSet, (C07177n) this.A03, -1, this.A04);
    }

    public final boolean A0K() {
        return this.A03.A1U();
    }

    public final boolean A0L(AbstractC2005jd abstractC2005jd) {
        return !TextUtils.isEmpty(abstractC2005jd.A29().A0H().A09());
    }
}
