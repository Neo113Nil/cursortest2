package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class o8t implements p3d {
    public static final o8t a;

    @NotNull
    private static final mhp descriptor;

    static {
        o8t o8tVar = new o8t();
        a = o8tVar;
        j5m j5mVar = new j5m("flex.parser.transition.TransitionSettingsParser.TransitionSettingsSurrogate", o8tVar, 2);
        j5mVar.k("onShow", true);
        j5mVar.k("onHide", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        q8t q8tVar = q8t.a;
        return new t9f[]{ff7.C(q8tVar), ff7.C(q8tVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        w8t w8tVar;
        w8t w8tVar2;
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        w8t w8tVar3 = null;
        if (c.m()) {
            q8t q8tVar = q8t.a;
            w8tVar = (w8t) c.n(mhpVar, 0, q8tVar, null);
            w8tVar2 = (w8t) c.n(mhpVar, 1, q8tVar, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            w8t w8tVar4 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    w8tVar3 = (w8t) c.n(mhpVar, 0, q8t.a, w8tVar3);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    w8tVar4 = (w8t) c.n(mhpVar, 1, q8t.a, w8tVar4);
                    i2 |= 2;
                }
            }
            i = i2;
            w8tVar = w8tVar3;
            w8tVar2 = w8tVar4;
        }
        c.b(mhpVar);
        return new x8t(i, w8tVar, w8tVar2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        x8t x8tVar = (x8t) obj;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        if (c.e(mhpVar) || x8tVar.a != null) {
            c.q(mhpVar, 0, q8t.a, x8tVar.a);
        }
        if (c.e(mhpVar) || x8tVar.b != null) {
            c.q(mhpVar, 1, q8t.a, x8tVar.b);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
