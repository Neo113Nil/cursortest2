package defpackage;

import android.os.Looper;
import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes11.dex */
public abstract class qxa1 {
    public static Looper a(WebView webView) {
        return webView.getWebViewLooper();
    }

    public static final void b(String str) {
        throw new IllegalArgumentException(oyr.p("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static void c(String str) {
        WebView.setDataDirectorySuffix(str);
    }

    public static /* synthetic */ boolean d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, zfb1 zfb1Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(zfb1Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(zfb1Var) != obj && atomicReferenceFieldUpdater.get(zfb1Var) != obj) {
                return false;
            }
        }
        return true;
    }
}
