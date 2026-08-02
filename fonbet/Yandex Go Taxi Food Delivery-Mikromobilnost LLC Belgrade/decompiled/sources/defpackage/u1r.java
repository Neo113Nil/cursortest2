package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class u1r implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ v1r b;

    public /* synthetic */ u1r(v1r v1rVar, int i) {
        this.a = i;
        this.b = v1rVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        v1r v1rVar = this.b;
        switch (i) {
            case 0:
                String str = v1rVar.b.b;
                wwf wwfVar = (wwf) v1rVar.a.b;
                return ymx.j(w0b1.a((wh6) wwfVar.b, (xh6) wwfVar.c, new xc8(wwfVar, str)), new sxo(9, v1rVar, str), null, 5);
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                lfr0 d = zmx.d(zy11.a);
                if (!booleanValue) {
                    return d;
                }
                jln jlnVar = v1rVar.a;
                rbh rbhVar = v1rVar.b;
                String str2 = rbhVar.c;
                String str3 = rbhVar.b;
                wwf wwfVar2 = (wwf) jlnVar.b;
                return w0b1.a((wh6) wwfVar2.b, (xh6) wwfVar2.c, new obh(wwfVar2, str2, str3, new egz()));
            default:
                return ooa1.d(((qdh) v1rVar.c.a).a((String) obj));
        }
    }
}
