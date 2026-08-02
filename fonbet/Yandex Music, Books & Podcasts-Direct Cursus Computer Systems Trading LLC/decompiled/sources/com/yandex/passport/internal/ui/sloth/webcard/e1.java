package com.yandex.passport.internal.ui.sloth.webcard;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.yandex.passport.R;
import defpackage.b6;
import defpackage.b6e;
import defpackage.ezf;
import defpackage.g4i;
import defpackage.hdu;
import defpackage.oj4;
import defpackage.qvc;
import defpackage.rof;
import defpackage.su4;
import defpackage.urq;
import kotlin.ranges.IntRange;

/* loaded from: classes4.dex */
public final class e1 extends b6 {
    public final Activity d;
    public final z0 e;
    public ValueAnimator f;
    public final b1 g;
    public int h;
    public int i;
    public final long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(Activity activity, z0 z0Var) {
        super(activity, 10);
        activity.getClass();
        z0Var.getClass();
        this.d = activity;
        this.e = z0Var;
        float f = g4i.a.density;
        float f2 = 16;
        this.g = new b1(20 * f, (int) (f2 * f), (int) (f2 * f), (int) (278 * f), c1.c);
        this.j = 200L;
    }

    public static int Q(IntRange intRange, float f) {
        int i = intRange.a;
        int i2 = intRange.b;
        if (i < i2) {
            return (int) (((i2 - i) * f) + i);
        }
        int i3 = (int) (i - ((i - i2) * f));
        return i3 > i2 ? i2 : i3;
    }

    public final void O(Float f, Integer num, Integer num2, Integer num3, c1 c1Var, long j) {
        b1 b1Var = this.g;
        int i = b1Var.d;
        if (i == 0) {
            i = ((FrameLayout) P().e()).getHeight();
        }
        float f2 = b1Var.a;
        int i2 = b1Var.b;
        int i3 = b1Var.c;
        int i4 = b1Var.d;
        c1 c1Var2 = b1Var.e;
        c1Var2.getClass();
        final b1 b1Var2 = new b1(f2, i2, i3, i4, c1Var2);
        b1Var2.d = i;
        int intValue = (num3 != null && num3.intValue() == 0) ? -1 : num3 != null ? num3.intValue() : b1Var.d;
        float floatValue = f != null ? f.floatValue() : b1Var.a;
        int intValue2 = num2 != null ? num2.intValue() : b1Var.b;
        int intValue3 = num != null ? num.intValue() : b1Var.c;
        if (c1Var == null) {
            c1Var = b1Var.e;
        }
        final b1 b1Var3 = new b1(floatValue, intValue2, intValue3, intValue, c1Var);
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f);
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yandex.passport.internal.ui.sloth.webcard.a1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i5;
                valueAnimator2.getClass();
                Object animatedValue = valueAnimator2.getAnimatedValue();
                animatedValue.getClass();
                float floatValue2 = ((Float) animatedValue).floatValue();
                e1 e1Var = e1.this;
                b1 b1Var4 = e1Var.g;
                b1 b1Var5 = b1Var2;
                float f3 = b1Var5.a;
                b1 b1Var6 = b1Var3;
                float f4 = b1Var6.a;
                float e = f3 < f4 ? su4.e(f4, f3, floatValue2, f3) : f3 - ((f3 - f4) * floatValue2);
                int Q = e1.Q(new IntRange(b1Var5.b, b1Var6.b, 1), floatValue2);
                int Q2 = e1.Q(new IntRange(b1Var5.c, b1Var6.c, 1), floatValue2);
                int Q3 = e1.Q(new IntRange(b1Var5.d, b1Var6.d, 1), floatValue2);
                c1 c1Var3 = floatValue2 < 50.0f ? b1Var5.e : b1Var6.e;
                c1Var3.getClass();
                b1Var4.getClass();
                b1Var4.a = e;
                b1Var4.c = Q2;
                b1Var4.b = Q;
                b1Var4.d = Q3;
                b1Var4.e = c1Var3;
                View e2 = e1Var.P().e();
                ViewGroup.LayoutParams layoutParams = e2.getLayoutParams();
                if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
                    layoutParams = null;
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                if (layoutParams2 != null) {
                    layoutParams2.height = b1Var4.d;
                    layoutParams2.width = -1;
                    layoutParams2.setMarginStart(b1Var4.b);
                    layoutParams2.setMarginEnd(b1Var4.b);
                    int i6 = b1Var4.c;
                    layoutParams2.topMargin = e1Var.h + i6;
                    layoutParams2.bottomMargin = i6 + e1Var.i;
                    int ordinal = b1Var4.e.ordinal();
                    if (ordinal == 0) {
                        i5 = 49;
                    } else if (ordinal == 1) {
                        i5 = 17;
                    } else {
                        if (ordinal != 2) {
                            b6e.s();
                            return;
                        }
                        i5 = 81;
                    }
                    layoutParams2.gravity = i5;
                    e2.setLayoutParams(layoutParams2);
                }
                ((FrameLayout) e1Var.P().e()).requestLayout();
                ((FrameLayout) e1Var.P().e()).invalidateOutline();
            }
        });
        ofFloat.addListener(new d1(num3, this));
        ofFloat.start();
        this.f = ofFloat;
    }

    public final urq P() {
        com.yandex.passport.sloth.ui.b0 b0Var = (com.yandex.passport.sloth.ui.b0) this.e.d.getValue();
        b0Var.getClass();
        return new urq(b0Var);
    }

    @Override // defpackage.b6
    public final void w(View view) {
        ((FrameLayout) view).getClass();
        View e = P().e();
        ViewGroup.LayoutParams layoutParams = e.getLayoutParams();
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            b1 b1Var = this.g;
            layoutParams2.height = b1Var.d;
            layoutParams2.width = -1;
            layoutParams2.setMarginStart(b1Var.b);
            layoutParams2.setMarginEnd(b1Var.b);
            int i = b1Var.c;
            layoutParams2.topMargin = this.h + i;
            layoutParams2.bottomMargin = i + this.i;
            layoutParams2.gravity = 81;
            e.setLayoutParams(layoutParams2);
        }
        ((FrameLayout) P().e()).setClipToOutline(true);
        ((FrameLayout) P().e()).setOutlineProvider(new oj4(2, this));
        ((FrameLayout) P().e()).requestLayout();
        ((FrameLayout) P().e()).invalidateOutline();
    }

    @Override // defpackage.b6
    public final View z(hdu hduVar) {
        qvc qvcVar = new qvc(ezf.a0(hduVar.getCtx(), 0), 0, 0);
        if (hduVar instanceof rof) {
            ((rof) hduVar).j(qvcVar);
        }
        qvcVar.setBackgroundResource(R.drawable.passport_bg_webcard);
        qvcVar.b(P().e(), new com.yandex.passport.internal.storage.d(15));
        return qvcVar;
    }
}
