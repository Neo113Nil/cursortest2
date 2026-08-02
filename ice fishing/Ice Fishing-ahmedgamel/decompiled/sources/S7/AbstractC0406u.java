package S7;

import z7.AbstractC5237a;
import z7.C5241e;
import z7.C5246j;
import z7.InterfaceC5242f;
import z7.InterfaceC5243g;
import z7.InterfaceC5244h;
import z7.InterfaceC5245i;

/* renamed from: S7.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0406u extends AbstractC5237a implements InterfaceC5242f {

    /* renamed from: u, reason: collision with root package name */
    public static final C0405t f3076u = new C0405t(C5241e.f42240n, C0404s.f3071n);

    public AbstractC0406u() {
        super(C5241e.f42240n);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v2, types: [I7.l, kotlin.jvm.internal.i] */
    @Override // z7.AbstractC5237a, z7.InterfaceC5245i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5245i i(InterfaceC5244h key) {
        kotlin.jvm.internal.h.e(key, "key");
        boolean z6 = key instanceof C0405t;
        C5246j c5246j = C5246j.f42241n;
        if (z6) {
            C0405t c0405t = (C0405t) key;
            InterfaceC5244h interfaceC5244h = this.f42236n;
            return (interfaceC5244h == c0405t || c0405t.f3074u == interfaceC5244h) ? ((InterfaceC5243g) c0405t.f3073n.invoke(this)) != null ? c5246j : this : this;
        }
        if (C5241e.f42240n == key) {
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [I7.l, kotlin.jvm.internal.i] */
    @Override // z7.AbstractC5237a, z7.InterfaceC5245i
    public final InterfaceC5243g m(InterfaceC5244h key) {
        InterfaceC5243g interfaceC5243g;
        kotlin.jvm.internal.h.e(key, "key");
        if (!(key instanceof C0405t)) {
            if (C5241e.f42240n == key) {
                return this;
            }
            return null;
        }
        C0405t c0405t = (C0405t) key;
        InterfaceC5244h interfaceC5244h = this.f42236n;
        if ((interfaceC5244h == c0405t || c0405t.f3074u == interfaceC5244h) && (interfaceC5243g = (InterfaceC5243g) c0405t.f3073n.invoke(this)) != null) {
            return interfaceC5243g;
        }
        return null;
    }

    public abstract void p(InterfaceC5245i interfaceC5245i, Runnable runnable);

    public void q(InterfaceC5245i interfaceC5245i, Runnable runnable) {
        p(interfaceC5245i, runnable);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0410y.j(this);
    }

    public boolean z() {
        return !(this instanceof v0);
    }
}
