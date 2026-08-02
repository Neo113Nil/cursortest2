package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.Choreographer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class hm0 {
    public static final ThreadLocal i = new ThreadLocal();
    public final xiu e;
    public fm0 h;
    public final ciq a = new ciq(0);
    public final ArrayList b = new ArrayList();
    public final rp7 c = new rp7(this);
    public final he0 d = new he0(3, this);
    public boolean f = false;
    public float g = 1.0f;

    public hm0(xiu xiuVar) {
        this.e = xiuVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.animation.ValueAnimator$DurationScaleChangeListener, em0] */
    public final void a(y8r y8rVar) {
        ArrayList arrayList = this.b;
        if (arrayList.size() == 0) {
            ((Choreographer) this.e.b).postFrameCallback(new gm0(this.d, 0));
            if (Build.VERSION.SDK_INT >= 33) {
                this.g = ValueAnimator.getDurationScale();
                if (this.h == null) {
                    this.h = new fm0(this);
                }
                final fm0 fm0Var = this.h;
                if (fm0Var.a == null) {
                    ?? r2 = new ValueAnimator.DurationScaleChangeListener() { // from class: em0
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f) {
                            fm0.this.b.g = f;
                        }
                    };
                    fm0Var.a = r2;
                    ValueAnimator.registerDurationScaleChangeListener(r2);
                }
            }
        }
        if (arrayList.contains(y8rVar)) {
            return;
        }
        arrayList.add(y8rVar);
    }
}
