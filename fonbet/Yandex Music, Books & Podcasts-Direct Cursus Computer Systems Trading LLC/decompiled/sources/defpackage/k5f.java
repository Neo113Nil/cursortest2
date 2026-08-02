package defpackage;

import kotlin.text.StringsKt;
import kotlin.text.b;
import kotlin.text.h;

/* loaded from: classes5.dex */
public final class k5f implements t9f {
    public static final k5f a = new k5f();
    public static final gsm b = avf.g("kotlinx.serialization.json.JsonLiteral", csm.j);

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        w4f f = ltg.r(eg7Var).f();
        if (f instanceof j5f) {
            return (j5f) f;
        }
        throw ghh.j("Unexpected JSON element, expected JsonLiteral, had " + ern.a(f.getClass()), f.toString(), -1);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        j5f j5fVar = (j5f) obj;
        l6bVar.getClass();
        j5fVar.getClass();
        ltg.s(l6bVar);
        boolean z = j5fVar.a;
        String str = j5fVar.c;
        if (z) {
            l6bVar.E(str);
            return;
        }
        mhp mhpVar = j5fVar.b;
        if (mhpVar != null) {
            l6bVar.i(mhpVar).E(str);
            return;
        }
        Long s0 = StringsKt.s0(str);
        if (s0 != null) {
            l6bVar.r(s0.longValue());
            return;
        }
        net e = h.e(str);
        if (e != null) {
            long j = e.a;
            net.b.getClass();
            l6bVar.i(ret.b).r(j);
            return;
        }
        Double h = b.h(str);
        if (h != null) {
            l6bVar.f(h.doubleValue());
            return;
        }
        Boolean p0 = StringsKt.p0(str);
        if (p0 != null) {
            l6bVar.x(p0.booleanValue());
        } else {
            l6bVar.E(str);
        }
    }
}
