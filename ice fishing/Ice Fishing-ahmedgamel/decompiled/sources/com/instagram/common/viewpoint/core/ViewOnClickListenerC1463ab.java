package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.anythink.expressad.video.module.a.a;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ab, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1463ab implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"sP3gpwd6Zoi5atkrMGPTc5EXN8BQ3Rhb", "CuI3HGsHCqf5OUDiTkLeplOhcTm9T7NI", "qUh1oDSzqsBPPR1tLa2Ioa4F3OHVyWz", "9USBf0H8rgb5C7JYpIITcKF8xtKeHlI", "rVv7rCrqZ3PnTP4EIzYeJpV", "KXSca88saLVPZ5uec2yV3IdyBKC0ygXP", "JOf8s03jk9aSXntkdxYTuuj", "1B5kCc4TTNYrg"};
    public final /* synthetic */ M8 A00;

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        int i10 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[5].charAt(30) == 'J') {
                throw new RuntimeException();
            }
            A02[6] = "NOG9o";
            if (i10 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 53);
            i10++;
        }
    }

    public static void A01() {
        A01 = new byte[]{-68, -67, -54, -48, -49, -107, -67, -57, -68, -55, -58, -106, -93, -108, -106, -104, -87, -98, -85, -98, -87, -82, 20, 33, 23, 37, 34, 28, 23, -31, 28, 33, 39, 24, 33, 39, -31, 20, 22, 39, 28, 34, 33, -31, 9, -4, -8, 10};
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
        InterfaceC1482au interfaceC1482au2;
        if (WU.A02(this)) {
            return;
        }
        try {
            str = this.A00.A06;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String A00 = A00(0, 11, 38);
            str2 = this.A00.A06;
            if (A00.equals(str2)) {
                return;
            }
            String A002 = A00(22, 26, a.f21727Q);
            str3 = this.A00.A06;
            Intent intent = new Intent(A002, XB.A00(str3));
            intent.addFlags(268435456);
            c1840gi = this.A00.A08;
            c1840gi.A0F().A9y();
            try {
                c1840gi3 = this.A00.A08;
                C1344Wu.A0D(c1840gi3, intent);
                interfaceC1482au = this.A00.A05;
                if (interfaceC1482au != null) {
                    interfaceC1482au2 = this.A00.A05;
                    interfaceC1482au2.AF0();
                }
            } catch (C1342Ws e9) {
                Throwable cause = e9.getCause();
                Throwable th = e9;
                if (cause != null) {
                    th = e9.getCause();
                }
                c1840gi2 = this.A00.A08;
                c1840gi2.A08().ABC(A00(11, 11, 0), AbstractC1252Td.A00, new C1253Te(th));
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }

    static {
        A01();
    }

    public ViewOnClickListenerC1463ab(M8 m82) {
        this.A00 = m82;
    }
}
