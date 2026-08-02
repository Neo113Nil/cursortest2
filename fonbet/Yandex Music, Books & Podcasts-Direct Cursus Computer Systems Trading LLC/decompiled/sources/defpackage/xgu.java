package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class xgu {
    public Interpolator c;
    public ygu d;
    public boolean e;
    public long b = -1;
    public final yos f = new yos(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (this.e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((wgu) it.next()).b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            wgu wguVar = (wgu) it.next();
            long j = this.b;
            if (j >= 0) {
                wguVar.c(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = (View) wguVar.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                wguVar.d(this.f);
            }
            View view2 = (View) wguVar.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
