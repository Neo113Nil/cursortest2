package ru.yandex.taxi.web.view.clients;

import android.app.Activity;
import android.graphics.Bitmap;
import android.webkit.WebView;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import defpackage.ecy0;
import defpackage.fm41;
import defpackage.q501;
import defpackage.vvb1;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.yandex.taxi.deeplinks.f;
import ru.yandex.taxi.web.CommonWebViewClient;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010\u001fJ+\u0010#\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J'\u0010)\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\bH\u0014¢\u0006\u0004\b)\u0010*J\u0011\u0010+\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0014¢\u0006\u0004\b-\u0010.J\u001b\u00100\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0/H\u0014¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\bH\u0014¢\u0006\u0004\b2\u00103R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00104R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00105R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00106¨\u00067"}, d2 = {"Lru/yandex/taxi/web/view/clients/TaxiWebViewClient;", "Lru/yandex/taxi/web/CommonWebViewClient;", "", "shouldIgnoreSslError", "useIntentForNonHttpUrls", "Lru/yandex/taxi/deeplinks/f;", "deeplinkUtils", "", "", "jsScripts", "<init>", "(ZZLru/yandex/taxi/deeplinks/f;Ljava/util/List;)V", "Lfm41;", "listener", "Lzy11;", "setListener", "(Lfm41;)V", "Lecy0;", "helper", "setHelper", "(Lecy0;)V", "Landroid/app/Activity;", "activity", "setActivity", "(Landroid/app/Activity;)V", "release", "()V", "Landroid/webkit/WebView;", "view", "url", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "onPageCommitVisible", "Landroid/graphics/Bitmap;", "favicon", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "", ErrorResponseData.JSON_ERROR_CODE, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "fallingUrl", "onError", "(ILjava/lang/String;Ljava/lang/String;)V", "getActivity", "()Landroid/app/Activity;", "supportedDeeplinkSchemes", "()Ljava/util/List;", "", "headers", "()Ljava/util/Map;", "openUrlByIntent", "(Ljava/lang/String;)V", "Lfm41;", "Lecy0;", "Landroid/app/Activity;", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class TaxiWebViewClient extends CommonWebViewClient {
    private Activity activity;
    private ecy0 helper;
    private fm41 listener;

    public TaxiWebViewClient(boolean z, boolean z2, f fVar, List<String> list) {
        super(z, z2, fVar, list);
        this.listener = q501.c;
        this.helper = vvb1.S;
    }

    @Override // ru.yandex.taxi.fragment.common.BaseWebViewClient
    public Activity getActivity() {
        return this.activity;
    }

    @Override // ru.yandex.taxi.web.CommonWebViewClient
    public Map<String, String> headers() {
        return this.helper.t();
    }

    @Override // ru.yandex.taxi.web.CommonWebViewClient
    public void onError(int errorCode, String description, String fallingUrl) {
        super.onError(errorCode, description, fallingUrl);
        this.listener.e(errorCode, fallingUrl);
    }

    @Override // ru.yandex.taxi.web.CommonWebViewClient, android.webkit.WebViewClient
    public void onPageCommitVisible(WebView view, String url) {
        super.onPageCommitVisible(view, url);
        this.listener.onPageCommitVisible(url);
    }

    @Override // ru.yandex.taxi.web.CommonWebViewClient, android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        fm41 fm41Var = this.listener;
        String title = view.getTitle();
        if (title == null) {
            title = "";
        }
        fm41Var.o(url, title);
    }

    @Override // ru.yandex.taxi.web.CommonWebViewClient, android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        this.listener.onPageStarted(url);
    }

    @Override // ru.yandex.taxi.web.CommonWebViewClient
    public void openUrlByIntent(String url) {
        this.helper.p(url);
    }

    public final void release() {
        setListener(q501.c);
        setHelper(vvb1.S);
        setActivity(null);
    }

    public final void setActivity(Activity activity) {
        this.activity = activity;
    }

    public final void setHelper(ecy0 helper) {
        this.helper = helper;
    }

    public final void setListener(fm41 listener) {
        this.listener = listener;
    }

    @Override // ru.yandex.taxi.fragment.common.BaseWebViewClient
    public List<String> supportedDeeplinkSchemes() {
        return this.helper.q();
    }
}
