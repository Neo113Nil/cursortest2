package q7;

import b7.m;
import f6.C4522a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import n6.InterfaceC4784j;
import n6.InterfaceC4785k;
import p7.C4853a;
import r7.C4913c;

/* renamed from: q7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4887g implements InterfaceC4785k, Closeable {

    /* renamed from: w, reason: collision with root package name */
    public static final Logger f40076w = Logger.getLogger(C4887g.class.getName());

    /* renamed from: n, reason: collision with root package name */
    public final C4890j f40077n;

    /* renamed from: u, reason: collision with root package name */
    public final S0.i f40078u = new S0.i(new m(3, this));

    /* renamed from: v, reason: collision with root package name */
    public final a7.h f40079v;

    public C4887g(Y6.d dVar, EnumC4885e enumC4885e, C4853a c4853a, H5.a aVar, C4913c c4913c, ArrayList arrayList, a7.h hVar) {
        this.f40077n = new C4890j(dVar, enumC4885e, c4853a, aVar, c4913c, arrayList);
        this.f40079v = hVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    @Override // n6.InterfaceC4785k
    public final InterfaceC4784j get() {
        return (InterfaceC4784j) this.f40078u.b(C4522a.f37475w, "noop");
    }

    public final Y6.c shutdown() {
        if (this.f40077n.f40095h != null) {
            f40076w.log(Level.INFO, "Calling shutdown() multiple times.");
            return Y6.c.f3919e;
        }
        C4890j c4890j = this.f40077n;
        synchronized (c4890j.f40088a) {
            try {
                if (c4890j.f40095h != null) {
                    return c4890j.f40095h;
                }
                c4890j.f40095h = c4890j.f40094g.shutdown();
                return c4890j.f40095h;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkTracerProvider{clock=");
        C4890j c4890j = this.f40077n;
        sb.append(c4890j.f40089b);
        sb.append(", idGenerator=");
        sb.append(c4890j.f40090c);
        sb.append(", resource=");
        sb.append(c4890j.f40091d);
        sb.append(", spanLimitsSupplier=");
        c4890j.f40092e.getClass();
        sb.append(C4881a.f40066a);
        sb.append(", sampler=");
        sb.append(c4890j.f40093f);
        sb.append(", spanProcessor=");
        sb.append(c4890j.f40094g);
        sb.append(", tracerConfigurator=");
        sb.append(this.f40079v);
        sb.append('}');
        return sb.toString();
    }
}
