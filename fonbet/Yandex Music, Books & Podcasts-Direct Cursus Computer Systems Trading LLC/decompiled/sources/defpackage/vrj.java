package defpackage;

import android.os.IBinder;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class vrj extends xrj {
    public final sip c;

    public vrj(IBinder iBinder, Executor executor) {
        super(iBinder);
        this.c = new sip(executor);
    }

    @Override // defpackage.xrj
    public final void a(int i, fo7 fo7Var) {
        this.c.execute(new e02(this, i, fo7Var.b(), 9));
        fo7Var.b();
        fo7Var.b = null;
    }
}
