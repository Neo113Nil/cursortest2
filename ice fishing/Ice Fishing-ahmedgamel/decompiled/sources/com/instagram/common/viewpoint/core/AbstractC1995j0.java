package com.instagram.common.viewpoint.core;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.anythink.basead.ui.BaseATView;
import com.anythink.core.common.s.a.c;
import com.anythink.expressad.video.module.a.a;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.dynamicloading.FlashPreferences;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.j0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1995j0 implements WC {
    public static byte[] A0D;
    public static String[] A0E = {"mx9sJqsz4sgJcdPgoYbgRIW9VnwzqRx6", "rFbyGWP2Ub8PQhtH", "vlmOFoI5eqS6Nw0ENJhYNh6o4BRmenqE", "", "JTMxf3amnDxIP84vbXSIdB2jgXN5bQ", "LkG9NIMCA2H26FKF", "xLNm9V1ZNmyFYJ5qhdZubuzSePd6Iimu", "7SoM7bEoo8CKfR8pxc6QG8O9JCd0xBEh"};
    public static final N6 A0F = null;
    public static final WD A0G = null;
    public static final Handler A0H;
    public static final String A0I;
    public N1 A00;
    public N1 A01;
    public C1291Tw A04;
    public WA A05;
    public WD A06;
    public N2 A07;
    public final O7 A08;
    public final VA A09;
    public final N6 A0A;
    public final C1860gi A0B;
    public volatile boolean A0C;
    public long A03 = -1;
    public String A02 = null;

    public static String A07(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 95);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0D = new byte[]{-58, -23, -26, -11, -7, -22, -9, -91, -23, -12, -22, -8, -91, -13, -12, -7, -91, -22, -3, -18, -8, -7, -14, 21, 18, 33, 37, 22, 35, -47, 26, 36, -47, 31, 38, 29, 29, -47, -39, 20, 25, 18, 26, 31, -47, 31, 32, 37, -47, 29, 32, 18, 21, 22, 21, -38, -56, -21, -24, -9, -5, -20, -7, -89, -16, -6, -89, -11, -4, -13, -13, -89, -81, -22, -17, -24, -16, -11, -20, -21, -80, -91, -56, -59, -44, -40, -55, -42, -124, -51, -41, -124, -46, -39, -48, -48, -124, -116, -46, -45, -124, -57, -52, -59, -51, -46, -115, 6, 41, 38, 53, 57, 42, 55, -27, 46, 56, -27, 51, 58, 49, 49, -27, 52, 51, -27, 56, 57, 38, 55, 57, 6, 41, -21, 12, -67, 10, 12, 15, 2, -67, -2, 1, -67, 0, -2, 11, 1, 6, 1, -2, 17, 2, 16, -53, -50, -23, -26, -27, -34, -105, -40, -37, -40, -25, -21, -36, -23, -105, -21, -16, -25, -36, -91, c.f17105c, 66, -2, c.f17105c, 74, 80, 67, c.f17105c, 66, 87, -2, 81, 82, c.f17105c, 80, 82, 67, 66, 47, 50, 65, -51, -36, -43, 62, 67, 60, 68, 73, 58, 75, 60, 77, 60, 72, 78, -50, -33, -29, -32, -13, -32, -50, -31, -23, -28, -30, -13, -97, -24, -14, -97, -19, -12, -21, -21, 19, 28, 17, 32, 39, 30, 34, 19, 18, 13, 23, 18, 60, 69, 77, c.f17104b, 73, 70, 69, 68, 60, 69, 75, -9, c.f17104b, 74, -9, 60, 68, 71, 75, 80, 51, 57, 46, c.f17104b, 53, 44, 48, 60, 59, 51, 54, 52, 21, 33, 20, 32, 36, 20, 29, 18, 40, 14, 18, 16, 31, 31, 24, 29, 22, -3, 2, 10, -11, 0, -3, -8, -76, 4, 0, -11, -9, -7, 1, -7, 2, 8, -76, -3, 2, -76, 6, -7, 7, 4, 3, 2, 7, -7, 36, 39, 25, 28, 23, 44, 33, 37, 29, 23, 37, 43, 17, 4, 16, 20, 4, 18, 19, -2, 8, 3, 10, 5, -7, -10, 9, -6, -12, 9, -2, 2, -6, 8, 9, -10, 2, 5};
    }

    public abstract void A0P();

    public abstract void A0R(N1 n12, C1291Tw c1291Tw, C1289Tu c1289Tu, O8 o82);

    static {
        A08();
        YD.A02();
        A0I = AbstractC1995j0.class.getSimpleName();
        A0H = new Handler(Looper.getMainLooper());
    }

    public AbstractC1995j0(C1860gi c1860gi, O7 o72) {
        this.A0B = c1860gi;
        this.A08 = o72;
        if (A0G != null) {
            this.A06 = A0G;
        } else {
            this.A06 = new WD(this.A0B);
        }
        this.A06.A0R(this);
        if (A0F != null) {
            this.A0A = A0F;
        } else {
            this.A0A = new N6();
        }
        DynamicLoaderFactory.makeLoader(this.A0B).getInitApi().onAdLoadInvoked(this.A0B);
        this.A09 = c1860gi.A0A();
        this.A0B.A0F().A5e();
    }

    private void A09(C1291Tw c1291Tw) {
        if (ProcessUtils.isRemoteRenderingProcess()) {
            return;
        }
        SharedPreferences sharedPreferences = FlashPreferences.getSharedPreferences(this.A0B);
        if (c1291Tw.A0C() != null) {
            sharedPreferences.edit().putString(A07(262, 12, 110), c1291Tw.A0C()).putLong(A07(342, 16, 54), System.currentTimeMillis()).apply();
            return;
        }
        sharedPreferences.edit().clear().apply();
    }

    private void A0A(C1291Tw c1291Tw) {
        this.A0B.A0F().AJS(c1291Tw.A0H());
    }

    private void A0B(RG rg) {
        C1291Tw placement = rg.A00();
        if (placement == null || placement.A05() == null) {
            String A07 = A07(291, 29, 53);
            C1332Vm error = new C1332Vm(AdErrorType.NO_AD_PLACEMENT, A07);
            this.A0B.A0F().A5g(error.A03().getErrorCode(), A07);
            if (this.A07 != null) {
                this.A07.A0G(error);
                return;
            }
            return;
        }
        this.A04 = placement;
        this.A00 = null;
        C1291Tw c1291Tw = this.A04;
        JSONObject A0E2 = c1291Tw.A0E();
        String A072 = A07(195, 3, 13);
        if (A0E2 == null) {
            C1289Tu A04 = c1291Tw.A04();
            if (!A0F(c1291Tw, A04)) {
                return;
            }
            if (this.A00 == null) {
                this.A0B.A08().ABC(A072, AbstractC1272Td.A0a, new C1273Te(A07(81, 26, 5), A04.A02()));
                ADp(C1332Vm.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            A0R(this.A00, c1291Tw, A04, new O8(A04.A04(), c1291Tw.A05(), this.A08.A0A, c1291Tw.A05().A0C()));
        } else {
            ArrayList arrayList = new ArrayList();
            C1289Tu A042 = c1291Tw.A04();
            do {
                if (arrayList.isEmpty()) {
                    if (A0F(c1291Tw, A042)) {
                        arrayList.add(A042);
                    } else {
                        return;
                    }
                } else if (A0E(A042)) {
                    arrayList.add(A042);
                }
                A042 = c1291Tw.A04();
            } while (A042 != null);
            N1 n12 = this.A00;
            String[] strArr = A0E;
            if (strArr[7].charAt(26) != strArr[6].charAt(26)) {
                throw new RuntimeException();
            }
            A0E[2] = "ioxWOihgwDfBac41kTr6w1CF9LpRHapv";
            if (n12 == null) {
                this.A0B.A08().ABC(A072, AbstractC1272Td.A0a, new C1273Te(A07(56, 25, 40), ((C1289Tu) arrayList.get(0)).A02()));
                ADp(C1332Vm.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            boolean z6 = false;
            try {
                if (arrayList.size() > 1 && this.A00 != null && this.A00.AKL()) {
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((C1289Tu) it.next()).A04());
                    }
                    jSONObject.put(A07(192, 3, 111), jSONArray);
                    jSONObject.put(A07(198, 12, 124), c1291Tw.A0E());
                    A0R(this.A00, c1291Tw, A042, new O8(jSONObject, c1291Tw.A05(), this.A08.A0A, c1291Tw.A05().A0C()));
                    z6 = true;
                }
            } catch (Exception unused) {
                z6 = false;
            }
            if (!z6) {
                if (arrayList.isEmpty()) {
                    C1332Vm A01 = C1332Vm.A01(AdErrorType.NO_FILL, A07(0, 0, 103));
                    this.A0B.A0F().A5g(A01.A03().getErrorCode(), A07(133, 22, 62));
                    if (this.A07 != null) {
                        this.A07.A0G(A01);
                        return;
                    }
                    return;
                }
                if (this.A00 == null) {
                    this.A0B.A08().ABC(A072, AbstractC1272Td.A0a, new C1273Te(A07(22, 34, 82), ((C1289Tu) arrayList.get(0)).A02()));
                    ADp(C1332Vm.A00(AdErrorType.INTERNAL_ERROR));
                    return;
                }
                C1289Tu c1289Tu = (C1289Tu) arrayList.get(0);
                A0R(this.A00, c1291Tw, c1289Tu, new O8(c1289Tu.A04(), c1291Tw.A05(), this.A08.A0A, c1291Tw.A05().A0C()));
            }
        }
        A09(placement);
        A0A(placement);
    }

    private final void A0C(String str, AdExperienceType adExperienceType) {
        this.A0B.A0F().A5h(str != null);
        this.A03 = System.currentTimeMillis();
        try {
            C1339Vu bidPayload = new C1339Vu(this.A0B, str, this.A08.A0A, this.A08.A09);
            this.A05 = this.A08.A00(this.A0B, bidPayload, adExperienceType);
            if (this.A06 != null) {
                this.A06.A0Q(this.A05);
            }
        } catch (C1333Vn e9) {
            ADp(C1332Vm.A02(e9));
        }
    }

    private void A0D(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.A02 = jSONObject.optString(A07(230, 12, 79));
            N8.A01(this.A0B).A0O(jSONObject);
        }
    }

    private boolean A0E(C1289Tu c1289Tu) {
        return (c1289Tu == null || c1289Tu.A04() == null) ? false : true;
    }

    private boolean A0F(C1291Tw c1291Tw, C1289Tu c1289Tu) {
        String A07 = A07(0, 0, 103);
        if (c1289Tu == null) {
            C1332Vm A01 = C1332Vm.A01(AdErrorType.NO_FILL, A07);
            this.A0B.A0F().A5g(A01.A03().getErrorCode(), A07(133, 22, 62));
            if (this.A07 != null) {
                this.A07.A0G(A01);
            }
            return false;
        }
        String A02 = c1289Tu.A02();
        N1 A00 = this.A0A.A00(this.A0B, c1291Tw.A05().A0D());
        if (A00 == null) {
            this.A0B.A08().ABC(A07(195, 3, 13), AbstractC1272Td.A0a, new C1273Te(A07(0, 22, 38), A02));
            ADp(C1332Vm.A00(AdErrorType.INTERNAL_ERROR));
            return false;
        }
        if (!this.A08.A01().contains(A00.A8k())) {
            C1332Vm A012 = C1332Vm.A01(AdErrorType.INTERNAL_ERROR, A07);
            this.A0B.A0F().A5g(A012.A03().getErrorCode(), A07(155, 19, 24));
            if (this.A07 != null) {
                N2 n22 = this.A07;
                if (A0E[0].length() != 32) {
                    throw new RuntimeException();
                }
                String[] strArr = A0E;
                strArr[7] = "XDVsCbJ3K5v8dlUMGtS0uKtjThdAM1fs";
                strArr[6] = "AXbWkB0jI9efrJtSTWvCCcVR8Wd1ee9G";
                n22.A0G(A012);
            }
            return false;
        }
        this.A00 = A00;
        JSONObject A04 = c1289Tu.A04();
        if (A04 != null) {
            String optString = A04.optString(A07(332, 10, 64));
            this.A0B.A0F().AJk(optString);
            this.A0B.A0D(optString);
            C1856ge A002 = T7.A00();
            if (A002 != null) {
                A002.A0D(optString);
            }
            JSONObject dataObject = A04.optJSONObject(A07(274, 17, 80));
            A0D(dataObject);
            if (this.A05 == null) {
                String A072 = A07(242, 20, 120);
                C1332Vm A013 = C1332Vm.A01(AdErrorType.UNKNOWN_ERROR, A072);
                this.A0B.A0F().A5g(A013.A03().getErrorCode(), A072);
                if (this.A07 != null) {
                    this.A07.A0G(A013);
                }
                return false;
            }
            return true;
        }
        String A073 = A07(BaseATView.a.f10560K, 18, 32);
        C1332Vm A014 = C1332Vm.A01(AdErrorType.UNKNOWN_ERROR, A073);
        this.A0B.A0F().A5g(A014.A03().getErrorCode(), A073);
        if (this.A07 != null) {
            this.A07.A0G(A014);
        }
        return false;
    }

    public final long A0G() {
        if (this.A04 != null) {
            return this.A04.A03();
        }
        String[] strArr = A0E;
        if (strArr[7].charAt(26) != strArr[6].charAt(26)) {
            throw new RuntimeException();
        }
        A0E[2] = "cOTrI9DB0oxjTyLR1voyMrEgWVbVphTL";
        return -1L;
    }

    public final Handler A0H() {
        return A0H;
    }

    public NQ A0I() {
        if (this.A01 != null) {
            N1 n12 = this.A01;
            if (A0E[2].charAt(15) == 'D') {
                return ((AbstractC2029jh) n12).A0I();
            }
            A0E[0] = "oRXWb94touLPnP0lmqQIoCQNN81QkmVq";
            return ((AbstractC2029jh) n12).A0I();
        }
        String[] strArr = A0E;
        if (strArr[3].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[7] = "c4mFc8cvcfHQyghvzrB7bYP2aMdrhGND";
        strArr2[6] = "OOjdStzIF6ducmayoMT1WxOsFGdjLtMG";
        return null;
    }

    public final C1292Tx A0J() {
        if (this.A04 == null) {
            return null;
        }
        return this.A04.A05();
    }

    public final void A0K() {
        if (!C1310Up.A1v(this.A0B)) {
            return;
        }
        N1 n12 = this.A01;
        String[] strArr = A0E;
        if (strArr[3].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[3] = "";
        strArr2[4] = "YS2d1pFjROLoYd3yH38ADYRoaACmCS";
        if (n12 != null) {
            C1356Wl.A00(this.A0B).A0D(this.A01.A8k().toString(), this.A01.A7O());
        }
        if (this.A06 != null) {
            this.A06.A0R(null);
            this.A06 = null;
        }
        this.A07 = null;
        this.A00 = null;
        this.A01 = null;
    }

    public final void A0L() {
        String A7O;
        this.A0B.A0F().A3R(Y1.A01(this.A03));
        if (this.A01 == null || (A7O = this.A01.A7O()) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String A05 = Y1.A05(this.A03);
        String clientToken = A07(320, 12, 89);
        hashMap.put(clientToken, A05);
        new VI(A7O, this.A09).A04(VH.A08, hashMap);
    }

    public final void A0M() {
        N1 n12 = this.A01;
        String A07 = A07(195, 3, 13);
        if (n12 == null) {
            String A072 = A07(107, 26, 102);
            this.A0B.A08().ABC(A07, AbstractC1272Td.A0Q, new C1273Te(A072));
            AdErrorType adErrorType = AdErrorType.INTERNAL_ERROR;
            this.A0B.A0F().A5g(adErrorType.getErrorCode(), A072);
            if (this.A07 != null) {
                N2 n22 = this.A07;
                String errorMessage = adErrorType.getDefaultErrorMessage();
                n22.A0G(C1332Vm.A01(adErrorType, errorMessage));
            }
            this.A0B.A0F().A5j();
            return;
        }
        if (this.A0C) {
            String A073 = A07(174, 18, a.f22515R);
            this.A0B.A08().ABC(A07, AbstractC1272Td.A0M, new C1273Te(A073));
            AdErrorType adErrorType2 = AdErrorType.AD_ALREADY_STARTED;
            this.A0B.A0F().A5g(adErrorType2.getErrorCode(), A073);
            if (this.A07 != null) {
                N2 n23 = this.A07;
                String errorMessage2 = adErrorType2.getDefaultErrorMessage();
                n23.A0G(C1332Vm.A01(adErrorType2, errorMessage2));
            }
            this.A0B.A0F().A5i();
            return;
        }
        if (!TextUtils.isEmpty(this.A01.A7O())) {
            this.A09.AC0(this.A01.A7O());
        }
        this.A0B.A0F().A5k();
        this.A0C = true;
        A0P();
    }

    public final void A0N() {
        A0Y(false);
    }

    public final void A0O() {
        if (this.A02 != null) {
            N8.A01(this.A0B).A0N(this.A02);
        }
    }

    public final void A0Q(N1 n12) {
        if (n12 != null) {
            n12.onDestroy();
        }
    }

    public final void A0S(N2 n22) {
        this.A07 = n22;
    }

    public final void A0T(O8 o82) {
        A0V(o82.A03().optString(A07(BaseATView.a.f10559I, 2, 12)));
    }

    public void A0U(String str) {
        A0C(str, null);
    }

    public final void A0V(String str) {
        this.A0B.A0F().A5d();
        if (!TextUtils.isEmpty(str)) {
            new VI(str, this.A09).A04(VH.A04, null);
        }
    }

    public final void A0W(String str) {
        A0U(str);
    }

    public final void A0X(String str, AdExperienceType adExperienceType) {
        A0C(str, adExperienceType);
    }

    public void A0Y(boolean z6) {
        if (!z6 && !this.A0C) {
            return;
        }
        this.A0B.A0F().A5l();
        A0Q(this.A01);
        this.A0C = false;
    }

    public final boolean A0Z() {
        return this.A04 == null || this.A04.A0I();
    }

    @Override // com.instagram.common.viewpoint.core.WC
    public final synchronized void ADp(C1332Vm c1332Vm) {
        A0H().post(new C1996j1(this, c1332Vm));
    }

    @Override // com.instagram.common.viewpoint.core.WC
    public final synchronized void AG7(RG rg) {
        try {
            A0B(rg);
        } catch (Exception e9) {
            this.A0B.A08().ABC(A07(195, 3, 13), AbstractC1272Td.A0T, new C1273Te(e9));
        }
    }
}
