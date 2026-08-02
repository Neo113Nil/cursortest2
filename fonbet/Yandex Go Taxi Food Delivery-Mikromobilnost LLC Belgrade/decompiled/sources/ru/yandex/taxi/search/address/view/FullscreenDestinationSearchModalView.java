package ru.yandex.taxi.search.address.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.yandex.go.search.router.FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection;
import defpackage.b61;
import defpackage.bdp;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.dnr;
import defpackage.ejp;
import defpackage.ewb;
import defpackage.h60;
import defpackage.ijs;
import defpackage.jjs;
import defpackage.kjs;
import defpackage.ljs;
import defpackage.ltb1;
import defpackage.mga1;
import defpackage.qjs;
import defpackage.sls;
import defpackage.t7j;
import defpackage.tje;
import defpackage.tls;
import defpackage.xvq;
import defpackage.y130;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.taxi.address.design.AddressInputView;
import ru.yandex.taxi.animation.AnimUtils$AnimationStartEndListener;
import ru.yandex.taxi.search.view.AddressSearchModalView;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 /2\u00020\u0001:\u000201B)\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000e\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010 \u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u0018H\u0014¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\"\u0010\u0014J\u001f\u0010#\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0014¢\u0006\u0004\b#\u0010\u0014J\u0015\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\"\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062"}, d2 = {"Lru/yandex/taxi/search/address/view/FullscreenDestinationSearchModalView;", "Lru/yandex/taxi/search/view/AddressSearchModalView;", "Lb61;", "builder", "Lqjs;", "presenter", "", "transitionName", "<init>", "(Lb61;Lqjs;Ljava/lang/String;)V", "Lkotlin/Function0;", "Lzy11;", "onAnimateShowStartAction", "onAnimateShowEndAction", "startSlideInAnimation", "(Lsls;Lsls;)V", "Ljava/lang/Runnable;", "startAction", "endAction", "startSlideOutAnimation", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "Ly130;", "insetsType", "()Ly130;", "", "isFullscreen", "()Z", "onAttachedToWindow", "()V", "Landroid/view/View;", "child", "animate", "removeDetachedView", "(Landroid/view/View;Z)V", "animateShow", "animateDismiss", "Lcom/yandex/go/search/router/FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection;", "direction", "withDirection", "(Lcom/yandex/go/search/router/FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection;)V", "Lqjs;", "Ljava/lang/String;", "Lkotlin/Function1;", "delayedAnimation", "Ltls;", "navigationDirection", "Lcom/yandex/go/search/router/FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection;", "Companion", "ljs", "kjs", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FullscreenDestinationSearchModalView extends AddressSearchModalView {
    public static final kjs Companion = new kjs();
    private static final long EXPANDABLE_ANIMATION_START_DELAY = 100;
    private static final long SHOWING_KEYBOARD_DELAY = 200;
    private tls delayedAnimation;
    private FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection navigationDirection;
    private final qjs presenter;
    private final String transitionName;

    public FullscreenDestinationSearchModalView(b61 b61Var, qjs qjsVar, String str) {
        super(b61Var, 7);
        this.presenter = qjsVar;
        this.transitionName = str;
        this.delayedAnimation = new xvq(26);
        this.navigationDirection = FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection.FORWARD;
        setDismissOnTouchOutside(false);
        setOnKeyboardListener(new ewb(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 animateDismiss$lambda$0(FullscreenDestinationSearchModalView fullscreenDestinationSearchModalView, Runnable runnable, Runnable runnable2, boolean z) {
        String str;
        AddressInputView addressInputView = fullscreenDestinationSearchModalView.getAddressSearchView().addressInputHolder.a;
        View b = (!z || (str = fullscreenDestinationSearchModalView.transitionName) == null) ? null : ltb1.b(ltb1.e(fullscreenDestinationSearchModalView), str);
        ViewParent parent = fullscreenDestinationSearchModalView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (b == null || viewGroup == null) {
            fullscreenDestinationSearchModalView.startSlideOutAnimation(runnable, runnable2);
        } else {
            mga1.g(viewGroup, fullscreenDestinationSearchModalView, addressInputView, b, false, new bdp(13, addressInputView, runnable), new FullscreenDestinationSearchModalView$animateDismiss$1$1(0, runnable2, Runnable.class, "run", "run()V", 0));
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 animateDismiss$lambda$0$0(AddressInputView addressInputView, Runnable runnable) {
        if (addressInputView != null) {
            addressInputView.post(new ce0(addressInputView, 15));
        }
        runnable.run();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 animateShow$lambda$0(FullscreenDestinationSearchModalView fullscreenDestinationSearchModalView, Runnable runnable, Runnable runnable2, boolean z) {
        String str;
        AddressInputView addressInputView = fullscreenDestinationSearchModalView.getAddressSearchView().addressInputHolder.a;
        View b = (!z || (str = fullscreenDestinationSearchModalView.transitionName) == null) ? null : ltb1.b(ltb1.e(fullscreenDestinationSearchModalView), str);
        ViewParent parent = fullscreenDestinationSearchModalView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (b == null || viewGroup == null) {
            fullscreenDestinationSearchModalView.startSlideInAnimation(new FullscreenDestinationSearchModalView$animateShow$1$1(0, runnable, Runnable.class, "run", "run()V", 0), new FullscreenDestinationSearchModalView$animateShow$1$2(0, runnable2, Runnable.class, "run", "run()V", 0));
        } else {
            mga1.g(viewGroup, fullscreenDestinationSearchModalView, addressInputView, b, true, new t7j(14, addressInputView, fullscreenDestinationSearchModalView, runnable), new FullscreenDestinationSearchModalView$animateShow$1$3(0, runnable2, Runnable.class, "run", "run()V", 0));
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 animateShow$lambda$0$0(AddressInputView addressInputView, FullscreenDestinationSearchModalView fullscreenDestinationSearchModalView, Runnable runnable) {
        addressInputView.inputView().clearFocus();
        fullscreenDestinationSearchModalView.setVisibility(0);
        fullscreenDestinationSearchModalView.postDelayed(new ejp(14, addressInputView), 200L);
        runnable.run();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateShow$lambda$0$0$0(AddressInputView addressInputView) {
        addressInputView.inputView().requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 delayedAnimation$lambda$0(boolean z) {
        return zy11.a;
    }

    private final void startSlideInAnimation(sls onAnimateShowStartAction, sls onAnimateShowEndAction) {
        int i = 0;
        setVisibility(0);
        View content = getContent();
        long j = this.animateOnAppearing ? 300L : 0L;
        if (content.getWidth() == 0) {
            onAnimateShowStartAction.invoke();
        } else {
            content.setTranslationX(content.getWidth());
            cma1.g(0.0f, content).withStartAction(new h60(29, onAnimateShowStartAction)).withEndAction(new ijs(i, onAnimateShowEndAction)).setDuration(j);
        }
        animateShowBackground(j);
    }

    private final void startSlideOutAnimation(Runnable startAction, Runnable endAction) {
        animateDismissBackground();
        View content = getContent();
        if (content.getWidth() != 0) {
            cma1.g(-content.getWidth(), content).setListener(new AnimUtils$AnimationStartEndListener(startAction, endAction)).setDuration(300L);
        } else {
            startAction.run();
            endAction.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        this.delayedAnimation = new jjs(this, startAction, endAction, 1);
        qjs qjsVar = this.presenter;
        tje.N(qjsVar.Jg(), null, null, new FullscreenDestinationSearchPresenter$selectShowingAnimation$1(this.transitionName == null ? 0 : 1, qjsVar, 0L, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        if (this.navigationDirection == FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection.BACKWARD) {
            setAlpha(0.0f);
            cma1.J(this).start();
        } else {
            this.delayedAnimation = new jjs(this, onAnimateShowStartAction, onAnimateShowEndAction, 0);
            qjs qjsVar = this.presenter;
            tje.N(qjsVar.Jg(), null, null, new FullscreenDestinationSearchPresenter$selectShowingAnimation$1(this.transitionName != null ? 1 : 0, qjsVar, 100L, null), 3);
        }
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchModalView, ru.yandex.taxi.widget.ModalView
    public y130 insetsType() {
        return new y130(1, new dnr(5, this));
    }

    @Override // ru.yandex.taxi.search.view.AddressSearchModalView, ru.yandex.taxi.search.view.BaseAddressSearchModalView
    /* renamed from: isFullscreen */
    public boolean getIsFullscreen() {
        return true;
    }

    @Override // ru.yandex.taxi.search.view.AddressSearchModalView, ru.yandex.taxi.search.view.BaseAddressSearchModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        qjs qjsVar = this.presenter;
        qjsVar.Bg(new ljs(this));
        qjsVar.y = tje.h(qjsVar.Jg(), null, null, new FullscreenDestinationSearchPresenter$attachView$1(qjsVar, null), 3);
        setVisibility(4);
        setOnTouchOutsideListener(null);
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View child, boolean animate) {
        super.removeDetachedView(child, animate);
        this.presenter.Cg();
    }

    public final void withDirection(FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection direction) {
        this.navigationDirection = direction;
    }
}
