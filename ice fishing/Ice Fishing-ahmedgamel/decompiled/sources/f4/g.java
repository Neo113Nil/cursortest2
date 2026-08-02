package f4;

import g4.C4532a;

/* loaded from: classes2.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final l3.h f37467a;

    public g(l3.h hVar) {
        this.f37467a = hVar;
    }

    @Override // f4.i
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // f4.i
    public final boolean b(C4532a c4532a) {
        int i = c4532a.f37672b;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.f37467a.d(c4532a.f37671a);
        return true;
    }
}
