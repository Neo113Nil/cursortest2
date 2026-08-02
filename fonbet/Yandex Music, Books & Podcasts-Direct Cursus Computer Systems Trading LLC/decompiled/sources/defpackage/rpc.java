package defpackage;

/* loaded from: classes.dex */
public final class rpc implements ppc {
    public final vg0 a;
    public final wg0 b;
    public final dxr c;
    public final wpc d;
    public final awc e;
    public final kma f;

    public rpc(vg0 vg0Var, wg0 wg0Var) {
        dxr dxrVar = spc.a;
        wpc wpcVar = new wpc(spc.b);
        awc awcVar = new awc(23);
        this.a = vg0Var;
        this.b = wg0Var;
        this.c = dxrVar;
        this.d = wpcVar;
        this.e = awcVar;
        this.f = new kma(12, this);
    }

    public final odt a(ldt ldtVar) {
        dxr dxrVar = this.c;
        sea seaVar = new sea(11, this, ldtVar);
        synchronized (((i5l) dxrVar.a)) {
            odt odtVar = (odt) ((e0h) dxrVar.b).get(ldtVar);
            if (odtVar != null) {
                if (odtVar.d()) {
                    return odtVar;
                }
            }
            try {
                odt odtVar2 = (odt) seaVar.invoke(new gcp(22, dxrVar, ldtVar));
                synchronized (((i5l) dxrVar.a)) {
                    if (((e0h) dxrVar.b).get(ldtVar) == null && odtVar2.d()) {
                        ((e0h) dxrVar.b).put(ldtVar, odtVar2);
                    }
                }
                return odtVar2;
            } catch (Exception e) {
                b6e.o("Could not load font", e);
                return null;
            }
        }
    }

    public final odt b(qpc qpcVar, tqc tqcVar, int i, int i2) {
        wg0 wg0Var = this.b;
        wg0Var.getClass();
        int i3 = wg0Var.a;
        tqc tqcVar2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? tqcVar : new tqc(yhn.d(tqcVar.a + i3, 1, 1000));
        this.a.getClass();
        return a(new ldt(qpcVar, tqcVar2, i, i2, null));
    }
}
