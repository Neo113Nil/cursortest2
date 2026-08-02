package androidx.core.app;

import android.content.ComponentName;
import android.content.Intent;
import defpackage.k5r;

/* loaded from: classes.dex */
public abstract class r {
    public final ComponentName a;
    public boolean b;
    public int c;

    public r(ComponentName componentName) {
        this.a = componentName;
    }

    public abstract void a(Intent intent);

    public final void b(int i) {
        if (!this.b) {
            this.b = true;
            this.c = i;
        } else {
            if (this.c == i) {
                return;
            }
            q.j(this.c, k5r.q(i, "Given job ID ", " is different than previous "));
        }
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }
}
