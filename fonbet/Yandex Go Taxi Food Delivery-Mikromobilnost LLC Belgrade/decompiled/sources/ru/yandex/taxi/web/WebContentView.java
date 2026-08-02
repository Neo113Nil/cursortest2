package ru.yandex.taxi.web;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.CookieManager;
import defpackage.bv41;
import defpackage.fi7;
import defpackage.hst;
import defpackage.jst;
import defpackage.sq41;
import defpackage.yax;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.taxi.web.calljsinterface.CallJsInterfaceApi;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0017H\u0016¢\u0006\u0004\b!\u0010\u0019R\u0016\u0010\"\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/yandex/taxi/web/WebContentView;", "Lru/yandex/taxi/web/TaxiWebView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lsq41;", "webViewJsInterface", "Lzy11;", "addJsInterface", "(Lsq41;)V", "", "webViewJsInterfaces", "addJsInterfaces", "(Ljava/util/List;)V", "Lru/yandex/taxi/web/CoreWebViewConfig;", ConfigConstants.CONFIG, "Lbv41;", "webViewUtils", "init", "(Lru/yandex/taxi/web/CoreWebViewConfig;Lbv41;)V", "", "canScrollUp", "()Z", "", "scrollX", "scrollY", "clampedX", "clampedY", "onOverScrolled", "(IIZZ)V", "canGoBack", "lastScrollY", CA20Status.STATUS_USER_I, "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class WebContentView extends TaxiWebView {
    private int lastScrollY;

    public /* synthetic */ WebContentView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final void addJsInterface(sq41 webViewJsInterface) {
        if (webViewJsInterface != null) {
            addJavascriptInterface(webViewJsInterface.a, webViewJsInterface.b);
        }
    }

    private final void addJsInterfaces(List<sq41> webViewJsInterfaces) {
        Iterator<sq41> it = webViewJsInterfaces.iterator();
        while (it.hasNext()) {
            addJsInterface(it.next());
        }
    }

    @Override // android.webkit.WebView
    public boolean canGoBack() {
        if (!super.canGoBack()) {
            return false;
        }
        hst hstVar = jst.e;
        copyBackForwardList().getCurrentIndex();
        copyBackForwardList().getSize();
        hstVar.getClass();
        return true;
    }

    public final boolean canScrollUp() {
        return this.lastScrollY > 0;
    }

    public final void init(CoreWebViewConfig config, bv41 webViewUtils) {
        webViewUtils.getClass();
        getSettings().setJavaScriptEnabled(true);
        webViewUtils.a(this, config.getUserAgentAdditional());
        getSettings().setDomStorageEnabled(config.getLocalStorageEnabled());
        getSettings().setDatabaseEnabled(config.getLocalStorageEnabled());
        getSettings().setJavaScriptCanOpenWindowsAutomatically(config.getJavaScriptCanOpenWindowsAutomatically());
        getSettings().setMediaPlaybackRequiresUserGesture(config.getMediaPlaybackRequiresUserGesture());
        getSettings().setSupportMultipleWindows(config.getSupportMultipleWindows());
        addJsInterfaces(config.getWebViewJsInterfaces());
        if (config.getAcceptThirdPartyCookies()) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
        }
        if (config.getFitWidth()) {
            getSettings().setUseWideViewPort(true);
            getSettings().setLoadWithOverviewMode(true);
        }
        yax jsPromiseInterface = config.getJsPromiseInterface();
        if (jsPromiseInterface != null) {
            addJsInterface(jsPromiseInterface.provideWebViewJsInterface());
            jsPromiseInterface.setupWebView(this);
        }
        fi7 callJsInterfaceFactory = config.getCallJsInterfaceFactory();
        if (callJsInterfaceFactory != null) {
            CallJsInterfaceApi callJsInterfaceApi = new CallJsInterfaceApi(this);
            callJsInterfaceFactory.a(this, callJsInterfaceApi);
            addOnAttachStateChangeListener(callJsInterfaceApi);
            addJsInterface(new sq41(callJsInterfaceApi, "taxiApp"));
        }
        if (config.getIgnoreDeviceTextSize()) {
            getSettings().setTextZoom(100);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) {
        super.onOverScrolled(scrollX, scrollY, clampedX, clampedY);
        this.lastScrollY = scrollY;
    }

    public WebContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebContentView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }
}
