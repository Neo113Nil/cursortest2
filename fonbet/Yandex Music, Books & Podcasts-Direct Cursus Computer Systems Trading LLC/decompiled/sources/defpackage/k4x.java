package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class k4x implements tqj {
    public final /* synthetic */ i8s a;

    public /* synthetic */ k4x(i8s i8sVar) {
        this.a = i8sVar;
    }

    @Override // defpackage.tqj
    public void onSuccess(Object obj) {
        u9x u9xVar = (u9x) obj;
        msg msgVar = m4x.d;
        boolean z = false;
        if (u9xVar != null) {
            bax baxVar = u9xVar.a.a;
            y1g.G(baxVar);
            if (baxVar.a == 1) {
                z = true;
            }
        }
        this.a.d(Boolean.valueOf(z));
    }
}
