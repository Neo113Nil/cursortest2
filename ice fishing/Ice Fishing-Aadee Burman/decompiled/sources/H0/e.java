package H0;

import I0.j;
import I0.m;
import I0.n;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1084a = 0;

    static {
        Uri.parse("*");
        Uri.parse("");
    }

    public static void a(WebView webView, String str, Set set, d dVar) {
        if (!m.f1269d.b()) {
            throw m.a();
        }
        j c9 = c(webView);
        ((WebViewProviderBoundaryInterface) c9.f1264u).addWebMessageListener(str, (String[]) set.toArray(new String[0]), new A8.a(0, new j(0, dVar)));
    }

    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }

    public static j c(WebView webView) {
        return new j(6, n.f1274a.createWebView(webView));
    }

    public static String d() {
        if (m.f1271f.b()) {
            return n.f1274a.getStatics().getVariationsHeader();
        }
        throw m.a();
    }

    public static WebViewClient e(WebView webView) {
        Looper webViewLooper;
        WebViewClient webViewClient;
        I0.b bVar = m.f1267b;
        if (bVar.a()) {
            webViewClient = webView.getWebViewClient();
            return webViewClient;
        }
        if (!bVar.b()) {
            throw m.a();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            webViewLooper = webView.getWebViewLooper();
            if (webViewLooper != Looper.myLooper()) {
                throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + webViewLooper + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
            }
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(webView, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e9) {
                throw new RuntimeException(e9);
            }
        }
        return ((WebViewProviderBoundaryInterface) c(webView).f1264u).getWebViewClient();
    }
}
