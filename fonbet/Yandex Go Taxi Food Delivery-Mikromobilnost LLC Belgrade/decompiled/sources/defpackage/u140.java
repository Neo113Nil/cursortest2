package defpackage;

/* loaded from: classes6.dex */
public final class u140 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ u140(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke(new o040((lyy0) obj));
                break;
            default:
                m540 m540Var = (m540) obj2;
                wyy0 wyy0Var = m540Var instanceof wyy0 ? (wyy0) m540Var : null;
                if (wyy0Var != null) {
                    tlsVar.invoke(wyy0Var);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
