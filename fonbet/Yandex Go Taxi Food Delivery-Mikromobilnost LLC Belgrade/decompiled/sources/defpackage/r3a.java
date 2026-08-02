package defpackage;

/* loaded from: classes14.dex */
public final /* synthetic */ class r3a implements ays {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ r3a(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    @Override // defpackage.ays
    public final void a(Object obj) {
        int i = this.a;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke((t5a) obj);
                break;
            case 1:
                qj70 qj70Var = ((ol70) obj).c;
                if (qj70Var != null) {
                    tlsVar.invoke(qj70Var);
                    break;
                }
                break;
            default:
                tlsVar.invoke(((mjw0) obj).a);
                break;
        }
    }
}
