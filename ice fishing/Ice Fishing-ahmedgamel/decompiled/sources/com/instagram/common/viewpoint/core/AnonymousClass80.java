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
public final class AnonymousClass80 implements InterfaceC2056k8 {
    public static byte[] A09;
    public static String[] A0A = {"0TFgGHCmbDEnT", "P3BoNX3HbYs3p91Xznd9cH02Ego1LEzw", "OWrFl7C0gkEmqIZvATANnxtRvMpHSetZ", "XjLJU23F7IQ7TgYJbWjoa78", "8eUGin29aZrVydG4hLQZ04ng176drDiv", "tE42BGb8ExLW22Y3fw0IicKZ4ID1w2IZ", "N0c3cK9W7W98ikBdYu66t8J", "EarR2SOYmotvRVJvY11PbnGgxllwGrNq"};
    public N9 A01;
    public NA A02;
    public C2032jk A03;
    public C2030ji A04;
    public AnonymousClass76 A05;
    public Z1 A06;
    public Z2 A07;
    public final String A08 = UUID.randomUUID().toString();
    public long A00 = -1;

    public static String A03(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 16);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-81, -64, -11, -19, -20, -15, -3, -11, -25, -6, -19, -21, -4, -23, -10, -17, -12, -19};
    }

    static {
        A04();
    }

    private void A05(AnonymousClass76 anonymousClass76, C2030ji c2030ji, C1266Sx c1266Sx, N9 n9, Z2 z22) {
        String A7O = c2030ji.A7O();
        if (!TextUtils.isEmpty(A7O)) {
            c1266Sx.A0e(new VI(A7O, anonymousClass76.A0A()));
        }
        C1322Vb A0I = c2030ji.A0I();
        String[] strArr = A0A;
        String clientToken = strArr[3];
        if (clientToken.length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[3] = "l0iKT0z7S0YTo68xxrsf1qJ";
        strArr2[6] = "FTb7Q8n5ne47CtPUjUxYv1n";
        if (A0I != null) {
            C1264Sv c1264Sv = new C1264Sv(c2030ji.A0I().getUrl(), c2030ji.A0I().getHeight(), c2030ji.A0I().getWidth(), c2030ji.A0b(), A03(2, 16, 120));
            c1264Sv.A01 = new T3(false, -1, -1);
            c1266Sx.A0W();
            c1266Sx.A0c(c1264Sv);
        }
        if (c2030ji.A0H() != null) {
            c1266Sx.A0c(new C1264Sv(c2030ji.A0H().getUrl(), c2030ji.A0H().getHeight(), c2030ji.A0H().getWidth(), c2030ji.A0b(), A03(2, 16, 120)));
        }
        String A0e = c2030ji.A0e();
        if (A0e != null && !TextUtils.isEmpty(A0e)) {
            c1266Sx.A0b(new C1262St(A0e, c2030ji.A0b(), A03(2, 16, 120), c2030ji.A0D()));
        }
        AbstractC2025jd A0F = c2030ji.A0F();
        String A03 = A03(2, 16, 120);
        if (A0F != null) {
            O0.A00(c2030ji.A0F(), c1266Sx, A03);
        }
        C2044jw c2044jw = new C2044jw(this, z22, n9, anonymousClass76);
        String clientToken2 = c2030ji.A0b();
        c1266Sx.A0X(c2044jw, new C1259Sq(clientToken2, A03));
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

    @Override // com.instagram.common.viewpoint.core.InterfaceC2056k8
    public final void AAt(AnonymousClass76 anonymousClass76, VA va, EnumC1334Vp enumC1334Vp, N9 n9, JSONObject jSONObject, C1292Tx c1292Tx) {
        anonymousClass76.A0F().A4N();
        this.A05 = anonymousClass76;
        this.A01 = n9;
        C1266Sx c1266Sx = new C1266Sx(anonymousClass76);
        this.A00 = System.currentTimeMillis();
        C2030ji A00 = NI.A00(anonymousClass76, jSONObject, AbstractC1371Xd.A02(jSONObject, A03(0, 2, 60)));
        this.A04 = A00;
        if (!AbstractC1116Mx.A06(anonymousClass76, A00, va)) {
            Z1 adViewListener = new C2046jy(this, anonymousClass76);
            this.A06 = adViewListener;
            Z2 z22 = new Z2(anonymousClass76, va, c1266Sx, new WeakReference(adViewListener), c1292Tx.A04(), c1292Tx.A07(), c1292Tx.A08(), c1292Tx.A09(), A00, this.A08);
            this.A07 = z22;
            this.A03 = new C2032jk(anonymousClass76, new C2045jx(this, anonymousClass76, n9), z22.getViewabilityChecker(), va, A00);
            A05(anonymousClass76, A00, c1266Sx, n9, z22);
            this.A02 = new NA(anonymousClass76, this.A08, this, n9);
            this.A02.A02();
            return;
        }
        anonymousClass76.A0F().A52();
        n9.AEN(this, C1332Vm.A00(AdErrorType.NO_FILL));
    }

    @Override // com.instagram.common.viewpoint.core.N1
    public final boolean AKL() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.N1
    public final void onDestroy() {
        if (this.A05 != null) {
            InterfaceC2087kf A0F = this.A05.A0F();
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
