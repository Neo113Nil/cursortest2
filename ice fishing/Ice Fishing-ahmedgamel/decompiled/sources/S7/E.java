package S7;

import java.util.concurrent.CancellationException;
import u7.AbstractC5083i;
import z7.InterfaceC5240d;
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public abstract class E extends Z7.i {

    /* renamed from: v, reason: collision with root package name */
    public int f2997v;

    public E(int i) {
        super(0L, Z7.k.f4199g);
        this.f2997v = i;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract InterfaceC5240d d();

    public Throwable e(Object obj) {
        C0402p c0402p = obj instanceof C0402p ? (C0402p) obj : null;
        if (c0402p != null) {
            return c0402p.f3066a;
        }
        return null;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            A8.b.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.h.b(th);
        AbstractC0410y.l(new H7.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), d().getContext());
    }

    public abstract Object i();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r7 = (S7.Y) r7.m(S7.C0407v.f3081u);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj = u7.v.f41073a;
        N6.i iVar = this.f4191u;
        try {
            InterfaceC5240d d9 = d();
            kotlin.jvm.internal.h.c(d9, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            X7.h hVar = (X7.h) d9;
            B7.c cVar = hVar.f3790x;
            Object obj2 = hVar.f3792z;
            InterfaceC5245i context = cVar.getContext();
            Object m9 = X7.a.m(context, obj2);
            w0 x9 = m9 != X7.a.f3780f ? AbstractC0410y.x(cVar, context, m9) : null;
            try {
                InterfaceC5245i context2 = cVar.getContext();
                Object i = i();
                Throwable e9 = e(i);
                if (e9 == null) {
                    int i4 = this.f2997v;
                    boolean z6 = true;
                    if (i4 != 1 && i4 != 2) {
                        z6 = false;
                    }
                }
                Y y7 = null;
                if (y7 != null && !y7.j()) {
                    CancellationException w3 = ((h0) y7).w();
                    b(i, w3);
                    cVar.resumeWith(Q3.b.b(w3));
                } else if (e9 != null) {
                    cVar.resumeWith(Q3.b.b(e9));
                } else {
                    cVar.resumeWith(g(i));
                }
                if (x9 == null || x9.X()) {
                    X7.a.g(context, m9);
                }
                try {
                    iVar.getClass();
                } catch (Throwable th) {
                    obj = Q3.b.b(th);
                }
                h(null, AbstractC5083i.a(obj));
            } catch (Throwable th2) {
                if (x9 == null || x9.X()) {
                    X7.a.g(context, m9);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                iVar.getClass();
            } catch (Throwable th4) {
                obj = Q3.b.b(th4);
            }
            h(th3, AbstractC5083i.a(obj));
        }
    }

    public Object g(Object obj) {
        return obj;
    }
}
