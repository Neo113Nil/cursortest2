package S6;

import X.m;
import i8.p;
import i8.t;

/* loaded from: classes2.dex */
public final class e extends t {

    /* renamed from: a, reason: collision with root package name */
    public final N6.f f2979a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2980b;

    /* renamed from: c, reason: collision with root package name */
    public final p f2981c;

    public e(N6.f fVar, int i, p pVar) {
        this.f2979a = fVar;
        this.f2980b = i;
        this.f2981c = pVar;
    }

    @Override // i8.t
    public final long a() {
        return this.f2980b;
    }

    @Override // i8.t
    public final p b() {
        return this.f2981c;
    }

    @Override // i8.t
    public final void c(y8.p pVar) {
        this.f2979a.b(new m(pVar));
    }
}
