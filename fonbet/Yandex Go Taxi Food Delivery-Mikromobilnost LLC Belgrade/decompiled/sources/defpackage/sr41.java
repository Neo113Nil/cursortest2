package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebViewClient;
import androidx.fragment.app.Fragment;
import com.yandex.messenger.websdk.internal.webview.MessengerWebView;
import java.util.Map;

/* loaded from: classes15.dex */
public final class sr41 implements rv41 {
    public MessengerWebView a;
    public Fragment b;

    @Override // defpackage.rv41
    public final void F(int i) {
        MessengerWebView messengerWebView = this.a;
        if (messengerWebView != null) {
            messengerWebView.setBackgroundColor(i);
        }
    }

    @Override // defpackage.rv41
    public final void U1() {
        jl40.n(this.a, "View is released");
        MessengerWebView messengerWebView = this.a;
        ViewParent parent = messengerWebView != null ? messengerWebView.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        jl40.n(viewGroup, "View already detached");
        if (viewGroup != null) {
            viewGroup.removeView(this.a);
        }
        jl40.n(this.b, "View not bound to lifecycle");
        this.b = null;
    }

    @Override // defpackage.rv41
    public final View asView() {
        return this.a;
    }

    @Override // defpackage.rv41
    public final void clearHistory() {
        MessengerWebView messengerWebView = this.a;
        if (messengerWebView != null) {
            messengerWebView.clearHistory();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b != null) {
            jl40.x("WebView was not detached from fragment");
            U1();
        }
        MessengerWebView messengerWebView = this.a;
        if (messengerWebView != null) {
            messengerWebView.setWebChromeClient(null);
            messengerWebView.setWebViewClient(new WebViewClient());
            messengerWebView.loadUrl("about:blank");
            messengerWebView.stopLoading();
            messengerWebView.onPause();
            messengerWebView.clearHistory();
            messengerWebView.setVisibility(8);
            messengerWebView.removeAllViews();
            messengerWebView.destroy();
        }
        this.a = null;
    }

    @Override // defpackage.rv41
    public final void f1(sls slsVar, String str) {
        MessengerWebView messengerWebView = this.a;
        if (messengerWebView == null || messengerWebView.getParent() == null) {
            return;
        }
        jl40.x(str);
        slsVar.invoke();
    }

    @Override // defpackage.rv41
    public final void hide() {
        MessengerWebView messengerWebView = this.a;
        if (messengerWebView != null) {
            messengerWebView.setVisibility(0);
        }
    }

    @Override // defpackage.rv41
    public final void i1(Fragment fragment) {
        MessengerWebView messengerWebView = this.a;
        if (messengerWebView == null) {
            jl40.x("View is released");
            return;
        }
        ViewParent parent = messengerWebView.getParent();
        if (parent != null) {
            ViewGroup viewGroup = (ViewGroup) parent;
            String l = b64.l("View is attached to ", viewGroup.getResources().getResourceEntryName(viewGroup.getId()), ":", qoi0.a(viewGroup.getClass()).d());
            if (jl40.f) {
                ny61.f(l);
                return;
            }
            U1();
        }
        if (this.b != null) {
            jl40.x("View already bound to lifecycle");
            U1();
        }
        View view = fragment.getView();
        ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
        jl40.n(viewGroup2, "No view parent in " + qoi0.a(fragment.getClass()).d());
        if (viewGroup2 != null) {
            viewGroup2.addView(messengerWebView, 0);
        }
        this.b = fragment;
    }

    @Override // defpackage.rv41
    public final boolean loadUrl(String str, Map map) {
        MessengerWebView messengerWebView = this.a;
        if (messengerWebView == null) {
            return false;
        }
        messengerWebView.loadUrl(str, map);
        return true;
    }

    @Override // defpackage.rv41
    public final boolean onBackPressed() {
        MessengerWebView messengerWebView = this.a;
        if (messengerWebView == null) {
            return false;
        }
        boolean canGoBack = messengerWebView.canGoBack();
        if (canGoBack) {
            messengerWebView.goBack();
        }
        return canGoBack;
    }

    @Override // defpackage.rv41
    public final void show() {
        MessengerWebView messengerWebView = this.a;
        if (messengerWebView != null) {
            messengerWebView.setVisibility(0);
            messengerWebView.requestFocus();
        }
    }

    @Override // defpackage.rv41
    public final boolean x1() {
        return this.a != null;
    }
}
