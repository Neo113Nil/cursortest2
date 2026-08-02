package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class v4h implements ruy {
    public final /* synthetic */ int a;
    public final /* synthetic */ h42 b;
    public final /* synthetic */ ah3 c;

    public /* synthetic */ v4h(h42 h42Var, ah3 ah3Var, int i) {
        this.a = i;
        this.b = h42Var;
        this.c = ah3Var;
    }

    @Override // defpackage.ruy
    public final void invoke(Object obj) {
        int i = this.a;
        ah3 ah3Var = this.c;
        h42 h42Var = this.b;
        j42 j42Var = (j42) obj;
        switch (i) {
            case 0:
                j42Var.onAudioTrackInitialized(h42Var, ah3Var);
                break;
            default:
                j42Var.onAudioTrackReleased(h42Var, ah3Var);
                break;
        }
    }
}
