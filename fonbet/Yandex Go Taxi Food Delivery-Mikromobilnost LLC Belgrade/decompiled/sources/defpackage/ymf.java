package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.webkit.ValueCallback;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.CustomWebView;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.CustomWebView$setupWebViewClient$1;
import com.yandex.go.platform.ui.components.errordialog.LoadErrorDialog;

/* loaded from: classes13.dex */
public final /* synthetic */ class ymf implements ValueCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ymf(String str, int i, Object obj) {
        this.a = i;
        this.c = obj;
        this.b = str;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        int i = this.a;
        String str = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                CustomWebView$setupWebViewClient$1.onPageFinished$lambda$2((CustomWebView) obj2, str, (String) obj);
                break;
            case 1:
                bkf0 bkf0Var = (bkf0) obj2;
                w040 w040Var = bkf0Var.a;
                if (!jl40.l((String) obj, "true")) {
                    Intent intent = null;
                    bkf0Var.c = new o790(w040Var, (jl40.l(str, ((ss2) w040Var.f).a) || str == null) ? new j790(null) : new l790(Uri.parse(str), null));
                    h7o h7oVar = (h7o) w040Var.g;
                    try {
                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.webview"));
                        intent2.setFlags(32768);
                        if (intent2.resolveActivity(h7oVar.a.getContext().getPackageManager()) != null) {
                            intent = intent2;
                        }
                    } catch (Exception unused) {
                    }
                    LoadErrorDialog a = h7oVar.a();
                    a.setDialogTitle(h7oVar.f);
                    a.setDialogSubtitle(h7oVar.h);
                    a.setActionText(h7oVar.i);
                    a.setActionButtonVisible(intent != null);
                    a.setOnActionClickListener(new vsn(4, intent, h7oVar));
                    h7oVar.j.run();
                    break;
                }
                break;
            default:
                llb1.e((lb20) obj2, "InjectScript. inject complete for: ".concat(str));
                break;
        }
    }
}
