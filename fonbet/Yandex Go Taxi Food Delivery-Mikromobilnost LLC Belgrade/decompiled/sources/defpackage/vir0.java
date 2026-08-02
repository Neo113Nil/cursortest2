package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;
import com.google.android.material.shape.b;

/* loaded from: classes11.dex */
public abstract class vir0 {
    public b c;
    public boolean a = false;
    public boolean b = false;
    public RectF d = new RectF();
    public final Path e = new Path();

    public abstract void a(FrameLayout frameLayout);

    public abstract boolean b();

    public final void c() {
        b bVar;
        RectF rectF = this.d;
        if (rectF.left > rectF.right || rectF.top > rectF.bottom || (bVar = this.c) == null) {
            return;
        }
        hhr0.a.a(bVar, rectF, this.e);
    }
}
