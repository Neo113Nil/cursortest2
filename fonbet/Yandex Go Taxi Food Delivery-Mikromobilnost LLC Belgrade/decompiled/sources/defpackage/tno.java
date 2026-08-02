package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class tno implements ruy, ov71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ tno(float f, int i) {
        this.a = i;
        this.b = f;
    }

    @Override // defpackage.ruy
    public final void invoke(Object obj) {
        int i = this.a;
        float f = this.b;
        switch (i) {
            case 0:
                ((xxc0) obj).onVolumeChanged(f);
                break;
            default:
                ((ub81) obj).onVolumeChanged(f);
                break;
        }
    }
}
