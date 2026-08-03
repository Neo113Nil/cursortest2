package androidx.compose.ui.input.pointer;

import a.a;
import pc.j;
import r1.z;
import x1.y0;
import y0.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f593a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f594b;

    /* renamed from: c, reason: collision with root package name */
    public final PointerInputEventHandler f595c;

    public SuspendPointerInputElement(Object obj, a aVar, PointerInputEventHandler pointerInputEventHandler, int i10) {
        aVar = (i10 & 2) != 0 ? null : aVar;
        this.f593a = obj;
        this.f594b = aVar;
        this.f595c = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        return this.f593a.equals(suspendPointerInputElement.f593a) && j.a(this.f594b, suspendPointerInputElement.f594b) && this.f595c == suspendPointerInputElement.f595c;
    }

    @Override // x1.y0
    public final m f() {
        return new z(this.f593a, this.f594b, this.f595c);
    }

    @Override // x1.y0
    public final void g(m mVar) {
        z zVar = (z) mVar;
        Object obj = zVar.f6007u;
        Object obj2 = this.f593a;
        boolean z10 = !j.a(obj, obj2);
        zVar.f6007u = obj2;
        Object obj3 = zVar.f6008v;
        Object obj4 = this.f594b;
        if (!j.a(obj3, obj4)) {
            z10 = true;
        }
        zVar.f6008v = obj4;
        Class<?> cls = zVar.f6010x.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f595c;
        if (cls == pointerInputEventHandler.getClass() ? z10 : true) {
            zVar.s0();
        }
        zVar.f6010x = pointerInputEventHandler;
    }

    public final int hashCode() {
        int hashCode = this.f593a.hashCode() * 31;
        Object obj = this.f594b;
        return this.f595c.hashCode() + ((hashCode + (obj != null ? obj.hashCode() : 0)) * 961);
    }
}
