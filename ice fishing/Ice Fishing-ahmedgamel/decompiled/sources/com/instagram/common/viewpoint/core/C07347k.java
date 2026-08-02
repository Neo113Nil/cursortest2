package com.instagram.common.viewpoint.core;

import android.view.View;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.7k, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C07347k extends AbstractC1995j0 {
    public static byte[] A03;
    public long A00;
    public View A01;
    public AnonymousClass76 A02;

    static {
        A05();
    }

    public static String A03(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 81);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{20, 23, 38, -15, -16, -3, -3, -12, 1, -18, 1, -12, -11, 1, -12, 2, -9, -18, 3, -8, -4, -12, -5, 0, -7, 1, 6, -9, 8, -7, 10, -7, 5, 11, 38, 55, 27, 40, 40, 37, 40, -42, 45, 30, 31, 34, 27, -42, 38, 23, 40, 41, 31, 36, 29, -42, 25, 30, 23, 31, 36, 27, 26, -42, 23, 26, 41, -42, -8, 23, 36, 36, 27, 40};
    }

    public C07347k(AnonymousClass76 anonymousClass76, O7 o72) {
        super(anonymousClass76, o72);
        this.A00 = 10000L;
        this.A02 = anonymousClass76;
    }

    private C1998j3 A01(Runnable runnable) {
        return new C1998j3(this, runnable);
    }

    private List<JSONObject> A04(O8 o82) {
        ArrayList arrayList = new ArrayList();
        JSONObject A032 = o82.A03();
        if (A032.has(A03(22, 12, 71))) {
            try {
                this.A00 = A032.getJSONObject(r1).optInt(A03(3, 19, 62), 10000);
                JSONArray adsArray = A032.getJSONArray(A03(0, 3, 98));
                if (adsArray.length() > 0) {
                    for (int i = 0; i < adsArray.length(); i++) {
                        arrayList.add((JSONObject) adsArray.get(i));
                    }
                }
            } catch (JSONException unused) {
                String A033 = A03(36, 38, 101);
                this.A02.A0F().A5g(C1332Vm.A01(AdErrorType.UNKNOWN_ERROR, A033).A03().getErrorCode(), A033);
                return arrayList;
            }
        } else {
            arrayList.add(A032);
        }
        return arrayList;
    }

    private void A06(InterfaceC2056k8 interfaceC2056k8, JSONObject jSONObject, C1292Tx c1292Tx) {
        this.A0C = false;
        C1997j2 c1997j2 = new C1997j2(this, interfaceC2056k8, AbstractC1371Xd.A02(jSONObject, A03(34, 2, 114)));
        A0H().postDelayed(c1997j2, c1292Tx.A05());
        interfaceC2056k8.AAt(this.A02, this.A09, this.A08.A08, A01(c1997j2), jSONObject, c1292Tx);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1995j0
    public final void A0P() {
        if (this.A01 != null) {
            this.A02.A0F().A4e();
            this.A07.A0E(this.A01);
        } else {
            this.A02.A0F().A4f();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1995j0
    public final void A0R(N1 n12, C1291Tw c1291Tw, C1289Tu c1289Tu, final O8 o82) {
        this.A02.A0F().A4Y();
        final InterfaceC2056k8 interfaceC2056k8 = (InterfaceC2056k8) n12;
        if (interfaceC2056k8.AKL()) {
            final List<JSONObject> A04 = A04(o82);
            A06(interfaceC2056k8, A04.get(0), o82.A01());
            if (A04.size() > 1) {
                A0H().postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.O9
                    @Override // java.lang.Runnable
                    public final void run() {
                        C07347k.this.A0a(interfaceC2056k8, A04, o82);
                    }
                }, this.A00);
                return;
            }
            return;
        }
        A06(interfaceC2056k8, o82.A03(), o82.A01());
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1995j0
    public final void A0U(String str) {
        this.A02.A0F().A4d(str != null);
        super.A0U(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1995j0
    public final void A0Y(boolean z6) {
        super.A0Y(z6);
        this.A01 = null;
    }

    public final /* synthetic */ void A0a(InterfaceC2056k8 interfaceC2056k8, List list, O8 o82) {
        A06(interfaceC2056k8, (JSONObject) list.get(1), o82.A01());
    }
}
