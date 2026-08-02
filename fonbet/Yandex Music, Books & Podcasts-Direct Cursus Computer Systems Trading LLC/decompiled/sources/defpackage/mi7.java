package defpackage;

import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class mi7 extends fv3 {
    public final jyr a;
    public boolean b;
    public final WebView c;
    public List d;
    public final g0c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi7(@NotNull Context context) {
        super(context);
        context.getClass();
        this.a = btf.b(new ji7(context, 0));
        this.d = c5b.a;
        WebView webView = new WebView(context);
        this.c = webView;
        addView(webView);
    }

    public static Set e(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            z75.t(arrayList2, ((cbt) it.next()).b);
        }
        return CollectionsKt.A0(arrayList2);
    }

    public static ArrayList f(Uri uri, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Uri parse = Uri.parse(((cbt) obj).a);
            if (Intrinsics.d(parse.getScheme(), uri.getScheme()) && Intrinsics.d(parse.getHost(), uri.getHost())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final agv getExternalWebViewSslErrorHandler() {
        return (agv) this.a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> getHeaders() {
        return uah.e(new Pair("X-YandexPaymentSDK-Version", "6.26.1"), new Pair("X-YandexPaymentSDK-Platform", "Android"));
    }

    @Override // defpackage.fv3
    public final void a(x7w x7wVar) {
        this.c.addJavascriptInterface(x7wVar, "yabankChallengeNativeObserver");
    }

    @Override // defpackage.fv3
    public final void b() {
        this.c.destroy();
    }

    @Override // defpackage.fv3
    public final void c(String str, List list, boolean z) {
        list.getClass();
        boolean R = n7w.R(q6c.B);
        WebView webView = this.c;
        if (R && !z) {
            webView.clearCache(true);
        }
        this.d = list;
        Uri parse = Uri.parse(str);
        parse.getClass();
        if (e(f(parse, list)).contains("version_header")) {
            webView.loadUrl(str, getHeaders());
        } else {
            webView.loadUrl(str);
        }
    }

    public final void g(SslErrorHandler sslErrorHandler, SslError sslError) {
        sslErrorHandler.getClass();
        sslError.getClass();
        getExternalWebViewSslErrorHandler().b(sslError, new le3(sslErrorHandler, this));
    }

    @Override // defpackage.fv3
    @NotNull
    public ev3 getSettings() {
        WebSettings settings = this.c.getSettings();
        settings.getClass();
        settings.getClass();
        return new quk();
    }

    @Override // defpackage.fv3
    public void setDebug(boolean z) {
        this.b = z;
    }

    @Override // defpackage.fv3
    public void setWebViewClient(@NotNull gv3 gv3Var) {
        gv3Var.getClass();
        WebView webView = this.c;
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(true);
        settings.setSupportMultipleWindows(true);
        if (n7w.R(q6c.B)) {
            settings.setCacheMode(1);
        }
        webView.setWebViewClient(new ki7(0, this, gv3Var));
        webView.setWebChromeClient(new li7(this, gv3Var));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mi7(@NotNull Context context, @NotNull g0c g0cVar) {
        this(context);
        context.getClass();
        g0cVar.getClass();
        this.e = g0cVar;
    }
}
