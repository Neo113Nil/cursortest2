package defpackage;

/* loaded from: classes4.dex */
public final class wx1 extends iw1 {
    public final wzc j;
    public final String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx1(wzc wzcVar, ncl nclVar, k2b k2bVar) {
        super(nclVar, f6q.AudioProcessor, k2bVar);
        wzcVar.getClass();
        k2bVar.getClass();
        this.j = wzcVar;
        this.k = wdp.W(this, "Processor");
    }

    @Override // defpackage.iw1
    public final void h() {
        ncl nclVar = this.a;
        xdr xdrVar = nclVar.c;
        nej nejVar = this.g;
        if (nejVar == null) {
            return;
        }
        boolean z = ((Boolean) nejVar.b.getValue()).booleanValue() && ((Boolean) nejVar.c.getValue()).booleanValue();
        wzc wzcVar = this.j;
        vzc vzcVar = wzcVar.a;
        vzc vzcVar2 = wzcVar.b;
        s9f[] s9fVarArr = wzc.e;
        vzcVar.setValue(wzcVar, s9fVarArr[0], Boolean.valueOf(z));
        if (z) {
            float floatValue = ((Number) vzcVar2.getValue(wzcVar, s9fVarArr[1])).floatValue();
            mal.a();
            nej nejVar2 = this.g;
            if (nejVar2 == null) {
                floatValue = Float.NaN;
            } else if (((Boolean) nejVar2.a.getValue()).booleanValue()) {
                floatValue = this.i;
            } else {
                xdr xdrVar2 = nejVar2.e;
                Object value = xdrVar2.getValue();
                if (Float.isNaN(((Number) value).floatValue())) {
                    value = null;
                }
                Float f = (Float) value;
                if (f != null) {
                    floatValue = f.floatValue();
                } else {
                    xdrVar2.m(null, Float.valueOf(floatValue));
                }
            }
            vzcVar2.setValue(wzcVar, s9fVarArr[1], Float.valueOf(floatValue));
            xdr xdrVar3 = nclVar.f;
            Float valueOf = Float.valueOf(((Number) vzcVar2.getValue(wzcVar, s9fVarArr[1])).floatValue());
            xdrVar3.getClass();
            xdrVar3.m(null, valueOf);
            g6q g6qVar = g6q.c;
            xdrVar.getClass();
            xdrVar.m(null, g6qVar);
        } else {
            n();
            g6q g6qVar2 = g6q.b;
            xdrVar.getClass();
            xdrVar.m(null, g6qVar2);
        }
        o();
        xdr xdrVar4 = nclVar.d;
        h6q h6qVar = h6q.None;
        xdrVar4.getClass();
        xdrVar4.m(null, h6qVar);
    }

    @Override // defpackage.iw1
    public final void i() {
        wzc wzcVar = this.j;
        wzcVar.a.setValue(wzcVar, wzc.e[0], Boolean.FALSE);
    }

    @Override // defpackage.iw1
    public final String j() {
        return this.k;
    }

    @Override // defpackage.iw1
    public final boolean k(int i, qo1 qo1Var) {
        return true;
    }

    @Override // defpackage.iw1
    public final void l() {
        wzc wzcVar = this.j;
        wzcVar.a.setValue(wzcVar, wzc.e[0], Boolean.FALSE);
    }
}
