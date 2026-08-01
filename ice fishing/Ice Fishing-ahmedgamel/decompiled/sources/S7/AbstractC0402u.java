package S7;

import z7.AbstractC5264a;
import z7.C5268e;
import z7.C5273j;
import z7.InterfaceC5269f;
import z7.InterfaceC5270g;
import z7.InterfaceC5271h;
import z7.InterfaceC5272i;

/* renamed from: S7.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0402u extends AbstractC5264a implements InterfaceC5269f {

    /* renamed from: u, reason: collision with root package name */
    public static final C0401t f2993u = new C0401t(C5268e.f42271n, C0400s.f2988n);

    public AbstractC0402u() {
        super(C5268e.f42271n);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v2, types: [I7.l, kotlin.jvm.internal.i] */
    @Override // z7.AbstractC5264a, z7.InterfaceC5272i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5272i i(InterfaceC5271h key) {
        kotlin.jvm.internal.h.e(key, "key");
        boolean z3 = key instanceof C0401t;
        C5273j c5273j = C5273j.f42272n;
        if (z3) {
            C0401t c0401t = (C0401t) key;
            InterfaceC5271h interfaceC5271h = this.f42267n;
            return (interfaceC5271h == c0401t || c0401t.f2991u == interfaceC5271h) ? ((InterfaceC5270g) c0401t.f2990n.invoke(this)) != null ? c5273j : this : this;
        }
        if (C5268e.f42271n == key) {
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [I7.l, kotlin.jvm.internal.i] */
    @Override // z7.AbstractC5264a, z7.InterfaceC5272i
    public final InterfaceC5270g m(InterfaceC5271h key) {
        InterfaceC5270g interfaceC5270g;
        kotlin.jvm.internal.h.e(key, "key");
        if (!(key instanceof C0401t)) {
            if (C5268e.f42271n == key) {
                return this;
            }
            return null;
        }
        C0401t c0401t = (C0401t) key;
        InterfaceC5271h interfaceC5271h = this.f42267n;
        if ((interfaceC5271h == c0401t || c0401t.f2991u == interfaceC5271h) && (interfaceC5270g = (InterfaceC5270g) c0401t.f2990n.invoke(this)) != null) {
            return interfaceC5270g;
        }
        return null;
    }

    public abstract void p(InterfaceC5272i interfaceC5272i, Runnable runnable);

    public void q(InterfaceC5272i interfaceC5272i, Runnable runnable) {
        p(interfaceC5272i, runnable);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0406y.j(this);
    }

    public boolean z() {
        return !(this instanceof v0);
    }
}
