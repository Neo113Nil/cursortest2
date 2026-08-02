package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class p98 implements p3d {
    public static final p98 a;

    @NotNull
    private static final mhp descriptor;

    static {
        p98 p98Var = new p98();
        a = p98Var;
        j5m j5mVar = new j5m("flex.feature.navigation.action.DismissAction", p98Var, 3);
        j5mVar.k("animated", false);
        j5mVar.k("completionAction", true);
        j5mVar.k("customProps", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{ff7.C(oc3.a), ff7.C((t9f) r98.d[1].getValue()), ajn.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        Boolean bool;
        md mdVar;
        bjn bjnVar;
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = r98.d;
        Boolean bool2 = null;
        if (c.m()) {
            bool = (Boolean) c.n(mhpVar, 0, oc3.a, null);
            mdVar = (md) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            bjnVar = (bjn) c.z(mhpVar, 2, ajn.a, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            md mdVar2 = null;
            bjn bjnVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    bool2 = (Boolean) c.n(mhpVar, 0, oc3.a, bool2);
                    i2 |= 1;
                } else if (w == 1) {
                    mdVar2 = (md) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), mdVar2);
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
            bool = bool2;
            mdVar = mdVar2;
            bjnVar = bjnVar2;
        }
        c.b(mhpVar);
        return new r98(i, bool, mdVar, bjnVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r4, defpackage.bjn.b) == false) goto L12;
     */
    @Override // defpackage.t9f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(l6b l6bVar, Object obj) {
        r98 r98Var = (r98) obj;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = r98.d;
        oc3 oc3Var = oc3.a;
        Boolean bool = r98Var.a;
        bjn bjnVar = r98Var.c;
        md mdVar = r98Var.b;
        c.q(mhpVar, 0, oc3Var, bool);
        if (c.e(mhpVar) || mdVar != null) {
            c.q(mhpVar, 1, (t9f) arfVarArr[1].getValue(), mdVar);
        }
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
