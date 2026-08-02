package defpackage;

import com.yandex.xplat.common.YSError;
import defpackage.m83;
import defpackage.y4r0;
import defpackage.zls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public final class y4r0 extends m9 {
    public final FutureTask g;

    public y4r0(yh6 yh6Var, final zls zlsVar) {
        super(yh6Var);
        FutureTask futureTask = new FutureTask(new Callable() { // from class: com.yandex.xplat.common.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zls zlsVar2 = zls.this;
                y4r0 y4r0Var = this;
                try {
                    zlsVar2.invoke(y4r0Var, new SettablePromise$execFuture$1$1(1, y4r0Var, y4r0.class, "resolve", "resolve$xplat_common_release(Ljava/lang/Object;)V", 0), new SettablePromise$execFuture$1$2(1, y4r0Var, y4r0.class, "reject", "reject$xplat_common_release(Lcom/yandex/xplat/common/YSError;)V", 0));
                } catch (Throwable th) {
                    Throwable th2 = th;
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        th2 = cause;
                    }
                    y4r0Var.n(m83.a(th2));
                }
                return zy11.a;
            }
        });
        this.g = futureTask;
        this.a.execute(futureTask);
    }

    public final void n(YSError ySError) {
        this.d.i(new flf0(ySError));
        this.g.cancel(true);
        if (this.e) {
            return;
        }
        Iterator it = a.N0(ymx.b.a).iterator();
        while (it.hasNext()) {
            ((tls) it.next()).invoke(ySError);
        }
    }
}
