package yads;

import android.content.Context;
import android.os.Build;
import defpackage.ci81;
import defpackage.jl81;
import defpackage.p371;
import defpackage.pl81;
import defpackage.pm71;
import defpackage.y381;
import java.net.URI;
import java.net.URISyntaxException;

/* loaded from: classes7.dex */
public final class sb extends t92 {
    public final ci81 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(Context context) {
        super(context, null, null, 62);
        new pm71();
        new pl81();
        ci81 ci81Var = new ci81(new y381(context));
        this.k = ci81Var;
        if ("Xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) {
            setLayerType(2, null);
        }
        setVisibility(0);
        setHtmlWebViewErrorListener(ci81Var);
    }

    @Override // yads.t92
    public final void c() {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[LOOP:0: B:4:0x0018->B:18:?, LOOP_END, SYNTHETIC] */
    @Override // yads.t92, com.monetization.ads.base.webview.HtmlWebViewClientListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onOverrideUrlLoading(Context context, String str) {
        boolean z;
        ci81 ci81Var = this.k;
        ci81Var.getClass();
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            for (p371 p371Var : ci81Var.c) {
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
        } catch (URISyntaxException unused) {
        }
    }

    public final void setAdtuneWebViewListener(jl81 jl81Var) {
        this.k.d = jl81Var;
    }
}
