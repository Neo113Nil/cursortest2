package Q1;

import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class x extends W1.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y f1678m;

    public x(y this$0) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        this.f1678m = this$0;
    }

    @Override // W1.e
    public final void j() {
        this.f1678m.e(EnumC0079b.CANCEL);
        q qVar = this.f1678m.f1680b;
        synchronized (qVar) {
            long j2 = qVar.f1639n;
            long j3 = qVar.f1638m;
            if (j2 < j3) {
                return;
            }
            qVar.f1638m = j3 + 1;
            qVar.f1640o = System.nanoTime() + 1000000000;
            qVar.f1633h.c(new M1.b(kotlin.jvm.internal.i.h(" ping", qVar.f1628c), qVar, 2), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
