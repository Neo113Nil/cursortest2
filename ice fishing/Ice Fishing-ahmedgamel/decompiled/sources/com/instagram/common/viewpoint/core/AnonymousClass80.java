package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.80, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass80 implements InterfaceC2036k8 {
    public static byte[] A09;
    public static String[] A0A = {"0TFgGHCmbDEnT", "P3BoNX3HbYs3p91Xznd9cH02Ego1LEzw", "OWrFl7C0gkEmqIZvATANnxtRvMpHSetZ", "XjLJU23F7IQ7TgYJbWjoa78", "8eUGin29aZrVydG4hLQZ04ng176drDiv", "tE42BGb8ExLW22Y3fw0IicKZ4ID1w2IZ", "N0c3cK9W7W98ikBdYu66t8J", "EarR2SOYmotvRVJvY11PbnGgxllwGrNq"};
    public N9 A01;
    public NA A02;
    public C2012jk A03;
    public C2010ji A04;
    public AnonymousClass76 A05;
    public Z1 A06;
    public Z2 A07;
    public final String A08 = UUID.randomUUID().toString();
    public long A00 = -1;

    public static String A03(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 16);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-81, -64, -11, -19, -20, -15, -3, -11, -25, -6, -19, -21, -4, -23, -10, -17, -12, -19};
    }

    static {
        A04();
    }

    private void A05(AnonymousClass76 anonymousClass76, C2010ji c2010ji, C1246Sx c1246Sx, N9 n9, Z2 z22) {
        String A7O = c2010ji.A7O();
        if (!TextUtils.isEmpty(A7O)) {
            c1246Sx.A0e(new VI(A7O, anonymousClass76.A0A()));
        }
        C1302Vb A0I = c2010ji.A0I();
        String[] strArr = A0A;
        String clientToken = strArr[3];
        if (clientToken.length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[3] = "l0iKT0z7S0YTo68xxrsf1qJ";
        strArr2[6] = "FTb7Q8n5ne47CtPUjUxYv1n";
        if (A0I != null) {
            C1244Sv c1244Sv = new C1244Sv(c2010ji.A0I().getUrl(), c2010ji.A0I().getHeight(), c2010ji.A0I().getWidth(), c2010ji.A0b(), A03(2, 16, 120));
            c1244Sv.A01 = new T3(false, -1, -1);
            c1246Sx.A0W();
            c1246Sx.A0c(c1244Sv);
        }
        if (c2010ji.A0H() != null) {
            c1246Sx.A0c(new C1244Sv(c2010ji.A0H().getUrl(), c2010ji.A0H().getHeight(), c2010ji.A0H().getWidth(), c2010ji.A0b(), A03(2, 16, 120)));
        }
        String A0e = c2010ji.A0e();
        if (A0e != null && !TextUtils.isEmpty(A0e)) {
            c1246Sx.A0b(new C1242St(A0e, c2010ji.A0b(), A03(2, 16, 120), c2010ji.A0D()));
        }
        AbstractC2005jd A0F = c2010ji.A0F();
        String A03 = A03(2, 16, 120);
        if (A0F != null) {
            O0.A00(c2010ji.A0F(), c1246Sx, A03);
        }
        C2024jw c2024jw = new C2024jw(this, z22, n9, anonymousClass76);
        String clientToken2 = c2010ji.A0b();
        c1246Sx.A0X(c2024jw, new C1239Sq(clientToken2, A03));
    }

    @Override // com.instagram.common.viewpoint.core.N1
    public final String A7O() {
        if (this.A04 == null) {
            return null;
        }
        return this.A04.A7O();
    }

    @Override // com.instagram.common.viewpoint.core.N1
    public final AdPlacementType A8k() {
        return AdPlacementType.MEDIUM_RECTANGLE;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2036k8
    public final void AAt(AnonymousClass76 anonymousClass76, VA va, EnumC1314Vp enumC1314Vp, N9 n9, JSONObject jSONObject, C1272Tx c1272Tx) {
        anonymousClass76.A0F().A4N();
        this.A05 = anonymousClass76;
        this.A01 = n9;
        C1246Sx c1246Sx = new C1246Sx(anonymousClass76);
        this.A00 = System.currentTimeMillis();
        C2010ji A00 = NI.A00(anonymousClass76, jSONObject, AbstractC1351Xd.A02(jSONObject, A03(0, 2, 60)));
        this.A04 = A00;
        if (!AbstractC1096Mx.A06(anonymousClass76, A00, va)) {
            Z1 adViewListener = new C2026jy(this, anonymousClass76);
            this.A06 = adViewListener;
            Z2 z22 = new Z2(anonymousClass76, va, c1246Sx, new WeakReference(adViewListener), c1272Tx.A04(), c1272Tx.A07(), c1272Tx.A08(), c1272Tx.A09(), A00, this.A08);
            this.A07 = z22;
            this.A03 = new C2012jk(anonymousClass76, new C2025jx(this, anonymousClass76, n9), z22.getViewabilityChecker(), va, A00);
            A05(anonymousClass76, A00, c1246Sx, n9, z22);
            this.A02 = new NA(anonymousClass76, this.A08, this, n9);
            this.A02.A02();
            return;
        }
        anonymousClass76.A0F().A52();
        n9.AEN(this, C1312Vm.A00(AdErrorType.NO_FILL));
    }

    @Override // com.instagram.common.viewpoint.core.N1
    public final boolean AKL() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.N1
    public final void onDestroy() {
        if (this.A05 != null) {
            InterfaceC2067kf A0F = this.A05.A0F();
            String[] strArr = A0A;
            if (strArr[1].charAt(24) == strArr[4].charAt(24)) {
                throw new RuntimeException();
            }
            A0A[7] = "tMGyCfr9ucO4oWdztKDfdPlDfRrhkMp8";
            A0F.A4L(this.A07 != null);
        }
        if (this.A07 != null) {
            this.A07.A0I();
            this.A07 = null;
            this.A06 = null;
        }
        NA na = this.A02;
        if (A0A[0].length() == 16) {
            throw new RuntimeException();
        }
        A0A[7] = "5ZoCIskAsYlLTmabnaeKVzywNB4LbbVC";
        if (na != null) {
            this.A02.A03();
        }
    }
}
