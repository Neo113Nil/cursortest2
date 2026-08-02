package ru.yandex.taxi.tollroad.alert.item;

import android.content.Context;
import android.view.View;
import defpackage.koz0;
import defpackage.mdh;
import defpackage.qw31;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vmu0;
import defpackage.w030;
import defpackage.xqz0;
import defpackage.yqz0;
import kotlin.Metadata;
import kotlinx.coroutines.flow.internal.g;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0016B3\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/tollroad/alert/item/TollRoadRideInfoView;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Lxqz0;", "presenter", "Lw030;", "modalViewCoordinator", "Lqw31;", "visibilityChangedSubscriber", "Lkoz0;", "tollRoadAlertAnalytics", "<init>", "(Landroid/content/Context;Lxqz0;Lw030;Lqw31;Lkoz0;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lxqz0;", "Lw030;", "Lqw31;", "Lkoz0;", "yqz0", "alert"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TollRoadRideInfoView extends ListItemComponent {
    private final w030 modalViewCoordinator;
    private final xqz0 presenter;
    private final koz0 tollRoadAlertAnalytics;
    private final qw31 visibilityChangedSubscriber;

    public TollRoadRideInfoView(Context context, xqz0 xqz0Var, w030 w030Var, qw31 qw31Var, koz0 koz0Var) {
        super(context, null, 0, 6, null);
        this.presenter = xqz0Var;
        this.modalViewCoordinator = w030Var;
        this.visibilityChangedSubscriber = qw31Var;
        this.tollRoadAlertAnalytics = koz0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(TollRoadRideInfoView tollRoadRideInfoView, View view) {
        xqz0 xqz0Var = tollRoadRideInfoView.presenter;
        if (xqz0Var.x.a.b().V().b0.a()) {
            tje.N(xqz0Var.Jg(), null, null, new TollRoadRideInfoPresenter$onClick$1(xqz0Var, null), 3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        xqz0 xqz0Var = this.presenter;
        yqz0 yqz0Var = new yqz0(this);
        xqz0Var.Bg(yqz0Var);
        yqz0Var.J4(false);
        g a = xqz0Var.x.a.a();
        sjh sjhVar = uyj.a;
        tje.N(xqz0Var.Jg(), null, null, new TollRoadRideInfoPresenter$attachView$$inlined$safeCollectIn$1(new e(new b(kotlinx.coroutines.flow.e.F(a, mdh.b)), xqz0Var.y), null, xqz0Var), 3);
        setOnClickListener(new vmu0(12, this));
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.presenter.Cg();
        super.onDetachedFromWindow();
    }
}
