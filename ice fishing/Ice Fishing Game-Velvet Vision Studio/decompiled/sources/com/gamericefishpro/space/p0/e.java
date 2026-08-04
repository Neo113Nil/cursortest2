package com.gamericefishpro.space.p0;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.gamericefishpro.space.b0.k;
import com.gamericefishpro.space.o1.o;
import com.gamericefishpro.space.o1.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends View {
    public static final int[] y = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] z = new int[0];
    public g d;
    public Boolean e;
    public Long i;
    public com.appsflyer.a v;
    public com.gamericefishpro.space.a3.b w;

    private final void setRippleState(boolean z2) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.v;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.i;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z2 || jLongValue >= 5) {
            int[] iArr = z2 ? y : z;
            g gVar = this.d;
            if (gVar != null) {
                gVar.setState(iArr);
            }
        } else {
            com.appsflyer.a aVar = new com.appsflyer.a(15, this);
            this.v = aVar;
            postDelayed(aVar, 50L);
        }
        this.i = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(e eVar) {
        g gVar = eVar.d;
        if (gVar != null) {
            gVar.setState(z);
        }
        eVar.v = null;
    }

    public final void b(k kVar, boolean z2, long j, int i, long j2, com.gamericefishpro.space.a3.b bVar) {
        if (this.d == null || !Boolean.valueOf(z2).equals(this.e)) {
            g gVar = new g(z2);
            setBackground(gVar);
            this.d = gVar;
            this.e = Boolean.valueOf(z2);
        }
        g gVar2 = this.d;
        Intrinsics.b(gVar2);
        this.w = bVar;
        e(i, j, j2);
        if (z2) {
            gVar2.setHotspot(Float.intBitsToFloat((int) (kVar.a >> 32)), Float.intBitsToFloat((int) (kVar.a & 4294967295L)));
        } else {
            gVar2.setHotspot(gVar2.getBounds().centerX(), gVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.w = null;
        com.appsflyer.a aVar = this.v;
        if (aVar != null) {
            removeCallbacks(aVar);
            com.appsflyer.a aVar2 = this.v;
            Intrinsics.b(aVar2);
            aVar2.run();
        } else {
            g gVar = this.d;
            if (gVar != null) {
                gVar.setState(z);
            }
        }
        g gVar2 = this.d;
        if (gVar2 == null) {
            return;
        }
        gVar2.setVisible(false, false);
        unscheduleDrawable(gVar2);
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

    public final void e(int i, long j, long j2) {
        g gVar = this.d;
        if (gVar == null) {
            return;
        }
        Integer num = gVar.i;
        if (num == null || num.intValue() != i) {
            gVar.i = Integer.valueOf(i);
            gVar.setRadius(i);
        }
        float f = Build.VERSION.SDK_INT < 28 ? 0.1f * 2 : 0.1f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        long jC = s.c(j2, f);
        s sVar = gVar.e;
        if (!(sVar == null ? false : s.d(sVar.a, jC))) {
            gVar.e = new s(jC);
            gVar.setColor(ColorStateList.valueOf(o.y(jC)));
        }
        Rect rect = new Rect(0, 0, com.gamericefishpro.space.gi.c.a(Float.intBitsToFloat((int) (j >> 32))), com.gamericefishpro.space.gi.c.a(Float.intBitsToFloat((int) (j & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        gVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        com.gamericefishpro.space.a3.b bVar = this.w;
        if (bVar != null) {
            bVar.invoke();
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
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
    }
}
