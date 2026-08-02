package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class feq implements p3d {
    public static final feq a;

    @NotNull
    private static final mhp descriptor;

    static {
        feq feqVar = new feq();
        a = feqVar;
        j5m j5mVar = new j5m("flex.feature.navigation.action.ShowPopupAction", feqVar, 10);
        j5mVar.k("query", false);
        j5mVar.k("document", false);
        j5mVar.k("fullscreen", false);
        j5mVar.k("closeOnSlideDown", false);
        j5mVar.k("closeOnTapOutside", false);
        j5mVar.k("dimBackground", false);
        j5mVar.k("defaultHeight", false);
        j5mVar.k("shouldLoadByQuery", false);
        j5mVar.k("customProps", true);
        j5mVar.k("completionAction", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = heq.k;
        t9f C = ff7.C((t9f) arfVarArr[0].getValue());
        t9f C2 = ff7.C((t9f) arfVarArr[1].getValue());
        oc3 oc3Var = oc3.a;
        return new t9f[]{C, C2, ff7.C(oc3Var), ff7.C(oc3Var), ff7.C(oc3Var), ff7.C(oc3Var), ff7.C(zic.a), ff7.C(oc3Var), ajn.a, ff7.C((t9f) arfVarArr[9].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        md mdVar;
        bjn bjnVar;
        Boolean bool;
        Boolean bool2;
        Float f;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        t5a t5aVar;
        q2a q2aVar;
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = heq.k;
        char c2 = '\b';
        int i2 = 9;
        t5a t5aVar2 = null;
        if (c.m()) {
            t5a t5aVar3 = (t5a) c.n(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            q2a q2aVar2 = (q2a) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            oc3 oc3Var = oc3.a;
            Boolean bool6 = (Boolean) c.n(mhpVar, 2, oc3Var, null);
            Boolean bool7 = (Boolean) c.n(mhpVar, 3, oc3Var, null);
            Boolean bool8 = (Boolean) c.n(mhpVar, 4, oc3Var, null);
            Boolean bool9 = (Boolean) c.n(mhpVar, 5, oc3Var, null);
            Float f2 = (Float) c.n(mhpVar, 6, zic.a, null);
            Boolean bool10 = (Boolean) c.n(mhpVar, 7, oc3Var, null);
            bjn bjnVar2 = (bjn) c.z(mhpVar, 8, ajn.a, null);
            mdVar = (md) c.n(mhpVar, 9, (t9f) arfVarArr[9].getValue(), null);
            t5aVar = t5aVar3;
            bool = bool10;
            f = f2;
            bool2 = bool9;
            bool4 = bool7;
            bjnVar = bjnVar2;
            bool3 = bool8;
            bool5 = bool6;
            i = 1023;
            q2aVar = q2aVar2;
        } else {
            int i3 = 1;
            boolean z = true;
            int i4 = 0;
            md mdVar2 = null;
            bjn bjnVar3 = null;
            Boolean bool11 = null;
            Boolean bool12 = null;
            Float f3 = null;
            Boolean bool13 = null;
            Boolean bool14 = null;
            Boolean bool15 = null;
            q2a q2aVar3 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        i2 = 9;
                        i3 = 1;
                    case 0:
                        t5aVar2 = (t5a) c.n(mhpVar, 0, (t9f) arfVarArr[0].getValue(), t5aVar2);
                        i4 |= 1;
                        c2 = '\b';
                        i2 = 9;
                        i3 = 1;
                    case 1:
                        q2aVar3 = (q2a) c.n(mhpVar, i3, (t9f) arfVarArr[i3].getValue(), q2aVar3);
                        i4 |= 2;
                        c2 = '\b';
                        i2 = 9;
                    case 2:
                        bool15 = (Boolean) c.n(mhpVar, 2, oc3.a, bool15);
                        i4 |= 4;
                        c2 = '\b';
                        i2 = 9;
                    case 3:
                        bool14 = (Boolean) c.n(mhpVar, 3, oc3.a, bool14);
                        i4 |= 8;
                        c2 = '\b';
                        i2 = 9;
                    case 4:
                        bool13 = (Boolean) c.n(mhpVar, 4, oc3.a, bool13);
                        i4 |= 16;
                        c2 = '\b';
                        i2 = 9;
                    case 5:
                        bool12 = (Boolean) c.n(mhpVar, 5, oc3.a, bool12);
                        i4 |= 32;
                        c2 = '\b';
                        i2 = 9;
                    case 6:
                        f3 = (Float) c.n(mhpVar, 6, zic.a, f3);
                        i4 |= 64;
                        c2 = '\b';
                        i2 = 9;
                    case 7:
                        bool11 = (Boolean) c.n(mhpVar, 7, oc3.a, bool11);
                        i4 |= 128;
                        c2 = '\b';
                        i2 = 9;
                    case 8:
                        bjnVar3 = (bjn) c.z(mhpVar, 8, ajn.a, bjnVar3);
                        i4 |= 256;
                        c2 = '\b';
                        i2 = 9;
                    case 9:
                        mdVar2 = (md) c.n(mhpVar, i2, (t9f) arfVarArr[i2].getValue(), mdVar2);
                        i4 |= RemoteCameraConfig.Mic.BUFFER_SIZE;
                        c2 = '\b';
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i4;
            mdVar = mdVar2;
            bjnVar = bjnVar3;
            bool = bool11;
            bool2 = bool12;
            f = f3;
            bool3 = bool13;
            bool4 = bool14;
            bool5 = bool15;
            t5aVar = t5aVar2;
            q2aVar = q2aVar3;
        }
        c.b(mhpVar);
        return new heq(i, t5aVar, q2aVar, bool5, bool4, bool3, bool2, f, bool, bjnVar, mdVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0062, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r5, defpackage.bjn.b) == false) goto L7;
     */
    @Override // defpackage.t9f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(l6b l6bVar, Object obj) {
        heq heqVar = (heq) obj;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = heq.k;
        t9f t9fVar = (t9f) arfVarArr[0].getValue();
        t5a t5aVar = heqVar.a;
        bjn bjnVar = heqVar.i;
        c.q(mhpVar, 0, t9fVar, t5aVar);
        c.q(mhpVar, 1, (t9f) arfVarArr[1].getValue(), heqVar.b);
        oc3 oc3Var = oc3.a;
        c.q(mhpVar, 2, oc3Var, heqVar.c);
        c.q(mhpVar, 3, oc3Var, heqVar.d);
        c.q(mhpVar, 4, oc3Var, heqVar.e);
        c.q(mhpVar, 5, oc3Var, heqVar.f);
        c.q(mhpVar, 6, zic.a, heqVar.g);
        c.q(mhpVar, 7, oc3Var, heqVar.h);
        if (!c.e(mhpVar)) {
            bjn.Companion.getClass();
        }
        c.k(mhpVar, 8, ajn.a, bjnVar);
        c.q(mhpVar, 9, (t9f) arfVarArr[9].getValue(), heqVar.j);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
