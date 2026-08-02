package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class vxd implements p3d {
    public static final vxd a;

    @NotNull
    private static final mhp descriptor;

    static {
        vxd vxdVar = new vxd();
        a = vxdVar;
        j5m j5mVar = new j5m("flex.feature.navigation.action.HideOverlayAction", vxdVar, 2);
        j5mVar.k("tag", false);
        j5mVar.k("customProps", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{tkr.a, ajn.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        bjn bjnVar;
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str2 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
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
                    str2 = c.g(mhpVar, 0);
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
            str = str2;
            bjnVar = bjnVar2;
        }
        c.b(mhpVar);
        return new xxd(i, str, bjnVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r5, defpackage.bjn.b) == false) goto L7;
     */
    @Override // defpackage.t9f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(l6b l6bVar, Object obj) {
        xxd xxdVar = (xxd) obj;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        String str = xxdVar.a;
        bjn bjnVar = xxdVar.b;
        c.p(mhpVar, 0, str);
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
