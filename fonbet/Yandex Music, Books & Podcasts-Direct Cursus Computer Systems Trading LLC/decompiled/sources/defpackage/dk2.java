package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class dk2 implements p3d {
    public static final dk2 a;

    @NotNull
    private static final mhp descriptor;

    static {
        dk2 dk2Var = new dk2();
        a = dk2Var;
        j5m j5mVar = new j5m("flex.feature.navigation.action.BackwardAction", dk2Var, 2);
        j5mVar.k("animated", false);
        j5mVar.k("customProps", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{ff7.C(oc3.a), ajn.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        Boolean bool;
        bjn bjnVar;
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        Boolean bool2 = null;
        if (c.m()) {
            bool = (Boolean) c.n(mhpVar, 0, oc3.a, null);
            bjnVar = (bjn) c.z(mhpVar, 1, ajn.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            bjn bjnVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    bool2 = (Boolean) c.n(mhpVar, 0, oc3.a, bool2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    bjnVar2 = (bjn) c.z(mhpVar, 1, ajn.a, bjnVar2);
                    i2 |= 2;
                }
            }
            i = i2;
            bool = bool2;
            bjnVar = bjnVar2;
        }
        c.b(mhpVar);
        return new fk2(i, bool, bjnVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r6, defpackage.bjn.b) == false) goto L7;
     */
    @Override // defpackage.t9f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(l6b l6bVar, Object obj) {
        fk2 fk2Var = (fk2) obj;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        oc3 oc3Var = oc3.a;
        Boolean bool = fk2Var.a;
        bjn bjnVar = fk2Var.b;
        c.q(mhpVar, 0, oc3Var, bool);
        if (!c.e(mhpVar)) {
            bjn.Companion.getClass();
        }
        c.k(mhpVar, 1, ajn.a, bjnVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
