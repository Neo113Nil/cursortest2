package ru.yandex.taxi.fragment.common;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import defpackage.a0g;
import defpackage.am41;
import defpackage.bq41;
import defpackage.bv41;
import defpackage.czo0;
import defpackage.df4;
import defpackage.dq41;
import defpackage.evu0;
import defpackage.hbp0;
import defpackage.ish0;
import defpackage.j5z;
import defpackage.jgh0;
import defpackage.ji41;
import defpackage.jl40;
import defpackage.jst;
import defpackage.jxi;
import defpackage.kp50;
import defpackage.kyh0;
import defpackage.lg21;
import defpackage.lj41;
import defpackage.mg21;
import defpackage.ngd0;
import defpackage.o3h;
import defpackage.pux0;
import defpackage.pwy0;
import defpackage.q5z;
import defpackage.sls;
import defpackage.tje;
import defpackage.zy11;
import defpackage.zzf;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.taxi.deeplinks.f;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.fragment.YandexTaxiFragment;
import ru.yandex.taxi.fragment.common.WebViewFragment;
import ru.yandex.taxi.web.CommonWebViewClient;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.web.WebContentView;
import ru.yandex.taxi.web.view.listeners.TaxiDownloadListener;
import ru.yandex.taxi.widget.progress.CircularProgressBar;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@jxi
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 \u009a\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0006\u009b\u0001\u009c\u0001\u009d\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0006J\u001f\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0018¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010\u0006J\u000f\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010\u0006J\u000f\u0010'\u001a\u00020\u0002H\u0002¢\u0006\u0004\b'\u0010\u0006J\u000f\u0010(\u001a\u00020\u0002H\u0002¢\u0006\u0004\b(\u0010\u0006J\u000f\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b)\u0010\u0006J\u000f\u0010*\u001a\u00020\u0002H\u0002¢\u0006\u0004\b*\u0010\u0006J\u0017\u0010+\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0018H\u0002¢\u0006\u0004\b+\u0010\u001fJ\u0017\u0010,\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0018H\u0002¢\u0006\u0004\b,\u0010\u001fJ\u000f\u0010-\u001a\u00020\u0002H\u0002¢\u0006\u0004\b-\u0010\u0006J\u000f\u0010.\u001a\u00020\u0002H\u0002¢\u0006\u0004\b.\u0010\u0006J\u001b\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180/H\u0002¢\u0006\u0004\b0\u00101J\u0019\u00103\u001a\u00020\u00022\b\u00102\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b3\u0010\u001fR\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010?\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010>R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010>R\u0018\u0010D\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010>R\u0018\u0010E\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010>R\u0016\u0010F\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010GR\u0018\u0010I\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010JR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010JR\u0018\u0010K\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010JR\u001c\u0010N\u001a\b\u0018\u00010MR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR$\u0010Q\u001a\u00020\u00072\u0006\u0010P\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\"\u0010V\u001a\u00020U8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010]\u001a\u00020\\8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010d\u001a\u00020c8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010k\u001a\u00020j8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010r\u001a\u00020q8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\"\u0010y\u001a\u00020x8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R)\u0010\u0080\u0001\u001a\u00020\u007f8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R*\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0012\u0010\b\u001a\u00020\u00078F¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010TR\u0017\u0010\u0093\u0001\u001a\u00020\u00188VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0017\u0010\u0095\u0001\u001a\u00020\u00188VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0092\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0096\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001¨\u0006\u009e\u0001"}, d2 = {"Lru/yandex/taxi/fragment/common/WebViewFragment;", "Lru/yandex/taxi/fragment/YandexTaxiFragment;", "Lzy11;", "La0g;", "Ldf4;", "<init>", "()V", "Lru/yandex/taxi/web/UiWebViewConfig;", ConfigConstants.CONFIG, "setConfig", "(Lru/yandex/taxi/web/UiWebViewConfig;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "", "baseUrl", Constants.KEY_DATA, "setData", "(Ljava/lang/String;Ljava/lang/String;)V", "url", "loadUrl", "(Ljava/lang/String;)V", Constants.KEY_MESSAGE, "showUnsupportedZone", "", "onBackPressed", "()Z", "onResume", "onPause", "showCloseButton", "bindViewsInFields", "updateShareVisibility", "unbindViewsInFields", "loadUrlWithCache", "loadUrlWithHeaders", "reloadAfterError", "shareUrl", "", "provideHeaders", "()Ljava/util/Map;", "webTitle", "showWebTitle", "Lru/yandex/taxi/web/WebContentView;", "webView", "Lru/yandex/taxi/web/WebContentView;", "Lru/yandex/taxi/widget/progress/CircularProgressBar;", "progress", "Lru/yandex/taxi/widget/progress/CircularProgressBar;", "Lru/yandex/taxi/design/ToolbarComponent;", "toolbar", "Lru/yandex/taxi/design/ToolbarComponent;", "errorLayout", "Landroid/view/View;", "reloadButton", "Landroid/widget/TextView;", "infoText", "Landroid/widget/TextView;", "shareContainer", "shareShadow", "share", "isLoadingError", "Z", "titleFromWeb", "title", "Ljava/lang/String;", "fileUrl", "targetHost", "Lru/yandex/taxi/fragment/common/WebViewFragment$YaWebChromeClient;", "chromeClient", "Lru/yandex/taxi/fragment/common/WebViewFragment$YaWebChromeClient;", "value", "uiWebViewConfig", "Lru/yandex/taxi/web/UiWebViewConfig;", "getUiWebViewConfig", "()Lru/yandex/taxi/web/UiWebViewConfig;", "Lpwy0;", "themeSwitcherProvider", "Lpwy0;", "getThemeSwitcherProvider", "()Lpwy0;", "setThemeSwitcherProvider", "(Lpwy0;)V", "Lj5z;", "localeHelper", "Lj5z;", "getLocaleHelper", "()Lj5z;", "setLocaleHelper", "(Lj5z;)V", "Lbv41;", "webViewUtils", "Lbv41;", "getWebViewUtils", "()Lbv41;", "setWebViewUtils", "(Lbv41;)V", "Lru/yandex/taxi/fragment/common/b;", "defaultFileChooserHandler", "Lru/yandex/taxi/fragment/common/b;", "getDefaultFileChooserHandler", "()Lru/yandex/taxi/fragment/common/b;", "setDefaultFileChooserHandler", "(Lru/yandex/taxi/fragment/common/b;)V", "Lru/yandex/taxi/deeplinks/f;", "deeplinkUtils", "Lru/yandex/taxi/deeplinks/f;", "getDeeplinkUtils", "()Lru/yandex/taxi/deeplinks/f;", "setDeeplinkUtils", "(Lru/yandex/taxi/deeplinks/f;)V", "Lam41;", "webViewCacheLoaderProvider", "Lam41;", "getWebViewCacheLoaderProvider", "()Lam41;", "setWebViewCacheLoaderProvider", "(Lam41;)V", "Lo3h;", "deeplinkSchemeProvider", "Lo3h;", "getDeeplinkSchemeProvider", "()Lo3h;", "setDeeplinkSchemeProvider", "(Lo3h;)V", "Llg21;", "uriRouter", "Llg21;", "getUriRouter", "()Llg21;", "setUriRouter", "(Llg21;)V", "Lhbp0;", "resumeScopeDelegate", "Lhbp0;", "getConfig", "getBusinessName", "()Ljava/lang/String;", "businessName", "getPromoName", "promoName", "Lru/yandex/taxi/web/CoreWebViewConfig;", "getCoreConfig", "()Lru/yandex/taxi/web/CoreWebViewConfig;", "coreConfig", "Companion", "TaxiWebViewClient", "YaWebChromeClient", "dq41", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public class WebViewFragment extends YandexTaxiFragment<zy11, a0g> implements df4 {
    private static final String ANCHOR_DOWNLOAD_PDF = "receipt_url_pdf=";
    public static final dq41 Companion = new dq41();
    private String baseUrl;
    private YaWebChromeClient chromeClient;
    private String data;
    public o3h deeplinkSchemeProvider;
    public f deeplinkUtils;
    public b defaultFileChooserHandler;
    private View errorLayout;
    private String fileUrl;
    private TextView infoText;
    private boolean isLoadingError;
    public j5z localeHelper;
    private CircularProgressBar progress;
    private View reloadButton;
    private final hbp0 resumeScopeDelegate;
    private View share;
    private View shareContainer;
    private View shareShadow;
    private String targetHost;
    public pwy0 themeSwitcherProvider;
    private String title;
    private boolean titleFromWeb;
    private ToolbarComponent toolbar;
    private UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(null, null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194303, null);
    public lg21 uriRouter;
    private WebContentView webView;
    public am41 webViewCacheLoaderProvider;
    public bv41 webViewUtils;

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0!H\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\bH\u0014¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/yandex/taxi/fragment/common/WebViewFragment$TaxiWebViewClient;", "Lru/yandex/taxi/web/CommonWebViewClient;", "", "shouldIgnoreSslError", "useIntentForNonHttpUrls", "Lru/yandex/taxi/deeplinks/f;", "deeplinkUtils", "", "", "jsScripts", "<init>", "(Lru/yandex/taxi/fragment/common/WebViewFragment;ZZLru/yandex/taxi/deeplinks/f;Ljava/util/List;)V", "Landroid/webkit/WebView;", "view", "url", "Lzy11;", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Landroid/graphics/Bitmap;", "favicon", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "supportedDeeplinkSchemes", "()Ljava/util/List;", "", ErrorResponseData.JSON_ERROR_CODE, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "fallingUrl", "onError", "(ILjava/lang/String;Ljava/lang/String;)V", "", "headers", "()Ljava/util/Map;", "openUrlByIntent", "(Ljava/lang/String;)V", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public final class TaxiWebViewClient extends CommonWebViewClient {
        public TaxiWebViewClient(boolean z, boolean z2, f fVar, List<String> list) {
            super(z, z2, fVar, list);
        }

        @Override // ru.yandex.taxi.fragment.common.BaseWebViewClient
        public Activity getActivity() {
            return WebViewFragment.this.getActivity();
        }

        @Override // ru.yandex.taxi.web.CommonWebViewClient
        public Map<String, String> headers() {
            return WebViewFragment.this.provideHeaders();
        }

        @Override // ru.yandex.taxi.web.CommonWebViewClient
        public void onError(int errorCode, String description, String fallingUrl) {
            ToolbarComponent toolbarComponent;
            super.onError(errorCode, description, fallingUrl);
            WebViewFragment.this.isLoadingError = true;
            if (!WebViewFragment.this.titleFromWeb || (toolbarComponent = WebViewFragment.this.toolbar) == null) {
                return;
            }
            toolbarComponent.setTitle(WebViewFragment.this.title);
        }

        @Override // ru.yandex.taxi.web.CommonWebViewClient, android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            ToolbarComponent toolbarComponent;
            super.onPageFinished(view, url);
            WebContentView webContentView = WebViewFragment.this.webView;
            if (webContentView == null) {
                return;
            }
            CircularProgressBar circularProgressBar = WebViewFragment.this.progress;
            if (circularProgressBar != null) {
                circularProgressBar.setVisibility(8);
            }
            if (WebViewFragment.this.isLoadingError) {
                View view2 = WebViewFragment.this.errorLayout;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                webContentView.setVisibility(4);
            } else {
                webContentView.setVisibility(0);
            }
            if (!WebViewFragment.this.titleFromWeb || WebViewFragment.this.isLoadingError || (toolbarComponent = WebViewFragment.this.toolbar) == null) {
                return;
            }
            toolbarComponent.setTitle(webContentView.getTitle());
        }

        @Override // ru.yandex.taxi.web.CommonWebViewClient, android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            String fragment = url != null ? Uri.parse(url).getFragment() : null;
            WebViewFragment.this.fileUrl = (fragment == null || fragment.length() == 0 || !evu0.y(fragment, WebViewFragment.ANCHOR_DOWNLOAD_PDF, false)) ? null : fragment.substring(evu0.H(fragment, WebViewFragment.ANCHOR_DOWNLOAD_PDF, 0, false, 6) + 16);
            WebViewFragment.this.updateShareVisibility();
            String str = WebViewFragment.this.targetHost;
            if (str == null || str.length() == 0) {
                return;
            }
            if (jl40.l(WebViewFragment.this.targetHost, url != null ? Uri.parse(url).getHost() : null)) {
                view.clearHistory();
                WebViewFragment.this.targetHost = null;
            }
        }

        @Override // ru.yandex.taxi.web.CommonWebViewClient
        public void openUrlByIntent(String url) {
            if (WebViewFragment.this.webView == null) {
                jst.e.s(new IllegalStateException("openUrlByIntent called before webView created"));
            } else {
                ((mg21) WebViewFragment.this.getUriRouter()).c(url);
            }
        }

        @Override // ru.yandex.taxi.fragment.common.BaseWebViewClient
        public List<String> supportedDeeplinkSchemes() {
            ((pux0) WebViewFragment.this.getDeeplinkSchemeProvider()).getClass();
            return pux0.b;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/fragment/common/WebViewFragment$YaWebChromeClient;", "Lru/yandex/taxi/fragment/common/BaseWebChromeClient;", "", "delayedSpinner", "Llj41;", "progress", "<init>", "(Lru/yandex/taxi/fragment/common/WebViewFragment;ZLlj41;)V", "Lzy11;", "hideContent", "()V", "showContent", "Landroid/webkit/WebView;", "view", "", "webTitle", "onReceivedTitle", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public final class YaWebChromeClient extends BaseWebChromeClient {
        public YaWebChromeClient(boolean z, lj41 lj41Var) {
            super(WebViewFragment.this.getViewLifecycleScope(), z, lj41Var);
        }

        @Override // ru.yandex.taxi.fragment.common.BaseWebChromeClient
        public void hideContent() {
            super.hideContent();
            WebContentView webContentView = WebViewFragment.this.webView;
            if (webContentView != null) {
                webContentView.setVisibility(4);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView view, String webTitle) {
            if (WebViewFragment.this.titleFromWeb) {
                WebViewFragment.this.showWebTitle(webTitle);
            }
        }

        @Override // ru.yandex.taxi.fragment.common.BaseWebChromeClient
        public void showContent() {
            WebContentView webContentView;
            super.showContent();
            if (WebViewFragment.this.isLoadingError || (webContentView = WebViewFragment.this.webView) == null) {
                return;
            }
            webContentView.setVisibility(0);
        }
    }

    public WebViewFragment() {
        String str = (2 & 1) != 0 ? null : "WebViewFragment";
        this.resumeScopeDelegate = new hbp0(new czo0(14), str == null ? "" : str, null);
    }

    private final void bindViewsInFields() {
        this.webView = (WebContentView) nonNullViewById(jgh0.webview);
        this.progress = (CircularProgressBar) nonNullViewById(jgh0.progress);
        this.toolbar = (ToolbarComponent) nonNullViewById(jgh0.toolbar);
        this.errorLayout = nonNullViewById(jgh0.error_layout);
        View nonNullViewById = nonNullViewById(jgh0.reload_button);
        final int i = 0;
        ru.yandex.taxi.design.utils.c.z(new sls(this) { // from class: wp41
            public final /* synthetic */ WebViewFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 bindViewsInFields$lambda$0$0;
                zy11 bindViewsInFields$lambda$1$0;
                int i2 = i;
                WebViewFragment webViewFragment = this.b;
                switch (i2) {
                    case 0:
                        bindViewsInFields$lambda$0$0 = WebViewFragment.bindViewsInFields$lambda$0$0(webViewFragment);
                        return bindViewsInFields$lambda$0$0;
                    default:
                        bindViewsInFields$lambda$1$0 = WebViewFragment.bindViewsInFields$lambda$1$0(webViewFragment);
                        return bindViewsInFields$lambda$1$0;
                }
            }
        }, nonNullViewById);
        this.reloadButton = nonNullViewById;
        this.infoText = (TextView) nonNullViewById(jgh0.infoText);
        this.shareContainer = nonNullViewById(jgh0.share_container);
        this.shareShadow = nonNullViewById(jgh0.share_shadow);
        View nonNullViewById2 = nonNullViewById(jgh0.share);
        final int i2 = 1;
        ru.yandex.taxi.design.utils.c.z(new sls(this) { // from class: wp41
            public final /* synthetic */ WebViewFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 bindViewsInFields$lambda$0$0;
                zy11 bindViewsInFields$lambda$1$0;
                int i22 = i2;
                WebViewFragment webViewFragment = this.b;
                switch (i22) {
                    case 0:
                        bindViewsInFields$lambda$0$0 = WebViewFragment.bindViewsInFields$lambda$0$0(webViewFragment);
                        return bindViewsInFields$lambda$0$0;
                    default:
                        bindViewsInFields$lambda$1$0 = WebViewFragment.bindViewsInFields$lambda$1$0(webViewFragment);
                        return bindViewsInFields$lambda$1$0;
                }
            }
        }, nonNullViewById2);
        this.share = nonNullViewById2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 bindViewsInFields$lambda$0$0(WebViewFragment webViewFragment) {
        webViewFragment.reloadAfterError();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 bindViewsInFields$lambda$1$0(WebViewFragment webViewFragment) {
        webViewFragment.shareUrl();
        return zy11.a;
    }

    private final CoreWebViewConfig getCoreConfig() {
        return this.uiWebViewConfig.getCoreConfig();
    }

    private final void loadUrlWithCache(String url) {
        ru.yandex.taxi.controller.b a = getWebViewCacheLoaderProvider().a(url);
        CoreWebViewConfig coreConfig = getCoreConfig();
        tje.N(getLifecycleScope(), null, null, new WebViewFragment$loadUrlWithCache$1(a, coreConfig.shouldUseAuthorizationHeader() ? coreConfig.getToken(null) : null, this, url, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadUrlWithHeaders(String url) {
        WebContentView webContentView = this.webView;
        if (webContentView != null) {
            webContentView.loadUrl(url, provideHeaders());
        }
    }

    public static final WebViewFragment newInstance(UiWebViewConfig uiWebViewConfig) {
        Companion.getClass();
        WebViewFragment webViewFragment = new WebViewFragment();
        webViewFragment.setConfig(uiWebViewConfig);
        return webViewFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$4$0(WebViewFragment webViewFragment) {
        webViewFragment.requireActivity().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> provideHeaders() {
        MapBuilder mapBuilder = new MapBuilder();
        CoreWebViewConfig coreConfig = getCoreConfig();
        if (coreConfig.shouldUseAuthorizationHeader()) {
            mapBuilder.put("Authorization", kp50.h(coreConfig.getToken(null)));
        }
        if (this.localeHelper != null) {
            mapBuilder.put("Accept-Language", getLocaleHelper().d());
        }
        mapBuilder.putAll(coreConfig.getHeaders());
        return mapBuilder.j();
    }

    private final void reloadAfterError() {
        this.isLoadingError = false;
        YaWebChromeClient yaWebChromeClient = this.chromeClient;
        if (yaWebChromeClient != null) {
            yaWebChromeClient.showLoading();
        }
        View view = this.errorLayout;
        if (view != null) {
            view.setVisibility(8);
        }
        WebContentView webContentView = this.webView;
        if (webContentView != null) {
            webContentView.reload();
        }
    }

    private final void shareUrl() {
        String str = this.fileUrl;
        String url = (str == null || evu0.J(str)) ? getCoreConfig().getUrl() : this.fileUrl;
        if (url == null || url.length() == 0) {
            return;
        }
        int i = kyh0.receipt_share_title;
        Context requireContext = requireContext();
        q5z.c0(url, requireContext.getString(i), requireContext, 0);
    }

    private final void showCloseButton() {
        ToolbarComponent toolbarComponent = this.toolbar;
        if (toolbarComponent != null) {
            toolbarComponent.disableNavigationButton();
            toolbarComponent.enableCloseButton(0);
            toolbarComponent.setOnCloseClickListener(new bq41(this, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCloseButton$lambda$0$0(WebViewFragment webViewFragment) {
        FragmentActivity activity = webViewFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showWebTitle(String webTitle) {
        ToolbarComponent toolbarComponent;
        ToolbarComponent toolbarComponent2 = this.toolbar;
        if (toolbarComponent2 == null || toolbarComponent2.getVisibility() != 0 || this.isLoadingError || (toolbarComponent = this.toolbar) == null) {
            return;
        }
        toolbarComponent.setTitle(webTitle);
    }

    private final void unbindViewsInFields() {
        WebContentView webContentView = this.webView;
        if (webContentView != null) {
            webContentView.setWebChromeClient(null);
        }
        this.webView = null;
        this.progress = null;
        ToolbarComponent toolbarComponent = this.toolbar;
        if (toolbarComponent != null) {
            toolbarComponent.disableCloseButton();
        }
        ToolbarComponent toolbarComponent2 = this.toolbar;
        if (toolbarComponent2 != null) {
            toolbarComponent2.disableNavigationButton();
        }
        this.toolbar = null;
        this.errorLayout = null;
        View view = this.reloadButton;
        if (view != null) {
            view.setOnClickListener(null);
        }
        this.reloadButton = null;
        this.infoText = null;
        this.shareContainer = null;
        this.shareShadow = null;
        View view2 = this.share;
        if (view2 != null) {
            view2.setOnClickListener(null);
        }
        this.share = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateShareVisibility() {
        if (this.shareContainer == null || this.shareShadow == null) {
            return;
        }
        String str = this.fileUrl;
        int i = ((str == null || str.length() == 0) && !getUiWebViewConfig().getShouldShowShareButton()) ? 8 : 0;
        View view = this.shareContainer;
        if (view != null) {
            view.setVisibility(i);
        }
        View view2 = this.shareShadow;
        if (view2 != null) {
            view2.setVisibility(i);
        }
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment
    public String getBusinessName() {
        String businessName = getUiWebViewConfig().getBusinessName();
        return businessName == null ? "" : businessName;
    }

    /* renamed from: getConfig, reason: from getter */
    public final UiWebViewConfig getUiWebViewConfig() {
        return this.uiWebViewConfig;
    }

    public final o3h getDeeplinkSchemeProvider() {
        o3h o3hVar = this.deeplinkSchemeProvider;
        if (o3hVar != null) {
            return o3hVar;
        }
        return null;
    }

    public final f getDeeplinkUtils() {
        f fVar = this.deeplinkUtils;
        if (fVar != null) {
            return fVar;
        }
        return null;
    }

    public final b getDefaultFileChooserHandler() {
        b bVar = this.defaultFileChooserHandler;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    public final j5z getLocaleHelper() {
        j5z j5zVar = this.localeHelper;
        if (j5zVar != null) {
            return j5zVar;
        }
        return null;
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment
    public String getPromoName() {
        String businessName = getBusinessName();
        return (businessName == null || evu0.J(businessName)) ? "#none#" : businessName;
    }

    public final pwy0 getThemeSwitcherProvider() {
        pwy0 pwy0Var = this.themeSwitcherProvider;
        if (pwy0Var != null) {
            return pwy0Var;
        }
        return null;
    }

    public final UiWebViewConfig getUiWebViewConfig() {
        return this.uiWebViewConfig;
    }

    public final lg21 getUriRouter() {
        lg21 lg21Var = this.uriRouter;
        if (lg21Var != null) {
            return lg21Var;
        }
        return null;
    }

    public final am41 getWebViewCacheLoaderProvider() {
        am41 am41Var = this.webViewCacheLoaderProvider;
        if (am41Var != null) {
            return am41Var;
        }
        return null;
    }

    public final bv41 getWebViewUtils() {
        bv41 bv41Var = this.webViewUtils;
        if (bv41Var != null) {
            return bv41Var;
        }
        return null;
    }

    public final void loadUrl(String url) {
        if (getCoreConfig().containsUrl()) {
            jst.e.getClass();
            return;
        }
        getUiWebViewConfig().withUrl(url);
        if (this.webView == null) {
            return;
        }
        YaWebChromeClient yaWebChromeClient = this.chromeClient;
        if (yaWebChromeClient != null) {
            yaWebChromeClient.showLoading();
        }
        WebContentView webContentView = this.webView;
        if (webContentView != null) {
            webContentView.clearHistory();
        }
        loadUrlWithHeaders(url);
    }

    @Override // defpackage.df4
    public boolean onBackPressed() {
        WebContentView webContentView = this.webView;
        if (webContentView == null || !webContentView.canGoBack()) {
            return false;
        }
        WebContentView webContentView2 = this.webView;
        if (webContentView2 != null) {
            webContentView2.goBack();
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(ish0.webview_fragment, container, false);
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        unbindViewsInFields();
    }

    @Override // ru.yandex.taxi.fragment.YandexTaxiFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.resumeScopeDelegate.b();
    }

    @Override // ru.yandex.taxi.fragment.YandexTaxiFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        WebContentView webContentView;
        super.onResume();
        this.resumeScopeDelegate.a();
        if (this.themeSwitcherProvider == null || (webContentView = this.webView) == null) {
            return;
        }
        ru.yandex.taxi.web.view.a.a(webContentView, this.resumeScopeDelegate.c(), getThemeSwitcherProvider());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        WebViewFragment webViewFragment;
        super.onViewCreated(view, savedInstanceState);
        bindViewsInFields();
        a0g a0gVar = (a0g) injector();
        zzf zzfVar = a0gVar.a;
        this.receiverProvider = zzfVar.Yp;
        this.themeSwitcherProvider = (pwy0) zzfVar.U.get();
        this.localeHelper = (j5z) zzfVar.f0.get();
        this.webViewUtils = (bv41) zzfVar.Mj.get();
        this.defaultFileChooserHandler = (b) a0gVar.b.n8.get();
        this.deeplinkUtils = (f) zzfVar.S.get();
        this.webViewCacheLoaderProvider = (am41) zzfVar.Yo.get();
        this.deeplinkSchemeProvider = (o3h) zzfVar.K.get();
        this.uriRouter = (lg21) zzfVar.u5.get();
        TextView textView = this.infoText;
        if (textView != null) {
            ngd0.n(textView, null, 0).d(2.0f, 12);
        }
        this.titleFromWeb = getUiWebViewConfig().getHasTitleFromWeb();
        String title = getUiWebViewConfig().getTitle();
        if (title == null) {
            title = "";
        }
        this.title = title;
        this.targetHost = getCoreConfig().getTargetHost();
        CircularProgressBar circularProgressBar = this.progress;
        YaWebChromeClient yaWebChromeClient = new YaWebChromeClient(getCoreConfig().getDelayedSpinner(), circularProgressBar != null ? new ji41(4, circularProgressBar) : null);
        this.chromeClient = yaWebChromeClient;
        yaWebChromeClient.setFileChooserHandler(getDefaultFileChooserHandler());
        WebContentView webContentView = this.webView;
        if (webContentView != null) {
            webContentView.setDownloadListener(new TaxiDownloadListener(requireActivity()));
        }
        WebContentView webContentView2 = this.webView;
        if (webContentView2 != null) {
            webContentView2.init(getUiWebViewConfig().getCoreConfig(), getWebViewUtils());
            webViewFragment = this;
            webContentView2.setWebViewClient(webViewFragment.new TaxiWebViewClient(getCoreConfig().getIgnoreSslError(), getCoreConfig().getUseIntentForNonHttpUrls(), getDeeplinkUtils(), getCoreConfig().getJsScripts()));
            webContentView2.setWebChromeClient(webViewFragment.chromeClient);
        } else {
            webViewFragment = this;
        }
        String unsupportedText = webViewFragment.getUiWebViewConfig().getUnsupportedText();
        String url = webViewFragment.getCoreConfig().getUrl();
        String str = webViewFragment.baseUrl;
        if (unsupportedText != null && unsupportedText.length() != 0) {
            TextView textView2 = webViewFragment.infoText;
            if (textView2 != null) {
                textView2.setVisibility(0);
                textView2.setText(unsupportedText);
            }
        } else if ((url == null || evu0.J(url)) && str != null) {
            webViewFragment.setData(str, webViewFragment.data);
        } else if (url != null && url.length() != 0) {
            if (webViewFragment.getUiWebViewConfig().getShouldUseCached()) {
                webViewFragment.loadUrlWithCache(url);
                YaWebChromeClient yaWebChromeClient2 = webViewFragment.chromeClient;
                if (yaWebChromeClient2 != null) {
                    yaWebChromeClient2.showLoading();
                }
            } else {
                webViewFragment.loadUrlWithHeaders(url);
                YaWebChromeClient yaWebChromeClient3 = webViewFragment.chromeClient;
                if (yaWebChromeClient3 != null) {
                    yaWebChromeClient3.showLoading();
                }
            }
        }
        ToolbarComponent toolbarComponent = webViewFragment.toolbar;
        if (toolbarComponent != null) {
            toolbarComponent.setTitle(webViewFragment.title);
            toolbarComponent.enableNavigationButton();
            toolbarComponent.setOnNavigationClickListener(new bq41(webViewFragment, r0));
        }
        webViewFragment.updateShareVisibility();
        if (webViewFragment.getUiWebViewConfig().getShouldShowCloseButton()) {
            webViewFragment.showCloseButton();
        }
        ToolbarComponent toolbarComponent2 = webViewFragment.toolbar;
        if (toolbarComponent2 != null) {
            toolbarComponent2.setVisibility(webViewFragment.getUiWebViewConfig().getShouldShowToolbar() ? 0 : 8);
        }
    }

    public final void setConfig(UiWebViewConfig config) {
        this.uiWebViewConfig = config;
    }

    public final void setData(String baseUrl, String data) {
        if (getCoreConfig().containsUrl()) {
            jst.e.getClass();
            return;
        }
        this.baseUrl = baseUrl;
        this.data = data;
        if (this.webView == null) {
            return;
        }
        YaWebChromeClient yaWebChromeClient = this.chromeClient;
        if (yaWebChromeClient != null) {
            yaWebChromeClient.showLoading();
        }
        if (data != null) {
            WebContentView webContentView = this.webView;
            if (webContentView != null) {
                webContentView.clearHistory();
            }
            WebContentView webContentView2 = this.webView;
            if (webContentView2 != null) {
                webContentView2.loadDataWithBaseURL(baseUrl, data, "text/html", "UTF-8", null);
            }
        }
    }

    public final void setDeeplinkSchemeProvider(o3h o3hVar) {
        this.deeplinkSchemeProvider = o3hVar;
    }

    public final void setDeeplinkUtils(f fVar) {
        this.deeplinkUtils = fVar;
    }

    public final void setDefaultFileChooserHandler(b bVar) {
        this.defaultFileChooserHandler = bVar;
    }

    public final void setLocaleHelper(j5z j5zVar) {
        this.localeHelper = j5zVar;
    }

    public final void setThemeSwitcherProvider(pwy0 pwy0Var) {
        this.themeSwitcherProvider = pwy0Var;
    }

    public final void setUriRouter(lg21 lg21Var) {
        this.uriRouter = lg21Var;
    }

    public final void setWebViewCacheLoaderProvider(am41 am41Var) {
        this.webViewCacheLoaderProvider = am41Var;
    }

    public final void setWebViewUtils(bv41 bv41Var) {
        this.webViewUtils = bv41Var;
    }

    public final void showUnsupportedZone(String message) {
        CircularProgressBar circularProgressBar;
        getUiWebViewConfig().setUnsupportedText(message);
        if (this.infoText == null || (circularProgressBar = this.progress) == null) {
            return;
        }
        if (circularProgressBar != null) {
            circularProgressBar.setVisibility(8);
        }
        TextView textView = this.infoText;
        if (textView != null) {
            textView.setVisibility(0);
        }
        TextView textView2 = this.infoText;
        if (textView2 != null) {
            textView2.setText(message);
        }
    }
}
