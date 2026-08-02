package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class w1f {
    public float a;
    public final Object b;
    public final Object c;

    public w1f(Window window, h5n h5nVar) {
        this.b = h5nVar;
        View peekDecorView = window.peekDecorView();
        if (peekDecorView == null) {
            xq0.q("window.peekDecorView() is null: JankStats can only be created with a Window that has a non-null DecorView");
            throw null;
        }
        ViewParent parent = peekDecorView.getParent();
        View view = peekDecorView;
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        Object tag = view.getTag(R.id.metricsStateHolder);
        if (tag == null) {
            tag = new mkk();
            view.setTag(R.id.metricsStateHolder, tag);
        }
        mkk mkkVar = (mkk) tag;
        if (mkkVar.a == null) {
            mkkVar.a = new xdh(16);
        }
        int i = Build.VERSION.SDK_INT;
        y1f a2fVar = i >= 31 ? new a2f(this, peekDecorView, window) : i >= 26 ? new z1f(this, peekDecorView, window) : new y1f(this, peekDecorView, window);
        this.c = a2fVar;
        a2fVar.f(true);
        this.a = 2.0f;
    }

    public boolean a(float f) {
        ssg.a(3, "VolumeMuteControl", "holdVolumeAndGetCanUpdate(volume=" + f + ") = " + (!((AtomicBoolean) this.b).get()), null);
        this.a = f;
        return !r0.get();
    }

    public void b(float f) {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
        if (atomicBoolean.get()) {
            ssg.a(3, "VolumeMuteControl", "already muted", null);
            return;
        }
        ssg.a(3, "VolumeMuteControl", "setMute()", null);
        this.a = f;
        atomicBoolean.set(true);
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(Boolean.TRUE);
        }
    }

    public float c() {
        float f = this.a;
        if (f == 0.0f) {
            f = 1.0f;
        }
        ssg.a(3, "VolumeMuteControl", "unmuteAndGetHeldVolume() = " + f, null);
        ((AtomicBoolean) this.b).set(false);
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(Boolean.FALSE);
        }
        return f;
    }

    public w1f() {
        this.a = 1.0f;
        this.b = new AtomicBoolean(false);
        this.c = new CopyOnWriteArrayList();
    }
}
