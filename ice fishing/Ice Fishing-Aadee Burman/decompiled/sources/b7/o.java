package b7;

import f6.C4512a;
import j4.q;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import p7.C4853a;

/* loaded from: classes2.dex */
public final class o implements l6.h, Closeable {

    /* renamed from: x, reason: collision with root package name */
    public static final Logger f5458x = Logger.getLogger(o.class.getName());

    /* renamed from: n, reason: collision with root package name */
    public final C0528h f5459n;

    /* renamed from: u, reason: collision with root package name */
    public final q f5460u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f5461v;

    /* renamed from: w, reason: collision with root package name */
    public final a7.h f5462w;

    public o(C4853a c4853a, Supplier supplier, ArrayList arrayList, a7.h hVar) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((InterfaceC0527g) it.next());
        }
        InterfaceC0527g iVar = arrayList2.isEmpty() ? j.f5443n : arrayList2.size() == 1 ? (InterfaceC0527g) arrayList2.get(0) : new i(new ArrayList(arrayList2));
        this.f5459n = new C0528h(c4853a, supplier, iVar);
        this.f5460u = new q(new n(0, this));
        this.f5462w = hVar;
        this.f5461v = iVar instanceof j;
    }

    @Override // l6.h
    public final l6.g a(String str) {
        if (this.f5461v) {
            return ((l6.h) k6.d.c(l6.d.f38922n, "io.opentelemetry.api.incubator.logs.ExtendedDefaultLoggerProvider")).a(str);
        }
        if (str.isEmpty()) {
            f5458x.fine("Logger requested without instrumentation scope name.");
            str = com.anythink.core.common.v.m.f16809e;
        }
        return new m(this.f5460u, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    @Override // l6.h
    public final l6.f get() {
        return (l6.f) this.f5460u.a(C4512a.f37513w, "noop");
    }

    public final Y6.c shutdown() {
        if (this.f5459n.f5440e != null) {
            f5458x.log(Level.INFO, "Calling shutdown() multiple times.");
            return Y6.c.f3975e;
        }
        C0528h c0528h = this.f5459n;
        synchronized (c0528h.f5436a) {
            try {
                if (c0528h.f5440e != null) {
                    return c0528h.f5440e;
                }
                c0528h.f5440e = c0528h.f5439d.shutdown();
                return c0528h.f5440e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkLoggerProvider{clock=");
        C0528h c0528h = this.f5459n;
        c0528h.getClass();
        sb.append(Y6.d.f3981a);
        sb.append(", resource=");
        sb.append(c0528h.f5437b);
        sb.append(", logLimits=");
        sb.append((C0522b) c0528h.f5438c.get());
        sb.append(", logRecordProcessor=");
        sb.append(c0528h.f5439d);
        sb.append(", loggerConfigurator=");
        sb.append(this.f5462w);
        sb.append('}');
        return sb.toString();
    }
}
