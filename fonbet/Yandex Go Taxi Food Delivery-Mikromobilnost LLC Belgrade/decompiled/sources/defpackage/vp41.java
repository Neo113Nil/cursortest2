package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import io.flutter.plugins.webviewflutter.a;
import io.flutter.plugins.webviewflutter.b;

/* loaded from: classes11.dex */
public class vp41 implements tsr, r30 {
    public ssr a;
    public xv10 b;

    @Override // defpackage.r30
    public final void onAttachedToActivity(l40 l40Var) {
        xv10 xv10Var = this.b;
        if (xv10Var != null) {
            xv10Var.w = (Activity) ((wrr) l40Var).b;
        }
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        this.a = ssrVar;
        tt5 tt5Var = ssrVar.c;
        Context context = ssrVar.a;
        xv10 xv10Var = new xv10(tt5Var, context, new orr(context.getAssets(), ssrVar.f));
        this.b = xv10Var;
        ((aq80) ssrVar.e).E("plugins.flutter.io/webview", new itr((w4u) xv10Var.b));
        xv10 xv10Var2 = this.b;
        xv10Var2.getClass();
        i3y i3yVar = pd2.b;
        tt5 tt5Var2 = (tt5) xv10Var2.a;
        iwa1.c(tt5Var2, (w4u) xv10Var2.b);
        tj91.c(tt5Var2, new kne(xv10Var2));
        sl91.d(tt5Var2, new b(xv10Var2));
        pl91.d(tt5Var2, new kne(xv10Var2));
        String str = "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.pigeon_defaultConstructor";
        Object obj = null;
        new m2v(tt5Var2, str, xv10Var2.f(), obj).G(new lz70(17, new prr(xv10Var2)));
        im41 im41Var = new im41(xv10Var2);
        rs10 f = xv10Var2.f();
        new m2v(tt5Var2, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_defaultConstructor", f, obj).G(new lz70(24, im41Var));
        new m2v(tt5Var2, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading", f, obj).G(new h490(24, im41Var));
        String str2 = "dev.flutter.pigeon.webview_flutter_android.DownloadListener.pigeon_defaultConstructor";
        new m2v(tt5Var2, str2, xv10Var2.f(), obj).G(new lz70(16, new h7m(xv10Var2)));
        nl91.f(tt5Var2, new a(13, xv10Var2));
        wj91.b(tt5Var2, new prr(xv10Var2));
        o2c o2cVar = new o2c(xv10Var2);
        rs10 f2 = xv10Var2.f();
        new m2v(tt5Var2, "dev.flutter.pigeon.webview_flutter_android.WebStorage.instance", f2, obj).G(new lz70(23, o2cVar));
        new m2v(tt5Var2, "dev.flutter.pigeon.webview_flutter_android.WebStorage.deleteAllData", f2, obj).G(new h490(23, o2cVar));
        ity ityVar = new ity();
        rs10 f3 = xv10Var2.f();
        new m2v(tt5Var2, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.grant", f3, obj).G(new h490(16, ityVar));
        new m2v(tt5Var2, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.deny", f3, obj).G(new h490(17, ityVar));
        String str3 = "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.onCustomViewHidden";
        new m2v(tt5Var2, str3, xv10Var2.f(), obj).G(new h490(8, new wly0()));
        cl91.x(tt5Var2, new prr(xv10Var2));
        String str4 = "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.invoke";
        new m2v(tt5Var2, str4, xv10Var2.f(), obj).G(new h490(9, new q501(26)));
        bk91.g(tt5Var2, new prr(xv10Var2));
        String str5 = "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.sendToTarget";
        new m2v(tt5Var2, str5, xv10Var2.f(), obj).G(new h490(2, new hay(2)));
        pj91.j(tt5Var2, new o2c(xv10Var2));
        egz egzVar = new egz();
        rs10 f4 = xv10Var2.f();
        new m2v(tt5Var2, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.cancel", f4, obj).G(new h490(20, egzVar));
        new m2v(tt5Var2, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.proceed", f4, obj).G(new h490(21, egzVar));
        prr prrVar = new prr(xv10Var2);
        rs10 f5 = xv10Var2.f();
        new m2v(tt5Var2, "dev.flutter.pigeon.webview_flutter_android.SslError.getPrimaryError", f5, obj).G(new h490(19, prrVar));
        new m2v(tt5Var2, "dev.flutter.pigeon.webview_flutter_android.SslError.hasError", f5, obj).G(new lz70(21, prrVar));
        xk91.d(tt5Var2, new kne(xv10Var2));
        tk91.e(tt5Var2, new o2c(xv10Var2));
        String str6 = "dev.flutter.pigeon.webview_flutter_android.Certificate.getEncoded";
        new m2v(tt5Var2, str6, xv10Var2.f(), obj).G(new h490(7, new m501(12)));
        String str7 = "dev.flutter.pigeon.webview_flutter_android.WebSettingsCompat.setPaymentRequestEnabled";
        new m2v(tt5Var2, str7, xv10Var2.f(), obj).G(new h490(22, new s400()));
        String str8 = "dev.flutter.pigeon.webview_flutter_android.WebViewFeature.isFeatureSupported";
        new m2v(tt5Var2, str8, xv10Var2.f(), obj).G(new h490(25, new ity()));
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivity() {
        this.b.w = this.a.a;
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivityForConfigChanges() {
        this.b.w = this.a.a;
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        xv10 xv10Var = this.b;
        if (xv10Var != null) {
            i3y i3yVar = pd2.b;
            tt5 tt5Var = (tt5) xv10Var.a;
            Object obj = null;
            iwa1.c(tt5Var, null);
            tj91.c(tt5Var, null);
            sl91.d(tt5Var, null);
            pl91.d(tt5Var, null);
            new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.pigeon_defaultConstructor", new ld2(), obj).G(null);
            ld2 ld2Var = new ld2();
            new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_defaultConstructor", ld2Var, obj).G(null);
            new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading", ld2Var, obj).G(null);
            new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.pigeon_defaultConstructor", new ld2(), obj).G(null);
            nl91.f(tt5Var, null);
            wj91.b(tt5Var, null);
            ld2 ld2Var2 = new ld2();
            new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebStorage.instance", ld2Var2, obj).G(null);
            new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebStorage.deleteAllData", ld2Var2, obj).G(null);
            ld2 ld2Var3 = new ld2();
            new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.grant", ld2Var3, obj).G(null);
            new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.deny", ld2Var3, obj).G(null);
            new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.onCustomViewHidden", new ld2(), obj).G(null);
            cl91.x(tt5Var, null);
            new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.invoke", new ld2(), obj).G(null);
            bk91.g(tt5Var, null);
            new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.sendToTarget", new ld2(), obj).G(null);
            pj91.j(tt5Var, null);
            ld2 ld2Var4 = new ld2();
            new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.cancel", ld2Var4, obj).G(null);
            new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.proceed", ld2Var4, obj).G(null);
            ld2 ld2Var5 = new ld2();
            new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.SslError.getPrimaryError", ld2Var5, obj).G(null);
            new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.SslError.hasError", ld2Var5, obj).G(null);
            xk91.d(tt5Var, null);
            tk91.e(tt5Var, null);
            new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.Certificate.getEncoded", new ld2(), obj).G(null);
            new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebSettingsCompat.setPaymentRequestEnabled", new ld2(), obj).G(null);
            new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebViewFeature.isFeatureSupported", new ld2(), obj).G(null);
            w4u w4uVar = (w4u) this.b.b;
            ((Handler) w4uVar.d).removeCallbacks((jg) w4uVar.l);
            w4uVar.e = true;
            this.b = null;
        }
    }

    @Override // defpackage.r30
    public final void onReattachedToActivityForConfigChanges(l40 l40Var) {
        this.b.w = (Activity) ((wrr) l40Var).b;
    }
}
