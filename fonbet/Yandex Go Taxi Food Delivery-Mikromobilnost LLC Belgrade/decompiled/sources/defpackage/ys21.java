package defpackage;

import android.os.Looper;
import com.yandex.messaging.internal.authorized.j;

/* loaded from: classes15.dex */
public final /* synthetic */ class ys21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zs21 b;

    public /* synthetic */ ys21(zs21 zs21Var, int i) {
        this.a = i;
        this.b = zs21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zs21 zs21Var = this.b;
        switch (i) {
            case 0:
                j jVar = zs21Var.y;
                z83.g(null, jVar.a.get(), Looper.myLooper());
                z83.f(zs21Var.w, null);
                z83.f(zs21Var.c, null);
                zs21Var.c = ((el21) jVar.b.get()).f(zs21Var);
                break;
            case 1:
                z83.g(null, zs21Var.y.a.get(), Looper.myLooper());
                xi3 xi3Var = zs21Var.c;
                if (xi3Var != null) {
                    xi3Var.close();
                }
                zs21Var.c = null;
                x08 x08Var = zs21Var.w;
                if (x08Var != null) {
                    x08Var.cancel();
                }
                zs21Var.w = null;
                break;
            default:
                zs21Var.a.cancel();
                break;
        }
    }
}
