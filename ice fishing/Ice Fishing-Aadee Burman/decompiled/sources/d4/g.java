package d4;

import e4.C4463a;

/* loaded from: classes2.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public final k f37064a;

    /* renamed from: b, reason: collision with root package name */
    public final j3.h f37065b;

    public g(k kVar, j3.h hVar) {
        this.f37064a = kVar;
        this.f37065b = hVar;
    }

    @Override // d4.j
    public final boolean a(C4463a c4463a) {
        if (c4463a.f37196b != 4 || this.f37064a.a(c4463a)) {
            return false;
        }
        String str = c4463a.f37197c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f37065b.b(new C4447a(str, c4463a.f37199e, c4463a.f37200f));
        return true;
    }

    @Override // d4.j
    public final boolean b(Exception exc) {
        this.f37065b.c(exc);
        return true;
    }
}
