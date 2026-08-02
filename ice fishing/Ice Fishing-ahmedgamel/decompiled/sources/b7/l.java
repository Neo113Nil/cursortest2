package b7;

import f7.C4523a;

/* loaded from: classes2.dex */
public class l implements l6.f {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f5601c;

    /* renamed from: a, reason: collision with root package name */
    public final C0536h f5602a;

    /* renamed from: b, reason: collision with root package name */
    public final Y6.a f5603b;

    static {
        ((l6.h) k6.d.c(l6.d.f38990n, "io.opentelemetry.api.incubator.logs.ExtendedDefaultLoggerProvider")).get();
        f5601c = true;
    }

    public l(C0536h c0536h, Y6.a aVar, C4523a c4523a) {
        this.f5602a = c0536h;
        this.f5603b = aVar;
    }

    @Override // l6.f
    public l6.e a() {
        boolean z6 = f5601c;
        Y6.a aVar = this.f5603b;
        C0536h c0536h = this.f5602a;
        return z6 ? new C0532d(c0536h, aVar) : new k(c0536h, aVar);
    }
}
