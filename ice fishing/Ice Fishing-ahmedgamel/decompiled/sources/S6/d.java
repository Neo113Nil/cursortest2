package S6;

import X.m;
import i8.p;
import i8.t;

/* loaded from: classes2.dex */
public final class d extends t {

    /* renamed from: a, reason: collision with root package name */
    public final N6.f f2896a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2897b;

    /* renamed from: c, reason: collision with root package name */
    public final p f2898c;

    public d(N6.f fVar, int i, p pVar) {
        this.f2896a = fVar;
        this.f2897b = i;
        this.f2898c = pVar;
    }

    @Override // i8.t
    public final long a() {
        return this.f2897b;
    }

    @Override // i8.t
    public final p b() {
        return this.f2898c;
    }

    @Override // i8.t
    public final void c(y8.p pVar) {
        this.f2896a.b(new m(pVar));
    }
}
