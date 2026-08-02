package defpackage;

import android.os.Looper;
import com.yandex.messaging.internal.net.a;

/* loaded from: classes15.dex */
public final class y1k0 implements e1k {
    public final w1k0 a;
    public final /* synthetic */ a b;

    public y1k0(a aVar, w1k0 w1k0Var) {
        this.b = aVar;
        this.a = w1k0Var;
        z83.g(null, aVar.c, Looper.myLooper());
        aVar.d.b(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a aVar = this.b;
        z83.g(null, aVar.c, Looper.myLooper());
        aVar.d.d(this);
    }
}
