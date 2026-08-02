package ru.yandex.taxi.phone_select;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.b;
import defpackage.bfh0;
import defpackage.c230;
import defpackage.cma1;
import defpackage.dgq0;
import defpackage.drh0;
import defpackage.e230;
import defpackage.gbq0;
import defpackage.hbq0;
import defpackage.ibq0;
import defpackage.nw70;
import defpackage.ofp0;
import defpackage.q5z;
import defpackage.qje;
import defpackage.rfb0;
import defpackage.rp31;
import defpackage.sls;
import defpackage.tfb0;
import defpackage.uq1;
import defpackage.vfb0;
import defpackage.wfb0;
import defpackage.xng0;
import defpackage.y130;
import defpackage.yo90;
import defpackage.zde;
import defpackage.zuj0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.contacts.SelectContactView;
import ru.yandex.taxi.contacts.a;
import ru.yandex.taxi.contacts.c;
import ru.yandex.taxi.contacts.d;
import ru.yandex.taxi.contacts.g;
import ru.yandex.taxi.phone_select.PhoneSelectModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B;\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u001b\u0010\u0018J\u000f\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001f\u0010\u0013J\u000f\u0010 \u001a\u00020\u0011H\u0014¢\u0006\u0004\b \u0010\u0013J\u0017\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0011H\u0016¢\u0006\u0004\b$\u0010\u0013J\u000f\u0010%\u001a\u00020\u0011H\u0014¢\u0006\u0004\b%\u0010\u0013J\u001f\u0010*\u001a\u00020\u00112\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00112\u0006\u0010,\u001a\u00020&H\u0014¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0011H\u0014¢\u0006\u0004\b/\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00100R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00107\u001a\u00020&8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lru/yandex/taxi/phone_select/PhoneSelectModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Lvfb0;", "Landroid/content/Context;", "context", "Lwfb0;", "presenter", "Ltfb0;", "contactSelectorInfo", "Libq0;", "selectContactViewDependencies", "Lhbq0;", "selectContactViewConfigFactory", "Ldgq0;", "selectedContactsRepository", "<init>", "(Landroid/content/Context;Lwfb0;Ltfb0;Libq0;Lhbq0;Ldgq0;)V", "Lzy11;", "hideSoftInputFromWindow", "()V", "Ljava/lang/Runnable;", "startAction", "endAction", "animateDismiss", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "onAnimateShowStartAction", "onAnimateShowEndAction", "animateShow", "Le230;", "insetsType", "()Le230;", "onBackPressed", "onSlideOut", "onAnimationEnd", "dismissInternal", "(Ljava/lang/Runnable;)V", "phoneSelected", "onAttachedToWindow", "", "newState", "", "movedByUser", "onBehaviorStateChanged", "(IZ)V", "contentTop", "onModalViewAppear", "(I)V", "onDetachedFromWindow", "Lwfb0;", "Ltfb0;", "Lru/yandex/taxi/contacts/SelectContactView;", "selectContactView", "Lru/yandex/taxi/contacts/SelectContactView;", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PhoneSelectModalView extends SlideableModalView implements vfb0 {
    private final tfb0 contactSelectorInfo;
    private final wfb0 presenter;
    private final SelectContactView selectContactView;

    public PhoneSelectModalView(Context context, wfb0 wfb0Var, tfb0 tfb0Var, ibq0 ibq0Var, hbq0 hbq0Var, dgq0 dgq0Var) {
        super(context);
        this.presenter = wfb0Var;
        this.contactSelectorInfo = tfb0Var;
        setDismissOnBackPressed(false);
        setDismissOnTouchOutside(false);
        nw70 nw70Var = new nw70(16, this);
        gbq0 gbq0Var = new gbq0(tfb0Var.a, tfb0Var.p, tfb0Var.q, tfb0Var.b, tfb0Var.c, tfb0Var.d, tfb0Var.e, false, tfb0Var.f, tfb0Var.g, tfb0Var.h, !((Boolean) hbq0Var.a.a.b()).booleanValue(), tfb0Var.i, tfb0Var.k, tfb0Var.j);
        ibq0Var.getClass();
        context.getClass();
        dgq0Var.getClass();
        a aVar = ibq0Var.a;
        q5z.h(aVar);
        zuj0 zuj0Var = ibq0Var.b;
        q5z.h(zuj0Var);
        zde zdeVar = new zde();
        g gVar = ibq0Var.c;
        q5z.h(gVar);
        d dVar = new d(aVar, gbq0Var, dgq0Var, zuj0Var, zdeVar, gVar, nw70Var);
        c cVar = new c(context);
        uq1 uq1Var = ibq0Var.d;
        q5z.h(uq1Var);
        SelectContactView selectContactView = new SelectContactView(context, dVar, cVar, uq1Var);
        this.selectContactView = selectContactView;
        selectContactView.setBackgroundColor(qje.t(xng0.bgMain, getContext()));
        selectContactView.setKeyboardCloseListener(new rfb0(this, 2));
        int i = bfh0.phone_select_container;
        WeakHashMap weakHashMap = b.a;
        ((ViewGroup) ((View) rp31.d(this, i))).addView(selectContactView);
        if (tfb0Var.n) {
            selectContactView.setTitleNavigation();
        }
        setCardMode(tfb0Var.o);
    }

    private final void hideSoftInputFromWindow() {
        View findFocus = this.selectContactView.findFocus();
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(findFocus != null ? findFocus.getWindowToken() : this.selectContactView.getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(ViewGroup viewGroup, PhoneSelectModalView phoneSelectModalView) {
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        layoutParams.height = phoneSelectModalView.getContent().getMeasuredHeight();
        viewGroup.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBackPressed$lambda$0(PhoneSelectModalView phoneSelectModalView) {
        wfb0 wfb0Var = phoneSelectModalView.presenter;
        wfb0Var.y.d();
        wfb0Var.w.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void phoneSelected$lambda$0(PhoneSelectModalView phoneSelectModalView) {
        phoneSelectModalView.presenter.w.h();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        if (!this.contactSelectorInfo.l) {
            super.animateDismiss(startAction, endAction);
        } else {
            cma1.g(ofp0.b, getContent()).setDuration(300L).withStartAction(startAction).withEndAction(endAction).start();
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        if (!this.contactSelectorInfo.l) {
            super.animateShow(onAnimateShowStartAction, onAnimateShowEndAction);
        } else {
            getContent().setTranslationX(ofp0.b);
            cma1.g(0.0f, getContent()).setDuration(300L).withStartAction(onAnimateShowStartAction).withEndAction(onAnimateShowEndAction).start();
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void dismissInternal(Runnable onAnimationEnd) {
        this.selectContactView.setKeyboardCloseListener(null);
        super.dismissInternal(onAnimationEnd);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return drh0.phone_select_modal_view;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        if (this.contactSelectorInfo.o == SlideableModalView.CardMode.FULLSCREEN) {
            final int i = 0;
            return new y130(0, new sls(this) { // from class: sfb0
                public final /* synthetic */ PhoneSelectModalView b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    View view;
                    View view2;
                    int i2 = i;
                    PhoneSelectModalView phoneSelectModalView = this.b;
                    switch (i2) {
                        case 0:
                            view = phoneSelectModalView.selectContactView;
                            return view;
                        default:
                            view2 = phoneSelectModalView.selectContactView;
                            return view2;
                    }
                }
            }, true);
        }
        final int i2 = 1;
        return new c230(0, new sls(this) { // from class: sfb0
            public final /* synthetic */ PhoneSelectModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                View view;
                View view2;
                int i22 = i2;
                PhoneSelectModalView phoneSelectModalView = this.b;
                switch (i22) {
                    case 0:
                        view = phoneSelectModalView.selectContactView;
                        return view;
                    default:
                        view2 = phoneSelectModalView.selectContactView;
                        return view2;
                }
            }
        }, true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.Bg(this);
        int i = bfh0.phone_select_container;
        WeakHashMap weakHashMap = b.a;
        ViewGroup viewGroup = (ViewGroup) ((View) rp31.d(this, i));
        ru.yandex.taxi.design.utils.c.e(viewGroup, new yo90(9, viewGroup, this));
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        hideSoftInputFromWindow();
        dismissWithAction(new rfb0(this, 1));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onBehaviorStateChanged(int newState, boolean movedByUser) {
        super.onBehaviorStateChanged(newState, movedByUser);
        if (newState == 6) {
            int i = bfh0.phone_select_container;
            WeakHashMap weakHashMap = b.a;
            ViewGroup viewGroup = (ViewGroup) ((View) rp31.d(this, i));
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = getContent().getMeasuredHeight();
            viewGroup.setLayoutParams(layoutParams);
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.y.b();
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        this.presenter.y.a();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
        hideSoftInputFromWindow();
        wfb0 wfb0Var = this.presenter;
        wfb0Var.y.d();
        wfb0Var.w.a();
        super.onSlideOut();
    }

    @Override // defpackage.vfb0
    public void phoneSelected() {
        if (!this.contactSelectorInfo.m) {
            this.presenter.w.h();
        } else {
            this.selectContactView.dismiss();
            dismissInternal(new rfb0(this, 0));
        }
    }
}
