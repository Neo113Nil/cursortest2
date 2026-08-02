package f4;

import g4.C4532a;

/* loaded from: classes2.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final j f37465a;

    /* renamed from: b, reason: collision with root package name */
    public final l3.h f37466b;

    public f(j jVar, l3.h hVar) {
        this.f37465a = jVar;
        this.f37466b = hVar;
    }

    @Override // f4.i
    public final boolean a(Exception exc) {
        this.f37466b.c(exc);
        return true;
    }

    @Override // f4.i
    public final boolean b(C4532a c4532a) {
        if (c4532a.f37672b != 4 || this.f37465a.a(c4532a)) {
            return false;
        }
        String str = c4532a.f37673c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f37466b.b(new C4519a(str, c4532a.f37675e, c4532a.f37676f));
        return true;
    }
}
