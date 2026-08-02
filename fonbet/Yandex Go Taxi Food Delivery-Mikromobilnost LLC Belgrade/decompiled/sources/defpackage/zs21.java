package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.messaging.internal.authorized.j;

/* loaded from: classes15.dex */
public final class zs21 implements x08, dl21 {
    public final at21 a;
    public final Handler b;
    public xi3 c;
    public x08 w;
    public boolean x;
    public final /* synthetic */ j y;

    public zs21(j jVar, at21 at21Var) {
        this.y = jVar;
        this.a = at21Var;
        Handler handler = new Handler((Looper) jVar.a.get());
        this.b = handler;
        handler.post(new ys21(this, 0));
    }

    @Override // defpackage.x08
    public final void cancel() {
        if (this.x) {
            return;
        }
        this.x = true;
        this.b.post(new ys21(this, 1));
        eu11.a(new ys21(this, 2));
    }

    @Override // defpackage.dl21
    public final void e(cl21 cl21Var) {
        z83.g(null, this.y.a.get(), Looper.myLooper());
        z83.f(this.w, null);
        xi3 xi3Var = this.c;
        if (xi3Var != null) {
            xi3Var.close();
        }
        this.c = null;
        this.w = this.a.mo25e(cl21Var);
    }
}
