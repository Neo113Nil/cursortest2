package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class uno implements ruy, ov71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ uno(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.ruy
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((xxc0) obj).onSurfaceSizeChanged(this.b, this.c);
                break;
            default:
                ((ub81) obj).onSurfaceSizeChanged(this.b, this.c);
                break;
        }
    }
}
