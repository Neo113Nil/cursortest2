package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class dbr extends z3f {
    public final dei a;
    public final z3f b;
    public final z3f c;
    public final z3f d;
    public final z3f e;
    public final z3f f;

    public dbr(dei deiVar) {
        this.a = deiVar;
        Set set = avt.a;
        this.b = deiVar.a(List.class, set, null);
        this.c = deiVar.a(Map.class, set, null);
        this.d = deiVar.a(String.class, set, null);
        this.e = deiVar.a(Double.class, set, null);
        this.f = deiVar.a(Boolean.class, set, null);
    }

    @Override // defpackage.z3f
    public final Object a(l7f l7fVar) {
        int D = ouj.D(l7fVar.peek());
        if (D == 0) {
            return this.b.a(l7fVar);
        }
        if (D == 2) {
            return this.c.a(l7fVar);
        }
        if (D == 5) {
            return this.d.a(l7fVar);
        }
        if (D == 6) {
            return this.e.a(l7fVar);
        }
        if (D == 7) {
            return this.f.a(l7fVar);
        }
        if (D == 8) {
            l7fVar.u0();
            return null;
        }
        e7o.l("Expected a value but was ", f1d.w(l7fVar.peek()), " at path ", l7fVar.getPath());
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if (r1.isAssignableFrom(r0) != false) goto L8;
     */
    @Override // defpackage.z3f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(n7f n7fVar, Object obj) {
        Class<?> cls = obj.getClass();
        if (cls == Object.class) {
            n7fVar.g();
            n7fVar.f = false;
            n7fVar.o(3, 5, '}');
        } else {
            Class<?> cls2 = Map.class;
            if (!cls2.isAssignableFrom(cls)) {
                cls2 = Collection.class;
            }
            cls = cls2;
            this.a.a(cls, avt.a, null).e(n7fVar, obj);
        }
    }

    public final String toString() {
        return "JsonAdapter(Object)";
    }
}
