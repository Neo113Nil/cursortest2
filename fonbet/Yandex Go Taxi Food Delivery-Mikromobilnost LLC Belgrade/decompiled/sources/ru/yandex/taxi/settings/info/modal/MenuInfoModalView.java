package ru.yandex.taxi.settings.info.modal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import defpackage.al10;
import defpackage.bi4;
import defpackage.cl10;
import defpackage.cma1;
import defpackage.fl10;
import defpackage.g18;
import defpackage.hxx;
import defpackage.ie90;
import defpackage.keh0;
import defpackage.lay;
import defpackage.lui;
import defpackage.m950;
import defpackage.ny61;
import defpackage.pqh0;
import defpackage.sy60;
import defpackage.tje;
import defpackage.v3u0;
import defpackage.xk10;
import defpackage.xyz;
import defpackage.y130;
import defpackage.y5e;
import defpackage.yk10;
import defpackage.yvf0;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import ru.yandex.taxi.animation.NavigationDirection;
import ru.yandex.taxi.design.FloatingTitleToolbarComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.settings.info.modal.MenuInfoModalView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00016B/\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001d\u0010\u0016J\u000f\u0010\u001e\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001e\u0010\u0016J\u001f\u0010\"\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0014¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001fH\u0014¢\u0006\u0004\b&\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u00101\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u0016\u00102\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010(R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/yandex/taxi/settings/info/modal/MenuInfoModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lyk10;", "Landroid/content/Context;", "context", "Lcl10;", "presenter", "Lru/yandex/taxi/animation/NavigationDirection;", "attachingNavigationDirection", "Lv3u0;", "stateBarVisibilitySuppressorRepository", "<init>", "(Landroid/content/Context;Lcl10;Lru/yandex/taxi/animation/NavigationDirection;Lv3u0;)V", "Lal10;", "menuInfoModel", "Lzy11;", "setupClickListeners", "(Lal10;)V", "Ly130;", "insetsType", "()Ly130;", "onBackPressed", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lyk10;", "onAttachedToWindow", "onDetachedFromWindow", "Ljava/lang/Runnable;", "onAnimateShowStartAction", "onAnimateShowEndAction", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "startAction", "endAction", "animateDismiss", "Lcl10;", "Lru/yandex/taxi/animation/NavigationDirection;", "Lv3u0;", "Lru/yandex/taxi/design/FloatingTitleToolbarComponent;", "toolbar", "Lru/yandex/taxi/design/FloatingTitleToolbarComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "parksView", "Lru/yandex/taxi/design/ListItemComponent;", "tariffsView", "about", "detachingNavigationDirection", "Lg18;", "supressStateBarVisible", "Lg18;", "xk10", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MenuInfoModalView extends SlideableBindingModalView<yk10> {
    private final ListItemComponent about;
    private final NavigationDirection attachingNavigationDirection;
    private NavigationDirection detachingNavigationDirection;
    private final ListItemComponent parksView;
    private final cl10 presenter;
    private final v3u0 stateBarVisibilitySuppressorRepository;
    private g18 supressStateBarVisible;
    private final ListItemComponent tariffsView;
    private final FloatingTitleToolbarComponent toolbar;

    public MenuInfoModalView(Context context, cl10 cl10Var, NavigationDirection navigationDirection, v3u0 v3u0Var) {
        super(context);
        this.presenter = cl10Var;
        this.attachingNavigationDirection = navigationDirection;
        this.stateBarVisibilitySuppressorRepository = v3u0Var;
        FloatingTitleToolbarComponent floatingTitleToolbarComponent = getBinding().e;
        this.toolbar = floatingTitleToolbarComponent;
        this.parksView = getBinding().c;
        this.tariffsView = getBinding().d;
        ListItemComponent listItemComponent = getBinding().b;
        this.about = listItemComponent;
        this.detachingNavigationDirection = NavigationDirection.NO_ANIMATE;
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        final int i = 1;
        floatingTitleToolbarComponent.setTitleAccessibilityHeading(true);
        final int i2 = 0;
        floatingTitleToolbarComponent.setOnBackClickListener(new Runnable(this) { // from class: wk10
            public final /* synthetic */ MenuInfoModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                MenuInfoModalView menuInfoModalView = this.b;
                switch (i3) {
                    case 0:
                        menuInfoModalView.onBackPressed();
                        break;
                    default:
                        MenuInfoModalView._init_$lambda$0(menuInfoModalView);
                        break;
                }
            }
        });
        listItemComponent.setDebounceClickListener(new Runnable(this) { // from class: wk10
            public final /* synthetic */ MenuInfoModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                MenuInfoModalView menuInfoModalView = this.b;
                switch (i3) {
                    case 0:
                        menuInfoModalView.onBackPressed();
                        break;
                    default:
                        MenuInfoModalView._init_$lambda$0(menuInfoModalView);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(MenuInfoModalView menuInfoModalView) {
        menuInfoModalView.detachingNavigationDirection = NavigationDirection.NO_ANIMATE;
        cl10 cl10Var = menuInfoModalView.presenter;
        cl10Var.y.j("about");
        lui luiVar = (lui) cl10Var.x.a;
        luiVar.A((m950) ((bi4) luiVar.L).get(), zy11.a, sy60.Q2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(MenuInfoModalView menuInfoModalView) {
        return menuInfoModalView.getBinding().a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupClickListeners(final al10 menuInfoModel) {
        boolean z = menuInfoModel.b;
        ListItemComponent listItemComponent = this.parksView;
        if (z) {
            final int i = 0;
            listItemComponent.setDebounceClickListener(new Runnable(this) { // from class: vk10
                public final /* synthetic */ MenuInfoModalView b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    al10 al10Var = menuInfoModel;
                    MenuInfoModalView menuInfoModalView = this.b;
                    switch (i2) {
                        case 0:
                            MenuInfoModalView.setupClickListeners$lambda$0(menuInfoModalView, al10Var);
                            break;
                        default:
                            MenuInfoModalView.setupClickListeners$lambda$1(menuInfoModalView, al10Var);
                            break;
                    }
                }
            });
        } else {
            listItemComponent.setDebounceClickListener(null);
        }
        boolean z2 = menuInfoModel.a;
        ListItemComponent listItemComponent2 = this.tariffsView;
        if (!z2) {
            listItemComponent2.setDebounceClickListener(null);
        } else {
            final int i2 = 1;
            listItemComponent2.setDebounceClickListener(new Runnable(this) { // from class: vk10
                public final /* synthetic */ MenuInfoModalView b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i22 = i2;
                    al10 al10Var = menuInfoModel;
                    MenuInfoModalView menuInfoModalView = this.b;
                    switch (i22) {
                        case 0:
                            MenuInfoModalView.setupClickListeners$lambda$0(menuInfoModalView, al10Var);
                            break;
                        default:
                            MenuInfoModalView.setupClickListeners$lambda$1(menuInfoModalView, al10Var);
                            break;
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupClickListeners$lambda$0(MenuInfoModalView menuInfoModalView, al10 al10Var) {
        menuInfoModalView.detachingNavigationDirection = NavigationDirection.NO_ANIMATE;
        cl10 cl10Var = menuInfoModalView.presenter;
        String str = al10Var.d;
        cl10Var.y.j("parks");
        fl10 fl10Var = cl10Var.x;
        fl10Var.getClass();
        ie90 ie90Var = new ie90(str);
        lui luiVar = (lui) fl10Var.a;
        luiVar.E((m950) luiVar.J.get(), ie90Var, sy60.Q2, hxx.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupClickListeners$lambda$1(MenuInfoModalView menuInfoModalView, al10 al10Var) {
        menuInfoModalView.detachingNavigationDirection = NavigationDirection.NO_ANIMATE;
        cl10 cl10Var = menuInfoModalView.presenter;
        zzs zzsVar = al10Var.c;
        String str = al10Var.d;
        cl10Var.y.j("tariffs");
        fl10 fl10Var = cl10Var.x;
        fl10Var.getClass();
        lay layVar = new lay(zzsVar, str);
        lui luiVar = (lui) fl10Var.a;
        luiVar.E((m950) ((yvf0) luiVar.K).get(), layVar, sy60.Q2, hxx.a);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        y5e.c(getContent(), startAction, endAction, this.detachingNavigationDirection, 4);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        y5e.d(getContent(), onAnimateShowStartAction, onAnimateShowEndAction, this.attachingNavigationDirection, 4);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public yk10 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(pqh0.menu_info_modal_view, parent, false);
        int i = keh0.about;
        ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
        if (listItemComponent != null) {
            i = keh0.parks;
            ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i, inflate);
            if (listItemComponent2 != null) {
                i = keh0.scroll;
                if (((ScrollView) cma1.O(i, inflate)) != null) {
                    i = keh0.tariffs;
                    ListItemComponent listItemComponent3 = (ListItemComponent) cma1.O(i, inflate);
                    if (listItemComponent3 != null) {
                        i = keh0.toolbar;
                        FloatingTitleToolbarComponent floatingTitleToolbarComponent = (FloatingTitleToolbarComponent) cma1.O(i, inflate);
                        if (floatingTitleToolbarComponent != null) {
                            return new yk10((FrameLayout) inflate, listItemComponent, listItemComponent2, listItemComponent3, floatingTitleToolbarComponent);
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public y130 insetsType() {
        return new y130(1, new xyz(19, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.supressStateBarVisible = this.stateBarVisibilitySuppressorRepository.a(this);
        cl10 cl10Var = this.presenter;
        xk10 xk10Var = new xk10(this);
        cl10Var.Bg(xk10Var);
        tje.N(cl10Var.Jg(), null, null, new MenuInfoPresenter$attachView$1(cl10Var, xk10Var, null), 3);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        this.detachingNavigationDirection = NavigationDirection.BACKWARD;
        super.onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g18 g18Var = this.supressStateBarVisible;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.presenter.Cg();
    }
}
