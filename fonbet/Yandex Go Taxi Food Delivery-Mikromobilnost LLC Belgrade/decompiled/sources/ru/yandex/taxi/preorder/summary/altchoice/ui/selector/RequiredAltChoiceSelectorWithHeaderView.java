package ru.yandex.taxi.preorder.summary.altchoice.ui.selector;

import android.content.Context;
import android.widget.LinearLayout;
import defpackage.haj0;
import defpackage.nwy0;
import defpackage.raj0;
import defpackage.saj0;
import defpackage.tje;
import defpackage.yvf0;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListGroupHeaderComponent;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001dB)\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000e2\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0018\u0010\u001e\u001a\u00060\u001dR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/yandex/taxi/preorder/summary/altchoice/ui/selector/RequiredAltChoiceSelectorWithHeaderView;", "Landroid/widget/LinearLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Lyvf0;", "Lru/yandex/taxi/preorder/summary/altchoice/ui/selector/RequiredAltChoiceOptionSelectorView;", "usualSelectorViewFactory", "Lhaj0;", "presenter", "<init>", "(Landroid/content/Context;Lyvf0;Lhaj0;)V", "Lsaj0;", "model", "Lzy11;", "update", "(Lsaj0;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "drawableRes", "setHeaderBackground", "(I)V", "Lhaj0;", "Lraj0;", "mvp", "Lraj0;", "Lru/yandex/taxi/design/ListGroupHeaderComponent;", "header", "Lru/yandex/taxi/design/ListGroupHeaderComponent;", "selectorView", "Lru/yandex/taxi/preorder/summary/altchoice/ui/selector/RequiredAltChoiceOptionSelectorView;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequiredAltChoiceSelectorWithHeaderView extends LinearLayout implements nwy0 {
    private final ListGroupHeaderComponent header;
    private final raj0 mvp;
    private final haj0 presenter;
    private RequiredAltChoiceOptionSelectorView selectorView;

    public RequiredAltChoiceSelectorWithHeaderView(Context context, yvf0 yvf0Var, haj0 haj0Var) {
        super(context);
        this.presenter = haj0Var;
        this.mvp = new raj0(this);
        ListGroupHeaderComponent listGroupHeaderComponent = new ListGroupHeaderComponent(context, null, 0, 6, null);
        this.header = listGroupHeaderComponent;
        this.selectorView = (RequiredAltChoiceOptionSelectorView) yvf0Var.get();
        setOrientation(1);
        addView(listGroupHeaderComponent, new LinearLayout.LayoutParams(-1, -2));
        addView(this.selectorView, new LinearLayout.LayoutParams(-1, -2));
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.header.applyTheme(themeType);
        this.selectorView.applyTheme(themeType);
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        haj0 haj0Var = this.presenter;
        raj0 raj0Var = this.mvp;
        haj0Var.Bg(raj0Var);
        tje.N(haj0Var.Jg(), null, null, new RequiredAltChoiceOptionsSelectPresenter$attachView$1(haj0Var, raj0Var, null), 3);
        tje.N(haj0Var.Jg(), null, null, new RequiredAltChoiceOptionsSelectPresenter$attachView$2(haj0Var, raj0Var, null), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    public final void setHeaderBackground(int drawableRes) {
        this.header.setBackgroundResource(drawableRes);
    }

    public final void update(saj0 model) {
        this.presenter.z.l(model);
    }
}
