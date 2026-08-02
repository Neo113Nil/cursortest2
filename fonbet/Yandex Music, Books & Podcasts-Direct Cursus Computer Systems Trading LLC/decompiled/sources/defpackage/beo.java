package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class beo extends View {
    public static final int[] f = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] g = new int[0];
    public glt a;
    public Boolean b;
    public Long c;
    public dyg d;
    public Function0 e;

    public beo(@NotNull Context context) {
        super(context);
    }

    private final void setRippleState(boolean z) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.c;
        long longValue = currentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || longValue >= 5) {
            int[] iArr = z ? f : g;
            glt gltVar = this.a;
            if (gltVar != null) {
                gltVar.setState(iArr);
            }
        } else {
            dyg dygVar = new dyg(28, this);
            this.d = dygVar;
            postDelayed(dygVar, 50L);
        }
        this.c = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(beo beoVar) {
        glt gltVar = beoVar.a;
        if (gltVar != null) {
            gltVar.setState(g);
        }
        beoVar.d = null;
    }

    public final void b(rqm rqmVar, boolean z, long j, int i, long j2, float f2, Function0 function0) {
        if (this.a == null || !Boolean.valueOf(z).equals(this.b)) {
            glt gltVar = new glt(z);
            setBackground(gltVar);
            this.a = gltVar;
            this.b = Boolean.valueOf(z);
        }
        glt gltVar2 = this.a;
        gltVar2.getClass();
        this.e = function0;
        e(f2, i, j, j2);
        if (z) {
            gltVar2.setHotspot(enj.e(rqmVar.a), enj.f(rqmVar.a));
        } else {
            gltVar2.setHotspot(gltVar2.getBounds().centerX(), gltVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.e = null;
        dyg dygVar = this.d;
        if (dygVar != null) {
            removeCallbacks(dygVar);
            dyg dygVar2 = this.d;
            dygVar2.getClass();
            dygVar2.run();
        } else {
            glt gltVar = this.a;
            if (gltVar != null) {
                gltVar.setState(g);
            }
        }
        glt gltVar2 = this.a;
        if (gltVar2 == null) {
            return;
        }
        gltVar2.setVisible(false, false);
        unscheduleDrawable(gltVar2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(float f2, int i, long j, long j2) {
        glt gltVar = this.a;
        if (gltVar == null) {
            return;
        }
        Integer num = gltVar.c;
        if (num == null || num.intValue() != i) {
            gltVar.c = Integer.valueOf(i);
            gltVar.setRadius(i);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f2 *= 2;
        }
        long b = d85.b(j2, f2 > 1.0f ? 1.0f : f2, 0.0f, 0.0f, 0.0f, 14);
        d85 d85Var = gltVar.b;
        if (!(d85Var == null ? false : d85.c(d85Var.a, b))) {
            gltVar.b = new d85(b);
            gltVar.setColor(ColorStateList.valueOf(c3x.U(b)));
        }
        Rect rect = new Rect(0, 0, eeh.b(nmq.d(j)), eeh.b(nmq.b(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        gltVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Function0 function0 = this.e;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
