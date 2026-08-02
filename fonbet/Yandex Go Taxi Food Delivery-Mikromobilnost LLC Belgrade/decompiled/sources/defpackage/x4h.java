package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class x4h implements ruy {
    public final /* synthetic */ int a;
    public final /* synthetic */ h42 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ x4h(h42 h42Var, Exception exc, int i) {
        this.a = i;
        this.b = h42Var;
        this.c = exc;
    }

    @Override // defpackage.ruy
    public final void invoke(Object obj) {
        int i = this.a;
        Exception exc = this.c;
        h42 h42Var = this.b;
        j42 j42Var = (j42) obj;
        switch (i) {
            case 0:
                j42Var.onAudioCodecError(h42Var, exc);
                break;
            case 1:
                j42Var.onAudioSinkError(h42Var, exc);
                break;
            case 2:
                j42Var.onDrmSessionManagerError(h42Var, exc);
                break;
            default:
                j42Var.onVideoCodecError(h42Var, exc);
                break;
        }
    }
}
