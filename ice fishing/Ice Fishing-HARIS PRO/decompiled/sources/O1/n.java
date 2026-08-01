package O1;

import L1.C0003d;

/* loaded from: classes.dex */
public final class n extends P1.c {

    /* renamed from: a, reason: collision with root package name */
    public long f869a;

    /* renamed from: b, reason: collision with root package name */
    public C0003d f870b;

    @Override // P1.c
    public final boolean a(P1.a aVar) {
        l lVar = (l) aVar;
        if (this.f869a >= 0) {
            return false;
        }
        long j = lVar.f864h;
        if (j < lVar.i) {
            lVar.i = j;
        }
        this.f869a = j;
        return true;
    }

    @Override // P1.c
    public final v1.d[] b(P1.a aVar) {
        long j = this.f869a;
        this.f869a = -1L;
        this.f870b = null;
        return ((l) aVar).s(j);
    }
}
