package com.instagram.common.viewpoint.core;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.anythink.basead.ui.BaseATView;
import com.anythink.core.common.s.a.c;
import com.anythink.expressad.video.module.a.a;
import com.facebook.ads.NativeAdLayout;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ud, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1277Ud implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener, T4 {
    public static byte[] A02;
    public static String[] A03 = {"2Mr7WzO4XT19fyb3DHhbNTMzGWXczG8b", "vf19oH1ZBxP9VPI3JVFDPhemIBzJ7OC4", "PwSJ9ELrmEQEpkj", "NKBqcIyQCWq", "qemkSyFbN3a9gQ2aUzusWvKKRIknTA5w", "Z", "UIuvCrnGUlyr13fhGKhlPOBYvJPgs1Zm", "jOlkEqTUPEoF6L4suBriQ9wTaVLjQjL5"};
    public final C1839gi A00;
    public final /* synthetic */ UK A01;

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i4);
        int i10 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[7].charAt(17) == 't') {
                throw new RuntimeException();
            }
            A03[6] = "LYjyLl4kg8CHjw2beKSdtMq0XfNpXvKm";
            if (i10 >= length) {
                return new String(copyOfRange);
            }
            byte b9 = (byte) ((copyOfRange[i10] ^ i9) ^ 40);
            String[] strArr = A03;
            if (strArr[3].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A03[6] = "YSbRSDMNs4CLdH15XbZL4GcvXcpOIsjI";
            copyOfRange[i10] = b9;
            i10++;
        }
    }

    public static void A02() {
        A02 = new byte[]{101, c.f16475b, 4, 71, 69, 74, 74, 75, 80, 4, 70, 65, 4, 71, 72, 77, 71, 79, 65, c.f16475b, 4, 70, 65, 66, 75, 86, 65, 4, 77, 80, 4, 77, 87, 4, 82, 77, 65, 83, 65, c.f16475b, 10, 42, 5, 0, 10, 2, 26, 73, 1, 8, 25, 25, 12, 7, 12, 13, 73, 29, 6, 6, 73, 15, 8, 26, 29, 71, 13, 9, 10, 62, 47, 34, 46, 37, 40, 46, 5, 46, c.f16476c, 60, 36, 57, 32, 24, 57, 118, 34, 57, 35, 53, 62, 118, 50, 55, 34, 55, 118, 36, 51, 53, 57, 36, 50, 51, 50, 122, 118, 38, 58, 51, 55, 37, 51, 118, 51, 56, 37, 35, 36, 51, 118, 34, 57, 35, 53, 62, 118, 51, 32, 51, 56, 34, 37, 118, 36, 51, 55, 53, 62, 118, 34, 62, 51, 118, 55, 50, 118, 0, c.f16476c, 51, 33, 118, 52, 47, 118, 36, 51, 34, 35, 36, 56, c.f16476c, 56, 49, 118, 48, 55, 58, 37, 51, 118, c.f16476c, 48, 118, 47, 57, 35, 118, c.f16476c, 56, 34, 51, 36, 53, 51, 38, 34, 118, 34, 62, 51, 118, 51, 32, 51, 56, 34, 120, 13, 11, 16, 120, 98, Byte.MAX_VALUE};
    }

    static {
        A02();
    }

    public ViewOnClickListenerC1277Ud(UK uk, C1839gi c1839gi) {
        this.A01 = uk;
        this.A00 = c1839gi;
    }

    public /* synthetic */ ViewOnClickListenerC1277Ud(UK uk, C1839gi c1839gi, C1321Vx c1321Vx) {
        this(uk, c1839gi);
    }

    private Map<String, String> A01() {
        C1784fp c1784fp;
        Y2 y22;
        EnumC1304Ve enumC1304Ve;
        boolean z8;
        boolean z9;
        EnumC1304Ve enumC1304Ve2;
        C1496b9 c1496b9 = new C1496b9();
        c1784fp = this.A01.A0U;
        C1496b9 A032 = c1496b9.A03(c1784fp);
        y22 = this.A01.A0j;
        Map<String, String> A05 = A032.A02(y22).A05();
        enumC1304Ve = this.A01.A0K;
        if (enumC1304Ve != null) {
            enumC1304Ve2 = this.A01.A0K;
            A05.put(A00(BaseATView.a.f9961z, 3, 62), String.valueOf(enumC1304Ve2.A05()));
        }
        z8 = this.A01.A0a;
        if (z8) {
            z9 = this.A01.A0a;
            A05.put(A00(198, 3, 75), String.valueOf(z9));
        }
        return A05;
    }

    private void A03(Map<String, String> extraData) {
        if (this.A01.A0e != null) {
            this.A01.A0e.A0M(extraData);
        }
    }

    public final void A04() {
        NativeAdLayout nativeAdLayout;
        NativeAdLayout nativeAdLayout2;
        C1839gi c1839gi;
        nativeAdLayout = this.A01.A08;
        if (nativeAdLayout != null) {
            nativeAdLayout2 = this.A01.A08;
            C1868hB c1868hB = (C1868hB) nativeAdLayout2.getNativeAdLayoutApi();
            c1839gi = this.A01.A0g;
            c1868hB.A04(new ZX(c1839gi));
        }
    }

    @Override // com.instagram.common.viewpoint.core.T4
    public final C1839gi A6m() {
        return this.A00;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Y2 y22;
        C1839gi c1839gi;
        Y2 y23;
        C1839gi c1839gi2;
        Y2 y24;
        Y2 y25;
        if (WU.A02(this)) {
            return;
        }
        try {
            y22 = this.A01.A0j;
            boolean A08 = y22.A08();
            String A00 = A00(66, 17, 99);
            if (!A08) {
                Log.e(A00, A00(83, 115, a.f21885Q));
            }
            c1839gi = this.A01.A0g;
            int minimumElapsedTime = C1289Up.A0K(c1839gi);
            if (minimumElapsedTime >= 0) {
                y24 = this.A01.A0j;
                if (y24.A03() < minimumElapsedTime) {
                    y25 = this.A01.A0j;
                    if (!y25.A07()) {
                        Log.e(A00, A00(0, 41, 12));
                        return;
                    } else {
                        Log.e(A00, A00(41, 25, 65));
                        return;
                    }
                }
            }
            y23 = this.A01.A0j;
            c1839gi2 = this.A01.A0g;
            if (y23.A09(c1839gi2)) {
                if (this.A01.A0e != null) {
                    this.A01.A0e.A0N(A01());
                    return;
                }
                return;
            }
            A03(A01());
        } catch (Throwable th) {
            WU.A00(th, this);
            String[] strArr = A03;
            if (strArr[1].charAt(15) != strArr[0].charAt(15)) {
                throw new RuntimeException();
            }
            A03[7] = "EqeSsMwGTYaeKofhe8hU7ULkNSCE0y6O";
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        View view2;
        C1493b6 c1493b6;
        C1493b6 c1493b62;
        View view3;
        View view4;
        C1493b6 c1493b63;
        C1493b6 c1493b64;
        view2 = this.A01.A04;
        if (view2 != null) {
            c1493b6 = this.A01.A0O;
            if (c1493b6 != null) {
                c1493b62 = this.A01.A0O;
                view3 = this.A01.A04;
                int width = view3.getWidth();
                view4 = this.A01.A04;
                c1493b62.setBounds(0, 0, width, view4.getHeight());
                c1493b63 = this.A01.A0O;
                c1493b64 = this.A01.A0O;
                c1493b63.A0D(!c1493b64.A0E());
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Y2 y22;
        C1839gi c1839gi;
        View view2;
        View.OnTouchListener onTouchListener;
        View.OnTouchListener onTouchListener2;
        y22 = this.A01.A0j;
        c1839gi = this.A01.A0g;
        view2 = this.A01.A04;
        y22.A06(c1839gi, motionEvent, view2, view);
        onTouchListener = this.A01.A02;
        if (onTouchListener != null) {
            onTouchListener2 = this.A01.A02;
            if (A03[2].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[1] = "w4fxh8qGKfQUI633kdvfD6D1dPFrXVB8";
            strArr[0] = "m7FEgH87ot2vGtV3LgABw7ULf2zod61Q";
            if (onTouchListener2.onTouch(view, motionEvent)) {
                return true;
            }
        }
        return false;
    }
}
