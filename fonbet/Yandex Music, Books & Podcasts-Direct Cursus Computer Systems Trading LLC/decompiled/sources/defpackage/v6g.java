package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class v6g extends b6 {
    public static final int[] l = {533, 567, 850, 750};
    public static final int[] m = {1267, 1000, 333, 0};
    public static final mb4 n = new mb4(Float.class, "animationFraction", 12);
    public ObjectAnimator d;
    public ObjectAnimator e;
    public final Interpolator[] f;
    public final h7g g;
    public int h;
    public boolean i;
    public float j;
    public ek0 k;

    public v6g(Context context, h7g h7gVar) {
        super(2);
        this.h = 0;
        this.k = null;
        this.g = h7gVar;
        this.f = new Interpolator[]{AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // defpackage.b6
    public final void H(ys2 ys2Var) {
        this.k = ys2Var;
    }

    @Override // defpackage.b6
    public final void I() {
        ObjectAnimator objectAnimator = this.e;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        h();
        if (((qie) this.b).isVisible()) {
            this.e.setFloatValues(this.j, 1.0f);
            this.e.setDuration((long) ((1.0f - this.j) * 1800.0f));
            this.e.start();
        }
    }

    @Override // defpackage.b6
    public final void L() {
        O();
        P();
        this.d.start();
    }

    @Override // defpackage.b6
    public final void N() {
        this.k = null;
    }

    public final void O() {
        ObjectAnimator objectAnimator = this.d;
        int i = 0;
        h7g h7gVar = this.g;
        mb4 mb4Var = n;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, mb4Var, 0.0f, 1.0f);
            this.d = ofFloat;
            ofFloat.setDuration((long) (h7gVar.n * 1800.0f));
            this.d.setInterpolator(null);
            this.d.setRepeatCount(-1);
            this.d.addListener(new u6g(this, i));
        }
        if (this.e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, mb4Var, 1.0f);
            this.e = ofFloat2;
            ofFloat2.setDuration((long) (h7gVar.n * 1800.0f));
            this.e.setInterpolator(null);
            this.e.addListener(new u6g(this, 1));
        }
    }

    public final void P() {
        this.h = 0;
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            ((gqa) it.next()).c = this.g.e[0];
        }
    }

    @Override // defpackage.b6
    public final void h() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.b6
    public final void x() {
        O();
        ObjectAnimator objectAnimator = this.d;
        h7g h7gVar = this.g;
        objectAnimator.setDuration((long) (h7gVar.n * 1800.0f));
        this.e.setDuration((long) (h7gVar.n * 1800.0f));
        P();
    }
}
