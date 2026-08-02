package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ipv extends View implements Application.ActivityLifecycleCallbacks, yn7 {
    public final Activity a;
    public final dkj b;
    public final bkj c;
    public nyf d;
    public boolean e;
    public boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ipv(@NotNull Activity activity) {
        super(activity);
        activity.getClass();
        this.a = activity;
        dkj dkjVar = new dkj();
        this.b = dkjVar;
        this.c = new bkj(dkjVar);
        setWillNotDraw(true);
    }

    public final void a() {
        bkj bkjVar = this.c;
        bkjVar.a();
        while (bkjVar.hasNext()) {
            qrq qrqVar = (qrq) bkjVar.next();
            boolean z = this.f;
            if (qrqVar.g != z) {
                qrqVar.g = z;
                if (qrqVar.e && qrqVar.h) {
                    srq srqVar = qrqVar.a;
                    if (z) {
                        srqVar.onResume();
                    } else {
                        srqVar.a();
                    }
                }
            }
        }
    }

    public final void b() {
        bkj bkjVar = this.c;
        bkjVar.a();
        while (bkjVar.hasNext()) {
            qrq qrqVar = (qrq) bkjVar.next();
            boolean z = this.e;
            if (qrqVar.f != z) {
                qrqVar.f = z;
                if (qrqVar.e) {
                    if (qrqVar.h) {
                        srq srqVar = qrqVar.a;
                        if (z) {
                            srqVar.b();
                        } else {
                            srqVar.onStop();
                        }
                    }
                    qrqVar.f = z;
                }
            }
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.getClass();
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        bkj bkjVar = this.c;
        bkjVar.a();
        while (bkjVar.hasNext()) {
            ((qrq) bkjVar.next()).c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        if (this.a != activity) {
            return;
        }
        this.f = false;
        a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        if (this.a != activity) {
            return;
        }
        this.f = true;
        a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
        if (this.a != activity) {
            return;
        }
        this.e = true;
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        if (this.a != activity) {
            return;
        }
        this.e = false;
        b();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Activity q = o8g.q(getContext());
        if (!(q instanceof t)) {
            boolean z = getWindowVisibility() == 0;
            this.e = z;
            if (z && this.a.getWindow().isActive()) {
                r2 = true;
            }
            this.f = r2;
            q.getApplication().registerActivityLifecycleCallbacks(this);
            return;
        }
        nyf lifecycle = ((t) q).getLifecycle();
        this.d = lifecycle;
        lifecycle.getClass();
        lyf b = lifecycle.b();
        this.e = b.compareTo(lyf.d) >= 0;
        this.f = b.compareTo(lyf.e) >= 0;
        nyf nyfVar = this.d;
        nyfVar.getClass();
        nyfVar.a(this);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        bkj bkjVar = this.c;
        bkjVar.a();
        while (bkjVar.hasNext()) {
            qrq qrqVar = (qrq) bkjVar.next();
            qrqVar.getClass();
            if (qrqVar.h) {
                boolean z = qrqVar.g;
            }
        }
    }

    @Override // defpackage.yn7
    public final void onCreate(dzf dzfVar) {
        dzfVar.getClass();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.a.getApplication().unregisterActivityLifecycleCallbacks(this);
        this.e = false;
        this.f = false;
        nyf nyfVar = this.d;
        if (nyfVar != null) {
            nyfVar.getClass();
            nyfVar.d(this);
            this.d = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // defpackage.yn7
    public final void onPause(dzf dzfVar) {
        if (this.f) {
            this.f = false;
            a();
        }
    }

    @Override // defpackage.yn7
    public final void onResume(dzf dzfVar) {
        dzfVar.getClass();
        if (this.f) {
            return;
        }
        this.f = true;
        a();
    }

    @Override // defpackage.yn7
    public final void onStart(dzf dzfVar) {
        dzfVar.getClass();
        if (this.e) {
            return;
        }
        this.e = true;
        b();
    }

    @Override // defpackage.yn7
    public final void onStop(dzf dzfVar) {
        if (this.e) {
            this.e = false;
            b();
        }
    }

    @Override // defpackage.yn7
    public final void onDestroy(dzf dzfVar) {
    }
}
