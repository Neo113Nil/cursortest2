package e7;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import m6.h;
import m6.s;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f37309g = Logger.getLogger(d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final e f37310a;

    /* renamed from: b, reason: collision with root package name */
    public long f37311b;

    /* renamed from: c, reason: collision with root package name */
    public int f37312c;

    /* renamed from: d, reason: collision with root package name */
    public int f37313d;

    /* renamed from: e, reason: collision with root package name */
    public long f37314e;

    /* renamed from: f, reason: collision with root package name */
    public final s f37315f;

    public d(e eVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f37311b = timeUnit.toNanos(1000L);
        this.f37312c = 2048;
        this.f37313d = 512;
        this.f37314e = timeUnit.toNanos(30000L);
        this.f37315f = h.f39473n;
        this.f37310a = eVar;
    }

    public final c a() {
        int i = this.f37313d;
        int i4 = this.f37312c;
        if (i > i4) {
            f37309g.log(Level.WARNING, "maxExportBatchSize should not exceed maxQueueSize. Setting maxExportBatchSize to {0} instead of {1}", new Object[]{Integer.valueOf(i4), Integer.valueOf(this.f37313d)});
            this.f37313d = this.f37312c;
        }
        return new c(this.f37310a, this.f37315f, this.f37311b, this.f37312c, this.f37313d, this.f37314e);
    }
}
