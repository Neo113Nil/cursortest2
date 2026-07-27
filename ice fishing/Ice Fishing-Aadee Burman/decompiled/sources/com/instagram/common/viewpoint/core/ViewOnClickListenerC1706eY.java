package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.eY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1706eY implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"6oymiTsLeOB6akVZhYZlzt9u0lzod266", "zcFrhgW", "pA0IIkGKiekAr0fjB", "y6hjg8mxqAalWUMcxQuHYQOItnPT39hG", "7U0TsM6", "Tg7m67O8vHVp5z623KOmUlfZNUrkO0e2", "eZwTRoaquQnWH3ejc5rSlBlQZkiVI59b", "AT7ca5j6uH8ZMFY8gdhWcohA"};
    public final /* synthetic */ FO A00;

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            byte b9 = (byte) ((copyOfRange[i10] - i9) - 52);
            String[] strArr = A02;
            if (strArr[4].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[7] = "b4q8hXeVYJWgCCKNMDRDzuby";
            strArr2[1] = "dEe326h";
            copyOfRange[i10] = b9;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{22, 31, 21, 20, 18, 35, 21, 36};
    }

    static {
        A01();
    }

    public ViewOnClickListenerC1706eY(FO fo) {
        this.A00 = fo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewOnClickListenerC1038Kr viewOnClickListenerC1038Kr;
        ViewOnClickListenerC1038Kr viewOnClickListenerC1038Kr2;
        if (WU.A02(this)) {
            return;
        }
        try {
            viewOnClickListenerC1038Kr = this.A00.A06;
            if (viewOnClickListenerC1038Kr != null) {
                viewOnClickListenerC1038Kr2 = this.A00.A06;
                viewOnClickListenerC1038Kr2.A0E(A00(0, 8, 125));
            }
        } catch (Throwable th) {
            WU.A00(th, this);
            String[] strArr = A02;
            if (strArr[4].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A02[6] = "NoOvb1ER3rIaV6vkspGGWoVzXAP3qQ3Z";
        }
    }
}
