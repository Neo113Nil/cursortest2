package W1;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;

/* loaded from: classes.dex */
public abstract class f extends e {

    /* renamed from: U, reason: collision with root package name */
    public final e[] f3565U;

    /* renamed from: V, reason: collision with root package name */
    public int f3566V;

    public f() {
        e[] l9 = l();
        this.f3565U = l9;
        for (e eVar : l9) {
            eVar.setCallback(this);
        }
        k(this.f3565U);
    }

    @Override // W1.e
    public final int c() {
        return this.f3566V;
    }

    @Override // W1.e
    public ValueAnimator d() {
        return null;
    }

    @Override // W1.e, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        h(canvas);
    }

    @Override // W1.e
    public final void e(int i) {
        this.f3566V = i;
        for (int i4 = 0; i4 < j(); i4++) {
            i(i4).e(i);
        }
    }

    public void h(Canvas canvas) {
        e[] eVarArr = this.f3565U;
        if (eVarArr != null) {
            for (e eVar : eVarArr) {
                int save = canvas.save();
                eVar.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
    }

    public final e i(int i) {
        e[] eVarArr = this.f3565U;
        if (eVarArr == null) {
            return null;
        }
        return eVarArr[i];
    }

    @Override // W1.e, android.graphics.drawable.Animatable
    public final boolean isRunning() {
        e[] eVarArr = this.f3565U;
        int length = eVarArr.length;
        boolean z6 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (eVarArr[i].isRunning()) {
                z6 = true;
                break;
            }
            i++;
        }
        return z6 || super.isRunning();
    }

    public final int j() {
        e[] eVarArr = this.f3565U;
        if (eVarArr == null) {
            return 0;
        }
        return eVarArr.length;
    }

    public abstract e[] l();

    @Override // W1.e, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        for (e eVar : this.f3565U) {
            eVar.setBounds(rect);
        }
    }

    @Override // W1.e, android.graphics.drawable.Animatable
    public final void start() {
        super.start();
        for (e eVar : this.f3565U) {
            eVar.start();
        }
    }

    @Override // W1.e, android.graphics.drawable.Animatable
    public final void stop() {
        super.stop();
        for (e eVar : this.f3565U) {
            eVar.stop();
        }
    }

    @Override // W1.e
    public final void b(Canvas canvas) {
    }

    public void k(e... eVarArr) {
    }
}
