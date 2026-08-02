package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class qrb implements ycg, ua6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ qrb(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.ua6
    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                ((lrl) obj).L(this.b);
                break;
            case 4:
                ((lrl) obj).S(this.b);
                break;
            default:
                ((lrl) obj).h0(this.b);
                break;
        }
    }

    @Override // defpackage.ycg
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((f8l) obj).q(this.b);
                break;
            case 1:
                ((f8l) obj).e(this.b);
                break;
            default:
                ((f8l) obj).q(this.b);
                break;
        }
    }
}
