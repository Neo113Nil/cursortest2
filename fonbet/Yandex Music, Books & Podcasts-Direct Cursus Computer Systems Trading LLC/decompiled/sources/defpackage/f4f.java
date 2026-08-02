package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class f4f implements t9f {
    public static final f4f a = new f4f();
    public static final e4f b = e4f.b;

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        ltg.r(eg7Var);
        return new c4f((List) new qy0(z4f.a, 0).f(eg7Var));
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        c4f c4fVar = (c4f) obj;
        l6bVar.getClass();
        c4fVar.getClass();
        ltg.s(l6bVar);
        z4f z4fVar = z4f.a;
        ux0 ux0Var = new ux0(z4fVar.getDescriptor());
        int size = c4fVar.size();
        wq5 t = l6bVar.t(ux0Var, size);
        Iterator<w4f> it = c4fVar.iterator();
        for (int i = 0; i < size; i++) {
            t.k(ux0Var, i, z4fVar, it.next());
        }
        t.b(ux0Var);
    }
}
