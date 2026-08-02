package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class w4h implements ruy {
    public final /* synthetic */ int a;
    public final /* synthetic */ h42 b;

    public /* synthetic */ w4h(h42 h42Var, int i) {
        this.a = i;
        this.b = h42Var;
    }

    @Override // defpackage.ruy
    public final void invoke(Object obj) {
        int i = this.a;
        h42 h42Var = this.b;
        j42 j42Var = (j42) obj;
        switch (i) {
            case 0:
                j42Var.onSeekStarted(h42Var);
                break;
            case 1:
                j42Var.onDrmSessionReleased(h42Var);
                break;
            case 2:
                j42Var.onPlayerReleased(h42Var);
                break;
            case 3:
                j42Var.onDrmKeysRemoved(h42Var);
                break;
            case 4:
                j42Var.onDrmKeysRestored(h42Var);
                break;
            default:
                j42Var.onDrmKeysLoaded(h42Var);
                break;
        }
    }
}
