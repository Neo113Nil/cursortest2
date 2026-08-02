package defpackage;

/* loaded from: classes4.dex */
public final class y0x implements okx {
    public final l1o a;
    public final cf21 b;

    public y0x(l1o l1oVar, cf21 cf21Var) {
        this.a = l1oVar;
        this.b = cf21Var;
    }

    @Override // defpackage.okx
    public final v0x a(Object obj) {
        if (!jl40.l(obj, qoi0.a(aul.class))) {
            return null;
        }
        jn11 jn11Var = (jn11) amr.c.a(qoi0.a(jn11.class));
        if (jn11Var == null) {
            jn11Var = jn11.d;
        }
        boolean booleanValue = ((Boolean) jn11Var.a.invoke()).booleanValue();
        cf21 cf21Var = this.b;
        uol uolVar = vol.a;
        l1o l1oVar = this.a;
        if (!booleanValue) {
            return new ful(cf21Var, l1oVar.c, l1oVar.d, dul.a, uolVar, null, new a851(new s7s0(23)));
        }
        cyl cylVar = l1oVar.c;
        w0j w0jVar = l1oVar.d;
        j3k j3kVar = new j3k(cf21Var, new l3k(cylVar), w0jVar, ((Number) jn11Var.b.invoke()).intValue(), ((Number) jn11Var.c.invoke()).intValue());
        jul.U1.getClass();
        return new lul(j3kVar, w0jVar, iul.a, uolVar, null);
    }
}
