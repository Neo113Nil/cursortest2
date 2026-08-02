package z7;

import I7.p;
import java.io.Serializable;

/* renamed from: z7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5239c implements InterfaceC5245i, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC5245i f42238n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC5243g f42239u;

    public C5239c(InterfaceC5243g element, InterfaceC5245i left) {
        kotlin.jvm.internal.h.e(left, "left");
        kotlin.jvm.internal.h.e(element, "element");
        this.f42238n = left;
        this.f42239u = element;
    }

    public final boolean equals(Object obj) {
        boolean z6;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5239c) {
            C5239c c5239c = (C5239c) obj;
            c5239c.getClass();
            int i = 2;
            C5239c c5239c2 = c5239c;
            int i4 = 2;
            while (true) {
                InterfaceC5245i interfaceC5245i = c5239c2.f42238n;
                c5239c2 = interfaceC5245i instanceof C5239c ? (C5239c) interfaceC5245i : null;
                if (c5239c2 == null) {
                    break;
                }
                i4++;
            }
            C5239c c5239c3 = this;
            while (true) {
                InterfaceC5245i interfaceC5245i2 = c5239c3.f42238n;
                c5239c3 = interfaceC5245i2 instanceof C5239c ? (C5239c) interfaceC5245i2 : null;
                if (c5239c3 == null) {
                    break;
                }
                i++;
            }
            if (i4 == i) {
                C5239c c5239c4 = this;
                while (true) {
                    InterfaceC5243g interfaceC5243g = c5239c4.f42239u;
                    if (!kotlin.jvm.internal.h.a(c5239c.m(interfaceC5243g.getKey()), interfaceC5243g)) {
                        z6 = false;
                        break;
                    }
                    InterfaceC5245i interfaceC5245i3 = c5239c4.f42238n;
                    if (!(interfaceC5245i3 instanceof C5239c)) {
                        kotlin.jvm.internal.h.c(interfaceC5245i3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        InterfaceC5243g interfaceC5243g2 = (InterfaceC5243g) interfaceC5245i3;
                        z6 = kotlin.jvm.internal.h.a(c5239c.m(interfaceC5243g2.getKey()), interfaceC5243g2);
                        break;
                    }
                    c5239c4 = (C5239c) interfaceC5245i3;
                }
                if (z6) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f42239u.hashCode() + this.f42238n.hashCode();
    }

    @Override // z7.InterfaceC5245i
    public final InterfaceC5245i i(InterfaceC5244h key) {
        kotlin.jvm.internal.h.e(key, "key");
        InterfaceC5243g interfaceC5243g = this.f42239u;
        InterfaceC5243g m9 = interfaceC5243g.m(key);
        InterfaceC5245i interfaceC5245i = this.f42238n;
        if (m9 != null) {
            return interfaceC5245i;
        }
        InterfaceC5245i i = interfaceC5245i.i(key);
        return i == interfaceC5245i ? this : i == C5246j.f42241n ? interfaceC5243g : new C5239c(interfaceC5243g, i);
    }

    @Override // z7.InterfaceC5245i
    public final Object l(Object obj, p pVar) {
        return pVar.invoke(this.f42238n.l(obj, pVar), this.f42239u);
    }

    @Override // z7.InterfaceC5245i
    public final InterfaceC5243g m(InterfaceC5244h key) {
        kotlin.jvm.internal.h.e(key, "key");
        C5239c c5239c = this;
        while (true) {
            InterfaceC5243g m9 = c5239c.f42239u.m(key);
            if (m9 != null) {
                return m9;
            }
            InterfaceC5245i interfaceC5245i = c5239c.f42238n;
            if (!(interfaceC5245i instanceof C5239c)) {
                return interfaceC5245i.m(key);
            }
            c5239c = (C5239c) interfaceC5245i;
        }
    }

    @Override // z7.InterfaceC5245i
    public final InterfaceC5245i n(InterfaceC5245i context) {
        kotlin.jvm.internal.h.e(context, "context");
        return context == C5246j.f42241n ? this : (InterfaceC5245i) context.l(this, new C5238b(1));
    }

    public final String toString() {
        return "[" + ((String) l("", new C5238b(0))) + ']';
    }
}
