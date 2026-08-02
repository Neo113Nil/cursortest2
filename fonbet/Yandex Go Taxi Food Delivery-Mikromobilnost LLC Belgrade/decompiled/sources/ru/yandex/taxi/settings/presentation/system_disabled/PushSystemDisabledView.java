package ru.yandex.taxi.settings.presentation.system_disabled;

import android.content.Context;
import android.widget.LinearLayout;
import defpackage.d6z;
import defpackage.oxe0;
import defpackage.p3g0;
import defpackage.v4g0;
import defpackage.veh0;
import defpackage.w4g0;
import defpackage.x4g0;
import defpackage.yqh0;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\n \u0011*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/settings/presentation/system_disabled/PushSystemDisabledView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Lw4g0;", "presenter", "<init>", "(Landroid/content/Context;Lw4g0;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lw4g0;", "Lv4g0;", "mvpView", "Lv4g0;", "Lru/yandex/taxi/design/ListTitleComponent;", "kotlin.jvm.PlatformType", "sectionTitle", "Lru/yandex/taxi/design/ListTitleComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "item", "Lru/yandex/taxi/design/ListItemComponent;", "x4g0", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PushSystemDisabledView extends LinearLayout {
    private final ListItemComponent item;
    private final v4g0 mvpView;
    private final w4g0 presenter;
    private final ListTitleComponent sectionTitle;

    public PushSystemDisabledView(Context context, w4g0 w4g0Var) {
        super(context);
        this.presenter = w4g0Var;
        setOrientation(1);
        c.q(this, yqh0.push_settings_system_disabled_view, true);
        this.mvpView = new x4g0(this);
        this.sectionTitle = (ListTitleComponent) findViewById(veh0.notifications_system_disabled_section_title);
        ListItemComponent listItemComponent = (ListItemComponent) findViewById(veh0.notifications_system_disabled_item);
        this.item = listItemComponent;
        listItemComponent.setDebounceClickListener(new oxe0(13, w4g0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$openNotificationSettings(w4g0 w4g0Var) {
        w4g0Var.x.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        w4g0 w4g0Var = this.presenter;
        w4g0Var.Bg(this.mvpView);
        p3g0 a = w4g0Var.w.a();
        v4g0 v4g0Var = (v4g0) w4g0Var.Dg();
        a.getClass();
        v4g0Var.f3(d6z.Y(a, "disabled_notifications_title"));
        ((v4g0) w4g0Var.Dg()).Ae(d6z.Y(a, "disabled_notifications_link_title"));
        ((v4g0) w4g0Var.Dg()).Rc(d6z.Y(a, "disabled_notifications_link_description"));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
