package U1;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;

/* loaded from: classes.dex */
public abstract class f extends e {

    /* renamed from: U, reason: collision with root package name */
    public final e[] f3274U;

    /* renamed from: V, reason: collision with root package name */
    public int f3275V;

    public f() {
        e[] l9 = l();
        this.f3274U = l9;
        for (e eVar : l9) {
            eVar.setCallback(this);
        }
        k(this.f3274U);
    }

    @Override // U1.e
    public final int c() {
        return this.f3275V;
    }

    @Override // U1.e
    public ValueAnimator d() {
        return null;
    }

    @Override // U1.e, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        h(canvas);
    }

    @Override // U1.e
    public final void e(int i) {
        this.f3275V = i;
        for (int i4 = 0; i4 < j(); i4++) {
            i(i4).e(i);
        }
    }

    public void h(Canvas canvas) {
        e[] eVarArr = this.f3274U;
        if (eVarArr != null) {
            for (e eVar : eVarArr) {
                int save = canvas.save();
                eVar.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
    }

    public final e i(int i) {
        e[] eVarArr = this.f3274U;
        if (eVarArr == null) {
            return null;
        }
        return eVarArr[i];
    }

    @Override // U1.e, android.graphics.drawable.Animatable
    public final boolean isRunning() {
        e[] eVarArr = this.f3274U;
        int length = eVarArr.length;
        boolean z8 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (eVarArr[i].isRunning()) {
                z8 = true;
                break;
            }
            i++;
        }
        return z8 || super.isRunning();
    }

    public final int j() {
        e[] eVarArr = this.f3274U;
        if (eVarArr == null) {
            return 0;
        }
        return eVarArr.length;
    }

    public abstract e[] l();

    @Override // U1.e, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        for (e eVar : this.f3274U) {
            eVar.setBounds(rect);
        }
    }

    @Override // U1.e, android.graphics.drawable.Animatable
    public final void start() {
        super.start();
        for (e eVar : this.f3274U) {
            eVar.start();
        }
    }

    @Override // U1.e, android.graphics.drawable.Animatable
    public final void stop() {
        super.stop();
        for (e eVar : this.f3274U) {
            eVar.stop();
        }
    }

    @Override // U1.e
    public final void b(Canvas canvas) {
    }

    public void k(e... eVarArr) {
    }
}
