package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class irb implements ycg, ua6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ irb(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.ua6
    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                ((lrl) obj).N(this.b);
                break;
            case 4:
                ((lrl) obj).F(this.b);
                break;
            case 5:
                ((lrl) obj).w0(this.b);
                break;
            default:
                ((lrl) obj).E0(this.b);
                break;
        }
    }

    @Override // defpackage.ycg
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((f8l) obj).o(this.b);
                break;
            case 1:
                ((f8l) obj).b(this.b);
                break;
            default:
                ((f8l) obj).b(this.b);
                break;
        }
    }
}
