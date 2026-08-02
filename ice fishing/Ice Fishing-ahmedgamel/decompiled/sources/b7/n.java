package b7;

import S0.s;
import f6.C4522a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import p7.C4853a;

/* loaded from: classes2.dex */
public final class n implements l6.h, Closeable {

    /* renamed from: x, reason: collision with root package name */
    public static final Logger f5606x = Logger.getLogger(n.class.getName());

    /* renamed from: n, reason: collision with root package name */
    public final C0536h f5607n;

    /* renamed from: u, reason: collision with root package name */
    public final S0.i f5608u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f5609v;

    /* renamed from: w, reason: collision with root package name */
    public final a7.h f5610w;

    public n(C4853a c4853a, Supplier supplier, ArrayList arrayList, a7.h hVar) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((InterfaceC0535g) it.next());
        }
        InterfaceC0535g iVar = arrayList2.isEmpty() ? j.f5593n : arrayList2.size() == 1 ? (InterfaceC0535g) arrayList2.get(0) : new i(new ArrayList(arrayList2));
        this.f5607n = new C0536h(c4853a, supplier, iVar);
        this.f5608u = new S0.i(new m(0, this));
        this.f5610w = hVar;
        this.f5609v = iVar instanceof j;
    }

    @Override // l6.h
    public final l6.g a(String str) {
        if (this.f5609v) {
            return ((l6.h) k6.d.c(l6.d.f38990n, "io.opentelemetry.api.incubator.logs.ExtendedDefaultLoggerProvider")).a(str);
        }
        if (str.isEmpty()) {
            f5606x.fine("Logger requested without instrumentation scope name.");
            str = com.anythink.core.common.v.m.f17596e;
        }
        return new s(7, this.f5608u, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    @Override // l6.h
    public final l6.f get() {
        return (l6.f) this.f5608u.b(C4522a.f37475w, "noop");
    }

    public final Y6.c shutdown() {
        if (this.f5607n.f5590e != null) {
            f5606x.log(Level.INFO, "Calling shutdown() multiple times.");
            return Y6.c.f3919e;
        }
        C0536h c0536h = this.f5607n;
        synchronized (c0536h.f5586a) {
            try {
                if (c0536h.f5590e != null) {
                    return c0536h.f5590e;
                }
                c0536h.f5590e = c0536h.f5589d.shutdown();
                return c0536h.f5590e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkLoggerProvider{clock=");
        C0536h c0536h = this.f5607n;
        c0536h.getClass();
        sb.append(Y6.d.f3925a);
        sb.append(", resource=");
        sb.append(c0536h.f5587b);
        sb.append(", logLimits=");
        sb.append((C0530b) c0536h.f5588c.get());
        sb.append(", logRecordProcessor=");
        sb.append(c0536h.f5589d);
        sb.append(", loggerConfigurator=");
        sb.append(this.f5610w);
        sb.append('}');
        return sb.toString();
    }
}
