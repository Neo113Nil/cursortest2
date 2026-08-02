package yads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import defpackage.a40;
import defpackage.aj71;
import defpackage.f071;
import defpackage.gr81;
import defpackage.m671;
import defpackage.p371;
import defpackage.pl81;
import defpackage.pm71;
import defpackage.vl61;
import java.net.URI;
import java.net.URISyntaxException;

/* loaded from: classes7.dex */
public final class xb extends t92 {
    public final vl61 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(Activity activity, m671 m671Var) {
        super(activity, null, null, 62);
        new pm71();
        new pl81();
        vl61 vl61Var = new vl61(new a40(activity), m671Var);
        this.k = vl61Var;
        if ("Xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) {
            setLayerType(2, null);
        }
        setVisibility(0);
        setHtmlWebViewErrorListener(vl61Var);
    }

    @Override // yads.t92
    public final void c() {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[LOOP:0: B:4:0x0018->B:17:?, LOOP_END, SYNTHETIC] */
    @Override // yads.t92, com.monetization.ads.base.webview.HtmlWebViewClientListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onOverrideUrlLoading(Context context, String str) {
        boolean z;
        vl61 vl61Var = this.k;
        vl61Var.getClass();
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            for (p371 p371Var : vl61Var.d) {
                if (!"mobileads".equals(scheme)) {
                    p371Var.getClass();
                } else if (p371Var.a.equals(host)) {
                    z = true;
                    if (!z) {
                        p371Var.b.run();
                        return;
                    }
                }
                z = false;
                if (!z) {
                }
            }
            f071 f071Var = vl61Var.e;
            if (f071Var != null) {
                ((gr81) ((aj71) f071Var).a.w).a(str);
            }
        } catch (URISyntaxException unused) {
            vl61Var.a();
        }
    }

    public final void setAdtuneWebViewListener(f071 f071Var) {
        this.k.e = f071Var;
    }
}
