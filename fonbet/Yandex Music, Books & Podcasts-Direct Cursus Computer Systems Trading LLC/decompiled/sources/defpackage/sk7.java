package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class sk7 implements o76 {
    public final Context a;
    public final a1o b;

    public sk7(Context context, a1o a1oVar) {
        this.a = context.getApplicationContext();
        this.b = a1oVar;
    }

    @Override // defpackage.zyf
    public final void b() {
        fmq y = fmq.y(this.a);
        a1o a1oVar = this.b;
        synchronized (y) {
            ((HashSet) y.d).add(a1oVar);
            y.z();
        }
    }

    @Override // defpackage.zyf
    public final void onStop() {
        fmq y = fmq.y(this.a);
        a1o a1oVar = this.b;
        synchronized (y) {
            ((HashSet) y.d).remove(a1oVar);
            if (y.b && ((HashSet) y.d).isEmpty()) {
                z0j z0jVar = (z0j) y.c;
                ((ConnectivityManager) ((u76) z0jVar.d).get()).unregisterNetworkCallback((xd0) z0jVar.e);
                y.b = false;
            }
        }
    }

    @Override // defpackage.zyf
    public final void onDestroy() {
    }
}
