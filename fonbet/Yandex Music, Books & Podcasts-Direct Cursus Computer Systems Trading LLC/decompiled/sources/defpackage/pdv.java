package defpackage;

import android.webkit.WebView;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class pdv {
    public static final int[] f = new int[2];
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public pdv(WebView webView) {
        webView.getClass();
        this.a = String.format("%s{%s}", Arrays.copyOf(new Object[]{webView.getClass().getName(), Integer.toHexString(webView.hashCode())}, 2));
        int[] iArr = f;
        webView.getLocationOnScreen(iArr);
        this.b = iArr[0];
        this.c = iArr[1];
        this.d = webView.getWidth();
        this.e = webView.getHeight();
    }
}
