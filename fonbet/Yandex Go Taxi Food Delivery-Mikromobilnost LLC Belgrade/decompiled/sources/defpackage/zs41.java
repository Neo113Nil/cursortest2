package defpackage;

import android.webkit.WebViewRenderProcess;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public final class zs41 extends xs41 {
    public static final WeakHashMap b = new WeakHashMap();
    public WeakReference a;

    @Override // defpackage.xs41
    public final boolean a() {
        qp41.y.getClass();
        WebViewRenderProcess webViewRenderProcess = (WebViewRenderProcess) this.a.get();
        return webViewRenderProcess != null && webViewRenderProcess.terminate();
    }
}
