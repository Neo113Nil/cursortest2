package b1;

import Z0.v;
import c1.AbstractC0545e;
import c1.InterfaceC0541a;
import h1.AbstractC4563a;
import java.util.List;

/* loaded from: classes.dex */
public final class q implements InterfaceC0541a, InterfaceC0519c {

    /* renamed from: a, reason: collision with root package name */
    public final v f5490a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0545e f5491b;

    /* renamed from: c, reason: collision with root package name */
    public g1.k f5492c;

    public q(v vVar, AbstractC4563a abstractC4563a, g1.j jVar) {
        this.f5490a = vVar;
        jVar.getClass();
        c1.i a9 = jVar.f37629a.a();
        this.f5491b = a9;
        abstractC4563a.f(a9);
        a9.a(this);
    }

    public static int c(int i, int i4) {
        int i6 = i / i4;
        if ((i ^ i4) < 0 && i6 * i4 != i) {
            i6--;
        }
        return i - (i6 * i4);
    }

    @Override // c1.InterfaceC0541a
    public final void a() {
        this.f5490a.invalidateSelf();
    }

    @Override // b1.InterfaceC0519c
    public final void b(List list, List list2) {
    }
}
