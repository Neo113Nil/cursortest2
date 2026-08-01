package b7;

import f7.C4513a;

/* loaded from: classes2.dex */
public class l implements l6.f {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f5451c;

    /* renamed from: a, reason: collision with root package name */
    public final C0528h f5452a;

    /* renamed from: b, reason: collision with root package name */
    public final Y6.a f5453b;

    static {
        ((l6.h) k6.d.c(l6.d.f38922n, "io.opentelemetry.api.incubator.logs.ExtendedDefaultLoggerProvider")).get();
        f5451c = true;
    }

    public l(C0528h c0528h, Y6.a aVar, C4513a c4513a) {
        this.f5452a = c0528h;
        this.f5453b = aVar;
    }

    @Override // l6.f
    public l6.e a() {
        boolean z3 = f5451c;
        Y6.a aVar = this.f5453b;
        C0528h c0528h = this.f5452a;
        return z3 ? new C0524d(c0528h, aVar) : new k(c0528h, aVar);
    }
}
