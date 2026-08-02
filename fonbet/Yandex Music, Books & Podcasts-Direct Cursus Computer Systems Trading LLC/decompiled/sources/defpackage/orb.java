package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class orb implements ycg, ua6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ orb(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.ua6
    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                ((lrl) obj).o0(this.b, this.c);
                break;
            default:
                ((lrl) obj).y0(this.b, this.c);
                break;
        }
    }

    @Override // defpackage.ycg
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((f8l) obj).j(this.b, this.c);
                break;
            default:
                ((f8l) obj).j(this.b, this.c);
                break;
        }
    }
}
