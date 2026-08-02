package e8;

import com.google.android.gms.internal.ads.Wv;
import java.util.List;
import v7.C5125p;

/* loaded from: classes2.dex */
public abstract class C implements c8.e {

    /* renamed from: a, reason: collision with root package name */
    public final c8.e f37319a;

    public C(c8.e eVar) {
        this.f37319a = eVar;
    }

    @Override // c8.e
    public final int c(String name) {
        kotlin.jvm.internal.h.e(name, "name");
        Integer i02 = Q7.q.i0(name);
        if (i02 != null) {
            return i02.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid list index"));
    }

    @Override // c8.e
    public final com.bumptech.glide.h d() {
        return c8.i.f5828c;
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
        return kotlin.jvm.internal.h.a(this.f37319a, c9.f37319a) && kotlin.jvm.internal.h.a(a(), c9.a());
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
        return C5125p.f41221n;
    }

    @Override // c8.e
    public final List h(int i) {
        if (i >= 0) {
            return C5125p.f41221n;
        }
        StringBuilder k9 = Wv.k(i, "Illegal index ", ", ");
        k9.append(a());
        k9.append(" expects only non-negative indices");
        throw new IllegalArgumentException(k9.toString().toString());
    }

    public final int hashCode() {
        return a().hashCode() + (this.f37319a.hashCode() * 31);
    }

    @Override // c8.e
    public final c8.e i(int i) {
        if (i >= 0) {
            return this.f37319a;
        }
        StringBuilder k9 = Wv.k(i, "Illegal index ", ", ");
        k9.append(a());
        k9.append(" expects only non-negative indices");
        throw new IllegalArgumentException(k9.toString().toString());
    }

    @Override // c8.e
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder k9 = Wv.k(i, "Illegal index ", ", ");
        k9.append(a());
        k9.append(" expects only non-negative indices");
        throw new IllegalArgumentException(k9.toString().toString());
    }

    public final String toString() {
        return a() + '(' + this.f37319a + ')';
    }

    @Override // c8.e
    public final void b() {
    }
}
