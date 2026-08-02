package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ce, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC1610ce implements View.OnTouchListener {
    public static byte[] A01;
    public static String[] A02 = {"0HVxtLG0sPkx2", "hiZzr77KokQTc", "mNnSSdkwXzrOg41hebGrtMF8fEOYdjGE", "NiiVAR3ay3HziijWMkU57MyJi0qOk8bf", "5RCf0Yx637qOFKYGhhAOV12LnRlJgv3P", "3PZq2jvav8U89", "SINF4Npt4bG7GbW3rji", "p0cbgO4lXEkOYy0C0Gpe"};
    public final /* synthetic */ C1023Ji A00;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            int i10 = (copyOfRange[i9] - i6) - 39;
            String[] strArr = A02;
            if (strArr[1].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[7] = "15sr1U6GzUIP4MnHZRSc";
            strArr2[5] = "N9mozJJ8LQfhA";
            copyOfRange[i9] = (byte) i10;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-83, -85, -99, -86, -105, -101, -92, -95, -101, -93, -105, -95, -103, -102, -67, -69, -83, -70, -89, -77, -83, -63, -72, -87, -84, -89, -85, -76, -79, -85, -77, -89, -79, -87, -86};
    }

    static {
        A01();
    }

    public ViewOnTouchListenerC1610ce(C1023Ji c1023Ji) {
        this.A00 = c1023Ji;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r0 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        r1 = r5.A00.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (r1 < 5) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        r5.A00.A0G = true;
        r5.A00.A0o(A00(0, 14, 17));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        if (r0 == false) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z6;
        InputMethodManager inputMethodManager;
        InputMethodManager inputMethodManager2;
        boolean z9;
        boolean z10;
        switch (motionEvent.getActionMasked()) {
            case 0:
                z6 = this.A00.A0H;
                if (!z6) {
                    inputMethodManager = this.A00.A0V;
                    if (inputMethodManager != null) {
                        inputMethodManager2 = this.A00.A0V;
                        if (inputMethodManager2.isAcceptingText()) {
                            this.A00.A0H = true;
                            this.A00.A0o(A00(14, 21, 33));
                            break;
                        }
                    }
                }
                break;
            case 1:
                C1023Ji c1023Ji = this.A00;
                String[] strArr = A02;
                if (strArr[1].length() != strArr[0].length()) {
                    A02[6] = "OcZWYNEqCaLP";
                    C1023Ji.A04(c1023Ji);
                    z10 = this.A00.A0G;
                    break;
                } else {
                    String[] strArr2 = A02;
                    strArr2[1] = "icFIHzt0T1qa8";
                    strArr2[0] = "30YVfIVk012ko";
                    C1023Ji.A04(c1023Ji);
                    z9 = this.A00.A0G;
                    break;
                }
        }
        if (A02[4].charAt(7) != '6') {
            throw new RuntimeException();
        }
        A02[4] = "w8TKL5U61DrXWGWK9GXi8K1kZSuhi8qi";
        return false;
    }
}
