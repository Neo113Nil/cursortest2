package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import com.yandex.go.taxi.summary.ui.SafeCoordinatorLayout;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.design.DialogueComponent;
import ru.yandex.taxi.design.DotsIndicatorComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.LocationButtonIconComponent;
import ru.yandex.taxi.design.button.OrderButtonComponent;
import ru.yandex.taxi.preorder.summary.solid.SolidSummaryView;
import ru.yandex.taxi.preorder.summary.solid.cardhandler.SummaryArrowsView;

/* loaded from: classes6.dex */
public final class t7t0 implements zo31 {
    public final SolidSummaryView a;
    public final View b;
    public final FrameLayout c;
    public final View d;
    public final FrameLayout e;
    public final SafeCoordinatorLayout f;
    public final View g;
    public final LinearLayout h;
    public final ConstraintLayout i;
    public final DialogueComponent j;
    public final DotsIndicatorComponent k;
    public final FrameLayout l;
    public final View m;
    public final CompositePaymentIconsView n;
    public final GoFrameLayout o;
    public final BackButtonIconComponent p;
    public final nzm q;
    public final FrameLayout r;
    public final ViewStub s;

    public t7t0(SolidSummaryView solidSummaryView, View view, FrameLayout frameLayout, View view2, FrameLayout frameLayout2, SafeCoordinatorLayout safeCoordinatorLayout, View view3, SummaryArrowsView summaryArrowsView, LinearLayout linearLayout, ConstraintLayout constraintLayout, DialogueComponent dialogueComponent, DotsIndicatorComponent dotsIndicatorComponent, FrameLayout frameLayout3, View view4, FrameLayout frameLayout4, OrderButtonComponent orderButtonComponent, ImageView imageView, CompositePaymentIconsView compositePaymentIconsView, GoFrameLayout goFrameLayout, LocationButtonIconComponent locationButtonIconComponent, BackButtonIconComponent backButtonIconComponent, nzm nzmVar, FloatButtonIconComponent floatButtonIconComponent, FrameLayout frameLayout5, ViewStub viewStub) {
        this.a = solidSummaryView;
        this.b = view;
        this.c = frameLayout;
        this.d = view2;
        this.e = frameLayout2;
        this.f = safeCoordinatorLayout;
        this.g = view3;
        this.h = linearLayout;
        this.i = constraintLayout;
        this.j = dialogueComponent;
        this.k = dotsIndicatorComponent;
        this.l = frameLayout3;
        this.m = view4;
        this.n = compositePaymentIconsView;
        this.o = goFrameLayout;
        this.p = backButtonIconComponent;
        this.q = nzmVar;
        this.r = frameLayout5;
        this.s = viewStub;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
