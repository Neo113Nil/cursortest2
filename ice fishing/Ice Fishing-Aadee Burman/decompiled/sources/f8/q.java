package f8;

import a.AbstractC0422a;
import java.util.List;
import u7.C5093k;
import v7.C5135p;

/* loaded from: classes2.dex */
public final class q implements c8.e {

    /* renamed from: a, reason: collision with root package name */
    public final C5093k f37575a;

    public q(I7.a aVar) {
        this.f37575a = AbstractC0422a.q(aVar);
    }

    @Override // c8.e
    public final String a() {
        return k().a();
    }

    @Override // c8.e
    public final int c(String name) {
        kotlin.jvm.internal.h.e(name, "name");
        return k().c(name);
    }

    @Override // c8.e
    public final t8.g d() {
        return k().d();
    }

    @Override // c8.e
    public final int e() {
        return k().e();
    }

    @Override // c8.e
    public final String f(int i) {
        return k().f(i);
    }

    @Override // c8.e
    public final boolean g() {
        return false;
    }

    @Override // c8.e
    public final List getAnnotations() {
        return C5135p.f41439n;
    }

    @Override // c8.e
    public final List h(int i) {
        return k().h(i);
    }

    @Override // c8.e
    public final c8.e i(int i) {
        return k().i(i);
    }

    @Override // c8.e
    public final boolean j(int i) {
        return k().j(i);
    }

    public final c8.e k() {
        return (c8.e) this.f37575a.getValue();
    }

    @Override // c8.e
    public final void b() {
    }
}
