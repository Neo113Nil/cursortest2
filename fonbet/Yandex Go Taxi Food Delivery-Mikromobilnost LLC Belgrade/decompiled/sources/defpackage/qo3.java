package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.messaging.core.net.entities.RequestUserData;
import com.yandex.messaging.core.net.entities.RequestUserParams;
import com.yandex.messaging.core.net.entities.TogglePushTokenData;
import com.yandex.messaging.core.net.entities.TogglePushTokenParams;

/* loaded from: classes15.dex */
public final class qo3 extends w920 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public qo3(mp90 mp90Var, cn3 cn3Var, op90 op90Var, boolean z) {
        this.x = mp90Var;
        this.c = cn3Var;
        this.w = op90Var;
        this.b = z;
    }

    @Override // defpackage.w920
    public final gg70 d(kvj0 kvj0Var) {
        switch (this.a) {
            case 0:
                return ouu.b(((to3) this.c).b, "toggle_push_token", TogglePushTokenData.class, kvj0Var);
            default:
                ouu ouuVar = (ouu) ((h3y) ((mp90) this.x).B.e).get();
                ouuVar.getClass();
                return ouu.b(ouuVar, "request_user", RequestUserData.class, kvj0Var);
        }
    }

    @Override // defpackage.w920
    public final boolean e(ngz ngzVar) {
        switch (this.a) {
            case 0:
                return false;
            default:
                mp90 mp90Var = (mp90) this.x;
                z83.g(null, mp90Var.a.getLooper(), Looper.myLooper());
                if (ho60.b(ngzVar) && !this.b) {
                    mp90Var.z = null;
                    mp90.b(mp90Var, ((op90) this.w).a);
                } else {
                    if (!ho60.a(ngzVar)) {
                        return false;
                    }
                    mp90Var.z = null;
                    ((rj21) mp90Var.B.g).a(25);
                }
                return true;
        }
    }

    @Override // defpackage.w920
    public final void g(Object obj) {
        int i = this.a;
        Object obj2 = this.x;
        switch (i) {
            case 0:
                ((l7s0) obj2).D((TogglePushTokenData) obj);
                break;
            default:
                RequestUserData requestUserData = (RequestUserData) obj;
                mp90 mp90Var = (mp90) obj2;
                Handler handler = mp90Var.a;
                z83.g(null, handler.getLooper(), Looper.myLooper());
                op90 op90Var = (op90) this.w;
                z83.g(null, handler.getLooper(), Looper.myLooper());
                z83.d(mp90Var.z, null);
                z83.f(mp90Var.A, null);
                mp90Var.z = null;
                mp90Var.A = ((xwc) ((h3y) mp90Var.B.d).get()).a(new so3(mp90Var, mp90Var.c.h(op90Var.a, mp90Var.w.a), requestUserData, op90Var, this.b));
                break;
        }
    }

    @Override // defpackage.w920
    public final t4j0 i() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((to3) obj).b.a(new TogglePushTokenParams((String) this.w, this.b), "toggle_push_token");
            default:
                w040 w040Var = ((mp90) this.x).B;
                t4j0 a = ((cn3) obj).a(((ouu) ((h3y) w040Var.e).get()).a(new RequestUserParams(), "request_user"));
                ((bbj) w040Var.f).b(a);
                return a;
        }
    }

    public qo3(to3 to3Var, String str, boolean z, l7s0 l7s0Var) {
        this.c = to3Var;
        this.w = str;
        this.b = z;
        this.x = l7s0Var;
    }
}
