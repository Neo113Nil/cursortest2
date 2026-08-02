package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class sg3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0w b;
    public final /* synthetic */ ah3 c;

    public /* synthetic */ sg3(h0w h0wVar, ah3 ah3Var, int i) {
        this.a = i;
        this.b = h0wVar;
        this.c = ah3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ah3 ah3Var = this.c;
        h0w h0wVar = this.b;
        switch (i) {
            case 0:
                xg3 xg3Var = (xg3) h0wVar.c;
                int i2 = tw21.a;
                xg3Var.onAudioTrackReleased(ah3Var);
                break;
            default:
                xg3 xg3Var2 = (xg3) h0wVar.c;
                int i3 = tw21.a;
                xg3Var2.onAudioTrackInitialized(ah3Var);
                break;
        }
    }
}
