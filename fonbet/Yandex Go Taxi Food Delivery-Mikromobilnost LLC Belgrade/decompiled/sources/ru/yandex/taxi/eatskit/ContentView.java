package ru.yandex.taxi.eatskit;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.external_service.view.ExternalServiceModalView;
import defpackage.aje;
import defpackage.bcn;
import defpackage.bje;
import defpackage.ce0;
import defpackage.cje;
import defpackage.cma1;
import defpackage.cst0;
import defpackage.cvq0;
import defpackage.dna;
import defpackage.gzg0;
import defpackage.h3c0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.lyc;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.qje;
import defpackage.rdh0;
import defpackage.rm;
import defpackage.rme;
import defpackage.sls;
import defpackage.vng;
import defpackage.vph0;
import defpackage.w511;
import defpackage.xen;
import defpackage.xng0;
import defpackage.z3c0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.eatskit.ContentView;
import ru.yandex.taxi.eatskit.dto.ServiceHeaderMode;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001DB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJC\u0010\u0015\u001a\u00020\u00142\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J'\u0010'\u001a\u00020\u00142\u0006\u0010$\u001a\u00020#2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(R*\u0010)\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\"R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001d\u00106\u001a\u0004\u0018\u0001018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010\u000e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010:R\u001a\u0010<\u001a\u00020;8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R$\u0010@\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR$\u0010E\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020\u00018DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR$\u0010R\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010U\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010O\"\u0004\bT\u0010QR$\u0010X\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010O\"\u0004\bW\u0010QR$\u0010]\u001a\u00020%2\u0006\u0010 \u001a\u00020%8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R(\u0010c\u001a\u0004\u0018\u00010^2\b\u0010 \u001a\u0004\u0018\u00010^8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u0015\u0010g\u001a\u00020d8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0015\u0010i\u001a\u00020\u00018Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u0010LR\u0015\u0010k\u001a\u00020d8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010fR\u0015\u0010o\u001a\u00020l8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0015\u0010q\u001a\u00020l8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010nR\u0015\u0010s\u001a\u00020l8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\br\u0010nR\u0015\u0010u\u001a\u00020l8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bt\u0010nR\u0015\u0010w\u001a\u00020l8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bv\u0010nR\u0015\u0010y\u001a\u00020l8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bx\u0010nR\u0015\u0010{\u001a\u00020\u00018Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bz\u0010LR\u0015\u0010\u007f\u001a\u00020|8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0017\u0010\u0081\u0001\u001a\u00020|8Â\u0002X\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010~R\u0019\u0010\u0085\u0001\u001a\u00030\u0082\u00018Â\u0002X\u0082\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0017\u0010\u0087\u0001\u001a\u00020l8Â\u0002X\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010nR\u001e\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0088\u0001*\u00020\u001b8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001¨\u0006\u008c\u0001"}, d2 = {"Lru/yandex/taxi/eatskit/ContentView;", "Landroid/widget/FrameLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lrme;", "controller", "logoId", "logoColorId", "Lcvq0;", "serviceConfig", "Lkotlin/Function0;", "Lcst0;", "inflateSplashView", "Lzy11;", "init", "(Lrme;IILcvq0;Lsls;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lru/yandex/taxi/eatskit/Controller$State;", ClidProvider.STATE, "updateState", "(Lru/yandex/taxi/eatskit/Controller$State;)V", "", "value", "setIsOpen", "(Z)V", "Lru/yandex/taxi/eatskit/dto/ServiceHeaderMode;", "serviceHeaderMode", "", "serviceName", "setUpServiceHeader", "(Lru/yandex/taxi/eatskit/dto/ServiceHeaderMode;ILjava/lang/CharSequence;)V", "hasSwipeArea", "Z", "getHasSwipeArea", "()Z", "setHasSwipeArea$eatskit", "Lbcn;", "binding", "Lbcn;", "Lru/yandex/taxi/widget/ShimmeringFrameLayout;", "shimmeringLayout$delegate", "Li3y;", "getShimmeringLayout", "()Lru/yandex/taxi/widget/ShimmeringFrameLayout;", "shimmeringLayout", "Lrme;", "splashView", "Lcst0;", CA20Status.STATUS_USER_I, "Lh3c0;", "placeHolderFactory", "Lh3c0;", "getPlaceHolderFactory", "()Lh3c0;", "currentState", "Lru/yandex/taxi/eatskit/Controller$State;", "getCurrentState", "()Lru/yandex/taxi/eatskit/Controller$State;", "Lbje;", "currentStateChangeListener", "Lbje;", "getCurrentStateChangeListener", "()Lbje;", "setCurrentStateChangeListener", "(Lbje;)V", "getServicePlaceholderView", "()Landroid/widget/FrameLayout;", "servicePlaceholderView", "getBuildInLogoVisibility", "()I", "setBuildInLogoVisibility", "(I)V", "buildInLogoVisibility", "getErrorHideButtonVisibility", "setErrorHideButtonVisibility", "errorHideButtonVisibility", "getAuthErrorHideButtonVisibility", "setAuthErrorHideButtonVisibility", "authErrorHideButtonVisibility", "getErrorMessage$eatskit", "()Ljava/lang/CharSequence;", "setErrorMessage$eatskit", "(Ljava/lang/CharSequence;)V", ErrorResponseData.JSON_ERROR_MESSAGE, "Landroid/graphics/drawable/Drawable;", "getServiceLogo", "()Landroid/graphics/drawable/Drawable;", "setServiceLogo", "(Landroid/graphics/drawable/Drawable;)V", "serviceLogo", "Lru/yandex/taxi/design/ButtonComponent;", "getErrorHideButton", "()Lru/yandex/taxi/design/ButtonComponent;", "errorHideButton", "getErrorLayout", "errorLayout", "getErrorReloadButton", "errorReloadButton", "Landroidx/appcompat/widget/AppCompatTextView;", "getErrorTitleView", "()Landroidx/appcompat/widget/AppCompatTextView;", "errorTitleView", "getErrorSubtitleView", "errorSubtitleView", "getAuthButton", "authButton", "getAuthHideButton", "authHideButton", "getAuthTitleView", "authTitleView", "getAuthSubtitleView", "authSubtitleView", "getNoAuthLayout", "noAuthLayout", "Lcom/yandex/go/design/view/GoImageView;", "getServiceLogoView", "()Lcom/yandex/go/design/view/GoImageView;", "serviceLogoView", "getServiceCloseButton", "serviceCloseButton", "Lcom/yandex/go/design/view/GoLinearLayout;", "getServiceLogoContainer", "()Lcom/yandex/go/design/view/GoLinearLayout;", "serviceLogoContainer", "getServiceNameView", "serviceNameView", "Landroid/view/View;", "getView", "(Lru/yandex/taxi/eatskit/Controller$State;)Landroid/view/View;", "view", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ContentView extends FrameLayout implements nwy0 {
    private final bcn binding;
    private rme controller;
    private Controller$State currentState;
    private bje currentStateChangeListener;
    private boolean hasSwipeArea;
    private int logoColorId;
    private final h3c0 placeHolderFactory;

    /* renamed from: shimmeringLayout$delegate, reason: from kotlin metadata */
    private final i3y shimmeringLayout;
    private cst0 splashView;

    public ContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        LayoutInflater.from(context).inflate(vph0.eats_content_view, this);
        int i2 = rdh0.error_layout;
        View O = cma1.O(i2, this);
        if (O != null) {
            int i3 = rdh0.error_hide;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i3, O);
            if (buttonComponent != null) {
                FrameLayout frameLayout = (FrameLayout) O;
                i3 = rdh0.error_reload;
                ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i3, O);
                if (buttonComponent2 != null) {
                    i3 = rdh0.error_subtitle;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i3, O);
                    if (appCompatTextView != null) {
                        i3 = rdh0.error_title;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) cma1.O(i3, O);
                        if (appCompatTextView2 != null) {
                            rm rmVar = new rm(frameLayout, buttonComponent, frameLayout, buttonComponent2, appCompatTextView, appCompatTextView2, 1);
                            i2 = rdh0.no_auth_layout;
                            View O2 = cma1.O(i2, this);
                            if (O2 != null) {
                                int i4 = rdh0.auth;
                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) cma1.O(i4, O2);
                                if (appCompatTextView3 != null) {
                                    i4 = rdh0.auth_hide;
                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) cma1.O(i4, O2);
                                    if (appCompatTextView4 != null) {
                                        i4 = rdh0.auth_subtitle;
                                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) cma1.O(i4, O2);
                                        if (appCompatTextView5 != null) {
                                            i4 = rdh0.auth_title;
                                            AppCompatTextView appCompatTextView6 = (AppCompatTextView) cma1.O(i4, O2);
                                            if (appCompatTextView6 != null) {
                                                FrameLayout frameLayout2 = (FrameLayout) O2;
                                                rm rmVar2 = new rm(frameLayout2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, frameLayout2, 2);
                                                i2 = rdh0.service_logo_container;
                                                View O3 = cma1.O(i2, this);
                                                if (O3 != null) {
                                                    dna o = dna.o(O3);
                                                    int i5 = rdh0.service_placeholder;
                                                    FrameLayout frameLayout3 = (FrameLayout) cma1.O(i5, this);
                                                    if (frameLayout3 == null) {
                                                        str = "Missing required view with ID: ";
                                                        i2 = i5;
                                                        ny61.t(str.concat(getResources().getResourceName(i2)));
                                                        throw null;
                                                    }
                                                    this.binding = new bcn(this, rmVar, rmVar2, o, frameLayout3);
                                                    this.shimmeringLayout = kotlin.a.a(new lyc(16, this));
                                                    this.placeHolderFactory = new h3c0(context);
                                                    this.currentState = Controller$State.INITIAL;
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                                ny61.t("Missing required view with ID: ".concat(O2.getResources().getResourceName(i4)));
                                throw null;
                            }
                        }
                    }
                }
            }
            ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i3)));
            throw null;
        }
        str = "Missing required view with ID: ";
        ny61.t(str.concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final AppCompatTextView getAuthButton() {
        return (AppCompatTextView) this.binding.c.c;
    }

    private final AppCompatTextView getAuthHideButton() {
        return (AppCompatTextView) this.binding.c.d;
    }

    private final AppCompatTextView getAuthSubtitleView() {
        return (AppCompatTextView) this.binding.c.e;
    }

    private final AppCompatTextView getAuthTitleView() {
        return (AppCompatTextView) this.binding.c.f;
    }

    private final ButtonComponent getErrorHideButton() {
        return (ButtonComponent) this.binding.b.c;
    }

    private final FrameLayout getErrorLayout() {
        return (FrameLayout) this.binding.b.d;
    }

    private final ButtonComponent getErrorReloadButton() {
        return (ButtonComponent) this.binding.b.e;
    }

    private final AppCompatTextView getErrorSubtitleView() {
        return (AppCompatTextView) this.binding.b.f;
    }

    private final AppCompatTextView getErrorTitleView() {
        return (AppCompatTextView) this.binding.b.g;
    }

    private final FrameLayout getNoAuthLayout() {
        return (FrameLayout) this.binding.c.g;
    }

    private final GoImageView getServiceCloseButton() {
        return (GoImageView) this.binding.d.b;
    }

    private final GoLinearLayout getServiceLogoContainer() {
        return (GoLinearLayout) this.binding.d.e;
    }

    private final GoImageView getServiceLogoView() {
        return (GoImageView) this.binding.d.c;
    }

    private final AppCompatTextView getServiceNameView() {
        return (AppCompatTextView) this.binding.d.f;
    }

    private final ShimmeringFrameLayout getShimmeringLayout() {
        return (ShimmeringFrameLayout) this.shimmeringLayout.getValue();
    }

    private final View getView(Controller$State controller$State) {
        int i = cje.a[controller$State.ordinal()];
        if (i == 1 || i == 2) {
            return getServicePlaceholderView();
        }
        if (i == 3) {
            return null;
        }
        if (i == 4) {
            return (FrameLayout) this.binding.b.d;
        }
        if (i == 5) {
            return (FrameLayout) this.binding.c.g;
        }
        w511.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1(rme rmeVar) {
        rmeVar.m(EatsKitDelegates$ClickTarget.BUTTON_ERROR_RELOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$2(rme rmeVar) {
        rmeVar.m(EatsKitDelegates$ClickTarget.BUTTON_ERROR_HIDE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 init$lambda$3(rme rmeVar) {
        rmeVar.m(EatsKitDelegates$ClickTarget.BUTTON_AUTH);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 init$lambda$4(rme rmeVar) {
        rmeVar.m(EatsKitDelegates$ClickTarget.BUTTON_AUTH_HIDE);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 init$lambda$5(rme rmeVar) {
        rmeVar.m(EatsKitDelegates$ClickTarget.BUTTON_CLOSE);
        return zy11.a;
    }

    private final void setUpServiceHeader(ServiceHeaderMode serviceHeaderMode, int logoId, CharSequence serviceName) {
        ((GoLinearLayout) this.binding.d.e).setVisibility(serviceHeaderMode != ServiceHeaderMode.HEADER_INVISIBLE ? 0 : 8);
        ((GoImageView) this.binding.d.c).setVisibility(serviceHeaderMode == ServiceHeaderMode.HEADER_WITH_LOGO ? 0 : 8);
        ((GoImageView) this.binding.d.c).setImageResource(logoId);
        ((AppCompatTextView) this.binding.d.f).setText(serviceName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShimmeringFrameLayout shimmeringLayout_delegate$lambda$0(ContentView contentView) {
        View findViewById = contentView.binding.a.findViewById(rdh0.shimmering_layout);
        if (findViewById instanceof ShimmeringFrameLayout) {
            return (ShimmeringFrameLayout) findViewById;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateState$lambda$0$0(View view) {
        if (view.getAlpha() < 0.001f) {
            view.setVisibility(8);
        }
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        getServicePlaceholderView().setBackgroundColor(qje.t(xng0.bgMain, getContext()));
        ShimmeringFrameLayout shimmeringLayout = getShimmeringLayout();
        if (shimmeringLayout != null) {
            shimmeringLayout.setCenterColor(qje.t(xng0.shimmeringDefaultColor, getContext()));
        }
        KeyEvent.Callback findViewById = findViewById(rdh0.eats_placeholder);
        z3c0 z3c0Var = findViewById instanceof z3c0 ? (z3c0) findViewById : null;
        if (z3c0Var != null) {
            z3c0Var.applyTheme();
        }
        ((AppCompatTextView) this.binding.d.f).setTextColor(qje.t(this.logoColorId, getContext()));
        ((FrameLayout) this.binding.b.d).setBackgroundColor(qje.t(xng0.bgMain, getContext()));
        ((AppCompatTextView) this.binding.b.g).setTextColor(qje.t(xng0.textMain, getContext()));
        ((AppCompatTextView) this.binding.b.f).setTextColor(qje.t(xng0.textMain, getContext()));
        ((FrameLayout) this.binding.c.g).setBackgroundColor(qje.t(xng0.bgMain, getContext()));
        ((AppCompatTextView) this.binding.c.f).setTextColor(qje.t(xng0.textMain, getContext()));
        ((AppCompatTextView) this.binding.c.e).setTextColor(qje.t(xng0.textMain, getContext()));
        ((AppCompatTextView) this.binding.c.c).setTextColor(qje.t(xng0.textOnControl, getContext()));
        ((AppCompatTextView) this.binding.c.c).setBackground(vng.t(gzg0.bg_button_control, getContext()));
        ((AppCompatTextView) this.binding.c.d).setTextColor(qje.t(xng0.textMain, getContext()));
        ((AppCompatTextView) this.binding.c.d).setBackground(vng.t(gzg0.bg_button_minor, getContext()));
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final int getAuthErrorHideButtonVisibility() {
        return ((AppCompatTextView) this.binding.c.d).getVisibility();
    }

    public final int getBuildInLogoVisibility() {
        return ((GoLinearLayout) this.binding.d.e).getVisibility();
    }

    public final Controller$State getCurrentState() {
        return this.currentState;
    }

    public final bje getCurrentStateChangeListener() {
        return this.currentStateChangeListener;
    }

    public final int getErrorHideButtonVisibility() {
        return ((ButtonComponent) this.binding.b.c).getVisibility();
    }

    public final CharSequence getErrorMessage$eatskit() {
        return ((AppCompatTextView) this.binding.b.f).getText();
    }

    public final boolean getHasSwipeArea() {
        return this.hasSwipeArea;
    }

    public final h3c0 getPlaceHolderFactory() {
        return this.placeHolderFactory;
    }

    public final Drawable getServiceLogo() {
        return ((GoImageView) this.binding.d.c).getDrawable();
    }

    public final FrameLayout getServicePlaceholderView() {
        return this.binding.e;
    }

    public final void init(final rme controller, int logoId, int logoColorId, cvq0 serviceConfig, sls inflateSplashView) {
        this.logoColorId = logoColorId;
        rme rmeVar = this.controller;
        if (rmeVar == null) {
            this.controller = controller;
            this.splashView = (cst0) inflateSplashView.invoke();
            applyTheme(qje.X(getContext()));
        } else if (!jl40.l(rmeVar, controller)) {
            ny61.g("controller changing not supported");
            return;
        }
        setUpServiceHeader(serviceConfig.h, logoId, serviceConfig.c);
        ((AppCompatTextView) this.binding.c.f).setText((CharSequence) serviceConfig.d.b);
        final int i = 0;
        ((ButtonComponent) this.binding.b.e).setDebounceClickListener(new Runnable() { // from class: zie
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                rme rmeVar2 = controller;
                switch (i2) {
                    case 0:
                        ContentView.init$lambda$1(rmeVar2);
                        break;
                    default:
                        ContentView.init$lambda$2(rmeVar2);
                        break;
                }
            }
        });
        final int i2 = 1;
        ((ButtonComponent) this.binding.b.c).setDebounceClickListener(new Runnable() { // from class: zie
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                rme rmeVar2 = controller;
                switch (i22) {
                    case 0:
                        ContentView.init$lambda$1(rmeVar2);
                        break;
                    default:
                        ContentView.init$lambda$2(rmeVar2);
                        break;
                }
            }
        });
        ru.yandex.taxi.design.utils.c.z(new aje(controller, i), (AppCompatTextView) this.binding.c.c);
        ru.yandex.taxi.design.utils.c.z(new aje(controller, i2), (AppCompatTextView) this.binding.c.d);
        ru.yandex.taxi.design.utils.c.z(new aje(controller, 2), (GoImageView) this.binding.d.b);
        String str = serviceConfig.f;
        if (str != null) {
            ((ButtonComponent) this.binding.b.c).setText(str);
            ((AppCompatTextView) this.binding.c.d).setText(str);
        }
    }

    public final void setAuthErrorHideButtonVisibility(int i) {
        ((AppCompatTextView) this.binding.c.d).setVisibility(i);
    }

    public final void setBuildInLogoVisibility(int i) {
        ((GoLinearLayout) this.binding.d.e).setVisibility(i);
    }

    public final void setCurrentStateChangeListener(bje bjeVar) {
        this.currentStateChangeListener = bjeVar;
    }

    public final void setErrorHideButtonVisibility(int i) {
        ((ButtonComponent) this.binding.b.c).setVisibility(i);
    }

    public final void setErrorMessage$eatskit(CharSequence charSequence) {
        ((AppCompatTextView) this.binding.b.f).setText(charSequence);
    }

    public final void setHasSwipeArea$eatskit(boolean z) {
        this.hasSwipeArea = z;
    }

    public final void setIsOpen(boolean value) {
        cst0 cst0Var = this.splashView;
        if (cst0Var != null) {
            cst0Var.setAnimating(value);
        }
    }

    public final void setServiceLogo(Drawable drawable) {
        ((GoImageView) this.binding.d.c).setImageDrawable(drawable);
    }

    public final void updateState(Controller$State state) {
        Controller$State controller$State = this.currentState;
        if (controller$State == state) {
            return;
        }
        View view = getView(controller$State);
        if (view != null) {
            if (view.isShown()) {
                view.animate().cancel();
                view.animate().alpha(0.0f).withEndAction(new ce0(view, 7));
            } else {
                view.setVisibility(8);
            }
        }
        View view2 = getView(state);
        if (view2 != null) {
            view2.animate().cancel();
            view2.setVisibility(0);
            if (view2.isShown()) {
                view2.animate().alpha(1.0f);
            } else {
                view2.setAlpha(1.0f);
            }
        }
        boolean z = state == Controller$State.LOADING || state == Controller$State.INITIAL;
        cst0 cst0Var = this.splashView;
        if (cst0Var != null) {
            cst0Var.setAnimating(z);
        }
        ShimmeringFrameLayout shimmeringLayout = getShimmeringLayout();
        if (shimmeringLayout != null) {
            shimmeringLayout.setShimmering(z);
        }
        this.currentState = state;
        bje bjeVar = this.currentStateChangeListener;
        if (bjeVar != null) {
            ExternalServiceModalView.lambda$0$0((ExternalServiceModalView) ((xen) bjeVar).b, state);
        }
    }

    public ContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ContentView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ContentView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
