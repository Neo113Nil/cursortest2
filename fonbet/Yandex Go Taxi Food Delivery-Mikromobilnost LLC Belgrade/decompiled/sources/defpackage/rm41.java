package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Looper;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.webkit.internal.a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public abstract class rm41 {
    public static final Uri a = Uri.parse("*");
    public static final Uri b = Uri.parse("");
    public static final boolean c = true;
    public static final WeakHashMap d = new WeakHashMap();

    public static ygp0 a(WebView webView, String str, Set set) {
        if (qp41.J.a()) {
            return c(webView).a(str, (String[]) set.toArray(new String[0]));
        }
        throw qp41.a();
    }

    public static PackageInfo b(Context context) {
        PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
        if (currentWebViewPackage != null) {
            return currentWebViewPackage;
        }
        try {
            String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
            if (str != null) {
                return context.getPackageManager().getPackageInfo(str, 0);
            }
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return null;
    }

    public static ns41 c(WebView webView) {
        if (!qp41.Q.a() || !c) {
            return new ns41(im91.g().createWebView(webView));
        }
        WeakHashMap weakHashMap = d;
        ns41 ns41Var = (ns41) weakHashMap.get(webView);
        if (ns41Var != null) {
            return ns41Var;
        }
        ns41 ns41Var2 = new ns41(im91.g().createWebView(webView));
        weakHashMap.put(webView, ns41Var2);
        return ns41Var2;
    }

    public static void d(WebView webView, ih41 ih41Var, Uri uri) {
        if (a.equals(uri)) {
            uri = b;
        }
        un2 un2Var = qp41.x;
        un2Var.getClass();
        if (ih41Var.b() == 0) {
            vn2.a(webView, a.f(ih41Var), uri);
            return;
        }
        if (!un2Var.a() || !gh41.a(ih41Var.b())) {
            throw qp41.a();
        }
        Looper a2 = qxa1.a(webView);
        if (a2 == Looper.myLooper()) {
            c(webView).b(ih41Var, uri);
            return;
        }
        StringBuilder sb = new StringBuilder("A WebView method was called on thread '");
        sb.append(Thread.currentThread().getName());
        sb.append("'. All WebView methods must be called on the same thread. (Expected Looper ");
        sb.append(a2);
        sb.append(" called on ");
        sb.append(Looper.myLooper());
        Looper mainLooper = Looper.getMainLooper();
        sb.append(", FYI main Looper is ");
        sb.append(mainLooper);
        sb.append(Extension.C_BRAKE);
        throw new RuntimeException(sb.toString());
    }

    public static void e(HashSet hashSet, ValueCallback valueCallback) {
        un2 un2Var = qp41.f;
        un2 un2Var2 = qp41.e;
        if (un2Var.a()) {
            im91.g().getStatics().setSafeBrowsingAllowlist(hashSet, valueCallback);
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        un2Var2.getClass();
        pxa1.c(arrayList, valueCallback);
    }
}
