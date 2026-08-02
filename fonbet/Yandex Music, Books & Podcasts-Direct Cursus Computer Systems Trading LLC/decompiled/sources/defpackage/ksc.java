package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class ksc implements p3d {
    public static final ksc a;

    @NotNull
    private static final mhp descriptor;

    static {
        ksc kscVar = new ksc();
        a = kscVar;
        j5m j5mVar = new j5m("flex.feature.navigation.action.ForwardAction", kscVar, 4);
        j5mVar.k("query", false);
        j5mVar.k("document", false);
        j5mVar.k("animated", false);
        j5mVar.k("customProps", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = msc.e;
        return new t9f[]{ff7.C((t9f) arfVarArr[0].getValue()), ff7.C((t9f) arfVarArr[1].getValue()), ff7.C(oc3.a), ajn.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        t5a t5aVar;
        q2a q2aVar;
        Boolean bool;
        bjn bjnVar;
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = msc.e;
        t5a t5aVar2 = null;
        if (c.m()) {
            t5a t5aVar3 = (t5a) c.n(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            q2a q2aVar2 = (q2a) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            Boolean bool2 = (Boolean) c.n(mhpVar, 2, oc3.a, null);
            q2aVar = q2aVar2;
            t5aVar = t5aVar3;
            bjnVar = (bjn) c.z(mhpVar, 3, ajn.a, null);
            bool = bool2;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            q2a q2aVar3 = null;
            Boolean bool3 = null;
            bjn bjnVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    t5aVar2 = (t5a) c.n(mhpVar, 0, (t9f) arfVarArr[0].getValue(), t5aVar2);
                    i2 |= 1;
                } else if (w == 1) {
                    q2aVar3 = (q2a) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), q2aVar3);
                    i2 |= 2;
                } else if (w == 2) {
                    bool3 = (Boolean) c.n(mhpVar, 2, oc3.a, bool3);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    bjnVar2 = (bjn) c.z(mhpVar, 3, ajn.a, bjnVar2);
                    i2 |= 8;
                }
            }
            i = i2;
            t5aVar = t5aVar2;
            q2aVar = q2aVar3;
            bool = bool3;
            bjnVar = bjnVar2;
        }
        c.b(mhpVar);
        return new msc(i, t5aVar, q2aVar, bool, bjnVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0042, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r5, defpackage.bjn.b) == false) goto L7;
     */
    @Override // defpackage.t9f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(l6b l6bVar, Object obj) {
        msc mscVar = (msc) obj;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = msc.e;
        t9f t9fVar = (t9f) arfVarArr[0].getValue();
        t5a t5aVar = mscVar.a;
        bjn bjnVar = mscVar.d;
        c.q(mhpVar, 0, t9fVar, t5aVar);
        c.q(mhpVar, 1, (t9f) arfVarArr[1].getValue(), mscVar.b);
        c.q(mhpVar, 2, oc3.a, mscVar.c);
        if (!c.e(mhpVar)) {
            bjn.Companion.getClass();
        }
        c.k(mhpVar, 3, ajn.a, bjnVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
