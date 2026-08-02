package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class ceq implements p3d {
    public static final ceq a;

    @NotNull
    private static final mhp descriptor;

    static {
        ceq ceqVar = new ceq();
        a = ceqVar;
        j5m j5mVar = new j5m("flex.feature.navigation.action.ShowOverlayAction", ceqVar, 3);
        j5mVar.k("document", false);
        j5mVar.k("tag", false);
        j5mVar.k("customProps", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{ff7.C((t9f) eeq.d[0].getValue()), tkr.a, ajn.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        q2a q2aVar;
        String str;
        bjn bjnVar;
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = eeq.d;
        q2a q2aVar2 = null;
        if (c.m()) {
            q2aVar = (q2a) c.n(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            str = c.g(mhpVar, 1);
            bjnVar = (bjn) c.z(mhpVar, 2, ajn.a, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            String str2 = null;
            bjn bjnVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    q2aVar2 = (q2a) c.n(mhpVar, 0, (t9f) arfVarArr[0].getValue(), q2aVar2);
                    i2 |= 1;
                } else if (w == 1) {
                    str2 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    bjnVar2 = (bjn) c.z(mhpVar, 2, ajn.a, bjnVar2);
                    i2 |= 4;
                }
            }
            i = i2;
            q2aVar = q2aVar2;
            str = str2;
            bjnVar = bjnVar2;
        }
        c.b(mhpVar);
        return new eeq(i, q2aVar, str, bjnVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0032, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r4, defpackage.bjn.b) == false) goto L7;
     */
    @Override // defpackage.t9f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(l6b l6bVar, Object obj) {
        eeq eeqVar = (eeq) obj;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        t9f t9fVar = (t9f) eeq.d[0].getValue();
        q2a q2aVar = eeqVar.a;
        bjn bjnVar = eeqVar.c;
        c.q(mhpVar, 0, t9fVar, q2aVar);
        c.p(mhpVar, 1, eeqVar.b);
        if (!c.e(mhpVar)) {
            bjn.Companion.getClass();
        }
        c.k(mhpVar, 2, ajn.a, bjnVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
