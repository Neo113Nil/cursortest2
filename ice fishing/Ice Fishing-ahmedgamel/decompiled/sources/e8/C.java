package e8;

import com.icefishing.icefishingbigwin.AbstractC4404f;
import java.util.List;
import v7.C5135p;

/* loaded from: classes2.dex */
public abstract class C implements c8.e {

    /* renamed from: a, reason: collision with root package name */
    public final c8.e f37243a;

    public C(c8.e eVar) {
        this.f37243a = eVar;
    }

    @Override // c8.e
    public final int c(String name) {
        kotlin.jvm.internal.h.e(name, "name");
        Integer S8 = Q7.q.S(name);
        if (S8 != null) {
            return S8.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid list index"));
    }

    @Override // c8.e
    public final t8.g d() {
        return c8.i.f5652c;
    }

    @Override // c8.e
    public final int e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c9 = (C) obj;
        return kotlin.jvm.internal.h.a(this.f37243a, c9.f37243a) && kotlin.jvm.internal.h.a(a(), c9.a());
    }

    @Override // c8.e
    public final String f(int i) {
        return String.valueOf(i);
    }

    @Override // c8.e
    public final boolean g() {
        return false;
    }

    @Override // c8.e
    public final List getAnnotations() {
        return C5135p.f41442n;
    }

    @Override // c8.e
    public final List h(int i) {
        if (i >= 0) {
            return C5135p.f41442n;
        }
        StringBuilder i6 = AbstractC4404f.i(i, "Illegal index ", ", ");
        i6.append(a());
        i6.append(" expects only non-negative indices");
        throw new IllegalArgumentException(i6.toString().toString());
    }

    public final int hashCode() {
        return a().hashCode() + (this.f37243a.hashCode() * 31);
    }

    @Override // c8.e
    public final c8.e i(int i) {
        if (i >= 0) {
            return this.f37243a;
        }
        StringBuilder i6 = AbstractC4404f.i(i, "Illegal index ", ", ");
        i6.append(a());
        i6.append(" expects only non-negative indices");
        throw new IllegalArgumentException(i6.toString().toString());
    }

    @Override // c8.e
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder i6 = AbstractC4404f.i(i, "Illegal index ", ", ");
        i6.append(a());
        i6.append(" expects only non-negative indices");
        throw new IllegalArgumentException(i6.toString().toString());
    }

    public final String toString() {
        return a() + '(' + this.f37243a + ')';
    }

    @Override // c8.e
    public final void b() {
    }
}
