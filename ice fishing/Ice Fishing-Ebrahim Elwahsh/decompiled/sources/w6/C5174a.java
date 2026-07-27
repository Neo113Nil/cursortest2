package w6;

import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import r6.C4969b;
import u1.u;

/* renamed from: w6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5174a implements Iterable, Closeable {

    /* renamed from: n, reason: collision with root package name */
    public final C5177d f41676n;

    /* renamed from: u, reason: collision with root package name */
    public final u f41677u;

    /* renamed from: v, reason: collision with root package name */
    public final C4969b f41678v;

    /* renamed from: w, reason: collision with root package name */
    public final Logger f41679w;

    /* renamed from: x, reason: collision with root package name */
    public final AtomicBoolean f41680x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f41681y;

    /* renamed from: z, reason: collision with root package name */
    public C5178e f41682z;

    public C5174a(C5177d c5177d, u uVar) {
        C4969b c4969b = C4969b.f40346a;
        this.f41679w = Logger.getLogger(C5174a.class.getName());
        this.f41680x = new AtomicBoolean(false);
        this.f41681y = new Object();
        this.f41676n = c5177d;
        this.f41677u = uVar;
        this.f41678v = c4969b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f41680x.compareAndSet(false, true)) {
            this.f41676n.close();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C5178e c5178e;
        synchronized (this.f41681y) {
            try {
                if (this.f41682z == null) {
                    this.f41682z = new C5178e(this.f41676n, this.f41678v);
                }
                c5178e = this.f41682z;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5178e;
    }
}
