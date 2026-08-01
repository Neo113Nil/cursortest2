package q7;

import b7.n;
import f6.C4512a;
import j4.q;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import n6.InterfaceC4768j;
import n6.InterfaceC4769k;
import p7.C4853a;
import r7.C4963c;

/* renamed from: q7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4938g implements InterfaceC4769k, Closeable {

    /* renamed from: w, reason: collision with root package name */
    public static final Logger f40265w = Logger.getLogger(C4938g.class.getName());

    /* renamed from: n, reason: collision with root package name */
    public final C4941j f40266n;

    /* renamed from: u, reason: collision with root package name */
    public final q f40267u = new q(new n(3, this));

    /* renamed from: v, reason: collision with root package name */
    public final a7.h f40268v;

    public C4938g(Y6.d dVar, EnumC4936e enumC4936e, C4853a c4853a, H5.a aVar, C4963c c4963c, ArrayList arrayList, a7.h hVar) {
        this.f40266n = new C4941j(dVar, enumC4936e, c4853a, aVar, c4963c, arrayList);
        this.f40268v = hVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    @Override // n6.InterfaceC4769k
    public final InterfaceC4768j get() {
        return (InterfaceC4768j) this.f40267u.a(C4512a.f37513w, "noop");
    }

    public final Y6.c shutdown() {
        if (this.f40266n.f40284h != null) {
            f40265w.log(Level.INFO, "Calling shutdown() multiple times.");
            return Y6.c.f3975e;
        }
        C4941j c4941j = this.f40266n;
        synchronized (c4941j.f40277a) {
            try {
                if (c4941j.f40284h != null) {
                    return c4941j.f40284h;
                }
                c4941j.f40284h = c4941j.f40283g.shutdown();
                return c4941j.f40284h;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkTracerProvider{clock=");
        C4941j c4941j = this.f40266n;
        sb.append(c4941j.f40278b);
        sb.append(", idGenerator=");
        sb.append(c4941j.f40279c);
        sb.append(", resource=");
        sb.append(c4941j.f40280d);
        sb.append(", spanLimitsSupplier=");
        c4941j.f40281e.getClass();
        sb.append(C4932a.f40255a);
        sb.append(", sampler=");
        sb.append(c4941j.f40282f);
        sb.append(", spanProcessor=");
        sb.append(c4941j.f40283g);
        sb.append(", tracerConfigurator=");
        sb.append(this.f40268v);
        sb.append('}');
        return sb.toString();
    }
}
