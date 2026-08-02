package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class q8t implements p3d {
    public static final q8t a;

    @NotNull
    private static final mhp descriptor;

    static {
        q8t q8tVar = new q8t();
        a = q8tVar;
        j5m j5mVar = new j5m("flex.parser.transition.TransitionSettingsParser.TransitionSettingsSurrogate.Option", q8tVar, 3);
        j5mVar.k("duration", false);
        j5mVar.k("interpolator", true);
        j5mVar.k("transition", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = w8t.d;
        return new t9f[]{n9a.a, ff7.C((t9f) arfVarArr[1].getValue()), ff7.C((t9f) arfVarArr[2].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        t8t t8tVar;
        v8t v8tVar;
        double d;
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = w8t.d;
        t8t t8tVar2 = null;
        if (c.m()) {
            double F = c.F(mhpVar, 0);
            t8t t8tVar3 = (t8t) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            v8tVar = (v8t) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            t8tVar = t8tVar3;
            i = 7;
            d = F;
        } else {
            boolean z = true;
            int i2 = 0;
            double d2 = 0.0d;
            v8t v8tVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    d2 = c.F(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    t8tVar2 = (t8t) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), t8tVar2);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    v8tVar2 = (v8t) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), v8tVar2);
                    i2 |= 4;
                }
            }
            i = i2;
            t8tVar = t8tVar2;
            v8tVar = v8tVar2;
            d = d2;
        }
        c.b(mhpVar);
        return new w8t(i, d, t8tVar, v8tVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        w8t w8tVar = (w8t) obj;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = w8t.d;
        double d = w8tVar.a;
        v8t v8tVar = w8tVar.c;
        t8t t8tVar = w8tVar.b;
        c.l(mhpVar, 0, d);
        if (c.e(mhpVar) || t8tVar != null) {
            c.q(mhpVar, 1, (t9f) arfVarArr[1].getValue(), t8tVar);
        }
        if (c.e(mhpVar) || v8tVar != null) {
            c.q(mhpVar, 2, (t9f) arfVarArr[2].getValue(), v8tVar);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
