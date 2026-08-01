package L1;

import java.util.concurrent.CancellationException;

/* renamed from: L1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0007h extends M implements InterfaceC0006g {
    public final T e;

    public C0007h(T t2) {
        this.e = t2;
    }

    @Override // C1.l
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        o((Throwable) obj);
        return t1.i.f4388c;
    }

    @Override // L1.InterfaceC0006g
    public final boolean h(Throwable th) {
        T n2 = n();
        if (th instanceof CancellationException) {
            return true;
        }
        return n2.i(th) && n2.o();
    }

    @Override // L1.O
    public final void o(Throwable th) {
        this.e.i(n());
    }
}
