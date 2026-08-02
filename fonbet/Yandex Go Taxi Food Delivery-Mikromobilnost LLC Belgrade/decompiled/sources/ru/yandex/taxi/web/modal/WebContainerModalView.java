package ru.yandex.taxi.web.modal;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.aj31;
import defpackage.c230;
import defpackage.ce0;
import defpackage.cu41;
import defpackage.d230;
import defpackage.e230;
import defpackage.fg41;
import defpackage.lh2;
import defpackage.o430;
import defpackage.o501;
import defpackage.qdb1;
import defpackage.qf41;
import defpackage.sf41;
import defpackage.sls;
import defpackage.tf41;
import defpackage.tje;
import defpackage.uf41;
import defpackage.uqs;
import defpackage.w511;
import defpackage.y130;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.web.modal.WebContainerModalView;
import ru.yandex.taxi.web.view.WebViewContainerImpl;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001HB-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u0017J\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0011H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0013H\u0002¢\u0006\u0004\b&\u0010\u0017J\u0017\u0010)\u001a\u00020\u00132\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0013H\u0002¢\u0006\u0004\b+\u0010\u0017J\u000f\u0010,\u001a\u00020\u0013H\u0002¢\u0006\u0004\b,\u0010\u0017J\u0017\u0010/\u001a\u00020\u00132\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u0019\u00103\u001a\u00020\u00132\b\u00102\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0004\b3\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00105R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00107R\u0014\u00108\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u0004\u0018\u00010:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020-8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020-8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bF\u0010D¨\u0006I"}, d2 = {"Lru/yandex/taxi/web/modal/WebContainerModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Lru/yandex/taxi/web/UiWebViewConfig;", ConfigConstants.CONFIG, "Lru/yandex/taxi/web/view/WebViewContainerImpl;", "webViewContainer", "Luf41;", "closeListener", "Lfg41;", "webContainerPresenter", "<init>", "(Lru/yandex/taxi/web/UiWebViewConfig;Lru/yandex/taxi/web/view/WebViewContainerImpl;Luf41;Lfg41;)V", "Le230;", "insetsType", "()Le230;", "Lru/yandex/taxi/widget/SlideableModalView$CardMode;", "cardMode", "", "fromInit", "Lzy11;", "setCardMode", "(Lru/yandex/taxi/widget/SlideableModalView$CardMode;Z)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "dismiss", "isArrowsPermanentlyHidden", "()Z", "applyFloatingButtonMode", "reloadConfig", "(Lru/yandex/taxi/web/UiWebViewConfig;)V", "Lcu41;", ClidProvider.STATE, "updateCurrentState", "(Lcu41;)V", "enable", "setEnableBackNavigation", "(Z)V", "reload", "", "relativePath", "updateUriAndReload", "(Ljava/lang/String;)V", "disableSwipe", "enableSwipe", "", "height", "updateHeight", "(I)V", "Lru/yandex/taxi/theme/ThemeType;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "setContentTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lru/yandex/taxi/web/view/WebViewContainerImpl;", "Luf41;", "Lfg41;", "isArrowHidden", "Z", "", "modalCornerRadius", "Ljava/lang/Float;", "Lru/yandex/taxi/web/UiWebViewConfig$ModalViewMode;", "modalViewMode", "Lru/yandex/taxi/web/UiWebViewConfig$ModalViewMode;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "closeButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "getCornerRadius", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "sf41", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WebContainerModalView extends SlideableModalView {
    private FloatButtonIconComponent closeButton;
    private uf41 closeListener;
    private final boolean isArrowHidden;
    private final Float modalCornerRadius;
    private final UiWebViewConfig.ModalViewMode modalViewMode;
    private final fg41 webContainerPresenter;
    private final WebViewContainerImpl webViewContainer;

    public WebContainerModalView(UiWebViewConfig uiWebViewConfig, WebViewContainerImpl webViewContainerImpl, uf41 uf41Var, fg41 fg41Var) {
        super(webViewContainerImpl, (Integer) null);
        this.webViewContainer = webViewContainerImpl;
        this.closeListener = uf41Var;
        this.webContainerPresenter = fg41Var;
        this.isArrowHidden = uiWebViewConfig.getIsArrowHidden();
        this.modalCornerRadius = uiWebViewConfig.getModalViewCornerRadius();
        UiWebViewConfig.ModalViewMode modalViewMode = uiWebViewConfig.getModalViewMode();
        this.modalViewMode = modalViewMode;
        if (modalViewMode instanceof UiWebViewConfig.Slideable) {
            UiWebViewConfig.Slideable slideable = (UiWebViewConfig.Slideable) modalViewMode;
            if (slideable.getUseFloatingButtonForNavigation()) {
                applyFloatingButtonMode();
            }
            if (slideable.getAnchorHeight() != null) {
                updateHeight(slideable.getAnchorHeight().intValue());
            }
            setCardMode(slideable.getFixed() ? SlideableModalView.CardMode.FIXED_CARD : SlideableModalView.CardMode.SLIDEABLE_CARD);
        } else if (modalViewMode instanceof UiWebViewConfig.Fullscreen) {
            setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        }
        setAnimateOnAppearing(uiWebViewConfig.getAnimateOnAppearing());
        setAnimateOnDismissing(uiWebViewConfig.getAnimateOnDisappearing());
        webViewContainerImpl.setOnCloseRequested(new qf41(this, 1));
        getBottomSheetBehavior().a0 = uiWebViewConfig.getCanDrag();
        getBottomSheetBehavior().e0 = uiWebViewConfig.getConsiderSwipesHorizontalVelocity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(WebContainerModalView webContainerModalView) {
        WebViewContainerImpl webViewContainerImpl = webContainerModalView.webViewContainer;
        if (webViewContainerImpl != null) {
            webViewContainerImpl.post(new ce0(webViewContainerImpl, 15));
        }
        webContainerModalView.dismiss();
    }

    private final void applyFloatingButtonMode() {
        BackButtonIconComponent b = qdb1.b(this, new qf41(this, 0));
        this.closeButton = b;
        this.webViewContainer.setBackStackChangeListener(new aj31(6, b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyFloatingButtonMode$lambda$0(WebContainerModalView webContainerModalView) {
        webContainerModalView.webViewContainer.goBack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disableSwipe() {
        getBottomSheetBehavior().a0 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enableSwipe() {
        getBottomSheetBehavior().a0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reload() {
        this.webViewContainer.reload();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reloadConfig(UiWebViewConfig config) {
        this.webViewContainer.handleConfig(config);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setContentTheme(ThemeType theme) {
        this.webViewContainer.applyContentTheme(theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setEnableBackNavigation(boolean enable) {
        this.webViewContainer.setEnableBackNavigation(enable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCurrentState(cu41 state) {
        this.webViewContainer.updateCurrentState(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateHeight(int height) {
        ViewGroup.LayoutParams layoutParams = this.webViewContainer.getLayoutParams();
        layoutParams.height = height;
        this.webViewContainer.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateUriAndReload(String relativePath) {
        this.webViewContainer.updateUriAndReload(relativePath);
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public void dismiss() {
        uf41 uf41Var = this.closeListener;
        if (uf41Var != null) {
            uf41Var.onClose();
        }
        this.closeListener = null;
        super.dismiss();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        throw new IllegalStateException("It have not to be called");
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCornersRadius() {
        Float f = this.modalCornerRadius;
        return f != null ? (int) c.i(f.floatValue(), this.webViewContainer) : super.getCornersRadius();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        final int i = 1;
        if (get_cardMode() == SlideableModalView.CardMode.FULLSCREEN) {
            final int i2 = 0;
            return new y130(112, new sls(this) { // from class: rf41
                public final /* synthetic */ WebContainerModalView b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    View view;
                    View view2;
                    int i3 = i2;
                    WebContainerModalView webContainerModalView = this.b;
                    switch (i3) {
                        case 0:
                            view = webContainerModalView.webViewContainer;
                            return view;
                        default:
                            view2 = webContainerModalView.webViewContainer;
                            return view2;
                    }
                }
            }, true);
        }
        UiWebViewConfig.ModalViewMode modalViewMode = this.modalViewMode;
        return ((modalViewMode instanceof UiWebViewConfig.Slideable) && ((UiWebViewConfig.Slideable) modalViewMode).getStatusBarOnly()) ? new d230(48) : new c230(112, new sls(this) { // from class: rf41
            public final /* synthetic */ WebContainerModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                View view;
                View view2;
                int i3 = i;
                WebContainerModalView webContainerModalView = this.b;
                switch (i3) {
                    case 0:
                        view = webContainerModalView.webViewContainer;
                        return view;
                    default:
                        view2 = webContainerModalView.webViewContainer;
                        return view2;
                }
            }
        }, true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden, reason: from getter */
    public boolean getWithCloseButton() {
        return this.isArrowHidden;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        fg41 fg41Var = this.webContainerPresenter;
        sf41 sf41Var = new sf41(this);
        fg41Var.Bg(sf41Var);
        tje.N(fg41Var.Jg(), null, null, new WebContainerPresenter$attachView$$inlined$collectIn$1(fg41Var.x.getEvents(), null, sf41Var), 3);
        FloatButtonIconComponent floatButtonIconComponent = this.closeButton;
        if (floatButtonIconComponent != null) {
            OneShotPreDrawListener.add(this.webViewContainer, new uqs(17, this, floatButtonIconComponent));
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.webContainerPresenter.Cg();
        super.onDetachedFromWindow();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void setCardMode(SlideableModalView.CardMode cardMode, boolean fromInit) {
        super.setCardMode(cardMode, fromInit);
        int i = tf41.a[cardMode.ordinal()];
        if (i == 1 || i == 2) {
            setAnimationDelegate(o430.b);
        } else if (i != 3) {
            w511.b();
        } else {
            lh2 lh2Var = lh2.c;
            setAnimationDelegate(lh2.c);
        }
    }

    public WebContainerModalView(UiWebViewConfig uiWebViewConfig, WebViewContainerImpl webViewContainerImpl, uf41 uf41Var) {
        this(uiWebViewConfig, webViewContainerImpl, uf41Var, null, 8, null);
    }

    public /* synthetic */ WebContainerModalView(UiWebViewConfig uiWebViewConfig, WebViewContainerImpl webViewContainerImpl, uf41 uf41Var, fg41 fg41Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uiWebViewConfig, webViewContainerImpl, uf41Var, (i & 8) != 0 ? new fg41(o501.w) : fg41Var);
    }
}
