package ru.yandex.taxi.web.view;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.b;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.go.design.view.GoFrameLayout;
import defpackage.aj31;
import defpackage.am41;
import defpackage.bu41;
import defpackage.bv41;
import defpackage.c2x0;
import defpackage.cu41;
import defpackage.cvu0;
import defpackage.d2x0;
import defpackage.dcy0;
import defpackage.dp41;
import defpackage.dzg0;
import defpackage.ef4;
import defpackage.eg01;
import defpackage.em41;
import defpackage.en41;
import defpackage.exu0;
import defpackage.gn41;
import defpackage.gp41;
import defpackage.h2x0;
import defpackage.h3y;
import defpackage.hn41;
import defpackage.hos0;
import defpackage.ish0;
import defpackage.jgh0;
import defpackage.ji41;
import defpackage.jl40;
import defpackage.jst;
import defpackage.jy31;
import defpackage.kyh0;
import defpackage.lj41;
import defpackage.ms41;
import defpackage.mx60;
import defpackage.ngd0;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.og21;
import defpackage.pzt0;
import defpackage.q5z;
import defpackage.qc;
import defpackage.qje;
import defpackage.rp31;
import defpackage.scc;
import defpackage.tje;
import defpackage.to41;
import defpackage.tse;
import defpackage.v7j0;
import defpackage.vjp0;
import defpackage.xng0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.deeplinks.f;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.web.WebContentView;
import ru.yandex.taxi.web.view.WebViewContainerImpl;
import ru.yandex.taxi.web.view.clients.TaxiWebViewClient;
import ru.yandex.taxi.web.view.clients.YaWebChromeClient;
import ru.yandex.taxi.web.view.listeners.TaxiDownloadListener;

