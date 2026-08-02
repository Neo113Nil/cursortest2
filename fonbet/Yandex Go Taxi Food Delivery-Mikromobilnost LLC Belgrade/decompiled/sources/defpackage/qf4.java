package defpackage;

import android.os.Looper;
import com.yandex.messaging.internal.BackendCompatibilityStatus;

/* loaded from: classes15.dex */
public final class qf4 {
    public final Looper a;
    public final zq60 b;
    public final sq60 c;
    public boolean d;
    public boolean e;
    public BackendCompatibilityStatus f;

    public qf4(Looper looper) {
        zq60 zq60Var = new zq60();
        this.b = zq60Var;
        this.c = new sq60(zq60Var);
        this.f = BackendCompatibilityStatus.OK;
        z83.g(null, looper, Looper.myLooper());
        this.a = looper;
    }

    public final void a() {
        z83.g(null, this.a, Looper.myLooper());
        sq60 sq60Var = this.c;
        sq60Var.rewind();
        while (sq60Var.hasNext()) {
            ((of4) sq60Var.next()).a(this.f);
        }
    }
}
