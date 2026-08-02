package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class sno implements ruy, ov71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ sno(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.ruy
    public final void invoke(Object obj) {
        int i = this.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                ((xxc0) obj).onSkipSilenceEnabledChanged(z);
                break;
            case 1:
                ((xxc0) obj).onShuffleModeEnabledChanged(z);
                break;
            default:
                ((ub81) obj).onSkipSilenceEnabledChanged(z);
                break;
        }
    }
}
