package Z0;

import X0.v;
import a1.AbstractC0428e;
import a1.InterfaceC0424a;
import f1.AbstractC4498a;
import java.util.List;

/* loaded from: classes.dex */
public final class q implements InterfaceC0424a, c {

    /* renamed from: a, reason: collision with root package name */
    public final v f4101a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0428e f4102b;

    /* renamed from: c, reason: collision with root package name */
    public e1.k f4103c;

    public q(v vVar, AbstractC4498a abstractC4498a, e1.j jVar) {
        this.f4101a = vVar;
        jVar.getClass();
        a1.i a9 = jVar.f37153a.a();
        this.f4102b = a9;
        abstractC4498a.d(a9);
        a9.a(this);
    }

    public static int d(int i, int i6) {
        int i9 = i / i6;
        if ((i ^ i6) < 0 && i9 * i6 != i) {
            i9--;
        }
        return i - (i9 * i6);
    }

    @Override // a1.InterfaceC0424a
    public final void a() {
        this.f4101a.invalidateSelf();
    }

    @Override // Z0.c
    public final void b(List list, List list2) {
    }
}
