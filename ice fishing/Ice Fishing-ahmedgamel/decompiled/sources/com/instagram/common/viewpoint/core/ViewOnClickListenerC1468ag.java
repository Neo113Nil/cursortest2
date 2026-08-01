package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ag, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1468ag implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ M6 A00;

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
        A01 = new byte[]{-23, -22, -9, -3, -4, -62, -22, -12, -23, -10, -13, -32, -19, -34, -32, -30, -13, -24, -11, -24, -13, -8, 16, 29, 19, 33, 30, 24, 19, -35, 24, 29, 35, 20, 29, 35, -35, 16, 18, 35, 24, 30, 29, -35, 5, -8, -12, 6};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        C1840gi c1840gi;
        C1840gi c1840gi2;
        C1840gi c1840gi3;
        InterfaceC1482au interfaceC1482au;
        if (WU.A02(this)) {
            return;
        }
        try {
            str = this.A00.A07;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String A00 = A00(0, 11, 12);
            str2 = this.A00.A07;
            if (A00.equals(str2)) {
                return;
            }
            String A002 = A00(22, 26, 51);
            str3 = this.A00.A07;
            Intent intent = new Intent(A002, XB.A00(str3));
            intent.addFlags(268435456);
            c1840gi = this.A00.A09;
            c1840gi.A0F().A9y();
            try {
                c1840gi3 = this.A00.A09;
                C1344Wu.A0D(c1840gi3, intent);
                interfaceC1482au = this.A00.A06;
                interfaceC1482au.AF0();
            } catch (C1342Ws e9) {
                Throwable cause = e9.getCause();
                Throwable th = e9;
                if (cause != null) {
                    th = e9.getCause();
                }
                c1840gi2 = this.A00.A09;
                c1840gi2.A08().ABC(A00(11, 11, 3), AbstractC1252Td.A00, new C1253Te(th));
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }

    public ViewOnClickListenerC1468ag(M6 m62) {
        this.A00 = m62;
    }
}
