package ru.yandex.taxi.settings.presentation.menu_item;

import android.content.Context;
import defpackage.dzg0;
import defpackage.j1g0;
import defpackage.k1g0;
import defpackage.l1g0;
import defpackage.oxe0;
import defpackage.pav;
import defpackage.tje;
import defpackage.x770;
import java.util.HashMap;
import kotlin.Metadata;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0014B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/settings/presentation/menu_item/PushDisabledMenuItem;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Ll1g0;", "presenter", "<init>", "(Landroid/content/Context;Lpav;Ll1g0;)V", "Lzy11;", "onMenuOpened", "()V", "onAttachedToWindow", "onDetachedFromWindow", "Lpav;", "Ll1g0;", "Lk1g0;", "mvpView", "Lk1g0;", "j1g0", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PushDisabledMenuItem extends ListItemComponent {
    private final pav imageLoader;
    private final k1g0 mvpView;
    private final l1g0 presenter;

    public PushDisabledMenuItem(Context context, pav pavVar, l1g0 l1g0Var) {
        super(context, null, 0, 6, null);
        this.imageLoader = pavVar;
        this.presenter = l1g0Var;
        this.mvpView = new j1g0(this);
        setBackgroundResource(dzg0.bg_main_ripple);
        setDebounceClickListener(new oxe0(11, l1g0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$onItemClicked(l1g0 l1g0Var) {
        l1g0Var.z.a();
        x770 x770Var = (x770) l1g0Var.A.b;
        x770Var.a.a("PushSettingsMenuButton.Tapped", new HashMap(), 1, new HashMap());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        l1g0 l1g0Var = this.presenter;
        l1g0Var.Bg(this.mvpView);
        tje.N(l1g0Var.Jg(), null, null, new PushDisabledMenuItemPresenter$attachView$$inlined$collectIn$1(new m0(l1g0Var.B.a(), l1g0Var.y.a.a(), new PushDisabledMenuItemPresenter$attachView$1(3, null)), null, l1g0Var), 3);
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    public final void onMenuOpened() {
        l1g0 l1g0Var = this.presenter;
        if (getVisibility() != 0) {
            l1g0Var.getClass();
            return;
        }
        x770 x770Var = (x770) l1g0Var.A.b;
        x770Var.a.a("PushSettingsMenuButton.Shown", new HashMap(), 1, new HashMap());
    }
}
