package z7;

import I7.p;
import java.io.Serializable;

/* renamed from: z7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5266c implements InterfaceC5272i, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC5272i f42269n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC5270g f42270u;

    public C5266c(InterfaceC5270g element, InterfaceC5272i left) {
        kotlin.jvm.internal.h.e(left, "left");
        kotlin.jvm.internal.h.e(element, "element");
        this.f42269n = left;
        this.f42270u = element;
    }

    public final boolean equals(Object obj) {
        boolean z3;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5266c) {
            C5266c c5266c = (C5266c) obj;
            c5266c.getClass();
            int i = 2;
            C5266c c5266c2 = c5266c;
            int i6 = 2;
            while (true) {
                InterfaceC5272i interfaceC5272i = c5266c2.f42269n;
                c5266c2 = interfaceC5272i instanceof C5266c ? (C5266c) interfaceC5272i : null;
                if (c5266c2 == null) {
                    break;
                }
                i6++;
            }
            C5266c c5266c3 = this;
            while (true) {
                InterfaceC5272i interfaceC5272i2 = c5266c3.f42269n;
                c5266c3 = interfaceC5272i2 instanceof C5266c ? (C5266c) interfaceC5272i2 : null;
                if (c5266c3 == null) {
                    break;
                }
                i++;
            }
            if (i6 == i) {
                C5266c c5266c4 = this;
                while (true) {
                    InterfaceC5270g interfaceC5270g = c5266c4.f42270u;
                    if (!kotlin.jvm.internal.h.a(c5266c.m(interfaceC5270g.getKey()), interfaceC5270g)) {
                        z3 = false;
                        break;
                    }
                    InterfaceC5272i interfaceC5272i3 = c5266c4.f42269n;
                    if (!(interfaceC5272i3 instanceof C5266c)) {
                        kotlin.jvm.internal.h.c(interfaceC5272i3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        InterfaceC5270g interfaceC5270g2 = (InterfaceC5270g) interfaceC5272i3;
                        z3 = kotlin.jvm.internal.h.a(c5266c.m(interfaceC5270g2.getKey()), interfaceC5270g2);
                        break;
                    }
                    c5266c4 = (C5266c) interfaceC5272i3;
                }
                if (z3) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f42270u.hashCode() + this.f42269n.hashCode();
    }

    @Override // z7.InterfaceC5272i
    public final InterfaceC5272i i(InterfaceC5271h key) {
        kotlin.jvm.internal.h.e(key, "key");
        InterfaceC5270g interfaceC5270g = this.f42270u;
        InterfaceC5270g m4 = interfaceC5270g.m(key);
        InterfaceC5272i interfaceC5272i = this.f42269n;
        if (m4 != null) {
            return interfaceC5272i;
        }
        InterfaceC5272i i = interfaceC5272i.i(key);
        return i == interfaceC5272i ? this : i == C5273j.f42272n ? interfaceC5270g : new C5266c(interfaceC5270g, i);
    }

    @Override // z7.InterfaceC5272i
    public final Object l(Object obj, p pVar) {
        return pVar.invoke(this.f42269n.l(obj, pVar), this.f42270u);
    }

    @Override // z7.InterfaceC5272i
    public final InterfaceC5270g m(InterfaceC5271h key) {
        kotlin.jvm.internal.h.e(key, "key");
        C5266c c5266c = this;
        while (true) {
            InterfaceC5270g m4 = c5266c.f42270u.m(key);
            if (m4 != null) {
                return m4;
            }
            InterfaceC5272i interfaceC5272i = c5266c.f42269n;
            if (!(interfaceC5272i instanceof C5266c)) {
                return interfaceC5272i.m(key);
            }
            c5266c = (C5266c) interfaceC5272i;
        }
    }

    @Override // z7.InterfaceC5272i
    public final InterfaceC5272i n(InterfaceC5272i context) {
        kotlin.jvm.internal.h.e(context, "context");
        return context == C5273j.f42272n ? this : (InterfaceC5272i) context.l(this, new C5265b(1));
    }

    public final String toString() {
        return "[" + ((String) l("", new C5265b(0))) + ']';
    }
}