@Metadata(d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u009f\u0001B\u007f\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fBw\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010 J\u0015\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020#2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020#2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020#2\u0006\u0010.\u001a\u00020\u0003¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020#¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020!¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020!H\u0016¢\u0006\u0004\b5\u00104J\u0015\u00108\u001a\u00020#2\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u001f\u0010<\u001a\u00020#2\u0006\u0010:\u001a\u0002062\b\u0010;\u001a\u0004\u0018\u000106¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020#H\u0014¢\u0006\u0004\b>\u00102J\u000f\u0010?\u001a\u00020#H\u0014¢\u0006\u0004\b?\u00102J\u0017\u0010B\u001a\u00020#2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020#2\b\u0010D\u001a\u0004\u0018\u00010@¢\u0006\u0004\bE\u0010CJ\u001f\u0010I\u001a\u00020#2\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020FH\u0014¢\u0006\u0004\bI\u0010JJ\u0015\u0010M\u001a\u00020#2\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bM\u0010NJ\u0015\u0010O\u001a\u00020#2\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bO\u0010NJ\r\u0010P\u001a\u00020#¢\u0006\u0004\bP\u00102J\u0015\u0010R\u001a\u00020#2\u0006\u0010Q\u001a\u000206¢\u0006\u0004\bR\u00109J\u0017\u0010U\u001a\u00020#2\b\u0010T\u001a\u0004\u0018\u00010S¢\u0006\u0004\bU\u0010VJ\r\u0010W\u001a\u00020#¢\u0006\u0004\bW\u00102J\u000f\u0010Y\u001a\u00020XH\u0016¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020#H\u0002¢\u0006\u0004\b[\u00102J\u000f\u0010\\\u001a\u00020#H\u0002¢\u0006\u0004\b\\\u00102J\u000f\u0010]\u001a\u00020#H\u0002¢\u0006\u0004\b]\u00102J\u0019\u0010_\u001a\u00020#2\b\b\u0002\u0010^\u001a\u00020@H\u0002¢\u0006\u0004\b_\u0010CJ\u0017\u0010a\u001a\u00020#2\u0006\u0010`\u001a\u00020@H\u0002¢\u0006\u0004\ba\u0010CJ\u0017\u0010b\u001a\u00020#2\u0006\u0010.\u001a\u00020\u0003H\u0002¢\u0006\u0004\bb\u00100J\u000f\u0010c\u001a\u00020#H\u0002¢\u0006\u0004\bc\u00102J\u000f\u0010d\u001a\u00020#H\u0002¢\u0006\u0004\bd\u00102R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010gR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010hR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010iR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010iR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010jR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010kR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010lR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010mR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010nR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010oR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010pR\u0014\u0010r\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010u\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010x\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010z\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010yR\u0014\u0010|\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0015\u0010\u007f\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001c\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0017\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b'\u0010\u008a\u0001R\u0019\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b+\u0010\u008b\u0001R\u001b\u0010\u008c\u0001\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008b\u0001R\u001b\u0010\u008d\u0001\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008b\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001c\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001c\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001c\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0019\u0010T\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bT\u0010\u009a\u0001R\u0019\u0010\u009b\u0001\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001b\u0010\u009d\u0001\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001¨\u0006 \u0001"}, d2 = {"Lru/yandex/taxi/web/view/WebViewContainerImpl;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lnwy0;", "Lru/yandex/taxi/web/UiWebViewConfig;", "uiWebViewConfig", "Lhn41;", "presenter", "Landroid/app/Activity;", "activity", "Ltse;", "coroutineScope", "Lh3y;", "Lru/yandex/taxi/fragment/common/b;", "defaultFileChooserHandler", "Lv7j0;", "requestPermissionInteractor", "Lbv41;", "webViewUtils", "Lru/yandex/taxi/deeplinks/f;", "deeplinkUtils", "Lto41;", "errorContainerFactory", "Lms41;", "progressContainerFactory", "Lc2x0;", "systemBarsCoordinator", "Lexu0;", "styleDelegate", "Landroid/view/ContextThemeWrapper;", "themedContext", "<init>", "(Lru/yandex/taxi/web/UiWebViewConfig;Lhn41;Landroid/app/Activity;Ltse;Lh3y;Lh3y;Lbv41;Lru/yandex/taxi/deeplinks/f;Lto41;Lms41;Lc2x0;Lexu0;Landroid/view/ContextThemeWrapper;)V", "(Lru/yandex/taxi/web/UiWebViewConfig;Lhn41;Landroid/app/Activity;Ltse;Lh3y;Lh3y;Lbv41;Lru/yandex/taxi/deeplinks/f;Lto41;Lms41;Lc2x0;Lexu0;)V", "", "enable", "Lzy11;", "setEnableBackNavigation", "(Z)V", "Lem41;", "webViewClientFactory", "setWebViewClientFactory", "(Lem41;)V", "Ljava/lang/Runnable;", "onCloseRequested", "setOnCloseRequested", "(Ljava/lang/Runnable;)V", ConfigConstants.CONFIG, "handleConfig", "(Lru/yandex/taxi/web/UiWebViewConfig;)V", "release", "()V", "goBack", "()Z", "canScrollUp", "", "url", "loadUrl", "(Ljava/lang/String;)V", "baseUrl", Constants.KEY_DATA, "setData", "(Ljava/lang/String;Ljava/lang/String;)V", "onAttachedToWindow", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "applyContentTheme", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Lcu41;", ClidProvider.STATE, "setViewState", "(Lcu41;)V", "updateCurrentState", "reload", "relativePath", "updateUriAndReload", "Lef4;", "backStackChangeListener", "setBackStackChangeListener", "(Lef4;)V", "refreshBackButton", "Landroid/view/View;", "asView", "()Landroid/view/View;", "init", "initErrorView", "initProgressView", "systemTheme", "invalidateTheme", "webViewTheme", "applyContainerTheme", "initToolbarButton", "notifyBackStackHasEntry", "notifyBackStackEmpty", "Lru/yandex/taxi/web/UiWebViewConfig;", "Lhn41;", "Landroid/app/Activity;", "Ltse;", "Lh3y;", "Lbv41;", "Lru/yandex/taxi/deeplinks/f;", "Lto41;", "Lms41;", "Lc2x0;", "Lexu0;", "Landroid/view/ContextThemeWrapper;", "Lru/yandex/taxi/design/ToolbarComponent;", "toolbar", "Lru/yandex/taxi/design/ToolbarComponent;", "Lru/yandex/taxi/web/WebContentView;", "webView", "Lru/yandex/taxi/web/WebContentView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "progressViewContainer", "Lcom/yandex/go/design/view/GoFrameLayout;", "errorViewContainer", "Landroid/widget/TextView;", "infoText", "Landroid/widget/TextView;", "Landroidx/constraintlayout/widget/Group;", "shareViews", "Landroidx/constraintlayout/widget/Group;", "Lru/yandex/taxi/design/ButtonComponent;", "share", "Lru/yandex/taxi/design/ButtonComponent;", "Llj41;", "webProgressViewHolder", "Llj41;", "Lgn41;", "mvpView", "Lgn41;", "Lem41;", "Ljava/lang/Runnable;", "onCloseClickListener", "onNavigationClickListener", "Lmx60;", "onBackPressedCallback", "Lmx60;", "Lru/yandex/taxi/web/view/clients/TaxiWebViewClient;", "taxiWebViewClient", "Lru/yandex/taxi/web/view/clients/TaxiWebViewClient;", "Lru/yandex/taxi/web/view/clients/YaWebChromeClient;", "yaWebChromeClient", "Lru/yandex/taxi/web/view/clients/YaWebChromeClient;", "Lru/yandex/taxi/web/view/listeners/TaxiDownloadListener;", "taxiDownloadListener", "Lru/yandex/taxi/web/view/listeners/TaxiDownloadListener;", "Lef4;", "backNavigationEnabled", "Z", "contentThemeOverride", "Lru/yandex/taxi/theme/ThemeType;", "en41", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WebViewContainerImpl extends ConstraintLayout implements nwy0, vjp0 {
    private final Activity activity;
    private boolean backNavigationEnabled;
    private ef4 backStackChangeListener;
    private ThemeType contentThemeOverride;
    private final tse coroutineScope;
    private final f deeplinkUtils;
    private final h3y defaultFileChooserHandler;
    private final to41 errorContainerFactory;
    private final GoFrameLayout errorViewContainer;
    private final TextView infoText;
    private final gn41 mvpView;
    private final mx60 onBackPressedCallback;
    private Runnable onCloseClickListener;
    private Runnable onCloseRequested;
    private Runnable onNavigationClickListener;
    private final hn41 presenter;
    private final ms41 progressContainerFactory;
    private final GoFrameLayout progressViewContainer;
    private final h3y requestPermissionInteractor;
    private final ButtonComponent share;
    private final Group shareViews;
    private final exu0 styleDelegate;
    private final c2x0 systemBarsCoordinator;
    private TaxiDownloadListener taxiDownloadListener;
    private TaxiWebViewClient taxiWebViewClient;
    private final ContextThemeWrapper themedContext;
    private final ToolbarComponent toolbar;
    private final UiWebViewConfig uiWebViewConfig;
    private lj41 webProgressViewHolder;
    private final WebContentView webView;
    private em41 webViewClientFactory;
    private final bv41 webViewUtils;
    private YaWebChromeClient yaWebChromeClient;

    private WebViewContainerImpl(UiWebViewConfig uiWebViewConfig, hn41 hn41Var, Activity activity, tse tseVar, h3y h3yVar, h3y h3yVar2, bv41 bv41Var, f fVar, to41 to41Var, ms41 ms41Var, c2x0 c2x0Var, exu0 exu0Var, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.uiWebViewConfig = uiWebViewConfig;
        this.presenter = hn41Var;
        this.activity = activity;
        this.coroutineScope = tseVar;
        this.defaultFileChooserHandler = h3yVar;
        this.requestPermissionInteractor = h3yVar2;
        this.webViewUtils = bv41Var;
        this.deeplinkUtils = fVar;
        this.errorContainerFactory = to41Var;
        this.progressContainerFactory = ms41Var;
        this.systemBarsCoordinator = c2x0Var;
        this.styleDelegate = exu0Var;
        this.themedContext = contextThemeWrapper;
        c.q(this, ish0.web_view_container, true);
        int i = jgh0.default_web_view_wrapper_toolbar;
        WeakHashMap weakHashMap = b.a;
        this.toolbar = (ToolbarComponent) ((View) rp31.d(this, i));
        this.webView = (WebContentView) ((View) rp31.d(this, jgh0.default_web_view_wrapper_web_view));
        this.progressViewContainer = (GoFrameLayout) ((View) rp31.d(this, jgh0.progress_view_container));
        this.errorViewContainer = (GoFrameLayout) ((View) rp31.d(this, jgh0.error_view_container));
        this.infoText = (TextView) ((View) rp31.d(this, jgh0.infoText));
        this.shareViews = (Group) ((View) rp31.d(this, jgh0.default_web_view_wrapper_toolbar_share_group));
        this.share = (ButtonComponent) ((View) rp31.d(this, jgh0.default_web_view_wrapper_toolbar_share));
        this.mvpView = new en41(this);
        this.webViewClientFactory = new dcy0();
        this.onBackPressedCallback = new qc(24, this);
        this.backNavigationEnabled = true;
        init();
    }

    private final void applyContainerTheme(ThemeType webViewTheme) {
        Integer backgroundColor = this.uiWebViewConfig.getBackgroundColor();
        setBackgroundColor(backgroundColor != null ? backgroundColor.intValue() : qje.t(xng0.bgMain, getContext()));
        gp41.g(this.webView.getSettings(), webViewTheme);
    }

    private final void init() {
        final int i = 0;
        this.share.setDebounceClickListener(new Runnable(this) { // from class: bn41
            public final /* synthetic */ WebViewContainerImpl b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                WebViewContainerImpl webViewContainerImpl = this.b;
                switch (i2) {
                    case 0:
                        WebViewContainerImpl.init$lambda$0(webViewContainerImpl);
                        break;
                    case 1:
                        WebViewContainerImpl.init$lambda$1(webViewContainerImpl);
                        break;
                    default:
                        WebViewContainerImpl.init$lambda$2(webViewContainerImpl);
                        break;
                }
            }
        });
        final int i2 = 2;
        ngd0.n(this.infoText, null, 0).d(12.0f, 2);
        final int i3 = 1;
        this.onCloseClickListener = new Runnable(this) { // from class: bn41
            public final /* synthetic */ WebViewContainerImpl b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i3;
                WebViewContainerImpl webViewContainerImpl = this.b;
                switch (i22) {
                    case 0:
                        WebViewContainerImpl.init$lambda$0(webViewContainerImpl);
                        break;
                    case 1:
                        WebViewContainerImpl.init$lambda$1(webViewContainerImpl);
                        break;
                    default:
                        WebViewContainerImpl.init$lambda$2(webViewContainerImpl);
                        break;
                }
            }
        };
        this.onNavigationClickListener = new Runnable(this) { // from class: bn41
            public final /* synthetic */ WebViewContainerImpl b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                WebViewContainerImpl webViewContainerImpl = this.b;
                switch (i22) {
                    case 0:
                        WebViewContainerImpl.init$lambda$0(webViewContainerImpl);
                        break;
                    case 1:
                        WebViewContainerImpl.init$lambda$1(webViewContainerImpl);
                        break;
                    default:
                        WebViewContainerImpl.init$lambda$2(webViewContainerImpl);
                        break;
                }
            }
        };
        initProgressView();
        initErrorView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(WebViewContainerImpl webViewContainerImpl) {
        hn41 hn41Var = webViewContainerImpl.presenter;
        String str = hn41Var.F;
        String url = (str == null || str.length() == 0) ? hn41Var.H.getCoreConfig().getUrl() : hn41Var.F;
        if (url == null) {
            url = "";
        }
        int i = kyh0.receipt_share_title;
        Activity activity = webViewContainerImpl.activity;
        q5z.c0(url, activity.getString(i), activity, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1(WebViewContainerImpl webViewContainerImpl) {
        hn41 hn41Var = webViewContainerImpl.presenter;
        boolean l = jl40.l(hn41Var.I, cu41.d);
        h3y h3yVar = hn41Var.B;
        if (l) {
            ((dp41) h3yVar.get()).a();
        } else {
            ((dp41) h3yVar.get()).d();
        }
        Runnable runnable = webViewContainerImpl.onCloseRequested;
        if (runnable != null) {
            runnable.run();
        }
        hn41 hn41Var2 = webViewContainerImpl.presenter;
        String url = hn41Var2.H.getCoreConfig().getUrl();
        if (url != null) {
            hn41Var2.Ng(url, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$2(WebViewContainerImpl webViewContainerImpl) {
        ((dp41) webViewContainerImpl.presenter.B.get()).e();
        webViewContainerImpl.goBack();
    }

    private final void initErrorView() {
        this.errorViewContainer.setClickable(true);
        to41 to41Var = this.errorContainerFactory;
        Context context = getContext();
        jy31 jy31Var = new jy31(4, this.presenter);
        Runnable runnable = this.onCloseClickListener;
        if (runnable == null) {
            runnable = new hos0(10);
        }
        View a = to41Var.a(context, jy31Var, runnable);
        a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.errorViewContainer.addView(a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initErrorView$lambda$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initErrorView$reloadAfterError(hn41 hn41Var) {
        ((dp41) hn41Var.B.get()).c();
        hn41Var.Og(cu41.b);
        ((gn41) hn41Var.Dg()).refresh();
    }

    private final void initProgressView() {
        lj41 create = this.progressContainerFactory.create(getContext());
        this.webProgressViewHolder = create;
        FrameLayout.LayoutParams layoutParams = create.getLayoutType() == WebProgressViewHolder$LayoutType.WRAP_CONTENT ? new FrameLayout.LayoutParams(-2, -2) : new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        View view = create.getView();
        view.setLayoutParams(layoutParams);
        view.setVisibility(8);
        this.progressViewContainer.addView(view);
        this.progressViewContainer.setVisibility(0);
    }

    private final void initToolbarButton(UiWebViewConfig config) {
        boolean shouldShowToolbar = config.getShouldShowToolbar();
        ToolbarComponent toolbarComponent = this.toolbar;
        if (!shouldShowToolbar) {
            toolbarComponent.setVisibility(8);
            return;
        }
        toolbarComponent.setTitleAlignment(config.getTitleHorizontalAlignment());
        if (config.getIsBackStackAware()) {
            this.toolbar.enableNavigationButton();
            this.toolbar.setOnNavigationClickListener(this.onCloseClickListener);
            return;
        }
        boolean shouldShowCloseButton = config.getShouldShowCloseButton();
        ToolbarComponent toolbarComponent2 = this.toolbar;
        if (!shouldShowCloseButton) {
            toolbarComponent2.enableNavigationButton();
            this.toolbar.setOnNavigationClickListener(this.onNavigationClickListener);
        } else {
            toolbarComponent2.enableCloseButton(config.getCloseButtonPosition());
            this.toolbar.setOnCloseClickListener(this.onCloseClickListener);
            this.toolbar.disableNavigationButton();
        }
    }

    private final void invalidateTheme(ThemeType systemTheme) {
        Object value;
        ArrayList arrayList;
        ThemeType themeType = this.contentThemeOverride;
        if (themeType == null) {
            themeType = systemTheme;
        }
        this.themedContext.setTheme(this.styleDelegate.a(themeType).b);
        applyContainerTheme(systemTheme);
        ThemeType themeType2 = this.contentThemeOverride;
        c2x0 c2x0Var = this.systemBarsCoordinator;
        if (themeType2 != null) {
            ((d2x0) c2x0Var).b.d(this, true, Boolean.valueOf(themeType.f()));
            return;
        }
        r0 r0Var = ((d2x0) c2x0Var).b.b;
        do {
            value = r0Var.getValue();
            arrayList = new ArrayList((List) value);
            int f = scc.f(arrayList);
            while (true) {
                if (-1 >= f) {
                    break;
                }
                if (jl40.l(((h2x0) arrayList.get(f)).a, this)) {
                    arrayList.remove(f);
                    break;
                }
                f--;
            }
        } while (!r0Var.k(value, arrayList));
    }

    public static /* synthetic */ void invalidateTheme$default(WebViewContainerImpl webViewContainerImpl, ThemeType themeType, int i, Object obj) {
        if ((i & 1) != 0) {
            themeType = qje.X(webViewContainerImpl.activity);
        }
        webViewContainerImpl.invalidateTheme(themeType);
    }

    private final void notifyBackStackEmpty() {
        ef4 ef4Var = this.backStackChangeListener;
        if (ef4Var != null) {
            ((BackButtonIconComponent) ((aj31) ef4Var).b).setIcon(dzg0.ic_cross_close);
        }
    }

    private final void notifyBackStackHasEntry() {
        ef4 ef4Var = this.backStackChangeListener;
        if (ef4Var != null) {
            ((BackButtonIconComponent) ((aj31) ef4Var).b).setIcon(dzg0.ic_arrow_back_24dp);
        }
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    public final void applyContentTheme(ThemeType theme) {
        if (!isAttachedToWindow() || theme == this.contentThemeOverride) {
            return;
        }
        this.contentThemeOverride = theme;
        invalidateTheme$default(this, null, 1, null);
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        invalidateTheme(themeType);
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public View asView() {
        return this;
    }

    @Override // defpackage.vjp0
    public boolean canScrollUp() {
        return this.webView.canScrollUp();
    }

    public final boolean goBack() {
        if (this.webView.canGoBack() && this.backNavigationEnabled) {
            this.webView.goBack();
            return true;
        }
        Runnable runnable = this.onCloseRequested;
        if (runnable != null) {
            runnable.run();
        }
        hn41 hn41Var = this.presenter;
        String url = hn41Var.H.getCoreConfig().getUrl();
        if (url == null) {
            return false;
        }
        hn41Var.Ng(url, "");
        return false;
    }

    public final void handleConfig(UiWebViewConfig config) {
        CoreWebViewConfig coreConfig = config.getCoreConfig();
        tse tseVar = this.coroutineScope;
        boolean delayedSpinner = coreConfig.getDelayedSpinner();
        lj41 lj41Var = this.webProgressViewHolder;
        if (lj41Var == null) {
            ny61.r("Required value was null.");
            return;
        }
        YaWebChromeClient yaWebChromeClient = new YaWebChromeClient(tseVar, delayedSpinner, lj41Var);
        this.yaWebChromeClient = yaWebChromeClient;
        hn41 hn41Var = this.presenter;
        hn41Var.getClass();
        yaWebChromeClient.setListener(new ji41(1, hn41Var));
        TaxiWebViewClient a = this.webViewClientFactory.a(coreConfig.getIgnoreSslError(), coreConfig.getUseIntentForNonHttpUrls(), this.deeplinkUtils, coreConfig.getJsScripts());
        this.taxiWebViewClient = a;
        if (a != null) {
            a.setActivity(this.activity);
        }
        TaxiWebViewClient taxiWebViewClient = this.taxiWebViewClient;
        if (taxiWebViewClient != null) {
            hn41 hn41Var2 = this.presenter;
            hn41Var2.getClass();
            taxiWebViewClient.setHelper(new aj31(9, hn41Var2));
        }
        TaxiWebViewClient taxiWebViewClient2 = this.taxiWebViewClient;
        if (taxiWebViewClient2 != null) {
            hn41 hn41Var3 = this.presenter;
            hn41Var3.getClass();
            taxiWebViewClient2.setListener(new eg01(hn41Var3));
        }
        this.webView.init(coreConfig, this.webViewUtils);
        WebContentView webContentView = this.webView;
        TaxiWebViewClient taxiWebViewClient3 = this.taxiWebViewClient;
        if (taxiWebViewClient3 == null) {
            ny61.r("Required value was null.");
            return;
        }
        webContentView.setWebViewClient(taxiWebViewClient3);
        this.webView.setWebChromeClient(this.yaWebChromeClient);
        YaWebChromeClient yaWebChromeClient2 = this.yaWebChromeClient;
        if (yaWebChromeClient2 != null) {
            yaWebChromeClient2.setFileChooserHandler((ru.yandex.taxi.fragment.common.a) this.defaultFileChooserHandler.get());
        }
        YaWebChromeClient yaWebChromeClient3 = this.yaWebChromeClient;
        if (yaWebChromeClient3 != null) {
            yaWebChromeClient3.setRequestPermissionInteractor((v7j0) this.requestPermissionInteractor.get());
        }
        TaxiDownloadListener taxiDownloadListener = new TaxiDownloadListener(this.activity);
        this.taxiDownloadListener = taxiDownloadListener;
        this.webView.setDownloadListener(taxiDownloadListener);
        initToolbarButton(config);
        hn41 hn41Var4 = this.presenter;
        if (!hn41Var4.Eg()) {
            ny61.g("Failed requirement.");
            return;
        }
        hn41Var4.H = config;
        String title = config.getTitle();
        if (title == null) {
            title = "";
        }
        hn41Var4.E = title;
        hn41Var4.G = hn41Var4.H.getCoreConfig().getTargetHost();
        String unsupportedText = hn41Var4.H.getUnsupportedText();
        String url = hn41Var4.H.getCoreConfig().getUrl();
        if (unsupportedText != null && unsupportedText.length() != 0) {
            hn41Var4.Og(new bu41(unsupportedText));
            return;
        }
        if (url == null || url.length() == 0) {
            return;
        }
        if (!hn41Var4.H.getShouldUseCached()) {
            hn41Var4.Lg(url);
            return;
        }
        hn41Var4.Og(cu41.b);
        ru.yandex.taxi.controller.b a2 = ((am41) hn41Var4.z.get()).a(url);
        CoreWebViewConfig coreConfig2 = hn41Var4.H.getCoreConfig();
        pzt0 pzt0Var = hn41Var4.J;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        hn41Var4.J = tje.N(hn41Var4.Jg(), null, null, new WebViewContainerPresenter$loadUrlWithCache$1(a2, coreConfig2.shouldUseAuthorizationHeader() ? coreConfig2.getToken(null) : null, hn41Var4, url, null), 3);
    }

    public final void loadUrl(String url) {
        hn41 hn41Var = this.presenter;
        if (hn41Var.H.getCoreConfig().containsUrl()) {
            jst.e.getClass();
            return;
        }
        hn41Var.H.withUrl(url);
        ((gn41) hn41Var.Dg()).clearHistory();
        hn41Var.Lg(url);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.Bg(this.mvpView);
        handleConfig(this.uiWebViewConfig);
        tje.a0(this.activity, this.onBackPressedCallback);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        release();
        this.onBackPressedCallback.g();
        applyContentTheme(null);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(heightMeasureSpec);
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        if (mode == Integer.MIN_VALUE || (mode == 0 && size > 0)) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public final void refreshBackButton() {
        if (this.uiWebViewConfig.getIsBackStackAware()) {
            if (this.webView.canGoBack() && this.backNavigationEnabled) {
                notifyBackStackHasEntry();
                this.toolbar.setOnNavigationClickListener(this.onNavigationClickListener);
            } else {
                notifyBackStackEmpty();
                this.toolbar.setOnNavigationClickListener(this.onCloseClickListener);
            }
        }
    }

    public final void release() {
        this.onCloseRequested = null;
        this.onCloseClickListener = null;
        this.onNavigationClickListener = null;
        this.webView.stopLoading();
        this.webView.setWebViewClient(new WebViewClient());
        this.webView.setWebChromeClient(null);
        YaWebChromeClient yaWebChromeClient = this.yaWebChromeClient;
        if (yaWebChromeClient != null) {
            if (yaWebChromeClient != null) {
                yaWebChromeClient.release();
            }
            this.yaWebChromeClient = null;
        }
        TaxiWebViewClient taxiWebViewClient = this.taxiWebViewClient;
        if (taxiWebViewClient != null) {
            if (taxiWebViewClient != null) {
                taxiWebViewClient.release();
            }
            this.taxiWebViewClient = null;
        }
        TaxiDownloadListener taxiDownloadListener = this.taxiDownloadListener;
        if (taxiDownloadListener != null) {
            if (taxiDownloadListener != null) {
                taxiDownloadListener.release();
            }
            this.taxiDownloadListener = null;
        }
    }

    public final void reload() {
        this.mvpView.refresh();
    }

    public final void setBackStackChangeListener(ef4 backStackChangeListener) {
        this.backStackChangeListener = backStackChangeListener;
    }

    public final void setData(String baseUrl, String data) {
        hn41 hn41Var = this.presenter;
        if (hn41Var.H.getCoreConfig().containsUrl()) {
            jst.e.getClass();
            return;
        }
        hn41Var.Og(cu41.b);
        if (data == null) {
            data = "";
        }
        hn41Var.Ng(baseUrl, data);
    }

    public final void setEnableBackNavigation(boolean enable) {
        this.backNavigationEnabled = enable;
        refreshBackButton();
    }

    public final void setOnCloseRequested(Runnable onCloseRequested) {
        this.onCloseRequested = onCloseRequested;
    }

    public final void setViewState(cu41 state) {
        YaWebChromeClient yaWebChromeClient;
        this.webView.setVisibility(4);
        lj41 lj41Var = this.webProgressViewHolder;
        int i = 0;
        if (lj41Var != null) {
            lj41Var.setVisible(false);
        }
        this.errorViewContainer.setVisibility(8);
        this.infoText.setVisibility(8);
        if (state.a == WebViewState$State.LOADING && (yaWebChromeClient = this.yaWebChromeClient) != null) {
            yaWebChromeClient.showLoading();
        }
        WebViewState$State webViewState$State = state.a;
        if (webViewState$State == WebViewState$State.LOADED) {
            this.webView.setVisibility(0);
        } else if (webViewState$State == WebViewState$State.ERROR) {
            this.errorViewContainer.setVisibility(0);
        } else if (webViewState$State == WebViewState$State.UNSUPPORTED) {
            this.infoText.setVisibility(0);
            this.infoText.setText(((bu41) state).e);
        }
        this.toolbar.setTitle(this.presenter.E);
        b.q(this.toolbar, true);
        Group group = this.shareViews;
        hn41 hn41Var = this.presenter;
        String str = hn41Var.F;
        if ((str == null || str.length() == 0) && !hn41Var.H.getShouldShowShareButton()) {
            i = 8;
        }
        group.setVisibility(i);
    }

    public final void setWebViewClientFactory(em41 webViewClientFactory) {
        this.webViewClientFactory = webViewClientFactory;
    }

    public final void updateCurrentState(cu41 state) {
        this.presenter.Og(state);
    }

    public final void updateUriAndReload(String relativePath) {
        String url = this.webView.getUrl();
        if (url == null) {
            return;
        }
        Set set = og21.a;
        Uri.Builder buildUpon = Uri.parse(url).buildUpon();
        Uri parse = Uri.parse(relativePath);
        String encodedPath = parse.getEncodedPath();
        if (encodedPath != null && encodedPath.length() != 0) {
            String encodedPath2 = buildUpon.build().getEncodedPath();
            if (encodedPath2 != null) {
                String concat = cvu0.x(encodedPath, "/", false) ? encodedPath : "/".concat(encodedPath);
                if (!cvu0.x(encodedPath2, "/", false)) {
                    encodedPath2 = "/".concat(encodedPath2);
                }
                if (!cvu0.x(concat, encodedPath2, false)) {
                    Iterator<String> it = parse.getPathSegments().iterator();
                    while (it.hasNext()) {
                        buildUpon.appendEncodedPath(it.next());
                    }
                }
            }
            buildUpon.encodedPath(encodedPath);
        }
        for (String str : parse.getQueryParameterNames()) {
            buildUpon.appendQueryParameter(str, parse.getQueryParameter(str));
        }
        String uri = buildUpon.build().toString();
        this.mvpView.clearHistory();
        this.mvpView.loadUrl(uri);
    }

    public WebViewContainerImpl(UiWebViewConfig uiWebViewConfig, hn41 hn41Var, Activity activity, tse tseVar, h3y h3yVar, h3y h3yVar2, bv41 bv41Var, f fVar, to41 to41Var, ms41 ms41Var, c2x0 c2x0Var, exu0 exu0Var) {
        this(uiWebViewConfig, hn41Var, activity, tseVar, h3yVar, h3yVar2, bv41Var, fVar, to41Var, ms41Var, c2x0Var, exu0Var, new ContextThemeWrapper(activity, exu0Var.a(qje.X(activity)).b));
    }
}
