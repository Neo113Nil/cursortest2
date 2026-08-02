package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class yh2 {
    public static final ThreadLocal i = new ThreadLocal();
    public final ymu e;
    public h0w h;
    public final ycs0 a = new ycs0();
    public final ArrayList b = new ArrayList();
    public final g191 c = new g191(this);
    public final jg d = new jg(20, this);
    public boolean f = false;
    public float g = 1.0f;

    public yh2(ymu ymuVar) {
        this.e = ymuVar;
    }

    public static yh2 b() {
        ThreadLocal threadLocal = i;
        if (threadLocal.get() == null) {
            threadLocal.set(new yh2(new ymu(12)));
        }
        return (yh2) threadLocal.get();
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, vh2] */
    public final void a(nwt0 nwt0Var) {
        float durationScale;
        ArrayList arrayList = this.b;
        if (arrayList.size() == 0) {
            ((Choreographer) this.e.b).postFrameCallback(new wh2(0, this.d));
            if (Build.VERSION.SDK_INT >= 33) {
                durationScale = ValueAnimator.getDurationScale();
                this.g = durationScale;
                if (this.h == null) {
                    this.h = new h0w(this);
                }
                final h0w h0wVar = this.h;
                if (((vh2) h0wVar.b) == null) {
                    ?? r1 = new ValueAnimator.DurationScaleChangeListener() { // from class: vh2
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f) {
                            ((yh2) h0w.this.c).g = f;
                        }
                    };
                    h0wVar.b = r1;
                    ValueAnimator.registerDurationScaleChangeListener(r1);
                }
            }
        }
        if (arrayList.contains(nwt0Var)) {
            return;
        }
        arrayList.add(nwt0Var);
    }

    public final boolean c() {
        ymu ymuVar = this.e;
        ymuVar.getClass();
        return Thread.currentThread() == ((Looper) ymuVar.c).getThread();
    }

    public final void d(y4n y4nVar) {
        this.a.remove(y4nVar);
        ArrayList arrayList = this.b;
        int indexOf = arrayList.indexOf(y4nVar);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
            this.f = true;
        }
    }
}
