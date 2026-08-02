package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class czj implements p3d {
    public static final czj a;

    @NotNull
    private static final mhp descriptor;

    static {
        czj czjVar = new czj();
        a = czjVar;
        j5m j5mVar = new j5m("flex.feature.navigation.action.OverlayAction", czjVar, 5);
        j5mVar.k("query", false);
        j5mVar.k("document", false);
        j5mVar.k("animated", false);
        j5mVar.k("fullscreen", false);
        j5mVar.k("customProps", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = ezj.f;
        t9f C = ff7.C((t9f) arfVarArr[0].getValue());
        t9f C2 = ff7.C((t9f) arfVarArr[1].getValue());
        oc3 oc3Var = oc3.a;
        return new t9f[]{C, C2, ff7.C(oc3Var), ff7.C(oc3Var), ajn.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        t5a t5aVar;
        q2a q2aVar;
        Boolean bool;
        Boolean bool2;
        bjn bjnVar;
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = ezj.f;
        int i2 = 0;
        t5a t5aVar2 = null;
        if (c.m()) {
            t5a t5aVar3 = (t5a) c.n(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            q2a q2aVar2 = (q2a) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            oc3 oc3Var = oc3.a;
            Boolean bool3 = (Boolean) c.n(mhpVar, 2, oc3Var, null);
            q2aVar = q2aVar2;
            t5aVar = t5aVar3;
            bool2 = (Boolean) c.n(mhpVar, 3, oc3Var, null);
            bjnVar = (bjn) c.z(mhpVar, 4, ajn.a, null);
            bool = bool3;
            i = 31;
        } else {
            int i3 = 1;
            int i4 = 0;
            q2a q2aVar3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            bjn bjnVar2 = null;
            while (i3 != 0) {
                int w = c.w(mhpVar);
                int i5 = i2;
                if (w == -1) {
                    i2 = i5;
                    i3 = i2;
                } else if (w != 0) {
                    if (w == 1) {
                        q2aVar3 = (q2a) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), q2aVar3);
                        i4 |= 2;
                    } else if (w == 2) {
                        bool4 = (Boolean) c.n(mhpVar, 2, oc3.a, bool4);
                        i4 |= 4;
                    } else if (w == 3) {
                        bool5 = (Boolean) c.n(mhpVar, 3, oc3.a, bool5);
                        i4 |= 8;
                    } else {
                        if (w != 4) {
                            l1j.g(w);
                            return null;
                        }
                        bjnVar2 = (bjn) c.z(mhpVar, 4, ajn.a, bjnVar2);
                        i4 |= 16;
                    }
                    i2 = i5;
                } else {
                    t5aVar2 = (t5a) c.n(mhpVar, i5, (t9f) arfVarArr[i5].getValue(), t5aVar2);
                    i4 |= 1;
                    i2 = i5;
                }
            }
            i = i4;
            t5aVar = t5aVar2;
            q2aVar = q2aVar3;
            bool = bool4;
            bool2 = bool5;
            bjnVar = bjnVar2;
        }
        c.b(mhpVar);
        return new ezj(i, t5aVar, q2aVar, bool, bool2, bjnVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0048, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r5, defpackage.bjn.b) == false) goto L7;
     */
    @Override // defpackage.t9f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(l6b l6bVar, Object obj) {
        ezj ezjVar = (ezj) obj;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = ezj.f;
        t9f t9fVar = (t9f) arfVarArr[0].getValue();
        t5a t5aVar = ezjVar.a;
        bjn bjnVar = ezjVar.e;
        c.q(mhpVar, 0, t9fVar, t5aVar);
        c.q(mhpVar, 1, (t9f) arfVarArr[1].getValue(), ezjVar.b);
        oc3 oc3Var = oc3.a;
        c.q(mhpVar, 2, oc3Var, ezjVar.c);
        c.q(mhpVar, 3, oc3Var, ezjVar.d);
        if (!c.e(mhpVar)) {
            bjn.Companion.getClass();
        }
        c.k(mhpVar, 4, ajn.a, bjnVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
