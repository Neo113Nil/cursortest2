package ru.yandex.taxi.order.back;

import android.content.Context;
import android.widget.FrameLayout;
import com.yandex.go.taxi.order.back.a;
import defpackage.ge4;
import defpackage.jg;
import defpackage.nw70;
import defpackage.qje;
import defpackage.xng0;
import kotlin.Metadata;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.order.OrderFragment;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0018\u0010\u000e\u001a\u00060\rR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/order/back/BackButtonView;", "Lru/yandex/taxi/design/BackButtonIconComponent;", "Landroid/content/Context;", "context", "Lcom/yandex/go/taxi/order/back/a;", "presenter", "<init>", "(Landroid/content/Context;Lcom/yandex/go/taxi/order/back/a;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lcom/yandex/go/taxi/order/back/a;", "Lge4;", "innerView", "Lge4;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BackButtonView extends BackButtonIconComponent {
    public static final int $stable = BackButtonIconComponent.$stable | 8;
    private final ge4 innerView;
    private final a presenter;

    public BackButtonView(Context context, a aVar) {
        super(context, null, 0, 0, 14, null);
        this.presenter = aVar;
        this.innerView = new ge4(this);
        setVisibility(8);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        setBadgeBackgroundColor(qje.t(xng0.controlMain, getContext()));
        setBadgeTextColorAttr(xng0.textOnControl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(BackButtonView backButtonView) {
        ((OrderFragment) ((nw70) backButtonView.presenter.A).b).onBackPressed();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.Kg(this.innerView);
        setDebounceClickListener(new jg(28, this));
    }

    @Override // ru.yandex.taxi.design.FloatButtonIconComponent, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        setOnClickListener(null);
    }
}
