package defpackage;

/* loaded from: classes5.dex */
public final class jij extends k8 {
    public final /* synthetic */ int b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jij(aij aijVar, Object obj, int i) {
        super(aijVar);
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.aij
    public final void c(wjj wjjVar) {
        switch (this.b) {
            case 0:
                this.a.a(new iij(wjjVar, (uvg) this.c));
                break;
            default:
                this.a.a(new pij(wjjVar, (qyc) this.c));
                break;
        }
    }
}
