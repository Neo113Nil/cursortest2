package C2;

import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p2.C4835j;

/* loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f428n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ A f429u;

    public /* synthetic */ z(A a9, int i) {
        this.f428n = i;
        this.f429u = a9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebViewClient e9;
        switch (this.f428n) {
            case 0:
                A a9 = this.f429u;
                synchronized (a9.f247c) {
                    WebView webView = a9.f250f;
                    if (webView == null) {
                        return;
                    }
                    try {
                        u2.D d2 = C4835j.f39733C.f39738c;
                        if (Build.VERSION.SDK_INT < 26) {
                            if (com.bumptech.glide.f.o("GET_WEB_VIEW_CLIENT")) {
                                try {
                                    e9 = H0.e.e(webView);
                                } catch (RuntimeException e10) {
                                    C4835j.f39733C.f39743h.d("AdUtil.getWebViewClient", e10);
                                }
                            }
                            throw new IllegalStateException("getWebViewClient not supported");
                        }
                        e9 = webView.getWebViewClient();
                        if (e9 == a9) {
                            return;
                        }
                        if (e9 != null) {
                            a9.f249e = e9;
                        }
                        webView.setWebViewClient(a9);
                        a9.x();
                        return;
                    } catch (IllegalStateException unused) {
                        return;
                    }
                }
            default:
                A a10 = this.f429u;
                a10.f246b.execute(new z(a10, 0));
                return;
        }
    }
}
