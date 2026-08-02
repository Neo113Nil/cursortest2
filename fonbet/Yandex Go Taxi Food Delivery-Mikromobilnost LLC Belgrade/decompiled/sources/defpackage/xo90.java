package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.messaging.auth.AuthAccountNotAuthorizedException;
import com.yandex.messaging.auth.AuthAccountNotFoundException;

/* loaded from: classes15.dex */
public final /* synthetic */ class xo90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ap90 b;

    public /* synthetic */ xo90(ap90 ap90Var, int i) {
        this.a = i;
        this.b = ap90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qti0 qti0Var;
        int i = this.a;
        int i2 = 0;
        ap90 ap90Var = this.b;
        int i3 = 1;
        switch (i) {
            case 0:
                Handler handler = ap90Var.a;
                try {
                    handler.post(new yo90(i2, ap90Var, ap90Var.x.f(ap90Var.b)));
                    break;
                } catch (AuthAccountNotAuthorizedException | AuthAccountNotFoundException unused) {
                    handler.post(new xo90(ap90Var, i3));
                    return;
                } catch (Exception e) {
                    handler.post(new yo90(i3, ap90Var, e));
                    return;
                }
            default:
                z83.g(null, ap90Var.a.getLooper(), Looper.myLooper());
                z83.h(null, ap90Var.z);
                ap90Var.z = false;
                ap90Var.w.c("passport_relogin_required", "method", ap90Var.x.name());
                if (!ap90Var.A && (qti0Var = ap90Var.c) != null) {
                    z83.g(null, qti0Var.a, Looper.myLooper());
                    qti0Var.d = true;
                    sq60 sq60Var = qti0Var.c;
                    sq60Var.rewind();
                    while (sq60Var.hasNext()) {
                        uti0 uti0Var = (uti0) sq60Var.next();
                        z83.g(null, (Looper) uti0Var.x.b, Looper.myLooper());
                        uti0Var.a.post(new tti0(uti0Var, 1));
                    }
                    break;
                }
                break;
        }
    }
}
