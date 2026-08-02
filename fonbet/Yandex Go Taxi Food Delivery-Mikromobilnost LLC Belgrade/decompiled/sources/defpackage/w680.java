package defpackage;

import android.view.View;
import com.yandex.go.superapp.order.multi.old.view.OrderStackView;
import com.yandex.go.superapp.order.multi.old.view.OrderStackViewsController;
import com.yandex.go.taxi.order.stack.OrderStackMvpView;

/* loaded from: classes14.dex */
public final class w680 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ OrderStackView b;
    public final /* synthetic */ View c;
    public final /* synthetic */ OrderStackMvpView.AnimationType w;

    public /* synthetic */ w680(OrderStackView orderStackView, View view, OrderStackMvpView.AnimationType animationType, int i) {
        this.a = i;
        this.b = orderStackView;
        this.c = view;
        this.w = animationType;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OrderStackViewsController orderStackViewsController;
        OrderStackViewsController orderStackViewsController2;
        int i = this.a;
        OrderStackMvpView.AnimationType animationType = this.w;
        View view = this.c;
        OrderStackView orderStackView = this.b;
        switch (i) {
            case 0:
                orderStackViewsController = orderStackView.stackViewsController;
                orderStackViewsController.b(view, animationType, OrderStackViewsController.TranslationDirection.TO_LEFT);
                break;
            default:
                orderStackViewsController2 = orderStackView.stackViewsController;
                orderStackViewsController2.c(view, animationType, uj.D, OrderStackViewsController.TranslationDirection.TO_LEFT);
                break;
        }
    }
}
