package ru.yandex.taxi.requirements.ui.selector;

import android.content.Context;
import android.widget.FrameLayout;
import defpackage.af70;
import defpackage.bf70;
import defpackage.jmw0;
import defpackage.plq0;
import defpackage.qjj0;
import defpackage.rjj0;
import defpackage.tje;
import kotlin.Metadata;
import ru.yandex.taxi.requirements.ui.selector.compound.CompoundOptionSelectorView;
import ru.yandex.taxi.requirements.ui.selector.usual.UsualOptionSelectorView;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0019B#\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0018\u0010\u001a\u001a\u00060\u0019R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010%¨\u0006&"}, d2 = {"Lru/yandex/taxi/requirements/ui/selector/RequirementOptionsSelectView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Lbf70;", "factory", "Lqjj0;", "presenter", "<init>", "(Landroid/content/Context;Lbf70;Lqjj0;)V", "Lzy11;", "updateListenerInViews", "()V", "Ljmw0;", "requirement", "updateRequirement", "(Ljmw0;)V", "onAttachedToWindow", "onDetachedFromWindow", "Laf70;", "listener", "setListener", "(Laf70;)V", "Lbf70;", "Lqjj0;", "Lrjj0;", "mvp", "Lrjj0;", "Lplq0;", "lastMode", "Lplq0;", "Lru/yandex/taxi/requirements/ui/selector/usual/UsualOptionSelectorView;", "usualSelector", "Lru/yandex/taxi/requirements/ui/selector/usual/UsualOptionSelectorView;", "Lru/yandex/taxi/requirements/ui/selector/compound/CompoundOptionSelectorView;", "compoundSelector", "Lru/yandex/taxi/requirements/ui/selector/compound/CompoundOptionSelectorView;", "Laf70;", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequirementOptionsSelectView extends FrameLayout {
    private CompoundOptionSelectorView compoundSelector;
    private final bf70 factory;
    private plq0 lastMode;
    private af70 listener;
    private final rjj0 mvp;
    private final qjj0 presenter;
    private UsualOptionSelectorView usualSelector;

    public RequirementOptionsSelectView(Context context, bf70 bf70Var, qjj0 qjj0Var) {
        super(context);
        this.factory = bf70Var;
        this.presenter = qjj0Var;
        this.mvp = new rjj0(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateListenerInViews() {
        UsualOptionSelectorView usualOptionSelectorView = this.usualSelector;
        if (usualOptionSelectorView != null) {
            usualOptionSelectorView.setListener(this.listener);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        qjj0 qjj0Var = this.presenter;
        rjj0 rjj0Var = this.mvp;
        qjj0Var.Bg(rjj0Var);
        tje.N(qjj0Var.Jg(), null, null, new RequirementOptionsSelectPresenter$attachView$1(qjj0Var, rjj0Var, null), 3);
        tje.N(qjj0Var.Jg(), null, null, new RequirementOptionsSelectPresenter$attachView$2(qjj0Var, rjj0Var, null), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    public final void setListener(af70 listener) {
        this.listener = listener;
        updateListenerInViews();
    }

    public final void updateRequirement(jmw0 requirement) {
        this.presenter.z.l(requirement);
    }
}
