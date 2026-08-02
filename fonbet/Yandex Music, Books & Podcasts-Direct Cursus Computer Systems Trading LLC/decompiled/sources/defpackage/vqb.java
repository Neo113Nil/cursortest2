package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class vqb implements zbl {
    public Future a;
    public long b;
    public final /* synthetic */ crb c;

    public vqb(crb crbVar) {
        this.c = crbVar;
    }

    @Override // defpackage.zbl
    public final void a() {
        System.currentTimeMillis();
        Future future = this.a;
        if (future == null) {
            crb crbVar = this.c;
            future = y2x.W(crbVar.e, new jt6(26, crbVar, this), 0L, 1L, TimeUnit.SECONDS);
        }
        this.a = future;
    }

    @Override // defpackage.zbl
    public final void onStop(boolean z) {
        Future future = this.a;
        if (future != null) {
            future.cancel(false);
        }
        this.a = null;
        this.b = 0L;
    }
}
