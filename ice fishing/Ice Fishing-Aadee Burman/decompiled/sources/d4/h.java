package d4;

import e4.C4463a;

/* loaded from: classes2.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public final j3.h f37066a;

    public h(j3.h hVar) {
        this.f37066a = hVar;
    }

    @Override // d4.j
    public final boolean a(C4463a c4463a) {
        int i = c4463a.f37196b;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.f37066a.d(c4463a.f37195a);
        return true;
    }

    @Override // d4.j
    public final boolean b(Exception exc) {
        return false;
    }
}
