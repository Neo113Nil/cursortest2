package O7;

import v7.AbstractC5130a;
import v7.C5134e;
import v7.C5139j;
import v7.InterfaceC5135f;
import v7.InterfaceC5136g;
import v7.InterfaceC5137h;
import v7.InterfaceC5138i;

/* renamed from: O7.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0395u extends AbstractC5130a implements InterfaceC5135f {

    /* renamed from: u, reason: collision with root package name */
    public static final C0394t f2629u = new C0394t(C5134e.f41371n, C0393s.f2624n);

    public AbstractC0395u() {
        super(C5134e.f41371n);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v2, types: [E7.l, kotlin.jvm.internal.i] */
    @Override // v7.AbstractC5130a, v7.InterfaceC5138i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5138i g(InterfaceC5137h key) {
        kotlin.jvm.internal.h.e(key, "key");
        boolean z8 = key instanceof C0394t;
        C5139j c5139j = C5139j.f41372n;
        if (z8) {
            C0394t c0394t = (C0394t) key;
            InterfaceC5137h interfaceC5137h = this.f41367n;
            return (interfaceC5137h == c0394t || c0394t.f2627u == interfaceC5137h) ? ((InterfaceC5136g) c0394t.f2626n.invoke(this)) != null ? c5139j : this : this;
        }
        if (C5134e.f41371n == key) {
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [E7.l, kotlin.jvm.internal.i] */
    @Override // v7.AbstractC5130a, v7.InterfaceC5138i
    public final InterfaceC5136g i(InterfaceC5137h key) {
        InterfaceC5136g interfaceC5136g;
        kotlin.jvm.internal.h.e(key, "key");
        if (!(key instanceof C0394t)) {
            if (C5134e.f41371n == key) {
                return this;
            }
            return null;
        }
        C0394t c0394t = (C0394t) key;
        InterfaceC5137h interfaceC5137h = this.f41367n;
        if ((interfaceC5137h == c0394t || c0394t.f2627u == interfaceC5137h) && (interfaceC5136g = (InterfaceC5136g) c0394t.f2626n.invoke(this)) != null) {
            return interfaceC5136g;
        }
        return null;
    }

    public abstract void p(InterfaceC5138i interfaceC5138i, Runnable runnable);

    public void q(InterfaceC5138i interfaceC5138i, Runnable runnable) {
        p(interfaceC5138i, runnable);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0399y.j(this);
    }

    public boolean z() {
        return !(this instanceof v0);
    }
}
