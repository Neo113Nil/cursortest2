package O1;

import L1.C0003d;
import L1.InterfaceC0024z;

/* loaded from: classes.dex */
public final class j implements InterfaceC0024z {

    /* renamed from: a, reason: collision with root package name */
    public final l f853a;

    /* renamed from: b, reason: collision with root package name */
    public final long f854b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f855c;

    /* renamed from: d, reason: collision with root package name */
    public final C0003d f856d;

    public j(l lVar, long j, Object obj, C0003d c0003d) {
        this.f853a = lVar;
        this.f854b = j;
        this.f855c = obj;
        this.f856d = c0003d;
    }

    @Override // L1.InterfaceC0024z
    public final void e() {
        l lVar = this.f853a;
        synchronized (lVar) {
            if (this.f854b < lVar.l()) {
                return;
            }
            Object[] objArr = lVar.f863g;
            D1.i.b(objArr);
            long j = this.f854b;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            m.a(objArr, j, m.f866a);
            lVar.g();
        }
    }
}
