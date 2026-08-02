package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class t4h implements ruy {
    public final /* synthetic */ int a;
    public final /* synthetic */ h42 b;
    public final /* synthetic */ kyg c;

    public /* synthetic */ t4h(h42 h42Var, kyg kygVar, int i) {
        this.a = i;
        this.b = h42Var;
        this.c = kygVar;
    }

    @Override // defpackage.ruy
    public final void invoke(Object obj) {
        int i = this.a;
        kyg kygVar = this.c;
        h42 h42Var = this.b;
        j42 j42Var = (j42) obj;
        switch (i) {
            case 0:
                j42Var.onAudioDisabled(h42Var, kygVar);
                break;
            case 1:
                j42Var.onVideoDisabled(h42Var, kygVar);
                break;
            case 2:
                j42Var.onVideoEnabled(h42Var, kygVar);
                break;
            default:
                j42Var.onAudioEnabled(h42Var, kygVar);
                break;
        }
    }
}
