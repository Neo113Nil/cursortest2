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
public final class C1138Nu {
    public static byte[] A05;
    public static String[] A06 = {"SwW", "nKJOmWTx3LjNZvOp7YbBROgXIyGkfXUh", "cNvS8LZQYgXEdOP85dYAvAy4C3J", "ICxq6EmLG0dgZi7UJ5PBV2wBsvrmCfpb", "tKedy3gZYTLe", "bmz0vq", "hvIAQTYE0cdtFIL2", "tj9oqRvQS19ndgZTuA"};
    public C1266Sx A00;
    public EnumC1521bD A01 = EnumC1521bD.A05;
    public ArrayList<C1644dC> A02 = new ArrayList<>();
    public final NQ A03;
    public final InterfaceC1137Nt A04;

    public static String A04(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 97);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-35, 23, 35, 28, 27, -66, -29, -23, -38, -25, -29, -42, -31, -107, -70, -25, -25, -28, -25, -107, -89, -91, -91, -85, -107, -20, -34, -23, -35, -28, -22, -23, -107, -42, -107, -21, -42, -31, -34, -39, -107, -74, -39, -66, -29, -37, -28, -93, 21, 24, 19, 24, 21, 40, 21, 19, 22, 41, 34, 24, 32, 25, -29, -14, -21, -36, -31, -38, -30, -25, -40, -23, -38, -21, -38, -26, -20, 18, 23, 16, 24, 29, 20, 19, -16, 19, -13, 16, 35, 16, -15, 36, 29, 19, 27, 20, c.f17105c, 68, 74, 59, 72, 73, 74, c.f17105c, 74, c.f17105c, 55, 66};
    }

    static {
        A06();
    }

    public C1138Nu(C1860gi c1860gi, O8 o82, InterfaceC1137Nt interfaceC1137Nt, String str) {
        JSONObject dataObject = o82.A03();
        this.A03 = A01(c1860gi, o82, str, dataObject);
        this.A04 = interfaceC1137Nt;
    }

    private AdError A00(C1860gi c1860gi, AbstractC2025jd abstractC2025jd) {
        if (abstractC2025jd == null || abstractC2025jd.A2G().isEmpty()) {
            c1860gi.A08().ABC(A04(62, 3, 33), AbstractC1272Td.A0Z, new C1273Te(A04(5, 43, 20)));
            return AdError.internalError(AdError.INTERNAL_ERROR_2006);
        }
        return null;
    }

    public static NQ A01(C1860gi c1860gi, O8 o82, String str, JSONObject jSONObject) {
        NQ nq = null;
        if (jSONObject.has(A04(65, 12, 24))) {
            try {
                nq = C2019jT.A01(jSONObject, c1860gi, true);
                nq.A1Q(true);
                nq.A1N(A04(96, 12, 117));
            } catch (JSONException unused) {
            }
        }
        if (nq == null) {
            nq = C07377n.A00(jSONObject, c1860gi);
        }
        nq.A1M(str);
        C1292Tx A01 = o82.A01();
        if (A01 != null) {
            nq.A1I(A01.A06());
        }
        return nq;
    }

    private C1266Sx A03(C1860gi c1860gi) {
        return this.A00 != null ? this.A00 : new C1266Sx(c1860gi);
    }

    private void A08(C1860gi c1860gi, C07377n c07377n) {
        C1132No playableData = c07377n.A29().A0H().A07();
        A0B(playableData != null ? playableData.A0H() : EnumC1521bD.A05);
        C2005jC c2005jC = new C2005jC(this);
        C1266Sx c1266Sx = new C1266Sx(c1860gi);
        boolean z6 = C1310Up.A2H(c1860gi) && SN.A0A(c07377n.A1H());
        if (z6) {
            SN unifiedAssetsLoader = new SN(c1266Sx, c07377n.A1H(), c07377n.A10(), c07377n.A1D(), z6, new C2004jB(this));
            c1266Sx.A0e(new VI(c07377n.A2E(), c1860gi.A0A()));
            unifiedAssetsLoader.A0B();
            return;
        }
        O5.A02(c1860gi, c07377n, true, c2005jC);
    }

    private void A09(C1860gi c1860gi, EnumSet<CacheFlag> enumSet, AbstractC2025jd abstractC2025jd, int i, InterfaceC1137Nt interfaceC1137Nt) {
        boolean isDSL = abstractC2025jd.A1g();
        C1266Sx A03 = A03(c1860gi);
        A03.A0e(new VI(abstractC2025jd.A2E(), c1860gi.A0A()));
        boolean z6 = C1310Up.A2H(c1860gi) && SN.A0A(abstractC2025jd.A1H());
        if (z6) {
            new SN(A03, abstractC2025jd.A1H(), abstractC2025jd.A10(), abstractC2025jd.A1D(), z6, new C2008jF(this, c1860gi, isDSL, abstractC2025jd, interfaceC1137Nt)).A0B();
            return;
        }
        String A04 = A04(96, 12, 117);
        if (isDSL) {
            C1262St c1262St = new C1262St(abstractC2025jd.A0x(), abstractC2025jd.A1D(), A04);
            c1262St.A04 = true;
            c1262St.A03 = A04(0, 5, 78);
            A03.A0Y(c1262St);
        }
        A03.A0d(new C1264Sv(abstractC2025jd.A2C().A01(), C1697e4.A04, C1697e4.A04, abstractC2025jd.A1D(), A04(96, 12, 117)));
        boolean isUnifiedAssetsLoaderEnabled = enumSet.contains(CacheFlag.VIDEO);
        int i4 = 0;
        boolean A30 = C1310Up.A30(c1860gi, C1787fX.A03());
        for (NR nr : abstractC2025jd.A2G()) {
            C1264Sv c1264Sv = new C1264Sv(nr.A0H().A08(), O1.A00(nr.A0H()), O1.A01(nr.A0H()), abstractC2025jd.A1D(), A04(96, 12, 117));
            if (i4 == 0) {
                A03.A0c(c1264Sv);
            } else {
                A03.A0d(c1264Sv);
            }
            Iterator<String> it = nr.A0K().A02().iterator();
            while (it.hasNext()) {
                A03.A0d(new C1264Sv(it.next(), -1, -1, abstractC2025jd.A1D(), A04(96, 12, 117)));
            }
            if (isUnifiedAssetsLoaderEnabled && !TextUtils.isEmpty(nr.A0H().A09())) {
                C1262St c1262St2 = new C1262St(nr.A0H().A09(), abstractC2025jd.A1D(), A04(96, 12, 117), nr.A0H().A06());
                c1262St2.A04 = false;
                if (i4 == 0) {
                    if (isDSL && !A30) {
                        A03.A0Y(c1262St2);
                    } else {
                        A03.A0b(c1262St2);
                    }
                } else if (isDSL && !A30) {
                    A03.A0Z(c1262St2);
                } else {
                    A03.A0a(c1262St2);
                }
            }
            i4++;
        }
        if (abstractC2025jd.A1W() && !TextUtils.isEmpty(abstractC2025jd.A11())) {
            A03.A0d(new C1264Sv(abstractC2025jd.A11(), C1174Pe.A0A, C1174Pe.A0A, abstractC2025jd.A1D(), A04(96, 12, 117)));
        }
        O0.A00(abstractC2025jd, A03, A04);
        A03.A0X(new C2006jD(this, c1860gi, isDSL, abstractC2025jd, interfaceC1137Nt), new C1259Sq(abstractC2025jd.A1D(), A04, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A(C1860gi c1860gi, EnumSet<CacheFlag> enumSet, C2019jT c2019jT, AbstractC2025jd abstractC2025jd, int i, InterfaceC1137Nt interfaceC1137Nt) {
        A09(c1860gi, enumSet, abstractC2025jd, i, new C2010jH(this, c1860gi, abstractC2025jd, c2019jT, i, interfaceC1137Nt, enumSet));
    }

    private void A0B(EnumC1521bD enumC1521bD) {
        this.A01 = enumC1521bD;
    }

    private boolean A0C(C1860gi c1860gi, AbstractC2025jd abstractC2025jd) {
        AdError A00 = A00(c1860gi, abstractC2025jd);
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
        AbstractC2025jd abstractC2025jd = (AbstractC2025jd) this.A03;
        if (abstractC2025jd.A1g()) {
            return WK.A06;
        }
        if (abstractC2025jd.A2G().size() > 1) {
            return WK.A0A;
        }
        C1132No A07 = abstractC2025jd.A29().A0H().A07();
        if (A06[4].length() == 14) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "HO5lN2vl3hawZ3xdOTbB4PXxItmZOFKM";
        strArr[3] = "QabHGQsenJFHZf5mHftqzVXi6FXcwsQx";
        if (A07 != null) {
            if (!abstractC2025jd.A1n()) {
                boolean A1u = abstractC2025jd.A1u();
                if (A06[0].length() != 2) {
                    String[] strArr2 = A06;
                    strArr2[1] = "iV2CDA2M2IfUZLXvhnmiNr1pV0Sur2CQ";
                    strArr2[3] = "GDT4frbvCKvkZrCQcOaJTMqN9T6RIdn0";
                }
            }
            return WK.A0E;
        }
        boolean A0L = A0L(abstractC2025jd);
        if (A06[0].length() == 2) {
            throw new RuntimeException();
        }
        A06[0] = "iDu";
        if (A0L) {
            return WK.A0D;
        }
        return WK.A0B;
    }

    public final EnumC1521bD A0F() {
        return this.A01;
    }

    public final String A0G() {
        if (this.A03.A1b()) {
            return ((C2019jT) this.A03).A2A();
        }
        return ((AbstractC2025jd) this.A03).A2E();
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

    public final void A0J(C1860gi c1860gi, EnumSet<CacheFlag> enumSet) {
        if (A0E() == WK.A04) {
            C2019jT c2019jT = (C2019jT) this.A03;
            AbstractC2025jd A26 = c2019jT.A26();
            if (A0C(c1860gi, A26) || A26 == null) {
                return;
            }
            this.A04.AHY();
            A0A(c1860gi, enumSet, c2019jT, A26, 0, this.A04);
            return;
        }
        AbstractC2025jd abstractC2025jd = (AbstractC2025jd) this.A03;
        if (A06[5].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "h3j4XQE4N9RDZ4AU6tvjsFYKX3e30HKG";
        strArr[3] = "lDhcJ7lgFtqhZjTb781X3zaoWDc2BWUc";
        if (A0C(c1860gi, abstractC2025jd)) {
            return;
        }
        this.A04.AHY();
        if (A0E() == WK.A0C) {
            C07377n c07377n = (C07377n) this.A03;
            String[] strArr2 = A06;
            if (strArr2[2].length() != strArr2[6].length()) {
                A06[7] = "0uVLF1bkkTEn2WeYm46QMmOd1A6";
                A08(c1860gi, c07377n);
                return;
            } else {
                A08(c1860gi, c07377n);
                return;
            }
        }
        A09(c1860gi, enumSet, (C07377n) this.A03, -1, this.A04);
    }

    public final boolean A0K() {
        return this.A03.A1U();
    }

    public final boolean A0L(AbstractC2025jd abstractC2025jd) {
        return !TextUtils.isEmpty(abstractC2025jd.A29().A0H().A09());
    }
}
