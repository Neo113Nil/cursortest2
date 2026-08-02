package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import com.yandex.messenger.websdk.api.ChatRequest;
import com.yandex.messenger.websdk.api.MessengerParams;
import com.yandex.messenger.websdk.internal.MainWebMessengerFragment;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.b;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes15.dex */
public final class rd00 implements fc3, we4 {
    public View A;
    public View B;
    public TextView C;
    public TextView D;
    public String E;
    public heb F;
    public Context G;
    public final MainWebMessengerFragment a;
    public final qh41 b;
    public final d1b c;
    public final ew2 w;
    public final MessengerParams x;
    public final krw y;
    public final i3y z = a.a(new pd00(this, 0));

    public rd00(MainWebMessengerFragment mainWebMessengerFragment, qh41 qh41Var, ChatRequest chatRequest, String str, String str2) {
        this.a = mainWebMessengerFragment;
        this.b = qh41Var;
        this.c = (d1b) qh41Var.x.getValue();
        this.w = qh41Var.r;
        this.x = qh41Var.g;
        this.y = (krw) qh41Var.A.getValue();
        Bundle bundle = new Bundle();
        if (chatRequest != null) {
            chatRequest.c(bundle);
        }
        bundle.putString("STATE_KEY_META", str);
        mainWebMessengerFragment.setArguments(bundle);
        this.E = str2;
    }

    @Override // defpackage.fc3
    public final void a(heb hebVar, tkb1 tkb1Var) {
        String str;
        fr31 fr31Var = hebVar.w;
        deb debVar = deb.a;
        deb debVar2 = deb.b;
        deb debVar3 = deb.c;
        int i = 1;
        int i2 = 0;
        ApplicationInfo applicationInfo = null;
        if (tkb1Var.equals(debVar3) || tkb1Var.equals(debVar2) || (tkb1Var instanceof eeb)) {
            View view = this.B;
            if (view == null) {
                view = null;
            }
            view.setVisibility(0);
            View view2 = this.A;
            if (view2 == null) {
                view2 = null;
            }
            view2.setVisibility(8);
            rv41 f = hebVar.f();
            if (f != null) {
                f.hide();
            }
            if (fr31Var != null) {
                fr31Var.e = false;
                fr31Var.a();
            }
        } else if (tkb1Var.equals(debVar)) {
            rv41 f2 = hebVar.f();
            if (f2 != null) {
                f2.show();
            }
            if (fr31Var != null) {
                fr31Var.e = true;
                fr31Var.a();
            }
            View view3 = this.B;
            if (view3 == null) {
                view3 = null;
            }
            view3.setVisibility(8);
            View view4 = this.A;
            if (view4 == null) {
                view4 = null;
            }
            view4.setVisibility(8);
        } else {
            if (!(tkb1Var instanceof ceb)) {
                w511.b();
                return;
            }
            View view5 = this.A;
            if (view5 == null) {
                view5 = null;
            }
            view5.setVisibility(0);
            View view6 = this.B;
            if (view6 == null) {
                view6 = null;
            }
            view6.setVisibility(8);
            rv41 f3 = hebVar.f();
            if (f3 != null) {
                f3.hide();
            }
            if (fr31Var != null) {
                fr31Var.e = false;
                fr31Var.a();
            }
        }
        if (tkb1Var.equals(debVar3) || tkb1Var.equals(debVar2) || tkb1Var.equals(debVar)) {
            return;
        }
        boolean z = tkb1Var instanceof eeb;
        krw krwVar = this.y;
        if (z) {
            krwVar.a(true, "web", ((eeb) tkb1Var).a);
            b(qyh0.bad_connection_error, qyh0.try_again, new pd00(this, i));
            return;
        }
        boolean z2 = tkb1Var instanceof feb;
        ew2 ew2Var = this.w;
        if (!z2) {
            if (!(tkb1Var instanceof ceb)) {
                w511.b();
                return;
            }
            ew2Var.b("wm_shown_backend_error_state");
            krwVar.a(true, "web", ((ceb) tkb1Var).a);
            b(qyh0.backend_error, qyh0.try_again, new pd00(this, i));
            return;
        }
        feb febVar = (feb) tkb1Var;
        Context context = this.a.getContext();
        if (context == null) {
            return;
        }
        Throwable th = febVar.a;
        i3y i3yVar = vx21.a;
        Throwable th2 = th;
        while (true) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                th2 = cause;
            } else {
                try {
                    break;
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        applicationInfo = context.getPackageManager().getApplicationInfo("com.google.android.webview", 0);
        PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
        if (th2 instanceof UnsatisfiedLinkError) {
            b(qyh0.webview_error_corrupted, qyh0.webview_error_settings_btn, new n5(context, 25));
            str = "webview broken";
        } else if (currentWebViewPackage != null) {
            b(qyh0.webview_error_absent, qyh0.webview_error_install_btn, new n5(context, 26));
            str = "webview init failed";
        } else if (!context.getPackageManager().hasSystemFeature("android.software.webview")) {
            b(qyh0.webview_error_unavailable, qyh0.webview_error_settings_btn, new n5(context, 27));
            str = "webview unsupported";
        } else if (applicationInfo == null) {
            b(qyh0.webview_error_absent, qyh0.webview_error_install_btn, new n5(context, 28));
            str = "no webview uninstalled";
        } else if (applicationInfo.enabled) {
            b(qyh0.webview_error_unavailable, qyh0.webview_error_settings_btn, new qd00(context, i2));
            str = "webview unknown error";
        } else {
            b(qyh0.webview_error_disabled, qyh0.webview_error_enable_btn, new n5(context, 29));
            str = "webview disabled";
        }
        Pair pair = new Pair(CRLReasonCodeExtension.REASON, str);
        String canonicalName = th.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        Pair pair2 = new Pair("error", canonicalName);
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        Pair pair3 = new Pair("error message", message);
        String canonicalName2 = th2.getClass().getCanonicalName();
        if (canonicalName2 == null) {
            canonicalName2 = "";
        }
        Pair pair4 = new Pair("cause", canonicalName2);
        String message2 = th2.getMessage();
        ew2Var.c("wm_shown_webview_error_state", b.i(pair, pair2, pair3, pair4, new Pair("cause message", message2 != null ? message2 : "")));
        krwVar.a(true, "system", th2);
    }

    public final void b(int i, int i2, sls slsVar) {
        Resources resources;
        Resources resources2;
        TextView textView = this.C;
        if (textView == null) {
            textView = null;
        }
        Context context = this.G;
        qh41 qh41Var = this.b;
        if (context == null || (resources = context.getResources()) == null) {
            resources = qh41Var.a.getResources();
        }
        textView.setText(resources.getString(i));
        TextView textView2 = this.D;
        if (textView2 == null) {
            textView2 = null;
        }
        Context context2 = this.G;
        if (context2 == null || (resources2 = context2.getResources()) == null) {
            resources2 = qh41Var.a.getResources();
        }
        textView2.setText(resources2.getString(i2));
        TextView textView3 = this.D;
        (textView3 != null ? textView3 : null).setOnClickListener(new njb(14, slsVar));
    }
}
