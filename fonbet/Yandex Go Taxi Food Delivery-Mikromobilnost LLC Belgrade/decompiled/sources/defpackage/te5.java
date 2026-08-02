package defpackage;

import android.os.Trace;
import android.view.View;
import android.webkit.HttpAuthHandler;
import android.webkit.WebView;
import androidx.compose.ui.unit.LayoutDirection;
import com.yandex.go.taxi.order.api.change.destination.RouteChangeType;
import com.yandex.go.taxi.order.change.route.RouteChangeWarning;
import defpackage.otv0;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.sdc.router.e;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes10.dex */
public final /* synthetic */ class te5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ te5(WebViewClientProxyApi$WebViewClientImpl webViewClientProxyApi$WebViewClientImpl, WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.a = 6;
        this.b = webViewClientProxyApi$WebViewClientImpl;
        this.c = webView;
        this.x = httpAuthHandler;
        this.w = str;
        this.y = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mz40 C;
        int i = this.a;
        Object obj = this.y;
        Object obj2 = this.w;
        Object obj3 = this.x;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                ety0 ety0Var = (ety0) obj5;
                LayoutDirection layoutDirection = (LayoutDirection) obj4;
                String str = (String) obj2;
                fwi fwiVar = (fwi) obj3;
                dyr dyrVar = (dyr) obj;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    i2t0 j = q2t0.j();
                    mz40 mz40Var = j instanceof mz40 ? (mz40) j : null;
                    if (mz40Var == null || (C = mz40Var.C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        i2t0 j2 = C.j();
                        try {
                            ety0 I = bb1.I(ety0Var, layoutDirection);
                            EmptyList emptyList = EmptyList.a;
                            ib2 ib2Var = new ib2(str, I, emptyList, emptyList, dyrVar, fwiVar);
                            ib2Var.d();
                            ib2Var.b();
                            i2t0.q(j2);
                            C.w().g();
                            C.c();
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            i2t0.q(j2);
                            throw th;
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            case 1:
                aqh.c((aqh) obj5, (u45) obj4, (bsa0) obj2, (n3v) obj3, (sls) obj);
                return;
            case 2:
                k1l0 k1l0Var = (k1l0) obj4;
                o2y0 o2y0Var = (o2y0) obj2;
                RouteChangeType routeChangeType = (RouteChangeType) obj3;
                RouteChangeWarning routeChangeWarning = (RouteChangeWarning) obj;
                if (Boolean.TRUE.equals(((AlertDialog) obj5).getTag(agh0.confirm))) {
                    k1l0Var.r(new zdk0(6, k1l0Var, o2y0Var, routeChangeType));
                    return;
                } else {
                    k1l0Var.r(new zdk0(7, k1l0Var, o2y0Var, routeChangeWarning));
                    return;
                }
            case 3:
                ((e) obj5).b((lmp0) obj4, (lmp0) obj3, true, (ynv0) obj, (String) obj2);
                return;
            case 4:
                otv0.c((otv0) obj5, (u45) obj4, (otv0.a) obj2, (View) obj3, (ogu0) obj);
                return;
            case 5:
                ((WebViewClientProxyApi$WebViewClientImpl) obj5).lambda$onReceivedLoginRequest$23((WebView) obj4, (String) obj2, (String) obj3, (String) obj);
                return;
            default:
                ((WebViewClientProxyApi$WebViewClientImpl) obj5).lambda$onReceivedHttpAuthRequest$13((WebView) obj4, (HttpAuthHandler) obj3, (String) obj2, (String) obj);
                return;
        }
    }

    public /* synthetic */ te5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
        this.y = obj5;
    }

    public /* synthetic */ te5(e eVar, lmp0 lmp0Var, lmp0 lmp0Var2, ynv0 ynv0Var, String str) {
        this.a = 3;
        this.b = eVar;
        this.c = lmp0Var;
        this.x = lmp0Var2;
        this.y = ynv0Var;
        this.w = str;
    }
}
