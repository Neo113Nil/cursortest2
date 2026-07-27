package S7;

import java.util.concurrent.CancellationException;
import u7.AbstractC5091i;
import z7.InterfaceC5267d;
import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public abstract class E extends Z7.i {

    /* renamed from: v, reason: collision with root package name */
    public int f2914v;

    public E(int i) {
        super(0L, Z7.k.f4221g);
        this.f2914v = i;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract InterfaceC5267d d();

    public Throwable e(Object obj) {
        C0398p c0398p = obj instanceof C0398p ? (C0398p) obj : null;
        if (c0398p != null) {
            return c0398p.f2983a;
        }
        return null;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            X2.e.y(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.h.b(th);
        AbstractC0406y.l(new H7.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), d().getContext());
    }

    public abstract Object i();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r7 = (S7.Y) r7.m(S7.C0403v.f2998u);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj = u7.v.f41350a;
        N6.i iVar = this.f4213u;
        try {
            InterfaceC5267d d2 = d();
            kotlin.jvm.internal.h.c(d2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            X7.h hVar = (X7.h) d2;
            B7.c cVar = hVar.f3835x;
            Object obj2 = hVar.f3837z;
            InterfaceC5272i context = cVar.getContext();
            Object m4 = X7.a.m(context, obj2);
            w0 x9 = m4 != X7.a.f3825f ? AbstractC0406y.x(cVar, context, m4) : null;
            try {
                InterfaceC5272i context2 = cVar.getContext();
                Object i = i();
                Throwable e9 = e(i);
                if (e9 == null) {
                    int i6 = this.f2914v;
                    boolean z3 = true;
                    if (i6 != 1 && i6 != 2) {
                        z3 = false;
                    }
                }
                Y y7 = null;
                if (y7 != null && !y7.j()) {
                    CancellationException w6 = ((h0) y7).w();
                    b(i, w6);
                    cVar.resumeWith(com.bumptech.glide.d.f(w6));
                } else if (e9 != null) {
                    cVar.resumeWith(com.bumptech.glide.d.f(e9));
                } else {
                    cVar.resumeWith(g(i));
                }
                if (x9 == null || x9.X()) {
                    X7.a.g(context, m4);
                }
                try {
                    iVar.getClass();
                } catch (Throwable th) {
                    obj = com.bumptech.glide.d.f(th);
                }
                h(null, AbstractC5091i.a(obj));
            } catch (Throwable th2) {
                if (x9 == null || x9.X()) {
                    X7.a.g(context, m4);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                iVar.getClass();
            } catch (Throwable th4) {
                obj = com.bumptech.glide.d.f(th4);
            }
            h(th3, AbstractC5091i.a(obj));
        }
    }

    public Object g(Object obj) {
        return obj;
    }
}
