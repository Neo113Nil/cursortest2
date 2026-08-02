package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.It, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1008It extends AbstractC1506ay {
    public static byte[] A01;
    public static String[] A02 = {"Hi1Kp4OvuN0Mi1seIlZSQ9fXUMjjvE9p", "a9aQz404TSolCr57kPPHO7UwC5OuSOzH", "iZ3", "0R4wIBceXoURlcuySRfEAV2VVdZMdToQ", "Pns5aPZ6VZAIHBBYLIEekDbTjPHG0hEC", "QEtpGmawVai8H8emaUXHDe6205ss7rIx", "CSF", "KC7cPyOdjWwnXiGHMOi8VSLb8GeuOYES"};
    public final /* synthetic */ C1644dC A00;

    public static String A01(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-44, -23, -34, -47, -35, -39, -45, -49, -29, -44, -37, -49, -36, -47, -23, -43, -30, -49, -45, -33, -34, -28, -43, -34, -28, -49, -40, -43, -39, -41, -40, -28, -53, -32, -43, -56, -44, -48, -54, -58, -38, -53, -46, -58, -45, -56, -32, -52, -39, -58, -54, -42, -43, -37, -52, -43, -37, -58, -34, -48, -53, -37, -49};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        int dynamicWebViewWidth = getDynamicWebViewWidth();
        int dynamicWebViewHeight = getDynamicWebViewHeight();
        if (dynamicWebViewWidth <= 0 || dynamicWebViewHeight <= 0) {
            super.onMeasure(i, i4);
            return;
        }
        float f2 = dynamicWebViewWidth / dynamicWebViewHeight;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i4);
        boolean z6 = mode != 1073741824;
        boolean z9 = mode2 != 1073741824;
        int i6 = getResources().getDisplayMetrics().widthPixels;
        int i9 = getResources().getDisplayMetrics().heightPixels;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            i9 = Integer.MAX_VALUE;
            i6 = viewGroup.getWidth() != 0 ? viewGroup.getWidth() : Integer.MAX_VALUE;
            if (viewGroup.getHeight() != 0) {
                i9 = viewGroup.getHeight();
            }
        }
        int A00 = A00(dynamicWebViewWidth, i6, i);
        int A002 = A00(dynamicWebViewHeight, i9, i4);
        if ((z9 || z6) && Math.abs((A00 / A002) - f2) > 1.0E-7d) {
            boolean z10 = false;
            if (z9) {
                A002 = (int) (A00 / f2);
                z10 = true;
            }
            if (!z10 && z6) {
                float f9 = A002 * f2;
                if (A02[4].charAt(14) == 'W') {
                    throw new RuntimeException();
                }
                A02[4] = "z0LYwU9eQuMrdS04YY6f4w1GT5TpPfvp";
                A00 = (int) f9;
            }
        }
        setMeasuredDimension(A00, A002);
    }

    static {
        A02();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1008It(C1644dC c1644dC, C1860gi c1860gi) {
        super(c1860gi);
        this.A00 = c1644dC;
        getSettings().setAllowFileAccess(true);
        setBackgroundColor(0);
    }

    private int A00(int i, int i4, int i6) {
        int specMode = View.MeasureSpec.getMode(i6);
        int result = View.MeasureSpec.getSize(i6);
        switch (specMode) {
            case Integer.MIN_VALUE:
                int min = Math.min(i, result);
                String[] strArr = A02;
                String str = strArr[0];
                String str2 = strArr[7];
                int specMode2 = str.charAt(6);
                if (specMode2 != str2.charAt(6)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[6] = "m6i";
                strArr2[2] = "Lyc";
                return Math.min(min, i4);
            case 0:
                return Math.min(i, i4);
            case 1073741824:
                return result;
            default:
                return i;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1506ay
    public final WebChromeClient A0G() {
        return new C1639d7(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1506ay
    public final WebViewClient A0H() {
        return new C1640d8(this.A00);
    }

    private int getDynamicWebViewHeight() {
        AbstractC2025jd abstractC2025jd;
        abstractC2025jd = this.A00.A09;
        return abstractC2025jd.A1H().optInt(A01(0, 32, 84));
    }

    private int getDynamicWebViewWidth() {
        AbstractC2025jd abstractC2025jd;
        abstractC2025jd = this.A00.A09;
        return abstractC2025jd.A1H().optInt(A01(32, 31, 75));
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC1633d1 interfaceC1633d1;
        InterfaceC1633d1 interfaceC1633d12;
        interfaceC1633d1 = this.A00.A02;
        if (interfaceC1633d1 != null) {
            interfaceC1633d12 = this.A00.A02;
            interfaceC1633d12.AGC(this, motionEvent);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (A02[1].charAt(18) != 'P') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[0] = "8G0frzOI4hnuLOXw8ofdNPqhqb4ZK9tq";
        strArr[7] = "WF4GKlO7gB8U235davoNaDl6h9NjfHA4";
        return onTouchEvent;
    }
}
