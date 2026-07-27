package e7;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import m6.h;
import m6.s;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f37233g = Logger.getLogger(d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final e f37234a;

    /* renamed from: b, reason: collision with root package name */
    public long f37235b;

    /* renamed from: c, reason: collision with root package name */
    public int f37236c;

    /* renamed from: d, reason: collision with root package name */
    public int f37237d;

    /* renamed from: e, reason: collision with root package name */
    public long f37238e;

    /* renamed from: f, reason: collision with root package name */
    public final s f37239f;

    public d(e eVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f37235b = timeUnit.toNanos(1000L);
        this.f37236c = 2048;
        this.f37237d = 512;
        this.f37238e = timeUnit.toNanos(30000L);
        this.f37239f = h.f39314n;
        this.f37234a = eVar;
    }

    public final c a() {
        int i = this.f37237d;
        int i6 = this.f37236c;
        if (i > i6) {
            f37233g.log(Level.WARNING, "maxExportBatchSize should not exceed maxQueueSize. Setting maxExportBatchSize to {0} instead of {1}", new Object[]{Integer.valueOf(i6), Integer.valueOf(this.f37237d)});
            this.f37237d = this.f37236c;
        }
        return new c(this.f37234a, this.f37239f, this.f37235b, this.f37236c, this.f37237d, this.f37238e);
    }
}
