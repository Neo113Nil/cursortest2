package defpackage;

import android.graphics.RuntimeShader;
import android.location.Geocoder$GeocodeListener;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class sf {
    public static /* synthetic */ RuntimeShader A(String str) {
        return new RuntimeShader(str);
    }

    public static /* bridge */ /* synthetic */ RuntimeShader g(Object obj) {
        return (RuntimeShader) obj;
    }

    public static /* synthetic */ RuntimeShader h(String str) {
        return new RuntimeShader(str);
    }

    public static /* bridge */ /* synthetic */ Geocoder$GeocodeListener i(Object obj) {
        return (Geocoder$GeocodeListener) obj;
    }

    public static /* synthetic */ BoringLayout k(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z, TextUtils.TruncateAt truncateAt, int i2) {
        return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, truncateAt, i2, true);
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedCallback l(Object obj) {
        return (OnBackInvokedCallback) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher n(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* synthetic */ void t() {
    }
}
