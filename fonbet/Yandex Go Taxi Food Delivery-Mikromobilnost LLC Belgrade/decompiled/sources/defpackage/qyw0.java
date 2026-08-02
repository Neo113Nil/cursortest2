package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.mainscreen.superapp.orders.presentation.ui.f;
import com.yandex.go.mainscreen.superapp.orders.presentation.ui.swipeable.SwipeableTrackingCardDeferButtonView;
import com.yandex.go.superapp.orders.card.OrderCardView;
import defpackage.qyw0;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes12.dex */
public final class qyw0 extends v501 {
    public final chw0 V;
    public final SwipeableTrackingCardDeferButtonView W;
    public ValueAnimator Z;
    public nwt0 a0;
    public i501 b0;

    public qyw0(View view, pav pavVar, wn70 wn70Var, w301 w301Var, f2z f2zVar, chw0 chw0Var) {
        super(view, pavVar, wn70Var, f2zVar, (OrderCardView) view.findViewById(zih0.order_card), w301Var);
        this.V = chw0Var;
        this.W = (SwipeableTrackingCardDeferButtonView) view.findViewById(zih0.defer_button);
        this.b0 = f501.a;
    }

    @Override // defpackage.v501, defpackage.wys
    public final void Y() {
        super.Y();
        this.b0 = f501.a;
        i0();
        OrderCardView orderCardView = this.R;
        orderCardView.setAlpha(1.0f);
        orderCardView.setTranslationX(0.0f);
        SwipeableTrackingCardDeferButtonView swipeableTrackingCardDeferButtonView = this.W;
        swipeableTrackingCardDeferButtonView.setAlpha(0.0f);
        swipeableTrackingCardDeferButtonView.resetReveal();
    }

    public final void d0(final sls slsVar, final sls slsVar2, tls tlsVar) {
        ValueAnimator valueAnimator = this.Z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(250L);
        ofFloat.addUpdateListener(new nj2(8, tlsVar));
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.yandex.go.mainscreen.superapp.orders.presentation.ui.swipeable.SwipeableTrackingCardViewHolder$animateDismiss$1$2
            private boolean isFinished;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                qyw0.this.Z = null;
                if (this.isFinished) {
                    return;
                }
                this.isFinished = true;
                slsVar2.invoke();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                qyw0.this.Z = null;
                if (this.isFinished) {
                    return;
                }
                this.isFinished = true;
                slsVar.invoke();
            }
        });
        ofFloat.start();
        this.Z = ofFloat;
        qke.E(this.a.getContext(), HapticController$Effect.CLICK_LIGHT, false, 8);
    }

    public final void e0(final j501 j501Var) {
        i0();
        View view = this.a;
        float f = xw31.n(view.getContext()) ? 900.0f : -900.0f;
        owt0 owt0Var = new owt0(0.0f);
        owt0Var.b(375.0f);
        owt0Var.a(0.5f);
        nwt0 nwt0Var = new nwt0(this.R, 0.0f);
        nwt0Var.a = f;
        nwt0Var.u = owt0Var;
        nwt0Var.b(new x4n() { // from class: myw0
            @Override // defpackage.x4n
            public final void d(float f2) {
                qyw0.this.W.resetReveal();
            }
        });
        nwt0Var.a(new w4n() { // from class: nyw0
            @Override // defpackage.w4n
            public final void a(y4n y4nVar, boolean z, float f2, float f3) {
                qyw0 qyw0Var = qyw0.this;
                qyw0Var.a0 = null;
                qyw0Var.W.resetReveal();
                if (z) {
                    return;
                }
                j501Var.invoke();
            }
        });
        nwt0Var.h();
        this.a0 = nwt0Var;
        qke.E(view.getContext(), HapticController$Effect.CLICK_LIGHT, false, 8);
    }

    public final void f0(float f, final boolean z, final j501 j501Var) {
        OrderCardView orderCardView = this.R;
        float translationX = orderCardView.getTranslationX();
        i0();
        float f2 = f < translationX ? -900.0f : 900.0f;
        owt0 owt0Var = new owt0(f);
        owt0Var.b(375.0f);
        owt0Var.a(0.5f);
        nwt0 nwt0Var = this.a0;
        if (nwt0Var != null) {
            nwt0Var.c();
        }
        nwt0 nwt0Var2 = new nwt0(orderCardView, f);
        nwt0Var2.a = f2;
        nwt0Var2.u = owt0Var;
        nwt0Var2.b(new x4n() { // from class: oyw0
            @Override // defpackage.x4n
            public final void d(float f3) {
                qyw0.this.W.updateRevealProgressByTranslation(f3, z);
            }
        });
        nwt0Var2.a(new w4n() { // from class: pyw0
            @Override // defpackage.w4n
            public final void a(y4n y4nVar, boolean z2, float f3, float f4) {
                qyw0 qyw0Var = qyw0.this;
                qyw0Var.a0 = null;
                qyw0Var.W.updateRevealProgressByTranslation(f3, z);
                if (z2) {
                    return;
                }
                j501Var.invoke();
            }
        });
        nwt0Var2.h();
        this.a0 = nwt0Var2;
    }

    public final void g0(sls slsVar, sls slsVar2) {
        i0();
        View view = this.a;
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        int width = recyclerView != null ? recyclerView.getWidth() : view.getWidth();
        OrderCardView orderCardView = this.R;
        d0(slsVar, slsVar2, new lyw0(orderCardView.getTranslationX(), xw31.n(view.getContext()) ? width : -width, this, orderCardView.getAlpha(), this.W.getAlpha(), r3.getMeasuredWidth()));
    }

    @Override // defpackage.v501
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public final void c(kyw0 kyw0Var) {
        boolean l = jl40.l(this.U, kyw0Var.a);
        SwipeableTrackingCardDeferButtonView swipeableTrackingCardDeferButtonView = this.W;
        if (!l) {
            i0();
            OrderCardView orderCardView = this.R;
            orderCardView.setAlpha(1.0f);
            orderCardView.setTranslationX(0.0f);
            swipeableTrackingCardDeferButtonView.setAlpha(0.0f);
            swipeableTrackingCardDeferButtonView.resetReveal();
        }
        super.c(kyw0Var);
        i501 i501Var = kyw0Var.c;
        this.b0 = i501Var;
        if (i501Var instanceof g501) {
            swipeableTrackingCardDeferButtonView.setText(((g501) i501Var).a);
        } else {
            if (jl40.l(i501Var, f501.a) || jl40.l(i501Var, h501.a)) {
                return;
            }
            w511.b();
        }
    }

    public final void i0() {
        nwt0 nwt0Var = this.a0;
        if (nwt0Var != null) {
            nwt0Var.c();
        }
        this.a0 = null;
        ValueAnimator valueAnimator = this.Z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.Z = null;
    }

    public final float j0() {
        return this.W.getRevealAnchorOffset();
    }

    public final i501 k0() {
        return this.b0;
    }

    public final float l0() {
        return this.R.getTranslationX();
    }

    public final boolean m0(float f) {
        return this.W.isRevealed(f);
    }

    public final void n0(f fVar) {
        SwipeableTrackingCardDeferButtonView swipeableTrackingCardDeferButtonView = this.W;
        if (swipeableTrackingCardDeferButtonView.hasOnClickListeners()) {
            return;
        }
        c.z(fVar, swipeableTrackingCardDeferButtonView);
    }

    public final void o0(float f) {
        this.R.setTranslationX(f);
        SwipeableTrackingCardDeferButtonView.updateRevealProgressByTranslation$default(this.W, f, false, 2, null);
    }
}
