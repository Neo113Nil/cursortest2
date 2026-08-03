package i0;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import bc.a0;
import f1.d0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n extends View {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f2979l = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f2980m = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public w f2981g;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f2982h;

    /* renamed from: i, reason: collision with root package name */
    public Long f2983i;

    /* renamed from: j, reason: collision with root package name */
    public a1.a f2984j;

    /* renamed from: k, reason: collision with root package name */
    public oc.a f2985k;

    private final void setRippleState(boolean z10) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f2984j;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.f2983i;
        long longValue = currentAnimationTimeMillis - (l10 != null ? l10.longValue() : 0L);
        if (z10 || longValue >= 5) {
            int[] iArr = z10 ? f2979l : f2980m;
            w wVar = this.f2981g;
            if (wVar != null) {
                wVar.setState(iArr);
            }
        } else {
            a1.a aVar = new a1.a(10, this);
            this.f2984j = aVar;
            postDelayed(aVar, 50L);
        }
        this.f2983i = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(n nVar) {
        w wVar = nVar.f2981g;
        if (wVar != null) {
            wVar.setState(f2980m);
        }
        nVar.f2984j = null;
    }

    public final void b(y.k kVar, boolean z10, long j3, int i10, long j6, float f10, oc.a aVar) {
        if (this.f2981g == null || !Boolean.valueOf(z10).equals(this.f2982h)) {
            w wVar = new w(z10);
            setBackground(wVar);
            this.f2981g = wVar;
            this.f2982h = Boolean.valueOf(z10);
        }
        w wVar2 = this.f2981g;
        pc.j.b(wVar2);
        this.f2985k = aVar;
        Integer num = wVar2.f3006i;
        if (num == null || num.intValue() != i10) {
            wVar2.f3006i = Integer.valueOf(i10);
            v.f3003a.a(wVar2, i10);
        }
        e(j3, j6, f10);
        if (z10) {
            wVar2.setHotspot(e1.b.d(kVar.f8414a), e1.b.e(kVar.f8414a));
        } else {
            wVar2.setHotspot(wVar2.getBounds().centerX(), wVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.f2985k = null;
        a1.a aVar = this.f2984j;
        if (aVar != null) {
            removeCallbacks(aVar);
            a1.a aVar2 = this.f2984j;
            pc.j.b(aVar2);
            aVar2.run();
        } else {
            w wVar = this.f2981g;
            if (wVar != null) {
                wVar.setState(f2980m);
            }
        }
        w wVar2 = this.f2981g;
        if (wVar2 == null) {
            return;
        }
        wVar2.setVisible(false, false);
        unscheduleDrawable(wVar2);
    }

    public final void d() {
        setRippleState(false);
    }

    public final void e(long j3, long j6, float f10) {
        w wVar = this.f2981g;
        if (wVar == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            f10 *= 2;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        long b2 = f1.q.b(j6, f10);
        f1.q qVar = wVar.f3005h;
        if (!(qVar == null ? false : f1.q.c(qVar.f2285a, b2))) {
            wVar.f3005h = new f1.q(b2);
            wVar.setColor(ColorStateList.valueOf(d0.s(b2)));
        }
        Rect rect = new Rect(0, 0, a0.I(e1.e.d(j3)), a0.I(e1.e.b(j3)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        wVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        oc.a aVar = this.f2985k;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
