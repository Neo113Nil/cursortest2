package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class y4h implements ruy {
    public final /* synthetic */ int a;
    public final /* synthetic */ h42 b;
    public final /* synthetic */ he10 c;

    public /* synthetic */ y4h(h42 h42Var, he10 he10Var, int i) {
        this.a = i;
        this.b = h42Var;
        this.c = he10Var;
    }

    @Override // defpackage.ruy
    public final void invoke(Object obj) {
        int i = this.a;
        he10 he10Var = this.c;
        h42 h42Var = this.b;
        j42 j42Var = (j42) obj;
        switch (i) {
            case 0:
                j42Var.onDownstreamFormatChanged(h42Var, he10Var);
                break;
            default:
                j42Var.onUpstreamDiscarded(h42Var, he10Var);
                break;
        }
    }
}
